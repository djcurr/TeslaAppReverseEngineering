package v5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final t5.b f54066a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public g(t5.b bitmapPool) {
        s.g(bitmapPool, "bitmapPool");
        this.f54066a = bitmapPool;
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == g6.a.e(config);
    }

    private final boolean c(boolean z11, c6.g gVar, Bitmap bitmap, c6.f fVar) {
        return z11 || (gVar instanceof c6.b) || s.c(gVar, e.b(bitmap.getWidth(), bitmap.getHeight(), gVar, fVar));
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, c6.g size, c6.f scale, boolean z11) {
        s.g(drawable, "drawable");
        s.g(config, "config");
        s.g(size, "size");
        s.g(scale, "scale");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            s.f(bitmap, "bitmap");
            if (b(bitmap, config) && c(z11, size, bitmap, scale)) {
                return bitmap;
            }
        }
        int i11 = g6.e.i(drawable);
        if (i11 <= 0) {
            i11 = 512;
        }
        int d11 = g6.e.d(drawable);
        c6.c b11 = e.b(i11, d11 > 0 ? d11 : 512, size, scale);
        int a11 = b11.a();
        int b12 = b11.b();
        Bitmap c11 = this.f54066a.c(a11, b12, g6.a.e(config));
        Rect bounds = drawable.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        drawable.setBounds(0, 0, a11, b12);
        drawable.draw(new Canvas(c11));
        drawable.setBounds(i12, i13, i14, i15);
        return c11;
    }
}