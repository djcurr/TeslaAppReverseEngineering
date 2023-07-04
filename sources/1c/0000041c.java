package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements e {
    private f p(d dVar) {
        return (f) dVar.e();
    }

    @Override // androidx.cardview.widget.e
    public void a(d dVar, float f11) {
        p(dVar).h(f11);
    }

    @Override // androidx.cardview.widget.e
    public float b(d dVar) {
        return p(dVar).d();
    }

    @Override // androidx.cardview.widget.e
    public void c(d dVar, float f11) {
        dVar.h().setElevation(f11);
    }

    @Override // androidx.cardview.widget.e
    public float d(d dVar) {
        return p(dVar).c();
    }

    @Override // androidx.cardview.widget.e
    public ColorStateList e(d dVar) {
        return p(dVar).b();
    }

    @Override // androidx.cardview.widget.e
    public float f(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void g(d dVar) {
        o(dVar, d(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void h(d dVar, Context context, ColorStateList colorStateList, float f11, float f12, float f13) {
        dVar.c(new f(colorStateList, f11));
        View h11 = dVar.h();
        h11.setClipToOutline(true);
        h11.setElevation(f12);
        o(dVar, f13);
    }

    @Override // androidx.cardview.widget.e
    public float i(d dVar) {
        return dVar.h().getElevation();
    }

    @Override // androidx.cardview.widget.e
    public void j(d dVar) {
        o(dVar, d(dVar));
    }

    @Override // androidx.cardview.widget.e
    public void k(d dVar) {
        if (!dVar.d()) {
            dVar.b(0, 0, 0, 0);
            return;
        }
        float d11 = d(dVar);
        float b11 = b(dVar);
        int ceil = (int) Math.ceil(g.c(d11, b11, dVar.g()));
        int ceil2 = (int) Math.ceil(g.d(d11, b11, dVar.g()));
        dVar.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.e
    public void l() {
    }

    @Override // androidx.cardview.widget.e
    public float m(d dVar) {
        return b(dVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.e
    public void n(d dVar, ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.e
    public void o(d dVar, float f11) {
        p(dVar).g(f11, dVar.d(), dVar.g());
        k(dVar);
    }
}