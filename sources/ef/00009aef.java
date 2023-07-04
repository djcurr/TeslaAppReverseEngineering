package org.spongycastle.cms.jcajce;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.cms.IssuerAndSerialNumber;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.sec.SECObjectIdentifiers;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.cms.CMSException;
import org.spongycastle.jcajce.util.AlgorithmParametersUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class CMSUtils {
    private static final Set ecAlgs;
    private static final Set mqvAlgs;

    static {
        HashSet hashSet = new HashSet();
        mqvAlgs = hashSet;
        HashSet hashSet2 = new HashSet();
        ecAlgs = hashSet2;
        hashSet.add(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha224kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha256kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha384kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha512kdf_scheme);
        hashSet2.add(X9ObjectIdentifiers.dhSinglePass_cofactorDH_sha1kdf_scheme);
        hashSet2.add(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha224kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha224kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha256kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha256kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha384kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha384kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha512kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha512kdf_scheme);
    }

    CMSUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EnvelopedDataHelper createContentHelper(Provider provider) {
        if (provider != null) {
            return new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        }
        return new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1Encodable extractParameters(AlgorithmParameters algorithmParameters) {
        try {
            return AlgorithmParametersUtils.extractParameters(algorithmParameters);
        } catch (IOException e11) {
            throw new CMSException("cannot extract parameters: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IssuerAndSerialNumber getIssuerAndSerialNumber(X509Certificate x509Certificate) {
        return new IssuerAndSerialNumber(Certificate.getInstance(x509Certificate.getEncoded()).getIssuer(), x509Certificate.getSerialNumber());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] getSubjectKeyId(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId());
        if (extensionValue != null) {
            return ASN1OctetString.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getOctets();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isEC(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ecAlgs.contains(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isMQV(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return mqvAlgs.contains(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isRFC2631(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.id_alg_ESDH) || aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.id_alg_SSDH);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void loadParameters(AlgorithmParameters algorithmParameters, ASN1Encodable aSN1Encodable) {
        try {
            AlgorithmParametersUtils.loadParameters(algorithmParameters, aSN1Encodable);
        } catch (IOException e11) {
            throw new CMSException("error encoding algorithm parameters.", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EnvelopedDataHelper createContentHelper(String str) {
        if (str != null) {
            return new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        }
        return new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    }
}