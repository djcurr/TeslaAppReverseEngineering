package org.spongycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes5.dex */
public class PKCS7TypedStream extends CMSTypedStream {
    private final ASN1Encodable content;

    public PKCS7TypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        super(aSN1ObjectIdentifier);
        this.content = aSN1Encodable;
    }

    @Override // org.spongycastle.cms.CMSTypedStream
    public void drain() {
        getContentStream(this.content);
    }

    public ASN1Encodable getContent() {
        return this.content;
    }

    @Override // org.spongycastle.cms.CMSTypedStream
    public InputStream getContentStream() {
        try {
            return getContentStream(this.content);
        } catch (IOException e11) {
            throw new CMSRuntimeException("unable to convert content to stream: " + e11.getMessage(), e11);
        }
    }

    private InputStream getContentStream(ASN1Encodable aSN1Encodable) {
        byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        int i11 = 1;
        while ((encoded[i11] & 255) > 127) {
            i11++;
        }
        int i12 = i11 + 1;
        return new ByteArrayInputStream(encoded, i12, encoded.length - i12);
    }
}