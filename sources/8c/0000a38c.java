package org.spongycastle.pkcs.bc;

import java.security.SecureRandom;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.operator.MacCalculator;
import org.spongycastle.pkcs.PKCS12MacCalculatorBuilder;

/* loaded from: classes4.dex */
public class BcPKCS12MacCalculatorBuilder implements PKCS12MacCalculatorBuilder {
    private AlgorithmIdentifier algorithmIdentifier;
    private ExtendedDigest digest;
    private int iterationCount;
    private SecureRandom random;
    private int saltLength;

    public BcPKCS12MacCalculatorBuilder() {
        this(new SHA1Digest(), new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE));
    }

    @Override // org.spongycastle.pkcs.PKCS12MacCalculatorBuilder
    public MacCalculator build(char[] cArr) {
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        byte[] bArr = new byte[this.saltLength];
        this.random.nextBytes(bArr);
        return PKCS12PBEUtils.createMacCalculator(this.algorithmIdentifier.getAlgorithm(), this.digest, new PKCS12PBEParams(bArr, this.iterationCount), cArr);
    }

    @Override // org.spongycastle.pkcs.PKCS12MacCalculatorBuilder
    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    public BcPKCS12MacCalculatorBuilder setIterationCount(int i11) {
        this.iterationCount = i11;
        return this;
    }

    public BcPKCS12MacCalculatorBuilder(ExtendedDigest extendedDigest, AlgorithmIdentifier algorithmIdentifier) {
        this.iterationCount = 1024;
        this.digest = extendedDigest;
        this.algorithmIdentifier = algorithmIdentifier;
        this.saltLength = extendedDigest.getDigestSize();
    }
}