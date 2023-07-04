package org.spongycastle.tsp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Date;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.cms.Attribute;
import org.spongycastle.asn1.cms.AttributeTable;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.cms.IssuerAndSerialNumber;
import org.spongycastle.asn1.ess.ESSCertID;
import org.spongycastle.asn1.ess.ESSCertIDv2;
import org.spongycastle.asn1.ess.SigningCertificate;
import org.spongycastle.asn1.ess.SigningCertificateV2;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.tsp.TSTInfo;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.IssuerSerial;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.CMSSignedData;
import org.spongycastle.cms.CMSTypedData;
import org.spongycastle.cms.SignerId;
import org.spongycastle.cms.SignerInformation;
import org.spongycastle.cms.SignerInformationVerifier;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Store;

/* loaded from: classes4.dex */
public class TimeStampToken {
    CertID certID;
    Date genTime;
    CMSSignedData tsToken;
    SignerInformation tsaSignerInfo;
    TimeStampTokenInfo tstInfo;

    public TimeStampToken(ContentInfo contentInfo) {
        this(getSignedData(contentInfo));
    }

    private static CMSSignedData getSignedData(ContentInfo contentInfo) {
        try {
            return new CMSSignedData(contentInfo);
        } catch (CMSException e11) {
            throw new TSPException("TSP parsing error: " + e11.getMessage(), e11.getCause());
        }
    }

    public Store getAttributeCertificates() {
        return this.tsToken.getAttributeCertificates();
    }

    public Store getCRLs() {
        return this.tsToken.getCRLs();
    }

    public Store getCertificates() {
        return this.tsToken.getCertificates();
    }

    public byte[] getEncoded() {
        return this.tsToken.getEncoded();
    }

    public SignerId getSID() {
        return this.tsaSignerInfo.getSID();
    }

    public AttributeTable getSignedAttributes() {
        return this.tsaSignerInfo.getSignedAttributes();
    }

    public TimeStampTokenInfo getTimeStampInfo() {
        return this.tstInfo;
    }

    public AttributeTable getUnsignedAttributes() {
        return this.tsaSignerInfo.getUnsignedAttributes();
    }

    public boolean isSignatureValid(SignerInformationVerifier signerInformationVerifier) {
        try {
            return this.tsaSignerInfo.verify(signerInformationVerifier);
        } catch (CMSException e11) {
            if (e11.getUnderlyingException() != null) {
                throw new TSPException(e11.getMessage(), e11.getUnderlyingException());
            }
            throw new TSPException("CMS exception: " + e11, e11);
        }
    }

    public CMSSignedData toCMSSignedData() {
        return this.tsToken;
    }

    public void validate(SignerInformationVerifier signerInformationVerifier) {
        if (signerInformationVerifier.hasAssociatedCertificate()) {
            try {
                X509CertificateHolder associatedCertificate = signerInformationVerifier.getAssociatedCertificate();
                DigestCalculator digestCalculator = signerInformationVerifier.getDigestCalculator(this.certID.getHashAlgorithm());
                OutputStream outputStream = digestCalculator.getOutputStream();
                outputStream.write(associatedCertificate.getEncoded());
                outputStream.close();
                if (Arrays.constantTimeAreEqual(this.certID.getCertHash(), digestCalculator.getDigest())) {
                    if (this.certID.getIssuerSerial() != null) {
                        IssuerAndSerialNumber issuerAndSerialNumber = new IssuerAndSerialNumber(associatedCertificate.toASN1Structure());
                        if (this.certID.getIssuerSerial().getSerial().equals(issuerAndSerialNumber.getSerialNumber())) {
                            GeneralName[] names = this.certID.getIssuerSerial().getIssuer().getNames();
                            boolean z11 = false;
                            int i11 = 0;
                            while (true) {
                                if (i11 != names.length) {
                                    if (names[i11].getTagNo() == 4 && X500Name.getInstance(names[i11].getName()).equals(X500Name.getInstance(issuerAndSerialNumber.getName()))) {
                                        z11 = true;
                                        break;
                                    }
                                    i11++;
                                } else {
                                    break;
                                }
                            }
                            if (!z11) {
                                throw new TSPValidationException("certificate name does not match certID for signature. ");
                            }
                        } else {
                            throw new TSPValidationException("certificate serial number does not match certID for signature.");
                        }
                    }
                    TSPUtil.validateCertificate(associatedCertificate);
                    if (associatedCertificate.isValidOn(this.tstInfo.getGenTime())) {
                        if (!this.tsaSignerInfo.verify(signerInformationVerifier)) {
                            throw new TSPValidationException("signature not created by certificate.");
                        }
                        return;
                    }
                    throw new TSPValidationException("certificate not valid when time stamp created.");
                }
                throw new TSPValidationException("certificate hash does not match certID hash.");
            } catch (IOException e11) {
                throw new TSPException("problem processing certificate: " + e11, e11);
            } catch (CMSException e12) {
                if (e12.getUnderlyingException() != null) {
                    throw new TSPException(e12.getMessage(), e12.getUnderlyingException());
                }
                throw new TSPException("CMS exception: " + e12, e12);
            } catch (OperatorCreationException e13) {
                throw new TSPException("unable to create digest: " + e13.getMessage(), e13);
            }
        }
        throw new IllegalArgumentException("verifier provider needs an associated certificate");
    }

