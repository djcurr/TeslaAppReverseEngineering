package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.w;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final w f10527a;

    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final ka.b f10528a;

        public a(ka.b bVar) {
            this.f10528a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f10528a);
        }
    }

    public k(InputStream inputStream, ka.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f10527a = wVar;
        wVar.mark(5242880);
    }

    public void b() {
        this.f10527a.g();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c */
    public InputStream a() {
        this.f10527a.reset();
        return this.f10527a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        this.f10527a.release();
    }
}