package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.i0;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class m extends com.facebook.react.views.view.g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f21201c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private boolean f21202a;

    /* renamed from: b  reason: collision with root package name */
    private l f21203b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof c) || (parent instanceof m)) {
                    return true;
                }
                if (parent instanceof i0) {
                    return false;
                }
            }
            return false;
        }
    }

    public m(Context context) {
        super(context);
    }

    public final void c() {
        l lVar = this.f21203b;
        if (lVar == null) {
            return;
        }
        lVar.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        s.g(ev2, "ev");
        if (this.f21202a) {
            l lVar = this.f21203b;
            s.e(lVar);
            if (lVar.c(ev2)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z11 = !f21201c.b(this);
        this.f21202a = z11;
        if (!z11) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.f21202a && this.f21203b == null) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f21203b = new l((ReactContext) context, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (this.f21202a) {
            l lVar = this.f21203b;
            s.e(lVar);
            lVar.g(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }
}