package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.j;
import fk.k;

/* loaded from: classes3.dex */
public class g extends AppCompatAutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    private final h0 f15733d;

    /* renamed from: e  reason: collision with root package name */
    private final AccessibilityManager f15734e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f15735f;

    /* loaded from: classes3.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
            g.this.e(i11 < 0 ? g.this.f15733d.u() : g.this.getAdapter().getItem(i11));
            AdapterView.OnItemClickListener onItemClickListener = g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i11 < 0) {
                    view = g.this.f15733d.x();
                    i11 = g.this.f15733d.w();
                    j11 = g.this.f15733d.v();
                }
                onItemClickListener.onItemClick(g.this.f15733d.o(), view, i11, j11);
            }
            g.this.f15733d.dismiss();
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26366b);
    }

    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c11 = c();
        int i11 = 0;
        if (adapter == null || c11 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f15733d.w()) + 15);
        View view = null;
        int i12 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(max, view, c11);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = Math.max(i12, view.getMeasuredWidth());
        }
        Drawable g11 = this.f15733d.g();
        if (g11 != null) {
            g11.getPadding(this.f15735f);
            Rect rect = this.f15735f;
            i12 += rect.left + rect.right;
        }
        return i12 + c11.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends ListAdapter & Filterable> void e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout c11 = c();
        if (c11 != null && c11.isProvidingHint()) {
            return c11.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c11 = c();
        if (c11 != null && c11.isProvidingHint() && super.getHint() == null && com.google.android.material.internal.e.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t11) {
        super.setAdapter(t11);
        this.f15733d.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f15734e;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f15733d.show();
        } else {
            super.showDropDown();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i11) {
        super(yk.a.c(context, attributeSet, i11, 0), attributeSet, i11);
        this.f15735f = new Rect();
        Context context2 = getContext();
        TypedArray h11 = j.h(context2, attributeSet, k.f26610p1, i11, fk.j.f26500d, new int[0]);
        int i12 = k.f26616q1;
        if (h11.hasValue(i12) && h11.getInt(i12, 0) == 0) {
            setKeyListener(null);
        }
        this.f15734e = (AccessibilityManager) context2.getSystemService("accessibility");
        h0 h0Var = new h0(context2);
        this.f15733d = h0Var;
        h0Var.I(true);
        h0Var.C(this);
        h0Var.H(2);
        h0Var.m(getAdapter());
        h0Var.K(new a());
        h11.recycle();
    }
}