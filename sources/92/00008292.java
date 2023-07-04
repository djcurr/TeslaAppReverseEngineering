package l50;

/* loaded from: classes5.dex */
public class n extends v {
    private static boolean a(byte b11, int i11) {
        return (b11 & (1 << i11)) != 0;
    }

    private static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i11 = 0; i11 != 8; i11++) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 != 8; i14++) {
                int l11 = r70.i.l(bArr, i14 * 4);
                if (a(bArr2[i11], i14)) {
                    i12 += l11;
                } else {
                    i13 += l11;
                }
            }
            byte[] bArr4 = new byte[8];
            r70.i.i(i12, bArr4, 0);
            r70.i.i(i13, bArr4, 4);
            q50.m mVar = new q50.m(new u());
            mVar.init(true, new u50.f1(new u50.h1(new u50.b1(bArr), bArr3), bArr4));
            mVar.processBlock(bArr, 0, bArr, 0);
            mVar.processBlock(bArr, 8, bArr, 8);
            mVar.processBlock(bArr, 16, bArr, 16);
            mVar.processBlock(bArr, 24, bArr, 24);
        }
        return bArr;
    }

    @Override // l50.v, org.bouncycastle.crypto.c0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        u50.b1 b1Var;
        if (iVar instanceof u50.g1) {
            iVar = ((u50.g1) iVar).a();
        }
        u50.i1 i1Var = (u50.i1) iVar;
        if (i1Var.a() instanceof u50.h1) {
            b1Var = (u50.b1) ((u50.h1) i1Var.a()).a();
            bArr = ((u50.h1) i1Var.a()).b();
        } else {
            u50.b1 b1Var2 = (u50.b1) i1Var.a();
            bArr = null;
            b1Var = null;
        }
        u50.b1 b1Var3 = new u50.b1(b(b1Var.a(), i1Var.b(), bArr));
        super.init(z11, bArr != null ? new u50.i1(new u50.h1(b1Var3, bArr), i1Var.b()) : new u50.i1(b1Var3, i1Var.b()));
    }
}