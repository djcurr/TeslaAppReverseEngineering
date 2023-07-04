package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import fq.b;
import java.security.interfaces.ECPublicKey;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nq.j;
import org.json.JSONObject;
import vz.q;
import vz.r;
import wz.s0;

/* loaded from: classes6.dex */
public final class DefaultAcsDataParser implements AcsDataParser {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_ACS_EPHEM_PUB_KEY = "acsEphemPubKey";
    public static final String FIELD_ACS_URL = "acsURL";
    public static final String FIELD_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
    private final ErrorReporter errorReporter;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultAcsDataParser(ErrorReporter errorReporter) {
        s.g(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    private final ECPublicKey parsePublicKey(Object obj) {
        b v11;
        if (obj instanceof Map) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            v11 = b.w((Map) obj);
        } else {
            String obj2 = obj == null ? null : obj.toString();
            if (obj2 == null) {
                obj2 = "";
            }
            v11 = b.v(obj2);
        }
        ECPublicKey x11 = v11.x();
        s.f(x11, "when (ephemPubkey) {\n   …        }.toECPublicKey()");
        return x11;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.AcsDataParser
    public AcsData parse(JSONObject payloadJson) {
        Object b11;
        Map v11;
        s.g(payloadJson, "payloadJson");
        try {
            q.a aVar = q.f54772b;
            Map<String, Object> m11 = j.m(payloadJson.toString());
            s.f(m11, "parse(payloadJson.toString())");
            v11 = s0.v(m11);
            b11 = q.b(new AcsData(String.valueOf(v11.get(FIELD_ACS_URL)), parsePublicKey(v11.get(FIELD_ACS_EPHEM_PUB_KEY)), parsePublicKey(v11.get(FIELD_SDK_EPHEM_PUB_KEY))));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            this.errorReporter.reportError(new IllegalArgumentException(s.p("Failed to parse ACS data: ", payloadJson), e11));
        }
        r.b(b11);
        return (AcsData) b11;
    }
}