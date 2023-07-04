package org.spongycastle.crypto.prng.drbg;

import java.util.Hashtable;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.prng.EntropySource;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
public class HashSP800DRBG implements SP80090DRBG {
    private static final int MAX_BITS_REQUEST = 262144;
    private static final byte[] ONE = {1};
    private static final long RESEED_MAX = 140737488355328L;
    private static final Hashtable seedlens;
    private byte[] _C;
    private byte[] _V;
    private Digest _digest;
    private EntropySource _entropySource;
    private long _reseedCounter;
    private int _securityStrength;
    private int _seedLength;

    static {
        Hashtable hashtable = new Hashtable();
        seedlens = hashtable;
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA1, Integers.valueOf(440));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA224, Integers.valueOf(440));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA256, Integers.valueOf(440));
        hashtable.put("SHA-512/256", Integers.valueOf(440));
        hashtable.put("SHA-512/224", Integers.valueOf(440));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA384, Integers.valueOf(888));
        hashtable.put(McElieceCCA2KeyGenParameterSpec.SHA512, Integers.valueOf(888));
    }

    public HashSP800DRBG(Digest digest, int i11, EntropySource entropySource, byte[] bArr, byte[] bArr2) {
        if (i11 <= Utils.getMaxSecurityStrength(digest)) {
            if (entropySource.entropySize() >= i11) {
                this._digest = digest;
                this._entropySource = entropySource;
                this._securityStrength = i11;
                this._seedLength = ((Integer) seedlens.get(digest.getAlgorithmName())).intValue();
                byte[] hash_df = Utils.hash_df(this._digest, Arrays.concatenate(getEntropy(), bArr2, bArr), this._seedLength);
                this._V = hash_df;
                byte[] bArr3 = new byte[hash_df.length + 1];
                System.arraycopy(hash_df, 0, bArr3, 1, hash_df.length);
                this._C = Utils.hash_df(this._digest, bArr3, this._seedLength);
                this._reseedCounter = 1L;
                return;
            }
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
        throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
    }

    private void addTo(byte[] bArr, byte[] bArr2) {
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

    private void doHash(byte[] bArr, byte[] bArr2) {
        this._digest.update(bArr, 0, bArr.length);
        this._digest.doFinal(bArr2, 0);
    }

    private byte[] getEntropy() {
        byte[] entropy = this._entropySource.getEntropy();
        if (entropy.length >= (this._securityStrength + 7) / 8) {
            return entropy;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    private byte[] hash(byte[] bArr) {
        byte[] bArr2 = new byte[this._digest.getDigestSize()];
        doHash(bArr, bArr2);
        return bArr2;
    }

    private byte[] hashgen(byte[] bArr, int i11) {
        int i12 = i11 / 8;
        int digestSize = i12 / this._digest.getDigestSize();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i12];
        int digestSize2 = this._digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        for (int i13 = 0; i13 <= digestSize; i13++) {
            doHash(bArr2, bArr4);
            int i14 = i13 * digestSize2;
            int i15 = i12 - i14;
            if (i15 > digestSize2) {
                i15 = digestSize2;
            }
            System.arraycopy(bArr4, 0, bArr3, i14, i15);
            addTo(bArr2, ONE);
        }
        return bArr3;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int generate(byte[] bArr, byte[] bArr2, boolean z11) {
        long j11;
        int length = bArr.length * 8;
        if (length <= 262144) {
            if (this._reseedCounter > RESEED_MAX) {
                return -1;
            }
            if (z11) {
                reseed(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                byte[] bArr3 = this._V;
                byte[] bArr4 = new byte[bArr3.length + 1 + bArr2.length];
                bArr4[0] = 2;
                System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
                System.arraycopy(bArr2, 0, bArr4, this._V.length + 1, bArr2.length);
                addTo(this._V, hash(bArr4));
            }
            byte[] hashgen = hashgen(this._V, length);
            byte[] bArr5 = this._V;
            byte[] bArr6 = new byte[bArr5.length + 1];
            System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
            bArr6[0] = 3;
            addTo(this._V, hash(bArr6));
            addTo(this._V, this._C);
            addTo(this._V, new byte[]{(byte) (j11 >> 24), (byte) (j11 >> 16), (byte) (j11 >> 8), (byte) this._reseedCounter});
            this._reseedCounter++;
            System.arraycopy(hashgen, 0, bArr, 0, bArr.length);
            return length;
        }
        throw new IllegalArgumentException("Number of bits per request limited to 262144");
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public int getBlockSize() {
        return this._digest.getDigestSize() * 8;
    }

    @Override // org.spongycastle.crypto.prng.drbg.SP80090DRBG
    public void reseed(byte[] bArr) {
        byte[] hash_df = Utils.hash_df(this._digest, Arrays.concatenate(ONE, this._V, getEntropy(), bArr), this._seedLength);
        this._V = hash_df;
        byte[] bArr2 = new byte[hash_df.length + 1];
        bArr2[0] = 0;
        System.arraycopy(hash_df, 0, bArr2, 1, hash_df.length);
        this._C = Utils.hash_df(this._digest, bArr2, this._seedLength);
        this._reseedCounter = 1L;
    }
}