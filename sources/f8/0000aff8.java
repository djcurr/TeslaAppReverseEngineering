package r2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49081b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f49082c = d(0);

    /* renamed from: d  reason: collision with root package name */
    private static final int f49083d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f49084a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f49083d;
        }

        public final int b() {
            return j.f49082c;
        }
    }

    private /* synthetic */ j(int i11) {
        this.f49084a = i11;
    }

    public static final /* synthetic */ j c(int i11) {
        return new j(i11);
    }

    public static int d(int i11) {
        return i11;
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof j) && i11 == ((j) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return Integer.hashCode(i11);
    }

    public static String h(int i11) {
        return f(i11, f49082c) ? "Normal" : f(i11, f49083d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f49084a, obj);
    }

    public int hashCode() {
        return g(this.f49084a);
    }

    public final /* synthetic */ int i() {
        return this.f49084a;
    }

    public String toString() {
        return h(this.f49084a);
    }
}