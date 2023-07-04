package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class a0 implements ha.f<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements ja.c<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f10741a;

        a(Bitmap bitmap) {
            this.f10741a = bitmap;
        }

        @Override // ja.c
        public int a() {
            return bb.k.h(this.f10741a);
        }

        @Override // ja.c
        public Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // ja.c
        /* renamed from: c */
        public Bitmap get() {
            return this.f10741a;
        }

        @Override // ja.c
        public void recycle() {
        }
    }

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Bitmap> b(Bitmap bitmap, int i11, int i12, ha.e eVar) {
        return new a(bitmap);
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(Bitmap bitmap, ha.e eVar) {
        return true;
    }
}