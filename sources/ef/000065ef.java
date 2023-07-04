package dj;

import ak.g0;
import ak.u;
import ak.v;
import java.nio.ByteBuffer;
import wi.a;

/* loaded from: classes3.dex */
public final class c extends wi.g {

    /* renamed from: a  reason: collision with root package name */
    private final v f24151a = new v();

    /* renamed from: b  reason: collision with root package name */
    private final u f24152b = new u();

    /* renamed from: c  reason: collision with root package name */
    private g0 f24153c;

    @Override // wi.g
    protected wi.a b(wi.d dVar, ByteBuffer byteBuffer) {
        g0 g0Var = this.f24153c;
        if (g0Var == null || dVar.f55903i != g0Var.e()) {
            g0 g0Var2 = new g0(dVar.f13266e);
            this.f24153c = g0Var2;
            g0Var2.a(dVar.f13266e - dVar.f55903i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f24151a.M(array, limit);
        this.f24152b.o(array, limit);
        this.f24152b.r(39);
        long h11 = (this.f24152b.h(1) << 32) | this.f24152b.h(32);
        this.f24152b.r(20);
        int h12 = this.f24152b.h(12);
        int h13 = this.f24152b.h(8);
        a.b bVar = null;
        this.f24151a.P(14);
        if (h13 == 0) {
            bVar = new e();
        } else if (h13 == 255) {
            bVar = a.a(this.f24151a, h12, h11);
        } else if (h13 == 4) {
            bVar = f.a(this.f24151a);
        } else if (h13 == 5) {
            bVar = d.a(this.f24151a, h11, this.f24153c);
        } else if (h13 == 6) {
            bVar = g.a(this.f24151a, h11, this.f24153c);
        }
        return bVar == null ? new wi.a(new a.b[0]) : new wi.a(bVar);
    }
}