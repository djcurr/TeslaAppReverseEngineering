package uj;

import ak.k0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class g implements nj.f {

    /* renamed from: a  reason: collision with root package name */
    private final c f53529a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f53530b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, f> f53531c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f53532d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f53533e;

    public g(c cVar, Map<String, f> map, Map<String, d> map2, Map<String, String> map3) {
        this.f53529a = cVar;
        this.f53532d = map2;
        this.f53533e = map3;
        this.f53531c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f53530b = cVar.j();
    }

    @Override // nj.f
    public int a(long j11) {
        int e11 = k0.e(this.f53530b, j11, false, false);
        if (e11 < this.f53530b.length) {
            return e11;
        }
        return -1;
    }

    @Override // nj.f
    public List<nj.b> b(long j11) {
        return this.f53529a.h(j11, this.f53531c, this.f53532d, this.f53533e);
    }

    @Override // nj.f
    public long c(int i11) {
        return this.f53530b[i11];
    }

    @Override // nj.f
    public int d() {
        return this.f53530b.length;
    }
}