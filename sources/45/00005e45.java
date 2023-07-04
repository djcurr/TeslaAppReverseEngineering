package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.rnscreens.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0002\b\tB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/swmansion/rnscreens/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/swmansion/rnscreens/d;", "screenView", "(Lcom/swmansion/rnscreens/d;)V", "e", "a", "b", "react-native-screens_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public class i extends Fragment {

    /* renamed from: e */
    public static final a f21252e = new a(null);

    /* renamed from: a */
    public d f21253a;

    /* renamed from: b */
    private final List<f<?>> f21254b;

    /* renamed from: c */
    private boolean f21255c;

    /* renamed from: d */
    private float f21256d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        protected final View a(View view) {
            kotlin.jvm.internal.s.g(view, "view");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.endViewTransition(view);
                viewGroup.removeView(view);
            }
            view.setVisibility(0);
            return view;
        }
    }

    /* loaded from: classes6.dex */
    public enum b {
        Appear,
        WillAppear,
        Disappear,
        WillDisappear
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21257a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.WillAppear.ordinal()] = 1;
            iArr[b.Appear.ordinal()] = 2;
            iArr[b.WillDisappear.ordinal()] = 3;
            iArr[b.Disappear.ordinal()] = 4;
            f21257a = iArr;
        }
    }

    public i() {
        this.f21254b = new ArrayList();
        this.f21256d = -1.0f;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public static /* synthetic */ void a(i iVar) {
        p(iVar);
    }

    public static /* synthetic */ void b(i iVar) {
        r(iVar);
    }

    private final void c(b bVar, i iVar) {
        com.facebook.react.uimanager.events.c fVar;
        com.facebook.react.uimanager.events.d eventDispatcher;
        if (iVar instanceof m) {
            d m11 = iVar.m();
            int i11 = c.f21257a[bVar.ordinal()];
            if (i11 == 1) {
                fVar = new yr.f(m11.getId());
            } else if (i11 == 2) {
                fVar = new yr.b(m11.getId());
            } else if (i11 == 3) {
                fVar = new yr.g(m11.getId());
            } else if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                fVar = new yr.c(m11.getId());
            }
            Context context = m11.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            UIManagerModule uIManagerModule = (UIManagerModule) ((ReactContext) context).getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null && (eventDispatcher = uIManagerModule.getEventDispatcher()) != null) {
                eventDispatcher.g(fVar);
            }
            iVar.d(bVar);
        }
    }

    private final void d(b bVar) {
        d topScreen;
        i fragment;
        for (f<?> fVar : this.f21254b) {
            if (fVar.getScreenCount() > 0 && (topScreen = fVar.getTopScreen()) != null && (topScreen.getStackAnimation() != d.e.NONE || isRemoving())) {
                d topScreen2 = fVar.getTopScreen();
                if (topScreen2 != null && (fragment = topScreen2.getFragment()) != null) {
                    c(bVar, fragment);
                }
            }
        }
    }

    public static final void p(i this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.f();
    }

    public static final void r(i this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.h();
    }

    public static final View s(View view) {
        return f21252e.a(view);
    }

    private final void y() {
        androidx.fragment.app.h activity = getActivity();
        if (activity == null) {
            this.f21255c = true;
        } else {
            s.f21312a.p(m(), activity, w());
        }
    }

    public final void e() {
        com.facebook.react.uimanager.events.d eventDispatcher;
        Context context = m().getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        UIManagerModule uIManagerModule = (UIManagerModule) ((ReactContext) context).getNativeModule(UIManagerModule.class);
        if (uIManagerModule == null || (eventDispatcher = uIManagerModule.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.g(new yr.a(m().getId()));
    }

    public final void f() {
        c(b.Appear, this);
        k(1.0f, false);
    }

    public final void g() {
        c(b.Disappear, this);
        k(1.0f, true);
    }

    public final void h() {
        c(b.WillAppear, this);
        k(BitmapDescriptorFactory.HUE_RED, false);
    }

    public final void i() {
        c(b.WillDisappear, this);
        k(BitmapDescriptorFactory.HUE_RED, true);
    }

    public final void k(float f11, boolean z11) {
        com.facebook.react.uimanager.events.d eventDispatcher;
        if (this instanceof m) {
            if (this.f21256d == f11) {
                return;
            }
            float max = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, f11));
            this.f21256d = max;
            if (!(max == BitmapDescriptorFactory.HUE_RED)) {
                r1 = (max != 1.0f ? 0 : 1) != 0 ? 2 : 3;
            }
            short s11 = (short) r1;
            f<?> container = m().getContainer();
            boolean goingForward = container instanceof k ? ((k) container).getGoingForward() : false;
            Context context = m().getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            UIManagerModule uIManagerModule = (UIManagerModule) ((ReactContext) context).getNativeModule(UIManagerModule.class);
            if (uIManagerModule == null || (eventDispatcher = uIManagerModule.getEventDispatcher()) == null) {
                return;
            }
            eventDispatcher.g(new yr.e(m().getId(), this.f21256d, z11, goingForward, s11));
        }
    }

    public final List<f<?>> l() {
        return this.f21254b;
    }

    public final d m() {
        d dVar = this.f21253a;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.s.x("screen");
        return null;
    }

    public void n() {
        y();
    }

    public void o() {
        if (isResumed()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.g
                {
                    i.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.a(i.this);
                }
            });
        } else {
            g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        Context context = getContext();
        FrameLayout frameLayout = context == null ? null : new FrameLayout(context);
        m().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (frameLayout != null) {
            frameLayout.addView(s(m()));
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.facebook.react.uimanager.events.d eventDispatcher;
        super.onDestroy();
        f<?> container = m().getContainer();
        if ((container == null || !container.j(this)) && (m().getContext() instanceof ReactContext)) {
            Context context = m().getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            UIManagerModule uIManagerModule = (UIManagerModule) ((ReactContext) context).getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null && (eventDispatcher = uIManagerModule.getEventDispatcher()) != null) {
                eventDispatcher.g(new yr.d(m().getId()));
            }
        }
        this.f21254b.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f21255c) {
            this.f21255c = false;
            s.f21312a.p(m(), v(), w());
        }
    }

    public final void q() {
        if (isResumed()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.h
                {
                    i.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.b(i.this);
                }
            });
        } else {
            i();
        }
    }

    public final void t(f<?> screenContainer) {
        kotlin.jvm.internal.s.g(screenContainer, "screenContainer");
        this.f21254b.add(screenContainer);
    }

    public final void u(d dVar) {
        kotlin.jvm.internal.s.g(dVar, "<set-?>");
        this.f21253a = dVar;
    }

    public final Activity v() {
        i fragment;
        androidx.fragment.app.h activity;
        androidx.fragment.app.h activity2 = getActivity();
        if (activity2 == null) {
            Context context = m().getContext();
            if (context instanceof ReactContext) {
                ReactContext reactContext = (ReactContext) context;
                if (reactContext.getCurrentActivity() != null) {
                    return reactContext.getCurrentActivity();
                }
            }
            for (ViewParent container = m().getContainer(); container != null; container = container.getParent()) {
                if ((container instanceof d) && (fragment = ((d) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                    return activity;
                }
            }
            return null;
        }
        return activity2;
    }

    public final ReactContext w() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        } else if (m().getContext() instanceof ReactContext) {
            Context context2 = m().getContext();
            Objects.requireNonNull(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        } else {
            for (ViewParent container = m().getContainer(); container != null; container = container.getParent()) {
                if (container instanceof d) {
                    d dVar = (d) container;
                    if (dVar.getContext() instanceof ReactContext) {
                        Context context3 = dVar.getContext();
                        Objects.requireNonNull(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        return (ReactContext) context3;
                    }
                }
            }
            return null;
        }
    }

    public final void x(f<?> screenContainer) {
        kotlin.jvm.internal.s.g(screenContainer, "screenContainer");
        this.f21254b.remove(screenContainer);
    }

    public i(d screenView) {
        kotlin.jvm.internal.s.g(screenView, "screenView");
        this.f21254b = new ArrayList();
        this.f21256d = -1.0f;
        u(screenView);
    }
}