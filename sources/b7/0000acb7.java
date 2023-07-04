package q2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public class i extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f47361a;

    public i(float f11) {
        this.f47361a = f11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f47361a + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f47361a + textPaint.getTextSkewX());
    }
}