package l7;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import j7.b;

/* loaded from: classes.dex */
public final class a {
    private static int a(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i11});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static int b(Context context) {
        return a(context, b.f33270a);
    }
}