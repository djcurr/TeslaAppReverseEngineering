package wj;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class c implements nj.f {

    /* renamed from: a  reason: collision with root package name */
    private final List<nj.b> f55919a;

    public c(List<nj.b> list) {
        this.f55919a = Collections.unmodifiableList(list);
    }

    @Override // nj.f
    public int a(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // nj.f
    public List<nj.b> b(long j11) {
        return j11 >= 0 ? this.f55919a : Collections.emptyList();
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