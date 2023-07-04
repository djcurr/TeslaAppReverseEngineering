package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import va.c;
import va.m;
import va.q;
import va.r;
import va.t;

/* loaded from: classes.dex */
public class k implements ComponentCallbacks2, m {
    private static final com.bumptech.glide.request.h DECODE_TYPE_BITMAP = com.bumptech.glide.request.h.decodeTypeOf(Bitmap.class).lock();
    private static final com.bumptech.glide.request.h DECODE_TYPE_GIF = com.bumptech.glide.request.h.decodeTypeOf(ta.c.class).lock();
    private static final com.bumptech.glide.request.h DOWNLOAD_ONLY_OPTIONS = com.bumptech.glide.request.h.diskCacheStrategyOf(ja.a.f33306b).priority(h.LOW).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private final va.c connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<com.bumptech.glide.request.g<Object>> defaultRequestListeners;
    protected final com.bumptech.glide.c glide;
    final va.l lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private com.bumptech.glide.request.h requestOptions;
    private final r requestTracker;
    private final t targetTracker;
    private final q treeNode;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.lifecycle.b(kVar);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends ya.d<View, Object> {
        b(View view) {
            super(view);
        }

        @Override // ya.d
        protected void d(Drawable drawable) {
        }

        @Override // ya.k
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // ya.k
        public void onResourceReady(Object obj, za.b<? super Object> bVar) {
        }
    }

    /* loaded from: classes.dex */
    private class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final r f10492a;

        c(r rVar) {
            this.f10492a = rVar;
        }

        @Override // va.c.a
        public void a(boolean z11) {
            if (z11) {
                synchronized (k.this) {
                    this.f10492a.f();
                }
            }
        }
    }

    public k(com.bumptech.glide.c cVar, va.l lVar, q qVar, Context context) {
        this(cVar, lVar, qVar, new r(), cVar.i(), context);
    }

    private void untrackOrDelegate(ya.k<?> kVar) {
        boolean untrack = untrack(kVar);
        com.bumptech.glide.request.d request = kVar.getRequest();
        if (untrack || this.glide.v(kVar) || request == null) {
            return;
        }
        kVar.setRequest(null);
        request.clear();
    }

    private synchronized void updateRequestOptions(com.bumptech.glide.request.h hVar) {
        this.requestOptions = this.requestOptions.apply(hVar);
    }

    public k addDefaultRequestListener(com.bumptech.glide.request.g<Object> gVar) {
        this.defaultRequestListeners.add(gVar);
        return this;
    }

    public synchronized k applyDefaultRequestOptions(com.bumptech.glide.request.h hVar) {
        updateRequestOptions(hVar);
        return this;
    }

    public <ResourceType> j<ResourceType> as(Class<ResourceType> cls) {
        return new j<>(this.glide, this, cls, this.context);
    }

    public j<Bitmap> asBitmap() {
        return as(Bitmap.class).apply((com.bumptech.glide.request.a<?>) DECODE_TYPE_BITMAP);
    }

    public j<Drawable> asDrawable() {
        return as(Drawable.class);
    }

    public j<File> asFile() {
        return as(File.class).apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.h.skipMemoryCacheOf(true));
    }

    public j<ta.c> asGif() {
        return as(ta.c.class).apply((com.bumptech.glide.request.a<?>) DECODE_TYPE_GIF);
    }

    public void clear(View view) {
        clear(new b(view));
    }

    public j<File> download(Object obj) {
        return downloadOnly().mo99load(obj);
    }

    public j<File> downloadOnly() {
        return as(File.class).apply((com.bumptech.glide.request.a<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.bumptech.glide.request.g<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized com.bumptech.glide.request.h getDefaultRequestOptions() {
        return this.requestOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> l<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.k().e(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.c();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // va.m
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        for (ya.k<?> kVar : this.targetTracker.b()) {
            clear(kVar);
        }
        this.targetTracker.a();
        this.requestTracker.b();
        this.lifecycle.a(this);
        this.lifecycle.a(this.connectivityMonitor);
        bb.k.v(this.addSelfToLifecycle);
        this.glide.z(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // va.m
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // va.m
    public synchronized void onStop() {
        pauseRequests();
        this.targetTracker.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        if (i11 == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.d();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        for (k kVar : this.treeNode.a()) {
            kVar.pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.requestTracker.e();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        for (k kVar : this.treeNode.a()) {
            kVar.pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.requestTracker.g();
    }

    public synchronized void resumeRequestsRecursive() {
        bb.k.b();
        resumeRequests();
        for (k kVar : this.treeNode.a()) {
            kVar.resumeRequests();
        }
    }

    public synchronized k setDefaultRequestOptions(com.bumptech.glide.request.h hVar) {
        setRequestOptions(hVar);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z11) {
        this.pauseAllRequestsOnTrimMemoryModerate = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void setRequestOptions(com.bumptech.glide.request.h hVar) {
        this.requestOptions = hVar.mo93clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void track(ya.k<?> kVar, com.bumptech.glide.request.d dVar) {
        this.targetTracker.c(kVar);
        this.requestTracker.h(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean untrack(ya.k<?> kVar) {
        com.bumptech.glide.request.d request = kVar.getRequest();
        if (request == null) {
            return true;
        }
        if (this.requestTracker.a(request)) {
            this.targetTracker.d(kVar);
            kVar.setRequest(null);
            return true;
        }
        return false;
    }

    public void clear(ya.k<?> kVar) {
        if (kVar == null) {
            return;
        }
        untrackOrDelegate(kVar);
    }

    k(com.bumptech.glide.c cVar, va.l lVar, q qVar, r rVar, va.d dVar, Context context) {
        this.targetTracker = new t();
        a aVar = new a();
        this.addSelfToLifecycle = aVar;
        this.glide = cVar;
        this.lifecycle = lVar;
        this.treeNode = qVar;
        this.requestTracker = rVar;
        this.context = context;
        va.c a11 = dVar.a(context.getApplicationContext(), new c(rVar));
        this.connectivityMonitor = a11;
        if (bb.k.q()) {
            bb.k.u(aVar);
        } else {
            lVar.b(this);
        }
        lVar.b(a11);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(cVar.k().c());
        setRequestOptions(cVar.k().d());
        cVar.u(this);
    }

    @Override // 
    /* renamed from: load */
    public j<Drawable> mo103load(Bitmap bitmap) {
        return asDrawable().mo94load(bitmap);
    }

    @Override // 
    /* renamed from: load */
    public j<Drawable> mo104load(Drawable drawable) {
        return asDrawable().mo95load(drawable);
    }

    @Override // 
    /* renamed from: load */
    public j<Drawable> mo109load(String str) {
        return asDrawable().mo100load(str);
    }

    @Override // 
    /* renamed from: load */
    public j<Drawable> mo105load(Uri uri) {
        return asDrawable().mo96load(uri);
    }

    @Override // 
    /* renamed from: load */
    public j<Drawable> mo106load(File file) {
        return asDrawable().mo97load(file);
    }

    @Override // 
    /* renamed from: load */
    public j<Drawable> mo107load(Integer num) {
        return asDrawable().mo98load(num);
    }

    @Override // 
    @Deprecated
    /* renamed from: load */
    public j<Drawable> mo110load(URL url) {
        return asDrawable().mo101load(url);
    }

    @Override // 
    /* renamed from: load */
    public j<Drawable> mo111load(byte[] bArr) {
        return asDrawable().mo102load(bArr);
    }

    @Override // 
    /* renamed from: load */
    public j<Drawable> mo108load(Object obj) {
        return asDrawable().mo99load(obj);
    }
}