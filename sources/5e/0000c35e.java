package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Telephone;
import ezvcard.util.TelUri;

/* loaded from: classes5.dex */
public class a1 extends g1<Telephone> {
    public a1() {
        super(Telephone.class, "TEL");
    }

    private Telephone j(String str, VCardDataType vCardDataType, ww.a aVar) {
        try {
            return new Telephone(TelUri.e(str));
        } catch (IllegalArgumentException unused) {
            if (vCardDataType == VCardDataType.f25377d) {
                aVar.a(18, new Object[0]);
            }
            return new Telephone(str);
        }
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Telephone b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        return j(ih.e.f(str), vCardDataType, aVar);
    }
}