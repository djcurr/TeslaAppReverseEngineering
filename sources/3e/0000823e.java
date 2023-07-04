package l3;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {
    private static a a(a aVar, int i11, int i12, boolean z11, int i13) {
        if (aVar != null) {
            return aVar;
        }
        if (z11) {
            return new a(i11, i13, i12);
        }
        return new a(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray k11 = i.k(resources, theme, attributeSet, j3.d.f33203z);
            float f11 = i.f(k11, xmlPullParser, "startX", j3.d.I, BitmapDescriptorFactory.HUE_RED);
            float f12 = i.f(k11, xmlPullParser, "startY", j3.d.J, BitmapDescriptorFactory.HUE_RED);
            float f13 = i.f(k11, xmlPullParser, "endX", j3.d.K, BitmapDescriptorFactory.HUE_RED);
            float f14 = i.f(k11, xmlPullParser, "endY", j3.d.L, BitmapDescriptorFactory.HUE_RED);
            float f15 = i.f(k11, xmlPullParser, "centerX", j3.d.D, BitmapDescriptorFactory.HUE_RED);
            float f16 = i.f(k11, xmlPullParser, "centerY", j3.d.E, BitmapDescriptorFactory.HUE_RED);
            int g11 = i.g(k11, xmlPullParser, "type", j3.d.C, 0);
            int b11 = i.b(k11, xmlPullParser, "startColor", j3.d.A, 0);
            boolean j11 = i.j(xmlPullParser, "centerColor");
            int b12 = i.b(k11, xmlPullParser, "centerColor", j3.d.H, 0);
            int b13 = i.b(k11, xmlPullParser, "endColor", j3.d.B, 0);
            int g12 = i.g(k11, xmlPullParser, "tileMode", j3.d.G, 0);
            float f17 = i.f(k11, xmlPullParser, "gradientRadius", j3.d.F, BitmapDescriptorFactory.HUE_RED);
            k11.recycle();
            a a11 = a(c(resources, xmlPullParser, attributeSet, theme), b11, b13, j11, b12);
            if (g11 != 1) {
                if (g11 != 2) {
                    return new LinearGradient(f11, f12, f13, f14, a11.f36540a, a11.f36541b, d(g12));
                }
                return new SweepGradient(f15, f16, a11.f36540a, a11.f36541b);
            } else if (f17 > BitmapDescriptorFactory.HUE_RED) {
                return new RadialGradient(f15, f16, f17, a11.f36540a, a11.f36541b, d(g12));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static l3.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = j3.d.M
            android.content.res.TypedArray r3 = l3.i.k(r9, r12, r11, r3)
            int r5 = j3.d.N
            boolean r6 = r3.hasValue(r5)
            int r7 = j3.d.O
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            l3.f$a r9 = new l3.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):l3.f$a");
    }

    private static Shader.TileMode d(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f36540a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f36541b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f36540a = new int[size];
            this.f36541b = new float[size];
            for (int i11 = 0; i11 < size; i11++) {
                this.f36540a[i11] = list.get(i11).intValue();
                this.f36541b[i11] = list2.get(i11).floatValue();
            }
        }

        a(int i11, int i12) {
            this.f36540a = new int[]{i11, i12};
            this.f36541b = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f};
        }

        a(int i11, int i12, int i13) {
            this.f36540a = new int[]{i11, i12, i13};
            this.f36541b = new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
        }
    }
}