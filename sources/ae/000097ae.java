package org.spongycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes6.dex */
public class BERSequenceGenerator extends BERGenerator {
    public BERSequenceGenerator(OutputStream outputStream) {
        super(outputStream);
        writeBERHeader(48);
    }

    public void addObject(ASN1Encodable aSN1Encodable) {
        aSN1Encodable.toASN1Primitive().encode(new BEROutputStream(this._out));
    }

    public void close() {
        writeBEREnd();
    }

    public BERSequenceGenerator(OutputStream outputStream, int i11, boolean z11) {
        super(outputStream, i11, z11);
        writeBERHeader(48);
    }
}