package r2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49085b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f49086c = f(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f49087d = f(1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f49088e = f(2);

    /* renamed from: f  reason: collision with root package name */
    private static final int f49089f = f(3);

    /* renamed from: a  reason: collision with root package name */
    private final int f49090a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k.f49087d;
        }

        public final int b() {
            return k.f49086c;
        }

        public final int c() {
            return k.f49089f;
        }

        public final int d() {
            return k.f49088e;
        }
    }

    private /* synthetic */ k(int i11) {
        this.f49090a = i11;
    }

    public static final /* synthetic */ k e(int i11) {
        return new k(i11);
    }

    public static int f(int i11) {
        return i11;
    }

    public static boolean g(int i11, Object obj) {
        return (obj instanceof k) && i11 == ((k) obj).m();
    }

    public static final boolean h(int i11, int i12) {
        return i11 == i12;
    }

    public static int i(int i11) {
        return Integer.hashCode(i11);
    }

    public static final boolean j(int i11) {
        return h(i11, f49087d) || h(i11, f49089f);
    }

    public static final boolean k(int i11) {
        return h(i11, f49087d) || h(i11, f49088e);
    }

    public static String l(int i11) {
        return h(i11, f49086c) ? "None" : h(i11, f49087d) ? "All" : h(i11, f49088e) ? "Weight" : h(i11, f49089f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f49090a, obj);
    }

    public int hashCode() {
        return i(this.f49090a);
    }

    public final /* synthetic */ int m() {
        return this.f49090a;
    }

    public String toString() {
        return l(this.f49090a);
    }
}