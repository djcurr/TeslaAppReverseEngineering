package k2;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.ui.platform.z;
import c1.i;
import k2.b;
import kotlin.jvm.internal.s;
import t1.h0;

/* loaded from: classes.dex */
public final class c {
    private static final h0 a(Resources resources, int i11) {
        return a.a(h0.f51444a, resources, i11);
    }

    private static final x1.c b(Resources.Theme theme, Resources resources, int i11, i iVar, int i12) {
        iVar.x(-995791636);
        b bVar = (b) iVar.A(z.h());
        b.C0635b c0635b = new b.C0635b(theme, i11);
        b.a b11 = bVar.b(c0635b);
        if (b11 == null) {
            XmlResourceParser xml = resources.getXml(i11);
            s.f(xml, "res.getXml(id)");
            if (s.c(y1.c.j(xml).getName(), "vector")) {
                b11 = f.a(theme, resources, xml);
                bVar.d(c0635b, b11);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
        }
        x1.c b12 = b11.b();
        iVar.N();
        return b12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r6 == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final w1.b c(int r9, c1.i r10, int r11) {
        /*
            r0 = -738265664(0xffffffffd3fef5c0, float:-2.19008939E12)
            r10.x(r0)
            c1.w0 r0 = androidx.compose.ui.platform.z.g()
            java.lang.Object r0 = r10.A(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r10.x(r2)
            java.lang.Object r2 = r10.y()
            c1.i$a r3 = c1.i.f8486a
            java.lang.Object r4 = r3.a()
            if (r2 != r4) goto L2e
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r10.p(r2)
        L2e:
            r10.N()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r4 = 1
            r1.getValue(r9, r2, r4)
            java.lang.CharSequence r2 = r2.string
            r5 = 0
            if (r2 != 0) goto L3e
        L3c:
            r4 = r5
            goto L48
        L3e:
            r6 = 2
            r7 = 0
            java.lang.String r8 = ".xml"
            boolean r6 = kotlin.text.m.Q(r2, r8, r5, r6, r7)
            if (r6 != r4) goto L3c
        L48:
            java.lang.String r6 = "res"
            if (r4 == 0) goto L70
            r2 = -738265321(0xffffffffd3fef717, float:-2.19013435E12)
            r10.x(r2)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            java.lang.String r2 = "context.theme"
            kotlin.jvm.internal.s.f(r0, r2)
            kotlin.jvm.internal.s.f(r1, r6)
            int r11 = r11 << 6
            r11 = r11 & 896(0x380, float:1.256E-42)
            r11 = r11 | 72
            x1.c r9 = b(r0, r1, r9, r10, r11)
            x1.r r9 = x1.s.b(r9, r10, r5)
            r10.N()
            goto Lb4
        L70:
            r11 = -738265196(0xffffffffd3fef794, float:-2.19015073E12)
            r10.x(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r0 = -3686552(0xffffffffffc7bf68, float:NaN)
            r10.x(r0)
            boolean r0 = r10.O(r2)
            boolean r11 = r10.O(r11)
            r11 = r11 | r0
            java.lang.Object r0 = r10.y()
            if (r11 != 0) goto L95
            java.lang.Object r11 = r3.a()
            if (r0 != r11) goto L9f
        L95:
            kotlin.jvm.internal.s.f(r1, r6)
            t1.h0 r0 = a(r1, r9)
            r10.p(r0)
        L9f:
            r10.N()
            r2 = r0
            t1.h0 r2 = (t1.h0) r2
            w1.a r9 = new w1.a
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r9
            r1.<init>(r2, r3, r5, r7, r8)
            r10.N()
        Lb4:
            r10.N()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.c(int, c1.i, int):w1.b");
    }
}