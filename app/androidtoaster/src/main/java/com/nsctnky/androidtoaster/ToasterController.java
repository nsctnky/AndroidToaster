package com.nsctnky.androidtoaster;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

public class ToasterController {
    public void SendToast(Context context, String message, boolean isShortLength) {
        Looper looper = Looper.getMainLooper();
        Handler handler = new Handler(looper);
        Runnable runnable = new ToastRunnable(context, message, isShortLength);
        handler.post(runnable);
    }
}