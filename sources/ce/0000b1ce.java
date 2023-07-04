package s2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f50134a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final int f50135b = e(0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f50136c = e(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f50137d = e(2);

    /* renamed from: e  reason: collision with root package name */
    private static final int f50138e = e(3);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r.f50136c;
        }

        public final int b() {
            return r.f50135b;
        }

        public final int c() {
            return r.f50138e;
        }

        public final int d() {
            return r.f50137d;
        }
    }

    public static int e(int i11) {
        return i11;
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return Integer.hashCode(i11);
    }

    public static String h(int i11) {
        return f(i11, f50135b) ? "None" : f(i11, f50136c) ? "Characters" : f(i11, f50137d) ? "Words" : f(i11, f50138e) ? "Sentences" : "Invalid";
    }
}