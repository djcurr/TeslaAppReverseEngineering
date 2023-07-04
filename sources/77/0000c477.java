package z5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class u {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap b(b6.h hVar) {
        Drawable a11 = hVar.a();
        if (!(a11 instanceof BitmapDrawable)) {
            a11 = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) a11;
        if (bitmapDrawable != null) {
            return bitmapDrawable.getBitmap();
        }
        return null;
    }
}