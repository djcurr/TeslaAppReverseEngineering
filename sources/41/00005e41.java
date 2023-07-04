package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;
import com.facebook.react.modules.core.g;
import com.swmansion.rnscreens.d;
import com.swmansion.rnscreens.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import wz.e0;

/* loaded from: classes6.dex */
public class f<T extends i> extends ViewGroup {

    /* renamed from: a */
    protected final ArrayList<T> f21242a;

    /* renamed from: b */
    protected androidx.fragment.app.q f21243b;

    /* renamed from: c */
    private boolean f21244c;

    /* renamed from: d */
    private boolean f21245d;

    /* renamed from: e */
    private boolean f21246e;

    /* renamed from: f */
    private final a.AbstractC0228a f21247f;

    /* renamed from: g */
    private i f21248g;

    /* loaded from: classes6.dex */
    public static final class a extends a.AbstractC0228a {

        /* renamed from: a */
        final /* synthetic */ f<T> f21249a;

        a(f<T> fVar) {
            this.f21249a = fVar;
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0228a
        public void doFrame(long j11) {
            ((f) this.f21249a).f21246e = false;
            f<T> fVar = this.f21249a;
            fVar.measure(View.MeasureSpec.makeMeasureSpec(fVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f21249a.getHeight(), 1073741824));
            f<T> fVar2 = this.f21249a;
            fVar2.layout(fVar2.getLeft(), this.f21249a.getTop(), this.f21249a.getRight(), this.f21249a.getBottom());
        }
    }

    public f(Context context) {
        super(context);
        this.f21242a = new ArrayList<>();
        this.f21247f = new a(this);
    }

    public static /* synthetic */ void a(f fVar) {
        o(fVar);
    }

    private final void e(z zVar, i iVar) {
        zVar.b(getId(), iVar);
    }

    private final void g(z zVar, i iVar) {
        zVar.o(iVar);
    }

    private final d.a h(i iVar) {
        return iVar.m().getActivityState();
    }

