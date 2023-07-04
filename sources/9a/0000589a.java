package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.AppInfo;
import com.stripe.android.stripe3ds2.init.AppInfoRepository;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.JweEncrypter;
import h00.p;
import java.security.PublicKey;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlin.text.o;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$2", f = "DefaultAuthenticationRequestParametersFactory.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DefaultAuthenticationRequestParametersFactory$create$2 extends l implements p<o0, d<? super AuthenticationRequestParameters>, Object> {
    final /* synthetic */ String $directoryServerId;
    final /* synthetic */ PublicKey $directoryServerPublicKey;
    final /* synthetic */ String $keyId;
    final /* synthetic */ PublicKey $sdkPublicKey;
    final /* synthetic */ SdkTransactionId $sdkTransactionId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultAuthenticationRequestParametersFactory this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAuthenticationRequestParametersFactory$create$2(SdkTransactionId sdkTransactionId, DefaultAuthenticationRequestParametersFactory defaultAuthenticationRequestParametersFactory, PublicKey publicKey, String str, String str2, PublicKey publicKey2, d<? super DefaultAuthenticationRequestParametersFactory$create$2> dVar) {
        super(2, dVar);
        this.$sdkTransactionId = sdkTransactionId;
        this.this$0 = defaultAuthenticationRequestParametersFactory;
        this.$sdkPublicKey = publicKey;
        this.$keyId = str;
        this.$directoryServerId = str2;
        this.$directoryServerPublicKey = publicKey2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        DefaultAuthenticationRequestParametersFactory$create$2 defaultAuthenticationRequestParametersFactory$create$2 = new DefaultAuthenticationRequestParametersFactory$create$2(this.$sdkTransactionId, this.this$0, this.$sdkPublicKey, this.$keyId, this.$directoryServerId, this.$directoryServerPublicKey, dVar);
        defaultAuthenticationRequestParametersFactory$create$2.L$0 = obj;
        return defaultAuthenticationRequestParametersFactory$create$2;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super AuthenticationRequestParameters> dVar) {
        return ((DefaultAuthenticationRequestParametersFactory$create$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        String str;
        AppInfoRepository appInfoRepository;
        SdkTransactionId sdkTransactionId;
        ErrorReporter errorReporter;
        String f11;
        JweEncrypter jweEncrypter;
        String str2;
        MessageVersionRegistry messageVersionRegistry;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            o0 o0Var = (o0) this.L$0;
            DefaultAuthenticationRequestParametersFactory defaultAuthenticationRequestParametersFactory = this.this$0;
            PublicKey publicKey = this.$directoryServerPublicKey;
            String str3 = this.$directoryServerId;
            String str4 = this.$keyId;
            try {
                q.a aVar = q.f54772b;
                jweEncrypter = defaultAuthenticationRequestParametersFactory.jweEncrypter;
                b11 = q.b(jweEncrypter.encrypt(defaultAuthenticationRequestParametersFactory.getDeviceDataJson$3ds2sdk_release(), publicKey, str3, str4));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            DefaultAuthenticationRequestParametersFactory defaultAuthenticationRequestParametersFactory2 = this.this$0;
            String str5 = this.$directoryServerId;
            String str6 = this.$keyId;
            SdkTransactionId sdkTransactionId2 = this.$sdkTransactionId;
            Throwable e11 = q.e(b11);
            if (e11 != null) {
                errorReporter = defaultAuthenticationRequestParametersFactory2.errorReporter;
                f11 = o.f("\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId=" + str5 + "\n                    keyId=" + ((Object) str6) + "\n                    sdkTransactionId=" + sdkTransactionId2 + "\n                    ");
                errorReporter.reportError(new RuntimeException(f11, e11));
            }
            Throwable e12 = q.e(b11);
            if (e12 == null) {
                str = (String) b11;
                SdkTransactionId sdkTransactionId3 = this.$sdkTransactionId;
                appInfoRepository = this.this$0.appInfoRepository;
                this.L$0 = str;
                this.L$1 = sdkTransactionId3;
                this.label = 1;
                Object obj2 = appInfoRepository.get(this);
                if (obj2 == d11) {
                    return d11;
                }
                sdkTransactionId = sdkTransactionId3;
                obj = obj2;
            } else {
                throw new SDKRuntimeException(e12);
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            str = (String) this.L$0;
            r.b(obj);
            sdkTransactionId = (SdkTransactionId) this.L$1;
        }
        String sdkAppId = ((AppInfo) obj).getSdkAppId();
        str2 = this.this$0.sdkReferenceNumber;
        String n11 = DefaultAuthenticationRequestParametersFactory.Companion.createPublicJwk$3ds2sdk_release(this.$sdkPublicKey, this.$keyId, this.this$0.getKeyUse$3ds2sdk_release(this.$directoryServerId)).n();
        s.f(n11, "createPublicJwk(\n       …         ).toJSONString()");
        messageVersionRegistry = this.this$0.messageVersionRegistry;
        return new AuthenticationRequestParameters(str, sdkTransactionId, sdkAppId, str2, n11, messageVersionRegistry.getCurrent());
    }
}