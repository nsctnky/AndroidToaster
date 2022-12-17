package com.nsctnky.androidtoaster;

import android.content.Context;
import android.widget.Toast;

class ToastRunnable implements Runnable {

    Context _context;
    String _message;
    int _duration;

    ToastRunnable(Context context, String message, boolean isShortLength) {
        _context = context;
        _message = message;
        _duration = isShortLength ? Toast.LENGTH_SHORT : Toast.LENGTH_LONG;
    }

    @Override
    public void run() {
        Toast.makeText(_context, _message, _duration).show();
    }
}