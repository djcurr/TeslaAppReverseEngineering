package org.spongycastle.cms;

import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.cms.IssuerAndSerialNumber;
import org.spongycastle.asn1.cms.SignerIdentifier;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.ContentSigner;
import org.spongycastle.operator.DigestCalculatorProvider;

/* loaded from: classes5.dex */
public class SignerInfoGeneratorBuilder {
    private DigestCalculatorProvider digestProvider;
    private boolean directSignature;
    private CMSSignatureEncryptionAlgorithmFinder sigEncAlgFinder;
    private CMSAttributeTableGenerator signedGen;
    private CMSAttributeTableGenerator unsignedGen;

    public SignerInfoGeneratorBuilder(DigestCalculatorProvider digestCalculatorProvider) {
        this(digestCalculatorProvider, new DefaultCMSSignatureEncryptionAlgorithmFinder());
    }

    private SignerInfoGenerator createGenerator(ContentSigner contentSigner, SignerIdentifier signerIdentifier) {
        if (this.directSignature) {
            return new SignerInfoGenerator(signerIdentifier, contentSigner, this.digestProvider, this.sigEncAlgFinder, true);
        }
        CMSAttributeTableGenerator cMSAttributeTableGenerator = this.signedGen;
        if (cMSAttributeTableGenerator == null && this.unsignedGen == null) {
            return new SignerInfoGenerator(signerIdentifier, contentSigner, this.digestProvider, this.sigEncAlgFinder);
        }
        if (cMSAttributeTableGenerator == null) {
            this.signedGen = new DefaultSignedAttributeTableGenerator();
        }
        return new SignerInfoGenerator(signerIdentifier, contentSigner, this.digestProvider, this.sigEncAlgFinder, this.signedGen, this.unsignedGen);
    }

    public SignerInfoGenerator build(ContentSigner contentSigner, X509CertificateHolder x509CertificateHolder) {
        SignerInfoGenerator createGenerator = createGenerator(contentSigner, new SignerIdentifier(new IssuerAndSerialNumber(x509CertificateHolder.toASN1Structure())));
        createGenerator.setAssociatedCertificate(x509CertificateHolder);
        return createGenerator;
    }

    public SignerInfoGeneratorBuilder setDirectSignature(boolean z11) {
        this.directSignature = z11;
        return this;
    }

    public SignerInfoGeneratorBuilder setSignedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.signedGen = cMSAttributeTableGenerator;
        return this;
    }

    public SignerInfoGeneratorBuilder setUnsignedAttributeGenerator(CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.unsignedGen = cMSAttributeTableGenerator;
        return this;
    }

    public SignerInfoGeneratorBuilder(DigestCalculatorProvider digestCalculatorProvider, CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder) {
        this.digestProvider = digestCalculatorProvider;
        this.sigEncAlgFinder = cMSSignatureEncryptionAlgorithmFinder;
    }

    public SignerInfoGenerator build(ContentSigner contentSigner, byte[] bArr) {
        return createGenerator(contentSigner, new SignerIdentifier((ASN1OctetString) new DEROctetString(bArr)));
    }
}