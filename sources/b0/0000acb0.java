package q2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f47344a;

    public c(float f11) {
        this.f47344a = f11;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f47344a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f47344a);
    }
}