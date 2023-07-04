package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import l3.h;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1934a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1935b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1936c;

    private u0(Context context, TypedArray typedArray) {
        this.f1934a = context;
        this.f1935b = typedArray;
    }

    public static u0 t(Context context, int i11, int[] iArr) {
        return new u0(context, context.obtainStyledAttributes(i11, iArr));
    }

    public static u0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static u0 v(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr, i11, i12));
    }

    public boolean a(int i11, boolean z11) {
        return this.f1935b.getBoolean(i11, z11);
    }

    public int b(int i11, int i12) {
        return this.f1935b.getColor(i11, i12);
    }

    public ColorStateList c(int i11) {
        int resourceId;
        ColorStateList c11;
        return (!this.f1935b.hasValue(i11) || (resourceId = this.f1935b.getResourceId(i11, 0)) == 0 || (c11 = h.a.c(this.f1934a, resourceId)) == null) ? this.f1935b.getColorStateList(i11) : c11;
    }

    public float d(int i11, float f11) {
        return this.f1935b.getDimension(i11, f11);
    }

    public int e(int i11, int i12) {
        return this.f1935b.getDimensionPixelOffset(i11, i12);
    }

    public int f(int i11, int i12) {
        return this.f1935b.getDimensionPixelSize(i11, i12);
    }

    public Drawable g(int i11) {
        int resourceId;
        if (this.f1935b.hasValue(i11) && (resourceId = this.f1935b.getResourceId(i11, 0)) != 0) {
            return h.a.d(this.f1934a, resourceId);
        }
        return this.f1935b.getDrawable(i11);
    }

    public Drawable h(int i11) {
        int resourceId;
        if (!this.f1935b.hasValue(i11) || (resourceId = this.f1935b.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return i.b().d(this.f1934a, resourceId, true);
    }

    public float i(int i11, float f11) {
        return this.f1935b.getFloat(i11, f11);
    }

    public Typeface j(int i11, int i12, h.d dVar) {
        int resourceId = this.f1935b.getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1936c == null) {
            this.f1936c = new TypedValue();
        }
        return l3.h.h(this.f1934a, resourceId, this.f1936c, i12, dVar);
    }

    public int k(int i11, int i12) {
        return this.f1935b.getInt(i11, i12);
    }

    public int l(int i11, int i12) {
        return this.f1935b.getInteger(i11, i12);
    }

    public int m(int i11, int i12) {
        return this.f1935b.getLayoutDimension(i11, i12);
    }

    public int n(int i11, int i12) {
        return this.f1935b.getResourceId(i11, i12);
    }

    public String o(int i11) {
        return this.f1935b.getString(i11);
    }

    public CharSequence p(int i11) {
        return this.f1935b.getText(i11);
    }

    public CharSequence[] q(int i11) {
        return this.f1935b.getTextArray(i11);
    }

    public TypedArray r() {
        return this.f1935b;
    }

    public boolean s(int i11) {
        return this.f1935b.hasValue(i11);
    }

    public void w() {
        this.f1935b.recycle();
    }
}