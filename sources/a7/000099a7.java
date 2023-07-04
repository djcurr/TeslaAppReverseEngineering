package org.spongycastle.asn1.x509;

import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERPrintableString;
import org.spongycastle.util.Strings;

/* loaded from: classes5.dex */
public abstract class X509NameEntryConverter {
    protected boolean canBePrintable(String str) {
        return DERPrintableString.isPrintableString(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Primitive convertHexEncoded(String str, int i11) {
        String lowerCase = Strings.toLowerCase(str);
        int length = (lowerCase.length() - i11) / 2;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 != length; i12++) {
            int i13 = (i12 * 2) + i11;
            char charAt = lowerCase.charAt(i13);
            char charAt2 = lowerCase.charAt(i13 + 1);
            if (charAt < 'a') {
                bArr[i12] = (byte) ((charAt - '0') << 4);
            } else {
                bArr[i12] = (byte) (((charAt - 'a') + 10) << 4);
            }
            if (charAt2 < 'a') {
                bArr[i12] = (byte) (((byte) (charAt2 - '0')) | bArr[i12]);
            } else {
                bArr[i12] = (byte) (((byte) ((charAt2 - 'a') + 10)) | bArr[i12]);
            }
        }
        return new ASN1InputStream(bArr).readObject();
    }

    public abstract ASN1Primitive getConvertedValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str);
}