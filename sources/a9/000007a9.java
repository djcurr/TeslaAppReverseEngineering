package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f5251a;

    /* renamed from: b  reason: collision with root package name */
    public int f5252b;

    /* renamed from: c  reason: collision with root package name */
    public int f5253c;

    /* renamed from: d  reason: collision with root package name */
    public int f5254d;

    /* loaded from: classes.dex */
    static class a implements AudioAttributesImpl.a {

        /* renamed from: a  reason: collision with root package name */
        private int f5255a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f5256b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f5257c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f5258d = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private a b(int i11) {
            switch (i11) {
                case 0:
                    this.f5256b = 1;
                    break;
                case 1:
                    this.f5256b = 4;
                    break;
                case 2:
                    this.f5256b = 4;
                    break;
                case 3:
                    this.f5256b = 2;
                    break;
                case 4:
                    this.f5256b = 4;
                    break;
                case 5:
                    this.f5256b = 4;
                    break;
                case 6:
                    this.f5256b = 1;
                    this.f5257c |= 4;
                    break;
                case 7:
                    this.f5257c = 1 | this.f5257c;
                    this.f5256b = 4;
                    break;
                case 8:
                    this.f5256b = 4;
                    break;
                case 9:
                    this.f5256b = 4;
                    break;
                case 10:
                    this.f5256b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i11 + " for AudioAttributesCompat");
                    break;
            }
            this.f5255a = AudioAttributesImplBase.e(i11);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f5256b, this.f5257c, this.f5255a, this.f5258d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: c */
        public a a(int i11) {
            if (i11 != 10) {
                this.f5258d = i11;
                return b(i11);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
    }

    public AudioAttributesImplBase() {
        this.f5251a = 0;
        this.f5252b = 0;
        this.f5253c = 0;
        this.f5254d = -1;
    }

    static int e(int i11) {
        switch (i11) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    public int a() {
        return this.f5252b;
    }

    public int b() {
        int i11 = this.f5253c;
        int c11 = c();
        if (c11 == 6) {
            i11 |= 4;
        } else if (c11 == 7) {
            i11 |= 1;
        }
        return i11 & 273;
    }

    public int c() {
        int i11 = this.f5254d;
        return i11 != -1 ? i11 : AudioAttributesCompat.a(false, this.f5253c, this.f5251a);
    }

    public int d() {
        return this.f5251a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f5252b == audioAttributesImplBase.a() && this.f5253c == audioAttributesImplBase.b() && this.f5251a == audioAttributesImplBase.d() && this.f5254d == audioAttributesImplBase.f5254d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5252b), Integer.valueOf(this.f5253c), Integer.valueOf(this.f5251a), Integer.valueOf(this.f5254d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f5254d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f5254d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f5251a));
        sb2.append(" content=");
        sb2.append(this.f5252b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f5253c).toUpperCase());
        return sb2.toString();
    }

    AudioAttributesImplBase(int i11, int i12, int i13, int i14) {
        this.f5251a = 0;
        this.f5252b = 0;
        this.f5253c = 0;
        this.f5254d = -1;
        this.f5252b = i11;
        this.f5253c = i12;
        this.f5251a = i13;
        this.f5254d = i14;
    }
}