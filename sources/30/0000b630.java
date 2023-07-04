package tw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes6.dex */
public final class i<T> implements e<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<Provider<T>> f52638a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Provider<Collection<T>>> f52639b;

    /* loaded from: classes6.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<Provider<T>> f52640a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Provider<Collection<T>>> f52641b;

        public b<T> a(Provider<? extends Collection<? extends T>> provider) {
            this.f52641b.add(provider);
            return this;
        }

        public i<T> b() {
            return new i<>(this.f52640a, this.f52641b);
        }

        private b(int i11, int i12) {
            this.f52640a = tw.b.d(i11);
            this.f52641b = tw.b.d(i12);
        }
    }

    static {
        f.a(Collections.emptySet());
    }

    public static <T> b<T> a(int i11, int i12) {
        return new b<>(i11, i12);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<T> get() {
        int size = this.f52638a.size();
        ArrayList arrayList = new ArrayList(this.f52639b.size());
        int size2 = this.f52639b.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Collection<T> collection = this.f52639b.get(i11).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet b11 = tw.b.b(size);
        int size3 = this.f52638a.size();
        for (int i12 = 0; i12 < size3; i12++) {
            b11.add(h.b(this.f52638a.get(i12).get()));
        }
        int size4 = arrayList.size();
        for (int i13 = 0; i13 < size4; i13++) {
            for (Object obj : (Collection) arrayList.get(i13)) {
                b11.add(h.b(obj));
            }
        }
        return Collections.unmodifiableSet(b11);
    }

    private i(List<Provider<T>> list, List<Provider<Collection<T>>> list2) {
        this.f52638a = list;
        this.f52639b = list2;
    }
}