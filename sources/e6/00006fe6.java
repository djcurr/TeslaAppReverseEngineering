package g30;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class v {
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    private static final long[] f27649e;

    /* renamed from: a  reason: collision with root package name */
    private final e30.f f27650a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.p<e30.f, Integer, Boolean> f27651b;

    /* renamed from: c  reason: collision with root package name */
    private long f27652c;

    /* renamed from: d  reason: collision with root package name */
    private final long[] f27653d;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f27649e = new long[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(e30.f descriptor, h00.p<? super e30.f, ? super Integer, Boolean> readIfAbsent) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        kotlin.jvm.internal.s.g(readIfAbsent, "readIfAbsent");
        this.f27650a = descriptor;
        this.f27651b = readIfAbsent;
        int d11 = descriptor.d();
        if (d11 <= 64) {
            this.f27652c = d11 != 64 ? (-1) << d11 : 0L;
            this.f27653d = f27649e;
            return;
        }
        this.f27652c = 0L;
        this.f27653d = e(d11);
    }

    private final void b(int i11) {
        int i12 = (i11 >>> 6) - 1;
        long[] jArr = this.f27653d;
        jArr[i12] = jArr[i12] | (1 << (i11 & 63));
    }

    private final int c() {
        int length = this.f27653d.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            int i13 = i12 * 64;
            long j11 = this.f27653d[i11];
            while (j11 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
                j11 |= 1 << numberOfTrailingZeros;
                int i14 = numberOfTrailingZeros + i13;
                if (this.f27651b.invoke(this.f27650a, Integer.valueOf(i14)).booleanValue()) {
                    this.f27653d[i11] = j11;
                    return i14;
                }
            }
            this.f27653d[i11] = j11;
            i11 = i12;
        }
        return -1;
    }

    private final long[] e(int i11) {
        int K;
        long[] jArr = new long[(i11 - 1) >>> 6];
        if ((i11 & 63) != 0) {
            K = wz.p.K(jArr);
            jArr[K] = (-1) << i11;
        }
        return jArr;
    }

    public final void a(int i11) {
        if (i11 < 64) {
            this.f27652c |= 1 << i11;
        } else {
            b(i11);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int d11 = this.f27650a.d();
        do {
            long j11 = this.f27652c;
            if (j11 == -1) {
                if (d11 > 64) {
                    return c();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
            this.f27652c |= 1 << numberOfTrailingZeros;
        } while (!this.f27651b.invoke(this.f27650a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }
}