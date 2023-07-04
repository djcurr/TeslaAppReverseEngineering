package s2;

import android.view.inputmethod.ExtractedText;

/* loaded from: classes.dex */
public final class q {
    public static final ExtractedText a(a0 a0Var) {
        boolean L;
        kotlin.jvm.internal.s.g(a0Var, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = a0Var.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = a0Var.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = n2.y.l(a0Var.g());
        extractedText.selectionEnd = n2.y.k(a0Var.g());
        L = kotlin.text.w.L(a0Var.h(), '\n', false, 2, null);
        extractedText.flags = !L ? 1 : 0;
        return extractedText;
    }
}