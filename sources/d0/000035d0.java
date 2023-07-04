package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.a0;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f15156a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15157b;

    /* loaded from: classes3.dex */
    class a extends androidx.core.view.a {
        a(MaterialCalendarGridView materialCalendarGridView) {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.e0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i11, Rect rect) {
        if (i11 == 33) {
            setSelection(getAdapter2().i());
        } else if (i11 == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i11, rect);
        }
    }

    private View c(int i11) {
        return getChildAt(i11 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l11, Long l12, Long l13, Long l14) {
        return l11 == null || l12 == null || l13 == null || l14 == null || l13.longValue() > l12.longValue() || l14.longValue() < l11.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public m getAdapter2() {
        return (m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int a11;
        int d11;
        int a12;
        int d12;
        int width;
        int i11;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m adapter2 = getAdapter2();
        d<?> dVar = adapter2.f15257b;
        c cVar = adapter2.f15259d;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.i(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<v3.d<Long, Long>> it2 = dVar.F0().iterator();
        while (it2.hasNext()) {
            v3.d<Long, Long> next = it2.next();
            Long l11 = next.f54019a;
            if (l11 == null) {
                materialCalendarGridView = this;
            } else if (next.f54020b != null) {
                long longValue = l11.longValue();
                long longValue2 = next.f54020b.longValue();
                if (!e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean d13 = com.google.android.material.internal.l.d(this);
                    if (longValue < item.longValue()) {
                        if (adapter2.f(max)) {
                            left2 = 0;
                        } else if (!d13) {
                            left2 = materialCalendarGridView.c(max - 1).getRight();
                        } else {
                            left2 = materialCalendarGridView.c(max - 1).getLeft();
                        }
                        d11 = left2;
                        a11 = max;
                    } else {
                        materialCalendarGridView.f15156a.setTimeInMillis(longValue);
                        a11 = adapter2.a(materialCalendarGridView.f15156a.get(5));
                        d11 = d(materialCalendarGridView.c(a11));
                    }
                    if (longValue2 > item2.longValue()) {
                        if (adapter2.g(min)) {
                            left = getWidth();
                        } else if (!d13) {
                            left = materialCalendarGridView.c(min).getRight();
                        } else {
                            left = materialCalendarGridView.c(min).getLeft();
                        }
                        d12 = left;
                        a12 = min;
                    } else {
                        materialCalendarGridView.f15156a.setTimeInMillis(longValue2);
                        a12 = adapter2.a(materialCalendarGridView.f15156a.get(5));
                        d12 = d(materialCalendarGridView.c(a12));
                    }
                    int itemId = (int) adapter2.getItemId(a11);
                    int i12 = max;
                    int i13 = min;
                    int itemId2 = (int) adapter2.getItemId(a12);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View c11 = materialCalendarGridView.c(numColumns);
                        int top = c11.getTop() + cVar.f15176a.c();
                        m mVar = adapter2;
                        int bottom = c11.getBottom() - cVar.f15176a.b();
                        if (!d13) {
                            i11 = numColumns > a11 ? 0 : d11;
                            width = a12 > numColumns2 ? getWidth() : d12;
                        } else {
                            int i14 = a12 > numColumns2 ? 0 : d12;
                            width = numColumns > a11 ? getWidth() : d11;
                            i11 = i14;
                        }
                        canvas.drawRect(i11, top, width, bottom, cVar.f15183h);
                        itemId++;
                        materialCalendarGridView = this;
                        it2 = it2;
                        adapter2 = mVar;
                    }
                    materialCalendarGridView = this;
                    max = i12;
                    min = i13;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (z11) {
            a(i11, rect);
        } else {
            super.onFocusChanged(false, i11, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (super.onKeyDown(i11, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i11) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.f15157b) {
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i11) {
        if (i11 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i11);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15156a = s.k();
        if (i.q(getContext())) {
            setNextFocusLeftId(fk.f.f26430a);
            setNextFocusRightId(fk.f.f26432c);
        }
        this.f15157b = i.r(getContext());
        a0.w0(this, new a(this));
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof m) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
    }
}