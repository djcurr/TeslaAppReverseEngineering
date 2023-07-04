package com.stripe.android.link.ui.wallet;

import c1.i;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.a;
import h00.l;
import h00.p;
import h00.q;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import wz.w;

/* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletScreenKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$WalletScreenKt$lambda1$1 extends u implements p<i, Integer, b0> {
    public static final ComposableSingletons$WalletScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$WalletScreenKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletScreenKt$lambda-1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements a<b0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletScreenKt$lambda-1$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements l<ConsumerPaymentDetails.PaymentDetails, b0> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
            invoke2(paymentDetails);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ConsumerPaymentDetails.PaymentDetails it2) {
            s.g(it2, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletScreenKt$lambda-1$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends u implements l<ConsumerPaymentDetails.PaymentDetails, b0> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
            invoke2(paymentDetails);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ConsumerPaymentDetails.PaymentDetails it2) {
            s.g(it2, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletScreenKt$lambda-1$1$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends u implements l<ConsumerPaymentDetails.PaymentDetails, b0> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
            invoke2(paymentDetails);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ConsumerPaymentDetails.PaymentDetails it2) {
            s.g(it2, "it");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletScreenKt$lambda-1$1$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass5 extends u implements a<b0> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(0);
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.wallet.ComposableSingletons$WalletScreenKt$lambda-1$1$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass6 extends u implements l<q<? super p0.i, ? super i, ? super Integer, ? extends b0>, b0> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(q<? super p0.i, ? super i, ? super Integer, ? extends b0> qVar) {
            invoke2((q<? super p0.i, ? super i, ? super Integer, b0>) qVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(q<? super p0.i, ? super i, ? super Integer, b0> qVar) {
        }
    }

    ComposableSingletons$WalletScreenKt$lambda1$1() {
        super(2);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        List l11;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        l11 = w.l(new ConsumerPaymentDetails.Card("id1", true, 2022, 12, CardBrand.Visa, "4242"), new ConsumerPaymentDetails.Card("id2", false, 2023, 11, CardBrand.MasterCard, "4444"));
        WalletScreenKt.WalletBody(false, l11, "Pay $10.99", null, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, AnonymousClass4.INSTANCE, AnonymousClass5.INSTANCE, AnonymousClass6.INSTANCE, iVar, (ConsumerPaymentDetails.Card.$stable << 3) | 920350086);
    }
}