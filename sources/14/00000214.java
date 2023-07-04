package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.j0;
import androidx.core.view.a0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int G = g.g.f27145e;
    private boolean A;
    private j.a B;
    ViewTreeObserver C;
    private PopupWindow.OnDismissListener E;
    boolean F;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1348b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1349c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1350d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1351e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1352f;

    /* renamed from: g  reason: collision with root package name */
    final Handler f1353g;

    /* renamed from: o  reason: collision with root package name */
    private View f1361o;

    /* renamed from: p  reason: collision with root package name */
    View f1362p;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1364t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1365w;

    /* renamed from: x  reason: collision with root package name */
    private int f1366x;

    /* renamed from: y  reason: collision with root package name */
    private int f1367y;

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f1354h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    final List<d> f1355i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1356j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1357k = new View$OnAttachStateChangeListenerC0037b();

    /* renamed from: l  reason: collision with root package name */
    private final i0 f1358l = new c();

    /* renamed from: m  reason: collision with root package name */
    private int f1359m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f1360n = 0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1368z = false;

    /* renamed from: q  reason: collision with root package name */
    private int f1363q = C();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.b() || b.this.f1355i.size() <= 0 || b.this.f1355i.get(0).f1376a.A()) {
                return;
            }
            View view = b.this.f1362p;
            if (view != null && view.isShown()) {
                for (d dVar : b.this.f1355i) {
                    dVar.f1376a.show();
                }
                return;
            }
            b.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0037b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0037b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.C = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.C.removeGlobalOnLayoutListener(bVar.f1356j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements i0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f1372a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MenuItem f1373b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f1374c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f1372a = dVar;
                this.f1373b = menuItem;
                this.f1374c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1372a;
                if (dVar != null) {
                    b.this.F = true;
                    dVar.f1377b.e(false);
                    b.this.F = false;
                }
                if (this.f1373b.isEnabled() && this.f1373b.hasSubMenu()) {
                    this.f1374c.L(this.f1373b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.i0
        public void d(e eVar, MenuItem menuItem) {
            b.this.f1353g.removeCallbacksAndMessages(null);
            int size = b.this.f1355i.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (eVar == b.this.f1355i.get(i11).f1377b) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return;
            }
            int i12 = i11 + 1;
            b.this.f1353g.postAtTime(new a(i12 < b.this.f1355i.size() ? b.this.f1355i.get(i12) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.i0
        public void n(e eVar, MenuItem menuItem) {
            b.this.f1353g.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final j0 f1376a;

        /* renamed from: b  reason: collision with root package name */
        public final e f1377b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1378c;

        public d(j0 j0Var, e eVar, int i11) {
            this.f1376a = j0Var;
            this.f1377b = eVar;
            this.f1378c = i11;
        }

        public ListView a() {
            return this.f1376a.o();
        }
    }

    public b(Context context, View view, int i11, int i12, boolean z11) {
        this.f1348b = context;
        this.f1361o = view;
        this.f1350d = i11;
        this.f1351e = i12;
        this.f1352f = z11;
        Resources resources = context.getResources();
        this.f1349c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.f27077d));
        this.f1353g = new Handler();
    }

    private MenuItem A(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = eVar.getItem(i11);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i11;
        int firstVisiblePosition;
        MenuItem A = A(dVar.f1377b, eVar);
        if (A == null) {
            return null;
        }
        ListView a11 = dVar.a();
        ListAdapter adapter = a11.getAdapter();
        int i12 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i11 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i11 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i12 >= count) {
                i12 = -1;
                break;
            } else if (A == dVar2.getItem(i12)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1 && (firstVisiblePosition = (i12 + i11) - a11.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a11.getChildCount()) {
            return a11.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return a0.F(this.f1361o) == 1 ? 0 : 1;
    }

    private int D(int i11) {
        List<d> list = this.f1355i;
        ListView a11 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a11.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1362p.getWindowVisibleDisplayFrame(rect);
        return this.f1363q == 1 ? (iArr[0] + a11.getWidth()) + i11 > rect.right ? 0 : 1 : iArr[0] - i11 < 0 ? 1 : 0;
    }

    private void E(e eVar) {
        d dVar;
        View view;
        int i11;
        int i12;
        int i13;
        LayoutInflater from = LayoutInflater.from(this.f1348b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f1352f, G);
        if (!b() && this.f1368z) {
            dVar2.d(true);
        } else if (b()) {
            dVar2.d(h.w(eVar));
        }
        int m11 = h.m(dVar2, null, this.f1348b, this.f1349c);
        j0 y11 = y();
        y11.m(dVar2);
        y11.E(m11);
        y11.F(this.f1360n);
        if (this.f1355i.size() > 0) {
            List<d> list = this.f1355i;
            dVar = list.get(list.size() - 1);
            view = B(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y11.T(false);
            y11.Q(null);
            int D = D(m11);
            boolean z11 = D == 1;
            this.f1363q = D;
            if (Build.VERSION.SDK_INT >= 26) {
                y11.C(view);
                i12 = 0;
                i11 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1361o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1360n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1361o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i11 = iArr2[0] - iArr[0];
                i12 = iArr2[1] - iArr[1];
            }
            if ((this.f1360n & 5) == 5) {
                if (!z11) {
                    m11 = view.getWidth();
                    i13 = i11 - m11;
                }
                i13 = i11 + m11;
            } else {
                if (z11) {
                    m11 = view.getWidth();
                    i13 = i11 + m11;
                }
                i13 = i11 - m11;
            }
            y11.e(i13);
            y11.L(true);
            y11.i(i12);
        } else {
            if (this.f1364t) {
                y11.e(this.f1366x);
            }
            if (this.f1365w) {
                y11.i(this.f1367y);
            }
            y11.G(l());
        }
        this.f1355i.add(new d(y11, eVar, this.f1363q));
        y11.show();
        ListView o11 = y11.o();
        o11.setOnKeyListener(this);
        if (dVar == null && this.A && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.g.f27152l, (ViewGroup) o11, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            o11.addHeaderView(frameLayout, null, false);
            y11.show();
        }
    }

    private j0 y() {
        j0 j0Var = new j0(this.f1348b, null, this.f1350d, this.f1351e);
        j0Var.S(this.f1358l);
        j0Var.K(this);
        j0Var.J(this);
        j0Var.C(this.f1361o);
        j0Var.F(this.f1360n);
        j0Var.I(true);
        j0Var.H(2);
        return j0Var;
    }

    private int z(e eVar) {
        int size = this.f1355i.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (eVar == this.f1355i.get(i11).f1377b) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z11) {
        int z12 = z(eVar);
        if (z12 < 0) {
            return;
        }
        int i11 = z12 + 1;
        if (i11 < this.f1355i.size()) {
            this.f1355i.get(i11).f1377b.e(false);
        }
        d remove = this.f1355i.remove(z12);
        remove.f1377b.O(this);
        if (this.F) {
            remove.f1376a.R(null);
            remove.f1376a.D(0);
        }
        remove.f1376a.dismiss();
        int size = this.f1355i.size();
        if (size > 0) {
            this.f1363q = this.f1355i.get(size - 1).f1378c;
        } else {
            this.f1363q = C();
        }
        if (size != 0) {
            if (z11) {
                this.f1355i.get(0).f1377b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.B;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.C.removeGlobalOnLayoutListener(this.f1356j);
            }
            this.C = null;
        }
        this.f1362p.removeOnAttachStateChangeListener(this.f1357k);
        this.E.onDismiss();
    }

    @Override // m.e
    public boolean b() {
        return this.f1355i.size() > 0 && this.f1355i.get(0).f1376a.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.B = aVar;
    }

    @Override // m.e
    public void dismiss() {
        int size = this.f1355i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1355i.toArray(new d[size]);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                d dVar = dVarArr[i11];
                if (dVar.f1376a.b()) {
                    dVar.f1376a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        for (d dVar : this.f1355i) {
            if (mVar == dVar.f1377b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            j(mVar);
            j.a aVar = this.B;
            if (aVar != null) {
                aVar.b(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z11) {
        for (d dVar : this.f1355i) {
            h.x(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void j(e eVar) {
        eVar.c(this, this.f1348b);
        if (b()) {
            E(eVar);
        } else {
            this.f1354h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void n(View view) {
        if (this.f1361o != view) {
            this.f1361o = view;
            this.f1360n = androidx.core.view.e.b(this.f1359m, a0.F(view));
        }
    }

    @Override // m.e
    public ListView o() {
        if (this.f1355i.isEmpty()) {
            return null;
        }
        List<d> list = this.f1355i;
        return list.get(list.size() - 1).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1355i.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1355i.get(i11);
            if (!dVar.f1376a.b()) {
                break;
            }
            i11++;
        }
        if (dVar != null) {
            dVar.f1377b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i11 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(boolean z11) {
        this.f1368z = z11;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(int i11) {
        if (this.f1359m != i11) {
            this.f1359m = i11;
            this.f1360n = androidx.core.view.e.b(i11, a0.F(this.f1361o));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i11) {
        this.f1364t = true;
        this.f1366x = i11;
    }

    @Override // m.e
    public void show() {
        if (b()) {
            return;
        }
        for (e eVar : this.f1354h) {
            E(eVar);
        }
        this.f1354h.clear();
        View view = this.f1361o;
        this.f1362p = view;
        if (view != null) {
            boolean z11 = this.C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.C = viewTreeObserver;
            if (z11) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1356j);
            }
            this.f1362p.addOnAttachStateChangeListener(this.f1357k);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z11) {
        this.A = z11;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i11) {
        this.f1365w = true;
        this.f1367y = i11;
    }
}