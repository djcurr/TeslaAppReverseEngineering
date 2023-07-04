package k2;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import k2.b;
import kotlin.jvm.internal.s;
import x1.c;

/* loaded from: classes.dex */
public final class f {
    public static final b.a a(Resources.Theme theme, Resources res, XmlResourceParser parser) {
        s.g(res, "res");
        s.g(parser, "parser");
        AttributeSet attrs = Xml.asAttributeSet(parser);
        y1.a aVar = new y1.a(parser, 0, 2, null);
        s.f(attrs, "attrs");
        c.a a11 = y1.c.a(aVar, res, theme, attrs);
        int i11 = 0;
        while (!y1.c.d(parser)) {
            i11 = y1.c.g(aVar, res, attrs, theme, a11, i11);
            parser.next();
        }
        return new b.a(a11.f(), aVar.a());
    }
}