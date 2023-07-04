package s2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50115b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f50116c = j(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f50117d = j(0);

    /* renamed from: e  reason: collision with root package name */
    private static final int f50118e = j(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f50119f = j(3);

    /* renamed from: g  reason: collision with root package name */
    private static final int f50120g = j(4);

    /* renamed from: h  reason: collision with root package name */
    private static final int f50121h = j(5);

    /* renamed from: i  reason: collision with root package name */
    private static final int f50122i = j(6);

    /* renamed from: j  reason: collision with root package name */
    private static final int f50123j = j(7);

    /* renamed from: a  reason: collision with root package name */
    private final int f50124a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return l.f50116c;
        }

        public final int b() {
            return l.f50123j;
        }

        public final int c() {
            return l.f50118e;
        }

        public final int d() {
            return l.f50122i;
        }

        public final int e() {
            return l.f50117d;
        }

        public final int f() {
            return l.f50121h;
        }

        public final int g() {
            return l.f50119f;
        }

        public final int h() {
            return l.f50120g;
        }
    }

    private /* synthetic */ l(int i11) {
        this.f50124a = i11;
    }

    public static final /* synthetic */ l i(int i11) {
        return new l(i11);
    }

    public static int j(int i11) {
        return i11;
    }

    public static boolean k(int i11, Object obj) {
        return (obj instanceof l) && i11 == ((l) obj).o();
    }

    public static final boolean l(int i11, int i12) {
        return i11 == i12;
    }

    public static int m(int i11) {
        return Integer.hashCode(i11);
    }

    public static String n(int i11) {
        return l(i11, f50117d) ? "None" : l(i11, f50116c) ? "Default" : l(i11, f50118e) ? "Go" : l(i11, f50119f) ? "Search" : l(i11, f50120g) ? "Send" : l(i11, f50121h) ? "Previous" : l(i11, f50122i) ? "Next" : l(i11, f50123j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f50124a, obj);
    }

    public int hashCode() {
        return m(this.f50124a);
    }

    public final /* synthetic */ int o() {
        return this.f50124a;
    }

    public String toString() {
        return n(this.f50124a);
    }
}