package av;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import kotlin.jvm.internal.s;
import lt.w2;
import mt.j;
import mt.n;
import mt.u;

/* loaded from: classes6.dex */
public final class n {
    public static final int a(cu.a aVar) {
        mt.j c11;
        Integer c12;
        s.g(aVar, "<this>");
        w2 g11 = aVar.g();
        int i11 = 0;
        if (g11 != null && (c11 = g11.c()) != null && (c12 = c11.c()) != null) {
            i11 = c12.intValue();
        }
        if (g(aVar)) {
            return c.battery_charging_color;
        }
        if (i11 <= 7) {
            return c.battery_level_critical_color;
        }
        if (i11 <= 20) {
            return c.battery_level_warning_color;
        }
        return c.battery_normal_color;
    }

    public static final String b(cu.a aVar, Context context) {
        s.g(aVar, "<this>");
        s.g(context, "context");
        w2 g11 = aVar.g();
        mt.n h11 = g11 == null ? null : g11.h();
        n.a e11 = h11 == null ? null : h11.e();
        if (e11 == null) {
            return null;
        }
        if (et.a.R(e11.c())) {
            return "%";
        }
        n.e f11 = h11.f();
        if (f11 == null) {
            return null;
        }
        if (et.a.R(f11.b())) {
            return context.getString(h.f6979a);
        }
        return context.getString(h.f6980b);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Integer c(cu.a r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.s.g(r4, r0)
            lt.w2 r0 = r4.g()
            r1 = 0
            if (r0 != 0) goto Le
            r0 = r1
            goto L12
        Le:
            mt.n r0 = r0.h()
        L12:
            if (r0 != 0) goto L16
            r2 = r1
            goto L1a
        L16:
            mt.n$a r2 = r0.e()
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            lt.w2 r4 = r4.g()
            if (r4 != 0) goto L25
            r4 = r1
            goto L29
        L25:
            mt.j r4 = r4.c()
        L29:
            if (r4 != 0) goto L2c
            return r1
        L2c:
            kt.u r2 = r2.c()
            boolean r2 = et.a.R(r2)
            if (r2 == 0) goto L48
            java.lang.Integer r4 = r4.R0()
            if (r4 != 0) goto L3e
        L3c:
            r4 = r1
            goto L8f
        L3e:
            int r4 = r4.intValue()
            double r2 = (double) r4
            java.lang.Double r4 = java.lang.Double.valueOf(r2)
            goto L8f
        L48:
            mt.n$d r2 = r0.g()
            if (r2 != 0) goto L4f
            return r1
        L4f:
            kt.u r2 = r2.b()
            boolean r2 = et.a.R(r2)
            if (r2 == 0) goto L5e
            java.lang.Float r4 = r4.g0()
            goto L62
        L5e:
            java.lang.Float r4 = r4.e()
        L62:
            if (r4 != 0) goto L66
            r4 = r1
            goto L6f
        L66:
            float r4 = r4.floatValue()
            double r2 = (double) r4
            java.lang.Double r4 = java.lang.Double.valueOf(r2)
        L6f:
            mt.n$e r0 = r0.f()
            if (r0 != 0) goto L76
            return r1
        L76:
            kt.u r0 = r0.b()
            boolean r0 = et.a.R(r0)
            if (r0 == 0) goto L8f
            if (r4 != 0) goto L83
            goto L3c
        L83:
            double r2 = r4.doubleValue()
            double r2 = et.a.N(r2)
            java.lang.Double r4 = java.lang.Double.valueOf(r2)
        L8f:
            if (r4 != 0) goto L92
            goto L9e
        L92:
            double r0 = r4.doubleValue()
            int r4 = j00.a.b(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: av.n.c(cu.a):java.lang.Integer");
    }

    public static final String d(cu.a aVar, Context context) {
        s.g(aVar, "<this>");
        s.g(context, "context");
        String f11 = aVar.f();
        if (!(f11.length() > 0)) {
            f11 = null;
        }
        if (f11 == null) {
            return null;
        }
        return context.getFilesDir().getAbsolutePath() + "/snapshots/" + aVar.f() + "_THREEQUARTER.png";
    }

    public static final int e(cu.a aVar) {
        u n11;
        s.g(aVar, "<this>");
        w2 g11 = aVar.g();
        u.b bVar = null;
        if (g11 != null && (n11 = g11.n()) != null) {
            bVar = n11.m();
        }
        if (bVar != null && !et.a.R(bVar.c())) {
            if (et.a.R(bVar.g())) {
                return e.product_modely_placeholder;
            }
            if (!et.a.R(bVar.b()) && !et.a.R(bVar.d()) && !et.a.R(bVar.e())) {
                if (!et.a.R(bVar.i()) && !et.a.R(bVar.f())) {
                    return e.product_model3_placeholder;
                }
                return e.product_modelx_placeholder;
            }
            return e.product_models_placeholder;
        }
        return e.product_model3_placeholder;
    }

    public static final String f(cu.a aVar, Context context) {
        mt.j c11;
        s.g(aVar, "<this>");
        s.g(context, "context");
        w2 g11 = aVar.g();
        Integer r02 = (g11 == null || (c11 = g11.c()) == null) ? null : c11.r0();
        if (r02 == null) {
            return null;
        }
        int intValue = r02.intValue();
        if (intValue > 1440) {
            return context.getString(h.f6984f);
        }
        if (intValue < 1) {
            return context.getString(h.f6983e);
        }
        return intValue > 60 ? context.getString(h.f6981c, Integer.valueOf(intValue / 60), Integer.valueOf(intValue % 60)) : context.getString(h.f6982d, Integer.valueOf(intValue));
    }

    public static final boolean g(cu.a aVar) {
        mt.j c11;
        s.g(aVar, "<this>");
        w2 g11 = aVar.g();
        j.f Y = (g11 == null || (c11 = g11.c()) == null) ? null : c11.Y();
        return mr.d.d(Y == null ? null : Y.c(), Y == null ? null : Y.b(), Y != null ? Y.g() : null) == 1;
    }

    public static final void h(View view, cu.a vehicle) {
        Number valueOf;
        mt.j c11;
        Integer c12;
        s.g(view, "<this>");
        s.g(vehicle, "vehicle");
        w2 g11 = vehicle.g();
        int i11 = 0;
        if (g11 != null && (c11 = g11.c()) != null && (c12 = c11.c()) != null) {
            i11 = c12.intValue();
        }
        view.setBackgroundTintList(ColorStateList.valueOf(view.getContext().getColor(a(vehicle))));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        float dimension = view.getResources().getDimension(d.dim_battery_background_width_inner);
        float f11 = i11 / 100.0f;
        if (i11 >= 10) {
            valueOf = Float.valueOf(Math.min(f11 * dimension, dimension));
        } else {
            valueOf = Double.valueOf(dimension * 0.1d);
        }
        layoutParams.width = valueOf.intValue();
        if (i11 == 100) {
            view.setBackgroundResource(e.shape_battery_rect_inner_full);
        } else {
            view.setBackgroundResource(e.shape_battery_rect_inner);
        }
        view.setLayoutParams(layoutParams);
    }
}