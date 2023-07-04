package yw;

import ezvcard.parameter.SoundType;
import ezvcard.property.Sound;

/* loaded from: classes5.dex */
public class v0 extends d<Sound, SoundType> {
    public v0() {
        super(Sound.class, "SOUND");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: s */
    public SoundType i(String str) {
        return SoundType.f(null, null, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: t */
    public SoundType j(String str) {
        return SoundType.g(null, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: u */
    public SoundType k(String str) {
        return SoundType.g(str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: v */
    public Sound l(String str, SoundType soundType) {
        return new Sound(str, soundType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.d
    /* renamed from: w */
    public Sound m(byte[] bArr, SoundType soundType) {
        return new Sound(bArr, soundType);
    }
}