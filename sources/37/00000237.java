package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.g0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class ActionMenuView extends g0 implements e.b, androidx.appcompat.view.menu.k {
    private boolean A;
    private int B;
    private int C;
    private int E;
    e F;

    /* renamed from: p  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f1538p;

    /* renamed from: q  reason: collision with root package name */
    private Context f1539q;

    /* renamed from: t  reason: collision with root package name */
    private int f1540t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1541w;

    /* renamed from: x  reason: collision with root package name */
    private androidx.appcompat.widget.c f1542x;

    /* renamed from: y  reason: collision with root package name */
    private j.a f1543y;

    /* renamed from: z  reason: collision with root package name */
    e.a f1544z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z11) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends g0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1545a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1546b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1547c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1548d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1549e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1550f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1545a = cVar.f1545a;
        }

        public c(int i11, int i12) {
            super(i11, i12);
            this.f1545a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.F;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f1544z;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(View view, int i11, int i12, int i13, int i14) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13) - i14, View.MeasureSpec.getMode(i13));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z11 = true;
        boolean z12 = actionMenuItemView != null && actionMenuItemView.d();
        int i15 = 2;
        if (i12 <= 0 || (z12 && i12 < 2)) {
            i15 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i16 = measuredWidth / i11;
            if (measuredWidth % i11 != 0) {
                i16++;
            }
            if (!z12 || i16 >= 2) {
                i15 = i16;
            }
        }
        if (cVar.f1545a || !z12) {
            z11 = false;
        }
        cVar.f1548d = z11;
        cVar.f1546b = i15;
        view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i15, 1073741824), makeMeasureSpec);
        return i15;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void M(int i11, int i12) {
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        boolean z12;
        boolean z13;
        int i17;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
        int i18 = size - paddingLeft;
        int i19 = this.C;
        int i21 = i18 / i19;
        int i22 = i18 % i19;
        if (i21 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i23 = i19 + (i22 / i21);
        int childCount = getChildCount();
        int i24 = 0;
        int i25 = 0;
        boolean z14 = false;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        long j11 = 0;
        while (i25 < childCount) {
            View childAt = getChildAt(i25);
            int i29 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i31 = i26 + 1;
                if (z15) {
                    int i32 = this.E;
                    i17 = i31;
                    r14 = 0;
                    childAt.setPadding(i32, 0, i32, 0);
                } else {
                    i17 = i31;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1550f = r14;
                cVar.f1547c = r14;
                cVar.f1546b = r14;
                cVar.f1548d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f1549e = z15 && ((ActionMenuItemView) childAt).d();
                int L = L(childAt, i23, cVar.f1545a ? 1 : i21, childMeasureSpec, paddingTop);
                i27 = Math.max(i27, L);
                if (cVar.f1548d) {
                    i28++;
                }
                if (cVar.f1545a) {
                    z14 = true;
                }
                i21 -= L;
                i24 = Math.max(i24, childAt.getMeasuredHeight());
                if (L == 1) {
                    j11 |= 1 << i25;
                    i24 = i24;
                }
                i26 = i17;
            }
            i25++;
            size2 = i29;
        }
        int i33 = size2;
        boolean z16 = z14 && i26 == 2;
        boolean z17 = false;
        while (i28 > 0 && i21 > 0) {
            int i34 = Integer.MAX_VALUE;
            int i35 = 0;
            int i36 = 0;
            long j12 = 0;
            while (i36 < childCount) {
                boolean z18 = z17;
                c cVar2 = (c) getChildAt(i36).getLayoutParams();
                int i37 = i24;
                if (cVar2.f1548d) {
                    int i38 = cVar2.f1546b;
                    if (i38 < i34) {
                        j12 = 1 << i36;
                        i34 = i38;
                        i35 = 1;
                    } else if (i38 == i34) {
                        i35++;
                        j12 |= 1 << i36;
                    }
                }
                i36++;
                i24 = i37;
                z17 = z18;
            }
            z11 = z17;
            i15 = i24;
            j11 |= j12;
            if (i35 > i21) {
                i13 = mode;
                i14 = i18;
                break;
            }
            int i39 = i34 + 1;
            int i41 = 0;
            while (i41 < childCount) {
                View childAt2 = getChildAt(i41);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i42 = i18;
                int i43 = mode;
                long j13 = 1 << i41;
                if ((j12 & j13) == 0) {
                    if (cVar3.f1546b == i39) {
                        j11 |= j13;
                    }
                    z13 = z16;
                } else {
                    if (z16 && cVar3.f1549e && i21 == 1) {
                        int i44 = this.E;
                        z13 = z16;
                        childAt2.setPadding(i44 + i23, 0, i44, 0);
                    } else {
                        z13 = z16;
                    }
                    cVar3.f1546b++;
                    cVar3.f1550f = true;
                    i21--;
                }
                i41++;
                mode = i43;
                i18 = i42;
                z16 = z13;
            }
            i24 = i15;
            z17 = true;
        }
        i13 = mode;
        i14 = i18;
        z11 = z17;
        i15 = i24;
        boolean z19 = !z14 && i26 == 1;
        if (i21 <= 0 || j11 == 0 || (i21 >= i26 - 1 && !z19 && i27 <= 1)) {
            i16 = 0;
            z12 = z11;
        } else {
            float bitCount = Long.bitCount(j11);
            if (z19) {
                i16 = 0;
            } else {
                i16 = 0;
                if ((j11 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1549e) {
                    bitCount -= 0.5f;
                }
                int i45 = childCount - 1;
                if ((j11 & (1 << i45)) != 0 && !((c) getChildAt(i45).getLayoutParams()).f1549e) {
                    bitCount -= 0.5f;
                }
            }
            int i46 = bitCount > BitmapDescriptorFactory.HUE_RED ? (int) ((i21 * i23) / bitCount) : i16;
            z12 = z11;
            for (int i47 = i16; i47 < childCount; i47++) {
                if ((j11 & (1 << i47)) != 0) {
                    View childAt3 = getChildAt(i47);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1547c = i46;
                        cVar4.f1550f = true;
                        if (i47 == 0 && !cVar4.f1549e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i46) / 2;
                        }
                        z12 = true;
                    } else if (cVar4.f1545a) {
                        cVar4.f1547c = i46;
                        cVar4.f1550f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i46) / 2;
                        z12 = true;
                    } else {
                        if (i47 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i46 / 2;
                        }
                        if (i47 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i46 / 2;
                        }
                    }
                }
            }
        }
        if (z12) {
            for (int i48 = i16; i48 < childCount; i48++) {
                View childAt4 = getChildAt(i48);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1550f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1546b * i23) + cVar5.f1547c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, i13 != 1073741824 ? i15 : i33);
    }

    public void B() {
        androidx.appcompat.widget.c cVar = this.f1542x;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g0
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.g0
    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g0
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return m();
    }

    public c F() {
        c m11 = m();
        m11.f1545a = true;
        return m11;
    }

    protected boolean G(int i11) {
        boolean z11 = false;
        if (i11 == 0) {
            return false;
        }
        View childAt = getChildAt(i11 - 1);
        View childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof a)) {
            z11 = false | ((a) childAt).a();
        }
        return (i11 <= 0 || !(childAt2 instanceof a)) ? z11 : z11 | ((a) childAt2).b();
    }

    public boolean H() {
        androidx.appcompat.widget.c cVar = this.f1542x;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        androidx.appcompat.widget.c cVar = this.f1542x;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        androidx.appcompat.widget.c cVar = this.f1542x;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.f1541w;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f1538p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f1543y = aVar;
        this.f1544z = aVar2;
    }

    public boolean P() {
        androidx.appcompat.widget.c cVar = this.f1542x;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f1538p = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean d(androidx.appcompat.view.menu.g gVar) {
        return this.f1538p.L(gVar, 0);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1538p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1538p = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1542x = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.f1542x;
            j.a aVar = this.f1543y;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.d(aVar);
            this.f1538p.c(this.f1542x, this.f1539q);
            this.f1542x.H(this);
        }
        return this.f1538p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1542x.A();
    }

    public int getPopupTheme() {
        return this.f1540t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1542x;
        if (cVar != null) {
            cVar.f(false);
            if (this.f1542x.E()) {
                this.f1542x.B();
                this.f1542x.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int width;
        int i15;
        if (!this.A) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i13 - i11;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b11 = a1.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1545a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i21)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b11) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i22 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i22, width, measuredHeight + i22);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i21);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i23 = (i17 / 2) - (measuredWidth2 / 2);
            int i24 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i23, i24, measuredWidth2 + i23, measuredHeight2 + i24);
            return;
        }
        int i25 = i19 - (i18 ^ 1);
        int max = Math.max(0, i25 > 0 ? paddingRight / i25 : 0);
        if (b11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt3 = getChildAt(i26);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1545a) {
                    int i27 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i28 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i27 - measuredWidth3, i28, i27, measuredHeight3 + i28);
                    width2 = i27 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt4 = getChildAt(i29);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1545a) {
                int i31 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i32 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i31, i32, i31 + measuredWidth4, measuredHeight4 + i32);
                paddingLeft = i31 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g0, android.view.View
    public void onMeasure(int i11, int i12) {
        androidx.appcompat.view.menu.e eVar;
        boolean z11 = this.A;
        boolean z12 = View.MeasureSpec.getMode(i11) == 1073741824;
        this.A = z12;
        if (z11 != z12) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (this.A && (eVar = this.f1538p) != null && size != this.B) {
            this.B = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.A && childCount > 0) {
            M(i11, i12);
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            c cVar = (c) getChildAt(i13).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i11, i12);
    }

    public void setExpandedActionViewsExclusive(boolean z11) {
        this.f1542x.G(z11);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.F = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1542x.I(drawable);
    }

    public void setOverflowReserved(boolean z11) {
        this.f1541w = z11;
    }

    public void setPopupTheme(int i11) {
        if (this.f1540t != i11) {
            this.f1540t = i11;
            if (i11 == 0) {
                this.f1539q = getContext();
            } else {
                this.f1539q = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1542x = cVar;
        cVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f11);
        this.E = (int) (f11 * 4.0f);
        this.f1539q = context;
        this.f1540t = 0;
    }
}