package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.x500.X500Name;

/* loaded from: classes4.dex */
public class CertificateRequest {
    protected Vector certificateAuthorities;
    protected short[] certificateTypes;
    protected Vector supportedSignatureAlgorithms;

    public CertificateRequest(short[] sArr, Vector vector, Vector vector2) {
        this.certificateTypes = sArr;
        this.supportedSignatureAlgorithms = vector;
        this.certificateAuthorities = vector2;
    }

    public static CertificateRequest parse(TlsContext tlsContext, InputStream inputStream) {
        int readUint8 = TlsUtils.readUint8(inputStream);
        short[] sArr = new short[readUint8];
        for (int i11 = 0; i11 < readUint8; i11++) {
            sArr[i11] = TlsUtils.readUint8(inputStream);
        }
        Vector parseSupportedSignatureAlgorithms = TlsUtils.isTLSv12(tlsContext) ? TlsUtils.parseSupportedSignatureAlgorithms(false, inputStream) : null;
        Vector vector = new Vector();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readOpaque16(inputStream));
        while (byteArrayInputStream.available() > 0) {
            vector.addElement(X500Name.getInstance(TlsUtils.readDERObject(TlsUtils.readOpaque16(byteArrayInputStream))));
        }
        return new CertificateRequest(sArr, parseSupportedSignatureAlgorithms, vector);
    }

    public void encode(OutputStream outputStream) {
        short[] sArr = this.certificateTypes;
        if (sArr != null && sArr.length != 0) {
            TlsUtils.writeUint8ArrayWithUint8Length(sArr, outputStream);
        } else {
            TlsUtils.writeUint8(0, outputStream);
        }
        Vector vector = this.supportedSignatureAlgorithms;
        if (vector != null) {
            TlsUtils.encodeSupportedSignatureAlgorithms(vector, false, outputStream);
        }
        Vector vector2 = this.certificateAuthorities;
        if (vector2 != null && !vector2.isEmpty()) {
            Vector vector3 = new Vector(this.certificateAuthorities.size());
            int i11 = 0;
            for (int i12 = 0; i12 < this.certificateAuthorities.size(); i12++) {
                byte[] encoded = ((X500Name) this.certificateAuthorities.elementAt(i12)).getEncoded(ASN1Encoding.DER);
                vector3.addElement(encoded);
                i11 += encoded.length + 2;
            }
            TlsUtils.checkUint16(i11);
            TlsUtils.writeUint16(i11, outputStream);
            for (int i13 = 0; i13 < vector3.size(); i13++) {
                TlsUtils.writeOpaque16((byte[]) vector3.elementAt(i13), outputStream);
            }
            return;
        }
        TlsUtils.writeUint16(0, outputStream);
    }

    public Vector getCertificateAuthorities() {
        return this.certificateAuthorities;
    }

    public short[] getCertificateTypes() {
        return this.certificateTypes;
    }

    public Vector getSupportedSignatureAlgorithms() {
        return this.supportedSignatureAlgorithms;
    }
}