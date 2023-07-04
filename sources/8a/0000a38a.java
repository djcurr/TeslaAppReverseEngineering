package org.spongycastle.pkcs.bc;

import java.io.IOException;
import org.spongycastle.asn1.pkcs.CertificationRequest;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.pkcs.PKCS10CertificationRequest;
import org.spongycastle.pkcs.PKCSException;

/* loaded from: classes4.dex */
public class BcPKCS10CertificationRequest extends PKCS10CertificationRequest {
    public BcPKCS10CertificationRequest(CertificationRequest certificationRequest) {
        super(certificationRequest);
    }

    public AsymmetricKeyParameter getPublicKey() {
        try {
            return PublicKeyFactory.createKey(getSubjectPublicKeyInfo());
        } catch (IOException e11) {
            throw new PKCSException("error extracting key encoding: " + e11.getMessage(), e11);
        }
    }

    public BcPKCS10CertificationRequest(byte[] bArr) {
        super(bArr);
    }

    public BcPKCS10CertificationRequest(PKCS10CertificationRequest pKCS10CertificationRequest) {
        super(pKCS10CertificationRequest.toASN1Structure());
    }
}