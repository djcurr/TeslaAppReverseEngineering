package q50;

import org.bouncycastle.crypto.a0;
import u50.f1;

/* loaded from: classes5.dex */
public class v extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private int f47757b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47758c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47759d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47760e;

    /* renamed from: f  reason: collision with root package name */
    private final int f47761f;

    /* renamed from: g  reason: collision with root package name */
    private final org.bouncycastle.crypto.e f47762g;

    public v(org.bouncycastle.crypto.e eVar, int i11) {
        super(eVar);
        if (i11 > eVar.getBlockSize() * 8 || i11 < 8 || i11 % 8 != 0) {
            throw new IllegalArgumentException("0FB" + i11 + " not supported");
        }
        this.f47762g = eVar;
        this.f47761f = i11 / 8;
        this.f47758c = new byte[eVar.getBlockSize()];
        this.f47759d = new byte[eVar.getBlockSize()];
        this.f47760e = new byte[eVar.getBlockSize()];
    }

    @Override // org.bouncycastle.crypto.a0
    protected byte a(byte b11) {
        if (this.f47757b == 0) {
            this.f47762g.processBlock(this.f47759d, 0, this.f47760e, 0);
        }
        byte[] bArr = this.f47760e;
        int i11 = this.f47757b;
        int i12 = i11 + 1;
        this.f47757b = i12;
        byte b12 = (byte) (b11 ^ bArr[i11]);
        int i13 = this.f47761f;
        if (i12 == i13) {
            this.f47757b = 0;
            byte[] bArr2 = this.f47759d;
            System.arraycopy(bArr2, i13, bArr2, 0, bArr2.length - i13);
            byte[] bArr3 = this.f47760e;
            byte[] bArr4 = this.f47759d;
            int length = bArr4.length;
            int i14 = this.f47761f;
            System.arraycopy(bArr3, 0, bArr4, length - i14, i14);
        }
        return b12;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47762g.getAlgorithmName() + "/OFB" + (this.f47761f * 8);
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47761f;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a11 = f1Var.a();
            int length = a11.length;
            byte[] bArr = this.f47758c;
            if (length < bArr.length) {
                System.arraycopy(a11, 0, bArr, bArr.length - a11.length, a11.length);
                int i11 = 0;
                while (true) {
                    byte[] bArr2 = this.f47758c;
                    if (i11 >= bArr2.length - a11.length) {
                        break;
                    }
                    bArr2[i11] = 0;
                    i11++;
                }
            } else {
                System.arraycopy(a11, 0, bArr, 0, bArr.length);
            }
            reset();
            if (f1Var.b() == null) {
                return;
            }
            eVar = this.f47762g;
            iVar = f1Var.b();
        } else {
            reset();
            if (iVar == null) {
                return;
            }
            eVar = this.f47762g;
        }
        eVar.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBytes(bArr, i11, this.f47761f, bArr2, i12);
        return this.f47761f;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        byte[] bArr = this.f47758c;
        System.arraycopy(bArr, 0, this.f47759d, 0, bArr.length);
        this.f47757b = 0;
        this.f47762g.reset();
    }
}