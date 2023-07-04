package y1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import l3.d;
import l3.i;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParser f58936a;

    /* renamed from: b  reason: collision with root package name */
    private int f58937b;

    public a(XmlPullParser xmlParser, int i11) {
        s.g(xmlParser, "xmlParser");
        this.f58936a = xmlParser;
        this.f58937b = i11;
    }

    private final void l(int i11) {
        this.f58937b = i11 | this.f58937b;
    }

    public final int a() {
        return this.f58937b;
    }

    public final float b(TypedArray typedArray, int i11, float f11) {
        s.g(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i11, f11);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float c(TypedArray typedArray, int i11, float f11) {
        s.g(typedArray, "typedArray");
        float f12 = typedArray.getFloat(i11, f11);
        l(typedArray.getChangingConfigurations());
        return f12;
    }

    public final int d(TypedArray typedArray, int i11, int i12) {
        s.g(typedArray, "typedArray");
        int i13 = typedArray.getInt(i11, i12);
        l(typedArray.getChangingConfigurations());
        return i13;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String attrName, int i11) {
        s.g(typedArray, "typedArray");
        s.g(attrName, "attrName");
        ColorStateList c11 = i.c(typedArray, j(), theme, attrName, i11);
        l(typedArray.getChangingConfigurations());
        return c11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(this.f58936a, aVar.f58936a) && this.f58937b == aVar.f58937b;
        }
        return false;
    }

    public final d f(TypedArray typedArray, Resources.Theme theme, String attrName, int i11, int i12) {
        s.g(typedArray, "typedArray");
        s.g(attrName, "attrName");
        d result = i.e(typedArray, j(), theme, attrName, i11, i12);
        l(typedArray.getChangingConfigurations());
        s.f(result, "result");
        return result;
    }

    public final float g(TypedArray typedArray, String attrName, int i11, float f11) {
        s.g(typedArray, "typedArray");
        s.g(attrName, "attrName");
        float f12 = i.f(typedArray, j(), attrName, i11, f11);
        l(typedArray.getChangingConfigurations());
        return f12;
    }

    public final int h(TypedArray typedArray, String attrName, int i11, int i12) {
        s.g(typedArray, "typedArray");
        s.g(attrName, "attrName");
        int g11 = i.g(typedArray, j(), attrName, i11, i12);
        l(typedArray.getChangingConfigurations());
        return g11;
    }

    public int hashCode() {
        return (this.f58936a.hashCode() * 31) + Integer.hashCode(this.f58937b);
    }

    public final String i(TypedArray typedArray, int i11) {
        s.g(typedArray, "typedArray");
        String string = typedArray.getString(i11);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.f58936a;
    }

    public final TypedArray k(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        s.g(res, "res");
        s.g(set, "set");
        s.g(attrs, "attrs");
        TypedArray k11 = i.k(res, theme, set, attrs);
        s.f(k11, "obtainAttributes(\n      …          attrs\n        )");
        l(k11.getChangingConfigurations());
        return k11;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f58936a + ", config=" + this.f58937b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i12 & 2) != 0 ? 0 : i11);
    }
}