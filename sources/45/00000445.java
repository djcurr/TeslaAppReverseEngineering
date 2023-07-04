package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ComposeView extends androidx.compose.ui.platform.a {

    /* renamed from: a  reason: collision with root package name */
    private final c1.o0<h00.p<c1.i, Integer, vz.b0>> f2817a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2818b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2820b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f2820b = i11;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            ComposeView.this.Content(iVar, this.f2820b | 1);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.a
    public void Content(c1.i iVar, int i11) {
        c1.i h11 = iVar.h(2083049676);
        h00.p<c1.i, Integer, vz.b0> value = this.f2817a.getValue();
        if (value != null) {
            value.invoke(h11, 0);
        }
        c1.e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new a(i11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        kotlin.jvm.internal.s.f(name, "javaClass.name");
        return name;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2818b;
    }

    public final void setContent(h00.p<? super c1.i, ? super Integer, vz.b0> content) {
        kotlin.jvm.internal.s.g(content, "content");
        this.f2818b = true;
        this.f2817a.setValue(content);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        c1.o0<h00.p<c1.i, Integer, vz.b0>> d11;
        kotlin.jvm.internal.s.g(context, "context");
        d11 = c1.s1.d(null, null, 2, null);
        this.f2817a = d11;
    }
}