package com.stripe.android.ui.core.elements;

import com.stripe.android.core.model.Country;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.Set;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import s2.k0;
import vz.b0;
import wz.x0;

/* loaded from: classes6.dex */
public final class PhoneNumberController implements InputController {
    private final u<String> _fieldValue;
    private final CountryConfig countryConfig;
    private final DropdownFieldController countryDropdownController;
    private final e<FieldError> error;
    private final e<String> fieldValue;
    private final e<FormFieldEntry> formFieldValue;
    private final e<Boolean> isComplete;
    private final e<Integer> label;
    private final u<PhoneNumberFormatter> phoneNumberFormatter;
    private final e<String> placeholder;
    private final e<String> prefix;
    private final e<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final e<k0> visualTransformation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PhoneNumberController createPhoneNumberController$default(Companion companion, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            return companion.createPhoneNumberController(str, str2);
        }

        public final PhoneNumberController createPhoneNumberController(String initialValue, String str) {
            s.g(initialValue, "initialValue");
            return new PhoneNumberController(initialValue, str, null, 4, null);
        }
    }

    public PhoneNumberController() {
        this(null, null, null, 7, null);
    }

    public PhoneNumberController(String initialPhoneNumber, String str, Set<String> overrideCountryCodes) {
        s.g(initialPhoneNumber, "initialPhoneNumber");
        s.g(overrideCountryCodes, "overrideCountryCodes");
        this.label = g.x(Integer.valueOf(R.string.address_label_phone_number));
        u<String> a11 = j0.a(initialPhoneNumber);
        this._fieldValue = a11;
        this.fieldValue = a11;
        CountryConfig countryConfig = new CountryConfig(overrideCountryCodes, null, true, 2, null);
        this.countryConfig = countryConfig;
        DropdownFieldController dropdownFieldController = new DropdownFieldController(countryConfig, str);
        this.countryDropdownController = dropdownFieldController;
        final u<PhoneNumberFormatter> a12 = j0.a(PhoneNumberFormatter.Companion.forCountry(countryConfig.getCountries$payments_ui_core_release().get(dropdownFieldController.getSelectedIndex().getValue().intValue()).getCode().getValue()));
        this.phoneNumberFormatter = a12;
        this.rawFieldValue = g.h(getFieldValue(), a12, new PhoneNumberController$rawFieldValue$1(null));
        final e<String> fieldValue = getFieldValue();
        this.isComplete = new e<Boolean>() { // from class: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1

            /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1$2", f = "PhoneNumberController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1$2$1 r0 = (com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1$2$1 r0 = new com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.String r5 = (java.lang.String) r5
                        boolean r5 = kotlin.text.m.w(r5)
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super Boolean> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        final e<String> fieldValue2 = getFieldValue();
        this.formFieldValue = new e<FormFieldEntry>() { // from class: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2

            /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2$2", f = "PhoneNumberController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2$2$1  reason: invalid class name */
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
                public final java.lang.Object emit(java.lang.Object r6, zz.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2$2$1 r0 = (com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2$2$1 r0 = new com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.lang.String r6 = (java.lang.String) r6
                        com.stripe.android.ui.core.forms.FormFieldEntry r2 = new com.stripe.android.ui.core.forms.FormFieldEntry
                        boolean r4 = kotlin.text.m.w(r6)
                        r4 = r4 ^ r3
                        r2.<init>(r6, r4)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L4b
                        return r1
                    L4b:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super FormFieldEntry> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.error = g.x(null);
        this.placeholder = new e<String>() { // from class: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3

            /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3$2", f = "PhoneNumberController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3$2$1 r0 = (com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3$2$1 r0 = new com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.elements.PhoneNumberFormatter r5 = (com.stripe.android.ui.core.elements.PhoneNumberFormatter) r5
                        java.lang.String r5 = r5.getPlaceholder()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        this.prefix = new e<String>() { // from class: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4

            /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4$2", f = "PhoneNumberController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4$2$1 r0 = (com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4$2$1 r0 = new com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.elements.PhoneNumberFormatter r5 = (com.stripe.android.ui.core.elements.PhoneNumberFormatter) r5
                        java.lang.String r5 = r5.getPrefix()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
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
        this.visualTransformation = new e<k0>() { // from class: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5

            /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5$2", f = "PhoneNumberController.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5$2$1  reason: invalid class name */
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
                        boolean r0 = r6 instanceof com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5$2$1 r0 = (com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5$2$1 r0 = new com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.elements.PhoneNumberFormatter r5 = (com.stripe.android.ui.core.elements.PhoneNumberFormatter) r5
                        s2.k0 r5 = r5.getVisualTransformation()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.PhoneNumberController$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super k0> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
    }

    public final String getCountryCode() {
        return this.phoneNumberFormatter.getValue().getCountryCode();
    }

    public final DropdownFieldController getCountryDropdownController() {
        return this.countryDropdownController;
    }

    public final String getE164PhoneNumber(String phoneNumber) {
        s.g(phoneNumber, "phoneNumber");
        return this.phoneNumberFormatter.getValue().toE164Format(phoneNumber);
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

    public final e<String> getPlaceholder$payments_ui_core_release() {
        return this.placeholder;
    }

    public final e<String> getPrefix$payments_ui_core_release() {
        return this.prefix;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    public final e<k0> getVisualTransformation$payments_ui_core_release() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public e<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.ui.core.elements.InputController
    public void onRawValueChange(String rawValue) {
        s.g(rawValue, "rawValue");
        onValueChange(rawValue);
    }

    public final b0 onSelectedCountryIndex(int i11) {
        Country country = this.countryConfig.getCountries$payments_ui_core_release().get(i11);
        if (!(!s.c(country.getCode().getValue(), this.phoneNumberFormatter.getValue().getCountryCode()))) {
            country = null;
        }
        Country country2 = country;
        if (country2 == null) {
            return null;
        }
        this.phoneNumberFormatter.setValue(PhoneNumberFormatter.Companion.forCountry(country2.getCode().getValue()));
        return b0.f54756a;
    }

    public final void onValueChange(String displayFormatted) {
        s.g(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.phoneNumberFormatter.getValue().userInputFilter(displayFormatted));
    }

    public /* synthetic */ PhoneNumberController(String str, String str2, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? x0.d() : set);
    }
}