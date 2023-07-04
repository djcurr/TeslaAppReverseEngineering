package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class b extends n implements e40.g {

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f43018c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    protected final byte[] f43019a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f43020b;

    public b(byte[] bArr, int i11) {
        Objects.requireNonNull(bArr, "'data' cannot be null");
        if (bArr.length == 0 && i11 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i11 > 7 || i11 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f43019a = org.bouncycastle.util.a.h(bArr);
        this.f43020b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b p(int i11, InputStream inputStream) {
        if (i11 >= 1) {
            int read = inputStream.read();
            int i12 = i11 - 1;
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                if (t70.a.e(inputStream, bArr) != i12) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                }
                if (read > 0 && read < 8) {
                    int i13 = i12 - 1;
                    if (bArr[i13] != ((byte) (bArr[i13] & (255 << read)))) {
                        return new f1(bArr, read);
                    }
                }
            }
            return new j0(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar instanceof b) {
            b bVar = (b) nVar;
            if (this.f43020b != bVar.f43020b) {
                return false;
            }
            byte[] bArr = this.f43019a;
            byte[] bArr2 = bVar.f43019a;
            int length = bArr.length;
            if (length != bArr2.length) {
                return false;
            }
            int i11 = length - 1;
            if (i11 < 0) {
                return true;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    return false;
                }
            }
            byte b11 = bArr[i11];
            int i13 = this.f43020b;
            return ((byte) (b11 & (255 << i13))) == ((byte) (bArr2[i11] & (255 << i13)));
        }
        return false;
    }

    @Override // e40.g
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i11 = 0; i11 != encoded.length; i11++) {
                char[] cArr = f43018c;
                stringBuffer.append(cArr[(encoded[i11] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i11] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e11) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e11.getMessage(), e11);
        }
    }

    @Override // e40.c
    public int hashCode() {
        byte[] bArr = this.f43019a;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        return ((org.bouncycastle.util.a.G(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << this.f43020b)))) ^ this.f43020b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n n() {
        return new j0(this.f43019a, this.f43020b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n o() {
        return new f1(this.f43019a, this.f43020b);
    }

    public byte[] q() {
        byte[] bArr = this.f43019a;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] h11 = org.bouncycastle.util.a.h(bArr);
        int length = this.f43019a.length - 1;
        h11[length] = (byte) (h11[length] & (255 << this.f43020b));
        return h11;
    }

    public byte[] r() {
        if (this.f43020b == 0) {
            return org.bouncycastle.util.a.h(this.f43019a);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public int s() {
        return this.f43020b;
    }

    public int t() {
        int min = Math.min(4, this.f43019a.length - 1);
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            i11 |= (255 & this.f43019a[i12]) << (i12 * 8);
        }
        return (min < 0 || min >= 4) ? i11 : i11 | ((((byte) (this.f43019a[min] & (255 << this.f43020b))) & 255) << (min * 8));
    }

    public String toString() {
        return getString();
    }
}