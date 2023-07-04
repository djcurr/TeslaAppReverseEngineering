package yy;

/* loaded from: classes5.dex */
public final class j<T> {

    /* renamed from: a  reason: collision with root package name */
    final float f59926a;

    /* renamed from: b  reason: collision with root package name */
    int f59927b;

    /* renamed from: c  reason: collision with root package name */
    int f59928c;

    /* renamed from: d  reason: collision with root package name */
    int f59929d;

    /* renamed from: e  reason: collision with root package name */
    T[] f59930e;

    public j() {
        this(16, 0.75f);
    }

    static int c(int i11) {
        int i12 = i11 * (-1640531527);
        return i12 ^ (i12 >>> 16);
    }

    public boolean a(T t11) {
        T t12;
        T[] tArr = this.f59930e;
        int i11 = this.f59927b;
        int c11 = c(t11.hashCode()) & i11;
        T t13 = tArr[c11];
        if (t13 != null) {
            if (t13.equals(t11)) {
                return false;
            }
            do {
                c11 = (c11 + 1) & i11;
                t12 = tArr[c11];
                if (t12 == null) {
                }
            } while (!t12.equals(t11));
            return false;
        }
        tArr[c11] = t11;
        int i12 = this.f59928c + 1;
        this.f59928c = i12;
        if (i12 >= this.f59929d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f59930e;
    }

    void d() {
        T[] tArr = this.f59930e;
        int length = tArr.length;
        int i11 = length << 1;
        int i12 = i11 - 1;
        T[] tArr2 = (T[]) new Object[i11];
        int i13 = this.f59928c;
        while (true) {
            int i14 = i13 - 1;
            if (i13 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int c11 = c(tArr[length].hashCode()) & i12;
                if (tArr2[c11] != null) {
                    do {
                        c11 = (c11 + 1) & i12;
                    } while (tArr2[c11] != null);
                }
                tArr2[c11] = tArr[length];
                i13 = i14;
            } else {
                this.f59927b = i12;
                this.f59929d = (int) (i11 * this.f59926a);
                this.f59930e = tArr2;
                return;
            }
        }
    }

    public boolean e(T t11) {
        T t12;
        T[] tArr = this.f59930e;
        int i11 = this.f59927b;
        int c11 = c(t11.hashCode()) & i11;
        T t13 = tArr[c11];
        if (t13 == null) {
            return false;
        }
        if (t13.equals(t11)) {
            return f(c11, tArr, i11);
        }
        do {
            c11 = (c11 + 1) & i11;
            t12 = tArr[c11];
            if (t12 == null) {
                return false;
            }
        } while (!t12.equals(t11));
        return f(c11, tArr, i11);
    }

    boolean f(int i11, T[] tArr, int i12) {
        int i13;
        T t11;
        this.f59928c--;
        while (true) {
            int i14 = i11 + 1;
            while (true) {
                i13 = i14 & i12;
                t11 = tArr[i13];
                if (t11 == null) {
                    tArr[i11] = null;
                    return true;
                }
                int c11 = c(t11.hashCode()) & i12;
                if (i11 > i13) {
                    if (i11 >= c11 && c11 > i13) {
                        break;
                    }
                    i14 = i13 + 1;
                } else if (i11 < c11 && c11 <= i13) {
                    i14 = i13 + 1;
                }
            }
            tArr[i11] = t11;
            i11 = i13;
        }
    }

    public j(int i11, float f11) {
        this.f59926a = f11;
        int a11 = k.a(i11);
        this.f59927b = a11 - 1;
        this.f59929d = (int) (f11 * a11);
        this.f59930e = (T[]) new Object[a11];
    }
}