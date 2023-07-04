package w0;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class a0 {
    public static final int a(String str, int i11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i11);
    }

    public static final int b(String str, int i11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i11);
    }
}