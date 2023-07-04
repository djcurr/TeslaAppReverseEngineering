package com.stripe.android;

import android.content.Context;
import com.stripe.android.CustomerSession;
import com.stripe.android.EphemeralKeyManager;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.core.StripeError;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.Source;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.f2;
import v20.k;
import v20.p0;
import v20.s1;
import vz.b0;
import wz.x0;
import zz.g;

/* loaded from: classes2.dex */
public final class CustomerSession {
    private static final int KEEP_ALIVE_TIME = 2;
    private static final int THREAD_POOL_SIZE = 3;
    private static /* synthetic */ CustomerSession instance;
    private /* synthetic */ Customer customer;
    private /* synthetic */ long customerCacheTime;
    private final EphemeralKeyManager ephemeralKeyManager;
    private final Map<String, RetrievalListener> listeners;
    private final CustomerSessionOperationExecutor operationExecutor;
    private final OperationIdFactory operationIdFactory;
    private final h00.a<Long> timeSupplier;
    private final g workContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;
    private static final long CUSTOMER_CACHE_DURATION_MILLISECONDS = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: com.stripe.android.CustomerSession$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends u implements h00.a<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Long invoke() {
            return Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final g createCoroutineDispatcher() {
            return s1.c(new ThreadPoolExecutor(3, 3, 2L, CustomerSession.KEEP_ALIVE_TIME_UNIT, new LinkedBlockingQueue()));
        }

        public static /* synthetic */ void initCustomerSession$default(Companion companion, Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            companion.initCustomerSession(context, ephemeralKeyProvider, z11);
        }

        public final void cancelCallbacks() {
            CustomerSession instance$payments_core_release = getInstance$payments_core_release();
            if (instance$payments_core_release == null) {
                return;
            }
            instance$payments_core_release.cancel$payments_core_release();
        }

        public final /* synthetic */ void clearInstance$payments_core_release() {
            cancelCallbacks();
            setInstance$payments_core_release(null);
        }

        public final void endCustomerSession() {
            clearInstance$payments_core_release();
        }

        public final CustomerSession getInstance() {
            CustomerSession instance$payments_core_release = getInstance$payments_core_release();
            if (instance$payments_core_release != null) {
                return instance$payments_core_release;
            }
            throw new IllegalStateException("Attempted to get instance of CustomerSession without initialization.".toString());
        }

        public final CustomerSession getInstance$payments_core_release() {
            return CustomerSession.instance;
        }

        public final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
            s.g(context, "context");
            s.g(ephemeralKeyProvider, "ephemeralKeyProvider");
            initCustomerSession$default(this, context, ephemeralKeyProvider, false, 4, null);
        }

