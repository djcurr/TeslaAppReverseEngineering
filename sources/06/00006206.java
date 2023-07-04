package com.teslamotors.plugins.ble.card;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.teslamotors.plugins.ble.card.OemWalletProvider;
import h00.p;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.k;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.r;
import zu.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007J(\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007J,\u0010!\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0016R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010$8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/teslamotors/plugins/ble/card/OemWalletNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ActivityEventListener;", "", "vin", "", "supported", "authorized", "cardIssued", "Lcom/facebook/react/bridge/WritableMap;", "buildOemWalletStatus", "getName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "authorize", "unauthorize", "getCurrentCardAuthStatus", "carType", "macAddress", "issueCard", "withdrawCard", "getOemWalletStatus", "isIgnoringBatteryOptimizations", "shouldShowBatteryOptimizations", "requestIgnoringBatteryOptimizations", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "intent", "onNewIntent", "Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "_supportedKeyCardProvider", "Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "activityResultPromise", "Lcom/facebook/react/bridge/Promise;", "getSupportedKeyCardProvider", "()Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "supportedKeyCardProvider", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class OemWalletNativeModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private OemWalletProvider _supportedKeyCardProvider;
    private Promise activityResultPromise;
    private final o0 moduleScope;

    @f(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$authorize$1", f = "OemWalletNativeModule.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class a extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OemWalletProvider f22190b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f22191c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f22192d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.teslamotors.plugins.ble.card.OemWalletNativeModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C0408a extends kotlin.jvm.internal.p implements h00.l<Object, b0> {
            C0408a(Object obj) {
                super(1, obj, Promise.class, "resolve", "resolve(Ljava/lang/Object;)V", 0);
            }

            public final void d(Object obj) {
                ((Promise) this.receiver).resolve(obj);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(Object obj) {
                d(obj);
                return b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(OemWalletProvider oemWalletProvider, OemWalletNativeModule oemWalletNativeModule, Promise promise, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f22190b = oemWalletProvider;
            this.f22191c = oemWalletNativeModule;
            this.f22192d = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f22190b, this.f22191c, this.f22192d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f22189a == 0) {
                r.b(obj);
                OemWalletProvider oemWalletProvider = this.f22190b;
                ReactApplicationContext reactApplicationContext = this.f22191c.getReactApplicationContext();
                s.f(reactApplicationContext, "reactApplicationContext");
                oemWalletProvider.authorize(reactApplicationContext, new C0408a(this.f22192d));
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @f(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$getCurrentCardAuthStatus$1", f = "OemWalletNativeModule.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class b extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22193a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f22194b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ OemWalletProvider f22195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f22196d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Promise promise, OemWalletProvider oemWalletProvider, OemWalletNativeModule oemWalletNativeModule, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f22194b = promise;
            this.f22195c = oemWalletProvider;
            this.f22196d = oemWalletNativeModule;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f22194b, this.f22195c, this.f22196d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f22193a == 0) {
                r.b(obj);
                Promise promise = this.f22194b;
                OemWalletProvider oemWalletProvider = this.f22195c;
                ReactApplicationContext reactApplicationContext = this.f22196d.getReactApplicationContext();
                s.f(reactApplicationContext, "reactApplicationContext");
                promise.resolve(kotlin.coroutines.jvm.internal.b.a(oemWalletProvider.currentAuthStatus(reactApplicationContext)));
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @f(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$issueCard$1", f = "OemWalletNativeModule.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class c extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OemWalletProvider f22198b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f22199c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f22200d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f22201e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f22202f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Promise f22203g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(OemWalletProvider oemWalletProvider, String str, String str2, String str3, OemWalletNativeModule oemWalletNativeModule, Promise promise, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f22198b = oemWalletProvider;
            this.f22199c = str;
            this.f22200d = str2;
            this.f22201e = str3;
            this.f22202f = oemWalletNativeModule;
            this.f22203g = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new c(this.f22198b, this.f22199c, this.f22200d, this.f22201e, this.f22202f, this.f22203g, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((c) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f22197a == 0) {
                r.b(obj);
                OemWalletProvider oemWalletProvider = this.f22198b;
                String str = this.f22199c;
                String str2 = this.f22200d;
                String str3 = this.f22201e;
                ReactApplicationContext reactApplicationContext = this.f22202f.getReactApplicationContext();
                s.f(reactApplicationContext, "reactApplicationContext");
                this.f22203g.resolve(kotlin.coroutines.jvm.internal.b.a(oemWalletProvider.issueCard(str, str2, str3, reactApplicationContext)));
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @f(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$unauthorize$1", f = "OemWalletNativeModule.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class d extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OemWalletProvider f22205b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f22206c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f22207d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(OemWalletProvider oemWalletProvider, OemWalletNativeModule oemWalletNativeModule, Promise promise, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f22205b = oemWalletProvider;
            this.f22206c = oemWalletNativeModule;
            this.f22207d = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f22205b, this.f22206c, this.f22207d, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((d) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f22204a == 0) {
                r.b(obj);
                OemWalletProvider oemWalletProvider = this.f22205b;
                ReactApplicationContext reactApplicationContext = this.f22206c.getReactApplicationContext();
                s.f(reactApplicationContext, "reactApplicationContext");
                oemWalletProvider.unauthorize(reactApplicationContext);
                this.f22207d.resolve(kotlin.coroutines.jvm.internal.b.a(true));
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @f(c = "com.teslamotors.plugins.ble.card.OemWalletNativeModule$withdrawCard$1", f = "OemWalletNativeModule.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    static final class e extends l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OemWalletProvider f22209b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f22210c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OemWalletNativeModule f22211d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f22212e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(OemWalletProvider oemWalletProvider, String str, OemWalletNativeModule oemWalletNativeModule, Promise promise, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f22209b = oemWalletProvider;
            this.f22210c = str;
            this.f22211d = oemWalletNativeModule;
            this.f22212e = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new e(this.f22209b, this.f22210c, this.f22211d, this.f22212e, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((e) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f22208a == 0) {
                r.b(obj);
                OemWalletProvider oemWalletProvider = this.f22209b;
                String str = this.f22210c;
                ReactApplicationContext reactApplicationContext = this.f22211d.getReactApplicationContext();
                s.f(reactApplicationContext, "reactApplicationContext");
                this.f22212e.resolve(kotlin.coroutines.jvm.internal.b.a(oemWalletProvider.withdrawCard(str, reactApplicationContext)));
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OemWalletNativeModule(ReactApplicationContext context) {
        super(context);
        s.g(context, "context");
        getReactApplicationContext().addActivityEventListener(this);
        this.moduleScope = p0.a(e1.b());
    }

    private final WritableMap buildOemWalletStatus(String str, boolean z11, boolean z12, boolean z13) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("is_oem_wallet_supported", z11);
        writableNativeMap.putBoolean("is_oem_wallet_authorized", z12);
        writableNativeMap.putBoolean("is_oem_wallet_card_issued", z13);
        writableNativeMap.putString("vin", str);
        return writableNativeMap;
    }

    private final OemWalletProvider getSupportedKeyCardProvider() {
        if (this._supportedKeyCardProvider == null) {
            OemWalletProvider.a aVar = OemWalletProvider.Companion;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            s.f(reactApplicationContext, "reactApplicationContext");
            this._supportedKeyCardProvider = aVar.b(reactApplicationContext);
        }
        return this._supportedKeyCardProvider;
    }

    @ReactMethod
    public final void authorize(Promise promise) {
        s.g(promise, "promise");
        OemWalletProvider supportedKeyCardProvider = getSupportedKeyCardProvider();
        if (supportedKeyCardProvider != null) {
            k.d(this.moduleScope, null, null, new a(supportedKeyCardProvider, this, promise, null), 3, null);
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public final void getCurrentCardAuthStatus(Promise promise) {
        s.g(promise, "promise");
        OemWalletProvider supportedKeyCardProvider = getSupportedKeyCardProvider();
        if (supportedKeyCardProvider != null) {
            k.d(this.moduleScope, null, null, new b(promise, supportedKeyCardProvider, this, null), 3, null);
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "OemWalletNativeModule";
    }

    @ReactMethod
    public final void getOemWalletStatus(String vin, Promise promise) {
        WritableMap buildOemWalletStatus;
        s.g(vin, "vin");
        s.g(promise, "promise");
        OemWalletProvider supportedKeyCardProvider = getSupportedKeyCardProvider();
        if (supportedKeyCardProvider != null) {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            s.f(reactApplicationContext, "reactApplicationContext");
            boolean currentAuthStatus = supportedKeyCardProvider.currentAuthStatus(reactApplicationContext);
            ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
            s.f(reactApplicationContext2, "reactApplicationContext");
            buildOemWalletStatus = buildOemWalletStatus(vin, true, currentAuthStatus, supportedKeyCardProvider.cardIssued(vin, reactApplicationContext2));
        } else {
            buildOemWalletStatus = buildOemWalletStatus(vin, false, false, false);
        }
        promise.resolve(buildOemWalletStatus);
    }

    @ReactMethod
    public final void isIgnoringBatteryOptimizations(Promise promise) {
        s.g(promise, "promise");
        e.a aVar = zu.e.f60767a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.f(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(aVar.b(reactApplicationContext)));
    }

    @ReactMethod
    public final void issueCard(String vin, String carType, String macAddress, Promise promise) {
        s.g(vin, "vin");
        s.g(carType, "carType");
        s.g(macAddress, "macAddress");
        s.g(promise, "promise");
        OemWalletProvider supportedKeyCardProvider = getSupportedKeyCardProvider();
        if (supportedKeyCardProvider != null) {
            k.d(this.moduleScope, null, null, new c(supportedKeyCardProvider, vin, carType, macAddress, this, promise, null), 3, null);
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        Promise promise;
        e.a aVar = zu.e.f60767a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.f(reactApplicationContext, "reactApplicationContext");
        boolean b11 = aVar.b(reactApplicationContext);
        if ((i11 == 1688 || i11 == 8816) && (promise = this.activityResultPromise) != null) {
            promise.resolve(Boolean.valueOf(b11));
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public final void requestIgnoringBatteryOptimizations(Promise promise) {
        s.g(promise, "promise");
        this.activityResultPromise = null;
        if (getSupportedKeyCardProvider() == null) {
            promise.resolve(Boolean.FALSE);
        } else if (getReactApplicationContext().getCurrentActivity() != null) {
            this.activityResultPromise = promise;
            e.a aVar = zu.e.f60767a;
            Activity currentActivity = getReactApplicationContext().getCurrentActivity();
            Objects.requireNonNull(currentActivity, "null cannot be cast to non-null type android.app.Activity");
            aVar.a(currentActivity);
        }
    }

    @ReactMethod
    public final void shouldShowBatteryOptimizations(Promise promise) {
        s.g(promise, "promise");
        OemWalletProvider supportedKeyCardProvider = getSupportedKeyCardProvider();
        if (Build.VERSION.SDK_INT >= 31 && supportedKeyCardProvider != null && s.c(supportedKeyCardProvider.getVendor(), kv.a.f35898a.a())) {
            promise.resolve(Boolean.TRUE);
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public final void unauthorize(Promise promise) {
        s.g(promise, "promise");
        OemWalletProvider supportedKeyCardProvider = getSupportedKeyCardProvider();
        if (supportedKeyCardProvider != null) {
            k.d(this.moduleScope, null, null, new d(supportedKeyCardProvider, this, promise, null), 3, null);
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public final void withdrawCard(String vin, Promise promise) {
        s.g(vin, "vin");
        s.g(promise, "promise");
        OemWalletProvider supportedKeyCardProvider = getSupportedKeyCardProvider();
        if (supportedKeyCardProvider != null) {
            k.d(this.moduleScope, null, null, new e(supportedKeyCardProvider, vin, this, promise, null), 3, null);
        } else {
            promise.resolve(Boolean.FALSE);
        }
    }
}