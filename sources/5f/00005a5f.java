package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import vz.b0;

/* loaded from: classes6.dex */
public final class DropdownFieldController implements InputController, SectionFieldErrorController {
    public static final int $stable = 8;
    private final u<Integer> _selectedIndex;
    private final DropdownConfig config;
    private final List<String> displayItems;
    private final e<FieldError> error;
    private final e<String> fieldValue;
    private final e<FormFieldEntry> formFieldValue;
    private final e<Boolean> isComplete;
    private final e<Integer> label;
    private final e<String> rawFieldValue;
    private final h0<Integer> selectedIndex;
    private final boolean showOptionalLabel;
    private final boolean tinyMode;

    public DropdownFieldController(DropdownConfig config, String str) {
        s.g(config, "config");
        this.config = config;
        this.displayItems = config.getDisplayItems();
        final u<Integer> a11 = j0.a(0);
        this._selectedIndex = a11;
        this.selectedIndex = a11;
        this.label = j0.a(Integer.valueOf(config.getLabel()));
        this.fieldValue = new e<String>() { // from class: com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ DropdownFieldController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1$2", f = "DropdownFieldController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, DropdownFieldController dropdownFieldController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = dropdownFieldController;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        com.stripe.android.ui.core.elements.DropdownFieldController r2 = r4.this$0
                        java.util.List r2 = r2.getDisplayItems()
                        java.lang.Object r5 = r2.get(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        final e<String> fieldValue = getFieldValue();
        this.rawFieldValue = new e<String>() { // from class: com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2

            /* renamed from: com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;
                final /* synthetic */ DropdownFieldController this$0;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2$2", f = "DropdownFieldController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2$2$1  reason: invalid class name */
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

                public AnonymousClass2(f fVar, DropdownFieldController dropdownFieldController) {
                    this.$this_unsafeFlow = fVar;
                    this.this$0 = dropdownFieldController;
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2$2$1 r0 = (com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2$2$1 r0 = new com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.String r5 = (java.lang.String) r5
                        com.stripe.android.ui.core.elements.DropdownFieldController r2 = r4.this$0
                        com.stripe.android.ui.core.elements.DropdownConfig r2 = com.stripe.android.ui.core.elements.DropdownFieldController.access$getConfig$p(r2)
                        java.lang.String r5 = r2.convertToRaw(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.DropdownFieldController$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        this.error = j0.a(null);
        this.isComplete = j0.a(Boolean.TRUE);
        this.formFieldValue = g.h(isComplete(), getRawFieldValue(), new DropdownFieldController$formFieldValue$1(null));
        this.tinyMode = config.getTinyMode();
        if (str == null) {
            return;
        }
        onRawValueChange(str);
    }

    public static final /* synthetic */ DropdownConfig access$getConfig$p(DropdownFieldController dropdownFieldController) {
        return dropdownFieldController.config;
    }

    public final List<String> getDisplayItems() {
        return this.displayItems;
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

    public final h0<Integer> getSelectedIndex() {
        return this.selectedIndex;
    }

    public final String getSelectedItemLabel(int i11) {
        return this.config.getSelectedItemLabel(i11);
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public final boolean getTinyMode() {
        return this.tinyMode;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public void onRawValueChange(String rawValue) {
        s.g(rawValue, "rawValue");
        u<Integer> uVar = this._selectedIndex;
        Integer valueOf = Integer.valueOf(this.displayItems.indexOf(this.config.convertFromRaw(rawValue)));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        uVar.setValue(Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
    }

    public final void onValueChange(int i11) {
        this._selectedIndex.setValue(Integer.valueOf(i11));
    }

    public /* synthetic */ DropdownFieldController(DropdownConfig dropdownConfig, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dropdownConfig, (i11 & 2) != 0 ? null : str);
    }
}