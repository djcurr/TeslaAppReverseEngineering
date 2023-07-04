package org.spongycastle.cert.crmf;

import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.crmf.CertRequest;
import org.spongycastle.asn1.crmf.PKMACValue;
import org.spongycastle.asn1.crmf.POPOSigningKey;
import org.spongycastle.asn1.crmf.POPOSigningKeyInput;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.operator.ContentSigner;

/* loaded from: classes5.dex */
public class ProofOfPossessionSigningKeyBuilder {
    private CertRequest certRequest;
    private GeneralName name;
    private SubjectPublicKeyInfo pubKeyInfo;
    private PKMACValue publicKeyMAC;

    public ProofOfPossessionSigningKeyBuilder(CertRequest certRequest) {
        this.certRequest = certRequest;
    }

    public POPOSigningKey build(ContentSigner contentSigner) {
        POPOSigningKeyInput pOPOSigningKeyInput;
        GeneralName generalName = this.name;
        if (generalName != null && this.publicKeyMAC != null) {
            throw new IllegalStateException("name and publicKeyMAC cannot both be set.");
        }
        CertRequest certRequest = this.certRequest;
        if (certRequest != null) {
            pOPOSigningKeyInput = null;
            CRMFUtil.derEncodeToStream(certRequest, contentSigner.getOutputStream());
        } else if (generalName != null) {
            POPOSigningKeyInput pOPOSigningKeyInput2 = new POPOSigningKeyInput(generalName, this.pubKeyInfo);
            CRMFUtil.derEncodeToStream(pOPOSigningKeyInput2, contentSigner.getOutputStream());
            pOPOSigningKeyInput = pOPOSigningKeyInput2;
        } else {
            pOPOSigningKeyInput = new POPOSigningKeyInput(this.publicKeyMAC, this.pubKeyInfo);
            CRMFUtil.derEncodeToStream(pOPOSigningKeyInput, contentSigner.getOutputStream());
        }
        return new POPOSigningKey(pOPOSigningKeyInput, contentSigner.getAlgorithmIdentifier(), new DERBitString(contentSigner.getSignature()));
    }

    public ProofOfPossessionSigningKeyBuilder setPublicKeyMac(PKMACValueGenerator pKMACValueGenerator, char[] cArr) {
        this.publicKeyMAC = pKMACValueGenerator.generate(cArr, this.pubKeyInfo);
        return this;
    }

    public ProofOfPossessionSigningKeyBuilder setSender(GeneralName generalName) {
        this.name = generalName;
        return this;
    }

    public ProofOfPossessionSigningKeyBuilder(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.pubKeyInfo = subjectPublicKeyInfo;
    }
}