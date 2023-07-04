package g6;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Xml;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import kotlin.jvm.internal.s;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class c {
    public static final Drawable a(Context getDrawableCompat, int i11) {
        s.g(getDrawableCompat, "$this$getDrawableCompat");
        Drawable d11 = h.a.d(getDrawableCompat, i11);
        if (d11 != null) {
            return d11;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i11).toString());
    }

    public static final Drawable b(Resources getDrawableCompat, int i11, Resources.Theme theme) {
        s.g(getDrawableCompat, "$this$getDrawableCompat");
        Drawable f11 = l3.h.f(getDrawableCompat, i11, theme);
        if (f11 != null) {
            return f11;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i11).toString());
    }

    public static final p c(Context context) {
        while (!(context instanceof v)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((v) context).getLifecycle();
    }

    public static final Drawable d(Context getXmlDrawableCompat, Resources resources, int i11) {
        String name;
        s.g(getXmlDrawableCompat, "$this$getXmlDrawableCompat");
        s.g(resources, "resources");
        XmlResourceParser xml = resources.getXml(i11);
        s.f(xml, "resources.getXml(resId)");
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            if (Build.VERSION.SDK_INT < 24 && (name = xml.getName()) != null) {
                int hashCode = name.hashCode();
                if (hashCode != -820387517) {
                    if (hashCode == 2118620333 && name.equals("animated-vector")) {
                        androidx.vectordrawable.graphics.drawable.c a11 = androidx.vectordrawable.graphics.drawable.c.a(getXmlDrawableCompat, resources, xml, Xml.asAttributeSet(xml), getXmlDrawableCompat.getTheme());
                        s.f(a11, "AnimatedVectorDrawableCo…es, parser, attrs, theme)");
                        return a11;
                    }
                } else if (name.equals("vector")) {
                    androidx.vectordrawable.graphics.drawable.i c11 = androidx.vectordrawable.graphics.drawable.i.c(resources, xml, Xml.asAttributeSet(xml), getXmlDrawableCompat.getTheme());
                    s.f(c11, "VectorDrawableCompat.cre…es, parser, attrs, theme)");
                    return c11;
                }
            }
            return b(resources, i11, getXmlDrawableCompat.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }
}