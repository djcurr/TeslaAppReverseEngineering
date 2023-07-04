package ci;

import android.content.Context;
import android.media.AudioManager;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final UUID f9153a = new UUID(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f9154b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c  reason: collision with root package name */
    public static final UUID f9155c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d  reason: collision with root package name */
    public static final UUID f9156d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e  reason: collision with root package name */
    public static final UUID f9157e = new UUID(-7348484286925749626L, -6083546864340672619L);

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static String b(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static long c(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 * 1000;
    }

    public static long d(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 / 1000;
    }
}