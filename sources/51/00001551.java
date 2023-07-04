package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class u {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10723a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f10724b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((ja.c) message.obj).recycle();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(ja.c<?> cVar, boolean z11) {
        if (!this.f10723a && !z11) {
            this.f10723a = true;
            cVar.recycle();
            this.f10723a = false;
        }
        this.f10724b.obtainMessage(1, cVar).sendToTarget();
    }
}