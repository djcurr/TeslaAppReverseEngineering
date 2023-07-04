package tj;

import ak.k0;
import java.util.Collections;
import java.util.List;
import nj.f;

/* loaded from: classes3.dex */
final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final nj.b[] f52319a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f52320b;

    public b(nj.b[] bVarArr, long[] jArr) {
        this.f52319a = bVarArr;
        this.f52320b = jArr;
    }

    @Override // nj.f
    public int a(long j11) {
        int e11 = k0.e(this.f52320b, j11, false, false);
        if (e11 < this.f52320b.length) {
            return e11;
        }
        return -1;
    }

    @Override // nj.f
    public List<nj.b> b(long j11) {
        int i11 = k0.i(this.f52320b, j11, true, false);
        if (i11 != -1) {
            nj.b[] bVarArr = this.f52319a;
            if (bVarArr[i11] != nj.b.f41693p) {
                return Collections.singletonList(bVarArr[i11]);
            }
        }
        return Collections.emptyList();
    }

    @Override // nj.f
    public long c(int i11) {
        ak.a.a(i11 >= 0);
        ak.a.a(i11 < this.f52320b.length);
        return this.f52320b[i11];
    }

    @Override // nj.f
    public int d() {
        return this.f52320b.length;
    }
}