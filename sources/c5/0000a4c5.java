package org.spongycastle.util.encoders;

/* loaded from: classes4.dex */
public class BufferedDecoder {
    protected byte[] buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedDecoder(Translator translator, int i11) {
        this.translator = translator;
        if (i11 % translator.getEncodedBlockSize() == 0) {
            this.buf = new byte[i11];
            this.bufOff = 0;
            return;
        }
        throw new IllegalArgumentException("buffer size not multiple of input block size");
    }

    public int processByte(byte b11, byte[] bArr, int i11) {
        byte[] bArr2 = this.buf;
        int i12 = this.bufOff;
        int i13 = i12 + 1;
        this.bufOff = i13;
        bArr2[i12] = b11;
        if (i13 == bArr2.length) {
            int decode = this.translator.decode(bArr2, 0, bArr2.length, bArr, i11);
            this.bufOff = 0;
            return decode;
        }
        return 0;
    }

    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i12 >= 0) {
            byte[] bArr3 = this.buf;
            int length = bArr3.length;
            int i14 = this.bufOff;
            int i15 = length - i14;
            int i16 = 0;
            if (i12 > i15) {
                System.arraycopy(bArr, i11, bArr3, i14, i15);
                Translator translator = this.translator;
                byte[] bArr4 = this.buf;
                int decode = translator.decode(bArr4, 0, bArr4.length, bArr2, i13) + 0;
                this.bufOff = 0;
                int i17 = i12 - i15;
                int i18 = i11 + i15;
                int i19 = i13 + decode;
                int length2 = i17 - (i17 % this.buf.length);
                i16 = decode + this.translator.decode(bArr, i18, length2, bArr2, i19);
                i12 = i17 - length2;
                i11 = i18 + length2;
            }
            if (i12 != 0) {
                System.arraycopy(bArr, i11, this.buf, this.bufOff, i12);
                this.bufOff += i12;
            }
            return i16;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}