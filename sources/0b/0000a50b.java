package org.spongycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.TBSCertificate;
import org.spongycastle.asn1.x509.Time;
import org.spongycastle.asn1.x509.V1TBSCertificateGenerator;
import org.spongycastle.asn1.x509.X509Name;
import org.spongycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.X509Principal;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes4.dex */
public class X509V1CertificateGenerator {
    private AlgorithmIdentifier sigAlgId;
    private ASN1ObjectIdentifier sigOID;
    private String signatureAlgorithm;
    private final JcaJceHelper bcHelper = new BCJcaJceHelper();
    private final CertificateFactory certificateFactory = new CertificateFactory();
    private V1TBSCertificateGenerator tbsGen = new V1TBSCertificateGenerator();

    private X509Certificate generateJcaObject(TBSCertificate tBSCertificate, byte[] bArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertificate);
        aSN1EncodableVector.add(this.sigAlgId);
        aSN1EncodableVector.add(new DERBitString(bArr));
        try {
            return (X509Certificate) this.certificateFactory.engineGenerateCertificate(new ByteArrayInputStream(new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER)));
        } catch (Exception e11) {
            throw new ExtCertificateEncodingException("exception producing certificate object", e11);
        }
    }

    public X509Certificate generate(PrivateKey privateKey) {
        return generate(privateKey, (SecureRandom) null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey) {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public Iterator getSignatureAlgNames() {
        return X509Util.getAlgNames();
    }

    public void reset() {
        this.tbsGen = new V1TBSCertificateGenerator();
    }

    public void setIssuerDN(X500Principal x500Principal) {
        try {
            this.tbsGen.setIssuer(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e11) {
            throw new IllegalArgumentException("can't process principal: " + e11);
        }
    }

    public void setNotAfter(Date date) {
        this.tbsGen.setEndDate(new Time(date));
    }

    public void setNotBefore(Date date) {
        this.tbsGen.setStartDate(new Time(date));
    }

    public void setPublicKey(PublicKey publicKey) {
        try {
            this.tbsGen.setSubjectPublicKeyInfo(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
        } catch (Exception e11) {
            throw new IllegalArgumentException("unable to process key - " + e11.toString());
        }
    }

    public void setSerialNumber(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.ZERO) > 0) {
            this.tbsGen.setSerialNumber(new ASN1Integer(bigInteger));
            return;
        }
        throw new IllegalArgumentException("serial number must be a positive integer");
    }

    public void setSignatureAlgorithm(String str) {
        this.signatureAlgorithm = str;
        try {
            ASN1ObjectIdentifier algorithmOID = X509Util.getAlgorithmOID(str);
            this.sigOID = algorithmOID;
            AlgorithmIdentifier sigAlgID = X509Util.getSigAlgID(algorithmOID, str);
            this.sigAlgId = sigAlgID;
            this.tbsGen.setSignature(sigAlgID);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unknown signature type requested");
        }
    }

    public void setSubjectDN(X500Principal x500Principal) {
        try {
            this.tbsGen.setSubject(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e11) {
            throw new IllegalArgumentException("can't process principal: " + e11);
        }
    }

    public X509Certificate generate(PrivateKey privateKey, SecureRandom secureRandom) {
        TBSCertificate generateTBSCertificate = this.tbsGen.generateTBSCertificate();
        try {
            return generateJcaObject(generateTBSCertificate, X509Util.calculateSignature(this.sigOID, this.signatureAlgorithm, privateKey, secureRandom, generateTBSCertificate));
        } catch (IOException e11) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e11);
        }
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, SecureRandom secureRandom) {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public void setIssuerDN(X509Name x509Name) {
        this.tbsGen.setIssuer(x509Name);
    }

    public void setSubjectDN(X509Name x509Name) {
        this.tbsGen.setSubject(x509Name);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str) {
        return generateX509Certificate(privateKey, str, null);
    }

    public X509Certificate generate(PrivateKey privateKey, String str) {
        return generate(privateKey, str, null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str, SecureRandom secureRandom) {
        try {
            return generate(privateKey, str, secureRandom);
        } catch (InvalidKeyException e11) {
            throw e11;
        } catch (NoSuchProviderException e12) {
            throw e12;
        } catch (SignatureException e13) {
            throw e13;
        } catch (GeneralSecurityException e14) {
            throw new SecurityException("exception: " + e14);
        }
    }

    public X509Certificate generate(PrivateKey privateKey, String str, SecureRandom secureRandom) {
        TBSCertificate generateTBSCertificate = this.tbsGen.generateTBSCertificate();
        try {
            return generateJcaObject(generateTBSCertificate, X509Util.calculateSignature(this.sigOID, this.signatureAlgorithm, str, privateKey, secureRandom, generateTBSCertificate));
        } catch (IOException e11) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e11);
        }
    }
}