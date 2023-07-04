package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public class ASN1OutputStream {

    /* renamed from: os */
    private OutputStream f43363os;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class ImplicitOutputStream extends ASN1OutputStream {
        private boolean first;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImplicitOutputStream(OutputStream outputStream) {
            super(outputStream);
            ASN1OutputStream.this = r1;
            this.first = true;
        }

        @Override // org.spongycastle.asn1.ASN1OutputStream
        public void write(int i11) {
            if (this.first) {
                this.first = false;
            } else {
                super.write(i11);
            }
        }
    }

    public ASN1OutputStream(OutputStream outputStream) {
        this.f43363os = outputStream;
    }

    public void close() {
        this.f43363os.close();
    }

    public void flush() {
        this.f43363os.flush();
    }

    public ASN1OutputStream getDERSubStream() {
        return new DEROutputStream(this.f43363os);
    }

    public ASN1OutputStream getDLSubStream() {
        return new DLOutputStream(this.f43363os);
    }

    public void write(int i11) {
        this.f43363os.write(i11);
    }

    public void writeEncoded(int i11, byte[] bArr) {
        write(i11);
        writeLength(bArr.length);
        write(bArr);
    }

    public void writeImplicitObject(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive != null) {
            aSN1Primitive.encode(new ImplicitOutputStream(this.f43363os));
            return;
        }
        throw new IOException("null object detected");
    }

    public void writeLength(int i11) {
        if (i11 > 127) {
            int i12 = i11;
            int i13 = 1;
            while (true) {
                i12 >>>= 8;
                if (i12 == 0) {
                    break;
                }
                i13++;
            }
            write((byte) (i13 | 128));
            for (int i14 = (i13 - 1) * 8; i14 >= 0; i14 -= 8) {
                write((byte) (i11 >> i14));
            }
            return;
        }
        write((byte) i11);
    }

    public void writeNull() {
        this.f43363os.write(5);
        this.f43363os.write(0);
    }

    public void writeObject(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            aSN1Encodable.toASN1Primitive().encode(this);
            return;
        }
        throw new IOException("null object detected");
    }

    public void writeTag(int i11, int i12) {
        if (i12 < 31) {
            write(i11 | i12);
            return;
        }
        write(i11 | 31);
        if (i12 < 128) {
            write(i12);
            return;
        }
        byte[] bArr = new byte[5];
        int i13 = 4;
        bArr[4] = (byte) (i12 & 127);
        do {
            i12 >>= 7;
            i13--;
            bArr[i13] = (byte) ((i12 & 127) | 128);
        } while (i12 > 127);
        write(bArr, i13, 5 - i13);
    }

    public void write(byte[] bArr) {
        this.f43363os.write(bArr);
    }

    void write(byte[] bArr, int i11, int i12) {
        this.f43363os.write(bArr, i11, i12);
    }

    public void writeEncoded(int i11, int i12, byte[] bArr) {
        writeTag(i11, i12);
        writeLength(bArr.length);
        write(bArr);
    }
}