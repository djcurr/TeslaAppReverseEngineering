package r1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f48976b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f48977c = j(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f48978d = j(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f48979e = j(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f48980f = j(4);

    /* renamed from: g  reason: collision with root package name */
    private static final int f48981g = j(5);

    /* renamed from: h  reason: collision with root package name */
    private static final int f48982h = j(6);

    /* renamed from: i  reason: collision with root package name */
    private static final int f48983i = j(7);

    /* renamed from: j  reason: collision with root package name */
    private static final int f48984j = j(8);

    /* renamed from: a  reason: collision with root package name */
    private final int f48985a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return c.f48982h;
        }

        public final int b() {
            return c.f48983i;
        }

        public final int c() {
            return c.f48979e;
        }

        public final int d() {
            return c.f48977c;
        }

        public final int e() {
            return c.f48984j;
        }

        public final int f() {
            return c.f48978d;
        }

        public final int g() {
            return c.f48980f;
        }

        public final int h() {
            return c.f48981g;
        }
    }

    private /* synthetic */ c(int i11) {
        this.f48985a = i11;
    }

    public static final /* synthetic */ c i(int i11) {
        return new c(i11);
    }

    public static int j(int i11) {
        return i11;
    }

    public static boolean k(int i11, Object obj) {
        return (obj instanceof c) && i11 == ((c) obj).o();
    }

    public static final boolean l(int i11, int i12) {
        return i11 == i12;
    }

    public static int m(int i11) {
        return Integer.hashCode(i11);
    }

    public static String n(int i11) {
        return l(i11, f48977c) ? "Next" : l(i11, f48978d) ? "Previous" : l(i11, f48979e) ? "Left" : l(i11, f48980f) ? "Right" : l(i11, f48981g) ? "Up" : l(i11, f48982h) ? "Down" : l(i11, f48983i) ? "In" : l(i11, f48984j) ? "Out" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f48985a, obj);
    }

    public int hashCode() {
        return m(this.f48985a);
    }

    public final /* synthetic */ int o() {
        return this.f48985a;
    }

    public String toString() {
        return n(this.f48985a);
    }
}