package org.spongycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1SequenceParser;
import org.spongycastle.asn1.ASN1StreamParser;
import org.spongycastle.asn1.cms.ContentInfoParser;

/* loaded from: classes5.dex */
public class CMSContentInfoParser {
    protected ContentInfoParser _contentInfo;
    protected InputStream _data;

    /* JADX INFO: Access modifiers changed from: protected */
    public CMSContentInfoParser(InputStream inputStream) {
        this._data = inputStream;
        try {
            this._contentInfo = new ContentInfoParser((ASN1SequenceParser) new ASN1StreamParser(inputStream).readObject());
        } catch (IOException e11) {
            throw new CMSException("IOException reading content.", e11);
        } catch (ClassCastException e12) {
            throw new CMSException("Unexpected object reading content.", e12);
        }
    }

    public void close() {
        this._data.close();
    }
}