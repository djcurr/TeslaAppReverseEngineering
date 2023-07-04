package hl;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import ol.c0;
import ol.i0;
import ol.z;

/* loaded from: classes3.dex */
public final class p<P> {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap<c, List<b<P>>> f29326a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private b<P> f29327b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<P> f29328c;

    /* loaded from: classes3.dex */
    public static final class b<P> {

        /* renamed from: a  reason: collision with root package name */
        private final P f29329a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f29330b;

        /* renamed from: c  reason: collision with root package name */
        private final z f29331c;

        /* renamed from: d  reason: collision with root package name */
        private final i0 f29332d;

        b(P p11, byte[] bArr, z zVar, i0 i0Var, int i11) {
            this.f29329a = p11;
            this.f29330b = Arrays.copyOf(bArr, bArr.length);
            this.f29331c = zVar;
            this.f29332d = i0Var;
        }

        public final byte[] a() {
            byte[] bArr = this.f29330b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public i0 b() {
            return this.f29332d;
        }

        public P c() {
            return this.f29329a;
        }

        public z d() {
            return this.f29331c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f29333a;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            int i11;
            int i12;
            byte[] bArr = this.f29333a;
            int length = bArr.length;
            byte[] bArr2 = cVar.f29333a;
            if (length != bArr2.length) {
                i11 = bArr.length;
                i12 = bArr2.length;
            } else {
                int i13 = 0;
                while (true) {
                    byte[] bArr3 = this.f29333a;
                    if (i13 >= bArr3.length) {
                        return 0;
                    }
                    byte b11 = bArr3[i13];
                    byte[] bArr4 = cVar.f29333a;
                    if (b11 != bArr4[i13]) {
                        i11 = bArr3[i13];
                        i12 = bArr4[i13];
                        break;
                    }
                    i13++;
                }
            }
            return i11 - i12;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.f29333a, ((c) obj).f29333a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f29333a);
        }

        public String toString() {
            return pl.o.b(this.f29333a);
        }

        private c(byte[] bArr) {
            this.f29333a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    private p(Class<P> cls) {
        this.f29328c = cls;
    }

    public static <P> p<P> f(Class<P> cls) {
        return new p<>(cls);
    }

    public b<P> a(P p11, c0.c cVar) {
        if (cVar.K() == z.ENABLED) {
            b<P> bVar = new b<>(p11, hl.c.a(cVar), cVar.K(), cVar.J(), cVar.I());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            c cVar2 = new c(bVar.a());
            List<b<P>> put = this.f29326a.put(cVar2, Collections.unmodifiableList(arrayList));
            if (put != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(put);
                arrayList2.add(bVar);
                this.f29326a.put(cVar2, Collections.unmodifiableList(arrayList2));
            }
            return bVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public b<P> b() {
        return this.f29327b;
    }

    public List<b<P>> c(byte[] bArr) {
        List<b<P>> list = this.f29326a.get(new c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> d() {
        return this.f29328c;
    }

    public List<b<P>> e() {
        return c(hl.c.f29310a);
    }

    public void g(b<P> bVar) {
        if (bVar != null) {
            if (bVar.d() == z.ENABLED) {
                if (!c(bVar.a()).isEmpty()) {
                    this.f29327b = bVar;
                    return;
                }
                throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
            }
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        throw new IllegalArgumentException("the primary entry must be non-null");
    }
}