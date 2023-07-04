package t1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51387a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f51388b = c(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f51389c = c(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f51390d = c(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f51391e = c(3);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d0.f51389c;
        }

        public final int b() {
            return d0.f51388b;
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
        return d(i11, f51388b) ? "None" : d(i11, f51389c) ? "Low" : d(i11, f51390d) ? "Medium" : d(i11, f51391e) ? "High" : "Unknown";
    }
}