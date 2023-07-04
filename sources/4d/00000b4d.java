package atd.z;

import com.adyen.threeds2.CompletionEvent;

/* loaded from: classes.dex */
public final class a implements CompletionEvent {

    /* renamed from: a  reason: collision with root package name */
    private final String f6957a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6958b;

    public a(String str, String str2) {
        this.f6957a = str;
        this.f6958b = str2;
    }

    @Override // com.adyen.threeds2.CompletionEvent
    public String getSDKTransactionID() {
        return this.f6957a;
    }

    @Override // com.adyen.threeds2.CompletionEvent
    public String getTransactionStatus() {
        return this.f6958b;
    }

    public String toString() {
        return atd.s0.a.a(-801297827424832L) + getSDKTransactionID() + atd.s0.a.a(-801383726770752L) + getTransactionStatus();
    }
}