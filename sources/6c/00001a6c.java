package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.y0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public class q extends h {

    /* renamed from: d0  reason: collision with root package name */
    private static final TextPaint f12647d0 = new TextPaint(1);
    private Spannable Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f12648a0;

    /* renamed from: b0  reason: collision with root package name */
    private final com.facebook.yoga.m f12649b0;

    /* renamed from: c0  reason: collision with root package name */
    private final com.facebook.yoga.b f12650c0;

    /* loaded from: classes3.dex */
    class a implements com.facebook.yoga.m {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0148, code lost:
            if (r2 > r21) goto L58;
         */
        @Override // com.facebook.yoga.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long B(com.facebook.yoga.p r18, float r19, com.facebook.yoga.n r20, float r21, com.facebook.yoga.n r22) {
            /*
                Method dump skipped, instructions count: 337
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.q.a.B(com.facebook.yoga.p, float, com.facebook.yoga.n, float, com.facebook.yoga.n):long");
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.facebook.yoga.b {
        b() {
        }

        @Override // com.facebook.yoga.b
        public float a(com.facebook.yoga.p pVar, float f11, float f12) {
            Layout x12 = q.this.x1((Spannable) wf.a.d(q.this.Z, "Spannable element has not been prepared in onBeforeLayout"), f11, com.facebook.yoga.n.EXACTLY);
            return x12.getLineBaseline(x12.getLineCount() - 1);
        }
    }

    public q() {
        this(null);
    }

    private int v1() {
        int i11 = this.G;
        if (f0() == com.facebook.yoga.h.RTL) {
            if (i11 == 5) {
                return 3;
            }
            if (i11 == 3) {
                return 5;
            }
            return i11;
        }
        return i11;
    }

    private void w1() {
        if (O()) {
            return;
        }
        S0(this.f12649b0);
        E0(this.f12650c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Layout x1(Spannable spannable, float f11, com.facebook.yoga.n nVar) {
        TextPaint textPaint = f12647d0;
        textPaint.setTextSize(this.A.c());
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z11 = nVar == com.facebook.yoga.n.UNDEFINED || f11 < BitmapDescriptorFactory.HUE_RED;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int v12 = v1();
        if (v12 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (v12 == 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (v12 == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        Layout.Alignment alignment2 = alignment;
        if (isBoring == null && (z11 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f11))) {
            int ceil = (int) Math.ceil(desiredWidth);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 23) {
                return new StaticLayout(spannable, textPaint, ceil, alignment2, 1.0f, BitmapDescriptorFactory.HUE_RED, this.Q);
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, ceil).setAlignment(alignment2).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(this.Q).setBreakStrategy(this.H).setHyphenationFrequency(this.I);
            if (i11 >= 26) {
                hyphenationFrequency.setJustificationMode(this.J);
            }
            if (i11 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        } else if (isBoring != null && (z11 || isBoring.width <= f11)) {
            return BoringLayout.make(spannable, textPaint, Math.max(isBoring.width, 0), alignment2, 1.0f, BitmapDescriptorFactory.HUE_RED, isBoring, this.Q);
        } else {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 23) {
                return new StaticLayout(spannable, textPaint, (int) f11, alignment2, 1.0f, BitmapDescriptorFactory.HUE_RED, this.Q);
            }
            StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f11).setAlignment(alignment2).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(this.Q).setBreakStrategy(this.H).setHyphenationFrequency(this.I);
            if (i12 >= 28) {
                hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency2.build();
        }
    }

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public Iterable<? extends com.facebook.react.uimanager.c0> K() {
        Map<Integer, com.facebook.react.uimanager.c0> map = this.Y;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) wf.a.d(this.Z, "Spannable element has not been prepared in onBeforeLayout");
        b0[] b0VarArr = (b0[]) spanned.getSpans(0, spanned.length(), b0.class);
        ArrayList arrayList = new ArrayList(b0VarArr.length);
        for (b0 b0Var : b0VarArr) {
            com.facebook.react.uimanager.c0 c0Var = this.Y.get(Integer.valueOf(b0Var.b()));
            c0Var.N();
            arrayList.add(c0Var);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public void X(com.facebook.react.uimanager.n nVar) {
        this.Z = q1(this, null, true, nVar);
        w0();
    }

    @Override // com.facebook.react.uimanager.d0
    public boolean n0() {
        return true;
    }

    @ng.a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z11) {
        this.f12648a0 = z11;
    }

    @Override // com.facebook.react.uimanager.d0
    public boolean t0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.d0
    public void w0() {
        super.w0();
        super.H();
    }

    @Override // com.facebook.react.uimanager.d0
    public void y0(y0 y0Var) {
        super.y0(y0Var);
        Spannable spannable = this.Z;
        if (spannable != null) {
            y0Var.Q(L(), new r(spannable, -1, this.X, j0(4), j0(1), j0(5), j0(3), v1(), this.H, this.J));
        }
    }

    public q(t tVar) {
        super(tVar);
        this.f12649b0 = new a();
        this.f12650c0 = new b();
        w1();
    }
}