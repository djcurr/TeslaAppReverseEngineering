package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class DEROctetStringParser implements ASN1OctetStringParser {
    private DefiniteLengthInputStream stream;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DEROctetStringParser(DefiniteLengthInputStream definiteLengthInputStream) {
        this.stream = definiteLengthInputStream;
    }

    @Override // org.spongycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return new DEROctetString(this.stream.toByteArray());
    }

    @Override // org.spongycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return this.stream;
    }

    @Override // org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e11.getMessage(), e11);
        }
    }
}