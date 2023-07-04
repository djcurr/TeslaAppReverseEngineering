package w2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f55428a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f55429b = c(1);

    /* renamed from: c  reason: collision with root package name */
    private static final int f55430c = c(2);

    /* renamed from: d  reason: collision with root package name */
    private static final int f55431d = c(3);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k.f55429b;
        }

        public final int b() {
            return k.f55430c;
        }
    }

    public static int c(int i11) {
        return i11;
    }

    public static final boolean d(int i11, int i12) {
        return i11 == i12;
    }

    public static int e(int i11) {
        return Integer.hashCode(i11);
    }

    public static String f(int i11) {
        return d(i11, f55429b) ? "Clip" : d(i11, f55430c) ? "Ellipsis" : d(i11, f55431d) ? "Visible" : "Invalid";
    }
}