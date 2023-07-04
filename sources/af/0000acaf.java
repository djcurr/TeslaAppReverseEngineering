package q2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final String f47343a;

    public b(String fontFeatureSettings) {
        s.g(fontFeatureSettings, "fontFeatureSettings");
        this.f47343a = fontFeatureSettings;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f47343a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f47343a);
    }
}