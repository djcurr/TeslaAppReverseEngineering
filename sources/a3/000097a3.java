package org.spongycastle.asn1;

import java.io.IOException;

/* loaded from: classes6.dex */
public class BERApplicationSpecificParser implements ASN1ApplicationSpecificParser {
    private final ASN1StreamParser parser;
    private final int tag;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BERApplicationSpecificParser(int i11, ASN1StreamParser aSN1StreamParser) {
        this.tag = i11;
        this.parser = aSN1StreamParser;
    }

    @Override // org.spongycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return new BERApplicationSpecific(this.tag, this.parser.readVector());
    }

    @Override // org.spongycastle.asn1.ASN1ApplicationSpecificParser
    public ASN1Encodable readObject() {
        return this.parser.readObject();
    }

    @Override // org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e11) {
            throw new ASN1ParsingException(e11.getMessage(), e11);
        }
    }
}