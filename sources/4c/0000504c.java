package com.stripe.android.link.ui.verification;

import c1.e1;
import c1.i;
import c1.v1;
import com.stripe.android.link.R;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.ui.core.elements.OTPElement;
import d.c;
import h00.a;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;

/* loaded from: classes6.dex */
public final class VerificationScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VerificationBody(int r23, int r24, boolean r25, com.stripe.android.link.model.LinkAccount r26, com.stripe.android.link.injection.NonFallbackInjector r27, h00.a<vz.b0> r28, c1.i r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.verification.VerificationScreenKt.VerificationBody(int, int, boolean, com.stripe.android.link.model.LinkAccount, com.stripe.android.link.injection.NonFallbackInjector, h00.a, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VerificationBody$lambda-0  reason: not valid java name */
    public static final boolean m239VerificationBody$lambda0(v1<Boolean> v1Var) {
        return v1Var.getValue().booleanValue();
    }

    /* renamed from: VerificationBody$lambda-1  reason: not valid java name */
    private static final ErrorMessage m240VerificationBody$lambda1(v1<? extends ErrorMessage> v1Var) {
        return v1Var.getValue();
    }

    public static final void VerificationBodyFullFlow(LinkAccount linkAccount, NonFallbackInjector injector, i iVar, int i11) {
        int i12;
        s.g(linkAccount, "linkAccount");
        s.g(injector, "injector");
        i h11 = iVar.h(1095938633);
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
            int i13 = i12 << 9;
            VerificationBody(R.string.verification_header, R.string.verification_message, true, linkAccount, injector, null, h11, (ConsumerSession.$stable << 9) | 384 | (i13 & 7168) | (i13 & 57344), 32);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new VerificationScreenKt$VerificationBodyFullFlow$1(linkAccount, injector, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerificationBodyPreview(i iVar, int i11) {
        i h11 = iVar.h(1310270572);
        if (i11 == 0 && h11.i()) {
            h11.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$VerificationScreenKt.INSTANCE.m234getLambda2$link_release(), h11, 48, 1);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new VerificationScreenKt$VerificationBodyPreview$1(i11));
    }

    public static final void VerificationBody(int i11, int i12, boolean z11, String redactedPhoneNumber, String email, OTPElement otpElement, boolean z12, ErrorMessage errorMessage, a<b0> onBack, a<b0> onChangeEmailClick, a<b0> onResendCodeClick, i iVar, int i13, int i14) {
        int i15;
        int i16;
        i iVar2;
        s.g(redactedPhoneNumber, "redactedPhoneNumber");
        s.g(email, "email");
        s.g(otpElement, "otpElement");
        s.g(onBack, "onBack");
        s.g(onChangeEmailClick, "onChangeEmailClick");
        s.g(onResendCodeClick, "onResendCodeClick");
        i h11 = iVar.h(1291878275);
        if ((i13 & 14) == 0) {
            i15 = (h11.d(i11) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= h11.d(i12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= h11.a(z11) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i15 |= h11.O(redactedPhoneNumber) ? 2048 : 1024;
        }
        if ((57344 & i13) == 0) {
            i15 |= h11.O(email) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i13) == 0) {
            i15 |= h11.O(otpElement) ? 131072 : 65536;
        }
        if ((3670016 & i13) == 0) {
            i15 |= h11.a(z12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((29360128 & i13) == 0) {
            i15 |= h11.O(errorMessage) ? 8388608 : 4194304;
        }
        if ((i13 & 234881024) == 0) {
            i15 |= h11.O(onBack) ? 67108864 : 33554432;
        }
        if ((i13 & 1879048192) == 0) {
            i15 |= h11.O(onChangeEmailClick) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i17 = i15;
        if ((i14 & 14) == 0) {
            i16 = i14 | (h11.O(onResendCodeClick) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if (((i17 & 1533916891) ^ 306783378) == 0 && ((i16 & 11) ^ 2) == 0 && h11.i()) {
            h11.G();
            iVar2 = h11;
        } else {
            c.a(false, onBack, h11, (i17 >> 21) & 112, 1);
            iVar2 = h11;
            CommonKt.ScrollableTopLevelColumn(j1.c.b(iVar2, -819891553, true, new VerificationScreenKt$VerificationBody$7(i11, i17, i12, redactedPhoneNumber, z11, errorMessage, z12, onResendCodeClick, otpElement, email, onChangeEmailClick)), iVar2, 6);
        }
        e1 l11 = iVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new VerificationScreenKt$VerificationBody$8(i11, i12, z11, redactedPhoneNumber, email, otpElement, z12, errorMessage, onBack, onChangeEmailClick, onResendCodeClick, i13, i14));
    }
}