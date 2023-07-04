package hi;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r {
    private static long a(Map<String, String> map, String str) {
        if (map != null) {
            try {
                String str2 = map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    public static Pair<Long, Long> b(DrmSession drmSession) {
        Map<String, String> g11 = drmSession.g();
        if (g11 == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(a(g11, "LicenseDurationRemaining")), Long.valueOf(a(g11, "PlaybackDurationRemaining")));
    }
}