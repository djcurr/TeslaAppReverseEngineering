package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f1500i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1501j;

    /* renamed from: k  reason: collision with root package name */
    private View f1502k;

    /* renamed from: l  reason: collision with root package name */
    private View f1503l;

    /* renamed from: m  reason: collision with root package name */
    private View f1504m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f1505n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f1506o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f1507p;

    /* renamed from: q  reason: collision with root package name */
    private int f1508q;

    /* renamed from: t  reason: collision with root package name */
    private int f1509t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1510w;

    /* renamed from: x  reason: collision with root package name */
    private int f1511x;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l.b f1512a;

        a(ActionBarContextView actionBarContextView, l.b bVar) {
            this.f1512a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1512a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f1505n == null) {
            LayoutInflater.from(getContext()).inflate(g.g.f27141a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1505n = linearLayout;
            this.f1506o = (TextView) linearLayout.findViewById(g.f.f27119e);
            this.f1507p = (TextView) this.f1505n.findViewById(g.f.f27118d);
            if (this.f1508q != 0) {
                this.f1506o.setTextAppearance(getContext(), this.f1508q);
            }
            if (this.f1509t != 0) {
                this.f1507p.setTextAppearance(getContext(), this.f1509t);
            }
        }
        this.f1506o.setText(this.f1500i);
        this.f1507p.setText(this.f1501j);
        boolean z11 = !TextUtils.isEmpty(this.f1500i);
        boolean z12 = !TextUtils.isEmpty(this.f1501j);
        int i11 = 0;
        this.f1507p.setVisibility(z12 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1505n;
        if (!z11 && !z12) {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
        if (this.f1505n.getParent() == null) {
            addView(this.f1505n);
        }
    }

    public void g() {
        if (this.f1502k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1501j;
    }

    public CharSequence getTitle() {
        return this.f1500i;
    }

    public void h(l.b bVar) {
        View view = this.f1502k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1511x, (ViewGroup) this, false);
            this.f1502k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1502k);
        }
        View findViewById = this.f1502k.findViewById(g.f.f27123i);
        this.f1503l = findViewById;
        findViewById.setOnClickListener(new a(this, bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        c cVar = this.f1701d;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f1701d = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f1701d, this.f1699b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1701d.o(this);
        this.f1700c = actionMenuView;
        androidx.core.view.a0.z0(actionMenuView, null);
        addView(this.f1700c, layoutParams);
    }

    public boolean j() {
        return this.f1510w;
    }

    public void k() {
        removeAllViews();
        this.f1504m = null;
        this.f1700c = null;
        this.f1701d = null;
        View view = this.f1503l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1701d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1701d;
        if (cVar != null) {
            cVar.B();
            this.f1701d.C();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1500i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean b11 = a1.b(this);
        int paddingRight = b11 ? (i13 - i11) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1502k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1502k.getLayoutParams();
            int i15 = b11 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i16 = b11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d11 = androidx.appcompat.widget.a.d(paddingRight, i15, b11);
            paddingRight = androidx.appcompat.widget.a.d(d11 + e(this.f1502k, d11, paddingTop, paddingTop2, b11), i16, b11);
        }
        int i17 = paddingRight;
        LinearLayout linearLayout = this.f1505n;
        if (linearLayout != null && this.f1504m == null && linearLayout.getVisibility() != 8) {
            i17 += e(this.f1505n, i17, paddingTop, paddingTop2, b11);
        }
        int i18 = i17;
        View view2 = this.f1504m;
        if (view2 != null) {
            e(view2, i18, paddingTop, paddingTop2, b11);
        }
        int paddingLeft = b11 ? getPaddingLeft() : (i13 - i11) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1700c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b11);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            if (View.MeasureSpec.getMode(i12) != 0) {
                int size = View.MeasureSpec.getSize(i11);
                int i13 = this.f1702e;
                if (i13 <= 0) {
                    i13 = View.MeasureSpec.getSize(i12);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i14 = i13 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
                View view = this.f1502k;
                if (view != null) {
                    int c11 = c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1502k.getLayoutParams();
                    paddingLeft = c11 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1700c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = c(this.f1700c, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f1505n;
                if (linearLayout != null && this.f1504m == null) {
                    if (this.f1510w) {
                        this.f1505n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f1505n.getMeasuredWidth();
                        boolean z11 = measuredWidth <= paddingLeft;
                        if (z11) {
                            paddingLeft -= measuredWidth;
                        }
                        this.f1505n.setVisibility(z11 ? 0 : 8);
                    } else {
                        paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f1504m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i15 = layoutParams.width;
                    int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                    if (i15 >= 0) {
                        paddingLeft = Math.min(i15, paddingLeft);
                    }
                    int i17 = layoutParams.height;
                    int i18 = i17 == -2 ? Integer.MIN_VALUE : 1073741824;
                    if (i17 >= 0) {
                        i14 = Math.min(i17, i14);
                    }
                    this.f1504m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i18));
                }
                if (this.f1702e <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i21 = 0; i21 < childCount; i21++) {
                        int measuredHeight = getChildAt(i21).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i13);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i11) {
        this.f1702e = i11;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1504m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1504m = view;
        if (view != null && (linearLayout = this.f1505n) != null) {
            removeView(linearLayout);
            this.f1505n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1501j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1500i = charSequence;
        i();
    }

    public void setTitleOptional(boolean z11) {
        if (z11 != this.f1510w) {
            requestLayout();
        }
        this.f1510w = z11;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f27048j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u0 v11 = u0.v(context, attributeSet, g.j.f27294x, i11, 0);
        androidx.core.view.a0.z0(this, v11.g(g.j.f27299y));
        this.f1508q = v11.n(g.j.C, 0);
        this.f1509t = v11.n(g.j.B, 0);
        this.f1702e = v11.m(g.j.A, 0);
        this.f1511x = v11.n(g.j.f27304z, g.g.f27144d);
        v11.w();
    }
}