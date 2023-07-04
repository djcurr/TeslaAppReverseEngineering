package gw;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes6.dex */
public final class b0 {
    public static final TypedValue a(Context context, String attrName) {
        kotlin.jvm.internal.s.g(context, "<this>");
        kotlin.jvm.internal.s.g(attrName, "attrName");
        int identifier = context.getResources().getIdentifier(attrName, "attr", context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue;
    }
}