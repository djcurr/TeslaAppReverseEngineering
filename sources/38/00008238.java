package l3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final Shader f36526a;

    /* renamed from: b */
    private final ColorStateList f36527b;

    /* renamed from: c */
    private int f36528c;

    private d(Shader shader, ColorStateList colorStateList, int i11) {
        this.f36526a = shader;
        this.f36527b = colorStateList;
        this.f36528c = i11;
    }

    private static d a(Resources resources, int i11, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i11);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(f.b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(c.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static d b(int i11) {
        return new d(null, null, i11);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i11, Resources.Theme theme) {
        try {
            return a(resources, i11, theme);
        } catch (Exception e11) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e11);
            return null;
        }
    }

    public int e() {
        return this.f36528c;
    }

    public Shader f() {
        return this.f36526a;
    }

    public boolean h() {
        return this.f36526a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f36526a == null && (colorStateList = this.f36527b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f36527b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f36528c) {
                this.f36528c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i11) {
        this.f36528c = i11;
    }

    public boolean l() {
        return h() || this.f36528c != 0;
    }
}