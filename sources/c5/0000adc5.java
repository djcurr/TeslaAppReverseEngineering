package qd;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import md.k;

/* loaded from: classes.dex */
public abstract class a<T> implements Cloneable, Closeable {

    /* renamed from: e */
    private static Class<a> f48052e = a.class;

    /* renamed from: f */
    private static int f48053f = 0;

    /* renamed from: g */
    private static final h<Closeable> f48054g = new C1025a();

    /* renamed from: h */
    private static final c f48055h = new b();

    /* renamed from: a */
    protected boolean f48056a = false;

    /* renamed from: b */
    protected final SharedReference<T> f48057b;

    /* renamed from: c */
    protected final c f48058c;

    /* renamed from: d */
    protected final Throwable f48059d;

    /* renamed from: qd.a$a */
    /* loaded from: classes.dex */
    static class C1025a implements h<Closeable> {
        C1025a() {
        }

        @Override // qd.h
        /* renamed from: b */
        public void a(Closeable closeable) {
            try {
                md.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    static class b implements c {
        b() {
        }

        @Override // qd.a.c
        public void a(SharedReference<Object> sharedReference, Throwable th2) {
            Object f11 = sharedReference.f();
            Class cls = a.f48052e;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(System.identityHashCode(sharedReference));
            objArr[2] = f11 == null ? null : f11.getClass().getName();
            nd.a.E(cls, "Finalized without closing: %x %x (type = %s)", objArr);
        }

        @Override // qd.a.c
        public boolean b() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(SharedReference<Object> sharedReference, Throwable th2);

        boolean b();
    }

    public a(SharedReference<T> sharedReference, c cVar, Throwable th2) {
        this.f48057b = (SharedReference) k.g(sharedReference);
        sharedReference.b();
        this.f48058c = cVar;
        this.f48059d = th2;
    }

    public static void C(a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static <T> a<T> D0(T t11, h<T> hVar, c cVar) {
        if (t11 == null) {
            return null;
        }
        return F0(t11, hVar, cVar, cVar.b() ? new Throwable() : null);
    }

    public static <T> a<T> F0(T t11, h<T> hVar, c cVar, Throwable th2) {
        if (t11 == null) {
            return null;
        }
        if ((t11 instanceof Bitmap) || (t11 instanceof d)) {
            int i11 = f48053f;
            if (i11 == 1) {
                return new qd.c(t11, hVar, cVar, th2);
            }
            if (i11 == 2) {
                return new g(t11, hVar, cVar, th2);
            }
            if (i11 == 3) {
                return new e(t11, hVar, cVar, th2);
            }
        }
        return new qd.b(t11, hVar, cVar, th2);
    }

    public static void G0(int i11) {
        f48053f = i11;
    }

    public static boolean I0() {
        return f48053f == 3;
    }

    public static <T> List<a<T>> j(Collection<a<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (a<T> aVar : collection) {
            arrayList.add(m(aVar));
        }
        return arrayList;
    }

    public static <T> a<T> m(a<T> aVar) {
        if (aVar != null) {
            return aVar.l();
        }
        return null;
    }

    public static boolean n0(a<?> aVar) {
        return aVar != null && aVar.R();
    }

    public static void p(Iterable<? extends a<?>> iterable) {
        if (iterable != null) {
            for (a<?> aVar : iterable) {
                C(aVar);
            }
        }
    }

    public static a p0(Closeable closeable) {
        return u0(closeable, f48054g);
    }

    public static a t0(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return F0(closeable, f48054g, cVar, cVar.b() ? new Throwable() : null);
    }

    public static <T> a<T> u0(T t11, h<T> hVar) {
        return D0(t11, hVar, f48055h);
    }

    public synchronized T J() {
        k.i(!this.f48056a);
        return (T) k.g(this.f48057b.f());
    }

    public int L() {
        if (R()) {
            return System.identityHashCode(this.f48057b.f());
        }
        return 0;
    }

    public synchronized boolean R() {
        return !this.f48056a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f48056a) {
                return;
            }
            this.f48056a = true;
            this.f48057b.d();
        }
    }

    public void finalize() {
        try {
            synchronized (this) {
                if (this.f48056a) {
                    return;
                }
                this.f48058c.a(this.f48057b, this.f48059d);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // 
    /* renamed from: g */
    public abstract a<T> clone();

    public synchronized a<T> l() {
        if (R()) {
            return clone();
        }
        return null;
    }

    public a(T t11, h<T> hVar, c cVar, Throwable th2) {
        this.f48057b = new SharedReference<>(t11, hVar);
        this.f48058c = cVar;
        this.f48059d = th2;
    }
}