package t1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51503b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f51504c = d(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f51505d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f51506a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return s0.f51505d;
        }

        public final int b() {
            return s0.f51504c;
        }
    }

    private /* synthetic */ s0(int i11) {
        this.f51506a = i11;
    }

    public static final /* synthetic */ s0 c(int i11) {
        return new s0(i11);
    }

    public static int d(int i11) {
        return i11;
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof s0) && i11 == ((s0) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return Integer.hashCode(i11);
    }

    public static String h(int i11) {
        return f(i11, f51504c) ? "NonZero" : f(i11, f51505d) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f51506a, obj);
    }

    public int hashCode() {
        return g(this.f51506a);
    }

    public final /* synthetic */ int i() {
        return this.f51506a;
    }

    public String toString() {
        return h(this.f51506a);
    }
}