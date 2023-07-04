package s1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private final float f49961a;

    /* renamed from: b */
    private final float f49962b;

    /* renamed from: c */
    private final float f49963c;

    /* renamed from: d */
    private final float f49964d;

    /* renamed from: e */
    private final long f49965e;

    /* renamed from: f */
    private final long f49966f;

    /* renamed from: g */
    private final long f49967g;

    /* renamed from: h */
    private final long f49968h;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        k.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, s1.a.f49944a.a());
    }

    private j(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14) {
        this.f49961a = f11;
        this.f49962b = f12;
        this.f49963c = f13;
        this.f49964d = f14;
        this.f49965e = j11;
        this.f49966f = j12;
        this.f49967g = j13;
        this.f49968h = j14;
    }

    public /* synthetic */ j(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, j11, j12, j13, j14);
    }

    public final float a() {
        return this.f49964d;
    }

    public final long b() {
        return this.f49968h;
    }

    public final long c() {
        return this.f49967g;
    }

    public final float d() {
        return this.f49964d - this.f49962b;
    }

    public final float e() {
        return this.f49961a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return s.c(Float.valueOf(this.f49961a), Float.valueOf(jVar.f49961a)) && s.c(Float.valueOf(this.f49962b), Float.valueOf(jVar.f49962b)) && s.c(Float.valueOf(this.f49963c), Float.valueOf(jVar.f49963c)) && s.c(Float.valueOf(this.f49964d), Float.valueOf(jVar.f49964d)) && s1.a.c(this.f49965e, jVar.f49965e) && s1.a.c(this.f49966f, jVar.f49966f) && s1.a.c(this.f49967g, jVar.f49967g) && s1.a.c(this.f49968h, jVar.f49968h);
        }
        return false;
    }

    public final float f() {
        return this.f49963c;
    }

    public final float g() {
        return this.f49962b;
    }

    public final long h() {
        return this.f49965e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f49961a) * 31) + Float.hashCode(this.f49962b)) * 31) + Float.hashCode(this.f49963c)) * 31) + Float.hashCode(this.f49964d)) * 31) + s1.a.f(this.f49965e)) * 31) + s1.a.f(this.f49966f)) * 31) + s1.a.f(this.f49967g)) * 31) + s1.a.f(this.f49968h);
    }

    public final long i() {
        return this.f49966f;
    }

    public final float j() {
        return this.f49963c - this.f49961a;
    }

    public String toString() {
        long h11 = h();
        long i11 = i();
        long c11 = c();
        long b11 = b();
        String str = c.a(this.f49961a, 1) + ", " + c.a(this.f49962b, 1) + ", " + c.a(this.f49963c, 1) + ", " + c.a(this.f49964d, 1);
        if (s1.a.c(h11, i11) && s1.a.c(i11, c11) && s1.a.c(c11, b11)) {
            if (s1.a.d(h11) == s1.a.e(h11)) {
                return "RoundRect(rect=" + str + ", radius=" + c.a(s1.a.d(h11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
            return "RoundRect(rect=" + str + ", x=" + c.a(s1.a.d(h11), 1) + ", y=" + c.a(s1.a.e(h11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) s1.a.g(h11)) + ", topRight=" + ((Object) s1.a.g(i11)) + ", bottomRight=" + ((Object) s1.a.g(c11)) + ", bottomLeft=" + ((Object) s1.a.g(b11)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}