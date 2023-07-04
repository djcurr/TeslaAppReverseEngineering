package v0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;
import s1.l;
import t1.c1;
import t1.m0;
import x2.q;

/* loaded from: classes.dex */
public abstract class a implements c1 {

    /* renamed from: a  reason: collision with root package name */
    private final b f53775a;

    /* renamed from: b  reason: collision with root package name */
    private final b f53776b;

    /* renamed from: c  reason: collision with root package name */
    private final b f53777c;

    /* renamed from: d  reason: collision with root package name */
    private final b f53778d;

    public a(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        s.g(topStart, "topStart");
        s.g(topEnd, "topEnd");
        s.g(bottomEnd, "bottomEnd");
        s.g(bottomStart, "bottomStart");
        this.f53775a = topStart;
        this.f53776b = topEnd;
        this.f53777c = bottomEnd;
        this.f53778d = bottomStart;
    }

    public static /* synthetic */ a c(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                bVar = aVar.f53775a;
            }
            if ((i11 & 2) != 0) {
                bVar2 = aVar.f53776b;
            }
            if ((i11 & 4) != 0) {
                bVar3 = aVar.f53777c;
            }
            if ((i11 & 8) != 0) {
                bVar4 = aVar.f53778d;
            }
            return aVar.b(bVar, bVar2, bVar3, bVar4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @Override // t1.c1
    public final m0 a(long j11, q layoutDirection, x2.d density) {
        s.g(layoutDirection, "layoutDirection");
        s.g(density, "density");
        float a11 = this.f53775a.a(j11, density);
        float a12 = this.f53776b.a(j11, density);
        float a13 = this.f53777c.a(j11, density);
        float a14 = this.f53778d.a(j11, density);
        float h11 = l.h(j11);
        float f11 = a11 + a14;
        if (f11 > h11) {
            float f12 = h11 / f11;
            a11 *= f12;
            a14 *= f12;
        }
        float f13 = a14;
        float f14 = a12 + a13;
        if (f14 > h11) {
            float f15 = h11 / f14;
            a12 *= f15;
            a13 *= f15;
        }
        if (a11 >= BitmapDescriptorFactory.HUE_RED && a12 >= BitmapDescriptorFactory.HUE_RED && a13 >= BitmapDescriptorFactory.HUE_RED && f13 >= BitmapDescriptorFactory.HUE_RED) {
            return d(j11, a11, a12, a13, f13, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a11 + ", topEnd = " + a12 + ", bottomEnd = " + a13 + ", bottomStart = " + f13 + ")!").toString());
    }

    public abstract a b(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract m0 d(long j11, float f11, float f12, float f13, float f14, q qVar);

    public final b e() {
        return this.f53777c;
    }

    public final b f() {
        return this.f53778d;
    }

    public final b g() {
        return this.f53776b;
    }

    public final b h() {
        return this.f53775a;
    }
}