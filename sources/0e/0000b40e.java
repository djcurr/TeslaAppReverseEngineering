package t1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f51434b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f51435c = e(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f51436d = e(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f51437e = e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f51438a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return g1.f51437e;
        }

        public final int b() {
            return g1.f51435c;
        }

        public final int c() {
            return g1.f51436d;
        }
    }

    private /* synthetic */ g1(int i11) {
        this.f51438a = i11;
    }

    public static final /* synthetic */ g1 d(int i11) {
        return new g1(i11);
    }

    public static int e(int i11) {
        return i11;
    }

    public static boolean f(int i11, Object obj) {
        return (obj instanceof g1) && i11 == ((g1) obj).j();
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        return g(i11, f51435c) ? "Miter" : g(i11, f51436d) ? "Round" : g(i11, f51437e) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f51438a, obj);
    }

    public int hashCode() {
        return h(this.f51438a);
    }

    public final /* synthetic */ int j() {
        return this.f51438a;
    }

    public String toString() {
        return i(this.f51438a);
    }
}