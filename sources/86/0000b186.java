package s1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e */
    public static final a f49955e = new a(null);

    /* renamed from: f */
    private static final h f49956f = new h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* renamed from: a */
    private final float f49957a;

    /* renamed from: b */
    private final float f49958b;

    /* renamed from: c */
    private final float f49959c;

    /* renamed from: d */
    private final float f49960d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f49956f;
        }
    }

    public h(float f11, float f12, float f13, float f14) {
        this.f49957a = f11;
        this.f49958b = f12;
        this.f49959c = f13;
        this.f49960d = f14;
    }

    public static /* synthetic */ h d(h hVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = hVar.f49957a;
        }
        if ((i11 & 2) != 0) {
            f12 = hVar.f49958b;
        }
        if ((i11 & 4) != 0) {
            f13 = hVar.f49959c;
        }
        if ((i11 & 8) != 0) {
            f14 = hVar.f49960d;
        }
        return hVar.c(f11, f12, f13, f14);
    }

    public final boolean b(long j11) {
        return f.l(j11) >= this.f49957a && f.l(j11) < this.f49959c && f.m(j11) >= this.f49958b && f.m(j11) < this.f49960d;
    }

    public final h c(float f11, float f12, float f13, float f14) {
        return new h(f11, f12, f13, f14);
    }

    public final float e() {
        return this.f49960d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return s.c(Float.valueOf(this.f49957a), Float.valueOf(hVar.f49957a)) && s.c(Float.valueOf(this.f49958b), Float.valueOf(hVar.f49958b)) && s.c(Float.valueOf(this.f49959c), Float.valueOf(hVar.f49959c)) && s.c(Float.valueOf(this.f49960d), Float.valueOf(hVar.f49960d));
        }
        return false;
    }

    public final long f() {
        return g.a(this.f49959c, this.f49960d);
    }

    public final long g() {
        return g.a(this.f49957a + (n() / 2.0f), this.f49958b + (h() / 2.0f));
    }

    public final float h() {
        return this.f49960d - this.f49958b;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f49957a) * 31) + Float.hashCode(this.f49958b)) * 31) + Float.hashCode(this.f49959c)) * 31) + Float.hashCode(this.f49960d);
    }

    public final float i() {
        return this.f49957a;
    }

    public final float j() {
        return this.f49959c;
    }

    public final long k() {
        return m.a(n(), h());
    }

    public final float l() {
        return this.f49958b;
    }

    public final long m() {
        return g.a(this.f49957a, this.f49958b);
    }

    public final float n() {
        return this.f49959c - this.f49957a;
    }

    public final h o(h other) {
        s.g(other, "other");
        return new h(Math.max(this.f49957a, other.f49957a), Math.max(this.f49958b, other.f49958b), Math.min(this.f49959c, other.f49959c), Math.min(this.f49960d, other.f49960d));
    }

    public final boolean p(h other) {
        s.g(other, "other");
        return this.f49959c > other.f49957a && other.f49959c > this.f49957a && this.f49960d > other.f49958b && other.f49960d > this.f49958b;
    }

    public final h q(float f11, float f12) {
        return new h(this.f49957a + f11, this.f49958b + f12, this.f49959c + f11, this.f49960d + f12);
    }

    public final h r(long j11) {
        return new h(this.f49957a + f.l(j11), this.f49958b + f.m(j11), this.f49959c + f.l(j11), this.f49960d + f.m(j11));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f49957a, 1) + ", " + c.a(this.f49958b, 1) + ", " + c.a(this.f49959c, 1) + ", " + c.a(this.f49960d, 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}