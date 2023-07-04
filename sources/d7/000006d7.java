package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f4863a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<e> f4864b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<e> f4865c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f4866d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f4867e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f4868a;

        a(d dVar) {
            this.f4868a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g0.this.f4864b.contains(this.f4868a)) {
                this.f4868a.e().applyState(this.f4868a.f().mView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f4870a;

        b(d dVar) {
            this.f4870a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.f4864b.remove(this.f4870a);
            g0.this.f4865c.remove(this.f4870a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4872a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f4873b;

        static {
            int[] iArr = new int[e.b.values().length];
            f4873b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4873b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4873b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f4872a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4872a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4872a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4872a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final x f4874h;

        d(e.c cVar, e.b bVar, x xVar, r3.c cVar2) {
            super(cVar, bVar, xVar.k(), cVar2);
            this.f4874h = xVar;
        }

        @Override // androidx.fragment.app.g0.e
        public void c() {
            super.c();
            this.f4874h.m();
        }

        @Override // androidx.fragment.app.g0.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment k11 = this.f4874h.k();
                View findFocus = k11.mView.findFocus();
                if (findFocus != null) {
                    k11.setFocusedView(findFocus);
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k11);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f4874h.b();
                    requireView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                }
                if (requireView.getAlpha() == BitmapDescriptorFactory.HUE_RED && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k11.getPostOnViewCreatedAlpha());
            } else if (g() == e.b.REMOVING) {
                Fragment k12 = this.f4874h.k();
                View requireView2 = k12.requireView();
                if (q.G0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + k12);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(ViewGroup viewGroup) {
        this.f4863a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, x xVar) {
        synchronized (this.f4864b) {
            r3.c cVar2 = new r3.c();
            e h11 = h(xVar.k());
            if (h11 != null) {
                h11.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, xVar, cVar2);
            this.f4864b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it2 = this.f4864b.iterator();
        while (it2.hasNext()) {
            e next = it2.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it2 = this.f4865c.iterator();
        while (it2.hasNext()) {
            e next = it2.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 n(ViewGroup viewGroup, q qVar) {
        return o(viewGroup, qVar.y0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g0 o(ViewGroup viewGroup, h0 h0Var) {
        int i11 = g4.b.f27701b;
        Object tag = viewGroup.getTag(i11);
        if (tag instanceof g0) {
            return (g0) tag;
        }
        g0 a11 = h0Var.a(viewGroup);
        viewGroup.setTag(i11, a11);
        return a11;
    }

    private void q() {
        Iterator<e> it2 = this.f4864b.iterator();
        while (it2.hasNext()) {
            e next = it2.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.from(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.c cVar, x xVar) {
        if (q.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + xVar.k());
        }
        a(cVar, e.b.ADDING, xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(x xVar) {
        if (q.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + xVar.k());
        }
        a(e.c.GONE, e.b.NONE, xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(x xVar) {
        if (q.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + xVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, xVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(x xVar) {
        if (q.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + xVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, xVar);
    }

    abstract void f(List<e> list, boolean z11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f4867e) {
            return;
        }
        if (!androidx.core.view.a0.Y(this.f4863a)) {
            j();
            this.f4866d = false;
            return;
        }
        synchronized (this.f4864b) {
            if (!this.f4864b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f4865c);
                this.f4865c.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f4865c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f4864b);
                this.f4864b.clear();
                this.f4865c.addAll(arrayList2);
                if (q.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((e) it3.next()).l();
                }
                f(arrayList2, this.f4866d);
                this.f4866d = false;
                if (q.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        if (q.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean Y = androidx.core.view.a0.Y(this.f4863a);
        synchronized (this.f4864b) {
            q();
            Iterator<e> it2 = this.f4864b.iterator();
            while (it2.hasNext()) {
                it2.next().l();
            }
            Iterator it3 = new ArrayList(this.f4865c).iterator();
            while (it3.hasNext()) {
                e eVar = (e) it3.next();
                if (q.G0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (Y) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f4863a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.b();
            }
            Iterator it4 = new ArrayList(this.f4864b).iterator();
            while (it4.hasNext()) {
                e eVar2 = (e) it4.next();
                if (q.G0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (Y) {
                        str = "";
                    } else {
                        str = "Container " + this.f4863a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.f4867e) {
            if (q.G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f4867e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b l(x xVar) {
        e h11 = h(xVar.k());
        e.b g11 = h11 != null ? h11.g() : null;
        e i11 = i(xVar.k());
        return (i11 == null || !(g11 == null || g11 == e.b.NONE)) ? g11 : i11.g();
    }

    public ViewGroup m() {
        return this.f4863a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f4864b) {
            q();
            this.f4867e = false;
            int size = this.f4864b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f4864b.get(size);
                e.c from = e.c.from(eVar.f().mView);
                e.c e11 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e11 == cVar && from != cVar) {
                    this.f4867e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z11) {
        this.f4866d = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private c f4875a;

        /* renamed from: b  reason: collision with root package name */
        private b f4876b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f4877c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f4878d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<r3.c> f4879e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f4880f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f4881g = false;

        /* loaded from: classes.dex */
        class a implements c.a {
            a() {
            }

            @Override // r3.c.a
            public void onCancel() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        e(c cVar, b bVar, Fragment fragment, r3.c cVar2) {
            this.f4875a = cVar;
            this.f4876b = bVar;
            this.f4877c = fragment;
            cVar2.d(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f4878d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f4880f = true;
            if (this.f4879e.isEmpty()) {
                c();
                return;
            }
            Iterator it2 = new ArrayList(this.f4879e).iterator();
            while (it2.hasNext()) {
                ((r3.c) it2.next()).a();
            }
        }

        public void c() {
            if (this.f4881g) {
                return;
            }
            if (q.G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f4881g = true;
            for (Runnable runnable : this.f4878d) {
                runnable.run();
            }
        }

        public final void d(r3.c cVar) {
            if (this.f4879e.remove(cVar) && this.f4879e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f4875a;
        }

        public final Fragment f() {
            return this.f4877c;
        }

        b g() {
            return this.f4876b;
        }

        final boolean h() {
            return this.f4880f;
        }

        final boolean i() {
            return this.f4881g;
        }

        public final void j(r3.c cVar) {
            l();
            this.f4879e.add(cVar);
        }

        final void k(c cVar, b bVar) {
            int i11 = c.f4873b[bVar.ordinal()];
            if (i11 == 1) {
                if (this.f4875a == c.REMOVED) {
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4877c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f4876b + " to ADDING.");
                    }
                    this.f4875a = c.VISIBLE;
                    this.f4876b = b.ADDING;
                }
            } else if (i11 != 2) {
                if (i11 == 3 && this.f4875a != c.REMOVED) {
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4877c + " mFinalState = " + this.f4875a + " -> " + cVar + ". ");
                    }
                    this.f4875a = cVar;
                }
            } else {
                if (q.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f4877c + " mFinalState = " + this.f4875a + " -> REMOVED. mLifecycleImpact  = " + this.f4876b + " to REMOVING.");
                }
                this.f4875a = c.REMOVED;
                this.f4876b = b.REMOVING;
            }
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f4875a + "} {mLifecycleImpact = " + this.f4876b + "} {mFragment = " + this.f4877c + "}";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c from(View view) {
                if (view.getAlpha() == BitmapDescriptorFactory.HUE_RED && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void applyState(View view) {
                int i11 = c.f4872a[ordinal()];
                if (i11 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (q.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i11 == 2) {
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i11 == 3) {
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i11 != 4) {
                } else {
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c from(int i11) {
                if (i11 != 0) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i11);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }
        }
    }
}