package androidx.camera.core.impl;

import android.content.Context;
import android.util.Size;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface p {

    /* loaded from: classes.dex */
    public interface a {
        p a(Context context, Object obj, Set<String> set);
    }

    j1 a(String str, int i11, Size size);

    Map<p1<?>, Size> b(String str, List<j1> list, List<p1<?>> list2);
}