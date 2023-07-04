package q2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f47346a;

    public e(int i11) {
        this.f47346a = i11;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int i11, int i12, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        s.g(text, "text");
        s.g(fontMetricsInt, "fontMetricsInt");
        int i15 = fontMetricsInt.descent;
        int i16 = i15 - fontMetricsInt.ascent;
        if (i16 <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(i15 * ((this.f47346a * 1.0f) / i16));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - this.f47346a;
    }
}