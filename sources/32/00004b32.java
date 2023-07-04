package com.stripe.android;

import com.stripe.android.EphemeralOperation;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.model.parsers.EphemeralKeyJsonParser;
import java.util.Calendar;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.o;
import org.json.JSONException;
import org.json.JSONObject;
import vz.b0;
import vz.q;
import vz.r;
import wz.x0;

/* loaded from: classes2.dex */
public final class EphemeralKeyManager {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final long REFRESH_BUFFER_IN_SECONDS = 30;
    private final String apiVersion;
    private /* synthetic */ EphemeralKey ephemeralKey;
    private final EphemeralKeyProvider ephemeralKeyProvider;
    private final KeyManagerListener listener;
    private final long timeBufferInSeconds;
    private final h00.a<Long> timeSupplier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.EphemeralKeyManager$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends u implements h00.a<Long> {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class ClientKeyUpdateListener implements EphemeralKeyUpdateListener {
        private final EphemeralKeyManager ephemeralKeyManager;
        private final EphemeralOperation operation;

        public ClientKeyUpdateListener(EphemeralKeyManager ephemeralKeyManager, EphemeralOperation operation) {
            s.g(ephemeralKeyManager, "ephemeralKeyManager");
            s.g(operation, "operation");
            this.ephemeralKeyManager = ephemeralKeyManager;
            this.operation = operation;
        }

        @Override // com.stripe.android.EphemeralKeyUpdateListener
        public void onKeyUpdate(String stripeResponseJson) {
            s.g(stripeResponseJson, "stripeResponseJson");
            this.ephemeralKeyManager.updateKey(this.operation, stripeResponseJson);
        }

        @Override // com.stripe.android.EphemeralKeyUpdateListener
        public void onKeyUpdateFailure(int i11, String message) {
            s.g(message, "message");
            this.ephemeralKeyManager.updateKeyError(this.operation.getId$payments_core_release(), i11, message);
        }
    }

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface KeyManagerListener {
        void onKeyError(String str, int i11, String str2);

        void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation ephemeralOperation);
    }

    public EphemeralKeyManager(EphemeralKeyProvider ephemeralKeyProvider, KeyManagerListener listener, OperationIdFactory operationIdFactory, boolean z11, h00.a<Long> timeSupplier, long j11) {
        Set d11;
        s.g(ephemeralKeyProvider, "ephemeralKeyProvider");
        s.g(listener, "listener");
        s.g(operationIdFactory, "operationIdFactory");
        s.g(timeSupplier, "timeSupplier");
        this.ephemeralKeyProvider = ephemeralKeyProvider;
        this.listener = listener;
        this.timeSupplier = timeSupplier;
        this.timeBufferInSeconds = j11;
        this.apiVersion = ApiVersion.Companion.get().getCode();
        if (z11) {
            String create = operationIdFactory.create();
            d11 = x0.d();
            retrieveEphemeralKey$payments_core_release(new EphemeralOperation.RetrieveKey(create, d11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateKey(EphemeralOperation ephemeralOperation, String str) {
        Object b11;
        String f11;
        if (str == null) {
            this.listener.onKeyError(ephemeralOperation.getId$payments_core_release(), 500, "EphemeralKeyUpdateListener.onKeyUpdate was called with a null value");
            return;
        }
        try {
            q.a aVar = q.f54772b;
            EphemeralKey parse = new EphemeralKeyJsonParser().parse(new JSONObject(str));
            setEphemeralKey$payments_core_release(parse);
            b11 = q.b(parse);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Throwable e11 = q.e(b11);
        if (e11 == null) {
            this.listener.onKeyUpdate((EphemeralKey) b11, ephemeralOperation);
            return;
        }
        if (e11 instanceof JSONException) {
            f11 = o.f("\n                        Received an ephemeral key that could not be parsed. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        " + ((Object) e11.getMessage()) + "\n                        ");
        } else {
            f11 = o.f("\n                        Received an invalid ephemeral key. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        " + ((Object) e11.getMessage()) + "\n                        ");
        }
        this.listener.onKeyError(ephemeralOperation.getId$payments_core_release(), 500, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateKeyError(String str, int i11, String str2) {
        this.ephemeralKey = null;
        this.listener.onKeyError(str, i11, str2);
    }

    public final EphemeralKey getEphemeralKey$payments_core_release() {
        return this.ephemeralKey;
    }

    public final /* synthetic */ void retrieveEphemeralKey$payments_core_release(EphemeralOperation operation) {
        s.g(operation, "operation");
        EphemeralKey ephemeralKey = this.ephemeralKey;
        b0 b0Var = null;
        if (ephemeralKey == null || shouldRefreshKey$payments_core_release(ephemeralKey)) {
            ephemeralKey = null;
        }
        if (ephemeralKey != null) {
            this.listener.onKeyUpdate(ephemeralKey, operation);
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            this.ephemeralKeyProvider.createEphemeralKey(this.apiVersion, new ClientKeyUpdateListener(this, operation));
        }
    }

    public final void setEphemeralKey$payments_core_release(EphemeralKey ephemeralKey) {
        this.ephemeralKey = ephemeralKey;
    }

    public final boolean shouldRefreshKey$payments_core_release(EphemeralKey ephemeralKey) {
        if (ephemeralKey == null) {
            return true;
        }
        return ephemeralKey.getExpires$payments_core_release() < TimeUnit.MILLISECONDS.toSeconds(this.timeSupplier.invoke().longValue()) + this.timeBufferInSeconds;
    }

    /* loaded from: classes2.dex */
    public interface Factory {
        EphemeralKeyManager create(KeyManagerListener keyManagerListener);

        /* loaded from: classes2.dex */
        public static final class Default implements Factory {
            public static final int $stable = 0;
            private final EphemeralKeyProvider keyProvider;
            private final OperationIdFactory operationIdFactory;
            private final boolean shouldPrefetchEphemeralKey;
            private final h00.a<Long> timeSupplier;

            /* renamed from: com.stripe.android.EphemeralKeyManager$Factory$Default$1  reason: invalid class name */
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

            public Default(EphemeralKeyProvider keyProvider, boolean z11, OperationIdFactory operationIdFactory, h00.a<Long> timeSupplier) {
                s.g(keyProvider, "keyProvider");
                s.g(operationIdFactory, "operationIdFactory");
                s.g(timeSupplier, "timeSupplier");
                this.keyProvider = keyProvider;
                this.shouldPrefetchEphemeralKey = z11;
                this.operationIdFactory = operationIdFactory;
                this.timeSupplier = timeSupplier;
            }

            @Override // com.stripe.android.EphemeralKeyManager.Factory
            public /* synthetic */ EphemeralKeyManager create(KeyManagerListener arg) {
                s.g(arg, "arg");
                return new EphemeralKeyManager(this.keyProvider, arg, this.operationIdFactory, this.shouldPrefetchEphemeralKey, this.timeSupplier, 0L, 32, null);
            }

            public /* synthetic */ Default(EphemeralKeyProvider ephemeralKeyProvider, boolean z11, OperationIdFactory operationIdFactory, h00.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(ephemeralKeyProvider, z11, (i11 & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i11 & 8) != 0 ? AnonymousClass1.INSTANCE : aVar);
            }
        }
    }

    public /* synthetic */ EphemeralKeyManager(EphemeralKeyProvider ephemeralKeyProvider, KeyManagerListener keyManagerListener, OperationIdFactory operationIdFactory, boolean z11, h00.a aVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ephemeralKeyProvider, keyManagerListener, (i11 & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? AnonymousClass1.INSTANCE : aVar, (i11 & 32) != 0 ? 30L : j11);
    }
}