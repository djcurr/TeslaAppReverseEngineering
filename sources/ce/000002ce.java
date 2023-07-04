package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
class x0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j  reason: collision with root package name */
    private static x0 f1997j;

    /* renamed from: k  reason: collision with root package name */
    private static x0 f1998k;

    /* renamed from: a  reason: collision with root package name */
    private final View f1999a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f2000b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2001c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f2002d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f2003e = new b();

    /* renamed from: f  reason: collision with root package name */
    private int f2004f;

    /* renamed from: g  reason: collision with root package name */
    private int f2005g;

    /* renamed from: h  reason: collision with root package name */
    private y0 f2006h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2007i;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.g(false);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.c();
        }
    }

    private x0(View view, CharSequence charSequence) {
        this.f1999a = view;
        this.f2000b = charSequence;
        this.f2001c = androidx.core.view.c0.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1999a.removeCallbacks(this.f2002d);
    }

    private void b() {
        this.f2004f = Integer.MAX_VALUE;
        this.f2005g = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1999a.postDelayed(this.f2002d, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(x0 x0Var) {
        x0 x0Var2 = f1997j;
        if (x0Var2 != null) {
            x0Var2.a();
        }
        f1997j = x0Var;
        if (x0Var != null) {
            x0Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        x0 x0Var = f1997j;
        if (x0Var != null && x0Var.f1999a == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            x0 x0Var2 = f1998k;
            if (x0Var2 != null && x0Var2.f1999a == view) {
                x0Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new x0(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        if (Math.abs(x11 - this.f2004f) > this.f2001c || Math.abs(y11 - this.f2005g) > this.f2001c) {
            this.f2004f = x11;
            this.f2005g = y11;
            return true;
        }
        return false;
    }

    void c() {
        if (f1998k == this) {
            f1998k = null;
            y0 y0Var = this.f2006h;
            if (y0Var != null) {
                y0Var.c();
                this.f2006h = null;
                b();
                this.f1999a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1997j == this) {
            e(null);
        }
        this.f1999a.removeCallbacks(this.f2003e);
    }

    void g(boolean z11) {
        long j11;
        int longPressTimeout;
        long j12;
        if (androidx.core.view.a0.Y(this.f1999a)) {
            e(null);
            x0 x0Var = f1998k;
            if (x0Var != null) {
                x0Var.c();
            }
            f1998k = this;
            this.f2007i = z11;
            y0 y0Var = new y0(this.f1999a.getContext());
            this.f2006h = y0Var;
            y0Var.e(this.f1999a, this.f2004f, this.f2005g, this.f2007i, this.f2000b);
            this.f1999a.addOnAttachStateChangeListener(this);
            if (this.f2007i) {
                j12 = 2500;
            } else {
                if ((androidx.core.view.a0.R(this.f1999a) & 1) == 1) {
                    j11 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j11 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j12 = j11 - longPressTimeout;
            }
            this.f1999a.removeCallbacks(this.f2003e);
            this.f1999a.postDelayed(this.f2003e, j12);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2006h == null || !this.f2007i) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1999a.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    b();
                    c();
                }
            } else if (this.f1999a.isEnabled() && this.f2006h == null && h(motionEvent)) {
                e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2004f = view.getWidth() / 2;
        this.f2005g = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}