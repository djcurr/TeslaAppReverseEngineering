package com.swmansion.reanimated.layoutReanimation;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.r0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.Scheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public class AnimationsManager implements ViewHierarchyObserver {
    private static final String[] LAYOUT_KEYS = {Snapshot.ORIGIN_X, Snapshot.ORIGIN_Y, Snapshot.WIDTH, Snapshot.HEIGHT};
    private boolean isCatalystInstanceDestroyed;
    private ReactContext mContext;
    private NativeMethodsHolder mNativeMethodsHolder;
    private ReanimatedNativeHierarchyManager mReanimatedNativeHierarchyManager;
    private WeakReference<Scheduler> mScheduler;
    private r0 mUIImplementation;
    private UIManagerModule mUIManager;
    private boolean mCleaningScheduled = false;
    private HashMap<Integer, ViewState> mStates = new HashMap<>();
    private HashMap<Integer, View> mViewForTag = new HashMap<>();
    private HashSet<Integer> mToRemove = new HashSet<>();
    private HashMap<Integer, ViewManager> mViewManager = new HashMap<>();
    private HashMap<Integer, ViewManager> mParentViewManager = new HashMap<>();
    private HashMap<Integer, View> mParent = new HashMap<>();
    private HashMap<Integer, Runnable> mCallbacks = new HashMap<>();

    /* loaded from: classes6.dex */
    public enum ViewState {
        Inactive,
        Appearing,
        Disappearing,
        Layout,
        ToRemove
    }

    public AnimationsManager(ReactContext reactContext, r0 r0Var, UIManagerModule uIManagerModule) {
        this.isCatalystInstanceDestroyed = false;
        this.mContext = reactContext;
        this.mUIImplementation = r0Var;
        this.mUIManager = uIManagerModule;
        this.isCatalystInstanceDestroyed = false;
    }

    public static /* synthetic */ void a(AnimationsManager animationsManager, WeakReference weakReference) {
        animationsManager.lambda$scheduleCleaning$0(weakReference);
    }

    private static void addProp(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
        } else if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Number) {
            writableMap.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof ReadableArray) {
            writableMap.putArray(str, (ReadableArray) obj);
        } else if (obj instanceof ReadableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else {
            throw new IllegalStateException("Unknown type of animated value [Layout Aniamtions]");
        }
    }

    private boolean dfs(View view, View view2, HashSet<Integer> hashSet) {
        ViewGroup viewGroup;
        boolean z11;
        if (hashSet.contains(Integer.valueOf(view2.getId())) || !this.mStates.containsKey(Integer.valueOf(view2.getId()))) {
            boolean z12 = false;
            if ((view2 instanceof ViewGroup) && (this.mViewManager.get(Integer.valueOf(view2.getId())) instanceof ViewGroupManager)) {
                ViewGroup viewGroup2 = (ViewGroup) view2;
                ViewGroupManager viewGroupManager = (ViewGroupManager) this.mViewManager.get(Integer.valueOf(viewGroup2.getId()));
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < viewGroupManager.getChildCount(viewGroup2); i11++) {
                    arrayList.add(viewGroupManager.getChildAt(viewGroup2, i11));
                }
                Iterator it2 = arrayList.iterator();
                loop1: while (true) {
                    while (it2.hasNext()) {
                        z11 = z11 || dfs(view, (View) it2.next(), hashSet);
                    }
                }
                z12 = z11;
            }
            if (!z12) {
                View view3 = (View) view2.getParent();
                if (this.mCallbacks.containsKey(Integer.valueOf(view2.getId()))) {
                    this.mCallbacks.remove(Integer.valueOf(view2.getId()));
                    this.mCallbacks.get(Integer.valueOf(view2.getId())).run();
                }
                if (this.mParent.containsKey(Integer.valueOf(view2.getId())) && (viewGroup = (ViewGroup) this.mParent.get(Integer.valueOf(view2.getId()))) != null) {
                    viewGroup.removeView(view2);
                }
                this.mStates.remove(Integer.valueOf(view2.getId()));
                this.mViewForTag.remove(Integer.valueOf(view2.getId()));
                this.mViewManager.remove(Integer.valueOf(view2.getId()));
                this.mParentViewManager.remove(Integer.valueOf(view2.getId()));
                this.mParent.remove(Integer.valueOf(view2.getId()));
                this.mNativeMethodsHolder.removeConfigForTag(view2.getId());
                this.mToRemove.remove(Integer.valueOf(view2.getId()));
            }
            return z12;
        }
        return true;
    }

    private void findRoot(View view, HashSet<Integer> hashSet) {
        int i11 = -1;
        while (view != null) {
            ViewState viewState = this.mStates.get(Integer.valueOf(view.getId()));
            if (viewState != ViewState.Disappearing) {
                if (viewState == ViewState.ToRemove) {
                    i11 = view.getId();
                }
                if (!(view.getParent() instanceof View)) {
                    break;
                }
                view = (View) view.getParent();
            } else {
                return;
            }
        }
        if (i11 != -1) {
            hashSet.add(Integer.valueOf(i11));
        }
    }

    public /* synthetic */ void lambda$scheduleCleaning$0(WeakReference weakReference) {
        this.mCleaningScheduled = false;
        if (((AnimationsManager) weakReference.get()) == null) {
            return;
        }
        removeLeftovers();
    }

    private void removeLeftovers() {
        HashSet<Integer> hashSet = new HashSet<>();
        Iterator<Integer> it2 = this.mToRemove.iterator();
        while (it2.hasNext()) {
            int intValue = it2.next().intValue();
            View view = this.mViewForTag.get(Integer.valueOf(intValue));
            if (view == null) {
                try {
                    view = this.mUIManager.resolveView(intValue);
                    this.mViewForTag.put(Integer.valueOf(intValue), view);
                } catch (IllegalViewOperationException unused) {
                }
            }
            findRoot(view, hashSet);
        }
        Iterator<Integer> it3 = hashSet.iterator();
        while (it3.hasNext()) {
            View view2 = this.mViewForTag.get(Integer.valueOf(it3.next().intValue()));
            if (view2 != null) {
                dfs(view2, view2, this.mToRemove);
            }
        }
    }

    private void scheduleCleaning() {
        if (this.mCleaningScheduled) {
            return;
        }
        this.mCleaningScheduled = true;
        final WeakReference weakReference = new WeakReference(this);
        this.mContext.runOnUiQueueThread(new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.a
            {
                AnimationsManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnimationsManager.a(AnimationsManager.this, weakReference);
            }
        });
    }

    public ReanimatedNativeHierarchyManager getReanimatedNativeHierarchyManager() {
        return this.mReanimatedNativeHierarchyManager;
    }

    public boolean isLayoutAnimationEnabled() {
        NativeMethodsHolder nativeMethodsHolder = this.mNativeMethodsHolder;
        return nativeMethodsHolder != null && nativeMethodsHolder.isLayoutAnimationEnabled();
    }

    public void notifyAboutEnd(int i11, boolean z11) {
        if (z11) {
            return;
        }
        ViewState viewState = this.mStates.get(Integer.valueOf(i11));
        if (viewState == ViewState.Appearing) {
            this.mStates.put(Integer.valueOf(i11), ViewState.Layout);
        }
        if (viewState == ViewState.Disappearing) {
            this.mStates.put(Integer.valueOf(i11), ViewState.ToRemove);
            this.mToRemove.add(Integer.valueOf(i11));
            scheduleCleaning();
        }
    }

    public void notifyAboutProgress(Map<String, Object> map, Integer num) {
        if (this.mStates.get(num) == ViewState.Inactive) {
            this.mStates.put(num, ViewState.Appearing);
        }
        setNewProps(map, this.mViewForTag.get(num), this.mViewManager.get(num), this.mParentViewManager.get(num), Integer.valueOf(this.mParent.get(num).getId()));
    }

    public void onCatalystInstanceDestroy() {
        this.isCatalystInstanceDestroyed = true;
        this.mNativeMethodsHolder = null;
        this.mContext = null;
        this.mUIImplementation = null;
        this.mUIManager = null;
        this.mStates = null;
        this.mToRemove = null;
        this.mViewForTag = null;
        this.mViewManager = null;
        this.mParent = null;
        this.mParentViewManager = null;
        this.mCallbacks = null;
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewCreate(View view, ViewGroup viewGroup, Snapshot snapshot) {
        if (this.isCatalystInstanceDestroyed) {
            return;
        }
        Scheduler scheduler = this.mScheduler.get();
        if (scheduler != null) {
            scheduler.triggerUI();
        }
        if (!this.mStates.containsKey(Integer.valueOf(view.getId()))) {
            this.mStates.put(Integer.valueOf(view.getId()), ViewState.Inactive);
            this.mViewForTag.put(Integer.valueOf(view.getId()), view);
            this.mViewManager.put(Integer.valueOf(view.getId()), snapshot.viewManager);
            this.mParentViewManager.put(Integer.valueOf(view.getId()), snapshot.parentViewManager);
            this.mParent.put(Integer.valueOf(view.getId()), snapshot.parent);
        }
        Integer valueOf = Integer.valueOf(view.getId());
        HashMap<String, Object> targetMap = snapshot.toTargetMap();
        if (this.mStates.get(Integer.valueOf(view.getId())) != ViewState.Inactive || targetMap == null) {
            return;
        }
        this.mNativeMethodsHolder.startAnimationForTag(valueOf.intValue(), "entering", prepareDataForAnimationWorklet(targetMap, true));
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewRemoval(View view, ViewGroup viewGroup, Snapshot snapshot, Runnable runnable) {
        ViewState viewState;
        if (this.isCatalystInstanceDestroyed) {
            return;
        }
        Integer valueOf = Integer.valueOf(view.getId());
        HashMap<String, Object> currentMap = snapshot.toCurrentMap();
        ViewState viewState2 = this.mStates.get(Integer.valueOf(view.getId()));
        ViewState viewState3 = ViewState.Disappearing;
        if (viewState2 == viewState3 || viewState2 == (viewState = ViewState.ToRemove)) {
            return;
        }
        this.mCallbacks.put(valueOf, runnable);
        if (viewState2 != ViewState.Inactive && viewState2 != null) {
            this.mStates.put(valueOf, viewState3);
            this.mNativeMethodsHolder.startAnimationForTag(valueOf.intValue(), "exiting", prepareDataForAnimationWorklet(currentMap, false));
        } else if (currentMap != null) {
            this.mStates.put(Integer.valueOf(view.getId()), viewState);
            this.mToRemove.add(Integer.valueOf(view.getId()));
            scheduleCleaning();
        }
    }

    @Override // com.swmansion.reanimated.layoutReanimation.ViewHierarchyObserver
    public void onViewUpdate(View view, Snapshot snapshot, Snapshot snapshot2) {
        if (this.isCatalystInstanceDestroyed) {
            return;
        }
        Integer valueOf = Integer.valueOf(view.getId());
        HashMap<String, Object> targetMap = snapshot2.toTargetMap();
        HashMap<String, Object> currentMap = snapshot.toCurrentMap();
        ViewState viewState = this.mStates.get(Integer.valueOf(view.getId()));
        if (viewState == null || viewState == ViewState.Disappearing || viewState == ViewState.ToRemove || viewState == ViewState.Inactive) {
            return;
        }
        if (viewState == ViewState.Appearing) {
            boolean z11 = true;
            for (int i11 = 0; i11 < Snapshot.targetKeysToTransform.size(); i11++) {
                if (((Number) currentMap.get(Snapshot.currentKeysToTransform.get(i11))).doubleValue() != ((Number) targetMap.get(Snapshot.targetKeysToTransform.get(i11))).doubleValue()) {
                    z11 = false;
                }
            }
            if (z11) {
                return;
            }
        }
        this.mStates.put(Integer.valueOf(view.getId()), ViewState.Layout);
        HashMap<String, Float> prepareDataForAnimationWorklet = prepareDataForAnimationWorklet(currentMap, false);
        HashMap<String, Float> hashMap = new HashMap<>(prepareDataForAnimationWorklet(targetMap, true));
        for (String str : prepareDataForAnimationWorklet.keySet()) {
            hashMap.put(str, prepareDataForAnimationWorklet.get(str));
        }
        this.mNativeMethodsHolder.startAnimationForTag(valueOf.intValue(), "layout", hashMap);
    }

    public HashMap<String, Float> prepareDataForAnimationWorklet(HashMap<String, Object> hashMap, boolean z11) {
        ArrayList<String> arrayList;
        HashMap<String, Float> hashMap2 = new HashMap<>();
        if (z11) {
            arrayList = Snapshot.targetKeysToTransform;
        } else {
            arrayList = Snapshot.currentKeysToTransform;
        }
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            hashMap2.put(next, Float.valueOf(p.a(((Integer) hashMap.get(next)).intValue())));
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i11 = displayMetrics.heightPixels;
            hashMap2.put("windowWidth", Float.valueOf(p.a(displayMetrics.widthPixels)));
            hashMap2.put("windowHeight", Float.valueOf(p.a(i11)));
        } else {
            hashMap2.put("windowWidth", Float.valueOf(p.a(BitmapDescriptorFactory.HUE_RED)));
            hashMap2.put("windowHeight", Float.valueOf(p.a(BitmapDescriptorFactory.HUE_RED)));
        }
        return hashMap2;
    }

    public void printSubTree(View view, int i11) {
        if (i11 == 0) {
            Log.v("rea", "----------------------");
        }
        if (view == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            sb2.append(Marker.ANY_NON_NULL_MARKER);
        }
        sb2.append(" TAG:");
        sb2.append(view.getId());
        sb2.append(" STATE:");
        sb2.append(this.mStates.get(Integer.valueOf(view.getId())));
        sb2.append(" CLASS:");
        sb2.append(view.getClass().getSimpleName());
        Log.v("rea", sb2.toString());
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i12 >= viewGroup.getChildCount()) {
                return;
            }
            printSubTree(viewGroup.getChildAt(i12), i11 + 1);
            i12++;
        }
    }

    public void setNativeMethods(NativeMethodsHolder nativeMethodsHolder) {
        this.mNativeMethodsHolder = nativeMethodsHolder;
    }

    public void setNewProps(Map<String, Object> map, View view, ViewManager viewManager, ViewManager viewManager2, Integer num) {
        float a11;
        float a12;
        float a13;
        float a14;
        if (map.get(Snapshot.ORIGIN_X) != null) {
            a11 = ((Double) map.get(Snapshot.ORIGIN_X)).floatValue();
        } else {
            a11 = p.a(view.getLeft());
        }
        float f11 = a11;
        if (map.get(Snapshot.ORIGIN_Y) != null) {
            a12 = ((Double) map.get(Snapshot.ORIGIN_Y)).floatValue();
        } else {
            a12 = p.a(view.getTop());
        }
        float f12 = a12;
        if (map.get(Snapshot.WIDTH) != null) {
            a13 = ((Double) map.get(Snapshot.WIDTH)).floatValue();
        } else {
            a13 = p.a(view.getWidth());
        }
        float f13 = a13;
        if (map.get(Snapshot.HEIGHT) != null) {
            a14 = ((Double) map.get(Snapshot.HEIGHT)).floatValue();
        } else {
            a14 = p.a(view.getHeight());
        }
        updateLayout(view, viewManager2, num.intValue(), view.getId(), f11, f12, f13, a14);
        map.remove(Snapshot.ORIGIN_X);
        map.remove(Snapshot.ORIGIN_Y);
        map.remove(Snapshot.WIDTH);
        map.remove(Snapshot.HEIGHT);
        if (map.size() == 0) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (String str : map.keySet()) {
            addProp(javaOnlyMap, str, map.get(str));
        }
        viewManager.updateProperties(view, new e0(javaOnlyMap));
    }

    public void setReanimatedNativeHierarchyManager(ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager) {
        this.mReanimatedNativeHierarchyManager = reanimatedNativeHierarchyManager;
    }

    public void setScheduler(Scheduler scheduler) {
        this.mScheduler = new WeakReference<>(scheduler);
    }

    public void updateLayout(View view, ViewManager viewManager, int i11, int i12, float f11, float f12, float f13, float f14) {
        int round = Math.round(p.c(f11));
        int round2 = Math.round(p.c(f12));
        int round3 = Math.round(p.c(f13));
        int round4 = Math.round(p.c(f14));
        view.measure(View.MeasureSpec.makeMeasureSpec(round3, 1073741824), View.MeasureSpec.makeMeasureSpec(round4, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof i0) {
            parent.requestLayout();
        }
        if (i11 % 10 == 1) {
            if (viewManager instanceof g) {
                g gVar = (g) viewManager;
                if (gVar == null || gVar.needsCustomLayoutForChildren()) {
                    return;
                }
                view.layout(round, round2, round3 + round, round4 + round2);
                return;
            }
            throw new IllegalViewOperationException("Trying to use view with tag " + i11 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
        }
        view.layout(round, round2, round3 + round, round4 + round2);
    }
}