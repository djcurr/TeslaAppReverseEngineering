package y50;

import org.bouncycastle.crypto.z;
import org.spongycastle.crypto.signers.PSSSigner;
import u50.n1;

/* loaded from: classes5.dex */
public class m implements z {

    /* renamed from: g  reason: collision with root package name */
    private org.bouncycastle.crypto.p f59173g;

    /* renamed from: h  reason: collision with root package name */
    private org.bouncycastle.crypto.a f59174h;

    /* renamed from: i  reason: collision with root package name */
    private int f59175i;

    /* renamed from: j  reason: collision with root package name */
    private int f59176j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f59177k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f59178l;

    /* renamed from: m  reason: collision with root package name */
    private int f59179m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f59180n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f59181o;

    /* renamed from: p  reason: collision with root package name */
    private byte[] f59182p;

    public m(org.bouncycastle.crypto.a aVar, org.bouncycastle.crypto.p pVar, boolean z11) {
        int intValue;
        this.f59174h = aVar;
        this.f59173g = pVar;
        if (z11) {
            intValue = 188;
        } else {
            Integer a11 = n.a(pVar);
            if (a11 == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + pVar.getAlgorithmName());
            }
            intValue = a11.intValue();
        }
        this.f59175i = intValue;
    }

    private void a(byte[] bArr) {
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = 0;
        }
    }

    private boolean b(byte[] bArr, byte[] bArr2) {
        boolean z11;
        int i11 = this.f59179m;
        byte[] bArr3 = this.f59178l;
        if (i11 > bArr3.length) {
            z11 = bArr3.length <= bArr2.length;
            for (int i12 = 0; i12 != this.f59178l.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    z11 = false;
                }
            }
        } else {
            z11 = i11 == bArr2.length;
            for (int i13 = 0; i13 != bArr2.length; i13++) {
                if (bArr[i13] != bArr2[i13]) {
                    z11 = false;
                }
            }
        }
        return z11;
    }

    private boolean d(byte[] bArr) {
        this.f59179m = 0;
        a(this.f59178l);
        a(bArr);
        return false;
    }

    public void c() {
        this.f59173g.reset();
        this.f59179m = 0;
        a(this.f59178l);
        byte[] bArr = this.f59180n;
        if (bArr != null) {
            a(bArr);
        }
        this.f59180n = null;
        if (this.f59181o != null) {
            this.f59181o = null;
            a(this.f59182p);
            this.f59182p = null;
        }
    }

    @Override // org.bouncycastle.crypto.z
    public byte[] generateSignature() {
        int i11;
        int i12;
        byte b11;
        int i13;
        byte[] bArr;
        int digestSize = this.f59173g.getDigestSize();
        if (this.f59175i == 188) {
            byte[] bArr2 = this.f59177k;
            i12 = (bArr2.length - digestSize) - 1;
            this.f59173g.doFinal(bArr2, i12);
            this.f59177k[bArr.length - 1] = PSSSigner.TRAILER_IMPLICIT;
            i11 = 8;
        } else {
            i11 = 16;
            byte[] bArr3 = this.f59177k;
            int length = (bArr3.length - digestSize) - 2;
            this.f59173g.doFinal(bArr3, length);
            byte[] bArr4 = this.f59177k;
            int i14 = this.f59175i;
            bArr4[bArr4.length - 2] = (byte) (i14 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i14;
            i12 = length;
        }
        int i15 = this.f59179m;
        int i16 = ((((digestSize + i15) * 8) + i11) + 4) - this.f59176j;
        if (i16 > 0) {
            int i17 = i15 - ((i16 + 7) / 8);
            b11 = 96;
            i13 = i12 - i17;
            System.arraycopy(this.f59178l, 0, this.f59177k, i13, i17);
            this.f59180n = new byte[i17];
        } else {
            b11 = 64;
            i13 = i12 - i15;
            System.arraycopy(this.f59178l, 0, this.f59177k, i13, i15);
            this.f59180n = new byte[this.f59179m];
        }
        int i18 = i13 - 1;
        if (i18 > 0) {
            for (int i19 = i18; i19 != 0; i19--) {
                this.f59177k[i19] = -69;
            }
            byte[] bArr5 = this.f59177k;
            bArr5[i18] = (byte) (bArr5[i18] ^ 1);
            bArr5[0] = 11;
            bArr5[0] = (byte) (b11 | bArr5[0]);
        } else {
            byte[] bArr6 = this.f59177k;
            bArr6[0] = 10;
            bArr6[0] = (byte) (b11 | bArr6[0]);
        }
        org.bouncycastle.crypto.a aVar = this.f59174h;
        byte[] bArr7 = this.f59177k;
        byte[] processBlock = aVar.processBlock(bArr7, 0, bArr7.length);
        byte[] bArr8 = this.f59178l;
        byte[] bArr9 = this.f59180n;
        System.arraycopy(bArr8, 0, bArr9, 0, bArr9.length);
        this.f59179m = 0;
        a(this.f59178l);
        a(this.f59177k);
        return processBlock;
    }

    @Override // org.bouncycastle.crypto.z
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        n1 n1Var = (n1) iVar;
        this.f59174h.init(z11, n1Var);
        int bitLength = n1Var.c().bitLength();
        this.f59176j = bitLength;
        byte[] bArr = new byte[(bitLength + 7) / 8];
        this.f59177k = bArr;
        int i11 = this.f59175i;
        int length = bArr.length;
        if (i11 == 188) {
            this.f59178l = new byte[(length - this.f59173g.getDigestSize()) - 2];
        } else {
            this.f59178l = new byte[(length - this.f59173g.getDigestSize()) - 3];
        }
        c();
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte b11) {
        this.f59173g.update(b11);
        int i11 = this.f59179m;
        byte[] bArr = this.f59178l;
        if (i11 < bArr.length) {
            bArr[i11] = b11;
        }
        this.f59179m = i11 + 1;
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte[] bArr, int i11, int i12) {
        while (i12 > 0 && this.f59179m < this.f59178l.length) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        this.f59173g.update(bArr, i11, i12);
        this.f59179m += i12;
    }

    @Override // org.bouncycastle.crypto.z
    public boolean verifySignature(byte[] bArr) {
        byte[] processBlock;
        byte[] bArr2 = this.f59181o;
        if (bArr2 == null) {
            try {
                processBlock = this.f59174h.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else if (!org.bouncycastle.util.a.c(bArr2, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        } else {
            processBlock = this.f59182p;
            this.f59181o = null;
            this.f59182p = null;
        }
        if (((processBlock[0] & 192) ^ 64) == 0 && ((processBlock[processBlock.length - 1] & 15) ^ 12) == 0) {
            int i11 = 2;
            if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
                i11 = 1;
            } else {
                int i12 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
                Integer a11 = n.a(this.f59173g);
                if (a11 == null) {
                    throw new IllegalArgumentException("unrecognised hash in signature");
                }
                int intValue = a11.intValue();
                if (i12 != intValue && (intValue != 15052 || i12 != 16588)) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i12);
                }
            }
            int i13 = 0;
            while (i13 != processBlock.length && ((processBlock[i13] & 15) ^ 10) != 0) {
                i13++;
            }
            int i14 = i13 + 1;
            int digestSize = this.f59173g.getDigestSize();
            byte[] bArr3 = new byte[digestSize];
            int length = (processBlock.length - i11) - digestSize;
            int i15 = length - i14;
            if (i15 <= 0) {
                return d(processBlock);
            }
            if ((processBlock[0] & 32) != 0) {
                this.f59173g.doFinal(bArr3, 0);
                boolean z11 = true;
                for (int i16 = 0; i16 != digestSize; i16++) {
                    int i17 = length + i16;
                    processBlock[i17] = (byte) (processBlock[i17] ^ bArr3[i16]);
                    if (processBlock[i17] != 0) {
                        z11 = false;
                    }
                }
                if (!z11) {
                    return d(processBlock);
                }
                byte[] bArr4 = new byte[i15];
                this.f59180n = bArr4;
                System.arraycopy(processBlock, i14, bArr4, 0, bArr4.length);
            } else if (this.f59179m > i15) {
                return d(processBlock);
            } else {
                this.f59173g.reset();
                this.f59173g.update(processBlock, i14, i15);
                this.f59173g.doFinal(bArr3, 0);
                boolean z12 = true;
                for (int i18 = 0; i18 != digestSize; i18++) {
                    int i19 = length + i18;
                    processBlock[i19] = (byte) (processBlock[i19] ^ bArr3[i18]);
                    if (processBlock[i19] != 0) {
                        z12 = false;
                    }
                }
                if (!z12) {
                    return d(processBlock);
                }
                byte[] bArr5 = new byte[i15];
                this.f59180n = bArr5;
                System.arraycopy(processBlock, i14, bArr5, 0, bArr5.length);
            }
            if (this.f59179m == 0 || b(this.f59178l, this.f59180n)) {
                a(this.f59178l);
                a(processBlock);
                this.f59179m = 0;
                return true;
            }
            return d(processBlock);
        }
        return d(processBlock);
    }
}