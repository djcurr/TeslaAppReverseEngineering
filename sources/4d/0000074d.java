package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class d0<T> extends f0<T> {

    /* renamed from: a  reason: collision with root package name */
    private o.b<LiveData<?>, a<?>> f5127a = new o.b<>();

    /* loaded from: classes.dex */
    private static class a<V> implements g0<V> {

        /* renamed from: a  reason: collision with root package name */
        final LiveData<V> f5128a;

        /* renamed from: b  reason: collision with root package name */
        final g0<? super V> f5129b;

        /* renamed from: c  reason: collision with root package name */
        int f5130c = -1;

        a(LiveData<V> liveData, g0<? super V> g0Var) {
            this.f5128a = liveData;
            this.f5129b = g0Var;
        }

        void a() {
            this.f5128a.observeForever(this);
        }

        void b() {
            this.f5128a.removeObserver(this);
        }

        @Override // androidx.lifecycle.g0
        public void onChanged(V v11) {
            if (this.f5130c != this.f5128a.getVersion()) {
                this.f5130c = this.f5128a.getVersion();
                this.f5129b.onChanged(v11);
            }
        }
    }

    public <S> void b(LiveData<S> liveData, g0<? super S> g0Var) {
        a<?> aVar = new a<>(liveData, g0Var);
        a<?> h11 = this.f5127a.h(liveData, aVar);
        if (h11 != null && h11.f5129b != g0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (h11 == null && hasActiveObservers()) {
            aVar.a();
        }
    }

    public <S> void c(LiveData<S> liveData) {
        a<?> i11 = this.f5127a.i(liveData);
        if (i11 != null) {
            i11.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it2 = this.f5127a.iterator();
        while (it2.hasNext()) {
            it2.next().getValue().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it2 = this.f5127a.iterator();
        while (it2.hasNext()) {
            it2.next().getValue().b();
        }
    }
}