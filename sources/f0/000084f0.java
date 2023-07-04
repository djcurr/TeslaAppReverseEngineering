package lx;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes5.dex */
public abstract class f extends c {

    /* renamed from: e  reason: collision with root package name */
    private Handler f37775e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                Bundle data = message.getData();
                if (data == null) {
                    return;
                }
                f.this.h(data.getLong("totalBytes"));
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                f.this.g();
            } else {
                Bundle data2 = message.getData();
                if (data2 == null) {
                    return;
                }
                f.this.f(data2.getLong("numBytes"), data2.getLong("totalBytes"), data2.getFloat("percent"), data2.getFloat("speed"));
            }
        }
    }

    private void e() {
        if (this.f37775e != null) {
            return;
        }
        synchronized (f.class) {
            if (this.f37775e == null) {
                this.f37775e = new a(Looper.getMainLooper());
            }
        }
    }

    @Override // lx.c
    public final void b(long j11, long j12, float f11, float f12) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            f(j11, j12, f11, f12);
            return;
        }
        e();
        Message obtainMessage = this.f37775e.obtainMessage();
        obtainMessage.what = 2;
        Bundle bundle = new Bundle();
        bundle.putLong("numBytes", j11);
        bundle.putLong("totalBytes", j12);
        bundle.putFloat("percent", f11);
        bundle.putFloat("speed", f12);
        obtainMessage.setData(bundle);
        this.f37775e.sendMessage(obtainMessage);
    }

    @Override // lx.c
    public final void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            g();
            return;
        }
        e();
        Message obtainMessage = this.f37775e.obtainMessage();
        obtainMessage.what = 3;
        this.f37775e.sendMessage(obtainMessage);
    }

    @Override // lx.c
    public final void d(long j11) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h(j11);
            return;
        }
        e();
        Message obtainMessage = this.f37775e.obtainMessage();
        obtainMessage.what = 1;
        Bundle bundle = new Bundle();
        bundle.putLong("totalBytes", j11);
        obtainMessage.setData(bundle);
        this.f37775e.sendMessage(obtainMessage);
    }

    public abstract void f(long j11, long j12, float f11, float f12);

    public void g() {
    }

    public void h(long j11) {
    }
}