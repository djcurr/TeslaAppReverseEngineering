package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.a implements b.a {
    e A;
    a B;
    RunnableC0039c C;
    private b E;
    final f F;
    int G;

    /* renamed from: i  reason: collision with root package name */
    d f1711i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1712j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1713k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1714l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1715m;

    /* renamed from: n  reason: collision with root package name */
    private int f1716n;

    /* renamed from: o  reason: collision with root package name */
    private int f1717o;

    /* renamed from: p  reason: collision with root package name */
    private int f1718p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1719q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1720t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1721w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1722x;

    /* renamed from: y  reason: collision with root package name */
    private int f1723y;

    /* renamed from: z  reason: collision with root package name */
    private final SparseBooleanArray f1724z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, g.a.f27050l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f1711i;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f1347h : view2);
            }
            j(c.this.F);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.B = null;
            cVar.G = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public m.e a() {
            a aVar = c.this.B;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0039c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f1727a;

        public RunnableC0039c(e eVar) {
            this.f1727a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f1342c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f1342c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f1347h;
            if (view != null && view.getWindowToken() != null && this.f1727a.m()) {
                c.this.A = this.f1727a;
            }
            c.this.C = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* loaded from: classes.dex */
        class a extends f0 {
            a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.f0
            public m.e b() {
                e eVar = c.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.f0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.f0
            public boolean d() {
                c cVar = c.this;
                if (cVar.C != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, g.a.f27049k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            w0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i11, int i12, int i13, int i14) {
            boolean frame = super.setFrame(i11, i12, i13, i14);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                n3.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z11) {
            super(context, eVar, view, z11, g.a.f27050l);
            h(8388613);
            j(c.this.F);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f1342c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f1342c.close();
            }
            c.this.A = null;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z11) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m11 = c.this.m();
            if (m11 != null) {
                m11.a(eVar, z11);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f1342c) {
                return false;
            }
            c.this.G = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m11 = c.this.m();
            if (m11 != null) {
                return m11.b(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, g.g.f27143c, g.g.f27142b);
        this.f1724z = new SparseBooleanArray();
        this.F = new f();
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1347h;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1711i;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1713k) {
            return this.f1712j;
        }
        return null;
    }

    public boolean B() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0039c runnableC0039c = this.C;
        if (runnableC0039c != null && (kVar = this.f1347h) != null) {
            ((View) kVar).removeCallbacks(runnableC0039c);
            this.C = null;
            return true;
        }
        e eVar = this.A;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean C() {
        a aVar = this.B;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean D() {
        return this.C != null || E();
    }

    public boolean E() {
        e eVar = this.A;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f1719q) {
            this.f1718p = l.a.b(this.f1341b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f1342c;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z11) {
        this.f1722x = z11;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f1347h = actionMenuView;
        actionMenuView.a(this.f1342c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1711i;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1713k = true;
        this.f1712j = drawable;
    }

    public void J(boolean z11) {
        this.f1714l = z11;
        this.f1715m = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1714l || E() || (eVar = this.f1342c) == null || this.f1347h == null || this.C != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0039c runnableC0039c = new RunnableC0039c(new e(this.f1341b, this.f1342c, this.f1711i, true));
        this.C = runnableC0039c;
        ((View) this.f1347h).post(runnableC0039c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z11) {
        y();
        super.a(eVar, z11);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.m mVar) {
        boolean z11 = false;
        if (mVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.m mVar2 = mVar;
            while (mVar2.e0() != this.f1342c) {
                mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
            }
            View z12 = z(mVar2.getItem());
            if (z12 == null) {
                return false;
            }
            mVar.getItem().getItemId();
            int size = mVar.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = mVar.getItem(i11);
                if (item.isVisible() && item.getIcon() != null) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            a aVar = new a(this.f1341b, mVar, z12);
            this.B = aVar;
            aVar.g(z11);
            this.B.k();
            super.e(mVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void f(boolean z11) {
        super.f(z11);
        ((View) this.f1347h).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f1342c;
        boolean z12 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> s11 = eVar.s();
            int size = s11.size();
            for (int i11 = 0; i11 < size; i11++) {
                androidx.core.view.b a11 = s11.get(i11).a();
                if (a11 != null) {
                    a11.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f1342c;
        ArrayList<androidx.appcompat.view.menu.g> z13 = eVar2 != null ? eVar2.z() : null;
        if (this.f1714l && z13 != null) {
            int size2 = z13.size();
            if (size2 == 1) {
                z12 = !z13.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z12 = true;
            }
        }
        if (z12) {
            if (this.f1711i == null) {
                this.f1711i = new d(this.f1340a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1711i.getParent();
            if (viewGroup != this.f1347h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1711i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1347h;
                actionMenuView.addView(this.f1711i, actionMenuView.F());
            }
        } else {
            d dVar = this.f1711i;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                androidx.appcompat.view.menu.k kVar = this.f1347h;
                if (parent == kVar) {
                    ((ViewGroup) kVar).removeView(this.f1711i);
                }
            }
        }
        ((ActionMenuView) this.f1347h).setOverflowReserved(this.f1714l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f1342c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i11 = arrayList.size();
        } else {
            arrayList = null;
            i11 = 0;
        }
        int i15 = cVar.f1718p;
        int i16 = cVar.f1717o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1347h;
        boolean z12 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i11; i19++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i19);
            if (gVar.o()) {
                i17++;
            } else if (gVar.n()) {
                i18++;
            } else {
                z12 = true;
            }
            if (cVar.f1722x && gVar.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (cVar.f1714l && (z12 || i18 + i17 > i15)) {
            i15--;
        }
        int i21 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = cVar.f1724z;
        sparseBooleanArray.clear();
        if (cVar.f1720t) {
            int i22 = cVar.f1723y;
            i13 = i16 / i22;
            i12 = i22 + ((i16 % i22) / i13);
        } else {
            i12 = 0;
            i13 = 0;
        }
        int i23 = 0;
        int i24 = 0;
        while (i23 < i11) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i23);
            if (gVar2.o()) {
                View n11 = cVar.n(gVar2, view, viewGroup);
                if (cVar.f1720t) {
                    i13 -= ActionMenuView.L(n11, i12, i13, makeMeasureSpec, r32);
                } else {
                    n11.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n11.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i24 == 0) {
                    i24 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z11 = r32;
                i14 = i11;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z13 = sparseBooleanArray.get(groupId2);
                boolean z14 = (i21 > 0 || z13) && i16 > 0 && (!cVar.f1720t || i13 > 0);
                boolean z15 = z14;
                i14 = i11;
                if (z14) {
                    View n12 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.f1720t) {
                        int L = ActionMenuView.L(n12, i12, i13, makeMeasureSpec, 0);
                        i13 -= L;
                        if (L == 0) {
                            z15 = false;
                        }
                    } else {
                        n12.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z16 = z15;
                    int measuredWidth2 = n12.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i24 == 0) {
                        i24 = measuredWidth2;
                    }
                    z14 = z16 & (!cVar.f1720t ? i16 + i24 <= 0 : i16 < 0);
                }
                if (z14 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z13) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i25 = 0; i25 < i23; i25++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i25);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i21++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z14) {
                    i21--;
                }
                gVar2.u(z14);
                z11 = false;
            } else {
                z11 = r32;
                i14 = i11;
                gVar2.u(z11);
            }
            i23++;
            r32 = z11;
            i11 = i14;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        l.a b11 = l.a.b(context);
        if (!this.f1715m) {
            this.f1714l = b11.h();
        }
        if (!this.f1721w) {
            this.f1716n = b11.c();
        }
        if (!this.f1719q) {
            this.f1718p = b11.d();
        }
        int i11 = this.f1716n;
        if (this.f1714l) {
            if (this.f1711i == null) {
                d dVar = new d(this.f1340a);
                this.f1711i = dVar;
                if (this.f1713k) {
                    dVar.setImageDrawable(this.f1712j);
                    this.f1712j = null;
                    this.f1713k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1711i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i11 -= this.f1711i.getMeasuredWidth();
        } else {
            this.f1711i = null;
        }
        this.f1717o = i11;
        this.f1723y = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void j(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1347h);
        if (this.E == null) {
            this.E = new b();
        }
        actionMenuItemView.setPopupCallback(this.E);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i11) {
        if (viewGroup.getChildAt(i11) == this.f1711i) {
            return false;
        }
        return super.l(viewGroup, i11);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f1347h;
        androidx.appcompat.view.menu.k o11 = super.o(viewGroup);
        if (kVar != o11) {
            ((ActionMenuView) o11).setPresenter(this);
        }
        return o11;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i11, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}