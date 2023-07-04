package org.spongycastle.operator;

import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.bc.BCObjectIdentifiers;
import org.spongycastle.asn1.bsi.BSIObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.RSASSAPSSparams;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.spongycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;

/* loaded from: classes4.dex */
public class DefaultDigestAlgorithmIdentifierFinder implements DigestAlgorithmIdentifierFinder {
    private static Map digestOids = new HashMap();
    private static Map digestNameToOids = new HashMap();

    static {
        Map map = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.md4WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.md4;
        map.put(aSN1ObjectIdentifier, aSN1ObjectIdentifier2);
        digestOids.put(OIWObjectIdentifiers.md4WithRSA, aSN1ObjectIdentifier2);
        Map map2 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = OIWObjectIdentifiers.sha1WithRSA;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = OIWObjectIdentifiers.idSHA1;
        map2.put(aSN1ObjectIdentifier3, aSN1ObjectIdentifier4);
        Map map3 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha224;
        map3.put(aSN1ObjectIdentifier5, aSN1ObjectIdentifier6);
        Map map4 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_sha256;
        map4.put(aSN1ObjectIdentifier7, aSN1ObjectIdentifier8);
        Map map5 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_sha384;
        map5.put(aSN1ObjectIdentifier9, aSN1ObjectIdentifier10);
        Map map6 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_sha512;
        map6.put(aSN1ObjectIdentifier11, aSN1ObjectIdentifier12);
        Map map7 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = PKCSObjectIdentifiers.md2WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = PKCSObjectIdentifiers.md2;
        map7.put(aSN1ObjectIdentifier13, aSN1ObjectIdentifier14);
        digestOids.put(PKCSObjectIdentifiers.md4WithRSAEncryption, aSN1ObjectIdentifier2);
        Map map8 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = PKCSObjectIdentifiers.md5WithRSAEncryption;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = PKCSObjectIdentifiers.md5;
        map8.put(aSN1ObjectIdentifier15, aSN1ObjectIdentifier16);
        digestOids.put(PKCSObjectIdentifiers.sha1WithRSAEncryption, aSN1ObjectIdentifier4);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA1, aSN1ObjectIdentifier4);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA224, aSN1ObjectIdentifier6);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA256, aSN1ObjectIdentifier8);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA384, aSN1ObjectIdentifier10);
        digestOids.put(X9ObjectIdentifiers.ecdsa_with_SHA512, aSN1ObjectIdentifier12);
        digestOids.put(X9ObjectIdentifiers.id_dsa_with_sha1, aSN1ObjectIdentifier4);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA1, aSN1ObjectIdentifier4);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA224, aSN1ObjectIdentifier6);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA256, aSN1ObjectIdentifier8);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA384, aSN1ObjectIdentifier10);
        digestOids.put(BSIObjectIdentifiers.ecdsa_plain_SHA512, aSN1ObjectIdentifier12);
        digestOids.put(NISTObjectIdentifiers.dsa_with_sha224, aSN1ObjectIdentifier6);
        digestOids.put(NISTObjectIdentifiers.dsa_with_sha256, aSN1ObjectIdentifier8);
        digestOids.put(NISTObjectIdentifiers.dsa_with_sha384, aSN1ObjectIdentifier10);
        digestOids.put(NISTObjectIdentifiers.dsa_with_sha512, aSN1ObjectIdentifier12);
        Map map9 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NISTObjectIdentifiers.id_sha3_224;
        map9.put(aSN1ObjectIdentifier17, aSN1ObjectIdentifier18);
        Map map10 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NISTObjectIdentifiers.id_sha3_256;
        map10.put(aSN1ObjectIdentifier19, aSN1ObjectIdentifier20);
        Map map11 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_sha3_384;
        map11.put(aSN1ObjectIdentifier21, aSN1ObjectIdentifier22);
        Map map12 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_sha3_512;
        map12.put(aSN1ObjectIdentifier23, aSN1ObjectIdentifier24);
        digestOids.put(NISTObjectIdentifiers.id_dsa_with_sha3_224, aSN1ObjectIdentifier18);
        digestOids.put(NISTObjectIdentifiers.id_dsa_with_sha3_256, aSN1ObjectIdentifier20);
        digestOids.put(NISTObjectIdentifiers.id_dsa_with_sha3_384, aSN1ObjectIdentifier22);
        digestOids.put(NISTObjectIdentifiers.id_dsa_with_sha3_512, aSN1ObjectIdentifier24);
        digestOids.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, aSN1ObjectIdentifier18);
        digestOids.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, aSN1ObjectIdentifier20);
        digestOids.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, aSN1ObjectIdentifier22);
        digestOids.put(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, aSN1ObjectIdentifier24);
        Map map13 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = TeleTrusTObjectIdentifiers.ripemd128;
        map13.put(aSN1ObjectIdentifier25, aSN1ObjectIdentifier26);
        Map map14 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = TeleTrusTObjectIdentifiers.ripemd160;
        map14.put(aSN1ObjectIdentifier27, aSN1ObjectIdentifier28);
        Map map15 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = TeleTrusTObjectIdentifiers.ripemd256;
        map15.put(aSN1ObjectIdentifier29, aSN1ObjectIdentifier30);
        Map map16 = digestOids;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = CryptoProObjectIdentifiers.gostR3411;
        map16.put(aSN1ObjectIdentifier31, aSN1ObjectIdentifier32);
        digestOids.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, aSN1ObjectIdentifier32);
        digestOids.put(BCObjectIdentifiers.sphincs256_with_SHA3_512, aSN1ObjectIdentifier24);
        digestOids.put(BCObjectIdentifiers.sphincs256_with_SHA512, aSN1ObjectIdentifier12);
        digestNameToOids.put(McElieceCCA2KeyGenParameterSpec.SHA1, aSN1ObjectIdentifier4);
        digestNameToOids.put(McElieceCCA2KeyGenParameterSpec.SHA224, aSN1ObjectIdentifier6);
        digestNameToOids.put(McElieceCCA2KeyGenParameterSpec.SHA256, aSN1ObjectIdentifier8);
        digestNameToOids.put(McElieceCCA2KeyGenParameterSpec.SHA384, aSN1ObjectIdentifier10);
        digestNameToOids.put(McElieceCCA2KeyGenParameterSpec.SHA512, aSN1ObjectIdentifier12);
        digestNameToOids.put("SHA1", aSN1ObjectIdentifier4);
        digestNameToOids.put("SHA224", aSN1ObjectIdentifier6);
        digestNameToOids.put("SHA256", aSN1ObjectIdentifier8);
        digestNameToOids.put("SHA384", aSN1ObjectIdentifier10);
        digestNameToOids.put("SHA512", aSN1ObjectIdentifier12);
        digestNameToOids.put("SHA3-224", aSN1ObjectIdentifier18);
        digestNameToOids.put(SPHINCS256KeyGenParameterSpec.SHA3_256, aSN1ObjectIdentifier20);
        digestNameToOids.put("SHA3-384", aSN1ObjectIdentifier22);
        digestNameToOids.put("SHA3-512", aSN1ObjectIdentifier24);
        digestNameToOids.put("SHAKE-128", NISTObjectIdentifiers.id_shake128);
        digestNameToOids.put("SHAKE-256", NISTObjectIdentifiers.id_shake256);
        digestNameToOids.put("GOST3411", aSN1ObjectIdentifier32);
        digestNameToOids.put("MD2", aSN1ObjectIdentifier14);
        digestNameToOids.put("MD4", aSN1ObjectIdentifier2);
        digestNameToOids.put("MD5", aSN1ObjectIdentifier16);
        digestNameToOids.put("RIPEMD128", aSN1ObjectIdentifier26);
        digestNameToOids.put("RIPEMD160", aSN1ObjectIdentifier28);
        digestNameToOids.put("RIPEMD256", aSN1ObjectIdentifier30);
    }

    @Override // org.spongycastle.operator.DigestAlgorithmIdentifierFinder
    public AlgorithmIdentifier find(AlgorithmIdentifier algorithmIdentifier) {
        if (algorithmIdentifier.getAlgorithm().equals(PKCSObjectIdentifiers.id_RSASSA_PSS)) {
            return RSASSAPSSparams.getInstance(algorithmIdentifier.getParameters()).getHashAlgorithm();
        }
        return new AlgorithmIdentifier((ASN1ObjectIdentifier) digestOids.get(algorithmIdentifier.getAlgorithm()), DERNull.INSTANCE);
    }

    @Override // org.spongycastle.operator.DigestAlgorithmIdentifierFinder
    public AlgorithmIdentifier find(String str) {
        return new AlgorithmIdentifier((ASN1ObjectIdentifier) digestNameToOids.get(str), DERNull.INSTANCE);
    }
}