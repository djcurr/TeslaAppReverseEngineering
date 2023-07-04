package org.spongycastle.crypto.macs;

import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* renamed from: h0  reason: collision with root package name */
    private int f43532h0;

    /* renamed from: h1  reason: collision with root package name */
    private int f43533h1;

    /* renamed from: h2  reason: collision with root package name */
    private int f43534h2;

    /* renamed from: h3  reason: collision with root package name */
    private int f43535h3;

    /* renamed from: h4  reason: collision with root package name */
    private int f43536h4;

    /* renamed from: k0  reason: collision with root package name */
    private int f43537k0;

    /* renamed from: k1  reason: collision with root package name */
    private int f43538k1;

    /* renamed from: k2  reason: collision with root package name */
    private int f43539k2;

    /* renamed from: k3  reason: collision with root package name */
    private int f43540k3;

    /* renamed from: r0  reason: collision with root package name */
    private int f43541r0;

    /* renamed from: r1  reason: collision with root package name */
    private int f43542r1;

    /* renamed from: r2  reason: collision with root package name */
    private int f43543r2;

    /* renamed from: r3  reason: collision with root package name */
    private int f43544r3;

    /* renamed from: r4  reason: collision with root package name */
    private int f43545r4;

    /* renamed from: s1  reason: collision with root package name */
    private int f43546s1;

    /* renamed from: s2  reason: collision with root package name */
    private int f43547s2;

    /* renamed from: s3  reason: collision with root package name */
    private int f43548s3;

    /* renamed from: s4  reason: collision with root package name */
    private int f43549s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    private static final long mul32x32_64(int i11, int i12) {
        return (i11 & 4294967295L) * i12;
    }

    private void processBlock() {
        int i11 = this.currentBlockOffset;
        if (i11 < 16) {
            this.currentBlock[i11] = 1;
            for (int i12 = i11 + 1; i12 < 16; i12++) {
                this.currentBlock[i12] = 0;
            }
        }
        long littleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0) & 4294967295L;
        long littleEndianToInt2 = Pack.littleEndianToInt(this.currentBlock, 4) & 4294967295L;
        long littleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8) & 4294967295L;
        long littleEndianToInt4 = 4294967295L & Pack.littleEndianToInt(this.currentBlock, 12);
        int i13 = (int) (this.f43532h0 + (littleEndianToInt & 67108863));
        this.f43532h0 = i13;
        this.f43533h1 = (int) (this.f43533h1 + ((((littleEndianToInt2 << 32) | littleEndianToInt) >>> 26) & 67108863));
        this.f43534h2 = (int) (this.f43534h2 + (((littleEndianToInt2 | (littleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f43535h3 = (int) (this.f43535h3 + ((((littleEndianToInt4 << 32) | littleEndianToInt3) >>> 14) & 67108863));
        int i14 = (int) (this.f43536h4 + (littleEndianToInt4 >>> 8));
        this.f43536h4 = i14;
        if (this.currentBlockOffset == 16) {
            this.f43536h4 = i14 + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        long mul32x32_64 = mul32x32_64(i13, this.f43541r0) + mul32x32_64(this.f43533h1, this.f43549s4) + mul32x32_64(this.f43534h2, this.f43548s3) + mul32x32_64(this.f43535h3, this.f43547s2) + mul32x32_64(this.f43536h4, this.f43546s1);
        long mul32x32_642 = mul32x32_64(this.f43532h0, this.f43542r1) + mul32x32_64(this.f43533h1, this.f43541r0) + mul32x32_64(this.f43534h2, this.f43549s4) + mul32x32_64(this.f43535h3, this.f43548s3) + mul32x32_64(this.f43536h4, this.f43547s2);
        long mul32x32_643 = mul32x32_64(this.f43532h0, this.f43543r2) + mul32x32_64(this.f43533h1, this.f43542r1) + mul32x32_64(this.f43534h2, this.f43541r0) + mul32x32_64(this.f43535h3, this.f43549s4) + mul32x32_64(this.f43536h4, this.f43548s3);
        long mul32x32_644 = mul32x32_64(this.f43532h0, this.f43544r3) + mul32x32_64(this.f43533h1, this.f43543r2) + mul32x32_64(this.f43534h2, this.f43542r1) + mul32x32_64(this.f43535h3, this.f43541r0) + mul32x32_64(this.f43536h4, this.f43549s4);
        long mul32x32_645 = mul32x32_64(this.f43532h0, this.f43545r4) + mul32x32_64(this.f43533h1, this.f43544r3) + mul32x32_64(this.f43534h2, this.f43543r2) + mul32x32_64(this.f43535h3, this.f43542r1) + mul32x32_64(this.f43536h4, this.f43541r0);
        int i15 = ((int) mul32x32_64) & 67108863;
        this.f43532h0 = i15;
        long j11 = mul32x32_642 + (mul32x32_64 >>> 26);
        int i16 = ((int) j11) & 67108863;
        this.f43533h1 = i16;
        long j12 = mul32x32_643 + (j11 >>> 26);
        this.f43534h2 = ((int) j12) & 67108863;
        long j13 = mul32x32_644 + (j12 >>> 26);
        this.f43535h3 = ((int) j13) & 67108863;
        long j14 = mul32x32_645 + (j13 >>> 26);
        this.f43536h4 = ((int) j14) & 67108863;
        int i17 = i15 + (((int) (j14 >>> 26)) * 5);
        this.f43532h0 = i17;
        this.f43533h1 = i16 + (i17 >>> 26);
        this.f43532h0 = i17 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            int i11 = 16;
            if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
                throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
            }
            int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            this.f43541r0 = 67108863 & littleEndianToInt;
            int i12 = ((littleEndianToInt >>> 26) | (littleEndianToInt2 << 6)) & 67108611;
            this.f43542r1 = i12;
            int i13 = ((littleEndianToInt2 >>> 20) | (littleEndianToInt3 << 12)) & 67092735;
            this.f43543r2 = i13;
            int i14 = ((littleEndianToInt3 >>> 14) | (littleEndianToInt4 << 18)) & 66076671;
            this.f43544r3 = i14;
            int i15 = (littleEndianToInt4 >>> 8) & 1048575;
            this.f43545r4 = i15;
            this.f43546s1 = i12 * 5;
            this.f43547s2 = i13 * 5;
            this.f43548s3 = i14 * 5;
            this.f43549s4 = i15 * 5;
            BlockCipher blockCipher = this.cipher;
            if (blockCipher != null) {
                byte[] bArr3 = new byte[16];
                blockCipher.init(true, new KeyParameter(bArr, 16, 16));
                this.cipher.processBlock(bArr2, 0, bArr3, 0);
                i11 = 0;
                bArr = bArr3;
            }
            this.f43537k0 = Pack.littleEndianToInt(bArr, i11 + 0);
            this.f43538k1 = Pack.littleEndianToInt(bArr, i11 + 4);
            this.f43539k2 = Pack.littleEndianToInt(bArr, i11 + 8);
            this.f43540k3 = Pack.littleEndianToInt(bArr, i11 + 12);
            return;
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (i11 + 16 <= bArr.length) {
            if (this.currentBlockOffset > 0) {
                processBlock();
            }
            int i17 = this.f43533h1;
            int i18 = this.f43532h0;
            int i19 = i17 + (i18 >>> 26);
            this.f43533h1 = i19;
            int i21 = i18 & 67108863;
            this.f43532h0 = i21;
            int i22 = this.f43534h2 + (i19 >>> 26);
            this.f43534h2 = i22;
            int i23 = i19 & 67108863;
            this.f43533h1 = i23;
            int i24 = this.f43535h3 + (i22 >>> 26);
            this.f43535h3 = i24;
            int i25 = i22 & 67108863;
            this.f43534h2 = i25;
            int i26 = this.f43536h4 + (i24 >>> 26);
            this.f43536h4 = i26;
            int i27 = i24 & 67108863;
            this.f43535h3 = i27;
            int i28 = i21 + ((i26 >>> 26) * 5);
            this.f43532h0 = i28;
            int i29 = i26 & 67108863;
            this.f43536h4 = i29;
            int i31 = i23 + (i28 >>> 26);
            this.f43533h1 = i31;
            int i32 = i28 & 67108863;
            this.f43532h0 = i32;
            int i33 = i32 + 5;
            int i34 = (i33 >>> 26) + i31;
            int i35 = (i34 >>> 26) + i25;
            int i36 = (i35 >>> 26) + i27;
            int i37 = 67108863 & i36;
            int i38 = ((i36 >>> 26) + i29) - 67108864;
            int i39 = (i38 >>> 31) - 1;
            int i41 = ~i39;
            this.f43532h0 = (i32 & i41) | (i33 & 67108863 & i39);
            this.f43533h1 = (i31 & i41) | (i34 & 67108863 & i39);
            this.f43534h2 = (i25 & i41) | (i35 & 67108863 & i39);
            this.f43535h3 = (i37 & i39) | (i27 & i41);
            this.f43536h4 = (i29 & i41) | (i38 & i39);
            long j11 = ((i12 | (i13 << 26)) & 4294967295L) + (this.f43537k0 & 4294967295L);
            Pack.intToLittleEndian((int) j11, bArr, i11);
            long j12 = (((i13 >>> 6) | (i14 << 20)) & 4294967295L) + (this.f43538k1 & 4294967295L) + (j11 >>> 32);
            Pack.intToLittleEndian((int) j12, bArr, i11 + 4);
            long j13 = (((i14 >>> 12) | (i15 << 14)) & 4294967295L) + (this.f43539k2 & 4294967295L) + (j12 >>> 32);
            Pack.intToLittleEndian((int) j13, bArr, i11 + 8);
            Pack.intToLittleEndian((int) ((((i15 >>> 18) | (i16 << 8)) & 4294967295L) + (4294967295L & this.f43540k3) + (j13 >>> 32)), bArr, i11 + 12);
            reset();
            return 16;
        }
        throw new DataLengthException("Output buffer is too short.");
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        byte[] bArr;
        if (this.cipher == null) {
            bArr = null;
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
        }
        if (cipherParameters instanceof KeyParameter) {
            setKey(((KeyParameter) cipherParameters).getKey(), bArr);
            reset();
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a key.");
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f43536h4 = 0;
        this.f43535h3 = 0;
        this.f43534h2 = 0;
        this.f43533h1 = 0;
        this.f43532h0 = 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b11) {
        byte[] bArr = this.singleByte;
        bArr[0] = b11;
        update(bArr, 0, 1);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i12 > i13) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int min = Math.min(i12 - i13, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i13 + i11, this.currentBlock, this.currentBlockOffset, min);
            i13 += min;
            this.currentBlockOffset += min;
        }
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() == 16) {
            this.cipher = blockCipher;
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
    }
}