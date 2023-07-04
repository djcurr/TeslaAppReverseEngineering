package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class o extends PopupWindow {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1885b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1886a;

    static {
        f1885b = Build.VERSION.SDK_INT < 21;
    }

    public o(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        a(context, attributeSet, i11, i12);
    }

    private void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        u0 v11 = u0.v(context, attributeSet, g.j.N1, i11, i12);
        int i13 = g.j.P1;
        if (v11.s(i13)) {
            b(v11.a(i13, false));
        }
        setBackgroundDrawable(v11.g(g.j.O1));
        v11.w();
    }

    private void b(boolean z11) {
        if (f1885b) {
            this.f1886a = z11;
        } else {
            androidx.core.widget.l.a(this, z11);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12) {
        if (f1885b && this.f1886a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i11, int i12, int i13, int i14) {
        if (f1885b && this.f1886a) {
            i12 -= view.getHeight();
        }
        super.update(view, i11, i12, i13, i14);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i11, int i12, int i13) {
        if (f1885b && this.f1886a) {
            i12 -= view.getHeight();
        }
        super.showAsDropDown(view, i11, i12, i13);
    }
}