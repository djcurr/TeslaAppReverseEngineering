package l50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class k0 implements org.bouncycastle.crypto.c0 {

    /* renamed from: a  reason: collision with root package name */
    private q50.c f36797a;

    /* renamed from: b  reason: collision with root package name */
    private u50.f1 f36798b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36799c;

    /* renamed from: d  reason: collision with root package name */
    private SecureRandom f36800d;

    public k0(org.bouncycastle.crypto.e eVar) {
        this.f36797a = new q50.c(eVar);
    }

    @Override // org.bouncycastle.crypto.c0
    public String getAlgorithmName() {
        return this.f36797a.c().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // org.bouncycastle.crypto.c0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        this.f36799c = z11;
        if (iVar instanceof u50.g1) {
            u50.g1 g1Var = (u50.g1) iVar;
            this.f36800d = g1Var.b();
            if (!(g1Var.a() instanceof u50.f1)) {
                throw new IllegalArgumentException("RFC3211Wrap requires an IV");
            }
            this.f36798b = (u50.f1) g1Var.a();
            return;
        }
        if (z11) {
            this.f36800d = org.bouncycastle.crypto.k.b();
        }
        if (!(iVar instanceof u50.f1)) {
            throw new IllegalArgumentException("RFC3211Wrap requires an IV");
        }
        this.f36798b = (u50.f1) iVar;
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        if (this.f36799c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int blockSize = this.f36797a.getBlockSize();
        if (i12 >= blockSize * 2) {
            byte[] bArr2 = new byte[i12];
            byte[] bArr3 = new byte[blockSize];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            System.arraycopy(bArr, i11, bArr3, 0, blockSize);
            this.f36797a.init(false, new u50.f1(this.f36798b.b(), bArr3));
            for (int i13 = blockSize; i13 < i12; i13 += blockSize) {
                this.f36797a.processBlock(bArr2, i13, bArr2, i13);
            }
            System.arraycopy(bArr2, i12 - blockSize, bArr3, 0, blockSize);
            this.f36797a.init(false, new u50.f1(this.f36798b.b(), bArr3));
            this.f36797a.processBlock(bArr2, 0, bArr2, 0);
            this.f36797a.init(false, this.f36798b);
            for (int i14 = 0; i14 < i12; i14 += blockSize) {
                this.f36797a.processBlock(bArr2, i14, bArr2, i14);
            }
            int i15 = i12 - 4;
            boolean z11 = (bArr2[0] & 255) > i15;
            if (!z11) {
                i15 = bArr2[0] & 255;
            }
            byte[] bArr4 = new byte[i15];
            System.arraycopy(bArr2, 4, bArr4, 0, bArr4.length);
            int i16 = 0;
            int i17 = 0;
            while (i16 != 3) {
                int i18 = i16 + 1;
                i17 |= bArr2[i16 + 4] ^ ((byte) (~bArr2[i18]));
                i16 = i18;
            }
            org.bouncycastle.util.a.g(bArr2);
            if (!z11 && !(i17 != 0)) {
                return bArr4;
            }
            throw new InvalidCipherTextException("wrapped key corrupted");
        }
        throw new InvalidCipherTextException("input too short");
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (this.f36799c) {
            if (i12 > 255 || i12 < 0) {
                throw new IllegalArgumentException("input must be from 0 to 255 bytes");
            }
            this.f36797a.init(true, this.f36798b);
            int blockSize = this.f36797a.getBlockSize();
            int i13 = i12 + 4;
            int i14 = blockSize * 2;
            if (i13 >= i14) {
                i14 = i13 % blockSize == 0 ? i13 : ((i13 / blockSize) + 1) * blockSize;
            }
            byte[] bArr2 = new byte[i14];
            bArr2[0] = (byte) i12;
            System.arraycopy(bArr, i11, bArr2, 4, i12);
            int length = bArr2.length - i13;
            byte[] bArr3 = new byte[length];
            this.f36800d.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i13, length);
            bArr2[1] = (byte) (~bArr2[4]);
            bArr2[2] = (byte) (~bArr2[5]);
            bArr2[3] = (byte) (~bArr2[6]);
            for (int i15 = 0; i15 < bArr2.length; i15 += blockSize) {
                this.f36797a.processBlock(bArr2, i15, bArr2, i15);
            }
            for (int i16 = 0; i16 < bArr2.length; i16 += blockSize) {
                this.f36797a.processBlock(bArr2, i16, bArr2, i16);
            }
            return bArr2;
        }
        throw new IllegalStateException("not set for wrapping");
    }
}