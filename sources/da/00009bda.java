package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class CramerShoupCiphertext {

    /* renamed from: e  reason: collision with root package name */
    BigInteger f43493e;

    /* renamed from: u1  reason: collision with root package name */
    BigInteger f43494u1;

    /* renamed from: u2  reason: collision with root package name */
    BigInteger f43495u2;

    /* renamed from: v  reason: collision with root package name */
    BigInteger f43496v;

    public CramerShoupCiphertext() {
    }

    public BigInteger getE() {
        return this.f43493e;
    }

    public BigInteger getU1() {
        return this.f43494u1;
    }

    public BigInteger getU2() {
        return this.f43495u2;
    }

    public BigInteger getV() {
        return this.f43496v;
    }

    public void setE(BigInteger bigInteger) {
        this.f43493e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f43494u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f43495u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f43496v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f43494u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f43495u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f43493e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f43496v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        int i11 = length + 4;
        Pack.intToBigEndian(length2, bArr, i11);
        int i12 = i11 + 4;
        System.arraycopy(byteArray2, 0, bArr, i12, length2);
        int i13 = i12 + length2;
        Pack.intToBigEndian(length3, bArr, i13);
        int i14 = i13 + 4;
        System.arraycopy(byteArray3, 0, bArr, i14, length3);
        int i15 = i14 + length3;
        Pack.intToBigEndian(length4, bArr, i15);
        System.arraycopy(byteArray4, 0, bArr, i15 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.f43494u1.toString());
        stringBuffer.append("\nu2: " + this.f43495u2.toString());
        stringBuffer.append("\ne: " + this.f43493e.toString());
        stringBuffer.append("\nv: " + this.f43496v.toString());
        return stringBuffer.toString();
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f43494u1 = bigInteger;
        this.f43495u2 = bigInteger2;
        this.f43493e = bigInteger3;
        this.f43496v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, 0) + 4;
        this.f43494u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, bigEndianToInt));
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, bigEndianToInt);
        int i11 = bigEndianToInt + 4;
        int i12 = bigEndianToInt2 + i11;
        this.f43495u2 = new BigInteger(Arrays.copyOfRange(bArr, i11, i12));
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, i12);
        int i13 = i12 + 4;
        int i14 = bigEndianToInt3 + i13;
        this.f43493e = new BigInteger(Arrays.copyOfRange(bArr, i13, i14));
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i14);
        int i15 = i14 + 4;
        this.f43496v = new BigInteger(Arrays.copyOfRange(bArr, i15, bigEndianToInt4 + i15));
    }
}