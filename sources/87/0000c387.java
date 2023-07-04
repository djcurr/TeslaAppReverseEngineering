package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Related;

/* loaded from: classes5.dex */
public class p0 extends g1<Related> {
    public p0() {
        super(Related.class, "RELATED");
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25377d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Related b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        String f11 = ih.e.f(str);
        Related related = new Related();
        if (vCardDataType == VCardDataType.f25378e) {
            related.setText(f11);
        } else {
            related.setUri(f11);
        }
        return related;
    }
}