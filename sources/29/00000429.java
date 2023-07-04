package androidx.collection;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2725e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f2726a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f2727b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f2728c;

    /* renamed from: d  reason: collision with root package name */
    private int f2729d;

    public d() {
        this(10);
    }

    private void e() {
        int i11 = this.f2729d;
        long[] jArr = this.f2727b;
        Object[] objArr = this.f2728c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f2725e) {
                if (i13 != i12) {
                    jArr[i12] = jArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        this.f2726a = false;
        this.f2729d = i12;
    }

    public void a(long j11, E e11) {
        int i11 = this.f2729d;
        if (i11 != 0 && j11 <= this.f2727b[i11 - 1]) {
            j(j11, e11);
            return;
        }
        if (this.f2726a && i11 >= this.f2727b.length) {
            e();
        }
        int i12 = this.f2729d;
        if (i12 >= this.f2727b.length) {
            int f11 = c.f(i12 + 1);
            long[] jArr = new long[f11];
            Object[] objArr = new Object[f11];
            long[] jArr2 = this.f2727b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2728c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2727b = jArr;
            this.f2728c = objArr;
        }
        this.f2727b[i12] = j11;
        this.f2728c[i12] = e11;
        this.f2729d = i12 + 1;
    }

    public void b() {
        int i11 = this.f2729d;
        Object[] objArr = this.f2728c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f2729d = 0;
        this.f2726a = false;
    }

    /* renamed from: c */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f2727b = (long[]) this.f2727b.clone();
            dVar.f2728c = (Object[]) this.f2728c.clone();
            return dVar;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean d(long j11) {
        return h(j11) >= 0;
    }

    public E f(long j11) {
        return g(j11, null);
    }

    public E g(long j11, E e11) {
        int b11 = c.b(this.f2727b, this.f2729d, j11);
        if (b11 >= 0) {
            Object[] objArr = this.f2728c;
            if (objArr[b11] != f2725e) {
                return (E) objArr[b11];
            }
        }
        return e11;
    }

    public int h(long j11) {
        if (this.f2726a) {
            e();
        }
        return c.b(this.f2727b, this.f2729d, j11);
    }

    public long i(int i11) {
        if (this.f2726a) {
            e();
        }
        return this.f2727b[i11];
    }

    public void j(long j11, E e11) {
        int b11 = c.b(this.f2727b, this.f2729d, j11);
        if (b11 >= 0) {
            this.f2728c[b11] = e11;
            return;
        }
        int i11 = ~b11;
        int i12 = this.f2729d;
        if (i11 < i12) {
            Object[] objArr = this.f2728c;
            if (objArr[i11] == f2725e) {
                this.f2727b[i11] = j11;
                objArr[i11] = e11;
                return;
            }
        }
        if (this.f2726a && i12 >= this.f2727b.length) {
            e();
            i11 = ~c.b(this.f2727b, this.f2729d, j11);
        }
        int i13 = this.f2729d;
        if (i13 >= this.f2727b.length) {
            int f11 = c.f(i13 + 1);
            long[] jArr = new long[f11];
            Object[] objArr2 = new Object[f11];
            long[] jArr2 = this.f2727b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2728c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2727b = jArr;
            this.f2728c = objArr2;
        }
        int i14 = this.f2729d;
        if (i14 - i11 != 0) {
            long[] jArr3 = this.f2727b;
            int i15 = i11 + 1;
            System.arraycopy(jArr3, i11, jArr3, i15, i14 - i11);
            Object[] objArr4 = this.f2728c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f2729d - i11);
        }
        this.f2727b[i11] = j11;
        this.f2728c[i11] = e11;
        this.f2729d++;
    }

    public void k(long j11) {
        int b11 = c.b(this.f2727b, this.f2729d, j11);
        if (b11 >= 0) {
            Object[] objArr = this.f2728c;
            Object obj = objArr[b11];
            Object obj2 = f2725e;
            if (obj != obj2) {
                objArr[b11] = obj2;
                this.f2726a = true;
            }
        }
    }

    public void l(int i11) {
        Object[] objArr = this.f2728c;
        Object obj = objArr[i11];
        Object obj2 = f2725e;
        if (obj != obj2) {
            objArr[i11] = obj2;
            this.f2726a = true;
        }
    }

    public int m() {
        if (this.f2726a) {
            e();
        }
        return this.f2729d;
    }

    public E n(int i11) {
        if (this.f2726a) {
            e();
        }
        return (E) this.f2728c[i11];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2729d * 28);
        sb2.append(CoreConstants.CURLY_LEFT);
        for (int i11 = 0; i11 < this.f2729d; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i11));
            sb2.append('=');
            E n11 = n(i11);
            if (n11 != this) {
                sb2.append(n11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public d(int i11) {
        this.f2726a = false;
        if (i11 == 0) {
            this.f2727b = c.f2723b;
            this.f2728c = c.f2724c;
            return;
        }
        int f11 = c.f(i11);
        this.f2727b = new long[f11];
        this.f2728c = new Object[f11];
    }
}