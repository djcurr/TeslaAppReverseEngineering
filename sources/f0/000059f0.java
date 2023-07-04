package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import com.stripe.android.view.BecsDebitBanks;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import vz.b0;
import vz.p;

/* loaded from: classes6.dex */
public final class BsbElement extends FormElement {
    public static final int $stable = 8;
    private final e<String> bankName;
    private final List<BecsDebitBanks.Bank> banks;
    private final IdentifierSpec identifierSpec;
    private final SimpleTextElement textElement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbElement(IdentifierSpec identifierSpec, List<BecsDebitBanks.Bank> banks, String str) {
        super(null);
        s.g(identifierSpec, "identifierSpec");
        s.g(banks, "banks");
        this.identifierSpec = identifierSpec;
        this.banks = banks;
        SimpleTextElement simpleTextElement = new SimpleTextElement(IdentifierSpec.Companion.Generic("au_becs_debit[bsb_number]"), new SimpleTextFieldController(new BsbConfig(banks), false, str, 2, null));
        this.textElement = simpleTextElement;
        final e<String> fieldValue = simpleTextElement.getController().getFieldValue();
        this.bankName = new e<String>() { // from class: com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ BsbElement this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2", f = "BsbElement.kt", l = {234}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zz.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, BsbElement bsbElement) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = bsbElement;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r11, zz.d r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1$2$1
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r12)
                        goto L95
                    L29:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L31:
                        vz.r.b(r12)
                        kotlinx.coroutines.flow.f r12 = r10.$this_unsafeFlow
                        java.lang.String r11 = (java.lang.String) r11
                        com.stripe.android.ui.core.elements.BsbElement r2 = r10.this$0
                        java.util.List r2 = com.stripe.android.ui.core.elements.BsbElement.access$getBanks$p(r2)
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        java.util.Iterator r2 = r2.iterator()
                    L47:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L65
                        java.lang.Object r5 = r2.next()
                        r6 = r5
                        com.stripe.android.view.BecsDebitBanks$Bank r6 = (com.stripe.android.view.BecsDebitBanks.Bank) r6
                        java.lang.String r6 = r6.getPrefix()
                        r7 = 0
                        r8 = 2
                        r9 = 0
                        boolean r6 = kotlin.text.m.H(r11, r6, r7, r8, r9)
                        if (r6 == 0) goto L47
                        r4.add(r5)
                        goto L47
                    L65:
                        java.util.ArrayList r11 = new java.util.ArrayList
                        r2 = 10
                        int r2 = wz.u.t(r4, r2)
                        r11.<init>(r2)
                        java.util.Iterator r2 = r4.iterator()
                    L74:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L88
                        java.lang.Object r4 = r2.next()
                        com.stripe.android.view.BecsDebitBanks$Bank r4 = (com.stripe.android.view.BecsDebitBanks.Bank) r4
                        java.lang.String r4 = r4.getName()
                        r11.add(r4)
                        goto L74
                    L88:
                        java.lang.Object r11 = wz.u.d0(r11)
                        r0.label = r3
                        java.lang.Object r11 = r12.emit(r11, r0)
                        if (r11 != r1) goto L95
                        return r1
                    L95:
                        vz.b0 r11 = vz.b0.f54756a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.BsbElement$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super String> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
    }

    public static final /* synthetic */ List access$getBanks$p(BsbElement bsbElement) {
        return bsbElement.banks;
    }

    public final e<String> getBankName() {
        return this.bankName;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public Controller getController() {
        return null;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return g.h(this.textElement.getController().isComplete(), this.textElement.getController().getFieldValue(), new BsbElement$getFormFieldValueFlow$1(this, null));
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifierSpec;
    }

    public final SimpleTextElement getTextElement$payments_ui_core_release() {
        return this.textElement;
    }
}