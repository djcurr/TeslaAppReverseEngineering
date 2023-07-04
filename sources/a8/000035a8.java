package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.l0;
import androidx.core.view.u;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fk.j;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wk.g;

/* loaded from: classes3.dex */
public class a extends h {

    /* renamed from: c  reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f14998c;

    /* renamed from: d  reason: collision with root package name */
    private FrameLayout f14999d;

    /* renamed from: e  reason: collision with root package name */
    private CoordinatorLayout f15000e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f15001f;

    /* renamed from: g  reason: collision with root package name */
    boolean f15002g;

    /* renamed from: h  reason: collision with root package name */
    boolean f15003h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15004i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15005j;

    /* renamed from: k  reason: collision with root package name */
    private BottomSheetBehavior.f f15006k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15007l;

    /* renamed from: m  reason: collision with root package name */
    private BottomSheetBehavior.f f15008m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0269a implements u {
        C0269a() {
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            if (a.this.f15006k != null) {
                a.this.f14998c.l0(a.this.f15006k);
            }
            if (l0Var != null) {
                a aVar = a.this;
                aVar.f15006k = new f(aVar.f15001f, l0Var, null);
                a.this.f14998c.S(a.this.f15006k);
            }
            return l0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f15003h && aVar.isShowing() && a.this.n()) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            if (a.this.f15003h) {
                cVar.a(PKIFailureInfo.badCertTemplate);
                cVar.i0(true);
                return;
            }
            cVar.i0(false);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (i11 == 1048576) {
                a aVar = a.this;
                if (aVar.f15003h) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {
        d(a aVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    class e extends BottomSheetBehavior.f {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onSlide(View view, float f11) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onStateChanged(View view, int i11) {
            if (i11 == 5) {
                a.this.cancel();
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class f extends BottomSheetBehavior.f {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f15013a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f15014b;

        /* renamed from: c  reason: collision with root package name */
        private final l0 f15015c;

        /* synthetic */ f(View view, l0 l0Var, C0269a c0269a) {
            this(view, l0Var);
        }

        private void a(View view) {
            if (view.getTop() < this.f15015c.m()) {
                a.m(view, this.f15013a);
                view.setPadding(view.getPaddingLeft(), this.f15015c.m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                a.m(view, this.f15014b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onSlide(View view, float f11) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void onStateChanged(View view, int i11) {
            a(view);
        }

        private f(View view, l0 l0Var) {
            ColorStateList v11;
            this.f15015c = l0Var;
            boolean z11 = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & PKIFailureInfo.certRevoked) != 0;
            this.f15014b = z11;
            g f02 = BottomSheetBehavior.c0(view).f0();
            if (f02 != null) {
                v11 = f02.x();
            } else {
                v11 = a0.v(view);
            }
            if (v11 != null) {
                this.f15013a = kk.a.f(v11.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f15013a = kk.a.f(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f15013a = z11;
            }
        }
    }

    public a(Context context, int i11) {
        super(context, b(context, i11));
        this.f15003h = true;
        this.f15004i = true;
        this.f15008m = new e();
        d(1);
        this.f15007l = getContext().getTheme().obtainStyledAttributes(new int[]{fk.b.f26383s}).getBoolean(0, false);
    }

    private static int b(Context context, int i11) {
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(fk.b.f26367c, typedValue, true)) {
                return typedValue.resourceId;
            }
            return j.f26499c;
        }
        return i11;
    }

    private FrameLayout i() {
        if (this.f14999d == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), fk.h.f26459a, null);
            this.f14999d = frameLayout;
            this.f15000e = (CoordinatorLayout) frameLayout.findViewById(fk.f.f26433d);
            FrameLayout frameLayout2 = (FrameLayout) this.f14999d.findViewById(fk.f.f26434e);
            this.f15001f = frameLayout2;
            BottomSheetBehavior<FrameLayout> c02 = BottomSheetBehavior.c0(frameLayout2);
            this.f14998c = c02;
            c02.S(this.f15008m);
            this.f14998c.u0(this.f15003h);
        }
        return this.f14999d;
    }

    public static void m(View view, boolean z11) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z11 ? systemUiVisibility | PKIFailureInfo.certRevoked : systemUiVisibility & (-8193));
        }
    }

    private View o(int i11, View view, ViewGroup.LayoutParams layoutParams) {
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f14999d.findViewById(fk.f.f26433d);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f15007l) {
            a0.J0(this.f15001f, new C0269a());
        }
        this.f15001f.removeAllViews();
        if (layoutParams == null) {
            this.f15001f.addView(view);
        } else {
            this.f15001f.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(fk.f.S).setOnClickListener(new b());
        a0.w0(this.f15001f, new c());
        this.f15001f.setOnTouchListener(new d(this));
        return this.f14999d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> j11 = j();
        if (this.f15002g && j11.g0() != 5) {
            j11.B0(5);
        } else {
            super.cancel();
        }
    }

    public BottomSheetBehavior<FrameLayout> j() {
        if (this.f14998c == null) {
            i();
        }
        return this.f14998c;
    }

    public boolean k() {
        return this.f15002g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.f14998c.l0(this.f15008m);
    }

    boolean n() {
        if (!this.f15005j) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f15004i = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f15005j = true;
        }
        return this.f15004i;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        boolean z11 = this.f15007l && Color.alpha(window.getNavigationBarColor()) < 255;
        FrameLayout frameLayout = this.f14999d;
        if (frameLayout != null) {
            frameLayout.setFitsSystemWindows(!z11);
        }
        CoordinatorLayout coordinatorLayout = this.f15000e;
        if (coordinatorLayout != null) {
            coordinatorLayout.setFitsSystemWindows(!z11);
        }
        if (z11) {
            window.getDecorView().setSystemUiVisibility(768);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 21) {
                window.setStatusBarColor(0);
                window.addFlags(Integer.MIN_VALUE);
                if (i11 < 23) {
                    window.addFlags(67108864);
                }
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f14998c;
        if (bottomSheetBehavior == null || bottomSheetBehavior.g0() != 5) {
            return;
        }
        this.f14998c.B0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z11) {
        super.setCancelable(z11);
        if (this.f15003h != z11) {
            this.f15003h = z11;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f14998c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.u0(z11);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.f15003h) {
            this.f15003h = true;
        }
        this.f15004i = z11;
        this.f15005j = true;
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i11) {
        super.setContentView(o(i11, null, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(o(0, view, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(o(0, view, layoutParams));
    }
}