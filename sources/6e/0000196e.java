package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.uimanager.f1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class c1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, f<?, ?>> f12215a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, e<?>> f12216b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b<T extends c0> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, f1.m> f12217a;

        @Override // com.facebook.react.uimanager.c1.d
        public void a(Map<String, String> map) {
            for (f1.m mVar : this.f12217a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.c1.e
        public void c(c0 c0Var, String str, Object obj) {
            f1.m mVar = this.f12217a.get(str);
            if (mVar != null) {
                mVar.d(c0Var, obj);
            }
        }

        private b(Class<? extends c0> cls) {
            this.f12217a = f1.h(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c<T extends ViewManager, V extends View> implements f<T, V> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, f1.m> f12218a;

        @Override // com.facebook.react.uimanager.c1.d
        public void a(Map<String, String> map) {
            for (f1.m mVar : this.f12218a.values()) {
                map.put(mVar.a(), mVar.b());
            }
        }

        @Override // com.facebook.react.uimanager.c1.f
        public void b(T t11, V v11, String str, Object obj) {
            f1.m mVar = this.f12218a.get(str);
            if (mVar != null) {
                mVar.e(t11, v11, obj);
            }
        }

        private c(Class<? extends ViewManager> cls) {
            this.f12218a = f1.i(cls);
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(Map<String, String> map);
    }

    /* loaded from: classes3.dex */
    public interface e<T extends c0> extends d {
        void c(T t11, String str, Object obj);
    }

    /* loaded from: classes3.dex */
    public interface f<T extends ViewManager, V extends View> extends d {
        void b(T t11, V v11, String str, Object obj);
    }

    public static void a() {
        f1.b();
        f12215a.clear();
        f12216b.clear();
    }

    private static <T> T b(Class<?> cls) {
        String name = cls.getName();
        try {
            return (T) Class.forName(name + "$$PropsSetter").newInstance();
        } catch (ClassNotFoundException unused) {
            nd.a.G("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Unable to instantiate methods getter for " + name, e);
        }
    }

    private static <T extends ViewManager, V extends View> f<T, V> c(Class<? extends ViewManager> cls) {
        Map<Class<?>, f<?, ?>> map = f12215a;
        f<?, ?> fVar = map.get(cls);
        if (fVar == null) {
            fVar = (f) b(cls);
            if (fVar == null) {
                fVar = new c<>(cls);
            }
            map.put(cls, fVar);
        }
        return fVar;
    }

    private static <T extends c0> e<T> d(Class<? extends c0> cls) {
        Map<Class<?>, e<?>> map = f12216b;
        e<?> eVar = map.get(cls);
        if (eVar == null) {
            eVar = (e) b(cls);
            if (eVar == null) {
                eVar = new b<>(cls);
            }
            map.put(cls, eVar);
        }
        return eVar;
    }

    public static Map<String, String> e(Class<? extends ViewManager> cls, Class<? extends c0> cls2) {
        HashMap hashMap = new HashMap();
        c(cls).a(hashMap);
        d(cls2).a(hashMap);
        return hashMap;
    }

    public static <T extends c0> void f(T t11, e0 e0Var) {
        e d11 = d(t11.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = e0Var.f12246a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            d11.c(t11, next.getKey(), next.getValue());
        }
    }

    public static <T extends ViewManager, V extends View> void g(T t11, V v11, e0 e0Var) {
        f c11 = c(t11.getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = e0Var.f12246a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            c11.b(t11, v11, next.getKey(), next.getValue());
        }
    }

    public static <T extends b1<V>, V extends View> void h(T t11, V v11, e0 e0Var) {
        Iterator<Map.Entry<String, Object>> entryIterator = e0Var.f12246a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            t11.a(v11, next.getKey(), next.getValue());
        }
    }
}