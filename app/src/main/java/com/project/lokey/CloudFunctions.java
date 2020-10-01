package com.project.lokey;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FirebaseFunctionsException;

import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;

public class CloudFunctions {

    private FirebaseFunctions mFunctions;
    private String inputMessage;

    public CloudFunctions(FirebaseFunctions mFunctions, String inputMessage) {
        this.mFunctions = mFunctions;
        this.inputMessage = inputMessage;

        mFunctions = FirebaseFunctions.getInstance();

        addMessage(this.inputMessage)
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        Exception e = task.getException();
                        if (e instanceof FirebaseFunctionsException) {
                            FirebaseFunctionsException ffe = (FirebaseFunctionsException) e;
                            FirebaseFunctionsException.Code code = ffe.getCode();
                            Object details = ffe.getDetails();
                        }
                        // ...
                    }
                    // ...
                });
    }

    private Task<String> addMessage(String text) {
        // Create the arguments to the callable function
        Map<String, Object> data = new HashMap<>();
        data.put("text",text);
        data.put("push", true);

        return mFunctions
                .getHttpsCallable("addMessage")
                .call(data)
                .continueWith(task -> {
                    // This continuation runs on either success or failure, but if the task
                    // has failed then getResult() will throw an Exception which will be
                    // propagated down.
                    String result = (String) task.getResult().getData();
                    return result;
                });
    }
}
