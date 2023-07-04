package org.spongycastle.pqc.math.linearalgebra;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.FileSize;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.math.BigInteger;
import java.security.SecureRandom;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, FileAppender.DEFAULT_BUFFER_SIZE, Http2Stream.EMIT_BUFFER_SIZE, 32768, 65536, 131072, 262144, 524288, FileSize.MB_COEFFICIENT, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, FileSize.GB_COEFFICIENT, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 1152921504606846976L, 2305843009213693952L, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, WebSocketProtocol.PAYLOAD_SHORT_MAX, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647L, 4294967295L, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, Long.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i11 = this.mLength;
        long[] jArr = new long[i11];
        this.mPol = jArr;
        if (i11 > 1) {
            for (int i12 = 0; i12 < this.mLength - 1; i12++) {
                this.mPol[i12] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
            return;
        }
        jArr[0] = secureRandom.nextLong();
        long[] jArr2 = this.mPol;
        jArr2[0] = jArr2[0] >>> (64 - this.mBit);
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i11 = 0;
        while (true) {
            int i12 = oNBLength - 1;
            if (i11 < i12) {
                jArr[i11] = -1;
                i11++;
            } else {
                jArr[i12] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        int i11 = 0;
        while (true) {
            int i12 = this.mDegree;
            if (i11 >= i12) {
                return jArr;
            }
            if (testBit((i12 - i11) - 1)) {
                int i13 = i11 >>> 6;
                jArr[i13] = jArr[i13] | mBitmask[i11 & 63];
            }
            i11++;
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) {
        if (gFElement instanceof GF2nONBElement) {
            GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
            if (this.mField.equals(gF2nONBElement.mField)) {
                for (int i11 = 0; i11 < this.mLength; i11++) {
                    long[] jArr = this.mPol;
                    jArr[i11] = jArr[i11] ^ gF2nONBElement.mPol[i11];
                }
                return;
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    void assignOne() {
        int i11 = 0;
        while (true) {
            int i12 = this.mLength;
            if (i11 < i12 - 1) {
                this.mPol[i11] = -1;
                i11++;
            } else {
                this.mPol[i12 - 1] = mMaxmask[this.mBit - 1];
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement, org.spongycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i11 = 0; i11 < this.mLength; i11++) {
            if (this.mPol[i11] != gF2nONBElement.mPol[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return this.mPol.hashCode();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() {
        if (!isZero()) {
            int i11 = 31;
            boolean z11 = false;
            while (!z11 && i11 >= 0) {
                if (((this.mDegree - 1) & mBitmask[i11]) != 0) {
                    z11 = true;
                }
                i11--;
            }
            ZERO((GF2nONBField) this.mField);
            GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
            int i12 = 1;
            for (int i13 = (i11 + 1) - 1; i13 >= 0; i13--) {
                GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
                for (int i14 = 1; i14 <= i12; i14++) {
                    gF2nElement.squareThis();
                }
                gF2nONBElement.multiplyThisBy(gF2nElement);
                i12 <<= 1;
                if (((this.mDegree - 1) & mBitmask[i13]) != 0) {
                    gF2nONBElement.squareThis();
                    gF2nONBElement.multiplyThisBy(this);
                    i12++;
                }
            }
            gF2nONBElement.squareThis();
            return;
        }
        throw new ArithmeticException();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        int i11;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = true;
        while (true) {
            i11 = this.mLength;
            if (i12 >= i11 - 1 || !z12) {
                break;
            }
            z12 = z12 && (this.mPol[i12] & (-1)) == -1;
            i12++;
        }
        if (z12) {
            if (z12) {
                long j11 = this.mPol[i11 - 1];
                long[] jArr = mMaxmask;
                int i13 = this.mBit;
                if ((j11 & jArr[i13 - 1]) == jArr[i13 - 1]) {
                    z11 = true;
                }
            }
            return z11;
        }
        return z12;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z11 = true;
        for (int i11 = 0; i11 < this.mLength && z11; i11++) {
            z11 = z11 && (this.mPol[i11] & (-1)) == 0;
        }
        return z11;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) {
        int i11;
        boolean z11;
        char c11;
        if (gFElement instanceof GF2nONBElement) {
            GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
            if (this.mField.equals(gF2nONBElement.mField)) {
                if (equals(gFElement)) {
                    squareThis();
                    return;
                }
                long[] jArr = this.mPol;
                long[] jArr2 = gF2nONBElement.mPol;
                int i12 = this.mLength;
                long[] jArr3 = new long[i12];
                int[][] iArr = ((GF2nONBField) this.mField).mMult;
                int i13 = i12 - 1;
                long[] jArr4 = mBitmask;
                char c12 = '?';
                long j11 = jArr4[63];
                long j12 = jArr4[this.mBit - 1];
                int i14 = 0;
                int i15 = 0;
                while (i15 < this.mDegree) {
                    int i16 = i14;
                    int i17 = i16;
                    while (i16 < this.mDegree) {
                        int[] iArr2 = mIBY64;
                        int i18 = iArr2[i16];
                        int i19 = iArr2[iArr[i16][i14]];
                        int i21 = iArr[i16][i14] & 63;
                        long j13 = jArr[i18];
                        long[] jArr5 = mBitmask;
                        if ((j13 & jArr5[i16 & 63]) != 0) {
                            if ((jArr2[i19] & jArr5[i21]) != 0) {
                                i17 ^= 1;
                            }
                            if (iArr[i16][1] != -1) {
                                c11 = '?';
                                if ((jArr2[iArr2[iArr[i16][1]]] & jArr5[iArr[i16][1] & 63]) != 0) {
                                    i17 ^= 1;
                                }
                            } else {
                                c11 = '?';
                            }
                        } else {
                            c11 = c12;
                        }
                        i16++;
                        c12 = c11;
                        i14 = 0;
                    }
                    char c13 = c12;
                    int i22 = mIBY64[i15];
                    int i23 = i15 & 63;
                    if (i17 != 0) {
                        jArr3[i22] = jArr3[i22] ^ mBitmask[i23];
                    }
                    if (this.mLength > 1) {
                        boolean z12 = (jArr[i13] & 1) == 1;
                        int i24 = i13 - 1;
                        int i25 = i24;
                        while (i25 >= 0) {
                            boolean z13 = (jArr[i25] & 1) != 0;
                            jArr[i25] = jArr[i25] >>> 1;
                            if (z12) {
                                jArr[i25] = jArr[i25] ^ j11;
                            }
                            i25--;
                            z12 = z13;
                        }
                        jArr[i13] = jArr[i13] >>> 1;
                        if (z12) {
                            jArr[i13] = jArr[i13] ^ j12;
                        }
                        boolean z14 = (jArr2[i13] & 1) == 1;
                        while (i24 >= 0) {
                            boolean z15 = (jArr2[i24] & 1) != 0;
                            jArr2[i24] = jArr2[i24] >>> 1;
                            if (z14) {
                                jArr2[i24] = jArr2[i24] ^ j11;
                            }
                            i24--;
                            z14 = z15;
                        }
                        jArr2[i13] = jArr2[i13] >>> 1;
                        if (z14) {
                            jArr2[i13] = jArr2[i13] ^ j12;
                        }
                        i11 = 0;
                        z11 = true;
                    } else {
                        i11 = 0;
                        boolean z16 = (jArr[0] & 1) == 1;
                        jArr[0] = jArr[0] >>> 1;
                        if (z16) {
                            jArr[0] = jArr[0] ^ j12;
                        }
                        boolean z17 = (jArr2[0] & 1) == 1;
                        z11 = true;
                        jArr2[0] = jArr2[0] >>> 1;
                        if (z17) {
                            jArr2[0] = jArr2[0] ^ j12;
                        }
                    }
                    i15++;
                    i14 = i11;
                    c12 = c13;
                }
                assign(jArr3);
                return;
            }
            throw new RuntimeException();
        }
        throw new RuntimeException("The elements have different representation: not yet implemented");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() {
        int i11;
        int i12 = 1;
        if (trace() != 1) {
            long j11 = mBitmask[63];
            long[] jArr = new long[this.mLength];
            int i13 = 0;
            long j12 = 0;
            while (true) {
                i11 = this.mLength;
                if (i13 >= i11 - 1) {
                    break;
                }
                for (int i14 = i12; i14 < 64; i14++) {
                    long[] jArr2 = mBitmask;
                    long j13 = jArr2[i14];
                    long[] jArr3 = this.mPol;
                    if (((j13 & jArr3[i13]) == 0 || (jArr2[i14 - 1] & j12) == 0) && ((jArr3[i13] & jArr2[i14]) != 0 || (jArr2[i14 - 1] & j12) != 0)) {
                        j12 ^= jArr2[i14];
                    }
                }
                jArr[i13] = j12;
                int i15 = ((j12 & j11) > 0L ? 1 : ((j12 & j11) == 0L ? 0 : -1));
                j12 = ((i15 == 0 || (1 & this.mPol[i13 + 1]) != 1) && !(i15 == 0 && (this.mPol[i13 + 1] & 1) == 0)) ? 1L : 0L;
                i13++;
                i12 = 1;
            }
            int i16 = this.mDegree & 63;
            long j14 = this.mPol[i11 - 1];
            for (int i17 = 1; i17 < i16; i17++) {
                long[] jArr4 = mBitmask;
                if (((jArr4[i17] & j14) == 0 || (jArr4[i17 - 1] & j12) == 0) && ((jArr4[i17] & j14) != 0 || (jArr4[i17 - 1] & j12) != 0)) {
                    j12 ^= jArr4[i17];
                }
            }
            jArr[this.mLength - 1] = j12;
            return new GF2nONBElement((GF2nONBField) this.mField, jArr);
        }
        throw new RuntimeException();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i11 = this.mLength - 1;
        int i12 = this.mBit - 1;
        long j11 = mBitmask[63];
        boolean z11 = (element[0] & 1) != 0;
        int i13 = i11;
        while (i13 >= 0) {
            boolean z12 = (element[i13] & 1) != 0;
            element[i13] = element[i13] >>> 1;
            if (z11) {
                if (i13 == i11) {
                    element[i13] = element[i13] ^ mBitmask[i12];
                } else {
                    element[i13] = element[i13] ^ j11;
                }
            }
            i13--;
            z11 = z12;
        }
        assign(element);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i11 = this.mLength - 1;
        int i12 = this.mBit - 1;
        long[] jArr = mBitmask;
        long j11 = jArr[63];
        boolean z11 = (element[i11] & jArr[i12]) != 0;
        int i13 = 0;
        while (i13 < i11) {
            boolean z12 = (element[i13] & j11) != 0;
            element[i13] = element[i13] << 1;
            if (z11) {
                element[i13] = 1 ^ element[i13];
            }
            i13++;
            z11 = z12;
        }
        long j12 = element[i11];
        long[] jArr2 = mBitmask;
        boolean z13 = (j12 & jArr2[i12]) != 0;
        element[i11] = element[i11] << 1;
        if (z11) {
            element[i11] = element[i11] ^ 1;
        }
        if (z13) {
            element[i11] = jArr2[i12 + 1] ^ element[i11];
        }
        assign(element);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testBit(int i11) {
        return i11 >= 0 && i11 <= this.mDegree && (this.mPol[i11 >>> 6] & mBitmask[i11 & 63]) != 0;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) != 0;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i11 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = (i12 & 7) << 3;
            bArr[(i11 - i12) - 1] = (byte) ((this.mPol[i12 >>> 3] & (255 << i13)) >>> i13);
        }
        return bArr;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        int i11 = this.mLength - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((this.mPol[i13] & mBitmask[i14]) != 0) {
                    i12 ^= 1;
                }
            }
        }
        int i15 = this.mBit;
        for (int i16 = 0; i16 < i15; i16++) {
            if ((this.mPol[i11] & mBitmask[i16]) != 0) {
                i12 ^= 1;
            }
        }
        return i12;
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i11) {
        long[] element = getElement();
        int i12 = this.mBit;
        String str = "";
        if (i11 == 2) {
            while (true) {
                i12--;
                if (i12 < 0) {
                    break;
                }
                str = (element[element.length - 1] & (1 << i12)) == 0 ? str + "0" : str + "1";
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i13 = 63; i13 >= 0; i13--) {
                    str = (element[length] & mBitmask[i13]) == 0 ? str + "0" : str + "1";
                }
            }
        } else if (i11 == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2--) {
                str = ((((((((((((((((str + cArr[((int) (element[length2] >>> 60)) & 15]) + cArr[((int) (element[length2] >>> 56)) & 15]) + cArr[((int) (element[length2] >>> 52)) & 15]) + cArr[((int) (element[length2] >>> 48)) & 15]) + cArr[((int) (element[length2] >>> 44)) & 15]) + cArr[((int) (element[length2] >>> 40)) & 15]) + cArr[((int) (element[length2] >>> 36)) & 15]) + cArr[((int) (element[length2] >>> 32)) & 15]) + cArr[((int) (element[length2] >>> 28)) & 15]) + cArr[((int) (element[length2] >>> 24)) & 15]) + cArr[((int) (element[length2] >>> 20)) & 15]) + cArr[((int) (element[length2] >>> 16)) & 15]) + cArr[((int) (element[length2] >>> 12)) & 15]) + cArr[((int) (element[length2] >>> 8)) & 15]) + cArr[((int) (element[length2] >>> 4)) & 15]) + cArr[((int) element[length2]) & 15]) + " ";
            }
        }
        return str;
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            long[] jArr = this.mPol;
            int i12 = i11 >>> 3;
            jArr[i12] = jArr[i12] | ((bArr[(bArr.length - 1) - i11] & 255) << ((i11 & 7) << 3));
        }
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }
}