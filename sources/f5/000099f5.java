package org.spongycastle.cert.cmp;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.DEROutputStream;

/* loaded from: classes5.dex */
class CMPUtil {
    CMPUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void derEncodeToStream(ASN1Encodable aSN1Encodable, OutputStream outputStream) {
        DEROutputStream dEROutputStream = new DEROutputStream(outputStream);
        try {
            dEROutputStream.writeObject(aSN1Encodable);
            dEROutputStream.close();
        } catch (IOException e11) {
            throw new CMPRuntimeException("unable to DER encode object: " + e11.getMessage(), e11);
        }
    }
}