package x50;

import org.bouncycastle.crypto.v;
import u50.b1;

/* loaded from: classes5.dex */
public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f57108a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f57109b;

    /* renamed from: c  reason: collision with root package name */
    private long f57110c;

    /* renamed from: d  reason: collision with root package name */
    private w50.c f57111d;

    /* renamed from: e  reason: collision with root package name */
    private v f57112e;

    /* renamed from: f  reason: collision with root package name */
    private int f57113f;

    public a(v vVar, int i11, w50.c cVar, byte[] bArr, byte[] bArr2) {
        if (i11 > d.b(vVar)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (cVar.entropySize() < i11) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f57113f = i11;
        this.f57111d = cVar;
        this.f57112e = vVar;
        byte[] q11 = org.bouncycastle.util.a.q(a(), bArr2, bArr);
        byte[] bArr3 = new byte[vVar.getMacSize()];
        this.f57108a = bArr3;
        byte[] bArr4 = new byte[bArr3.length];
        this.f57109b = bArr4;
        org.bouncycastle.util.a.y(bArr4, (byte) 1);
        b(q11);
        this.f57110c = 1L;
    }

    private byte[] a() {
        byte[] entropy = this.f57111d.getEntropy();
        if (entropy.length >= (this.f57113f + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private void b(byte[] bArr) {
        c(bArr, (byte) 0);
        if (bArr != null) {
            c(bArr, (byte) 1);
        }
    }

    private void c(byte[] bArr, byte b11) {
        this.f57112e.init(new b1(this.f57108a));
        v vVar = this.f57112e;
        byte[] bArr2 = this.f57109b;
        vVar.update(bArr2, 0, bArr2.length);
        this.f57112e.update(b11);
        if (bArr != null) {
            this.f57112e.update(bArr, 0, bArr.length);
        }
        this.f57112e.doFinal(this.f57108a, 0);
        this.f57112e.init(new b1(this.f57108a));
        v vVar2 = this.f57112e;
        byte[] bArr3 = this.f57109b;
        vVar2.update(bArr3, 0, bArr3.length);
        this.f57112e.doFinal(this.f57109b, 0);
    }

    @Override // x50.c
    public int generate(byte[] bArr, byte[] bArr2, boolean z11) {
        int length = bArr.length * 8;
        if (length <= 262144) {
            if (this.f57110c > 140737488355328L) {
                return -1;
            }
            if (z11) {
                reseed(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                b(bArr2);
            }
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            int length3 = bArr.length / this.f57109b.length;
            this.f57112e.init(new b1(this.f57108a));
            for (int i11 = 0; i11 < length3; i11++) {
                v vVar = this.f57112e;
                byte[] bArr4 = this.f57109b;
                vVar.update(bArr4, 0, bArr4.length);
                this.f57112e.doFinal(this.f57109b, 0);
                byte[] bArr5 = this.f57109b;
                System.arraycopy(bArr5, 0, bArr3, bArr5.length * i11, bArr5.length);
            }
            byte[] bArr6 = this.f57109b;
            if (bArr6.length * length3 < length2) {
                this.f57112e.update(bArr6, 0, bArr6.length);
                this.f57112e.doFinal(this.f57109b, 0);
                byte[] bArr7 = this.f57109b;
                System.arraycopy(bArr7, 0, bArr3, bArr7.length * length3, length2 - (length3 * bArr7.length));
            }
            b(bArr2);
            this.f57110c++;
            System.arraycopy(bArr3, 0, bArr, 0, bArr.length);
            return length;
        }
        throw new IllegalArgumentException("Number of bits per request limited to 262144");
    }

    @Override // x50.c
    public void reseed(byte[] bArr) {
        b(org.bouncycastle.util.a.p(a(), bArr));
        this.f57110c = 1L;
    }
}