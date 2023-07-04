package a2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0006a f130b = new C0006a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f131c = d(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f132d = d(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f133a;

    /* renamed from: a2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0006a {
        private C0006a() {
        }

        public /* synthetic */ C0006a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f132d;
        }

        public final int b() {
            return a.f131c;
        }
    }

    private /* synthetic */ a(int i11) {
        this.f133a = i11;
    }

    public static final /* synthetic */ a c(int i11) {
        return new a(i11);
    }

    public static int d(int i11) {
        return i11;
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof a) && i11 == ((a) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return Integer.hashCode(i11);
    }

    public static String h(int i11) {
        return f(i11, f131c) ? "Touch" : f(i11, f132d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f133a, obj);
    }

    public int hashCode() {
        return g(this.f133a);
    }

    public final /* synthetic */ int i() {
        return this.f133a;
    }

    public String toString() {
        return h(this.f133a);
    }
}