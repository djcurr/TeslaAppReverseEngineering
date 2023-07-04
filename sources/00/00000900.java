package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.transition.y;
import java.util.ArrayList;
import java.util.List;
import r3.c;

/* loaded from: classes.dex */
public class h extends androidx.fragment.app.c0 {

    /* loaded from: classes.dex */
    class a extends y.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f6149a;

        a(h hVar, Rect rect) {
            this.f6149a = rect;
        }

        @Override // androidx.transition.y.f
        public Rect a(y yVar) {
            return this.f6149a;
        }
    }

    /* loaded from: classes.dex */
    class b implements y.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6150a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f6151b;

        b(h hVar, View view, ArrayList arrayList) {
            this.f6150a = view;
            this.f6151b = arrayList;
        }

        @Override // androidx.transition.y.g
        public void onTransitionCancel(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            yVar.removeListener(this);
            this.f6150a.setVisibility(8);
            int size = this.f6151b.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((View) this.f6151b.get(i11)).setVisibility(0);
            }
        }

        @Override // androidx.transition.y.g
        public void onTransitionPause(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionResume(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionStart(y yVar) {
            yVar.removeListener(this);
            yVar.addListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c extends z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f6152a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f6153b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f6154c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f6155d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f6156e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f6157f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6152a = obj;
            this.f6153b = arrayList;
            this.f6154c = obj2;
            this.f6155d = arrayList2;
            this.f6156e = obj3;
            this.f6157f = arrayList3;
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            yVar.removeListener(this);
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionStart(y yVar) {
            Object obj = this.f6152a;
            if (obj != null) {
                h.this.w(obj, this.f6153b, null);
            }
            Object obj2 = this.f6154c;
            if (obj2 != null) {
                h.this.w(obj2, this.f6155d, null);
            }
            Object obj3 = this.f6156e;
            if (obj3 != null) {
                h.this.w(obj3, this.f6157f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f6159a;

        d(h hVar, y yVar) {
            this.f6159a = yVar;
        }

        @Override // r3.c.a
        public void onCancel() {
            this.f6159a.cancel();
        }
    }

    /* loaded from: classes.dex */
    class e implements y.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f6160a;

        e(h hVar, Runnable runnable) {
            this.f6160a = runnable;
        }

        @Override // androidx.transition.y.g
        public void onTransitionCancel(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            this.f6160a.run();
        }

        @Override // androidx.transition.y.g
        public void onTransitionPause(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionResume(y yVar) {
        }

        @Override // androidx.transition.y.g
        public void onTransitionStart(y yVar) {
        }
    }

    /* loaded from: classes.dex */
    class f extends y.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f6161a;

        f(h hVar, Rect rect) {
            this.f6161a = rect;
        }

        @Override // androidx.transition.y.f
        public Rect a(y yVar) {
            Rect rect = this.f6161a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f6161a;
        }
    }

    private static boolean v(y yVar) {
        return (androidx.fragment.app.c0.i(yVar.getTargetIds()) && androidx.fragment.app.c0.i(yVar.getTargetNames()) && androidx.fragment.app.c0.i(yVar.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.c0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((y) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.c0
    public void b(Object obj, ArrayList<View> arrayList) {
        y yVar = (y) obj;
        if (yVar == null) {
            return;
        }
        int i11 = 0;
        if (yVar instanceof c0) {
            c0 c0Var = (c0) yVar;
            int i12 = c0Var.i();
            while (i11 < i12) {
                b(c0Var.h(i11), arrayList);
                i11++;
            }
        } else if (v(yVar) || !androidx.fragment.app.c0.i(yVar.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i11 < size) {
                yVar.addTarget(arrayList.get(i11));
                i11++;
            }
        }
    }

    @Override // androidx.fragment.app.c0
    public void c(ViewGroup viewGroup, Object obj) {
        a0.a(viewGroup, (y) obj);
    }

    @Override // androidx.fragment.app.c0
    public boolean e(Object obj) {
        return obj instanceof y;
    }

    @Override // androidx.fragment.app.c0
    public Object f(Object obj) {
        if (obj != null) {
            return ((y) obj).mo5clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.c0
    public Object j(Object obj, Object obj2, Object obj3) {
        y yVar = (y) obj;
        y yVar2 = (y) obj2;
        y yVar3 = (y) obj3;
        if (yVar != null && yVar2 != null) {
            yVar = new c0().f(yVar).f(yVar2).q(1);
        } else if (yVar == null) {
            yVar = yVar2 != null ? yVar2 : null;
        }
        if (yVar3 != null) {
            c0 c0Var = new c0();
            if (yVar != null) {
                c0Var.f(yVar);
            }
            c0Var.f(yVar3);
            return c0Var;
        }
        return yVar;
    }

    @Override // androidx.fragment.app.c0
    public Object k(Object obj, Object obj2, Object obj3) {
        c0 c0Var = new c0();
        if (obj != null) {
            c0Var.f((y) obj);
        }
        if (obj2 != null) {
            c0Var.f((y) obj2);
        }
        if (obj3 != null) {
            c0Var.f((y) obj3);
        }
        return c0Var;
    }

    @Override // androidx.fragment.app.c0
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((y) obj).addListener(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.c0
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((y) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.c0
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((y) obj).setEpicenterCallback(new f(this, rect));
        }
    }

    @Override // androidx.fragment.app.c0
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((y) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.c0
    public void q(Fragment fragment, Object obj, r3.c cVar, Runnable runnable) {
        y yVar = (y) obj;
        cVar.d(new d(this, yVar));
        yVar.addListener(new e(this, runnable));
    }

    @Override // androidx.fragment.app.c0
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        c0 c0Var = (c0) obj;
        List<View> targets = c0Var.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.fragment.app.c0.d(targets, arrayList.get(i11));
        }
        targets.add(view);
        arrayList.add(view);
        b(c0Var, arrayList);
    }

    @Override // androidx.fragment.app.c0
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        c0 c0Var = (c0) obj;
        if (c0Var != null) {
            c0Var.getTargets().clear();
            c0Var.getTargets().addAll(arrayList2);
            w(c0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.c0
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        c0 c0Var = new c0();
        c0Var.f((y) obj);
        return c0Var;
    }

    public void w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        y yVar = (y) obj;
        int i11 = 0;
        if (yVar instanceof c0) {
            c0 c0Var = (c0) yVar;
            int i12 = c0Var.i();
            while (i11 < i12) {
                w(c0Var.h(i11), arrayList, arrayList2);
                i11++;
            }
        } else if (!v(yVar)) {
            List<View> targets = yVar.getTargets();
            if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i11 < size) {
                    yVar.addTarget(arrayList2.get(i11));
                    i11++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    yVar.removeTarget(arrayList.get(size2));
                }
            }
        }
    }
}