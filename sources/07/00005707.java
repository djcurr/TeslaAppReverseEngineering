package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.s0;
import androidx.lifecycle.w;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.i;
import c1.n1;
import c1.o0;
import c1.s1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.elements.H6TextKt;
import com.stripe.android.ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.ui.core.elements.SaveForFutureUseElementUIKt;
import com.stripe.android.ui.core.elements.SectionUIKt;
import com.stripe.android.ui.core.elements.SimpleDialogElementUIKt;
import com.stripe.android.ui.core.elements.TextFieldController;
import com.stripe.android.ui.core.elements.TextFieldUIKt;
import f2.z;
import h2.a;
import j1.c;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.text.o;
import o1.a;
import o1.f;
import p0.a;
import p0.h;
import p0.j;
import p0.u;
import s2.l;
import vz.b0;
import vz.k;
import vz.m;
import x2.d;
import x2.g;
import x2.q;

/* loaded from: classes6.dex */
public final class USBankAccountFormFragment extends Fragment {
    private final k clientSecret$delegate;
    private final k completePayment$delegate;
    private final k formArgs$delegate;
    private final k paymentOptionsViewModelFactory$delegate;
    private final k paymentSheetViewModelFactory$delegate;
    private final k sheetViewModel$delegate;
    private final k viewModel$delegate;

