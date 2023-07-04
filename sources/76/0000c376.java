package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Xml;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class h1 extends g1<Xml> {
    public h1() {
        super(Xml.class, "XML");
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Xml b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        try {
            return new Xml(ih.e.f(str));
        } catch (SAXException unused) {
            throw new CannotParseException(21, new Object[0]);
        }
    }
}