    private final void n() {
        this.f21245d = true;
        Context context = getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null) {
            return;
        }
        reactContext.runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.e
            {
                f.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f.a(f.this);
            }
        });
    }

    public static final void o(f this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.q();
    }

    private final void setFragmentManager(androidx.fragment.app.q qVar) {
        this.f21243b = qVar;
        r();
    }

    private final void t(androidx.fragment.app.q qVar) {
        z m11 = qVar.m();
        kotlin.jvm.internal.s.f(m11, "fragmentManager.beginTransaction()");
        boolean z11 = false;
        for (Fragment fragment : qVar.s0()) {
            if ((fragment instanceof i) && ((i) fragment).m().getContainer() == this) {
                m11.o(fragment);
                z11 = true;
            }
        }
        if (z11) {
            m11.k();
        }
    }

    private final void v() {
        boolean z11;
        boolean z12;
        ViewParent viewParent = this;
        while (true) {
            z11 = viewParent instanceof com.facebook.react.z;
            if (z11 || (viewParent instanceof d) || viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
            kotlin.jvm.internal.s.f(viewParent, "parent.parent");
        }
        if (viewParent instanceof d) {
            i fragment = ((d) viewParent).getFragment();
            if (fragment != null) {
                this.f21248g = fragment;
                fragment.t(this);
                androidx.fragment.app.q childFragmentManager = fragment.getChildFragmentManager();
                kotlin.jvm.internal.s.f(childFragmentManager, "screenFragment.childFragmentManager");
                setFragmentManager(childFragmentManager);
                return;
            }
            throw new IllegalStateException("Parent Screen does not have its Fragment attached".toString());
        } else if (z11) {
            Context context = ((com.facebook.react.z) viewParent).getContext();
            while (true) {
                z12 = context instanceof androidx.fragment.app.h;
                if (z12 || !(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (z12) {
                androidx.fragment.app.q supportFragmentManager = ((androidx.fragment.app.h) context).getSupportFragmentManager();
                kotlin.jvm.internal.s.f(supportFragmentManager, "context.supportFragmentManager");
                setFragmentManager(supportFragmentManager);
                return;
            }
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactFragmentActivity or ReactCompatActivity".toString());
        } else {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView".toString());
        }
    }

    protected T c(d screen) {
        kotlin.jvm.internal.s.g(screen, "screen");
        return (T) new i(screen);
    }

    public final void d(d screen, int i11) {
        kotlin.jvm.internal.s.g(screen, "screen");
        T c11 = c(screen);
        screen.setFragment(c11);
        this.f21242a.add(i11, c11);
        screen.setContainer(this);
        n();
    }

    public final z f() {
        androidx.fragment.app.q qVar = this.f21243b;
        if (qVar != null) {
            z m11 = qVar.m();
            kotlin.jvm.internal.s.f(m11, "fragmentManager.beginTransaction()");
            m11.x(true);
            return m11;
        }
        throw new IllegalArgumentException("mFragmentManager is null when creating transaction".toString());
    }

    public final int getScreenCount() {
        return this.f21242a.size();
    }

    public d getTopScreen() {
        Iterator<T> it2 = this.f21242a.iterator();
        while (it2.hasNext()) {
            T screenFragment = it2.next();
            kotlin.jvm.internal.s.f(screenFragment, "screenFragment");
            if (h(screenFragment) == d.a.ON_TOP) {
                return screenFragment.m();
            }
        }
        return null;
    }

    public final d i(int i11) {
        return this.f21242a.get(i11).m();
    }

    public boolean j(i iVar) {
        boolean T;
        T = e0.T(this.f21242a, iVar);
        return T;
    }

    public final boolean k() {
        return this.f21248g != null;
    }

    public final void l() {
        r();
    }

    protected void m() {
        i fragment;
        d topScreen = getTopScreen();
        if (topScreen == null || (fragment = topScreen.getFragment()) == null) {
            return;
        }
        fragment.n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21244c = true;
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.fragment.app.q qVar = this.f21243b;
        if (qVar != null && !qVar.F0()) {
            t(qVar);
            qVar.d0();
        }
        i iVar = this.f21248g;
        if (iVar != null) {
            iVar.x(this);
        }
        this.f21248g = null;
        super.onDetachedFromWindow();
        this.f21244c = false;
        int childCount = getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        while (true) {
            int i11 = childCount - 1;
            removeViewAt(childCount);
            if (i11 < 0) {
                return;
            }
            childCount = i11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            getChildAt(i15).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13).measure(i11, i12);
        }
    }

    public void p() {
        z f11 = f();
        androidx.fragment.app.q qVar = this.f21243b;
        if (qVar != null) {
            HashSet hashSet = new HashSet(qVar.s0());
            Iterator<T> it2 = this.f21242a.iterator();
            while (it2.hasNext()) {
                T screenFragment = it2.next();
                kotlin.jvm.internal.s.f(screenFragment, "screenFragment");
                if (h(screenFragment) == d.a.INACTIVE && screenFragment.isAdded()) {
                    g(f11, screenFragment);
                }
                hashSet.remove(screenFragment);
            }
            boolean z11 = false;
            if (!hashSet.isEmpty()) {
                Object[] array = hashSet.toArray(new Fragment[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                Fragment[] fragmentArr = (Fragment[]) array;
                int length = fragmentArr.length;
                int i11 = 0;
                while (i11 < length) {
                    Fragment fragment = fragmentArr[i11];
                    i11++;
                    if (fragment instanceof i) {
                        i iVar = (i) fragment;
                        if (iVar.m().getContainer() == null) {
                            g(f11, iVar);
                        }
                    }
                }
            }
            boolean z12 = getTopScreen() == null;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it3 = this.f21242a.iterator();
            while (it3.hasNext()) {
                T screenFragment2 = it3.next();
                kotlin.jvm.internal.s.f(screenFragment2, "screenFragment");
                d.a h11 = h(screenFragment2);
                d.a aVar = d.a.INACTIVE;
                if (h11 != aVar && !screenFragment2.isAdded()) {
                    e(f11, screenFragment2);
                    z11 = true;
                } else if (h11 != aVar && z11) {
                    g(f11, screenFragment2);
                    arrayList.add(screenFragment2);
                }
                screenFragment2.m().setTransitioning(z12);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                i screenFragment3 = (i) it4.next();
                kotlin.jvm.internal.s.f(screenFragment3, "screenFragment");
                e(f11, screenFragment3);
            }
            f11.k();
            return;
        }
        throw new IllegalArgumentException("mFragmentManager is null when performing update in ScreenContainer".toString());
    }

    public final void q() {
        androidx.fragment.app.q qVar;
        if (this.f21245d && this.f21244c && (qVar = this.f21243b) != null) {
            if (qVar != null && qVar.F0()) {
                return;
            }
            this.f21245d = false;
            p();
            m();
        }
    }

    public final void r() {
        this.f21245d = true;
        q();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f21246e || this.f21247f == null) {
            return;
        }
        this.f21246e = true;
        com.facebook.react.modules.core.g.i().m(g.c.NATIVE_ANIMATED_MODULE, this.f21247f);
    }

    public void s() {
        Iterator<T> it2 = this.f21242a.iterator();
        while (it2.hasNext()) {
            it2.next().m().setContainer(null);
        }
        this.f21242a.clear();
        n();
    }

    public void u(int i11) {
        this.f21242a.get(i11).m().setContainer(null);
        this.f21242a.remove(i11);
        n();
    }
}