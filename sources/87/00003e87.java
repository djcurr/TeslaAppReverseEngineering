package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e0 extends r0 {

    /* renamed from: n  reason: collision with root package name */
    private Path f17574n;

    /* renamed from: o  reason: collision with root package name */
    String f17575o;

    /* renamed from: p  reason: collision with root package name */
    private f0 f17576p;

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList<String> f17577q;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList<Matrix> f17578t;

    /* renamed from: w  reason: collision with root package name */
    private final AssetManager f17579w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17580a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f17581b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f17582c;

        static {
            int[] iArr = new int[g0.values().length];
            f17582c = iArr;
            try {
                iArr[g0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17582c[g0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17582c[g0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17582c[g0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17582c[g0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17582c[g0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17582c[g0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17582c[g0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17582c[g0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17582c[g0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17582c[g0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17582c[g0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17582c[g0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17582c[g0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17582c[g0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17582c[g0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[m0.values().length];
            f17581b = iArr2;
            try {
                iArr2[m0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17581b[m0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[k0.values().length];
            f17580a = iArr3;
            try {
                iArr3[k0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f17580a[k0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f17580a[k0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public e0(ReactContext reactContext) {
        super(reactContext);
        this.f17577q = new ArrayList<>();
        this.f17578t = new ArrayList<>();
        this.f17579w = this.mContext.getResources().getAssets();
    }

    public static String A(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i11 = 0; i11 < runCount; i11++) {
            bArr[i11] = (byte) bidi.getRunLevel(i11);
            numArr[i11] = Integer.valueOf(i11);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < runCount; i12++) {
            int intValue = numArr[i12].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb2.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    private void s(Paint paint, h hVar) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            double d11 = hVar.f17605n;
            paint.setLetterSpacing((float) (d11 / (hVar.f17592a * this.mScale)));
            if (d11 == 0.0d && hVar.f17600i == i0.normal) {
                paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + hVar.f17598g);
            } else {
                paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + hVar.f17598g);
            }
            if (i11 >= 26) {
                paint.setFontVariationSettings("'wght' " + hVar.f17597f + hVar.f17599h);
            }
        }
    }

    private void t(Paint paint, h hVar) {
        int i11 = 0;
        boolean z11 = hVar.f17596e == j0.Bold || hVar.f17597f >= 550;
        boolean z12 = hVar.f17594c == h0.italic;
        if (z11 && z12) {
            i11 = 3;
        } else if (z11) {
            i11 = 1;
        } else if (z12) {
            i11 = 2;
        }
        Typeface typeface = null;
        int i12 = hVar.f17597f;
        String str = hVar.f17593b;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                Typeface.Builder builder = new Typeface.Builder(this.f17579w, str2);
                builder.setFontVariationSettings("'wght' " + i12 + hVar.f17599h);
                builder.setWeight(i12);
                builder.setItalic(z12);
                typeface = builder.build();
                if (typeface == null) {
                    Typeface.Builder builder2 = new Typeface.Builder(this.f17579w, str3);
                    builder2.setFontVariationSettings("'wght' " + i12 + hVar.f17599h);
                    builder2.setWeight(i12);
                    builder2.setItalic(z12);
                    typeface = builder2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f17579w, str2), i11);
                    } catch (Exception unused) {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f17579w, str3), i11);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = com.facebook.react.views.text.j.b().c(str, i11, this.f17579w);
            } catch (Exception unused3) {
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            typeface = Typeface.create(typeface, i12, z12);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (hVar.f17592a * this.mScale));
        if (i13 >= 21) {
            paint.setLetterSpacing(BitmapDescriptorFactory.HUE_RED);
        }
    }

    private void u(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        j h11 = h();
        j();
        h b11 = h11.b();
        TextPaint textPaint = new TextPaint(paint);
        t(textPaint, b11);
        s(textPaint, b11);
        double c11 = h11.c();
        int i11 = a.f17580a[b11.f17601j.ordinal()];
        if (i11 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i11 != 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout x11 = x(textPaint, alignment, true, new SpannableString(this.f17575o), (int) x.a(this.f17688c, canvas.getWidth(), 0.0d, this.mScale, c11));
        int lineAscent = x11.getLineAscent(0);
        i();
        canvas.save();
        canvas.translate((float) h11.l(0.0d), (float) (h11.m() + lineAscent));
        x11.draw(canvas);
        canvas.restore();
    }

    private double v(SVGLength sVGLength, double d11, double d12) {
        return x.a(sVGLength, d11, 0.0d, this.mScale, d12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Path w(java.lang.String r69, android.graphics.Paint r70, android.graphics.Canvas r71) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.e0.w(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    private StaticLayout x(TextPaint textPaint, Layout.Alignment alignment, boolean z11, SpannableString spannableString, int i11) {
        if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(spannableString, textPaint, i11, alignment, 1.0f, BitmapDescriptorFactory.HUE_RED, z11);
        }
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i11).setAlignment(alignment).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(z11).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    private double y(k0 k0Var, double d11) {
        int i11 = a.f17580a[k0Var.ordinal()];
        if (i11 != 2) {
            if (i11 != 3) {
                return 0.0d;
            }
            return -d11;
        }
        return (-d11) / 2.0d;
    }

    private void z() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == f0.class) {
                this.f17576p = (f0) parent;
                return;
            } else if (!(parent instanceof r0)) {
                return;
            }
        }
    }

    @Override // com.horcrux.svg.r0, com.horcrux.svg.VirtualView
    void clearCache() {
        this.f17574n = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.r0, com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        if (this.f17575o != null) {
            SVGLength sVGLength = this.f17688c;
            if (sVGLength != null && sVGLength.f17527a != 0.0d) {
                if (setupFillPaint(paint, this.fillOpacity * f11)) {
                    u(canvas, paint);
                }
                if (setupStrokePaint(paint, f11 * this.strokeOpacity)) {
                    u(canvas, paint);
                    return;
                }
                return;
            }
            int size = this.f17577q.size();
            if (size > 0) {
                t(paint, h().b());
                for (int i11 = 0; i11 < size; i11++) {
                    canvas.save();
                    canvas.concat(this.f17578t.get(i11));
                    canvas.drawText(this.f17577q.get(i11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                    canvas.restore();
                }
            }
            d(canvas, paint, f11);
            return;
        }
        clip(canvas, paint);
        c(canvas, paint, f11);
    }

    @Override // com.horcrux.svg.r0, com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f17574n;
        if (path != null) {
            return path;
        }
        if (this.f17575o == null) {
            Path o11 = o(canvas, paint);
            this.f17574n = o11;
            return o11;
        }
        z();
        j();
        this.f17574n = w(A(this.f17575o), paint, canvas);
        i();
        return this.f17574n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        if (this.f17575o == null) {
            return super.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.mStrokeRegion) != null && region.contains(round, round2))) {
                if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.r0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f17574n = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.r0
    double p(Paint paint) {
        if (!Double.isNaN(this.f17698m)) {
            return this.f17698m;
        }
        String str = this.f17575o;
        double d11 = 0.0d;
        if (str == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof r0) {
                    d11 += ((r0) childAt).p(paint);
                }
            }
            this.f17698m = d11;
            return d11;
        } else if (str.length() == 0) {
            this.f17698m = 0.0d;
            return 0.0d;
        } else {
            h b11 = h().b();
            t(paint, b11);
            s(paint, b11);
            double measureText = paint.measureText(str);
            this.f17698m = measureText;
            return measureText;
        }
    }

    @ng.a(name = "content")
    public void setContent(String str) {
        this.f17575o = str;
        invalidate();
    }
}