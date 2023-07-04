package org.spongycastle.operator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.bc.BCObjectIdentifiers;
import org.spongycastle.asn1.bsi.BSIObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.eac.EACObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.RSASSAPSSparams;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class DefaultSignatureAlgorithmIdentifierFinder implements SignatureAlgorithmIdentifierFinder {
    private static final ASN1ObjectIdentifier ENCRYPTION_DSA;
    private static final ASN1ObjectIdentifier ENCRYPTION_ECDSA;
    private static final ASN1ObjectIdentifier ENCRYPTION_ECGOST3410;
    private static final ASN1ObjectIdentifier ENCRYPTION_GOST3410;
    private static final ASN1ObjectIdentifier ENCRYPTION_RSA_PSS;
    private static Map algorithms = new HashMap();
    private static Set noParams = new HashSet();
    private static Map params = new HashMap();
    private static Set pkcs15RsaEncryption = new HashSet();
    private static Map digestOids = new HashMap();
    private static final ASN1ObjectIdentifier ENCRYPTION_RSA = PKCSObjectIdentifiers.rsaEncryption;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X9ObjectIdentifiers.id_dsa_with_sha1;
        ENCRYPTION_DSA = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X9ObjectIdentifiers.ecdsa_with_SHA1;
        ENCRYPTION_ECDSA = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        ENCRYPTION_RSA_PSS = aSN1ObjectIdentifier3;
        ENCRYPTION_GOST3410 = CryptoProObjectIdentifiers.gostR3410_94;
        ENCRYPTION_ECGOST3410 = CryptoProObjectIdentifiers.gostR3410_2001;
        Map map = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.md2WithRSAEncryption;
        map.put("MD2WITHRSAENCRYPTION", aSN1ObjectIdentifier4);
        algorithms.put("MD2WITHRSA", aSN1ObjectIdentifier4);
        Map map2 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.md5WithRSAEncryption;
        map2.put("MD5WITHRSAENCRYPTION", aSN1ObjectIdentifier5);
        algorithms.put("MD5WITHRSA", aSN1ObjectIdentifier5);
        Map map3 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.sha1WithRSAEncryption;
        map3.put("SHA1WITHRSAENCRYPTION", aSN1ObjectIdentifier6);
        algorithms.put("SHA1WITHRSA", aSN1ObjectIdentifier6);
        Map map4 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        map4.put("SHA224WITHRSAENCRYPTION", aSN1ObjectIdentifier7);
        algorithms.put("SHA224WITHRSA", aSN1ObjectIdentifier7);
        Map map5 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        map5.put("SHA256WITHRSAENCRYPTION", aSN1ObjectIdentifier8);
        algorithms.put("SHA256WITHRSA", aSN1ObjectIdentifier8);
        Map map6 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        map6.put("SHA384WITHRSAENCRYPTION", aSN1ObjectIdentifier9);
        algorithms.put("SHA384WITHRSA", aSN1ObjectIdentifier9);
        Map map7 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        map7.put("SHA512WITHRSAENCRYPTION", aSN1ObjectIdentifier10);
        algorithms.put("SHA512WITHRSA", aSN1ObjectIdentifier10);
        algorithms.put("SHA1WITHRSAANDMGF1", aSN1ObjectIdentifier3);
        algorithms.put("SHA224WITHRSAANDMGF1", aSN1ObjectIdentifier3);
        algorithms.put("SHA256WITHRSAANDMGF1", aSN1ObjectIdentifier3);
        algorithms.put("SHA384WITHRSAANDMGF1", aSN1ObjectIdentifier3);
        algorithms.put("SHA512WITHRSAANDMGF1", aSN1ObjectIdentifier3);
        Map map8 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        map8.put("RIPEMD160WITHRSAENCRYPTION", aSN1ObjectIdentifier11);
        algorithms.put("RIPEMD160WITHRSA", aSN1ObjectIdentifier11);
        Map map9 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        map9.put("RIPEMD128WITHRSAENCRYPTION", aSN1ObjectIdentifier12);
        algorithms.put("RIPEMD128WITHRSA", aSN1ObjectIdentifier12);
        Map map10 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        map10.put("RIPEMD256WITHRSAENCRYPTION", aSN1ObjectIdentifier13);
        algorithms.put("RIPEMD256WITHRSA", aSN1ObjectIdentifier13);
        algorithms.put("SHA1WITHDSA", aSN1ObjectIdentifier);
        algorithms.put("DSAWITHSHA1", aSN1ObjectIdentifier);
        Map map11 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.dsa_with_sha224;
        map11.put("SHA224WITHDSA", aSN1ObjectIdentifier14);
        Map map12 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.dsa_with_sha256;
        map12.put("SHA256WITHDSA", aSN1ObjectIdentifier15);
        Map map13 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.dsa_with_sha384;
        map13.put("SHA384WITHDSA", aSN1ObjectIdentifier16);
        Map map14 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.dsa_with_sha512;
        map14.put("SHA512WITHDSA", aSN1ObjectIdentifier17);
        algorithms.put("SHA1WITHECDSA", aSN1ObjectIdentifier2);
        algorithms.put("ECDSAWITHSHA1", aSN1ObjectIdentifier2);
        Map map15 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = X9ObjectIdentifiers.ecdsa_with_SHA224;
        map15.put("SHA224WITHECDSA", aSN1ObjectIdentifier18);
        Map map16 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = X9ObjectIdentifiers.ecdsa_with_SHA256;
        map16.put("SHA256WITHECDSA", aSN1ObjectIdentifier19);
        Map map17 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = X9ObjectIdentifiers.ecdsa_with_SHA384;
        map17.put("SHA384WITHECDSA", aSN1ObjectIdentifier20);
        Map map18 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = X9ObjectIdentifiers.ecdsa_with_SHA512;
        map18.put("SHA512WITHECDSA", aSN1ObjectIdentifier21);
        Map map19 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        map19.put("GOST3411WITHGOST3410", aSN1ObjectIdentifier22);
        algorithms.put("GOST3411WITHGOST3410-94", aSN1ObjectIdentifier22);
        Map map20 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001;
        map20.put("GOST3411WITHECGOST3410", aSN1ObjectIdentifier23);
        algorithms.put("GOST3411WITHECGOST3410-2001", aSN1ObjectIdentifier23);
        algorithms.put("GOST3411WITHGOST3410-2001", aSN1ObjectIdentifier23);
        algorithms.put("SHA1WITHPLAIN-ECDSA", BSIObjectIdentifiers.ecdsa_plain_SHA1);
        algorithms.put("SHA224WITHPLAIN-ECDSA", BSIObjectIdentifiers.ecdsa_plain_SHA224);
        algorithms.put("SHA256WITHPLAIN-ECDSA", BSIObjectIdentifiers.ecdsa_plain_SHA256);
        algorithms.put("SHA384WITHPLAIN-ECDSA", BSIObjectIdentifiers.ecdsa_plain_SHA384);
        algorithms.put("SHA512WITHPLAIN-ECDSA", BSIObjectIdentifiers.ecdsa_plain_SHA512);
        algorithms.put("RIPEMD160WITHPLAIN-ECDSA", BSIObjectIdentifiers.ecdsa_plain_RIPEMD160);
        algorithms.put("SHA1WITHCVC-ECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_1);
        algorithms.put("SHA224WITHCVC-ECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_224);
        algorithms.put("SHA256WITHCVC-ECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_256);
        algorithms.put("SHA384WITHCVC-ECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_384);
        algorithms.put("SHA512WITHCVC-ECDSA", EACObjectIdentifiers.id_TA_ECDSA_SHA_512);
        Map map21 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = BCObjectIdentifiers.sphincs256_with_SHA3_512;
        map21.put("SHA3-512WITHSPHINCS256", aSN1ObjectIdentifier24);
        Map map22 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.sphincs256_with_SHA512;
        map22.put("SHA512WITHSPHINCS256", aSN1ObjectIdentifier25);
        noParams.add(aSN1ObjectIdentifier2);
        noParams.add(aSN1ObjectIdentifier18);
        noParams.add(aSN1ObjectIdentifier19);
        noParams.add(aSN1ObjectIdentifier20);
        noParams.add(aSN1ObjectIdentifier21);
        noParams.add(aSN1ObjectIdentifier);
        noParams.add(aSN1ObjectIdentifier14);
        noParams.add(aSN1ObjectIdentifier15);
        noParams.add(aSN1ObjectIdentifier16);
        noParams.add(aSN1ObjectIdentifier17);
        noParams.add(aSN1ObjectIdentifier22);
        noParams.add(aSN1ObjectIdentifier23);
        noParams.add(aSN1ObjectIdentifier25);
        noParams.add(aSN1ObjectIdentifier24);
        pkcs15RsaEncryption.add(aSN1ObjectIdentifier6);
        pkcs15RsaEncryption.add(aSN1ObjectIdentifier7);
        pkcs15RsaEncryption.add(aSN1ObjectIdentifier8);
        pkcs15RsaEncryption.add(aSN1ObjectIdentifier9);
        pkcs15RsaEncryption.add(aSN1ObjectIdentifier10);
        pkcs15RsaEncryption.add(aSN1ObjectIdentifier12);
        pkcs15RsaEncryption.add(aSN1ObjectIdentifier11);
        pkcs15RsaEncryption.add(aSN1ObjectIdentifier13);
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = OIWObjectIdentifiers.idSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        params.put("SHA1WITHRSAANDMGF1", createPSSParams(new AlgorithmIdentifier(aSN1ObjectIdentifier26, dERNull), 20));
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = NISTObjectIdentifiers.id_sha224;
        params.put("SHA224WITHRSAANDMGF1", createPSSParams(new AlgorithmIdentifier(aSN1ObjectIdentifier27, dERNull), 28));
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = NISTObjectIdentifiers.id_sha256;
        params.put("SHA256WITHRSAANDMGF1", createPSSParams(new AlgorithmIdentifier(aSN1ObjectIdentifier28, dERNull), 32));
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = NISTObjectIdentifiers.id_sha384;
        params.put("SHA384WITHRSAANDMGF1", createPSSParams(new AlgorithmIdentifier(aSN1ObjectIdentifier29, dERNull), 48));
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = NISTObjectIdentifiers.id_sha512;
        params.put("SHA512WITHRSAANDMGF1", createPSSParams(new AlgorithmIdentifier(aSN1ObjectIdentifier30, dERNull), 64));
        digestOids.put(aSN1ObjectIdentifier7, aSN1ObjectIdentifier27);
        digestOids.put(aSN1ObjectIdentifier8, aSN1ObjectIdentifier28);
        digestOids.put(aSN1ObjectIdentifier9, aSN1ObjectIdentifier29);
        digestOids.put(aSN1ObjectIdentifier10, aSN1ObjectIdentifier30);
        digestOids.put(aSN1ObjectIdentifier4, PKCSObjectIdentifiers.md2);
        digestOids.put(PKCSObjectIdentifiers.md4WithRSAEncryption, PKCSObjectIdentifiers.md4);
        digestOids.put(aSN1ObjectIdentifier5, PKCSObjectIdentifiers.md5);
        digestOids.put(aSN1ObjectIdentifier6, aSN1ObjectIdentifier26);
        digestOids.put(aSN1ObjectIdentifier12, TeleTrusTObjectIdentifiers.ripemd128);
        digestOids.put(aSN1ObjectIdentifier11, TeleTrusTObjectIdentifiers.ripemd160);
        digestOids.put(aSN1ObjectIdentifier13, TeleTrusTObjectIdentifiers.ripemd256);
        Map map23 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = CryptoProObjectIdentifiers.gostR3411;
        map23.put(aSN1ObjectIdentifier22, aSN1ObjectIdentifier31);
        digestOids.put(aSN1ObjectIdentifier23, aSN1ObjectIdentifier31);
    }

    private static RSASSAPSSparams createPSSParams(AlgorithmIdentifier algorithmIdentifier, int i11) {
        return new RSASSAPSSparams(algorithmIdentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), new ASN1Integer(i11), new ASN1Integer(1L));
    }

    private static AlgorithmIdentifier generate(String str) {
        AlgorithmIdentifier algorithmIdentifier;
        String upperCase = Strings.toUpperCase(str);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) algorithms.get(upperCase);
        if (aSN1ObjectIdentifier != null) {
            if (noParams.contains(aSN1ObjectIdentifier)) {
                algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier);
            } else if (params.containsKey(upperCase)) {
                algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier, (ASN1Encodable) params.get(upperCase));
            } else {
                algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier, DERNull.INSTANCE);
            }
            if (pkcs15RsaEncryption.contains(aSN1ObjectIdentifier)) {
                new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);
            }
            if (algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                ((RSASSAPSSparams) algorithmIdentifier.getParameters()).getHashAlgorithm();
            } else {
                new AlgorithmIdentifier((ASN1ObjectIdentifier) digestOids.get(aSN1ObjectIdentifier), DERNull.INSTANCE);
            }
            return algorithmIdentifier;
        }
        throw new IllegalArgumentException("Unknown signature type requested: " + upperCase);
    }

    @Override // org.spongycastle.operator.SignatureAlgorithmIdentifierFinder
    public AlgorithmIdentifier find(String str) {
        return generate(str);
    }
}