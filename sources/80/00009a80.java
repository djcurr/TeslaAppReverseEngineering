package org.spongycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.cms.CompressedData;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.operator.InputExpanderProvider;
import org.spongycastle.util.Encodable;

/* loaded from: classes5.dex */
public class CMSCompressedData implements Encodable {
    CompressedData comData;
    ContentInfo contentInfo;

    public CMSCompressedData(byte[] bArr) {
        this(CMSUtils.readContentInfo(bArr));
    }

    public byte[] getContent(InputExpanderProvider inputExpanderProvider) {
        try {
            return CMSUtils.streamToByteArray(inputExpanderProvider.get(this.comData.getCompressionAlgorithmIdentifier()).getInputStream(((ASN1OctetString) this.comData.getEncapContentInfo().getContent()).getOctetStream()));
        } catch (IOException e11) {
            throw new CMSException("exception reading compressed stream.", e11);
        }
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentInfo.getContentType();
    }

    @Override // org.spongycastle.util.Encodable
    public byte[] getEncoded() {
        return this.contentInfo.getEncoded();
    }

    public ContentInfo toASN1Structure() {
        return this.contentInfo;
    }

    public CMSCompressedData(InputStream inputStream) {
        this(CMSUtils.readContentInfo(inputStream));
    }

    public CMSCompressedData(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
        try {
            this.comData = CompressedData.getInstance(contentInfo.getContent());
        } catch (ClassCastException e11) {
            throw new CMSException("Malformed content.", e11);
        } catch (IllegalArgumentException e12) {
            throw new CMSException("Malformed content.", e12);
        }
    }
}