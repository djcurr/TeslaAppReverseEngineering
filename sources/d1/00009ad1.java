package org.spongycastle.cms;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.cms.AttributeTable;
import org.spongycastle.asn1.cms.SignerIdentifier;
import org.spongycastle.asn1.cms.SignerInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.ContentSigner;
import org.spongycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.spongycastle.operator.DigestAlgorithmIdentifierFinder;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.io.TeeOutputStream;

/* loaded from: classes5.dex */
public class SignerInfoGenerator {
    private byte[] calculatedDigest;
    private X509CertificateHolder certHolder;
    private final DigestAlgorithmIdentifierFinder digAlgFinder;
    private final DigestCalculator digester;
    private final CMSAttributeTableGenerator sAttrGen;
    private final CMSSignatureEncryptionAlgorithmFinder sigEncAlgFinder;
    private final ContentSigner signer;
    private final SignerIdentifier signerIdentifier;
    private final CMSAttributeTableGenerator unsAttrGen;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignerInfoGenerator(SignerIdentifier signerIdentifier, ContentSigner contentSigner, DigestCalculatorProvider digestCalculatorProvider, CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder) {
        this(signerIdentifier, contentSigner, digestCalculatorProvider, cMSSignatureEncryptionAlgorithmFinder, false);
    }

    private ASN1Set getAttributeSet(AttributeTable attributeTable) {
        if (attributeTable != null) {
            return new DERSet(attributeTable.toASN1EncodableVector());
        }
        return null;
    }

