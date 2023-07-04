package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.request.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private static final int DISK_CACHE_STRATEGY = 4;
    private static final int ERROR_ID = 32;
    private static final int ERROR_PLACEHOLDER = 16;
    private static final int FALLBACK = 8192;
    private static final int FALLBACK_ID = 16384;
    private static final int IS_CACHEABLE = 256;
    private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    private static final int OVERRIDE = 512;
    private static final int PLACEHOLDER = 64;
    private static final int PLACEHOLDER_ID = 128;
    private static final int PRIORITY = 8;
    private static final int RESOURCE_CLASS = 4096;
    private static final int SIGNATURE = 1024;
    private static final int SIZE_MULTIPLIER = 2;
    private static final int THEME = 32768;
    private static final int TRANSFORMATION = 2048;
    private static final int TRANSFORMATION_ALLOWED = 65536;
    private static final int TRANSFORMATION_REQUIRED = 131072;
    private static final int UNSET = -1;
    private static final int USE_ANIMATION_POOL = 1048576;
    private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    private int errorId;
    private Drawable errorPlaceholder;
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isLocked;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;
    private Drawable placeholderDrawable;
    private int placeholderId;
    private Resources.Theme theme;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;
    private float sizeMultiplier = 1.0f;
    private ja.a diskCacheStrategy = ja.a.f33307c;
    private com.bumptech.glide.h priority = com.bumptech.glide.h.NORMAL;
    private boolean isCacheable = true;
    private int overrideHeight = -1;
    private int overrideWidth = -1;
    private ha.b signature = ab.c.c();
    private boolean isTransformationAllowed = true;
    private ha.e options = new ha.e();
    private Map<Class<?>, ha.h<?>> transformations = new bb.b();
    private Class<?> resourceClass = Object.class;
    private boolean isScaleOnlyOrNoTransform = true;

    private boolean isSet(int i11) {
        return isSet(this.fields, i11);
    }

    private static boolean isSet(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    private T optionalScaleOnlyTransform(l lVar, ha.h<Bitmap> hVar) {
        return scaleOnlyTransform(lVar, hVar, false);
    }

    private T scaleOnlyTransform(l lVar, ha.h<Bitmap> hVar) {
        return scaleOnlyTransform(lVar, hVar, true);
    }

    private T self() {
        return this;
    }

    public T apply(a<?> aVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().apply(aVar);
        }
        if (isSet(aVar.fields, 2)) {
            this.sizeMultiplier = aVar.sizeMultiplier;
        }
        if (isSet(aVar.fields, 262144)) {
            this.useUnlimitedSourceGeneratorsPool = aVar.useUnlimitedSourceGeneratorsPool;
        }
        if (isSet(aVar.fields, 1048576)) {
            this.useAnimationPool = aVar.useAnimationPool;
        }
        if (isSet(aVar.fields, 4)) {
            this.diskCacheStrategy = aVar.diskCacheStrategy;
        }
        if (isSet(aVar.fields, 8)) {
            this.priority = aVar.priority;
        }
        if (isSet(aVar.fields, 16)) {
            this.errorPlaceholder = aVar.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (isSet(aVar.fields, 32)) {
            this.errorId = aVar.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (isSet(aVar.fields, 64)) {
            this.placeholderDrawable = aVar.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (isSet(aVar.fields, 128)) {
            this.placeholderId = aVar.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (isSet(aVar.fields, 256)) {
            this.isCacheable = aVar.isCacheable;
        }
        if (isSet(aVar.fields, 512)) {
            this.overrideWidth = aVar.overrideWidth;
            this.overrideHeight = aVar.overrideHeight;
        }
        if (isSet(aVar.fields, 1024)) {
            this.signature = aVar.signature;
        }
        if (isSet(aVar.fields, 4096)) {
            this.resourceClass = aVar.resourceClass;
        }
        if (isSet(aVar.fields, 8192)) {
            this.fallbackDrawable = aVar.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (isSet(aVar.fields, 16384)) {
            this.fallbackId = aVar.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (isSet(aVar.fields, 32768)) {
            this.theme = aVar.theme;
        }
        if (isSet(aVar.fields, 65536)) {
            this.isTransformationAllowed = aVar.isTransformationAllowed;
        }
        if (isSet(aVar.fields, 131072)) {
            this.isTransformationRequired = aVar.isTransformationRequired;
        }
        if (isSet(aVar.fields, 2048)) {
            this.transformations.putAll(aVar.transformations);
            this.isScaleOnlyOrNoTransform = aVar.isScaleOnlyOrNoTransform;
        }
        if (isSet(aVar.fields, 524288)) {
            this.onlyRetrieveFromCache = aVar.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i11 = this.fields & (-2049);
            this.fields = i11;
            this.isTransformationRequired = false;
            this.fields = i11 & (-131073);
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= aVar.fields;
        this.options.d(aVar.options);
        return selfOrThrowIfLocked();
    }

    public T autoClone() {
        if (this.isLocked && !this.isAutoCloneEnabled) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.isAutoCloneEnabled = true;
        return lock();
    }

    public T centerCrop() {
        return transform(l.f10766c, new com.bumptech.glide.load.resource.bitmap.i());
    }

    public T centerInside() {
        return scaleOnlyTransform(l.f10765b, new com.bumptech.glide.load.resource.bitmap.j());
    }

    public T circleCrop() {
        return transform(l.f10765b, new com.bumptech.glide.load.resource.bitmap.k());
    }

    public T decode(Class<?> cls) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().decode(cls);
        }
        this.resourceClass = (Class) bb.j.d(cls);
        this.fields |= 4096;
        return selfOrThrowIfLocked();
    }

    public T disallowHardwareConfig() {
        return set(m.f10774i, Boolean.FALSE);
    }

    public T diskCacheStrategy(ja.a aVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().diskCacheStrategy(aVar);
        }
        this.diskCacheStrategy = (ja.a) bb.j.d(aVar);
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    public T dontAnimate() {
        return set(ta.i.f51858b, Boolean.TRUE);
    }

    public T dontTransform() {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().dontTransform();
        }
        this.transformations.clear();
        int i11 = this.fields & (-2049);
        this.fields = i11;
        this.isTransformationRequired = false;
        int i12 = i11 & (-131073);
        this.fields = i12;
        this.isTransformationAllowed = false;
        this.fields = i12 | 65536;
        this.isScaleOnlyOrNoTransform = true;
        return selfOrThrowIfLocked();
    }

    public T downsample(l lVar) {
        return set(l.f10769f, bb.j.d(lVar));
    }

    public T encodeFormat(Bitmap.CompressFormat compressFormat) {
        return set(com.bumptech.glide.load.resource.bitmap.c.f10754c, bb.j.d(compressFormat));
    }

    public T encodeQuality(int i11) {
        return set(com.bumptech.glide.load.resource.bitmap.c.f10753b, Integer.valueOf(i11));
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return Float.compare(aVar.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == aVar.errorId && bb.k.d(this.errorPlaceholder, aVar.errorPlaceholder) && this.placeholderId == aVar.placeholderId && bb.k.d(this.placeholderDrawable, aVar.placeholderDrawable) && this.fallbackId == aVar.fallbackId && bb.k.d(this.fallbackDrawable, aVar.fallbackDrawable) && this.isCacheable == aVar.isCacheable && this.overrideHeight == aVar.overrideHeight && this.overrideWidth == aVar.overrideWidth && this.isTransformationRequired == aVar.isTransformationRequired && this.isTransformationAllowed == aVar.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == aVar.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == aVar.onlyRetrieveFromCache && this.diskCacheStrategy.equals(aVar.diskCacheStrategy) && this.priority == aVar.priority && this.options.equals(aVar.options) && this.transformations.equals(aVar.transformations) && this.resourceClass.equals(aVar.resourceClass) && bb.k.d(this.signature, aVar.signature) && bb.k.d(this.theme, aVar.theme);
        }
        return false;
    }

    public T error(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        int i11 = this.fields | 16;
        this.fields = i11;
        this.errorId = 0;
        this.fields = i11 & (-33);
        return selfOrThrowIfLocked();
    }

    public T fallback(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i11 = this.fields | 8192;
        this.fields = i11;
        this.fallbackId = 0;
        this.fields = i11 & (-16385);
        return selfOrThrowIfLocked();
    }

    public T fitCenter() {
        return scaleOnlyTransform(l.f10764a, new q());
    }

    public T format(com.bumptech.glide.load.b bVar) {
        bb.j.d(bVar);
        return (T) set(m.f10771f, bVar).set(ta.i.f51857a, bVar);
    }

    public T frame(long j11) {
        return set(b0.f10744d, Long.valueOf(j11));
    }

    public final ja.a getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    public final ha.e getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    public final com.bumptech.glide.h getPriority() {
        return this.priority;
    }

    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    public final ha.b getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    public final Resources.Theme getTheme() {
        return this.theme;
    }

    public final Map<Class<?>, ha.h<?>> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public int hashCode() {
        return bb.k.o(this.theme, bb.k.o(this.signature, bb.k.o(this.resourceClass, bb.k.o(this.transformations, bb.k.o(this.options, bb.k.o(this.priority, bb.k.o(this.diskCacheStrategy, bb.k.p(this.onlyRetrieveFromCache, bb.k.p(this.useUnlimitedSourceGeneratorsPool, bb.k.p(this.isTransformationAllowed, bb.k.p(this.isTransformationRequired, bb.k.n(this.overrideWidth, bb.k.n(this.overrideHeight, bb.k.p(this.isCacheable, bb.k.o(this.fallbackDrawable, bb.k.n(this.fallbackId, bb.k.o(this.placeholderDrawable, bb.k.n(this.placeholderId, bb.k.o(this.errorPlaceholder, bb.k.n(this.errorId, bb.k.l(this.sizeMultiplier)))))))))))))))))))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return isSet(4);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return isSet(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return isSet(256);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return isSet(2048);
    }

    public final boolean isValidOverride() {
        return bb.k.t(this.overrideWidth, this.overrideHeight);
    }

    public T lock() {
        this.isLocked = true;
        return self();
    }

    public T onlyRetrieveFromCache(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().onlyRetrieveFromCache(z11);
        }
        this.onlyRetrieveFromCache = z11;
        this.fields |= 524288;
        return selfOrThrowIfLocked();
    }

    public T optionalCenterCrop() {
        return optionalTransform(l.f10766c, new com.bumptech.glide.load.resource.bitmap.i());
    }

    public T optionalCenterInside() {
        return optionalScaleOnlyTransform(l.f10765b, new com.bumptech.glide.load.resource.bitmap.j());
    }

    public T optionalCircleCrop() {
        return optionalTransform(l.f10766c, new com.bumptech.glide.load.resource.bitmap.k());
    }

    public T optionalFitCenter() {
        return optionalScaleOnlyTransform(l.f10764a, new q());
    }

    final T optionalTransform(l lVar, ha.h<Bitmap> hVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().optionalTransform(lVar, hVar);
        }
        downsample(lVar);
        return transform(hVar, false);
    }

    public T override(int i11, int i12) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().override(i11, i12);
        }
        this.overrideWidth = i11;
        this.overrideHeight = i12;
        this.fields |= 512;
        return selfOrThrowIfLocked();
    }

    public T placeholder(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        int i11 = this.fields | 64;
        this.fields = i11;
        this.placeholderId = 0;
        this.fields = i11 & (-129);
        return selfOrThrowIfLocked();
    }

    public T priority(com.bumptech.glide.h hVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().priority(hVar);
        }
        this.priority = (com.bumptech.glide.h) bb.j.d(hVar);
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T selfOrThrowIfLocked() {
        if (!this.isLocked) {
            return self();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public <Y> T set(ha.d<Y> dVar, Y y11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().set(dVar, y11);
        }
        bb.j.d(dVar);
        bb.j.d(y11);
        this.options.e(dVar, y11);
        return selfOrThrowIfLocked();
    }

    public T signature(ha.b bVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().signature(bVar);
        }
        this.signature = (ha.b) bb.j.d(bVar);
        this.fields |= 1024;
        return selfOrThrowIfLocked();
    }

    public T sizeMultiplier(float f11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().sizeMultiplier(f11);
        }
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 1.0f) {
            this.sizeMultiplier = f11;
            this.fields |= 2;
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public T skipMemoryCache(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().skipMemoryCache(true);
        }
        this.isCacheable = !z11;
        this.fields |= 256;
        return selfOrThrowIfLocked();
    }

    public T theme(Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().theme(theme);
        }
        this.theme = theme;
        this.fields |= 32768;
        return selfOrThrowIfLocked();
    }

    public T timeout(int i11) {
        return set(oa.a.f42324b, Integer.valueOf(i11));
    }

    final T transform(l lVar, ha.h<Bitmap> hVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().transform(lVar, hVar);
        }
        downsample(lVar);
        return transform(hVar);
    }

    @Deprecated
    public T transforms(Transformation<Bitmap>... transformationArr) {
        return transform((ha.h<Bitmap>) new ha.c(transformationArr), true);
    }

    public T useAnimationPool(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().useAnimationPool(z11);
        }
        this.useAnimationPool = z11;
        this.fields |= 1048576;
        return selfOrThrowIfLocked();
    }

    public T useUnlimitedSourceGeneratorsPool(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().useUnlimitedSourceGeneratorsPool(z11);
        }
        this.useUnlimitedSourceGeneratorsPool = z11;
        this.fields |= 262144;
        return selfOrThrowIfLocked();
    }

    private T scaleOnlyTransform(l lVar, ha.h<Bitmap> hVar, boolean z11) {
        T optionalTransform;
        if (z11) {
            optionalTransform = transform(lVar, hVar);
        } else {
            optionalTransform = optionalTransform(lVar, hVar);
        }
        optionalTransform.isScaleOnlyOrNoTransform = true;
        return optionalTransform;
    }

    @Override // 
    /* renamed from: clone */
    public T mo93clone() {
        try {
            T t11 = (T) super.clone();
            ha.e eVar = new ha.e();
            t11.options = eVar;
            eVar.d(this.options);
            bb.b bVar = new bb.b();
            t11.transformations = bVar;
            bVar.putAll(this.transformations);
            t11.isLocked = false;
            t11.isAutoCloneEnabled = false;
            return t11;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public T optionalTransform(ha.h<Bitmap> hVar) {
        return transform(hVar, false);
    }

    public T transform(ha.h<Bitmap> hVar) {
        return transform(hVar, true);
    }

    public <Y> T optionalTransform(Class<Y> cls, ha.h<Y> hVar) {
        return transform(cls, hVar, false);
    }

    public T transform(Transformation<Bitmap>... transformationArr) {
        if (transformationArr.length > 1) {
            return transform((ha.h<Bitmap>) new ha.c(transformationArr), true);
        }
        if (transformationArr.length == 1) {
            return transform((ha.h<Bitmap>) transformationArr[0]);
        }
        return selfOrThrowIfLocked();
    }

    public T override(int i11) {
        return override(i11, i11);
    }

    public T error(int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().error(i11);
        }
        this.errorId = i11;
        int i12 = this.fields | 32;
        this.fields = i12;
        this.errorPlaceholder = null;
        this.fields = i12 & (-17);
        return selfOrThrowIfLocked();
    }

    public T fallback(int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().fallback(i11);
        }
        this.fallbackId = i11;
        int i12 = this.fields | 16384;
        this.fields = i12;
        this.fallbackDrawable = null;
        this.fields = i12 & (-8193);
        return selfOrThrowIfLocked();
    }

    public T placeholder(int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().placeholder(i11);
        }
        this.placeholderId = i11;
        int i12 = this.fields | 128;
        this.fields = i12;
        this.placeholderDrawable = null;
        this.fields = i12 & (-65);
        return selfOrThrowIfLocked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    T transform(ha.h<Bitmap> hVar, boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().transform(hVar, z11);
        }
        o oVar = new o(hVar, z11);
        transform(Bitmap.class, hVar, z11);
        transform(Drawable.class, oVar, z11);
        transform(BitmapDrawable.class, oVar.c(), z11);
        transform(ta.c.class, new ta.f(hVar), z11);
        return selfOrThrowIfLocked();
    }

    <Y> T transform(Class<Y> cls, ha.h<Y> hVar, boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo93clone().transform(cls, hVar, z11);
        }
        bb.j.d(cls);
        bb.j.d(hVar);
        this.transformations.put(cls, hVar);
        int i11 = this.fields | 2048;
        this.fields = i11;
        this.isTransformationAllowed = true;
        int i12 = i11 | 65536;
        this.fields = i12;
        this.isScaleOnlyOrNoTransform = false;
        if (z11) {
            this.fields = i12 | 131072;
            this.isTransformationRequired = true;
        }
        return selfOrThrowIfLocked();
    }

    public <Y> T transform(Class<Y> cls, ha.h<Y> hVar) {
        return transform(cls, hVar, true);
    }
}