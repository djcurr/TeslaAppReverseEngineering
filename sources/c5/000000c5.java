package ak;

import ak.s;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class n<T, E extends s> {

    /* renamed from: a */
    private final ak.b f495a;

    /* renamed from: b */
    private final j f496b;

    /* renamed from: c */
    private final com.google.common.base.a0<E> f497c;

    /* renamed from: d */
    private final b<T, E> f498d;

    /* renamed from: e */
    private final CopyOnWriteArraySet<c<T, E>> f499e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f500f;

    /* renamed from: g */
    private final ArrayDeque<Runnable> f501g;

    /* renamed from: h */
    private boolean f502h;

    /* loaded from: classes3.dex */
    public interface a<T> {
        void invoke(T t11);
    }

    /* loaded from: classes3.dex */
    public interface b<T, E extends s> {
        void a(T t11, E e11);
    }

    /* loaded from: classes3.dex */
    public static final class c<T, E extends s> {

        /* renamed from: a */
        public final T f503a;

        /* renamed from: b */
        private E f504b;

        /* renamed from: c */
        private boolean f505c;

        /* renamed from: d */
        private boolean f506d;

        public c(T t11, com.google.common.base.a0<E> a0Var) {
            this.f503a = t11;
            this.f504b = a0Var.get();
        }

        public void a(int i11, a<T> aVar) {
            if (this.f506d) {
                return;
            }
            if (i11 != -1) {
                this.f504b.a(i11);
            }
            this.f505c = true;
            aVar.invoke(this.f503a);
        }

        public void b(com.google.common.base.a0<E> a0Var, b<T, E> bVar) {
            if (this.f506d || !this.f505c) {
                return;
            }
            E e11 = this.f504b;
            this.f504b = a0Var.get();
            this.f505c = false;
            bVar.a(this.f503a, e11);
        }

        public void c(b<T, E> bVar) {
            this.f506d = true;
            if (this.f505c) {
                bVar.a(this.f503a, this.f504b);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f503a.equals(((c) obj).f503a);
        }

        public int hashCode() {
            return this.f503a.hashCode();
        }
    }

    public n(Looper looper, ak.b bVar, com.google.common.base.a0<E> a0Var, b<T, E> bVar2) {
        this(new CopyOnWriteArraySet(), looper, bVar, a0Var, bVar2);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i11, a aVar) {
        g(copyOnWriteArraySet, i11, aVar);
    }

    public static /* synthetic */ boolean b(n nVar, Message message) {
        return nVar.f(message);
    }

    public boolean f(Message message) {
        int i11 = message.what;
        if (i11 == 0) {
            Iterator<c<T, E>> it2 = this.f499e.iterator();
            while (it2.hasNext()) {
                it2.next().b(this.f497c, this.f498d);
                if (this.f496b.b(0)) {
                    break;
                }
            }
        } else if (i11 == 1) {
            l(message.arg1, (a) message.obj);
            j();
        }
        return true;
    }

    public static /* synthetic */ void g(CopyOnWriteArraySet copyOnWriteArraySet, int i11, a aVar) {
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).a(i11, aVar);
        }
    }

    public void c(T t11) {
        if (this.f502h) {
            return;
        }
        ak.a.e(t11);
        this.f499e.add(new c<>(t11, this.f497c));
    }

    public n<T, E> d(Looper looper, b<T, E> bVar) {
        return new n<>(this.f499e, looper, this.f495a, this.f497c, bVar);
    }

    public void e() {
        if (this.f501g.isEmpty()) {
            return;
        }
        if (!this.f496b.b(0)) {
            this.f496b.a(0).sendToTarget();
        }
        boolean z11 = !this.f500f.isEmpty();
        this.f500f.addAll(this.f501g);
        this.f501g.clear();
        if (z11) {
            return;
        }
        while (!this.f500f.isEmpty()) {
            this.f500f.peekFirst().run();
            this.f500f.removeFirst();
        }
    }

    public void h(int i11, a<T> aVar) {
        this.f496b.c(1, i11, 0, aVar).sendToTarget();
    }

    public void i(final int i11, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f499e);
        this.f501g.add(new Runnable() { // from class: ak.m
            @Override // java.lang.Runnable
            public final void run() {
                n.a(copyOnWriteArraySet, i11, aVar);
            }
        });
    }

    public void j() {
        Iterator<c<T, E>> it2 = this.f499e.iterator();
        while (it2.hasNext()) {
            it2.next().c(this.f498d);
        }
        this.f499e.clear();
        this.f502h = true;
    }

    public void k(T t11) {
        Iterator<c<T, E>> it2 = this.f499e.iterator();
        while (it2.hasNext()) {
            c<T, E> next = it2.next();
            if (next.f503a.equals(t11)) {
                next.c(this.f498d);
                this.f499e.remove(next);
            }
        }
    }

    public void l(int i11, a<T> aVar) {
        i(i11, aVar);
        e();
    }

    private n(CopyOnWriteArraySet<c<T, E>> copyOnWriteArraySet, Looper looper, ak.b bVar, com.google.common.base.a0<E> a0Var, b<T, E> bVar2) {
        this.f495a = bVar;
        this.f499e = copyOnWriteArraySet;
        this.f497c = a0Var;
        this.f498d = bVar2;
        this.f500f = new ArrayDeque<>();
        this.f501g = new ArrayDeque<>();
        this.f496b = bVar.b(looper, new Handler.Callback() { // from class: ak.l
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return n.b(n.this, message);
            }
        });
    }
}