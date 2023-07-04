package ul;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a0 extends ul.a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<?>> f53540a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<?>> f53541b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Class<?>> f53542c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f53543d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f53544e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f53545f;

    /* renamed from: g  reason: collision with root package name */
    private final e f53546g;

    /* loaded from: classes3.dex */
    private static class a implements pm.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f53547a;

        /* renamed from: b  reason: collision with root package name */
        private final pm.c f53548b;

        public a(Set<Class<?>> set, pm.c cVar) {
            this.f53547a = set;
            this.f53548b = cVar;
        }

        @Override // pm.c
        public void c(pm.a<?> aVar) {
            if (this.f53547a.contains(aVar.b())) {
                this.f53548b.c(aVar);
                return;
            }
            throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : dVar.e()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!dVar.h().isEmpty()) {
            hashSet.add(pm.c.class);
        }
        this.f53540a = Collections.unmodifiableSet(hashSet);
        this.f53541b = Collections.unmodifiableSet(hashSet2);
        this.f53542c = Collections.unmodifiableSet(hashSet3);
        this.f53543d = Collections.unmodifiableSet(hashSet4);
        this.f53544e = Collections.unmodifiableSet(hashSet5);
        this.f53545f = dVar.h();
        this.f53546g = eVar;
    }

    @Override // ul.a, ul.e
    public <T> T a(Class<T> cls) {
        if (this.f53540a.contains(cls)) {
            T t11 = (T) this.f53546g.a(cls);
            return !cls.equals(pm.c.class) ? t11 : (T) new a(this.f53545f, (pm.c) t11);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // ul.e
    public <T> sm.b<Set<T>> b(Class<T> cls) {
        if (this.f53544e.contains(cls)) {
            return this.f53546g.b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // ul.a, ul.e
    public <T> Set<T> c(Class<T> cls) {
        if (this.f53543d.contains(cls)) {
            return this.f53546g.c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // ul.e
    public <T> sm.b<T> d(Class<T> cls) {
        if (this.f53541b.contains(cls)) {
            return this.f53546g.d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // ul.e
    public <T> sm.a<T> e(Class<T> cls) {
        if (this.f53542c.contains(cls)) {
            return this.f53546g.e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}