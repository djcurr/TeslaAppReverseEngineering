package org.spongycastle.pkcs.bc;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.engines.RC2Engine;
import org.spongycastle.crypto.generators.PKCS12ParametersGenerator;
import org.spongycastle.crypto.io.MacOutputStream;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.PKCS7Padding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.DESParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.MacCalculator;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
class PKCS12PBEUtils {
    private static Map keySizes = new HashMap();
    private static Set noIvAlgs = new HashSet();
    private static Set desAlgs = new HashSet();

    static {
        Map map = keySizes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4;
        map.put(aSN1ObjectIdentifier, Integers.valueOf(128));
        Map map2 = keySizes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4;
        map2.put(aSN1ObjectIdentifier2, Integers.valueOf(40));
        Map map3 = keySizes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
        map3.put(aSN1ObjectIdentifier3, Integers.valueOf(192));
        keySizes.put(PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, Integers.valueOf(128));
        keySizes.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, Integers.valueOf(128));
        keySizes.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, Integers.valueOf(40));
        noIvAlgs.add(aSN1ObjectIdentifier);
        noIvAlgs.add(aSN1ObjectIdentifier2);
        desAlgs.add(aSN1ObjectIdentifier3);
        desAlgs.add(aSN1ObjectIdentifier3);
    }

    PKCS12PBEUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CipherParameters createCipherParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier, ExtendedDigest extendedDigest, int i11, PKCS12PBEParams pKCS12PBEParams, char[] cArr) {
        PKCS12ParametersGenerator pKCS12ParametersGenerator = new PKCS12ParametersGenerator(extendedDigest);
        pKCS12ParametersGenerator.init(PBEParametersGenerator.PKCS12PasswordToBytes(cArr), pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
        if (hasNoIv(aSN1ObjectIdentifier)) {
            return pKCS12ParametersGenerator.generateDerivedParameters(getKeySize(aSN1ObjectIdentifier));
        }
        CipherParameters generateDerivedParameters = pKCS12ParametersGenerator.generateDerivedParameters(getKeySize(aSN1ObjectIdentifier), i11 * 8);
        if (isDesAlg(aSN1ObjectIdentifier)) {
            DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
        }
        return generateDerivedParameters;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MacCalculator createMacCalculator(final ASN1ObjectIdentifier aSN1ObjectIdentifier, ExtendedDigest extendedDigest, final PKCS12PBEParams pKCS12PBEParams, final char[] cArr) {
        PKCS12ParametersGenerator pKCS12ParametersGenerator = new PKCS12ParametersGenerator(extendedDigest);
        pKCS12ParametersGenerator.init(PBEParametersGenerator.PKCS12PasswordToBytes(cArr), pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
        final HMac hMac = new HMac(extendedDigest);
        hMac.init((KeyParameter) pKCS12ParametersGenerator.generateDerivedMacParameters(extendedDigest.getDigestSize() * 8));
        return new MacCalculator() { // from class: org.spongycastle.pkcs.bc.PKCS12PBEUtils.1
            @Override // org.spongycastle.operator.MacCalculator
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return new AlgorithmIdentifier(ASN1ObjectIdentifier.this, pKCS12PBEParams);
            }

            @Override // org.spongycastle.operator.MacCalculator
            public GenericKey getKey() {
                return new GenericKey(getAlgorithmIdentifier(), PBEParametersGenerator.PKCS12PasswordToBytes(cArr));
            }

            @Override // org.spongycastle.operator.MacCalculator
            public byte[] getMac() {
                byte[] bArr = new byte[hMac.getMacSize()];
                hMac.doFinal(bArr, 0);
                return bArr;
            }

            @Override // org.spongycastle.operator.MacCalculator
            public OutputStream getOutputStream() {
                return new MacOutputStream(hMac);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PaddedBufferedBlockCipher getEngine(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        BlockCipher dESedeEngine;
        if (!aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC) && !aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC)) {
            if (!aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC) && !aSN1ObjectIdentifier.equals(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC)) {
                throw new IllegalStateException("unknown algorithm");
            }
            dESedeEngine = new RC2Engine();
        } else {
            dESedeEngine = new DESedeEngine();
        }
        return new PaddedBufferedBlockCipher(new CBCBlockCipher(dESedeEngine), new PKCS7Padding());
    }

    static int getKeySize(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ((Integer) keySizes.get(aSN1ObjectIdentifier)).intValue();
    }

    static boolean hasNoIv(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return noIvAlgs.contains(aSN1ObjectIdentifier);
    }

    static boolean isDesAlg(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return desAlgs.contains(aSN1ObjectIdentifier);
    }
}