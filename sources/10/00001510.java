package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final e.a<?> f10512b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f10513a = new HashMap();

    /* loaded from: classes.dex */
    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f10514a;

        b(Object obj) {
            this.f10514a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f10514a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void cleanup() {
        }
    }

    public synchronized <T> e<T> a(T t11) {
        e.a<?> aVar;
        bb.j.d(t11);
        aVar = this.f10513a.get(t11.getClass());
        if (aVar == null) {
            Iterator<e.a<?>> it2 = this.f10513a.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                e.a<?> next = it2.next();
                if (next.a().isAssignableFrom(t11.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f10512b;
        }
        return (e<T>) aVar.b(t11);
    }

    public synchronized void b(e.a<?> aVar) {
        this.f10513a.put(aVar.a(), aVar);
    }
}