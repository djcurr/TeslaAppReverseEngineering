package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Gender;
import ih.e;

/* loaded from: classes5.dex */
public class s extends g1<Gender> {
    public s() {
        super(Gender.class, "GENDER");
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Gender b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        e.a aVar2 = new e.a(str, 2);
        String b11 = aVar2.b();
        if (b11 != null) {
            b11 = b11.toUpperCase();
        }
        String b12 = aVar2.b();
        Gender gender = new Gender(b11);
        gender.setText(b12);
        return gender;
    }
}