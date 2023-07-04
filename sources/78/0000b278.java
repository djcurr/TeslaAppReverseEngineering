package sj;

import ak.k0;
import java.util.Collections;
import java.util.List;
import nj.f;

/* loaded from: classes3.dex */
final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<List<nj.b>> f50440a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Long> f50441b;

    public d(List<List<nj.b>> list, List<Long> list2) {
        this.f50440a = list;
        this.f50441b = list2;
    }

    @Override // nj.f
    public int a(long j11) {
        int d11 = k0.d(this.f50441b, Long.valueOf(j11), false, false);
        if (d11 < this.f50441b.size()) {
            return d11;
        }
        return -1;
    }

    @Override // nj.f
    public List<nj.b> b(long j11) {
        int g11 = k0.g(this.f50441b, Long.valueOf(j11), true, false);
        if (g11 == -1) {
            return Collections.emptyList();
        }
        return this.f50440a.get(g11);
    }

    @Override // nj.f
    public long c(int i11) {
        ak.a.a(i11 >= 0);
        ak.a.a(i11 < this.f50441b.size());
        return this.f50441b.get(i11).longValue();
    }

    @Override // nj.f
    public int d() {
        return this.f50441b.size();
    }
}