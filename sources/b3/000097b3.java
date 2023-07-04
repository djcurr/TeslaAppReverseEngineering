package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes6.dex */
public class BERTaggedObjectParser implements ASN1TaggedObjectParser {
    private boolean _constructed;
    private ASN1StreamParser _parser;
    private int _tagNumber;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BERTaggedObjectParser(boolean z11, int i11, ASN1StreamParser aSN1StreamParser) {
        this._constructed = z11;
        this._tagNumber = i11;
        this._parser = aSN1StreamParser;
    }

    @Override // org.spongycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return this._parser.readTaggedObject(this._constructed, this._tagNumber);
    }

    @Override // org.spongycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable getObjectParser(int i11, boolean z11) {
        if (z11) {
            if (this._constructed) {
                return this._parser.readObject();
            }
            throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
        }
        return this._parser.readImplicit(this._constructed, i11);
    }

    @Override // org.spongycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return this._tagNumber;
    }

    public boolean isConstructed() {
        return this._constructed;
    }

    @Override // org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException(e11.getMessage());
        }
    }
}