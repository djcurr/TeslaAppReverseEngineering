package t1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f51374d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final a1 f51375e = new a1(0, 0, BitmapDescriptorFactory.HUE_RED, 7, null);

    /* renamed from: a  reason: collision with root package name */
    private final long f51376a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51377b;

    /* renamed from: c  reason: collision with root package name */
    private final float f51378c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a1 a() {
            return a1.f51375e;
        }
    }

    private a1(long j11, long j12, float f11) {
        this.f51376a = j11;
        this.f51377b = j12;
        this.f51378c = f11;
    }

    public /* synthetic */ a1(long j11, long j12, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, f11);
    }

    public final float b() {
        return this.f51378c;
    }

    public final long c() {
        return this.f51376a;
    }

    public final long d() {
        return this.f51377b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            if (a0.n(c(), a1Var.c()) && s1.f.j(d(), a1Var.d())) {
                return (this.f51378c > a1Var.f51378c ? 1 : (this.f51378c == a1Var.f51378c ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((a0.t(c()) * 31) + s1.f.n(d())) * 31) + Float.hashCode(this.f51378c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) a0.u(c())) + ", offset=" + ((Object) s1.f.s(d())) + ", blurRadius=" + this.f51378c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ a1(long j11, long j12, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? c0.c(4278190080L) : j11, (i11 & 2) != 0 ? s1.f.f49950b.c() : j12, (i11 & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, null);
    }
}