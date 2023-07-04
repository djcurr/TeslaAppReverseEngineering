package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0038a f1698a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f1699b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f1700c;

    /* renamed from: d  reason: collision with root package name */
    protected c f1701d;

    /* renamed from: e  reason: collision with root package name */
    protected int f1702e;

    /* renamed from: f  reason: collision with root package name */
    protected androidx.core.view.g0 f1703f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1704g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1705h;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0038a implements androidx.core.view.h0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1706a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1707b;

        protected C0038a() {
        }

        @Override // androidx.core.view.h0
        public void a(View view) {
            this.f1706a = true;
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            if (this.f1706a) {
                return;
            }
            a aVar = a.this;
            aVar.f1703f = null;
            a.super.setVisibility(this.f1707b);
        }

        @Override // androidx.core.view.h0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1706a = false;
        }

        public C0038a d(androidx.core.view.g0 g0Var, int i11) {
            a.this.f1703f = g0Var;
            this.f1707b = i11;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i11, int i12, boolean z11) {
        return z11 ? i11 - i12 : i11 + i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i11, int i12, int i13) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), i12);
        return Math.max(0, (i11 - view.getMeasuredWidth()) - i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i11, int i12, int i13, boolean z11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = i12 + ((i13 - measuredHeight) / 2);
        if (z11) {
            view.layout(i11 - measuredWidth, i14, i11, measuredHeight + i14);
        } else {
            view.layout(i11, i14, i11 + measuredWidth, measuredHeight + i14);
        }
        return z11 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.g0 f(int i11, long j11) {
        androidx.core.view.g0 g0Var = this.f1703f;
        if (g0Var != null) {
            g0Var.b();
        }
        if (i11 == 0) {
            if (getVisibility() != 0) {
                setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            androidx.core.view.g0 a11 = androidx.core.view.a0.e(this).a(1.0f);
            a11.d(j11);
            a11.f(this.f1698a.d(a11, i11));
            return a11;
        }
        androidx.core.view.g0 a12 = androidx.core.view.a0.e(this).a(BitmapDescriptorFactory.HUE_RED);
        a12.d(j11);
        a12.f(this.f1698a.d(a12, i11));
        return a12;
    }

    public int getAnimatedVisibility() {
        if (this.f1703f != null) {
            return this.f1698a.f1707b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1702e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, g.j.f27179a, g.a.f27041c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(g.j.f27224j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1701d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1705h = false;
        }
        if (!this.f1705h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1705h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1705h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1704g = false;
        }
        if (!this.f1704g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1704g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1704g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i11);

    @Override // android.view.View
    public void setVisibility(int i11) {
        if (i11 != getVisibility()) {
            androidx.core.view.g0 g0Var = this.f1703f;
            if (g0Var != null) {
                g0Var.b();
            }
            super.setVisibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1698a = new C0038a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(g.a.f27039a, typedValue, true) && typedValue.resourceId != 0) {
            this.f1699b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1699b = context;
        }
    }
}