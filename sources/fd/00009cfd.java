package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes4.dex */
public class Certificate {
    public static final Certificate EMPTY_CHAIN = new Certificate(new org.spongycastle.asn1.x509.Certificate[0]);
    protected org.spongycastle.asn1.x509.Certificate[] certificateList;

    public Certificate(org.spongycastle.asn1.x509.Certificate[] certificateArr) {
        if (certificateArr != null) {
            this.certificateList = certificateArr;
            return;
        }
        throw new IllegalArgumentException("'certificateList' cannot be null");
    }

    public static Certificate parse(InputStream inputStream) {
        int readUint24 = TlsUtils.readUint24(inputStream);
        if (readUint24 == 0) {
            return EMPTY_CHAIN;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readFully(readUint24, inputStream));
        Vector vector = new Vector();
        while (byteArrayInputStream.available() > 0) {
            vector.addElement(org.spongycastle.asn1.x509.Certificate.getInstance(TlsUtils.readDERObject(TlsUtils.readOpaque24(byteArrayInputStream))));
        }
        org.spongycastle.asn1.x509.Certificate[] certificateArr = new org.spongycastle.asn1.x509.Certificate[vector.size()];
        for (int i11 = 0; i11 < vector.size(); i11++) {
            certificateArr[i11] = (org.spongycastle.asn1.x509.Certificate) vector.elementAt(i11);
        }
        return new Certificate(certificateArr);
    }

    protected org.spongycastle.asn1.x509.Certificate[] cloneCertificateList() {
        org.spongycastle.asn1.x509.Certificate[] certificateArr = this.certificateList;
        int length = certificateArr.length;
        org.spongycastle.asn1.x509.Certificate[] certificateArr2 = new org.spongycastle.asn1.x509.Certificate[length];
        System.arraycopy(certificateArr, 0, certificateArr2, 0, length);
        return certificateArr2;
    }

    public void encode(OutputStream outputStream) {
        Vector vector = new Vector(this.certificateList.length);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            org.spongycastle.asn1.x509.Certificate[] certificateArr = this.certificateList;
            if (i11 >= certificateArr.length) {
                break;
            }
            byte[] encoded = certificateArr[i11].getEncoded(ASN1Encoding.DER);
            vector.addElement(encoded);
            i12 += encoded.length + 3;
            i11++;
        }
        TlsUtils.checkUint24(i12);
        TlsUtils.writeUint24(i12, outputStream);
        for (int i13 = 0; i13 < vector.size(); i13++) {
            TlsUtils.writeOpaque24((byte[]) vector.elementAt(i13), outputStream);
        }
    }

    public org.spongycastle.asn1.x509.Certificate getCertificateAt(int i11) {
        return this.certificateList[i11];
    }

    public org.spongycastle.asn1.x509.Certificate[] getCertificateList() {
        return cloneCertificateList();
    }

    public int getLength() {
        return this.certificateList.length;
    }

    public boolean isEmpty() {
        return this.certificateList.length == 0;
    }
}