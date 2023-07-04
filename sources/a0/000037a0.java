package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class o0<K, V> extends t<K, V> {

    /* renamed from: g  reason: collision with root package name */
    static final t<Object, Object> f16101g = new o0(null, new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object f16102d;

    /* renamed from: e  reason: collision with root package name */
    final transient Object[] f16103e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f16104f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a<K, V> extends v<Map.Entry<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private final transient t<K, V> f16105c;

        /* renamed from: d  reason: collision with root package name */
        private final transient Object[] f16106d;

        /* renamed from: e  reason: collision with root package name */
        private final transient int f16107e;

        /* renamed from: f  reason: collision with root package name */
        private final transient int f16108f;

        /* renamed from: com.google.common.collect.o0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0294a extends r<Map.Entry<K, V>> {
            C0294a() {
            }

            @Override // com.google.common.collect.p
            public boolean h() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f16108f;
            }

            @Override // java.util.List
            /* renamed from: y */
            public Map.Entry<K, V> get(int i11) {
                com.google.common.base.u.m(i11, a.this.f16108f);
                int i12 = i11 * 2;
                Object obj = a.this.f16106d[a.this.f16107e + i12];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f16106d[i12 + (a.this.f16107e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        }

        a(t<K, V> tVar, Object[] objArr, int i11, int i12) {
            this.f16105c = tVar;
            this.f16106d = objArr;
            this.f16107e = i11;
            this.f16108f = i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p
        public int c(Object[] objArr, int i11) {
            return b().c(objArr, i11);
        }

        @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f16105c.get(key));
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p
        public boolean h() {
            return true;
        }

        @Override // com.google.common.collect.v, com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public v0<Map.Entry<K, V>> iterator() {
            return b().iterator();
        }

        @Override // com.google.common.collect.v
        r<Map.Entry<K, V>> n() {
            return new C0294a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f16108f;
        }
    }

    /* loaded from: classes3.dex */
    static final class b<K> extends v<K> {

        /* renamed from: c  reason: collision with root package name */
        private final transient t<K, ?> f16110c;

        /* renamed from: d  reason: collision with root package name */
        private final transient r<K> f16111d;

        b(t<K, ?> tVar, r<K> rVar) {
            this.f16110c = tVar;
            this.f16111d = rVar;
        }

        @Override // com.google.common.collect.v, com.google.common.collect.p
        public r<K> b() {
            return this.f16111d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p
        public int c(Object[] objArr, int i11) {
            return b().c(objArr, i11);
        }

        @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f16110c.get(obj) != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p
        public boolean h() {
            return true;
        }

        @Override // com.google.common.collect.v, com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public v0<K> iterator() {
            return b().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f16110c.size();
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends r<Object> {

        /* renamed from: c  reason: collision with root package name */
        private final transient Object[] f16112c;

        /* renamed from: d  reason: collision with root package name */
        private final transient int f16113d;

        /* renamed from: e  reason: collision with root package name */
        private final transient int f16114e;

        c(Object[] objArr, int i11, int i12) {
            this.f16112c = objArr;
            this.f16113d = i11;
            this.f16114e = i12;
        }

        @Override // java.util.List
        public Object get(int i11) {
            com.google.common.base.u.m(i11, this.f16114e);
            Object obj = this.f16112c[(i11 * 2) + this.f16113d];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p
        public boolean h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f16114e;
        }
    }

    private o0(Object obj, Object[] objArr, int i11) {
        this.f16102d = obj;
        this.f16103e = objArr;
        this.f16104f = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> o0<K, V> n(int i11, Object[] objArr) {
        if (i11 == 0) {
            return (o0) f16101g;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            h.a(obj, obj2);
            return new o0<>(null, objArr, 1);
        }
        com.google.common.base.u.r(i11, objArr.length >> 1);
        return new o0<>(o(objArr, i11, v.j(i11), 0), objArr, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object o(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.o0.o(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private static IllegalArgumentException p(Object obj, Object obj2, Object[] objArr, int i11) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i11]);
        String valueOf4 = String.valueOf(objArr[i11 ^ 1]);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        sb2.append(" and ");
        sb2.append(valueOf3);
        sb2.append("=");
        sb2.append(valueOf4);
        return new IllegalArgumentException(sb2.toString());
    }

    static Object q(Object obj, Object[] objArr, int i11, int i12, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i11 == 1) {
            Object obj3 = objArr[i12];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj2)) {
                Object obj4 = objArr[i12 ^ 1];
                Objects.requireNonNull(obj4);
                return obj4;
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int b11 = o.b(obj2.hashCode());
                while (true) {
                    int i13 = b11 & length;
                    int i14 = bArr[i13] & 255;
                    if (i14 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i14])) {
                        return objArr[i14 ^ 1];
                    }
                    b11 = i13 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int b12 = o.b(obj2.hashCode());
                while (true) {
                    int i15 = b12 & length2;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i16])) {
                        return objArr[i16 ^ 1];
                    }
                    b12 = i15 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int b13 = o.b(obj2.hashCode());
                while (true) {
                    int i17 = b13 & length3;
                    int i18 = iArr[i17];
                    if (i18 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i18])) {
                        return objArr[i18 ^ 1];
                    }
                    b13 = i17 + 1;
                }
            }
        }
    }

    @Override // com.google.common.collect.t
    v<Map.Entry<K, V>> e() {
        return new a(this, this.f16103e, 0, this.f16104f);
    }

    @Override // com.google.common.collect.t
    v<K> f() {
        return new b(this, new c(this.f16103e, 0, this.f16104f));
    }

    @Override // com.google.common.collect.t, java.util.Map
    public V get(Object obj) {
        V v11 = (V) q(this.f16102d, this.f16103e, this.f16104f, 0, obj);
        if (v11 == null) {
            return null;
        }
        return v11;
    }

    @Override // com.google.common.collect.t
    p<V> h() {
        return new c(this.f16103e, 1, this.f16104f);
    }

    @Override // com.google.common.collect.t
    boolean j() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f16104f;
    }
}