package w2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f55400b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f55401c = h(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f55402d = h(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f55403e = h(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f55404f = h(4);

    /* renamed from: g  reason: collision with root package name */
    private static final int f55405g = h(5);

    /* renamed from: h  reason: collision with root package name */
    private static final int f55406h = h(6);

    /* renamed from: a  reason: collision with root package name */
    private final int f55407a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f55403e;
        }

        public final int b() {
            return d.f55406h;
        }

        public final int c() {
            return d.f55404f;
        }

        public final int d() {
            return d.f55401c;
        }

        public final int e() {
            return d.f55402d;
        }

        public final int f() {
            return d.f55405g;
        }
    }

    private /* synthetic */ d(int i11) {
        this.f55407a = i11;
    }

    public static final /* synthetic */ d g(int i11) {
        return new d(i11);
    }

    public static int h(int i11) {
        return i11;
    }

    public static boolean i(int i11, Object obj) {
        return (obj instanceof d) && i11 == ((d) obj).m();
    }

    public static final boolean j(int i11, int i12) {
        return i11 == i12;
    }

    public static int k(int i11) {
        return Integer.hashCode(i11);
    }

    public static String l(int i11) {
        return j(i11, f55401c) ? "Left" : j(i11, f55402d) ? "Right" : j(i11, f55403e) ? "Center" : j(i11, f55404f) ? "Justify" : j(i11, f55405g) ? "Start" : j(i11, f55406h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f55407a, obj);
    }

    public int hashCode() {
        return k(this.f55407a);
    }

    public final /* synthetic */ int m() {
        return this.f55407a;
    }

    public String toString() {
        return l(this.f55407a);
    }
}