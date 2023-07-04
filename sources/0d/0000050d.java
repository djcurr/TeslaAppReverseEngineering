package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.savedstate.c;
import h00.l;
import h2.k;
import kotlin.jvm.internal.s;
import o1.f;
import vz.b0;
import x2.d;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private View f3197a;

    /* renamed from: b  reason: collision with root package name */
    private h00.a<b0> f3198b;

    /* renamed from: c  reason: collision with root package name */
    private f f3199c;

    /* renamed from: d  reason: collision with root package name */
    private l<? super f, b0> f3200d;

    /* renamed from: e  reason: collision with root package name */
    private d f3201e;

    /* renamed from: f  reason: collision with root package name */
    private l<? super d, b0> f3202f;

    /* renamed from: g  reason: collision with root package name */
    private v f3203g;

    /* renamed from: h  reason: collision with root package name */
    private c f3204h;

    /* renamed from: i  reason: collision with root package name */
    private final m1.v f3205i;

    /* renamed from: j  reason: collision with root package name */
    private final h00.a<b0> f3206j;

    /* renamed from: k  reason: collision with root package name */
    private l<? super Boolean, b0> f3207k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f3208l;

    /* renamed from: m  reason: collision with root package name */
    private int f3209m;

    /* renamed from: n  reason: collision with root package name */
    private int f3210n;

    /* renamed from: o  reason: collision with root package name */
    private final k f3211o;

    public final void a() {
        int i11;
        int i12 = this.f3209m;
        if (i12 == Integer.MIN_VALUE || (i11 = this.f3210n) == Integer.MIN_VALUE) {
            return;
        }
        measure(i12, i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f3208l);
        int[] iArr = this.f3208l;
        region.op(iArr[0], iArr[1], iArr[0] + getWidth(), this.f3208l[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final d getDensity() {
        return this.f3201e;
    }

    public final k getLayoutNode() {
        return this.f3211o;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        View view = this.f3197a;
        ViewGroup.LayoutParams layoutParams = view == null ? null : view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final v getLifecycleOwner() {
        return this.f3203g;
    }

    public final f getModifier() {
        return this.f3199c;
    }

    public final l<d, b0> getOnDensityChanged$ui_release() {
        return this.f3202f;
    }

    public final l<f, b0> getOnModifierChanged$ui_release() {
        return this.f3200d;
    }

    public final l<Boolean, b0> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f3207k;
    }

    public final c getSavedStateRegistryOwner() {
        return this.f3204h;
    }

    public final h00.a<b0> getUpdate() {
        return this.f3198b;
    }

    public final View getView() {
        return this.f3197a;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f3211o.r0();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3205i.k();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        s.g(child, "child");
        s.g(target, "target");
        super.onDescendantInvalidated(child, target);
        this.f3211o.r0();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3205i.l();
        this.f3205i.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View view = this.f3197a;
        if (view == null) {
            return;
        }
        view.layout(0, 0, i13 - i11, i14 - i12);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        View view = this.f3197a;
        if (view != null) {
            view.measure(i11, i12);
        }
        View view2 = this.f3197a;
        int measuredWidth = view2 == null ? 0 : view2.getMeasuredWidth();
        View view3 = this.f3197a;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.f3209m = i11;
        this.f3210n = i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        l<? super Boolean, b0> lVar = this.f3207k;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z11));
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public final void setDensity(d value) {
        s.g(value, "value");
        if (value != this.f3201e) {
            this.f3201e = value;
            l<? super d, b0> lVar = this.f3202f;
            if (lVar == null) {
                return;
            }
            lVar.invoke(value);
        }
    }

    public final void setLifecycleOwner(v vVar) {
        if (vVar != this.f3203g) {
            this.f3203g = vVar;
            v0.b(this, vVar);
        }
    }

    public final void setModifier(f value) {
        s.g(value, "value");
        if (value != this.f3199c) {
            this.f3199c = value;
            l<? super f, b0> lVar = this.f3200d;
            if (lVar == null) {
                return;
            }
            lVar.invoke(value);
        }
    }

    public final void setOnDensityChanged$ui_release(l<? super d, b0> lVar) {
        this.f3202f = lVar;
    }

    public final void setOnModifierChanged$ui_release(l<? super f, b0> lVar) {
        this.f3200d = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(l<? super Boolean, b0> lVar) {
        this.f3207k = lVar;
    }

    public final void setSavedStateRegistryOwner(c cVar) {
        if (cVar != this.f3204h) {
            this.f3204h = cVar;
            androidx.savedstate.d.b(this, cVar);
        }
    }

    protected final void setUpdate(h00.a<b0> value) {
        s.g(value, "value");
        this.f3198b = value;
        this.f3206j.invoke();
    }

    public final void setView$ui_release(View view) {
        if (view != this.f3197a) {
            this.f3197a = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f3206j.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }
}