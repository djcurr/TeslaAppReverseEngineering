package vj;

import java.util.Collections;
import java.util.List;
import nj.f;

/* loaded from: classes3.dex */
final class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final b f54503b = new b();

    /* renamed from: a  reason: collision with root package name */
    private final List<nj.b> f54504a;

    public b(nj.b bVar) {
        this.f54504a = Collections.singletonList(bVar);
    }

    @Override // nj.f
    public int a(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // nj.f
    public List<nj.b> b(long j11) {
        return j11 >= 0 ? this.f54504a : Collections.emptyList();
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

    private b() {
        this.f54504a = Collections.emptyList();
    }
}