package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import c1.e1;
import c1.o0;
import c1.s1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends androidx.compose.ui.platform.a {

    /* renamed from: a  reason: collision with root package name */
    private final Window f3277a;

    /* renamed from: b  reason: collision with root package name */
    private final o0 f3278b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3279c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3280d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3282b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f3282b = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            f.this.Content(iVar, this.f3282b | 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, Window window) {
        super(context, null, 0, 6, null);
        o0 d11;
        s.g(context, "context");
        s.g(window, "window");
        this.f3277a = window;
        d11 = s1.d(d.f3271a.a(), null, 2, null);
        this.f3278b = d11;
    }

    private final h00.p<c1.i, Integer, b0> getContent() {
        return (h00.p) this.f3278b.getValue();
    }

    private final int getDisplayHeight() {
        int c11;
        c11 = j00.c.c(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
        return c11;
    }

    private final int getDisplayWidth() {
        int c11;
        c11 = j00.c.c(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
        return c11;
    }

    private final void setContent(h00.p<? super c1.i, ? super Integer, b0> pVar) {
        this.f3278b.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.a
    public void Content(c1.i iVar, int i11) {
        c1.i h11 = iVar.h(-1628271667);
        getContent().invoke(h11, 0);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new a(i11));
    }

    public Window a() {
        return this.f3277a;
    }

    public final void b(c1.m parent, h00.p<? super c1.i, ? super Integer, b0> content) {
        s.g(parent, "parent");
        s.g(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.f3280d = true;
        createComposition();
    }

    public final void c(boolean z11) {
        this.f3279c = z11;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3280d;
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnLayout$ui_release(boolean z11, int i11, int i12, int i13, int i14) {
        super.internalOnLayout$ui_release(z11, i11, i12, i13, i14);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        a().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.a
    public void internalOnMeasure$ui_release(int i11, int i12) {
        if (this.f3279c) {
            super.internalOnMeasure$ui_release(i11, i12);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }
}