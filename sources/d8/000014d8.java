package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import na.n;
import na.o;
import na.p;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a */
    private final p f10434a;

    /* renamed from: b */
    private final xa.a f10435b;

    /* renamed from: c */
    private final xa.e f10436c;

    /* renamed from: d */
    private final xa.f f10437d;

    /* renamed from: e */
    private final com.bumptech.glide.load.data.f f10438e;

    /* renamed from: f */
    private final ua.f f10439f;

    /* renamed from: g */
    private final xa.b f10440g;

    /* renamed from: h */
    private final xa.d f10441h = new xa.d();

    /* renamed from: i */
    private final xa.c f10442i = new xa.c();

    /* renamed from: j */
    private final v3.f<List<Throwable>> f10443j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m11, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m11);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        v3.f<List<Throwable>> e11 = cb.a.e();
        this.f10443j = e11;
        this.f10434a = new p(e11);
        this.f10435b = new xa.a();
        this.f10436c = new xa.e();
        this.f10437d = new xa.f();
        this.f10438e = new com.bumptech.glide.load.data.f();
        this.f10439f = new ua.f();
        this.f10440g = new xa.b();
        s(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f10436c.d(cls, cls2)) {
            for (Class cls5 : this.f10439f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f10436c.b(cls, cls4), this.f10439f.a(cls4, cls5), this.f10443j));
            }
        }
        return arrayList;
    }

    public <Data> Registry a(Class<Data> cls, ha.a<Data> aVar) {
        this.f10435b.a(cls, aVar);
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, ha.g<TResource> gVar) {
        this.f10437d.a(cls, gVar);
        return this;
    }

    public <Data, TResource> Registry c(Class<Data> cls, Class<TResource> cls2, ha.f<Data, TResource> fVar) {
        e("legacy_append", cls, cls2, fVar);
        return this;
    }

    public <Model, Data> Registry d(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        this.f10434a.a(cls, cls2, oVar);
        return this;
    }

    public <Data, TResource> Registry e(String str, Class<Data> cls, Class<TResource> cls2, ha.f<Data, TResource> fVar) {
        this.f10436c.a(str, fVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> b11 = this.f10440g.b();
        if (b11.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return b11;
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> a11 = this.f10442i.a(cls, cls2, cls3);
        if (this.f10442i.c(a11)) {
            return null;
        }
        if (a11 == null) {
            List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f11 = f(cls, cls2, cls3);
            a11 = f11.isEmpty() ? null : new q<>(cls, cls2, cls3, f11, this.f10443j);
            this.f10442i.d(cls, cls2, cls3, a11);
        }
        return a11;
    }

    public <Model> List<n<Model, ?>> i(Model model) {
        return this.f10434a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a11 = this.f10441h.a(cls, cls2, cls3);
        if (a11 == null) {
            a11 = new ArrayList<>();
            for (Class<?> cls4 : this.f10434a.c(cls)) {
                for (Class<?> cls5 : this.f10436c.d(cls4, cls2)) {
                    if (!this.f10439f.b(cls5, cls3).isEmpty() && !a11.contains(cls5)) {
                        a11.add(cls5);
                    }
                }
            }
            this.f10441h.b(cls, cls2, cls3, Collections.unmodifiableList(a11));
        }
        return a11;
    }

    public <X> ha.g<X> k(ja.c<X> cVar) {
        ha.g<X> b11 = this.f10437d.b(cVar.b());
        if (b11 != null) {
            return b11;
        }
        throw new NoResultEncoderAvailableException(cVar.b());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x11) {
        return this.f10438e.a(x11);
    }

    public <X> ha.a<X> m(X x11) {
        ha.a<X> b11 = this.f10435b.b(x11.getClass());
        if (b11 != null) {
            return b11;
        }
        throw new NoSourceEncoderAvailableException(x11.getClass());
    }

    public boolean n(ja.c<?> cVar) {
        return this.f10437d.b(cVar.b()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f10440g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a<?> aVar) {
        this.f10438e.b(aVar);
        return this;
    }

    public <TResource, Transcode> Registry q(Class<TResource> cls, Class<Transcode> cls2, ua.e<TResource, Transcode> eVar) {
        this.f10439f.c(cls, cls2, eVar);
        return this;
    }

    public <Model, Data> Registry r(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        this.f10434a.f(cls, cls2, oVar);
        return this;
    }

    public final Registry s(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.f10436c.e(arrayList);
        return this;
    }
}