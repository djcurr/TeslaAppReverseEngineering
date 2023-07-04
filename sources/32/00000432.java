package androidx.collection;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2752e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f2753a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f2754b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f2755c;

    /* renamed from: d  reason: collision with root package name */
    private int f2756d;

    public h() {
        this(10);
    }

    private void f() {
        int i11 = this.f2756d;
        int[] iArr = this.f2754b;
        Object[] objArr = this.f2755c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f2752e) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        this.f2753a = false;
        this.f2756d = i12;
    }

    public void a(int i11, E e11) {
        int i12 = this.f2756d;
        if (i12 != 0 && i11 <= this.f2754b[i12 - 1]) {
            l(i11, e11);
            return;
        }
        if (this.f2753a && i12 >= this.f2754b.length) {
            f();
        }
        int i13 = this.f2756d;
        if (i13 >= this.f2754b.length) {
            int e12 = c.e(i13 + 1);
            int[] iArr = new int[e12];
            Object[] objArr = new Object[e12];
            int[] iArr2 = this.f2754b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2755c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2754b = iArr;
            this.f2755c = objArr;
        }
        this.f2754b[i13] = i11;
        this.f2755c[i13] = e11;
        this.f2756d = i13 + 1;
    }

    public void b() {
        int i11 = this.f2756d;
        Object[] objArr = this.f2755c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f2756d = 0;
        this.f2753a = false;
    }

    /* renamed from: c */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f2754b = (int[]) this.f2754b.clone();
            hVar.f2755c = (Object[]) this.f2755c.clone();
            return hVar;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean d(int i11) {
        return i(i11) >= 0;
    }

    public boolean e(E e11) {
        return j(e11) >= 0;
    }

    public E g(int i11) {
        return h(i11, null);
    }

    public E h(int i11, E e11) {
        int a11 = c.a(this.f2754b, this.f2756d, i11);
        if (a11 >= 0) {
            Object[] objArr = this.f2755c;
            if (objArr[a11] != f2752e) {
                return (E) objArr[a11];
            }
        }
        return e11;
    }

    public int i(int i11) {
        if (this.f2753a) {
            f();
        }
        return c.a(this.f2754b, this.f2756d, i11);
    }

    public int j(E e11) {
        if (this.f2753a) {
            f();
        }
        for (int i11 = 0; i11 < this.f2756d; i11++) {
            if (this.f2755c[i11] == e11) {
                return i11;
            }
        }
        return -1;
    }

    public int k(int i11) {
        if (this.f2753a) {
            f();
        }
        return this.f2754b[i11];
    }

    public void l(int i11, E e11) {
        int a11 = c.a(this.f2754b, this.f2756d, i11);
        if (a11 >= 0) {
            this.f2755c[a11] = e11;
            return;
        }
        int i12 = ~a11;
        int i13 = this.f2756d;
        if (i12 < i13) {
            Object[] objArr = this.f2755c;
            if (objArr[i12] == f2752e) {
                this.f2754b[i12] = i11;
                objArr[i12] = e11;
                return;
            }
        }
        if (this.f2753a && i13 >= this.f2754b.length) {
            f();
            i12 = ~c.a(this.f2754b, this.f2756d, i11);
        }
        int i14 = this.f2756d;
        if (i14 >= this.f2754b.length) {
            int e12 = c.e(i14 + 1);
            int[] iArr = new int[e12];
            Object[] objArr2 = new Object[e12];
            int[] iArr2 = this.f2754b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2755c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2754b = iArr;
            this.f2755c = objArr2;
        }
        int i15 = this.f2756d;
        if (i15 - i12 != 0) {
            int[] iArr3 = this.f2754b;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr4 = this.f2755c;
            System.arraycopy(objArr4, i12, objArr4, i16, this.f2756d - i12);
        }
        this.f2754b[i12] = i11;
        this.f2755c[i12] = e11;
        this.f2756d++;
    }

    public void m(int i11) {
        int a11 = c.a(this.f2754b, this.f2756d, i11);
        if (a11 >= 0) {
            Object[] objArr = this.f2755c;
            Object obj = objArr[a11];
            Object obj2 = f2752e;
            if (obj != obj2) {
                objArr[a11] = obj2;
                this.f2753a = true;
            }
        }
    }

    public void n(int i11) {
        Object[] objArr = this.f2755c;
        Object obj = objArr[i11];
        Object obj2 = f2752e;
        if (obj != obj2) {
            objArr[i11] = obj2;
            this.f2753a = true;
        }
    }

    public E o(int i11, E e11) {
        int i12 = i(i11);
        if (i12 >= 0) {
            Object[] objArr = this.f2755c;
            E e12 = (E) objArr[i12];
            objArr[i12] = e11;
            return e12;
        }
        return null;
    }

    public int p() {
        if (this.f2753a) {
            f();
        }
        return this.f2756d;
    }

    public E q(int i11) {
        if (this.f2753a) {
            f();
        }
        return (E) this.f2755c[i11];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2756d * 28);
        sb2.append(CoreConstants.CURLY_LEFT);
        for (int i11 = 0; i11 < this.f2756d; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(k(i11));
            sb2.append('=');
            E q11 = q(i11);
            if (q11 != this) {
                sb2.append(q11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public h(int i11) {
        this.f2753a = false;
        if (i11 == 0) {
            this.f2754b = c.f2722a;
            this.f2755c = c.f2724c;
            return;
        }
        int e11 = c.e(i11);
        this.f2754b = new int[e11];
        this.f2755c = new Object[e11];
    }
}