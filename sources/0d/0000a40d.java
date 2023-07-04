package org.spongycastle.pqc.crypto.sphincs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.MessageSigner;
import org.spongycastle.pqc.crypto.sphincs.Tree;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class SPHINCS256Signer implements MessageSigner {
    private final HashFunctions hashFunctions;
    private byte[] keyData;

    public SPHINCS256Signer(Digest digest, Digest digest2) {
        if (digest.getDigestSize() == 32) {
            if (digest2.getDigestSize() == 64) {
                this.hashFunctions = new HashFunctions(digest, digest2);
                return;
            }
            throw new IllegalArgumentException("2n-digest needs to produce 64 bytes of output");
        }
        throw new IllegalArgumentException("n-digest needs to produce 32 bytes of output");
    }

    static void compute_authpath_wots(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i11, Tree.leafaddr leafaddrVar, byte[] bArr3, byte[] bArr4, int i12) {
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr(leafaddrVar);
        byte[] bArr5 = new byte[2048];
        byte[] bArr6 = new byte[1024];
        byte[] bArr7 = new byte[68608];
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j11 = leafaddrVar2.subleaf;
            if (j11 >= 32) {
                break;
            }
            Seed.get_seed(hashFunctions, bArr6, (int) (j11 * 32), bArr3, leafaddrVar2);
            leafaddrVar2.subleaf++;
        }
        Wots wots = new Wots();
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j12 = leafaddrVar2.subleaf;
            if (j12 >= 32) {
                break;
            }
            wots.wots_pkgen(hashFunctions, bArr7, (int) (67 * j12 * 32), bArr6, (int) (j12 * 32), bArr4, 0);
            leafaddrVar2.subleaf++;
        }
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j13 = leafaddrVar2.subleaf;
            if (j13 >= 32) {
                break;
            }
            Tree.l_tree(hashFunctions, bArr5, (int) ((j13 * 32) + 1024), bArr7, (int) (j13 * 67 * 32), bArr4, 0);
            leafaddrVar2.subleaf++;
        }
        int i13 = 0;
        for (int i14 = 32; i14 > 0; i14 >>>= 1) {
            for (int i15 = 0; i15 < i14; i15 += 2) {
                hashFunctions.hash_2n_n_mask(bArr5, ((i14 >>> 1) * 32) + ((i15 >>> 1) * 32), bArr5, (i14 * 32) + (i15 * 32), bArr4, (i13 + 7) * 2 * 32);
            }
            i13++;
        }
        int i16 = (int) leafaddrVar.subleaf;
        for (int i17 = 0; i17 < i12; i17++) {
            System.arraycopy(bArr5, ((32 >>> i17) * 32) + (((i16 >>> i17) ^ 1) * 32), bArr2, i11 + (i17 * 32), 32);
        }
        System.arraycopy(bArr5, 32, bArr, 0, 32);
    }

    static void validate_authpath(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, int i12, byte[] bArr4, int i13) {
        byte[] bArr5 = new byte[64];
        if ((i11 & 1) != 0) {
            for (int i14 = 0; i14 < 32; i14++) {
                bArr5[i14 + 32] = bArr2[i14];
            }
            for (int i15 = 0; i15 < 32; i15++) {
                bArr5[i15] = bArr3[i12 + i15];
            }
        } else {
            for (int i16 = 0; i16 < 32; i16++) {
                bArr5[i16] = bArr2[i16];
            }
            for (int i17 = 0; i17 < 32; i17++) {
                bArr5[i17 + 32] = bArr3[i12 + i17];
            }
        }
        int i18 = i12 + 32;
        int i19 = 0;
        int i21 = i11;
        while (i19 < i13 - 1) {
            int i22 = i21 >>> 1;
            if ((i22 & 1) != 0) {
                hashFunctions.hash_2n_n_mask(bArr5, 32, bArr5, 0, bArr4, (i19 + 7) * 2 * 32);
                for (int i23 = 0; i23 < 32; i23++) {
                    bArr5[i23] = bArr3[i18 + i23];
                }
            } else {
                hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr4, (i19 + 7) * 2 * 32);
                for (int i24 = 0; i24 < 32; i24++) {
                    bArr5[i24 + 32] = bArr3[i18 + i24];
                }
            }
            i18 += 32;
            i19++;
            i21 = i22;
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr5, 0, bArr4, ((i13 + 7) - 1) * 2 * 32);
    }

    private void zerobytes(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 != i12; i13++) {
            bArr[i11 + i13] = 0;
        }
    }

    byte[] crypto_sign(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[41000];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        long[] jArr = new long[8];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[1024];
        byte[] bArr9 = new byte[1088];
        for (int i11 = 0; i11 < 1088; i11++) {
            bArr9[i11] = bArr2[i11];
        }
        System.arraycopy(bArr9, 1056, bArr3, 40968, 32);
        Digest messageHash = hashFunctions.getMessageHash();
        byte[] bArr10 = new byte[messageHash.getDigestSize()];
        messageHash.update(bArr3, 40968, 32);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr10, 0);
        zerobytes(bArr3, 40968, 32);
        for (int i12 = 0; i12 != 8; i12++) {
            jArr[i12] = Pack.littleEndianToLong(bArr10, i12 * 8);
        }
        long j11 = jArr[0] & 1152921504606846975L;
        System.arraycopy(bArr10, 16, bArr4, 0, 32);
        System.arraycopy(bArr4, 0, bArr3, 39912, 32);
        Tree.leafaddr leafaddrVar = new Tree.leafaddr();
        leafaddrVar.level = 11;
        leafaddrVar.subtree = 0L;
        leafaddrVar.subleaf = 0L;
        System.arraycopy(bArr9, 32, bArr3, 39944, 1024);
        Tree.treehash(hashFunctions, bArr3, 40968, 5, bArr9, leafaddrVar, bArr3, 39944);
        Digest messageHash2 = hashFunctions.getMessageHash();
        messageHash2.update(bArr3, 39912, 1088);
        messageHash2.update(bArr, 0, bArr.length);
        messageHash2.doFinal(bArr5, 0);
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr();
        leafaddrVar2.level = 12;
        leafaddrVar2.subleaf = (int) (j11 & 31);
        leafaddrVar2.subtree = j11 >>> 5;
        for (int i13 = 0; i13 < 32; i13++) {
            bArr3[i13] = bArr4[i13];
        }
        byte[] bArr11 = bArr8;
        System.arraycopy(bArr9, 32, bArr11, 0, 1024);
        for (int i14 = 0; i14 < 8; i14++) {
            bArr3[32 + i14] = (byte) ((j11 >>> (i14 * 8)) & 255);
        }
        Seed.get_seed(hashFunctions, bArr7, 0, bArr9, leafaddrVar2);
        new Horst();
        byte[] bArr12 = bArr9;
        Wots wots = new Wots();
        int horst_sign = 40 + Horst.horst_sign(hashFunctions, bArr3, 40, bArr6, bArr7, bArr11, bArr5);
        int i15 = 0;
        for (int i16 = 12; i15 < i16; i16 = 12) {
            leafaddrVar2.level = i15;
            byte[] bArr13 = bArr12;
            Seed.get_seed(hashFunctions, bArr7, 0, bArr13, leafaddrVar2);
            int i17 = horst_sign;
            int i18 = horst_sign;
            byte[] bArr14 = bArr11;
            wots.wots_sign(hashFunctions, bArr3, i17, bArr6, bArr7, bArr14);
            int i19 = i18 + 2144;
            compute_authpath_wots(hashFunctions, bArr6, bArr3, i19, leafaddrVar2, bArr13, bArr14, 5);
            horst_sign = i19 + 160;
            long j12 = leafaddrVar2.subtree;
            leafaddrVar2.subleaf = (int) (j12 & 31);
            leafaddrVar2.subtree = j12 >>> 5;
            i15++;
            bArr12 = bArr13;
            bArr11 = bArr11;
        }
        zerobytes(bArr12, 0, 1088);
        return bArr3;
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return crypto_sign(this.hashFunctions, bArr, this.keyData);
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (z11) {
            this.keyData = ((SPHINCSPrivateKeyParameters) cipherParameters).getKeyData();
        } else {
            this.keyData = ((SPHINCSPublicKeyParameters) cipherParameters).getKeyData();
        }
    }

    boolean verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[2144];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[41000];
        byte[] bArr8 = new byte[1056];
        if (bArr2.length == 41000) {
            byte[] bArr9 = new byte[64];
            for (int i11 = 0; i11 < 1056; i11++) {
                bArr8[i11] = bArr3[i11];
            }
            byte[] bArr10 = new byte[32];
            for (int i12 = 0; i12 < 32; i12++) {
                bArr10[i12] = bArr2[i12];
            }
            System.arraycopy(bArr2, 0, bArr7, 0, 41000);
            Digest messageHash = hashFunctions.getMessageHash();
            messageHash.update(bArr10, 0, 32);
            messageHash.update(bArr8, 0, 1056);
            messageHash.update(bArr, 0, bArr.length);
            messageHash.doFinal(bArr9, 0);
            long j11 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                j11 ^= (bArr7[32 + i13] & 255) << (i13 * 8);
            }
            new Horst();
            Horst.horst_verify(hashFunctions, bArr6, bArr7, 40, bArr8, bArr9);
            Wots wots = new Wots();
            int i14 = 0;
            int i15 = 13352;
            while (i14 < 12) {
                byte[] bArr11 = bArr8;
                wots.wots_verify(hashFunctions, bArr4, bArr7, i15, bArr6, bArr8);
                int i16 = i15 + 2144;
                Tree.l_tree(hashFunctions, bArr5, 0, bArr4, 0, bArr11, 0);
                byte[] bArr12 = bArr7;
                validate_authpath(hashFunctions, bArr6, bArr5, (int) (31 & j11), bArr12, i16, bArr11, 5);
                j11 >>= 5;
                i15 = i16 + 160;
                i14++;
                bArr7 = bArr12;
                bArr8 = bArr11;
            }
            byte[] bArr13 = bArr8;
            boolean z11 = true;
            for (int i17 = 0; i17 < 32; i17++) {
                if (bArr6[i17] != bArr13[i17 + 1024]) {
                    z11 = false;
                }
            }
            return z11;
        }
        throw new IllegalArgumentException("signature wrong size");
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return verify(this.hashFunctions, bArr, bArr2, this.keyData);
    }
}