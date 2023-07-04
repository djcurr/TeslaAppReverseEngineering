package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.init.AppInfoRepository;
import com.stripe.android.stripe3ds2.init.DeviceDataFactory;
import com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory;
import com.stripe.android.stripe3ds2.init.SecurityChecker;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.DefaultJweEncrypter;
import com.stripe.android.stripe3ds2.security.DirectoryServer;
import com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.security.JweEncrypter;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;
import v20.i;
import wz.x;
import zz.d;
import zz.g;

/* loaded from: classes6.dex */
public final class DefaultAuthenticationRequestParametersFactory implements AuthenticationRequestParametersFactory {
    public static final Companion Companion = new Companion(null);
    private static final String DATA_VERSION = "1.1";
    public static final String KEY_DATA_VERSION = "DV";
    public static final String KEY_DEVICE_DATA = "DD";
    public static final String KEY_DEVICE_PARAM_NOT_AVAILABLE = "DPNA";
    public static final String KEY_SECURITY_WARNINGS = "SW";
    private final AppInfoRepository appInfoRepository;
    private final DeviceDataFactory deviceDataFactory;
    private final DeviceParamNotAvailableFactory deviceParamNotAvailableFactory;
    private final ErrorReporter errorReporter;
    private final JweEncrypter jweEncrypter;
    private final MessageVersionRegistry messageVersionRegistry;
    private final String sdkReferenceNumber;
    private final SecurityChecker securityChecker;
    private final g workContext;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final fq.d createPublicJwk$3ds2sdk_release(java.security.PublicKey r3, java.lang.String r4, fq.g r5) {
            /*
                r2 = this;
                java.lang.String r0 = "publicKey"
                kotlin.jvm.internal.s.g(r3, r0)
                fq.b$a r0 = new fq.b$a
                fq.a r1 = fq.a.f26716c
                java.security.interfaces.ECPublicKey r3 = (java.security.interfaces.ECPublicKey) r3
                r0.<init>(r1, r3)
                fq.b$a r3 = r0.c(r5)
                if (r4 == 0) goto L1d
                boolean r5 = kotlin.text.m.w(r4)
                if (r5 == 0) goto L1b
                goto L1d
            L1b:
                r5 = 0
                goto L1e
            L1d:
                r5 = 1
            L1e:
                if (r5 != 0) goto L21
                goto L22
            L21:
                r4 = 0
            L22:
                fq.b$a r3 = r3.b(r4)
                fq.b r3 = r3.a()
                fq.b r3 = r3.z()
                java.lang.String r4 = "Builder(Curve.P_256, pub…           .toPublicJWK()"
                kotlin.jvm.internal.s.f(r3, r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory.Companion.createPublicJwk$3ds2sdk_release(java.security.PublicKey, java.lang.String, fq.g):fq.d");
        }
    }

    public DefaultAuthenticationRequestParametersFactory(DeviceDataFactory deviceDataFactory, DeviceParamNotAvailableFactory deviceParamNotAvailableFactory, SecurityChecker securityChecker, AppInfoRepository appInfoRepository, JweEncrypter jweEncrypter, MessageVersionRegistry messageVersionRegistry, String sdkReferenceNumber, ErrorReporter errorReporter, g workContext) {
        s.g(deviceDataFactory, "deviceDataFactory");
        s.g(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        s.g(securityChecker, "securityChecker");
        s.g(appInfoRepository, "appInfoRepository");
        s.g(jweEncrypter, "jweEncrypter");
        s.g(messageVersionRegistry, "messageVersionRegistry");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(errorReporter, "errorReporter");
        s.g(workContext, "workContext");
        this.deviceDataFactory = deviceDataFactory;
        this.deviceParamNotAvailableFactory = deviceParamNotAvailableFactory;
        this.securityChecker = securityChecker;
        this.appInfoRepository = appInfoRepository;
        this.jweEncrypter = jweEncrypter;
        this.messageVersionRegistry = messageVersionRegistry;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParametersFactory
    public Object create(String str, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, PublicKey publicKey2, d<? super AuthenticationRequestParameters> dVar) {
        return i.g(this.workContext, new DefaultAuthenticationRequestParametersFactory$create$2(sdkTransactionId, this, publicKey2, str2, str, publicKey, null), dVar);
    }

    public final String getDeviceDataJson$3ds2sdk_release() {
        int t11;
        JSONObject put = new JSONObject().put(KEY_DATA_VERSION, DATA_VERSION).put(KEY_DEVICE_DATA, new JSONObject(this.deviceDataFactory.create())).put(KEY_DEVICE_PARAM_NOT_AVAILABLE, new JSONObject(this.deviceParamNotAvailableFactory.create()));
        List<Warning> warnings = this.securityChecker.getWarnings();
        t11 = x.t(warnings, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (Warning warning : warnings) {
            arrayList.add(warning.getId());
        }
        String jSONObject = put.put(KEY_SECURITY_WARNINGS, new JSONArray((Collection) arrayList)).toString();
        s.f(jSONObject, "JSONObject()\n           …              .toString()");
        return jSONObject;
    }

    public final fq.g getKeyUse$3ds2sdk_release(String directoryServerId) {
        DirectoryServer directoryServer;
        s.g(directoryServerId, "directoryServerId");
        DirectoryServer[] values = DirectoryServer.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                directoryServer = null;
                break;
            }
            directoryServer = values[i11];
            i11++;
            if (directoryServer.getIds().contains(directoryServerId)) {
                break;
            }
        }
        if (directoryServer != null) {
            return directoryServer.getKeyUse();
        }
        return fq.g.f26767b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAuthenticationRequestParametersFactory(DeviceDataFactory deviceDataFactory, DeviceParamNotAvailableFactory deviceParamNotAvailableFactory, SecurityChecker securityChecker, EphemeralKeyPairGenerator ephemeralKeyPairGenerator, AppInfoRepository appInfoRepository, MessageVersionRegistry messageVersionRegistry, String sdkReferenceNumber, ErrorReporter errorReporter, g workContext) {
        this(deviceDataFactory, deviceParamNotAvailableFactory, securityChecker, appInfoRepository, new DefaultJweEncrypter(ephemeralKeyPairGenerator, errorReporter), messageVersionRegistry, sdkReferenceNumber, errorReporter, workContext);
        s.g(deviceDataFactory, "deviceDataFactory");
        s.g(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        s.g(securityChecker, "securityChecker");
        s.g(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        s.g(appInfoRepository, "appInfoRepository");
        s.g(messageVersionRegistry, "messageVersionRegistry");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(errorReporter, "errorReporter");
        s.g(workContext, "workContext");
    }
}