        public final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z11) {
            s.g(context, "context");
            s.g(ephemeralKeyProvider, "ephemeralKeyProvider");
            StripeOperationIdFactory stripeOperationIdFactory = new StripeOperationIdFactory();
            CustomerSession$Companion$initCustomerSession$timeSupplier$1 customerSession$Companion$initCustomerSession$timeSupplier$1 = CustomerSession$Companion$initCustomerSession$timeSupplier$1.INSTANCE;
            EphemeralKeyManager.Factory.Default r12 = new EphemeralKeyManager.Factory.Default(ephemeralKeyProvider, z11, stripeOperationIdFactory, customerSession$Companion$initCustomerSession$timeSupplier$1);
            PaymentConfiguration companion = PaymentConfiguration.Companion.getInstance(context);
            setInstance$payments_core_release(new CustomerSession(context, new StripeApiRepository(context, new CustomerSession$Companion$initCustomerSession$1(companion), Stripe.Companion.getAppInfo(), null, null, null, null, null, null, null, null, null, null, null, 16376, null), companion.getPublishableKey(), companion.getStripeAccountId(), createCoroutineDispatcher(), stripeOperationIdFactory, customerSession$Companion$initCustomerSession$timeSupplier$1, r12));
        }

        public final void setInstance$payments_core_release(CustomerSession customerSession) {
            CustomerSession.instance = customerSession;
        }
    }

    /* loaded from: classes2.dex */
    public interface CustomerRetrievalListener extends RetrievalListener {
        void onCustomerRetrieved(Customer customer);
    }

    /* loaded from: classes2.dex */
    public interface PaymentMethodRetrievalListener extends RetrievalListener {
        void onPaymentMethodRetrieved(PaymentMethod paymentMethod);
    }

    /* loaded from: classes2.dex */
    public interface PaymentMethodsRetrievalListener extends RetrievalListener {
        void onPaymentMethodsRetrieved(List<PaymentMethod> list);
    }

    /* loaded from: classes2.dex */
    public interface RetrievalListener {
        void onError(int i11, String str, StripeError stripeError);
    }

    /* loaded from: classes2.dex */
    public interface SourceRetrievalListener extends RetrievalListener {
        void onSourceRetrieved(Source source);
    }

    public CustomerSession(Context context, StripeRepository stripeRepository, String publishableKey, String str, g workContext, OperationIdFactory operationIdFactory, h00.a<Long> timeSupplier, EphemeralKeyManager.Factory ephemeralKeyManagerFactory) {
        s.g(context, "context");
        s.g(stripeRepository, "stripeRepository");
        s.g(publishableKey, "publishableKey");
        s.g(workContext, "workContext");
        s.g(operationIdFactory, "operationIdFactory");
        s.g(timeSupplier, "timeSupplier");
        s.g(ephemeralKeyManagerFactory, "ephemeralKeyManagerFactory");
        this.workContext = workContext;
        this.operationIdFactory = operationIdFactory;
        this.timeSupplier = timeSupplier;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.listeners = linkedHashMap;
        this.operationExecutor = new CustomerSessionOperationExecutor(stripeRepository, publishableKey, str, linkedHashMap, new CustomerSession$operationExecutor$1(this));
        this.ephemeralKeyManager = ephemeralKeyManagerFactory.create(new EphemeralKeyManager.KeyManagerListener() { // from class: com.stripe.android.CustomerSession$ephemeralKeyManager$1
            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyError(String operationId, int i11, String errorMessage) {
                Map map;
                s.g(operationId, "operationId");
                s.g(errorMessage, "errorMessage");
                map = CustomerSession.this.listeners;
                CustomerSession.RetrievalListener retrievalListener = (CustomerSession.RetrievalListener) map.remove(operationId);
                if (retrievalListener == null) {
                    return;
                }
                retrievalListener.onError(i11, errorMessage, null);
            }

            @Override // com.stripe.android.EphemeralKeyManager.KeyManagerListener
            public void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation operation) {
                g gVar;
                s.g(ephemeralKey, "ephemeralKey");
                s.g(operation, "operation");
                gVar = CustomerSession.this.workContext;
                k.d(p0.a(gVar), null, null, new CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1(CustomerSession.this, ephemeralKey, operation, null), 3, null);
            }
        });
    }

    public static final void cancelCallbacks() {
        Companion.cancelCallbacks();
    }

    public static final void endCustomerSession() {
        Companion.endCustomerSession();
    }

    private final boolean getCanUseCachedCustomer() {
        return this.customer != null && this.timeSupplier.invoke().longValue() - this.customerCacheTime < CUSTOMER_CACHE_DURATION_MILLISECONDS;
    }

    public static final CustomerSession getInstance() {
        return Companion.getInstance();
    }

    private final <L extends RetrievalListener> L getListener(String str) {
        return (L) this.listeners.remove(str);
    }

    public static /* synthetic */ void getPaymentMethods$default(CustomerSession customerSession, PaymentMethod.Type type, Integer num, String str, String str2, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener, int i11, Object obj) {
        customerSession.getPaymentMethods(type, num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, paymentMethodsRetrievalListener);
    }

    public static /* synthetic */ void getPaymentMethods$payments_core_release$default(CustomerSession customerSession, PaymentMethod.Type type, Integer num, String str, String str2, Set set, PaymentMethodsRetrievalListener paymentMethodsRetrievalListener, int i11, Object obj) {
        customerSession.getPaymentMethods$payments_core_release(type, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, set, paymentMethodsRetrievalListener);
    }

    public static final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider) {
        Companion.initCustomerSession(context, ephemeralKeyProvider);
    }

    public static final void initCustomerSession(Context context, EphemeralKeyProvider ephemeralKeyProvider, boolean z11) {
        Companion.initCustomerSession(context, ephemeralKeyProvider, z11);
    }

    private final void startOperation(EphemeralOperation ephemeralOperation, RetrievalListener retrievalListener) {
        this.listeners.put(ephemeralOperation.getId$payments_core_release(), retrievalListener);
        this.ephemeralKeyManager.retrieveEphemeralKey$payments_core_release(ephemeralOperation);
    }

    public final void addCustomerSource(String sourceId, String sourceType, SourceRetrievalListener listener) {
        Set d11;
        s.g(sourceId, "sourceId");
        s.g(sourceType, "sourceType");
        s.g(listener, "listener");
        d11 = x0.d();
        addCustomerSource$payments_core_release(sourceId, sourceType, d11, listener);
    }

    public final /* synthetic */ void addCustomerSource$payments_core_release(String sourceId, String sourceType, Set productUsage, SourceRetrievalListener listener) {
        s.g(sourceId, "sourceId");
        s.g(sourceType, "sourceType");
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        startOperation(new EphemeralOperation.Customer.AddSource(sourceId, sourceType, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void attachPaymentMethod(String paymentMethodId, PaymentMethodRetrievalListener listener) {
        Set d11;
        s.g(paymentMethodId, "paymentMethodId");
        s.g(listener, "listener");
        d11 = x0.d();
        attachPaymentMethod$payments_core_release(paymentMethodId, d11, listener);
    }

    public final /* synthetic */ void attachPaymentMethod$payments_core_release(String paymentMethodId, Set productUsage, PaymentMethodRetrievalListener listener) {
        s.g(paymentMethodId, "paymentMethodId");
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        startOperation(new EphemeralOperation.Customer.AttachPaymentMethod(paymentMethodId, this.operationIdFactory.create(), productUsage), listener);
    }

    public final /* synthetic */ void cancel$payments_core_release() {
        this.listeners.clear();
        f2.i(this.workContext, null, 1, null);
    }

    public final void deleteCustomerSource(String sourceId, SourceRetrievalListener listener) {
        Set d11;
        s.g(sourceId, "sourceId");
        s.g(listener, "listener");
        d11 = x0.d();
        deleteCustomerSource$payments_core_release(sourceId, d11, listener);
    }

    public final /* synthetic */ void deleteCustomerSource$payments_core_release(String sourceId, Set productUsage, SourceRetrievalListener listener) {
        s.g(sourceId, "sourceId");
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        startOperation(new EphemeralOperation.Customer.DeleteSource(sourceId, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void detachPaymentMethod(String paymentMethodId, PaymentMethodRetrievalListener listener) {
        Set d11;
        s.g(paymentMethodId, "paymentMethodId");
        s.g(listener, "listener");
        d11 = x0.d();
        detachPaymentMethod$payments_core_release(paymentMethodId, d11, listener);
    }

    public final /* synthetic */ void detachPaymentMethod$payments_core_release(String paymentMethodId, Set productUsage, PaymentMethodRetrievalListener listener) {
        s.g(paymentMethodId, "paymentMethodId");
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        startOperation(new EphemeralOperation.Customer.DetachPaymentMethod(paymentMethodId, this.operationIdFactory.create(), productUsage), listener);
    }

    public final Customer getCachedCustomer() {
        Customer customer = this.customer;
        if (getCanUseCachedCustomer()) {
            return customer;
        }
        return null;
    }

    public final Customer getCustomer$payments_core_release() {
        return this.customer;
    }

    public final long getCustomerCacheTime$payments_core_release() {
        return this.customerCacheTime;
    }

    public final void getPaymentMethods(PaymentMethod.Type paymentMethodType, Integer num, PaymentMethodsRetrievalListener listener) {
        s.g(paymentMethodType, "paymentMethodType");
        s.g(listener, "listener");
        getPaymentMethods$default(this, paymentMethodType, num, null, null, listener, 12, null);
    }

    public final void getPaymentMethods(PaymentMethod.Type paymentMethodType, Integer num, String str, PaymentMethodsRetrievalListener listener) {
        s.g(paymentMethodType, "paymentMethodType");
        s.g(listener, "listener");
        getPaymentMethods$default(this, paymentMethodType, num, str, null, listener, 8, null);
    }

    public final void getPaymentMethods(PaymentMethod.Type paymentMethodType, Integer num, String str, String str2, PaymentMethodsRetrievalListener listener) {
        Set d11;
        s.g(paymentMethodType, "paymentMethodType");
        s.g(listener, "listener");
        d11 = x0.d();
        getPaymentMethods$payments_core_release(paymentMethodType, num, str, str2, d11, listener);
    }

    public final /* synthetic */ void getPaymentMethods$payments_core_release(PaymentMethod.Type paymentMethodType, Integer num, String str, String str2, Set productUsage, PaymentMethodsRetrievalListener listener) {
        s.g(paymentMethodType, "paymentMethodType");
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        startOperation(new EphemeralOperation.Customer.GetPaymentMethods(paymentMethodType, num, str, str2, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void retrieveCurrentCustomer(CustomerRetrievalListener listener) {
        Set d11;
        s.g(listener, "listener");
        d11 = x0.d();
        retrieveCurrentCustomer$payments_core_release(d11, listener);
    }

    public final /* synthetic */ void retrieveCurrentCustomer$payments_core_release(Set productUsage, CustomerRetrievalListener listener) {
        b0 b0Var;
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        Customer cachedCustomer = getCachedCustomer();
        if (cachedCustomer == null) {
            b0Var = null;
        } else {
            listener.onCustomerRetrieved(cachedCustomer);
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            updateCurrentCustomer$payments_core_release(productUsage, listener);
        }
    }

    public final void setCustomer$payments_core_release(Customer customer) {
        this.customer = customer;
    }

    public final void setCustomerCacheTime$payments_core_release(long j11) {
        this.customerCacheTime = j11;
    }

    public final void setCustomerDefaultSource(String sourceId, String sourceType, CustomerRetrievalListener listener) {
        Set d11;
        s.g(sourceId, "sourceId");
        s.g(sourceType, "sourceType");
        s.g(listener, "listener");
        d11 = x0.d();
        setCustomerDefaultSource$payments_core_release(sourceId, sourceType, d11, listener);
    }

    public final /* synthetic */ void setCustomerDefaultSource$payments_core_release(String sourceId, String sourceType, Set productUsage, CustomerRetrievalListener listener) {
        s.g(sourceId, "sourceId");
        s.g(sourceType, "sourceType");
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        startOperation(new EphemeralOperation.Customer.UpdateDefaultSource(sourceId, sourceType, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void setCustomerShippingInformation(ShippingInformation shippingInformation, CustomerRetrievalListener listener) {
        Set d11;
        s.g(shippingInformation, "shippingInformation");
        s.g(listener, "listener");
        d11 = x0.d();
        setCustomerShippingInformation$payments_core_release(shippingInformation, d11, listener);
    }

    public final /* synthetic */ void setCustomerShippingInformation$payments_core_release(ShippingInformation shippingInformation, Set productUsage, CustomerRetrievalListener listener) {
        s.g(shippingInformation, "shippingInformation");
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        startOperation(new EphemeralOperation.Customer.UpdateShipping(shippingInformation, this.operationIdFactory.create(), productUsage), listener);
    }

    public final void updateCurrentCustomer(CustomerRetrievalListener listener) {
        Set d11;
        s.g(listener, "listener");
        d11 = x0.d();
        updateCurrentCustomer$payments_core_release(d11, listener);
    }

    public final /* synthetic */ void updateCurrentCustomer$payments_core_release(Set productUsage, CustomerRetrievalListener listener) {
        s.g(productUsage, "productUsage");
        s.g(listener, "listener");
        this.customer = null;
        startOperation(new EphemeralOperation.RetrieveKey(this.operationIdFactory.create(), productUsage), listener);
    }

    public final void getPaymentMethods(PaymentMethod.Type paymentMethodType, PaymentMethodsRetrievalListener listener) {
        Set d11;
        s.g(paymentMethodType, "paymentMethodType");
        s.g(listener, "listener");
        d11 = x0.d();
        getPaymentMethods$payments_core_release$default(this, paymentMethodType, null, null, null, d11, listener, 14, null);
    }

    public /* synthetic */ CustomerSession(Context context, StripeRepository stripeRepository, String str, String str2, g gVar, OperationIdFactory operationIdFactory, h00.a aVar, EphemeralKeyManager.Factory factory, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, stripeRepository, str, str2, (i11 & 16) != 0 ? Companion.createCoroutineDispatcher() : gVar, (i11 & 32) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i11 & 64) != 0 ? AnonymousClass1.INSTANCE : aVar, factory);
    }
}