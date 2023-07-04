package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class m {
    private static final String TAG = "m";
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final mg.a mJSResponderHandler;
    private boolean mLayoutAnimationEnabled;
    private final com.facebook.react.uimanager.layoutanimation.e mLayoutAnimator;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private PopupMenu mPopupMenu;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final d1 mViewManagers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements com.facebook.react.uimanager.layoutanimation.f {

        /* renamed from: a */
        final /* synthetic */ ViewGroupManager f12363a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f12364b;

        /* renamed from: c */
        final /* synthetic */ View f12365c;

        /* renamed from: d */
        final /* synthetic */ Set f12366d;

        /* renamed from: e */
        final /* synthetic */ int f12367e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i11) {
            m.this = r1;
            this.f12363a = viewGroupManager;
            this.f12364b = viewGroup;
            this.f12365c = view;
            this.f12366d = set;
            this.f12367e = i11;
        }

        @Override // com.facebook.react.uimanager.layoutanimation.f
        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f12363a.removeView(this.f12364b, this.f12365c);
            m.this.dropView(this.f12365c);
            this.f12366d.remove(Integer.valueOf(this.f12365c.getId()));
            if (this.f12366d.isEmpty()) {
                m.this.mPendingDeletionsForTag.remove(Integer.valueOf(this.f12367e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {

        /* renamed from: a */
        final Callback f12369a;

        /* renamed from: b */
        boolean f12370b;

        /* synthetic */ b(Callback callback, a aVar) {
            this(callback);
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            if (this.f12370b) {
                return;
            }
            this.f12369a.invoke("dismissed");
            this.f12370b = true;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f12370b) {
                return false;
            }
            this.f12369a.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.f12370b = true;
            return true;
        }

        private b(Callback callback) {
            this.f12370b = false;
            this.f12369a = callback;
        }
    }

    public m(d1 d1Var) {
        this(d1Var, new RootViewManager());
    }

    private boolean arrayContains(int[] iArr, int i11) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    private void computeBoundingBox(View view, int[] iArr) {
        this.mBoundingBox.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        mapRectFromViewToWindowCoords(view, this.mBoundingBox);
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        RectF rectF = this.mBoundingBox;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.mBoundingBox;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String constructManageChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, z0[] z0VarArr, int[] iArr2) {
        int i11;
        int i12;
        int i13;
        int i14;
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i15 = 0; viewGroupManager.getChildAt(viewGroup, i15) != null; i15 += 16) {
                int i16 = 0;
                while (true) {
                    if (viewGroupManager.getChildAt(viewGroup, i15 + i16) != null && i16 < 16) {
                        sb2.append(viewGroupManager.getChildAt(viewGroup, i14).getId() + ",");
                        i16++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i17 = 0; i17 < iArr.length; i17 += 16) {
                int i18 = 0;
                while (true) {
                    if (i17 + i18 < iArr.length && i18 < 16) {
                        sb2.append(iArr[i13] + ",");
                        i18++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (z0VarArr != null) {
            sb2.append("  viewsToAdd(" + z0VarArr.length + "): [\n");
            for (int i19 = 0; i19 < z0VarArr.length; i19 += 16) {
                int i21 = 0;
                while (true) {
                    if (i19 + i21 < z0VarArr.length && i21 < 16) {
                        sb2.append("[" + z0VarArr[i12].f12510b + "," + z0VarArr[i12].f12509a + "],");
                        i21++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i22 = 0; i22 < iArr2.length; i22 += 16) {
                int i23 = 0;
                while (true) {
                    if (i22 + i23 < iArr2.length && i23 < 16) {
                        sb2.append(iArr2[i11] + ",");
                        i23++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private static String constructSetChildrenErrorMessage(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        z0[] z0VarArr = new z0[readableArray.size()];
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            z0VarArr[i11] = new z0(readableArray.getInt(i11), i11);
        }
        return constructManageChildrenErrorMessage(viewGroup, viewGroupManager, null, z0VarArr, null);
    }

    private Set<Integer> getPendingDeletionsForTag(int i11) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i11))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i11), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i11));
    }

    private n0 getReactContextForView(int i11) {
        View view = this.mTagsToViews.get(i11);
        if (view != null) {
            return (n0) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i11);
    }

    private void mapRectFromViewToWindowCoords(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public synchronized void addRootView(int i11, View view) {
        addRootViewGroup(i11, view);
    }

    protected final synchronized void addRootViewGroup(int i11, View view) {
        if (view.getId() != -1) {
            String str = TAG;
            nd.a.j(str, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        this.mTagsToViews.put(i11, view);
        this.mTagsToViewManagers.put(i11, this.mRootViewManager);
        this.mRootTags.put(i11, true);
        view.setId(i11);
    }

    public void clearJSResponder() {
        this.mJSResponderHandler.b();
    }

    public void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    public void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mLayoutAnimator.initializeFromConfig(readableMap, callback);
    }

    public synchronized void createView(n0 n0Var, int i11, String str, e0 e0Var) {
        UiThreadUtil.assertOnUiThread();
        zg.a.a(0L, "NativeViewHierarchyManager_createView").a("tag", i11).b("className", str).c();
        ViewManager a11 = this.mViewManagers.a(str);
        this.mTagsToViews.put(i11, a11.createView(i11, n0Var, e0Var, null, this.mJSResponderHandler));
        this.mTagsToViewManagers.put(i11, a11);
        com.facebook.systrace.a.g(0L);
    }

    public void dismissPopupMenu() {
        PopupMenu popupMenu = this.mPopupMenu;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    @Deprecated
    public synchronized void dispatchCommand(int i11, int i12, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i11);
        if (view != null) {
            resolveViewManager(i11).receiveCommand((ViewManager) view, i12, readableArray);
        } else {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i11 + "] and command " + i12);
        }
    }

    public synchronized void dropView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view == null) {
            return;
        }
        if (this.mTagsToViewManagers.get(view.getId()) == null) {
            return;
        }
        if (!this.mRootTags.get(view.getId())) {
            resolveViewManager(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (childAt == null) {
                    nd.a.j(TAG, "Unable to drop null child view");
                } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                    dropView(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.mTagsToViews.remove(view.getId());
        this.mTagsToViewManagers.remove(view.getId());
    }

    public synchronized int findTargetTagForTouch(int i11, float f11, float f12) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.mTagsToViews.get(i11);
        if (view != null) {
        } else {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i11);
        }
        return o0.c(f11, f12, (ViewGroup) view);
    }

    public long getInstanceHandle(int i11) {
        View view = this.mTagsToViews.get(i11);
        if (view != null) {
            Long l11 = (Long) view.getTag(com.facebook.react.h.f11878l);
            if (l11 != null) {
                return l11.longValue();
            }
            throw new IllegalViewOperationException("Unable to find instanceHandle for tag: " + i11);
        }
        throw new IllegalViewOperationException("Unable to find view for tag: " + i11);
    }

    public synchronized void manageChildren(int i11, int[] iArr, z0[] z0VarArr, int[] iArr2) {
        int i12;
        int[] iArr3 = iArr;
        synchronized (this) {
            UiThreadUtil.assertOnUiThread();
            Set<Integer> pendingDeletionsForTag = getPendingDeletionsForTag(i11);
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i11);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i11);
            if (viewGroup != null) {
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr3 != null) {
                    int length = iArr3.length - 1;
                    while (length >= 0) {
                        int i13 = iArr3[length];
                        if (i13 >= 0) {
                            if (viewGroupManager.getChildAt(viewGroup, i13) == null) {
                                if (this.mRootTags.get(i11) && viewGroupManager.getChildCount(viewGroup) == 0) {
                                    return;
                                }
                                throw new IllegalViewOperationException("Trying to remove a view index above child count " + i13 + " view tag: " + i11 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr3, z0VarArr, iArr2));
                            } else if (i13 < childCount) {
                                View childAt = viewGroupManager.getChildAt(viewGroup, i13);
                                if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !arrayContains(iArr2, childAt.getId())) {
                                    viewGroupManager.removeViewAt(viewGroup, i13);
                                }
                                length--;
                                childCount = i13;
                            } else {
                                throw new IllegalViewOperationException("Trying to remove an out of order view index:" + i13 + " view tag: " + i11 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr3, z0VarArr, iArr2));
                            }
                        } else {
                            throw new IllegalViewOperationException("Trying to remove a negative view index:" + i13 + " view tag: " + i11 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr3, z0VarArr, iArr2));
                        }
                    }
                }
                if (iArr2 != null) {
                    int i14 = 0;
                    while (i14 < iArr2.length) {
                        int i15 = iArr2[i14];
                        View view = this.mTagsToViews.get(i15);
                        if (view != null) {
                            if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
                                pendingDeletionsForTag.add(Integer.valueOf(i15));
                                i12 = i14;
                                this.mLayoutAnimator.deleteView(view, new a(viewGroupManager, viewGroup, view, pendingDeletionsForTag, i11));
                            } else {
                                i12 = i14;
                                dropView(view);
                            }
                            i14 = i12 + 1;
                            iArr3 = iArr;
                        } else {
                            throw new IllegalViewOperationException("Trying to destroy unknown view tag: " + i15 + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr, z0VarArr, iArr2));
                        }
                    }
                }
                int[] iArr4 = iArr3;
                if (z0VarArr != null) {
                    for (z0 z0Var : z0VarArr) {
                        View view2 = this.mTagsToViews.get(z0Var.f12509a);
                        if (view2 != null) {
                            int i16 = z0Var.f12510b;
                            if (!pendingDeletionsForTag.isEmpty()) {
                                i16 = 0;
                                int i17 = 0;
                                while (i16 < viewGroup.getChildCount() && i17 != z0Var.f12510b) {
                                    if (!pendingDeletionsForTag.contains(Integer.valueOf(viewGroup.getChildAt(i16).getId()))) {
                                        i17++;
                                    }
                                    i16++;
                                }
                            }
                            viewGroupManager.addView(viewGroup, view2, i16);
                        } else {
                            throw new IllegalViewOperationException("Trying to add unknown view tag: " + z0Var.f12509a + "\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr4, z0VarArr, iArr2));
                        }
                    }
                }
                if (pendingDeletionsForTag.isEmpty()) {
                    this.mPendingDeletionsForTag.remove(Integer.valueOf(i11));
                }
                return;
            }
            throw new IllegalViewOperationException("Trying to manageChildren view with tag " + i11 + " which doesn't exist\n detail: " + constructManageChildrenErrorMessage(viewGroup, viewGroupManager, iArr3, z0VarArr, iArr2));
        }
    }

    public synchronized void measure(int i11, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i11);
        if (view != null) {
            View view2 = (View) j0.a(view);
            if (view2 != null) {
                computeBoundingBox(view2, iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                computeBoundingBox(view, iArr);
                iArr[0] = iArr[0] - i12;
                iArr[1] = iArr[1] - i13;
            } else {
                throw new NoSuchNativeViewException("Native view " + i11 + " is no longer on screen");
            }
        } else {
            throw new NoSuchNativeViewException("No native view for " + i11 + " currently exists");
        }
    }

    public synchronized void measureInWindow(int i11, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i11);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            throw new NoSuchNativeViewException("No native view for " + i11 + " currently exists");
        }
    }

    public synchronized void removeRootView(int i11) {
        UiThreadUtil.assertOnUiThread();
        if (!this.mRootTags.get(i11)) {
            SoftAssertions.assertUnreachable("View with tag " + i11 + " is not registered as a root view");
        }
        dropView(this.mTagsToViews.get(i11));
        this.mRootTags.delete(i11);
    }

    public final synchronized View resolveView(int i11) {
        View view;
        view = this.mTagsToViews.get(i11);
        if (view == null) {
            throw new IllegalViewOperationException("Trying to resolve view with tag " + i11 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i11) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i11);
        if (viewManager == null) {
            throw new IllegalViewOperationException("ViewManager for tag " + i11 + " could not be found.\n");
        }
        return viewManager;
    }

    public void sendAccessibilityEvent(int i11, int i12) {
        View view = this.mTagsToViews.get(i11);
        if (view != null) {
            view.sendAccessibilityEvent(i12);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i11);
    }

    public synchronized void setChildren(int i11, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i11);
        ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i11);
        for (int i12 = 0; i12 < readableArray.size(); i12++) {
            View view = this.mTagsToViews.get(readableArray.getInt(i12));
            if (view != null) {
                viewGroupManager.addView(viewGroup, view, i12);
            } else {
                throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i12) + "\n detail: " + constructSetChildrenErrorMessage(viewGroup, viewGroupManager, readableArray));
            }
        }
    }

    public synchronized void setJSResponder(int i11, int i12, boolean z11) {
        if (!z11) {
            this.mJSResponderHandler.d(i12, null);
            return;
        }
        View view = this.mTagsToViews.get(i11);
        if (i12 != i11 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.d(i12, (ViewParent) view);
            return;
        }
        if (this.mRootTags.get(i11)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i11 + " that is a root view");
        }
        this.mJSResponderHandler.d(i12, view.getParent());
    }

    public void setLayoutAnimationEnabled(boolean z11) {
        this.mLayoutAnimationEnabled = z11;
    }

    public synchronized void showPopupMenu(int i11, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i11);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i11);
            return;
        }
        PopupMenu popupMenu = new PopupMenu(getReactContextForView(i11), view);
        this.mPopupMenu = popupMenu;
        Menu menu = popupMenu.getMenu();
        for (int i12 = 0; i12 < readableArray.size(); i12++) {
            menu.add(0, 0, i12, readableArray.getString(i12));
        }
        b bVar = new b(callback, null);
        this.mPopupMenu.setOnMenuItemClickListener(bVar);
        this.mPopupMenu.setOnDismissListener(bVar);
        this.mPopupMenu.show();
    }

    public synchronized void updateInstanceHandle(int i11, long j11) {
        UiThreadUtil.assertOnUiThread();
        try {
            updateInstanceHandle(resolveView(i11), j11);
        } catch (IllegalViewOperationException e11) {
            String str = TAG;
            nd.a.k(str, "Unable to update properties for view tag " + i11, e11);
        }
    }

    public synchronized void updateLayout(int i11, int i12, int i13, int i14, int i15, int i16) {
        UiThreadUtil.assertOnUiThread();
        zg.a.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i11).a("tag", i12).c();
        View resolveView = resolveView(i12);
        resolveView.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
        ViewParent parent = resolveView.getParent();
        if (parent instanceof i0) {
            parent.requestLayout();
        }
        if (!this.mRootTags.get(i11)) {
            ViewManager viewManager = this.mTagsToViewManagers.get(i11);
            if (viewManager instanceof g) {
                g gVar = (g) viewManager;
                if (gVar != null && !gVar.needsCustomLayoutForChildren()) {
                    updateLayout(resolveView, i13, i14, i15, i16);
                }
            } else {
                throw new IllegalViewOperationException("Trying to use view with tag " + i11 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
            }
        } else {
            updateLayout(resolveView, i13, i14, i15, i16);
        }
        com.facebook.systrace.a.g(0L);
    }

    public synchronized void updateProperties(int i11, e0 e0Var) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager resolveViewManager = resolveViewManager(i11);
            View resolveView = resolveView(i11);
            if (e0Var != null) {
                resolveViewManager.updateProperties(resolveView, e0Var);
            }
        } catch (IllegalViewOperationException e11) {
            String str = TAG;
            nd.a.k(str, "Unable to update properties for view tag " + i11, e11);
        }
    }

    public synchronized void updateViewExtraData(int i11, Object obj) {
        UiThreadUtil.assertOnUiThread();
        resolveViewManager(i11).updateExtraData(resolveView(i11), obj);
    }

    public m(d1 d1Var, RootViewManager rootViewManager) {
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new mg.a();
        this.mLayoutAnimator = new com.facebook.react.uimanager.layoutanimation.e();
        this.mBoundingBox = new RectF();
        this.mViewManagers = d1Var;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    private void updateInstanceHandle(View view, long j11) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(com.facebook.react.h.f11878l, Long.valueOf(j11));
    }

    public synchronized void dispatchCommand(int i11, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i11);
        if (view != null) {
            ViewManager resolveViewManager = resolveViewManager(i11);
            b1 delegate = resolveViewManager.getDelegate();
            if (delegate != null) {
                delegate.b(view, str, readableArray);
            } else {
                resolveViewManager.receiveCommand((ViewManager) view, str, readableArray);
            }
        } else {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i11 + "] and command " + str);
        }
    }

    private void updateLayout(View view, int i11, int i12, int i13, int i14) {
        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
            this.mLayoutAnimator.applyLayoutUpdate(view, i11, i12, i13, i14);
        } else {
            view.layout(i11, i12, i13 + i11, i14 + i12);
        }
    }
}