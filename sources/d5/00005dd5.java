package com.swmansion.reanimated.layoutReanimation;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.d1;
import com.facebook.react.uimanager.layoutanimation.e;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.z0;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public class ReanimatedNativeHierarchyManager extends m {
    private final HashMap<Integer, Runnable> cleanerCallback;
    private boolean initOk;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private e mReaLayoutAnimator;
    private final HashMap<Integer, ArrayList<View>> toBeRemoved;

    public ReanimatedNativeHierarchyManager(d1 d1Var, ReactApplicationContext reactApplicationContext) {
        super(d1Var);
        this.toBeRemoved = new HashMap<>();
        this.cleanerCallback = new HashMap<>();
        this.mReaLayoutAnimator = null;
        this.mPendingDeletionsForTag = new HashMap<>();
        this.initOk = true;
        this.mReaLayoutAnimator = new ReaLayoutAnimator(reactApplicationContext, this);
        Class<? super Object> superclass = getClass().getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedNativeHierarchyManager");
            return;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mLayoutAnimator");
            declaredField.setAccessible(true);
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                    declaredField2.setAccessible(true);
                    declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
                } catch (IllegalAccessException | NoSuchFieldException e11) {
                    e11.printStackTrace();
                }
            }
            declaredField.set(this, this.mReaLayoutAnimator);
        } catch (IllegalAccessException | NoSuchFieldException e12) {
            this.initOk = false;
            e12.printStackTrace();
        }
        try {
            Field declaredField3 = superclass.getDeclaredField("mPendingDeletionsForTag");
            declaredField3.setAccessible(true);
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    Field declaredField4 = Field.class.getDeclaredField("accessFlags");
                    declaredField4.setAccessible(true);
                    declaredField4.setInt(declaredField3, declaredField3.getModifiers() & (-17));
                } catch (IllegalAccessException | NoSuchFieldException e13) {
                    e13.printStackTrace();
                }
            }
            declaredField3.set(this, this.mPendingDeletionsForTag);
        } catch (IllegalAccessException | NoSuchFieldException e14) {
            this.initOk = false;
            e14.printStackTrace();
        }
        if (this.initOk) {
            setLayoutAnimationEnabled(true);
        }
    }

    private boolean isLayoutAnimationDisabled() {
        return (this.initOk && ((ReaLayoutAnimator) this.mReaLayoutAnimator).isLayoutAnimationEnabled()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.m
    public synchronized void dropView(View view) {
        if (isLayoutAnimationDisabled()) {
            super.dropView(view);
            return;
        }
        if (this.toBeRemoved.containsKey(Integer.valueOf(view.getId()))) {
            this.toBeRemoved.remove(Integer.valueOf(view.getId()));
        }
        if (this.cleanerCallback.containsKey(Integer.valueOf(view.getId()))) {
            this.cleanerCallback.remove(Integer.valueOf(view.getId()));
            this.cleanerCallback.get(Integer.valueOf(view.getId())).run();
        }
        super.dropView(view);
    }

    @Override // com.facebook.react.uimanager.m
    public synchronized void manageChildren(int i11, int[] iArr, z0[] z0VarArr, int[] iArr2) {
        Set<Integer> set;
        ArrayList<View> arrayList;
        if (isLayoutAnimationDisabled()) {
            super.manageChildren(i11, iArr, z0VarArr, iArr2);
            return;
        }
        try {
            final ViewGroup viewGroup = (ViewGroup) resolveView(i11);
            final ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i11);
            if (viewGroupManager.getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                super.manageChildren(i11, iArr, z0VarArr, iArr2);
                return;
            }
            if (this.toBeRemoved.containsKey(Integer.valueOf(i11))) {
                HashSet hashSet = new HashSet();
                Iterator<View> it2 = this.toBeRemoved.get(Integer.valueOf(i11)).iterator();
                while (it2.hasNext()) {
                    hashSet.add(Integer.valueOf(it2.next().getId()));
                }
                while (viewGroupManager.getChildCount(viewGroup) != 0 && hashSet.contains(Integer.valueOf(viewGroupManager.getChildAt(viewGroup, viewGroupManager.getChildCount(viewGroup) - 1).getId()))) {
                    viewGroupManager.removeViewAt(viewGroup, viewGroupManager.getChildCount(viewGroup) - 1);
                }
            }
            if (iArr2 != null) {
                if (!this.toBeRemoved.containsKey(Integer.valueOf(i11))) {
                    this.toBeRemoved.put(Integer.valueOf(i11), new ArrayList<>());
                }
                ArrayList<View> arrayList2 = this.toBeRemoved.get(Integer.valueOf(i11));
                int length = iArr2.length;
                int i12 = 0;
                while (i12 < length) {
                    try {
                        final View resolveView = resolveView(Integer.valueOf(iArr2[i12]).intValue());
                        arrayList2.add(resolveView);
                        final ArrayList<View> arrayList3 = arrayList2;
                        arrayList = arrayList2;
                        this.cleanerCallback.put(Integer.valueOf(resolveView.getId()), new Runnable() { // from class: com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager.1
                            @Override // java.lang.Runnable
                            public void run() {
                                arrayList3.remove(resolveView);
                                viewGroupManager.removeView(viewGroup, resolveView);
                            }
                        });
                    } catch (IllegalViewOperationException e11) {
                        arrayList = arrayList2;
                        e11.printStackTrace();
                    }
                    i12++;
                    arrayList2 = arrayList;
                }
            }
            HashMap<Integer, Set<Integer>> hashMap = this.mPendingDeletionsForTag;
            if (hashMap != null && (set = hashMap.get(Integer.valueOf(i11))) != null) {
                set.clear();
            }
            super.manageChildren(i11, iArr, z0VarArr, null);
            if (this.toBeRemoved.containsKey(Integer.valueOf(i11))) {
                Iterator<View> it3 = this.toBeRemoved.get(Integer.valueOf(i11)).iterator();
                while (it3.hasNext()) {
                    viewGroupManager.addView(viewGroup, it3.next(), viewGroupManager.getChildCount(viewGroup));
                }
            }
            super.manageChildren(i11, null, null, iArr2);
        } catch (IllegalViewOperationException e12) {
            e12.printStackTrace();
            super.manageChildren(i11, iArr, z0VarArr, iArr2);
        }
    }

    public void publicDropView(View view) {
        dropView(view);
    }

    @Override // com.facebook.react.uimanager.m
    public synchronized void updateLayout(int i11, int i12, int i13, int i14, int i15, int i16) {
        e eVar;
        super.updateLayout(i11, i12, i13, i14, i15, i16);
        if (isLayoutAnimationDisabled()) {
            return;
        }
        try {
            View resolveView = resolveView(i12);
            String name = resolveViewManager(i12).getName();
            View resolveView2 = resolveView(i11);
            if (resolveView2 != null && name.equals(ScreenViewManager.REACT_CLASS) && (eVar = this.mReaLayoutAnimator) != null) {
                eVar.applyLayoutUpdate(resolveView, (int) resolveView2.getX(), (int) resolveView2.getY(), resolveView2.getWidth(), resolveView2.getHeight());
            }
        } catch (IllegalViewOperationException e11) {
            e11.printStackTrace();
        }
    }

    public ReanimatedNativeHierarchyManager(d1 d1Var, RootViewManager rootViewManager) {
        super(d1Var, rootViewManager);
        this.toBeRemoved = new HashMap<>();
        this.cleanerCallback = new HashMap<>();
        this.mReaLayoutAnimator = null;
        this.mPendingDeletionsForTag = new HashMap<>();
        this.initOk = true;
    }
}