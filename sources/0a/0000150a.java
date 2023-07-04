package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f10505a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f10506b;

    /* renamed from: c  reason: collision with root package name */
    private T f10507c;

    public b(AssetManager assetManager, String str) {
        this.f10506b = assetManager;
        this.f10505a = str;
    }

    protected abstract void b(T t11);

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        T t11 = this.f10507c;
        if (t11 == null) {
            return;
        }
        try {
            b(t11);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(com.bumptech.glide.h hVar, d.a<? super T> aVar) {
        try {
            T e11 = e(this.f10506b, this.f10505a);
            this.f10507c = e11;
            aVar.e(e11);
        } catch (IOException e12) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e12);
            }
            aVar.b(e12);
        }
    }

    protected abstract T e(AssetManager assetManager, String str);
}