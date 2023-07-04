package i50;

import org.bouncycastle.util.MemoableResetException;

/* loaded from: classes5.dex */
public class b0 extends m {

    /* renamed from: p  reason: collision with root package name */
    private int f29941p;

    /* renamed from: q  reason: collision with root package name */
    private long f29942q;

    /* renamed from: r  reason: collision with root package name */
    private long f29943r;

    /* renamed from: s  reason: collision with root package name */
    private long f29944s;

    /* renamed from: t  reason: collision with root package name */
    private long f29945t;

    /* renamed from: u  reason: collision with root package name */
    private long f29946u;

    /* renamed from: v  reason: collision with root package name */
    private long f29947v;

    /* renamed from: w  reason: collision with root package name */
    private long f29948w;

    /* renamed from: x  reason: collision with root package name */
    private long f29949x;

    public b0(int i11) {
        if (i11 >= 512) {
            throw new IllegalArgumentException("bitLength cannot be >= 512");
        }
        if (i11 % 8 != 0) {
            throw new IllegalArgumentException("bitLength needs to be a multiple of 8");
        }
        if (i11 == 384) {
            throw new IllegalArgumentException("bitLength cannot be 384 use SHA384 instead");
        }
        int i12 = i11 / 8;
        this.f29941p = i12;
        p(i12 * 8);
        reset();
    }

    public b0(b0 b0Var) {
        super(b0Var);
        this.f29941p = b0Var.f29941p;
        a(b0Var);
    }

    private static void n(int i11, byte[] bArr, int i12, int i13) {
        int min = Math.min(4, i13);
        while (true) {
            min--;
            if (min < 0) {
                return;
            }
            bArr[i12 + min] = (byte) (i11 >>> ((3 - min) * 8));
        }
    }

    private static void o(long j11, byte[] bArr, int i11, int i12) {
        if (i12 > 0) {
            n((int) (j11 >>> 32), bArr, i11, i12);
            if (i12 > 4) {
                n((int) (j11 & 4294967295L), bArr, i11 + 4, i12 - 4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x007f, code lost:
        if (r4 > 10) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p(int r4) {
        /*
            r3 = this;
            r0 = -3482333909917012819(0xcfac43c256196cad, double:-6.392239886847908E75)
            r3.f30076e = r0
            r0 = 2216346199247487646(0x1ec20b20216f029e, double:1.604250256667292E-160)
            r3.f30077f = r0
            r0 = -7364697282686394994(0x99cb56d75b315d8e, double:-2.0106609494103695E-184)
            r3.f30078g = r0
            r0 = 65953792586715988(0xea509ffab89354, double:2.9978976005667514E-304)
            r3.f30079h = r0
            r0 = -816286391624063116(0xf4abf7da08432774, double:-1.0252515228978657E254)
            r3.f30080i = r0
            r0 = 4512832404995164602(0x3ea0cd298e9bc9ba, double:5.007211971427005E-7)
            r3.f30081j = r0
            r0 = -5033199132376557362(0xba267c0e5ee418ce, double:-1.418977391716189E-28)
            r3.f30082k = r0
            r0 = -124578254951840548(0xfe4568bcb6db84dc, double:-1.7921927020935902E300)
            r3.f30083l = r0
            r0 = 83
            r3.update(r0)
            r0 = 72
            r3.update(r0)
            r0 = 65
            r3.update(r0)
            r0 = 45
            r3.update(r0)
            r0 = 53
            r3.update(r0)
            r0 = 49
            r3.update(r0)
            r0 = 50
            r3.update(r0)
            r0 = 47
            r3.update(r0)
            r0 = 100
            r1 = 10
            if (r4 <= r0) goto L7f
            int r2 = r4 / 100
            int r2 = r2 + 48
            byte r2 = (byte) r2
            r3.update(r2)
            int r4 = r4 % r0
        L6f:
            int r0 = r4 / 10
            int r0 = r0 + 48
            byte r0 = (byte) r0
            r3.update(r0)
            int r4 = r4 % r1
        L78:
            int r4 = r4 + 48
            byte r4 = (byte) r4
            r3.update(r4)
            goto L82
        L7f:
            if (r4 <= r1) goto L78
            goto L6f
        L82:
            r3.j()
            long r0 = r3.f30076e
            r3.f29942q = r0
            long r0 = r3.f30077f
            r3.f29943r = r0
            long r0 = r3.f30078g
            r3.f29944s = r0
            long r0 = r3.f30079h
            r3.f29945t = r0
            long r0 = r3.f30080i
            r3.f29946u = r0
            long r0 = r3.f30081j
            r3.f29947v = r0
            long r0 = r3.f30082k
            r3.f29948w = r0
            long r0 = r3.f30083l
            r3.f29949x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i50.b0.p(int):void");
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        b0 b0Var = (b0) hVar;
        if (this.f29941p != b0Var.f29941p) {
            throw new MemoableResetException("digestLength inappropriate in other");
        }
        super.i(b0Var);
        this.f29942q = b0Var.f29942q;
        this.f29943r = b0Var.f29943r;
        this.f29944s = b0Var.f29944s;
        this.f29945t = b0Var.f29945t;
        this.f29946u = b0Var.f29946u;
        this.f29947v = b0Var.f29947v;
        this.f29948w = b0Var.f29948w;
        this.f29949x = b0Var.f29949x;
    }

    @Override // r70.h
    public r70.h copy() {
        return new b0(this);
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        j();
        o(this.f30076e, bArr, i11, this.f29941p);
        o(this.f30077f, bArr, i11 + 8, this.f29941p - 8);
        o(this.f30078g, bArr, i11 + 16, this.f29941p - 16);
        o(this.f30079h, bArr, i11 + 24, this.f29941p - 24);
        o(this.f30080i, bArr, i11 + 32, this.f29941p - 32);
        o(this.f30081j, bArr, i11 + 40, this.f29941p - 40);
        o(this.f30082k, bArr, i11 + 48, this.f29941p - 48);
        o(this.f30083l, bArr, i11 + 56, this.f29941p - 56);
        reset();
        return this.f29941p;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.f29941p * 8);
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return this.f29941p;
    }

    @Override // i50.m, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30076e = this.f29942q;
        this.f30077f = this.f29943r;
        this.f30078g = this.f29944s;
        this.f30079h = this.f29945t;
        this.f30080i = this.f29946u;
        this.f30081j = this.f29947v;
        this.f30082k = this.f29948w;
        this.f30083l = this.f29949x;
    }
}