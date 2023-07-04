package q50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.a0;
import u50.f1;

/* loaded from: classes5.dex */
public class s extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private byte[] f47717b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47718c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47719d;

    /* renamed from: e  reason: collision with root package name */
    private int f47720e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47721f;

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47722g;

    public s(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f47722g = eVar;
        this.f47717b = new byte[eVar.getBlockSize()];
        this.f47718c = new byte[eVar.getBlockSize()];
        this.f47719d = new byte[eVar.getBlockSize()];
    }

    private void c() {
    }

    private void d(int i11) {
        while (true) {
            byte[] bArr = this.f47718c;
            if (i11 >= bArr.length) {
                return;
            }
            int i12 = i11 + 1;
            byte b11 = (byte) (bArr[i11] + 1);
            bArr[i11] = b11;
            if (b11 != 0) {
                return;
            }
            i11 = i12;
        }
    }

    @Override // org.bouncycastle.crypto.a0
    protected byte a(byte b11) {
        int i11 = this.f47720e;
        if (i11 == 0) {
            d(0);
            c();
            this.f47722g.processBlock(this.f47718c, 0, this.f47719d, 0);
            byte[] bArr = this.f47719d;
            int i12 = this.f47720e;
            this.f47720e = i12 + 1;
            return (byte) (b11 ^ bArr[i12]);
        }
        byte[] bArr2 = this.f47719d;
        int i13 = i11 + 1;
        this.f47720e = i13;
        byte b12 = (byte) (b11 ^ bArr2[i11]);
        if (i13 == this.f47718c.length) {
            this.f47720e = 0;
        }
        return b12;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47722g.getAlgorithmName() + "/KCTR";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47722g.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f47721f = true;
        if (!(iVar instanceof f1)) {
            throw new IllegalArgumentException("invalid parameter passed");
        }
        f1 f1Var = (f1) iVar;
        byte[] a11 = f1Var.a();
        byte[] bArr = this.f47717b;
        org.bouncycastle.util.a.y(bArr, (byte) 0);
        System.arraycopy(a11, 0, this.f47717b, bArr.length - a11.length, a11.length);
        org.bouncycastle.crypto.i b11 = f1Var.b();
        if (b11 != null) {
            this.f47722g.init(true, b11);
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (bArr.length - i11 >= getBlockSize()) {
            if (bArr2.length - i12 >= getBlockSize()) {
                processBytes(bArr, i11, getBlockSize(), bArr2, i12);
                return getBlockSize();
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        if (this.f47721f) {
            this.f47722g.processBlock(this.f47717b, 0, this.f47718c, 0);
        }
        this.f47722g.reset();
        this.f47720e = 0;
    }
}