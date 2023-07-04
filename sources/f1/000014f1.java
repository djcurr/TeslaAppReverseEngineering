package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class j<TranscodeType> extends com.bumptech.glide.request.a<j<TranscodeType>> {
    protected static final com.bumptech.glide.request.h DOWNLOAD_ONLY_OPTIONS = new com.bumptech.glide.request.h().diskCacheStrategy(ja.a.f33306b).priority(h.LOW).skipMemoryCache(true);
    private final Context context;
    private j<TranscodeType> errorBuilder;
    private final c glide;
    private final e glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;
    private Object model;
    private List<com.bumptech.glide.request.g<TranscodeType>> requestListeners;
    private final k requestManager;
    private Float thumbSizeMultiplier;
    private j<TranscodeType> thumbnailBuilder;
    private final Class<TranscodeType> transcodeClass;
    private l<?, ? super TranscodeType> transitionOptions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10489a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10490b;

        static {
            int[] iArr = new int[h.values().length];
            f10490b = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10490b[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10490b[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10490b[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f10489a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10489a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10489a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10489a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10489a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10489a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10489a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10489a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(c cVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = cVar;
        this.requestManager = kVar;
        this.transcodeClass = cls;
        this.context = context;
        this.transitionOptions = kVar.getDefaultTransitionOptions(cls);
        this.glideContext = cVar.k();
        initRequestListeners(kVar.getDefaultRequestListeners());
        apply((com.bumptech.glide.request.a<?>) kVar.getDefaultRequestOptions());
    }

    private com.bumptech.glide.request.d buildRequest(ya.k<TranscodeType> kVar, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        return buildRequestRecursive(new Object(), kVar, gVar, null, this.transitionOptions, aVar.getPriority(), aVar.getOverrideWidth(), aVar.getOverrideHeight(), aVar, executor);
    }

    private com.bumptech.glide.request.d buildRequestRecursive(Object obj, ya.k<TranscodeType> kVar, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.e eVar, l<?, ? super TranscodeType> lVar, h hVar, int i11, int i12, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.b bVar;
        com.bumptech.glide.request.b bVar2;
        if (this.errorBuilder != null) {
            bVar2 = new com.bumptech.glide.request.b(obj, eVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = eVar;
        }
        com.bumptech.glide.request.d buildThumbnailRequestRecursive = buildThumbnailRequestRecursive(obj, kVar, gVar, bVar2, lVar, hVar, i11, i12, aVar, executor);
        if (bVar == null) {
            return buildThumbnailRequestRecursive;
        }
        int overrideWidth = this.errorBuilder.getOverrideWidth();
        int overrideHeight = this.errorBuilder.getOverrideHeight();
        if (bb.k.t(i11, i12) && !this.errorBuilder.isValidOverride()) {
            overrideWidth = aVar.getOverrideWidth();
            overrideHeight = aVar.getOverrideHeight();
        }
        j<TranscodeType> jVar = this.errorBuilder;
        com.bumptech.glide.request.b bVar3 = bVar;
        bVar3.o(buildThumbnailRequestRecursive, jVar.buildRequestRecursive(obj, kVar, gVar, bVar3, jVar.transitionOptions, jVar.getPriority(), overrideWidth, overrideHeight, this.errorBuilder, executor));
        return bVar3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bumptech.glide.request.a] */
    private com.bumptech.glide.request.d buildThumbnailRequestRecursive(Object obj, ya.k<TranscodeType> kVar, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.e eVar, l<?, ? super TranscodeType> lVar, h hVar, int i11, int i12, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        h thumbnailPriority;
        j<TranscodeType> jVar = this.thumbnailBuilder;
        if (jVar != null) {
            if (!this.isThumbnailBuilt) {
                l<?, ? super TranscodeType> lVar2 = jVar.isDefaultTransitionOptionsSet ? lVar : jVar.transitionOptions;
                if (jVar.isPrioritySet()) {
                    thumbnailPriority = this.thumbnailBuilder.getPriority();
                } else {
                    thumbnailPriority = getThumbnailPriority(hVar);
                }
                h hVar2 = thumbnailPriority;
                int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
                int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
                if (bb.k.t(i11, i12) && !this.thumbnailBuilder.isValidOverride()) {
                    overrideWidth = aVar.getOverrideWidth();
                    overrideHeight = aVar.getOverrideHeight();
                }
                com.bumptech.glide.request.k kVar2 = new com.bumptech.glide.request.k(obj, eVar);
                com.bumptech.glide.request.d obtainRequest = obtainRequest(obj, kVar, gVar, aVar, kVar2, lVar, hVar, i11, i12, executor);
                this.isThumbnailBuilt = true;
                j<TranscodeType> jVar2 = this.thumbnailBuilder;
                com.bumptech.glide.request.d buildRequestRecursive = jVar2.buildRequestRecursive(obj, kVar, gVar, kVar2, lVar2, hVar2, overrideWidth, overrideHeight, jVar2, executor);
                this.isThumbnailBuilt = false;
                kVar2.n(obtainRequest, buildRequestRecursive);
                return kVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.thumbSizeMultiplier != null) {
            com.bumptech.glide.request.k kVar3 = new com.bumptech.glide.request.k(obj, eVar);
            kVar3.n(obtainRequest(obj, kVar, gVar, aVar, kVar3, lVar, hVar, i11, i12, executor), obtainRequest(obj, kVar, gVar, aVar.mo93clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), kVar3, lVar, getThumbnailPriority(hVar), i11, i12, executor));
            return kVar3;
        } else {
            return obtainRequest(obj, kVar, gVar, aVar, eVar, lVar, hVar, i11, i12, executor);
        }
    }

    private j<TranscodeType> cloneWithNullErrorAndThumbnail() {
        return mo93clone().error((j) null).thumbnail((j) null);
    }

    private h getThumbnailPriority(h hVar) {
        int i11 = a.f10490b[hVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3 && i11 != 4) {
                    throw new IllegalArgumentException("unknown priority: " + getPriority());
                }
                return h.IMMEDIATE;
            }
            return h.HIGH;
        }
        return h.NORMAL;
    }

    private void initRequestListeners(List<com.bumptech.glide.request.g<Object>> list) {
        for (com.bumptech.glide.request.g<Object> gVar : list) {
            addListener(gVar);
        }
    }

    private boolean isSkipMemoryCacheWithCompletePreviousRequest(com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.d dVar) {
        return !aVar.isMemoryCacheable() && dVar.isComplete();
    }

    private j<TranscodeType> loadGeneric(Object obj) {
        if (isAutoCloneEnabled()) {
            return mo93clone().loadGeneric(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return selfOrThrowIfLocked();
    }

    private com.bumptech.glide.request.d obtainRequest(Object obj, ya.k<TranscodeType> kVar, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.e eVar, l<?, ? super TranscodeType> lVar, h hVar, int i11, int i12, Executor executor) {
        Context context = this.context;
        e eVar2 = this.glideContext;
        return com.bumptech.glide.request.j.x(context, eVar2, obj, this.model, this.transcodeClass, aVar, i11, i12, hVar, kVar, gVar, this.requestListeners, eVar, eVar2.f(), lVar.b(), executor);
    }

    public j<TranscodeType> addListener(com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (isAutoCloneEnabled()) {
            return mo93clone().addListener(gVar);
        }
        if (gVar != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(gVar);
        }
        return selfOrThrowIfLocked();
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a apply(com.bumptech.glide.request.a aVar) {
        return apply((com.bumptech.glide.request.a<?>) aVar);
    }

    @Deprecated
    public <Y extends ya.k<File>> Y downloadOnly(Y y11) {
        return (Y) getDownloadOnlyRequest().into((j<File>) y11);
    }

    public j<TranscodeType> error(j<TranscodeType> jVar) {
        if (isAutoCloneEnabled()) {
            return mo93clone().error((j) jVar);
        }
        this.errorBuilder = jVar;
        return selfOrThrowIfLocked();
    }

    protected j<File> getDownloadOnlyRequest() {
        return new j(File.class, this).apply((com.bumptech.glide.request.a<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    public <Y extends ya.k<TranscodeType>> Y into(Y y11) {
        return (Y) into(y11, null, bb.e.b());
    }

    public j<TranscodeType> listener(com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (isAutoCloneEnabled()) {
            return mo93clone().listener(gVar);
        }
        this.requestListeners = null;
        return addListener(gVar);
    }

    public ya.k<TranscodeType> preload(int i11, int i12) {
        return into((j<TranscodeType>) ya.h.b(this.requestManager, i11, i12));
    }

    public com.bumptech.glide.request.c<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public j<TranscodeType> thumbnail(j<TranscodeType> jVar) {
        if (isAutoCloneEnabled()) {
            return mo93clone().thumbnail(jVar);
        }
        this.thumbnailBuilder = jVar;
        return selfOrThrowIfLocked();
    }

    public j<TranscodeType> transition(l<?, ? super TranscodeType> lVar) {
        if (isAutoCloneEnabled()) {
            return mo93clone().transition(lVar);
        }
        this.transitionOptions = (l) bb.j.d(lVar);
        this.isDefaultTransitionOptionsSet = false;
        return selfOrThrowIfLocked();
    }

    @Override // com.bumptech.glide.request.a
    public j<TranscodeType> apply(com.bumptech.glide.request.a<?> aVar) {
        bb.j.d(aVar);
        return (j) super.apply(aVar);
    }

    @Deprecated
    public com.bumptech.glide.request.c<File> downloadOnly(int i11, int i12) {
        return getDownloadOnlyRequest().submit(i11, i12);
    }

    <Y extends ya.k<TranscodeType>> Y into(Y y11, com.bumptech.glide.request.g<TranscodeType> gVar, Executor executor) {
        return (Y) into(y11, gVar, this, executor);
    }

    public com.bumptech.glide.request.c<TranscodeType> submit(int i11, int i12) {
        com.bumptech.glide.request.f fVar = new com.bumptech.glide.request.f(i11, i12);
        return (com.bumptech.glide.request.c) into(fVar, fVar, bb.e.a());
    }

    private <Y extends ya.k<TranscodeType>> Y into(Y y11, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        bb.j.d(y11);
        if (this.isModelSet) {
            com.bumptech.glide.request.d buildRequest = buildRequest(y11, gVar, aVar, executor);
            com.bumptech.glide.request.d request = y11.getRequest();
            if (buildRequest.h(request) && !isSkipMemoryCacheWithCompletePreviousRequest(aVar, request)) {
                if (!((com.bumptech.glide.request.d) bb.j.d(request)).isRunning()) {
                    request.i();
                }
                return y11;
            }
            this.requestManager.clear((ya.k<?>) y11);
            y11.setRequest(buildRequest);
            this.requestManager.track(y11, buildRequest);
            return y11;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: clone */
    public j<TranscodeType> mo93clone() {
        j<TranscodeType> jVar = (j) super.mo93clone();
        jVar.transitionOptions = (l<?, ? super TranscodeType>) jVar.transitionOptions.clone();
        if (jVar.requestListeners != null) {
            jVar.requestListeners = new ArrayList(jVar.requestListeners);
        }
        j<TranscodeType> jVar2 = jVar.thumbnailBuilder;
        if (jVar2 != null) {
            jVar.thumbnailBuilder = jVar2.mo93clone();
        }
        j<TranscodeType> jVar3 = jVar.errorBuilder;
        if (jVar3 != null) {
            jVar.errorBuilder = jVar3.mo93clone();
        }
        return jVar;
    }

    public ya.k<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public j<TranscodeType> error(Object obj) {
        if (obj == null) {
            return error((j) null);
        }
        return error((j) cloneWithNullErrorAndThumbnail().mo99load(obj));
    }

    public j<TranscodeType> thumbnail(j<TranscodeType>... jVarArr) {
        if (jVarArr != null && jVarArr.length != 0) {
            return thumbnail(Arrays.asList(jVarArr));
        }
        return thumbnail((j) null);
    }

    public j<TranscodeType> thumbnail(List<j<TranscodeType>> list) {
        j<TranscodeType> jVar = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                j<TranscodeType> jVar2 = list.get(size);
                if (jVar2 != null) {
                    jVar = jVar == null ? jVar2 : jVar2.thumbnail(jVar);
                }
            }
            return thumbnail(jVar);
        }
        return thumbnail((j) null);
    }

    @Override // 
    /* renamed from: load */
    public j<TranscodeType> mo99load(Object obj) {
        return loadGeneric(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(Class<TranscodeType> cls, j<?> jVar) {
        this(jVar.glide, jVar.requestManager, cls, jVar.context);
        this.model = jVar.model;
        this.isModelSet = jVar.isModelSet;
        apply((com.bumptech.glide.request.a<?>) jVar);
    }

    @Override // 
    /* renamed from: load */
    public j<TranscodeType> mo94load(Bitmap bitmap) {
        return loadGeneric(bitmap).apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.h.diskCacheStrategyOf(ja.a.f33305a));
    }

    @Override // 
    /* renamed from: load */
    public j<TranscodeType> mo95load(Drawable drawable) {
        return loadGeneric(drawable).apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.h.diskCacheStrategyOf(ja.a.f33305a));
    }

    @Override // 
    /* renamed from: load */
    public j<TranscodeType> mo100load(String str) {
        return loadGeneric(str);
    }

    @Override // 
    /* renamed from: load */
    public j<TranscodeType> mo96load(Uri uri) {
        return loadGeneric(uri);
    }

    public j<TranscodeType> thumbnail(float f11) {
        if (isAutoCloneEnabled()) {
            return mo93clone().thumbnail(f11);
        }
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 1.0f) {
            this.thumbSizeMultiplier = Float.valueOf(f11);
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    public ya.l<ImageView, TranscodeType> into(ImageView imageView) {
        j<TranscodeType> jVar;
        bb.k.b();
        bb.j.d(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (a.f10489a[imageView.getScaleType().ordinal()]) {
                case 1:
                    jVar = mo93clone().optionalCenterCrop();
                    break;
                case 2:
                    jVar = mo93clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    jVar = mo93clone().optionalFitCenter();
                    break;
                case 6:
                    jVar = mo93clone().optionalCenterInside();
                    break;
            }
            return (ya.l) into(this.glideContext.a(imageView, this.transcodeClass), null, jVar, bb.e.b());
        }
        jVar = this;
        return (ya.l) into(this.glideContext.a(imageView, this.transcodeClass), null, jVar, bb.e.b());
    }

    @Override // 
    /* renamed from: load */
    public j<TranscodeType> mo97load(File file) {
        return loadGeneric(file);
    }

    @Override // 
    /* renamed from: load */
    public j<TranscodeType> mo98load(Integer num) {
        return loadGeneric(num).apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.h.signatureOf(ab.a.c(this.context)));
    }

    @Override // 
    @Deprecated
    /* renamed from: load */
    public j<TranscodeType> mo101load(URL url) {
        return loadGeneric(url);
    }

    @Override // 
    /* renamed from: load */
    public j<TranscodeType> mo102load(byte[] bArr) {
        j<TranscodeType> loadGeneric = loadGeneric(bArr);
        if (!loadGeneric.isDiskCacheStrategySet()) {
            loadGeneric = loadGeneric.apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.h.diskCacheStrategyOf(ja.a.f33305a));
        }
        return !loadGeneric.isSkipMemoryCacheSet() ? loadGeneric.apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.h.skipMemoryCacheOf(true)) : loadGeneric;
    }

    @Deprecated
    public com.bumptech.glide.request.c<TranscodeType> into(int i11, int i12) {
        return submit(i11, i12);
    }
}