package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class p extends o {

    /* renamed from: o  reason: collision with root package name */
    private int[] f36832o = null;

    /* renamed from: p  reason: collision with root package name */
    private int[] f36833p = null;

    /* renamed from: q  reason: collision with root package name */
    private int[] f36834q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f36835r;

    @Override // l50.o, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // l50.o, org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // l50.o, org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - " + iVar.getClass().getName());
        }
        byte[] a11 = ((u50.b1) iVar).a();
        if (a11.length != 24 && a11.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.f36835r = z11;
        byte[] bArr = new byte[8];
        System.arraycopy(a11, 0, bArr, 0, 8);
        this.f36832o = b(z11, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(a11, 8, bArr2, 0, 8);
        this.f36833p = b(!z11, bArr2);
        if (a11.length != 24) {
            this.f36834q = this.f36832o;
            return;
        }
        byte[] bArr3 = new byte[8];
        System.arraycopy(a11, 16, bArr3, 0, 8);
        this.f36834q = b(z11, bArr3);
    }

    @Override // l50.o, org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr = this.f36832o;
        if (iArr != null) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
                    byte[] bArr3 = new byte[8];
                    if (this.f36835r) {
                        a(iArr, bArr, i11, bArr3, 0);
                        a(this.f36833p, bArr3, 0, bArr3, 0);
                        a(this.f36834q, bArr3, 0, bArr2, i12);
                    } else {
                        a(this.f36834q, bArr, i11, bArr3, 0);
                        a(this.f36833p, bArr3, 0, bArr3, 0);
                        a(this.f36832o, bArr3, 0, bArr2, i12);
                    }
                    return 8;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException("DESede engine not initialised");
    }

    @Override // l50.o, org.bouncycastle.crypto.e
    public void reset() {
    }
}