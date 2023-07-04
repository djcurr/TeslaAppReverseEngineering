package org.spongycastle.cert.selector;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.util.Pack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class MSOutlookKeyIdCalculator {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class SHA1Digest extends GeneralDigest {
        private static final int DIGEST_LENGTH = 20;
        private static final int Y1 = 1518500249;
        private static final int Y2 = 1859775393;
        private static final int Y3 = -1894007588;
        private static final int Y4 = -899497514;
        private int H1;
        private int H2;
        private int H3;
        private int H4;
        private int H5;
        private int[] X = new int[80];
        private int xOff;

        public SHA1Digest() {
            reset();
        }

        private int f(int i11, int i12, int i13) {
            return ((~i11) & i13) | (i12 & i11);
        }

        private int g(int i11, int i12, int i13) {
            return (i11 & i13) | (i11 & i12) | (i12 & i13);
        }

        private int h(int i11, int i12, int i13) {
            return (i11 ^ i12) ^ i13;
        }

        public int doFinal(byte[] bArr, int i11) {
            finish();
            Pack.intToBigEndian(this.H1, bArr, i11);
            Pack.intToBigEndian(this.H2, bArr, i11 + 4);
            Pack.intToBigEndian(this.H3, bArr, i11 + 8);
            Pack.intToBigEndian(this.H4, bArr, i11 + 12);
            Pack.intToBigEndian(this.H5, bArr, i11 + 16);
            reset();
            return 20;
        }

        public String getAlgorithmName() {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }

        public int getDigestSize() {
            return 20;
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processBlock() {
            for (int i11 = 16; i11 < 80; i11++) {
                int[] iArr = this.X;
                int i12 = ((iArr[i11 - 3] ^ iArr[i11 - 8]) ^ iArr[i11 - 14]) ^ iArr[i11 - 16];
                iArr[i11] = (i12 >>> 31) | (i12 << 1);
            }
            int i13 = this.H1;
            int i14 = this.H2;
            int i15 = this.H3;
            int i16 = this.H4;
            int i17 = this.H5;
            int i18 = 0;
            int i19 = 0;
            while (i18 < 4) {
                int i21 = i19 + 1;
                int f11 = i17 + ((i13 << 5) | (i13 >>> 27)) + f(i14, i15, i16) + this.X[i19] + Y1;
                int i22 = (i14 >>> 2) | (i14 << 30);
                int i23 = i21 + 1;
                int f12 = i16 + ((f11 << 5) | (f11 >>> 27)) + f(i13, i22, i15) + this.X[i21] + Y1;
                int i24 = (i13 >>> 2) | (i13 << 30);
                int i25 = i23 + 1;
                int f13 = i15 + ((f12 << 5) | (f12 >>> 27)) + f(f11, i24, i22) + this.X[i23] + Y1;
                i17 = (f11 >>> 2) | (f11 << 30);
                int i26 = i25 + 1;
                i14 = i22 + ((f13 << 5) | (f13 >>> 27)) + f(f12, i17, i24) + this.X[i25] + Y1;
                i16 = (f12 >>> 2) | (f12 << 30);
                i13 = i24 + ((i14 << 5) | (i14 >>> 27)) + f(f13, i16, i17) + this.X[i26] + Y1;
                i15 = (f13 >>> 2) | (f13 << 30);
                i18++;
                i19 = i26 + 1;
            }
            int i27 = 0;
            while (i27 < 4) {
                int i28 = i19 + 1;
                int h11 = i17 + ((i13 << 5) | (i13 >>> 27)) + h(i14, i15, i16) + this.X[i19] + Y2;
                int i29 = (i14 >>> 2) | (i14 << 30);
                int i31 = i28 + 1;
                int h12 = i16 + ((h11 << 5) | (h11 >>> 27)) + h(i13, i29, i15) + this.X[i28] + Y2;
                int i32 = (i13 >>> 2) | (i13 << 30);
                int i33 = i31 + 1;
                int h13 = i15 + ((h12 << 5) | (h12 >>> 27)) + h(h11, i32, i29) + this.X[i31] + Y2;
                i17 = (h11 >>> 2) | (h11 << 30);
                int i34 = i33 + 1;
                i14 = i29 + ((h13 << 5) | (h13 >>> 27)) + h(h12, i17, i32) + this.X[i33] + Y2;
                i16 = (h12 >>> 2) | (h12 << 30);
                i13 = i32 + ((i14 << 5) | (i14 >>> 27)) + h(h13, i16, i17) + this.X[i34] + Y2;
                i15 = (h13 >>> 2) | (h13 << 30);
                i27++;
                i19 = i34 + 1;
            }
            int i35 = 0;
            while (i35 < 4) {
                int i36 = i19 + 1;
                int g11 = i17 + ((i13 << 5) | (i13 >>> 27)) + g(i14, i15, i16) + this.X[i19] + Y3;
                int i37 = (i14 >>> 2) | (i14 << 30);
                int i38 = i36 + 1;
                int g12 = i16 + ((g11 << 5) | (g11 >>> 27)) + g(i13, i37, i15) + this.X[i36] + Y3;
                int i39 = (i13 >>> 2) | (i13 << 30);
                int i41 = i38 + 1;
                int g13 = i15 + ((g12 << 5) | (g12 >>> 27)) + g(g11, i39, i37) + this.X[i38] + Y3;
                i17 = (g11 >>> 2) | (g11 << 30);
                int i42 = i41 + 1;
                i14 = i37 + ((g13 << 5) | (g13 >>> 27)) + g(g12, i17, i39) + this.X[i41] + Y3;
                i16 = (g12 >>> 2) | (g12 << 30);
                i13 = i39 + ((i14 << 5) | (i14 >>> 27)) + g(g13, i16, i17) + this.X[i42] + Y3;
                i15 = (g13 >>> 2) | (g13 << 30);
                i35++;
                i19 = i42 + 1;
            }
            int i43 = 0;
            while (i43 <= 3) {
                int i44 = i19 + 1;
                int h14 = i17 + ((i13 << 5) | (i13 >>> 27)) + h(i14, i15, i16) + this.X[i19] + Y4;
                int i45 = (i14 >>> 2) | (i14 << 30);
                int i46 = i44 + 1;
                int h15 = i16 + ((h14 << 5) | (h14 >>> 27)) + h(i13, i45, i15) + this.X[i44] + Y4;
                int i47 = (i13 >>> 2) | (i13 << 30);
                int i48 = i46 + 1;
                int h16 = i15 + ((h15 << 5) | (h15 >>> 27)) + h(h14, i47, i45) + this.X[i46] + Y4;
                i17 = (h14 >>> 2) | (h14 << 30);
                int i49 = i48 + 1;
                i14 = i45 + ((h16 << 5) | (h16 >>> 27)) + h(h15, i17, i47) + this.X[i48] + Y4;
                i16 = (h15 >>> 2) | (h15 << 30);
                i13 = i47 + ((i14 << 5) | (i14 >>> 27)) + h(h16, i16, i17) + this.X[i49] + Y4;
                i15 = (h16 >>> 2) | (h16 << 30);
                i43++;
                i19 = i49 + 1;
            }
            this.H1 += i13;
            this.H2 += i14;
            this.H3 += i15;
            this.H4 += i16;
            this.H5 += i17;
            this.xOff = 0;
            for (int i51 = 0; i51 < 16; i51++) {
                this.X[i51] = 0;
            }
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processLength(long j11) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j11 >>> 32);
            iArr[15] = (int) (j11 & (-1));
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processWord(byte[] bArr, int i11) {
            int i12 = i11 + 1;
            int i13 = i12 + 1;
            int i14 = (bArr[i13 + 1] & 255) | (bArr[i11] << 24) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8);
            int[] iArr = this.X;
            int i15 = this.xOff;
            iArr[i15] = i14;
            int i16 = i15 + 1;
            this.xOff = i16;
            if (i16 == 16) {
                processBlock();
            }
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void reset() {
            super.reset();
            this.H1 = 1732584193;
            this.H2 = -271733879;
            this.H3 = -1732584194;
            this.H4 = 271733878;
            this.H5 = -1009589776;
            this.xOff = 0;
            int i11 = 0;
            while (true) {
                int[] iArr = this.X;
                if (i11 == iArr.length) {
                    return;
                }
                iArr[i11] = 0;
                i11++;
            }
        }
    }

    MSOutlookKeyIdCalculator() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded(ASN1Encoding.DER);
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        protected GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        protected void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        public void finish() {
            long j11 = this.byteCount << 3;
            update(Byte.MIN_VALUE);
            while (this.xBufOff != 0) {
                update((byte) 0);
            }
            processLength(j11);
            processBlock();
        }

        protected abstract void processBlock();

        protected abstract void processLength(long j11);

        protected abstract void processWord(byte[] bArr, int i11);

        public void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i11 = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i11 >= bArr.length) {
                    return;
                }
                bArr[i11] = 0;
                i11++;
            }
        }

        public void update(byte b11) {
            byte[] bArr = this.xBuf;
            int i11 = this.xBufOff;
            int i12 = i11 + 1;
            this.xBufOff = i12;
            bArr[i11] = b11;
            if (i12 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }

        protected GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        public void update(byte[] bArr, int i11, int i12) {
            while (this.xBufOff != 0 && i12 > 0) {
                update(bArr[i11]);
                i11++;
                i12--;
            }
            while (i12 > this.xBuf.length) {
                processWord(bArr, i11);
                byte[] bArr2 = this.xBuf;
                i11 += bArr2.length;
                i12 -= bArr2.length;
                this.byteCount += bArr2.length;
            }
            while (i12 > 0) {
                update(bArr[i11]);
                i11++;
                i12--;
            }
        }
    }
}