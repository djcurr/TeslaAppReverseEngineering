package org.spongycastle.tsp.cms;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.cms.Attributes;
import org.spongycastle.asn1.cms.MetaData;
import org.spongycastle.cms.CMSException;
import org.spongycastle.operator.DigestCalculator;

/* loaded from: classes4.dex */
class MetaDataUtil {
    private final MetaData metaData;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetaDataUtil(MetaData metaData) {
        this.metaData = metaData;
    }

    private String convertString(ASN1String aSN1String) {
        if (aSN1String != null) {
            return aSN1String.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getFileName() {
        MetaData metaData = this.metaData;
        if (metaData != null) {
            return convertString(metaData.getFileName());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getMediaType() {
        MetaData metaData = this.metaData;
        if (metaData != null) {
            return convertString(metaData.getMediaType());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Attributes getOtherMetaData() {
        MetaData metaData = this.metaData;
        if (metaData != null) {
            return metaData.getOtherMetaData();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) {
        MetaData metaData = this.metaData;
        if (metaData == null || !metaData.isHashProtected()) {
            return;
        }
        try {
            digestCalculator.getOutputStream().write(this.metaData.getEncoded(ASN1Encoding.DER));
        } catch (IOException e11) {
            throw new CMSException("unable to initialise calculator from metaData: " + e11.getMessage(), e11);
        }
    }
}