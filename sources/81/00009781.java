package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.Streams;

/* loaded from: classes6.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String {
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final byte[] data;
    protected final int padBits;

    public ASN1BitString(byte[] bArr, int i11) {
        Objects.requireNonNull(bArr, "data cannot be null");
        if (bArr.length == 0 && i11 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i11 <= 7 && i11 >= 0) {
            this.data = Arrays.clone(bArr);
            this.padBits = i11;
            return;
        }
        throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] derForm(byte[] bArr, int i11) {
        byte[] clone = Arrays.clone(bArr);
        if (i11 > 0) {
            int length = bArr.length - 1;
            clone[length] = (byte) ((255 << i11) & clone[length]);
        }
        return clone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1BitString fromInputStream(int i11, InputStream inputStream) {
        if (i11 >= 1) {
            int read = inputStream.read();
            int i12 = i11 - 1;
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                if (Streams.readFully(inputStream, bArr) != i12) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                }
                if (read > 0 && read < 8) {
                    int i13 = i12 - 1;
                    if (bArr[i13] != ((byte) (bArr[i13] & (255 << read)))) {
                        return new DLBitString(bArr, read);
                    }
                }
            }
            return new DERBitString(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] getBytes(int i11) {
        if (i11 == 0) {
            return new byte[0];
        }
        int i12 = 4;
        for (int i13 = 3; i13 >= 1 && ((255 << (i13 * 8)) & i11) == 0; i13--) {
            i12--;
        }
        byte[] bArr = new byte[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            bArr[i14] = (byte) ((i11 >> (i14 * 8)) & 255);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int getPadBits(int i11) {
        int i12;
        int i13 = 3;
        while (true) {
            if (i13 < 0) {
                i12 = 0;
                break;
            } else if (i13 != 0) {
                int i14 = i11 >> (i13 * 8);
                if (i14 != 0) {
                    i12 = i14 & 255;
                    break;
                }
                i13--;
            } else if (i11 != 0) {
                i12 = i11 & 255;
                break;
            } else {
                i13--;
            }
        }
        if (i12 == 0) {
            return 0;
        }
        int i15 = 1;
        while (true) {
            i12 <<= 1;
            if ((i12 & 255) == 0) {
                return 8 - i15;
            }
            i15++;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    protected boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            return this.padBits == aSN1BitString.padBits && Arrays.areEqual(getBytes(), aSN1BitString.getBytes());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public abstract void encode(ASN1OutputStream aSN1OutputStream);

    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    public byte[] getOctets() {
        if (this.padBits == 0) {
            return Arrays.clone(this.data);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public int getPadBits() {
        return this.padBits;
    }

    @Override // org.spongycastle.asn1.ASN1String
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i11 = 0; i11 != byteArray.length; i11++) {
                char[] cArr = table;
                stringBuffer.append(cArr[(byteArray[i11] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i11] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e11) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e11.getMessage(), e11);
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return this.padBits ^ Arrays.hashCode(getBytes());
    }

    public int intValue() {
        byte[] bArr = this.data;
        int i11 = this.padBits;
        if (i11 > 0 && bArr.length <= 4) {
            bArr = derForm(bArr, i11);
        }
        int i12 = 0;
        for (int i13 = 0; i13 != bArr.length && i13 != 4; i13++) {
            i12 |= (bArr[i13] & 255) << (i13 * 8);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERBitString(this.data, this.padBits);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLBitString(this.data, this.padBits);
    }

    public String toString() {
        return getString();
    }

    public byte[] getBytes() {
        return derForm(this.data, this.padBits);
    }
}