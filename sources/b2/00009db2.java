package org.spongycastle.dvcs;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.cms.CMSException;
import org.spongycastle.cms.CMSProcessableByteArray;
import org.spongycastle.cms.CMSSignedData;
import org.spongycastle.cms.CMSSignedDataGenerator;

/* loaded from: classes4.dex */
public class SignedDVCSMessageGenerator {
    private final CMSSignedDataGenerator signedDataGen;

    public SignedDVCSMessageGenerator(CMSSignedDataGenerator cMSSignedDataGenerator) {
        this.signedDataGen = cMSSignedDataGenerator;
    }

    public CMSSignedData build(DVCSMessage dVCSMessage) {
        try {
            return this.signedDataGen.generate(new CMSProcessableByteArray(dVCSMessage.getContentType(), dVCSMessage.getContent().toASN1Primitive().getEncoded(ASN1Encoding.DER)), true);
        } catch (IOException e11) {
            throw new DVCSException("Could not encode DVCS request", e11);
        } catch (CMSException e12) {
            throw new DVCSException("Could not sign DVCS request", e12);
        }
    }
}