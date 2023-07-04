package cg;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import cg.c;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.d1;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.y;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: l  reason: collision with root package name */
    public static final String f9093l = "d";

    /* renamed from: c  reason: collision with root package name */
    private n0 f9096c;

    /* renamed from: f  reason: collision with root package name */
    private mg.a f9099f;

    /* renamed from: g  reason: collision with root package name */
    private d1 f9100g;

    /* renamed from: h  reason: collision with root package name */
    private RootViewManager f9101h;

    /* renamed from: i  reason: collision with root package name */
    private c.b f9102i;

    /* renamed from: j  reason: collision with root package name */
    private Set<Integer> f9103j;

    /* renamed from: k  reason: collision with root package name */
    private final int f9104k;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f9094a = false;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f9095b = false;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<Integer, c> f9097d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentLinkedQueue<dg.d> f9098e = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f9105a;

        a(View view) {
            this.f9105a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.C()) {
                return;
            }
            if (this.f9105a.getId() == d.this.f9104k) {
                String str = d.f9093l;
                ReactSoftExceptionLogger.logSoftException(str, new IllegalViewOperationException("Race condition in addRootView detected. Trying to set an id of [" + d.this.f9104k + "] on the RootView, but that id has already been set. "));
            } else if (this.f9105a.getId() != -1) {
                nd.a.l(d.f9093l, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(this.f9105a.getId()), Integer.valueOf(d.this.f9104k));
                throw new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.f9105a.setId(d.this.f9104k);
            View view = this.f9105a;
            if (view instanceof a0) {
                ((a0) view).setRootViewTag(d.this.f9104k);
            }
            d.this.f9095b = true;
            d.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (c cVar : d.this.f9097d.values()) {
                d.this.E(cVar);
            }
            d dVar = d.this;
            dVar.f9103j = dVar.f9097d.keySet();
            d.this.f9097d = null;
            d.this.f9099f = null;
            d.this.f9101h = null;
            d.this.f9102i = null;
            d.this.f9098e.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final View f9108a;

        /* renamed from: b  reason: collision with root package name */
        final int f9109b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f9110c;

        /* renamed from: d  reason: collision with root package name */
        final ViewManager f9111d;

        /* renamed from: e  reason: collision with root package name */
        public e0 f9112e;

        /* renamed from: f  reason: collision with root package name */
        public ReadableMap f9113f;

        /* renamed from: g  reason: collision with root package name */
        public m0 f9114g;

        /* renamed from: h  reason: collision with root package name */
        public EventEmitterWrapper f9115h;

        /* synthetic */ c(int i11, View view, ViewManager viewManager, a aVar) {
            this(i11, view, viewManager);
        }

        public String toString() {
            boolean z11 = this.f9111d == null;
            return "ViewState [" + this.f9109b + "] - isRoot: " + this.f9110c + " - props: " + this.f9112e + " - localData: " + this.f9113f + " - viewManager: " + this.f9111d + " - isLayoutOnly: " + z11;
        }

        /* synthetic */ c(int i11, View view, ViewManager viewManager, boolean z11, a aVar) {
            this(i11, view, viewManager, z11);
        }

        private c(int i11, View view, ViewManager viewManager) {
            this(i11, view, viewManager, false);
        }

        private c(int i11, View view, ViewManager viewManager, boolean z11) {
            this.f9112e = null;
            this.f9113f = null;
            this.f9114g = null;
            this.f9115h = null;
            this.f9109b = i11;
            this.f9108a = view;
            this.f9110c = z11;
            this.f9111d = viewManager;
        }
    }

    public d(int i11, mg.a aVar, d1 d1Var, RootViewManager rootViewManager, c.b bVar, n0 n0Var) {
        this.f9104k = i11;
        this.f9099f = aVar;
        this.f9100g = d1Var;
        this.f9101h = rootViewManager;
        this.f9102i = bVar;
        this.f9096c = n0Var;
    }

    private c A(int i11) {
        c cVar = this.f9097d.get(Integer.valueOf(i11));
        if (cVar != null) {
            return cVar;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i11);
    }

    private static void D(ViewGroup viewGroup, boolean z11) {
        int id2 = viewGroup.getId();
        String str = f9093l;
        nd.a.j(str, "  <ViewGroup tag=" + id2 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            String str2 = f9093l;
            nd.a.j(str2, "     <View idx=" + i11 + " tag=" + viewGroup.getChildAt(i11).getId() + " class=" + viewGroup.getChildAt(i11).getClass().toString() + ">");
        }
        String str3 = f9093l;
        nd.a.j(str3, "  </ViewGroup tag=" + id2 + ">");
        if (z11) {
            nd.a.j(str3, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id3 = viewGroup2 == null ? -1 : viewGroup2.getId();
                String str4 = f9093l;
                nd.a.j(str4, "<ViewParent tag=" + id3 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(c cVar) {
        m0 m0Var = cVar.f9114g;
        if (m0Var != null) {
            m0Var.d();
            cVar.f9114g = null;
        }
        EventEmitterWrapper eventEmitterWrapper = cVar.f9115h;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.a();
            cVar.f9115h = null;
        }
        ViewManager viewManager = cVar.f9111d;
        if (cVar.f9110c || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(cVar.f9108a);
    }

    private void l(View view) {
        if (C()) {
            return;
        }
        this.f9097d.put(Integer.valueOf(this.f9104k), new c(this.f9104k, view, this.f9101h, true, null));
        a aVar = new a(view);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.f9102i.a(this.f9098e);
    }

    private c v(int i11) {
        ConcurrentHashMap<Integer, c> concurrentHashMap = this.f9097d;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i11));
    }

    private static ViewGroupManager<ViewGroup> z(c cVar) {
        ViewManager viewManager = cVar.f9111d;
        if (viewManager != null) {
            return (ViewGroupManager) viewManager;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + cVar);
    }

    public boolean B() {
        return this.f9095b;
    }

    public boolean C() {
        return this.f9094a;
    }

    public void F(String str, int i11, ReadableMap readableMap, m0 m0Var, EventEmitterWrapper eventEmitterWrapper, boolean z11) {
        UiThreadUtil.assertOnUiThread();
        if (!C() && v(i11) == null) {
            p(str, i11, readableMap, m0Var, eventEmitterWrapper, z11);
        }
    }

    public void G() {
        nd.a.l(f9093l, "Views created for surface {%d}:", Integer.valueOf(w()));
        for (c cVar : this.f9097d.values()) {
            ViewManager viewManager = cVar.f9111d;
            Integer num = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = cVar.f9108a;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                num = Integer.valueOf(view2.getId());
            }
            nd.a.l(f9093l, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(cVar.f9109b), num, Boolean.valueOf(cVar.f9110c));
        }
    }

    @Deprecated
    public void H(int i11, int i12, ReadableArray readableArray) {
        if (C()) {
            return;
        }
        c v11 = v(i11);
        if (v11 != null) {
            ViewManager viewManager = v11.f9111d;
            if (viewManager != null) {
                View view = v11.f9108a;
                if (view != null) {
                    viewManager.receiveCommand((ViewManager) view, i12, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
            }
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i11);
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i11 + "] for commandId: " + i12);
    }

    public void I(int i11, String str, ReadableArray readableArray) {
        if (C()) {
            return;
        }
        c v11 = v(i11);
        if (v11 != null) {
            ViewManager viewManager = v11.f9111d;
            if (viewManager != null) {
                View view = v11.f9108a;
                if (view != null) {
                    viewManager.receiveCommand((ViewManager) view, str, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
            }
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i11);
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i11 + " for commandId: " + str);
    }

    public void J(int i11, int i12, int i13) {
        if (C()) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        c v11 = v(i12);
        if (v11 == null) {
            ReactSoftExceptionLogger.logSoftException(cg.c.f9084i, new IllegalStateException("Unable to find viewState for tag: [" + i12 + "] for removeViewAt"));
            return;
        }
        View view = v11.f9108a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                ViewGroupManager<ViewGroup> z11 = z(v11);
                View childAt = z11.getChildAt(viewGroup, i13);
                int id2 = childAt != null ? childAt.getId() : -1;
                if (id2 != i11) {
                    int childCount = viewGroup.getChildCount();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= childCount) {
                            i14 = -1;
                            break;
                        } else if (viewGroup.getChildAt(i14).getId() == i11) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (i14 == -1) {
                        nd.a.j(f9093l, "removeViewAt: [" + i11 + "] -> [" + i12 + "] @" + i13 + ": view already removed from parent! Children in parent: " + childCount);
                        return;
                    }
                    D(viewGroup, true);
                    ReactSoftExceptionLogger.logSoftException(f9093l, new IllegalStateException("Tried to remove view [" + i11 + "] of parent [" + i12 + "] at index " + i13 + ", but got view tag " + id2 + " - actual index of view: " + i14));
                    i13 = i14;
                }
                try {
                    z11.removeViewAt(viewGroup, i13);
                    return;
                } catch (RuntimeException e11) {
                    int childCount2 = z11.getChildCount(viewGroup);
                    D(viewGroup, true);
                    throw new IllegalStateException("Cannot remove child at index " + i13 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e11);
                }
            }
            throw new IllegalStateException("Unable to find view for tag [" + i12 + "]");
        }
        String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i12 + " - Tag: " + i11 + " - Index: " + i13;
        nd.a.j(f9093l, str);
        throw new IllegalStateException(str);
    }

    public void K(int i11, int i12) {
        if (C()) {
            return;
        }
        c A = A(i11);
        if (A.f9111d != null) {
            View view = A.f9108a;
            if (view != null) {
                view.sendAccessibilityEvent(i12);
                return;
            }
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i11);
        }
        throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i11);
    }

    public synchronized void L(int i11, int i12, boolean z11) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        if (!z11) {
            this.f9099f.d(i12, null);
            return;
        }
        c A = A(i11);
        View view = A.f9108a;
        if (i12 != i11 && (view instanceof ViewParent)) {
            this.f9099f.d(i12, (ViewParent) view);
        } else if (view == null) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i11 + "].");
        } else {
            if (A.f9110c) {
                SoftAssertions.assertUnreachable("Cannot block native responder on [" + i11 + "] that is a root view");
            }
            this.f9099f.d(i12, view.getParent());
        }
    }

    public void M() {
        EventEmitterWrapper eventEmitterWrapper;
        if (C()) {
            return;
        }
        this.f9094a = true;
        for (c cVar : this.f9097d.values()) {
            m0 m0Var = cVar.f9114g;
            if (m0Var != null) {
                m0Var.d();
                cVar.f9114g = null;
            }
            if (ReactFeatureFlags.enableAggressiveEventEmitterCleanup && (eventEmitterWrapper = cVar.f9115h) != null) {
                eventEmitterWrapper.a();
                cVar.f9115h = null;
            }
        }
        b bVar = new b();
        if (UiThreadUtil.isOnUiThread()) {
            bVar.run();
        } else {
            UiThreadUtil.runOnUiThread(bVar);
        }
    }

    public void N(int i11, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c cVar = this.f9097d.get(Integer.valueOf(i11));
        if (cVar == null) {
            cVar = new c(i11, (View) null, (ViewManager) null, (a) null);
            this.f9097d.put(Integer.valueOf(i11), cVar);
        }
        EventEmitterWrapper eventEmitterWrapper2 = cVar.f9115h;
        cVar.f9115h = eventEmitterWrapper;
        if (eventEmitterWrapper2 == eventEmitterWrapper || eventEmitterWrapper2 == null) {
            return;
        }
        eventEmitterWrapper2.a();
    }

    public void O(int i11, int i12, int i13, int i14, int i15, int i16) {
        if (C()) {
            return;
        }
        c A = A(i11);
        if (A.f9110c) {
            return;
        }
        View view = A.f9108a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            ViewParent parent = view.getParent();
            if (parent instanceof i0) {
                parent.requestLayout();
            }
            view.layout(i12, i13, i14 + i12, i15 + i13);
            int i17 = i16 == 0 ? 4 : 0;
            if (view.getVisibility() != i17) {
                view.setVisibility(i17);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to find View for tag: " + i11);
    }

    public void P(int i11, int i12, int i13, int i14, int i15) {
        if (C()) {
            return;
        }
        c A = A(i11);
        if (A.f9110c) {
            return;
        }
        View view = A.f9108a;
        if (view != null) {
            if (view instanceof y) {
                ((y) view).setOverflowInset(i12, i13, i14, i15);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to find View for tag: " + i11);
    }

    public void Q(int i11, int i12, int i13, int i14, int i15) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c A = A(i11);
        if (A.f9110c) {
            return;
        }
        View view = A.f9108a;
        if (view != null) {
            ViewManager viewManager = A.f9111d;
            if (viewManager != null) {
                viewManager.setPadding(view, i12, i13, i14, i15);
                return;
            }
            throw new IllegalStateException("Unable to find ViewManager for view: " + A);
        }
        throw new IllegalStateException("Unable to find View for tag: " + i11);
    }

    public void R(int i11, ReadableMap readableMap) {
        if (C()) {
            return;
        }
        c A = A(i11);
        A.f9112e = new e0(readableMap);
        View view = A.f9108a;
        if (view != null) {
            ((ViewManager) wf.a.c(A.f9111d)).updateProperties(view, A.f9112e);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
    }

    public void S(int i11, m0 m0Var) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c A = A(i11);
        m0 m0Var2 = A.f9114g;
        A.f9114g = m0Var;
        ViewManager viewManager = A.f9111d;
        if (viewManager != null) {
            Object updateState = viewManager.updateState(A.f9108a, A.f9112e, m0Var);
            if (updateState != null) {
                viewManager.updateExtraData(A.f9108a, updateState);
            }
            if (m0Var2 != null) {
                m0Var2.d();
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to find ViewManager for tag: " + i11);
    }

    public void m(int i11, int i12, int i13) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c A = A(i11);
        View view = A.f9108a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            c A2 = A(i12);
            View view2 = A2.f9108a;
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if (parent != null) {
                    int id2 = parent instanceof ViewGroup ? ((ViewGroup) parent).getId() : -1;
                    ReactSoftExceptionLogger.logSoftException(f9093l, new IllegalStateException("addViewAt: cannot insert view [" + i12 + "] into parent [" + i11 + "]: View already has a parent: [" + id2 + "] " + parent.getClass().getSimpleName()));
                }
                try {
                    z(A).addView(viewGroup, view2, i13);
                    return;
                } catch (IllegalStateException e11) {
                    throw new IllegalStateException("addViewAt: failed to insert view [" + i12 + "] into parent [" + i11 + "] at index " + i13, e11);
                }
            }
            throw new IllegalStateException("Unable to find view for viewState " + A2 + " and tag " + i12);
        }
        String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i12 + " - Index: " + i13;
        nd.a.j(f9093l, str);
        throw new IllegalStateException(str);
    }

    public void n(View view, n0 n0Var) {
        this.f9096c = n0Var;
        l(view);
    }

    public void o(String str, int i11, ReadableMap readableMap, m0 m0Var, EventEmitterWrapper eventEmitterWrapper, boolean z11) {
        if (!C() && v(i11) == null) {
            p(str, i11, readableMap, m0Var, eventEmitterWrapper, z11);
        }
    }

    public void p(String str, int i11, ReadableMap readableMap, m0 m0Var, EventEmitterWrapper eventEmitterWrapper, boolean z11) {
        ViewManager viewManager;
        View view;
        e0 e0Var = readableMap != null ? new e0(readableMap) : null;
        if (z11) {
            viewManager = this.f9100g.a(str);
            view = viewManager.createView(i11, this.f9096c, e0Var, m0Var, this.f9099f);
        } else {
            viewManager = null;
            view = null;
        }
        c cVar = new c(i11, view, viewManager, (a) null);
        cVar.f9112e = e0Var;
        cVar.f9114g = m0Var;
        cVar.f9115h = eventEmitterWrapper;
        this.f9097d.put(Integer.valueOf(i11), cVar);
    }

    public void q(int i11) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c v11 = v(i11);
        if (v11 == null) {
            String str = cg.c.f9084i;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Unable to find viewState for tag: " + i11 + " for deleteView"));
            return;
        }
        this.f9097d.remove(Integer.valueOf(i11));
        E(v11);
    }

    public void r(dg.d dVar) {
        this.f9098e.add(dVar);
    }

    public n0 t() {
        return this.f9096c;
    }

    public EventEmitterWrapper u(int i11) {
        c v11 = v(i11);
        if (v11 == null) {
            return null;
        }
        return v11.f9115h;
    }

    public int w() {
        return this.f9104k;
    }

    public View x(int i11) {
        c v11 = v(i11);
        View view = v11 == null ? null : v11.f9108a;
        if (view != null) {
            return view;
        }
        throw new IllegalViewOperationException("Trying to resolve view with tag " + i11 + " which doesn't exist");
    }

    public boolean y(int i11) {
        Set<Integer> set = this.f9103j;
        if (set == null || !set.contains(Integer.valueOf(i11))) {
            ConcurrentHashMap<Integer, c> concurrentHashMap = this.f9097d;
            if (concurrentHashMap == null) {
                return false;
            }
            return concurrentHashMap.containsKey(Integer.valueOf(i11));
        }
        return true;
    }
}