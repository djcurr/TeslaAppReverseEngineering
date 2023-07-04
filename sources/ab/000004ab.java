package androidx.compose.ui.platform;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    private final l2.p f3037a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f3038b;

    public l1(l2.p semanticsNode, Rect adjustedBounds) {
        kotlin.jvm.internal.s.g(semanticsNode, "semanticsNode");
        kotlin.jvm.internal.s.g(adjustedBounds, "adjustedBounds");
        this.f3037a = semanticsNode;
        this.f3038b = adjustedBounds;
    }

    public final Rect a() {
        return this.f3038b;
    }

    public final l2.p b() {
        return this.f3037a;
    }
}