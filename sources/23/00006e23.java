package fh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class h extends d {

    /* renamed from: g  reason: collision with root package name */
    private final i f26243g;

    public h(boolean z11, i iVar) {
        this.f26231a = z11;
        this.f26243g = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z11 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        iVar.p(allocate, 16L);
        this.f26232b = iVar.C(allocate, 32L);
        this.f26233c = iVar.C(allocate, 40L);
        this.f26234d = iVar.p(allocate, 54L);
        this.f26235e = iVar.p(allocate, 56L);
        this.f26236f = iVar.p(allocate, 58L);
        iVar.p(allocate, 60L);
        iVar.p(allocate, 62L);
    }

    @Override // fh.d
    public c a(long j11, int i11) {
        return new b(this.f26243g, this, j11, i11);
    }

    @Override // fh.d
    public e b(long j11) {
        return new k(this.f26243g, this, j11);
    }

    @Override // fh.d
    public f c(int i11) {
        return new m(this.f26243g, this, i11);
    }
}