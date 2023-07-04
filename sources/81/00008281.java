package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class g0 implements org.bouncycastle.crypto.b0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f36741a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f36742b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f36743c = 0;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f36744d = null;

    private void a(byte[] bArr) {
        this.f36744d = bArr;
        this.f36742b = 0;
        this.f36743c = 0;
        if (this.f36741a == null) {
            this.f36741a = new byte[256];
        }
        for (int i11 = 0; i11 < 256; i11++) {
            this.f36741a[i11] = (byte) i11;
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < 256; i14++) {
            byte[] bArr2 = this.f36741a;
            i13 = ((bArr[i12] & 255) + bArr2[i14] + i13) & 255;
            byte b11 = bArr2[i14];
            bArr2[i14] = bArr2[i13];
            bArr2[i13] = b11;
            i12 = (i12 + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.b0
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.b0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.b1) {
            byte[] a11 = ((u50.b1) iVar).a();
            this.f36744d = a11;
            a(a11);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + iVar.getClass().getName());
    }

    @Override // org.bouncycastle.crypto.b0
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i11 + i12 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = (this.f36742b + 1) & 255;
                    this.f36742b = i15;
                    byte[] bArr3 = this.f36741a;
                    int i16 = (bArr3[i15] + this.f36743c) & 255;
                    this.f36743c = i16;
                    byte b11 = bArr3[i15];
                    bArr3[i15] = bArr3[i16];
                    bArr3[i16] = b11;
                    bArr2[i14 + i13] = (byte) (bArr3[(bArr3[i15] + bArr3[i16]) & 255] ^ bArr[i14 + i11]);
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // org.bouncycastle.crypto.b0
    public void reset() {
        a(this.f36744d);
    }
}