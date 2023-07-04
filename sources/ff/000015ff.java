package com.facebook.common.references;

import android.graphics.Bitmap;
import java.util.IdentityHashMap;
import java.util.Map;
import md.k;
import qd.a;
import qd.d;
import qd.h;

/* loaded from: classes.dex */
public class SharedReference<T> {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Object, Integer> f11054d = new IdentityHashMap();

    /* renamed from: a  reason: collision with root package name */
    private T f11055a;

    /* renamed from: b  reason: collision with root package name */
    private int f11056b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final h<T> f11057c;

    /* loaded from: classes.dex */
    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    public SharedReference(T t11, h<T> hVar) {
        this.f11055a = (T) k.g(t11);
        this.f11057c = (h) k.g(hVar);
        a(t11);
    }

    private static void a(Object obj) {
        if (a.I0() && ((obj instanceof Bitmap) || (obj instanceof d))) {
            return;
        }
        Map<Object, Integer> map = f11054d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                map.put(obj, 1);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private synchronized int c() {
        int i11;
        e();
        k.b(Boolean.valueOf(this.f11056b > 0));
        i11 = this.f11056b - 1;
        this.f11056b = i11;
        return i11;
    }

    private void e() {
        if (!h(this)) {
            throw new NullReferenceException();
        }
    }

    public static boolean h(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.g();
    }

    private static void i(Object obj) {
        Map<Object, Integer> map = f11054d;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                nd.a.N("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public synchronized void b() {
        e();
        this.f11056b++;
    }

    public void d() {
        T t11;
        if (c() == 0) {
            synchronized (this) {
                t11 = this.f11055a;
                this.f11055a = null;
            }
            if (t11 != null) {
                this.f11057c.a(t11);
                i(t11);
            }
        }
    }

    public synchronized T f() {
        return this.f11055a;
    }

    public synchronized boolean g() {
        return this.f11056b > 0;
    }
}