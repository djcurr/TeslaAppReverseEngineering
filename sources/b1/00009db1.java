package org.spongycastle.dvcs;

import java.io.OutputStream;
import org.spongycastle.asn1.x509.DigestInfo;
import org.spongycastle.operator.DigestCalculator;

/* loaded from: classes4.dex */
public class MessageImprintBuilder {
    private final DigestCalculator digestCalculator;

    public MessageImprintBuilder(DigestCalculator digestCalculator) {
        this.digestCalculator = digestCalculator;
    }

    public MessageImprint build(byte[] bArr) {
        try {
            OutputStream outputStream = this.digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return new MessageImprint(new DigestInfo(this.digestCalculator.getAlgorithmIdentifier(), this.digestCalculator.getDigest()));
        } catch (Exception e11) {
            throw new DVCSException("unable to build MessageImprint: " + e11.getMessage(), e11);
        }
    }
}