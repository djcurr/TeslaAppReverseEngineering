package y50;

import java.math.BigInteger;
import org.bouncycastle.crypto.z;
import org.spongycastle.crypto.signers.PSSSigner;
import u50.n1;

/* loaded from: classes5.dex */
public class t implements z {

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.crypto.p f59209g;

    /* renamed from: h  reason: collision with root package name */
    private org.bouncycastle.crypto.a f59210h;

    /* renamed from: i  reason: collision with root package name */
    private n1 f59211i;

    /* renamed from: j  reason: collision with root package name */
    private int f59212j;

    /* renamed from: k  reason: collision with root package name */
    private int f59213k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f59214l;

    public t(org.bouncycastle.crypto.a aVar, org.bouncycastle.crypto.p pVar) {
        this(aVar, pVar, false);
    }

    public t(org.bouncycastle.crypto.a aVar, org.bouncycastle.crypto.p pVar, boolean z11) {
        int intValue;
        this.f59210h = aVar;
        this.f59209g = pVar;
        if (z11) {
            intValue = 188;
        } else {
            Integer a11 = n.a(pVar);
            if (a11 == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + pVar.getAlgorithmName());
            }
            intValue = a11.intValue();
        }
        this.f59212j = intValue;
    }

    private void a(byte[] bArr) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = 0;
        }
    }

    private void b(int i11) {
        int i12;
        byte[] bArr;
        int digestSize = this.f59209g.getDigestSize();
        if (i11 == 188) {
            byte[] bArr2 = this.f59214l;
            i12 = (bArr2.length - digestSize) - 1;
            this.f59209g.doFinal(bArr2, i12);
            this.f59214l[bArr.length - 1] = PSSSigner.TRAILER_IMPLICIT;
        } else {
            byte[] bArr3 = this.f59214l;
            int length = (bArr3.length - digestSize) - 2;
            this.f59209g.doFinal(bArr3, length);
            byte[] bArr4 = this.f59214l;
            bArr4[bArr4.length - 2] = (byte) (i11 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i11;
            i12 = length;
        }
        this.f59214l[0] = 107;
        for (int i13 = i12 - 2; i13 != 0; i13--) {
            this.f59214l[i13] = -69;
        }
        this.f59214l[i12 - 1] = -70;
    }

    public void c() {
        this.f59209g.reset();
    }

    @Override // org.bouncycastle.crypto.z
    public byte[] generateSignature() {
        b(this.f59212j);
        org.bouncycastle.crypto.a aVar = this.f59210h;
        byte[] bArr = this.f59214l;
        BigInteger bigInteger = new BigInteger(1, aVar.processBlock(bArr, 0, bArr.length));
        a(this.f59214l);
        return r70.a.b(r70.a.i(this.f59211i.c()), bigInteger.min(this.f59211i.c().subtract(bigInteger)));
    }

    @Override // org.bouncycastle.crypto.z
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        n1 n1Var = (n1) iVar;
        this.f59211i = n1Var;
        this.f59210h.init(z11, n1Var);
        int bitLength = this.f59211i.c().bitLength();
        this.f59213k = bitLength;
        this.f59214l = new byte[(bitLength + 7) / 8];
        c();
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte b11) {
        this.f59209g.update(b11);
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte[] bArr, int i11, int i12) {
        this.f59209g.update(bArr, i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if ((r4.intValue() & 15) == 12) goto L10;
     */
    @Override // org.bouncycastle.crypto.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean verifySignature(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            org.bouncycastle.crypto.a r1 = r3.f59210h     // Catch: java.lang.Exception -> L5e
            int r2 = r4.length     // Catch: java.lang.Exception -> L5e
            byte[] r4 = r1.processBlock(r4, r0, r2)     // Catch: java.lang.Exception -> L5e
            r3.f59214l = r4     // Catch: java.lang.Exception -> L5e
            java.math.BigInteger r4 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = r3.f59214l
            r4.<init>(r1, r2)
            int r1 = r4.intValue()
            r1 = r1 & 15
            r2 = 12
            if (r1 != r2) goto L1d
            goto L2f
        L1d:
            u50.n1 r1 = r3.f59211i
            java.math.BigInteger r1 = r1.c()
            java.math.BigInteger r4 = r1.subtract(r4)
            int r1 = r4.intValue()
            r1 = r1 & 15
            if (r1 != r2) goto L5e
        L2f:
            int r0 = r3.f59212j
            r3.b(r0)
            byte[] r0 = r3.f59214l
            int r0 = r0.length
            byte[] r4 = r70.a.b(r0, r4)
            byte[] r0 = r3.f59214l
            boolean r0 = org.bouncycastle.util.a.u(r0, r4)
            int r1 = r3.f59212j
            r2 = 15052(0x3acc, float:2.1092E-41)
            if (r1 != r2) goto L56
            if (r0 != 0) goto L56
            byte[] r0 = r3.f59214l
            int r1 = r0.length
            int r1 = r1 + (-2)
            r2 = 64
            r0[r1] = r2
            boolean r0 = org.bouncycastle.util.a.u(r0, r4)
        L56:
            byte[] r1 = r3.f59214l
            r3.a(r1)
            r3.a(r4)
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y50.t.verifySignature(byte[]):boolean");
    }
}