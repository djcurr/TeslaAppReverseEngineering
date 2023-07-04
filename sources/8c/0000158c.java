package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.m;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class y implements ha.f<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final m f10817a;

    /* renamed from: b  reason: collision with root package name */
    private final ka.b f10818b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements m.b {

        /* renamed from: a  reason: collision with root package name */
        private final w f10819a;

        /* renamed from: b  reason: collision with root package name */
        private final bb.d f10820b;

        a(w wVar, bb.d dVar) {
            this.f10819a = wVar;
            this.f10820b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m.b
        public void a(ka.e eVar, Bitmap bitmap) {
            IOException a11 = this.f10820b.a();
            if (a11 != null) {
                if (bitmap != null) {
                    eVar.b(bitmap);
                }
                throw a11;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m.b
        public void b() {
            this.f10819a.g();
        }
    }

    public y(m mVar, ka.b bVar) {
        this.f10817a = mVar;
        this.f10818b = bVar;
    }

    @Override // ha.f
    /* renamed from: c */
    public ja.c<Bitmap> b(InputStream inputStream, int i11, int i12, ha.e eVar) {
        boolean z11;
        w wVar;
        if (inputStream instanceof w) {
            wVar = (w) inputStream;
            z11 = false;
        } else {
            z11 = true;
            wVar = new w(inputStream, this.f10818b);
        }
        bb.d g11 = bb.d.g(wVar);
        try {
            return this.f10817a.g(new bb.h(g11), i11, i12, eVar, new a(wVar, g11));
        } finally {
            g11.release();
            if (z11) {
                wVar.release();
            }
        }
    }

    @Override // ha.f
    /* renamed from: d */
    public boolean a(InputStream inputStream, ha.e eVar) {
        return this.f10817a.p(inputStream);
    }
}