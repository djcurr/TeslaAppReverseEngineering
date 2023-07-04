package org.spongycastle.tsp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.cms.Attribute;
import org.spongycastle.asn1.cms.AttributeTable;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.ExtendedKeyUsage;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.ExtensionsGenerator;
import org.spongycastle.asn1.x509.KeyPurposeId;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.cms.SignerInformation;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
public class TSPUtil {
    private static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
    private static final Map digestLengths;
    private static final Map digestNames;

    static {
        HashMap hashMap = new HashMap();
        digestLengths = hashMap;
        HashMap hashMap2 = new HashMap();
        digestNames = hashMap2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.md5;
        hashMap.put(aSN1ObjectIdentifier.getId(), Integers.valueOf(16));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = OIWObjectIdentifiers.idSHA1;
        hashMap.put(aSN1ObjectIdentifier2.getId(), Integers.valueOf(20));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha224;
        hashMap.put(aSN1ObjectIdentifier3.getId(), Integers.valueOf(28));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha256;
        hashMap.put(aSN1ObjectIdentifier4.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha384;
        hashMap.put(aSN1ObjectIdentifier5.getId(), Integers.valueOf(48));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha512;
        hashMap.put(aSN1ObjectIdentifier6.getId(), Integers.valueOf(64));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = TeleTrusTObjectIdentifiers.ripemd128;
        hashMap.put(aSN1ObjectIdentifier7.getId(), Integers.valueOf(16));
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = TeleTrusTObjectIdentifiers.ripemd160;
        hashMap.put(aSN1ObjectIdentifier8.getId(), Integers.valueOf(20));
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = TeleTrusTObjectIdentifiers.ripemd256;
        hashMap.put(aSN1ObjectIdentifier9.getId(), Integers.valueOf(32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = CryptoProObjectIdentifiers.gostR3411;
        hashMap.put(aSN1ObjectIdentifier10.getId(), Integers.valueOf(32));
        hashMap2.put(aSN1ObjectIdentifier.getId(), "MD5");
        hashMap2.put(aSN1ObjectIdentifier2.getId(), "SHA1");
        hashMap2.put(aSN1ObjectIdentifier3.getId(), "SHA224");
        hashMap2.put(aSN1ObjectIdentifier4.getId(), "SHA256");
        hashMap2.put(aSN1ObjectIdentifier5.getId(), "SHA384");
        hashMap2.put(aSN1ObjectIdentifier6.getId(), "SHA512");
        hashMap2.put(PKCSObjectIdentifiers.sha1WithRSAEncryption.getId(), "SHA1");
        hashMap2.put(PKCSObjectIdentifiers.sha224WithRSAEncryption.getId(), "SHA224");
        hashMap2.put(PKCSObjectIdentifiers.sha256WithRSAEncryption.getId(), "SHA256");
        hashMap2.put(PKCSObjectIdentifiers.sha384WithRSAEncryption.getId(), "SHA384");
        hashMap2.put(PKCSObjectIdentifiers.sha512WithRSAEncryption.getId(), "SHA512");
        hashMap2.put(aSN1ObjectIdentifier7.getId(), "RIPEMD128");
        hashMap2.put(aSN1ObjectIdentifier8.getId(), "RIPEMD160");
        hashMap2.put(aSN1ObjectIdentifier9.getId(), "RIPEMD256");
        hashMap2.put(aSN1ObjectIdentifier10.getId(), "GOST3411");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void addExtension(ExtensionsGenerator extensionsGenerator, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, ASN1Encodable aSN1Encodable) {
        try {
            extensionsGenerator.addExtension(aSN1ObjectIdentifier, z11, aSN1Encodable);
        } catch (IOException e11) {
            throw new TSPIOException("cannot encode extension: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getDigestLength(String str) {
        Integer num = (Integer) digestLengths.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new TSPException("digest algorithm cannot be found.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List getExtensionOIDs(Extensions extensions) {
        if (extensions == null) {
            return EMPTY_LIST;
        }
        return Collections.unmodifiableList(Arrays.asList(extensions.getExtensionOIDs()));
    }

    public static Collection getSignatureTimestamps(SignerInformation signerInformation, DigestCalculatorProvider digestCalculatorProvider) {
        ArrayList arrayList = new ArrayList();
        AttributeTable unsignedAttributes = signerInformation.getUnsignedAttributes();
        if (unsignedAttributes != null) {
            ASN1EncodableVector all = unsignedAttributes.getAll(PKCSObjectIdentifiers.id_aa_signatureTimeStampToken);
            for (int i11 = 0; i11 < all.size(); i11++) {
                ASN1Set attrValues = ((Attribute) all.get(i11)).getAttrValues();
                for (int i12 = 0; i12 < attrValues.size(); i12++) {
                    try {
                        TimeStampToken timeStampToken = new TimeStampToken(ContentInfo.getInstance(attrValues.getObjectAt(i12)));
                        TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
                        DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampInfo.getHashAlgorithm());
                        OutputStream outputStream = digestCalculator.getOutputStream();
                        outputStream.write(signerInformation.getSignature());
                        outputStream.close();
                        if (org.spongycastle.util.Arrays.constantTimeAreEqual(digestCalculator.getDigest(), timeStampInfo.getMessageImprintDigest())) {
                            arrayList.add(timeStampToken);
                        } else {
                            throw new TSPValidationException("Incorrect digest in message imprint");
                        }
                    } catch (OperatorCreationException unused) {
                        throw new TSPValidationException("Unknown hash algorithm specified in timestamp");
                    } catch (Exception unused2) {
                        throw new TSPValidationException("Timestamp could not be parsed");
                    }
                }
            }
        }
        return arrayList;
    }

    public static void validateCertificate(X509CertificateHolder x509CertificateHolder) {
        if (x509CertificateHolder.toASN1Structure().getVersionNumber() == 3) {
            Extension extension = x509CertificateHolder.getExtension(Extension.extendedKeyUsage);
            if (extension != null) {
                if (extension.isCritical()) {
                    ExtendedKeyUsage extendedKeyUsage = ExtendedKeyUsage.getInstance(extension.getParsedValue());
                    if (!extendedKeyUsage.hasKeyPurposeId(KeyPurposeId.id_kp_timeStamping) || extendedKeyUsage.size() != 1) {
                        throw new TSPValidationException("ExtendedKeyUsage not solely time stamping.");
                    }
                    return;
                }
                throw new TSPValidationException("Certificate must have an ExtendedKeyUsage extension marked as critical.");
            }
            throw new TSPValidationException("Certificate must have an ExtendedKeyUsage extension.");
        }
        throw new IllegalArgumentException("Certificate must have an ExtendedKeyUsage extension.");
    }
}