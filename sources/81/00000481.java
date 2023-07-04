package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.y1;

/* loaded from: classes.dex */
public final class h0 implements y1 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewConfiguration f2959a;

    public h0(ViewConfiguration viewConfiguration) {
        kotlin.jvm.internal.s.g(viewConfiguration, "viewConfiguration");
        this.f2959a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.y1
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.y1
    public long b() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.y1
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.y1
    public long d() {
        return y1.a.a(this);
    }

    @Override // androidx.compose.ui.platform.y1
    public float e() {
        return this.f2959a.getScaledTouchSlop();
    }
}