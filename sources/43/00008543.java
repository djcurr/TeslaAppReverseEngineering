package m0;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37992a = ViewConfiguration.getTapTimeout();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f37993a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.f37993a = view;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.valueOf(i.e(this.f37993a));
        }
    }

    public static final long b() {
        return f37992a;
    }

    public static final boolean c(KeyEvent isClick) {
        kotlin.jvm.internal.s.g(isClick, "$this$isClick");
        if (b2.c.e(b2.d.b(isClick), b2.c.f7345a.b())) {
            int b11 = b2.g.b(b2.d.a(isClick));
            if (b11 == 23 || b11 == 66 || b11 == 160) {
                return true;
            }
        }
        return false;
    }

    public static final h00.a<Boolean> d(c1.i iVar, int i11) {
        iVar.x(-184546112);
        a aVar = new a((View) iVar.A(androidx.compose.ui.platform.z.k()));
        iVar.N();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}