    public USBankAccountFormFragment() {
        k a11;
        k a12;
        k a13;
        k a14;
        k a15;
        k a16;
        a11 = m.a(new USBankAccountFormFragment$formArgs$2(this));
        this.formArgs$delegate = a11;
        a12 = m.a(new USBankAccountFormFragment$paymentSheetViewModelFactory$2(this));
        this.paymentSheetViewModelFactory$delegate = a12;
        a13 = m.a(new USBankAccountFormFragment$paymentOptionsViewModelFactory$2(this));
        this.paymentOptionsViewModelFactory$delegate = a13;
        a14 = m.a(new USBankAccountFormFragment$sheetViewModel$2(this));
        this.sheetViewModel$delegate = a14;
        a15 = m.a(new USBankAccountFormFragment$completePayment$2(this));
        this.completePayment$delegate = a15;
        a16 = m.a(new USBankAccountFormFragment$clientSecret$2(this));
        this.clientSecret$delegate = a16;
        this.viewModel$delegate = e0.a(this, m0.b(USBankAccountFormViewModel.class), new USBankAccountFormFragment$special$$inlined$viewModels$default$2(new USBankAccountFormFragment$special$$inlined$viewModels$default$1(this)), new USBankAccountFormFragment$viewModel$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AccountDetailsForm(String str, String str2, boolean z11, i iVar, int i11) {
        i h11 = iVar.h(-1523209113);
        h11.x(-3687241);
        Object y11 = h11.y();
        i.a aVar = i.f8486a;
        if (y11 == aVar.a()) {
            y11 = s1.d(Boolean.FALSE, null, 2, null);
            h11.p(y11);
        }
        h11.N();
        o0 o0Var = (o0) y11;
        int invoke = TransformToBankIcon.Companion.invoke(str);
        v1 a11 = n1.a(getViewModel().getProcessing(), Boolean.FALSE, null, h11, 56, 2);
        f.a aVar2 = f.f42062f1;
        float f11 = 8;
        f l11 = u.l(p0.e0.n(aVar2, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, g.f(f11), 7, null);
        h11.x(-1113030915);
        z a12 = h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a13 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(l11);
        if (!(h11.k() instanceof e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a13);
        } else {
            h11.o();
        }
        h11.E();
        i a14 = a2.a(h11);
        a2.c(a14, a12, c0551a.d());
        a2.c(a14, dVar, c0551a.b());
        a2.c(a14, qVar, c0551a.c());
        a2.c(a14, y1Var, c0551a.f());
        h11.c();
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        H6TextKt.H6Text(k2.e.b(R.string.title_bank_account, h11, 0), u.j(aVar2, BitmapDescriptorFactory.HUE_RED, g.f(f11), 1, null), h11, 48, 0);
        SectionUIKt.SectionCard(p0.e0.n(aVar2, BitmapDescriptorFactory.HUE_RED, 1, null), false, c.b(h11, -819911016, true, new USBankAccountFormFragment$AccountDetailsForm$1$1(a11, o0Var, invoke, str, str2)), h11, 390, 2);
        h11.x(-1523206820);
        if (getFormArgs().getShowCheckbox()) {
            SaveForFutureUseElement saveForFutureUseElement = getViewModel().getSaveForFutureUseElement();
            saveForFutureUseElement.getController().onValueChange(z11);
            b0 b0Var = b0.f54756a;
            SaveForFutureUseElementUIKt.SaveForFutureUseElementUI(true, saveForFutureUseElement, h11, (SaveForFutureUseElement.$stable << 3) | 6);
        }
        h11.N();
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        if (str2 != null) {
            String b12 = k2.e.b(R.string.stripe_paymentsheet_remove_bank_account_title, h11, 0);
            String c11 = k2.e.c(R.string.bank_account_ending_in, new Object[]{str2}, h11, 64);
            String b13 = k2.e.b(R.string.remove, h11, 0);
            String b14 = k2.e.b(R.string.cancel, h11, 0);
            USBankAccountFormFragment$AccountDetailsForm$2$1 uSBankAccountFormFragment$AccountDetailsForm$2$1 = new USBankAccountFormFragment$AccountDetailsForm$2$1(o0Var, this);
            h11.x(-3686930);
            boolean O = h11.O(o0Var);
            Object y12 = h11.y();
            if (O || y12 == aVar.a()) {
                y12 = new USBankAccountFormFragment$AccountDetailsForm$2$2$1(o0Var);
                h11.p(y12);
            }
            h11.N();
            SimpleDialogElementUIKt.SimpleDialogElementUI(o0Var, b12, c11, b13, b14, uSBankAccountFormFragment$AccountDetailsForm$2$1, (h00.a) y12, h11, 6, 0);
        }
        e1 l12 = h11.l();
        if (l12 == null) {
            return;
        }
        l12.a(new USBankAccountFormFragment$AccountDetailsForm$3(this, str, str2, z11, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MandateCollectionScreen(USBankAccountFormScreenState.MandateCollection mandateCollection, i iVar, int i11) {
        i h11 = iVar.h(883832852);
        f n11 = p0.e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
        h11.x(-1113030915);
        z a11 = h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(n11);
        if (!(h11.k() instanceof e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a12);
        } else {
            h11.o();
        }
        h11.E();
        i a13 = a2.a(h11);
        a2.c(a13, a11, c0551a.d());
        a2.c(a13, dVar, c0551a.b());
        a2.c(a13, qVar, c0551a.c());
        a2.c(a13, y1Var, c0551a.f());
        h11.c();
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        NameAndEmailForm(mandateCollection.getName(), mandateCollection.getEmail(), h11, 512);
        AccountDetailsForm(mandateCollection.getPaymentAccount().getInstitutionName(), mandateCollection.getPaymentAccount().getLast4(), mandateCollection.getSaveForFutureUsage(), h11, 4096);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new USBankAccountFormFragment$MandateCollectionScreen$2(this, mandateCollection, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void NameAndEmailCollectionScreen(USBankAccountFormScreenState.NameAndEmailCollection nameAndEmailCollection, i iVar, int i11) {
        i h11 = iVar.h(-1080899810);
        f n11 = p0.e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
        h11.x(-1113030915);
        z a11 = h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(n11);
        if (!(h11.k() instanceof e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a12);
        } else {
            h11.o();
        }
        h11.E();
        i a13 = a2.a(h11);
        a2.c(a13, a11, c0551a.d());
        a2.c(a13, dVar, c0551a.b());
        a2.c(a13, qVar, c0551a.c());
        a2.c(a13, y1Var, c0551a.f());
        h11.c();
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        NameAndEmailForm(nameAndEmailCollection.getName(), nameAndEmailCollection.getEmail(), h11, 512);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new USBankAccountFormFragment$NameAndEmailCollectionScreen$2(this, nameAndEmailCollection, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void NameAndEmailForm(String str, String str2, i iVar, int i11) {
        i h11 = iVar.h(1824671501);
        v1 a11 = n1.a(getViewModel().getProcessing(), Boolean.FALSE, null, h11, 56, 2);
        f.a aVar = f.f42062f1;
        f n11 = p0.e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null);
        h11.x(-1113030915);
        a.k h12 = p0.a.f45228a.h();
        a.C0826a c0826a = o1.a.f42039a;
        z a12 = h.a(h12, c0826a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a13 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(n11);
        if (!(h11.k() instanceof e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a13);
        } else {
            h11.o();
        }
        h11.E();
        i a14 = a2.a(h11);
        a2.c(a14, a12, c0551a.d());
        a2.c(a14, dVar, c0551a.b());
        a2.c(a14, qVar, c0551a.c());
        a2.c(a14, y1Var, c0551a.f());
        h11.c();
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        H6TextKt.H6Text(k2.e.b(R.string.stripe_paymentsheet_pay_with_bank_title, h11, 0), u.l(aVar, BitmapDescriptorFactory.HUE_RED, g.f(16), BitmapDescriptorFactory.HUE_RED, g.f(8), 5, null), h11, 48, 0);
        float f11 = 0;
        f h13 = u.h(p0.e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(f11));
        o1.a e11 = c0826a.e();
        h11.x(-1990474327);
        z i12 = p0.c.i(e11, false, h11, 6);
        h11.x(1376089394);
        d dVar2 = (d) h11.A(l0.d());
        q qVar2 = (q) h11.A(l0.i());
        y1 y1Var2 = (y1) h11.A(l0.m());
        h00.a<h2.a> a15 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b12 = f2.u.b(h13);
        if (!(h11.k() instanceof e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a15);
        } else {
            h11.o();
        }
        h11.E();
        i a16 = a2.a(h11);
        a2.c(a16, i12, c0551a.d());
        a2.c(a16, dVar2, c0551a.b());
        a2.c(a16, qVar2, c0551a.c());
        a2.c(a16, y1Var2, c0551a.f());
        h11.c();
        b12.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(-1253629305);
        p0.d dVar3 = p0.d.f45270a;
        TextFieldController nameController = getViewModel().getNameController();
        nameController.onRawValueChange(str);
        b0 b0Var = b0.f54756a;
        l.a aVar2 = l.f50115b;
        TextFieldUIKt.m478TextFieldSectionVyDzSTg(nameController, null, null, aVar2.d(), !((Boolean) a11.getValue()).booleanValue(), null, h11, 8, 38);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        f h14 = u.h(p0.e0.n(aVar, BitmapDescriptorFactory.HUE_RED, 1, null), g.f(f11));
        o1.a e12 = c0826a.e();
        h11.x(-1990474327);
        z i13 = p0.c.i(e12, false, h11, 6);
        h11.x(1376089394);
        d dVar4 = (d) h11.A(l0.d());
        q qVar3 = (q) h11.A(l0.i());
        y1 y1Var3 = (y1) h11.A(l0.m());
        h00.a<h2.a> a17 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b13 = f2.u.b(h14);
        if (!(h11.k() instanceof e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a17);
        } else {
            h11.o();
        }
        h11.E();
        i a18 = a2.a(h11);
        a2.c(a18, i13, c0551a.d());
        a2.c(a18, dVar4, c0551a.b());
        a2.c(a18, qVar3, c0551a.c());
        a2.c(a18, y1Var3, c0551a.f());
        h11.c();
        b13.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(-1253629305);
        TextFieldController emailController = getViewModel().getEmailController();
        emailController.onRawValueChange(str2 == null ? "" : str2);
        TextFieldUIKt.m478TextFieldSectionVyDzSTg(emailController, null, null, aVar2.b(), !((Boolean) a11.getValue()).booleanValue(), null, h11, 8, 38);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new USBankAccountFormFragment$NameAndEmailForm$2(this, str, str2, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void SavedAccountScreen(USBankAccountFormScreenState.SavedAccount savedAccount, i iVar, int i11) {
        i h11 = iVar.h(-1422679983);
        f n11 = p0.e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
        h11.x(-1113030915);
        z a11 = h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(n11);
        if (!(h11.k() instanceof e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a12);
        } else {
            h11.o();
        }
        h11.E();
        i a13 = a2.a(h11);
        a2.c(a13, a11, c0551a.d());
        a2.c(a13, dVar, c0551a.b());
        a2.c(a13, qVar, c0551a.c());
        a2.c(a13, y1Var, c0551a.f());
        h11.c();
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        NameAndEmailForm(savedAccount.getName(), savedAccount.getEmail(), h11, 512);
        AccountDetailsForm(savedAccount.getBankName(), savedAccount.getLast4(), savedAccount.getSaveForFutureUsage(), h11, 4096);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new USBankAccountFormFragment$SavedAccountScreen$2(this, savedAccount, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void VerifyWithMicrodepositsScreen(USBankAccountFormScreenState.VerifyWithMicrodeposits verifyWithMicrodeposits, i iVar, int i11) {
        i h11 = iVar.h(-919011923);
        f n11 = p0.e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
        h11.x(-1113030915);
        z a11 = h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), h11, 0);
        h11.x(1376089394);
        d dVar = (d) h11.A(l0.d());
        q qVar = (q) h11.A(l0.i());
        y1 y1Var = (y1) h11.A(l0.m());
        a.C0551a c0551a = h2.a.Y0;
        h00.a<h2.a> a12 = c0551a.a();
        h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(n11);
        if (!(h11.k() instanceof e)) {
            c1.h.c();
        }
        h11.D();
        if (h11.f()) {
            h11.s(a12);
        } else {
            h11.o();
        }
        h11.E();
        i a13 = a2.a(h11);
        a2.c(a13, a11, c0551a.d());
        a2.c(a13, dVar, c0551a.b());
        a2.c(a13, qVar, c0551a.c());
        a2.c(a13, y1Var, c0551a.f());
        h11.c();
        b11.invoke(g1.a(g1.b(h11)), h11, 0);
        h11.x(2058660585);
        h11.x(276693625);
        j jVar = j.f45341a;
        NameAndEmailForm(verifyWithMicrodeposits.getName(), verifyWithMicrodeposits.getEmail(), h11, 512);
        AccountDetailsForm(verifyWithMicrodeposits.getPaymentAccount().getBankName(), verifyWithMicrodeposits.getPaymentAccount().getLast4(), verifyWithMicrodeposits.getSaveForFutureUsage(), h11, 4096);
        h11.N();
        h11.N();
        h11.q();
        h11.N();
        h11.N();
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new USBankAccountFormFragment$VerifyWithMicrodepositsScreen$2(this, verifyWithMicrodeposits, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClientSecret getClientSecret() {
        return (ClientSecret) this.clientSecret$delegate.getValue();
    }

    private final boolean getCompletePayment() {
        return ((Boolean) this.completePayment$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormFragmentArguments getFormArgs() {
        return (FormFragmentArguments) this.formArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0.b getPaymentOptionsViewModelFactory() {
        return (s0.b) this.paymentOptionsViewModelFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0.b getPaymentSheetViewModelFactory() {
        return (s0.b) this.paymentSheetViewModelFactory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseSheetViewModel<?> getSheetViewModel() {
        return (BaseSheetViewModel) this.sheetViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final USBankAccountFormViewModel getViewModel() {
        return (USBankAccountFormViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderMandateCollectionScreen(ComposeView composeView, USBankAccountFormScreenState.MandateCollection mandateCollection) {
        composeView.setContent(c.c(-985540062, true, new USBankAccountFormFragment$renderMandateCollectionScreen$1(this, mandateCollection)));
        updatePrimaryButton$default(this, mandateCollection.getPrimaryButtonText(), new USBankAccountFormFragment$renderMandateCollectionScreen$2(this, mandateCollection), getCompletePayment(), false, false, 24, null);
        updateMandateText(mandateCollection.getMandateText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Type inference failed for: r4v2, types: [h00.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object renderNameAndEmailCollectionScreen(androidx.compose.ui.platform.ComposeView r17, com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState.NameAndEmailCollection r18, v20.o0 r19, zz.d<? super vz.b0> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$1
            if (r3 == 0) goto L19
            r3 = r2
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$1 r3 = (com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$1 r3 = new com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = a00.b.d()
            int r5 = r3.label
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L4c
            if (r5 != r7) goto L44
            int r1 = r3.I$0
            java.lang.Object r4 = r3.L$3
            h00.a r4 = (h00.a) r4
            java.lang.Object r5 = r3.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r3.L$1
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment r8 = (com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment) r8
            java.lang.Object r3 = r3.L$0
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment r3 = (com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment) r3
            vz.r.b(r2)
            r10 = r4
            r9 = r5
            goto L8c
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L4c:
            vz.r.b(r2)
            r2 = -985540511(0xffffffffc541d861, float:-3101.5237)
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$2 r5 = new com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$2
            r5.<init>(r0, r1)
            j1.a r2 = j1.c.c(r2, r7, r5)
            r5 = r17
            r5.setContent(r2)
            java.lang.String r5 = r18.getPrimaryButtonText()
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$3 r2 = new com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$renderNameAndEmailCollectionScreen$3
            r2.<init>(r0, r1)
            com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel r1 = r16.getViewModel()
            kotlinx.coroutines.flow.e r1 = r1.getRequiredFields()
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r5
            r3.L$3 = r2
            r3.I$0 = r6
            r3.label = r7
            r8 = r19
            java.lang.Object r1 = kotlinx.coroutines.flow.g.D(r1, r8, r3)
            if (r1 != r4) goto L86
            return r4
        L86:
            r3 = r0
            r8 = r3
            r10 = r2
            r9 = r5
            r2 = r1
            r1 = r6
        L8c:
            if (r1 == 0) goto L90
            r11 = r7
            goto L91
        L90:
            r11 = r6
        L91:
            kotlinx.coroutines.flow.h0 r2 = (kotlinx.coroutines.flow.h0) r2
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r12 = r1.booleanValue()
            r13 = 0
            r14 = 20
            r15 = 0
            updatePrimaryButton$default(r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 0
            r3.updateMandateText(r1)
            vz.b0 r1 = vz.b0.f54756a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.renderNameAndEmailCollectionScreen(androidx.compose.ui.platform.ComposeView, com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState$NameAndEmailCollection, v20.o0, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderSavedAccountScreen(ComposeView composeView, USBankAccountFormScreenState.SavedAccount savedAccount) {
        composeView.setContent(c.c(-985538904, true, new USBankAccountFormFragment$renderSavedAccountScreen$1(this, savedAccount)));
        updatePrimaryButton$default(this, savedAccount.getPrimaryButtonText(), new USBankAccountFormFragment$renderSavedAccountScreen$2(this, savedAccount), getCompletePayment(), false, false, 24, null);
        updateMandateText(savedAccount.getMandateText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderVerifyWithMicrodepositsScreen(ComposeView composeView, USBankAccountFormScreenState.VerifyWithMicrodeposits verifyWithMicrodeposits) {
        composeView.setContent(c.c(-985539347, true, new USBankAccountFormFragment$renderVerifyWithMicrodepositsScreen$1(this, verifyWithMicrodeposits)));
        updatePrimaryButton$default(this, verifyWithMicrodeposits.getPrimaryButtonText(), new USBankAccountFormFragment$renderVerifyWithMicrodepositsScreen$2(this, verifyWithMicrodeposits), getCompletePayment(), false, false, 24, null);
        updateMandateText(verifyWithMicrodeposits.getMandateText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMandateText(String str) {
        String f11;
        String string = getViewModel().getCurrentScreenState().getValue() instanceof USBankAccountFormScreenState.VerifyWithMicrodeposits ? getString(R.string.stripe_paymentsheet_microdeposit, getViewModel().formattedMerchantName()) : "";
        s.f(string, "if (viewModel.currentScr…  )\n            } else \"\"");
        if (str == null) {
            f11 = null;
        } else {
            f11 = o.f("\n                " + string + "\n                \n                " + ((Object) str) + "\n            ");
        }
        String str2 = f11 != null ? f11 : null;
        BaseSheetViewModel<?> sheetViewModel = getSheetViewModel();
        if (sheetViewModel == null) {
            return;
        }
        sheetViewModel.updateBelowButtonText(str2);
    }

    private final void updatePrimaryButton(String str, h00.a<b0> aVar, boolean z11, boolean z12, boolean z13) {
        BaseSheetViewModel<?> sheetViewModel = getSheetViewModel();
        if (sheetViewModel != null) {
            sheetViewModel.updatePrimaryButtonState(PrimaryButton.State.Ready.INSTANCE);
        }
        BaseSheetViewModel<?> sheetViewModel2 = getSheetViewModel();
        if (sheetViewModel2 == null) {
            return;
        }
        sheetViewModel2.updatePrimaryButtonUIState(new PrimaryButton.UIState(str, new USBankAccountFormFragment$updatePrimaryButton$1(z11, this, aVar), z12, z13));
    }

    static /* synthetic */ void updatePrimaryButton$default(USBankAccountFormFragment uSBankAccountFormFragment, String str, h00.a aVar, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        uSBankAccountFormFragment.updatePrimaryButton(str, aVar, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? true : z13);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getViewModel().registerFragment(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        s.g(inflater, "inflater");
        Context context = inflater.getContext();
        s.f(context, "inflater.context");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v20.k.d(w.a(this), null, null, new USBankAccountFormFragment$onCreateView$1$1(this, null), 3, null);
        v20.k.d(w.a(this), null, null, new USBankAccountFormFragment$onCreateView$1$2(this, null), 3, null);
        v20.k.d(w.a(this), null, null, new USBankAccountFormFragment$onCreateView$1$3(this, null), 3, null);
        v20.k.d(w.a(this), null, null, new USBankAccountFormFragment$onCreateView$1$4(this, composeView, null), 3, null);
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        BaseSheetViewModel<?> sheetViewModel = getSheetViewModel();
        if (sheetViewModel != null) {
            sheetViewModel.setUsBankAccountSavedScreenState(getViewModel().getCurrentScreenState().getValue().updateInputs(getViewModel().getName().getValue(), getViewModel().getEmail().getValue(), getViewModel().getSaveForFutureUse().getValue().booleanValue()));
        }
        BaseSheetViewModel<?> sheetViewModel2 = getSheetViewModel();
        if (sheetViewModel2 != null) {
            sheetViewModel2.updateBelowButtonText(null);
        }
        BaseSheetViewModel<?> sheetViewModel3 = getSheetViewModel();
        if (sheetViewModel3 != null) {
            sheetViewModel3.updatePrimaryButtonUIState(null);
        }
        getViewModel().onDestroy();
        super.onDetach();
    }
}