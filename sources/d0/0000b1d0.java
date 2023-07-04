package s2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    public static final a f50139b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f50140c = j(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f50141d = j(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f50142e = j(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f50143f = j(4);

    /* renamed from: g  reason: collision with root package name */
    private static final int f50144g = j(5);

    /* renamed from: h  reason: collision with root package name */
    private static final int f50145h = j(6);

    /* renamed from: i  reason: collision with root package name */
    private static final int f50146i = j(7);

    /* renamed from: j  reason: collision with root package name */
    private static final int f50147j = j(8);

    /* renamed from: a  reason: collision with root package name */
    private final int f50148a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return s.f50141d;
        }

        public final int b() {
            return s.f50145h;
        }

        public final int c() {
            return s.f50142e;
        }

        public final int d() {
            return s.f50147j;
        }

        public final int e() {
            return s.f50146i;
        }

        public final int f() {
            return s.f50143f;
        }

        public final int g() {
            return s.f50140c;
        }

        public final int h() {
            return s.f50144g;
        }
    }

    private /* synthetic */ s(int i11) {
        this.f50148a = i11;
    }

    public static final /* synthetic */ s i(int i11) {
        return new s(i11);
    }

    public static int j(int i11) {
        return i11;
    }

    public static boolean k(int i11, Object obj) {
        return (obj instanceof s) && i11 == ((s) obj).o();
    }

    public static final boolean l(int i11, int i12) {
        return i11 == i12;
    }

    public static int m(int i11) {
        return Integer.hashCode(i11);
    }

    public static String n(int i11) {
        return l(i11, f50140c) ? "Text" : l(i11, f50141d) ? "Ascii" : l(i11, f50142e) ? "Number" : l(i11, f50143f) ? "Phone" : l(i11, f50144g) ? "Uri" : l(i11, f50145h) ? "Email" : l(i11, f50146i) ? "Password" : l(i11, f50147j) ? "NumberPassword" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f50148a, obj);
    }

    public int hashCode() {
        return m(this.f50148a);
    }

    public final /* synthetic */ int o() {
        return this.f50148a;
    }

    public String toString() {
        return n(this.f50148a);
    }
}