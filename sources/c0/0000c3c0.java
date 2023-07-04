package z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b */
    public static final e f59944b = new a().d(0).b();

    /* renamed from: c */
    public static final e f59945c = new a().d(1).b();

    /* renamed from: a */
    private LinkedHashSet<c> f59946a;

    e(LinkedHashSet<c> linkedHashSet) {
        this.f59946a = linkedHashSet;
    }

    public LinkedHashSet<androidx.camera.core.impl.s> a(LinkedHashSet<androidx.camera.core.impl.s> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.s> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().b());
        }
        List<d> b11 = b(arrayList);
        LinkedHashSet<androidx.camera.core.impl.s> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<androidx.camera.core.impl.s> it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.impl.s next = it3.next();
            if (b11.contains(next.b())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<d> b(List<d> list) {
        ArrayList arrayList = new ArrayList(list);
        List<d> arrayList2 = new ArrayList<>(list);
        Iterator<c> it2 = this.f59946a.iterator();
        while (it2.hasNext()) {
            arrayList2 = it2.next().a(Collections.unmodifiableList(arrayList2));
            if (!arrayList2.isEmpty()) {
                if (arrayList.containsAll(arrayList2)) {
                    arrayList.retainAll(arrayList2);
                } else {
                    throw new IllegalArgumentException("The output isn't contained in the input.");
                }
            } else {
                throw new IllegalArgumentException("No available camera can be found.");
            }
        }
        return arrayList2;
    }

    public LinkedHashSet<c> c() {
        return this.f59946a;
    }

    public Integer d() {
        Iterator<c> it2 = this.f59946a.iterator();
        Integer num = null;
        while (it2.hasNext()) {
            c next = it2.next();
            if (next instanceof androidx.camera.core.impl.t0) {
                Integer valueOf = Integer.valueOf(((androidx.camera.core.impl.t0) next).b());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public androidx.camera.core.impl.s e(LinkedHashSet<androidx.camera.core.impl.s> linkedHashSet) {
        return a(linkedHashSet).iterator().next();
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final LinkedHashSet<c> f59947a;

        public a() {
            this.f59947a = new LinkedHashSet<>();
        }

        public static a c(e eVar) {
            return new a(eVar.c());
        }

        public a a(c cVar) {
            this.f59947a.add(cVar);
            return this;
        }

        public e b() {
            return new e(this.f59947a);
        }

        public a d(int i11) {
            this.f59947a.add(new androidx.camera.core.impl.t0(i11));
            return this;
        }

        private a(LinkedHashSet<c> linkedHashSet) {
            this.f59947a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}