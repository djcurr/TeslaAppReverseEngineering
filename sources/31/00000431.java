package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: d  reason: collision with root package name */
    static Object[] f2745d;

    /* renamed from: e  reason: collision with root package name */
    static int f2746e;

    /* renamed from: f  reason: collision with root package name */
    static Object[] f2747f;

    /* renamed from: g  reason: collision with root package name */
    static int f2748g;

    /* renamed from: a  reason: collision with root package name */
    int[] f2749a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f2750b;

    /* renamed from: c  reason: collision with root package name */
    int f2751c;

    public g() {
        this.f2749a = c.f2722a;
        this.f2750b = c.f2724c;
        this.f2751c = 0;
    }

    private void a(int i11) {
        if (i11 == 8) {
            synchronized (g.class) {
                Object[] objArr = f2747f;
                if (objArr != null) {
                    this.f2750b = objArr;
                    f2747f = (Object[]) objArr[0];
                    this.f2749a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2748g--;
                    return;
                }
            }
        } else if (i11 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f2745d;
                if (objArr2 != null) {
                    this.f2750b = objArr2;
                    f2745d = (Object[]) objArr2[0];
                    this.f2749a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2746e--;
                    return;
                }
            }
        }
        this.f2749a = new int[i11];
        this.f2750b = new Object[i11 << 1];
    }

    private static int b(int[] iArr, int i11, int i12) {
        try {
            return c.a(iArr, i11, i12);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void e(int[] iArr, Object[] objArr, int i11) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f2748g < 10) {
                    objArr[0] = f2747f;
                    objArr[1] = iArr;
                    for (int i12 = (i11 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f2747f = objArr;
                    f2748g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f2746e < 10) {
                    objArr[0] = f2745d;
                    objArr[1] = iArr;
                    for (int i13 = (i11 << 1) - 1; i13 >= 2; i13--) {
                        objArr[i13] = null;
                    }
                    f2745d = objArr;
                    f2746e++;
                }
            }
        }
    }

    public void c(int i11) {
        int i12 = this.f2751c;
        int[] iArr = this.f2749a;
        if (iArr.length < i11) {
            Object[] objArr = this.f2750b;
            a(i11);
            if (this.f2751c > 0) {
                System.arraycopy(iArr, 0, this.f2749a, 0, i12);
                System.arraycopy(objArr, 0, this.f2750b, 0, i12 << 1);
            }
            e(iArr, objArr, i12);
        }
        if (this.f2751c != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i11 = this.f2751c;
        if (i11 > 0) {
            int[] iArr = this.f2749a;
            Object[] objArr = this.f2750b;
            this.f2749a = c.f2722a;
            this.f2750b = c.f2724c;
            this.f2751c = 0;
            e(iArr, objArr, i11);
        }
        if (this.f2751c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f2751c; i11++) {
                try {
                    K k11 = k(i11);
                    V o11 = o(i11);
                    Object obj2 = gVar.get(k11);
                    if (o11 == null) {
                        if (obj2 != null || !gVar.containsKey(k11)) {
                            return false;
                        }
                    } else if (!o11.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i12 = 0; i12 < this.f2751c; i12++) {
                try {
                    K k12 = k(i12);
                    V o12 = o(i12);
                    Object obj3 = map.get(k12);
                    if (o12 == null) {
                        if (obj3 != null || !map.containsKey(k12)) {
                            return false;
                        }
                    } else if (!o12.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    int f(Object obj, int i11) {
        int i12 = this.f2751c;
        if (i12 == 0) {
            return -1;
        }
        int b11 = b(this.f2749a, i12, i11);
        if (b11 >= 0 && !obj.equals(this.f2750b[b11 << 1])) {
            int i13 = b11 + 1;
            while (i13 < i12 && this.f2749a[i13] == i11) {
                if (obj.equals(this.f2750b[i13 << 1])) {
                    return i13;
                }
                i13++;
            }
            for (int i14 = b11 - 1; i14 >= 0 && this.f2749a[i14] == i11; i14--) {
                if (obj.equals(this.f2750b[i14 << 1])) {
                    return i14;
                }
            }
            return ~i13;
        }
        return b11;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v11) {
        int h11 = h(obj);
        return h11 >= 0 ? (V) this.f2750b[(h11 << 1) + 1] : v11;
    }

    public int h(Object obj) {
        return obj == null ? i() : f(obj, obj.hashCode());
    }

    public int hashCode() {
        int[] iArr = this.f2749a;
        Object[] objArr = this.f2750b;
        int i11 = this.f2751c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            i14 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return i14;
    }

    int i() {
        int i11 = this.f2751c;
        if (i11 == 0) {
            return -1;
        }
        int b11 = b(this.f2749a, i11, 0);
        if (b11 >= 0 && this.f2750b[b11 << 1] != null) {
            int i12 = b11 + 1;
            while (i12 < i11 && this.f2749a[i12] == 0) {
                if (this.f2750b[i12 << 1] == null) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = b11 - 1; i13 >= 0 && this.f2749a[i13] == 0; i13--) {
                if (this.f2750b[i13 << 1] == null) {
                    return i13;
                }
            }
            return ~i12;
        }
        return b11;
    }

    public boolean isEmpty() {
        return this.f2751c <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Object obj) {
        int i11 = this.f2751c * 2;
        Object[] objArr = this.f2750b;
        if (obj == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (obj.equals(objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public K k(int i11) {
        return (K) this.f2750b[i11 << 1];
    }

    public void l(g<? extends K, ? extends V> gVar) {
        int i11 = gVar.f2751c;
        c(this.f2751c + i11);
        if (this.f2751c != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                put(gVar.k(i12), gVar.o(i12));
            }
        } else if (i11 > 0) {
            System.arraycopy(gVar.f2749a, 0, this.f2749a, 0, i11);
            System.arraycopy(gVar.f2750b, 0, this.f2750b, 0, i11 << 1);
            this.f2751c = i11;
        }
    }

    public V m(int i11) {
        Object[] objArr = this.f2750b;
        int i12 = i11 << 1;
        V v11 = (V) objArr[i12 + 1];
        int i13 = this.f2751c;
        int i14 = 0;
        if (i13 <= 1) {
            e(this.f2749a, objArr, i13);
            this.f2749a = c.f2722a;
            this.f2750b = c.f2724c;
        } else {
            int i15 = i13 - 1;
            int[] iArr = this.f2749a;
            if (iArr.length > 8 && i13 < iArr.length / 3) {
                a(i13 > 8 ? i13 + (i13 >> 1) : 8);
                if (i13 != this.f2751c) {
                    throw new ConcurrentModificationException();
                }
                if (i11 > 0) {
                    System.arraycopy(iArr, 0, this.f2749a, 0, i11);
                    System.arraycopy(objArr, 0, this.f2750b, 0, i12);
                }
                if (i11 < i15) {
                    int i16 = i11 + 1;
                    int i17 = i15 - i11;
                    System.arraycopy(iArr, i16, this.f2749a, i11, i17);
                    System.arraycopy(objArr, i16 << 1, this.f2750b, i12, i17 << 1);
                }
            } else {
                if (i11 < i15) {
                    int i18 = i11 + 1;
                    int i19 = i15 - i11;
                    System.arraycopy(iArr, i18, iArr, i11, i19);
                    Object[] objArr2 = this.f2750b;
                    System.arraycopy(objArr2, i18 << 1, objArr2, i12, i19 << 1);
                }
                Object[] objArr3 = this.f2750b;
                int i21 = i15 << 1;
                objArr3[i21] = null;
                objArr3[i21 + 1] = null;
            }
            i14 = i15;
        }
        if (i13 == this.f2751c) {
            this.f2751c = i14;
            return v11;
        }
        throw new ConcurrentModificationException();
    }

    public V n(int i11, V v11) {
        int i12 = (i11 << 1) + 1;
        Object[] objArr = this.f2750b;
        V v12 = (V) objArr[i12];
        objArr[i12] = v11;
        return v12;
    }

    public V o(int i11) {
        return (V) this.f2750b[(i11 << 1) + 1];
    }

    public V put(K k11, V v11) {
        int i11;
        int f11;
        int i12 = this.f2751c;
        if (k11 == null) {
            f11 = i();
            i11 = 0;
        } else {
            int hashCode = k11.hashCode();
            i11 = hashCode;
            f11 = f(k11, hashCode);
        }
        if (f11 >= 0) {
            int i13 = (f11 << 1) + 1;
            Object[] objArr = this.f2750b;
            V v12 = (V) objArr[i13];
            objArr[i13] = v11;
            return v12;
        }
        int i14 = ~f11;
        int[] iArr = this.f2749a;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr2 = this.f2750b;
            a(i15);
            if (i12 == this.f2751c) {
                int[] iArr2 = this.f2749a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f2750b, 0, objArr2.length);
                }
                e(iArr, objArr2, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f2749a;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr3 = this.f2750b;
            System.arraycopy(objArr3, i14 << 1, objArr3, i16 << 1, (this.f2751c - i14) << 1);
        }
        int i17 = this.f2751c;
        if (i12 == i17) {
            int[] iArr4 = this.f2749a;
            if (i14 < iArr4.length) {
                iArr4[i14] = i11;
                Object[] objArr4 = this.f2750b;
                int i18 = i14 << 1;
                objArr4[i18] = k11;
                objArr4[i18 + 1] = v11;
                this.f2751c = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k11, V v11) {
        V v12 = get(k11);
        return v12 == null ? put(k11, v11) : v12;
    }

    public V remove(Object obj) {
        int h11 = h(obj);
        if (h11 >= 0) {
            return m(h11);
        }
        return null;
    }

    public V replace(K k11, V v11) {
        int h11 = h(k11);
        if (h11 >= 0) {
            return n(h11, v11);
        }
        return null;
    }

    public int size() {
        return this.f2751c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2751c * 28);
        sb2.append(CoreConstants.CURLY_LEFT);
        for (int i11 = 0; i11 < this.f2751c; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K k11 = k(i11);
            if (k11 != this) {
                sb2.append(k11);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V o11 = o(i11);
            if (o11 != this) {
                sb2.append(o11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int h11 = h(obj);
        if (h11 >= 0) {
            V o11 = o(h11);
            if (obj2 == o11 || (obj2 != null && obj2.equals(o11))) {
                m(h11);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k11, V v11, V v12) {
        int h11 = h(k11);
        if (h11 >= 0) {
            V o11 = o(h11);
            if (o11 == v11 || (v11 != null && v11.equals(o11))) {
                n(h11, v12);
                return true;
            }
            return false;
        }
        return false;
    }

    public g(int i11) {
        if (i11 == 0) {
            this.f2749a = c.f2722a;
            this.f2750b = c.f2724c;
        } else {
            a(i11);
        }
        this.f2751c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            l(gVar);
        }
    }
}