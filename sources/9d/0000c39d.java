package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Gender;
import ezvcard.property.StructuredName;
import ih.e;

/* loaded from: classes5.dex */
public class z0 extends g1<StructuredName> {
    public z0() {
        super(StructuredName.class, Gender.NONE);
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public StructuredName b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        StructuredName structuredName = new StructuredName();
        if (aVar.d() == VCardVersion.V2_1) {
            e.a aVar2 = new e.a(str);
            structuredName.setFamily(aVar2.b());
            structuredName.setGiven(aVar2.b());
            String b11 = aVar2.b();
            if (b11 != null) {
                structuredName.getAdditionalNames().add(b11);
            }
            String b12 = aVar2.b();
            if (b12 != null) {
                structuredName.getPrefixes().add(b12);
            }
            String b13 = aVar2.b();
            if (b13 != null) {
                structuredName.getSuffixes().add(b13);
            }
        } else {
            e.b bVar = new e.b(str);
            structuredName.setFamily(bVar.c());
            structuredName.setGiven(bVar.c());
            structuredName.getAdditionalNames().addAll(bVar.b());
            structuredName.getPrefixes().addAll(bVar.b());
            structuredName.getSuffixes().addAll(bVar.b());
        }
        return structuredName;
    }
}