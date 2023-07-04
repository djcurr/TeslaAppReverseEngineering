package org.spongycastle.tsp.cms;

import java.net.URI;
import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DERUTF8String;
import org.spongycastle.asn1.cms.Attributes;
import org.spongycastle.asn1.cms.MetaData;
import org.spongycastle.operator.DigestCalculator;

/* loaded from: classes4.dex */
public class CMSTimeStampedGenerator {
    protected URI dataUri;
    protected MetaData metaData;

    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) {
        new MetaDataUtil(this.metaData).initialiseMessageImprintDigestCalculator(digestCalculator);
    }

    public void setDataUri(URI uri) {
        this.dataUri = uri;
    }

    public void setMetaData(boolean z11, String str, String str2) {
        setMetaData(z11, str, str2, (Attributes) null);
    }

    public void setMetaData(boolean z11, String str, String str2, Attributes attributes) {
        setMetaData(z11, str != null ? new DERUTF8String(str) : null, str2 != null ? new DERIA5String(str2) : null, attributes);
    }

    private void setMetaData(boolean z11, DERUTF8String dERUTF8String, DERIA5String dERIA5String, Attributes attributes) {
        this.metaData = new MetaData(ASN1Boolean.getInstance(z11), dERUTF8String, dERIA5String, attributes);
    }
}