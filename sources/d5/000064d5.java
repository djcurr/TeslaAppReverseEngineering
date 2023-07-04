package d2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23301a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f23302b = f(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f23303c = f(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f23304d = f(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f23305e = f(3);

    /* renamed from: f  reason: collision with root package name */
    private static final int f23306f = f(4);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return e0.f23306f;
        }

        public final int b() {
            return e0.f23304d;
        }

        public final int c() {
            return e0.f23305e;
        }

        public final int d() {
            return e0.f23303c;
        }

        public final int e() {
            return e0.f23302b;
        }
    }

    private static int f(int i11) {
        return i11;
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}