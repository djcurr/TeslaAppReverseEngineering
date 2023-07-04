package net.time4j.format.expert;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.h0;

/* loaded from: classes5.dex */
public class v extends t<v> {

    /* renamed from: k */
    private static final Set<net.time4j.engine.p<?>> f41229k;

    /* renamed from: a */
    private Object[] f41230a;

    /* renamed from: b */
    private Object[] f41231b;

    /* renamed from: c */
    private Map<net.time4j.engine.p<?>, Object> f41232c;

    /* renamed from: d */
    private int[] f41233d;

    /* renamed from: e */
    private int f41234e;

    /* renamed from: f */
    private int f41235f;

    /* renamed from: g */
    private int f41236g;

    /* renamed from: h */
    private int f41237h;

    /* renamed from: i */
    private boolean f41238i = false;

    /* renamed from: j */
    private int f41239j = -1;

    /* loaded from: classes5.dex */
    private class b implements Iterator<net.time4j.engine.p<?>> {

        /* renamed from: a */
        int f41240a;

        /* renamed from: b */
        int f41241b;

        private b() {
            v.this = r2;
            this.f41240a = r2.f41234e;
            this.f41241b = r2.f41237h;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public net.time4j.engine.p<?> next() {
            int i11;
            if (this.f41241b > 0) {
                Object[] objArr = v.this.f41230a;
                do {
                    i11 = this.f41240a - 1;
                    this.f41240a = i11;
                    if (i11 >= 0) {
                    }
                } while (objArr[i11] == null);
                this.f41241b--;
                return (net.time4j.engine.p) net.time4j.engine.p.class.cast(objArr[i11]);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41241b > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    /* loaded from: classes5.dex */
    private class c extends AbstractSet<net.time4j.engine.p<?>> {
        private c() {
            v.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<net.time4j.engine.p<?>> iterator() {
            return new b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return v.this.f41237h;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(net.time4j.g0.f41294p);
        hashSet.add(net.time4j.g0.f41298x);
        hashSet.add(net.time4j.g0.f41299y);
        hashSet.add(h0.f41335y);
        hashSet.add(h0.A);
        hashSet.add(h0.C);
        hashSet.add(h0.H);
        f41229k = Collections.unmodifiableSet(hashSet);
    }

    public v(int i11, boolean z11) {
        if (z11) {
            this.f41234e = Integer.MIN_VALUE;
            this.f41235f = Integer.MIN_VALUE;
            this.f41236g = Integer.MIN_VALUE;
            this.f41237h = Integer.MIN_VALUE;
            this.f41230a = null;
            this.f41231b = null;
            this.f41233d = new int[3];
            for (int i12 = 0; i12 < 3; i12++) {
                this.f41233d[i12] = Integer.MIN_VALUE;
            }
        } else {
            int M = M(i11);
            this.f41234e = M;
            this.f41235f = M - 1;
            this.f41236g = S(M);
            int i13 = this.f41234e;
            this.f41230a = new Object[i13];
            this.f41231b = null;
            this.f41233d = new int[i13];
            this.f41237h = 0;
        }
        this.f41232c = null;
    }

    private static int M(int i11) {
        return Math.max(2, U((int) Math.ceil(i11 / 0.75f)));
    }

    private static net.time4j.engine.p<Integer> N(int i11) {
        switch (i11) {
            case 0:
                return net.time4j.g0.f41294p;
            case 1:
                return net.time4j.g0.f41298x;
            case 2:
                return net.time4j.g0.f41299y;
            case 3:
                return h0.f41335y;
            case 4:
                return h0.A;
            case 5:
                return h0.C;
            case 6:
                return h0.H;
            default:
                throw new IllegalStateException("No element index: " + i11);
        }
    }

    private int O(net.time4j.engine.p<?> pVar) {
        Object obj;
        Object[] objArr = this.f41230a;
        if (objArr == null) {
            if (pVar == net.time4j.g0.f41294p) {
                return this.f41233d[0];
            }
            if (pVar == net.time4j.g0.f41298x) {
                return this.f41233d[1];
            }
            if (pVar == net.time4j.g0.f41299y) {
                return this.f41233d[2];
            }
            if (pVar == h0.f41335y) {
                return this.f41234e;
            }
            if (pVar == h0.A) {
                return this.f41235f;
            }
            if (pVar == h0.C) {
                return this.f41236g;
            }
            if (pVar == h0.H) {
                return this.f41237h;
            }
            Map<net.time4j.engine.p<?>, Object> map = this.f41232c;
            if (map == null || !map.containsKey(pVar)) {
                return Integer.MIN_VALUE;
            }
            return ((Integer) Integer.class.cast(map.get(pVar))).intValue();
        }
        int T = T(pVar.hashCode()) & this.f41235f;
        Object obj2 = objArr[T];
        if (obj2 == null) {
            return Integer.MIN_VALUE;
        }
        if (pVar.equals(obj2)) {
            return this.f41233d[T];
        }
        do {
            T = (T + 1) & this.f41235f;
            obj = objArr[T];
            if (obj == null) {
                return Integer.MIN_VALUE;
            }
        } while (!pVar.equals(obj));
        return this.f41233d[T];
    }

    public static boolean Q(net.time4j.engine.p<?> pVar) {
        return f41229k.contains(pVar);
    }

    private static int S(int i11) {
        return Math.min((int) Math.ceil(i11 * 0.75f), i11 - 1);
    }

    private static int T(int i11) {
        int i12 = i11 * (-1640531527);
        return i12 ^ (i12 >>> 16);
    }

    private static int U(int i11) {
        if (i11 == 0) {
            return 1;
        }
        int i12 = i11 - 1;
        int i13 = i12 | (i12 >> 1);
        int i14 = i13 | (i13 >> 2);
        int i15 = i14 | (i14 >> 4);
        int i16 = i15 | (i15 >> 8);
        return (i16 | (i16 >> 16)) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void W(int r13) {
        /*
            r12 = this;
            java.lang.Object[] r0 = r12.f41230a
            java.lang.Object[] r1 = r12.f41231b
            int[] r2 = r12.f41233d
            int r3 = r13 + (-1)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            if (r1 != 0) goto Le
            r5 = 0
            goto L10
        Le:
            java.lang.Object[] r5 = new java.lang.Object[r13]
        L10:
            int[] r6 = new int[r13]
            int r7 = r12.f41234e
            r8 = 0
            int r9 = r12.f41237h
        L17:
            if (r8 >= r9) goto L48
        L19:
            int r7 = r7 + (-1)
            r10 = r0[r7]
            if (r10 != 0) goto L20
            goto L19
        L20:
            r10 = r0[r7]
            int r10 = r10.hashCode()
            int r10 = T(r10)
            r10 = r10 & r3
            r11 = r4[r10]
            if (r11 == 0) goto L37
        L2f:
            int r10 = r10 + 1
            r10 = r10 & r3
            r11 = r4[r10]
            if (r11 == 0) goto L37
            goto L2f
        L37:
            r11 = r0[r7]
            r4[r10] = r11
            if (r1 == 0) goto L41
            r11 = r1[r7]
            r5[r10] = r11
        L41:
            r11 = r2[r7]
            r6[r10] = r11
            int r8 = r8 + 1
            goto L17
        L48:
            r12.f41234e = r13
            r12.f41235f = r3
            int r13 = S(r13)
            r12.f41236g = r13
            r12.f41230a = r4
            r12.f41231b = r5
            r12.f41233d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.format.expert.v.W(int):void");
    }

    private void X(Object obj) {
        Object obj2;
        Object[] objArr = this.f41230a;
        if (objArr == null) {
            if (obj == net.time4j.g0.f41294p) {
                this.f41233d[0] = Integer.MIN_VALUE;
                return;
            } else if (obj == net.time4j.g0.f41298x) {
                this.f41233d[1] = Integer.MIN_VALUE;
                return;
            } else if (obj == net.time4j.g0.f41299y) {
                this.f41233d[2] = Integer.MIN_VALUE;
                return;
            } else if (obj == h0.f41335y) {
                this.f41234e = Integer.MIN_VALUE;
                return;
            } else if (obj == h0.A) {
                this.f41235f = Integer.MIN_VALUE;
                return;
            } else if (obj == h0.C) {
                this.f41236g = Integer.MIN_VALUE;
                return;
            } else if (obj == h0.H) {
                this.f41237h = Integer.MIN_VALUE;
                return;
            } else {
                Map<net.time4j.engine.p<?>, Object> map = this.f41232c;
                if (map != null) {
                    map.remove(obj);
                    return;
                }
                return;
            }
        }
        int T = T(obj.hashCode()) & this.f41235f;
        Object obj3 = objArr[T];
        if (obj3 == null) {
            return;
        }
        if (obj.equals(obj3)) {
            Y(T);
            return;
        }
        do {
            T = (T + 1) & this.f41235f;
            obj2 = objArr[T];
            if (obj2 == null) {
                return;
            }
        } while (!obj.equals(obj2));
        Y(T);
    }

    private void Y(int i11) {
        Object obj;
        this.f41237h--;
        Object[] objArr = this.f41230a;
        while (true) {
            int i12 = (i11 + 1) & this.f41235f;
            while (true) {
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i11] = null;
                    return;
                }
                int T = T(obj.hashCode());
                int i13 = this.f41235f;
                int i14 = T & i13;
                if (i11 > i12) {
                    if (i11 >= i14 && i14 > i12) {
                        break;
                    }
                    i12 = (i12 + 1) & i13;
                } else if (i11 >= i14 || i14 > i12) {
                    break;
                } else {
                    i12 = (i12 + 1) & i13;
                }
            }
            objArr[i11] = obj;
            Object[] objArr2 = this.f41231b;
            if (objArr2 != null) {
                objArr2[i11] = objArr2[i12];
            }
            int[] iArr = this.f41233d;
            iArr[i11] = iArr[i12];
            i11 = i12;
        }
    }

    @Override // net.time4j.format.expert.t
    <E> E B() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.format.expert.t
    public void D(net.time4j.engine.p<?> pVar, int i11) {
        Object obj;
        int i12;
        int i13;
        int i14;
        int i15;
        Object[] objArr = this.f41230a;
        if (objArr == null) {
            if (pVar == net.time4j.g0.f41294p) {
                if (!this.f41238i) {
                    int[] iArr = this.f41233d;
                    if (iArr[0] != Integer.MIN_VALUE && iArr[0] != i11) {
                        throw new net.time4j.format.expert.a(pVar);
                    }
                }
                this.f41233d[0] = i11;
                return;
            } else if (pVar == net.time4j.g0.f41298x) {
                if (!this.f41238i) {
                    int[] iArr2 = this.f41233d;
                    if (iArr2[1] != Integer.MIN_VALUE && iArr2[1] != i11) {
                        throw new net.time4j.format.expert.a(pVar);
                    }
                }
                this.f41233d[1] = i11;
                return;
            } else if (pVar == net.time4j.g0.f41299y) {
                if (!this.f41238i) {
                    int[] iArr3 = this.f41233d;
                    if (iArr3[2] != Integer.MIN_VALUE && iArr3[2] != i11) {
                        throw new net.time4j.format.expert.a(pVar);
                    }
                }
                this.f41233d[2] = i11;
                return;
            } else if (pVar == h0.f41335y) {
                if (!this.f41238i && (i15 = this.f41234e) != Integer.MIN_VALUE && i15 != i11) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                this.f41234e = i11;
                return;
            } else if (pVar == h0.A) {
                if (!this.f41238i && (i14 = this.f41235f) != Integer.MIN_VALUE && i14 != i11) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                this.f41235f = i11;
                return;
            } else if (pVar == h0.C) {
                if (!this.f41238i && (i13 = this.f41236g) != Integer.MIN_VALUE && i13 != i11) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                this.f41236g = i11;
                return;
            } else if (pVar == h0.H) {
                if (!this.f41238i && (i12 = this.f41237h) != Integer.MIN_VALUE && i12 != i11) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                this.f41237h = i11;
                return;
            } else {
                Map map = this.f41232c;
                if (map == null) {
                    map = new HashMap();
                    this.f41232c = map;
                }
                Integer valueOf = Integer.valueOf(i11);
                if (!this.f41238i && map.containsKey(pVar) && !valueOf.equals(map.get(pVar))) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                map.put(pVar, valueOf);
                return;
            }
        }
        int T = T(pVar.hashCode()) & this.f41235f;
        Object obj2 = objArr[T];
        if (obj2 != null) {
            if (obj2.equals(pVar)) {
                if (!this.f41238i && this.f41233d[T] != i11) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                this.f41233d[T] = i11;
                return;
            }
            do {
                T = (T + 1) & this.f41235f;
                obj = objArr[T];
                if (obj != null) {
                }
            } while (!obj.equals(pVar));
            if (!this.f41238i && this.f41233d[T] != i11) {
                throw new net.time4j.format.expert.a(pVar);
            }
            this.f41233d[T] = i11;
            return;
        }
        objArr[T] = pVar;
        this.f41233d[T] = i11;
        int i16 = this.f41237h;
        int i17 = i16 + 1;
        this.f41237h = i17;
        if (i16 >= this.f41236g) {
            W(M(i17));
        }
    }

    @Override // net.time4j.format.expert.t
    public void E(net.time4j.engine.p<?> pVar, Object obj) {
        Object obj2;
        if (obj != null) {
            if (pVar.getType() == Integer.class) {
                D(pVar, ((Integer) Integer.class.cast(obj)).intValue());
                return;
            }
            Object[] objArr = this.f41230a;
            if (objArr == null) {
                Map map = this.f41232c;
                if (map == null) {
                    map = new HashMap();
                    this.f41232c = map;
                }
                if (!this.f41238i && map.containsKey(pVar) && !obj.equals(map.get(pVar))) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                map.put(pVar, obj);
                return;
            }
            if (this.f41231b == null) {
                this.f41231b = new Object[this.f41234e];
            }
            int T = T(pVar.hashCode()) & this.f41235f;
            Object obj3 = objArr[T];
            if (obj3 != null) {
                if (obj3.equals(pVar)) {
                    if (!this.f41238i && !obj.equals(this.f41231b[T])) {
                        throw new net.time4j.format.expert.a(pVar);
                    }
                    this.f41231b[T] = obj;
                    return;
                }
                do {
                    T = (T + 1) & this.f41235f;
                    obj2 = objArr[T];
                    if (obj2 != null) {
                    }
                } while (!obj2.equals(pVar));
                if (!this.f41238i && !obj.equals(this.f41231b[T])) {
                    throw new net.time4j.format.expert.a(pVar);
                }
                this.f41231b[T] = obj;
                return;
            }
            objArr[T] = pVar;
            this.f41231b[T] = obj;
            int i11 = this.f41237h;
            int i12 = i11 + 1;
            this.f41237h = i12;
            if (i11 >= this.f41236g) {
                W(M(i12));
                return;
            }
            return;
        }
        X(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.format.expert.t
    public void F(Object obj) {
    }

    public int P() {
        return this.f41239j;
    }

    public void V(v vVar) {
        int i11 = 0;
        if (this.f41230a == null) {
            int i12 = vVar.f41234e;
            if (i12 != Integer.MIN_VALUE) {
                int i13 = this.f41234e;
                if (i13 != Integer.MIN_VALUE && !this.f41238i && i13 != i12) {
                    throw new net.time4j.format.expert.a(h0.f41335y);
                }
                this.f41234e = i12;
            }
            int i14 = vVar.f41235f;
            if (i14 != Integer.MIN_VALUE) {
                int i15 = this.f41235f;
                if (i15 != Integer.MIN_VALUE && !this.f41238i && i15 != i14) {
                    throw new net.time4j.format.expert.a(h0.A);
                }
                this.f41235f = i14;
            }
            int i16 = vVar.f41236g;
            if (i16 != Integer.MIN_VALUE) {
                int i17 = this.f41236g;
                if (i17 != Integer.MIN_VALUE && !this.f41238i && i17 != i16) {
                    throw new net.time4j.format.expert.a(h0.C);
                }
                this.f41236g = i16;
            }
            int i18 = vVar.f41237h;
            if (i18 != Integer.MIN_VALUE) {
                int i19 = this.f41237h;
                if (i19 != Integer.MIN_VALUE && !this.f41238i && i19 != i18) {
                    throw new net.time4j.format.expert.a(h0.H);
                }
                this.f41237h = i18;
            }
            while (i11 < 3) {
                int i21 = vVar.f41233d[i11];
                if (i21 != Integer.MIN_VALUE) {
                    int[] iArr = this.f41233d;
                    if (iArr[i11] != Integer.MIN_VALUE && !this.f41238i && iArr[i11] != i21) {
                        throw new net.time4j.format.expert.a(N(i11));
                    }
                    iArr[i11] = i21;
                }
                i11++;
            }
            Map<net.time4j.engine.p<?>, Object> map = vVar.f41232c;
            if (map != null) {
                for (net.time4j.engine.p<?> pVar : map.keySet()) {
                    E(pVar, map.get(pVar));
                }
                return;
            }
            return;
        }
        Object[] objArr = vVar.f41230a;
        while (i11 < objArr.length) {
            Object obj = objArr[i11];
            if (obj != null) {
                net.time4j.engine.p<?> pVar2 = (net.time4j.engine.p) net.time4j.engine.p.class.cast(obj);
                if (pVar2.getType() == Integer.class) {
                    D(pVar2, vVar.f41233d[i11]);
                } else {
                    E(pVar2, vVar.f41231b[i11]);
                }
            }
            i11++;
        }
    }

    public void Z() {
        Object[] objArr = this.f41230a;
        if (objArr == null) {
            this.f41234e = Integer.MIN_VALUE;
            this.f41235f = Integer.MIN_VALUE;
            this.f41236g = Integer.MIN_VALUE;
            this.f41237h = Integer.MIN_VALUE;
            for (int i11 = 0; i11 < 3; i11++) {
                this.f41233d[i11] = Integer.MIN_VALUE;
            }
            this.f41232c = null;
        } else {
            this.f41230a = new Object[objArr.length];
        }
        this.f41237h = 0;
    }

    public void a0() {
        this.f41238i = true;
    }

    public void b0(int i11) {
        this.f41239j = i11;
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public int h(net.time4j.engine.p<Integer> pVar) {
        return O(pVar);
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public <V> V l(net.time4j.engine.p<V> pVar) {
        int T;
        Object obj;
        Object obj2;
        Class<V> type = pVar.getType();
        if (type == Integer.class) {
            int O = O(pVar);
            if (O != Integer.MIN_VALUE) {
                return type.cast(Integer.valueOf(O));
            }
            throw new ChronoException("No value found for: " + pVar.name());
        }
        Object[] objArr = this.f41230a;
        if (objArr == null) {
            Map<net.time4j.engine.p<?>, Object> map = this.f41232c;
            if (map != null && map.containsKey(pVar)) {
                return pVar.getType().cast(map.get(pVar));
            }
            throw new ChronoException("No value found for: " + pVar.name());
        } else if (this.f41231b != null && (obj = objArr[(T = T(pVar.hashCode()) & this.f41235f)]) != null) {
            if (pVar.equals(obj)) {
                return type.cast(this.f41231b[T]);
            }
            do {
                T = (T + 1) & this.f41235f;
                obj2 = objArr[T];
                if (obj2 == null) {
                    throw new ChronoException("No value found for: " + pVar.name());
                }
            } while (!pVar.equals(obj2));
            return type.cast(this.f41231b[T]);
        } else {
            throw new ChronoException("No value found for: " + pVar.name());
        }
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public boolean q(net.time4j.engine.p<?> pVar) {
        Object obj;
        if (pVar == null) {
            return false;
        }
        Object[] objArr = this.f41230a;
        if (objArr == null) {
            if (pVar == net.time4j.g0.f41294p) {
                return this.f41233d[0] != Integer.MIN_VALUE;
            } else if (pVar == net.time4j.g0.f41298x) {
                return this.f41233d[1] != Integer.MIN_VALUE;
            } else if (pVar == net.time4j.g0.f41299y) {
                return this.f41233d[2] != Integer.MIN_VALUE;
            } else if (pVar == h0.f41335y) {
                return this.f41234e != Integer.MIN_VALUE;
            } else if (pVar == h0.A) {
                return this.f41235f != Integer.MIN_VALUE;
            } else if (pVar == h0.C) {
                return this.f41236g != Integer.MIN_VALUE;
            } else if (pVar == h0.H) {
                return this.f41237h != Integer.MIN_VALUE;
            } else {
                Map<net.time4j.engine.p<?>, Object> map = this.f41232c;
                return map != null && map.containsKey(pVar);
            }
        }
        int T = T(pVar.hashCode()) & this.f41235f;
        Object obj2 = objArr[T];
        if (obj2 == null) {
            return false;
        }
        if (pVar.equals(obj2)) {
            return true;
        }
        do {
            T = (T + 1) & this.f41235f;
            obj = objArr[T];
            if (obj == null) {
                return false;
            }
        } while (!pVar.equals(obj));
        return true;
    }

    @Override // net.time4j.engine.q
    public Set<net.time4j.engine.p<?>> t() {
        if (this.f41230a == null) {
            HashSet hashSet = new HashSet();
            if (this.f41233d[0] != Integer.MIN_VALUE) {
                hashSet.add(net.time4j.g0.f41294p);
            }
            if (this.f41233d[1] != Integer.MIN_VALUE) {
                hashSet.add(net.time4j.g0.f41298x);
            }
            if (this.f41233d[2] != Integer.MIN_VALUE) {
                hashSet.add(net.time4j.g0.f41299y);
            }
            if (this.f41234e != Integer.MIN_VALUE) {
                hashSet.add(h0.f41335y);
            }
            if (this.f41235f != Integer.MIN_VALUE) {
                hashSet.add(h0.A);
            }
            if (this.f41236g != Integer.MIN_VALUE) {
                hashSet.add(h0.C);
            }
            if (this.f41237h != Integer.MIN_VALUE) {
                hashSet.add(h0.H);
            }
            Map<net.time4j.engine.p<?>, Object> map = this.f41232c;
            if (map != null) {
                hashSet.addAll(map.keySet());
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return new c();
    }
}