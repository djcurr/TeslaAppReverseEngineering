package ezvcard.parameter;

/* loaded from: classes5.dex */
public class SoundType extends MediaTypeParameter {

    /* renamed from: d  reason: collision with root package name */
    private static final b<SoundType> f25401d = new b<>(SoundType.class);

    static {
        new SoundType("AAC", "audio/aac", "aac");
        new SoundType("MIDI", "audio/midi", "mid");
        new SoundType("MP3", "audio/mp3", "mp3");
        new SoundType("MPEG", "audio/mpeg", "mpeg");
        new SoundType("OGG", "audio/ogg", "ogg");
        new SoundType("WAV", "audio/wav", "wav");
    }

    private SoundType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static SoundType f(String str, String str2, String str3) {
        return (SoundType) f25401d.d(new String[]{str, str2, str3});
    }

    public static SoundType g(String str, String str2, String str3) {
        return (SoundType) f25401d.e(new String[]{str, str2, str3});
    }
}