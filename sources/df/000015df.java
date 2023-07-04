package com.dylanvann.fastimage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.request.h;
import ha.d;

/* loaded from: classes.dex */
public final class GlideOptions extends h {
    private static GlideOptions centerCropTransform2;
    private static GlideOptions centerInsideTransform1;
    private static GlideOptions circleCropTransform3;
    private static GlideOptions fitCenterTransform0;
    private static GlideOptions noAnimation5;
    private static GlideOptions noTransformation4;

    public static GlideOptions bitmapTransform(ha.h<Bitmap> hVar) {
        return new GlideOptions().transform2(hVar);
    }

    public static GlideOptions centerCropTransform() {
        if (centerCropTransform2 == null) {
            centerCropTransform2 = new GlideOptions().centerCrop().autoClone();
        }
        return centerCropTransform2;
    }

    public static GlideOptions centerInsideTransform() {
        if (centerInsideTransform1 == null) {
            centerInsideTransform1 = new GlideOptions().centerInside().autoClone();
        }
        return centerInsideTransform1;
    }

    public static GlideOptions circleCropTransform() {
        if (circleCropTransform3 == null) {
            circleCropTransform3 = new GlideOptions().circleCrop().autoClone();
        }
        return circleCropTransform3;
    }

    public static GlideOptions decodeTypeOf(Class<?> cls) {
        return new GlideOptions().decode2(cls);
    }

    public static GlideOptions diskCacheStrategyOf(ja.a aVar) {
        return new GlideOptions().diskCacheStrategy(aVar);
    }

    public static GlideOptions downsampleOf(l lVar) {
        return new GlideOptions().downsample(lVar);
    }

