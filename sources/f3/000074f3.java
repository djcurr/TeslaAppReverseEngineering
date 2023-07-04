package ia;

import android.net.Uri;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class b {
    public static boolean a(Uri uri) {
        return b(uri) && !e(uri);
    }

    public static boolean b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return b(uri) && e(uri);
    }

    public static boolean d(int i11, int i12) {
        return i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && i11 <= 512 && i12 <= 384;
    }

    private static boolean e(Uri uri) {
        return uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
    }
}