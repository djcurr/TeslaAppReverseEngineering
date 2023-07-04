package ezvcard.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes5.dex */
public abstract class a<T, V> {

    /* renamed from: a  reason: collision with root package name */
    protected final Class<T> f25446a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Collection<T> f25447b = null;

    /* renamed from: c  reason: collision with root package name */
    private Collection<T> f25448c = null;

    public a(Class<T> cls) {
        this.f25446a = cls;
    }

    private void b() {
        if (this.f25447b == null) {
            synchronized (this) {
                if (this.f25447b == null) {
                    f();
                }
            }
        }
    }

    private void f() {
        Field[] fields;
        ArrayList arrayList = new ArrayList();
        for (Field field : this.f25446a.getFields()) {
            if (g(field)) {
                try {
                    Object obj = field.get(null);
                    if (obj != null) {
                        arrayList.add(this.f25446a.cast(obj));
                    }
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        this.f25448c = new ArrayList(0);
        this.f25447b = Collections.unmodifiableCollection(arrayList);
    }

    private boolean g(Field field) {
        int modifiers = field.getModifiers();
        return Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers) && field.getDeclaringClass() == this.f25446a && field.getType() == this.f25446a;
    }

    public Collection<T> a() {
        b();
        return this.f25447b;
    }

    protected abstract T c(V v11);

    public T d(V v11) {
        b();
        for (T t11 : this.f25447b) {
            if (h(t11, v11)) {
                return t11;
            }
        }
        return null;
    }

    public T e(V v11) {
        T d11 = d(v11);
        if (d11 != null) {
            return d11;
        }
        synchronized (this.f25448c) {
            for (T t11 : this.f25448c) {
                if (h(t11, v11)) {
                    return t11;
                }
            }
            T c11 = c(v11);
            this.f25448c.add(c11);
            return c11;
        }
    }

    protected abstract boolean h(T t11, V v11);
}