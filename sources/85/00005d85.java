package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.r;
import com.facebook.react.z;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c extends z {

    /* renamed from: y  reason: collision with root package name */
    private r f21179y;

    /* renamed from: z  reason: collision with root package name */
    private l f21180z;

    public c(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        s.g(ev2, "ev");
        l lVar = this.f21180z;
        boolean z11 = false;
        if (lVar != null && lVar.c(ev2)) {
            z11 = true;
        }
        if (z11) {
            return true;
        }
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.facebook.react.z, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        l lVar = this.f21180z;
        if (lVar != null) {
            lVar.g(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // com.facebook.react.z
    public void s(r reactInstanceManager, String moduleName, Bundle bundle) {
        s.g(reactInstanceManager, "reactInstanceManager");
        s.g(moduleName, "moduleName");
        super.s(reactInstanceManager, moduleName, bundle);
        this.f21179y = reactInstanceManager;
    }

    public final void w() {
        if (this.f21180z == null) {
            r rVar = this.f21179y;
            if (rVar == null) {
                s.x("_reactInstanceManager");
                rVar = null;
            }
            ReactContext A = rVar.A();
            s.e(A);
            s.f(A, "_reactInstanceManager.currentReactContext!!");
            this.f21180z = new l(A, this);
            return;
        }
        throw new IllegalStateException(s.p("GestureHandler already initialized for root view ", this).toString());
    }

    public final void x() {
        l lVar = this.f21180z;
        if (lVar == null) {
            return;
        }
        lVar.h();
        this.f21180z = null;
    }
}