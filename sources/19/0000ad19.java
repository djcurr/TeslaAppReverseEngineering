package q50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.a0;
import u50.f1;

/* loaded from: classes5.dex */
public class y extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.crypto.e f47779b;

    /* renamed from: c  reason: collision with root package name */
    private final int f47780c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47781d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47782e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f47783f;

    /* renamed from: g  reason: collision with root package name */
    private int f47784g;

    public y(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f47779b = eVar;
        int blockSize = eVar.getBlockSize();
        this.f47780c = blockSize;
        this.f47781d = new byte[blockSize];
        this.f47782e = new byte[blockSize];
        this.f47783f = new byte[blockSize];
        this.f47784g = 0;
    }

    private void c() {
        byte b11;
        int length = this.f47782e.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
            byte[] bArr = this.f47782e;
            b11 = (byte) (bArr[length] + 1);
            bArr[length] = b11;
        } while (b11 == 0);
        byte[] bArr2 = this.f47781d;
        if (length < bArr2.length && bArr2.length < this.f47780c) {
            throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
        }
    }

    @Override // org.bouncycastle.crypto.a0
    protected byte a(byte b11) {
        int i11 = this.f47784g;
        if (i11 == 0) {
            this.f47779b.processBlock(this.f47782e, 0, this.f47783f, 0);
            byte[] bArr = this.f47783f;
            int i12 = this.f47784g;
            this.f47784g = i12 + 1;
            return (byte) (b11 ^ bArr[i12]);
        }
        byte[] bArr2 = this.f47783f;
        int i13 = i11 + 1;
        this.f47784g = i13;
        byte b12 = (byte) (b11 ^ bArr2[i11]);
        if (i13 == this.f47782e.length) {
            this.f47784g = 0;
            c();
        }
        return b12;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47779b.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47779b.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        f1 f1Var = (f1) iVar;
        byte[] h11 = org.bouncycastle.util.a.h(f1Var.a());
        this.f47781d = h11;
        int i11 = this.f47780c;
        if (i11 < h11.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.f47780c + " bytes.");
        }
        int i12 = 8 > i11 / 2 ? i11 / 2 : 8;
        if (i11 - h11.length <= i12) {
            if (f1Var.b() != null) {
                this.f47779b.init(true, f1Var.b());
            }
            reset();
            return;
        }
        throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.f47780c - i12) + " bytes.");
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f47784g != 0) {
            processBytes(bArr, i11, this.f47780c, bArr2, i12);
        } else {
            int i13 = this.f47780c;
            if (i11 + i13 > bArr.length) {
                throw new DataLengthException("input buffer too small");
            }
            if (i13 + i12 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            this.f47779b.processBlock(this.f47782e, 0, this.f47783f, 0);
            for (int i14 = 0; i14 < this.f47780c; i14++) {
                bArr2[i12 + i14] = (byte) (bArr[i11 + i14] ^ this.f47783f[i14]);
            }
            c();
        }
        return this.f47780c;
    }

    @Override // org.bouncycastle.crypto.a0, org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte b11;
        int i14 = this.f47780c;
        if (i11 + i14 <= bArr.length) {
            if (i14 + i13 <= bArr2.length) {
                for (int i15 = 0; i15 < i12; i15++) {
                    int i16 = this.f47784g;
                    if (i16 == 0) {
                        this.f47779b.processBlock(this.f47782e, 0, this.f47783f, 0);
                        byte b12 = bArr[i11 + i15];
                        byte[] bArr3 = this.f47783f;
                        int i17 = this.f47784g;
                        this.f47784g = i17 + 1;
                        b11 = (byte) (b12 ^ bArr3[i17]);
                    } else {
                        byte b13 = bArr[i11 + i15];
                        byte[] bArr4 = this.f47783f;
                        int i18 = i16 + 1;
                        this.f47784g = i18;
                        b11 = (byte) (bArr4[i16] ^ b13);
                        if (i18 == this.f47782e.length) {
                            this.f47784g = 0;
                            c();
                        }
                    }
                    bArr2[i13 + i15] = b11;
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too small");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        org.bouncycastle.util.a.y(this.f47782e, (byte) 0);
        byte[] bArr = this.f47781d;
        System.arraycopy(bArr, 0, this.f47782e, 0, bArr.length);
        this.f47779b.reset();
        this.f47784g = 0;
    }
}