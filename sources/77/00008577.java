package m0;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: g  reason: collision with root package name */
    public static final a f38111g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    private static final u f38112h;

    /* renamed from: i  reason: collision with root package name */
    private static final u f38113i;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f38114a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38115b;

    /* renamed from: c  reason: collision with root package name */
    private final float f38116c;

    /* renamed from: d  reason: collision with root package name */
    private final float f38117d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f38118e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f38119f;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean d(a aVar, u uVar, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = Build.VERSION.SDK_INT;
            }
            return aVar.c(uVar, i11);
        }

        public final u a() {
            return u.f38112h;
        }

        public final u b() {
            return u.f38113i;
        }

        public final boolean c(u style, int i11) {
            kotlin.jvm.internal.s.g(style, "style");
            return t.a(i11) && !style.f() && (style.h() || kotlin.jvm.internal.s.c(style, a()) || i11 >= 29);
        }
    }

    static {
        u uVar = new u(0L, (float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, false, false, 31, (DefaultConstructorMarker) null);
        f38112h = uVar;
        f38113i = new u(true, uVar.g(), uVar.d(), uVar.e(), uVar.f38118e, uVar.f38119f, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ u(long j11, float f11, float f12, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, f11, f12, z11, z12);
    }

    private u(boolean z11, long j11, float f11, float f12, boolean z12, boolean z13) {
        this.f38114a = z11;
        this.f38115b = j11;
        this.f38116c = f11;
        this.f38117d = f12;
        this.f38118e = z12;
        this.f38119f = z13;
    }

    public /* synthetic */ u(boolean z11, long j11, float f11, float f12, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, j11, f11, f12, z12, z13);
    }

    public final boolean c() {
        return this.f38118e;
    }

    public final float d() {
        return this.f38116c;
    }

    public final float e() {
        return this.f38117d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f38114a == uVar.f38114a && x2.j.d(g(), uVar.g()) && x2.g.h(d(), uVar.d()) && x2.g.h(e(), uVar.e()) && this.f38118e == uVar.f38118e && this.f38119f == uVar.f38119f;
        }
        return false;
    }

    public final boolean f() {
        return this.f38119f;
    }

    public final long g() {
        return this.f38115b;
    }

    public final boolean h() {
        return this.f38114a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f38114a) * 31) + x2.j.g(g())) * 31) + x2.g.i(d())) * 31) + x2.g.i(e())) * 31) + Boolean.hashCode(this.f38118e)) * 31) + Boolean.hashCode(this.f38119f);
    }

    public final boolean i() {
        return a.d(f38111g, this, 0, 2, null);
    }

    public String toString() {
        if (this.f38114a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) x2.j.h(g())) + ", cornerRadius=" + ((Object) x2.g.k(d())) + ", elevation=" + ((Object) x2.g.k(e())) + ", clippingEnabled=" + this.f38118e + ", fishEyeEnabled=" + this.f38119f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ u(long j11, float f11, float f12, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? x2.j.f56944a.a() : j11, (i11 & 2) != 0 ? x2.g.f56937b.b() : f11, (i11 & 4) != 0 ? x2.g.f56937b.b() : f12, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? false : z12, (DefaultConstructorMarker) null);
    }

    private u(long j11, float f11, float f12, boolean z11, boolean z12) {
        this(false, j11, f11, f12, z11, z12, (DefaultConstructorMarker) null);
    }
}