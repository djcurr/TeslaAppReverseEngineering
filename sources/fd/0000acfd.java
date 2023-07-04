package q50;

import org.bouncycastle.crypto.DataLengthException;
import u50.f1;

/* loaded from: classes5.dex */
public class c implements org.bouncycastle.crypto.e {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f47564a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f47565b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47566c;

    /* renamed from: d  reason: collision with root package name */
    private int f47567d;

    /* renamed from: e  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47568e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47569f;

    public c(org.bouncycastle.crypto.e eVar) {
        this.f47568e = null;
        this.f47568e = eVar;
        int blockSize = eVar.getBlockSize();
        this.f47567d = blockSize;
        this.f47564a = new byte[blockSize];
        this.f47565b = new byte[blockSize];
        this.f47566c = new byte[blockSize];
    }

    private int a(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.f47567d;
        if (i11 + i13 <= bArr.length) {
            System.arraycopy(bArr, i11, this.f47566c, 0, i13);
            int processBlock = this.f47568e.processBlock(bArr, i11, bArr2, i12);
            for (int i14 = 0; i14 < this.f47567d; i14++) {
                int i15 = i12 + i14;
                bArr2[i15] = (byte) (bArr2[i15] ^ this.f47565b[i14]);
            }
            byte[] bArr3 = this.f47565b;
            this.f47565b = this.f47566c;
            this.f47566c = bArr3;
            return processBlock;
        }
        throw new DataLengthException("input buffer too short");
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.f47567d + i11 <= bArr.length) {
            for (int i13 = 0; i13 < this.f47567d; i13++) {
                byte[] bArr3 = this.f47565b;
                bArr3[i13] = (byte) (bArr3[i13] ^ bArr[i11 + i13]);
            }
            int processBlock = this.f47568e.processBlock(this.f47565b, 0, bArr2, i12);
            byte[] bArr4 = this.f47565b;
            System.arraycopy(bArr2, i12, bArr4, 0, bArr4.length);
            return processBlock;
        }
        throw new DataLengthException("input buffer too short");
    }

    public org.bouncycastle.crypto.e c() {
        return this.f47568e;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47568e.getAlgorithmName() + "/CBC";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47568e.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        boolean z12 = this.f47569f;
        this.f47569f = z11;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a11 = f1Var.a();
            if (a11.length != this.f47567d) {
                throw new IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            System.arraycopy(a11, 0, this.f47564a, 0, a11.length);
            reset();
            if (f1Var.b() == null) {
                if (z12 != z11) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            eVar = this.f47568e;
            iVar = f1Var.b();
        } else {
            reset();
            if (iVar == null) {
                if (z12 != z11) {
                    throw new IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            eVar = this.f47568e;
        }
        eVar.init(z11, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        return this.f47569f ? b(bArr, i11, bArr2, i12) : a(bArr, i11, bArr2, i12);
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        byte[] bArr = this.f47564a;
        System.arraycopy(bArr, 0, this.f47565b, 0, bArr.length);
        org.bouncycastle.util.a.y(this.f47566c, (byte) 0);
        this.f47568e.reset();
    }
}