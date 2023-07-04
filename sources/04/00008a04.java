package n60;

import java.math.BigInteger;
import n60.e;
import n60.i;

/* loaded from: classes5.dex */
public class y extends b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b f40677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ byte f40678b;

        a(i.b bVar, byte b11) {
            this.f40677a = bVar;
            this.f40678b = b11;
        }

        @Override // n60.p
        public q a(q qVar) {
            if (qVar instanceof z) {
                return qVar;
            }
            z zVar = new z();
            zVar.b(t.d(this.f40677a, this.f40678b));
            return zVar;
        }
    }

    private static i.b d(i.b bVar, byte[] bArr) {
        e.b bVar2 = (e.b) bVar.i();
        i.b[] a11 = ((z) bVar2.B(bVar, "bc_wtnaf", new a(bVar, bVar2.n().t().byteValue()))).a();
        i.b[] bVarArr = new i.b[a11.length];
        for (int i11 = 0; i11 < a11.length; i11++) {
            bVarArr[i11] = (i.b) a11[i11].z();
        }
        i.b bVar3 = (i.b) bVar.i().u();
        int i12 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i12++;
            byte b11 = bArr[length];
            if (b11 != 0) {
                bVar3 = (i.b) bVar3.L(i12).a(b11 > 0 ? a11[b11 >>> 1] : bVarArr[(-b11) >>> 1]);
                i12 = 0;
            }
        }
        return i12 > 0 ? bVar3.L(i12) : bVar3;
    }

    private i.b e(i.b bVar, a0 a0Var, byte b11, byte b12) {
        a0[] a0VarArr = b11 == 0 ? t.f40652d : t.f40654f;
        return d(bVar, t.l(b12, a0Var, (byte) 4, BigInteger.valueOf(16L), t.g(b12, 4), a0VarArr));
    }

    @Override // n60.b
    protected i c(i iVar, BigInteger bigInteger) {
        if (iVar instanceof i.b) {
            i.b bVar = (i.b) iVar;
            e.b bVar2 = (e.b) bVar.i();
            int t11 = bVar2.t();
            byte byteValue = bVar2.n().t().byteValue();
            byte c11 = t.c(byteValue);
            return e(bVar, t.j(bigInteger, t11, byteValue, bVar2.G(), c11, (byte) 10), byteValue, c11);
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }
}