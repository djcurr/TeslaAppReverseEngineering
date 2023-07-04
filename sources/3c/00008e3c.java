package oj;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class f implements nj.f {

    /* renamed from: a  reason: collision with root package name */
    private final List<nj.b> f42630a;

    public f(List<nj.b> list) {
        this.f42630a = list;
    }

    @Override // nj.f
    public int a(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // nj.f
    public List<nj.b> b(long j11) {
        return j11 >= 0 ? this.f42630a : Collections.emptyList();
    }

    @Override // nj.f
    public long c(int i11) {
        ak.a.a(i11 == 0);
        return 0L;
    }

    @Override // nj.f
    public int d() {
        return 1;
    }
}