package va;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ya.k<?>> f54460a = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f54460a.clear();
    }

    public List<ya.k<?>> b() {
        return bb.k.j(this.f54460a);
    }

    public void c(ya.k<?> kVar) {
        this.f54460a.add(kVar);
    }

    public void d(ya.k<?> kVar) {
        this.f54460a.remove(kVar);
    }

    @Override // va.m
    public void onDestroy() {
        for (ya.k kVar : bb.k.j(this.f54460a)) {
            kVar.onDestroy();
        }
    }

    @Override // va.m
    public void onStart() {
        for (ya.k kVar : bb.k.j(this.f54460a)) {
            kVar.onStart();
        }
    }

    @Override // va.m
    public void onStop() {
        for (ya.k kVar : bb.k.j(this.f54460a)) {
            kVar.onStop();
        }
    }
}