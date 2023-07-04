package t3;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* loaded from: classes.dex */
public final class b {
    public static Spanned a(String str, int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i11);
        }
        return Html.fromHtml(str);
    }
}