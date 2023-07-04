package h7;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {
    public static final void a(TextInputLayout textInputLayout, int i11, Context localizedContext) {
        s.g(textInputLayout, "<this>");
        s.g(localizedContext, "localizedContext");
        TypedArray obtainStyledAttributes = localizedContext.obtainStyledAttributes(i11, new int[]{16843088});
        s.f(obtainStyledAttributes, "localizedContext.obtainStyledAttributes(styleResId, attrs)");
        textInputLayout.setHint(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
    }

    public static final void b(TextView textView, int i11, Context localizedContext) {
        s.g(textView, "<this>");
        s.g(localizedContext, "localizedContext");
        TypedArray obtainStyledAttributes = localizedContext.obtainStyledAttributes(i11, new int[]{16843087});
        s.f(obtainStyledAttributes, "localizedContext.obtainStyledAttributes(styleResId, attrs)");
        textView.setText(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
    }
}