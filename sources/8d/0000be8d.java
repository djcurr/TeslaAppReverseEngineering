package x1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import t1.f1;
import t1.g1;
import t1.s0;

/* loaded from: classes.dex */
public final class t extends q {

    /* renamed from: a  reason: collision with root package name */
    private final String f56892a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f> f56893b;

    /* renamed from: c  reason: collision with root package name */
    private final int f56894c;

    /* renamed from: d  reason: collision with root package name */
    private final t1.s f56895d;

    /* renamed from: e  reason: collision with root package name */
    private final float f56896e;

    /* renamed from: f  reason: collision with root package name */
    private final t1.s f56897f;

    /* renamed from: g  reason: collision with root package name */
    private final float f56898g;

    /* renamed from: h  reason: collision with root package name */
    private final float f56899h;

    /* renamed from: i  reason: collision with root package name */
    private final int f56900i;

    /* renamed from: j  reason: collision with root package name */
    private final int f56901j;

    /* renamed from: k  reason: collision with root package name */
    private final float f56902k;

    /* renamed from: l  reason: collision with root package name */
    private final float f56903l;

    /* renamed from: m  reason: collision with root package name */
    private final float f56904m;

    /* renamed from: n  reason: collision with root package name */
    private final float f56905n;

    /* JADX WARN: Multi-variable type inference failed */
    private t(String str, List<? extends f> list, int i11, t1.s sVar, float f11, t1.s sVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17) {
        super(null);
        this.f56892a = str;
        this.f56893b = list;
        this.f56894c = i11;
        this.f56895d = sVar;
        this.f56896e = f11;
        this.f56897f = sVar2;
        this.f56898g = f12;
        this.f56899h = f13;
        this.f56900i = i12;
        this.f56901j = i13;
        this.f56902k = f14;
        this.f56903l = f15;
        this.f56904m = f16;
        this.f56905n = f17;
    }

    public /* synthetic */ t(String str, List list, int i11, t1.s sVar, float f11, t1.s sVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i11, sVar, f11, sVar2, f12, f13, i12, i13, f14, f15, f16, f17);
    }

    public final t1.s b() {
        return this.f56895d;
    }

    public final float c() {
        return this.f56896e;
    }

    public final String e() {
        return this.f56892a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(m0.b(t.class), m0.b(obj.getClass()))) {
            return false;
        }
        t tVar = (t) obj;
        if (kotlin.jvm.internal.s.c(this.f56892a, tVar.f56892a) && kotlin.jvm.internal.s.c(this.f56895d, tVar.f56895d)) {
            if ((this.f56896e == tVar.f56896e) && kotlin.jvm.internal.s.c(this.f56897f, tVar.f56897f)) {
                if (this.f56898g == tVar.f56898g) {
                    if ((this.f56899h == tVar.f56899h) && f1.g(k(), tVar.k()) && g1.g(m(), tVar.m())) {
                        if (this.f56902k == tVar.f56902k) {
                            if (this.f56903l == tVar.f56903l) {
                                if (this.f56904m == tVar.f56904m) {
                                    return ((this.f56905n > tVar.f56905n ? 1 : (this.f56905n == tVar.f56905n ? 0 : -1)) == 0) && s0.f(h(), tVar.h()) && kotlin.jvm.internal.s.c(this.f56893b, tVar.f56893b);
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final List<f> f() {
        return this.f56893b;
    }

    public final int h() {
        return this.f56894c;
    }

    public int hashCode() {
        int hashCode = ((this.f56892a.hashCode() * 31) + this.f56893b.hashCode()) * 31;
        t1.s sVar = this.f56895d;
        int hashCode2 = (((hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31) + Float.hashCode(this.f56896e)) * 31;
        t1.s sVar2 = this.f56897f;
        return ((((((((((((((((((hashCode2 + (sVar2 != null ? sVar2.hashCode() : 0)) * 31) + Float.hashCode(this.f56898g)) * 31) + Float.hashCode(this.f56899h)) * 31) + f1.h(k())) * 31) + g1.h(m())) * 31) + Float.hashCode(this.f56902k)) * 31) + Float.hashCode(this.f56903l)) * 31) + Float.hashCode(this.f56904m)) * 31) + Float.hashCode(this.f56905n)) * 31) + s0.g(h());
    }

    public final t1.s i() {
        return this.f56897f;
    }

    public final float j() {
        return this.f56898g;
    }

    public final int k() {
        return this.f56900i;
    }

    public final int m() {
        return this.f56901j;
    }

    public final float n() {
        return this.f56902k;
    }

    public final float o() {
        return this.f56899h;
    }

    public final float p() {
        return this.f56904m;
    }

    public final float q() {
        return this.f56905n;
    }

    public final float r() {
        return this.f56903l;
    }
}