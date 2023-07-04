package org.spongycastle.cert.ocsp;

import java.io.OutputStream;
import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.ocsp.CertID;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.OperatorCreationException;

/* loaded from: classes5.dex */
public class CertificateID {
    public static final AlgorithmIdentifier HASH_SHA1 = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);

    /* renamed from: id  reason: collision with root package name */
    private final CertID f43428id;

    public CertificateID(CertID certID) {
        if (certID != null) {
            this.f43428id = certID;
            return;
        }
        throw new IllegalArgumentException("'id' cannot be null");
    }

    private static CertID createCertID(DigestCalculator digestCalculator, X509CertificateHolder x509CertificateHolder, ASN1Integer aSN1Integer) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(x509CertificateHolder.toASN1Structure().getSubject().getEncoded(ASN1Encoding.DER));
            outputStream.close();
            DEROctetString dEROctetString = new DEROctetString(digestCalculator.getDigest());
            SubjectPublicKeyInfo subjectPublicKeyInfo = x509CertificateHolder.getSubjectPublicKeyInfo();
            OutputStream outputStream2 = digestCalculator.getOutputStream();
            outputStream2.write(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            outputStream2.close();
            return new CertID(digestCalculator.getAlgorithmIdentifier(), dEROctetString, new DEROctetString(digestCalculator.getDigest()), aSN1Integer);
        } catch (Exception e11) {
            throw new OCSPException("problem creating ID: " + e11, e11);
        }
    }

    public static CertificateID deriveCertificateID(CertificateID certificateID, BigInteger bigInteger) {
        return new CertificateID(new CertID(certificateID.f43428id.getHashAlgorithm(), certificateID.f43428id.getIssuerNameHash(), certificateID.f43428id.getIssuerKeyHash(), new ASN1Integer(bigInteger)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificateID) {
            return this.f43428id.toASN1Primitive().equals(((CertificateID) obj).f43428id.toASN1Primitive());
        }
        return false;
    }

    public ASN1ObjectIdentifier getHashAlgOID() {
        return this.f43428id.getHashAlgorithm().getAlgorithm();
    }

    public byte[] getIssuerKeyHash() {
        return this.f43428id.getIssuerKeyHash().getOctets();
    }

    public byte[] getIssuerNameHash() {
        return this.f43428id.getIssuerNameHash().getOctets();
    }

    public BigInteger getSerialNumber() {
        return this.f43428id.getSerialNumber().getValue();
    }

    public int hashCode() {
        return this.f43428id.toASN1Primitive().hashCode();
    }

    public boolean matchesIssuer(X509CertificateHolder x509CertificateHolder, DigestCalculatorProvider digestCalculatorProvider) {
        try {
            return createCertID(digestCalculatorProvider.get(this.f43428id.getHashAlgorithm()), x509CertificateHolder, this.f43428id.getSerialNumber()).equals(this.f43428id);
        } catch (OperatorCreationException e11) {
            throw new OCSPException("unable to create digest calculator: " + e11.getMessage(), e11);
        }
    }

    public CertID toASN1Primitive() {
        return this.f43428id;
    }

    public CertificateID(DigestCalculator digestCalculator, X509CertificateHolder x509CertificateHolder, BigInteger bigInteger) {
        this.f43428id = createCertID(digestCalculator, x509CertificateHolder, new ASN1Integer(bigInteger));
    }
}