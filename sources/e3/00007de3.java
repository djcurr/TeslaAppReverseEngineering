package ke;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import je.g;
import je.j;
import je.k;
import je.l;
import je.m;
import je.o;
import je.p;
import je.q;
import ke.d;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Drawable f34609a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            k kVar = new k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b(kVar, dVar);
            return kVar;
        } else if (drawable instanceof NinePatchDrawable) {
            o oVar = new o((NinePatchDrawable) drawable);
            b(oVar, dVar);
            return oVar;
        } else if ((drawable instanceof ColorDrawable) && Build.VERSION.SDK_INT >= 11) {
            l a11 = l.a((ColorDrawable) drawable);
            b(a11, dVar);
            return a11;
        } else {
            nd.a.I("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    static void b(j jVar, d dVar) {
        jVar.c(dVar.i());
        jVar.s(dVar.d());
        jVar.b(dVar.b(), dVar.c());
        jVar.i(dVar.g());
        jVar.n(dVar.k());
        jVar.m(dVar.h());
    }

    static je.c c(je.c cVar) {
        while (true) {
            Drawable r11 = cVar.r();
            if (r11 == cVar || !(r11 instanceof je.c)) {
                break;
            }
            cVar = (je.c) r11;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable d(Drawable drawable, d dVar, Resources resources) {
        try {
            if (tf.b.d()) {
                tf.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && dVar != null && dVar.j() == d.a.BITMAP_ONLY) {
                if (drawable instanceof g) {
                    je.c c11 = c((g) drawable);
                    c11.g(a(c11.g(f34609a), dVar, resources));
                    return drawable;
                }
                Drawable a11 = a(drawable, dVar, resources);
                if (tf.b.d()) {
                    tf.b.b();
                }
                return a11;
            }
            if (tf.b.d()) {
                tf.b.b();
            }
            return drawable;
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable e(Drawable drawable, d dVar) {
        try {
            if (tf.b.d()) {
                tf.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && dVar != null && dVar.j() == d.a.OVERLAY_COLOR) {
                m mVar = new m(drawable);
                b(mVar, dVar);
                mVar.y(dVar.f());
                return mVar;
            }
            if (tf.b.d()) {
                tf.b.b();
            }
            return drawable;
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable f(Drawable drawable, q.c cVar) {
        return g(drawable, cVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable g(Drawable drawable, q.c cVar, PointF pointF) {
        if (tf.b.d()) {
            tf.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable != null && cVar != null) {
            p pVar = new p(drawable, cVar);
            if (pointF != null) {
                pVar.B(pointF);
            }
            if (tf.b.d()) {
                tf.b.b();
            }
            return pVar;
        }
        if (tf.b.d()) {
            tf.b.b();
        }
        return drawable;
    }

    static void h(j jVar) {
        jVar.c(false);
        jVar.j(BitmapDescriptorFactory.HUE_RED);
        jVar.b(0, BitmapDescriptorFactory.HUE_RED);
        jVar.i(BitmapDescriptorFactory.HUE_RED);
        jVar.n(false);
        jVar.m(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(je.c cVar, d dVar, Resources resources) {
        je.c c11 = c(cVar);
        Drawable r11 = c11.r();
        if (dVar != null && dVar.j() == d.a.BITMAP_ONLY) {
            if (r11 instanceof j) {
                b((j) r11, dVar);
            } else if (r11 != null) {
                c11.g(f34609a);
                c11.g(a(r11, dVar, resources));
            }
        } else if (r11 instanceof j) {
            h((j) r11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(je.c cVar, d dVar) {
        Drawable r11 = cVar.r();
        if (dVar != null && dVar.j() == d.a.OVERLAY_COLOR) {
            if (r11 instanceof m) {
                m mVar = (m) r11;
                b(mVar, dVar);
                mVar.y(dVar.f());
                return;
            }
            cVar.g(e(cVar.g(f34609a), dVar));
        } else if (r11 instanceof m) {
            Drawable drawable = f34609a;
            cVar.g(((m) r11).v(drawable));
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p k(je.c cVar, q.c cVar2) {
        Drawable f11 = f(cVar.g(f34609a), cVar2);
        cVar.g(f11);
        md.k.h(f11, "Parent has no child drawable!");
        return (p) f11;
    }
}