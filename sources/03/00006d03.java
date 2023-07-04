package f2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f25600a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f25600a = s0.a(Float.NaN, Float.NaN);
    }

    public static long a(long j11) {
        return j11;
    }

    public static final float b(long j11) {
        if (j11 != f25600a) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return Float.intBitsToFloat((int) (j11 >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final float c(long j11) {
        if (j11 != f25600a) {
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return Float.intBitsToFloat((int) (j11 & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}