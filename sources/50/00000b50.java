package atd.z;

import com.adyen.threeds2.RuntimeErrorEvent;

/* loaded from: classes.dex */
public final class d implements RuntimeErrorEvent {

    /* renamed from: a  reason: collision with root package name */
    private final String f6965a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6966b;

    public d(String str, String str2) {
        this.f6965a = str;
        this.f6966b = str2;
    }

    @Override // com.adyen.threeds2.RuntimeErrorEvent
    public String getErrorCode() {
        return this.f6965a;
    }

    @Override // com.adyen.threeds2.RuntimeErrorEvent
    public String getErrorMessage() {
        return this.f6966b;
    }

    public String toString() {
        return atd.s0.a.a(-800821086054976L) + getErrorCode() + atd.s0.a.a(-800043696974400L) + getErrorMessage();
    }
}