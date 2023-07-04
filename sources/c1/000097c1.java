package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public abstract class DERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    /* JADX INFO: Access modifiers changed from: protected */
    public DERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    private void writeLength(OutputStream outputStream, int i11) {
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
            outputStream.write((byte) (i13 | 128));
            for (int i14 = (i13 - 1) * 8; i14 >= 0; i14 -= 8) {
                outputStream.write((byte) (i11 >> i14));
            }
            return;
        }
        outputStream.write((byte) i11);
    }

    void writeDEREncoded(OutputStream outputStream, int i11, byte[] bArr) {
        outputStream.write(i11);
        writeLength(outputStream, bArr.length);
        outputStream.write(bArr);
    }

    public DERGenerator(OutputStream outputStream, int i11, boolean z11) {
        super(outputStream);
        this._tagged = false;
        this._tagged = true;
        this._isExplicit = z11;
        this._tagNo = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeDEREncoded(int i11, byte[] bArr) {
        if (this._tagged) {
            int i12 = this._tagNo;
            int i13 = i12 | 128;
            if (this._isExplicit) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                writeDEREncoded(byteArrayOutputStream, i11, bArr);
                writeDEREncoded(this._out, i12 | 32 | 128, byteArrayOutputStream.toByteArray());
                return;
            } else if ((i11 & 32) != 0) {
                writeDEREncoded(this._out, i13 | 32, bArr);
                return;
            } else {
                writeDEREncoded(this._out, i13, bArr);
                return;
            }
        }
        writeDEREncoded(this._out, i11, bArr);
    }
}