package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes6.dex */
public class DERExternalParser implements ASN1Encodable, InMemoryRepresentable {
    private ASN1StreamParser _parser;

    public DERExternalParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    @Override // org.spongycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        try {
            return new DERExternal(this._parser.readVector());
        } catch (IllegalArgumentException e11) {
            throw new ASN1Exception(e11.getMessage(), e11);
        }
    }

    public ASN1Encodable readObject() {
        return this._parser.readObject();
    }

    @Override // org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException("unable to get DER object", e11);
        } catch (IllegalArgumentException e12) {
            throw new ASN1ParsingException("unable to get DER object", e12);
        }
    }
}