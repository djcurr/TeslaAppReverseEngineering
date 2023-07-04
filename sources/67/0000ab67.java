package pr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qr.b;

/* loaded from: classes2.dex */
public final class d0 extends View {

    /* renamed from: a */
    private View f46851a;

    /* renamed from: b */
    private boolean f46852b;

    /* renamed from: c */
    private int f46853c;

    /* renamed from: d */
    private h00.p<? super ViewGroup, ? super View, vz.b0> f46854d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<ViewGroup, View, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(2);
            d0.this = r1;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(ViewGroup viewGroup, View view) {
            invoke2(viewGroup, view);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(ViewGroup parent, View newView) {
            vz.b0 b0Var;
            kotlin.jvm.internal.s.g(parent, "parent");
            kotlin.jvm.internal.s.g(newView, "newView");
            int indexOfChild = parent.indexOfChild(d0.this.getActual());
            parent.removeView(d0.this.getActual());
            ViewGroup.LayoutParams layoutParams = d0.this.getActual().getLayoutParams();
            if (layoutParams == null) {
                b0Var = null;
            } else {
                parent.addView(newView, indexOfChild, layoutParams);
                b0Var = vz.b0.f54756a;
            }
            if (b0Var == null) {
                parent.addView(newView, indexOfChild);
            }
        }
    }

    public /* synthetic */ d0(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    public static /* synthetic */ void a(View view, h00.a aVar) {
        d(view, aVar);
    }

    private final void b(View view) {
        androidx.savedstate.c a11 = androidx.savedstate.d.a(this);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (a11 != (viewGroup != null ? androidx.savedstate.d.a(viewGroup) : null)) {
            androidx.savedstate.d.b(view, a11);
        }
    }

    public static final void d(View view, h00.a doStart) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(doStart, "doStart");
        b.a.e(qr.b.f48435i1, view, null, 2, null);
        doStart.invoke();
    }

    public final View c(Object rendering, s viewEnvironment) {
        qr.b c11;
        kotlin.jvm.internal.s.g(rendering, "rendering");
        kotlin.jvm.internal.s.g(viewEnvironment, "viewEnvironment");
        View view = this.f46851a;
        if (!x.b(view, rendering)) {
            view = null;
        }
        if (view == null) {
            ViewParent parent = this.f46851a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                View view2 = this.f46851a;
                if (view2 != this && (c11 = qr.b.f48435i1.c(view2)) != null) {
                    c11.j();
                }
                Context context = viewGroup.getContext();
                kotlin.jvm.internal.s.f(context, "parent.context");
                View c12 = w.c((v) viewEnvironment.a(v.f46897a), rendering, viewEnvironment, context, viewGroup, new y() { // from class: pr.c0
                    @Override // pr.y
                    public final void a(View view3, h00.a aVar) {
                        d0.a(view3, aVar);
                    }
                });
                x.h(c12);
                if (getInflatedId() != -1) {
                    c12.setId(getInflatedId());
                }
                if (getUpdatesVisibility()) {
                    c12.setVisibility(getVisibility());
                }
                Drawable background = getBackground();
                if (background != null) {
                    c12.setBackground(background);
                }
                b(c12);
                getReplaceOldViewInParent().invoke(viewGroup, c12);
                this.f46851a = c12;
                return c12;
            }
            throw new IllegalStateException("WorkflowViewStub must have a non-null ViewGroup parent");
        }
        x.g(view, rendering, viewEnvironment);
        return view;
    }

    public final View getActual() {
        return this.f46851a;
    }

    public final int getInflatedId() {
        return this.f46853c;
    }

    public final h00.p<ViewGroup, View, vz.b0> getReplaceOldViewInParent() {
        return this.f46854d;
    }

    public final boolean getUpdatesVisibility() {
        return this.f46852b;
    }

    @Override // android.view.View
    public int getVisibility() {
        View view = this.f46851a;
        boolean z11 = true;
        if (!kotlin.jvm.internal.s.c(view, this) && view != null) {
            z11 = false;
        }
        return z11 ? super.getVisibility() : this.f46851a.getVisibility();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        View view;
        super.setBackground(drawable);
        if (kotlin.jvm.internal.s.c(this.f46851a, this) || (view = this.f46851a) == null || drawable == null) {
            return;
        }
        view.setBackground(drawable);
    }

    @Override // android.view.View
    public void setId(int i11) {
        if (i11 == -1 || i11 != this.f46853c) {
            super.setId(i11);
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("id must be distinct from inflatedId: ", getResources().getResourceName(i11)).toString());
    }

    public final void setInflatedId(int i11) {
        if (i11 == -1 || i11 != getId()) {
            this.f46853c = i11;
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("inflatedId must be distinct from id: ", getResources().getResourceName(getId())).toString());
    }

    public final void setReplaceOldViewInParent(h00.p<? super ViewGroup, ? super View, vz.b0> pVar) {
        kotlin.jvm.internal.s.g(pVar, "<set-?>");
        this.f46854d = pVar;
    }

    public final void setUpdatesVisibility(boolean z11) {
        this.f46852b = z11;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        View view;
        super.setVisibility(i11);
        if (kotlin.jvm.internal.s.c(this.f46851a, this) || (view = this.f46851a) == null) {
            return;
        }
        view.setVisibility(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        kotlin.jvm.internal.s.g(context, "context");
        this.f46851a = this;
        this.f46852b = true;
        this.f46853c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f46887a, i11, i12);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "context.obtainStyledAttributes(\n      attributeSet, R.styleable.WorkflowViewStub, defStyle, defStyleRes\n    )");
        setInflatedId(obtainStyledAttributes.getResourceId(p.f46888b, -1));
        this.f46852b = obtainStyledAttributes.getBoolean(p.f46889c, true);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        this.f46854d = new a();
    }
}