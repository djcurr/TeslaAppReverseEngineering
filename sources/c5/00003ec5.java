package com.ijzerenhein.sharedelement;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final g f17827a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17828b;

    /* renamed from: c  reason: collision with root package name */
    private f f17829c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17830d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17831e = false;

    /* renamed from: f  reason: collision with root package name */
    private j f17832f = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17833g = false;

    /* renamed from: h  reason: collision with root package name */
    private c f17834h = null;

    /* renamed from: i  reason: collision with root package name */
    private RectF f17835i = null;

    /* renamed from: j  reason: collision with root package name */
    private boolean f17836j = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(g gVar, String str) {
        this.f17827a = gVar;
        this.f17828b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF a() {
        RectF rectF = this.f17835i;
        if (rectF != null) {
            return rectF;
        }
        if (this.f17832f == null) {
            return null;
        }
        View k11 = this.f17829c.k();
        RectF rectF2 = new RectF(this.f17832f.f17793a);
        ViewParent parent = i().getParent();
        RectF rectF3 = new RectF();
        while (true) {
            if (parent == null || !(parent instanceof ViewGroup)) {
                break;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getClipChildren()) {
                j.i(viewGroup, rectF3);
                if (!rectF2.intersect(rectF3)) {
                    float f11 = rectF2.bottom;
                    float f12 = rectF3.top;
                    if (f11 < f12) {
                        rectF2.top = f12;
                        rectF2.bottom = rectF3.top;
                    }
                    float f13 = rectF2.top;
                    float f14 = rectF3.bottom;
                    if (f13 > f14) {
                        rectF2.top = f14;
                        rectF2.bottom = f14;
                    }
                    float f15 = rectF2.right;
                    float f16 = rectF3.left;
                    if (f15 < f16) {
                        rectF2.left = f16;
                        rectF2.right = rectF3.left;
                    }
                    float f17 = rectF2.left;
                    float f18 = rectF3.right;
                    if (f17 > f18) {
                        rectF2.left = f18;
                        rectF2.right = f18;
                    }
                }
            }
            if (parent == k11) {
                break;
            }
            parent = parent.getParent();
        }
        this.f17835i = rectF2;
        return rectF2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c b() {
        return this.f17834h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f17836j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f17828b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.f17833g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f17831e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f g() {
        return this.f17829c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j h() {
        return this.f17832f;
    }

    View i() {
        f fVar = this.f17829c;
        if (fVar != null) {
            return fVar.m();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(c cVar) {
        this.f17834h = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(boolean z11) {
        this.f17836j = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(boolean z11) {
        if (this.f17830d == z11) {
            return;
        }
        this.f17830d = z11;
        f fVar = this.f17829c;
        if (fVar == null) {
            return;
        }
        if (z11) {
            fVar.g();
        } else {
            fVar.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z11) {
        this.f17833g = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean z11) {
        this.f17831e = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(f fVar) {
        f fVar2 = this.f17829c;
        if (fVar2 == fVar) {
            if (fVar != null) {
                this.f17827a.c(fVar);
                return;
            }
            return;
        }
        if (fVar2 != null) {
            if (this.f17830d) {
                fVar2.n();
            }
            this.f17827a.c(this.f17829c);
        }
        this.f17829c = fVar;
        this.f17831e = fVar != null;
        this.f17832f = null;
        this.f17833g = fVar != null;
        this.f17834h = null;
        if (fVar == null || !this.f17830d) {
            return;
        }
        fVar.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(j jVar) {
        this.f17832f = jVar;
    }
}