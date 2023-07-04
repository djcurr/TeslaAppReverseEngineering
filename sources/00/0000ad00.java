package q50;

import org.bouncycastle.crypto.a0;
import u50.f1;

/* loaded from: classes5.dex */
public class e extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private byte[] f47580b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f47581c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f47582d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47583e;

    /* renamed from: f  reason: collision with root package name */
    private int f47584f;

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.crypto.e f47585g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f47586h;

    /* renamed from: i  reason: collision with root package name */
    private int f47587i;

    public e(org.bouncycastle.crypto.e eVar, int i11) {
        super(eVar);
        this.f47585g = null;
        if (i11 > eVar.getBlockSize() * 8 || i11 < 8 || i11 % 8 != 0) {
            throw new IllegalArgumentException("CFB" + i11 + " not supported");
        }
        this.f47585g = eVar;
        this.f47584f = i11 / 8;
        this.f47580b = new byte[eVar.getBlockSize()];
        this.f47581c = new byte[eVar.getBlockSize()];
        this.f47582d = new byte[eVar.getBlockSize()];
        this.f47583e = new byte[this.f47584f];
    }

    private byte c(byte b11) {
        if (this.f47587i == 0) {
            this.f47585g.processBlock(this.f47581c, 0, this.f47582d, 0);
        }
        byte[] bArr = this.f47583e;
        int i11 = this.f47587i;
        bArr[i11] = b11;
        byte[] bArr2 = this.f47582d;
        int i12 = i11 + 1;
        this.f47587i = i12;
        byte b12 = (byte) (b11 ^ bArr2[i11]);
        int i13 = this.f47584f;
        if (i12 == i13) {
            this.f47587i = 0;
            byte[] bArr3 = this.f47581c;
            System.arraycopy(bArr3, i13, bArr3, 0, bArr3.length - i13);
            byte[] bArr4 = this.f47583e;
            byte[] bArr5 = this.f47581c;
            int length = bArr5.length;
            int i14 = this.f47584f;
            System.arraycopy(bArr4, 0, bArr5, length - i14, i14);
        }
        return b12;
    }

    private byte d(byte b11) {
        if (this.f47587i == 0) {
            this.f47585g.processBlock(this.f47581c, 0, this.f47582d, 0);
        }
        byte[] bArr = this.f47582d;
        int i11 = this.f47587i;
        byte b12 = (byte) (b11 ^ bArr[i11]);
        byte[] bArr2 = this.f47583e;
        int i12 = i11 + 1;
        this.f47587i = i12;
        bArr2[i11] = b12;
        int i13 = this.f47584f;
        if (i12 == i13) {
            this.f47587i = 0;
            byte[] bArr3 = this.f47581c;
            System.arraycopy(bArr3, i13, bArr3, 0, bArr3.length - i13);
            byte[] bArr4 = this.f47583e;
            byte[] bArr5 = this.f47581c;
            int length = bArr5.length;
            int i14 = this.f47584f;
            System.arraycopy(bArr4, 0, bArr5, length - i14, i14);
        }
        return b12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.crypto.a0
    public byte a(byte b11) {
        return this.f47586h ? d(b11) : c(b11);
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f47581c);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f47585g.getAlgorithmName() + "/CFB" + (this.f47584f * 8);
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f47584f;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        org.bouncycastle.crypto.e eVar;
        this.f47586h = z11;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a11 = f1Var.a();
            int length = a11.length;
            byte[] bArr = this.f47580b;
            if (length < bArr.length) {
                System.arraycopy(a11, 0, bArr, bArr.length - a11.length, a11.length);
                int i11 = 0;
                while (true) {
                    byte[] bArr2 = this.f47580b;
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
            eVar = this.f47585g;
            iVar = f1Var.b();
        } else {
            reset();
            if (iVar == null) {
                return;
            }
            eVar = this.f47585g;
        }
        eVar.init(true, iVar);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBytes(bArr, i11, this.f47584f, bArr2, i12);
        return this.f47584f;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        byte[] bArr = this.f47580b;
        System.arraycopy(bArr, 0, this.f47581c, 0, bArr.length);
        org.bouncycastle.util.a.y(this.f47583e, (byte) 0);
        this.f47587i = 0;
        this.f47585g.reset();
    }
}