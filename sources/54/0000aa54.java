package p6;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import androidx.lifecycle.v;
import com.adyen.checkout.adyen3ds2.exception.Authentication3DS2Exception;
import com.adyen.checkout.adyen3ds2.exception.Cancelled3DS2Exception;
import com.adyen.checkout.adyen3ds2.model.ChallengeToken;
import com.adyen.checkout.adyen3ds2.model.FingerprintToken;
import com.adyen.checkout.components.ActionComponentData;
import com.adyen.checkout.components.model.payments.response.Action;
import com.adyen.checkout.components.model.payments.response.Threeds2Action;
import com.adyen.checkout.components.model.payments.response.Threeds2ChallengeAction;
import com.adyen.checkout.components.model.payments.response.Threeds2FingerprintAction;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.threeds2.AuthenticationRequestParameters;
import com.adyen.threeds2.ChallengeStatusReceiver;
import com.adyen.threeds2.CompletionEvent;
import com.adyen.threeds2.ErrorMessage;
import com.adyen.threeds2.ProtocolErrorEvent;
import com.adyen.threeds2.RuntimeErrorEvent;
import com.adyen.threeds2.ThreeDS2Service;
import com.adyen.threeds2.Transaction;
import com.adyen.threeds2.customization.UiCustomization;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.exception.SDKAlreadyInitializedException;
import com.adyen.threeds2.exception.SDKNotInitializedException;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.adyen.threeds2.parameters.ChallengeParameters;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import com.stripe.android.stripe3ds2.transaction.DefaultAcsDataParser;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import h00.p;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;
import org.json.JSONObject;
import s6.b;
import v20.e1;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import zz.g;

/* loaded from: classes.dex */
public final class a extends e7.b<p6.c> implements ChallengeStatusReceiver {

    /* renamed from: j  reason: collision with root package name */
    public static final C0985a f46332j = new C0985a(null);

    /* renamed from: k  reason: collision with root package name */
    private static final String f46333k;

    /* renamed from: l  reason: collision with root package name */
    public static final c7.b<a, p6.c> f46334l;

    /* renamed from: m  reason: collision with root package name */
    private static boolean f46335m;

    /* renamed from: e  reason: collision with root package name */
    private final s6.a f46336e;

    /* renamed from: f  reason: collision with root package name */
    private final p6.d f46337f;

    /* renamed from: g  reason: collision with root package name */
    private final s7.a f46338g;

    /* renamed from: h  reason: collision with root package name */
    private Transaction f46339h;

    /* renamed from: i  reason: collision with root package name */
    private UiCustomization f46340i;

    /* renamed from: p6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0985a {
        private C0985a() {
        }

        public /* synthetic */ C0985a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f46341a;

