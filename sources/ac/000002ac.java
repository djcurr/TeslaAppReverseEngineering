package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f1903c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f1904a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f1905b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(ProgressBar progressBar) {
        this.f1904a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable d(Drawable drawable, boolean z11) {
        if (drawable instanceof n3.c) {
            n3.c cVar = (n3.c) drawable;
            Drawable a11 = cVar.a();
            if (a11 != null) {
                cVar.b(d(a11, z11));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                int id2 = layerDrawable.getId(i11);
                drawableArr[i11] = d(layerDrawable.getDrawable(i11), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i12 = 0; i12 < numberOfLayers; i12++) {
                layerDrawable2.setId(i12, layerDrawable.getId(i12));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1905b == null) {
                this.f1905b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z11 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    private Drawable e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                Drawable d11 = d(animationDrawable.getFrame(i11), true);
                d11.setLevel(10000);
                animationDrawable2.addFrame(d11, animationDrawable.getDuration(i11));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap b() {
        return this.f1905b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i11) {
        u0 v11 = u0.v(this.f1904a.getContext(), attributeSet, f1903c, i11, 0);
        Drawable h11 = v11.h(0);
        if (h11 != null) {
            this.f1904a.setIndeterminateDrawable(e(h11));
        }
        Drawable h12 = v11.h(1);
        if (h12 != null) {
            this.f1904a.setProgressDrawable(d(h12, false));
        }
        v11.w();
    }
}