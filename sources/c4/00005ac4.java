package com.stripe.android.ui.core.elements;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import vz.b0;
import vz.p;

/* loaded from: classes6.dex */
public final class OTPElement extends FormElement {
    public static final int $stable = 8;
    private final OTPController controller;
    private final IdentifierSpec identifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElement(IdentifierSpec identifier, OTPController controller) {
        super(null);
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
    }

    public static /* synthetic */ OTPElement copy$default(OTPElement oTPElement, IdentifierSpec identifierSpec, OTPController oTPController, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = oTPElement.getIdentifier();
        }
        if ((i11 & 2) != 0) {
            oTPController = oTPElement.getController();
        }
        return oTPElement.copy(identifierSpec, oTPController);
    }

    public final IdentifierSpec component1() {
        return getIdentifier();
    }

    public final OTPController component2() {
        return getController();
    }

    public final OTPElement copy(IdentifierSpec identifier, OTPController controller) {
        s.g(identifier, "identifier");
        s.g(controller, "controller");
        return new OTPElement(identifier, controller);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OTPElement) {
            OTPElement oTPElement = (OTPElement) obj;
            return s.c(getIdentifier(), oTPElement.getIdentifier()) && s.c(getController(), oTPElement.getController());
        }
        return false;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public e<List<p<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        final e<String> fieldValue = getController().getFieldValue();
        return new e<List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ OTPElement this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2", f = "OTPElement.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, OTPElement oTPElement) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = oTPElement;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, zz.d r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r9)
                        goto L67
                    L29:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L31:
                        vz.r.b(r9)
                        kotlinx.coroutines.flow.f r9 = r7.$this_unsafeFlow
                        java.lang.String r8 = (java.lang.String) r8
                        com.stripe.android.ui.core.elements.OTPElement r2 = r7.this$0
                        com.stripe.android.ui.core.elements.IdentifierSpec r2 = r2.getIdentifier()
                        com.stripe.android.ui.core.forms.FormFieldEntry r4 = new com.stripe.android.ui.core.forms.FormFieldEntry
                        int r5 = r8.length()
                        com.stripe.android.ui.core.elements.OTPElement r6 = r7.this$0
                        com.stripe.android.ui.core.elements.OTPController r6 = r6.getController()
                        int r6 = r6.getOtpLength()
                        if (r5 != r6) goto L52
                        r5 = r3
                        goto L53
                    L52:
                        r5 = 0
                    L53:
                        r4.<init>(r8, r5)
                        vz.p r8 = vz.v.a(r2, r4)
                        java.util.List r8 = wz.u.d(r8)
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r8, r0)
                        if (r8 != r1) goto L67
                        return r1
                    L67:
                        vz.b0 r8 = vz.b0.f54756a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.OTPElement$getFormFieldValueFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super List<? extends p<? extends IdentifierSpec, ? extends FormFieldEntry>>> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, this), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return (getIdentifier().hashCode() * 31) + getController().hashCode();
    }

    public String toString() {
        return "OTPElement(identifier=" + getIdentifier() + ", controller=" + getController() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.ui.core.elements.FormElement
    public OTPController getController() {
        return this.controller;
    }
}