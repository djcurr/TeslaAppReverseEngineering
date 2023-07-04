package h2;

import androidx.compose.ui.platform.f2;
import androidx.compose.ui.platform.p1;
import androidx.compose.ui.platform.y1;
import r2.d;

/* loaded from: classes.dex */
public interface f0 {
    public static final a Z0 = a.f28665a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f28665a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static boolean f28666b;

        private a() {
        }

        public final boolean a() {
            return f28666b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static /* synthetic */ void a(f0 f0Var, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
            }
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            f0Var.a(z11);
        }
    }

    void a(boolean z11);

    e0 b(h00.l<? super t1.u, vz.b0> lVar, h00.a<vz.b0> aVar);

    void d(k kVar);

    long e(long j11);

    void f(k kVar);

    androidx.compose.ui.platform.i getAccessibilityManager();

    p1.d getAutofill();

    p1.i getAutofillTree();

    androidx.compose.ui.platform.j0 getClipboardManager();

    x2.d getDensity();

    r1.g getFocusManager();

    d.a getFontLoader();

    z1.a getHapticFeedBack();

    a2.b getInputModeManager();

    x2.q getLayoutDirection();

    d2.r getPointerIconService();

    m getSharedDrawScope();

    boolean getShowLayoutBounds();

    h0 getSnapshotObserver();

    s2.c0 getTextInputService();

    p1 getTextToolbar();

    y1 getViewConfiguration();

    f2 getWindowInfo();

    void i(k kVar);

    void j(k kVar);

    void k(k kVar);

    long l(long j11);

    void n(k kVar);

    void o();

    boolean requestFocus();

    void setShowLayoutBounds(boolean z11);
}