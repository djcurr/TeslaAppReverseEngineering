package x2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import x2.g;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f56944a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f56945b;

    /* renamed from: c  reason: collision with root package name */
    private static final long f56946c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return j.f56946c;
        }

        public final long b() {
            return j.f56945b;
        }
    }

    static {
        float f11 = 0;
        f56945b = h.b(g.f(f11), g.f(f11));
        g.a aVar = g.f56937b;
        f56946c = h.b(aVar.b(), aVar.b());
    }

    public static long c(long j11) {
        return j11;
    }

    public static final boolean d(long j11, long j12) {
        return j11 == j12;
    }

    public static final float e(long j11) {
        if (j11 != f56946c) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return g.f(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float f(long j11) {
        if (j11 != f56946c) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return g.f(Float.intBitsToFloat((int) (j11 >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static int g(long j11) {
        return Long.hashCode(j11);
    }

    public static String h(long j11) {
        if (j11 != f56944a.a()) {
            return ((Object) g.k(f(j11))) + " x " + ((Object) g.k(e(j11)));
        }
        return "DpSize.Unspecified";
    }
}