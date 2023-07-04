package d1;

import kotlin.jvm.internal.s;
import wz.l;
import wz.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f23265a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f23266b = new Object[4];

    /* renamed from: c  reason: collision with root package name */
    private int[] f23267c = new int[4];

    private final int b(Object obj) {
        int i11 = this.f23265a - 1;
        int a11 = c1.c.a(obj);
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            Object obj2 = this.f23266b[i13];
            int a12 = c1.c.a(obj2) - a11;
            if (a12 < 0) {
                i12 = i13 + 1;
            } else if (a12 <= 0) {
                return obj2 == obj ? i13 : c(i13, obj, a11);
            } else {
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private final int c(int i11, Object obj, int i12) {
        int i13 = i11 - 1;
        if (i13 >= 0) {
            while (true) {
                int i14 = i13 - 1;
                Object obj2 = this.f23266b[i13];
                if (obj2 != obj) {
                    if (c1.c.a(obj2) != i12 || i14 < 0) {
                        break;
                    }
                    i13 = i14;
                } else {
                    return i13;
                }
            }
        }
        int i15 = i11 + 1;
        int i16 = this.f23265a;
        while (i15 < i16) {
            int i17 = i15 + 1;
            Object obj3 = this.f23266b[i15];
            if (obj3 == obj) {
                return i15;
            }
            if (c1.c.a(obj3) != i12) {
                return -i17;
            }
            i15 = i17;
        }
        return -(this.f23265a + 1);
    }

    public final void a(Object key, int i11) {
        int i12;
        s.g(key, "key");
        if (this.f23265a > 0) {
            i12 = b(key);
            if (i12 >= 0) {
                this.f23267c[i12] = i11;
                return;
            }
        } else {
            i12 = -1;
        }
        int i13 = -(i12 + 1);
        int i14 = this.f23265a;
        Object[] objArr = this.f23266b;
        if (i14 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr = new int[objArr.length * 2];
            int i15 = i13 + 1;
            l.k(objArr, objArr2, i15, i13, i14);
            o.i(this.f23267c, iArr, i15, i13, this.f23265a);
            o.o(this.f23266b, objArr2, 0, 0, i13, 6, null);
            o.n(this.f23267c, iArr, 0, 0, i13, 6, null);
            this.f23266b = objArr2;
            this.f23267c = iArr;
        } else {
            int i16 = i13 + 1;
            l.k(objArr, objArr, i16, i13, i14);
            int[] iArr2 = this.f23267c;
            o.i(iArr2, iArr2, i16, i13, this.f23265a);
        }
        this.f23266b[i13] = key;
        this.f23267c[i13] = i11;
        this.f23265a++;
    }

    public final Object[] d() {
        return this.f23266b;
    }

    public final int e() {
        return this.f23265a;
    }

    public final int[] f() {
        return this.f23267c;
    }

    public final void g(int i11) {
        this.f23265a = i11;
    }
}