package com.stripe.android.link.ui.wallet;

import c1.o0;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.a;
import h00.l;
import h00.q;
import j1.c;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p0.i;
import vz.b0;

/* loaded from: classes6.dex */
final class WalletScreenKt$WalletBody$9$2$1 extends u implements l<ConsumerPaymentDetails.Card, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ o0<ConsumerPaymentDetails.Card> $cardBeingRemoved$delegate;
    final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onEditPaymentMethod;
    final /* synthetic */ l<q<? super i, ? super c1.i, ? super Integer, b0>, b0> $showBottomSheetContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$9$2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements q<i, c1.i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ o0<ConsumerPaymentDetails.Card> $cardBeingRemoved$delegate;
        final /* synthetic */ ConsumerPaymentDetails.Card $it;
        final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onEditPaymentMethod;
        final /* synthetic */ l<q<? super i, ? super c1.i, ? super Integer, b0>, b0> $showBottomSheetContent;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$9$2$1$1$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends u implements a<b0> {
            final /* synthetic */ ConsumerPaymentDetails.Card $it;
            final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onEditPaymentMethod;
            final /* synthetic */ l<q<? super i, ? super c1.i, ? super Integer, b0>, b0> $showBottomSheetContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(l<? super q<? super i, ? super c1.i, ? super Integer, b0>, b0> lVar, l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar2, ConsumerPaymentDetails.Card card) {
                super(0);
                this.$showBottomSheetContent = lVar;
                this.$onEditPaymentMethod = lVar2;
                this.$it = card;
            }

            @Override // h00.a
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo11invoke() {
                invoke2();
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showBottomSheetContent.mo12invoke(null);
                this.$onEditPaymentMethod.mo12invoke(this.$it);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$9$2$1$1$3  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass3 extends u implements a<b0> {
            final /* synthetic */ o0<ConsumerPaymentDetails.Card> $cardBeingRemoved$delegate;
            final /* synthetic */ ConsumerPaymentDetails.Card $it;
            final /* synthetic */ l<q<? super i, ? super c1.i, ? super Integer, b0>, b0> $showBottomSheetContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(l<? super q<? super i, ? super c1.i, ? super Integer, b0>, b0> lVar, ConsumerPaymentDetails.Card card, o0<ConsumerPaymentDetails.Card> o0Var) {
                super(0);
                this.$showBottomSheetContent = lVar;
                this.$it = card;
                this.$cardBeingRemoved$delegate = o0Var;
            }

            @Override // h00.a
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo11invoke() {
                invoke2();
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$showBottomSheetContent.mo12invoke(null);
                this.$cardBeingRemoved$delegate.setValue(this.$it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super q<? super i, ? super c1.i, ? super Integer, b0>, b0> lVar, int i11, l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar2, ConsumerPaymentDetails.Card card, o0<ConsumerPaymentDetails.Card> o0Var) {
            super(3);
            this.$showBottomSheetContent = lVar;
            this.$$dirty = i11;
            this.$onEditPaymentMethod = lVar2;
            this.$it = card;
            this.$cardBeingRemoved$delegate = o0Var;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
            invoke(iVar, iVar2, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i invoke, c1.i iVar, int i11) {
            s.g(invoke, "$this$invoke");
            if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            l<q<? super i, ? super c1.i, ? super Integer, b0>, b0> lVar = this.$showBottomSheetContent;
            iVar.x(-3686930);
            boolean O = iVar.O(lVar);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new WalletScreenKt$WalletBody$9$2$1$1$1$1(lVar);
                iVar.p(y11);
            }
            iVar.N();
            WalletModalsKt.WalletBottomSheetContent((a) y11, new AnonymousClass2(this.$showBottomSheetContent, this.$onEditPaymentMethod, this.$it), new AnonymousClass3(this.$showBottomSheetContent, this.$it, this.$cardBeingRemoved$delegate), iVar, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$9$2$1(l<? super q<? super i, ? super c1.i, ? super Integer, b0>, b0> lVar, int i11, l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar2, o0<ConsumerPaymentDetails.Card> o0Var) {
        super(1);
        this.$showBottomSheetContent = lVar;
        this.$$dirty = i11;
        this.$onEditPaymentMethod = lVar2;
        this.$cardBeingRemoved$delegate = o0Var;
    }

    @Override // h00.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo12invoke(ConsumerPaymentDetails.Card card) {
        invoke2(card);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ConsumerPaymentDetails.Card it2) {
        s.g(it2, "it");
        l<q<? super i, ? super c1.i, ? super Integer, b0>, b0> lVar = this.$showBottomSheetContent;
        lVar.mo12invoke(c.c(-985535001, true, new AnonymousClass1(lVar, this.$$dirty, this.$onEditPaymentMethod, it2, this.$cardBeingRemoved$delegate)));
    }
}