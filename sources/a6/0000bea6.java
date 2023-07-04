package x2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56930b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f56931c = {18, 20, 17, 15};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f56932d = {Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143, 32767, 8191};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f56933e = {32767, 8191, Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143};

    /* renamed from: a  reason: collision with root package name */
    private final long f56934a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(int i11) {
            if (i11 < 8191) {
                return 13;
            }
            if (i11 < 32767) {
                return 15;
            }
            if (i11 < 65535) {
                return 16;
            }
            if (i11 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i11 + " in Constraints");
        }

        public final long b(int i11, int i12, int i13, int i14) {
            long j11;
            int i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
            int a11 = a(i15);
            int i16 = i12 == Integer.MAX_VALUE ? i11 : i12;
            int a12 = a(i16);
            if (a11 + a12 <= 31) {
                if (a12 == 13) {
                    j11 = 3;
                } else if (a12 == 18) {
                    j11 = 1;
                } else if (a12 == 15) {
                    j11 = 2;
                } else if (a12 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                } else {
                    j11 = 0;
                }
                int i17 = i12 == Integer.MAX_VALUE ? 0 : i12 + 1;
                int i18 = i14 != Integer.MAX_VALUE ? i14 + 1 : 0;
                int i19 = b.f56931c[(int) j11];
                return b.c((i17 << 33) | j11 | (i11 << 2) | (i13 << i19) | (i18 << (i19 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i16 + " and height of " + i15 + " in Constraints");
        }

        public final long c(int i11, int i12) {
            if (i11 >= 0 && i12 >= 0) {
                return b(i11, i11, i12, i12);
            }
            throw new IllegalArgumentException(("width(" + i11 + ") and height(" + i12 + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ b(long j11) {
        this.f56934a = j11;
    }

    public static final /* synthetic */ b b(long j11) {
        return new b(j11);
    }

    public static long c(long j11) {
        return j11;
    }

    public static final long d(long j11, int i11, int i12, int i13, int i14) {
        boolean z11 = true;
        if (!(i13 >= 0 && i11 >= 0)) {
            throw new IllegalArgumentException(("minHeight(" + i13 + ") and minWidth(" + i11 + ") must be >= 0").toString());
        }
        if (!(i12 >= i11 || i12 == Integer.MAX_VALUE)) {
            throw new IllegalArgumentException(("maxWidth(" + i12 + ") must be >= minWidth(" + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (i14 < i13 && i14 != Integer.MAX_VALUE) {
            z11 = false;
        }
        if (z11) {
            return f56930b.b(i11, i12, i13, i14);
        }
        throw new IllegalArgumentException(("maxHeight(" + i14 + ") must be >= minHeight(" + i13 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public static /* synthetic */ long e(long j11, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = p(j11);
        }
        int i16 = i11;
        if ((i15 & 2) != 0) {
            i12 = n(j11);
        }
        int i17 = i12;
        if ((i15 & 4) != 0) {
            i13 = o(j11);
        }
        int i18 = i13;
        if ((i15 & 8) != 0) {
            i14 = m(j11);
        }
        return d(j11, i16, i17, i18, i14);
    }

    public static boolean f(long j11, Object obj) {
        return (obj instanceof b) && j11 == ((b) obj).s();
    }

    public static final boolean g(long j11, long j12) {
        return j11 == j12;
    }

    private static final int h(long j11) {
        return (int) (j11 & 3);
    }

    public static final boolean i(long j11) {
        int h11 = h(j11);
        return (((int) (j11 >> (f56931c[h11] + 31))) & f56933e[h11]) != 0;
    }

    public static final boolean j(long j11) {
        return (((int) (j11 >> 33)) & f56932d[h(j11)]) != 0;
    }

    public static final boolean k(long j11) {
        return m(j11) == o(j11);
    }

    public static final boolean l(long j11) {
        return n(j11) == p(j11);
    }

    public static final int m(long j11) {
        int h11 = h(j11);
        int i11 = ((int) (j11 >> (f56931c[h11] + 31))) & f56933e[h11];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int n(long j11) {
        int i11 = ((int) (j11 >> 33)) & f56932d[h(j11)];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int o(long j11) {
        int h11 = h(j11);
        return ((int) (j11 >> f56931c[h11])) & f56933e[h11];
    }

    public static final int p(long j11) {
        return ((int) (j11 >> 2)) & f56932d[h(j11)];
    }

    public static int q(long j11) {
        return Long.hashCode(j11);
    }

    public static String r(long j11) {
        int n11 = n(j11);
        String valueOf = n11 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(n11);
        int m11 = m(j11);
        String valueOf2 = m11 != Integer.MAX_VALUE ? String.valueOf(m11) : "Infinity";
        return "Constraints(minWidth = " + p(j11) + ", maxWidth = " + valueOf + ", minHeight = " + o(j11) + ", maxHeight = " + valueOf2 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return f(this.f56934a, obj);
    }

    public int hashCode() {
        return q(this.f56934a);
    }

    public final /* synthetic */ long s() {
        return this.f56934a;
    }

    public String toString() {
        return r(this.f56934a);
    }
}