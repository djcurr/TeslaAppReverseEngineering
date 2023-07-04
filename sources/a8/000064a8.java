package d;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import c1.i;
import c1.m;
import h00.p;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final ViewGroup.LayoutParams f23237a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ComponentActivity componentActivity, m mVar, p<? super i, ? super Integer, b0> content) {
        s.g(componentActivity, "<this>");
        s.g(content, "content");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(mVar);
            composeView.setContent(content);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(mVar);
        composeView2.setContent(content);
        c(componentActivity);
        componentActivity.setContentView(composeView2, f23237a);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, m mVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = null;
        }
        a(componentActivity, mVar, pVar);
    }

    private static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        s.f(decorView, "window.decorView");
        if (v0.a(decorView) == null) {
            v0.b(decorView, componentActivity);
        }
        if (w0.a(decorView) == null) {
            w0.b(decorView, componentActivity);
        }
        if (androidx.savedstate.d.a(decorView) == null) {
            androidx.savedstate.d.b(decorView, componentActivity);
        }
    }
}