package w2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C1261a f55397b = new C1261a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f55398c;

    /* renamed from: a  reason: collision with root package name */
    private final float f55399a;

    /* renamed from: w2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1261a {
        private C1261a() {
        }

        public /* synthetic */ C1261a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return a.f55398c;
        }
    }

    static {
        c(0.5f);
        c(-0.5f);
        f55398c = c(BitmapDescriptorFactory.HUE_RED);
    }

    private /* synthetic */ a(float f11) {
        this.f55399a = f11;
    }

    public static final /* synthetic */ a b(float f11) {
        return new a(f11);
    }

    public static float c(float f11) {
        return f11;
    }

    public static boolean d(float f11, Object obj) {
        if (obj instanceof a) {
            return s.c(Float.valueOf(f11), Float.valueOf(((a) obj).h()));
        }
        return false;
    }

    public static final boolean e(float f11, float f12) {
        return s.c(Float.valueOf(f11), Float.valueOf(f12));
    }

    public static int f(float f11) {
        return Float.hashCode(f11);
    }

    public static String g(float f11) {
        return "BaselineShift(multiplier=" + f11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return d(this.f55399a, obj);
    }

    public final /* synthetic */ float h() {
        return this.f55399a;
    }

    public int hashCode() {
        return f(this.f55399a);
    }

    public String toString() {
        return g(this.f55399a);
    }
}