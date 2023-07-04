package q2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f47362a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f47363b;

    public j(boolean z11, boolean z12) {
        this.f47362a = z11;
        this.f47363b = z12;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        s.g(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f47362a);
        textPaint.setStrikeThruText(this.f47363b);
    }
}