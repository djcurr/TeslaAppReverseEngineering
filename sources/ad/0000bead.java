package x2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g implements Comparable<g> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56937b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final float f56938c = f(BitmapDescriptorFactory.HUE_RED);

    /* renamed from: d  reason: collision with root package name */
    private static final float f56939d;

    /* renamed from: a  reason: collision with root package name */
    private final float f56940a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return g.f56938c;
        }

        public final float b() {
            return g.f56939d;
        }
    }

    static {
        f(Float.POSITIVE_INFINITY);
        f56939d = f(Float.NaN);
    }

    private /* synthetic */ g(float f11) {
        this.f56940a = f11;
    }

    public static final /* synthetic */ g c(float f11) {
        return new g(f11);
    }

    public static int e(float f11, float f12) {
        return Float.compare(f11, f12);
    }

    public static float f(float f11) {
        return f11;
    }

    public static boolean g(float f11, Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.s.c(Float.valueOf(f11), Float.valueOf(((g) obj).l()));
        }
        return false;
    }

    public static final boolean h(float f11, float f12) {
        return kotlin.jvm.internal.s.c(Float.valueOf(f11), Float.valueOf(f12));
    }

    public static int i(float f11) {
        return Float.hashCode(f11);
    }

    public static String k(float f11) {
        if (Float.isNaN(f11)) {
            return "Dp.Unspecified";
        }
        return f11 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(g gVar) {
        return d(gVar.l());
    }

    public int d(float f11) {
        return e(this.f56940a, f11);
    }

    public boolean equals(Object obj) {
        return g(this.f56940a, obj);
    }

    public int hashCode() {
        return i(this.f56940a);
    }

    public final /* synthetic */ float l() {
        return this.f56940a;
    }

    public String toString() {
        return k(this.f56940a);
    }
}