package fl;

import com.google.common.base.u;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class d extends e {

    /* loaded from: classes3.dex */
    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final int[] f26674a;

        /* renamed from: b  reason: collision with root package name */
        final int f26675b;

        /* renamed from: c  reason: collision with root package name */
        final int f26676c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b */
        public Integer get(int i11) {
            u.m(i11, size());
            return Integer.valueOf(this.f26674a[this.f26675b + i11]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c */
        public Integer set(int i11, Integer num) {
            u.m(i11, size());
            int[] iArr = this.f26674a;
            int i12 = this.f26675b;
            int i13 = iArr[i12 + i11];
            iArr[i12 + i11] = ((Integer) u.o(num)).intValue();
            return Integer.valueOf(i13);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && d.h(this.f26674a, ((Integer) obj).intValue(), this.f26675b, this.f26676c) != -1;
        }

        int[] d() {
            return Arrays.copyOfRange(this.f26674a, this.f26675b, this.f26676c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                int size = size();
                if (aVar.size() != size) {
                    return false;
                }
                for (int i11 = 0; i11 < size; i11++) {
                    if (this.f26674a[this.f26675b + i11] != aVar.f26674a[aVar.f26675b + i11]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i11 = 1;
            for (int i12 = this.f26675b; i12 < this.f26676c; i12++) {
                i11 = (i11 * 31) + d.g(this.f26674a[i12]);
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int h11;
            if (!(obj instanceof Integer) || (h11 = d.h(this.f26674a, ((Integer) obj).intValue(), this.f26675b, this.f26676c)) < 0) {
                return -1;
            }
            return h11 - this.f26675b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int i11;
            if (!(obj instanceof Integer) || (i11 = d.i(this.f26674a, ((Integer) obj).intValue(), this.f26675b, this.f26676c)) < 0) {
                return -1;
            }
            return i11 - this.f26675b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26676c - this.f26675b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i11, int i12) {
            u.t(i11, i12, size());
            if (i11 == i12) {
                return Collections.emptyList();
            }
            int[] iArr = this.f26674a;
            int i13 = this.f26675b;
            return new a(iArr, i11 + i13, i13 + i12);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f26674a[this.f26675b]);
            int i11 = this.f26675b;
            while (true) {
                i11++;
                if (i11 < this.f26676c) {
                    sb2.append(", ");
                    sb2.append(this.f26674a[i11]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        a(int[] iArr, int i11, int i12) {
            this.f26674a = iArr;
            this.f26675b = i11;
            this.f26676c = i12;
        }
    }

    public static List<Integer> c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int d(long j11) {
        int i11 = (int) j11;
        u.j(((long) i11) == j11, "Out of range: %s", j11);
        return i11;
    }

    public static int e(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 > i12 ? 1 : 0;
    }

    public static int f(int i11, int i12, int i13) {
        u.i(i12 <= i13, "min (%s) must be less than or equal to max (%s)", i12, i13);
        return Math.min(Math.max(i11, i12), i13);
    }

    public static int g(int i11) {
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int[] iArr, int i11, int i12, int i13) {
        while (i12 < i13) {
            if (iArr[i12] == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int[] iArr, int i11, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            if (iArr[i14] == i11) {
                return i14;
            }
        }
        return -1;
    }

    public static int j(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    public static int[] k(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = ((Number) u.o(array[i11])).intValue();
        }
        return iArr;
    }
}