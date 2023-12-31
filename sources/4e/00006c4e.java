package ezvcard.property;

import ezvcard.parameter.ImageType;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class Photo extends ImageProperty {
    public Photo(String str, ImageType imageType) {
        super(str, imageType);
    }

    public Photo(byte[] bArr, ImageType imageType) {
        super(bArr, imageType);
    }

    @Override // ezvcard.property.VCardProperty
    public Photo copy() {
        return new Photo(this);
    }

    public Photo(InputStream inputStream, ImageType imageType) {
        super(inputStream, imageType);
    }

    public Photo(File file, ImageType imageType) {
        super(file, imageType);
    }

    public Photo(Photo photo) {
        super(photo);
    }
}