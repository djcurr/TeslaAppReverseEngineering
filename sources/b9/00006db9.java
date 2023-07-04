package f70;

import f70.g;
import f70.i;
import java.util.Objects;

/* loaded from: classes5.dex */
class v {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static u a(k kVar, n nVar, i iVar) {
        double d11;
        Objects.requireNonNull(nVar, "publicKey == null");
        Objects.requireNonNull(iVar, "address == null");
        int a11 = kVar.d().a();
        byte[][] a12 = nVar.a();
        u[] uVarArr = new u[a12.length];
        for (int i11 = 0; i11 < a12.length; i11++) {
            uVarArr[i11] = new u(0, a12[i11]);
        }
        i.b f11 = new i.b().g(iVar.b()).h(iVar.c()).n(iVar.e()).o(0).p(iVar.g()).f(iVar.a());
        while (true) {
            i iVar2 = (i) f11.l();
            if (a11 <= 1) {
                return uVarArr[0];
            }
            int i12 = 0;
            while (true) {
                d11 = a11 / 2;
                if (i12 >= ((int) Math.floor(d11))) {
                    break;
                }
                iVar2 = (i) new i.b().g(iVar2.b()).h(iVar2.c()).n(iVar2.e()).o(iVar2.f()).p(i12).f(iVar2.a()).l();
                int i13 = i12 * 2;
                uVarArr[i12] = b(kVar, uVarArr[i13], uVarArr[i13 + 1], iVar2);
                i12++;
            }
            if (a11 % 2 == 1) {
                uVarArr[(int) Math.floor(d11)] = uVarArr[a11 - 1];
            }
            a11 = (int) Math.ceil(a11 / 2.0d);
            f11 = new i.b().g(iVar2.b()).h(iVar2.c()).n(iVar2.e()).o(iVar2.f() + 1).p(iVar2.g()).f(iVar2.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u b(k kVar, u uVar, u uVar2, o oVar) {
        Objects.requireNonNull(uVar, "left == null");
        Objects.requireNonNull(uVar2, "right == null");
        if (uVar.a() == uVar2.a()) {
            Objects.requireNonNull(oVar, "address == null");
            byte[] f11 = kVar.f();
            if (oVar instanceof i) {
                i iVar = (i) oVar;
                oVar = (i) new i.b().g(iVar.b()).h(iVar.c()).n(iVar.e()).o(iVar.f()).p(iVar.g()).f(0).l();
            } else if (oVar instanceof g) {
                g gVar = (g) oVar;
                oVar = (g) new g.b().g(gVar.b()).h(gVar.c()).m(gVar.e()).n(gVar.f()).f(0).k();
            }
            byte[] c11 = kVar.c().c(f11, oVar.d());
            if (oVar instanceof i) {
                i iVar2 = (i) oVar;
                oVar = (i) new i.b().g(iVar2.b()).h(iVar2.c()).n(iVar2.e()).o(iVar2.f()).p(iVar2.g()).f(1).l();
            } else if (oVar instanceof g) {
                g gVar2 = (g) oVar;
                oVar = (g) new g.b().g(gVar2.b()).h(gVar2.c()).m(gVar2.e()).n(gVar2.f()).f(1).k();
            }
            byte[] c12 = kVar.c().c(f11, oVar.d());
            if (oVar instanceof i) {
                i iVar3 = (i) oVar;
                oVar = (i) new i.b().g(iVar3.b()).h(iVar3.c()).n(iVar3.e()).o(iVar3.f()).p(iVar3.g()).f(2).l();
            } else if (oVar instanceof g) {
                g gVar3 = (g) oVar;
                oVar = (g) new g.b().g(gVar3.b()).h(gVar3.c()).m(gVar3.e()).n(gVar3.f()).f(2).k();
            }
            byte[] c13 = kVar.c().c(f11, oVar.d());
            int c14 = kVar.d().c();
            byte[] bArr = new byte[c14 * 2];
            for (int i11 = 0; i11 < c14; i11++) {
                bArr[i11] = (byte) (uVar.b()[i11] ^ c12[i11]);
            }
            for (int i12 = 0; i12 < c14; i12++) {
                bArr[i12 + c14] = (byte) (uVar2.b()[i12] ^ c13[i12]);
            }
            return new u(uVar.a(), kVar.c().b(c11, bArr));
        }
        throw new IllegalStateException("height of both nodes must be equal");
    }
}