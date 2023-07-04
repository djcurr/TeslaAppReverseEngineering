package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public abstract class i0<K, T extends Closeable> implements o0<T> {

    /* renamed from: a  reason: collision with root package name */
    final Map<K, i0<K, T>.b> f11410a;

    /* renamed from: b  reason: collision with root package name */
    private final o0<T> f11411b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11412c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11413d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11414e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final K f11415a;

        /* renamed from: b  reason: collision with root package name */
        private final CopyOnWriteArraySet<Pair<l<T>, p0>> f11416b = md.m.a();

        /* renamed from: c  reason: collision with root package name */
        private T f11417c;

        /* renamed from: d  reason: collision with root package name */
        private float f11418d;

        /* renamed from: e  reason: collision with root package name */
        private int f11419e;

        /* renamed from: f  reason: collision with root package name */
        private d f11420f;

        /* renamed from: g  reason: collision with root package name */
        private i0<K, T>.b.C0216b f11421g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a extends e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Pair f11423a;

            a(Pair pair) {
                this.f11423a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void a() {
                d.r(b.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.q0
            public void b() {
                boolean remove;
                List list;
                d dVar;
                List list2;
                List list3;
                synchronized (b.this) {
                    remove = b.this.f11416b.remove(this.f11423a);
                    list = null;
                    if (!remove) {
                        dVar = null;
                        list2 = null;
                    } else if (b.this.f11416b.isEmpty()) {
                        dVar = b.this.f11420f;
                        list2 = null;
                    } else {
                        List s11 = b.this.s();
                        list2 = b.this.t();
                        list3 = b.this.r();
                        dVar = null;
                        list = s11;
                    }
                    list3 = list2;
                }
                d.s(list);
                d.t(list2);
                d.r(list3);
                if (dVar != null) {
                    if (i0.this.f11412c && !dVar.n()) {
                        d.t(dVar.y(com.facebook.imagepipeline.common.a.LOW));
                    } else {
                        dVar.u();
                    }
                }
                if (remove) {
                    ((l) this.f11423a.first).a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void c() {
                d.t(b.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.e, com.facebook.imagepipeline.producers.q0
            public void d() {
                d.s(b.this.s());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.facebook.imagepipeline.producers.i0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0216b extends com.facebook.imagepipeline.producers.b<T> {
            private C0216b() {
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void f() {
                try {
                    if (tf.b.d()) {
                        tf.b.a("MultiplexProducer#onCancellation");
                    }
                    b.this.m(this);
                } finally {
                    if (tf.b.d()) {
                        tf.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void g(Throwable th2) {
                try {
                    if (tf.b.d()) {
                        tf.b.a("MultiplexProducer#onFailure");
                    }
                    b.this.n(this, th2);
                } finally {
                    if (tf.b.d()) {
                        tf.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.b
            protected void i(float f11) {
                try {
                    if (tf.b.d()) {
                        tf.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    b.this.p(this, f11);
                } finally {
                    if (tf.b.d()) {
                        tf.b.b();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.b
            /* renamed from: o */
            public void h(T t11, int i11) {
                try {
                    if (tf.b.d()) {
                        tf.b.a("MultiplexProducer#onNewResult");
                    }
                    b.this.o(this, t11, i11);
                } finally {
                    if (tf.b.d()) {
                        tf.b.b();
                    }
                }
            }
        }

        public b(K k11) {
            this.f11415a = k11;
        }

        private void g(Pair<l<T>, p0> pair, p0 p0Var) {
            p0Var.c(new a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }

        private synchronized boolean j() {
            Iterator<Pair<l<T>, p0>> it2 = this.f11416b.iterator();
            while (it2.hasNext()) {
                if (((p0) it2.next().second).i()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator<Pair<l<T>, p0>> it2 = this.f11416b.iterator();
            while (it2.hasNext()) {
                if (!((p0) it2.next().second).n()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized com.facebook.imagepipeline.common.a l() {
            com.facebook.imagepipeline.common.a aVar;
            aVar = com.facebook.imagepipeline.common.a.LOW;
            Iterator<Pair<l<T>, p0>> it2 = this.f11416b.iterator();
            while (it2.hasNext()) {
                aVar = com.facebook.imagepipeline.common.a.getHigherPriority(aVar, ((p0) it2.next().second).j());
            }
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(com.facebook.common.util.a aVar) {
            synchronized (this) {
                boolean z11 = true;
                md.k.b(Boolean.valueOf(this.f11420f == null));
                if (this.f11421g != null) {
                    z11 = false;
                }
                md.k.b(Boolean.valueOf(z11));
                if (this.f11416b.isEmpty()) {
                    i0.this.k(this.f11415a, this);
                    return;
                }
                p0 p0Var = (p0) this.f11416b.iterator().next().second;
                d dVar = new d(p0Var.l(), p0Var.getId(), p0Var.h(), p0Var.a(), p0Var.p(), k(), j(), l(), p0Var.d());
                this.f11420f = dVar;
                dVar.m(p0Var.getExtras());
                if (aVar.isSet()) {
                    this.f11420f.b("started_as_prefetch", Boolean.valueOf(aVar.asBoolean()));
                }
                i0<K, T>.b.C0216b c0216b = new C0216b();
                this.f11421g = c0216b;
                i0.this.f11411b.b(c0216b, this.f11420f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<q0> r() {
            d dVar = this.f11420f;
            if (dVar == null) {
                return null;
            }
            return dVar.w(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<q0> s() {
            d dVar = this.f11420f;
            if (dVar == null) {
                return null;
            }
            return dVar.x(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List<q0> t() {
            d dVar = this.f11420f;
            if (dVar == null) {
                return null;
            }
            return dVar.y(l());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean h(l<T> lVar, p0 p0Var) {
            Pair<l<T>, p0> create = Pair.create(lVar, p0Var);
            synchronized (this) {
                if (i0.this.i(this.f11415a) != this) {
                    return false;
                }
                this.f11416b.add(create);
                List<q0> s11 = s();
                List<q0> t11 = t();
                List<q0> r11 = r();
                Closeable closeable = this.f11417c;
                float f11 = this.f11418d;
                int i11 = this.f11419e;
                d.s(s11);
                d.t(t11);
                d.r(r11);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f11417c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = i0.this.g(closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f11 > BitmapDescriptorFactory.HUE_RED) {
                            lVar.c(f11);
                        }
                        lVar.b(closeable, i11);
                        i(closeable);
                    }
                }
                g(create, p0Var);
                return true;
            }
        }

        public void m(i0<K, T>.b.C0216b c0216b) {
            synchronized (this) {
                if (this.f11421g != c0216b) {
                    return;
                }
                this.f11421g = null;
                this.f11420f = null;
                i(this.f11417c);
                this.f11417c = null;
                q(com.facebook.common.util.a.UNSET);
            }
        }

        public void n(i0<K, T>.b.C0216b c0216b, Throwable th2) {
            synchronized (this) {
                if (this.f11421g != c0216b) {
                    return;
                }
                Iterator<Pair<l<T>, p0>> it2 = this.f11416b.iterator();
                this.f11416b.clear();
                i0.this.k(this.f11415a, this);
                i(this.f11417c);
                this.f11417c = null;
                while (it2.hasNext()) {
                    Pair<l<T>, p0> next = it2.next();
                    synchronized (next) {
                        ((p0) next.second).h().k((p0) next.second, i0.this.f11413d, th2, null);
                        ((l) next.first).onFailure(th2);
                    }
                }
            }
        }

        public void o(i0<K, T>.b.C0216b c0216b, T t11, int i11) {
            synchronized (this) {
                if (this.f11421g != c0216b) {
                    return;
                }
                i(this.f11417c);
                this.f11417c = null;
                Iterator<Pair<l<T>, p0>> it2 = this.f11416b.iterator();
                int size = this.f11416b.size();
                if (com.facebook.imagepipeline.producers.b.e(i11)) {
                    this.f11417c = (T) i0.this.g(t11);
                    this.f11419e = i11;
                } else {
                    this.f11416b.clear();
                    i0.this.k(this.f11415a, this);
                }
                while (it2.hasNext()) {
                    Pair<l<T>, p0> next = it2.next();
                    synchronized (next) {
                        if (com.facebook.imagepipeline.producers.b.d(i11)) {
                            ((p0) next.second).h().j((p0) next.second, i0.this.f11413d, null);
                            d dVar = this.f11420f;
                            if (dVar != null) {
                                ((p0) next.second).m(dVar.getExtras());
                            }
                            ((p0) next.second).b(i0.this.f11414e, Integer.valueOf(size));
                        }
                        ((l) next.first).b(t11, i11);
                    }
                }
            }
        }

        public void p(i0<K, T>.b.C0216b c0216b, float f11) {
            synchronized (this) {
                if (this.f11421g != c0216b) {
                    return;
                }
                this.f11418d = f11;
                Iterator<Pair<l<T>, p0>> it2 = this.f11416b.iterator();
                while (it2.hasNext()) {
                    Pair<l<T>, p0> next = it2.next();
                    synchronized (next) {
                        ((l) next.first).c(f11);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i0(o0<T> o0Var, String str, String str2) {
        this(o0Var, str, str2, false);
    }

    private synchronized i0<K, T>.b h(K k11) {
        i0<K, T>.b bVar;
        bVar = new b(k11);
        this.f11410a.put(k11, bVar);
        return bVar;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<T> lVar, p0 p0Var) {
        boolean z11;
        i0<K, T>.b i11;
        try {
            if (tf.b.d()) {
                tf.b.a("MultiplexProducer#produceResults");
            }
            p0Var.h().d(p0Var, this.f11413d);
            K j11 = j(p0Var);
            do {
                z11 = false;
                synchronized (this) {
                    i11 = i(j11);
                    if (i11 == null) {
                        i11 = h(j11);
                        z11 = true;
                    }
                }
            } while (!i11.h(lVar, p0Var));
            if (z11) {
                i11.q(com.facebook.common.util.a.valueOf(p0Var.n()));
            }
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    protected abstract T g(T t11);

    protected synchronized i0<K, T>.b i(K k11) {
        return this.f11410a.get(k11);
    }

    protected abstract K j(p0 p0Var);

    protected synchronized void k(K k11, i0<K, T>.b bVar) {
        if (this.f11410a.get(k11) == bVar) {
            this.f11410a.remove(k11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i0(o0<T> o0Var, String str, String str2, boolean z11) {
        this.f11411b = o0Var;
        this.f11410a = new HashMap();
        this.f11412c = z11;
        this.f11413d = str;
        this.f11414e = str2;
    }
}