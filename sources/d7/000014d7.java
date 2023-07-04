package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.dylanvann.fastimage.FastImageGlideModule;
import com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a  reason: collision with root package name */
    private final FastImageGlideModule f10433a = new FastImageGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.dylanvann.fastimage.FastImageGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.dylanvann.fastimage.FastImageOkHttpProgressGlideModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set<Class<?>> a() {
        return Collections.emptySet();
    }

    @Override // wa.a
    public void applyOptions(Context context, d dVar) {
        this.f10433a.applyOptions(context, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: c */
    public a b() {
        return new a();
    }

    @Override // wa.a
    public boolean isManifestParsingEnabled() {
        return this.f10433a.isManifestParsingEnabled();
    }

    @Override // wa.c
    public void registerComponents(Context context, c cVar, Registry registry) {
        new com.bumptech.glide.integration.okhttp3.a().registerComponents(context, cVar, registry);
        new FastImageOkHttpProgressGlideModule().registerComponents(context, cVar, registry);
        this.f10433a.registerComponents(context, cVar, registry);
    }
}