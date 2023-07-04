package d1;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.s;
import wz.o;

/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private int[] f23275a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f23276b;

    /* renamed from: c  reason: collision with root package name */
    private IdentityArraySet<T>[] f23277c;

    /* renamed from: d  reason: collision with root package name */
    private int f23278d;

    public d() {
        int[] iArr = new int[50];
        for (int i11 = 0; i11 < 50; i11++) {
            iArr[i11] = i11;
        }
        this.f23275a = iArr;
        this.f23276b = new Object[50];
        this.f23277c = new c[50];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f(Object obj) {
        int a11 = c1.c.a(obj);
        int i11 = this.f23278d - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            Object obj2 = l()[k()[i13]];
            s.e(obj2);
            int a12 = c1.c.a(obj2) - a11;
            if (a12 < 0) {
                i12 = i13 + 1;
            } else if (a12 <= 0) {
                return obj == obj2 ? i13 : g(i13, obj, a11);
            } else {
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    private final int g(int i11, Object obj, int i12) {
        int i13 = i11 - 1;
        if (i13 >= 0) {
            while (true) {
                int i14 = i13 - 1;
                Object obj2 = l()[k()[i13]];
                s.e(obj2);
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
        int i16 = this.f23278d;
        while (i15 < i16) {
            int i17 = i15 + 1;
            Object obj3 = l()[k()[i15]];
            s.e(obj3);
            if (obj3 == obj) {
                return i15;
            }
            if (c1.c.a(obj3) != i12) {
                return -i17;
            }
            i15 = i17;
        }
        return -(this.f23278d + 1);
    }

    private final c<T> h(Object obj) {
        int i11;
        if (this.f23278d > 0) {
            i11 = f(obj);
            if (i11 >= 0) {
                return n(i11);
            }
        } else {
            i11 = -1;
        }
        int i12 = -(i11 + 1);
        int i13 = this.f23278d;
        int[] iArr = this.f23275a;
        if (i13 < iArr.length) {
            int i14 = iArr[i13];
            this.f23276b[i14] = obj;
            c<T> cVar = this.f23277c[i14];
            if (cVar == null) {
                cVar = new c<>();
                i()[i14] = cVar;
            }
            int i15 = this.f23278d;
            if (i12 < i15) {
                int[] iArr2 = this.f23275a;
                o.i(iArr2, iArr2, i12 + 1, i12, i15);
            }
            this.f23275a[i12] = i14;
            this.f23278d++;
            return cVar;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.f23277c, length);
        s.f(copyOf, "copyOf(this, newSize)");
        this.f23277c = (c[]) copyOf;
        IdentityArraySet<T> cVar2 = new c<>();
        this.f23277c[i13] = cVar2;
        Object[] copyOf2 = Arrays.copyOf(this.f23276b, length);
        s.f(copyOf2, "copyOf(this, newSize)");
        this.f23276b = copyOf2;
        copyOf2[i13] = obj;
        int[] iArr3 = new int[length];
        for (int i16 = this.f23278d + 1; i16 < length; i16++) {
            iArr3[i16] = i16;
        }
        int i17 = this.f23278d;
        if (i12 < i17) {
            o.i(this.f23275a, iArr3, i12 + 1, i12, i17);
        }
        iArr3[i12] = i13;
        if (i12 > 0) {
            o.n(this.f23275a, iArr3, 0, 0, i12, 6, null);
        }
        this.f23275a = iArr3;
        this.f23278d++;
        return cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c<T> n(int i11) {
        c<T> cVar = this.f23277c[this.f23275a[i11]];
        s.e(cVar);
        return cVar;
    }

    public final boolean c(Object value, T scope) {
        s.g(value, "value");
        s.g(scope, "scope");
        return h(value).add(scope);
    }

    public final void d() {
        int length = this.f23277c.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            Collection collection = this.f23277c[i11];
            if (collection != null) {
                collection.clear();
            }
            this.f23275a[i11] = i11;
            this.f23276b[i11] = null;
            i11 = i12;
        }
        this.f23278d = 0;
    }

    public final boolean e(Object element) {
        s.g(element, "element");
        return f(element) >= 0;
    }

    public final IdentityArraySet<T>[] i() {
        return this.f23277c;
    }

    public final int j() {
        return this.f23278d;
    }

    public final int[] k() {
        return this.f23275a;
    }

    public final Object[] l() {
        return this.f23276b;
    }

    public final boolean m(Object value, T scope) {
        int i11;
        Collection collection;
        s.g(value, "value");
        s.g(scope, "scope");
        int f11 = f(value);
        if (f11 < 0 || (collection = this.f23277c[(i11 = this.f23275a[f11])]) == null) {
            return false;
        }
        boolean remove = collection.remove(scope);
        if (collection.size() == 0) {
            int i12 = f11 + 1;
            int i13 = this.f23278d;
            if (i12 < i13) {
                int[] iArr = this.f23275a;
                o.i(iArr, iArr, f11, i12, i13);
            }
            int[] iArr2 = this.f23275a;
            int i14 = this.f23278d;
            iArr2[i14 - 1] = i11;
            this.f23276b[i11] = null;
            this.f23278d = i14 - 1;
        }
        return remove;
    }

    public final void o(int i11) {
        this.f23278d = i11;
    }
}