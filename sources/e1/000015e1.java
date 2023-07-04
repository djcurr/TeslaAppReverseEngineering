package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import com.bumptech.glide.request.g;
import com.bumptech.glide.request.h;
import java.io.File;
import java.net.URL;
import va.l;
import va.q;

/* loaded from: classes.dex */
public class GlideRequests extends k {
    public GlideRequests(c cVar, l lVar, q qVar, Context context) {
        super(cVar, lVar, qVar, context);
    }

    @Override // com.bumptech.glide.k
    public /* bridge */ /* synthetic */ k addDefaultRequestListener(g gVar) {
        return addDefaultRequestListener((g<Object>) gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.k
    public void setRequestOptions(h hVar) {
        if (hVar instanceof GlideOptions) {
            super.setRequestOptions(hVar);
        } else {
            super.setRequestOptions(new GlideOptions().apply2((com.bumptech.glide.request.a<?>) hVar));
        }
    }

    @Override // com.bumptech.glide.k
    public GlideRequests addDefaultRequestListener(g<Object> gVar) {
        return (GlideRequests) super.addDefaultRequestListener(gVar);
    }

    @Override // com.bumptech.glide.k
    public synchronized GlideRequests applyDefaultRequestOptions(h hVar) {
        return (GlideRequests) super.applyDefaultRequestOptions(hVar);
    }

    @Override // com.bumptech.glide.k
    public <ResourceType> GlideRequest<ResourceType> as(Class<ResourceType> cls) {
        return new GlideRequest<>(this.glide, this, cls, this.context);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Bitmap> asBitmap() {
        return (GlideRequest) super.asBitmap();
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> asDrawable() {
        return (GlideRequest) super.asDrawable();
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<File> asFile() {
        return (GlideRequest) super.asFile();
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<ta.c> asGif() {
        return (GlideRequest) super.asGif();
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<File> download(Object obj) {
        return (GlideRequest) super.download(obj);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<File> downloadOnly() {
        return (GlideRequest) super.downloadOnly();
    }

    @Override // com.bumptech.glide.k
    public synchronized GlideRequests setDefaultRequestOptions(h hVar) {
        return (GlideRequests) super.setDefaultRequestOptions(hVar);
    }

    @Override // com.bumptech.glide.k
    /* renamed from: load */
    public GlideRequest<Drawable> mo103load(Bitmap bitmap) {
        return (GlideRequest) super.mo103load(bitmap);
    }

    @Override // com.bumptech.glide.k
    /* renamed from: load */
    public GlideRequest<Drawable> mo104load(Drawable drawable) {
        return (GlideRequest) super.mo104load(drawable);
    }

    @Override // com.bumptech.glide.k
    /* renamed from: load */
    public GlideRequest<Drawable> mo109load(String str) {
        return (GlideRequest) super.mo109load(str);
    }

    @Override // com.bumptech.glide.k
    /* renamed from: load */
    public GlideRequest<Drawable> mo105load(Uri uri) {
        return (GlideRequest) super.mo105load(uri);
    }

    @Override // com.bumptech.glide.k
    /* renamed from: load */
    public GlideRequest<Drawable> mo106load(File file) {
        return (GlideRequest) super.mo106load(file);
    }

    @Override // com.bumptech.glide.k
    /* renamed from: load */
    public GlideRequest<Drawable> mo107load(Integer num) {
        return (GlideRequest) super.mo107load(num);
    }

    @Override // com.bumptech.glide.k
    @Deprecated
    /* renamed from: load */
    public GlideRequest<Drawable> mo110load(URL url) {
        return (GlideRequest) super.mo110load(url);
    }

    @Override // com.bumptech.glide.k
    /* renamed from: load */
    public GlideRequest<Drawable> mo111load(byte[] bArr) {
        return (GlideRequest) super.mo111load(bArr);
    }

    @Override // com.bumptech.glide.k
    /* renamed from: load */
    public GlideRequest<Drawable> mo108load(Object obj) {
        return (GlideRequest) super.mo108load(obj);
    }
}