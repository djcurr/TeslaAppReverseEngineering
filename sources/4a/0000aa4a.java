package p50;

import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.v;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class l implements v {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.crypto.e f46274a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f46275b;

    /* renamed from: c  reason: collision with root package name */
    private int f46276c;

    /* renamed from: d  reason: collision with root package name */
    private int f46277d;

    /* renamed from: e  reason: collision with root package name */
    private int f46278e;

    /* renamed from: f  reason: collision with root package name */
    private int f46279f;

    /* renamed from: g  reason: collision with root package name */
    private int f46280g;

    /* renamed from: h  reason: collision with root package name */
    private int f46281h;

    /* renamed from: i  reason: collision with root package name */
    private int f46282i;

    /* renamed from: j  reason: collision with root package name */
    private int f46283j;

    /* renamed from: k  reason: collision with root package name */
    private int f46284k;

    /* renamed from: l  reason: collision with root package name */
    private int f46285l;

    /* renamed from: m  reason: collision with root package name */
    private int f46286m;

    /* renamed from: n  reason: collision with root package name */
    private int f46287n;

    /* renamed from: o  reason: collision with root package name */
    private int f46288o;

    /* renamed from: p  reason: collision with root package name */
    private final byte[] f46289p;

    /* renamed from: q  reason: collision with root package name */
    private int f46290q;

    /* renamed from: r  reason: collision with root package name */
    private int f46291r;

    /* renamed from: s  reason: collision with root package name */
    private int f46292s;

    /* renamed from: t  reason: collision with root package name */
    private int f46293t;

    /* renamed from: u  reason: collision with root package name */
    private int f46294u;

    /* renamed from: v  reason: collision with root package name */
    private int f46295v;

    public l() {
        this.f46275b = new byte[1];
        this.f46289p = new byte[16];
        this.f46290q = 0;
        this.f46274a = null;
    }

    public l(org.bouncycastle.crypto.e eVar) {
        this.f46275b = new byte[1];
        this.f46289p = new byte[16];
        this.f46290q = 0;
        if (eVar.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.f46274a = eVar;
    }

    private static final long a(int i11, int i12) {
        return (i11 & 4294967295L) * i12;
    }

    private void b() {
        int i11 = this.f46290q;
        if (i11 < 16) {
            this.f46289p[i11] = 1;
            for (int i12 = i11 + 1; i12 < 16; i12++) {
                this.f46289p[i12] = 0;
            }
        }
        long l11 = r70.i.l(this.f46289p, 0) & 4294967295L;
        long l12 = r70.i.l(this.f46289p, 4) & 4294967295L;
        long l13 = r70.i.l(this.f46289p, 8) & 4294967295L;
        long l14 = 4294967295L & r70.i.l(this.f46289p, 12);
        int i13 = (int) (this.f46291r + (l11 & 67108863));
        this.f46291r = i13;
        this.f46292s = (int) (this.f46292s + ((((l12 << 32) | l11) >>> 26) & 67108863));
        this.f46293t = (int) (this.f46293t + (((l12 | (l13 << 32)) >>> 20) & 67108863));
        this.f46294u = (int) (this.f46294u + ((((l14 << 32) | l13) >>> 14) & 67108863));
        int i14 = (int) (this.f46295v + (l14 >>> 8));
        this.f46295v = i14;
        if (this.f46290q == 16) {
            this.f46295v = i14 + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        long a11 = a(i13, this.f46276c) + a(this.f46292s, this.f46284k) + a(this.f46293t, this.f46283j) + a(this.f46294u, this.f46282i) + a(this.f46295v, this.f46281h);
        long a12 = a(this.f46291r, this.f46277d) + a(this.f46292s, this.f46276c) + a(this.f46293t, this.f46284k) + a(this.f46294u, this.f46283j) + a(this.f46295v, this.f46282i);
        long a13 = a(this.f46291r, this.f46278e) + a(this.f46292s, this.f46277d) + a(this.f46293t, this.f46276c) + a(this.f46294u, this.f46284k) + a(this.f46295v, this.f46283j);
        long a14 = a(this.f46291r, this.f46279f) + a(this.f46292s, this.f46278e) + a(this.f46293t, this.f46277d) + a(this.f46294u, this.f46276c) + a(this.f46295v, this.f46284k);
        long a15 = a(this.f46291r, this.f46280g) + a(this.f46292s, this.f46279f) + a(this.f46293t, this.f46278e) + a(this.f46294u, this.f46277d) + a(this.f46295v, this.f46276c);
        int i15 = ((int) a11) & 67108863;
        this.f46291r = i15;
        long j11 = a12 + (a11 >>> 26);
        int i16 = ((int) j11) & 67108863;
        this.f46292s = i16;
        long j12 = a13 + (j11 >>> 26);
        this.f46293t = ((int) j12) & 67108863;
        long j13 = a14 + (j12 >>> 26);
        this.f46294u = ((int) j13) & 67108863;
        long j14 = a15 + (j13 >>> 26);
        this.f46295v = ((int) j14) & 67108863;
        int i17 = i15 + (((int) (j14 >>> 26)) * 5);
        this.f46291r = i17;
        this.f46292s = i16 + (i17 >>> 26);
        this.f46291r = i17 & 67108863;
    }

    private void c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i11 = 16;
        if (this.f46274a != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int l11 = r70.i.l(bArr, 0);
        int l12 = r70.i.l(bArr, 4);
        int l13 = r70.i.l(bArr, 8);
        int l14 = r70.i.l(bArr, 12);
        this.f46276c = 67108863 & l11;
        int i12 = ((l11 >>> 26) | (l12 << 6)) & 67108611;
        this.f46277d = i12;
        int i13 = ((l12 >>> 20) | (l13 << 12)) & 67092735;
        this.f46278e = i13;
        int i14 = ((l13 >>> 14) | (l14 << 18)) & 66076671;
        this.f46279f = i14;
        int i15 = (l14 >>> 8) & 1048575;
        this.f46280g = i15;
        this.f46281h = i12 * 5;
        this.f46282i = i13 * 5;
        this.f46283j = i14 * 5;
        this.f46284k = i15 * 5;
        org.bouncycastle.crypto.e eVar = this.f46274a;
        if (eVar != null) {
            byte[] bArr3 = new byte[16];
            eVar.init(true, new b1(bArr, 16, 16));
            this.f46274a.processBlock(bArr2, 0, bArr3, 0);
            i11 = 0;
            bArr = bArr3;
        }
        this.f46285l = r70.i.l(bArr, i11 + 0);
        this.f46286m = r70.i.l(bArr, i11 + 4);
        this.f46287n = r70.i.l(bArr, i11 + 8);
        this.f46288o = r70.i.l(bArr, i11 + 12);
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (i11 + 16 <= bArr.length) {
            if (this.f46290q > 0) {
                b();
            }
            int i17 = this.f46292s;
            int i18 = this.f46291r;
            int i19 = i17 + (i18 >>> 26);
            this.f46292s = i19;
            int i21 = i18 & 67108863;
            this.f46291r = i21;
            int i22 = this.f46293t + (i19 >>> 26);
            this.f46293t = i22;
            int i23 = i19 & 67108863;
            this.f46292s = i23;
            int i24 = this.f46294u + (i22 >>> 26);
            this.f46294u = i24;
            int i25 = i22 & 67108863;
            this.f46293t = i25;
            int i26 = this.f46295v + (i24 >>> 26);
            this.f46295v = i26;
            int i27 = i24 & 67108863;
            this.f46294u = i27;
            int i28 = i21 + ((i26 >>> 26) * 5);
            this.f46291r = i28;
            int i29 = i26 & 67108863;
            this.f46295v = i29;
            int i31 = i23 + (i28 >>> 26);
            this.f46292s = i31;
            int i32 = i28 & 67108863;
            this.f46291r = i32;
            int i33 = i32 + 5;
            int i34 = (i33 >>> 26) + i31;
            int i35 = (i34 >>> 26) + i25;
            int i36 = (i35 >>> 26) + i27;
            int i37 = 67108863 & i36;
            int i38 = ((i36 >>> 26) + i29) - 67108864;
            int i39 = (i38 >>> 31) - 1;
            int i41 = ~i39;
            this.f46291r = (i32 & i41) | (i33 & 67108863 & i39);
            this.f46292s = (i31 & i41) | (i34 & 67108863 & i39);
            this.f46293t = (i25 & i41) | (i35 & 67108863 & i39);
            this.f46294u = (i37 & i39) | (i27 & i41);
            this.f46295v = (i29 & i41) | (i38 & i39);
            long j11 = ((i12 | (i13 << 26)) & 4294967295L) + (this.f46285l & 4294967295L);
            r70.i.i((int) j11, bArr, i11);
            long j12 = (((i13 >>> 6) | (i14 << 20)) & 4294967295L) + (this.f46286m & 4294967295L) + (j11 >>> 32);
            r70.i.i((int) j12, bArr, i11 + 4);
            long j13 = (((i14 >>> 12) | (i15 << 14)) & 4294967295L) + (this.f46287n & 4294967295L) + (j12 >>> 32);
            r70.i.i((int) j13, bArr, i11 + 8);
            r70.i.i((int) ((((i15 >>> 18) | (i16 << 8)) & 4294967295L) + (4294967295L & this.f46288o) + (j13 >>> 32)), bArr, i11 + 12);
            reset();
            return 16;
        }
        throw new OutputLengthException("Output buffer is too short.");
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        if (this.f46274a == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.f46274a.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        if (this.f46274a == null) {
            bArr = null;
        } else if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
        } else {
            f1 f1Var = (f1) iVar;
            bArr = f1Var.a();
            iVar = f1Var.b();
        }
        if (!(iVar instanceof b1)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        c(((b1) iVar).a(), bArr);
        reset();
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        this.f46290q = 0;
        this.f46295v = 0;
        this.f46294u = 0;
        this.f46293t = 0;
        this.f46292s = 0;
        this.f46291r = 0;
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        byte[] bArr = this.f46275b;
        bArr[0] = b11;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i12 > i13) {
            if (this.f46290q == 16) {
                b();
                this.f46290q = 0;
            }
            int min = Math.min(i12 - i13, 16 - this.f46290q);
            System.arraycopy(bArr, i13 + i11, this.f46289p, this.f46290q, min);
            i13 += min;
            this.f46290q += min;
        }
    }
}