package m5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import l5.g;

/* loaded from: classes.dex */
public class b implements m5.a {

    /* renamed from: a  reason: collision with root package name */
    private final g f38413a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f38414b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f38415c = new a();

    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f38413a = new g(executor);
    }

    @Override // m5.a
    public Executor a() {
        return this.f38415c;
    }

    @Override // m5.a
    public void b(Runnable runnable) {
        this.f38413a.execute(runnable);
    }

    @Override // m5.a
    public g c() {
        return this.f38413a;
    }

    public void d(Runnable runnable) {
        this.f38414b.post(runnable);
    }
}