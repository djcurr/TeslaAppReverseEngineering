package com.stripe.android.link.ui.verification;

import c1.i;
import com.stripe.android.link.R;
import com.stripe.android.ui.core.elements.OTPElement;
import com.stripe.android.ui.core.elements.OTPSpec;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$VerificationScreenKt$lambda1$1 extends u implements p<i, Integer, b0> {
    public static final ComposableSingletons$VerificationScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$VerificationScreenKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1$1  reason: invalid class name */
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
    /* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements a<b0> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
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
    /* renamed from: com.stripe.android.link.ui.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends u implements a<b0> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
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

    ComposableSingletons$VerificationScreenKt$lambda1$1() {
        super(2);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            VerificationScreenKt.VerificationBody(R.string.verification_header, R.string.verification_message, true, "+1********23", "test@stripe.com", OTPSpec.INSTANCE.transform(), false, null, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, iVar, (OTPElement.$stable << 15) | 920153472, 6);
        }
    }
}