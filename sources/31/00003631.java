package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Constructor;

/* loaded from: classes3.dex */
final class g {

    /* renamed from: n  reason: collision with root package name */
    static final int f15438n;

    /* renamed from: o  reason: collision with root package name */
    private static boolean f15439o;

    /* renamed from: p  reason: collision with root package name */
    private static Constructor<StaticLayout> f15440p;

    /* renamed from: q  reason: collision with root package name */
    private static Object f15441q;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f15442a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f15443b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15444c;

    /* renamed from: e  reason: collision with root package name */
    private int f15446e;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15453l;

    /* renamed from: d  reason: collision with root package name */
    private int f15445d = 0;

    /* renamed from: f  reason: collision with root package name */
    private Layout.Alignment f15447f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g  reason: collision with root package name */
    private int f15448g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private float f15449h = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: i  reason: collision with root package name */
    private float f15450i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    private int f15451j = f15438n;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15452k = true;

    /* renamed from: m  reason: collision with root package name */
    private TextUtils.TruncateAt f15454m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends Exception {
        a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    static {
        f15438n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private g(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f15442a = charSequence;
        this.f15443b = textPaint;
        this.f15444c = i11;
        this.f15446e = charSequence.length();
    }

    private void b() {
        Class<?> cls;
        if (f15439o) {
            return;
        }
        try {
            boolean z11 = this.f15453l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f15441q = z11 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = g.class.getClassLoader();
                String str = this.f15453l ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f15441q = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f15440p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f15439o = true;
        } catch (Exception e11) {
            throw new a(e11);
        }
    }

    public static g c(CharSequence charSequence, TextPaint textPaint, int i11) {
        return new g(charSequence, textPaint, i11);
    }

    public StaticLayout a() {
        if (this.f15442a == null) {
            this.f15442a = "";
        }
        int max = Math.max(0, this.f15444c);
        CharSequence charSequence = this.f15442a;
        if (this.f15448g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f15443b, max, this.f15454m);
        }
        int min = Math.min(charSequence.length(), this.f15446e);
        this.f15446e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f15453l && this.f15448g == 1) {
                this.f15447f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f15445d, min, this.f15443b, max);
            obtain.setAlignment(this.f15447f);
            obtain.setIncludePad(this.f15452k);
            obtain.setTextDirection(this.f15453l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f15454m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f15448g);
            float f11 = this.f15449h;
            if (f11 != BitmapDescriptorFactory.HUE_RED || this.f15450i != 1.0f) {
                obtain.setLineSpacing(f11, this.f15450i);
            }
            if (this.f15448g > 1) {
                obtain.setHyphenationFrequency(this.f15451j);
            }
            return obtain.build();
        }
        b();
        try {
            return (StaticLayout) ((Constructor) v3.h.f(f15440p)).newInstance(charSequence, Integer.valueOf(this.f15445d), Integer.valueOf(this.f15446e), this.f15443b, Integer.valueOf(max), this.f15447f, v3.h.f(f15441q), Float.valueOf(1.0f), Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Boolean.valueOf(this.f15452k), null, Integer.valueOf(max), Integer.valueOf(this.f15448g));
        } catch (Exception e11) {
            throw new a(e11);
        }
    }

    public g d(Layout.Alignment alignment) {
        this.f15447f = alignment;
        return this;
    }

    public g e(TextUtils.TruncateAt truncateAt) {
        this.f15454m = truncateAt;
        return this;
    }

    public g f(int i11) {
        this.f15451j = i11;
        return this;
    }

    public g g(boolean z11) {
        this.f15452k = z11;
        return this;
    }

    public g h(boolean z11) {
        this.f15453l = z11;
        return this;
    }

    public g i(float f11, float f12) {
        this.f15449h = f11;
        this.f15450i = f12;
        return this;
    }

    public g j(int i11) {
        this.f15448g = i11;
        return this;
    }
}