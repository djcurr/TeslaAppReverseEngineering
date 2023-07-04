package jw;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {
    public static final int a(Context context, int i11, TypedValue typedValue, boolean z11) {
        s.g(context, "<this>");
        s.g(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i11, typedValue, z11);
        return typedValue.data;
    }

    public static /* synthetic */ int b(Context context, int i11, TypedValue typedValue, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i12 & 4) != 0) {
            z11 = true;
        }
        return a(context, i11, typedValue, z11);
    }
}