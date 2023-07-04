package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static y f6046a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.collection.a<ViewGroup, ArrayList<y>>>> f6047b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f6048c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        y f6049a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f6050b;

        /* renamed from: androidx.transition.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0106a extends z {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f6051a;

            C0106a(androidx.collection.a aVar) {
                this.f6051a = aVar;
            }

            @Override // androidx.transition.z, androidx.transition.y.g
            public void onTransitionEnd(y yVar) {
                ((ArrayList) this.f6051a.get(a.this.f6050b)).remove(yVar);
                yVar.removeListener(this);
            }
        }

        a(y yVar, ViewGroup viewGroup) {
            this.f6049a = yVar;
            this.f6050b = viewGroup;
        }

        private void a() {
            this.f6050b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6050b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (a0.f6048c.remove(this.f6050b)) {
                androidx.collection.a<ViewGroup, ArrayList<y>> c11 = a0.c();
                ArrayList<y> arrayList = c11.get(this.f6050b);
                ArrayList arrayList2 = null;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    c11.put(this.f6050b, arrayList);
                } else if (arrayList.size() > 0) {
                    arrayList2 = new ArrayList(arrayList);
                }
                arrayList.add(this.f6049a);
                this.f6049a.addListener(new C0106a(c11));
                this.f6049a.captureValues(this.f6050b, false);
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((y) it2.next()).resume(this.f6050b);
                    }
                }
                this.f6049a.playTransition(this.f6050b);
                return true;
            }
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            a0.f6048c.remove(this.f6050b);
            ArrayList<y> arrayList = a0.c().get(this.f6050b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<y> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().resume(this.f6050b);
                }
            }
            this.f6049a.clearValues(true);
        }
    }

    public static void a(ViewGroup viewGroup, y yVar) {
        if (f6048c.contains(viewGroup) || !androidx.core.view.a0.a0(viewGroup)) {
            return;
        }
        f6048c.add(viewGroup);
        if (yVar == null) {
            yVar = f6046a;
        }
        y mo5clone = yVar.mo5clone();
        f(viewGroup, mo5clone);
        u.f(viewGroup, null);
        e(viewGroup, mo5clone);
    }

    private static void b(u uVar, y yVar) {
        ViewGroup d11 = uVar.d();
        if (f6048c.contains(d11)) {
            return;
        }
        u c11 = u.c(d11);
        if (yVar == null) {
            if (c11 != null) {
                c11.b();
            }
            uVar.a();
            return;
        }
        f6048c.add(d11);
        y mo5clone = yVar.mo5clone();
        if (c11 != null && c11.e()) {
            mo5clone.setCanRemoveViews(true);
        }
        f(d11, mo5clone);
        uVar.a();
        e(d11, mo5clone);
    }

    static androidx.collection.a<ViewGroup, ArrayList<y>> c() {
        androidx.collection.a<ViewGroup, ArrayList<y>> aVar;
        WeakReference<androidx.collection.a<ViewGroup, ArrayList<y>>> weakReference = f6047b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            androidx.collection.a<ViewGroup, ArrayList<y>> aVar2 = new androidx.collection.a<>();
            f6047b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }

    public static void d(u uVar, y yVar) {
        b(uVar, yVar);
    }

    private static void e(ViewGroup viewGroup, y yVar) {
        if (yVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(yVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void f(ViewGroup viewGroup, y yVar) {
        ArrayList<y> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<y> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().pause(viewGroup);
            }
        }
        if (yVar != null) {
            yVar.captureValues(viewGroup, true);
        }
        u c11 = u.c(viewGroup);
        if (c11 != null) {
            c11.b();
        }
    }
}