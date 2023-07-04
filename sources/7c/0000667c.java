package e0;

import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class a {
    public static ImageWriter a(Surface surface, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            return b.a(surface, i11, i12);
        }
        if (i13 >= 29) {
            return c.a(surface, i11, i12);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i13 + ". Version 26 or higher required.");
    }
}