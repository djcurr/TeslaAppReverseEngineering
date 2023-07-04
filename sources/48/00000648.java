package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private final Runnable f4529a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<m> f4530b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Map<m, a> f4531c = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final androidx.lifecycle.p f4532a;

        /* renamed from: b */
        private androidx.lifecycle.s f4533b;

        a(androidx.lifecycle.p pVar, androidx.lifecycle.s sVar) {
            this.f4532a = pVar;
            this.f4533b = sVar;
            pVar.a(sVar);
        }

        void a() {
            this.f4532a.c(this.f4533b);
            this.f4533b = null;
        }
    }

    public k(Runnable runnable) {
        this.f4529a = runnable;
    }

    public static /* synthetic */ void a(k kVar, p.c cVar, m mVar, androidx.lifecycle.v vVar, p.b bVar) {
        kVar.g(cVar, mVar, vVar, bVar);
    }

    public static /* synthetic */ void b(k kVar, m mVar, androidx.lifecycle.v vVar, p.b bVar) {
        kVar.f(mVar, vVar, bVar);
    }

    public /* synthetic */ void f(m mVar, androidx.lifecycle.v vVar, p.b bVar) {
        if (bVar == p.b.ON_DESTROY) {
            j(mVar);
        }
    }

    public /* synthetic */ void g(p.c cVar, m mVar, androidx.lifecycle.v vVar, p.b bVar) {
        if (bVar == p.b.upTo(cVar)) {
            c(mVar);
        } else if (bVar == p.b.ON_DESTROY) {
            j(mVar);
        } else if (bVar == p.b.downFrom(cVar)) {
            this.f4530b.remove(mVar);
            this.f4529a.run();
        }
    }

    public void c(m mVar) {
        this.f4530b.add(mVar);
        this.f4529a.run();
    }

    public void d(final m mVar, androidx.lifecycle.v vVar) {
        c(mVar);
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        a remove = this.f4531c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f4531c.put(mVar, new a(lifecycle, new androidx.lifecycle.s() { // from class: androidx.core.view.i
            @Override // androidx.lifecycle.s
            public final void g(androidx.lifecycle.v vVar2, p.b bVar) {
                k.b(k.this, mVar, vVar2, bVar);
            }
        }));
    }

    public void e(final m mVar, androidx.lifecycle.v vVar, final p.c cVar) {
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        a remove = this.f4531c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f4531c.put(mVar, new a(lifecycle, new androidx.lifecycle.s() { // from class: androidx.core.view.j
            @Override // androidx.lifecycle.s
            public final void g(androidx.lifecycle.v vVar2, p.b bVar) {
                k.a(k.this, cVar, mVar, vVar2, bVar);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<m> it2 = this.f4530b.iterator();
        while (it2.hasNext()) {
            it2.next().b(menu, menuInflater);
        }
    }

    public boolean i(MenuItem menuItem) {
        Iterator<m> it2 = this.f4530b.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void j(m mVar) {
        this.f4530b.remove(mVar);
        a remove = this.f4531c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f4529a.run();
    }
}