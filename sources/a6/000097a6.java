package org.spongycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes6.dex */
public class BERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    /* JADX INFO: Access modifiers changed from: protected */
    public BERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    private void writeHdr(int i11) {
        this._out.write(i11);
        this._out.write(128);
    }

    @Override // org.spongycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._out;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeBEREnd() {
        this._out.write(0);
        this._out.write(0);
        if (this._tagged && this._isExplicit) {
            this._out.write(0);
            this._out.write(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeBERHeader(int i11) {
        if (this._tagged) {
            int i12 = this._tagNo | 128;
            if (this._isExplicit) {
                writeHdr(i12 | 32);
                writeHdr(i11);
                return;
            } else if ((i11 & 32) != 0) {
                writeHdr(i12 | 32);
                return;
            } else {
                writeHdr(i12);
                return;
            }
        }
        writeHdr(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BERGenerator(OutputStream outputStream, int i11, boolean z11) {
        super(outputStream);
        this._tagged = false;
        this._tagged = true;
        this._isExplicit = z11;
        this._tagNo = i11;
    }
}