package org.spongycastle.crypto.engines;

import okhttp3.internal.http2.Settings;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* loaded from: classes4.dex */
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 1) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i11 = this.index;
        this.index = i11 + 1;
        return bArr[i11];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i11 = (iArr[0] >>> 1) | (iArr[1] << 15);
        int i12 = (iArr[0] >>> 2) | (iArr[1] << 14);
        int i13 = (iArr[0] >>> 4) | (iArr[1] << 12);
        int i14 = (iArr[0] >>> 10) | (iArr[1] << 6);
        int i15 = (iArr[1] >>> 15) | (iArr[2] << 1);
        int i16 = (iArr[2] >>> 11) | (iArr[3] << 5);
        int i17 = (iArr[3] >>> 8) | (iArr[4] << 8);
        int i18 = (iArr[4] << 1) | (iArr[3] >>> 15);
        int[] iArr2 = this.lfsr;
        int i19 = (iArr2[0] >>> 3) | (iArr2[1] << 13);
        int i21 = (iArr2[1] >>> 9) | (iArr2[2] << 7);
        int i22 = (iArr2[3] << 2) | (iArr2[2] >>> 14);
        int i23 = iArr2[4];
        int i24 = (i21 ^ i18) ^ (i19 & i23);
        int i25 = i22 & i23;
        int i26 = i19 & i22;
        int i27 = i23 & i26;
        int i28 = i26 & i18;
        return (((((((((i18 & i25) ^ ((i28 ^ (i27 ^ (((i24 ^ i25) ^ (i23 & i18)) ^ ((i19 & i21) & i22)))) ^ ((i21 & i22) & i18))) ^ i11) ^ i12) ^ i13) ^ i14) ^ i15) ^ i16) ^ i17) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i11 = iArr[0];
        int i12 = (iArr[1] >>> 7) | (iArr[2] << 9);
        int i13 = (iArr[2] >>> 6) | (iArr[3] << 10);
        return (((iArr[4] << 2) | (iArr[3] >>> 14)) ^ ((((((iArr[0] >>> 13) | (iArr[1] << 3)) ^ i11) ^ i12) ^ i13) ^ ((iArr[3] >>> 3) | (iArr[4] << 13)))) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i11 = iArr[0];
        int i12 = (iArr[0] >>> 9) | (iArr[1] << 7);
        int i13 = (iArr[0] >>> 14) | (iArr[1] << 2);
        int i14 = (iArr[0] >>> 15) | (iArr[1] << 1);
        int i15 = (iArr[1] >>> 5) | (iArr[2] << 11);
        int i16 = (iArr[1] >>> 12) | (iArr[2] << 4);
        int i17 = (iArr[2] >>> 1) | (iArr[3] << 15);
        int i18 = (iArr[2] >>> 5) | (iArr[3] << 11);
        int i19 = (iArr[2] >>> 13) | (iArr[3] << 3);
        int i21 = (iArr[3] >>> 4) | (iArr[4] << 12);
        int i22 = (iArr[3] >>> 12) | (iArr[4] << 4);
        int i23 = (iArr[4] << 1) | (iArr[3] >>> 15);
        int i24 = i23 & i22;
        int i25 = i22 & i21;
        int i26 = ((((i11 ^ (((((((((((iArr[3] >>> 14) | (iArr[4] << 2)) ^ i22) ^ i21) ^ i19) ^ i18) ^ i17) ^ i16) ^ i15) ^ i13) ^ i12)) ^ i24) ^ (i18 & i17)) ^ (i14 & i12)) ^ (i25 & i19);
        int i27 = i17 & i16 & i15;
        return (((((((((i23 & i19) & i16) & i12) ^ (i26 ^ i27)) ^ ((i25 & i18) & i17)) ^ ((i24 & i15) & i14)) ^ (((i24 & i21) & i19) & i18)) ^ ((i14 & i27) & i12)) ^ (((((i21 & i19) & i18) & i17) & i16) & i15)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    private void initGrain() {
        for (int i11 = 0; i11 < 10; i11++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i11 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i13 = i12 + 1;
            iArr[i11] = ((bArr3[i12] & 255) | (bArr3[i13] << 8)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i11] = ((bArr4[i12] & 255) | (bArr4[i13] << 8)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            i12 += 2;
            i11++;
        }
    }

    private int[] shift(int[] iArr, int i11) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i11;
        return iArr;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2 != null && iv2.length == 8) {
                if (parametersWithIV.getParameters() instanceof KeyParameter) {
                    KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
                    this.workingIV = new byte[keyParameter.getKey().length];
                    this.workingKey = new byte[keyParameter.getKey().length];
                    this.lfsr = new int[5];
                    this.nfsr = new int[5];
                    this.out = new byte[2];
                    System.arraycopy(iv2, 0, this.workingIV, 0, iv2.length);
                    System.arraycopy(keyParameter.getKey(), 0, this.workingKey, 0, keyParameter.getKey().length);
                    reset();
                    return;
                }
                throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
            }
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.initialised) {
            if (i11 + i12 <= bArr.length) {
                if (i13 + i12 <= bArr2.length) {
                    for (int i14 = 0; i14 < i12; i14++) {
                        bArr2[i13 + i14] = (byte) (bArr[i11 + i14] ^ getKeyStream());
                    }
                    return i12;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 2;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        if (this.initialised) {
            return (byte) (b11 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}