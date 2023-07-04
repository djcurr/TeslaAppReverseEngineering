package androidx.compose.ui.window;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.platform.c2;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;
import x2.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h extends Dialog implements c2 {

    /* renamed from: a  reason: collision with root package name */
    private h00.a<b0> f3287a;

    /* renamed from: b  reason: collision with root package name */
    private g f3288b;

    /* renamed from: c  reason: collision with root package name */
    private final View f3289c;

    /* renamed from: d  reason: collision with root package name */
    private final f f3290d;

    /* renamed from: e  reason: collision with root package name */
    private final float f3291e;

    /* loaded from: classes.dex */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            s.g(view, "view");
            s.g(result, "result");
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3292a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.Ltr.ordinal()] = 1;
            iArr[q.Rtl.ordinal()] = 2;
            f3292a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h00.a<b0> onDismissRequest, g properties, View composeView, q layoutDirection, x2.d density, UUID dialogId) {
        super(new ContextThemeWrapper(composeView.getContext(), o1.i.f42104a));
        s.g(onDismissRequest, "onDismissRequest");
        s.g(properties, "properties");
        s.g(composeView, "composeView");
        s.g(layoutDirection, "layoutDirection");
        s.g(density, "density");
        s.g(dialogId, "dialogId");
        this.f3287a = onDismissRequest;
        this.f3288b = properties;
        this.f3289c = composeView;
        float f11 = x2.g.f(30);
        this.f3291e = f11;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            Context context = getContext();
            s.f(context, "context");
            f fVar = new f(context, window);
            fVar.setTag(o1.g.H, s.p("Dialog:", dialogId));
            fVar.setClipChildren(false);
            fVar.setElevation(density.i0(f11));
            fVar.setOutlineProvider(new a());
            this.f3290d = fVar;
            View decorView = window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                a(viewGroup);
            }
            setContentView(fVar);
            v0.b(fVar, v0.a(composeView));
            w0.b(fVar, w0.a(composeView));
            androidx.savedstate.d.b(fVar, androidx.savedstate.d.a(composeView));
            f(this.f3287a, this.f3288b, layoutDirection);
            return;
        }
        throw new IllegalStateException("Dialog has no window".toString());
    }

    private static final void a(ViewGroup viewGroup) {
        int i11 = 0;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof f) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        while (i11 < childCount) {
            int i12 = i11 + 1;
            View childAt = viewGroup.getChildAt(i11);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                a(viewGroup2);
            }
            i11 = i12;
        }
    }

    private final void d(q qVar) {
        f fVar = this.f3290d;
        int i11 = b.f3292a[qVar.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        fVar.setLayoutDirection(i12);
    }

    private final void e(o oVar) {
        boolean a11 = p.a(oVar, androidx.compose.ui.window.b.e(this.f3289c));
        Window window = getWindow();
        s.e(window);
        window.setFlags(a11 ? 8192 : -8193, PKIFailureInfo.certRevoked);
    }

    public final void b() {
        this.f3290d.disposeComposition();
    }

    public final void c(c1.m parentComposition, h00.p<? super c1.i, ? super Integer, b0> children) {
        s.g(parentComposition, "parentComposition");
        s.g(children, "children");
        this.f3290d.b(parentComposition, children);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void f(h00.a<b0> onDismissRequest, g properties, q layoutDirection) {
        s.g(onDismissRequest, "onDismissRequest");
        s.g(properties, "properties");
        s.g(layoutDirection, "layoutDirection");
        this.f3287a = onDismissRequest;
        this.f3288b = properties;
        e(properties.c());
        d(layoutDirection);
        this.f3290d.c(properties.d());
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.f3288b.a()) {
            this.f3287a.invoke();
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        s.g(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent && this.f3288b.b()) {
            this.f3287a.invoke();
        }
        return onTouchEvent;
    }
}