package androidx.compose.ui.platform;

import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a  reason: collision with root package name */
    public static final k2 f2999a = new k2();

    private k2() {
    }

    public final Map<Integer, Integer> a(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        Map<Integer, Integer> attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        kotlin.jvm.internal.s.f(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}