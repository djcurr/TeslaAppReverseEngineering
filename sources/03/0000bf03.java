package x50;

import java.util.Hashtable;
import org.bouncycastle.crypto.p;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import r70.f;

/* loaded from: classes5.dex */
public class b implements c {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f57114h = {1};

    /* renamed from: i  reason: collision with root package name */
    private static final Hashtable f57115i;

    /* renamed from: a  reason: collision with root package name */
    private p f57116a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f57117b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f57118c;

    /* renamed from: d  reason: collision with root package name */
    private long f57119d;

    /* renamed from: e  reason: collision with root package name */
    private w50.c f57120e;

    /* renamed from: f  reason: collision with root package name */
    private int f57121f;

    /* renamed from: g  reason: collision with root package name */
    private int f57122g;

    static {
        Hashtable hashtable = new Hashtable();
        f57115i = hashtable;
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, f.d(440));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, f.d(440));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA256, f.d(440));
        hashtable.put("SHA-512/256", f.d(440));
        hashtable.put("SHA-512/224", f.d(440));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, f.d(888));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA512, f.d(888));
    }

    public b(p pVar, int i11, w50.c cVar, byte[] bArr, byte[] bArr2) {
        if (i11 > d.a(pVar)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        }
        if (cVar.entropySize() < i11) {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        this.f57116a = pVar;
        this.f57120e = cVar;
        this.f57121f = i11;
        this.f57122g = ((Integer) f57115i.get(pVar.getAlgorithmName())).intValue();
        byte[] c11 = d.c(this.f57116a, org.bouncycastle.util.a.q(c(), bArr2, bArr), this.f57122g);
        this.f57117b = c11;
        byte[] bArr3 = new byte[c11.length + 1];
        System.arraycopy(c11, 0, bArr3, 1, c11.length);
        this.f57118c = d.c(this.f57116a, bArr3, this.f57122g);
        this.f57119d = 1L;
    }

    private void a(byte[] bArr, byte[] bArr2) {
        int i11 = 0;
        for (int i12 = 1; i12 <= bArr2.length; i12++) {
            int i13 = (bArr[bArr.length - i12] & 255) + (bArr2[bArr2.length - i12] & 255) + i11;
            i11 = i13 > 255 ? 1 : 0;
            bArr[bArr.length - i12] = (byte) i13;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i14 = (bArr[bArr.length - length] & 255) + i11;
            i11 = i14 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i14;
        }
    }

    private void b(byte[] bArr, byte[] bArr2) {
        this.f57116a.update(bArr, 0, bArr.length);
        this.f57116a.doFinal(bArr2, 0);
    }

    private byte[] c() {
        byte[] entropy = this.f57120e.getEntropy();
        if (entropy.length >= (this.f57121f + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[this.f57116a.getDigestSize()];
        b(bArr, bArr2);
        return bArr2;
    }

    private byte[] e(byte[] bArr, int i11) {
        int i12 = i11 / 8;
        int digestSize = i12 / this.f57116a.getDigestSize();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i12];
        int digestSize2 = this.f57116a.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        for (int i13 = 0; i13 <= digestSize; i13++) {
            b(bArr2, bArr4);
            int i14 = i13 * digestSize2;
            int i15 = i12 - i14;
            if (i15 > digestSize2) {
                i15 = digestSize2;
            }
            System.arraycopy(bArr4, 0, bArr3, i14, i15);
            a(bArr2, f57114h);
        }
        return bArr3;
    }

    @Override // x50.c
    public int generate(byte[] bArr, byte[] bArr2, boolean z11) {
        long j11;
        int length = bArr.length * 8;
        if (length <= 262144) {
            if (this.f57119d > 140737488355328L) {
                return -1;
            }
            if (z11) {
                reseed(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                byte[] bArr3 = this.f57117b;
                byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
                bArr4[0] = 2;
                System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
                System.arraycopy(bArr2, 0, bArr4, this.f57117b.length + 1, bArr2.length);
                a(this.f57117b, d(bArr4));
            }
            byte[] e11 = e(this.f57117b, length);
            byte[] bArr5 = this.f57117b;
            byte[] bArr6 = new byte[bArr5.length + 1];
            System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
            bArr6[0] = 3;
            a(this.f57117b, d(bArr6));
            a(this.f57117b, this.f57118c);
            a(this.f57117b, new byte[]{(byte) (j11 >> 24), (byte) (j11 >> 16), (byte) (j11 >> 8), (byte) this.f57119d});
            this.f57119d++;
            System.arraycopy(e11, 0, bArr, 0, bArr.length);
            return length;
        }
        throw new IllegalArgumentException("Number of bits per request limited to 262144");
    }

    @Override // x50.c
    public void reseed(byte[] bArr) {
        byte[] c11 = d.c(this.f57116a, org.bouncycastle.util.a.r(f57114h, this.f57117b, c(), bArr), this.f57122g);
        this.f57117b = c11;
        byte[] bArr2 = new byte[c11.length + 1];
        bArr2[0] = 0;
        System.arraycopy(c11, 0, bArr2, 1, c11.length);
        this.f57118c = d.c(this.f57116a, bArr2, this.f57122g);
        this.f57119d = 1L;
    }
}