package org.spongycastle.cms;

import java.io.OutputStream;
import java.util.Iterator;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;

/* loaded from: classes5.dex */
public class PKCS7ProcessableObject implements CMSTypedData {
    private final ASN1Encodable structure;
    private final ASN1ObjectIdentifier type;

    public PKCS7ProcessableObject(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.type = aSN1ObjectIdentifier;
        this.structure = aSN1Encodable;
    }

    @Override // org.spongycastle.cms.CMSProcessable
    public Object getContent() {
        return this.structure;
    }

    @Override // org.spongycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return this.type;
    }

    @Override // org.spongycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) {
        ASN1Encodable aSN1Encodable = this.structure;
        if (aSN1Encodable instanceof ASN1Sequence) {
            Iterator<ASN1Encodable> it2 = ASN1Sequence.getInstance(aSN1Encodable).iterator();
            while (it2.hasNext()) {
                outputStream.write(it2.next().toASN1Primitive().getEncoded(ASN1Encoding.DER));
            }
            return;
        }
        byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        int i11 = 1;
        while ((encoded[i11] & 255) > 127) {
            i11++;
        }
        int i12 = i11 + 1;
        outputStream.write(encoded, i12, encoded.length - i12);
    }
}