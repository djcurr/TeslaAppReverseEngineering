package com.stripe.android.link.ui.inline;

import c1.i;
import com.stripe.android.link.injection.NonFallbackInjector;
import h00.a;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkInlineSignupView$Content$1$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ NonFallbackInjector $it;
    final /* synthetic */ LinkInlineSignupView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupView$Content$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements a<b0> {
        final /* synthetic */ LinkInlineSignupView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LinkInlineSignupView linkInlineSignupView) {
            super(0);
            this.this$0 = linkInlineSignupView;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.setHasUserInteracted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupView$Content$1$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements l<Boolean, b0> {
        final /* synthetic */ LinkInlineSignupView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LinkInlineSignupView linkInlineSignupView) {
            super(1);
            this.this$0 = linkInlineSignupView;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return b0.f54756a;
        }

        public final void invoke(boolean z11) {
            this.this$0.isSelected().setValue(Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupView$Content$1$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends u implements l<UserInput, b0> {
        final /* synthetic */ LinkInlineSignupView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LinkInlineSignupView linkInlineSignupView) {
            super(1);
            this.this$0 = linkInlineSignupView;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(UserInput userInput) {
            invoke2(userInput);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(UserInput userInput) {
            this.this$0.getUserInput().setValue(userInput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupView$Content$1$1(NonFallbackInjector nonFallbackInjector, LinkInlineSignupView linkInlineSignupView) {
        super(2);
        this.$it = nonFallbackInjector;
        this.this$0 = linkInlineSignupView;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        boolean enabledState;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        NonFallbackInjector nonFallbackInjector = this.$it;
        enabledState = this.this$0.getEnabledState();
        LinkInlineSignupViewKt.LinkInlineSignup(nonFallbackInjector, enabledState, new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0), iVar, 0);
    }
}