package w0;

import n2.a;

/* loaded from: classes.dex */
public final class m {
    public static final void a(a.C0787a c0787a, String id2, String alternateText) {
        kotlin.jvm.internal.s.g(c0787a, "<this>");
        kotlin.jvm.internal.s.g(id2, "id");
        kotlin.jvm.internal.s.g(alternateText, "alternateText");
        if (alternateText.length() > 0) {
            c0787a.g("androidx.compose.foundation.text.inlineContent", id2);
            c0787a.d(alternateText);
            c0787a.f();
            return;
        }
        throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
    }

    public static /* synthetic */ void b(a.C0787a c0787a, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "�";
        }
        a(c0787a, str, str2);
    }
}