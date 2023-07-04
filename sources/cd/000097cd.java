package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
public class DERSequenceGenerator extends DERGenerator {
    private final ByteArrayOutputStream _bOut;

    public DERSequenceGenerator(OutputStream outputStream) {
        super(outputStream);
        this._bOut = new ByteArrayOutputStream();
    }

    public void addObject(ASN1Encodable aSN1Encodable) {
        aSN1Encodable.toASN1Primitive().encode(new DEROutputStream(this._bOut));
    }

    public void close() {
        writeDEREncoded(48, this._bOut.toByteArray());
    }

    @Override // org.spongycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._bOut;
    }

    public DERSequenceGenerator(OutputStream outputStream, int i11, boolean z11) {
        super(outputStream, i11, z11);
        this._bOut = new ByteArrayOutputStream();
    }
}