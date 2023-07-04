package n2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40322a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f40323b = h(1);

    /* renamed from: c  reason: collision with root package name */
    private static final int f40324c = h(2);

    /* renamed from: d  reason: collision with root package name */
    private static final int f40325d = h(3);

    /* renamed from: e  reason: collision with root package name */
    private static final int f40326e = h(4);

    /* renamed from: f  reason: collision with root package name */
    private static final int f40327f = h(5);

    /* renamed from: g  reason: collision with root package name */
    private static final int f40328g = h(6);

    /* renamed from: h  reason: collision with root package name */
    private static final int f40329h = h(7);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return q.f40323b;
        }

        public final int b() {
            return q.f40325d;
        }

        public final int c() {
            return q.f40326e;
        }

        public final int d() {
            return q.f40328g;
        }

        public final int e() {
            return q.f40329h;
        }

        public final int f() {
            return q.f40327f;
        }

        public final int g() {
            return q.f40324c;
        }
    }

    public static int h(int i11) {
        return i11;
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return Integer.hashCode(i11);
    }

    public static String k(int i11) {
        return i(i11, f40323b) ? "AboveBaseline" : i(i11, f40324c) ? "Top" : i(i11, f40325d) ? "Bottom" : i(i11, f40326e) ? "Center" : i(i11, f40327f) ? "TextTop" : i(i11, f40328g) ? "TextBottom" : i(i11, f40329h) ? "TextCenter" : "Invalid";
    }
}