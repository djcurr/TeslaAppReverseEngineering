package atd.j0;

import atd.r0.f;
import com.adyen.threeds2.AuthenticationRequestParameters;

/* loaded from: classes.dex */
public final class a implements AuthenticationRequestParameters {

    /* renamed from: a  reason: collision with root package name */
    private final String f6886a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6887b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6888c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6889d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6890e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6891f;

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        f.a((Object) str, atd.y.a.SDK_TRANSACTION_ID);
        f.a((Object) str2, atd.y.a.DEVICE_DATA);
        f.a((Object) str3, atd.y.a.SDK_EPHEMERAL_PUBLIC_KEY);
        f.a((Object) str4, atd.y.a.SDK_APP_ID);
        f.a((Object) str5, atd.y.a.SDK_REFERENCE_NUMBER);
        f.a((Object) str6, atd.y.a.MESSAGE_VERSION);
        this.f6886a = str;
        this.f6887b = str2;
        this.f6888c = str3;
        this.f6889d = str4;
        this.f6890e = str5;
        this.f6891f = str6;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public String getDeviceData() {
        return this.f6887b;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public String getMessageVersion() {
        return this.f6891f;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public String getSDKAppID() {
        return this.f6889d;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public String getSDKEphemeralPublicKey() {
        return this.f6888c;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public String getSDKReferenceNumber() {
        return this.f6890e;
    }

    @Override // com.adyen.threeds2.AuthenticationRequestParameters
    public String getSDKTransactionID() {
        return this.f6886a;
    }
}