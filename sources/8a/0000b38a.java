package t;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.a0;
import androidx.concurrent.futures.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s.a;
import t.s;

/* loaded from: classes.dex */
public class p1 {

    /* renamed from: a */
    private final s f51125a;

    /* renamed from: b */
    final Executor f51126b;

    /* renamed from: c */
    private final ScheduledExecutorService f51127c;

    /* renamed from: g */
    private ScheduledFuture<?> f51131g;

    /* renamed from: d */
    private volatile boolean f51128d = false;

    /* renamed from: e */
    private boolean f51129e = false;

    /* renamed from: f */
    Integer f51130f = 0;

    /* renamed from: h */
    long f51132h = 0;

    /* renamed from: i */
    boolean f51133i = false;

    /* renamed from: j */
    boolean f51134j = false;

    /* renamed from: k */
    private s.c f51135k = null;

    /* renamed from: l */
    private s.c f51136l = null;

    /* renamed from: m */
    private MeteringRectangle[] f51137m = new MeteringRectangle[0];

    /* renamed from: n */
    private MeteringRectangle[] f51138n = new MeteringRectangle[0];

    /* renamed from: o */
    private MeteringRectangle[] f51139o = new MeteringRectangle[0];

    /* renamed from: p */
    MeteringRectangle[] f51140p = new MeteringRectangle[0];

    /* renamed from: q */
    MeteringRectangle[] f51141q = new MeteringRectangle[0];

    /* renamed from: r */
    MeteringRectangle[] f51142r = new MeteringRectangle[0];

    /* renamed from: s */
    b.a<z.s> f51143s = null;

    /* renamed from: t */
    b.a<Void> f51144t = null;

    /* loaded from: classes.dex */
    public class a extends androidx.camera.core.impl.e {

        /* renamed from: a */
        final /* synthetic */ b.a f51145a;

        a(p1 p1Var, b.a aVar) {
            this.f51145a = aVar;
        }

        @Override // androidx.camera.core.impl.e
        public void a() {
            b.a aVar = this.f51145a;
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.e
        public void b(androidx.camera.core.impl.m mVar) {
            b.a aVar = this.f51145a;
            if (aVar != null) {
                aVar.c(mVar);
            }
        }

        @Override // androidx.camera.core.impl.e
        public void c(androidx.camera.core.impl.g gVar) {
            b.a aVar = this.f51145a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(gVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.camera.core.impl.e {

        /* renamed from: a */
        final /* synthetic */ b.a f51146a;

        b(p1 p1Var, b.a aVar) {
            this.f51146a = aVar;
        }

        @Override // androidx.camera.core.impl.e
        public void a() {
            b.a aVar = this.f51146a;
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.e
        public void b(androidx.camera.core.impl.m mVar) {
            b.a aVar = this.f51146a;
            if (aVar != null) {
                aVar.c(mVar);
            }
        }

        @Override // androidx.camera.core.impl.e
        public void c(androidx.camera.core.impl.g gVar) {
            b.a aVar = this.f51146a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(gVar));
            }
        }
    }

    public p1(s sVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f51125a = sVar;
        this.f51126b = executor;
        this.f51127c = scheduledExecutorService;
    }

    public /* synthetic */ void A(final long j11) {
        this.f51126b.execute(new Runnable() { // from class: t.k1
            {
                p1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p1.a(p1.this, j11);
            }
        });
    }

    public /* synthetic */ Object C(final z.r rVar, final Rational rational, final b.a aVar) {
        this.f51126b.execute(new Runnable() { // from class: t.m1
            {
                p1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                p1.f(p1.this, aVar, rVar, rational);
            }
        });
        return "startFocusAndMetering";
    }

    private static int D(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i13), i12);
    }

    private boolean G() {
        return this.f51137m.length > 0;
    }

    public static /* synthetic */ void a(p1 p1Var, long j11) {
        p1Var.z(j11);
    }

    public static /* synthetic */ void b(p1 p1Var, long j11) {
        p1Var.A(j11);
    }

    public static /* synthetic */ boolean c(p1 p1Var, boolean z11, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, TotalCaptureResult totalCaptureResult) {
        return p1Var.y(z11, meteringRectangleArr, meteringRectangleArr2, meteringRectangleArr3, totalCaptureResult);
    }

