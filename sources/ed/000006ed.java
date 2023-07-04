package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f4899a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final q f4900b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final q.j f4901a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f4902b;

        a(q.j jVar, boolean z11) {
            this.f4901a = jVar;
            this.f4902b = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(q qVar) {
        this.f4900b = qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().a(fragment, bundle, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentActivityCreated(this.f4900b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z11) {
        Context f11 = this.f4900b.t0().f();
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().b(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentAttached(this.f4900b, fragment, f11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().c(fragment, bundle, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentCreated(this.f4900b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().d(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentDestroyed(this.f4900b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().e(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentDetached(this.f4900b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().f(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentPaused(this.f4900b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z11) {
        Context f11 = this.f4900b.t0().f();
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().g(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentPreAttached(this.f4900b, fragment, f11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().h(fragment, bundle, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentPreCreated(this.f4900b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().i(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentResumed(this.f4900b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().j(fragment, bundle, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentSaveInstanceState(this.f4900b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().k(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentStarted(this.f4900b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().l(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentStopped(this.f4900b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().m(fragment, view, bundle, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentViewCreated(this.f4900b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z11) {
        Fragment w02 = this.f4900b.w0();
        if (w02 != null) {
            w02.getParentFragmentManager().v0().n(fragment, true);
        }
        Iterator<a> it2 = this.f4899a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f4902b) {
                next.f4901a.onFragmentViewDestroyed(this.f4900b, fragment);
            }
        }
    }

    public void o(q.j jVar, boolean z11) {
        this.f4899a.add(new a(jVar, z11));
    }
}