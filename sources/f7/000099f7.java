package org.spongycastle.cert.cmp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.cmp.CertConfirmContent;
import org.spongycastle.asn1.cmp.CertStatus;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.spongycastle.operator.DigestAlgorithmIdentifierFinder;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.OperatorCreationException;

/* loaded from: classes5.dex */
public class CertificateConfirmationContentBuilder {
    private List acceptedCerts;
    private List acceptedReqIds;
    private DigestAlgorithmIdentifierFinder digestAlgFinder;

    public CertificateConfirmationContentBuilder() {
        this(new DefaultDigestAlgorithmIdentifierFinder());
    }

    public CertificateConfirmationContentBuilder addAcceptedCertificate(X509CertificateHolder x509CertificateHolder, BigInteger bigInteger) {
        this.acceptedCerts.add(x509CertificateHolder);
        this.acceptedReqIds.add(bigInteger);
        return this;
    }

    public CertificateConfirmationContent build(DigestCalculatorProvider digestCalculatorProvider) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i11 = 0; i11 != this.acceptedCerts.size(); i11++) {
            X509CertificateHolder x509CertificateHolder = (X509CertificateHolder) this.acceptedCerts.get(i11);
            BigInteger bigInteger = (BigInteger) this.acceptedReqIds.get(i11);
            AlgorithmIdentifier find = this.digestAlgFinder.find(x509CertificateHolder.toASN1Structure().getSignatureAlgorithm());
            if (find != null) {
                try {
                    DigestCalculator digestCalculator = digestCalculatorProvider.get(find);
                    CMPUtil.derEncodeToStream(x509CertificateHolder.toASN1Structure(), digestCalculator.getOutputStream());
                    aSN1EncodableVector.add(new CertStatus(digestCalculator.getDigest(), bigInteger));
                } catch (OperatorCreationException e11) {
                    throw new CMPException("unable to create digest: " + e11.getMessage(), e11);
                }
            } else {
                throw new CMPException("cannot find algorithm for digest from signature");
            }
        }
        return new CertificateConfirmationContent(CertConfirmContent.getInstance(new DERSequence(aSN1EncodableVector)), this.digestAlgFinder);
    }

    public CertificateConfirmationContentBuilder(DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.acceptedCerts = new ArrayList();
        this.acceptedReqIds = new ArrayList();
        this.digestAlgFinder = digestAlgorithmIdentifierFinder;
    }
}