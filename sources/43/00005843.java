package com.stripe.android.stripe3ds2.security;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.a;
import com.nimbusds.jose.c;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.q;
import vz.r;
import zp.d;
import zp.h;
import zp.l;

/* loaded from: classes6.dex */
public final class DefaultMessageTransformer implements MessageTransformer {
    public static final int BITS_IN_BYTE = 8;
    public static final Companion Companion = new Companion(null);
    private static final d ENCRYPTION_METHOD = d.f60576d;
    public static final String FIELD_ACS_COUNTER_ACS_TO_SDK = "acsCounterAtoS";
    public static final String FIELD_SDK_COUNTER_SDK_TO_ACS = "sdkCounterStoA";
    private byte counterAcsToSdk;
    private byte counterSdkToAcs;
    private final boolean isLiveMode;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultMessageTransformer(boolean z11, byte b11, byte b12) {
        this.isLiveMode = z11;
        this.counterSdkToAcs = b11;
        this.counterAcsToSdk = b12;
    }

    private final boolean component1() {
        return this.isLiveMode;
    }

    private final byte component2() {
        return this.counterSdkToAcs;
    }

    private final byte component3() {
        return this.counterAcsToSdk;
    }

    public static /* synthetic */ DefaultMessageTransformer copy$default(DefaultMessageTransformer defaultMessageTransformer, boolean z11, byte b11, byte b12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = defaultMessageTransformer.isLiveMode;
        }
        if ((i11 & 2) != 0) {
            b11 = defaultMessageTransformer.counterSdkToAcs;
        }
        if ((i11 & 4) != 0) {
            b12 = defaultMessageTransformer.counterAcsToSdk;
        }
        return defaultMessageTransformer.copy(z11, b11, b12);
    }

    public final DefaultMessageTransformer copy(boolean z11, byte b11, byte b12) {
        return new DefaultMessageTransformer(z11, b11, b12);
    }

    public final l createEncryptionHeader$3ds2sdk_release(String keyId) {
        s.g(keyId, "keyId");
        l d11 = new l.a(h.f60604k, ENCRYPTION_METHOD).m(keyId).d();
        s.f(d11, "Builder(JWEAlgorithm.DIR…yId)\n            .build()");
        return d11;
    }

    @Override // com.stripe.android.stripe3ds2.security.MessageTransformer
    public JSONObject decrypt(String message, SecretKey secretKey) {
        s.g(message, "message");
        s.g(secretKey, "secretKey");
        JSONObject decryptMessage$3ds2sdk_release = decryptMessage$3ds2sdk_release(message, secretKey);
        validateAcsToSdkCounter$3ds2sdk_release(decryptMessage$3ds2sdk_release);
        byte b11 = (byte) (this.counterAcsToSdk + 1);
        this.counterAcsToSdk = b11;
        if (b11 != 0) {
            return decryptMessage$3ds2sdk_release;
        }
        throw new IllegalArgumentException("ACS to SDK counter is zero".toString());
    }

    public final JSONObject decryptMessage$3ds2sdk_release(String message, SecretKey secretKey) {
        s.g(message, "message");
        s.g(secretKey, "secretKey");
        a q11 = a.q(message);
        d t11 = q11.o().t();
        s.f(t11, "jweObject.header.encryptionMethod");
        q11.f(new aq.a(getDecryptionKey$3ds2sdk_release(secretKey, t11)));
        return new JSONObject(q11.b().toString());
    }

    @Override // com.stripe.android.stripe3ds2.security.MessageTransformer
    public String encrypt(JSONObject challengeRequest, SecretKey secretKey) {
        s.g(challengeRequest, "challengeRequest");
        s.g(secretKey, "secretKey");
        String string = challengeRequest.getString(ChallengeRequestData.FIELD_ACS_TRANS_ID);
        s.f(string, "challengeRequest.getStri…tData.FIELD_ACS_TRANS_ID)");
        l createEncryptionHeader$3ds2sdk_release = createEncryptionHeader$3ds2sdk_release(string);
        q0 q0Var = q0.f34921a;
        String format = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.counterSdkToAcs)}, 1));
        s.f(format, "format(locale, format, *args)");
        challengeRequest.put(FIELD_SDK_COUNTER_SDK_TO_ACS, format);
        a aVar = new a(createEncryptionHeader$3ds2sdk_release, new c(challengeRequest.toString()));
        d t11 = createEncryptionHeader$3ds2sdk_release.t();
        s.f(t11, "header.encryptionMethod");
        aVar.g(new TransactionEncrypter(getEncryptionKey$3ds2sdk_release(secretKey, t11), this.counterSdkToAcs));
        byte b11 = (byte) (this.counterSdkToAcs + 1);
        this.counterSdkToAcs = b11;
        if (b11 != 0) {
            String r11 = aVar.r();
            s.f(r11, "jweObject.serialize()");
            return r11;
        }
        throw new IllegalArgumentException("SDK to ACS counter is zero".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultMessageTransformer) {
            DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) obj;
            return this.isLiveMode == defaultMessageTransformer.isLiveMode && this.counterSdkToAcs == defaultMessageTransformer.counterSdkToAcs && this.counterAcsToSdk == defaultMessageTransformer.counterAcsToSdk;
        }
        return false;
    }

    public final byte[] getDecryptionKey$3ds2sdk_release(SecretKey secretKey, d encryptionMethod) {
        s.g(secretKey, "secretKey");
        s.g(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        d dVar = d.f60581i;
        if (dVar == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, encoded.length - (dVar.b() / 8), encoded.length);
            s.f(copyOfRange, "{\n            Arrays.cop…e\n            )\n        }");
            return copyOfRange;
        }
        s.f(encoded, "{\n            encodedKey\n        }");
        return encoded;
    }

    public final byte[] getEncryptionKey$3ds2sdk_release(SecretKey secretKey, d encryptionMethod) {
        s.g(secretKey, "secretKey");
        s.g(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        d dVar = d.f60581i;
        if (dVar == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, dVar.b() / 8);
            s.f(copyOfRange, "{\n            Arrays.cop…E\n            )\n        }");
            return copyOfRange;
        }
        s.f(encoded, "{\n            encodedKey\n        }");
        return encoded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.isLiveMode;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (((r02 * 31) + Byte.hashCode(this.counterSdkToAcs)) * 31) + Byte.hashCode(this.counterAcsToSdk);
    }

    public String toString() {
        return "DefaultMessageTransformer(isLiveMode=" + this.isLiveMode + ", counterSdkToAcs=" + ((int) this.counterSdkToAcs) + ", counterAcsToSdk=" + ((int) this.counterAcsToSdk) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void validateAcsToSdkCounter$3ds2sdk_release(JSONObject cres) {
        Object b11;
        s.g(cres, "cres");
        if (this.isLiveMode) {
            if (cres.has(FIELD_ACS_COUNTER_ACS_TO_SDK)) {
                try {
                    q.a aVar = q.f54772b;
                    String string = cres.getString(FIELD_ACS_COUNTER_ACS_TO_SDK);
                    s.f(string, "cres.getString(FIELD_ACS_COUNTER_ACS_TO_SDK)");
                    b11 = q.b(Byte.valueOf(Byte.parseByte(string)));
                } catch (Throwable th2) {
                    q.a aVar2 = q.f54772b;
                    b11 = q.b(r.a(th2));
                }
                if (q.e(b11) == null) {
                    byte byteValue = ((Number) b11).byteValue();
                    if (this.counterAcsToSdk == byteValue) {
                        return;
                    }
                    ProtocolError protocolError = ProtocolError.DataDecryptionFailure;
                    throw new ChallengeResponseParseException(protocolError, "Counters are not equal. SDK counter: " + ((int) this.counterAcsToSdk) + ", ACS counter: " + ((int) byteValue));
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(FIELD_ACS_COUNTER_ACS_TO_SDK);
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(FIELD_ACS_COUNTER_ACS_TO_SDK);
        }
    }

    public DefaultMessageTransformer(boolean z11) {
        this(z11, (byte) 0, (byte) 0);
    }
}