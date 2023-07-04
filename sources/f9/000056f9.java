package com.stripe.android.paymentsheet.paymentdatacollection;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.lifecycle.s0;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class ComposeFormDataCollectionFragment$formViewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ ComposeFormDataCollectionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ComposeFormDataCollectionFragment$formViewModel$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements h00.a<Context> {
        final /* synthetic */ ComposeFormDataCollectionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposeFormDataCollectionFragment composeFormDataCollectionFragment) {
            super(0);
            this.this$0 = composeFormDataCollectionFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Context invoke() {
            Context requireContext = this.this$0.requireContext();
            s.f(requireContext, "requireContext()");
            return requireContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeFormDataCollectionFragment$formViewModel$2(ComposeFormDataCollectionFragment composeFormDataCollectionFragment) {
        super(0);
        this.this$0 = composeFormDataCollectionFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        String paymentMethodCode;
        Resources resources = this.this$0.getResources();
        paymentMethodCode = this.this$0.getPaymentMethodCode();
        Parcelable parcelable = this.this$0.requireArguments().getParcelable(ComposeFormDataCollectionFragment.EXTRA_CONFIG);
        if (parcelable != null) {
            s.f(resources, "resources");
            return new FormViewModel.Factory((FormFragmentArguments) parcelable, resources, paymentMethodCode, new AnonymousClass1(this.this$0));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}