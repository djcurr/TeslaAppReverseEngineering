package x0;

import c1.w0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import t1.c0;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final w0<x> f56630a = c1.r.c(null, a.f56633a, 1, null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f56631b;

    /* renamed from: c  reason: collision with root package name */
    private static final x f56632c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<x> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56633a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final x invoke() {
            return y.f56632c;
        }
    }

    static {
        long c11 = c0.c(4282550004L);
        f56631b = c11;
        f56632c = new x(c11, t1.a0.l(c11, 0.4f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), null);
    }

    public static final w0<x> b() {
        return f56630a;
    }
}