package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public class DERApplicationSpecific extends ASN1ApplicationSpecific {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DERApplicationSpecific(boolean z11, int i11, byte[] bArr) {
        super(z11, i11, bArr);
    }

    private static byte[] getEncodedVector(ASN1EncodableVector aSN1EncodableVector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != aSN1EncodableVector.size(); i11++) {
            try {
                byteArrayOutputStream.write(((ASN1Object) aSN1EncodableVector.get(i11)).getEncoded(ASN1Encoding.DER));
            } catch (IOException e11) {
                throw new ASN1ParsingException("malformed object: " + e11, e11);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] getEncoding(boolean z11, ASN1Encodable aSN1Encodable) {
        byte[] encoded = aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        if (z11) {
            return encoded;
        }
        int lengthOfHeader = ASN1ApplicationSpecific.getLengthOfHeader(encoded);
        int length = encoded.length - lengthOfHeader;
        byte[] bArr = new byte[length];
        System.arraycopy(encoded, lengthOfHeader, bArr, 0, length);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1ApplicationSpecific, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        aSN1OutputStream.writeEncoded(this.isConstructed ? 96 : 64, this.tag, this.octets);
    }

    public DERApplicationSpecific(int i11, byte[] bArr) {
        this(false, i11, bArr);
    }

    public DERApplicationSpecific(int i11, ASN1Encodable aSN1Encodable) {
        this(true, i11, aSN1Encodable);
    }

    public DERApplicationSpecific(boolean z11, int i11, ASN1Encodable aSN1Encodable) {
        super(z11 || aSN1Encodable.toASN1Primitive().isConstructed(), i11, getEncoding(z11, aSN1Encodable));
    }

    public DERApplicationSpecific(int i11, ASN1EncodableVector aSN1EncodableVector) {
        super(true, i11, getEncodedVector(aSN1EncodableVector));
    }
}