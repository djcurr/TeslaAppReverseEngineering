package d1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.l;
import wz.o;

/* loaded from: classes.dex */
public final class b<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f23268a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f23269b;

    /* renamed from: c  reason: collision with root package name */
    private int f23270c;

    public b(int i11) {
        this.f23268a = new Object[i11];
        this.f23269b = new Object[i11];
    }

    private final int b(Object obj) {
        int a11 = c1.c.a(obj);
        int i11 = this.f23270c - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            Object obj2 = this.f23268a[i13];
            int a12 = c1.c.a(obj2) - a11;
            if (a12 < 0) {
                i12 = i13 + 1;
            } else if (a12 <= 0) {
                return obj == obj2 ? i13 : c(i13, obj, a11);
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
                Object obj2 = this.f23268a[i13];
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
        int i16 = this.f23270c;
        while (i15 < i16) {
            int i17 = i15 + 1;
            Object obj3 = this.f23268a[i15];
            if (obj3 == obj) {
                return i15;
            }
            if (c1.c.a(obj3) != i12) {
                return -i17;
            }
            i15 = i17;
        }
        return -(this.f23270c + 1);
    }

    public final boolean a(Key key) {
        s.g(key, "key");
        return b(key) >= 0;
    }

    public final Value d(Key key) {
        s.g(key, "key");
        int b11 = b(key);
        if (b11 >= 0) {
            return (Value) this.f23269b[b11];
        }
        return null;
    }

    public final Object[] e() {
        return this.f23268a;
    }

    public final int f() {
        return this.f23270c;
    }

    public final Object[] g() {
        return this.f23269b;
    }

    public final boolean h() {
        return this.f23270c > 0;
    }

    public final boolean i(Key key) {
        s.g(key, "key");
        int b11 = b(key);
        if (b11 >= 0) {
            int i11 = this.f23270c;
            Object[] objArr = this.f23268a;
            Object[] objArr2 = this.f23269b;
            int i12 = b11 + 1;
            l.k(objArr, objArr, b11, i12, i11);
            l.k(objArr2, objArr2, b11, i12, i11);
            int i13 = i11 - 1;
            objArr[i13] = null;
            objArr2[i13] = null;
            this.f23270c = i13;
            return true;
        }
        return false;
    }

    public final void j(Key key, Value value) {
        Object[] objArr;
        s.g(key, "key");
        int b11 = b(key);
        if (b11 >= 0) {
            this.f23269b[b11] = value;
            return;
        }
        int i11 = -(b11 + 1);
        int i12 = this.f23270c;
        Object[] objArr2 = this.f23268a;
        boolean z11 = i12 == objArr2.length;
        Object[] objArr3 = z11 ? new Object[i12 * 2] : objArr2;
        int i13 = i11 + 1;
        l.k(objArr2, objArr3, i13, i11, i12);
        if (z11) {
            o.o(this.f23268a, objArr3, 0, 0, i11, 6, null);
        }
        objArr3[i11] = key;
        this.f23268a = objArr3;
        if (z11) {
            objArr = new Object[this.f23270c * 2];
        } else {
            objArr = this.f23269b;
        }
        l.k(this.f23269b, objArr, i13, i11, this.f23270c);
        if (z11) {
            o.o(this.f23269b, objArr, 0, 0, i11, 6, null);
        }
        objArr[i11] = value;
        this.f23269b = objArr;
        this.f23270c++;
    }

    public /* synthetic */ b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 16 : i11);
    }
}