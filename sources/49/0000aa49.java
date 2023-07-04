package p50;

import org.bouncycastle.crypto.v;
import u50.b1;

/* loaded from: classes5.dex */
public class k implements v {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.crypto.p f46270a;

    /* renamed from: b  reason: collision with root package name */
    private int f46271b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f46272c = new byte[64];

    /* renamed from: d  reason: collision with root package name */
    private byte[] f46273d = new byte[64];

    public k(org.bouncycastle.crypto.p pVar) {
        this.f46270a = pVar;
        this.f46271b = pVar.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        int i12 = this.f46271b;
        byte[] bArr2 = new byte[i12];
        this.f46270a.doFinal(bArr2, 0);
        org.bouncycastle.crypto.p pVar = this.f46270a;
        byte[] bArr3 = this.f46273d;
        pVar.update(bArr3, 0, bArr3.length);
        this.f46270a.update(bArr2, 0, i12);
        int doFinal = this.f46270a.doFinal(bArr, i11);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return this.f46270a.getAlgorithmName() + "/HMAC";
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46271b;
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f46270a.reset();
        byte[] a11 = ((b1) iVar).a();
        if (a11.length <= 64) {
            System.arraycopy(a11, 0, this.f46272c, 0, a11.length);
            int length = a11.length;
            while (true) {
                byte[] bArr = this.f46272c;
                if (length >= bArr.length) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            this.f46270a.update(a11, 0, a11.length);
            this.f46270a.doFinal(this.f46272c, 0);
            int i11 = this.f46271b;
            while (true) {
                byte[] bArr2 = this.f46272c;
                if (i11 >= bArr2.length) {
                    break;
                }
                bArr2[i11] = 0;
                i11++;
            }
        }
        byte[] bArr3 = this.f46272c;
        byte[] bArr4 = new byte[bArr3.length];
        this.f46273d = bArr4;
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        int i12 = 0;
        while (true) {
            byte[] bArr5 = this.f46272c;
            if (i12 >= bArr5.length) {
                break;
            }
            bArr5[i12] = (byte) (bArr5[i12] ^ 54);
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[] bArr6 = this.f46273d;
            if (i13 >= bArr6.length) {
                org.bouncycastle.crypto.p pVar = this.f46270a;
                byte[] bArr7 = this.f46272c;
                pVar.update(bArr7, 0, bArr7.length);
                return;
            }
            bArr6[i13] = (byte) (bArr6[i13] ^ 92);
            i13++;
        }
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        this.f46270a.reset();
        org.bouncycastle.crypto.p pVar = this.f46270a;
        byte[] bArr = this.f46272c;
        pVar.update(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        this.f46270a.update(b11);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        this.f46270a.update(bArr, i11, i12);
    }
}