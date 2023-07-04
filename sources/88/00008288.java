package l50;

import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class i1 extends g1 {

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f36779l = {34, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, Tnaf.POW_2_WIDTH, 48};

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f36780m = {34, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, Tnaf.POW_2_WIDTH, 48};

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f36781n = {35, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, Tnaf.POW_2_WIDTH, 48};

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f36782o = {35, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, Tnaf.POW_2_WIDTH, 48};

    /* renamed from: k  reason: collision with root package name */
    private byte[] f36783k;

    /* JADX INFO: Access modifiers changed from: protected */
    public i1() {
        this.f36783k = f36779l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i1(int i11) {
        if (i11 == 32) {
            this.f36783k = f36780m;
        } else if (i11 == 64) {
            this.f36783k = f36781n;
        } else if (i11 == 128) {
            this.f36783k = f36782o;
        } else {
            throw new IllegalArgumentException("Unsupported length: " + i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i1(i1 i1Var) {
        super(i1Var);
    }

    private static int t(byte b11, byte b12, byte b13, byte b14) {
        return ((b11 & 255) << 23) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    @Override // l50.g1, r70.h
    public void a(r70.h hVar) {
        super.a(hVar);
        this.f36783k = ((i1) hVar).f36783k;
    }

    @Override // l50.g1, r70.h
    public r70.h copy() {
        return new i1(this);
    }

    @Override // l50.g1, org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "Zuc-256";
    }

    @Override // l50.g1
    protected int n() {
        return 625;
    }

    @Override // l50.g1
    protected void s(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new IllegalArgumentException("A key of 32 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 25) {
            throw new IllegalArgumentException("An IV of 25 bytes is needed");
        }
        iArr[0] = t(bArr[0], this.f36783k[0], bArr[21], bArr[16]);
        iArr[1] = t(bArr[1], this.f36783k[1], bArr[22], bArr[17]);
        iArr[2] = t(bArr[2], this.f36783k[2], bArr[23], bArr[18]);
        iArr[3] = t(bArr[3], this.f36783k[3], bArr[24], bArr[19]);
        iArr[4] = t(bArr[4], this.f36783k[4], bArr[25], bArr[20]);
        iArr[5] = t(bArr2[0], (byte) (this.f36783k[5] | (bArr2[17] & 63)), bArr[5], bArr[26]);
        iArr[6] = t(bArr2[1], (byte) (this.f36783k[6] | (bArr2[18] & 63)), bArr[6], bArr[27]);
        iArr[7] = t(bArr2[10], (byte) (this.f36783k[7] | (bArr2[19] & 63)), bArr[7], bArr2[2]);
        iArr[8] = t(bArr[8], (byte) (this.f36783k[8] | (bArr2[20] & 63)), bArr2[3], bArr2[11]);
        iArr[9] = t(bArr[9], (byte) ((bArr2[21] & 63) | this.f36783k[9]), bArr2[12], bArr2[4]);
        iArr[10] = t(bArr2[5], (byte) (this.f36783k[10] | (bArr2[22] & 63)), bArr[10], bArr[28]);
        iArr[11] = t(bArr[11], (byte) (this.f36783k[11] | (bArr2[23] & 63)), bArr2[6], bArr2[13]);
        iArr[12] = t(bArr[12], (byte) (this.f36783k[12] | (bArr2[24] & 63)), bArr2[7], bArr2[14]);
        iArr[13] = t(bArr[13], this.f36783k[13], bArr2[15], bArr2[8]);
        iArr[14] = t(bArr[14], (byte) (this.f36783k[14] | ((bArr[31] >>> 4) & 15)), bArr2[16], bArr2[9]);
        iArr[15] = t(bArr[15], (byte) (this.f36783k[15] | (bArr[31] & 15)), bArr[30], bArr[29]);
    }
}