package yw;

import ezvcard.parameter.ImageType;
import ezvcard.property.Photo;

/* loaded from: classes5.dex */
public class k0 extends v<Photo> {
    public k0() {
        super(Photo.class, "PHOTO");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: v */
    public Photo l(String str, ImageType imageType) {
        return new Photo(str, imageType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: w */
    public Photo m(byte[] bArr, ImageType imageType) {
        return new Photo(bArr, imageType);
    }
}