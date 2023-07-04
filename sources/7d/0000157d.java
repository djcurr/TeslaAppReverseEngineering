package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final ka.e f10784a = new a();

    /* loaded from: classes.dex */
    class a extends ka.f {
        a() {
        }

        @Override // ka.f, ka.e
        public void b(Bitmap bitmap) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ja.c<Bitmap> a(ka.e eVar, Drawable drawable, int i11, int i12) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z11 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = b(eVar, current, i11, i12);
            z11 = true;
        }
        if (!z11) {
            eVar = f10784a;
        }
        return e.d(bitmap, eVar);
    }

    private static Bitmap b(ka.e eVar, Drawable drawable, int i11, int i12) {
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i12 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        } else {
            if (drawable.getIntrinsicWidth() > 0) {
                i11 = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i12 = drawable.getIntrinsicHeight();
            }
            Lock i13 = z.i();
            i13.lock();
            Bitmap c11 = eVar.c(i11, i12, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(c11);
                drawable.setBounds(0, 0, i11, i12);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return c11;
            } finally {
                i13.unlock();
            }
        }
    }
}