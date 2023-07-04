package com.stripe.android.paymentsheet.forms;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectableKtxKt;
import com.stripe.android.paymentsheet.injection.DaggerFormViewModelComponent;
import com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.ui.core.elements.CardBillingAddressElement;
import com.stripe.android.ui.core.elements.FormElement;
import com.stripe.android.ui.core.elements.FormItemSpec;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.elements.SaveForFutureUseElement;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import h00.a;
import h00.p;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import wz.w;
import zz.d;

/* loaded from: classes6.dex */
public final class FormViewModel extends p0 {
    private final e<CardBillingAddressElement> cardBillingElement;
    private final e<FormFieldValues> completeFormValues;
    private final h0<List<FormElement>> elements;
    private final u<Boolean> enabled;
    private u<List<IdentifierSpec>> externalHiddenIdentifiers;
    private final e<List<IdentifierSpec>> hiddenIdentifiers;
    private final e<IdentifierSpec> lastTextFieldIdentifier;
    private final ResourceRepository resourceRepository;
    private final e<Boolean> saveForFutureUse;
    private final e<SaveForFutureUseElement> saveForFutureUseElement;
    private final u<Boolean> saveForFutureUseVisible;
    private final e<Boolean> showingMandate;
    private final e<List<IdentifierSpec>> textFieldControllerIdsFlow;
    private final TransformSpecToElement transformSpecToElement;
    private final e<PaymentSelection.CustomerRequestedSave> userRequestedReuse;

