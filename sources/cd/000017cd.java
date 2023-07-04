package com.facebook.react.bridge;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    @Deprecated
    protected GuardedResultAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    protected abstract Result doInBackgroundGuarded();

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e11) {
            this.mExceptionHandler.handleException(e11);
        }
    }

    protected abstract void onPostExecuteGuarded(Result result);

    /* JADX INFO: Access modifiers changed from: protected */
    public GuardedResultAsyncTask(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mExceptionHandler = nativeModuleCallExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final Result doInBackground(Void... voidArr) {
        try {
            return doInBackgroundGuarded();
        } catch (RuntimeException e11) {
            this.mExceptionHandler.handleException(e11);
            throw e11;
        }
    }
}