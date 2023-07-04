package com.stripe.android.link.ui.cardedit;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import androidx.lifecycle.p0;
import androidx.lifecycle.u0;
import c1.a2;
import c1.e;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import c1.n1;
import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.cardedit.CardEditViewModel;
import com.stripe.android.link.ui.forms.FormController;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import f2.u;
import f2.z;
import h00.l;
import h2.a;
import java.util.Map;
import kotlin.jvm.internal.s;
import m4.a;
import m4.b;
import o1.f;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p0.c;
import p0.e0;
import vz.b0;
import x2.d;
import x2.q;
import y0.s0;

/* loaded from: classes6.dex */
public final class CardEditScreenKt {
    public static final void CardEditBody(LinkAccount linkAccount, NonFallbackInjector injector, String paymentDetailsId, i iVar, int i11) {
        int i12;
        s.g(linkAccount, "linkAccount");
        s.g(injector, "injector");
        s.g(paymentDetailsId, "paymentDetailsId");
        i h11 = iVar.h(473598767);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(linkAccount) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(injector) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(paymentDetailsId) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
        } else {
            CardEditViewModel.Factory factory = new CardEditViewModel.Factory(linkAccount, injector, paymentDetailsId);
            h11.x(564614654);
            u0 a11 = a.f38401a.a(h11, 0);
            if (a11 != null) {
                p0 b11 = b.b(CardEditViewModel.class, a11, null, factory, h11, 4168, 0);
                h11.N();
                CardEditViewModel cardEditViewModel = (CardEditViewModel) b11;
                v1 b12 = n1.b(cardEditViewModel.getFormController(), null, h11, 8, 1);
                if (m201CardEditBody$lambda0(b12) == null) {
                    h11.x(473599126);
                    f n11 = e0.n(e0.j(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                    o1.a d11 = o1.a.f42039a.d();
                    h11.x(-1990474327);
                    z i13 = c.i(d11, false, h11, 6);
                    h11.x(1376089394);
                    d dVar = (d) h11.A(l0.d());
                    q qVar = (q) h11.A(l0.i());
                    y1 y1Var = (y1) h11.A(l0.m());
                    a.C0551a c0551a = h2.a.Y0;
                    h00.a<h2.a> a12 = c0551a.a();
                    h00.q<g1<h2.a>, i, Integer, b0> b13 = u.b(n11);
                    if (!(h11.k() instanceof e)) {
                        h.c();
                    }
                    h11.D();
                    if (h11.f()) {
                        h11.s(a12);
                    } else {
                        h11.o();
                    }
                    h11.E();
                    i a13 = a2.a(h11);
                    a2.c(a13, i13, c0551a.d());
                    a2.c(a13, dVar, c0551a.b());
                    a2.c(a13, qVar, c0551a.c());
                    a2.c(a13, y1Var, c0551a.f());
                    h11.c();
                    b13.invoke(g1.a(g1.b(h11)), h11, 0);
                    h11.x(2058660585);
                    h11.x(-1253629305);
                    p0.d dVar2 = p0.d.f45270a;
                    s0.a(null, 0L, BitmapDescriptorFactory.HUE_RED, h11, 0, 7);
                    h11.N();
                    h11.N();
                    h11.q();
                    h11.N();
                    h11.N();
                    h11.N();
                } else {
                    h11.x(473599360);
                    FormController m201CardEditBody$lambda0 = m201CardEditBody$lambda0(b12);
                    if (m201CardEditBody$lambda0 != null) {
                        v1 a14 = n1.a(m201CardEditBody$lambda0.getCompleteFormValues(), null, null, h11, 56, 2);
                        v1 b14 = n1.b(cardEditViewModel.isProcessing(), null, h11, 8, 1);
                        v1 b15 = n1.b(cardEditViewModel.getErrorMessage(), null, h11, 8, 1);
                        v1 b16 = n1.b(cardEditViewModel.getSetAsDefault(), null, h11, 8, 1);
                        CardEditBody(m204CardEditBody$lambda6$lambda3(b14), cardEditViewModel.isDefault(), m206CardEditBody$lambda6$lambda5(b16), m203CardEditBody$lambda6$lambda2(a14) != null, m205CardEditBody$lambda6$lambda4(b15), new CardEditScreenKt$CardEditBody$2$1(cardEditViewModel), new CardEditScreenKt$CardEditBody$2$2(a14, cardEditViewModel), new CardEditScreenKt$CardEditBody$2$3(cardEditViewModel), j1.c.b(h11, -819893800, true, new CardEditScreenKt$CardEditBody$2$4(m201CardEditBody$lambda0, cardEditViewModel)), h11, 100663296);
                    }
                    h11.N();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CardEditScreenKt$CardEditBody$3(linkAccount, injector, paymentDetailsId, i11));
    }

    /* renamed from: CardEditBody$lambda-0  reason: not valid java name */
    private static final FormController m201CardEditBody$lambda0(v1<FormController> v1Var) {
        return v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CardEditBody$lambda-6$lambda-2  reason: not valid java name */
    public static final Map<IdentifierSpec, FormFieldEntry> m203CardEditBody$lambda6$lambda2(v1<? extends Map<IdentifierSpec, FormFieldEntry>> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: CardEditBody$lambda-6$lambda-3  reason: not valid java name */
    private static final boolean m204CardEditBody$lambda6$lambda3(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* renamed from: CardEditBody$lambda-6$lambda-4  reason: not valid java name */
    private static final ErrorMessage m205CardEditBody$lambda6$lambda4(v1<? extends ErrorMessage> v1Var) {
        return v1Var.getValue();
    }

    /* renamed from: CardEditBody$lambda-6$lambda-5  reason: not valid java name */
    private static final boolean m206CardEditBody$lambda6$lambda5(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    public static final void CardEditPreview(i iVar, int i11) {
        i h11 = iVar.h(1261811168);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$CardEditScreenKt.INSTANCE.m211getLambda3$link_release(), h11, 48, 1);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CardEditScreenKt$CardEditPreview$1(i11));
    }

    public static final void CardEditBody(boolean z11, boolean z12, boolean z13, boolean z14, ErrorMessage errorMessage, l<? super Boolean, b0> onSetAsDefaultClick, h00.a<b0> onPrimaryButtonClick, h00.a<b0> onCancelClick, h00.q<? super p0.i, ? super i, ? super Integer, b0> formContent, i iVar, int i11) {
        int i12;
        i iVar2;
        s.g(onSetAsDefaultClick, "onSetAsDefaultClick");
        s.g(onPrimaryButtonClick, "onPrimaryButtonClick");
        s.g(onCancelClick, "onCancelClick");
        s.g(formContent, "formContent");
        i h11 = iVar.h(473600415);
        if ((i11 & 14) == 0) {
            i12 = (h11.a(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.a(z12) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.a(z13) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.a(z14) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h11.O(errorMessage) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= h11.O(onSetAsDefaultClick) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= h11.O(onPrimaryButtonClick) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((29360128 & i11) == 0) {
            i12 |= h11.O(onCancelClick) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i12 |= h11.O(formContent) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if (((191739611 & i13) ^ 38347922) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            iVar2 = h11;
            CommonKt.ScrollableTopLevelColumn(j1.c.b(iVar2, -819890199, true, new CardEditScreenKt$CardEditBody$4(z12, onSetAsDefaultClick, z13, i13, errorMessage, z11, z14, onPrimaryButtonClick, onCancelClick, formContent)), iVar2, 6);
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CardEditScreenKt$CardEditBody$5(z11, z12, z13, z14, errorMessage, onSetAsDefaultClick, onPrimaryButtonClick, onCancelClick, formContent, i11));
    }
}