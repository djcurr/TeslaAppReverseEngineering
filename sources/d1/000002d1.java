package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f2010l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f2011m = new ConcurrentHashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f2012n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f2013a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2014b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f2015c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f2016d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f2017e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f2018f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f2019g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f2020h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f2021i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f2022j;

    /* renamed from: k  reason: collision with root package name */
    private final c f2023k;

    /* loaded from: classes.dex */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.y.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) y.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.y.a, androidx.appcompat.widget.y.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.y.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) y.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(TextView textView) {
        this.f2021i = textView;
        this.f2022j = textView.getContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            this.f2023k = new b();
        } else if (i11 >= 23) {
            this.f2023k = new a();
        } else {
            this.f2023k = new c();
        }
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = typedArray.getDimensionPixelSize(i11, -1);
            }
            this.f2018f = c(iArr);
            B();
        }
    }

    private boolean B() {
        int[] iArr = this.f2018f;
        int length = iArr.length;
        boolean z11 = length > 0;
        this.f2019g = z11;
        if (z11) {
            this.f2013a = 1;
            this.f2016d = iArr[0];
            this.f2017e = iArr[length - 1];
            this.f2015c = -1.0f;
        }
        return z11;
    }

    private boolean C(int i11, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2021i.getText();
        TransformationMethod transformationMethod = this.f2021i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f2021i)) != null) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f2021i.getMaxLines() : -1;
        q(i11);
        StaticLayout e11 = e(text, (Layout.Alignment) r(this.f2021i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e11.getLineCount() <= maxLines && e11.getLineEnd(e11.getLineCount() - 1) == text.length())) && ((float) e11.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f2021i instanceof j);
    }

    private void E(float f11, float f12, float f13) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f11 + "px) is less or equal to (0px)");
        } else if (f12 <= f11) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f12 + "px) is less or equal to minimum auto-size text size (" + f11 + "px)");
        } else if (f13 > BitmapDescriptorFactory.HUE_RED) {
            this.f2013a = 1;
            this.f2016d = f11;
            this.f2017e = f12;
            this.f2015c = f13;
            this.f2019g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f13 + "px) is less or equal to (0px)");
        }
    }

    private static <T> T a(Object obj, String str, T t11) {
        try {
            Field o11 = o(str);
            return o11 == null ? t11 : (T) o11.get(obj);
        } catch (IllegalAccessException e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e11);
            return t11;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            if (i11 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i11)) < 0) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr2[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f2013a = 0;
        this.f2016d = -1.0f;
        this.f2017e = -1.0f;
        this.f2015c = -1.0f;
        this.f2018f = new int[0];
        this.f2014b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i11, int i12) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f2020h, i11);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f2021i.getLineSpacingExtra(), this.f2021i.getLineSpacingMultiplier()).setIncludePad(this.f2021i.getIncludeFontPadding()).setBreakStrategy(this.f2021i.getBreakStrategy()).setHyphenationFrequency(this.f2021i.getHyphenationFrequency());
        if (i12 == -1) {
            i12 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i12);
        try {
            this.f2023k.a(obtain, this.f2021i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i11) {
        return new StaticLayout(charSequence, this.f2020h, i11, alignment, ((Float) a(this.f2021i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f2021i, "mSpacingAdd", Float.valueOf((float) BitmapDescriptorFactory.HUE_RED))).floatValue(), ((Boolean) a(this.f2021i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i11) {
        return new StaticLayout(charSequence, this.f2020h, i11, alignment, this.f2021i.getLineSpacingMultiplier(), this.f2021i.getLineSpacingExtra(), this.f2021i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int i11;
        int length = this.f2018f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i12 = 0;
        int i13 = 1;
        int i14 = length - 1;
        while (true) {
            int i15 = i13;
            int i16 = i12;
            i12 = i15;
            while (i12 <= i14) {
                i11 = (i12 + i14) / 2;
                if (C(this.f2018f[i11], rectF)) {
                    break;
                }
                i16 = i11 - 1;
                i14 = i16;
            }
            return this.f2018f[i16];
            i13 = i11 + 1;
        }
    }

    private static Field o(String str) {
        try {
            Field field = f2012n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f2012n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e11);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method method = f2011m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2011m.put(str, method);
            }
            return method;
        } catch (Exception e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e11);
            return null;
        }
    }

    static <T> T r(Object obj, String str, T t11) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e11);
            return t11;
        }
    }

    private void x(float f11) {
        if (f11 != this.f2021i.getPaint().getTextSize()) {
            this.f2021i.getPaint().setTextSize(f11);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f2021i.isInLayout() : false;
            if (this.f2021i.getLayout() != null) {
                this.f2014b = false;
                try {
                    Method p11 = p("nullLayouts");
                    if (p11 != null) {
                        p11.invoke(this.f2021i, new Object[0]);
                    }
                } catch (Exception e11) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e11);
                }
                if (!isInLayout) {
                    this.f2021i.requestLayout();
                } else {
                    this.f2021i.forceLayout();
                }
                this.f2021i.invalidate();
            }
        }
    }

    private boolean z() {
        if (D() && this.f2013a == 1) {
            if (!this.f2019g || this.f2018f.length == 0) {
                int floor = ((int) Math.floor((this.f2017e - this.f2016d) / this.f2015c)) + 1;
                int[] iArr = new int[floor];
                for (int i11 = 0; i11 < floor; i11++) {
                    iArr[i11] = Math.round(this.f2016d + (i11 * this.f2015c));
                }
                this.f2018f = c(iArr);
            }
            this.f2014b = true;
        } else {
            this.f2014b = false;
        }
        return this.f2014b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (s()) {
            if (this.f2014b) {
                if (this.f2021i.getMeasuredHeight() <= 0 || this.f2021i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2023k.b(this.f2021i) ? PKIFailureInfo.badCertTemplate : (this.f2021i.getMeasuredWidth() - this.f2021i.getTotalPaddingLeft()) - this.f2021i.getTotalPaddingRight();
                int height = (this.f2021i.getHeight() - this.f2021i.getCompoundPaddingBottom()) - this.f2021i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2010l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float i11 = i(rectF);
                    if (i11 != this.f2021i.getTextSize()) {
                        y(0, i11);
                    }
                }
            }
            this.f2014b = true;
        }
    }

    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 23) {
            return f(charSequence, alignment, i11, i12);
        }
        if (i13 >= 16) {
            return h(charSequence, alignment, i11);
        }
        return g(charSequence, alignment, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f2017e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return Math.round(this.f2016d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return Math.round(this.f2015c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] m() {
        return this.f2018f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f2013a;
    }

    void q(int i11) {
        TextPaint textPaint = this.f2020h;
        if (textPaint == null) {
            this.f2020h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2020h.set(this.f2021i.getPaint());
        this.f2020h.setTextSize(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        return D() && this.f2013a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(AttributeSet attributeSet, int i11) {
        int resourceId;
        Context context = this.f2022j;
        int[] iArr = g.j.f27195d0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        TextView textView = this.f2021i;
        androidx.core.view.a0.u0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i11, 0);
        int i12 = g.j.f27220i0;
        if (obtainStyledAttributes.hasValue(i12)) {
            this.f2013a = obtainStyledAttributes.getInt(i12, 0);
        }
        int i13 = g.j.f27215h0;
        float dimension = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = g.j.f27205f0;
        float dimension2 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = g.j.f27200e0;
        float dimension3 = obtainStyledAttributes.hasValue(i15) ? obtainStyledAttributes.getDimension(i15, -1.0f) : -1.0f;
        int i16 = g.j.f27210g0;
        if (obtainStyledAttributes.hasValue(i16) && (resourceId = obtainStyledAttributes.getResourceId(i16, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (D()) {
            if (this.f2013a == 1) {
                if (!this.f2019g) {
                    DisplayMetrics displayMetrics = this.f2022j.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    E(dimension2, dimension3, dimension);
                }
                z();
                return;
            }
            return;
        }
        this.f2013a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int i11, int i12, int i13, int i14) {
        if (D()) {
            DisplayMetrics displayMetrics = this.f2022j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i14, i11, displayMetrics), TypedValue.applyDimension(i14, i12, displayMetrics), TypedValue.applyDimension(i14, i13, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int[] iArr, int i11) {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i11 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2022j.getResources().getDisplayMetrics();
                    for (int i12 = 0; i12 < length; i12++) {
                        iArr2[i12] = Math.round(TypedValue.applyDimension(i11, iArr[i12], displayMetrics));
                    }
                }
                this.f2018f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2019g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(int i11) {
        if (D()) {
            if (i11 == 0) {
                d();
            } else if (i11 == 1) {
                DisplayMetrics displayMetrics = this.f2022j.getResources().getDisplayMetrics();
                E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (z()) {
                    b();
                }
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(int i11, float f11) {
        Resources resources;
        Context context = this.f2022j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        x(TypedValue.applyDimension(i11, f11, resources.getDisplayMetrics()));
    }
}