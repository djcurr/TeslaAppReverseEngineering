package org.spongycastle.asn1;

import java.util.Date;

/* loaded from: classes6.dex */
public class DERUTCTime extends ASN1UTCTime {
    DERUTCTime(byte[] bArr) {
        super(bArr);
    }

    public DERUTCTime(Date date) {
        super(date);
    }

    public DERUTCTime(String str) {
        super(str);
    }
}