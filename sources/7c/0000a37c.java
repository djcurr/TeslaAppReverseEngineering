package org.spongycastle.pkcs;

import java.io.OutputStream;
import org.spongycastle.asn1.pkcs.MacData;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.operator.MacCalculator;

/* loaded from: classes4.dex */
class MacDataGenerator {
    private PKCS12MacCalculatorBuilder builder;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MacDataGenerator(PKCS12MacCalculatorBuilder pKCS12MacCalculatorBuilder) {
        this.builder = pKCS12MacCalculatorBuilder;
    }

    public MacData build(char[] cArr, byte[] bArr) {
        try {
            MacCalculator build = this.builder.build(cArr);
            OutputStream outputStream = build.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            AlgorithmIdentifier algorithmIdentifier = build.getAlgorithmIdentifier();
            DigestInfo digestInfo = new DigestInfo(this.builder.getDigestAlgorithmIdentifier(), build.getMac());
            PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
            return new MacData(digestInfo, pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
        } catch (Exception e11) {
            throw new PKCSException("unable to process data: " + e11.getMessage(), e11);
        }
    }
}