package pr;

import android.content.Context;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f46867a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.a<vz.b0> f46868b;

    /* renamed from: c  reason: collision with root package name */
    private final a f46869c;

    /* loaded from: classes2.dex */
    public static final class a extends androidx.activity.e {
        a() {
            super(true);
        }

        @Override // androidx.activity.e
        public void handleOnBackPressed() {
            h.this.a().invoke();
        }
    }

    public h(View view, h00.a<vz.b0> handler) {
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(handler, "handler");
        this.f46867a = view;
        this.f46868b = handler;
        this.f46869c = new a();
    }

    public final h00.a<vz.b0> a() {
        return this.f46868b;
    }

    public final void b() {
        this.f46867a.addOnAttachStateChangeListener(this);
        if (this.f46867a.isAttachedToWindow()) {
            onViewAttachedToWindow(this.f46867a);
        }
    }

    public final void c() {
        if (this.f46867a.isAttachedToWindow()) {
            onViewDetachedFromWindow(this.f46867a);
        }
        this.f46867a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View attachedView) {
        kotlin.jvm.internal.s.g(attachedView, "attachedView");
        View view = this.f46867a;
        if (view == attachedView) {
            Context context = view.getContext();
            kotlin.jvm.internal.s.f(context, "view.context");
            androidx.activity.f b11 = c.b(context);
            if (b11 == null) {
                return;
            }
            b11.getOnBackPressedDispatcher().b(b11, this.f46869c);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View detachedView) {
        kotlin.jvm.internal.s.g(detachedView, "detachedView");
        if (this.f46867a == detachedView) {
            this.f46869c.remove();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}