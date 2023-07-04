package ul;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class p {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final d<?> f53585a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f53586b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f53587c = new HashSet();

        b(d<?> dVar) {
            this.f53585a = dVar;
        }

        void a(b bVar) {
            this.f53586b.add(bVar);
        }

        void b(b bVar) {
            this.f53587c.add(bVar);
        }

        d<?> c() {
            return this.f53585a;
        }

        Set<b> d() {
            return this.f53586b;
        }

        boolean e() {
            return this.f53586b.isEmpty();
        }

        boolean f() {
            return this.f53587c.isEmpty();
        }

        void g(b bVar) {
            this.f53587c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f53588a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f53589b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f53588a.equals(this.f53588a) && cVar.f53589b == this.f53589b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f53588a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f53589b).hashCode();
        }

        private c(Class<?> cls, boolean z11) {
            this.f53588a = cls;
            this.f53589b = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<d<?>> list) {
        Set<b> c11 = c(list);
        Set<b> b11 = b(c11);
        int i11 = 0;
        while (!b11.isEmpty()) {
            b next = b11.iterator().next();
            b11.remove(next);
            i11++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b11.add(bVar);
                }
            }
        }
        if (i11 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c11) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (d<?> dVar : list) {
            b bVar = new b(dVar);
            for (Class<? super Object> cls : dVar.g()) {
                c cVar = new c(cls, !dVar.m());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f53589b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (q qVar : bVar2.c().e()) {
                    if (qVar.e() && (set = (Set) hashMap.get(new c(qVar.c(), qVar.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}