package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.MaxBytesExceededException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.SkippingStreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    private static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* renamed from: x */
    protected int[] f43513x;

    public Salsa20Engine() {
        this(20);
    }

    private boolean limitExceeded() {
        int i11 = this.cW0 + 1;
        this.cW0 = i11;
        if (i11 == 0) {
            int i12 = this.cW1 + 1;
            this.cW1 = i12;
            if (i12 == 0) {
                int i13 = this.cW2 + 1;
                this.cW2 = i13;
                return (i13 & 32) != 0;
            }
        }
        return false;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    public static int rotl(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    public static void salsaCore(int i11, int[] iArr, int[] iArr2) {
        if (iArr.length == 16) {
            if (iArr2.length == 16) {
                if (i11 % 2 == 0) {
                    char c11 = 0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    int i14 = iArr[2];
                    int i15 = iArr[3];
                    int i16 = iArr[4];
                    int i17 = iArr[5];
                    int i18 = iArr[6];
                    int i19 = 7;
                    int i21 = iArr[7];
                    int i22 = iArr[8];
                    int i23 = 9;
                    int i24 = iArr[9];
                    int i25 = iArr[10];
                    int i26 = iArr[11];
                    int i27 = iArr[12];
                    int i28 = 13;
                    int i29 = iArr[13];
                    int i31 = iArr[14];
                    int i32 = iArr[15];
                    int i33 = i31;
                    int i34 = i29;
                    int i35 = i27;
                    int i36 = i26;
                    int i37 = i25;
                    int i38 = i24;
                    int i39 = i22;
                    int i41 = i21;
                    int i42 = i18;
                    int i43 = i17;
                    int i44 = i16;
                    int i45 = i15;
                    int i46 = i14;
                    int i47 = i13;
                    int i48 = i12;
                    int i49 = i11;
                    while (i49 > 0) {
                        int rotl = rotl(i48 + i35, i19) ^ i44;
                        int rotl2 = i39 ^ rotl(rotl + i48, i23);
                        int rotl3 = i35 ^ rotl(rotl2 + rotl, i28);
                        int rotl4 = rotl(rotl3 + rotl2, 18) ^ i48;
                        int rotl5 = i38 ^ rotl(i43 + i47, i19);
                        int rotl6 = i34 ^ rotl(rotl5 + i43, i23);
                        int rotl7 = i47 ^ rotl(rotl6 + rotl5, i28);
                        int rotl8 = rotl(rotl7 + rotl6, 18) ^ i43;
                        int rotl9 = i33 ^ rotl(i37 + i42, 7);
                        int rotl10 = i46 ^ rotl(rotl9 + i37, 9);
                        int rotl11 = i42 ^ rotl(rotl10 + rotl9, 13);
                        int rotl12 = i37 ^ rotl(rotl11 + rotl10, 18);
                        int rotl13 = i45 ^ rotl(i32 + i36, 7);
                        int rotl14 = i41 ^ rotl(rotl13 + i32, 9);
                        int i51 = i49;
                        int rotl15 = i36 ^ rotl(rotl14 + rotl13, 13);
                        int rotl16 = i32 ^ rotl(rotl15 + rotl14, 18);
                        i47 = rotl7 ^ rotl(rotl4 + rotl13, 7);
                        i46 = rotl10 ^ rotl(i47 + rotl4, 9);
                        int rotl17 = rotl13 ^ rotl(i46 + i47, 13);
                        int rotl18 = rotl4 ^ rotl(rotl17 + i46, 18);
                        i42 = rotl11 ^ rotl(rotl8 + rotl, 7);
                        i41 = rotl14 ^ rotl(i42 + rotl8, 9);
                        int rotl19 = rotl(i41 + i42, 13) ^ rotl;
                        i43 = rotl8 ^ rotl(rotl19 + i41, 18);
                        i36 = rotl15 ^ rotl(rotl12 + rotl5, 7);
                        int rotl20 = rotl(i36 + rotl12, 9) ^ rotl2;
                        i38 = rotl5 ^ rotl(rotl20 + i36, 13);
                        i37 = rotl12 ^ rotl(i38 + rotl20, 18);
                        i35 = rotl3 ^ rotl(rotl16 + rotl9, 7);
                        i34 = rotl6 ^ rotl(i35 + rotl16, 9);
                        i33 = rotl9 ^ rotl(i34 + i35, 13);
                        i32 = rotl16 ^ rotl(i33 + i34, 18);
                        i45 = rotl17;
                        i39 = rotl20;
                        i48 = rotl18;
                        i44 = rotl19;
                        c11 = 0;
                        i28 = 13;
                        i23 = 9;
                        i19 = 7;
                        i49 = i51 - 2;
                    }
                    char c12 = c11;
                    iArr2[c12] = i48 + iArr[c12];
                    iArr2[1] = i47 + iArr[1];
                    iArr2[2] = i46 + iArr[2];
                    iArr2[3] = i45 + iArr[3];
                    iArr2[4] = i44 + iArr[4];
                    iArr2[5] = i43 + iArr[5];
                    iArr2[6] = i42 + iArr[6];
                    iArr2[7] = i41 + iArr[7];
                    iArr2[8] = i39 + iArr[8];
                    iArr2[9] = i38 + iArr[9];
                    iArr2[10] = i37 + iArr[10];
                    iArr2[11] = i36 + iArr[11];
                    iArr2[12] = i35 + iArr[12];
                    iArr2[13] = i34 + iArr[13];
                    iArr2[14] = i33 + iArr[14];
                    iArr2[15] = i32 + iArr[15];
                    return;
                }
                throw new IllegalArgumentException("Number of rounds must be even");
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    protected void advanceCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i11;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[8];
        iArr2[8] = iArr2[8] + i12;
        if (i13 == 0 || iArr2[8] >= i13) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    protected void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f43513x);
        Pack.intToLittleEndian(this.f43513x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds != 20) {
            return "Salsa20/" + this.rounds;
        }
        return "Salsa20";
    }

    protected long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[9] << 32) | (iArr[8] & 4294967295L);
    }

    protected int getNonceSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + this.index;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2 != null && iv2.length == getNonceSize()) {
                CipherParameters parameters = parametersWithIV.getParameters();
                if (parameters == null) {
                    if (this.initialised) {
                        setKey(null, iv2);
                    } else {
                        throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
                    }
                } else if (parameters instanceof KeyParameter) {
                    setKey(((KeyParameter) parameters).getKey(), iv2);
                } else {
                    throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
                }
                reset();
                this.initialised = true;
                return;
            }
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
    }

    public void packTauOrSigma(int i11, int[] iArr, int i12) {
        int i13 = (i11 - 16) / 4;
        int[] iArr2 = TAU_SIGMA;
        iArr[i12] = iArr2[i13];
        iArr[i12 + 1] = iArr2[i13 + 1];
        iArr[i12 + 2] = iArr2[i13 + 2];
        iArr[i12 + 3] = iArr2[i13 + 3];
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.initialised) {
            if (i11 + i12 <= bArr.length) {
                if (i13 + i12 <= bArr2.length) {
                    if (limitExceeded(i12)) {
                        throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
                    }
                    for (int i14 = 0; i14 < i12; i14++) {
                        byte[] bArr3 = this.keyStream;
                        int i15 = this.index;
                        bArr2[i14 + i13] = (byte) (bArr3[i15] ^ bArr[i14 + i11]);
                        int i16 = (i15 + 1) & 63;
                        this.index = i16;
                        if (i16 == 0) {
                            advanceCounter();
                            generateKeyStream(this.keyStream);
                        }
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
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    protected void retreatCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 != 0) {
            int[] iArr = this.engineState;
            if ((iArr[9] & 4294967295L) >= (i11 & 4294967295L)) {
                iArr[9] = iArr[9] - i11;
            } else {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
        }
        int[] iArr2 = this.engineState;
        if ((iArr2[8] & 4294967295L) >= (4294967295L & i12)) {
            iArr2[8] = iArr2[8] - i12;
        } else if (iArr2[9] != 0) {
            iArr2[9] = iArr2[9] - 1;
            iArr2[8] = iArr2[8] - i12;
        } else {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        if (!limitExceeded()) {
            byte[] bArr = this.keyStream;
            int i11 = this.index;
            byte b12 = (byte) (b11 ^ bArr[i11]);
            int i12 = (i11 + 1) & 63;
            this.index = i12;
            if (i12 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
            return b12;
        }
        throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long seekTo(long j11) {
        reset();
        return skip(j11);
    }

    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = TAU_SIGMA;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long skip(long j11) {
        long j12;
        if (j11 >= 0) {
            if (j11 >= 64) {
                long j13 = j11 / 64;
                advanceCounter(j13);
                j12 = j11 - (j13 * 64);
            } else {
                j12 = j11;
            }
            int i11 = this.index;
            int i12 = (((int) j12) + i11) & 63;
            this.index = i12;
            if (i12 < i11) {
                advanceCounter();
            }
        } else {
            long j14 = -j11;
            if (j14 >= 64) {
                long j15 = j14 / 64;
                retreatCounter(j15);
                j14 -= j15 * 64;
            }
            for (long j16 = 0; j16 < j14; j16++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j11;
    }

    public Salsa20Engine(int i11) {
        this.index = 0;
        this.engineState = new int[16];
        this.f43513x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i11 > 0 && (i11 & 1) == 0) {
            this.rounds = i11;
            return;
        }
        throw new IllegalArgumentException("'rounds' must be a positive, even number");
    }

    private boolean limitExceeded(int i11) {
        int i12 = this.cW0 + i11;
        this.cW0 = i12;
        if (i12 >= i11 || i12 < 0) {
            return false;
        }
        int i13 = this.cW1 + 1;
        this.cW1 = i13;
        if (i13 == 0) {
            int i14 = this.cW2 + 1;
            this.cW2 = i14;
            return (i14 & 32) != 0;
        }
        return false;
    }

    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[8] + 1;
        iArr[8] = i11;
        if (i11 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void retreatCounter() {
        int[] iArr = this.engineState;
        if (iArr[8] == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i11 = iArr[8] - 1;
        iArr[8] = i11;
        if (i11 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }
}