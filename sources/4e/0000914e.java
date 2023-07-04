package org.bouncycastle.jcajce.provider.asymmetric;

import a60.a;
import f50.o;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.spongycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import r70.j;
import y40.d;
import z40.b;

/* loaded from: classes5.dex */
public class EC {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.ec.";
    private static final Map<String, String> generalEcAttributes;

    /* loaded from: classes5.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("AlgorithmParameters.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.AlgorithmParametersSpi");
            configurableProvider.addAttributes("KeyAgreement.ECDH", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DH");
            configurableProvider.addAttributes("KeyAgreement.ECDHC", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC");
            configurableProvider.addAttributes("KeyAgreement.ECCDH", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECCDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHC");
            configurableProvider.addAttributes("KeyAgreement.ECCDHU", EC.generalEcAttributes);
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHU", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUC");
            configurableProvider.addAlgorithm("KeyAgreement.ECDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECDHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECDHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECDHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECDHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo");
            k kVar = o.Q0;
            configurableProvider.addAlgorithm("KeyAgreement", kVar, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1KDFAndSharedInfo");
            k kVar2 = o.R0;
            configurableProvider.addAlgorithm("KeyAgreement", kVar2, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA1KDFAndSharedInfo");
            k kVar3 = d.J;
            configurableProvider.addAlgorithm("KeyAgreement", kVar3, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA224KDFAndSharedInfo");
            k kVar4 = d.N;
            configurableProvider.addAlgorithm("KeyAgreement", kVar4, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA224KDFAndSharedInfo");
            k kVar5 = d.K;
            configurableProvider.addAlgorithm("KeyAgreement", kVar5, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256KDFAndSharedInfo");
            k kVar6 = d.O;
            configurableProvider.addAlgorithm("KeyAgreement", kVar6, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA256KDFAndSharedInfo");
            k kVar7 = d.L;
            configurableProvider.addAlgorithm("KeyAgreement", kVar7, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo");
            k kVar8 = d.P;
            configurableProvider.addAlgorithm("KeyAgreement", kVar8, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA384KDFAndSharedInfo");
            k kVar9 = d.M;
            configurableProvider.addAlgorithm("KeyAgreement", kVar9, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo");
            k kVar10 = d.Q;
            configurableProvider.addAlgorithm("KeyAgreement", kVar10, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$CDHwithSHA512KDFAndSharedInfo");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA1CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA256CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA384CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHwithSHA512CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA1CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA224CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA256CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA384CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA512CKDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA1KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA224KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA256KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA384KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECCDHUWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$DHUwithSHA512KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA1KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA224KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA256KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA384KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA512KDF");
            configurableProvider.addAlgorithm("KeyAgreement", a.f305p, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA1KDF");
            configurableProvider.addAlgorithm("KeyAgreement", a.f306q, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA224KDF");
            configurableProvider.addAlgorithm("KeyAgreement", a.f307r, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA256KDF");
            configurableProvider.addAlgorithm("KeyAgreement", a.f308s, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA384KDF");
            configurableProvider.addAlgorithm("KeyAgreement", a.f309t, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithSHA512KDF");
            configurableProvider.addAlgorithm("KeyAgreement", a.f310u, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithRIPEMD160KDF");
            configurableProvider.addAlgorithm("KeyAgreement.ECKAEGWITHRIPEMD160KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$ECKAEGwithRIPEMD160KDF");
            k kVar11 = o.f25891h0;
            registerOid(configurableProvider, kVar11, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, kVar2, "EC", new KeyFactorySpi.EC());
            k kVar12 = o.S0;
            registerOid(configurableProvider, kVar12, "ECMQV", new KeyFactorySpi.ECMQV());
            registerOid(configurableProvider, kVar3, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, kVar4, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, kVar5, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, kVar6, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, kVar7, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, kVar8, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, kVar9, "EC", new KeyFactorySpi.EC());
            registerOid(configurableProvider, kVar10, "EC", new KeyFactorySpi.EC());
            registerOidAlgorithmParameters(configurableProvider, kVar11, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar2, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar3, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar4, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar5, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar6, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar7, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar8, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar9, "EC");
            registerOidAlgorithmParameters(configurableProvider, kVar10, "EC");
            if (!j.c("org.bouncycastle.ec.disable_mqv")) {
                configurableProvider.addAlgorithm("KeyAgreement.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQV");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA1CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1CKDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA224CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224CKDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA256CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256CKDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA384CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384CKDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA512CKDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512CKDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA224KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224KDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA256KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256KDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA384KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384KDF");
                configurableProvider.addAlgorithm("KeyAgreement.ECMQVWITHSHA512KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512KDF");
                configurableProvider.addAlgorithm("KeyAgreement." + kVar12, "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA1KDFAndSharedInfo");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("KeyAgreement.");
                k kVar13 = d.R;
                sb2.append(kVar13);
                configurableProvider.addAlgorithm(sb2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA224KDFAndSharedInfo");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("KeyAgreement.");
                k kVar14 = d.S;
                sb3.append(kVar14);
                configurableProvider.addAlgorithm(sb3.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA256KDFAndSharedInfo");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("KeyAgreement.");
                k kVar15 = d.T;
                sb4.append(kVar15);
                configurableProvider.addAlgorithm(sb4.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA384KDFAndSharedInfo");
                StringBuilder sb5 = new StringBuilder();
                sb5.append("KeyAgreement.");
                k kVar16 = d.U;
                sb5.append(kVar16);
                configurableProvider.addAlgorithm(sb5.toString(), "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$MQVwithSHA512KDFAndSharedInfo");
                registerOid(configurableProvider, kVar, "EC", new KeyFactorySpi.EC());
                registerOidAlgorithmParameters(configurableProvider, kVar12, "EC");
                registerOid(configurableProvider, kVar13, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, kVar14, "EC");
                registerOid(configurableProvider, kVar14, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, kVar13, "EC");
                registerOid(configurableProvider, kVar15, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, kVar15, "EC");
                registerOid(configurableProvider, kVar16, "ECMQV", new KeyFactorySpi.ECMQV());
                registerOidAlgorithmParameters(configurableProvider, kVar16, "EC");
                configurableProvider.addAlgorithm("KeyFactory.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECMQV");
                configurableProvider.addAlgorithm("KeyPairGenerator.ECMQV", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECMQV");
            }
            configurableProvider.addAlgorithm("KeyFactory.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$EC");
            configurableProvider.addAlgorithm("KeyFactory.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDSA");
            configurableProvider.addAlgorithm("KeyFactory.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDH");
            configurableProvider.addAlgorithm("KeyFactory.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi$ECDHC");
            configurableProvider.addAlgorithm("KeyPairGenerator.EC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$EC");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDSA");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECDH", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECDHWITHSHA1KDF", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECDHC", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDHC");
            configurableProvider.addAlgorithm("KeyPairGenerator.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi$ECDH");
            configurableProvider.addAlgorithm("Cipher.ECIES", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIES");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIES");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIES");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512");
            configurableProvider.addAlgorithm("Cipher.ECIESwithAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA1andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA1ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA256andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256andAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA256ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256andAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA384andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384andAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA384ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384andAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA512andAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512andAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA512ANDAES-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512andAESCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA1andDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA1ANDDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA256andDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256andDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA256ANDDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA256andDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA384andDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384andDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA384ANDDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA384andDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESwithSHA512andDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512andDESedeCBC");
            configurableProvider.addAlgorithm("Cipher.ECIESWITHSHA512ANDDESEDE-CBC", "org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher$ECIESwithSHA512andDESedeCBC");
            configurableProvider.addAlgorithm("Signature.ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA");
            configurableProvider.addAlgorithm("Signature.NONEwithECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAnone");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA1withECDSA", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECDSAwithSHA1", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA1WITHECDSA", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECDSAWITHSHA1", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA1WithECDSA", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.ECDSAWithSHA1", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.1.2.840.10045.4.1", "ECDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature." + b.f60201j, "ECDSA");
            configurableProvider.addAlgorithm("Signature.ECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA");
            configurableProvider.addAlgorithm("Signature.SHA1WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA");
            configurableProvider.addAlgorithm("Signature.SHA224WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA224");
            configurableProvider.addAlgorithm("Signature.SHA256WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA256");
            configurableProvider.addAlgorithm("Signature.SHA384WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA384");
            configurableProvider.addAlgorithm("Signature.SHA512WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSA512");
            configurableProvider.addAlgorithm("Signature.SHA3-224WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_224");
            configurableProvider.addAlgorithm("Signature.SHA3-256WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_256");
            configurableProvider.addAlgorithm("Signature.SHA3-384WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_384");
            configurableProvider.addAlgorithm("Signature.SHA3-512WITHECDDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDetDSASha3_512");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.DETECDSA", "ECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA1WITHDETECDSA", "SHA1WITHECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA224WITHDETECDSA", "SHA224WITHECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA256WITHDETECDSA", "SHA256WITHECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA384WITHDETECDSA", "SHA384WITHECDDSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SHA512WITHDETECDSA", "SHA512WITHECDDSA");
            addSignatureAlgorithm(configurableProvider, "SHA224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA224", o.f25893j0);
            addSignatureAlgorithm(configurableProvider, "SHA256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA256", o.f25894k0);
            addSignatureAlgorithm(configurableProvider, "SHA384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA384", o.f25895l0);
            addSignatureAlgorithm(configurableProvider, "SHA512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSA512", o.f25896m0);
            addSignatureAlgorithm(configurableProvider, "SHA3-224", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_224", r40.b.f49138a0);
            addSignatureAlgorithm(configurableProvider, SPHINCS256KeyGenParameterSpec.SHA3_256, "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_256", r40.b.f49140b0);
            addSignatureAlgorithm(configurableProvider, "SHA3-384", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_384", r40.b.f49142c0);
            addSignatureAlgorithm(configurableProvider, "SHA3-512", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSASha3_512", r40.b.f49144d0);
            addSignatureAlgorithm(configurableProvider, "SHAKE128", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAShake128", b60.b.f7515e);
            addSignatureAlgorithm(configurableProvider, "SHAKE256", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSAShake256", b60.b.f7516f);
            addSignatureAlgorithm(configurableProvider, "RIPEMD160", "ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecDSARipeMD160", b.f60202k);
            configurableProvider.addAlgorithm("Signature.SHA1WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR");
            configurableProvider.addAlgorithm("Signature.SHA224WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR224");
            configurableProvider.addAlgorithm("Signature.SHA256WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR256");
            configurableProvider.addAlgorithm("Signature.SHA384WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR384");
            configurableProvider.addAlgorithm("Signature.SHA512WITHECNR", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecNR512");
            addSignatureAlgorithm(configurableProvider, "SHA1", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", c60.a.f8911i);
            addSignatureAlgorithm(configurableProvider, "SHA224", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", c60.a.f8912j);
            addSignatureAlgorithm(configurableProvider, "SHA256", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", c60.a.f8913k);
            addSignatureAlgorithm(configurableProvider, "SHA384", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384", c60.a.f8914l);
            addSignatureAlgorithm(configurableProvider, "SHA512", "CVC-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512", c60.a.f8915m);
            addSignatureAlgorithm(configurableProvider, "SHA1", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA", a.f293d);
            addSignatureAlgorithm(configurableProvider, "SHA224", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA224", a.f294e);
            addSignatureAlgorithm(configurableProvider, "SHA256", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA256", a.f295f);
            addSignatureAlgorithm(configurableProvider, "SHA384", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA384", a.f296g);
            addSignatureAlgorithm(configurableProvider, "SHA512", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA512", a.f297h);
            addSignatureAlgorithm(configurableProvider, "RIPEMD160", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecPlainDSARP160", a.f298i);
            addSignatureAlgorithm(configurableProvider, "SHA3-224", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA3_224", a.f299j);
            addSignatureAlgorithm(configurableProvider, SPHINCS256KeyGenParameterSpec.SHA3_256, "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA3_256", a.f300k);
            addSignatureAlgorithm(configurableProvider, "SHA3-384", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA3_384", a.f301l);
            addSignatureAlgorithm(configurableProvider, "SHA3-512", "PLAIN-ECDSA", "org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi$ecCVCDSA3_512", a.f302m);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        generalEcAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}