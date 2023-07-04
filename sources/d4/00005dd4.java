package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.layoutanimation.e;
import com.facebook.react.uimanager.layoutanimation.f;
import com.facebook.react.uimanager.m;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class ReaLayoutAnimator extends e {
    private ReactApplicationContext mContext;
    private WeakReference<m> mWeakNativeViewHierarchyManage;
    private AnimationsManager mAnimationsManager = null;
    private volatile boolean mInitialized = false;

    public ReaLayoutAnimator(ReactApplicationContext reactApplicationContext, m mVar) {
        this.mWeakNativeViewHierarchyManage = new WeakReference<>(null);
        this.mContext = reactApplicationContext;
        this.mWeakNativeViewHierarchyManage = new WeakReference<>(mVar);
    }

    public static /* synthetic */ void a(f fVar) {
        fVar.a();
    }

    public static /* synthetic */ void b(m mVar, View view) {
        lambda$dfs$1(mVar, view);
    }

    private void dfs(final View view, final m mVar) {
        int id2 = view.getId();
        if (id2 == -1) {
            return;
        }
        ViewManager viewManager = null;
        try {
            viewManager = mVar.resolveViewManager(id2);
            this.mAnimationsManager.onViewRemoval(view, (ViewGroup) view.getParent(), new Snapshot(view, this.mWeakNativeViewHierarchyManage.get()), new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.b
                @Override // java.lang.Runnable
                public final void run() {
                    ReaLayoutAnimator.b(m.this, view);
                }
            });
        } catch (IllegalViewOperationException e11) {
            e11.printStackTrace();
        }
        if (!(viewManager instanceof ViewGroupManager)) {
            return;
        }
        ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
        int i11 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i11 >= viewGroupManager.getChildCount(viewGroup)) {
                return;
            }
            dfs(viewGroupManager.getChildAt(viewGroup, i11), mVar);
            i11++;
        }
    }

    public static /* synthetic */ void lambda$dfs$1(m mVar, View view) {
        ((ReanimatedNativeHierarchyManager) mVar).publicDropView(view);
    }

    @Override // com.facebook.react.uimanager.layoutanimation.e
    public void applyLayoutUpdate(View view, int i11, int i12, int i13, int i14) {
        if (!isLayoutAnimationEnabled()) {
            super.applyLayoutUpdate(view, i11, i12, i13, i14);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        maybeInit();
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            Snapshot snapshot = new Snapshot(view, this.mWeakNativeViewHierarchyManage.get());
            view.layout(i11, i12, i13 + i11, i14 + i12);
            this.mAnimationsManager.onViewUpdate(view, snapshot, new Snapshot(view, this.mWeakNativeViewHierarchyManage.get()));
            return;
        }
        view.layout(i11, i12, i13 + i11, i14 + i12);
        if (view.getId() != -1) {
            this.mAnimationsManager.onViewCreate(view, (ViewGroup) view.getParent(), new Snapshot(view, this.mWeakNativeViewHierarchyManage.get()));
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.e
    public void deleteView(View view, final f fVar) {
        if (!isLayoutAnimationEnabled()) {
            super.deleteView(view, fVar);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        m mVar = this.mWeakNativeViewHierarchyManage.get();
        try {
            ViewManager resolveViewManager = mVar.resolveViewManager(view.getId());
            if (resolveViewManager.getName().equals(ScreenViewManager.REACT_CLASS) && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                try {
                    if (mVar.resolveViewManager(((View) view.getParent().getParent()).getId()).getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                        super.deleteView(view, fVar);
                        return;
                    }
                } catch (IllegalViewOperationException e11) {
                    e11.printStackTrace();
                    super.deleteView(view, fVar);
                    return;
                }
            }
            maybeInit();
            this.mAnimationsManager.onViewRemoval(view, (ViewGroup) view.getParent(), new Snapshot(view, this.mWeakNativeViewHierarchyManage.get()), new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.c
                @Override // java.lang.Runnable
                public final void run() {
                    ReaLayoutAnimator.a(fVar);
                }
            });
            if (!(resolveViewManager instanceof ViewGroupManager)) {
                return;
            }
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager;
            int i11 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i11 >= viewGroupManager.getChildCount(viewGroup)) {
                    return;
                }
                dfs(viewGroupManager.getChildAt(viewGroup, i11), mVar);
                i11++;
            }
        } catch (IllegalViewOperationException e12) {
            e12.printStackTrace();
            super.deleteView(view, fVar);
        }
    }

    public boolean isLayoutAnimationEnabled() {
        maybeInit();
        return this.mAnimationsManager.isLayoutAnimationEnabled();
    }

    public void maybeInit() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
        this.mAnimationsManager = animationsManager;
        animationsManager.setReanimatedNativeHierarchyManager((ReanimatedNativeHierarchyManager) this.mWeakNativeViewHierarchyManage.get());
    }

    @Override // com.facebook.react.uimanager.layoutanimation.e
    public boolean shouldAnimateLayout(View view) {
        if (isLayoutAnimationEnabled()) {
            return (view == null || view.getParent() == null) ? false : true;
        }
        return super.shouldAnimateLayout(view);
    }
}