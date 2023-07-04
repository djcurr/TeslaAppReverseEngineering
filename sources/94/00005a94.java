package com.stripe.android.ui.core.elements;

import c1.o0;
import d2.c0;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.u;
import n0.i0;
import n2.w;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.ui.core.elements.HtmlKt$ClickableText$pressIndicator$1$1", f = "Html.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class HtmlKt$ClickableText$pressIndicator$1$1 extends l implements p<c0, d<? super b0>, Object> {
    final /* synthetic */ o0<w> $layoutResult;
    final /* synthetic */ h00.l<Integer, b0> $onClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.HtmlKt$ClickableText$pressIndicator$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements h00.l<s1.f, b0> {
        final /* synthetic */ o0<w> $layoutResult;
        final /* synthetic */ h00.l<Integer, b0> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(o0<w> o0Var, h00.l<? super Integer, b0> lVar) {
            super(1);
            this.$layoutResult = o0Var;
            this.$onClick = lVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(s1.f fVar) {
            m446invokek4lQ0M(fVar.t());
            return b0.f54756a;
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final void m446invokek4lQ0M(long j11) {
            w value = this.$layoutResult.getValue();
            if (value == null) {
                return;
            }
            this.$onClick.invoke(Integer.valueOf(value.w(j11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlKt$ClickableText$pressIndicator$1$1(o0<w> o0Var, h00.l<? super Integer, b0> lVar, d<? super HtmlKt$ClickableText$pressIndicator$1$1> dVar) {
        super(2, dVar);
        this.$layoutResult = o0Var;
        this.$onClick = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        HtmlKt$ClickableText$pressIndicator$1$1 htmlKt$ClickableText$pressIndicator$1$1 = new HtmlKt$ClickableText$pressIndicator$1$1(this.$layoutResult, this.$onClick, dVar);
        htmlKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return htmlKt$ClickableText$pressIndicator$1$1;
    }

    @Override // h00.p
    public final Object invoke(c0 c0Var, d<? super b0> dVar) {
        return ((HtmlKt$ClickableText$pressIndicator$1$1) create(c0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            c0 c0Var = (c0) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layoutResult, this.$onClick);
            this.label = 1;
            if (i0.k(c0Var, null, null, null, anonymousClass1, this, 7, null) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}