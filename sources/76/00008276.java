package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class c1 implements org.bouncycastle.crypto.b0 {

    /* renamed from: a  reason: collision with root package name */
    protected byte f36697a = 0;

    /* renamed from: b  reason: collision with root package name */
    protected byte[] f36698b = null;

    /* renamed from: c  reason: collision with root package name */
    protected byte f36699c = 0;

    /* renamed from: d  reason: collision with root package name */
    protected byte[] f36700d;

    /* renamed from: e  reason: collision with root package name */
    protected byte[] f36701e;

    protected void a(byte[] bArr, byte[] bArr2) {
        this.f36699c = (byte) 0;
        this.f36698b = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            this.f36698b[i11] = (byte) i11;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr3 = this.f36698b;
            int i13 = i12 & 255;
            byte b11 = bArr3[(this.f36699c + bArr3[i13] + bArr[i12 % bArr.length]) & 255];
            this.f36699c = b11;
            byte b12 = bArr3[i13];
            bArr3[i13] = bArr3[b11 & 255];
            bArr3[b11 & 255] = b12;
        }
        for (int i14 = 0; i14 < 768; i14++) {
            byte[] bArr4 = this.f36698b;
            int i15 = i14 & 255;
            byte b13 = bArr4[(this.f36699c + bArr4[i15] + bArr2[i14 % bArr2.length]) & 255];
            this.f36699c = b13;
            byte b14 = bArr4[i15];
            bArr4[i15] = bArr4[b13 & 255];
            bArr4[b13 & 255] = b14;
        }
        this.f36697a = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.bouncycastle.crypto.b0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.f1)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        u50.f1 f1Var = (u50.f1) iVar;
        if (!(f1Var.b() instanceof u50.b1)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        u50.b1 b1Var = (u50.b1) f1Var.b();
        byte[] a11 = f1Var.a();
        this.f36700d = a11;
        if (a11 == null || a11.length < 1 || a11.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] a12 = b1Var.a();
        this.f36701e = a12;
        a(a12, this.f36700d);
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i11 + i12 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                for (int i14 = 0; i14 < i12; i14++) {
                    byte[] bArr3 = this.f36698b;
                    byte b11 = this.f36699c;
                    byte b12 = this.f36697a;
                    byte b13 = bArr3[(b11 + bArr3[b12 & 255]) & 255];
                    this.f36699c = b13;
                    byte b14 = bArr3[(bArr3[bArr3[b13 & 255] & 255] + 1) & 255];
                    byte b15 = bArr3[b12 & 255];
                    bArr3[b12 & 255] = bArr3[b13 & 255];
                    bArr3[b13 & 255] = b15;
                    this.f36697a = (byte) ((b12 + 1) & 255);
                    bArr2[i14 + i13] = (byte) (bArr[i14 + i11] ^ b14);
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // org.bouncycastle.crypto.b0
    public void reset() {
        a(this.f36701e, this.f36700d);
    }
}