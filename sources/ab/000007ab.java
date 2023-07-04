package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f5251a = versionedParcel.p(audioAttributesImplBase.f5251a, 1);
        audioAttributesImplBase.f5252b = versionedParcel.p(audioAttributesImplBase.f5252b, 2);
        audioAttributesImplBase.f5253c = versionedParcel.p(audioAttributesImplBase.f5253c, 3);
        audioAttributesImplBase.f5254d = versionedParcel.p(audioAttributesImplBase.f5254d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f5251a, 1);
        versionedParcel.F(audioAttributesImplBase.f5252b, 2);
        versionedParcel.F(audioAttributesImplBase.f5253c, 3);
        versionedParcel.F(audioAttributesImplBase.f5254d, 4);
    }
}