package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import c1.i;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.ui.core.PaymentsThemeKt;
import h00.p;
import j1.c;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class USBankAccountFormFragment$renderNameAndEmailCollectionScreen$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ USBankAccountFormScreenState.NameAndEmailCollection $screenState;
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<i, Integer, b0> {
        final /* synthetic */ USBankAccountFormScreenState.NameAndEmailCollection $screenState;
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(USBankAccountFormFragment uSBankAccountFormFragment, USBankAccountFormScreenState.NameAndEmailCollection nameAndEmailCollection) {
            super(2);
            this.this$0 = uSBankAccountFormFragment;
            this.$screenState = nameAndEmailCollection;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                this.this$0.NameAndEmailCollectionScreen(this.$screenState, iVar, 64);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$renderNameAndEmailCollectionScreen$2(USBankAccountFormFragment uSBankAccountFormFragment, USBankAccountFormScreenState.NameAndEmailCollection nameAndEmailCollection) {
        super(2);
        this.this$0 = uSBankAccountFormFragment;
        this.$screenState = nameAndEmailCollection;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            PaymentsThemeKt.PaymentsTheme(null, null, null, c.b(iVar, -819900496, true, new AnonymousClass1(this.this$0, this.$screenState)), iVar, 3072, 7);
        }
    }
}