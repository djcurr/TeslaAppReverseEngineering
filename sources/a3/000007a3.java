package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f5248a;

    /* renamed from: b  reason: collision with root package name */
    public int f5249b;

    /* loaded from: classes.dex */
    static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        final AudioAttributes.Builder f5250a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: b */
        public a a(int i11) {
            this.f5250a.setLegacyStreamType(i11);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f5250a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.f5249b = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f5248a.equals(((AudioAttributesImplApi21) obj).f5248a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5248a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f5248a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i11) {
        this.f5249b = -1;
        this.f5248a = audioAttributes;
        this.f5249b = i11;
    }
}