package org.spongycastle.asn1.crmf;

import org.spongycastle.asn1.ASN1Integer;

/* loaded from: classes6.dex */
public class SubsequentMessage extends ASN1Integer {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    private SubsequentMessage(int i11) {
        super(i11);
    }

    public static SubsequentMessage valueOf(int i11) {
        if (i11 == 0) {
            return encrCert;
        }
        if (i11 == 1) {
            return challengeResp;
        }
        throw new IllegalArgumentException("unknown value: " + i11);
    }
}