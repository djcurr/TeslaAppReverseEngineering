package com.stripe.android.stripe3ds2.service;

import android.content.Context;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.DefaultSecurityChecker;
import com.stripe.android.stripe3ds2.init.HardwareIdSupplier;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.PublicKeyFactory;
import com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.stripe3ds2.transaction.TransactionFactory;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import com.stripe.android.stripe3ds2.views.Brand;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes6.dex */
public final class StripeThreeDs2ServiceImpl implements StripeThreeDs2Service {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String STRIPE_SDK_REFERENCE_NUMBER = "3DS_LOA_SDK_STIN_020100_00142";
    private final ErrorReporter errorReporter;
    private final ImageCache imageCache;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PublicKeyFactory publicKeyFactory;
    private final TransactionFactory transactionFactory;
    private final List<Warning> warnings;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, g workContext) {
        this(context, false, workContext, 2, (DefaultConstructorMarker) null);
        s.g(context, "context");
        s.g(workContext, "workContext");
    }

    public StripeThreeDs2ServiceImpl(MessageVersionRegistry messageVersionRegistry, ImageCache imageCache, ErrorReporter errorReporter, TransactionFactory transactionFactory, PublicKeyFactory publicKeyFactory, List<Warning> warnings) {
        s.g(messageVersionRegistry, "messageVersionRegistry");
        s.g(imageCache, "imageCache");
        s.g(errorReporter, "errorReporter");
        s.g(transactionFactory, "transactionFactory");
        s.g(publicKeyFactory, "publicKeyFactory");
        s.g(warnings, "warnings");
        this.messageVersionRegistry = messageVersionRegistry;
        this.imageCache = imageCache;
        this.errorReporter = errorReporter;
        this.transactionFactory = transactionFactory;
        this.publicKeyFactory = publicKeyFactory;
        this.warnings = warnings;
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public void cleanup() {
        this.imageCache.clear();
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public Transaction createTransaction(SdkTransactionId sdkTransactionId, String directoryServerID, String str, boolean z11, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String str2, StripeUiCustomization uiCustomization) {
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(directoryServerID, "directoryServerID");
        s.g(directoryServerName, "directoryServerName");
        s.g(rootCerts, "rootCerts");
        s.g(dsPublicKey, "dsPublicKey");
        s.g(uiCustomization, "uiCustomization");
        return createTransaction(directoryServerID, str, z11, directoryServerName, rootCerts, dsPublicKey, str2, sdkTransactionId);
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public PublicKey getPublicKey(String directoryServerId) {
        s.g(directoryServerId, "directoryServerId");
        return this.publicKeyFactory.create(directoryServerId);
    }

    @Override // com.stripe.android.stripe3ds2.service.StripeThreeDs2Service
    public List<Warning> getWarnings() {
        return this.warnings;
    }

    private final Transaction createTransaction(String str, String str2, boolean z11, String str3, List<? extends X509Certificate> list, PublicKey publicKey, String str4, SdkTransactionId sdkTransactionId) {
        String str5 = str2;
        if (!this.messageVersionRegistry.isSupported(str2)) {
            if (str5 == null) {
                str5 = "";
            }
            throw new InvalidInputException(s.p("Message version is unsupported: ", str5), null, 2, null);
        }
        return this.transactionFactory.create(str, list, publicKey, str4, sdkTransactionId, z11, Brand.Companion.lookup$3ds2sdk_release(str3, this.errorReporter));
    }

    public /* synthetic */ StripeThreeDs2ServiceImpl(Context context, boolean z11, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? false : z11, gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, boolean z11, g workContext) {
        this(context, STRIPE_SDK_REFERENCE_NUMBER, z11, workContext);
        s.g(context, "context");
        s.g(workContext, "workContext");
    }

    public /* synthetic */ StripeThreeDs2ServiceImpl(Context context, String str, boolean z11, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? false : z11, gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeThreeDs2ServiceImpl(Context context, String sdkReferenceNumber, boolean z11, g workContext) {
        this(context, ImageCache.Default.INSTANCE, sdkReferenceNumber, z11, workContext);
        s.g(context, "context");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(workContext, "workContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private StripeThreeDs2ServiceImpl(android.content.Context r13, com.stripe.android.stripe3ds2.utils.ImageCache r14, java.lang.String r15, boolean r16, zz.g r17) {
        /*
            r12 = this;
            com.stripe.android.stripe3ds2.observability.DefaultErrorReporter r11 = new com.stripe.android.stripe3ds2.observability.DefaultErrorReporter
            android.content.Context r1 = r13.getApplicationContext()
            java.lang.String r0 = "context.applicationContext"
            kotlin.jvm.internal.s.f(r1, r0)
            com.stripe.android.stripe3ds2.transaction.Logger$Companion r0 = com.stripe.android.stripe3ds2.transaction.Logger.Companion
            r2 = r16
            com.stripe.android.stripe3ds2.transaction.Logger r4 = r0.get(r2)
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 246(0xf6, float:3.45E-43)
            r10 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r11
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl.<init>(android.content.Context, com.stripe.android.stripe3ds2.utils.ImageCache, java.lang.String, boolean, zz.g):void");
    }

    private StripeThreeDs2ServiceImpl(Context context, ImageCache imageCache, String str, ErrorReporter errorReporter, g gVar) {
        this(context, imageCache, str, errorReporter, new StripeEphemeralKeyPairGenerator(errorReporter), new HardwareIdSupplier(context), new DefaultSecurityChecker(null, 1, null), new MessageVersionRegistry(), gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private StripeThreeDs2ServiceImpl(android.content.Context r16, com.stripe.android.stripe3ds2.utils.ImageCache r17, java.lang.String r18, com.stripe.android.stripe3ds2.observability.ErrorReporter r19, com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator r20, com.stripe.android.stripe3ds2.init.HardwareIdSupplier r21, com.stripe.android.stripe3ds2.init.SecurityChecker r22, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry r23, zz.g r24) {
        /*
            r15 = this;
            r0 = r16
            r1 = r21
            com.stripe.android.stripe3ds2.transaction.DefaultTransactionFactory r4 = new com.stripe.android.stripe3ds2.transaction.DefaultTransactionFactory
            com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory r2 = new com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory
            com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl r6 = new com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl
            android.content.Context r3 = r16.getApplicationContext()
            java.lang.String r5 = "context.applicationContext"
            kotlin.jvm.internal.s.f(r3, r5)
            r6.<init>(r3, r1)
            com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactoryImpl r7 = new com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactoryImpl
            r7.<init>(r1)
            com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository r10 = new com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository
            r1 = r24
            r10.<init>(r0, r1)
            r5 = r2
            r8 = r22
            r9 = r20
            r11 = r23
            r12 = r18
            r13 = r19
            r14 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r18
            r3 = r20
            r4.<init>(r2, r3, r1)
            java.util.List r6 = r22.getWarnings()
            com.stripe.android.stripe3ds2.security.PublicKeyFactory r5 = new com.stripe.android.stripe3ds2.security.PublicKeyFactory
            r3 = r19
            r5.<init>(r0, r3)
            r0 = r15
            r1 = r23
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl.<init>(android.content.Context, com.stripe.android.stripe3ds2.utils.ImageCache, java.lang.String, com.stripe.android.stripe3ds2.observability.ErrorReporter, com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator, com.stripe.android.stripe3ds2.init.HardwareIdSupplier, com.stripe.android.stripe3ds2.init.SecurityChecker, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry, zz.g):void");
    }
}