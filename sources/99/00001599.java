package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.l;

/* loaded from: classes.dex */
public class h extends a<h> {
    private static h centerCropOptions;
    private static h centerInsideOptions;
    private static h circleCropOptions;
    private static h fitCenterOptions;
    private static h noAnimationOptions;
    private static h noTransformOptions;
    private static h skipMemoryCacheFalseOptions;
    private static h skipMemoryCacheTrueOptions;

    public static h bitmapTransform(ha.h<Bitmap> hVar) {
        return new h().transform(hVar);
    }

    public static h centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new h().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    public static h centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new h().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    public static h circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new h().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    public static h decodeTypeOf(Class<?> cls) {
        return new h().decode(cls);
    }

    public static h diskCacheStrategyOf(ja.a aVar) {
        return new h().diskCacheStrategy(aVar);
    }

    public static h downsampleOf(l lVar) {
        return new h().downsample(lVar);
    }

    public static h encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        return new h().encodeFormat(compressFormat);
    }

    public static h encodeQualityOf(int i11) {
        return new h().encodeQuality(i11);
    }

    public static h errorOf(Drawable drawable) {
        return new h().error(drawable);
    }

    public static h fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new h().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    public static h formatOf(com.bumptech.glide.load.b bVar) {
        return new h().format(bVar);
    }

    public static h frameOf(long j11) {
        return new h().frame(j11);
    }

    public static h noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new h().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }

    public static h noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new h().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    public static <T> h option(ha.d<T> dVar, T t11) {
        return new h().set(dVar, t11);
    }

    public static h overrideOf(int i11, int i12) {
        return new h().override(i11, i12);
    }

    public static h placeholderOf(Drawable drawable) {
        return new h().placeholder(drawable);
    }

    public static h priorityOf(com.bumptech.glide.h hVar) {
        return new h().priority(hVar);
    }

    public static h signatureOf(ha.b bVar) {
        return new h().signature(bVar);
    }

    public static h sizeMultiplierOf(float f11) {
        return new h().sizeMultiplier(f11);
    }

    public static h skipMemoryCacheOf(boolean z11) {
        if (z11) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new h().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new h().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    public static h timeoutOf(int i11) {
        return new h().timeout(i11);
    }

    public static h errorOf(int i11) {
        return new h().error(i11);
    }

    public static h overrideOf(int i11) {
        return overrideOf(i11, i11);
    }

    public static h placeholderOf(int i11) {
        return new h().placeholder(i11);
    }
}