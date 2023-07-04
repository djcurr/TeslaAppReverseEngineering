package e0;

import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
final class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ImageWriter a(Surface surface, int i11, int i12) {
        return ImageWriter.newInstance(surface, i11, i12);
    }
}