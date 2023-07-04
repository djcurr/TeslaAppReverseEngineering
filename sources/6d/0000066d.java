package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f4578a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f4579b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4580c;

    private x(View view, Runnable runnable) {
        this.f4578a = view;
        this.f4579b = view.getViewTreeObserver();
        this.f4580c = runnable;
    }

    public static x a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        x xVar = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
        return xVar;
    }

    public void b() {
        if (this.f4579b.isAlive()) {
            this.f4579b.removeOnPreDrawListener(this);
        } else {
            this.f4578a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f4578a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f4580c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f4579b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}