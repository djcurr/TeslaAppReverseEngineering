package io.realm.internal;

import io.realm.f0;
import io.realm.internal.j;
import io.realm.v;
import io.realm.w;

@Keep
/* loaded from: classes5.dex */
public interface ObservableCollection {

    /* loaded from: classes5.dex */
    public static class a implements j.a<b> {

        /* renamed from: a  reason: collision with root package name */
        private final OsCollectionChangeSet f31833a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(OsCollectionChangeSet osCollectionChangeSet) {
            this.f31833a = osCollectionChangeSet;
        }

        @Override // io.realm.internal.j.a
        /* renamed from: b */
        public void a(b bVar, Object obj) {
            bVar.a(obj, this.f31833a);
        }
    }

    /* loaded from: classes5.dex */
    public static class b<T> extends j.b<T, Object> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(T t11, Object obj) {
            super(t11, obj);
        }

        public void a(T t11, OsCollectionChangeSet osCollectionChangeSet) {
            S s11 = this.f31939b;
            if (s11 instanceof w) {
                ((w) s11).a(t11, new p(osCollectionChangeSet));
            } else if (s11 instanceof f0) {
                ((f0) s11).a(t11);
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.f31939b);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class c<T> implements w<T> {

        /* renamed from: a  reason: collision with root package name */
        private final f0<T> f31834a;

        public c(f0<T> f0Var) {
            this.f31834a = f0Var;
        }

        @Override // io.realm.w
        public void a(T t11, v vVar) {
            this.f31834a.a(t11);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && this.f31834a == ((c) obj).f31834a;
        }

        public int hashCode() {
            return this.f31834a.hashCode();
        }
    }

    void notifyChangeListeners(long j11);
}