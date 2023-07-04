package yf;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private long[] f59479a;

    /* renamed from: b  reason: collision with root package name */
    private int f59480b = 0;

    private b(int i11) {
        this.f59479a = new long[i11];
    }

    public static b b(int i11) {
        return new b(i11);
    }

    private void e() {
        int i11 = this.f59480b;
        if (i11 == this.f59479a.length) {
            long[] jArr = new long[Math.max(i11 + 1, (int) (i11 * 1.8d))];
            System.arraycopy(this.f59479a, 0, jArr, 0, this.f59480b);
            this.f59479a = jArr;
        }
    }

    public void a(long j11) {
        e();
        long[] jArr = this.f59479a;
        int i11 = this.f59480b;
        this.f59480b = i11 + 1;
        jArr[i11] = j11;
    }

    public void c(int i11) {
        int i12 = this.f59480b;
        if (i11 <= i12) {
            this.f59480b = i12 - i11;
            return;
        }
        throw new IndexOutOfBoundsException("Trying to drop " + i11 + " items from array of length " + this.f59480b);
    }

    public long d(int i11) {
        if (i11 < this.f59480b) {
            return this.f59479a[i11];
        }
        throw new IndexOutOfBoundsException("" + i11 + " >= " + this.f59480b);
    }

    public void f(int i11, long j11) {
        if (i11 < this.f59480b) {
            this.f59479a[i11] = j11;
            return;
        }
        throw new IndexOutOfBoundsException("" + i11 + " >= " + this.f59480b);
    }

    public int g() {
        return this.f59480b;
    }
}