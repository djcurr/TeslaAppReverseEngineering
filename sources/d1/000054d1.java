package com.stripe.android.paymentsheet;

import androidx.compose.ui.platform.o1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.util.List;

/* loaded from: classes6.dex */
final class PaymentMethodsUIKt$PaymentMethodsUI$3 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ h00.l<LpmRepository.SupportedPaymentMethod, vz.b0> $onItemSelectedListener;
    final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ q0.h $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentMethodsUIKt$PaymentMethodsUI$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.q<p0.f, c1.i, Integer, vz.b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $isEnabled;
        final /* synthetic */ h00.l<LpmRepository.SupportedPaymentMethod, vz.b0> $onItemSelectedListener;
        final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;
        final /* synthetic */ int $selectedIndex;
        final /* synthetic */ q0.h $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentMethodsUIKt$PaymentMethodsUI$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03781 extends kotlin.jvm.internal.u implements h00.l<q0.g, vz.b0> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ boolean $isEnabled;
            final /* synthetic */ h00.l<LpmRepository.SupportedPaymentMethod, vz.b0> $onItemSelectedListener;
            final /* synthetic */ List<LpmRepository.SupportedPaymentMethod> $paymentMethods;
            final /* synthetic */ int $selectedIndex;
            final /* synthetic */ float $viewWidth;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03781(List<? extends LpmRepository.SupportedPaymentMethod> list, int i11, float f11, boolean z11, int i12, h00.l<? super LpmRepository.SupportedPaymentMethod, vz.b0> lVar) {
                super(1);
                this.$paymentMethods = list;
                this.$selectedIndex = i11;
                this.$viewWidth = f11;
                this.$isEnabled = z11;
                this.$$dirty = i12;
                this.$onItemSelectedListener = lVar;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(q0.g gVar) {
                invoke2(gVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(q0.g LazyRow) {
                kotlin.jvm.internal.s.g(LazyRow, "$this$LazyRow");
                List<LpmRepository.SupportedPaymentMethod> list = this.$paymentMethods;
                LazyRow.a(list.size(), null, j1.c.c(-985537359, true, new PaymentMethodsUIKt$PaymentMethodsUI$3$1$1$invoke$$inlined$itemsIndexed$default$2(list, this.$selectedIndex, this.$viewWidth, this.$isEnabled, this.$$dirty, this.$onItemSelectedListener, list)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends LpmRepository.SupportedPaymentMethod> list, q0.h hVar, int i11, boolean z11, int i12, h00.l<? super LpmRepository.SupportedPaymentMethod, vz.b0> lVar) {
            super(3);
            this.$paymentMethods = list;
            this.$state = hVar;
            this.$selectedIndex = i11;
            this.$isEnabled = z11;
            this.$$dirty = i12;
            this.$onItemSelectedListener = lVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(p0.f fVar, c1.i iVar, Integer num) {
            invoke(fVar, iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(p0.f BoxWithConstraints, c1.i iVar, int i11) {
            int i12;
            kotlin.jvm.internal.s.g(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i11 & 14) == 0) {
                i12 = i11 | (iVar.O(BoxWithConstraints) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if (((i12 & 91) ^ 18) == 0 && iVar.i()) {
                iVar.G();
            } else {
                q0.c.b(o1.a(p0.u.l(o1.f.f42062f1, x2.g.f(17.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), PaymentMethodsUIKt.TEST_TAG_LIST), this.$state, null, false, null, null, null, new C03781(this.$paymentMethods, this.$selectedIndex, PaymentMethodsUIKt.m298calculateViewWidthD5KLDUw(BoxWithConstraints.a(), this.$paymentMethods.size()), this.$isEnabled, this.$$dirty, this.$onItemSelectedListener), iVar, 6, 124);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodsUI$3(List<? extends LpmRepository.SupportedPaymentMethod> list, q0.h hVar, int i11, boolean z11, int i12, h00.l<? super LpmRepository.SupportedPaymentMethod, vz.b0> lVar) {
        super(2);
        this.$paymentMethods = list;
        this.$state = hVar;
        this.$selectedIndex = i11;
        this.$isEnabled = z11;
        this.$$dirty = i12;
        this.$onItemSelectedListener = lVar;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            p0.e.a(o1.a(o1.f.f42062f1, "PaymentMethodsUITestTag1"), null, false, j1.c.b(iVar, -819892288, true, new AnonymousClass1(this.$paymentMethods, this.$state, this.$selectedIndex, this.$isEnabled, this.$$dirty, this.$onItemSelectedListener)), iVar, 3078, 6);
        }
    }
}