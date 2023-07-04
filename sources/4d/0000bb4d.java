package w0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import o1.f;

/* loaded from: classes.dex */
public final class p0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f55173a;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.a.values().length];
            iArr[androidx.compose.foundation.gestures.a.Vertical.ordinal()] = 1;
            iArr[androidx.compose.foundation.gestures.a.Horizontal.ordinal()] = 2;
            f55173a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<androidx.compose.ui.platform.y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q0 f55174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0.m f55175b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f55176c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, o0.m mVar, boolean z11) {
            super(1);
            this.f55174a = q0Var;
            this.f55175b = mVar;
            this.f55176c = z11;
        }

        public final void a(androidx.compose.ui.platform.y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("textFieldScrollable");
            y0Var.a().b("scrollerPosition", this.f55174a);
            y0Var.a().b("interactionSource", this.f55175b);
            y0Var.a().b("enabled", Boolean.valueOf(this.f55176c));
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(androidx.compose.ui.platform.y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q0 f55177a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f55178b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o0.m f55179c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<Float, Float> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q0 f55180a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q0 q0Var) {
                super(1);
                this.f55180a = q0Var;
            }

            public final Float a(float f11) {
                float d11 = this.f55180a.d() + f11;
                if (d11 > this.f55180a.c()) {
                    f11 = this.f55180a.c() - this.f55180a.d();
                } else if (d11 < BitmapDescriptorFactory.HUE_RED) {
                    f11 = -this.f55180a.d();
                }
                q0 q0Var = this.f55180a;
                q0Var.i(q0Var.d() + f11);
                return Float.valueOf(f11);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ Float invoke(Float f11) {
                return a(f11.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q0 q0Var, boolean z11, o0.m mVar) {
            super(3);
            this.f55177a = q0Var;
            this.f55178b = z11;
            this.f55179c = mVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            boolean z11;
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(994171470);
            boolean z12 = this.f55177a.f() == androidx.compose.foundation.gestures.a.Vertical || !(iVar.A(androidx.compose.ui.platform.l0.i()) == x2.q.Rtl);
            n0.f0 b11 = n0.g0.b(new a(this.f55177a), iVar, 0);
            f.a aVar = o1.f.f42062f1;
            androidx.compose.foundation.gestures.a f11 = this.f55177a.f();
            if (this.f55178b) {
                if (!(this.f55177a.c() == BitmapDescriptorFactory.HUE_RED)) {
                    z11 = true;
                    o1.f i12 = n0.e0.i(aVar, b11, f11, z11, z12, null, this.f55179c, 16, null);
                    iVar.N();
                    return i12;
                }
            }
            z11 = false;
            o1.f i122 = n0.e0.i(aVar, b11, f11, z11, z12, null, this.f55179c, 16, null);
            iVar.N();
            return i122;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s1.h b(x2.d dVar, int i11, s2.i0 i0Var, n2.w wVar, boolean z11, int i12) {
        float i13;
        float i14;
        s1.h d11 = wVar == null ? null : wVar.d(i0Var.a().originalToTransformed(i11));
        if (d11 == null) {
            d11 = s1.h.f49955e.a();
        }
        s1.h hVar = d11;
        int G = dVar.G(f0.d());
        if (z11) {
            i13 = (i12 - hVar.i()) - G;
        } else {
            i13 = hVar.i();
        }
        float f11 = i13;
        if (z11) {
            i14 = i12 - hVar.i();
        } else {
            i14 = hVar.i() + G;
        }
        return s1.h.d(hVar, f11, BitmapDescriptorFactory.HUE_RED, i14, BitmapDescriptorFactory.HUE_RED, 10, null);
    }

    public static final o1.f c(o1.f fVar, q0 scrollerPosition, s2.a0 textFieldValue, s2.k0 visualTransformation, h00.a<v0> textLayoutResultProvider) {
        o1.f d1Var;
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(scrollerPosition, "scrollerPosition");
        kotlin.jvm.internal.s.g(textFieldValue, "textFieldValue");
        kotlin.jvm.internal.s.g(visualTransformation, "visualTransformation");
        kotlin.jvm.internal.s.g(textLayoutResultProvider, "textLayoutResultProvider");
        androidx.compose.foundation.gestures.a f11 = scrollerPosition.f();
        int e11 = scrollerPosition.e(textFieldValue.g());
        scrollerPosition.j(textFieldValue.g());
        s2.i0 filter = visualTransformation.filter(textFieldValue.e());
        int i11 = a.f55173a[f11.ordinal()];
        if (i11 == 1) {
            d1Var = new d1(scrollerPosition, e11, filter, textLayoutResultProvider);
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            d1Var = new k(scrollerPosition, e11, filter, textLayoutResultProvider);
        }
        return q1.d.b(fVar).g0(d1Var);
    }

    public static final o1.f d(o1.f fVar, q0 scrollerPosition, o0.m mVar, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(scrollerPosition, "scrollerPosition");
        return o1.e.a(fVar, androidx.compose.ui.platform.x0.c() ? new b(scrollerPosition, mVar, z11) : androidx.compose.ui.platform.x0.a(), new c(scrollerPosition, z11, mVar));
    }
}