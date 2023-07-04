package ji;

import java.io.EOFException;
import ji.x;

/* loaded from: classes3.dex */
public final class g implements x {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f33741a = new byte[4096];

    @Override // ji.x
    public int b(zj.f fVar, int i11, boolean z11, int i12) {
        int read = fVar.read(this.f33741a, 0, Math.min(this.f33741a.length, i11));
        if (read == -1) {
            if (z11) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // ji.x
    public void c(ak.v vVar, int i11, int i12) {
        vVar.P(i11);
    }

    @Override // ji.x
    public void d(ci.i iVar) {
    }

    @Override // ji.x
    public void f(long j11, int i11, int i12, int i13, x.a aVar) {
    }
}