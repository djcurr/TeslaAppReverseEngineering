package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.g0;
import androidx.fragment.app.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r3.c;

/* loaded from: classes.dex */
class d extends g0 {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4809a;

        static {
            int[] iArr = new int[g0.e.c.values().length];
            f4809a = iArr;
            try {
                iArr[g0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4809a[g0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4809a[g0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4809a[g0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f4810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0.e f4811b;

        b(List list, g0.e eVar) {
            this.f4810a = list;
            this.f4811b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4810a.contains(this.f4811b)) {
                this.f4810a.remove(this.f4811b);
                d.this.s(this.f4811b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4813a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4814b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f4815c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g0.e f4816d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f4817e;

        c(d dVar, ViewGroup viewGroup, View view, boolean z11, g0.e eVar, k kVar) {
            this.f4813a = viewGroup;
            this.f4814b = view;
            this.f4815c = z11;
            this.f4816d = eVar;
            this.f4817e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4813a.endViewTransition(this.f4814b);
            if (this.f4815c) {
                this.f4816d.e().applyState(this.f4814b);
            }
            this.f4817e.a();
            if (q.G0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4816d + " has ended.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0080d implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f4818a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0.e f4819b;

        C0080d(d dVar, Animator animator, g0.e eVar) {
            this.f4818a = animator;
            this.f4819b = eVar;
        }

        @Override // r3.c.a
        public void onCancel() {
            this.f4818a.end();
            if (q.G0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f4819b + " has been canceled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0.e f4820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4821b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f4822c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f4823d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f4821b.endViewTransition(eVar.f4822c);
                e.this.f4823d.a();
            }
        }

        e(d dVar, g0.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f4820a = eVar;
            this.f4821b = viewGroup;
            this.f4822c = view;
            this.f4823d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4821b.post(new a());
            if (q.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4820a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (q.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4820a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f4825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4826b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f4827c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g0.e f4828d;

        f(d dVar, View view, ViewGroup viewGroup, k kVar, g0.e eVar) {
            this.f4825a = view;
            this.f4826b = viewGroup;
            this.f4827c = kVar;
            this.f4828d = eVar;
        }

        @Override // r3.c.a
        public void onCancel() {
            this.f4825a.clearAnimation();
            this.f4826b.endViewTransition(this.f4825a);
            this.f4827c.a();
            if (q.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f4828d + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0.e f4829a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0.e f4830b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f4831c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f4832d;

        g(d dVar, g0.e eVar, g0.e eVar2, boolean z11, androidx.collection.a aVar) {
            this.f4829a = eVar;
            this.f4830b = eVar2;
            this.f4831c = z11;
            this.f4832d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.a(this.f4829a.f(), this.f4830b.f(), this.f4831c, this.f4832d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0 f4833a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4834b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f4835c;

        h(d dVar, c0 c0Var, View view, Rect rect) {
            this.f4833a = c0Var;
            this.f4834b = view;
            this.f4835c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4833a.h(this.f4834b, this.f4835c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f4836a;

        i(d dVar, ArrayList arrayList) {
            this.f4836a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.d(this.f4836a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f4837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g0.e f4838b;

        j(d dVar, m mVar, g0.e eVar) {
            this.f4837a = mVar;
            this.f4838b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4837a.a();
            if (q.G0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f4838b + "has completed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f4839c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4840d;

        /* renamed from: e  reason: collision with root package name */
        private i.a f4841e;

        k(g0.e eVar, r3.c cVar, boolean z11) {
            super(eVar, cVar);
            this.f4840d = false;
            this.f4839c = z11;
        }

        i.a e(Context context) {
            if (this.f4840d) {
                return this.f4841e;
            }
            i.a b11 = androidx.fragment.app.i.b(context, b().f(), b().e() == g0.e.c.VISIBLE, this.f4839c);
            this.f4841e = b11;
            this.f4840d = true;
            return b11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        private final g0.e f4842a;

        /* renamed from: b  reason: collision with root package name */
        private final r3.c f4843b;

        l(g0.e eVar, r3.c cVar) {
            this.f4842a = eVar;
            this.f4843b = cVar;
        }

        void a() {
            this.f4842a.d(this.f4843b);
        }

        g0.e b() {
            return this.f4842a;
        }

        r3.c c() {
            return this.f4843b;
        }

        boolean d() {
            g0.e.c cVar;
            g0.e.c from = g0.e.c.from(this.f4842a.f().mView);
            g0.e.c e11 = this.f4842a.e();
            return from == e11 || !(from == (cVar = g0.e.c.VISIBLE) || e11 == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f4844c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f4845d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f4846e;

        m(g0.e eVar, r3.c cVar, boolean z11, boolean z12) {
            super(eVar, cVar);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (eVar.e() == g0.e.c.VISIBLE) {
                if (z11) {
                    enterTransition = eVar.f().getReenterTransition();
                } else {
                    enterTransition = eVar.f().getEnterTransition();
                }
                this.f4844c = enterTransition;
                if (z11) {
                    allowEnterTransitionOverlap = eVar.f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = eVar.f().getAllowEnterTransitionOverlap();
                }
                this.f4845d = allowEnterTransitionOverlap;
            } else {
                if (z11) {
                    exitTransition = eVar.f().getReturnTransition();
                } else {
                    exitTransition = eVar.f().getExitTransition();
                }
                this.f4844c = exitTransition;
                this.f4845d = true;
            }
            if (!z12) {
                this.f4846e = null;
            } else if (z11) {
                this.f4846e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.f4846e = eVar.f().getSharedElementEnterTransition();
            }
        }

        private c0 f(Object obj) {
            if (obj == null) {
                return null;
            }
            c0 c0Var = a0.f4774a;
            if (c0Var == null || !c0Var.e(obj)) {
                c0 c0Var2 = a0.f4775b;
                if (c0Var2 == null || !c0Var2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return c0Var2;
            }
            return c0Var;
        }

        c0 e() {
            c0 f11 = f(this.f4844c);
            c0 f12 = f(this.f4846e);
            if (f11 == null || f12 == null || f11 == f12) {
                return f11 != null ? f11 : f12;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f4844c + " which uses a different Transition  type than its shared element transition " + this.f4846e);
        }

        public Object g() {
            return this.f4846e;
        }

        Object h() {
            return this.f4844c;
        }

        public boolean i() {
            return this.f4846e != null;
        }

        boolean j() {
            return this.f4845d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<g0.e> list2, boolean z11, Map<g0.e, Boolean> map) {
        int i11;
        boolean z12;
        int i12;
        g0.e eVar;
        ViewGroup m11 = m();
        Context context = m11.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it2 = list.iterator();
        boolean z13 = false;
        while (true) {
            i11 = 2;
            if (!it2.hasNext()) {
                break;
            }
            k next = it2.next();
            if (next.d()) {
                next.a();
            } else {
                i.a e11 = next.e(context);
                if (e11 == null) {
                    next.a();
                } else {
                    Animator animator = e11.f4885b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        g0.e b11 = next.b();
                        Fragment f11 = b11.f();
                        if (Boolean.TRUE.equals(map.get(b11))) {
                            if (q.G0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f11 + " as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            boolean z14 = b11.e() == g0.e.c.GONE;
                            if (z14) {
                                list2.remove(b11);
                            }
                            View view = f11.mView;
                            m11.startViewTransition(view);
                            animator.addListener(new c(this, m11, view, z14, b11, next));
                            animator.setTarget(view);
                            animator.start();
                            if (q.G0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Animator from operation ");
                                eVar = b11;
                                sb2.append(eVar);
                                sb2.append(" has started.");
                                Log.v("FragmentManager", sb2.toString());
                            } else {
                                eVar = b11;
                            }
                            next.c().d(new C0080d(this, animator, eVar));
                            z13 = true;
                        }
                    }
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            k kVar = (k) it3.next();
            g0.e b12 = kVar.b();
            Fragment f12 = b12.f();
            if (z11) {
                if (q.G0(i11)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f12 + " as Animations cannot run alongside Transitions.");
                }
                kVar.a();
            } else if (z13) {
                if (q.G0(i11)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f12 + " as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view2 = f12.mView;
                Animation animation = (Animation) v3.h.f(((i.a) v3.h.f(kVar.e(context))).f4884a);
                if (b12.e() != g0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                    z12 = z13;
                    i12 = i11;
                } else {
                    m11.startViewTransition(view2);
                    i.b bVar = new i.b(animation, m11, view2);
                    z12 = z13;
                    bVar.setAnimationListener(new e(this, b12, m11, view2, kVar));
                    view2.startAnimation(bVar);
                    i12 = 2;
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + b12 + " has started.");
                    }
                }
                kVar.c().d(new f(this, view2, m11, kVar, b12));
                i11 = i12;
                z13 = z12;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<g0.e, Boolean> x(List<m> list, List<g0.e> list2, boolean z11, g0.e eVar, g0.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        HashMap hashMap;
        View view2;
        Object k11;
        androidx.collection.a aVar;
        ArrayList<View> arrayList3;
        g0.e eVar3;
        ArrayList<View> arrayList4;
        Rect rect;
        c0 c0Var;
        HashMap hashMap2;
        g0.e eVar4;
        View view3;
        View view4;
        View view5;
        boolean z12 = z11;
        g0.e eVar5 = eVar;
        g0.e eVar6 = eVar2;
        HashMap hashMap3 = new HashMap();
        c0 c0Var2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                c0 e11 = mVar.e();
                if (c0Var2 == null) {
                    c0Var2 = e11;
                } else if (e11 != null && c0Var2 != e11) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (c0Var2 == null) {
            for (m mVar2 : list) {
                hashMap3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap3;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Iterator<m> it2 = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z13 = false;
        while (true) {
            str = "FragmentManager";
            if (!it2.hasNext()) {
                break;
            }
            m next = it2.next();
            if (!next.i() || eVar5 == null || eVar6 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar3 = eVar5;
                arrayList4 = arrayList5;
                rect = rect2;
                c0Var = c0Var2;
                hashMap2 = hashMap3;
                View view8 = view6;
                eVar4 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object u11 = c0Var2.u(c0Var2.f(next.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view9 = view7;
                int i11 = 0;
                while (i11 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i11));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i11));
                    }
                    i11++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (!z12) {
                    eVar.f().getExitTransitionCallback();
                    eVar2.f().getEnterTransitionCallback();
                } else {
                    eVar.f().getEnterTransitionCallback();
                    eVar2.f().getExitTransitionCallback();
                }
                int i12 = 0;
                for (int size = sharedElementSourceNames.size(); i12 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i12), sharedElementTargetNames2.get(i12));
                    i12++;
                }
                if (q.G0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    Iterator<String> it3 = sharedElementTargetNames2.iterator();
                    while (it3.hasNext()) {
                        Iterator<String> it4 = it3;
                        Log.v("FragmentManager", "Name: " + it3.next());
                        it3 = it4;
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    Iterator<String> it5 = sharedElementSourceNames.iterator();
                    while (it5.hasNext()) {
                        Iterator<String> it6 = it5;
                        Log.v("FragmentManager", "Name: " + it5.next());
                        it5 = it6;
                    }
                }
                androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
                u(aVar3, eVar.f().mView);
                aVar3.q(sharedElementSourceNames);
                aVar2.q(aVar3.keySet());
                androidx.collection.a<String, View> aVar4 = new androidx.collection.a<>();
                u(aVar4, eVar2.f().mView);
                aVar4.q(sharedElementTargetNames2);
                aVar4.q(aVar2.values());
                a0.c(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar3 = eVar5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    c0Var = c0Var2;
                    view7 = view9;
                    obj3 = null;
                    eVar4 = eVar2;
                    hashMap2 = hashMap3;
                } else {
                    a0.a(eVar2.f(), eVar.f(), z12, aVar3, true);
                    HashMap hashMap4 = hashMap3;
                    View view10 = view6;
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    androidx.core.view.x.a(m(), new g(this, eVar2, eVar, z11, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view7 = view9;
                    } else {
                        View view11 = aVar3.get(sharedElementSourceNames.get(0));
                        c0Var2.p(u11, view11);
                        view7 = view11;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = aVar4.get(sharedElementTargetNames2.get(0))) == null) {
                        view4 = view10;
                    } else {
                        androidx.core.view.x.a(m(), new h(this, c0Var2, view5, rect2));
                        view4 = view10;
                        z13 = true;
                    }
                    c0Var2.s(u11, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    c0Var = c0Var2;
                    c0Var2.n(u11, null, null, null, null, u11, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    hashMap2 = hashMap4;
                    hashMap2.put(eVar3, bool);
                    eVar4 = eVar2;
                    hashMap2.put(eVar4, bool);
                    obj3 = u11;
                }
            }
            eVar5 = eVar3;
            arrayList5 = arrayList4;
            rect2 = rect;
            hashMap3 = hashMap2;
            aVar2 = aVar;
            z12 = z11;
            arrayList6 = arrayList3;
            c0Var2 = c0Var;
            g0.e eVar7 = eVar4;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view12 = view7;
        androidx.collection.a aVar5 = aVar2;
        Collection<?> collection = arrayList6;
        g0.e eVar8 = eVar5;
        Collection<?> collection2 = arrayList5;
        Rect rect3 = rect2;
        c0 c0Var3 = c0Var2;
        HashMap hashMap5 = hashMap3;
        View view13 = view6;
        g0.e eVar9 = eVar6;
        View view14 = view13;
        ArrayList arrayList9 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar3 : list) {
            if (mVar3.d()) {
                hashMap5.put(mVar3.b(), Boolean.FALSE);
                mVar3.a();
            } else {
                Object f11 = c0Var3.f(mVar3.h());
                g0.e b11 = mVar3.b();
                boolean z14 = obj3 != null && (b11 == eVar8 || b11 == eVar9);
                if (f11 == null) {
                    if (!z14) {
                        hashMap5.put(b11, Boolean.FALSE);
                        mVar3.a();
                    }
                    arrayList2 = collection;
                    str3 = str;
                    arrayList = collection2;
                    view = view14;
                    k11 = obj4;
                    hashMap = hashMap5;
                    view2 = view12;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList10, b11.f().mView);
                    if (z14) {
                        if (b11 == eVar8) {
                            arrayList10.removeAll(collection2);
                        } else {
                            arrayList10.removeAll(collection);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        c0Var3.a(f11, view14);
                        arrayList2 = collection;
                        arrayList = collection2;
                        view = view14;
                        obj2 = obj5;
                        hashMap = hashMap5;
                        obj = obj6;
                    } else {
                        c0Var3.b(f11, arrayList10);
                        view = view14;
                        obj = obj6;
                        arrayList = collection2;
                        obj2 = obj5;
                        arrayList2 = collection;
                        hashMap = hashMap5;
                        c0Var3.n(f11, f11, arrayList10, null, null, null, null);
                        if (b11.e() == g0.e.c.GONE) {
                            list2.remove(b11);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(b11.f().mView);
                            c0Var3.m(f11, b11.f().mView, arrayList11);
                            androidx.core.view.x.a(m(), new i(this, arrayList10));
                        }
                    }
                    if (b11.e() == g0.e.c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z13) {
                            c0Var3.o(f11, rect3);
                        }
                        view2 = view12;
                    } else {
                        view2 = view12;
                        c0Var3.p(f11, view2);
                    }
                    hashMap.put(b11, Boolean.TRUE);
                    if (mVar3.j()) {
                        obj5 = c0Var3.k(obj2, f11, null);
                        k11 = obj;
                    } else {
                        k11 = c0Var3.k(obj, f11, null);
                        obj5 = obj2;
                    }
                }
                eVar9 = eVar2;
                hashMap5 = hashMap;
                obj4 = k11;
                view12 = view2;
                str = str3;
                view14 = view;
                collection2 = arrayList;
                collection = arrayList2;
            }
        }
        ArrayList<View> arrayList12 = collection;
        String str4 = str;
        ArrayList<View> arrayList13 = collection2;
        HashMap hashMap6 = hashMap5;
        Object j11 = c0Var3.j(obj5, obj4, obj3);
        if (j11 == null) {
            return hashMap6;
        }
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object h11 = mVar4.h();
                g0.e b12 = mVar4.b();
                HashMap hashMap7 = hashMap6;
                boolean z15 = obj3 != null && (b12 == eVar8 || b12 == eVar2);
                if (h11 == null && !z15) {
                    str2 = str4;
                } else if (!androidx.core.view.a0.a0(m())) {
                    if (q.G0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b12);
                    } else {
                        str2 = str4;
                    }
                    mVar4.a();
                } else {
                    str2 = str4;
                    c0Var3.q(mVar4.b().f(), j11, mVar4.c(), new j(this, mVar4, b12));
                }
                hashMap6 = hashMap7;
                str4 = str2;
            }
        }
        HashMap hashMap8 = hashMap6;
        String str5 = str4;
        if (androidx.core.view.a0.a0(m())) {
            a0.d(arrayList9, 4);
            ArrayList<String> l11 = c0Var3.l(arrayList12);
            if (q.G0(2)) {
                Log.v(str5, ">>>>> Beginning transition <<<<<");
                Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it7 = arrayList13.iterator();
                while (it7.hasNext()) {
                    View next2 = it7.next();
                    Log.v(str5, "View: " + next2 + " Name: " + androidx.core.view.a0.O(next2));
                }
                Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it8 = arrayList12.iterator();
                while (it8.hasNext()) {
                    View next3 = it8.next();
                    Log.v(str5, "View: " + next3 + " Name: " + androidx.core.view.a0.O(next3));
                }
            }
            c0Var3.c(m(), j11);
            c0Var3.r(m(), arrayList13, arrayList12, l11, aVar5);
            a0.d(arrayList9, 0);
            c0Var3.t(obj3, arrayList13, arrayList12);
            return hashMap8;
        }
        return hashMap8;
    }

    @Override // androidx.fragment.app.g0
    void f(List<g0.e> list, boolean z11) {
        g0.e eVar = null;
        g0.e eVar2 = null;
        for (g0.e eVar3 : list) {
            g0.e.c from = g0.e.c.from(eVar3.f().mView);
            int i11 = a.f4809a[eVar3.e().ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                if (i11 == 4 && from != g0.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (from == g0.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        if (q.G0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<g0.e> arrayList3 = new ArrayList(list);
        for (g0.e eVar4 : list) {
            r3.c cVar = new r3.c();
            eVar4.j(cVar);
            arrayList.add(new k(eVar4, cVar, z11));
            r3.c cVar2 = new r3.c();
            eVar4.j(cVar2);
            boolean z12 = false;
            if (z11) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, cVar2, z11, z12));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z12 = true;
                arrayList2.add(new m(eVar4, cVar2, z11, z12));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, cVar2, z11, z12));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z12 = true;
                arrayList2.add(new m(eVar4, cVar2, z11, z12));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<g0.e, Boolean> x11 = x(arrayList2, arrayList3, z11, eVar, eVar2);
        w(arrayList, arrayList3, x11.containsValue(Boolean.TRUE), x11);
        for (g0.e eVar5 : arrayList3) {
            s(eVar5);
        }
        arrayList3.clear();
        if (q.G0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    void s(g0.e eVar) {
        eVar.e().applyState(eVar.f().mView);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (androidx.core.view.d0.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    void u(Map<String, View> map, View view) {
        String O = androidx.core.view.a0.O(view);
        if (O != null) {
            map.put(O, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it2 = aVar.entrySet().iterator();
        while (it2.hasNext()) {
            if (!collection.contains(androidx.core.view.a0.O(it2.next().getValue()))) {
                it2.remove();
            }
        }
    }
}