package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class l {
    public static final k<Float, m> a(float f11, float f12, long j11, long j12, boolean z11) {
        return new k<>(f1.b(kotlin.jvm.internal.l.f34915a), Float.valueOf(f11), q.a(f12), j11, j12, z11);
    }

    public static /* synthetic */ k b(float f11, float f12, long j11, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = BitmapDescriptorFactory.HUE_RED;
        }
        long j13 = (i11 & 4) != 0 ? Long.MIN_VALUE : j11;
        long j14 = (i11 & 8) == 0 ? j12 : Long.MIN_VALUE;
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return a(f11, f12, j13, j14, z11);
    }

    public static final <T, V extends p> k<T, V> c(k<T, V> kVar, T t11, V v11, long j11, long j12, boolean z11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        return new k<>(kVar.e(), t11, v11, j11, j12, z11);
    }

    public static /* synthetic */ k d(k kVar, Object obj, p pVar, long j11, long j12, boolean z11, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = kVar.getValue();
        }
        if ((i11 & 2) != 0) {
            pVar = q.b(kVar.g());
        }
        p pVar2 = pVar;
        if ((i11 & 4) != 0) {
            j11 = kVar.c();
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            j12 = kVar.b();
        }
        long j14 = j12;
        if ((i11 & 16) != 0) {
            z11 = kVar.h();
        }
        return c(kVar, obj, pVar2, j13, j14, z11);
    }

    public static final <T, V extends p> V e(d1<T, V> d1Var, T t11) {
        kotlin.jvm.internal.s.g(d1Var, "<this>");
        return (V) q.d(d1Var.a().invoke(t11));
    }
}