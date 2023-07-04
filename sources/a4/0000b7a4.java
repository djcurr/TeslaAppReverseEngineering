package ua;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?, ?>> f53402a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Z> f53403a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<R> f53404b;

        /* renamed from: c  reason: collision with root package name */
        final e<Z, R> f53405c;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f53403a = cls;
            this.f53404b = cls2;
            this.f53405c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f53403a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f53404b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.f53402a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f53405c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f53402a) {
            if (aVar.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f53402a.add(new a<>(cls, cls2, eVar));
    }
}