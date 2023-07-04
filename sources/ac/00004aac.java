package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes2.dex */
public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    final LruCache<String, b> f20719a;

    /* loaded from: classes2.dex */
    class a extends LruCache<String, b> {
        a(m mVar, int i11) {
            super(i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String str, b bVar) {
            return bVar.f20721b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final Bitmap f20720a;

        /* renamed from: b  reason: collision with root package name */
        final int f20721b;

        b(Bitmap bitmap, int i11) {
            this.f20720a = bitmap;
            this.f20721b = i11;
        }
    }

    public m(Context context) {
        this(d0.b(context));
    }

    @Override // com.squareup.picasso.d
    public int a() {
        return this.f20719a.maxSize();
    }

    @Override // com.squareup.picasso.d
    public Bitmap get(String str) {
        b bVar = this.f20719a.get(str);
        if (bVar != null) {
            return bVar.f20720a;
        }
        return null;
    }

    @Override // com.squareup.picasso.d
    public void set(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            int i11 = d0.i(bitmap);
            if (i11 > a()) {
                this.f20719a.remove(str);
                return;
            } else {
                this.f20719a.put(str, new b(bitmap, i11));
                return;
            }
        }
        throw new NullPointerException("key == null || bitmap == null");
    }

    @Override // com.squareup.picasso.d
    public int size() {
        return this.f20719a.size();
    }

    public m(int i11) {
        this.f20719a = new a(this, i11);
    }
}