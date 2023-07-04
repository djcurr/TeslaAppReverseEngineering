package org.spongycastle.tsp;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.cms.AttributeTable;
import org.spongycastle.asn1.ess.ESSCertID;
import org.spongycastle.asn1.ess.ESSCertIDv2;
import org.spongycastle.asn1.ess.SigningCertificate;
import org.spongycastle.asn1.ess.SigningCertificateV2;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.tsp.Accuracy;
import org.spongycastle.asn1.tsp.MessageImprint;
import org.spongycastle.asn1.tsp.TSTInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.ExtensionsGenerator;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralNames;
import org.spongycastle.asn1.x509.IssuerSerial;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.CMSProcessableByteArray;
import org.spongycastle.cms.CMSSignedDataGenerator;
import org.spongycastle.cms.SignerInfoGenerator;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.util.CollectionStore;
import org.spongycastle.util.Store;

/* loaded from: classes4.dex */
public class TimeStampTokenGenerator {
    public static final int R_MICROSECONDS = 2;
    public static final int R_MILLISECONDS = 3;
    public static final int R_SECONDS = 0;
    public static final int R_TENTHS_OF_SECONDS = 1;
    private int accuracyMicros;
    private int accuracyMillis;
    private int accuracySeconds;
    private List attrCerts;
    private List certs;
    private List crls;
    private Locale locale;
    boolean ordering;
    private Map otherRevoc;
    private int resolution;
    private SignerInfoGenerator signerInfoGen;
    GeneralName tsa;
    private ASN1ObjectIdentifier tsaPolicyOID;

    public TimeStampTokenGenerator(SignerInfoGenerator signerInfoGenerator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(signerInfoGenerator, digestCalculator, aSN1ObjectIdentifier, false);
    }

    private ASN1GeneralizedTime createGeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = this.locale == null ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : new SimpleDateFormat("yyyyMMddHHmmss.SSS", this.locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        StringBuilder sb2 = new StringBuilder(simpleDateFormat.format(date));
        int indexOf = sb2.indexOf(".");
        if (indexOf < 0) {
            sb2.append("Z");
            return new ASN1GeneralizedTime(sb2.toString());
        }
        int i11 = this.resolution;
        if (i11 == 1) {
            int i12 = indexOf + 2;
            if (sb2.length() > i12) {
                sb2.delete(i12, sb2.length());
            }
        } else if (i11 == 2) {
            int i13 = indexOf + 3;
            if (sb2.length() > i13) {
                sb2.delete(i13, sb2.length());
            }
        } else if (i11 != 3) {
            throw new TSPException("unknown time-stamp resolution: " + this.resolution);
        }
        while (sb2.charAt(sb2.length() - 1) == '0') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        if (sb2.length() - 1 == indexOf) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        sb2.append("Z");
        return new ASN1GeneralizedTime(sb2.toString());
    }

    public void addAttributeCertificates(Store store) {
        this.attrCerts.addAll(store.getMatches(null));
    }

    public void addCRLs(Store store) {
        this.crls.addAll(store.getMatches(null));
    }

    public void addCertificates(Store store) {
        this.certs.addAll(store.getMatches(null));
    }