    public static /* synthetic */ Object e(p1 p1Var, z.r rVar, Rational rational, b.a aVar) {
        return p1Var.C(rVar, rational, aVar);
    }

    public static /* synthetic */ void f(p1 p1Var, b.a aVar, z.r rVar, Rational rational) {
        p1Var.B(aVar, rVar, rational);
    }

    private void k(boolean z11) {
        b.a<z.s> aVar = this.f51143s;
        if (aVar != null) {
            aVar.c(z.s.a(z11));
            this.f51143s = null;
        }
    }

    private void l() {
        b.a<Void> aVar = this.f51144t;
        if (aVar != null) {
            aVar.c(null);
            this.f51144t = null;
        }
    }

    private void m() {
        ScheduledFuture<?> scheduledFuture = this.f51131g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f51131g = null;
        }
    }

    private void n(final MeteringRectangle[] meteringRectangleArr, final MeteringRectangle[] meteringRectangleArr2, final MeteringRectangle[] meteringRectangleArr3, z.r rVar) {
        this.f51125a.a0(this.f51135k);
        m();
        this.f51137m = meteringRectangleArr;
        this.f51138n = meteringRectangleArr2;
        this.f51139o = meteringRectangleArr3;
        if (G()) {
            this.f51129e = true;
            this.f51133i = false;
            this.f51134j = false;
            this.f51125a.h0();
            K(null);
        } else {
            this.f51129e = false;
            this.f51133i = true;
            this.f51134j = false;
            this.f51125a.h0();
        }
        this.f51130f = 0;
        final boolean v11 = v();
        s.c cVar = new s.c() { // from class: t.o1
            @Override // t.s.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return p1.c(p1.this, v11, meteringRectangleArr, meteringRectangleArr2, meteringRectangleArr3, totalCaptureResult);
            }
        };
        this.f51135k = cVar;
        this.f51125a.w(cVar);
        if (rVar.e()) {
            final long j11 = this.f51132h + 1;
            this.f51132h = j11;
            this.f51131g = this.f51127c.schedule(new Runnable() { // from class: t.l1
                {
                    p1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    p1.b(p1.this, j11);
                }
            }, rVar.a(), TimeUnit.MILLISECONDS);
        }
    }

    private void o(String str) {
        this.f51125a.a0(this.f51135k);
        b.a<z.s> aVar = this.f51143s;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException(str));
            this.f51143s = null;
        }
    }

    private void p(String str) {
        this.f51125a.a0(this.f51136l);
        b.a<Void> aVar = this.f51144t;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException(str));
            this.f51144t = null;
        }
    }

    private int q() {
        return 1;
    }

    private static PointF r(z.l0 l0Var, Rational rational, Rational rational2) {
        if (l0Var.b() != null) {
            rational2 = l0Var.b();
        }
        PointF pointF = new PointF(l0Var.c(), l0Var.d());
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointF.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + pointF.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                pointF.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + pointF.x) * (1.0f / doubleValue2);
            }
        }
        return pointF;
    }

    private static MeteringRectangle s(z.l0 l0Var, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int a11 = ((int) (l0Var.a() * rect.width())) / 2;
        int a12 = ((int) (l0Var.a() * rect.height())) / 2;
        Rect rect2 = new Rect(width - a11, height - a12, width + a11, height + a12);
        rect2.left = D(rect2.left, rect.right, rect.left);
        rect2.right = D(rect2.right, rect.right, rect.left);
        rect2.top = D(rect2.top, rect.bottom, rect.top);
        rect2.bottom = D(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    private static int t(MeteringRectangle[] meteringRectangleArr) {
        if (meteringRectangleArr == null) {
            return 0;
        }
        return meteringRectangleArr.length;
    }

    private static boolean u(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2) {
        if (t(meteringRectangleArr) == 0 && t(meteringRectangleArr2) == 0) {
            return true;
        }
        if (t(meteringRectangleArr) != t(meteringRectangleArr2)) {
            return false;
        }
        if (meteringRectangleArr != null && meteringRectangleArr2 != null) {
            for (int i11 = 0; i11 < meteringRectangleArr.length; i11++) {
                if (!meteringRectangleArr[i11].equals(meteringRectangleArr2[i11])) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean v() {
        return this.f51125a.H(1) == 1;
    }

    private static boolean w(z.l0 l0Var) {
        return l0Var.c() >= BitmapDescriptorFactory.HUE_RED && l0Var.c() <= 1.0f && l0Var.d() >= BitmapDescriptorFactory.HUE_RED && l0Var.d() <= 1.0f;
    }

    public /* synthetic */ boolean x(int i11, TotalCaptureResult totalCaptureResult) {
        CaptureRequest request = totalCaptureResult.getRequest();
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AF_REGIONS);
        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AE_REGIONS);
        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AWB_REGIONS);
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() == i11 && u(meteringRectangleArr, this.f51140p) && u(meteringRectangleArr2, this.f51141q) && u(meteringRectangleArr3, this.f51142r)) {
            l();
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean y(boolean z11, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (G()) {
            if (z11 && num != null) {
                if (this.f51130f.intValue() == 3) {
                    if (num.intValue() == 4) {
                        this.f51134j = true;
                        this.f51133i = true;
                    } else if (num.intValue() == 5) {
                        this.f51134j = false;
                        this.f51133i = true;
                    }
                }
            } else {
                this.f51134j = true;
                this.f51133i = true;
            }
        }
        if (this.f51133i && totalCaptureResult.getRequest() != null) {
            if (meteringRectangleArr.length == 0) {
                meteringRectangleArr = this.f51140p;
            }
            if (meteringRectangleArr2.length == 0) {
                meteringRectangleArr2 = this.f51141q;
            }
            if (meteringRectangleArr3.length == 0) {
                meteringRectangleArr3 = this.f51142r;
            }
            CaptureRequest request = totalCaptureResult.getRequest();
            if (u((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AF_REGIONS), meteringRectangleArr) && u((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AE_REGIONS), meteringRectangleArr2) && u((MeteringRectangle[]) request.get(CaptureRequest.CONTROL_AWB_REGIONS), meteringRectangleArr3)) {
                k(this.f51134j);
                return true;
            }
        }
        if (!this.f51130f.equals(num) && num != null) {
            this.f51130f = num;
        }
        return false;
    }

    public /* synthetic */ void z(long j11) {
        if (j11 == this.f51132h) {
            j();
        }
    }

    public void E(boolean z11) {
        if (z11 == this.f51128d) {
            return;
        }
        this.f51128d = z11;
        if (this.f51128d) {
            return;
        }
        j();
    }

    public void F(CaptureRequest.Builder builder) {
        this.f51140p = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AF_REGIONS);
        this.f51141q = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AE_REGIONS);
        this.f51142r = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AWB_REGIONS);
    }

    public com.google.common.util.concurrent.c<z.s> H(final z.r rVar, final Rational rational) {
        return androidx.concurrent.futures.b.a(new b.c() { // from class: t.j1
            {
                p1.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return p1.e(p1.this, rVar, rational, aVar);
            }
        });
    }

    /* renamed from: I */
    public void B(b.a<z.s> aVar, z.r rVar, Rational rational) {
        if (!this.f51128d) {
            aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
        } else if (rVar.c().isEmpty() && rVar.b().isEmpty() && rVar.d().isEmpty()) {
            aVar.f(new IllegalArgumentException("No AF/AE/AWB MeteringPoints are added."));
        } else {
            int min = Math.min(rVar.c().size(), this.f51125a.D());
            int min2 = Math.min(rVar.b().size(), this.f51125a.C());
            int min3 = Math.min(rVar.d().size(), this.f51125a.E());
            if (min + min2 + min3 <= 0) {
                aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                return;
            }
            ArrayList<z.l0> arrayList = new ArrayList();
            ArrayList<z.l0> arrayList2 = new ArrayList();
            ArrayList<z.l0> arrayList3 = new ArrayList();
            if (min > 0) {
                arrayList.addAll(rVar.c().subList(0, min));
            }
            if (min2 > 0) {
                arrayList2.addAll(rVar.b().subList(0, min2));
            }
            if (min3 > 0) {
                arrayList3.addAll(rVar.d().subList(0, min3));
            }
            Rect A = this.f51125a.A();
            Rational rational2 = new Rational(A.width(), A.height());
            if (rational == null) {
                rational = rational2;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (z.l0 l0Var : arrayList) {
                if (w(l0Var)) {
                    MeteringRectangle s11 = s(l0Var, r(l0Var, rational2, rational), A);
                    if (s11.getWidth() != 0 && s11.getHeight() != 0) {
                        arrayList4.add(s11);
                    }
                }
            }
            for (z.l0 l0Var2 : arrayList2) {
                if (w(l0Var2)) {
                    MeteringRectangle s12 = s(l0Var2, r(l0Var2, rational2, rational), A);
                    if (s12.getWidth() != 0 && s12.getHeight() != 0) {
                        arrayList5.add(s12);
                    }
                }
            }
            for (z.l0 l0Var3 : arrayList3) {
                if (w(l0Var3)) {
                    MeteringRectangle s13 = s(l0Var3, r(l0Var3, rational2, rational), A);
                    if (s13.getWidth() != 0 && s13.getHeight() != 0) {
                        arrayList6.add(s13);
                    }
                }
            }
            if (arrayList4.isEmpty() && arrayList5.isEmpty() && arrayList6.isEmpty()) {
                aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints are valid."));
                return;
            }
            o("Cancelled by another startFocusAndMetering()");
            p("Cancelled by another startFocusAndMetering()");
            m();
            this.f51143s = aVar;
            n((MeteringRectangle[]) arrayList4.toArray(new MeteringRectangle[0]), (MeteringRectangle[]) arrayList5.toArray(new MeteringRectangle[0]), (MeteringRectangle[]) arrayList6.toArray(new MeteringRectangle[0]), rVar);
        }
    }

    public void J(b.a<androidx.camera.core.impl.m> aVar) {
        if (!this.f51128d) {
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        a0.a aVar2 = new a0.a();
        aVar2.n(q());
        aVar2.o(true);
        a.C1090a c1090a = new a.C1090a();
        c1090a.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c1090a.c());
        aVar2.c(new b(this, aVar));
        this.f51125a.V(Collections.singletonList(aVar2.h()));
    }

    public void K(b.a<androidx.camera.core.impl.m> aVar) {
        if (!this.f51128d) {
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        a0.a aVar2 = new a0.a();
        aVar2.n(q());
        aVar2.o(true);
        a.C1090a c1090a = new a.C1090a();
        c1090a.d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        aVar2.e(c1090a.c());
        aVar2.c(new a(this, aVar));
        this.f51125a.V(Collections.singletonList(aVar2.h()));
    }

    public void g(a.C1090a c1090a) {
        c1090a.d(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f51125a.H(this.f51129e ? 1 : 4)));
        MeteringRectangle[] meteringRectangleArr = this.f51137m;
        if (meteringRectangleArr.length != 0) {
            c1090a.d(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f51138n;
        if (meteringRectangleArr2.length != 0) {
            c1090a.d(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f51139o;
        if (meteringRectangleArr3.length != 0) {
            c1090a.d(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void h(boolean z11, boolean z12) {
        if (this.f51128d) {
            a0.a aVar = new a0.a();
            aVar.o(true);
            aVar.n(q());
            a.C1090a c1090a = new a.C1090a();
            if (z11) {
                c1090a.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (Build.VERSION.SDK_INT >= 23 && z12) {
                c1090a.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c1090a.c());
            this.f51125a.V(Collections.singletonList(aVar.h()));
        }
    }

    void i(b.a<Void> aVar) {
        p("Cancelled by another cancelFocusAndMetering()");
        o("Cancelled by cancelFocusAndMetering()");
        this.f51144t = aVar;
        m();
        if (this.f51144t != null) {
            final int H = this.f51125a.H(4);
            s.c cVar = new s.c() { // from class: t.n1
                @Override // t.s.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean x11;
                    x11 = p1.this.x(H, totalCaptureResult);
                    return x11;
                }
            };
            this.f51136l = cVar;
            this.f51125a.w(cVar);
        }
        if (G()) {
            h(true, false);
        }
        this.f51137m = new MeteringRectangle[0];
        this.f51138n = new MeteringRectangle[0];
        this.f51139o = new MeteringRectangle[0];
        this.f51129e = false;
        this.f51125a.h0();
    }

    void j() {
        i(null);
    }
}