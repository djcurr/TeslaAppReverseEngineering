package pr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class j {
    public static final LayoutInflater a(Context context, ViewGroup viewGroup) {
        Context context2;
        kotlin.jvm.internal.s.g(context, "<this>");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        return LayoutInflater.from(context2).cloneInContext(context);
    }
}