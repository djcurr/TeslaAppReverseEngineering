package atd.y;

import com.adyen.threeds2.exception.SDKRuntimeException;

/* loaded from: classes.dex */
public enum c {
    CHALLENGE_PRESENTATION_FAILURE(atd.s0.a.a(-801731619121728L)),
    CRYPTO_FAILURE(atd.s0.a.a(-801632834873920L)),
    DEVICE_DATA_FAILURE(atd.s0.a.a(-801826108402240L)),
    SECURE_CHANNEL_SETUP_FAILURE(atd.s0.a.a(-801233402915392L)),
    UNKNOWN_DIRECTORY_SERVER(atd.s0.a.a(-801443856312896L));
    
    private final String mErrorMessage;

    c(String str) {
        this.mErrorMessage = str;
    }

    public SDKRuntimeException a() {
        return a(null);
    }

    public SDKRuntimeException a(Throwable th2) {
        return new SDKRuntimeException(this.mErrorMessage, null, null);
    }
}