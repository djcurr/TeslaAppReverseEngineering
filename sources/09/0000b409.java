package t1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51429b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f51430c = e(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f51431d = e(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f51432e = e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f51433a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return f1.f51430c;
        }

        public final int b() {
            return f1.f51431d;
        }

        public final int c() {
            return f1.f51432e;
        }
    }

    private /* synthetic */ f1(int i11) {
        this.f51433a = i11;
    }

    public static final /* synthetic */ f1 d(int i11) {
        return new f1(i11);
    }

    public static int e(int i11) {
        return i11;
    }

    public static boolean f(int i11, Object obj) {
        return (obj instanceof f1) && i11 == ((f1) obj).j();
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        return g(i11, f51430c) ? "Butt" : g(i11, f51431d) ? "Round" : g(i11, f51432e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f51433a, obj);
    }

    public int hashCode() {
        return h(this.f51433a);
    }

    public final /* synthetic */ int j() {
        return this.f51433a;
    }

    public String toString() {
        return i(this.f51433a);
    }
}