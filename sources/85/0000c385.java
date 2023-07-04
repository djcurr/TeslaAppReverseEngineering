package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.RawProperty;

/* loaded from: classes5.dex */
public class o0 extends g1<RawProperty> {
    public o0(String str) {
        super(RawProperty.class, str);
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public RawProperty b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        RawProperty rawProperty = new RawProperty(this.f59906b, str);
        rawProperty.setDataType(vCardDataType);
        return rawProperty;
    }
}