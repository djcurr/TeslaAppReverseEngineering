package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class w0 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            x0.f(view, charSequence);
        }
    }
}