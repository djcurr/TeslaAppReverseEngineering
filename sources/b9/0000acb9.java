package q2;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class k extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f47364a;

    public k(Typeface typeface) {
        s.g(typeface, "typeface");
        this.f47364a = typeface;
    }

    private final void a(Paint paint) {
        paint.setTypeface(this.f47364a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds2) {
        s.g(ds2, "ds");
        a(ds2);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        s.g(paint, "paint");
        a(paint);
    }
}