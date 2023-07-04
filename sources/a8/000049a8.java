package com.reactnativepagerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.f;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b3\u00104J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\"\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0006H\u0007J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0007J\u0019\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004H\u0087\u0002J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0007J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0007J \u0010%\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0$0#H\u0016J\u0016\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010$H\u0016J\"\u0010+\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J\u0018\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0007R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroidx/viewpager2/widget/f;", "view", "", "selectedTab", "", "scrollSmooth", "Lvz/b0;", "setCurrentItem", "Landroid/view/View;", "refreshViewChildrenLayout", "", "getName", "Lcom/facebook/react/uimanager/n0;", "reactContext", "createViewInstance", "parent", "child", "index", "addView", "getChildCount", "getChildAt", "removeView", "removeAllViews", "removeViewAt", "needsCustomLayoutForChildren", "viewPager", "value", "setScrollEnabled", "setInitialPage", "setOrientation", "set", "setOverScrollMode", "setLayoutDirection", "", "", "getExportedCustomDirectEventTypeConstants", "getCommandsMap", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "pager", "", "margin", "setPageMargin", "Lcom/facebook/react/uimanager/events/d;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/d;", "<init>", "()V", "Companion", "a", "react-native-pager-view_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PagerViewViewManager extends ViewGroupManager<androidx.viewpager2.widget.f> {
    private static final int COMMAND_SET_PAGE = 1;
    private static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    private static final int COMMAND_SET_SCROLL_ENABLED = 3;
    public static final a Companion = new a(null);
    private static final String REACT_CLASS = "RNCViewPager";
    private com.facebook.react.uimanager.events.d eventDispatcher;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f.i {

        /* renamed from: b */
        final /* synthetic */ androidx.viewpager2.widget.f f20200b;

        b(androidx.viewpager2.widget.f fVar) {
            PagerViewViewManager.this = r1;
            this.f20200b = fVar;
        }

        @Override // androidx.viewpager2.widget.f.i
        public void a(int i11) {
            String str;
            super.a(i11);
            if (i11 == 0) {
                str = "idle";
            } else if (i11 == 1) {
                str = "dragging";
            } else if (i11 != 2) {
                throw new IllegalStateException("Unsupported pageScrollState");
            } else {
                str = "settling";
            }
            com.facebook.react.uimanager.events.d dVar = PagerViewViewManager.this.eventDispatcher;
            if (dVar == null) {
                s.x("eventDispatcher");
                dVar = null;
            }
            dVar.g(new gr.b(this.f20200b.getId(), str));
        }

        @Override // androidx.viewpager2.widget.f.i
        public void b(int i11, float f11, int i12) {
            super.b(i11, f11, i12);
            com.facebook.react.uimanager.events.d dVar = PagerViewViewManager.this.eventDispatcher;
            if (dVar == null) {
                s.x("eventDispatcher");
                dVar = null;
            }
            dVar.g(new gr.a(this.f20200b.getId(), i11, f11));
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int i11) {
            super.c(i11);
            com.facebook.react.uimanager.events.d dVar = PagerViewViewManager.this.eventDispatcher;
            if (dVar == null) {
                s.x("eventDispatcher");
                dVar = null;
            }
            dVar.g(new gr.c(this.f20200b.getId(), i11));
        }
    }

    public static /* synthetic */ void a(View view) {
        m119refreshViewChildrenLayout$lambda3(view);
    }

    public static /* synthetic */ void b(androidx.viewpager2.widget.f fVar, PagerViewViewManager pagerViewViewManager) {
        m118createViewInstance$lambda0(fVar, pagerViewViewManager);
    }

    public static /* synthetic */ void c(PagerViewViewManager pagerViewViewManager, androidx.viewpager2.widget.f fVar, int i11) {
        m120setInitialPage$lambda1(pagerViewViewManager, fVar, i11);
    }

    /* renamed from: createViewInstance$lambda-0 */
    public static final void m118createViewInstance$lambda0(androidx.viewpager2.widget.f vp2, PagerViewViewManager this$0) {
        s.g(vp2, "$vp");
        s.g(this$0, "this$0");
        vp2.g(new b(vp2));
        com.facebook.react.uimanager.events.d dVar = this$0.eventDispatcher;
        if (dVar == null) {
            s.x("eventDispatcher");
            dVar = null;
        }
        dVar.g(new gr.c(vp2.getId(), vp2.getCurrentItem()));
    }

    public static /* synthetic */ void d(int i11, androidx.viewpager2.widget.f fVar, View view, float f11) {
        m121setPageMargin$lambda2(i11, fVar, view, f11);
    }

    private final void refreshViewChildrenLayout(final View view) {
        view.post(new Runnable() { // from class: com.reactnativepagerview.c
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.a(view);
            }
        });
    }

    /* renamed from: refreshViewChildrenLayout$lambda-3 */
    public static final void m119refreshViewChildrenLayout$lambda3(View view) {
        s.g(view, "$view");
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private final void setCurrentItem(androidx.viewpager2.widget.f fVar, int i11, boolean z11) {
        refreshViewChildrenLayout(fVar);
        fVar.j(i11, z11);
    }

    /* renamed from: setInitialPage$lambda-1 */
    public static final void m120setInitialPage$lambda1(PagerViewViewManager this$0, androidx.viewpager2.widget.f viewPager, int i11) {
        s.g(this$0, "this$0");
        s.g(viewPager, "$viewPager");
        this$0.setCurrentItem(viewPager, i11, false);
    }

    /* renamed from: setPageMargin$lambda-2 */
    public static final void m121setPageMargin$lambda2(int i11, androidx.viewpager2.widget.f pager, View page, float f11) {
        s.g(pager, "$pager");
        s.g(page, "page");
        float f12 = i11 * f11;
        if (pager.getOrientation() == 0) {
            if (pager.getLayoutDirection() == 1) {
                f12 = -f12;
            }
            page.setTranslationX(f12);
            return;
        }
        page.setTranslationY(f12);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.f("setPage", 1, "setPageWithoutAnimation", 2, "setScrollEnabled", 3);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> f11 = yf.c.f("topPageScroll", yf.c.d("registrationName", "onPageScroll"), "topPageScrollStateChanged", yf.c.d("registrationName", "onPageScrollStateChanged"), "topPageSelected", yf.c.d("registrationName", "onPageSelected"));
        s.f(f11, "of(\n      PageScrollEven…Name\", \"onPageSelected\"))");
        return f11;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @ng.a(defaultInt = -1, name = "offscreenPageLimit")
    public final void set(androidx.viewpager2.widget.f viewPager, int i11) {
        s.g(viewPager, "viewPager");
        viewPager.setOffscreenPageLimit(i11);
    }

    @ng.a(defaultInt = 0, name = "initialPage")
    public final void setInitialPage(final androidx.viewpager2.widget.f viewPager, final int i11) {
        s.g(viewPager, "viewPager");
        viewPager.post(new Runnable() { // from class: com.reactnativepagerview.e
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.c(PagerViewViewManager.this, viewPager, i11);
            }
        });
    }

    @ng.a(name = "layoutDirection")
    public final void setLayoutDirection(androidx.viewpager2.widget.f viewPager, String value) {
        s.g(viewPager, "viewPager");
        s.g(value, "value");
        if (s.c(value, "rtl")) {
            viewPager.setLayoutDirection(1);
        } else {
            viewPager.setLayoutDirection(0);
        }
    }

    @ng.a(name = "orientation")
    public final void setOrientation(androidx.viewpager2.widget.f viewPager, String value) {
        s.g(viewPager, "viewPager");
        s.g(value, "value");
        viewPager.setOrientation(s.c(value, "vertical") ? 1 : 0);
    }

    @ng.a(name = "overScrollMode")
    public final void setOverScrollMode(androidx.viewpager2.widget.f viewPager, String value) {
        s.g(viewPager, "viewPager");
        s.g(value, "value");
        View childAt = viewPager.getChildAt(0);
        if (s.c(value, PermissionsResponse.PERMISSION_EXPIRES_NEVER)) {
            childAt.setOverScrollMode(2);
        } else if (s.c(value, PermissionsResponse.SCOPE_ALWAYS)) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    @ng.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "pageMargin")
    public final void setPageMargin(final androidx.viewpager2.widget.f pager, float f11) {
        s.g(pager, "pager");
        final int c11 = (int) p.c(f11);
        pager.setPageTransformer(new f.k() { // from class: com.reactnativepagerview.b
            @Override // androidx.viewpager2.widget.f.k
            public final void a(View view, float f12) {
                PagerViewViewManager.d(c11, pager, view, f12);
            }
        });
    }

    @ng.a(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(androidx.viewpager2.widget.f viewPager, boolean z11) {
        s.g(viewPager, "viewPager");
        viewPager.setUserInputEnabled(z11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(androidx.viewpager2.widget.f parent, View view, int i11) {
        s.g(parent, "parent");
        if (view == null) {
            return;
        }
        f fVar = (f) parent.getAdapter();
        if (fVar != null) {
            fVar.a(view, i11);
        }
        if (parent.getCurrentItem() == i11) {
            refreshViewChildrenLayout(parent);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public androidx.viewpager2.widget.f createViewInstance(n0 reactContext) {
        s.g(reactContext, "reactContext");
        final androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(reactContext);
        fVar.setAdapter(new f());
        fVar.setSaveEnabled(false);
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        s.e(nativeModule);
        com.facebook.react.uimanager.events.d eventDispatcher = ((UIManagerModule) nativeModule).getEventDispatcher();
        s.f(eventDispatcher, "reactContext.getNativeMo…s.java)!!.eventDispatcher");
        this.eventDispatcher = eventDispatcher;
        fVar.post(new Runnable() { // from class: com.reactnativepagerview.d
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.b(androidx.viewpager2.widget.f.this, this);
            }
        });
        return fVar;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(androidx.viewpager2.widget.f parent, int i11) {
        s.g(parent, "parent");
        f fVar = (f) parent.getAdapter();
        s.e(fVar);
        return fVar.b(i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(androidx.viewpager2.widget.f parent) {
        s.g(parent, "parent");
        RecyclerView.h adapter = parent.getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getItemCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(androidx.viewpager2.widget.f root, int i11, ReadableArray readableArray) {
        s.g(root, "root");
        super.receiveCommand((PagerViewViewManager) root, i11, readableArray);
        wf.a.c(root);
        wf.a.c(readableArray);
        RecyclerView.h adapter = root.getAdapter();
        com.facebook.react.uimanager.events.d dVar = null;
        Integer valueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                s.e(readableArray);
                root.setUserInputEnabled(readableArray.getBoolean(0));
                return;
            }
            q0 q0Var = q0.f34921a;
            String format = String.format("Unsupported command %d received by %s.", Arrays.copyOf(new Object[]{Integer.valueOf(i11), PagerViewViewManager.class.getSimpleName()}, 2));
            s.f(format, "java.lang.String.format(format, *args)");
            throw new IllegalArgumentException(format);
        }
        s.e(readableArray);
        int i12 = readableArray.getInt(0);
        if (valueOf != null && valueOf.intValue() > 0 && i12 >= 0 && i12 < valueOf.intValue()) {
            setCurrentItem(root, i12, i11 == 1);
            com.facebook.react.uimanager.events.d dVar2 = this.eventDispatcher;
            if (dVar2 == null) {
                s.x("eventDispatcher");
            } else {
                dVar = dVar2;
            }
            dVar.g(new gr.c(root.getId(), i12));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(androidx.viewpager2.widget.f parent) {
        s.g(parent, "parent");
        parent.setUserInputEnabled(false);
        f fVar = (f) parent.getAdapter();
        if (fVar == null) {
            return;
        }
        fVar.e();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(androidx.viewpager2.widget.f parent, View view) {
        s.g(parent, "parent");
        s.g(view, "view");
        f fVar = (f) parent.getAdapter();
        if (fVar != null) {
            fVar.f(view);
        }
        refreshViewChildrenLayout(parent);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(androidx.viewpager2.widget.f parent, int i11) {
        s.g(parent, "parent");
        f fVar = (f) parent.getAdapter();
        if (fVar != null) {
            fVar.g(i11);
        }
        refreshViewChildrenLayout(parent);
    }
}