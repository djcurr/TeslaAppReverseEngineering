package pj;

import java.util.List;
import nj.f;

/* loaded from: classes3.dex */
final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<nj.b> f46629a;

    public c(List<nj.b> list) {
        this.f46629a = list;
    }

    @Override // nj.f
    public int a(long j11) {
        return -1;
    }

    @Override // nj.f
    public List<nj.b> b(long j11) {
        return this.f46629a;
    }

    @Override // nj.f
    public long c(int i11) {
        return 0L;
    }

    @Override // nj.f
    public int d() {
        return 1;
    }
}