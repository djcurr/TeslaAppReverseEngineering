package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e0;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.gesturehandler.c;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0017J!\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0014¨\u0006 "}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "", "getName", "Lcom/facebook/react/uimanager/n0;", CoreConstants.CONTEXT_SCOPE_VALUE, "createViewInstance", "view", "", "useDrawableOnForeground", "Lvz/b0;", "setForeground", "useBorderlessDrawable", "setBorderless", "enabled", "setEnabled", "", "borderRadius", "setBorderRadius", "", "rippleColor", "setRippleColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "onAfterUpdateTransaction", "<init>", "()V", "a", "react-native-gesture-handler_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> {

    /* loaded from: classes6.dex */
    public static final class a extends ViewGroup implements c.b {

        /* renamed from: n */
        private static a f21146n;

        /* renamed from: a */
        private Integer f21148a;

        /* renamed from: b */
        private Integer f21149b;

        /* renamed from: c */
        private boolean f21150c;

        /* renamed from: d */
        private boolean f21151d;

        /* renamed from: e */
        private float f21152e;

        /* renamed from: f */
        private boolean f21153f;

        /* renamed from: g */
        private int f21154g;

        /* renamed from: h */
        private boolean f21155h;

        /* renamed from: i */
        private long f21156i;

        /* renamed from: j */
        private int f21157j;

        /* renamed from: k */
        private boolean f21158k;

        /* renamed from: l */
        public static final C0386a f21144l = new C0386a(null);

        /* renamed from: m */
        private static TypedValue f21145m = new TypedValue();

        /* renamed from: o */
        private static View.OnClickListener f21147o = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.a.c(view);
            }
        };

        /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a */
        /* loaded from: classes6.dex */
        public static final class C0386a {
            private C0386a() {
            }

            public /* synthetic */ C0386a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int b(Context context, String str) {
                SoftAssertions.assertNotNull(str);
                if (s.c(str, "selectableItemBackground")) {
                    return com.swmansion.gesturehandler.react.a.f21176a;
                }
                if (s.c(str, "selectableItemBackgroundBorderless")) {
                    return com.swmansion.gesturehandler.react.a.f21177b;
                }
                return context.getResources().getIdentifier(str, "attr", "android");
            }
        }

        public a(Context context) {
            super(context);
            this.f21153f = true;
            this.f21156i = -1L;
            this.f21157j = -1;
            setOnClickListener(f21147o);
            setClickable(true);
            setFocusable(true);
            this.f21155h = true;
        }

        public static /* synthetic */ void c(View view) {
            g(view);
        }

        private final Drawable e(Drawable drawable) {
            Integer num = this.f21148a;
            if (num != null && Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setColor(new ColorStateList(new int[][]{new int[]{16842910}}, new int[]{num.intValue()}));
            }
            Integer num2 = this.f21149b;
            if (Build.VERSION.SDK_INT >= 23 && num2 != null && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) com.facebook.react.uimanager.p.c(num2.intValue()));
            }
            return drawable;
        }

        private final Drawable f() {
            int i11 = Build.VERSION.SDK_INT;
            String str = (!this.f21151d || i11 < 21) ? "selectableItemBackground" : "selectableItemBackgroundBorderless";
            C0386a c0386a = f21144l;
            Context context = getContext();
            s.f(context, "context");
            getContext().getTheme().resolveAttribute(c0386a.b(context, str), f21145m, true);
            if (i11 >= 21) {
                Drawable drawable = getResources().getDrawable(f21145m.resourceId, getContext().getTheme());
                s.f(drawable, "{\n        resources.getD…d, context.theme)\n      }");
                return drawable;
            }
            Drawable drawable2 = getResources().getDrawable(f21145m.resourceId);
            s.f(drawable2, "{\n        @Suppress(\"Dep…Value.resourceId)\n      }");
            return drawable2;
        }

        public static final void g(View view) {
        }

        private final boolean h(u20.h<? extends View> hVar) {
            for (View view : hVar) {
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.f21158k || aVar.isPressed()) {
                        return true;
                    }
                }
                if (view instanceof ViewGroup) {
                    return h(e0.a((ViewGroup) view));
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ boolean i(a aVar, u20.h hVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                hVar = e0.a(aVar);
            }
            return aVar.h(hVar);
        }

        private final void j() {
            if (f21146n == this) {
                f21146n = null;
            }
        }

        private final boolean k() {
            if (i(this, null, 1, null)) {
                return false;
            }
            a aVar = f21146n;
            if (aVar == null) {
                f21146n = this;
                return true;
            }
            if (!this.f21153f) {
                if (!(aVar == null ? false : aVar.f21153f)) {
                    return true;
                }
            } else if (aVar == this) {
                return true;
            }
            return false;
        }

        @Override // com.swmansion.gesturehandler.c.b
        public boolean a() {
            boolean k11 = k();
            if (k11) {
                this.f21158k = true;
            }
            return k11;
        }

        @Override // com.swmansion.gesturehandler.c.b
        public void b() {
            j();
            this.f21158k = false;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f11, float f12) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f11, float f12) {
            a aVar = f21146n;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f11, f12);
            }
        }

        public final float getBorderRadius() {
            return this.f21152e;
        }

        public final boolean getExclusive() {
            return this.f21153f;
        }

        public final Integer getRippleColor() {
            return this.f21148a;
        }

        public final Integer getRippleRadius() {
            return this.f21149b;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f21151d;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f21150c;
        }

        public final void l() {
            if (this.f21155h) {
                this.f21155h = false;
                if (this.f21154g == 0) {
                    setBackground(null);
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    setForeground(null);
                }
                if (this.f21150c && i11 >= 23) {
                    setForeground(e(f()));
                    int i12 = this.f21154g;
                    if (i12 != 0) {
                        setBackgroundColor(i12);
                    }
                } else if (this.f21154g == 0 && this.f21148a == null) {
                    setBackground(f());
                } else {
                    PaintDrawable paintDrawable = new PaintDrawable(this.f21154g);
                    Drawable f11 = f();
                    float f12 = this.f21152e;
                    if (!(f12 == BitmapDescriptorFactory.HUE_RED)) {
                        paintDrawable.setCornerRadius(f12);
                        if (i11 >= 21 && (f11 instanceof RippleDrawable)) {
                            PaintDrawable paintDrawable2 = new PaintDrawable(-1);
                            paintDrawable2.setCornerRadius(this.f21152e);
                            ((RippleDrawable) f11).setDrawableByLayerId(16908334, paintDrawable2);
                        }
                    }
                    e(f11);
                    setBackground(new LayerDrawable(new Drawable[]{paintDrawable, f11}));
                }
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev2) {
            s.g(ev2, "ev");
            if (super.onInterceptTouchEvent(ev2)) {
                return true;
            }
            onTouchEvent(ev2);
            return isPressed();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            s.g(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            if (this.f21156i == eventTime && this.f21157j == action) {
                return false;
            }
            this.f21156i = eventTime;
            this.f21157j = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public void setBackgroundColor(int i11) {
            this.f21154g = i11;
            this.f21155h = true;
        }

        public final void setBorderRadius(float f11) {
            this.f21152e = f11 * getResources().getDisplayMetrics().density;
            this.f21155h = true;
        }

        public final void setExclusive(boolean z11) {
            this.f21153f = z11;
        }

        @Override // android.view.View
        public void setPressed(boolean z11) {
            if (z11) {
                k();
            }
            boolean z12 = false;
            if (!this.f21153f) {
                a aVar = f21146n;
                if (!(aVar != null && aVar.f21153f) && !i(this, null, 1, null)) {
                    z12 = true;
                }
            }
            if (!z11 || f21146n == this || z12) {
                super.setPressed(z11);
                this.f21158k = z11;
            }
            if (z11 || f21146n != this) {
                return;
            }
            f21146n = null;
        }

        public final void setRippleColor(Integer num) {
            this.f21148a = num;
            this.f21155h = true;
        }

        public final void setRippleRadius(Integer num) {
            this.f21149b = num;
            this.f21155h = true;
        }

        public final void setTouched(boolean z11) {
            this.f21158k = z11;
        }

        public final void setUseBorderlessDrawable(boolean z11) {
            this.f21151d = z11;
        }

        public final void setUseDrawableOnForeground(boolean z11) {
            this.f21150c = z11;
            this.f21155h = true;
        }
    }

    public static /* synthetic */ void setExclusive$default(RNGestureHandlerButtonViewManager rNGestureHandlerButtonViewManager, a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        rNGestureHandlerButtonViewManager.setExclusive(aVar, z11);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerButton";
    }

    @ng.a(name = "borderless")
    public final void setBorderless(a view, boolean z11) {
        s.g(view, "view");
        view.setUseBorderlessDrawable(z11);
    }

    @ng.a(name = "enabled")
    public final void setEnabled(a view, boolean z11) {
        s.g(view, "view");
        view.setEnabled(z11);
    }

    @ng.a(name = "exclusive")
    public final void setExclusive(a view, boolean z11) {
        s.g(view, "view");
        view.setExclusive(z11);
    }

    @ng.a(name = "foreground")
    public final void setForeground(a view, boolean z11) {
        s.g(view, "view");
        view.setUseDrawableOnForeground(z11);
    }

    @ng.a(name = "rippleColor")
    public final void setRippleColor(a view, Integer num) {
        s.g(view, "view");
        view.setRippleColor(num);
    }

    @ng.a(name = "rippleRadius")
    public final void setRippleRadius(a view, Integer num) {
        s.g(view, "view");
        view.setRippleRadius(num);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(n0 context) {
        s.g(context, "context");
        return new a(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        s.g(view, "view");
        view.l();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ng.a(name = "borderRadius")
    public void setBorderRadius(a view, float f11) {
        s.g(view, "view");
        view.setBorderRadius(f11);
    }
}