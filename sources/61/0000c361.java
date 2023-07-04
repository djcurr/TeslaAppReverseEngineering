package yw;

import ezvcard.VCardDataType;
import ezvcard.property.Language;

/* loaded from: classes5.dex */
public class b0 extends y0<Language> {
    public b0() {
        super(Language.class, "LANG", VCardDataType.f25382i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.t0
    /* renamed from: j */
    public Language i(String str) {
        return new Language(str);
    }
}