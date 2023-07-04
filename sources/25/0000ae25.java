package qk;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import m3.c;
import tk.b;

/* loaded from: classes3.dex */
public class a {
    private static float a(String[] strArr, int i11) {
        float parseFloat = Float.parseFloat(strArr[i11]);
        if (parseFloat < BitmapDescriptorFactory.HUE_RED || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    public static int d(Context context, int i11, int i12) {
        return b.c(context, i11, i12);
    }

    public static TimeInterpolator e(Context context, int i11, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (c(valueOf, "cubic-bezier")) {
                    String[] split = b(valueOf, "cubic-bezier").split(",");
                    if (split.length == 4) {
                        return x3.b.a(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                } else if (c(valueOf, "path")) {
                    return x3.b.b(c.e(b(valueOf, "path")));
                } else {
                    throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
                }
            }
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        return timeInterpolator;
    }
}