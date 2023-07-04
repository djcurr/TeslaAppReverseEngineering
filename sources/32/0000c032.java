package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c1.w0<z> f57861a = c1.r.d(b.f57864a);

    /* renamed from: b  reason: collision with root package name */
    private static final c1.w0<x2.g> f57862b = c1.r.c(null, a.f57863a, 1, null);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<x2.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f57863a = new a();

        a() {
            super(0);
        }

        public final float a() {
            return x2.g.f(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ x2.g invoke() {
            return x2.g.c(a());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f57864a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final z invoke() {
            return t.f58662a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j11, float f11, c1.i iVar, int i11) {
        return t1.a0.l(m.b(j11, iVar, i11 & 14), ((((float) Math.log(f11 + 1)) * 4.5f) + 2.0f) / 100.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    public static final c1.w0<x2.g> c() {
        return f57862b;
    }

    public static final c1.w0<z> d() {
        return f57861a;
    }
}