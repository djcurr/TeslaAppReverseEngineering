package tk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fk.k;
import l3.h;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f52324a;

    /* renamed from: b  reason: collision with root package name */
    public final String f52325b;

    /* renamed from: c  reason: collision with root package name */
    public final int f52326c;

    /* renamed from: d  reason: collision with root package name */
    public final int f52327d;

    /* renamed from: e  reason: collision with root package name */
    public final float f52328e;

    /* renamed from: f  reason: collision with root package name */
    public final float f52329f;

    /* renamed from: g  reason: collision with root package name */
    public final float f52330g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f52331h;

    /* renamed from: i  reason: collision with root package name */
    public final float f52332i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f52333j;

    /* renamed from: k  reason: collision with root package name */
    private float f52334k;

    /* renamed from: l  reason: collision with root package name */
    private final int f52335l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f52336m = false;

    /* renamed from: n  reason: collision with root package name */
    private Typeface f52337n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends h.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f52338a;

        a(f fVar) {
            this.f52338a = fVar;
        }

        @Override // l3.h.d
        public void d(int i11) {
            d.this.f52336m = true;
            this.f52338a.a(i11);
        }

        @Override // l3.h.d
        public void e(Typeface typeface) {
            d dVar = d.this;
            dVar.f52337n = Typeface.create(typeface, dVar.f52326c);
            d.this.f52336m = true;
            this.f52338a.b(d.this.f52337n, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextPaint f52340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f52341b;

        b(TextPaint textPaint, f fVar) {
            this.f52340a = textPaint;
            this.f52341b = fVar;
        }

        @Override // tk.f
        public void a(int i11) {
            this.f52341b.a(i11);
        }

        @Override // tk.f
        public void b(Typeface typeface, boolean z11) {
            d.this.p(this.f52340a, typeface);
            this.f52341b.b(typeface, z11);
        }
    }

    public d(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, k.f26594m3);
        l(obtainStyledAttributes.getDimension(k.f26600n3, BitmapDescriptorFactory.HUE_RED));
        k(c.a(context, obtainStyledAttributes, k.f26618q3));
        c.a(context, obtainStyledAttributes, k.f26624r3);
        c.a(context, obtainStyledAttributes, k.f26630s3);
        this.f52326c = obtainStyledAttributes.getInt(k.f26612p3, 0);
        this.f52327d = obtainStyledAttributes.getInt(k.f26606o3, 1);
        int e11 = c.e(obtainStyledAttributes, k.f26666y3, k.f26660x3);
        this.f52335l = obtainStyledAttributes.getResourceId(e11, 0);
        this.f52325b = obtainStyledAttributes.getString(e11);
        obtainStyledAttributes.getBoolean(k.f26672z3, false);
        this.f52324a = c.a(context, obtainStyledAttributes, k.f26636t3);
        this.f52328e = obtainStyledAttributes.getFloat(k.f26642u3, BitmapDescriptorFactory.HUE_RED);
        this.f52329f = obtainStyledAttributes.getFloat(k.f26648v3, BitmapDescriptorFactory.HUE_RED);
        this.f52330g = obtainStyledAttributes.getFloat(k.f26654w3, BitmapDescriptorFactory.HUE_RED);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i11, k.C2);
            int i12 = k.D2;
            this.f52331h = obtainStyledAttributes2.hasValue(i12);
            this.f52332i = obtainStyledAttributes2.getFloat(i12, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f52331h = false;
        this.f52332i = BitmapDescriptorFactory.HUE_RED;
    }

    private void d() {
        String str;
        if (this.f52337n == null && (str = this.f52325b) != null) {
            this.f52337n = Typeface.create(str, this.f52326c);
        }
        if (this.f52337n == null) {
            int i11 = this.f52327d;
            if (i11 == 1) {
                this.f52337n = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f52337n = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f52337n = Typeface.DEFAULT;
            } else {
                this.f52337n = Typeface.MONOSPACE;
            }
            this.f52337n = Typeface.create(this.f52337n, this.f52326c);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i11 = this.f52335l;
        return (i11 != 0 ? h.c(context, i11) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f52337n;
    }

    public Typeface f(Context context) {
        if (this.f52336m) {
            return this.f52337n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g11 = h.g(context, this.f52335l);
                this.f52337n = g11;
                if (g11 != null) {
                    this.f52337n = Typeface.create(g11, this.f52326c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e11) {
                Log.d("TextAppearance", "Error loading font " + this.f52325b, e11);
            }
        }
        d();
        this.f52336m = true;
        return this.f52337n;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i11 = this.f52335l;
        if (i11 == 0) {
            this.f52336m = true;
        }
        if (this.f52336m) {
            fVar.b(this.f52337n, true);
            return;
        }
        try {
            h.i(context, i11, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f52336m = true;
            fVar.a(1);
        } catch (Exception e11) {
            Log.d("TextAppearance", "Error loading font " + this.f52325b, e11);
            this.f52336m = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f52333j;
    }

    public float j() {
        return this.f52334k;
    }

    public void k(ColorStateList colorStateList) {
        this.f52333j = colorStateList;
    }

    public void l(float f11) {
        this.f52334k = f11;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f52333j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f11 = this.f52330g;
        float f12 = this.f52328e;
        float f13 = this.f52329f;
        ColorStateList colorStateList2 = this.f52324a;
        textPaint.setShadowLayer(f11, f12, f13, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i11 = (~typeface.getStyle()) & this.f52326c;
        textPaint.setFakeBoldText((i11 & 1) != 0);
        textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : BitmapDescriptorFactory.HUE_RED);
        textPaint.setTextSize(this.f52334k);
        if (Build.VERSION.SDK_INT < 21 || !this.f52331h) {
            return;
        }
        textPaint.setLetterSpacing(this.f52332i);
    }
}