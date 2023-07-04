package q2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f47345a;

    public d(float f11) {
        this.f47345a = f11;
    }

    private final void a(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        textPaint.setLetterSpacing(this.f47345a / textSize);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        a(textPaint);
    }
}