package io.realm.internal;

import io.realm.internal.j.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public class j<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    private List<T> f31936a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f31937b = false;

    /* loaded from: classes5.dex */
    public interface a<T extends b> {
        void a(T t11, Object obj);
    }

    /* loaded from: classes5.dex */
    public static abstract class b<T, S> {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<T> f31938a;

        /* renamed from: b  reason: collision with root package name */
        protected final S f31939b;

        /* renamed from: c  reason: collision with root package name */
        boolean f31940c = false;

        public b(T t11, S s11) {
            this.f31939b = s11;
            this.f31938a = new WeakReference<>(t11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f31939b.equals(bVar.f31939b) && this.f31938a.get() == bVar.f31938a.get();
            }
            return false;
        }

        public int hashCode() {
            T t11 = this.f31938a.get();
            int hashCode = (527 + (t11 != null ? t11.hashCode() : 0)) * 31;
            S s11 = this.f31939b;
            return hashCode + (s11 != null ? s11.hashCode() : 0);
        }
    }

    public void a(T t11) {
        if (!this.f31936a.contains(t11)) {
            this.f31936a.add(t11);
            t11.f31940c = false;
        }
        if (this.f31937b) {
            this.f31937b = false;
        }
    }

    public void b() {
        this.f31937b = true;
        this.f31936a.clear();
    }

    public void c(a<T> aVar) {
        for (T t11 : this.f31936a) {
            if (this.f31937b) {
                return;
            }
            Object obj = t11.f31938a.get();
            if (obj == null) {
                this.f31936a.remove(t11);
            } else if (!t11.f31940c) {
                aVar.a(t11, obj);
            }
        }
    }

    public boolean d() {
        return this.f31936a.isEmpty();
    }

    public <S, U> void e(S s11, U u11) {
        for (T t11 : this.f31936a) {
            if (s11 == t11.f31938a.get() && u11.equals(t11.f31939b)) {
                t11.f31940c = true;
                this.f31936a.remove(t11);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Object obj) {
        for (T t11 : this.f31936a) {
            Object obj2 = t11.f31938a.get();
            if (obj2 == null || obj2 == obj) {
                t11.f31940c = true;
                this.f31936a.remove(t11);
            }
        }
    }

    public int g() {
        return this.f31936a.size();
    }
}