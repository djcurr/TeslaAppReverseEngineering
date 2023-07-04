package org.spongycastle.asn1;

/* loaded from: classes6.dex */
public class DERNull extends ASN1Null {
    public static final DERNull INSTANCE = new DERNull();
    private static final byte[] zeroBytes = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Null, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) {
        aSN1OutputStream.writeEncoded(5, zeroBytes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }
}