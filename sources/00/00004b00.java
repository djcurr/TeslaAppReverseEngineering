package com.squareup.workflow1.ui.androidx;

import android.view.View;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qr.b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/squareup/workflow1/ui/androidx/RealWorkflowLifecycleOwner;", "Lqr/b;", "Landroidx/lifecycle/v;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/s;", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/lifecycle/p;", "findParentLifecycle", "", "enforceMainThread", "<init>", "(Lh00/l;Z)V", "wf1-core-android"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class RealWorkflowLifecycleOwner implements b, v, View.OnAttachStateChangeListener, s {

    /* renamed from: a  reason: collision with root package name */
    private final l<View, p> f20862a;

    /* renamed from: b  reason: collision with root package name */
    private View f20863b;

    /* renamed from: c  reason: collision with root package name */
    private final x f20864c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20865d;

    /* renamed from: e  reason: collision with root package name */
    private p f20866e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20867f;

    /* JADX WARN: Multi-variable type inference failed */
    public RealWorkflowLifecycleOwner(l<? super View, ? extends p> findParentLifecycle, boolean z11) {
        x f11;
        kotlin.jvm.internal.s.g(findParentLifecycle, "findParentLifecycle");
        this.f20862a = findParentLifecycle;
        if (z11) {
            f11 = new x(this);
        } else {
            f11 = x.f(this);
            kotlin.jvm.internal.s.f(f11, "createUnsafe(this)");
        }
        this.f20864c = f11;
    }

    public static /* synthetic */ void b(RealWorkflowLifecycleOwner realWorkflowLifecycleOwner, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            View view = realWorkflowLifecycleOwner.f20863b;
            z11 = view == null ? false : view.isAttachedToWindow();
        }
        realWorkflowLifecycleOwner.a(z11);
    }

    public final void a(boolean z11) {
        p pVar = this.f20866e;
        p.c b11 = pVar == null ? null : pVar.b();
        p.c b12 = this.f20864c.b();
        kotlin.jvm.internal.s.f(b12, "localLifecycle.currentState");
        p.c cVar = p.c.DESTROYED;
        if (b12 != cVar && !this.f20865d) {
            x xVar = this.f20864c;
            if (this.f20867f && !z11) {
                b11 = cVar;
            } else if (b11 == null && b12 != (b11 = p.c.INITIALIZED)) {
                throw new AssertionError("Must have a parent lifecycle after attaching and until being destroyed.");
            }
            if (b11 == cVar) {
                this.f20865d = true;
                p pVar2 = this.f20866e;
                if (pVar2 != null) {
                    pVar2.c(this);
                }
                this.f20866e = null;
                View view = this.f20863b;
                if (view != null) {
                    this.f20863b = null;
                    view.removeOnAttachStateChangeListener(this);
                }
                p.c cVar2 = p.c.INITIALIZED;
                if (b12 == cVar2) {
                    cVar = cVar2;
                }
            } else {
                cVar = b11;
            }
            xVar.p(cVar);
            return;
        }
        this.f20863b = null;
    }

    @Override // androidx.lifecycle.s
    public void g(v source, p.b event) {
        kotlin.jvm.internal.s.g(source, "source");
        kotlin.jvm.internal.s.g(event, "event");
        b(this, false, 1, null);
    }

    @Override // androidx.lifecycle.v
    public p getLifecycle() {
        return this.f20864c;
    }

    @Override // qr.b
    public void j() {
        if (this.f20867f) {
            return;
        }
        this.f20867f = true;
        b(this, false, 1, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v11) {
        kotlin.jvm.internal.s.g(v11, "v");
        if (this.f20864c.b() == p.c.DESTROYED || this.f20865d) {
            return;
        }
        this.f20863b = v11;
        p pVar = this.f20866e;
        p invoke = this.f20862a.invoke(v11);
        if (invoke != null) {
            p pVar2 = invoke;
            this.f20866e = pVar2;
            if (pVar2 != pVar) {
                if (pVar != null) {
                    pVar.c(this);
                }
                p pVar3 = this.f20866e;
                if (pVar3 != null) {
                    pVar3.a(this);
                }
            }
            a(true);
            return;
        }
        throw new IllegalStateException("Expected to find either a ViewTreeLifecycleOwner in the view tree, or for the view's context to be a LifecycleOwner.".toString());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v11) {
        kotlin.jvm.internal.s.g(v11, "v");
        a(false);
    }

    public /* synthetic */ RealWorkflowLifecycleOwner(l lVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, (i11 & 2) != 0 ? true : z11);
    }
}