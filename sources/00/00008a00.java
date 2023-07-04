package n60;

import java.math.BigInteger;
import org.spongycastle.math.ec.WNafUtil;

/* loaded from: classes5.dex */
public abstract class x {

    /* renamed from: a */
    private static final int[] f40665a = {13, 41, 121, 337, 897, 2305};

    /* renamed from: b */
    private static final byte[] f40666b = new byte[0];

    /* renamed from: c */
    private static final int[] f40667c = new int[0];

    /* renamed from: d */
    private static final i[] f40668d = new i[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements p {

        /* renamed from: a */
        final /* synthetic */ int f40669a;

        a(int i11) {
            this.f40669a = i11;
        }

        @Override // n60.p
        public q a(q qVar) {
            w wVar = qVar instanceof w ? (w) qVar : null;
            if (wVar != null && wVar.b() == this.f40669a) {
                wVar.l(0);
                return wVar;
            }
            w wVar2 = new w();
            wVar2.l(0);
            wVar2.i(this.f40669a);
            if (wVar != null) {
                wVar2.j(wVar.c());
                wVar2.k(wVar.d());
                wVar2.m(wVar.f());
                wVar2.n(wVar.g());
            }
            return wVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements p {

        /* renamed from: a */
        final /* synthetic */ int f40670a;

        /* renamed from: b */
        final /* synthetic */ boolean f40671b;

        /* renamed from: c */
        final /* synthetic */ i f40672c;

        /* renamed from: d */
        final /* synthetic */ e f40673d;

        b(int i11, boolean z11, i iVar, e eVar) {
            this.f40670a = i11;
            this.f40671b = z11;
            this.f40672c = iVar;
            this.f40673d = eVar;
        }

        private boolean b(w wVar, int i11, int i12, boolean z11) {
            return wVar != null && wVar.g() >= Math.max(wVar.b(), i11) && c(wVar.c(), i12) && (!z11 || c(wVar.d(), i12));
        }

        private boolean c(i[] iVarArr, int i11) {
            return iVarArr != null && iVarArr.length >= i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:112:0x00f2 A[LOOP:0: B:111:0x00f0->B:112:0x00f2, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0117 A[LOOP:1: B:122:0x0115->B:123:0x0117, LOOP_END] */
        @Override // n60.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public n60.q a(n60.q r14) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: n60.x.b.a(n60.q):n60.q");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class c implements p {

        /* renamed from: a */
        final /* synthetic */ w f40674a;

        /* renamed from: b */
        final /* synthetic */ boolean f40675b;

        /* renamed from: c */
        final /* synthetic */ j f40676c;

        c(w wVar, boolean z11, j jVar) {
            this.f40674a = wVar;
            this.f40675b = z11;
            this.f40676c = jVar;
        }

        private boolean b(w wVar, int i11, int i12, boolean z11) {
            return wVar != null && wVar.g() >= i11 && c(wVar.c(), i12) && (!z11 || c(wVar.d(), i12));
        }

        private boolean c(i[] iVarArr, int i11) {
            return iVarArr != null && iVarArr.length >= i11;
        }

        @Override // n60.p
        public q a(q qVar) {
            w wVar = qVar instanceof w ? (w) qVar : null;
            int g11 = this.f40674a.g();
            if (b(wVar, g11, this.f40674a.c().length, this.f40675b)) {
                wVar.a();
                return wVar;
            }
            w wVar2 = new w();
            wVar2.l(this.f40674a.e());
            i f11 = this.f40674a.f();
            if (f11 != null) {
                wVar2.m(this.f40676c.a(f11));
            }
            i[] c11 = this.f40674a.c();
            int length = c11.length;
            i[] iVarArr = new i[length];
            for (int i11 = 0; i11 < c11.length; i11++) {
                iVarArr[i11] = this.f40676c.a(c11[i11]);
            }
            wVar2.j(iVarArr);
            wVar2.n(g11);
            if (this.f40675b) {
                i[] iVarArr2 = new i[length];
                for (int i12 = 0; i12 < length; i12++) {
                    iVarArr2[i12] = iVarArr[i12].z();
                }
                wVar2.k(iVarArr2);
            }
            return wVar2;
        }
    }

    public static void c(i iVar) {
        e i11 = iVar.i();
        if (i11 == null) {
            return;
        }
        BigInteger w11 = i11.w();
        i11.B(iVar, WNafUtil.PRECOMP_NAME, new a(Math.min(16, i(w11 == null ? i11.t() + 1 : w11.bitLength()) + 3)));
    }

    public static int[] d(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) == 0) {
            if (bigInteger.signum() == 0) {
                return f40667c;
            }
            BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
            int bitLength = add.bitLength();
            int i11 = bitLength >> 1;
            int[] iArr = new int[i11];
            BigInteger xor = add.xor(bigInteger);
            int i12 = bitLength - 1;
            int i13 = 0;
            int i14 = 1;
            int i15 = 0;
            while (i14 < i12) {
                if (xor.testBit(i14)) {
                    iArr[i13] = i15 | ((bigInteger.testBit(i14) ? -1 : 1) << 16);
                    i14++;
                    i15 = 1;
                    i13++;
                } else {
                    i15++;
                }
                i14++;
            }
            int i16 = i13 + 1;
            iArr[i13] = 65536 | i15;
            return i11 > i16 ? p(iArr, i16) : iArr;
        }
        throw new IllegalArgumentException("'k' must have bitlength < 2^16");
    }

    public static int[] e(int i11, BigInteger bigInteger) {
        if (i11 == 2) {
            return d(bigInteger);
        }
        if (i11 < 2 || i11 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) == 0) {
            if (bigInteger.signum() == 0) {
                return f40667c;
            }
            int bitLength = (bigInteger.bitLength() / i11) + 1;
            int[] iArr = new int[bitLength];
            int i12 = 1 << i11;
            int i13 = i12 - 1;
            int i14 = i12 >>> 1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (i15 <= bigInteger.bitLength()) {
                if (bigInteger.testBit(i15) == z11) {
                    i15++;
                } else {
                    bigInteger = bigInteger.shiftRight(i15);
                    int intValue = bigInteger.intValue() & i13;
                    if (z11) {
                        intValue++;
                    }
                    z11 = (intValue & i14) != 0;
                    if (z11) {
                        intValue -= i12;
                    }
                    if (i16 > 0) {
                        i15--;
                    }
                    iArr[i16] = i15 | (intValue << 16);
                    i15 = i11;
                    i16++;
                }
            }
            return bitLength > i16 ? p(iArr, i16) : iArr;
        }
        throw new IllegalArgumentException("'k' must have bitlength < 2^16");
    }

    public static byte[] f(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return f40666b;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength() - 1;
        byte[] bArr = new byte[bitLength];
        BigInteger xor = add.xor(bigInteger);
        int i11 = 1;
        while (i11 < bitLength) {
            if (xor.testBit(i11)) {
                bArr[i11 - 1] = (byte) (bigInteger.testBit(i11) ? -1 : 1);
                i11++;
            }
            i11++;
        }
        bArr[bitLength - 1] = 1;
        return bArr;
    }

    public static byte[] g(int i11, BigInteger bigInteger) {
        if (i11 == 2) {
            return f(bigInteger);
        }
        if (i11 < 2 || i11 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return f40666b;
        }
        int bitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[bitLength];
        int i12 = 1 << i11;
        int i13 = i12 - 1;
        int i14 = i12 >>> 1;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (i15 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i15) == z11) {
                i15++;
            } else {
                bigInteger = bigInteger.shiftRight(i15);
                int intValue = bigInteger.intValue() & i13;
                if (z11) {
                    intValue++;
                }
                z11 = (intValue & i14) != 0;
                if (z11) {
                    intValue -= i12;
                }
                if (i16 > 0) {
                    i15--;
                }
                int i17 = i16 + i15;
                bArr[i17] = (byte) intValue;
                i16 = i17 + 1;
                i15 = i11;
            }
        }
        return bitLength > i16 ? o(bArr, i16) : bArr;
    }

    public static int h(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static int i(int i11) {
        return k(i11, f40665a, 16);
    }

    public static int j(int i11, int i12) {
        return k(i11, f40665a, i12);
    }

    public static int k(int i11, int[] iArr, int i12) {
        int i13 = 0;
        while (i13 < iArr.length && i11 >= iArr[i13]) {
            i13++;
        }
        return Math.max(2, Math.min(i12, i13 + 2));
    }

    public static w l(i iVar, int i11, boolean z11) {
        e i12 = iVar.i();
        return (w) i12.B(iVar, WNafUtil.PRECOMP_NAME, new b(i11, z11, iVar, i12));
    }

    public static w m(i iVar, j jVar, w wVar, boolean z11) {
        return (w) iVar.i().B(iVar, WNafUtil.PRECOMP_NAME, new c(wVar, z11, jVar));
    }

    public static i[] n(i[] iVarArr, int i11) {
        i[] iVarArr2 = new i[i11];
        System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
        return iVarArr2;
    }

    private static byte[] o(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    private static int[] p(int[] iArr, int i11) {
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        return iArr2;
    }
}