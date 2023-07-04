package com.withpersona.sdk.inquiry.selfie.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gw.m;
import j00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/view/CircleMaskView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "selfie_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CircleMaskView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final float f22896a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22897b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f22898c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f22899d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f22900e;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ CircleMaskView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final long a(float f11) {
        long e11;
        e11 = c.e((Math.abs(getScaleX() - f11) / 4.0f) * ((float) 500));
        return e11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if ((r0.getWidth() == getWidth() && r0.getHeight() == getHeight()) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.graphics.Bitmap b() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f22898c
            r1 = 0
            if (r0 != 0) goto L7
        L5:
            r0 = r1
            goto L20
        L7:
            int r2 = r0.getWidth()
            int r3 = r7.getWidth()
            if (r2 != r3) goto L1d
            int r2 = r0.getHeight()
            int r3 = r7.getHeight()
            if (r2 != r3) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            if (r2 == 0) goto L5
        L20:
            if (r0 != 0) goto L64
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            int r2 = r7.f22897b
            r1.drawColor(r2)
            int r2 = r1.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r4 = r1.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r3
            float r3 = r7.f22896a
            int r5 = r1.getWidth()
            int r6 = r1.getHeight()
            int r5 = java.lang.Math.min(r5, r6)
            float r5 = (float) r5
            float r3 = r3 * r5
            android.graphics.Paint r5 = r7.f22900e
            r1.drawCircle(r2, r4, r3, r5)
            r7.f22898c = r0
            java.lang.String r1 = "createBitmap(\n      widt…}\n      mask = this\n    }"
            kotlin.jvm.internal.s.f(r0, r1)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk.inquiry.selfie.view.CircleMaskView.b():android.graphics.Bitmap");
    }

    public static /* synthetic */ void d(CircleMaskView circleMaskView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        circleMaskView.c(z11);
    }

    public final void c(boolean z11) {
        if (z11) {
            ViewPropertyAnimator animate = animate();
            animate.setDuration(a(1.0f));
            animate.scaleX(1.0f);
            animate.scaleY(1.0f);
            animate.start();
            return;
        }
        getAnimation().cancel();
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    public final void e() {
        if (getScaleX() == 5.0f) {
            if (getScaleY() == 5.0f) {
                return;
            }
        }
        ViewPropertyAnimator animate = animate();
        animate.setDuration(a(5.0f));
        animate.scaleX(5.0f);
        animate.scaleY(5.0f);
        animate.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.g(canvas, "canvas");
        canvas.drawBitmap(b(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f22899d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleMaskView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        this.f22899d = new Paint(7);
        Paint paint = new Paint(1);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        b0 b0Var = b0.f54756a;
        this.f22900e = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f28435a, i11, 0);
        s.f(obtainStyledAttributes, "context.obtainStyledAttr…askView, defStyleAttr, 0)");
        try {
            this.f22896a = obtainStyledAttributes.getFloat(m.f28436b, 0.4f);
            this.f22897b = obtainStyledAttributes.getColor(m.f28437c, -16777216);
            obtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}