package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import fe.c;
import je.t;
import je.u;
import md.j;
import md.k;
import me.b;

/* loaded from: classes3.dex */
public class b<DH extends me.b> implements u {

    /* renamed from: d  reason: collision with root package name */
    private DH f11097d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f11094a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11095b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11096c = true;

    /* renamed from: e  reason: collision with root package name */
    private me.a f11098e = null;

    /* renamed from: f  reason: collision with root package name */
    private final fe.c f11099f = fe.c.a();

    public b(DH dh2) {
        if (dh2 != null) {
            p(dh2);
        }
    }

    private void c() {
        if (this.f11094a) {
            return;
        }
        this.f11099f.b(c.a.ON_ATTACH_CONTROLLER);
        this.f11094a = true;
        me.a aVar = this.f11098e;
        if (aVar == null || aVar.e() == null) {
            return;
        }
        this.f11098e.d();
    }

    private void d() {
        if (this.f11095b && this.f11096c) {
            c();
        } else {
            f();
        }
    }

    public static <DH extends me.b> b<DH> e(DH dh2, Context context) {
        b<DH> bVar = new b<>(dh2);
        bVar.n(context);
        return bVar;
    }

    private void f() {
        if (this.f11094a) {
            this.f11099f.b(c.a.ON_DETACH_CONTROLLER);
            this.f11094a = false;
            if (j()) {
                this.f11098e.a();
            }
        }
    }

    private void q(u uVar) {
        Drawable i11 = i();
        if (i11 instanceof t) {
            ((t) i11).h(uVar);
        }
    }

    @Override // je.u
    public void a() {
        if (this.f11094a) {
            return;
        }
        nd.a.E(fe.c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f11098e)), toString());
        this.f11095b = true;
        this.f11096c = true;
        d();
    }

    @Override // je.u
    public void b(boolean z11) {
        if (this.f11096c == z11) {
            return;
        }
        this.f11099f.b(z11 ? c.a.ON_DRAWABLE_SHOW : c.a.ON_DRAWABLE_HIDE);
        this.f11096c = z11;
        d();
    }

    public me.a g() {
        return this.f11098e;
    }

    public DH h() {
        return (DH) k.g(this.f11097d);
    }

    public Drawable i() {
        DH dh2 = this.f11097d;
        if (dh2 == null) {
            return null;
        }
        return dh2.d();
    }

    public boolean j() {
        me.a aVar = this.f11098e;
        return aVar != null && aVar.e() == this.f11097d;
    }

    public void k() {
        this.f11099f.b(c.a.ON_HOLDER_ATTACH);
        this.f11095b = true;
        d();
    }

    public void l() {
        this.f11099f.b(c.a.ON_HOLDER_DETACH);
        this.f11095b = false;
        d();
    }

    public boolean m(MotionEvent motionEvent) {
        if (j()) {
            return this.f11098e.b(motionEvent);
        }
        return false;
    }

    public void n(Context context) {
    }

    public void o(me.a aVar) {
        boolean z11 = this.f11094a;
        if (z11) {
            f();
        }
        if (j()) {
            this.f11099f.b(c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f11098e.f(null);
        }
        this.f11098e = aVar;
        if (aVar != null) {
            this.f11099f.b(c.a.ON_SET_CONTROLLER);
            this.f11098e.f(this.f11097d);
        } else {
            this.f11099f.b(c.a.ON_CLEAR_CONTROLLER);
        }
        if (z11) {
            c();
        }
    }

    public void p(DH dh2) {
        this.f11099f.b(c.a.ON_SET_HIERARCHY);
        boolean j11 = j();
        q(null);
        DH dh3 = (DH) k.g(dh2);
        this.f11097d = dh3;
        Drawable d11 = dh3.d();
        b(d11 == null || d11.isVisible());
        q(this);
        if (j11) {
            this.f11098e.f(dh2);
        }
    }

    public String toString() {
        return j.c(this).c("controllerAttached", this.f11094a).c("holderAttached", this.f11095b).c("drawableVisible", this.f11096c).b("events", this.f11099f.toString()).toString();
    }
}