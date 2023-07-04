package va;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class a implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Set<m> f54424a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private boolean f54425b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54426c;

    @Override // va.l
    public void a(m mVar) {
        this.f54424a.remove(mVar);
    }

    @Override // va.l
    public void b(m mVar) {
        this.f54424a.add(mVar);
        if (this.f54426c) {
            mVar.onDestroy();
        } else if (this.f54425b) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f54426c = true;
        for (m mVar : bb.k.j(this.f54424a)) {
            mVar.onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f54425b = true;
        for (m mVar : bb.k.j(this.f54424a)) {
            mVar.onStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f54425b = false;
        for (m mVar : bb.k.j(this.f54424a)) {
            mVar.onStop();
        }
    }
}