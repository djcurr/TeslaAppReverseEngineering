package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.signers.PSSSigner;

/* loaded from: classes5.dex */
public class d0 implements org.bouncycastle.crypto.e {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f36708d = {Byte.MIN_VALUE, 27, 54, 108, -40, -85, 77, -102, 47, 94, PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, 53, 106, -44};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f36709a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private boolean f36710b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36711c;

    private int a(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = r70.i.a(bArr, i11);
        int a12 = r70.i.a(bArr, i11 + 4);
        int a13 = r70.i.a(bArr, i11 + 8);
        int a14 = r70.i.a(bArr, i11 + 12);
        int[] iArr = this.f36709a;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        int i17 = 16;
        while (true) {
            int i18 = a11 ^ a13;
            int c11 = i18 ^ (r70.f.c(i18, 8) ^ r70.f.c(i18, 24));
            int i19 = a12 ^ i14;
            int i21 = a14 ^ i16;
            int i22 = i19 ^ i21;
            int c12 = (r70.f.c(i22, 24) ^ r70.f.c(i22, 8)) ^ i22;
            int i23 = i19 ^ c11;
            int i24 = (a13 ^ i15) ^ c12;
            int i25 = i21 ^ c11;
            int i26 = ((a11 ^ i13) ^ c12) ^ (f36708d[i17] & 255);
            i17--;
            if (i17 < 0) {
                r70.i.f(i26, bArr2, i12);
                r70.i.f(i23, bArr2, i12 + 4);
                r70.i.f(i24, bArr2, i12 + 8);
                r70.i.f(i25, bArr2, i12 + 12);
                return 16;
            }
            int c13 = r70.f.c(i23, 1);
            int c14 = r70.f.c(i24, 5);
            int c15 = r70.f.c(i25, 2);
            int i27 = c13 ^ (c15 | c14);
            int i28 = ~i27;
            int i29 = i26 ^ (c14 & i28);
            int i31 = (c14 ^ (i28 ^ c15)) ^ i29;
            int i32 = i27 ^ (i29 | i31);
            a12 = r70.f.c(i32, 31);
            a13 = r70.f.c(i31, 27);
            int c16 = r70.f.c(i29, 30);
            a11 = c15 ^ (i31 & i32);
            a14 = c16;
        }
    }

    private int b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int a11 = r70.i.a(bArr, i11);
        int a12 = r70.i.a(bArr, i11 + 4);
        int a13 = r70.i.a(bArr, i11 + 8);
        int a14 = r70.i.a(bArr, i11 + 12);
        int[] iArr = this.f36709a;
        int i13 = 0;
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        while (true) {
            int i18 = a11 ^ (f36708d[i13] & 255);
            int i19 = i18 ^ a13;
            int c11 = i19 ^ (r70.f.c(i19, 8) ^ r70.f.c(i19, 24));
            int i21 = a12 ^ i15;
            int i22 = a14 ^ i17;
            int i23 = i21 ^ i22;
            int c12 = i23 ^ (r70.f.c(i23, 24) ^ r70.f.c(i23, 8));
            int i24 = (i18 ^ i14) ^ c12;
            int i25 = i21 ^ c11;
            int i26 = (a13 ^ i16) ^ c12;
            int i27 = i22 ^ c11;
            i13++;
            if (i13 > 16) {
                r70.i.f(i24, bArr2, i12);
                r70.i.f(i25, bArr2, i12 + 4);
                r70.i.f(i26, bArr2, i12 + 8);
                r70.i.f(i27, bArr2, i12 + 12);
                return 16;
            }
            int c13 = r70.f.c(i25, 1);
            int c14 = r70.f.c(i26, 5);
            int c15 = r70.f.c(i27, 2);
            int i28 = c13 ^ (c15 | c14);
            int i29 = ~i28;
            int i31 = i24 ^ (c14 & i29);
            int i32 = (c14 ^ (i29 ^ c15)) ^ i31;
            int i33 = i28 ^ (i31 | i32);
            a12 = r70.f.c(i33, 31);
            a13 = r70.f.c(i32, 27);
            int c16 = r70.f.c(i31, 30);
            a11 = c15 ^ (i32 & i33);
            a14 = c16;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof u50.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + iVar.getClass().getName());
        }
        byte[] a11 = ((u50.b1) iVar).a();
        if (a11.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        r70.i.b(a11, 0, this.f36709a, 0, 4);
        if (!z11) {
            int[] iArr = this.f36709a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            int i15 = i11 ^ i13;
            int c11 = i15 ^ (r70.f.c(i15, 8) ^ r70.f.c(i15, 24));
            int i16 = i12 ^ i14;
            int c12 = (r70.f.c(i16, 8) ^ r70.f.c(i16, 24)) ^ i16;
            int i17 = i12 ^ c11;
            int i18 = i14 ^ c11;
            int[] iArr2 = this.f36709a;
            iArr2[0] = i11 ^ c12;
            iArr2[1] = i17;
            iArr2[2] = i13 ^ c12;
            iArr2[3] = i18;
        }
        this.f36711c = z11;
        this.f36710b = true;
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (!this.f36710b) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i11 <= bArr.length - 16) {
            if (i12 <= bArr2.length - 16) {
                return this.f36711c ? b(bArr, i11, bArr2, i12) : a(bArr, i11, bArr2, i12);
            }
            throw new OutputLengthException("output buffer too short");
        } else {
            throw new DataLengthException("input buffer too short");
        }
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}