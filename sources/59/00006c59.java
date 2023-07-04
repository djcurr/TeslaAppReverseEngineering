package ezvcard.property;

import ezvcard.parameter.SoundType;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class Sound extends BinaryProperty<SoundType> {
    public Sound(String str, SoundType soundType) {
        super(str, soundType);
    }

    @Override // ezvcard.property.VCardProperty
    public String getLanguage() {
        return super.getLanguage();
    }

    @Override // ezvcard.property.VCardProperty
    public void setLanguage(String str) {
        super.setLanguage(str);
    }

    public Sound(byte[] bArr, SoundType soundType) {
        super(bArr, soundType);
    }

    @Override // ezvcard.property.VCardProperty
    public Sound copy() {
        return new Sound(this);
    }

    public Sound(InputStream inputStream, SoundType soundType) {
        super(inputStream, soundType);
    }

    public Sound(File file, SoundType soundType) {
        super(file, soundType);
    }

    public Sound(Sound sound) {
        super(sound);
    }
}