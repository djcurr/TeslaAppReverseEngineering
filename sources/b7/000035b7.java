package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.a0;
import androidx.core.view.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.l;
import fk.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import w3.c;
import wk.k;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final String f15018k = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: l  reason: collision with root package name */
    private static final int f15019l = j.f26513q;

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f15020a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15021b;

    /* renamed from: c  reason: collision with root package name */
    private final f f15022c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<e> f15023d;

    /* renamed from: e  reason: collision with root package name */
    private final Comparator<MaterialButton> f15024e;

    /* renamed from: f  reason: collision with root package name */
    private Integer[] f15025f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15026g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15027h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15028i;

    /* renamed from: j  reason: collision with root package name */
    private int f15029j;

    /* loaded from: classes3.dex */
    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* loaded from: classes3.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.f0(c.C1263c.b(0, 1, MaterialButtonToggleGroup.this.n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c implements MaterialButton.a {
        private c() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z11) {
            if (MaterialButtonToggleGroup.this.f15026g) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f15027h) {
                MaterialButtonToggleGroup.this.f15029j = z11 ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.u(materialButton.getId(), z11)) {
                MaterialButtonToggleGroup.this.l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: e  reason: collision with root package name */
        private static final wk.c f15033e = new wk.a(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: a  reason: collision with root package name */
        wk.c f15034a;

        /* renamed from: b  reason: collision with root package name */
        wk.c f15035b;

        /* renamed from: c  reason: collision with root package name */
        wk.c f15036c;

        /* renamed from: d  reason: collision with root package name */
        wk.c f15037d;

        d(wk.c cVar, wk.c cVar2, wk.c cVar3, wk.c cVar4) {
            this.f15034a = cVar;
            this.f15035b = cVar3;
            this.f15036c = cVar4;
            this.f15037d = cVar2;
        }

        public static d a(d dVar) {
            wk.c cVar = f15033e;
            return new d(cVar, dVar.f15037d, cVar, dVar.f15036c);
        }

        public static d b(d dVar, View view) {
            return l.d(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            wk.c cVar = dVar.f15034a;
            wk.c cVar2 = dVar.f15037d;
            wk.c cVar3 = f15033e;
            return new d(cVar, cVar2, cVar3, cVar3);
        }

        public static d d(d dVar) {
            wk.c cVar = f15033e;
            return new d(cVar, cVar, dVar.f15035b, dVar.f15036c);
        }

        public static d e(d dVar, View view) {
            return l.d(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            wk.c cVar = dVar.f15034a;
            wk.c cVar2 = f15033e;
            return new d(cVar, cVar2, dVar.f15035b, cVar2);
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i11, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class f implements MaterialButton.b {
        private f() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z11) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26387w);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (p(i11)) {
                return i11;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof MaterialButton) && p(i12)) {
                i11++;
            }
        }
        return i11;
    }

    private void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i11 = firstVisibleChildIndex + 1; i11 < getChildCount(); i11++) {
            MaterialButton m11 = m(i11);
            int min = Math.min(m11.getStrokeWidth(), m(i11 - 1).getStrokeWidth());
            LinearLayout.LayoutParams i12 = i(m11);
            if (getOrientation() == 0) {
                h.c(i12, 0);
                h.d(i12, -min);
                i12.topMargin = 0;
            } else {
                i12.bottomMargin = 0;
                i12.topMargin = -min;
                h.d(i12, 0);
            }
            m11.setLayoutParams(i12);
        }
        r(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void j(int i11, boolean z11) {
        MaterialButton materialButton = (MaterialButton) findViewById(i11);
        if (materialButton != null) {
            materialButton.setChecked(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i11, boolean z11) {
        Iterator<e> it2 = this.f15023d.iterator();
        while (it2.hasNext()) {
            it2.next().a(this, i11, z11);
        }
    }

    private MaterialButton m(int i11) {
        return (MaterialButton) getChildAt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n(View view) {
        if (view instanceof MaterialButton) {
            int i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) == view) {
                    return i11;
                }
                if ((getChildAt(i12) instanceof MaterialButton) && p(i12)) {
                    i11++;
                }
            }
            return -1;
        }
        return -1;
    }

    private d o(int i11, int i12, int i13) {
        d dVar = this.f15020a.get(i11);
        if (i12 == i13) {
            return dVar;
        }
        boolean z11 = getOrientation() == 0;
        if (i11 == i12) {
            return z11 ? d.e(dVar, this) : d.f(dVar);
        } else if (i11 == i13) {
            return z11 ? d.b(dVar, this) : d.a(dVar);
        } else {
            return null;
        }
    }

    private boolean p(int i11) {
        return getChildAt(i11).getVisibility() != 8;
    }

    private void r(int i11) {
        if (getChildCount() == 0 || i11 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m(i11).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        h.c(layoutParams, 0);
        h.d(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    private void s(int i11, boolean z11) {
        View findViewById = findViewById(i11);
        if (findViewById instanceof MaterialButton) {
            this.f15026g = true;
            ((MaterialButton) findViewById).setChecked(z11);
            this.f15026g = false;
        }
    }

    private void setCheckedId(int i11) {
        this.f15029j = i11;
        l(i11, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(a0.n());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.addOnCheckedChangeListener(this.f15021b);
        materialButton.setOnPressedChangeListenerInternal(this.f15022c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void t(k.b bVar, d dVar) {
        if (dVar == null) {
            bVar.o(BitmapDescriptorFactory.HUE_RED);
        } else {
            bVar.D(dVar.f15034a).v(dVar.f15037d).H(dVar.f15035b).z(dVar.f15036c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(int i11, boolean z11) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f15028i && checkedButtonIds.isEmpty()) {
            s(i11, true);
            this.f15029j = i11;
            return false;
        }
        if (z11 && this.f15027h) {
            checkedButtonIds.remove(Integer.valueOf(i11));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                s(intValue, false);
                l(intValue, false);
            }
        }
        return true;
    }

    private void v() {
        TreeMap treeMap = new TreeMap(this.f15024e);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            treeMap.put(m(i11), Integer.valueOf(i11));
        }
        this.f15025f = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f15018k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i11, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f15020a.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        a0.w0(materialButton, new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    public void g(e eVar) {
        this.f15023d.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f15027h) {
            return this.f15029j;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            MaterialButton m11 = m(i11);
            if (m11.isChecked()) {
                arrayList.add(Integer.valueOf(m11.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        Integer[] numArr = this.f15025f;
        if (numArr != null && i12 < numArr.length) {
            return numArr[i12].intValue();
        }
        Log.w(f15018k, "Child order wasn't updated");
        return i12;
    }

    public void k() {
        this.f15026g = true;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            MaterialButton m11 = m(i11);
            m11.setChecked(false);
            l(m11.getId(), false);
        }
        this.f15026g = false;
        setCheckedId(-1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f15029j;
        if (i11 != -1) {
            j(i11, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        w3.c.P0(accessibilityNodeInfo).e0(c.b.a(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        w();
        h();
        super.onMeasure(i11, i12);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.removeOnCheckedChangeListener(this.f15021b);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f15020a.remove(indexOfChild);
        }
        w();
        h();
    }

    public boolean q() {
        return this.f15027h;
    }

    public void setSelectionRequired(boolean z11) {
        this.f15028i = z11;
    }

    public void setSingleSelection(boolean z11) {
        if (this.f15027h != z11) {
            this.f15027h = z11;
            k();
        }
    }

    void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i11 = 0; i11 < childCount; i11++) {
            MaterialButton m11 = m(i11);
            if (m11.getVisibility() != 8) {
                k.b v11 = m11.getShapeAppearanceModel().v();
                t(v11, o(i11, firstVisibleChildIndex, lastVisibleChildIndex));
                m11.setShapeAppearanceModel(v11.m());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f15019l
            android.content.Context r7 = yk.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f15020a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f15021b = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f15022c = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f15023d = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f15024e = r7
            r7 = 0
            r6.f15026g = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = fk.k.L1
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r9 = fk.k.O1
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = fk.k.M1
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f15029j = r9
            int r9 = fk.k.N1
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f15028i = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.a0.G0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }
}