    public static GlideOptions encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        return new GlideOptions().encodeFormat(compressFormat);
    }

    public static GlideOptions encodeQualityOf(int i11) {
        return new GlideOptions().encodeQuality(i11);
    }

    public static GlideOptions errorOf(Drawable drawable) {
        return new GlideOptions().error(drawable);
    }

    public static GlideOptions fitCenterTransform() {
        if (fitCenterTransform0 == null) {
            fitCenterTransform0 = new GlideOptions().fitCenter().autoClone();
        }
        return fitCenterTransform0;
    }

    public static GlideOptions formatOf(com.bumptech.glide.load.b bVar) {
        return new GlideOptions().format(bVar);
    }

    public static GlideOptions frameOf(long j11) {
        return new GlideOptions().frame(j11);
    }

    public static GlideOptions noAnimation() {
        if (noAnimation5 == null) {
            noAnimation5 = new GlideOptions().dontAnimate().autoClone();
        }
        return noAnimation5;
    }

    public static GlideOptions noTransformation() {
        if (noTransformation4 == null) {
            noTransformation4 = new GlideOptions().dontTransform().autoClone();
        }
        return noTransformation4;
    }

    public static <T> GlideOptions option(d<T> dVar, T t11) {
        return new GlideOptions().set2((d<d<T>>) dVar, (d<T>) t11);
    }

    public static GlideOptions overrideOf(int i11, int i12) {
        return new GlideOptions().override(i11, i12);
    }

    public static GlideOptions placeholderOf(Drawable drawable) {
        return new GlideOptions().placeholder(drawable);
    }

    public static GlideOptions priorityOf(com.bumptech.glide.h hVar) {
        return new GlideOptions().priority(hVar);
    }

    public static GlideOptions signatureOf(ha.b bVar) {
        return new GlideOptions().signature(bVar);
    }

    public static GlideOptions sizeMultiplierOf(float f11) {
        return new GlideOptions().sizeMultiplier(f11);
    }

    public static GlideOptions skipMemoryCacheOf(boolean z11) {
        return new GlideOptions().skipMemoryCache(z11);
    }

    public static GlideOptions timeoutOf(int i11) {
        return new GlideOptions().timeout(i11);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ h apply(com.bumptech.glide.request.a aVar) {
        return apply2((com.bumptech.glide.request.a<?>) aVar);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ h decode(Class cls) {
        return decode2((Class<?>) cls);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ h optionalTransform(ha.h hVar) {
        return optionalTransform2((ha.h<Bitmap>) hVar);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ h set(d dVar, Object obj) {
        return set2((d<d>) dVar, (d) obj);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ h transform(ha.h hVar) {
        return transform2((ha.h<Bitmap>) hVar);
    }

    @Override // com.bumptech.glide.request.a
    @SafeVarargs
    @Deprecated
    public /* bridge */ /* synthetic */ h transforms(ha.h[] hVarArr) {
        return transforms2((Transformation<Bitmap>[]) hVarArr);
    }

    public static GlideOptions errorOf(int i11) {
        return new GlideOptions().error(i11);
    }

    public static GlideOptions overrideOf(int i11) {
        return new GlideOptions().override(i11);
    }

    public static GlideOptions placeholderOf(int i11) {
        return new GlideOptions().placeholder(i11);
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: apply  reason: avoid collision after fix types in other method */
    public h apply2(com.bumptech.glide.request.a<?> aVar) {
        return (GlideOptions) super.apply(aVar);
    }

    @Override // com.bumptech.glide.request.a
    public h autoClone() {
        return (GlideOptions) super.autoClone();
    }

    @Override // com.bumptech.glide.request.a
    public h centerCrop() {
        return (GlideOptions) super.centerCrop();
    }

    @Override // com.bumptech.glide.request.a
    public h centerInside() {
        return (GlideOptions) super.centerInside();
    }

    @Override // com.bumptech.glide.request.a
    public h circleCrop() {
        return (GlideOptions) super.circleCrop();
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: decode  reason: avoid collision after fix types in other method */
    public h decode2(Class<?> cls) {
        return (GlideOptions) super.decode(cls);
    }

    @Override // com.bumptech.glide.request.a
    public h disallowHardwareConfig() {
        return (GlideOptions) super.disallowHardwareConfig();
    }

    @Override // com.bumptech.glide.request.a
    public h diskCacheStrategy(ja.a aVar) {
        return (GlideOptions) super.diskCacheStrategy(aVar);
    }

    @Override // com.bumptech.glide.request.a
    public h dontAnimate() {
        return (GlideOptions) super.dontAnimate();
    }

    @Override // com.bumptech.glide.request.a
    public h dontTransform() {
        return (GlideOptions) super.dontTransform();
    }

    @Override // com.bumptech.glide.request.a
    public h downsample(l lVar) {
        return (GlideOptions) super.downsample(lVar);
    }

    @Override // com.bumptech.glide.request.a
    public h encodeFormat(Bitmap.CompressFormat compressFormat) {
        return (GlideOptions) super.encodeFormat(compressFormat);
    }

    @Override // com.bumptech.glide.request.a
    public h encodeQuality(int i11) {
        return (GlideOptions) super.encodeQuality(i11);
    }

    @Override // com.bumptech.glide.request.a
    public h fitCenter() {
        return (GlideOptions) super.fitCenter();
    }

    @Override // com.bumptech.glide.request.a
    public h format(com.bumptech.glide.load.b bVar) {
        return (GlideOptions) super.format(bVar);
    }

    @Override // com.bumptech.glide.request.a
    public h frame(long j11) {
        return (GlideOptions) super.frame(j11);
    }

    @Override // com.bumptech.glide.request.a
    public h lock() {
        return (GlideOptions) super.lock();
    }

    @Override // com.bumptech.glide.request.a
    public h onlyRetrieveFromCache(boolean z11) {
        return (GlideOptions) super.onlyRetrieveFromCache(z11);
    }

    @Override // com.bumptech.glide.request.a
    public h optionalCenterCrop() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    @Override // com.bumptech.glide.request.a
    public h optionalCenterInside() {
        return (GlideOptions) super.optionalCenterInside();
    }

    @Override // com.bumptech.glide.request.a
    public h optionalCircleCrop() {
        return (GlideOptions) super.optionalCircleCrop();
    }

    @Override // com.bumptech.glide.request.a
    public h optionalFitCenter() {
        return (GlideOptions) super.optionalFitCenter();
    }

    @Override // com.bumptech.glide.request.a
    public h priority(com.bumptech.glide.h hVar) {
        return (GlideOptions) super.priority(hVar);
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: set  reason: avoid collision after fix types in other method */
    public <Y> h set2(d<Y> dVar, Y y11) {
        return (GlideOptions) super.set((d<d<Y>>) dVar, (d<Y>) y11);
    }

    @Override // com.bumptech.glide.request.a
    public h signature(ha.b bVar) {
        return (GlideOptions) super.signature(bVar);
    }

    @Override // com.bumptech.glide.request.a
    public h sizeMultiplier(float f11) {
        return (GlideOptions) super.sizeMultiplier(f11);
    }

    @Override // com.bumptech.glide.request.a
    public h skipMemoryCache(boolean z11) {
        return (GlideOptions) super.skipMemoryCache(z11);
    }

    @Override // com.bumptech.glide.request.a
    public h theme(Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    @Override // com.bumptech.glide.request.a
    public h timeout(int i11) {
        return (GlideOptions) super.timeout(i11);
    }

    @Override // com.bumptech.glide.request.a
    @SafeVarargs
    @Deprecated
    /* renamed from: transforms  reason: avoid collision after fix types in other method */
    public final h transforms2(Transformation<Bitmap>... transformationArr) {
        return (GlideOptions) super.transforms(transformationArr);
    }

    @Override // com.bumptech.glide.request.a
    public h useAnimationPool(boolean z11) {
        return (GlideOptions) super.useAnimationPool(z11);
    }

    @Override // com.bumptech.glide.request.a
    public h useUnlimitedSourceGeneratorsPool(boolean z11) {
        return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(z11);
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: clone  reason: avoid collision after fix types in other method */
    public h mo93clone() {
        return (GlideOptions) super.mo93clone();
    }

    @Override // com.bumptech.glide.request.a
    public h error(Drawable drawable) {
        return (GlideOptions) super.error(drawable);
    }

    @Override // com.bumptech.glide.request.a
    public h fallback(Drawable drawable) {
        return (GlideOptions) super.fallback(drawable);
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: optionalTransform  reason: avoid collision after fix types in other method */
    public h optionalTransform2(ha.h<Bitmap> hVar) {
        return (GlideOptions) super.optionalTransform(hVar);
    }

    @Override // com.bumptech.glide.request.a
    public h override(int i11, int i12) {
        return (GlideOptions) super.override(i11, i12);
    }

    @Override // com.bumptech.glide.request.a
    public h placeholder(Drawable drawable) {
        return (GlideOptions) super.placeholder(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @SafeVarargs
    public /* bridge */ /* synthetic */ h transform(ha.h[] hVarArr) {
        return transform2((Transformation<Bitmap>[]) hVarArr);
    }

    @Override // com.bumptech.glide.request.a
    public h error(int i11) {
        return (GlideOptions) super.error(i11);
    }

    @Override // com.bumptech.glide.request.a
    public h fallback(int i11) {
        return (GlideOptions) super.fallback(i11);
    }

    @Override // com.bumptech.glide.request.a
    public <Y> h optionalTransform(Class<Y> cls, ha.h<Y> hVar) {
        return (GlideOptions) super.optionalTransform((Class) cls, (ha.h) hVar);
    }

    @Override // com.bumptech.glide.request.a
    public h override(int i11) {
        return (GlideOptions) super.override(i11);
    }

    @Override // com.bumptech.glide.request.a
    public h placeholder(int i11) {
        return (GlideOptions) super.placeholder(i11);
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: transform  reason: avoid collision after fix types in other method */
    public h transform2(ha.h<Bitmap> hVar) {
        return (GlideOptions) super.transform(hVar);
    }

    @Override // com.bumptech.glide.request.a
    @SafeVarargs
    /* renamed from: transform  reason: avoid collision after fix types in other method */
    public final h transform2(Transformation<Bitmap>... transformationArr) {
        return (GlideOptions) super.transform(transformationArr);
    }

    @Override // com.bumptech.glide.request.a
    public <Y> h transform(Class<Y> cls, ha.h<Y> hVar) {
        return (GlideOptions) super.transform((Class) cls, (ha.h) hVar);
    }
}