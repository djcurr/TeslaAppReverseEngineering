package org.spongycastle.eac;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ParsingException;
import org.spongycastle.asn1.eac.CVCertificate;
import org.spongycastle.asn1.eac.PublicKeyDataObject;
import org.spongycastle.eac.operator.EACSignatureVerifier;

/* loaded from: classes4.dex */
public class EACCertificateHolder {
    private CVCertificate cvCertificate;

    public EACCertificateHolder(byte[] bArr) {
        this(parseBytes(bArr));
    }

    private static CVCertificate parseBytes(byte[] bArr) {
        try {
            return CVCertificate.getInstance(bArr);
        } catch (ClassCastException e11) {
            throw new EACIOException("malformed data: " + e11.getMessage(), e11);
        } catch (IllegalArgumentException e12) {
            throw new EACIOException("malformed data: " + e12.getMessage(), e12);
        } catch (ASN1ParsingException e13) {
            if (e13.getCause() instanceof IOException) {
                throw ((IOException) e13.getCause());
            }
            throw new EACIOException("malformed data: " + e13.getMessage(), e13);
        }
    }

    public PublicKeyDataObject getPublicKeyDataObject() {
        return this.cvCertificate.getBody().getPublicKey();
    }

    public boolean isSignatureValid(EACSignatureVerifier eACSignatureVerifier) {
        try {
            OutputStream outputStream = eACSignatureVerifier.getOutputStream();
            outputStream.write(this.cvCertificate.getBody().getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return eACSignatureVerifier.verify(this.cvCertificate.getSignature());
        } catch (Exception e11) {
            throw new EACException("unable to process signature: " + e11.getMessage(), e11);
        }
    }

    public CVCertificate toASN1Structure() {
        return this.cvCertificate;
    }

    public EACCertificateHolder(CVCertificate cVCertificate) {
        this.cvCertificate = cVCertificate;
    }
}