package fh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class g extends d {

    /* renamed from: g  reason: collision with root package name */
    private final i f26242g;

    public g(boolean z11, i iVar) {
        this.f26231a = z11;
        this.f26242g = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        iVar.p(allocate, 16L);
        this.f26232b = iVar.J(allocate, 28L);
        this.f26233c = iVar.J(allocate, 32L);
        this.f26234d = iVar.p(allocate, 42L);
        this.f26235e = iVar.p(allocate, 44L);
        this.f26236f = iVar.p(allocate, 46L);
        iVar.p(allocate, 48L);
        iVar.p(allocate, 50L);
    }

    @Override // fh.d
    public c a(long j11, int i11) {
        return new a(this.f26242g, this, j11, i11);
    }

    @Override // fh.d
    public e b(long j11) {
        return new j(this.f26242g, this, j11);
    }

    @Override // fh.d
    public f c(int i11) {
        return new l(this.f26242g, this, i11);
    }
}