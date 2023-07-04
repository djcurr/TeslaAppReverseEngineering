package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.w0;
import androidx.core.view.a0;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements k.a {
    private static final int[] O = {16842912};
    private boolean A;
    boolean B;
    private final CheckedTextView C;
    private FrameLayout E;
    private androidx.appcompat.view.menu.g F;
    private ColorStateList G;
    private boolean H;
    private Drawable K;
    private final androidx.core.view.a L;

    /* renamed from: z  reason: collision with root package name */
    private int f15378z;

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.a0(NavigationMenuItemView.this.B);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.C.setVisibility(8);
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                g0.a aVar = (g0.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.E.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.C.setVisibility(0);
        FrameLayout frameLayout2 = this.E;
        if (frameLayout2 != null) {
            g0.a aVar2 = (g0.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.E.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(g.a.f27060v, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(O, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean D() {
        return this.F.getTitle() == null && this.F.getIcon() == null && this.F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.E == null) {
                this.E = (FrameLayout) ((ViewStub) findViewById(fk.f.f26435f)).inflate();
            }
            this.E.removeAllViews();
            this.E.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i11) {
        this.F = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            a0.z0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        w0.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        androidx.appcompat.view.menu.g gVar = this.F;
        if (gVar != null && gVar.isCheckable() && this.F.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
        if (this.B != z11) {
            this.B = z11;
            this.L.sendAccessibilityEvent(this.C, 2048);
        }
    }

    public void setChecked(boolean z11) {
        refreshDrawableState();
        this.C.setChecked(z11);
    }

    public void setHorizontalPadding(int i11) {
        setPadding(i11, getPaddingTop(), i11, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = n3.a.r(drawable).mutate();
                n3.a.o(drawable, this.G);
            }
            int i11 = this.f15378z;
            drawable.setBounds(0, 0, i11, i11);
        } else if (this.A) {
            if (this.K == null) {
                Drawable f11 = l3.h.f(getResources(), fk.e.f26429g, getContext().getTheme());
                this.K = f11;
                if (f11 != null) {
                    int i12 = this.f15378z;
                    f11.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.K;
        }
        androidx.core.widget.m.i(this.C, drawable, null, null, null);
    }

    public void setIconPadding(int i11) {
        this.C.setCompoundDrawablePadding(i11);
    }

    public void setIconSize(int i11) {
        this.f15378z = i11;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        this.H = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.F;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i11) {
        this.C.setMaxLines(i11);
    }

    public void setNeedsEmptyIcon(boolean z11) {
        this.A = z11;
    }

    public void setTextAppearance(int i11) {
        androidx.core.widget.m.n(this.C, i11);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a aVar = new a();
        this.L = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(fk.h.f26462d, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(fk.d.f26401e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(fk.f.f26436g);
        this.C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        a0.w0(checkedTextView, aVar);
    }
}