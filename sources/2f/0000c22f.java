package y70;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* loaded from: classes5.dex */
public class e extends Handler implements k {

    /* renamed from: a */
    private final j f59360a;

    /* renamed from: b */
    private final int f59361b;

    /* renamed from: c */
    private final c f59362c;

    /* renamed from: d */
    private boolean f59363d;

    public e(c cVar, Looper looper, int i11) {
        super(looper);
        this.f59362c = cVar;
        this.f59361b = i11;
        this.f59360a = new j();
    }

    @Override // y70.k
    public void a(o oVar, Object obj) {
        i a11 = i.a(oVar, obj);
        synchronized (this) {
            this.f59360a.a(a11);
            if (!this.f59363d) {
                this.f59363d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i b11 = this.f59360a.b();
                if (b11 == null) {
                    synchronized (this) {
                        b11 = this.f59360a.b();
                        if (b11 == null) {
                            this.f59363d = false;
                            return;
                        }
                    }
                }
                this.f59362c.g(b11);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f59361b);
            if (sendMessage(obtainMessage())) {
                this.f59363d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } finally {
            this.f59363d = false;
        }
    }
}