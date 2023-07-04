package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.r0;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class s extends AppCompatTextView implements com.facebook.react.uimanager.v {

    /* renamed from: m  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f12666m = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private boolean f12667a;

    /* renamed from: b  reason: collision with root package name */
    private int f12668b;

    /* renamed from: c  reason: collision with root package name */
    private int f12669c;

    /* renamed from: d  reason: collision with root package name */
    private int f12670d;

    /* renamed from: e  reason: collision with root package name */
    private int f12671e;

    /* renamed from: f  reason: collision with root package name */
    private TextUtils.TruncateAt f12672f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12673g;

    /* renamed from: h  reason: collision with root package name */
    private int f12674h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12675i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12676j;

    /* renamed from: k  reason: collision with root package name */
    private com.facebook.react.views.view.f f12677k;

    /* renamed from: l  reason: collision with root package name */
    private Spannable f12678l;

    /* loaded from: classes3.dex */
    class a implements Comparator {
        a(s sVar) {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public s(Context context) {
        super(context);
        this.f12670d = 0;
        this.f12671e = Integer.MAX_VALUE;
        this.f12672f = TextUtils.TruncateAt.END;
        this.f12673g = false;
        this.f12674h = 0;
        this.f12676j = false;
        this.f12677k = new com.facebook.react.views.view.f(this);
        this.f12668b = getGravity() & 8388615;
        this.f12669c = getGravity() & 112;
    }

    private static WritableMap d(int i11, int i12, int i13, int i14, int i15, int i16) {
        WritableMap createMap = Arguments.createMap();
        if (i11 == 8) {
            createMap.putString("visibility", "gone");
            createMap.putInt("index", i12);
        } else if (i11 == 0) {
            createMap.putString("visibility", "visible");
            createMap.putInt("index", i12);
            createMap.putDouble("left", com.facebook.react.uimanager.p.a(i13));
            createMap.putDouble("top", com.facebook.react.uimanager.p.a(i14));
            createMap.putDouble("right", com.facebook.react.uimanager.p.a(i15));
            createMap.putDouble("bottom", com.facebook.react.uimanager.p.a(i16));
        } else {
            createMap.putString("visibility", "unknown");
            createMap.putInt("index", i12);
        }
        return createMap;
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof r0) {
            return (ReactContext) ((r0) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public void f(int i11, float f11, float f12) {
        this.f12677k.c(i11, f11, f12);
    }

    public void g(float f11, int i11) {
        this.f12677k.e(f11, i11);
    }

    public Spannable getSpanned() {
        return this.f12678l;
    }

    public void h(int i11, float f11) {
        this.f12677k.g(i11, f11);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void i() {
        setEllipsize((this.f12671e == Integer.MAX_VALUE || this.f12673g) ? null : this.f12672f);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f12667a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a0 a0Var : (a0[]) spanned.getSpans(0, spanned.length(), a0.class)) {
                if (a0Var.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f12676j);
        if (this.f12667a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a0 a0Var : (a0[]) spanned.getSpans(0, spanned.length(), a0.class)) {
                a0Var.c();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f12667a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a0 a0Var : (a0[]) spanned.getSpans(0, spanned.length(), a0.class)) {
                a0Var.d();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f12667a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a0 a0Var : (a0[]) spanned.getSpans(0, spanned.length(), a0.class)) {
                a0Var.e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
        if (r5 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c A[SYNTHETIC] */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.s.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f12667a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a0 a0Var : (a0[]) spanned.getSpans(0, spanned.length(), a0.class)) {
                a0Var.f();
            }
        }
    }

    @Override // com.facebook.react.uimanager.v
    public int reactTagForTouch(float f11, float f12) {
        int i11;
        CharSequence text = getText();
        int id2 = getId();
        int i12 = (int) f11;
        int i13 = (int) f12;
        Layout layout = getLayout();
        if (layout == null) {
            return id2;
        }
        int lineForVertical = layout.getLineForVertical(i13);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i12 >= lineLeft && i12 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i12);
                o[] oVarArr = (o[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, o.class);
                if (oVarArr != null) {
                    int length = text.length();
                    for (int i14 = 0; i14 < oVarArr.length; i14++) {
                        int spanStart = spanned.getSpanStart(oVarArr[i14]);
                        int spanEnd = spanned.getSpanEnd(oVarArr[i14]);
                        if (spanEnd >= offsetForHorizontal && (i11 = spanEnd - spanStart) <= length) {
                            id2 = oVarArr[i14].a();
                            length = i11;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                nd.a.j("ReactNative", "Crash in HorizontalMeasurementProvider: " + e11.getMessage());
            }
        }
        return id2;
    }

    public void setAdjustFontSizeToFit(boolean z11) {
        this.f12673g = z11;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        this.f12677k.b(i11);
    }

    public void setBorderRadius(float f11) {
        this.f12677k.d(f11);
    }

    public void setBorderStyle(String str) {
        this.f12677k.f(str);
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f12672f = truncateAt;
    }

    void setGravityHorizontal(int i11) {
        if (i11 == 0) {
            i11 = this.f12668b;
        }
        setGravity(i11 | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i11) {
        if (i11 == 0) {
            i11 = this.f12669c;
        }
        setGravity(i11 | (getGravity() & (-113)));
    }

    public void setLinkifyMask(int i11) {
        this.f12674h = i11;
    }

    public void setNotifyOnInlineViewLayout(boolean z11) {
        this.f12675i = z11;
    }

    public void setNumberOfLines(int i11) {
        if (i11 == 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.f12671e = i11;
        setSingleLine(i11 == 1);
        setMaxLines(this.f12671e);
    }

    public void setSpanned(Spannable spannable) {
        this.f12678l = spannable;
    }

    public void setText(r rVar) {
        int i11;
        this.f12667a = rVar.b();
        if (getLayoutParams() == null) {
            setLayoutParams(f12666m);
        }
        Spannable k11 = rVar.k();
        int i12 = this.f12674h;
        if (i12 > 0) {
            Linkify.addLinks(k11, i12);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(k11);
        float f11 = rVar.f();
        float h11 = rVar.h();
        float g11 = rVar.g();
        float e11 = rVar.e();
        if (f11 != -1.0f && e11 != -1.0f && g11 != -1.0f && i11 != 0) {
            setPadding((int) Math.floor(f11), (int) Math.floor(h11), (int) Math.floor(g11), (int) Math.floor(e11));
        }
        int l11 = rVar.l();
        if (this.f12670d != l11) {
            this.f12670d = l11;
        }
        setGravityHorizontal(this.f12670d);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 23 && getBreakStrategy() != rVar.m()) {
            setBreakStrategy(rVar.m());
        }
        if (i13 >= 26 && getJustificationMode() != rVar.d()) {
            setJustificationMode(rVar.d());
        }
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z11) {
        this.f12676j = z11;
        super.setTextIsSelectable(z11);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f12667a && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (a0 a0Var : (a0[]) spanned.getSpans(0, spanned.length(), a0.class)) {
                if (a0Var.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}