        static {
            int[] iArr = new int[Threeds2Action.c.values().length];
            iArr[Threeds2Action.c.FINGERPRINT.ordinal()] = 1;
            iArr[Threeds2Action.c.CHALLENGE.ordinal()] = 2;
            f46341a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends zz.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f46342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.a aVar, a aVar2) {
            super(aVar);
            this.f46342a = aVar2;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(g gVar, Throwable th2) {
            o7.b.d(a.f46333k, "Unexpected uncaught 3DS2 Exception", th2);
            this.f46342a.k(new CheckoutException("Unexpected 3DS2 exception.", th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.adyen3ds2.Adyen3DS2Component$identifyShopper$1", f = "Adyen3DS2Component.kt", l = {246}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f46343a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f46344b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f46345c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ConfigParameters f46346d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f46347e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ FingerprintToken f46348f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f46349g;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.adyen3ds2.Adyen3DS2Component$identifyShopper$1$1", f = "Adyen3DS2Component.kt", l = {}, m = "invokeSuspend")
        /* renamed from: p6.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0986a extends l implements p<o0, zz.d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f46350a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f46351b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f46352c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0986a(a aVar, String str, zz.d<? super C0986a> dVar) {
                super(2, dVar);
                this.f46351b = aVar;
                this.f46352c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new C0986a(this.f46351b, this.f46352c, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
                return ((C0986a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f46350a == 0) {
                    r.b(obj);
                    a aVar = this.f46351b;
                    aVar.j(aVar.f46337f.b(this.f46352c));
                    return b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Activity activity, ConfigParameters configParameters, a aVar, FingerprintToken fingerprintToken, boolean z11, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f46345c = activity;
            this.f46346d = configParameters;
            this.f46347e = aVar;
            this.f46348f = fingerprintToken;
            this.f46349g = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            d dVar2 = new d(this.f46345c, this.f46346d, this.f46347e, this.f46348f, this.f46349g, dVar);
            dVar2.f46344b = obj;
            return dVar2;
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((d) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f46343a;
            if (i11 == 0) {
                r.b(obj);
                o0 o0Var = (o0) this.f46344b;
                try {
                    o7.b.a(a.f46333k, "initialize 3DS2 SDK");
                    ThreeDS2Service.INSTANCE.initialize(this.f46345c, this.f46346d, null, this.f46347e.f46340i);
                } catch (SDKAlreadyInitializedException unused) {
                    o7.b.g(a.f46333k, "3DS2 Service already initialized.");
                } catch (SDKRuntimeException e11) {
                    this.f46347e.k(new ComponentException("Failed to initialize 3DS2 SDK", e11));
                    return b0.f54756a;
                }
                a aVar = this.f46347e;
                try {
                    o7.b.a(a.f46333k, "create transaction");
                    if (this.f46348f.getThreeDSMessageVersion() != null) {
                        aVar.f46339h = ThreeDS2Service.INSTANCE.createTransaction(null, this.f46348f.getThreeDSMessageVersion());
                        Transaction transaction = this.f46347e.f46339h;
                        AuthenticationRequestParameters authenticationRequestParameters = transaction == null ? null : transaction.getAuthenticationRequestParameters();
                        if (authenticationRequestParameters == null) {
                            this.f46347e.k(new ComponentException("Failed to retrieve 3DS2 authentication parameters"));
                            return b0.f54756a;
                        }
                        String B = this.f46347e.B(authenticationRequestParameters);
                        if (!this.f46349g) {
                            k.d(o0Var, e1.c(), null, new C0986a(this.f46347e, B, null), 2, null);
                        } else {
                            a aVar2 = this.f46347e;
                            Activity activity = this.f46345c;
                            this.f46343a = 1;
                            if (aVar2.G(activity, B, this) == d11) {
                                return d11;
                            }
                        }
                    } else {
                        this.f46347e.k(new ComponentException("Failed to create 3DS2 Transaction. Missing threeDSMessageVersion inside fingerprintToken."));
                        return b0.f54756a;
                    }
                } catch (SDKNotInitializedException e12) {
                    this.f46347e.k(new ComponentException("Failed to create 3DS2 Transaction", e12));
                    return b0.f54756a;
                } catch (SDKRuntimeException e13) {
                    this.f46347e.k(new ComponentException("Failed to create 3DS2 Transaction", e13));
                    return b0.f54756a;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.adyen3ds2.Adyen3DS2Component", f = "Adyen3DS2Component.kt", l = {257}, m = "submitFingerprintAutomatically")
    /* loaded from: classes.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f46353a;

        /* renamed from: b  reason: collision with root package name */
        Object f46354b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f46355c;

        /* renamed from: e  reason: collision with root package name */
        int f46357e;

        e(zz.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46355c = obj;
            this.f46357e |= Integer.MIN_VALUE;
            return a.this.G(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.adyen.checkout.adyen3ds2.Adyen3DS2Component$submitFingerprintAutomatically$2", f = "Adyen3DS2Component.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f46358a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s6.b f46360c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(s6.b bVar, zz.d<? super f> dVar) {
            super(2, dVar);
            this.f46360c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new f(this.f46360c, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((f) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f46358a == 0) {
                r.b(obj);
                a.this.j(((b.a) this.f46360c).a());
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        String c11 = o7.a.c();
        s.f(c11, "getTag()");
        f46333k = c11;
        f46334l = new p6.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l0 savedStateHandle, Application application, p6.c configuration, s6.a submitFingerprintRepository, p6.d adyen3DS2Serializer, s7.a redirectDelegate) {
        super(savedStateHandle, application, configuration);
        s.g(savedStateHandle, "savedStateHandle");
        s.g(application, "application");
        s.g(configuration, "configuration");
        s.g(submitFingerprintRepository, "submitFingerprintRepository");
        s.g(adyen3DS2Serializer, "adyen3DS2Serializer");
        s.g(redirectDelegate, "redirectDelegate");
        this.f46336e = submitFingerprintRepository;
        this.f46337f = adyen3DS2Serializer;
        this.f46338g = redirectDelegate;
    }

    private final ChallengeParameters A(ChallengeToken challengeToken) {
        ChallengeParameters challengeParameters = new ChallengeParameters();
        challengeParameters.set3DSServerTransactionID(challengeToken.getThreeDSServerTransID());
        challengeParameters.setAcsTransactionID(challengeToken.getAcsTransID());
        challengeParameters.setAcsRefNumber(challengeToken.getAcsReferenceNumber());
        challengeParameters.setAcsSignedContent(challengeToken.getAcsSignedContent());
        if (!s.c(challengeToken.getMessageVersion(), "2.1.0")) {
            challengeParameters.setThreeDSRequestorAppURL(ChallengeParameters.getEmbeddedRequestorAppURL(getApplication()));
        }
        return challengeParameters;
    }

    private final String C() {
        return (String) getSavedStateHandle().c("authorization_token");
    }

    private final void D(Activity activity, Threeds2Action.c cVar, String str) {
        int i11 = b.f46341a[cVar.ordinal()];
        if (i11 == 1) {
            E(activity, str, true);
        } else if (i11 != 2) {
        } else {
            y(activity, str);
        }
    }

    private final void E(Activity activity, String str, boolean z11) {
        o7.b.a(f46333k, s.p("identifyShopper - submitFingerprintAutomatically: ", Boolean.valueOf(z11)));
        String a11 = g7.a.a(str);
        s.f(a11, "decode(encodedFingerprintToken)");
        try {
            FingerprintToken a12 = FingerprintToken.SERIALIZER.a(new JSONObject(a11));
            s.f(a12, "SERIALIZER.deserialize(fingerprintJson)");
            FingerprintToken fingerprintToken = a12;
            ConfigParameters build = new AdyenConfigParameters.Builder(fingerprintToken.getDirectoryServerId(), fingerprintToken.getDirectoryServerPublicKey()).build();
            k.d(q0.a(this), e1.a().plus(new c(CoroutineExceptionHandler.f35225e1, this)), null, new d(activity, build, this, fingerprintToken, z11, null), 2, null);
        } catch (JSONException e11) {
            throw new ComponentException("JSON parsing of FingerprintToken failed", e11);
        }
    }

    private final void F(String str) {
        getSavedStateHandle().h("authorization_token", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: ComponentException -> 0x0031, TryCatch #0 {ComponentException -> 0x0031, blocks: (B:12:0x002d, B:23:0x005d, B:25:0x0067, B:26:0x007b, B:28:0x007f, B:29:0x008b, B:31:0x008f), top: B:38:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: ComponentException -> 0x0031, TryCatch #0 {ComponentException -> 0x0031, blocks: (B:12:0x002d, B:23:0x005d, B:25:0x0067, B:26:0x007b, B:28:0x007f, B:29:0x008b, B:31:0x008f), top: B:38:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G(android.app.Activity r9, java.lang.String r10, zz.d<? super vz.b0> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p6.a.e
            if (r0 == 0) goto L13
            r0 = r11
            p6.a$e r0 = (p6.a.e) r0
            int r1 = r0.f46357e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46357e = r1
            goto L18
        L13:
            p6.a$e r0 = new p6.a$e
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f46355c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f46357e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f46354b
            android.app.Activity r9 = (android.app.Activity) r9
            java.lang.Object r10 = r0.f46353a
            p6.a r10 = (p6.a) r10
            vz.r.b(r11)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            goto L5d
        L31:
            r9 = move-exception
            goto L9b
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            vz.r.b(r11)
            s6.a r11 = r8.f46336e     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            e7.f r2 = r8.f()     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            java.lang.String r4 = "configuration"
            kotlin.jvm.internal.s.f(r2, r4)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            p6.c r2 = (p6.c) r2     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            java.lang.String r4 = r8.g()     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            r0.f46353a = r8     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            r0.f46354b = r9     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            r0.f46357e = r3     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            java.lang.Object r11 = r11.a(r10, r2, r4, r0)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L99
            if (r11 != r1) goto L5c
            return r1
        L5c:
            r10 = r8
        L5d:
            s6.b r11 = (s6.b) r11     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            r0 = 0
            r10.p(r0)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            boolean r1 = r11 instanceof s6.b.a     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            if (r1 == 0) goto L7b
            v20.o0 r2 = androidx.lifecycle.q0.a(r10)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            v20.l2 r3 = v20.e1.c()     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            r4 = 0
            p6.a$f r5 = new p6.a$f     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            r5.<init>(r11, r0)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            r6 = 2
            r7 = 0
            v20.i.d(r2, r3, r4, r5, r6, r7)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            goto L9e
        L7b:
            boolean r0 = r11 instanceof s6.b.C1115b     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            if (r0 == 0) goto L8b
            s7.a r0 = r10.f46338g     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            s6.b$b r11 = (s6.b.C1115b) r11     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            com.adyen.checkout.components.model.payments.response.RedirectAction r11 = r11.a()     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            r0.a(r9, r11)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            goto L9e
        L8b:
            boolean r0 = r11 instanceof s6.b.c     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            if (r0 == 0) goto L9e
            s6.b$c r11 = (s6.b.c) r11     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            com.adyen.checkout.components.model.payments.response.Threeds2Action r11 = r11.a()     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            r10.h(r9, r11)     // Catch: com.adyen.checkout.core.exception.ComponentException -> L31
            goto L9e
        L99:
            r9 = move-exception
            r10 = r8
        L9b:
            r10.k(r9)
        L9e:
            vz.b0 r9 = vz.b0.f54756a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.a.G(android.app.Activity, java.lang.String, zz.d):java.lang.Object");
    }

    private final void y(Activity activity, String str) {
        o7.b.a(f46333k, "challengeShopper");
        if (this.f46339h == null) {
            k(new Authentication3DS2Exception("Failed to make challenge, missing reference to initial transaction."));
            return;
        }
        String a11 = g7.a.a(str);
        s.f(a11, "decode(encodedChallengeToken)");
        try {
            ChallengeToken a12 = ChallengeToken.SERIALIZER.a(new JSONObject(a11));
            s.f(a12, "SERIALIZER.deserialize(challengeTokenJson)");
            ChallengeParameters A = A(a12);
            try {
                Transaction transaction = this.f46339h;
                if (transaction == null) {
                    return;
                }
                transaction.doChallenge(activity, A, this, 10);
            } catch (InvalidInputException e11) {
                k(new CheckoutException("Error starting challenge", e11));
            }
        } catch (JSONException e12) {
            throw new ComponentException("JSON parsing of FingerprintToken failed", e12);
        }
    }

    private final void z(Context context) {
        Transaction transaction = this.f46339h;
        if (transaction != null) {
            transaction.close();
        }
        this.f46339h = null;
        try {
            ThreeDS2Service.INSTANCE.cleanup(context);
        } catch (SDKNotInitializedException unused) {
        }
    }

    public final String B(AuthenticationRequestParameters authenticationRequestParameters) {
        s.g(authenticationRequestParameters, "authenticationRequestParameters");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdkAppID", authenticationRequestParameters.getSDKAppID());
            jSONObject.put("sdkEncData", authenticationRequestParameters.getDeviceData());
            jSONObject.put(DefaultAcsDataParser.FIELD_SDK_EPHEM_PUB_KEY, new JSONObject(authenticationRequestParameters.getSDKEphemeralPublicKey()));
            jSONObject.put("sdkReferenceNumber", authenticationRequestParameters.getSDKReferenceNumber());
            jSONObject.put(ChallengeRequestData.FIELD_SDK_TRANS_ID, authenticationRequestParameters.getSDKTransactionID());
            jSONObject.put(ChallengeRequestData.FIELD_MESSAGE_VERSION, authenticationRequestParameters.getMessageVersion());
            String c11 = g7.a.c(jSONObject.toString());
            s.f(c11, "encode(fingerprintJson.toString())");
            return c11;
        } catch (JSONException e11) {
            throw new ComponentException("Failed to create encoded fingerprint", e11);
        }
    }

    @Override // c7.a
    public boolean a(Action action) {
        s.g(action, "action");
        return f46334l.a(action);
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void cancelled() {
        o7.b.a(f46333k, "challenge cancelled");
        k(new Cancelled3DS2Exception("Challenge canceled."));
        Application application = getApplication();
        s.f(application, "getApplication()");
        z(application);
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void completed(CompletionEvent completionEvent) {
        JSONObject c11;
        s.g(completionEvent, "completionEvent");
        o7.b.a(f46333k, "challenge completed");
        try {
            try {
                String C = C();
                if (C == null) {
                    c11 = this.f46337f.a(completionEvent);
                } else {
                    c11 = this.f46337f.c(completionEvent, C);
                }
                j(c11);
            } catch (CheckoutException e11) {
                k(e11);
            }
        } finally {
            Application application = getApplication();
            s.f(application, "getApplication()");
            z(application);
        }
    }

    @Override // e7.b
    protected void i(Activity activity, Action action) {
        s.g(activity, "activity");
        s.g(action, "action");
        boolean z11 = true;
        if (action instanceof Threeds2FingerprintAction) {
            Threeds2FingerprintAction threeds2FingerprintAction = (Threeds2FingerprintAction) action;
            String token = threeds2FingerprintAction.getToken();
            if (token != null && token.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                String token2 = threeds2FingerprintAction.getToken();
                E(activity, token2 != null ? token2 : "", false);
                return;
            }
            throw new ComponentException("Fingerprint token not found.");
        } else if (action instanceof Threeds2ChallengeAction) {
            Threeds2ChallengeAction threeds2ChallengeAction = (Threeds2ChallengeAction) action;
            String token3 = threeds2ChallengeAction.getToken();
            if (token3 != null && token3.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                String token4 = threeds2ChallengeAction.getToken();
                y(activity, token4 != null ? token4 : "");
                return;
            }
            throw new ComponentException("Challenge token not found.");
        } else if (action instanceof Threeds2Action) {
            Threeds2Action threeds2Action = (Threeds2Action) action;
            String token5 = threeds2Action.getToken();
            if (token5 != null && token5.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                if (threeds2Action.getSubtype() != null) {
                    Threeds2Action.c.a aVar = Threeds2Action.c.Companion;
                    String subtype = threeds2Action.getSubtype();
                    if (subtype == null) {
                        subtype = "";
                    }
                    Threeds2Action.c a11 = aVar.a(subtype);
                    F(threeds2Action.getAuthorisationToken());
                    String token6 = threeds2Action.getToken();
                    D(activity, a11, token6 != null ? token6 : "");
                    return;
                }
                throw new ComponentException("3DS2 Action subtype not found.");
            }
            throw new ComponentException("3DS2 token not found.");
        }
    }

    @Override // e7.b
    public void l(v lifecycleOwner, g0<ActionComponentData> observer) {
        s.g(lifecycleOwner, "lifecycleOwner");
        s.g(observer, "observer");
        super.l(lifecycleOwner, observer);
        if (f46335m) {
            o7.b.c(f46333k, "Lost challenge result reference.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.p0
    public void onCleared() {
        super.onCleared();
        o7.b.a(f46333k, "onCleared");
        if (this.f46339h != null) {
            f46335m = true;
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void protocolError(ProtocolErrorEvent protocolErrorEvent) {
        s.g(protocolErrorEvent, "protocolErrorEvent");
        ErrorMessage errorMessage = protocolErrorEvent.getErrorMessage();
        String str = f46333k;
        o7.b.c(str, "protocolError - " + ((Object) errorMessage.getErrorCode()) + " - " + ((Object) errorMessage.getErrorDescription()) + " - " + ((Object) errorMessage.getErrorDetails()));
        k(new Authentication3DS2Exception(s.p("Protocol Error - ", errorMessage)));
        Application application = getApplication();
        s.f(application, "getApplication()");
        z(application);
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void runtimeError(RuntimeErrorEvent runtimeErrorEvent) {
        s.g(runtimeErrorEvent, "runtimeErrorEvent");
        o7.b.a(f46333k, "runtimeError");
        k(new Authentication3DS2Exception(s.p("Runtime Error - ", runtimeErrorEvent.getErrorMessage())));
        Application application = getApplication();
        s.f(application, "getApplication()");
        z(application);
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public void timedout() {
        o7.b.a(f46333k, "challenge timed out");
        k(new Authentication3DS2Exception("Challenge timed out."));
        Application application = getApplication();
        s.f(application, "getApplication()");
        z(application);
    }
}