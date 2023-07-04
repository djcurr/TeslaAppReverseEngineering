package t1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class f0 {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<androidx.compose.ui.platform.y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f51414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h00.l lVar) {
            super(1);
            this.f51414a = lVar;
        }

        public final void a(androidx.compose.ui.platform.y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("graphicsLayer");
            y0Var.a().b("block", this.f51414a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(androidx.compose.ui.platform.y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<androidx.compose.ui.platform.y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f51415a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f51416b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f51417c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f51418d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f51419e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f51420f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f51421g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f51422h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f51423i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f51424j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f51425k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c1 f51426l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f51427m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ x0 f51428n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, c1 c1Var, boolean z11, x0 x0Var) {
            super(1);
            this.f51415a = f11;
            this.f51416b = f12;
            this.f51417c = f13;
            this.f51418d = f14;
            this.f51419e = f15;
            this.f51420f = f16;
            this.f51421g = f17;
            this.f51422h = f18;
            this.f51423i = f19;
            this.f51424j = f21;
            this.f51425k = j11;
            this.f51426l = c1Var;
            this.f51427m = z11;
        }

        public final void a(androidx.compose.ui.platform.y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("graphicsLayer");
            y0Var.a().b("scaleX", Float.valueOf(this.f51415a));
            y0Var.a().b("scaleY", Float.valueOf(this.f51416b));
            y0Var.a().b("alpha", Float.valueOf(this.f51417c));
            y0Var.a().b("translationX", Float.valueOf(this.f51418d));
            y0Var.a().b("translationY", Float.valueOf(this.f51419e));
            y0Var.a().b("shadowElevation", Float.valueOf(this.f51420f));
            y0Var.a().b("rotationX", Float.valueOf(this.f51421g));
            y0Var.a().b("rotationY", Float.valueOf(this.f51422h));
            y0Var.a().b("rotationZ", Float.valueOf(this.f51423i));
            y0Var.a().b("cameraDistance", Float.valueOf(this.f51424j));
            y0Var.a().b("transformOrigin", h1.b(this.f51425k));
            y0Var.a().b("shape", this.f51426l);
            y0Var.a().b("clip", Boolean.valueOf(this.f51427m));
            y0Var.a().b("renderEffect", this.f51428n);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(androidx.compose.ui.platform.y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, h00.l<? super g0, vz.b0> block) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(block, "block");
        return fVar.g0(new r(block, androidx.compose.ui.platform.x0.c() ? new a(block) : androidx.compose.ui.platform.x0.a()));
    }

    public static final o1.f b(o1.f graphicsLayer, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, c1 shape, boolean z11, x0 x0Var) {
        kotlin.jvm.internal.s.g(graphicsLayer, "$this$graphicsLayer");
        kotlin.jvm.internal.s.g(shape, "shape");
        return graphicsLayer.g0(new d1(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, x0Var, androidx.compose.ui.platform.x0.c() ? new b(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, j11, shape, z11, x0Var) : androidx.compose.ui.platform.x0.a(), null));
    }

    public static /* synthetic */ o1.f c(o1.f fVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, c1 c1Var, boolean z11, x0 x0Var, int i11, Object obj) {
        float f22 = (i11 & 1) != 0 ? 1.0f : f11;
        float f23 = (i11 & 2) != 0 ? 1.0f : f12;
        float f24 = (i11 & 4) == 0 ? f13 : 1.0f;
        int i12 = i11 & 8;
        float f25 = BitmapDescriptorFactory.HUE_RED;
        float f26 = i12 != 0 ? 0.0f : f14;
        float f27 = (i11 & 16) != 0 ? 0.0f : f15;
        float f28 = (i11 & 32) != 0 ? 0.0f : f16;
        float f29 = (i11 & 64) != 0 ? 0.0f : f17;
        float f31 = (i11 & 128) != 0 ? 0.0f : f18;
        if ((i11 & 256) == 0) {
            f25 = f19;
        }
        return b(fVar, f22, f23, f24, f26, f27, f28, f29, f31, f25, (i11 & 512) != 0 ? 8.0f : f21, (i11 & 1024) != 0 ? h1.f51446b.a() : j11, (i11 & 2048) != 0 ? w0.a() : c1Var, (i11 & 4096) != 0 ? false : z11, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : x0Var);
    }

    public static final o1.f d(o1.f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return androidx.compose.ui.platform.x0.c() ? fVar.g0(c(o1.f.f42062f1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L, null, false, null, 16383, null)) : fVar;
    }
}