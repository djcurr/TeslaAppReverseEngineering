package yw;

import ezvcard.parameter.ImageType;
import ezvcard.property.ImageProperty;

/* loaded from: classes5.dex */
public abstract class v<T extends ImageProperty> extends d<T, ImageType> {
    public v(Class<T> cls, String str) {
        super(cls, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: s */
    public ImageType i(String str) {
        return ImageType.f(null, null, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: t */
    public ImageType j(String str) {
        return ImageType.g(null, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: u */
    public ImageType k(String str) {
        return ImageType.g(str, null, null);
    }
}