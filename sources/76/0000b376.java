package t;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import s.a;
import t.s;

/* loaded from: classes.dex */
final class k2 {

    /* renamed from: a  reason: collision with root package name */
    private final s f51084a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f51085b;

    /* renamed from: c  reason: collision with root package name */
    private final l2 f51086c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.f0<z.a1> f51087d;

    /* renamed from: e  reason: collision with root package name */
    final b f51088e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f51089f = false;

    /* renamed from: g  reason: collision with root package name */
    private s.c f51090g = new a();

    /* loaded from: classes.dex */
    class a implements s.c {
        a() {
        }

        @Override // t.s.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            k2.this.f51088e.a(totalCaptureResult);
            return false;
        }
    }

    /* loaded from: classes.dex */
    interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        void c(a.C1090a c1090a);

        void d();

        float e();

        Rect f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2(s sVar, u.d dVar, Executor executor) {
        this.f51084a = sVar;
        this.f51085b = executor;
        b b11 = b(dVar);
        this.f51088e = b11;
        l2 l2Var = new l2(b11.e(), b11.b());
        this.f51086c = l2Var;
        l2Var.f(1.0f);
        this.f51087d = new androidx.lifecycle.f0<>(d0.c.e(l2Var));
        sVar.w(this.f51090g);
    }

    private static b b(u.d dVar) {
        if (e(dVar)) {
            return new t.a(dVar);
        }
        return new g1(dVar);
    }

    private static boolean e(u.d dVar) {
        return Build.VERSION.SDK_INT >= 30 && dVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    private void g(z.a1 a1Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f51087d.setValue(a1Var);
        } else {
            this.f51087d.postValue(a1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a.C1090a c1090a) {
        this.f51088e.c(c1090a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect c() {
        return this.f51088e.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData<z.a1> d() {
        return this.f51087d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z11) {
        z.a1 e11;
        if (this.f51089f == z11) {
            return;
        }
        this.f51089f = z11;
        if (z11) {
            return;
        }
        synchronized (this.f51086c) {
            this.f51086c.f(1.0f);
            e11 = d0.c.e(this.f51086c);
        }
        g(e11);
        this.f51088e.d();
        this.f51084a.h0();
    }
}