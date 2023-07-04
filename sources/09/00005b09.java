package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import vz.b0;

/* loaded from: classes6.dex */
public final class SaveForFutureUseController implements InputController {
    public static final int $stable = 8;
    private final u<Boolean> _saveForFutureUse;
    private final e<FieldError> error;
    private final e<String> fieldValue;
    private final e<FormFieldEntry> formFieldValue;
    private final e<Boolean> isComplete;
    private final e<Integer> label = j0.a(Integer.valueOf(R.string.save_for_future_payments_with_merchant_name));
    private final e<String> rawFieldValue;
    private final e<Boolean> saveForFutureUse;
    private final boolean showOptionalLabel;

    public SaveForFutureUseController(boolean z11) {
        final u<Boolean> a11 = j0.a(Boolean.valueOf(z11));
        this._saveForFutureUse = a11;
        this.saveForFutureUse = a11;
        this.fieldValue = new e<String>() { // from class: com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2", f = "SaveForFutureUseController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        boolean r5 = r5.booleanValue()
                        java.lang.String r5 = java.lang.String.valueOf(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.SaveForFutureUseController$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super String> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.rawFieldValue = getFieldValue();
        this.error = j0.a(null);
        this.isComplete = j0.a(Boolean.TRUE);
        this.formFieldValue = g.h(isComplete(), getRawFieldValue(), new SaveForFutureUseController$formFieldValue$1(null));
    }

    @Override // com.stripe.android.ui.core.elements.SectionFieldErrorController
    public e<FieldError> getError() {
        return this.error;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<String> getFieldValue() {
        return this.fieldValue;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<Integer> getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    public final e<Boolean> getSaveForFutureUse() {
        return this.saveForFutureUse;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public void onRawValueChange(String rawValue) {
        Boolean c12;
        s.g(rawValue, "rawValue");
        c12 = w.c1(rawValue);
        onValueChange(c12 == null ? true : c12.booleanValue());
    }

    public final void onValueChange(boolean z11) {
        this._saveForFutureUse.setValue(Boolean.valueOf(z11));
    }
}