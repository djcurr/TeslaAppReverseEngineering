package com.stripe.android.ui.core.elements;

import c1.i;
import c1.o0;
import c1.v1;
import h00.p;
import h00.q;
import k0.c;
import k0.d;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.v;
import vz.b0;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$2$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ o0<Boolean> $hasFocus$delegate;
    final /* synthetic */ v1<Integer> $label$delegate;
    final /* synthetic */ v1<String> $value$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$2$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements q<d, i, Integer, b0> {
        final /* synthetic */ v1<Integer> $label$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(v1<Integer> v1Var) {
            super(3);
            this.$label$delegate = v1Var;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ b0 invoke(d dVar, i iVar, Integer num) {
            invoke(dVar, iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(d AnimatedVisibility, i iVar, int i11) {
            int m461PhoneNumberElementUI$lambda6;
            s.g(AnimatedVisibility, "$this$AnimatedVisibility");
            m461PhoneNumberElementUI$lambda6 = PhoneNumberElementUIKt.m461PhoneNumberElementUI$lambda6(this.$label$delegate);
            FormLabelKt.FormLabel(e.b(m461PhoneNumberElementUI$lambda6, iVar, 0), null, false, iVar, 0, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$2$2(o0<Boolean> o0Var, v1<String> v1Var, v1<Integer> v1Var2) {
        super(2);
        this.$hasFocus$delegate = o0Var;
        this.$value$delegate = v1Var;
        this.$label$delegate = v1Var2;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        boolean m456PhoneNumberElementUI$lambda11;
        String m459PhoneNumberElementUI$lambda4;
        boolean w11;
        if (((i11 & 11) ^ 2) != 0 || !iVar.i()) {
            m456PhoneNumberElementUI$lambda11 = PhoneNumberElementUIKt.m456PhoneNumberElementUI$lambda11(this.$hasFocus$delegate);
            if (!m456PhoneNumberElementUI$lambda11) {
                m459PhoneNumberElementUI$lambda4 = PhoneNumberElementUIKt.m459PhoneNumberElementUI$lambda4(this.$value$delegate);
                w11 = v.w(m459PhoneNumberElementUI$lambda4);
                if (!(!w11)) {
                    iVar.x(-44563785);
                    c.c(true, null, null, null, null, j1.c.b(iVar, -819893992, true, new AnonymousClass1(this.$label$delegate)), iVar, 196614, 30);
                    iVar.N();
                    return;
                }
            }
            iVar.x(-44563945);
            o1.b("", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 6, 0, 65534);
            iVar.N();
            return;
        }
        iVar.G();
    }
}