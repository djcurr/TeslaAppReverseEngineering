package n60;

import java.math.BigInteger;
import org.spongycastle.math.ec.FixedPointUtil;

/* loaded from: classes5.dex */
public class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f40639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f40640b;

        a(e eVar, i iVar) {
            this.f40639a = eVar;
            this.f40640b = iVar;
        }

        private boolean b(l lVar, int i11) {
            return lVar != null && c(lVar.a(), i11);
        }

        private boolean c(g gVar, int i11) {
            return gVar != null && gVar.a() >= i11;
        }

        @Override // n60.p
        public q a(q qVar) {
            l lVar = qVar instanceof l ? (l) qVar : null;
            int a11 = m.a(this.f40639a);
            int i11 = a11 > 250 ? 6 : 5;
            int i12 = 1 << i11;
            if (b(lVar, i12)) {
                return lVar;
            }
            int i13 = ((a11 + i11) - 1) / i11;
            i[] iVarArr = new i[i11 + 1];
            iVarArr[0] = this.f40640b;
            for (int i14 = 1; i14 < i11; i14++) {
                iVarArr[i14] = iVarArr[i14 - 1].I(i13);
            }
            iVarArr[i11] = iVarArr[0].G(iVarArr[1]);
            this.f40639a.z(iVarArr);
            i[] iVarArr2 = new i[i12];
            iVarArr2[0] = iVarArr[0];
            for (int i15 = i11 - 1; i15 >= 0; i15--) {
                i iVar = iVarArr[i15];
                int i16 = 1 << i15;
                for (int i17 = i16; i17 < i12; i17 += i16 << 1) {
                    iVarArr2[i17] = iVarArr2[i17 - i16].a(iVar);
                }
            }
            this.f40639a.z(iVarArr2);
            l lVar2 = new l();
            lVar2.d(this.f40639a.e(iVarArr2, 0, i12));
            lVar2.e(iVarArr[i11]);
            lVar2.f(i11);
            return lVar2;
        }
    }

    public static int a(e eVar) {
        BigInteger w11 = eVar.w();
        return w11 == null ? eVar.t() + 1 : w11.bitLength();
    }

    public static l b(i iVar) {
        e i11 = iVar.i();
        return (l) i11.B(iVar, FixedPointUtil.PRECOMP_NAME, new a(i11, iVar));
    }
}