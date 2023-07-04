package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f2974a = new j();

    private j() {
    }

    public final void a(AccessibilityNodeInfo node, List<String> data) {
        kotlin.jvm.internal.s.g(node, "node");
        kotlin.jvm.internal.s.g(data, "data");
        node.setAvailableExtraData(data);
    }
}