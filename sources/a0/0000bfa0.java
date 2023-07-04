package xl;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private final e f57593a;

    /* renamed from: b  reason: collision with root package name */
    private final int f57594b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeUnit f57595c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f57596d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f57597e;

    public c(e eVar, int i11, TimeUnit timeUnit) {
        this.f57593a = eVar;
        this.f57594b = i11;
        this.f57595c = timeUnit;
    }

    @Override // xl.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f57596d) {
            wl.f f11 = wl.f.f();
            f11.i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f57597e = new CountDownLatch(1);
            this.f57593a.a(str, bundle);
            wl.f.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f57597e.await(this.f57594b, this.f57595c)) {
                    wl.f.f().i("App exception callback received from Analytics listener.");
                } else {
                    wl.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                wl.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f57597e = null;
        }
    }

    @Override // xl.b
    public void g(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f57597e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}