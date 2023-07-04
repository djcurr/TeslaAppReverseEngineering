package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class v<E> extends p<E> implements Set<E> {

    /* renamed from: b  reason: collision with root package name */
    private transient r<E> f16158b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i11) {
        int max = Math.max(i11, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        com.google.common.base.u.e(max < 1073741824, "collection too large");
        return 1073741824;
    }

    private static <E> v<E> k(int i11, Object... objArr) {
        if (i11 != 0) {
            if (i11 != 1) {
                int j11 = j(i11);
                Object[] objArr2 = new Object[j11];
                int i12 = j11 - 1;
                int i13 = 0;
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    Object a11 = k0.a(objArr[i15], i15);
                    int hashCode = a11.hashCode();
                    int b11 = o.b(hashCode);
                    while (true) {
                        int i16 = b11 & i12;
                        Object obj = objArr2[i16];
                        if (obj == null) {
                            objArr[i14] = a11;
                            objArr2[i16] = a11;
                            i13 += hashCode;
                            i14++;
                            break;
                        } else if (obj.equals(a11)) {
                            break;
                        } else {
                            b11++;
                        }
                    }
                }
                Arrays.fill(objArr, i14, i11, (Object) null);
                if (i14 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new t0(obj2);
                } else if (j(i14) < j11 / 2) {
                    return k(i14, objArr);
                } else {
                    if (s(i14, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    return new p0(objArr, i13, objArr2, i12, i14);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return q(obj3);
        }
        return p();
    }

    public static <E> v<E> m(Collection<? extends E> collection) {
        if ((collection instanceof v) && !(collection instanceof SortedSet)) {
            v<E> vVar = (v) collection;
            if (!vVar.h()) {
                return vVar;
            }
        }
        Object[] array = collection.toArray();
        return k(array.length, array);
    }

    public static <E> v<E> p() {
        return p0.f16120i;
    }

    public static <E> v<E> q(E e11) {
        return new t0(e11);
    }

    public static <E> v<E> r(E e11, E e12, E e13) {
        return k(3, e11, e12, e13);
    }

    private static boolean s(int i11, int i12) {
        return i11 < (i12 >> 1) + (i12 >> 2);
    }

    @Override // com.google.common.collect.p
    public r<E> b() {
        r<E> rVar = this.f16158b;
        if (rVar == null) {
            r<E> n11 = n();
            this.f16158b = n11;
            return n11;
        }
        return rVar;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v) && o() && ((v) obj).o() && hashCode() != obj.hashCode()) {
            return false;
        }
        return s0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return s0.b(this);
    }

    @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    r<E> n() {
        return r.j(toArray());
    }

    boolean o() {
        return false;
    }
}