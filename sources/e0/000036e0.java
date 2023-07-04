package com.google.android.vending.expansion.downloader.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class a extends Service {
    private static final String LOG_TAG = "CustomIntentService";
    private static final int WHAT_MESSAGE = -10;
    private String mName;
    private boolean mRedelivery;
    private volatile HandlerC0284a mServiceHandler;
    private volatile Looper mServiceLooper;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.vending.expansion.downloader.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class HandlerC0284a extends Handler {
        public HandlerC0284a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a.this.onHandleIntent((Intent) message.obj);
            if (a.this.shouldStop()) {
                Log.d(a.LOG_TAG, "stopSelf");
                a.this.stopSelf(message.arg1);
                Log.d(a.LOG_TAG, "afterStopSelf");
            }
        }
    }

    public a(String str) {
        this.mName = str;
    }

    @Override // android.app.Service
    public abstract IBinder onBind(Intent intent);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("IntentService[" + this.mName + "]");
        handlerThread.start();
        this.mServiceLooper = handlerThread.getLooper();
        this.mServiceHandler = new HandlerC0284a(this.mServiceLooper);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Thread thread = this.mServiceLooper.getThread();
        if (thread != null && thread.isAlive()) {
            thread.interrupt();
        }
        this.mServiceLooper.quit();
        Log.d(LOG_TAG, "onDestroy");
    }

    protected abstract void onHandleIntent(Intent intent);

    @Override // android.app.Service
    public void onStart(Intent intent, int i11) {
        if (this.mServiceHandler.hasMessages(WHAT_MESSAGE)) {
            return;
        }
        Message obtainMessage = this.mServiceHandler.obtainMessage();
        obtainMessage.arg1 = i11;
        obtainMessage.obj = intent;
        obtainMessage.what = WHAT_MESSAGE;
        this.mServiceHandler.sendMessage(obtainMessage);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        onStart(intent, i12);
        return this.mRedelivery ? 3 : 2;
    }

    public void setIntentRedelivery(boolean z11) {
        this.mRedelivery = z11;
    }

    protected abstract boolean shouldStop();
}