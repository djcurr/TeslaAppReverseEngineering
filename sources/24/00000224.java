package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.a0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1454a;

    /* renamed from: b  reason: collision with root package name */
    private final e f1455b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1456c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1457d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1458e;

    /* renamed from: f  reason: collision with root package name */
    private View f1459f;

    /* renamed from: g  reason: collision with root package name */
    private int f1460g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1461h;

    /* renamed from: i  reason: collision with root package name */
    private j.a f1462i;

    /* renamed from: j  reason: collision with root package name */
    private h f1463j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1464k;

    /* renamed from: l  reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1465l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z11, int i11) {
        this(context, eVar, view, z11, i11, 0);
    }

    private h a() {
        h lVar;
        Display defaultDisplay = ((WindowManager) this.f1454a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if (Math.min(point.x, point.y) >= this.f1454a.getResources().getDimensionPixelSize(g.d.f27076c)) {
            lVar = new b(this.f1454a, this.f1459f, this.f1457d, this.f1458e, this.f1456c);
        } else {
            lVar = new l(this.f1454a, this.f1455b, this.f1459f, this.f1457d, this.f1458e, this.f1456c);
        }
        lVar.j(this.f1455b);
        lVar.t(this.f1465l);
        lVar.n(this.f1459f);
        lVar.d(this.f1462i);
        lVar.q(this.f1461h);
        lVar.r(this.f1460g);
        return lVar;
    }

    private void l(int i11, int i12, boolean z11, boolean z12) {
        h c11 = c();
        c11.u(z12);
        if (z11) {
            if ((androidx.core.view.e.b(this.f1460g, a0.F(this.f1459f)) & 7) == 5) {
                i11 -= this.f1459f.getWidth();
            }
            c11.s(i11);
            c11.v(i12);
            int i13 = (int) ((this.f1454a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c11.p(new Rect(i11 - i13, i12 - i13, i11 + i13, i12 + i13));
        }
        c11.show();
    }

    public void b() {
        if (d()) {
            this.f1463j.dismiss();
        }
    }

    public h c() {
        if (this.f1463j == null) {
            this.f1463j = a();
        }
        return this.f1463j;
    }

    public boolean d() {
        h hVar = this.f1463j;
        return hVar != null && hVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f1463j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1464k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1459f = view;
    }

    public void g(boolean z11) {
        this.f1461h = z11;
        h hVar = this.f1463j;
        if (hVar != null) {
            hVar.q(z11);
        }
    }

    public void h(int i11) {
        this.f1460g = i11;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1464k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f1462i = aVar;
        h hVar = this.f1463j;
        if (hVar != null) {
            hVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1459f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i11, int i12) {
        if (d()) {
            return true;
        }
        if (this.f1459f == null) {
            return false;
        }
        l(i11, i12, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z11, int i11, int i12) {
        this.f1460g = 8388611;
        this.f1465l = new a();
        this.f1454a = context;
        this.f1455b = eVar;
        this.f1459f = view;
        this.f1456c = z11;
        this.f1457d = i11;
        this.f1458e = i12;
    }
}