package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.k0;
import androidx.lifecycle.p;

/* loaded from: classes.dex */
public class ProcessLifecycleOwner implements v {

    /* renamed from: i  reason: collision with root package name */
    private static final ProcessLifecycleOwner f5046i = new ProcessLifecycleOwner();

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f5047j = 0;

    /* renamed from: e  reason: collision with root package name */
    private Handler f5052e;

    /* renamed from: a  reason: collision with root package name */
    private int f5048a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f5049b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5050c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5051d = true;

    /* renamed from: f  reason: collision with root package name */
    private final x f5053f = new x(this);

    /* renamed from: g  reason: collision with root package name */
    private Runnable f5054g = new a();

    /* renamed from: h  reason: collision with root package name */
    k0.a f5055h = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner.this.f();
            ProcessLifecycleOwner.this.g();
        }
    }

    /* loaded from: classes.dex */
    class b implements k0.a {
        b() {
        }

        @Override // androidx.lifecycle.k0.a
        public void a() {
        }

        @Override // androidx.lifecycle.k0.a
        public void onResume() {
            ProcessLifecycleOwner.this.b();
        }

        @Override // androidx.lifecycle.k0.a
        public void onStart() {
            ProcessLifecycleOwner.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends j {

        /* loaded from: classes.dex */
        class a extends j {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                ProcessLifecycleOwner.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                ProcessLifecycleOwner.this.c();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                k0.f(activity).h(ProcessLifecycleOwner.this.f5055h);
            }
        }

        @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ProcessLifecycleOwner.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ProcessLifecycleOwner.this.d();
        }
    }

    private ProcessLifecycleOwner() {
    }

    public static v h() {
        return f5046i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Context context) {
        f5046i.e(context);
    }

    void a() {
        int i11 = this.f5049b - 1;
        this.f5049b = i11;
        if (i11 == 0) {
            this.f5052e.postDelayed(this.f5054g, 700L);
        }
    }

    void b() {
        int i11 = this.f5049b + 1;
        this.f5049b = i11;
        if (i11 == 1) {
            if (this.f5050c) {
                this.f5053f.i(p.b.ON_RESUME);
                this.f5050c = false;
                return;
            }
            this.f5052e.removeCallbacks(this.f5054g);
        }
    }

    void c() {
        int i11 = this.f5048a + 1;
        this.f5048a = i11;
        if (i11 == 1 && this.f5051d) {
            this.f5053f.i(p.b.ON_START);
            this.f5051d = false;
        }
    }

    void d() {
        this.f5048a--;
        g();
    }

    void e(Context context) {
        this.f5052e = new Handler();
        this.f5053f.i(p.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void f() {
        if (this.f5049b == 0) {
            this.f5050c = true;
            this.f5053f.i(p.b.ON_PAUSE);
        }
    }

    void g() {
        if (this.f5048a == 0 && this.f5050c) {
            this.f5053f.i(p.b.ON_STOP);
            this.f5051d = true;
        }
    }

    @Override // androidx.lifecycle.v
    public p getLifecycle() {
        return this.f5053f;
    }
}