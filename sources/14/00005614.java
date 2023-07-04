package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import h00.l;
import kotlin.jvm.internal.s;
import v20.i;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultFlowControllerInitializer implements FlowControllerInitializer {
    private final CustomerRepository customerRepository;
    private final l<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory;
    private final Logger logger;
    private final l<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory;
    private final ResourceRepository resourceRepository;
    private final StripeIntentRepository stripeIntentRepository;
    private final StripeIntentValidator stripeIntentValidator;
    private final g workContext;

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.GooglePayConfiguration.Environment.values().length];
            iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
            iArr[PaymentSheet.GooglePayConfiguration.Environment.Test.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultFlowControllerInitializer(l<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory, l<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory, StripeIntentRepository stripeIntentRepository, StripeIntentValidator stripeIntentValidator, CustomerRepository customerRepository, ResourceRepository resourceRepository, Logger logger, @IOContext g workContext) {
        s.g(prefsRepositoryFactory, "prefsRepositoryFactory");
        s.g(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        s.g(stripeIntentRepository, "stripeIntentRepository");
        s.g(stripeIntentValidator, "stripeIntentValidator");
        s.g(customerRepository, "customerRepository");
        s.g(resourceRepository, "resourceRepository");
        s.g(logger, "logger");
        s.g(workContext, "workContext");
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.stripeIntentRepository = stripeIntentRepository;
        this.stripeIntentValidator = stripeIntentValidator;
        this.customerRepository = customerRepository;
        this.resourceRepository = resourceRepository;
        this.logger = logger;
        this.workContext = workContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(1:(1:(1:(1:(3:12|13|14)(2:16|17))(4:18|19|20|(1:22)(3:23|13|14)))(6:24|25|(4:28|(3:30|31|32)(1:34)|33|26)|35|36|(1:38)(4:39|19|20|(0)(0))))(4:40|41|42|43))(10:68|69|70|71|72|73|74|75|76|(1:78)(1:79))|44|45|46|47|(5:49|(2:52|50)|53|54|(1:56)(6:57|25|(1:26)|35|36|(0)(0)))(2:58|59)))|89|6|(0)(0)|44|45|46|47|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fe, code lost:
        r16 = r10;
        r10 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dc  */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createWithCustomer(com.stripe.android.paymentsheet.model.ClientSecret r19, com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration r20, com.stripe.android.paymentsheet.PaymentSheet.Configuration r21, boolean r22, zz.d<? super com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult> r23) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.createWithCustomer(com.stripe.android.paymentsheet.model.ClientSecret, com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration, com.stripe.android.paymentsheet.PaymentSheet$Configuration, boolean, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createWithoutCustomer(com.stripe.android.paymentsheet.model.ClientSecret r9, com.stripe.android.paymentsheet.PaymentSheet.Configuration r10, boolean r11, zz.d<? super com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1 r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1 r0 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            boolean r11 = r0.Z$0
            java.lang.Object r9 = r0.L$2
            r10 = r9
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r10 = (com.stripe.android.paymentsheet.PaymentSheet.Configuration) r10
            java.lang.Object r9 = r0.L$1
            com.stripe.android.paymentsheet.model.ClientSecret r9 = (com.stripe.android.paymentsheet.model.ClientSecret) r9
            java.lang.Object r0 = r0.L$0
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer) r0
            vz.r.b(r12)     // Catch: java.lang.Throwable -> L38
            goto L59
        L38:
            r12 = move-exception
            goto L62
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L42:
            vz.r.b(r12)
            vz.q$a r12 = vz.q.f54772b     // Catch: java.lang.Throwable -> L60
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L60
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L60
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L60
            r0.Z$0 = r11     // Catch: java.lang.Throwable -> L60
            r0.label = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r12 = r8.retrieveStripeIntent(r9, r0)     // Catch: java.lang.Throwable -> L60
            if (r12 != r1) goto L58
            return r1
        L58:
            r0 = r8
        L59:
            com.stripe.android.model.StripeIntent r12 = (com.stripe.android.model.StripeIntent) r12     // Catch: java.lang.Throwable -> L38
            java.lang.Object r12 = vz.q.b(r12)     // Catch: java.lang.Throwable -> L38
            goto L6c
        L60:
            r12 = move-exception
            r0 = r8
        L62:
            vz.q$a r1 = vz.q.f54772b
            java.lang.Object r12 = vz.r.a(r12)
            java.lang.Object r12 = vz.q.b(r12)
        L6c:
            r3 = r9
            r2 = r10
            r7 = r11
            java.lang.Throwable r9 = vz.q.e(r12)
            if (r9 != 0) goto L90
            r4 = r12
            com.stripe.android.model.StripeIntent r4 = (com.stripe.android.model.StripeIntent) r4
            if (r7 == 0) goto L7d
            com.stripe.android.paymentsheet.model.SavedSelection$GooglePay r9 = com.stripe.android.paymentsheet.model.SavedSelection.GooglePay.INSTANCE
            goto L7f
        L7d:
            com.stripe.android.paymentsheet.model.SavedSelection$None r9 = com.stripe.android.paymentsheet.model.SavedSelection.None.INSTANCE
        L7f:
            r6 = r9
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Success r9 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Success
            com.stripe.android.paymentsheet.flowcontroller.InitData r10 = new com.stripe.android.paymentsheet.flowcontroller.InitData
            java.util.List r5 = wz.u.i()
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.<init>(r10)
            goto L9d
        L90:
            com.stripe.android.core.Logger r10 = r0.logger
            java.lang.String r11 = "Failure initializing FlowController"
            r10.error(r11, r9)
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Failure r10 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Failure
            r10.<init>(r9)
            r9 = r10
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.createWithoutCustomer(com.stripe.android.paymentsheet.model.ClientSecret, com.stripe.android.paymentsheet.PaymentSheet$Configuration, boolean, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object isGooglePayReady(com.stripe.android.paymentsheet.PaymentSheet.Configuration r6, zz.d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$isGooglePayReady$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$isGooglePayReady$1 r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$isGooglePayReady$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$isGooglePayReady$1 r0 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$isGooglePayReady$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            vz.r.b(r7)
            goto L79
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            vz.r.b(r7)
            if (r6 != 0) goto L38
            goto L82
        L38:
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration r6 = r6.getGooglePay()
            if (r6 != 0) goto L3f
            goto L82
        L3f:
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration$Environment r6 = r6.getEnvironment()
            if (r6 != 0) goto L46
            goto L82
        L46:
            h00.l<com.stripe.android.googlepaylauncher.GooglePayEnvironment, com.stripe.android.googlepaylauncher.GooglePayRepository> r7 = r5.googlePayRepositoryFactory
            int[] r2 = com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r3) goto L5e
            r2 = 2
            if (r6 != r2) goto L58
            com.stripe.android.googlepaylauncher.GooglePayEnvironment r6 = com.stripe.android.googlepaylauncher.GooglePayEnvironment.Test
            goto L60
        L58:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L5e:
            com.stripe.android.googlepaylauncher.GooglePayEnvironment r6 = com.stripe.android.googlepaylauncher.GooglePayEnvironment.Production
        L60:
            java.lang.Object r6 = r7.invoke(r6)
            com.stripe.android.googlepaylauncher.GooglePayRepository r6 = (com.stripe.android.googlepaylauncher.GooglePayRepository) r6
            if (r6 != 0) goto L69
            goto L82
        L69:
            kotlinx.coroutines.flow.e r6 = r6.isReady()
            if (r6 != 0) goto L70
            goto L82
        L70:
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.g.r(r6, r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 != 0) goto L7e
            goto L82
        L7e:
            boolean r4 = r7.booleanValue()
        L82:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.isGooglePayReady(com.stripe.android.paymentsheet.PaymentSheet$Configuration, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object retrieveStripeIntent(com.stripe.android.paymentsheet.model.ClientSecret r6, zz.d<? super com.stripe.android.model.StripeIntent> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1 r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1 r0 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            com.stripe.android.paymentsheet.model.StripeIntentValidator r6 = (com.stripe.android.paymentsheet.model.StripeIntentValidator) r6
            vz.r.b(r7)
            goto L4a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            vz.r.b(r7)
            com.stripe.android.paymentsheet.model.StripeIntentValidator r7 = r5.stripeIntentValidator
            com.stripe.android.paymentsheet.repositories.StripeIntentRepository r2 = r5.stripeIntentRepository
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r2.get(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r4 = r7
            r7 = r6
            r6 = r4
        L4a:
            com.stripe.android.model.StripeIntent r7 = (com.stripe.android.model.StripeIntent) r7
            com.stripe.android.model.StripeIntent r6 = r6.requireValid(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.retrieveStripeIntent(com.stripe.android.paymentsheet.model.ClientSecret, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setLastSavedPaymentMethod(com.stripe.android.paymentsheet.PrefsRepository r5, boolean r6, java.util.List<com.stripe.android.model.PaymentMethod> r7, zz.d<? super vz.b0> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1 r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1 r0 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            boolean r6 = r0.Z$0
            java.lang.Object r5 = r0.L$1
            r7 = r5
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r0.L$0
            com.stripe.android.paymentsheet.PrefsRepository r5 = (com.stripe.android.paymentsheet.PrefsRepository) r5
            vz.r.b(r8)
            goto L4e
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            vz.r.b(r8)
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.getSavedSelection(r6, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            com.stripe.android.paymentsheet.model.SavedSelection$None r0 = com.stripe.android.paymentsheet.model.SavedSelection.None.INSTANCE
            boolean r8 = kotlin.jvm.internal.s.c(r8, r0)
            if (r8 == 0) goto L75
            boolean r8 = r7.isEmpty()
            r8 = r8 ^ r3
            if (r8 == 0) goto L69
            com.stripe.android.paymentsheet.model.PaymentSelection$Saved r6 = new com.stripe.android.paymentsheet.model.PaymentSelection$Saved
            java.lang.Object r7 = wz.u.b0(r7)
            com.stripe.android.model.PaymentMethod r7 = (com.stripe.android.model.PaymentMethod) r7
            r6.<init>(r7)
            goto L6f
        L69:
            if (r6 == 0) goto L6e
            com.stripe.android.paymentsheet.model.PaymentSelection$GooglePay r6 = com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay.INSTANCE
            goto L6f
        L6e:
            r6 = 0
        L6f:
            if (r6 != 0) goto L72
            goto L75
        L72:
            r5.savePaymentSelection(r6)
        L75:
            vz.b0 r5 = vz.b0.f54756a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.setLastSavedPaymentMethod(com.stripe.android.paymentsheet.PrefsRepository, boolean, java.util.List, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer
    public Object init(ClientSecret clientSecret, PaymentSheet.Configuration configuration, d<? super FlowControllerInitializer.InitResult> dVar) {
        return i.g(this.workContext, new DefaultFlowControllerInitializer$init$2(this, configuration, clientSecret, null), dVar);
    }
}