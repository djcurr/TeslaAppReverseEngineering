package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class h0 implements m.e {
    private static Method O;
    private static Method P;
    private static Method Q;
    final g A;
    private final f B;
    private final e C;
    private final c E;
    final Handler F;
    private final Rect G;
    private Rect H;
    private boolean K;
    PopupWindow L;

    /* renamed from: a  reason: collision with root package name */
    private Context f1796a;

    /* renamed from: b  reason: collision with root package name */
    private ListAdapter f1797b;

    /* renamed from: c  reason: collision with root package name */
    d0 f1798c;

    /* renamed from: d  reason: collision with root package name */
    private int f1799d;

    /* renamed from: e  reason: collision with root package name */
    private int f1800e;

    /* renamed from: f  reason: collision with root package name */
    private int f1801f;

    /* renamed from: g  reason: collision with root package name */
    private int f1802g;

    /* renamed from: h  reason: collision with root package name */
    private int f1803h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1804i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1805j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1806k;

    /* renamed from: l  reason: collision with root package name */
    private int f1807l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1808m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1809n;

    /* renamed from: o  reason: collision with root package name */
    int f1810o;

    /* renamed from: p  reason: collision with root package name */
    private View f1811p;

    /* renamed from: q  reason: collision with root package name */
    private int f1812q;

    /* renamed from: t  reason: collision with root package name */
    private DataSetObserver f1813t;

    /* renamed from: w  reason: collision with root package name */
    private View f1814w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f1815x;

    /* renamed from: y  reason: collision with root package name */
    private AdapterView.OnItemClickListener f1816y;

    /* renamed from: z  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1817z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View s11 = h0.this.s();
            if (s11 == null || s11.getWindowToken() == null) {
                return;
            }
            h0.this.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            d0 d0Var;
            if (i11 == -1 || (d0Var = h0.this.f1798c) == null) {
                return;
            }
            d0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0.this.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (h0.this.b()) {
                h0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            h0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 != 1 || h0.this.z() || h0.this.L.getContentView() == null) {
                return;
            }
            h0 h0Var = h0.this;
            h0Var.F.removeCallbacks(h0Var.A);
            h0.this.A.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = h0.this.L) != null && popupWindow.isShowing() && x11 >= 0 && x11 < h0.this.L.getWidth() && y11 >= 0 && y11 < h0.this.L.getHeight()) {
                h0 h0Var = h0.this;
                h0Var.F.postDelayed(h0Var.A, 250L);
                return false;
            } else if (action == 1) {
                h0 h0Var2 = h0.this;
                h0Var2.F.removeCallbacks(h0Var2.A);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = h0.this.f1798c;
            if (d0Var == null || !androidx.core.view.a0.Y(d0Var) || h0.this.f1798c.getCount() <= h0.this.f1798c.getChildCount()) {
                return;
            }
            int childCount = h0.this.f1798c.getChildCount();
            h0 h0Var = h0.this;
            if (childCount <= h0Var.f1810o) {
                h0Var.L.setInputMethodMode(2);
                h0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                O = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                P = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public h0(Context context) {
        this(context, null, g.a.D);
    }

    private void B() {
        View view = this.f1811p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1811p);
            }
        }
    }

    private void M(boolean z11) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = O;
            if (method != null) {
                try {
                    method.invoke(this.L, Boolean.valueOf(z11));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.L.setIsClippedToScreen(z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int p() {
        int i11;
        int i12;
        int makeMeasureSpec;
        int i13;
        if (this.f1798c == null) {
            Context context = this.f1796a;
            new a();
            d0 r11 = r(context, !this.K);
            this.f1798c = r11;
            Drawable drawable = this.f1815x;
            if (drawable != null) {
                r11.setSelector(drawable);
            }
            this.f1798c.setAdapter(this.f1797b);
            this.f1798c.setOnItemClickListener(this.f1816y);
            this.f1798c.setFocusable(true);
            this.f1798c.setFocusableInTouchMode(true);
            this.f1798c.setOnItemSelectedListener(new b());
            this.f1798c.setOnScrollListener(this.C);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1817z;
            if (onItemSelectedListener != null) {
                this.f1798c.setOnItemSelectedListener(onItemSelectedListener);
            }
            d0 d0Var = this.f1798c;
            View view = this.f1811p;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i14 = this.f1812q;
                if (i14 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(d0Var, layoutParams);
                } else if (i14 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1812q);
                } else {
                    linearLayout.addView(d0Var, layoutParams);
                    linearLayout.addView(view);
                }
                int i15 = this.f1800e;
                if (i15 >= 0) {
                    i13 = Integer.MIN_VALUE;
                } else {
                    i15 = 0;
                    i13 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i15, i13), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i11 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                d0Var = linearLayout;
            } else {
                i11 = 0;
            }
            this.L.setContentView(d0Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.L.getContentView();
            View view2 = this.f1811p;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i11 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i11 = 0;
            }
        }
        Drawable background = this.L.getBackground();
        if (background != null) {
            background.getPadding(this.G);
            Rect rect = this.G;
            int i16 = rect.top;
            i12 = rect.bottom + i16;
            if (!this.f1804i) {
                this.f1802g = -i16;
            }
        } else {
            this.G.setEmpty();
            i12 = 0;
        }
        int t11 = t(s(), this.f1802g, this.L.getInputMethodMode() == 2);
        if (this.f1808m || this.f1799d == -1) {
            return t11 + i12;
        }
        int i17 = this.f1800e;
        if (i17 == -2) {
            int i18 = this.f1796a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.G;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i17 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
        } else {
            int i19 = this.f1796a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.G;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - (rect3.left + rect3.right), 1073741824);
        }
        int d11 = this.f1798c.d(makeMeasureSpec, 0, -1, t11 - i11, -1);
        if (d11 > 0) {
            i11 += i12 + this.f1798c.getPaddingTop() + this.f1798c.getPaddingBottom();
        }
        return d11 + i11;
    }

    private int t(View view, int i11, boolean z11) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = P;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.L, view, Integer.valueOf(i11), Boolean.valueOf(z11))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.L.getMaxAvailableHeight(view, i11);
        }
        return this.L.getMaxAvailableHeight(view, i11, z11);
    }

    public boolean A() {
        return this.K;
    }

    public void C(View view) {
        this.f1814w = view;
    }

    public void D(int i11) {
        this.L.setAnimationStyle(i11);
    }

    public void E(int i11) {
        Drawable background = this.L.getBackground();
        if (background != null) {
            background.getPadding(this.G);
            Rect rect = this.G;
            this.f1800e = rect.left + rect.right + i11;
            return;
        }
        P(i11);
    }

    public void F(int i11) {
        this.f1807l = i11;
    }

    public void G(Rect rect) {
        this.H = rect != null ? new Rect(rect) : null;
    }

    public void H(int i11) {
        this.L.setInputMethodMode(i11);
    }

    public void I(boolean z11) {
        this.K = z11;
        this.L.setFocusable(z11);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.L.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1816y = onItemClickListener;
    }

    public void L(boolean z11) {
        this.f1806k = true;
        this.f1805j = z11;
    }

    public void N(int i11) {
        this.f1812q = i11;
    }

    public void O(int i11) {
        d0 d0Var = this.f1798c;
        if (!b() || d0Var == null) {
            return;
        }
        d0Var.setListSelectionHidden(false);
        d0Var.setSelection(i11);
        if (d0Var.getChoiceMode() != 0) {
            d0Var.setItemChecked(i11, true);
        }
    }

    public void P(int i11) {
        this.f1800e = i11;
    }

    public void a(Drawable drawable) {
        this.L.setBackgroundDrawable(drawable);
    }

    @Override // m.e
    public boolean b() {
        return this.L.isShowing();
    }

    public int c() {
        return this.f1801f;
    }

    @Override // m.e
    public void dismiss() {
        this.L.dismiss();
        B();
        this.L.setContentView(null);
        this.f1798c = null;
        this.F.removeCallbacks(this.A);
    }

    public void e(int i11) {
        this.f1801f = i11;
    }

    public Drawable g() {
        return this.L.getBackground();
    }

    public void i(int i11) {
        this.f1802g = i11;
        this.f1804i = true;
    }

    public int l() {
        if (this.f1804i) {
            return this.f1802g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1813t;
        if (dataSetObserver == null) {
            this.f1813t = new d();
        } else {
            ListAdapter listAdapter2 = this.f1797b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1797b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1813t);
        }
        d0 d0Var = this.f1798c;
        if (d0Var != null) {
            d0Var.setAdapter(this.f1797b);
        }
    }

    @Override // m.e
    public ListView o() {
        return this.f1798c;
    }

    public void q() {
        d0 d0Var = this.f1798c;
        if (d0Var != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
    }

    d0 r(Context context, boolean z11) {
        return new d0(context, z11);
    }

    public View s() {
        return this.f1814w;
    }

    @Override // m.e
    public void show() {
        int p11 = p();
        boolean z11 = z();
        androidx.core.widget.l.b(this.L, this.f1803h);
        boolean z12 = true;
        if (this.L.isShowing()) {
            if (androidx.core.view.a0.Y(s())) {
                int i11 = this.f1800e;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = s().getWidth();
                }
                int i12 = this.f1799d;
                if (i12 == -1) {
                    if (!z11) {
                        p11 = -1;
                    }
                    if (z11) {
                        this.L.setWidth(this.f1800e == -1 ? -1 : 0);
                        this.L.setHeight(0);
                    } else {
                        this.L.setWidth(this.f1800e == -1 ? -1 : 0);
                        this.L.setHeight(-1);
                    }
                } else if (i12 != -2) {
                    p11 = i12;
                }
                PopupWindow popupWindow = this.L;
                if (this.f1809n || this.f1808m) {
                    z12 = false;
                }
                popupWindow.setOutsideTouchable(z12);
                this.L.update(s(), this.f1801f, this.f1802g, i11 < 0 ? -1 : i11, p11 < 0 ? -1 : p11);
                return;
            }
            return;
        }
        int i13 = this.f1800e;
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = s().getWidth();
        }
        int i14 = this.f1799d;
        if (i14 == -1) {
            p11 = -1;
        } else if (i14 != -2) {
            p11 = i14;
        }
        this.L.setWidth(i13);
        this.L.setHeight(p11);
        M(true);
        this.L.setOutsideTouchable((this.f1809n || this.f1808m) ? false : true);
        this.L.setTouchInterceptor(this.B);
        if (this.f1806k) {
            androidx.core.widget.l.a(this.L, this.f1805j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = Q;
            if (method != null) {
                try {
                    method.invoke(this.L, this.H);
                } catch (Exception e11) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e11);
                }
            }
        } else {
            this.L.setEpicenterBounds(this.H);
        }
        androidx.core.widget.l.c(this.L, s(), this.f1801f, this.f1802g, this.f1807l);
        this.f1798c.setSelection(-1);
        if (!this.K || this.f1798c.isInTouchMode()) {
            q();
        }
        if (this.K) {
            return;
        }
        this.F.post(this.E);
    }

    public Object u() {
        if (b()) {
            return this.f1798c.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (b()) {
            return this.f1798c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (b()) {
            return this.f1798c.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (b()) {
            return this.f1798c.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f1800e;
    }

    public boolean z() {
        return this.L.getInputMethodMode() == 2;
    }

    public h0(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public h0(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f1799d = -2;
        this.f1800e = -2;
        this.f1803h = 1002;
        this.f1807l = 0;
        this.f1808m = false;
        this.f1809n = false;
        this.f1810o = Integer.MAX_VALUE;
        this.f1812q = 0;
        this.A = new g();
        this.B = new f();
        this.C = new e();
        this.E = new c();
        this.G = new Rect();
        this.f1796a = context;
        this.F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f27181a1, i11, i12);
        this.f1801f = obtainStyledAttributes.getDimensionPixelOffset(g.j.f27186b1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(g.j.f27191c1, 0);
        this.f1802g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1804i = true;
        }
        obtainStyledAttributes.recycle();
        o oVar = new o(context, attributeSet, i11, i12);
        this.L = oVar;
        oVar.setInputMethodMode(1);
    }
}