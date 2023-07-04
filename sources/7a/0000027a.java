package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d0 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f1743a;

    /* renamed from: b  reason: collision with root package name */
    private int f1744b;

    /* renamed from: c  reason: collision with root package name */
    private int f1745c;

    /* renamed from: d  reason: collision with root package name */
    private int f1746d;

    /* renamed from: e  reason: collision with root package name */
    private int f1747e;

    /* renamed from: f  reason: collision with root package name */
    private int f1748f;

    /* renamed from: g  reason: collision with root package name */
    private Field f1749g;

    /* renamed from: h  reason: collision with root package name */
    private a f1750h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1751i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1752j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1753k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.core.view.g0 f1754l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.core.widget.j f1755m;

    /* renamed from: n  reason: collision with root package name */
    b f1756n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends i.c {

        /* renamed from: b  reason: collision with root package name */
        private boolean f1757b;

        a(Drawable drawable) {
            super(drawable);
            this.f1757b = true;
        }

        void c(boolean z11) {
            this.f1757b = z11;
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1757b) {
                super.draw(canvas);
            }
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public void setHotspot(float f11, float f12) {
            if (this.f1757b) {
                super.setHotspot(f11, f12);
            }
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i11, int i12, int i13, int i14) {
            if (this.f1757b) {
                super.setHotspotBounds(i11, i12, i13, i14);
            }
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1757b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z11, boolean z12) {
            if (this.f1757b) {
                return super.setVisible(z11, z12);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        public void a() {
            d0 d0Var = d0.this;
            d0Var.f1756n = null;
            d0Var.removeCallbacks(this);
        }

        public void b() {
            d0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = d0.this;
            d0Var.f1756n = null;
            d0Var.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(Context context, boolean z11) {
        super(context, null, g.a.f27064z);
        this.f1743a = new Rect();
        this.f1744b = 0;
        this.f1745c = 0;
        this.f1746d = 0;
        this.f1747e = 0;
        this.f1752j = z11;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1749g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
        }
    }

    private void a() {
        this.f1753k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1748f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.g0 g0Var = this.f1754l;
        if (g0Var != null) {
            g0Var.b();
            this.f1754l = null;
        }
    }

    private void b(View view, int i11) {
        performItemClick(view, i11, getItemIdAtPosition(i11));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1743a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1743a);
        selector.draw(canvas);
    }

    private void f(int i11, View view) {
        Rect rect = this.f1743a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1744b;
        rect.top -= this.f1745c;
        rect.right += this.f1746d;
        rect.bottom += this.f1747e;
        try {
            boolean z11 = this.f1749g.getBoolean(this);
            if (view.isEnabled() != z11) {
                this.f1749g.set(this, Boolean.valueOf(!z11));
                if (i11 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e11) {
            e11.printStackTrace();
        }
    }

    private void g(int i11, View view) {
        Drawable selector = getSelector();
        boolean z11 = (selector == null || i11 == -1) ? false : true;
        if (z11) {
            selector.setVisible(false, false);
        }
        f(i11, view);
        if (z11) {
            Rect rect = this.f1743a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            n3.a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i11, View view, float f11, float f12) {
        g(i11, view);
        Drawable selector = getSelector();
        if (selector == null || i11 == -1) {
            return;
        }
        n3.a.k(selector, f11, f12);
    }

    private void i(View view, int i11, float f11, float f12) {
        View childAt;
        this.f1753k = true;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            drawableHotspotChanged(f11, f12);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i13 = this.f1748f;
        if (i13 != -1 && (childAt = getChildAt(i13 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1748f = i11;
        float left = f11 - view.getLeft();
        float top = f12 - view.getTop();
        if (i12 >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i11, view, f11, f12);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.f1753k;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z11) {
        a aVar = this.f1750h;
        if (aVar != null) {
            aVar.c(z11);
        }
    }

    public int d(int i11, int i12, int i13, int i14, int i15) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i16 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        View view = null;
        while (i17 < count) {
            int itemViewType = adapter.getItemViewType(i17);
            if (itemViewType != i18) {
                view = null;
                i18 = itemViewType;
            }
            view = adapter.getView(i17, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i21 = layoutParams.height;
            if (i21 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i11, makeMeasureSpec);
            view.forceLayout();
            if (i17 > 0) {
                i16 += dividerHeight;
            }
            i16 += view.getMeasuredHeight();
            if (i16 >= i14) {
                return (i15 < 0 || i17 <= i15 || i19 <= 0 || i16 == i14) ? i14 : i19;
            }
            if (i15 >= 0 && i17 >= i15) {
                i19 = i16;
            }
            i17++;
        }
        return i16;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1756n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.j r9 = r7.f1755m
            if (r9 != 0) goto L5a
            androidx.core.widget.j r9 = new androidx.core.widget.j
            r9.<init>(r7)
            r7.f1755m = r9
        L5a:
            androidx.core.widget.j r9 = r7.f1755m
            r9.m(r2)
            androidx.core.widget.j r9 = r7.f1755m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.j r8 = r7.f1755m
            if (r8 == 0) goto L6c
            r8.m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1752j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1752j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1752j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1752j && this.f1751i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1756n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1756n == null) {
            b bVar = new b();
            this.f1756n = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1748f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1756n;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z11) {
        this.f1751i = z11;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1750h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1744b = rect.left;
        this.f1745c = rect.top;
        this.f1746d = rect.right;
        this.f1747e = rect.bottom;
    }
}