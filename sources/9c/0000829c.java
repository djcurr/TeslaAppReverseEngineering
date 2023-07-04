package l50;

import java.util.ArrayList;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* loaded from: classes5.dex */
public class s implements org.bouncycastle.crypto.c0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f36885a;

    /* renamed from: b  reason: collision with root package name */
    private r f36886b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f36887c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f36888d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f36889e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f36890f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<byte[]> f36891g;

    public s(int i11) {
        r rVar = new r(i11);
        this.f36886b = rVar;
        this.f36887c = new byte[rVar.getBlockSize() / 2];
        this.f36889e = new byte[this.f36886b.getBlockSize()];
        this.f36890f = new byte[this.f36886b.getBlockSize()];
        this.f36891g = new ArrayList<>();
        this.f36888d = new byte[4];
    }

    private void a(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >> 24);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12] = (byte) i11;
    }

    @Override // org.bouncycastle.crypto.c0
    public String getAlgorithmName() {
        return "DSTU7624WrapEngine";
    }

    @Override // org.bouncycastle.crypto.c0
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof u50.g1) {
            iVar = ((u50.g1) iVar).a();
        }
        this.f36885a = z11;
        if (!(iVar instanceof u50.b1)) {
            throw new IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
        }
        this.f36886b.init(z11, iVar);
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        if (this.f36885a) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i12 % this.f36886b.getBlockSize() != 0) {
            throw new DataLengthException("unwrap data must be a multiple of " + this.f36886b.getBlockSize() + " bytes");
        }
        int blockSize = (i12 * 2) / this.f36886b.getBlockSize();
        int i13 = blockSize - 1;
        int i14 = i13 * 6;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        byte[] bArr3 = new byte[this.f36886b.getBlockSize() / 2];
        System.arraycopy(bArr2, 0, bArr3, 0, this.f36886b.getBlockSize() / 2);
        this.f36891g.clear();
        int blockSize2 = i12 - (this.f36886b.getBlockSize() / 2);
        int blockSize3 = this.f36886b.getBlockSize() / 2;
        while (blockSize2 != 0) {
            byte[] bArr4 = new byte[this.f36886b.getBlockSize() / 2];
            System.arraycopy(bArr2, blockSize3, bArr4, 0, this.f36886b.getBlockSize() / 2);
            this.f36891g.add(bArr4);
            blockSize2 -= this.f36886b.getBlockSize() / 2;
            blockSize3 += this.f36886b.getBlockSize() / 2;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            System.arraycopy(this.f36891g.get(blockSize - 2), 0, bArr2, 0, this.f36886b.getBlockSize() / 2);
            System.arraycopy(bArr3, 0, bArr2, this.f36886b.getBlockSize() / 2, this.f36886b.getBlockSize() / 2);
            a(i14 - i15, this.f36888d, 0);
            for (int i16 = 0; i16 < 4; i16++) {
                int blockSize4 = (this.f36886b.getBlockSize() / 2) + i16;
                bArr2[blockSize4] = (byte) (bArr2[blockSize4] ^ this.f36888d[i16]);
            }
            this.f36886b.processBlock(bArr2, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, 0, this.f36886b.getBlockSize() / 2);
            for (int i17 = 2; i17 < blockSize; i17++) {
                int i18 = blockSize - i17;
                System.arraycopy(this.f36891g.get(i18 - 1), 0, this.f36891g.get(i18), 0, this.f36886b.getBlockSize() / 2);
            }
            System.arraycopy(bArr2, this.f36886b.getBlockSize() / 2, this.f36891g.get(0), 0, this.f36886b.getBlockSize() / 2);
        }
        System.arraycopy(bArr3, 0, bArr2, 0, this.f36886b.getBlockSize() / 2);
        int blockSize5 = this.f36886b.getBlockSize() / 2;
        for (int i19 = 0; i19 < i13; i19++) {
            System.arraycopy(this.f36891g.get(i19), 0, bArr2, blockSize5, this.f36886b.getBlockSize() / 2);
            blockSize5 += this.f36886b.getBlockSize() / 2;
        }
        System.arraycopy(bArr2, i12 - this.f36886b.getBlockSize(), this.f36889e, 0, this.f36886b.getBlockSize());
        byte[] bArr5 = new byte[i12 - this.f36886b.getBlockSize()];
        if (org.bouncycastle.util.a.c(this.f36889e, this.f36890f)) {
            System.arraycopy(bArr2, 0, bArr5, 0, i12 - this.f36886b.getBlockSize());
            return bArr5;
        }
        throw new InvalidCipherTextException("checksum failed");
    }

    @Override // org.bouncycastle.crypto.c0
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (this.f36885a) {
            if (i12 % this.f36886b.getBlockSize() != 0) {
                throw new DataLengthException("wrap data must be a multiple of " + this.f36886b.getBlockSize() + " bytes");
            } else if (i11 + i12 <= bArr.length) {
                int blockSize = ((i12 / this.f36886b.getBlockSize()) + 1) * 2;
                int i13 = blockSize - 1;
                int i14 = i13 * 6;
                int blockSize2 = this.f36886b.getBlockSize() + i12;
                byte[] bArr2 = new byte[blockSize2];
                System.arraycopy(bArr, i11, bArr2, 0, i12);
                System.arraycopy(bArr2, 0, this.f36887c, 0, this.f36886b.getBlockSize() / 2);
                this.f36891g.clear();
                int blockSize3 = blockSize2 - (this.f36886b.getBlockSize() / 2);
                int blockSize4 = this.f36886b.getBlockSize() / 2;
                while (blockSize3 != 0) {
                    byte[] bArr3 = new byte[this.f36886b.getBlockSize() / 2];
                    System.arraycopy(bArr2, blockSize4, bArr3, 0, this.f36886b.getBlockSize() / 2);
                    this.f36891g.add(bArr3);
                    blockSize3 -= this.f36886b.getBlockSize() / 2;
                    blockSize4 += this.f36886b.getBlockSize() / 2;
                }
                int i15 = 0;
                while (i15 < i14) {
                    System.arraycopy(this.f36887c, 0, bArr2, 0, this.f36886b.getBlockSize() / 2);
                    System.arraycopy(this.f36891g.get(0), 0, bArr2, this.f36886b.getBlockSize() / 2, this.f36886b.getBlockSize() / 2);
                    this.f36886b.processBlock(bArr2, 0, bArr2, 0);
                    i15++;
                    a(i15, this.f36888d, 0);
                    for (int i16 = 0; i16 < 4; i16++) {
                        int blockSize5 = (this.f36886b.getBlockSize() / 2) + i16;
                        bArr2[blockSize5] = (byte) (bArr2[blockSize5] ^ this.f36888d[i16]);
                    }
                    System.arraycopy(bArr2, this.f36886b.getBlockSize() / 2, this.f36887c, 0, this.f36886b.getBlockSize() / 2);
                    for (int i17 = 2; i17 < blockSize; i17++) {
                        System.arraycopy(this.f36891g.get(i17 - 1), 0, this.f36891g.get(i17 - 2), 0, this.f36886b.getBlockSize() / 2);
                    }
                    System.arraycopy(bArr2, 0, this.f36891g.get(blockSize - 2), 0, this.f36886b.getBlockSize() / 2);
                }
                System.arraycopy(this.f36887c, 0, bArr2, 0, this.f36886b.getBlockSize() / 2);
                int blockSize6 = this.f36886b.getBlockSize() / 2;
                for (int i18 = 0; i18 < i13; i18++) {
                    System.arraycopy(this.f36891g.get(i18), 0, bArr2, blockSize6, this.f36886b.getBlockSize() / 2);
                    blockSize6 += this.f36886b.getBlockSize() / 2;
                }
                return bArr2;
            } else {
                throw new DataLengthException("input buffer too short");
            }
        }
        throw new IllegalStateException("not set for wrapping");
    }
}