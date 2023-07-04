package l2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36391b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f36392c = c(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f36393d = c(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f36394a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e.f36393d;
        }

        public final int b() {
            return e.f36392c;
        }
    }

    private static int c(int i11) {
        return i11;
    }

    public static boolean d(int i11, Object obj) {
        return (obj instanceof e) && i11 == ((e) obj).h();
    }

    public static final boolean e(int i11, int i12) {
        return i11 == i12;
    }

    public static int f(int i11) {
        return Integer.hashCode(i11);
    }

    public static String g(int i11) {
        return e(i11, f36392c) ? "Polite" : e(i11, f36393d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return d(this.f36394a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f36394a;
    }

    public int hashCode() {
        return f(this.f36394a);
    }

    public String toString() {
        return g(this.f36394a);
    }
}