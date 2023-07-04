package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.a0;
import fk.j;
import java.util.ArrayList;
import java.util.List;
import w3.c;

/* loaded from: classes3.dex */
public class ChipGroup extends com.google.android.material.internal.c {

    /* renamed from: n  reason: collision with root package name */
    private static final int f15115n = j.f26507k;

    /* renamed from: e  reason: collision with root package name */
    private int f15116e;

    /* renamed from: f  reason: collision with root package name */
    private int f15117f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15118g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15119h;

    /* renamed from: i  reason: collision with root package name */
    private d f15120i;

    /* renamed from: j  reason: collision with root package name */
    private final b f15121j;

    /* renamed from: k  reason: collision with root package name */
    private e f15122k;

    /* renamed from: l  reason: collision with root package name */
    private int f15123l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f15124m;

    /* loaded from: classes3.dex */
    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (ChipGroup.this.f15124m) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f15119h) {
                ChipGroup.this.r(compoundButton.getId(), true);
                ChipGroup.this.q(compoundButton.getId(), false);
                return;
            }
            int id2 = compoundButton.getId();
            if (z11) {
                if (ChipGroup.this.f15123l != -1 && ChipGroup.this.f15123l != id2 && ChipGroup.this.f15118g) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.r(chipGroup.f15123l, false);
                }
                ChipGroup.this.setCheckedId(id2);
            } else if (ChipGroup.this.f15123l == id2) {
                ChipGroup.this.setCheckedId(-1);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i11, int i12) {
            super(i11, i12);
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(ChipGroup chipGroup, int i11);
    }

    /* loaded from: classes3.dex */
    private class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f15126a;

        private e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(a0.n());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f15121j);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f15126a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f15126a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26370f);
    }

    private int getChipCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) instanceof Chip) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i11, boolean z11) {
        this.f15123l = i11;
        d dVar = this.f15120i;
        if (dVar != null && this.f15118g && z11) {
            dVar.a(this, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i11, boolean z11) {
        View findViewById = findViewById(i11);
        if (findViewById instanceof Chip) {
            this.f15124m = true;
            ((Chip) findViewById).setChecked(z11);
            this.f15124m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i11) {
        q(i11, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i12 = this.f15123l;
                if (i12 != -1 && this.f15118g) {
                    r(i12, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i11, layoutParams);
    }

    @Override // com.google.android.material.internal.c
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f15118g) {
            return this.f15123l;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f15118g) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f15116e;
    }

    public int getChipSpacingVertical() {
        return this.f15117f;
    }

    public void m(int i11) {
        int i12 = this.f15123l;
        if (i11 == i12) {
            return;
        }
        if (i12 != -1 && this.f15118g) {
            r(i12, false);
        }
        if (i11 != -1) {
            r(i11, true);
        }
        setCheckedId(i11);
    }

    public void n() {
        this.f15124m = true;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f15124m = false;
        setCheckedId(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o(View view) {
        if (view instanceof Chip) {
            int i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof Chip) {
                    if (((Chip) getChildAt(i12)) == view) {
                        return i11;
                    }
                    i11++;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f15123l;
        if (i11 != -1) {
            r(i11, true);
            setCheckedId(this.f15123l);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w3.c.P0(accessibilityNodeInfo).e0(c.b.a(getRowCount(), c() ? getChipCount() : -1, false, p() ? 1 : 2));
    }

    public boolean p() {
        return this.f15118g;
    }

    public void setChipSpacing(int i11) {
        setChipSpacingHorizontal(i11);
        setChipSpacingVertical(i11);
    }

    public void setChipSpacingHorizontal(int i11) {
        if (this.f15116e != i11) {
            this.f15116e = i11;
            setItemSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i11) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingResource(int i11) {
        setChipSpacing(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingVertical(int i11) {
        if (this.f15117f != i11) {
            this.f15117f = i11;
            setLineSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i11) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i11));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i11) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f15120i = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f15122k.f15126a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z11) {
        this.f15119h = z11;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.c
    public void setSingleLine(boolean z11) {
        super.setSingleLine(z11);
    }

    public void setSingleSelection(boolean z11) {
        if (this.f15118g != z11) {
            this.f15118g = z11;
            n();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f15115n
            android.content.Context r8 = yk.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f15121j = r8
            com.google.android.material.chip.ChipGroup$e r8 = new com.google.android.material.chip.ChipGroup$e
            r8.<init>()
            r7.f15122k = r8
            r8 = -1
            r7.f15123l = r8
            r6 = 0
            r7.f15124m = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = fk.k.H0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = fk.k.J0
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = fk.k.K0
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = fk.k.L0
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = fk.k.N0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine(r10)
            int r10 = fk.k.O0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection(r10)
            int r10 = fk.k.M0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = fk.k.I0
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L69
            r7.f15123l = r10
        L69:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$e r8 = r7.f15122k
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            androidx.core.view.a0.G0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i11) {
        setSingleLine(getResources().getBoolean(i11));
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}