package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private CharSequence B;
    private CharSequence C;
    private ColorStateList E;
    private ColorStateList F;
    private boolean G;
    private boolean H;
    private final ArrayList<View> K;
    private final ArrayList<View> L;
    private final int[] O;
    f P;
    private final ActionMenuView.e Q;
    private v0 R;
    private androidx.appcompat.widget.c T;

    /* renamed from: a  reason: collision with root package name */
    private ActionMenuView f1657a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1658b;

    /* renamed from: b1  reason: collision with root package name */
    private d f1659b1;

    /* renamed from: c  reason: collision with root package name */
    private TextView f1660c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f1661d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f1662e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1663f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f1664g;

    /* renamed from: g1  reason: collision with root package name */
    private j.a f1665g1;

    /* renamed from: h  reason: collision with root package name */
    ImageButton f1666h;

    /* renamed from: i  reason: collision with root package name */
    View f1667i;

    /* renamed from: j  reason: collision with root package name */
    private Context f1668j;

    /* renamed from: k  reason: collision with root package name */
    private int f1669k;

    /* renamed from: l  reason: collision with root package name */
    private int f1670l;

    /* renamed from: m  reason: collision with root package name */
    private int f1671m;

    /* renamed from: n  reason: collision with root package name */
    int f1672n;

    /* renamed from: o  reason: collision with root package name */
    private int f1673o;

    /* renamed from: p  reason: collision with root package name */
    private int f1674p;

    /* renamed from: p1  reason: collision with root package name */
    private e.a f1675p1;

    /* renamed from: q  reason: collision with root package name */
    private int f1676q;

    /* renamed from: t  reason: collision with root package name */
    private int f1677t;

    /* renamed from: w  reason: collision with root package name */
    private int f1678w;

    /* renamed from: x  reason: collision with root package name */
    private m0 f1679x;

    /* renamed from: x1  reason: collision with root package name */
    private boolean f1680x1;

    /* renamed from: y  reason: collision with root package name */
    private int f1681y;

    /* renamed from: y1  reason: collision with root package name */
    private final Runnable f1682y1;

    /* renamed from: z  reason: collision with root package name */
    private int f1683z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.P;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.j {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.view.menu.e f1687a;

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.g f1688b;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void a(androidx.appcompat.view.menu.e eVar, boolean z11) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1666h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1666h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1666h);
            }
            Toolbar.this.f1667i = gVar.getActionView();
            this.f1688b = gVar;
            ViewParent parent2 = Toolbar.this.f1667i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1667i);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f1141a = 8388611 | (toolbar4.f1672n & 112);
                generateDefaultLayoutParams.f1690b = 2;
                toolbar4.f1667i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1667i);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f1667i;
            if (view instanceof l.c) {
                ((l.c) view).b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(boolean z11) {
            if (this.f1688b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1687a;
                boolean z12 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        } else if (this.f1687a.getItem(i11) == this.f1688b) {
                            z12 = true;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (z12) {
                    return;
                }
                h(this.f1687a, this.f1688b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f1667i;
            if (view instanceof l.c) {
                ((l.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1667i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1666h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1667i = null;
            toolbar3.a();
            this.f1688b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1687a;
            if (eVar2 != null && (gVar = this.f1688b) != null) {
                eVar2.f(gVar);
            }
            this.f1687a = eVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private int B(View view, int i11, int[] iArr, int i12) {
        e eVar = (e) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i11 + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        int q11 = q(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q11, max + measuredWidth, view.getMeasuredHeight() + q11);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i11, int[] iArr, int i12) {
        e eVar = (e) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i11 - Math.max(0, i13);
        iArr[1] = Math.max(0, -i13);
        int q11 = q(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q11, max, view.getMeasuredHeight() + q11);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i11, int i12, int i13, int i14, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i15 = marginLayoutParams.leftMargin - iArr[0];
        int i16 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i16);
        iArr[0] = Math.max(0, -i15);
        iArr[1] = Math.max(0, -i16);
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + max + i12, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i13, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i11, int i12, int i13, int i14, int i15) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i15 >= 0) {
            if (mode != 0) {
                i15 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i15);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.f1682y1);
        post(this.f1682y1);
    }

    private boolean M() {
        if (this.f1680x1) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (N(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean N(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i11) {
        boolean z11 = androidx.core.view.a0.F(this) == 1;
        int childCount = getChildCount();
        int b11 = androidx.core.view.e.b(i11, androidx.core.view.a0.F(this));
        list.clear();
        if (!z11) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1690b == 0 && N(childAt) && p(eVar.f1141a) == b11) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1690b == 0 && N(childAt2) && p(eVar2.f1141a) == b11) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z11) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f1690b = 1;
        if (z11 && this.f1667i != null) {
            view.setLayoutParams(eVar);
            this.L.add(view);
            return;
        }
        addView(view, eVar);
    }

    private MenuInflater getMenuInflater() {
        return new l.g(getContext());
    }

    private void h() {
        if (this.f1679x == null) {
            this.f1679x = new m0();
        }
    }

    private void i() {
        if (this.f1662e == null) {
            this.f1662e = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1657a.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1657a.getMenu();
            if (this.f1659b1 == null) {
                this.f1659b1 = new d();
            }
            this.f1657a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f1659b1, this.f1668j);
        }
    }

    private void k() {
        if (this.f1657a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1657a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1669k);
            this.f1657a.setOnMenuItemClickListener(this.Q);
            this.f1657a.O(this.f1665g1, this.f1675p1);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1141a = 8388613 | (this.f1672n & 112);
            this.f1657a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1657a, false);
        }
    }

    private void l() {
        if (this.f1661d == null) {
            this.f1661d = new l(getContext(), null, g.a.M);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1141a = 8388611 | (this.f1672n & 112);
            this.f1661d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i11) {
        int F = androidx.core.view.a0.F(this);
        int b11 = androidx.core.view.e.b(i11, F) & 7;
        return (b11 == 1 || b11 == 3 || b11 == 5) ? b11 : F == 1 ? 5 : 3;
    }

    private int q(View view, int i11) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = i11 > 0 ? (measuredHeight - i11) / 2 : 0;
        int r11 = r(eVar.f1141a);
        if (r11 != 48) {
            if (r11 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i12;
        }
        return getPaddingTop() - i12;
    }

    private int r(int i11) {
        int i12 = i11 & 112;
        return (i12 == 16 || i12 == 48 || i12 == 80) ? i12 : this.A & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.h.b(marginLayoutParams) + androidx.core.view.h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            View view = list.get(i13);
            e eVar = (e) view.getLayoutParams();
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i11;
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i12;
            int max = Math.max(0, i15);
            int max2 = Math.max(0, i16);
            int max3 = Math.max(0, -i15);
            int max4 = Math.max(0, -i16);
            i14 += max + view.getMeasuredWidth() + max2;
            i13++;
            i12 = max4;
            i11 = max3;
        }
        return i14;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.L.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1657a;
        return actionMenuView != null && actionMenuView.J();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1690b != 2 && childAt != this.f1657a) {
                removeViewAt(childCount);
                this.L.add(childAt);
            }
        }
    }

    public void H(int i11, int i12) {
        h();
        this.f1679x.g(i11, i12);
    }

    public void I(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f1657a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e N = this.f1657a.N();
        if (N == eVar) {
            return;
        }
        if (N != null) {
            N.O(this.T);
            N.O(this.f1659b1);
        }
        if (this.f1659b1 == null) {
            this.f1659b1 = new d();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f1668j);
            eVar.c(this.f1659b1, this.f1668j);
        } else {
            cVar.i(this.f1668j, null);
            this.f1659b1.i(this.f1668j, null);
            cVar.f(true);
            this.f1659b1.f(true);
        }
        this.f1657a.setPopupTheme(this.f1669k);
        this.f1657a.setPresenter(cVar);
        this.T = cVar;
    }

    public void J(j.a aVar, e.a aVar2) {
        this.f1665g1 = aVar;
        this.f1675p1 = aVar2;
        ActionMenuView actionMenuView = this.f1657a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void K(Context context, int i11) {
        this.f1671m = i11;
        TextView textView = this.f1660c;
        if (textView != null) {
            textView.setTextAppearance(context, i11);
        }
    }

    public void L(Context context, int i11) {
        this.f1670l = i11;
        TextView textView = this.f1658b;
        if (textView != null) {
            textView.setTextAppearance(context, i11);
        }
    }

    public boolean O() {
        ActionMenuView actionMenuView = this.f1657a;
        return actionMenuView != null && actionMenuView.P();
    }

    void a() {
        for (int size = this.L.size() - 1; size >= 0; size--) {
            addView(this.L.get(size));
        }
        this.L.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1657a) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.f1659b1;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f1688b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1657a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f1666h == null) {
            l lVar = new l(getContext(), null, g.a.M);
            this.f1666h = lVar;
            lVar.setImageDrawable(this.f1663f);
            this.f1666h.setContentDescription(this.f1664g);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1141a = 8388611 | (this.f1672n & 112);
            generateDefaultLayoutParams.f1690b = 2;
            this.f1666h.setLayoutParams(generateDefaultLayoutParams);
            this.f1666h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1666h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1666h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        m0 m0Var = this.f1679x;
        if (m0Var != null) {
            return m0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i11 = this.f1683z;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        m0 m0Var = this.f1679x;
        if (m0Var != null) {
            return m0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        m0 m0Var = this.f1679x;
        if (m0Var != null) {
            return m0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        m0 m0Var = this.f1679x;
        if (m0Var != null) {
            return m0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i11 = this.f1681y;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e N;
        ActionMenuView actionMenuView = this.f1657a;
        if ((actionMenuView == null || (N = actionMenuView.N()) == null || !N.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1683z, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (androidx.core.view.a0.F(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (androidx.core.view.a0.F(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1681y, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1662e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1662e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1657a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1661d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1661d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.T;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1657a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1668j;
    }

    public int getPopupTheme() {
        return this.f1669k;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    final TextView getSubtitleTextView() {
        return this.f1660c;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.f1678w;
    }

    public int getTitleMarginEnd() {
        return this.f1676q;
    }

    public int getTitleMarginStart() {
        return this.f1674p;
    }

    public int getTitleMarginTop() {
        return this.f1677t;
    }

    final TextView getTitleTextView() {
        return this.f1658b;
    }

    public b0 getWrapper() {
        if (this.R == null) {
            this.R = new v0(this, true);
        }
        return this.R;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0035a) {
            return new e((a.C0035a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1682y1);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr = this.O;
        boolean b11 = a1.b(this);
        int i21 = !b11 ? 1 : 0;
        if (N(this.f1661d)) {
            E(this.f1661d, i11, 0, i12, 0, this.f1673o);
            i13 = this.f1661d.getMeasuredWidth() + s(this.f1661d);
            i14 = Math.max(0, this.f1661d.getMeasuredHeight() + t(this.f1661d));
            i15 = View.combineMeasuredStates(0, this.f1661d.getMeasuredState());
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (N(this.f1666h)) {
            E(this.f1666h, i11, 0, i12, 0, this.f1673o);
            i13 = this.f1666h.getMeasuredWidth() + s(this.f1666h);
            i14 = Math.max(i14, this.f1666h.getMeasuredHeight() + t(this.f1666h));
            i15 = View.combineMeasuredStates(i15, this.f1666h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i13);
        iArr[b11 ? 1 : 0] = Math.max(0, currentContentInsetStart - i13);
        if (N(this.f1657a)) {
            E(this.f1657a, i11, max, i12, 0, this.f1673o);
            i16 = this.f1657a.getMeasuredWidth() + s(this.f1657a);
            i14 = Math.max(i14, this.f1657a.getMeasuredHeight() + t(this.f1657a));
            i15 = View.combineMeasuredStates(i15, this.f1657a.getMeasuredState());
        } else {
            i16 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i16);
        iArr[i21] = Math.max(0, currentContentInsetEnd - i16);
        if (N(this.f1667i)) {
            max2 += D(this.f1667i, i11, max2, i12, 0, iArr);
            i14 = Math.max(i14, this.f1667i.getMeasuredHeight() + t(this.f1667i));
            i15 = View.combineMeasuredStates(i15, this.f1667i.getMeasuredState());
        }
        if (N(this.f1662e)) {
            max2 += D(this.f1662e, i11, max2, i12, 0, iArr);
            i14 = Math.max(i14, this.f1662e.getMeasuredHeight() + t(this.f1662e));
            i15 = View.combineMeasuredStates(i15, this.f1662e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (((e) childAt.getLayoutParams()).f1690b == 0 && N(childAt)) {
                max2 += D(childAt, i11, max2, i12, 0, iArr);
                i14 = Math.max(i14, childAt.getMeasuredHeight() + t(childAt));
                i15 = View.combineMeasuredStates(i15, childAt.getMeasuredState());
            }
        }
        int i23 = this.f1677t + this.f1678w;
        int i24 = this.f1674p + this.f1676q;
        if (N(this.f1658b)) {
            D(this.f1658b, i11, max2 + i24, i12, i23, iArr);
            int measuredWidth = this.f1658b.getMeasuredWidth() + s(this.f1658b);
            i17 = this.f1658b.getMeasuredHeight() + t(this.f1658b);
            i18 = View.combineMeasuredStates(i15, this.f1658b.getMeasuredState());
            i19 = measuredWidth;
        } else {
            i17 = 0;
            i18 = i15;
            i19 = 0;
        }
        if (N(this.f1660c)) {
            i19 = Math.max(i19, D(this.f1660c, i11, max2 + i24, i12, i17 + i23, iArr));
            i17 += this.f1660c.getMeasuredHeight() + t(this.f1660c);
            i18 = View.combineMeasuredStates(i18, this.f1660c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i19 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i11, (-16777216) & i18), M() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i14, i17) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i12, i18 << 16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f1657a;
        androidx.appcompat.view.menu.e N = actionMenuView != null ? actionMenuView.N() : null;
        int i11 = gVar.f1691c;
        if (i11 != 0 && this.f1659b1 != null && N != null && (findItem = N.findItem(i11)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f1692d) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i11);
        }
        h();
        this.f1679x.f(i11 == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f1659b1;
        if (dVar != null && (gVar = dVar.f1688b) != null) {
            gVar2.f1691c = gVar.getItemId();
        }
        gVar2.f1692d = A();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i11) {
        setCollapseContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setCollapseIcon(int i11) {
        setCollapseIcon(h.a.d(getContext(), i11));
    }

    public void setCollapsible(boolean z11) {
        this.f1680x1 = z11;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f1683z) {
            this.f1683z = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i11) {
        if (i11 < 0) {
            i11 = Integer.MIN_VALUE;
        }
        if (i11 != this.f1681y) {
            this.f1681y = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i11) {
        setLogo(h.a.d(getContext(), i11));
    }

    public void setLogoDescription(int i11) {
        setLogoDescription(getContext().getText(i11));
    }

    public void setNavigationContentDescription(int i11) {
        setNavigationContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setNavigationIcon(int i11) {
        setNavigationIcon(h.a.d(getContext(), i11));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1661d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.P = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1657a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i11) {
        if (this.f1669k != i11) {
            this.f1669k = i11;
            if (i11 == 0) {
                this.f1668j = getContext();
            } else {
                this.f1668j = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setSubtitle(int i11) {
        setSubtitle(getContext().getText(i11));
    }

    public void setSubtitleTextColor(int i11) {
        setSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setTitle(int i11) {
        setTitle(getContext().getText(i11));
    }

    public void setTitleMarginBottom(int i11) {
        this.f1678w = i11;
        requestLayout();
    }

    public void setTitleMarginEnd(int i11) {
        this.f1676q = i11;
        requestLayout();
    }

    public void setTitleMarginStart(int i11) {
        this.f1674p = i11;
        requestLayout();
    }

    public void setTitleMarginTop(int i11) {
        this.f1677t = i11;
        requestLayout();
    }

    public void setTitleTextColor(int i11) {
        setTitleTextColor(ColorStateList.valueOf(i11));
    }

    public boolean v() {
        d dVar = this.f1659b1;
        return (dVar == null || dVar.f1688b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1657a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i11) {
        getMenuInflater().inflate(i11, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f1657a;
        return actionMenuView != null && actionMenuView.I();
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0035a {

        /* renamed from: b  reason: collision with root package name */
        int f1690b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1690b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i11, int i12) {
            super(i11, i12);
            this.f1690b = 0;
            this.f1141a = 8388627;
        }

        public e(e eVar) {
            super((a.C0035a) eVar);
            this.f1690b = 0;
            this.f1690b = eVar.f1690b;
        }

        public e(a.C0035a c0035a) {
            super(c0035a);
            this.f1690b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1690b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1690b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.N);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1666h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1666h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1666h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1663f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f1662e)) {
                c(this.f1662e, true);
            }
        } else {
            ImageView imageView = this.f1662e;
            if (imageView != null && y(imageView)) {
                removeView(this.f1662e);
                this.L.remove(this.f1662e);
            }
        }
        ImageView imageView2 = this.f1662e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1662e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1661d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f1661d)) {
                c(this.f1661d, true);
            }
        } else {
            ImageButton imageButton = this.f1661d;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f1661d);
                this.L.remove(this.f1661d);
            }
        }
        ImageButton imageButton2 = this.f1661d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1660c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1660c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1660c.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.f1671m;
                if (i11 != 0) {
                    this.f1660c.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.f1660c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1660c)) {
                c(this.f1660c, true);
            }
        } else {
            TextView textView = this.f1660c;
            if (textView != null && y(textView)) {
                removeView(this.f1660c);
                this.L.remove(this.f1660c);
            }
        }
        TextView textView2 = this.f1660c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        TextView textView = this.f1660c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1658b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1658b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1658b.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.f1670l;
                if (i11 != 0) {
                    this.f1658b.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f1658b.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1658b)) {
                c(this.f1658b, true);
            }
        } else {
            TextView textView = this.f1658b;
            if (textView != null && y(textView)) {
                removeView(this.f1658b);
                this.L.remove(this.f1658b);
            }
        }
        TextView textView2 = this.f1658b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f1658b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a4.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f1691c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1692d;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i11) {
                return new g[i11];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1691c = parcel.readInt();
            this.f1692d = parcel.readInt() != 0;
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f1691c);
            parcel.writeInt(this.f1692d ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.A = 8388627;
        this.K = new ArrayList<>();
        this.L = new ArrayList<>();
        this.O = new int[2];
        this.Q = new a();
        this.f1682y1 = new b();
        Context context2 = getContext();
        int[] iArr = g.j.T2;
        u0 v11 = u0.v(context2, attributeSet, iArr, i11, 0);
        androidx.core.view.a0.u0(this, context, iArr, attributeSet, v11.r(), i11, 0);
        this.f1670l = v11.n(g.j.f27288v3, 0);
        this.f1671m = v11.n(g.j.f27243m3, 0);
        this.A = v11.l(g.j.U2, this.A);
        this.f1672n = v11.l(g.j.V2, 48);
        int e11 = v11.e(g.j.f27258p3, 0);
        int i12 = g.j.f27283u3;
        e11 = v11.s(i12) ? v11.e(i12, e11) : e11;
        this.f1678w = e11;
        this.f1677t = e11;
        this.f1676q = e11;
        this.f1674p = e11;
        int e12 = v11.e(g.j.f27273s3, -1);
        if (e12 >= 0) {
            this.f1674p = e12;
        }
        int e13 = v11.e(g.j.f27268r3, -1);
        if (e13 >= 0) {
            this.f1676q = e13;
        }
        int e14 = v11.e(g.j.f27278t3, -1);
        if (e14 >= 0) {
            this.f1677t = e14;
        }
        int e15 = v11.e(g.j.f27263q3, -1);
        if (e15 >= 0) {
            this.f1678w = e15;
        }
        this.f1673o = v11.f(g.j.f27213g3, -1);
        int e16 = v11.e(g.j.f27193c3, Integer.MIN_VALUE);
        int e17 = v11.e(g.j.Y2, Integer.MIN_VALUE);
        int f11 = v11.f(g.j.f27183a3, 0);
        int f12 = v11.f(g.j.f27188b3, 0);
        h();
        this.f1679x.e(f11, f12);
        if (e16 != Integer.MIN_VALUE || e17 != Integer.MIN_VALUE) {
            this.f1679x.g(e16, e17);
        }
        this.f1681y = v11.e(g.j.f27198d3, Integer.MIN_VALUE);
        this.f1683z = v11.e(g.j.Z2, Integer.MIN_VALUE);
        this.f1663f = v11.g(g.j.X2);
        this.f1664g = v11.p(g.j.W2);
        CharSequence p11 = v11.p(g.j.f27253o3);
        if (!TextUtils.isEmpty(p11)) {
            setTitle(p11);
        }
        CharSequence p12 = v11.p(g.j.f27238l3);
        if (!TextUtils.isEmpty(p12)) {
            setSubtitle(p12);
        }
        this.f1668j = getContext();
        setPopupTheme(v11.n(g.j.f27233k3, 0));
        Drawable g11 = v11.g(g.j.f27228j3);
        if (g11 != null) {
            setNavigationIcon(g11);
        }
        CharSequence p13 = v11.p(g.j.f27223i3);
        if (!TextUtils.isEmpty(p13)) {
            setNavigationContentDescription(p13);
        }
        Drawable g12 = v11.g(g.j.f27203e3);
        if (g12 != null) {
            setLogo(g12);
        }
        CharSequence p14 = v11.p(g.j.f27208f3);
        if (!TextUtils.isEmpty(p14)) {
            setLogoDescription(p14);
        }
        int i13 = g.j.f27293w3;
        if (v11.s(i13)) {
            setTitleTextColor(v11.c(i13));
        }
        int i14 = g.j.f27248n3;
        if (v11.s(i14)) {
            setSubtitleTextColor(v11.c(i14));
        }
        int i15 = g.j.f27218h3;
        if (v11.s(i15)) {
            x(v11.n(i15, 0));
        }
        v11.w();
    }
}