    public void addOtherRevocationInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, Store store) {
        this.otherRevoc.put(aSN1ObjectIdentifier, store.getMatches(null));
    }

    public TimeStampToken generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date) {
        return generate(timeStampRequest, bigInteger, date, null);
    }

    public void setAccuracyMicros(int i11) {
        this.accuracyMicros = i11;
    }

    public void setAccuracyMillis(int i11) {
        this.accuracyMillis = i11;
    }

    public void setAccuracySeconds(int i11) {
        this.accuracySeconds = i11;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setOrdering(boolean z11) {
        this.ordering = z11;
    }

    public void setResolution(int i11) {
        this.resolution = i11;
    }

    public void setTSA(GeneralName generalName) {
        this.tsa = generalName;
    }

    public TimeStampTokenGenerator(final SignerInfoGenerator signerInfoGenerator, DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11) {
        this.resolution = 0;
        this.locale = null;
        this.accuracySeconds = -1;
        this.accuracyMillis = -1;
        this.accuracyMicros = -1;
        this.ordering = false;
        this.tsa = null;
        this.certs = new ArrayList();
        this.crls = new ArrayList();
        this.attrCerts = new ArrayList();
        this.otherRevoc = new HashMap();
        this.signerInfoGen = signerInfoGenerator;
        this.tsaPolicyOID = aSN1ObjectIdentifier;
        if (signerInfoGenerator.hasAssociatedCertificate()) {
            X509CertificateHolder associatedCertificate = signerInfoGenerator.getAssociatedCertificate();
            TSPUtil.validateCertificate(associatedCertificate);
            try {
                OutputStream outputStream = digestCalculator.getOutputStream();
                outputStream.write(associatedCertificate.getEncoded());
                outputStream.close();
                if (digestCalculator.getAlgorithmIdentifier().getAlgorithm().equals(OIWObjectIdentifiers.idSHA1)) {
                    final ESSCertID eSSCertID = new ESSCertID(digestCalculator.getDigest(), z11 ? new IssuerSerial(new GeneralNames(new GeneralName(associatedCertificate.getIssuer())), associatedCertificate.getSerialNumber()) : null);
                    this.signerInfoGen = new SignerInfoGenerator(signerInfoGenerator, new CMSAttributeTableGenerator() { // from class: org.spongycastle.tsp.TimeStampTokenGenerator.1
                        @Override // org.spongycastle.cms.CMSAttributeTableGenerator
                        public AttributeTable getAttributes(Map map) {
                            AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_aa_signingCertificate;
                            return attributes.get(aSN1ObjectIdentifier2) == null ? attributes.add(aSN1ObjectIdentifier2, new SigningCertificate(eSSCertID)) : attributes;
                        }
                    }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
                    return;
                }
                final ESSCertIDv2 eSSCertIDv2 = new ESSCertIDv2(new AlgorithmIdentifier(digestCalculator.getAlgorithmIdentifier().getAlgorithm()), digestCalculator.getDigest(), z11 ? new IssuerSerial(new GeneralNames(new GeneralName(associatedCertificate.getIssuer())), new ASN1Integer(associatedCertificate.getSerialNumber())) : null);
                this.signerInfoGen = new SignerInfoGenerator(signerInfoGenerator, new CMSAttributeTableGenerator() { // from class: org.spongycastle.tsp.TimeStampTokenGenerator.2
                    @Override // org.spongycastle.cms.CMSAttributeTableGenerator
                    public AttributeTable getAttributes(Map map) {
                        AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_aa_signingCertificateV2;
                        return attributes.get(aSN1ObjectIdentifier2) == null ? attributes.add(aSN1ObjectIdentifier2, new SigningCertificateV2(eSSCertIDv2)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
                return;
            } catch (IOException e11) {
                throw new TSPException("Exception processing certificate.", e11);
            }
        }
        throw new IllegalArgumentException("SignerInfoGenerator must have an associated certificate");
    }

    public TimeStampToken generate(TimeStampRequest timeStampRequest, BigInteger bigInteger, Date date, Extensions extensions) {
        Accuracy accuracy;
        Extensions extensions2;
        ASN1GeneralizedTime createGeneralizedTime;
        MessageImprint messageImprint = new MessageImprint(new AlgorithmIdentifier(timeStampRequest.getMessageImprintAlgOID(), DERNull.INSTANCE), timeStampRequest.getMessageImprintDigest());
        int i11 = this.accuracySeconds;
        if (i11 > 0 || this.accuracyMillis > 0 || this.accuracyMicros > 0) {
            ASN1Integer aSN1Integer = i11 > 0 ? new ASN1Integer(i11) : null;
            int i12 = this.accuracyMillis;
            ASN1Integer aSN1Integer2 = i12 > 0 ? new ASN1Integer(i12) : null;
            int i13 = this.accuracyMicros;
            accuracy = new Accuracy(aSN1Integer, aSN1Integer2, i13 > 0 ? new ASN1Integer(i13) : null);
        } else {
            accuracy = null;
        }
        boolean z11 = this.ordering;
        ASN1Boolean aSN1Boolean = z11 ? ASN1Boolean.getInstance(z11) : null;
        ASN1Integer aSN1Integer3 = timeStampRequest.getNonce() != null ? new ASN1Integer(timeStampRequest.getNonce()) : null;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.tsaPolicyOID;
        if (timeStampRequest.getReqPolicy() != null) {
            aSN1ObjectIdentifier = timeStampRequest.getReqPolicy();
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = aSN1ObjectIdentifier;
        Extensions extensions3 = timeStampRequest.getExtensions();
        if (extensions != null) {
            ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
            if (extensions3 != null) {
                Enumeration oids = extensions3.oids();
                while (oids.hasMoreElements()) {
                    extensionsGenerator.addExtension(extensions3.getExtension(ASN1ObjectIdentifier.getInstance(oids.nextElement())));
                }
            }
            Enumeration oids2 = extensions.oids();
            while (oids2.hasMoreElements()) {
                extensionsGenerator.addExtension(extensions.getExtension(ASN1ObjectIdentifier.getInstance(oids2.nextElement())));
            }
            extensions2 = extensionsGenerator.generate();
        } else {
            extensions2 = extensions3;
        }
        if (this.resolution == 0) {
            Locale locale = this.locale;
            createGeneralizedTime = locale == null ? new ASN1GeneralizedTime(date) : new ASN1GeneralizedTime(date, locale);
        } else {
            createGeneralizedTime = createGeneralizedTime(date);
        }
        TSTInfo tSTInfo = new TSTInfo(aSN1ObjectIdentifier2, messageImprint, new ASN1Integer(bigInteger), createGeneralizedTime, accuracy, aSN1Boolean, aSN1Integer3, this.tsa, extensions2);
        try {
            CMSSignedDataGenerator cMSSignedDataGenerator = new CMSSignedDataGenerator();
            if (timeStampRequest.getCertReq()) {
                cMSSignedDataGenerator.addCertificates(new CollectionStore(this.certs));
                cMSSignedDataGenerator.addAttributeCertificates(new CollectionStore(this.attrCerts));
            }
            cMSSignedDataGenerator.addCRLs(new CollectionStore(this.crls));
            if (!this.otherRevoc.isEmpty()) {
                for (ASN1ObjectIdentifier aSN1ObjectIdentifier3 : this.otherRevoc.keySet()) {
                    cMSSignedDataGenerator.addOtherRevocationInfo(aSN1ObjectIdentifier3, new CollectionStore((Collection) this.otherRevoc.get(aSN1ObjectIdentifier3)));
                }
            }
            cMSSignedDataGenerator.addSignerInfoGenerator(this.signerInfoGen);
            return new TimeStampToken(cMSSignedDataGenerator.generate(new CMSProcessableByteArray(PKCSObjectIdentifiers.id_ct_TSTInfo, tSTInfo.getEncoded(ASN1Encoding.DER)), true));
        } catch (IOException e11) {
            throw new TSPException("Exception encoding info", e11);
        } catch (CMSException e12) {
            throw new TSPException("Error generating time-stamp token", e12);
        }
    }
}