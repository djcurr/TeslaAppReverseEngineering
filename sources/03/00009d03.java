package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

/* loaded from: classes4.dex */
public class CertificateURL {
    protected short type;
    protected Vector urlAndHashList;

    /* loaded from: classes4.dex */
    class ListBuffer16 extends ByteArrayOutputStream {
        ListBuffer16() {
            TlsUtils.writeUint16(0, this);
        }

        void encodeTo(OutputStream outputStream) {
            int i11 = ((ByteArrayOutputStream) this).count - 2;
            TlsUtils.checkUint16(i11);
            TlsUtils.writeUint16(i11, ((ByteArrayOutputStream) this).buf, 0);
            outputStream.write(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            ((ByteArrayOutputStream) this).buf = null;
        }
    }

    public CertificateURL(short s11, Vector vector) {
        if (CertChainType.isValid(s11)) {
            if (vector != null && !vector.isEmpty()) {
                this.type = s11;
                this.urlAndHashList = vector;
                return;
            }
            throw new IllegalArgumentException("'urlAndHashList' must have length > 0");
        }
        throw new IllegalArgumentException("'type' is not a valid CertChainType value");
    }

    public static CertificateURL parse(TlsContext tlsContext, InputStream inputStream) {
        short readUint8 = TlsUtils.readUint8(inputStream);
        if (CertChainType.isValid(readUint8)) {
            int readUint16 = TlsUtils.readUint16(inputStream);
            if (readUint16 >= 1) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readFully(readUint16, inputStream));
                Vector vector = new Vector();
                while (byteArrayInputStream.available() > 0) {
                    vector.addElement(URLAndHash.parse(tlsContext, byteArrayInputStream));
                }
                return new CertificateURL(readUint8, vector);
            }
            throw new TlsFatalAlert((short) 50);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public void encode(OutputStream outputStream) {
        TlsUtils.writeUint8(this.type, outputStream);
        ListBuffer16 listBuffer16 = new ListBuffer16();
        for (int i11 = 0; i11 < this.urlAndHashList.size(); i11++) {
            ((URLAndHash) this.urlAndHashList.elementAt(i11)).encode(listBuffer16);
        }
        listBuffer16.encodeTo(outputStream);
    }

    public short getType() {
        return this.type;
    }

    public Vector getURLAndHashList() {
        return this.urlAndHashList;
    }
}