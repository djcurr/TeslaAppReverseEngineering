package l2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36408b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f36409c = h(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f36410d = h(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f36411e = h(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f36412f = h(3);

    /* renamed from: g  reason: collision with root package name */
    private static final int f36413g = h(4);

    /* renamed from: h  reason: collision with root package name */
    private static final int f36414h = h(5);

    /* renamed from: a  reason: collision with root package name */
    private final int f36415a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return h.f36409c;
        }

        public final int b() {
            return h.f36410d;
        }

        public final int c() {
            return h.f36414h;
        }

        public final int d() {
            return h.f36412f;
        }

        public final int e() {
            return h.f36411e;
        }

        public final int f() {
            return h.f36413g;
        }
    }

    private /* synthetic */ h(int i11) {
        this.f36415a = i11;
    }

    public static final /* synthetic */ h g(int i11) {
        return new h(i11);
    }

    private static int h(int i11) {
        return i11;
    }

    public static boolean i(int i11, Object obj) {
        return (obj instanceof h) && i11 == ((h) obj).m();
    }

    public static final boolean j(int i11, int i12) {
        return i11 == i12;
    }

    public static int k(int i11) {
        return Integer.hashCode(i11);
    }

    public static String l(int i11) {
        return j(i11, f36409c) ? "Button" : j(i11, f36410d) ? "Checkbox" : j(i11, f36411e) ? "Switch" : j(i11, f36412f) ? "RadioButton" : j(i11, f36413g) ? "Tab" : j(i11, f36414h) ? "Image" : "Unknown";
    }

    public boolean equals(Object obj) {
        return i(this.f36415a, obj);
    }

    public int hashCode() {
        return k(this.f36415a);
    }

    public final /* synthetic */ int m() {
        return this.f36415a;
    }

    public String toString() {
        return l(this.f36415a);
    }
}