    public TimeStampToken(CMSSignedData cMSSignedData) {
        this.tsToken = cMSSignedData;
        if (cMSSignedData.getSignedContentTypeOID().equals(PKCSObjectIdentifiers.id_ct_TSTInfo.getId())) {
            Collection<SignerInformation> signers = this.tsToken.getSignerInfos().getSigners();
            if (signers.size() == 1) {
                this.tsaSignerInfo = signers.iterator().next();
                try {
                    CMSTypedData signedContent = this.tsToken.getSignedContent();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    signedContent.write(byteArrayOutputStream);
                    this.tstInfo = new TimeStampTokenInfo(TSTInfo.getInstance(new ASN1InputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject()));
                    Attribute attribute = this.tsaSignerInfo.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificate);
                    if (attribute != null) {
                        this.certID = new CertID(ESSCertID.getInstance(SigningCertificate.getInstance(attribute.getAttrValues().getObjectAt(0)).getCerts()[0]));
                        return;
                    }
                    Attribute attribute2 = this.tsaSignerInfo.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificateV2);
                    if (attribute2 != null) {
                        this.certID = new CertID(ESSCertIDv2.getInstance(SigningCertificateV2.getInstance(attribute2.getAttrValues().getObjectAt(0)).getCerts()[0]));
                        return;
                    }
                    throw new TSPValidationException("no signing certificate attribute found, time stamp invalid.");
                } catch (CMSException e11) {
                    throw new TSPException(e11.getMessage(), e11.getUnderlyingException());
                }
            }
            throw new IllegalArgumentException("Time-stamp token signed by " + signers.size() + " signers, but it must contain just the TSA signature.");
        }
        throw new TSPValidationException("ContentInfo object not for a time stamp.");
    }

    /* loaded from: classes4.dex */
    private class CertID {
        private ESSCertID certID;
        private ESSCertIDv2 certIDv2;

        CertID(ESSCertID eSSCertID) {
            this.certID = eSSCertID;
            this.certIDv2 = null;
        }

        public byte[] getCertHash() {
            ESSCertID eSSCertID = this.certID;
            if (eSSCertID != null) {
                return eSSCertID.getCertHash();
            }
            return this.certIDv2.getCertHash();
        }

        public AlgorithmIdentifier getHashAlgorithm() {
            if (this.certID != null) {
                return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1);
            }
            return this.certIDv2.getHashAlgorithm();
        }

        public String getHashAlgorithmName() {
            return this.certID != null ? McElieceCCA2KeyGenParameterSpec.SHA1 : NISTObjectIdentifiers.id_sha256.equals(this.certIDv2.getHashAlgorithm().getAlgorithm()) ? McElieceCCA2KeyGenParameterSpec.SHA256 : this.certIDv2.getHashAlgorithm().getAlgorithm().getId();
        }

        public IssuerSerial getIssuerSerial() {
            ESSCertID eSSCertID = this.certID;
            if (eSSCertID != null) {
                return eSSCertID.getIssuerSerial();
            }
            return this.certIDv2.getIssuerSerial();
        }

        CertID(ESSCertIDv2 eSSCertIDv2) {
            this.certIDv2 = eSSCertIDv2;
            this.certID = null;
        }
    }
}