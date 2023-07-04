package t1;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import t1.p;

/* loaded from: classes.dex */
public final class a {
    public static final BlendMode a(int i11) {
        p.a aVar = p.f51470a;
        return p.E(i11, aVar.a()) ? BlendMode.CLEAR : p.E(i11, aVar.x()) ? BlendMode.SRC : p.E(i11, aVar.g()) ? BlendMode.DST : p.E(i11, aVar.B()) ? BlendMode.SRC_OVER : p.E(i11, aVar.k()) ? BlendMode.DST_OVER : p.E(i11, aVar.z()) ? BlendMode.SRC_IN : p.E(i11, aVar.i()) ? BlendMode.DST_IN : p.E(i11, aVar.A()) ? BlendMode.SRC_OUT : p.E(i11, aVar.j()) ? BlendMode.DST_OUT : p.E(i11, aVar.y()) ? BlendMode.SRC_ATOP : p.E(i11, aVar.h()) ? BlendMode.DST_ATOP : p.E(i11, aVar.C()) ? BlendMode.XOR : p.E(i11, aVar.t()) ? BlendMode.PLUS : p.E(i11, aVar.q()) ? BlendMode.MODULATE : p.E(i11, aVar.v()) ? BlendMode.SCREEN : p.E(i11, aVar.s()) ? BlendMode.OVERLAY : p.E(i11, aVar.e()) ? BlendMode.DARKEN : p.E(i11, aVar.o()) ? BlendMode.LIGHTEN : p.E(i11, aVar.d()) ? BlendMode.COLOR_DODGE : p.E(i11, aVar.c()) ? BlendMode.COLOR_BURN : p.E(i11, aVar.m()) ? BlendMode.HARD_LIGHT : p.E(i11, aVar.w()) ? BlendMode.SOFT_LIGHT : p.E(i11, aVar.f()) ? BlendMode.DIFFERENCE : p.E(i11, aVar.l()) ? BlendMode.EXCLUSION : p.E(i11, aVar.r()) ? BlendMode.MULTIPLY : p.E(i11, aVar.n()) ? BlendMode.HUE : p.E(i11, aVar.u()) ? BlendMode.SATURATION : p.E(i11, aVar.b()) ? BlendMode.COLOR : p.E(i11, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i11) {
        p.a aVar = p.f51470a;
        if (p.E(i11, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (p.E(i11, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (p.E(i11, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (p.E(i11, aVar.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (p.E(i11, aVar.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (p.E(i11, aVar.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (p.E(i11, aVar.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (p.E(i11, aVar.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (p.E(i11, aVar.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (p.E(i11, aVar.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (p.E(i11, aVar.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (p.E(i11, aVar.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (p.E(i11, aVar.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (p.E(i11, aVar.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (p.E(i11, aVar.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (p.E(i11, aVar.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (p.E(i11, aVar.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (p.E(i11, aVar.q())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}