package atd.d0;

import java.util.Arrays;

/* loaded from: classes.dex */
final class a extends b {
    static {
        atd.s0.a.a(-799627085146688L);
    }

    @Override // atd.b0.a
    public String a() {
        return atd.s0.a.a(-799884783184448L);
    }

    @Override // atd.d0.f
    public atd.c0.d a(atd.f0.f fVar, atd.g0.b bVar) {
        atd.g0.b.a(bVar, atd.g0.e.class);
        return a(fVar.e(), ((atd.g0.e) bVar).c());
    }

    @Override // atd.d0.b
    public atd.c0.d a(atd.c0.b bVar, byte[] bArr) {
        return new atd.c0.d(Arrays.copyOfRange(bArr, 0, bVar.f() / 8), bVar);
    }
}