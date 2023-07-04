package y3;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import v3.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f59074a = new String[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1345a {
        static void a(EditorInfo editorInfo, CharSequence charSequence, int i11) {
            editorInfo.setInitialSurroundingSubText(charSequence, i11);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f59074a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f59074a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f59074a;
    }

    private static boolean b(CharSequence charSequence, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i11));
        }
        return Character.isLowSurrogate(charSequence.charAt(i11));
    }

    private static boolean c(int i11) {
        int i12 = i11 & 4095;
        return i12 == 129 || i12 == 225 || i12 == 18;
    }

    public static void d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int i11) {
        h.f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C1345a.a(editorInfo, charSequence, i11);
            return;
        }
        int i12 = editorInfo.initialSelStart;
        int i13 = editorInfo.initialSelEnd;
        int i14 = i12 > i13 ? i13 - i11 : i12 - i11;
        int i15 = i12 > i13 ? i12 - i11 : i13 - i11;
        int length = charSequence.length();
        if (i11 >= 0 && i14 >= 0 && i15 <= length) {
            if (c(editorInfo.inputType)) {
                g(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                g(editorInfo, charSequence, i14, i15);
                return;
            } else {
                h(editorInfo, charSequence, i14, i15);
                return;
            }
        }
        g(editorInfo, null, 0, 0);
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C1345a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    private static void g(EditorInfo editorInfo, CharSequence charSequence, int i11, int i12) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i11);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i12);
    }

    private static void h(EditorInfo editorInfo, CharSequence charSequence, int i11, int i12) {
        CharSequence subSequence;
        int i13 = i12 - i11;
        int i14 = i13 > 1024 ? 0 : i13;
        int i15 = 2048 - i14;
        int min = Math.min(charSequence.length() - i12, i15 - Math.min(i11, (int) (i15 * 0.8d)));
        int min2 = Math.min(i11, i15 - min);
        int i16 = i11 - min2;
        if (b(charSequence, i16, 0)) {
            i16++;
            min2--;
        }
        if (b(charSequence, (i12 + min) - 1, 1)) {
            min--;
        }
        int i17 = min2 + i14 + min;
        if (i14 != i13) {
            subSequence = TextUtils.concat(charSequence.subSequence(i16, i16 + min2), charSequence.subSequence(i12, min + i12));
        } else {
            subSequence = charSequence.subSequence(i16, i17 + i16);
        }
        int i18 = min2 + 0;
        g(editorInfo, subSequence, i18, i14 + i18);
    }
}