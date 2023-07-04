package n60;

import java.math.BigInteger;
import n60.e;
import n60.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final BigInteger f40649a;

    /* renamed from: b  reason: collision with root package name */
    private static final BigInteger f40650b;

    /* renamed from: c  reason: collision with root package name */
    private static final BigInteger f40651c;

    /* renamed from: d  reason: collision with root package name */
    public static final a0[] f40652d;

    /* renamed from: e  reason: collision with root package name */
    public static final byte[][] f40653e;

    /* renamed from: f  reason: collision with root package name */
    public static final a0[] f40654f;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[][] f40655g;

    static {
        BigInteger bigInteger = d.f40585b;
        BigInteger negate = bigInteger.negate();
        f40649a = negate;
        f40650b = d.f40586c.negate();
        BigInteger negate2 = d.f40587d.negate();
        f40651c = negate2;
        BigInteger bigInteger2 = d.f40584a;
        f40652d = new a0[]{null, new a0(bigInteger, bigInteger2), null, new a0(negate2, negate), null, new a0(negate, negate), null, new a0(bigInteger, negate), null};
        f40653e = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        f40654f = new a0[]{null, new a0(bigInteger, bigInteger2), null, new a0(negate2, bigInteger), null, new a0(negate, bigInteger), null, new a0(bigInteger, bigInteger), null};
        f40655g = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static s a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b11, int i11, int i12) {
        int i13 = ((i11 + 5) / 2) + i12;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i11 - i13) - 2) + b11));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i11)));
        int i14 = i13 - i12;
        BigInteger shiftRight = add.shiftRight(i14);
        if (add.testBit(i14 - 1)) {
            shiftRight = shiftRight.add(d.f40585b);
        }
        return new s(shiftRight, i12);
    }

    public static BigInteger[] b(byte b11, int i11, boolean z11) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b11 == 1 || b11 == -1) {
            if (z11) {
                bigInteger = d.f40586c;
                bigInteger2 = BigInteger.valueOf(b11);
            } else {
                bigInteger = d.f40584a;
                bigInteger2 = d.f40585b;
            }
            int i12 = 1;
            while (i12 < i11) {
                i12++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b11 == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static byte c(int i11) {
        return (byte) (i11 == 0 ? -1 : 1);
    }

    public static i.b[] d(i.b bVar, byte b11) {
        byte[][] bArr = b11 == 0 ? f40653e : f40655g;
        i.b[] bVarArr = new i.b[(bArr.length + 1) >>> 1];
        bVarArr[0] = bVar;
        int length = bArr.length;
        for (int i11 = 3; i11 < length; i11 += 2) {
            bVarArr[i11 >>> 1] = h(bVar, bArr[i11]);
        }
        bVar.i().z(bVarArr);
        return bVarArr;
    }

    protected static int e(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(d.f40586c)) {
                return 1;
            }
            if (bigInteger.equals(d.f40588e)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] f(e.b bVar) {
        if (bVar.I()) {
            int t11 = bVar.t();
            int intValue = bVar.n().t().intValue();
            byte c11 = c(intValue);
            int e11 = e(bVar.p());
            BigInteger[] b11 = b(c11, (t11 + 3) - intValue, false);
            if (c11 == 1) {
                b11[0] = b11[0].negate();
                b11[1] = b11[1].negate();
            }
            BigInteger bigInteger = d.f40585b;
            return new BigInteger[]{bigInteger.add(b11[1]).shiftRight(e11), bigInteger.add(b11[0]).shiftRight(e11).negate()};
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    public static BigInteger g(byte b11, int i11) {
        if (i11 == 4) {
            return b11 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] b12 = b(b11, i11, false);
        BigInteger bit = d.f40584a.setBit(i11);
        return d.f40586c.multiply(b12[0]).multiply(b12[1].modInverse(bit)).mod(bit);
    }

    public static i.b h(i.b bVar, byte[] bArr) {
        i.b bVar2 = (i.b) bVar.i().u();
        i.b bVar3 = (i.b) bVar.z();
        int i11 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i11++;
            byte b11 = bArr[length];
            if (b11 != 0) {
                bVar2 = (i.b) bVar2.L(i11).a(b11 > 0 ? bVar : bVar3);
                i11 = 0;
            }
        }
        return i11 > 0 ? bVar2.L(i11) : bVar2;
    }

    public static BigInteger i(byte b11, a0 a0Var) {
        BigInteger subtract;
        BigInteger bigInteger = a0Var.f40582a;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = a0Var.f40582a.multiply(a0Var.f40583b);
        BigInteger bigInteger2 = a0Var.f40583b;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b11 == 1) {
            subtract = multiply.add(multiply2);
        } else if (b11 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        } else {
            subtract = multiply.subtract(multiply2);
        }
        return subtract.add(shiftLeft);
    }

    public static a0 j(BigInteger bigInteger, int i11, byte b11, BigInteger[] bigIntegerArr, byte b12, byte b13) {
        BigInteger add = b12 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = b(b12, i11, true)[1];
        a0 k11 = k(a(bigInteger, bigIntegerArr[0], bigInteger2, b11, i11, b13), a(bigInteger, bigIntegerArr[1], bigInteger2, b11, i11, b13), b12);
        return new a0(bigInteger.subtract(add.multiply(k11.f40582a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(k11.f40583b)), bigIntegerArr[1].multiply(k11.f40582a).subtract(bigIntegerArr[0].multiply(k11.f40583b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r5.d(n60.t.f40649a) < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        if (r5.d(r9) >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r8.d(n60.t.f40650b) < 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static n60.a0 k(n60.s r8, n60.s r9, byte r10) {
        /*
            int r0 = r8.f()
            int r1 = r9.f()
            if (r1 != r0) goto La7
            r0 = -1
            r1 = 1
            if (r10 == r1) goto L19
            if (r10 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "mu must be 1 or -1"
            r8.<init>(r9)
            throw r8
        L19:
            java.math.BigInteger r2 = r8.h()
            java.math.BigInteger r3 = r9.h()
            n60.s r8 = r8.i(r2)
            n60.s r9 = r9.i(r3)
            n60.s r4 = r8.a(r8)
            if (r10 != r1) goto L34
            n60.s r4 = r4.a(r9)
            goto L38
        L34:
            n60.s r4 = r4.j(r9)
        L38:
            n60.s r5 = r9.a(r9)
            n60.s r5 = r5.a(r9)
            n60.s r9 = r5.a(r9)
            if (r10 != r1) goto L4f
            n60.s r5 = r8.j(r5)
            n60.s r8 = r8.a(r9)
            goto L57
        L4f:
            n60.s r5 = r8.a(r5)
            n60.s r8 = r8.j(r9)
        L57:
            java.math.BigInteger r9 = n60.d.f40585b
            int r6 = r4.d(r9)
            r7 = 0
            if (r6 < 0) goto L69
            java.math.BigInteger r6 = n60.t.f40649a
            int r6 = r5.d(r6)
            if (r6 >= 0) goto L75
            goto L71
        L69:
            java.math.BigInteger r1 = n60.d.f40586c
            int r1 = r8.d(r1)
            if (r1 < 0) goto L74
        L71:
            r1 = r7
            r7 = r10
            goto L75
        L74:
            r1 = r7
        L75:
            java.math.BigInteger r6 = n60.t.f40649a
            int r4 = r4.d(r6)
            if (r4 >= 0) goto L84
            int r8 = r5.d(r9)
            if (r8 < 0) goto L8f
            goto L8c
        L84:
            java.math.BigInteger r9 = n60.t.f40650b
            int r8 = r8.d(r9)
            if (r8 >= 0) goto L8e
        L8c:
            int r8 = -r10
            byte r7 = (byte) r8
        L8e:
            r0 = r1
        L8f:
            long r8 = (long) r0
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r2.add(r8)
            long r9 = (long) r7
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r9 = r3.add(r9)
            n60.a0 r10 = new n60.a0
            r10.<init>(r8, r9)
            return r10
        La7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "lambda0 and lambda1 do not have same scale"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n60.t.k(n60.s, n60.s, byte):n60.a0");
    }

    public static byte[] l(byte b11, a0 a0Var, byte b12, BigInteger bigInteger, BigInteger bigInteger2, a0[] a0VarArr) {
        boolean z11;
        if (b11 != 1 && b11 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = i(b11, a0Var).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 + b12 : b12 + 34];
        BigInteger shiftRight = bigInteger.shiftRight(1);
        BigInteger bigInteger3 = a0Var.f40582a;
        BigInteger bigInteger4 = a0Var.f40583b;
        int i11 = 0;
        while (true) {
            BigInteger bigInteger5 = d.f40584a;
            if (bigInteger3.equals(bigInteger5) && bigInteger4.equals(bigInteger5)) {
                return bArr;
            }
            if (bigInteger3.testBit(0)) {
                BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                if (mod.compareTo(shiftRight) >= 0) {
                    mod = mod.subtract(bigInteger);
                }
                byte intValue = (byte) mod.intValue();
                bArr[i11] = intValue;
                if (intValue < 0) {
                    intValue = (byte) (-intValue);
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    bigInteger3 = bigInteger3.subtract(a0VarArr[intValue].f40582a);
                    bigInteger4 = bigInteger4.subtract(a0VarArr[intValue].f40583b);
                } else {
                    bigInteger3 = bigInteger3.add(a0VarArr[intValue].f40582a);
                    bigInteger4 = bigInteger4.add(a0VarArr[intValue].f40583b);
                }
            } else {
                bArr[i11] = 0;
            }
            BigInteger shiftRight2 = bigInteger3.shiftRight(1);
            BigInteger add = b11 == 1 ? bigInteger4.add(shiftRight2) : bigInteger4.subtract(shiftRight2);
            BigInteger negate = bigInteger3.shiftRight(1).negate();
            i11++;
            bigInteger3 = add;
            bigInteger4 = negate;
        }
    }
}