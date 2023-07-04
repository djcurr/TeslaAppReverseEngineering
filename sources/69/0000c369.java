package yw;

import ezvcard.parameter.ImageType;
import ezvcard.property.Logo;

/* loaded from: classes5.dex */
public class d0 extends v<Logo> {
    public d0() {
        super(Logo.class, "LOGO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: v */
    public Logo l(String str, ImageType imageType) {
        return new Logo(str, imageType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: w */
    public Logo m(byte[] bArr, ImageType imageType) {
        return new Logo(bArr, imageType);
    }
}