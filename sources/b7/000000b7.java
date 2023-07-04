package ak;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f0<V> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f460a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f461b;

    /* renamed from: c  reason: collision with root package name */
    private int f462c;

    /* renamed from: d  reason: collision with root package name */
    private int f463d;

    public f0() {
        this(10);
    }

    private void b(long j11, V v11) {
        int i11 = this.f462c;
        int i12 = this.f463d;
        V[] vArr = this.f461b;
        int length = (i11 + i12) % vArr.length;
        this.f460a[length] = j11;
        vArr[length] = v11;
        this.f463d = i12 + 1;
    }

    private void d(long j11) {
        int i11 = this.f463d;
        if (i11 > 0) {
            if (j11 <= this.f460a[((this.f462c + i11) - 1) % this.f461b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f461b.length;
        if (this.f463d < length) {
            return;
        }
        int i11 = length * 2;
        long[] jArr = new long[i11];
        V[] vArr = (V[]) f(i11);
        int i12 = this.f462c;
        int i13 = length - i12;
        System.arraycopy(this.f460a, i12, jArr, 0, i13);
        System.arraycopy(this.f461b, this.f462c, vArr, 0, i13);
        int i14 = this.f462c;
        if (i14 > 0) {
            System.arraycopy(this.f460a, 0, jArr, i13, i14);
            System.arraycopy(this.f461b, 0, vArr, i13, this.f462c);
        }
        this.f460a = jArr;
        this.f461b = vArr;
        this.f462c = 0;
    }

    private static <V> V[] f(int i11) {
        return (V[]) new Object[i11];
    }

    private V g(long j11, boolean z11) {
        V v11 = null;
        long j12 = Long.MAX_VALUE;
        while (this.f463d > 0) {
            long j13 = j11 - this.f460a[this.f462c];
            if (j13 < 0 && (z11 || (-j13) >= j12)) {
                break;
            }
            v11 = j();
            j12 = j13;
        }
        return v11;
    }

    private V j() {
        a.f(this.f463d > 0);
        V[] vArr = this.f461b;
        int i11 = this.f462c;
        V v11 = vArr[i11];
        vArr[i11] = null;
        this.f462c = (i11 + 1) % vArr.length;
        this.f463d--;
        return v11;
    }

    public synchronized void a(long j11, V v11) {
        d(j11);
        e();
        b(j11, v11);
    }

    public synchronized void c() {
        this.f462c = 0;
        this.f463d = 0;
        Arrays.fill(this.f461b, (Object) null);
    }

    public synchronized V h() {
        return this.f463d == 0 ? null : j();
    }

    public synchronized V i(long j11) {
        return g(j11, true);
    }

    public synchronized int k() {
        return this.f463d;
    }

    public f0(int i11) {
        this.f460a = new long[i11];
        this.f461b = (V[]) f(i11);
    }
}