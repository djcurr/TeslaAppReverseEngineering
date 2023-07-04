package t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import t.s;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a */
    private final s f51061a;

    /* renamed from: b */
    private final androidx.lifecycle.f0<Integer> f51062b;

    /* renamed from: c */
    private final boolean f51063c;

    /* renamed from: d */
    private final Executor f51064d;

    /* renamed from: e */
    private boolean f51065e;

    /* renamed from: f */
    b.a<Void> f51066f;

    /* renamed from: g */
    boolean f51067g;

    /* renamed from: h */
    private final s.c f51068h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements s.c {
        a() {
            j2.this = r1;
        }

        @Override // t.s.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            if (j2.this.f51066f != null) {
                Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                boolean z11 = num != null && num.intValue() == 2;
                j2 j2Var = j2.this;
                if (z11 == j2Var.f51067g) {
                    j2Var.f51066f.c(null);
                    j2.this.f51066f = null;
                }
            }
            return false;
        }
    }

    public j2(s sVar, u.d dVar, Executor executor) {
        a aVar = new a();
        this.f51068h = aVar;
        this.f51061a = sVar;
        this.f51064d = executor;
        Boolean bool = (Boolean) dVar.a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        this.f51063c = bool != null && bool.booleanValue();
        this.f51062b = new androidx.lifecycle.f0<>(0);
        sVar.w(aVar);
    }

    public static /* synthetic */ void a(j2 j2Var, b.a aVar, boolean z11) {
        j2Var.f(aVar, z11);
    }

    public static /* synthetic */ Object b(j2 j2Var, boolean z11, b.a aVar) {
        return j2Var.g(z11, aVar);
    }

    public /* synthetic */ Object g(final boolean z11, final b.a aVar) {
        this.f51064d.execute(new Runnable() { // from class: t.i2
            {
                j2.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j2.a(j2.this, aVar, z11);
            }
        });
        return "enableTorch: " + z11;
    }

    private <T> void i(androidx.lifecycle.f0<T> f0Var, T t11) {
        if (a0.j.b()) {
            f0Var.setValue(t11);
        } else {
            f0Var.postValue(t11);
        }
    }

    public com.google.common.util.concurrent.c<Void> c(final boolean z11) {
        if (!this.f51063c) {
            androidx.camera.core.n0.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return c0.f.f(new IllegalStateException("No flash unit"));
        }
        i(this.f51062b, Integer.valueOf(z11 ? 1 : 0));
        return androidx.concurrent.futures.b.a(new b.c() { // from class: t.h2
            {
                j2.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return j2.b(j2.this, z11, aVar);
            }
        });
    }

    /* renamed from: d */
    public void f(b.a<Void> aVar, boolean z11) {
        if (!this.f51065e) {
            i(this.f51062b, 0);
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        this.f51067g = z11;
        this.f51061a.z(z11);
        i(this.f51062b, Integer.valueOf(z11 ? 1 : 0));
        b.a<Void> aVar2 = this.f51066f;
        if (aVar2 != null) {
            aVar2.f(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f51066f = aVar;
    }

    public LiveData<Integer> e() {
        return this.f51062b;
    }

    public void h(boolean z11) {
        if (this.f51065e == z11) {
            return;
        }
        this.f51065e = z11;
        if (z11) {
            return;
        }
        if (this.f51067g) {
            this.f51067g = false;
            this.f51061a.z(false);
            i(this.f51062b, 0);
        }
        b.a<Void> aVar = this.f51066f;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f51066f = null;
        }
    }
}