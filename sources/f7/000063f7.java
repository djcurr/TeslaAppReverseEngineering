package com.withpersona.sdk.inquiry.selfie.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gw.m;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk/inquiry/selfie/view/ProgressArcView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "selfie_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ProgressArcView extends View {

    /* renamed from: a */
    private final Paint f22923a;

    /* renamed from: b */
    private final float f22924b;

    /* renamed from: c */
    private final float f22925c;

    /* renamed from: d */
    private float f22926d;

    /* renamed from: e */
    private ValueAnimator f22927e;

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
    public ProgressArcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ ProgressArcView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void a(ProgressArcView progressArcView, ValueAnimator valueAnimator, float f11, h00.a aVar, ValueAnimator valueAnimator2) {
        d(progressArcView, valueAnimator, f11, aVar, valueAnimator2);
    }

    public static /* synthetic */ void b(h00.a aVar) {
        m588setProgress$lambda5$lambda4$lambda3$lambda2(aVar);
    }

    public static final void d(ProgressArcView this$0, ValueAnimator valueAnimator, float f11, final h00.a aVar, ValueAnimator valueAnimator2) {
        s.g(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.f22926d = ((Float) animatedValue).floatValue();
        this$0.invalidate();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        if (!(((Float) animatedValue2).floatValue() == f11) || aVar == null) {
            return;
        }
        this$0.postDelayed(new Runnable() { // from class: com.withpersona.sdk.inquiry.selfie.view.b
            @Override // java.lang.Runnable
            public final void run() {
                ProgressArcView.b(h00.a.this);
            }
        }, 100L);
    }

    /* renamed from: setProgress$lambda-5$lambda-4$lambda-3$lambda-2 */
    public static final void m588setProgress$lambda5$lambda4$lambda3$lambda2(h00.a tmp0) {
        s.g(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public final void c(final float f11, final h00.a<b0> aVar) {
        if (this.f22926d == f11) {
            if (aVar == null) {
                return;
            }
            aVar.invoke();
            return;
        }
        ValueAnimator valueAnimator = this.f22927e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f22926d, f11);
        ofFloat.setDuration(500L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withpersona.sdk.inquiry.selfie.view.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ProgressArcView.a(ProgressArcView.this, ofFloat, f11, aVar, valueAnimator2);
            }
        });
        ofFloat.start();
        b0 b0Var = b0.f54756a;
        this.f22927e = ofFloat;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.g(canvas, "canvas");
        float min = this.f22924b * Math.min(getWidth(), getHeight());
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawArc(width - min, height - min, width + min, height + min, this.f22925c, (this.f22926d * 360) / 100, false, this.f22923a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressArcView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        Paint paint = new Paint(1);
        this.f22923a = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f28438d, i11, 0);
        s.f(obtainStyledAttributes, "context.obtainStyledAttr…ArcView, defStyleAttr, 0)");
        try {
            this.f22924b = obtainStyledAttributes.getFloat(m.f28439e, 0.4f);
            this.f22925c = obtainStyledAttributes.getFloat(m.f28441g, 270.0f);
            this.f22926d = obtainStyledAttributes.getFloat(m.f28440f, BitmapDescriptorFactory.HUE_RED);
            paint.setColor(obtainStyledAttributes.getColor(m.f28442h, -1));
            paint.setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(m.f28443i, 5));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            obtainStyledAttributes.recycle();
            setWillNotDraw(false);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}