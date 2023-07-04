package k2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import kotlin.jvm.internal.s;
import t1.h0;

/* loaded from: classes.dex */
public final class a {
    public static final h0 a(h0.a aVar, Resources res, int i11) {
        s.g(aVar, "<this>");
        s.g(res, "res");
        Drawable drawable = res.getDrawable(i11, null);
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        s.f(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return t1.f.c(bitmap);
    }
}