    private Map getBaseParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (aSN1ObjectIdentifier != null) {
            hashMap.put(CMSAttributeTableGenerator.CONTENT_TYPE, aSN1ObjectIdentifier);
        }
        hashMap.put(CMSAttributeTableGenerator.DIGEST_ALGORITHM_IDENTIFIER, algorithmIdentifier);
        hashMap.put(CMSAttributeTableGenerator.SIGNATURE_ALGORITHM_IDENTIFIER, algorithmIdentifier2);
        hashMap.put(CMSAttributeTableGenerator.DIGEST, Arrays.clone(bArr));
        return hashMap;
    }

    public SignerInfo generate(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AlgorithmIdentifier find;
        AlgorithmIdentifier algorithmIdentifier;
        ASN1Set aSN1Set;
        ASN1Set aSN1Set2;
        try {
            AlgorithmIdentifier findEncryptionAlgorithm = this.sigEncAlgFinder.findEncryptionAlgorithm(this.signer.getAlgorithmIdentifier());
            if (this.sAttrGen != null) {
                AlgorithmIdentifier algorithmIdentifier2 = this.digester.getAlgorithmIdentifier();
                this.calculatedDigest = this.digester.getDigest();
                ASN1Set attributeSet = getAttributeSet(this.sAttrGen.getAttributes(Collections.unmodifiableMap(getBaseParameters(aSN1ObjectIdentifier, this.digester.getAlgorithmIdentifier(), findEncryptionAlgorithm, this.calculatedDigest))));
                OutputStream outputStream = this.signer.getOutputStream();
                outputStream.write(attributeSet.getEncoded(ASN1Encoding.DER));
                outputStream.close();
                algorithmIdentifier = algorithmIdentifier2;
                aSN1Set = attributeSet;
            } else {
                DigestCalculator digestCalculator = this.digester;
                if (digestCalculator != null) {
                    find = digestCalculator.getAlgorithmIdentifier();
                    this.calculatedDigest = this.digester.getDigest();
                } else {
                    find = this.digAlgFinder.find(this.signer.getAlgorithmIdentifier());
                    this.calculatedDigest = null;
                }
                algorithmIdentifier = find;
                aSN1Set = null;
            }
            byte[] signature = this.signer.getSignature();
            if (this.unsAttrGen != null) {
                Map baseParameters = getBaseParameters(aSN1ObjectIdentifier, algorithmIdentifier, findEncryptionAlgorithm, this.calculatedDigest);
                baseParameters.put(CMSAttributeTableGenerator.SIGNATURE, Arrays.clone(signature));
                aSN1Set2 = getAttributeSet(this.unsAttrGen.getAttributes(Collections.unmodifiableMap(baseParameters)));
            } else {
                aSN1Set2 = null;
            }
            return new SignerInfo(this.signerIdentifier, algorithmIdentifier, aSN1Set, findEncryptionAlgorithm, new DEROctetString(signature), aSN1Set2);
        } catch (IOException e11) {
            throw new CMSException("encoding error.", e11);
        }
    }

    public X509CertificateHolder getAssociatedCertificate() {
        return this.certHolder;
    }

    public byte[] getCalculatedDigest() {
        byte[] bArr = this.calculatedDigest;
        if (bArr != null) {
            return Arrays.clone(bArr);
        }
        return null;
    }

    public OutputStream getCalculatingOutputStream() {
        DigestCalculator digestCalculator = this.digester;
        if (digestCalculator != null) {
            if (this.sAttrGen == null) {
                return new TeeOutputStream(this.digester.getOutputStream(), this.signer.getOutputStream());
            }
            return digestCalculator.getOutputStream();
        }
        return this.signer.getOutputStream();
    }

    public AlgorithmIdentifier getDigestAlgorithm() {
        DigestCalculator digestCalculator = this.digester;
        if (digestCalculator != null) {
            return digestCalculator.getAlgorithmIdentifier();
        }
        return this.digAlgFinder.find(this.signer.getAlgorithmIdentifier());
    }

    public int getGeneratedVersion() {
        return this.signerIdentifier.isTagged() ? 3 : 1;
    }

    public SignerIdentifier getSID() {
        return this.signerIdentifier;
    }

    public CMSAttributeTableGenerator getSignedAttributeTableGenerator() {
        return this.sAttrGen;
    }

    public CMSAttributeTableGenerator getUnsignedAttributeTableGenerator() {
        return this.unsAttrGen;
    }

    public boolean hasAssociatedCertificate() {
        return this.certHolder != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAssociatedCertificate(X509CertificateHolder x509CertificateHolder) {
        this.certHolder = x509CertificateHolder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignerInfoGenerator(SignerIdentifier signerIdentifier, ContentSigner contentSigner, DigestCalculatorProvider digestCalculatorProvider, CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder, boolean z11) {
        DefaultDigestAlgorithmIdentifierFinder defaultDigestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
        this.digAlgFinder = defaultDigestAlgorithmIdentifierFinder;
        this.calculatedDigest = null;
        this.signerIdentifier = signerIdentifier;
        this.signer = contentSigner;
        if (digestCalculatorProvider != null) {
            this.digester = digestCalculatorProvider.get(defaultDigestAlgorithmIdentifierFinder.find(contentSigner.getAlgorithmIdentifier()));
        } else {
            this.digester = null;
        }
        if (z11) {
            this.sAttrGen = null;
            this.unsAttrGen = null;
        } else {
            this.sAttrGen = new DefaultSignedAttributeTableGenerator();
            this.unsAttrGen = null;
        }
        this.sigEncAlgFinder = cMSSignatureEncryptionAlgorithmFinder;
    }

    public SignerInfoGenerator(SignerInfoGenerator signerInfoGenerator, CMSAttributeTableGenerator cMSAttributeTableGenerator, CMSAttributeTableGenerator cMSAttributeTableGenerator2) {
        this.digAlgFinder = new DefaultDigestAlgorithmIdentifierFinder();
        this.calculatedDigest = null;
        this.signerIdentifier = signerInfoGenerator.signerIdentifier;
        this.signer = signerInfoGenerator.signer;
        this.digester = signerInfoGenerator.digester;
        this.sigEncAlgFinder = signerInfoGenerator.sigEncAlgFinder;
        this.sAttrGen = cMSAttributeTableGenerator;
        this.unsAttrGen = cMSAttributeTableGenerator2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignerInfoGenerator(SignerIdentifier signerIdentifier, ContentSigner contentSigner, DigestCalculatorProvider digestCalculatorProvider, CMSSignatureEncryptionAlgorithmFinder cMSSignatureEncryptionAlgorithmFinder, CMSAttributeTableGenerator cMSAttributeTableGenerator, CMSAttributeTableGenerator cMSAttributeTableGenerator2) {
        DefaultDigestAlgorithmIdentifierFinder defaultDigestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
        this.digAlgFinder = defaultDigestAlgorithmIdentifierFinder;
        this.calculatedDigest = null;
        this.signerIdentifier = signerIdentifier;
        this.signer = contentSigner;
        if (digestCalculatorProvider != null) {
            this.digester = digestCalculatorProvider.get(defaultDigestAlgorithmIdentifierFinder.find(contentSigner.getAlgorithmIdentifier()));
        } else {
            this.digester = null;
        }
        this.sAttrGen = cMSAttributeTableGenerator;
        this.unsAttrGen = cMSAttributeTableGenerator2;
        this.sigEncAlgFinder = cMSSignatureEncryptionAlgorithmFinder;
    }
}