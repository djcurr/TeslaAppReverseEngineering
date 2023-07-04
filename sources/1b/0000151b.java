package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f10529a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f10530b;

    /* renamed from: c  reason: collision with root package name */
    private T f10531c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f10530b = contentResolver;
        this.f10529a = uri;
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
        T t11 = this.f10531c;
        if (t11 != null) {
            try {
                b(t11);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void d(com.bumptech.glide.h hVar, d.a<? super T> aVar) {
        try {
            T e11 = e(this.f10529a, this.f10530b);
            this.f10531c = e11;
            aVar.e(e11);
        } catch (FileNotFoundException e12) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e12);
            }
            aVar.b(e12);
        }
    }

    protected abstract T e(Uri uri, ContentResolver contentResolver);
}