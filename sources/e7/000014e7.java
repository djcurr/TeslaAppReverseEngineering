package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.c;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    static final l<?, ?> f10472k = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ka.b f10473a;

    /* renamed from: b  reason: collision with root package name */
    private final Registry f10474b;

    /* renamed from: c  reason: collision with root package name */
    private final ya.g f10475c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a f10476d;

    /* renamed from: e  reason: collision with root package name */
    private final List<com.bumptech.glide.request.g<Object>> f10477e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f10478f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f10479g;

    /* renamed from: h  reason: collision with root package name */
    private final f f10480h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10481i;

    /* renamed from: j  reason: collision with root package name */
    private com.bumptech.glide.request.h f10482j;

    public e(Context context, ka.b bVar, Registry registry, ya.g gVar, c.a aVar, Map<Class<?>, l<?, ?>> map, List<com.bumptech.glide.request.g<Object>> list, com.bumptech.glide.load.engine.j jVar, f fVar, int i11) {
        super(context.getApplicationContext());
        this.f10473a = bVar;
        this.f10474b = registry;
        this.f10475c = gVar;
        this.f10476d = aVar;
        this.f10477e = list;
        this.f10478f = map;
        this.f10479g = jVar;
        this.f10480h = fVar;
        this.f10481i = i11;
    }

    public <X> ya.l<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f10475c.a(imageView, cls);
    }

    public ka.b b() {
        return this.f10473a;
    }

    public List<com.bumptech.glide.request.g<Object>> c() {
        return this.f10477e;
    }

    public synchronized com.bumptech.glide.request.h d() {
        if (this.f10482j == null) {
            this.f10482j = this.f10476d.build().lock();
        }
        return this.f10482j;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l<?, T>) this.f10478f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f10478f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l<?, T>) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f10472k : lVar;
    }

    public com.bumptech.glide.load.engine.j f() {
        return this.f10479g;
    }

    public f g() {
        return this.f10480h;
    }

    public int h() {
        return this.f10481i;
    }

    public Registry i() {
        return this.f10474b;
    }
}