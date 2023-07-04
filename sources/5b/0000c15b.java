package y1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.util.List;
import kotlin.jvm.internal.s;
import l3.d;
import l3.i;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t1.a0;
import t1.c0;
import t1.e1;
import t1.f1;
import t1.g1;
import t1.p;
import t1.s0;
import t1.t;
import x1.c;
import x1.f;
import x2.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f58964a = 0;

    public static final c.a a(a aVar, Resources res, Resources.Theme theme, AttributeSet attrs) {
        long f11;
        int z11;
        s.g(aVar, "<this>");
        s.g(res, "res");
        s.g(attrs, "attrs");
        b bVar = b.f58938a;
        TypedArray k11 = aVar.k(res, theme, attrs, bVar.E());
        float g11 = aVar.g(k11, "viewportWidth", bVar.G(), BitmapDescriptorFactory.HUE_RED);
        float g12 = aVar.g(k11, "viewportHeight", bVar.F(), BitmapDescriptorFactory.HUE_RED);
        if (g11 > BitmapDescriptorFactory.HUE_RED) {
            if (g12 > BitmapDescriptorFactory.HUE_RED) {
                float b11 = aVar.b(k11, bVar.H(), BitmapDescriptorFactory.HUE_RED);
                float b12 = aVar.b(k11, bVar.m(), BitmapDescriptorFactory.HUE_RED);
                if (k11.hasValue(bVar.C())) {
                    TypedValue typedValue = new TypedValue();
                    k11.getValue(bVar.C(), typedValue);
                    if (typedValue.type == 2) {
                        f11 = a0.f51365b.f();
                    } else {
                        ColorStateList e11 = aVar.e(k11, theme, "tint", bVar.C());
                        if (e11 != null) {
                            f11 = c0.b(e11.getDefaultColor());
                        } else {
                            f11 = a0.f51365b.f();
                        }
                    }
                } else {
                    f11 = a0.f51365b.f();
                }
                long j11 = f11;
                int d11 = aVar.d(k11, bVar.D(), -1);
                if (d11 == -1) {
                    z11 = p.f51470a.z();
                } else if (d11 == 3) {
                    z11 = p.f51470a.B();
                } else if (d11 == 5) {
                    z11 = p.f51470a.z();
                } else if (d11 != 9) {
                    switch (d11) {
                        case 14:
                            z11 = p.f51470a.q();
                            break;
                        case 15:
                            z11 = p.f51470a.v();
                            break;
                        case 16:
                            z11 = p.f51470a.t();
                            break;
                        default:
                            z11 = p.f51470a.z();
                            break;
                    }
                } else {
                    z11 = p.f51470a.y();
                }
                int i11 = z11;
                float f12 = g.f(b11 / res.getDisplayMetrics().density);
                float f13 = g.f(b12 / res.getDisplayMetrics().density);
                k11.recycle();
                return new c.a(null, f12, f13, g11, g12, j11, i11, 1, null);
            }
            throw new XmlPullParserException(s.p(k11.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
        }
        throw new XmlPullParserException(s.p(k11.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
    }

    private static final int b(int i11, int i12) {
        if (i11 != 0) {
            if (i11 != 1) {
                return i11 != 2 ? i12 : f1.f51429b.c();
            }
            return f1.f51429b.b();
        }
        return f1.f51429b.a();
    }

    private static final int c(int i11, int i12) {
        if (i11 != 0) {
            if (i11 != 1) {
                return i11 != 2 ? i12 : g1.f51434b.a();
            }
            return g1.f51434b.c();
        }
        return g1.f51434b.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        s.g(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    private static final t1.s e(d dVar) {
        if (dVar.l()) {
            Shader f11 = dVar.f();
            if (f11 != null) {
                return t.a(f11);
            }
            return new e1(c0.b(dVar.e()), null);
        }
        return null;
    }

    public static final void f(a aVar, Resources res, Resources.Theme theme, AttributeSet attrs, c.a builder) {
        s.g(aVar, "<this>");
        s.g(res, "res");
        s.g(attrs, "attrs");
        s.g(builder, "builder");
        b bVar = b.f58938a;
        TypedArray k11 = aVar.k(res, theme, attrs, bVar.a());
        String i11 = aVar.i(k11, bVar.b());
        if (i11 == null) {
            i11 = "";
        }
        List<f> a11 = x1.p.a(aVar.i(k11, bVar.c()));
        k11.recycle();
        c.a.b(builder, i11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a11, 254, null);
    }

    public static final int g(a aVar, Resources res, AttributeSet attrs, Resources.Theme theme, c.a builder, int i11) {
        s.g(aVar, "<this>");
        s.g(res, "res");
        s.g(attrs, "attrs");
        s.g(builder, "builder");
        int eventType = aVar.j().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && s.c(Kind.GROUP, aVar.j().getName())) {
                int i12 = i11 + 1;
                int i13 = 0;
                while (i13 < i12) {
                    i13++;
                    builder.g();
                }
                return 0;
            }
            return i11;
        }
        String name = aVar.j().getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode == -1649314686) {
                if (name.equals("clip-path")) {
                    f(aVar, res, theme, attrs, builder);
                    return i11 + 1;
                }
                return i11;
            } else if (hashCode == 3433509) {
                if (name.equals("path")) {
                    i(aVar, res, theme, attrs, builder);
                    return i11;
                }
                return i11;
            } else if (hashCode == 98629247 && name.equals(Kind.GROUP)) {
                h(aVar, res, theme, attrs, builder);
                return i11;
            } else {
                return i11;
            }
        }
        return i11;
    }

    public static final void h(a aVar, Resources res, Resources.Theme theme, AttributeSet attrs, c.a builder) {
        s.g(aVar, "<this>");
        s.g(res, "res");
        s.g(attrs, "attrs");
        s.g(builder, "builder");
        b bVar = b.f58938a;
        TypedArray k11 = aVar.k(res, theme, attrs, bVar.d());
        float g11 = aVar.g(k11, "rotation", bVar.h(), BitmapDescriptorFactory.HUE_RED);
        float c11 = aVar.c(k11, bVar.f(), BitmapDescriptorFactory.HUE_RED);
        float c12 = aVar.c(k11, bVar.g(), BitmapDescriptorFactory.HUE_RED);
        float g12 = aVar.g(k11, "scaleX", bVar.i(), 1.0f);
        float g13 = aVar.g(k11, "scaleY", bVar.j(), 1.0f);
        float g14 = aVar.g(k11, "translateX", bVar.k(), BitmapDescriptorFactory.HUE_RED);
        float g15 = aVar.g(k11, "translateY", bVar.l(), BitmapDescriptorFactory.HUE_RED);
        String i11 = aVar.i(k11, bVar.e());
        if (i11 == null) {
            i11 = "";
        }
        k11.recycle();
        builder.a(i11, g11, c11, c12, g12, g13, g14, g15, x1.p.e());
    }

    public static final void i(a aVar, Resources res, Resources.Theme theme, AttributeSet attrs, c.a builder) {
        s.g(aVar, "<this>");
        s.g(res, "res");
        s.g(attrs, "attrs");
        s.g(builder, "builder");
        b bVar = b.f58938a;
        TypedArray k11 = aVar.k(res, theme, attrs, bVar.n());
        if (i.j(aVar.j(), "pathData")) {
            String i11 = aVar.i(k11, bVar.q());
            if (i11 == null) {
                i11 = "";
            }
            String str = i11;
            List<f> a11 = x1.p.a(aVar.i(k11, bVar.r()));
            d f11 = aVar.f(k11, theme, "fillColor", bVar.p(), 0);
            float g11 = aVar.g(k11, "fillAlpha", bVar.o(), 1.0f);
            int b11 = b(aVar.h(k11, "strokeLineCap", bVar.u(), -1), f1.f51429b.a());
            int c11 = c(aVar.h(k11, "strokeLineJoin", bVar.v(), -1), g1.f51434b.a());
            float g12 = aVar.g(k11, "strokeMiterLimit", bVar.w(), 1.0f);
            d f12 = aVar.f(k11, theme, "strokeColor", bVar.t(), 0);
            float g13 = aVar.g(k11, "strokeAlpha", bVar.s(), 1.0f);
            float g14 = aVar.g(k11, "strokeWidth", bVar.x(), 1.0f);
            float g15 = aVar.g(k11, "trimPathEnd", bVar.y(), 1.0f);
            float g16 = aVar.g(k11, "trimPathOffset", bVar.A(), BitmapDescriptorFactory.HUE_RED);
            float g17 = aVar.g(k11, "trimPathStart", bVar.B(), BitmapDescriptorFactory.HUE_RED);
            int h11 = aVar.h(k11, "fillType", bVar.z(), f58964a);
            k11.recycle();
            t1.s e11 = e(f11);
            t1.s e12 = e(f12);
            s0.a aVar2 = s0.f51503b;
            builder.c(a11, h11 == 0 ? aVar2.b() : aVar2.a(), str, e11, g11, e12, g13, g14, b11, c11, g12, g17, g15, g16);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) {
        s.g(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}