package ak;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private int f509a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f510b;

    public p() {
        this(32);
    }

    public void a(long j11) {
        int i11 = this.f509a;
        long[] jArr = this.f510b;
        if (i11 == jArr.length) {
            this.f510b = Arrays.copyOf(jArr, i11 * 2);
        }
        long[] jArr2 = this.f510b;
        int i12 = this.f509a;
        this.f509a = i12 + 1;
        jArr2[i12] = j11;
    }

    public long b(int i11) {
        if (i11 >= 0 && i11 < this.f509a) {
            return this.f510b[i11];
        }
        int i12 = this.f509a;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Invalid index ");
        sb2.append(i11);
        sb2.append(", size is ");
        sb2.append(i12);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public int c() {
        return this.f509a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f510b, this.f509a);
    }

    public p(int i11) {
        this.f510b = new long[i11];
    }
}