    @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$1", f = "FormViewModel.kt", l = {98}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        final /* synthetic */ u<List<FormElement>> $delayedElements;
        final /* synthetic */ String $paymentMethodCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(u<List<FormElement>> uVar, String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$delayedElements = uVar;
            this.$paymentMethodCode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$delayedElements, this.$paymentMethodCode, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                ResourceRepository resourceRepository = FormViewModel.this.resourceRepository;
                this.label = 1;
                if (resourceRepository.waitUntilLoaded(this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            this.$delayedElements.setValue(FormViewModel.this.transformSpecToElement.transform$paymentsheet_release(FormViewModel.this.getLpmItems(this.$paymentMethodCode)));
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b, Injectable<FallbackInitializeParam> {
        private final FormFragmentArguments config;
        private final a<Context> contextSupplier;
        private String paymentMethodCode;
        private final Resources resource;
        public Provider<FormViewModelSubcomponent.Builder> subComponentBuilderProvider;

        /* loaded from: classes6.dex */
        public static final class FallbackInitializeParam {
            private final Context context;
            private final Resources resource;

            public FallbackInitializeParam(Resources resource, Context context) {
                s.g(resource, "resource");
                s.g(context, "context");
                this.resource = resource;
                this.context = context;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Resources resources, Context context, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    resources = fallbackInitializeParam.resource;
                }
                if ((i11 & 2) != 0) {
                    context = fallbackInitializeParam.context;
                }
                return fallbackInitializeParam.copy(resources, context);
            }

            public final Resources component1() {
                return this.resource;
            }

            public final Context component2() {
                return this.context;
            }

            public final FallbackInitializeParam copy(Resources resource, Context context) {
                s.g(resource, "resource");
                s.g(context, "context");
                return new FallbackInitializeParam(resource, context);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInitializeParam) {
                    FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                    return s.c(this.resource, fallbackInitializeParam.resource) && s.c(this.context, fallbackInitializeParam.context);
                }
                return false;
            }

            public final Context getContext() {
                return this.context;
            }

            public final Resources getResource() {
                return this.resource;
            }

            public int hashCode() {
                return (this.resource.hashCode() * 31) + this.context.hashCode();
            }

            public String toString() {
                return "FallbackInitializeParam(resource=" + this.resource + ", context=" + this.context + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(FormFragmentArguments config, Resources resource, String paymentMethodCode, a<? extends Context> contextSupplier) {
            s.g(config, "config");
            s.g(resource, "resource");
            s.g(paymentMethodCode, "paymentMethodCode");
            s.g(contextSupplier, "contextSupplier");
            this.config = config;
            this.resource = resource;
            this.paymentMethodCode = paymentMethodCode;
            this.contextSupplier = contextSupplier;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            s.g(modelClass, "modelClass");
            InjectableKtxKt.injectWithFallback(this, this.config.getInjectorKey(), new FallbackInitializeParam(this.resource, this.contextSupplier.invoke()));
            return getSubComponentBuilderProvider().get().formFragmentArguments(this.config).paymentMethodCode(this.paymentMethodCode).build().getViewModel();
        }

        public final FormFragmentArguments getConfig() {
            return this.config;
        }

        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        public final Resources getResource() {
            return this.resource;
        }

        public final Provider<FormViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<FormViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setPaymentMethodCode(String str) {
            s.g(str, "<set-?>");
            this.paymentMethodCode = str;
        }

        public final void setSubComponentBuilderProvider(Provider<FormViewModelSubcomponent.Builder> provider) {
            s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public void fallbackInitialize(FallbackInitializeParam arg) {
            s.g(arg, "arg");
            DaggerFormViewModelComponent.builder().context(arg.getContext()).resources(arg.getResource()).build().inject(this);
        }
    }

    public FormViewModel(String paymentMethodCode, final FormFragmentArguments config, ResourceRepository resourceRepository, TransformSpecToElement transformSpecToElement) {
        List i11;
        s.g(paymentMethodCode, "paymentMethodCode");
        s.g(config, "config");
        s.g(resourceRepository, "resourceRepository");
        s.g(transformSpecToElement, "transformSpecToElement");
        this.resourceRepository = resourceRepository;
        this.transformSpecToElement = transformSpecToElement;
        if (resourceRepository.isLoaded()) {
            this.elements = j0.a(transformSpecToElement.transform$paymentsheet_release(getLpmItems(paymentMethodCode)));
        } else {
            u a11 = j0.a(null);
            k.d(q0.a(this), null, null, new AnonymousClass1(a11, paymentMethodCode, null), 3, null);
            this.elements = a11;
        }
        this.enabled = j0.a(Boolean.TRUE);
        u<Boolean> a12 = j0.a(Boolean.valueOf(config.getShowCheckbox()));
        this.saveForFutureUseVisible = a12;
        final h0<List<FormElement>> h0Var = this.elements;
        final e<SaveForFutureUseElement> eVar = new e<SaveForFutureUseElement>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1

            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2", f = "FormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, zz.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r8)
                        goto L66
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        vz.r.b(r8)
                        kotlinx.coroutines.flow.f r8 = r6.$this_unsafeFlow
                        java.util.List r7 = (java.util.List) r7
                        r2 = 0
                        if (r7 != 0) goto L3d
                        r4 = r2
                        goto L56
                    L3d:
                        java.util.Iterator r7 = r7.iterator()
                    L41:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L53
                        java.lang.Object r4 = r7.next()
                        r5 = r4
                        com.stripe.android.ui.core.elements.FormElement r5 = (com.stripe.android.ui.core.elements.FormElement) r5
                        boolean r5 = r5 instanceof com.stripe.android.ui.core.elements.SaveForFutureUseElement
                        if (r5 == 0) goto L41
                        goto L54
                    L53:
                        r4 = r2
                    L54:
                        com.stripe.android.ui.core.elements.FormElement r4 = (com.stripe.android.ui.core.elements.FormElement) r4
                    L56:
                        boolean r7 = r4 instanceof com.stripe.android.ui.core.elements.SaveForFutureUseElement
                        if (r7 == 0) goto L5d
                        r2 = r4
                        com.stripe.android.ui.core.elements.SaveForFutureUseElement r2 = (com.stripe.android.ui.core.elements.SaveForFutureUseElement) r2
                    L5d:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L66
                        return r1
                    L66:
                        vz.b0 r7 = vz.b0.f54756a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super SaveForFutureUseElement> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.saveForFutureUseElement = eVar;
        this.saveForFutureUse = g.u(new e<e<? extends Boolean>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2

            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2", f = "FormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
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
                        boolean r0 = r6 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L5b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.elements.SaveForFutureUseElement r5 = (com.stripe.android.ui.core.elements.SaveForFutureUseElement) r5
                        r2 = 0
                        if (r5 != 0) goto L3c
                        goto L47
                    L3c:
                        com.stripe.android.ui.core.elements.SaveForFutureUseController r5 = r5.getController()
                        if (r5 != 0) goto L43
                        goto L47
                    L43:
                        kotlinx.coroutines.flow.e r2 = r5.getSaveForFutureUse()
                    L47:
                        if (r2 != 0) goto L52
                        r5 = 0
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        kotlinx.coroutines.flow.e r2 = kotlinx.coroutines.flow.g.x(r5)
                    L52:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r2, r0)
                        if (r5 != r1) goto L5b
                        return r1
                    L5b:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super e<? extends Boolean>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        });
        final h0<List<FormElement>> h0Var2 = this.elements;
        final e<CardBillingAddressElement> eVar2 = new e<CardBillingAddressElement>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3

            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2", f = "FormViewModel.kt", l = {228}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, zz.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        vz.r.b(r8)
                        goto L9f
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        vz.r.b(r8)
                        kotlinx.coroutines.flow.f r8 = r6.$this_unsafeFlow
                        java.util.List r7 = (java.util.List) r7
                        if (r7 != 0) goto L3d
                        r7 = 0
                        goto L96
                    L3d:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L46:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L58
                        java.lang.Object r4 = r7.next()
                        boolean r5 = r4 instanceof com.stripe.android.ui.core.elements.SectionElement
                        if (r5 == 0) goto L46
                        r2.add(r4)
                        goto L46
                    L58:
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.util.Iterator r2 = r2.iterator()
                    L61:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L75
                        java.lang.Object r4 = r2.next()
                        com.stripe.android.ui.core.elements.SectionElement r4 = (com.stripe.android.ui.core.elements.SectionElement) r4
                        java.util.List r4 = r4.getFields()
                        wz.u.z(r7, r4)
                        goto L61
                    L75:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r7 = r7.iterator()
                    L7e:
                        boolean r4 = r7.hasNext()
                        if (r4 == 0) goto L90
                        java.lang.Object r4 = r7.next()
                        boolean r5 = r4 instanceof com.stripe.android.ui.core.elements.CardBillingAddressElement
                        if (r5 == 0) goto L7e
                        r2.add(r4)
                        goto L7e
                    L90:
                        java.lang.Object r7 = wz.u.d0(r2)
                        com.stripe.android.ui.core.elements.CardBillingAddressElement r7 = (com.stripe.android.ui.core.elements.CardBillingAddressElement) r7
                    L96:
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L9f
                        return r1
                    L9f:
                        vz.b0 r7 = vz.b0.f54756a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super CardBillingAddressElement> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.cardBillingElement = eVar2;
        i11 = w.i();
        this.externalHiddenIdentifiers = j0.a(i11);
        e<List<IdentifierSpec>> i12 = g.i(a12, g.u(new e<e<? extends List<? extends IdentifierSpec>>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4

            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2", f = "FormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
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
                        boolean r0 = r6 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        com.stripe.android.ui.core.elements.CardBillingAddressElement r5 = (com.stripe.android.ui.core.elements.CardBillingAddressElement) r5
                        if (r5 != 0) goto L3c
                        r5 = 0
                        goto L40
                    L3c:
                        kotlinx.coroutines.flow.e r5 = r5.getHiddenIdentifiers()
                    L40:
                        if (r5 != 0) goto L4a
                        java.util.List r5 = wz.u.i()
                        kotlinx.coroutines.flow.e r5 = kotlinx.coroutines.flow.g.x(r5)
                    L4a:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super e<? extends List<? extends IdentifierSpec>>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }), this.externalHiddenIdentifiers, new FormViewModel$hiddenIdentifiers$2(this, null));
        this.hiddenIdentifiers = i12;
        final h0<List<FormElement>> h0Var3 = this.elements;
        e<Boolean> h11 = g.h(i12, new e<List<? extends FormElement>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5

            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2", f = "FormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
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
                        boolean r0 = r6 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        if (r5 != 0) goto L3e
                        java.util.List r5 = wz.u.i()
                    L3e:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super List<? extends FormElement>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }, new FormViewModel$showingMandate$2(null));
        this.showingMandate = h11;
        final e p11 = g.p(this.elements);
        e<PaymentSelection.CustomerRequestedSave> u11 = g.u(new e<e<? extends PaymentSelection.CustomerRequestedSave>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6

            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ FormFragmentArguments $config$inlined;
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2", f = "FormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar, FormFragmentArguments formFragmentArguments) {
                    this.$this_unsafeFlow = fVar;
                    this.$config$inlined = formFragmentArguments;
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
                        boolean r0 = r7 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L7d
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = wz.u.t(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L47:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r6.next()
                        com.stripe.android.ui.core.elements.FormElement r4 = (com.stripe.android.ui.core.elements.FormElement) r4
                        kotlinx.coroutines.flow.e r4 = r4.getFormFieldValueFlow()
                        r2.add(r4)
                        goto L47
                    L5b:
                        java.util.List r6 = wz.u.O0(r2)
                        r2 = 0
                        kotlinx.coroutines.flow.e[] r2 = new kotlinx.coroutines.flow.e[r2]
                        java.lang.Object[] r6 = r6.toArray(r2)
                        java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                        java.util.Objects.requireNonNull(r6, r2)
                        kotlinx.coroutines.flow.e[] r6 = (kotlinx.coroutines.flow.e[]) r6
                        com.stripe.android.paymentsheet.forms.FormViewModel$userRequestedReuse$lambda-12$$inlined$combine$1 r2 = new com.stripe.android.paymentsheet.forms.FormViewModel$userRequestedReuse$lambda-12$$inlined$combine$1
                        com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments r4 = r5.$config$inlined
                        r2.<init>(r6, r4)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L7d
                        return r1
                    L7d:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$6.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super e<? extends PaymentSelection.CustomerRequestedSave>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar, config), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        });
        this.userRequestedReuse = u11;
        final e p12 = g.p(this.elements);
        this.completeFormValues = new CompleteFormFieldValueFilter(g.u(new e<e<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7

            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7$2", f = "FormViewModel.kt", l = {230}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
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
                        boolean r0 = r7 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L7b
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = wz.u.t(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L47:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r6.next()
                        com.stripe.android.ui.core.elements.FormElement r4 = (com.stripe.android.ui.core.elements.FormElement) r4
                        kotlinx.coroutines.flow.e r4 = r4.getFormFieldValueFlow()
                        r2.add(r4)
                        goto L47
                    L5b:
                        java.util.List r6 = wz.u.O0(r2)
                        r2 = 0
                        kotlinx.coroutines.flow.e[] r2 = new kotlinx.coroutines.flow.e[r2]
                        java.lang.Object[] r6 = r6.toArray(r2)
                        java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                        java.util.Objects.requireNonNull(r6, r2)
                        kotlinx.coroutines.flow.e[] r6 = (kotlinx.coroutines.flow.e[]) r6
                        com.stripe.android.paymentsheet.forms.FormViewModel$completeFormValues$lambda-15$$inlined$combine$1 r2 = new com.stripe.android.paymentsheet.forms.FormViewModel$completeFormValues$lambda-15$$inlined$combine$1
                        r2.<init>(r6)
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L7b
                        return r1
                    L7b:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$7.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super e<? extends Map<IdentifierSpec, ? extends FormFieldEntry>>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        }), i12, h11, u11).filterFlow();
        final e p13 = g.p(this.elements);
        e<List<IdentifierSpec>> u12 = g.u(new e<e<? extends List<? extends IdentifierSpec>>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8

            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {
                final /* synthetic */ kotlinx.coroutines.flow.f $this_unsafeFlow;

                @f(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8$2", f = "FormViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
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
                        boolean r0 = r7 instanceof com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8$2$1 r0 = (com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8$2$1 r0 = new com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r7)
                        goto L7b
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        vz.r.b(r7)
                        kotlinx.coroutines.flow.f r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = wz.u.t(r6, r4)
                        r2.<init>(r4)
                        java.util.Iterator r6 = r6.iterator()
                    L47:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L5b
                        java.lang.Object r4 = r6.next()
                        com.stripe.android.ui.core.elements.FormElement r4 = (com.stripe.android.ui.core.elements.FormElement) r4
                        kotlinx.coroutines.flow.e r4 = r4.getTextFieldIdentifiers()
                        r2.add(r4)
                        goto L47
                    L5b:
                        java.util.List r6 = wz.u.O0(r2)
                        r2 = 0
                        kotlinx.coroutines.flow.e[] r2 = new kotlinx.coroutines.flow.e[r2]
                        java.lang.Object[] r6 = r6.toArray(r2)
                        java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                        java.util.Objects.requireNonNull(r6, r2)
                        kotlinx.coroutines.flow.e[] r6 = (kotlinx.coroutines.flow.e[]) r6
                        com.stripe.android.paymentsheet.forms.FormViewModel$textFieldControllerIdsFlow$lambda-18$$inlined$combine$1 r2 = new com.stripe.android.paymentsheet.forms.FormViewModel$textFieldControllerIdsFlow$lambda-18$$inlined$combine$1
                        r2.<init>()
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L7b
                        return r1
                    L7b:
                        vz.b0 r6 = vz.b0.f54756a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$8.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super e<? extends List<? extends IdentifierSpec>>> fVar, d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        });
        this.textFieldControllerIdsFlow = u12;
        this.lastTextFieldIdentifier = g.h(i12, u12, new FormViewModel$lastTextFieldIdentifier$1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FormItemSpec> getLpmItems(String str) {
        if (this.resourceRepository.isLoaded()) {
            LpmRepository.SupportedPaymentMethod fromCode = this.resourceRepository.getLpmRepository().fromCode(str);
            if (fromCode != null) {
                return fromCode.getFormSpec().getItems();
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static /* synthetic */ void getSaveForFutureUseVisible$paymentsheet_release$annotations() {
    }

    public final void addHiddenIdentifiers$paymentsheet_release(List<IdentifierSpec> identifierSpecs) {
        s.g(identifierSpecs, "identifierSpecs");
        this.externalHiddenIdentifiers.setValue(identifierSpecs);
    }

    public final e<FormFieldValues> getCompleteFormValues() {
        return this.completeFormValues;
    }

    public final h0<List<FormElement>> getElements$paymentsheet_release() {
        return this.elements;
    }

    public final u<Boolean> getEnabled$paymentsheet_release() {
        return this.enabled;
    }

    public final e<List<IdentifierSpec>> getHiddenIdentifiers$paymentsheet_release() {
        return this.hiddenIdentifiers;
    }

    public final e<IdentifierSpec> getLastTextFieldIdentifier() {
        return this.lastTextFieldIdentifier;
    }

    public final e<Boolean> getSaveForFutureUse$paymentsheet_release() {
        return this.saveForFutureUse;
    }

    public final u<Boolean> getSaveForFutureUseVisible$paymentsheet_release() {
        return this.saveForFutureUseVisible;
    }

    public final void setEnabled$paymentsheet_release(boolean z11) {
        this.enabled.setValue(Boolean.valueOf(z11));
    }
}