package com.stripe.android.link.ui.paymentmethod;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.z;
import androidx.lifecycle.p0;
import androidx.lifecycle.u0;
import c1.e1;
import c1.i;
import c1.n1;
import c1.v1;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.q;
import j1.c;
import java.util.Map;
import kotlin.jvm.internal.s;
import m4.a;
import m4.b;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;

/* loaded from: classes6.dex */
public final class PaymentMethodScreenKt {
    public static final void PaymentMethodBody(LinkAccount linkAccount, NonFallbackInjector injector, i iVar, int i11) {
        int i12;
        s.g(linkAccount, "linkAccount");
        s.g(injector, "injector");
        i h11 = iVar.h(-1025648190);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(linkAccount) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(injector) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            PaymentMethodViewModel.Factory factory = new PaymentMethodViewModel.Factory(linkAccount, injector);
            h11.x(564614654);
            u0 a11 = a.f38401a.a(h11, 0);
            if (a11 != null) {
                p0 b11 = b.b(PaymentMethodViewModel.class, a11, null, factory, h11, 4168, 0);
                h11.N();
                PaymentMethodViewModel paymentMethodViewModel = (PaymentMethodViewModel) b11;
                v1 a12 = n1.a(paymentMethodViewModel.getFormController().getCompleteFormValues(), null, null, h11, 56, 2);
                v1 b12 = n1.b(paymentMethodViewModel.isProcessing(), null, h11, 8, 1);
                v1 b13 = n1.b(paymentMethodViewModel.getErrorMessage(), null, h11, 8, 1);
                boolean m224PaymentMethodBody$lambda1 = m224PaymentMethodBody$lambda1(b12);
                LinkActivityContract.Args args = paymentMethodViewModel.getArgs();
                Resources resources = ((Context) h11.A(z.g())).getResources();
                s.f(resources, "LocalContext.current.resources");
                PaymentMethodBody(m224PaymentMethodBody$lambda1, PrimaryButtonKt.primaryButtonLabel(args, resources), m223PaymentMethodBody$lambda0(a12) != null, m225PaymentMethodBody$lambda2(b13), new PaymentMethodScreenKt$PaymentMethodBody$1(a12, paymentMethodViewModel), new PaymentMethodScreenKt$PaymentMethodBody$2(paymentMethodViewModel), c.b(h11, -819893132, true, new PaymentMethodScreenKt$PaymentMethodBody$3(paymentMethodViewModel)), h11, 1572864);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new PaymentMethodScreenKt$PaymentMethodBody$4(linkAccount, injector, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PaymentMethodBody$lambda-0  reason: not valid java name */
    public static final Map<IdentifierSpec, FormFieldEntry> m223PaymentMethodBody$lambda0(v1<? extends Map<IdentifierSpec, FormFieldEntry>> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: PaymentMethodBody$lambda-1  reason: not valid java name */
    private static final boolean m224PaymentMethodBody$lambda1(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* renamed from: PaymentMethodBody$lambda-2  reason: not valid java name */
    private static final ErrorMessage m225PaymentMethodBody$lambda2(v1<? extends ErrorMessage> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaymentMethodBodyPreview(i iVar, int i11) {
        i h11 = iVar.h(2057343273);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$PaymentMethodScreenKt.INSTANCE.m222getLambda3$link_release(), h11, 48, 1);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new PaymentMethodScreenKt$PaymentMethodBodyPreview$1(i11));
    }

    public static final void PaymentMethodBody(boolean z11, String primaryButtonLabel, boolean z12, ErrorMessage errorMessage, h00.a<b0> onPrimaryButtonClick, h00.a<b0> onPayAnotherWayClick, q<? super p0.i, ? super i, ? super Integer, b0> formContent, i iVar, int i11) {
        int i12;
        s.g(primaryButtonLabel, "primaryButtonLabel");
        s.g(onPrimaryButtonClick, "onPrimaryButtonClick");
        s.g(onPayAnotherWayClick, "onPayAnotherWayClick");
        s.g(formContent, "formContent");
        i h11 = iVar.h(-1025647185);
        if ((i11 & 14) == 0) {
            i12 = (h11.a(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(primaryButtonLabel) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.a(z12) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.O(errorMessage) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h11.O(onPrimaryButtonClick) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= h11.O(onPayAnotherWayClick) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= h11.O(formContent) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i13 = i12;
        if (((2995931 & i13) ^ 599186) == 0 && h11.i()) {
            h11.G();
        } else {
            CommonKt.ScrollableTopLevelColumn(c.b(h11, -819893727, true, new PaymentMethodScreenKt$PaymentMethodBody$5(errorMessage, primaryButtonLabel, z11, z12, onPrimaryButtonClick, i13, onPayAnotherWayClick, formContent)), h11, 6);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new PaymentMethodScreenKt$PaymentMethodBody$6(z11, primaryButtonLabel, z12, errorMessage, onPrimaryButtonClick, onPayAnotherWayClick, formContent, i11));
    }
}