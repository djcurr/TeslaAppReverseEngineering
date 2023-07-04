package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.request.g;
import ha.d;
import ha.h;
import java.io.File;
import java.net.URL;
import java.util.List;

/* loaded from: classes.dex */
public class GlideRequest<TranscodeType> extends j<TranscodeType> {
    GlideRequest(Class<TranscodeType> cls, j<?> jVar) {
        super(cls, jVar);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ j apply(com.bumptech.glide.request.a aVar) {
        return apply((com.bumptech.glide.request.a<?>) aVar);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a decode(Class cls) {
        return decode((Class<?>) cls);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a optionalTransform(h hVar) {
        return optionalTransform((h<Bitmap>) hVar);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a set(d dVar, Object obj) {
        return set((d<d>) dVar, (d) obj);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a transform(h hVar) {
        return transform((h<Bitmap>) hVar);
    }

    @Override // com.bumptech.glide.request.a
    @Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a transforms(h[] hVarArr) {
        return transforms((Transformation<Bitmap>[]) hVarArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GlideRequest(c cVar, k kVar, Class<TranscodeType> cls, Context context) {
        super(cVar, kVar, cls, context);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> addListener(g<TranscodeType> gVar) {
        return (GlideRequest) super.addListener((g) gVar);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a apply(com.bumptech.glide.request.a aVar) {
        return apply((com.bumptech.glide.request.a<?>) aVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> autoClone() {
        return (GlideRequest) super.autoClone();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> centerCrop() {
        return (GlideRequest) super.centerCrop();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> centerInside() {
        return (GlideRequest) super.centerInside();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> circleCrop() {
        return (GlideRequest) super.circleCrop();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> decode(Class<?> cls) {
        return (GlideRequest) super.decode(cls);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> disallowHardwareConfig() {
        return (GlideRequest) super.disallowHardwareConfig();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> diskCacheStrategy(ja.a aVar) {
        return (GlideRequest) super.diskCacheStrategy(aVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> dontAnimate() {
        return (GlideRequest) super.dontAnimate();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> dontTransform() {
        return (GlideRequest) super.dontTransform();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> downsample(l lVar) {
        return (GlideRequest) super.downsample(lVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> encodeFormat(Bitmap.CompressFormat compressFormat) {
        return (GlideRequest) super.encodeFormat(compressFormat);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> encodeQuality(int i11) {
        return (GlideRequest) super.encodeQuality(i11);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> fitCenter() {
        return (GlideRequest) super.fitCenter();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> format(com.bumptech.glide.load.b bVar) {
        return (GlideRequest) super.format(bVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> frame(long j11) {
        return (GlideRequest) super.frame(j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.j
    public GlideRequest<File> getDownloadOnlyRequest() {
        return new GlideRequest(File.class, this).apply((com.bumptech.glide.request.a<?>) j.DOWNLOAD_ONLY_OPTIONS);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> listener(g<TranscodeType> gVar) {
        return (GlideRequest) super.listener((g) gVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> lock() {
        return (GlideRequest) super.lock();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean z11) {
        return (GlideRequest) super.onlyRetrieveFromCache(z11);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> optionalCenterCrop() {
        return (GlideRequest) super.optionalCenterCrop();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> optionalCenterInside() {
        return (GlideRequest) super.optionalCenterInside();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> optionalCircleCrop() {
        return (GlideRequest) super.optionalCircleCrop();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> optionalFitCenter() {
        return (GlideRequest) super.optionalFitCenter();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> priority(com.bumptech.glide.h hVar) {
        return (GlideRequest) super.priority(hVar);
    }

    @Override // com.bumptech.glide.request.a
    public <Y> GlideRequest<TranscodeType> set(d<Y> dVar, Y y11) {
        return (GlideRequest) super.set((d<d<Y>>) dVar, (d<Y>) y11);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> signature(ha.b bVar) {
        return (GlideRequest) super.signature(bVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> sizeMultiplier(float f11) {
        return (GlideRequest) super.sizeMultiplier(f11);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> skipMemoryCache(boolean z11) {
        return (GlideRequest) super.skipMemoryCache(z11);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> theme(Resources.Theme theme) {
        return (GlideRequest) super.theme(theme);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> timeout(int i11) {
        return (GlideRequest) super.timeout(i11);
    }

    @Override // com.bumptech.glide.request.a
    @Deprecated
    public GlideRequest<TranscodeType> transforms(Transformation<Bitmap>... transformationArr) {
        return (GlideRequest) super.transforms(transformationArr);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> transition(com.bumptech.glide.l<?, ? super TranscodeType> lVar) {
        return (GlideRequest) super.transition((com.bumptech.glide.l) lVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> useAnimationPool(boolean z11) {
        return (GlideRequest) super.useAnimationPool(z11);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean z11) {
        return (GlideRequest) super.useUnlimitedSourceGeneratorsPool(z11);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> apply(com.bumptech.glide.request.a<?> aVar) {
        return (GlideRequest) super.apply(aVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> fallback(Drawable drawable) {
        return (GlideRequest) super.fallback(drawable);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> optionalTransform(h<Bitmap> hVar) {
        return (GlideRequest) super.optionalTransform(hVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> override(int i11, int i12) {
        return (GlideRequest) super.override(i11, i12);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> placeholder(Drawable drawable) {
        return (GlideRequest) super.placeholder(drawable);
    }

    @Override // com.bumptech.glide.request.a
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a transform(h[] hVarArr) {
        return transform((Transformation<Bitmap>[]) hVarArr);
    }

    @Override // com.bumptech.glide.j, com.bumptech.glide.request.a
    /* renamed from: clone */
    public GlideRequest<TranscodeType> mo93clone() {
        return (GlideRequest) super.mo93clone();
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> fallback(int i11) {
        return (GlideRequest) super.fallback(i11);
    }

    @Override // com.bumptech.glide.request.a
    public <Y> GlideRequest<TranscodeType> optionalTransform(Class<Y> cls, h<Y> hVar) {
        return (GlideRequest) super.optionalTransform((Class) cls, (h) hVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> override(int i11) {
        return (GlideRequest) super.override(i11);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> placeholder(int i11) {
        return (GlideRequest) super.placeholder(i11);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> transform(h<Bitmap> hVar) {
        return (GlideRequest) super.transform(hVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> error(Drawable drawable) {
        return (GlideRequest) super.error(drawable);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> thumbnail(j<TranscodeType> jVar) {
        return (GlideRequest) super.thumbnail((j) jVar);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> transform(Transformation<Bitmap>... transformationArr) {
        return (GlideRequest) super.transform(transformationArr);
    }

    @Override // com.bumptech.glide.request.a
    public GlideRequest<TranscodeType> error(int i11) {
        return (GlideRequest) super.error(i11);
    }

    @Override // com.bumptech.glide.j
    @SafeVarargs
    public final GlideRequest<TranscodeType> thumbnail(j<TranscodeType>... jVarArr) {
        return (GlideRequest) super.thumbnail((j[]) jVarArr);
    }

    @Override // com.bumptech.glide.request.a
    public <Y> GlideRequest<TranscodeType> transform(Class<Y> cls, h<Y> hVar) {
        return (GlideRequest) super.transform((Class) cls, (h) hVar);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> error(j<TranscodeType> jVar) {
        return (GlideRequest) super.error((j) jVar);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> thumbnail(List<j<TranscodeType>> list) {
        return (GlideRequest) super.thumbnail((List) list);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> error(Object obj) {
        return (GlideRequest) super.error(obj);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> thumbnail(float f11) {
        return (GlideRequest) super.thumbnail(f11);
    }

    @Override // com.bumptech.glide.j
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo99load(Object obj) {
        return (GlideRequest) super.mo99load(obj);
    }

    @Override // com.bumptech.glide.j
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo94load(Bitmap bitmap) {
        return (GlideRequest) super.mo94load(bitmap);
    }

    @Override // com.bumptech.glide.j
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo95load(Drawable drawable) {
        return (GlideRequest) super.mo95load(drawable);
    }

    @Override // com.bumptech.glide.j
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo100load(String str) {
        return (GlideRequest) super.mo100load(str);
    }

    @Override // com.bumptech.glide.j
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo96load(Uri uri) {
        return (GlideRequest) super.mo96load(uri);
    }

    @Override // com.bumptech.glide.j
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo97load(File file) {
        return (GlideRequest) super.mo97load(file);
    }

    @Override // com.bumptech.glide.j
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo98load(Integer num) {
        return (GlideRequest) super.mo98load(num);
    }

    @Override // com.bumptech.glide.j
    @Deprecated
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo101load(URL url) {
        return (GlideRequest) super.mo101load(url);
    }

    @Override // com.bumptech.glide.j
    /* renamed from: load */
    public GlideRequest<TranscodeType> mo102load(byte[] bArr) {
        return (GlideRequest) super.mo102load(bArr);
    }
}