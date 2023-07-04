package com.stripe.android.link.ui.inline;

import c1.i;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.TextFieldController;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkInlineSignupViewKt$LinkInlineSignup$5 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ String $merchantName;
    final /* synthetic */ a<b0> $onUserInteracted;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ SignUpState $signUpState;
    final /* synthetic */ a<b0> $toggleExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupViewKt$LinkInlineSignup$5(String str, TextFieldController textFieldController, PhoneNumberController phoneNumberController, SignUpState signUpState, boolean z11, boolean z12, a<b0> aVar, a<b0> aVar2, int i11) {
        super(2);
        this.$merchantName = str;
        this.$emailController = textFieldController;
        this.$phoneNumberController = phoneNumberController;
        this.$signUpState = signUpState;
        this.$enabled = z11;
        this.$expanded = z12;
        this.$toggleExpanded = aVar;
        this.$onUserInteracted = aVar2;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        LinkInlineSignupViewKt.LinkInlineSignup(this.$merchantName, this.$emailController, this.$phoneNumberController, this.$signUpState, this.$enabled, this.$expanded, this.$toggleExpanded, this.$onUserInteracted, iVar, this.$$changed | 1);
    }
}