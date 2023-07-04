package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.q0;

/* loaded from: classes6.dex */
public final class w extends com.facebook.react.uimanager.i {

    /* renamed from: z */
    private ReactContext f21325z;

    public w(ReactContext mContext) {
        kotlin.jvm.internal.s.g(mContext, "mContext");
        this.f21325z = mContext;
    }

    public static /* synthetic */ void p1(w wVar, com.facebook.react.uimanager.m mVar) {
        q1(wVar, mVar);
    }

    public static final void q1(w this$0, com.facebook.react.uimanager.m nativeViewHierarchyManager) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(nativeViewHierarchyManager, "nativeViewHierarchyManager");
        View resolveView = nativeViewHierarchyManager.resolveView(this$0.L());
        if (resolveView instanceof f) {
            ((f) resolveView).q();
        }
    }

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public void X(com.facebook.react.uimanager.n nativeViewHierarchyOptimizer) {
        kotlin.jvm.internal.s.g(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.X(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f21325z.getNativeModule(UIManagerModule.class);
        if (uIManagerModule == null) {
            return;
        }
        uIManagerModule.addUIBlock(new q0() { // from class: com.swmansion.rnscreens.v
            @Override // com.facebook.react.uimanager.q0
            public final void execute(com.facebook.react.uimanager.m mVar) {
                w.p1(w.this, mVar);
            }
        });
    }
}