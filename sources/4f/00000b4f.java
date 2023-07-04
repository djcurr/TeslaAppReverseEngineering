package atd.z;

import com.adyen.threeds2.ErrorMessage;
import com.adyen.threeds2.ProtocolErrorEvent;

/* loaded from: classes.dex */
public final class c implements ProtocolErrorEvent {

    /* renamed from: a  reason: collision with root package name */
    private final String f6963a;

    /* renamed from: b  reason: collision with root package name */
    private final ErrorMessage f6964b;

    public c(String str, ErrorMessage errorMessage) {
        this.f6963a = str;
        this.f6964b = errorMessage;
    }

    @Override // com.adyen.threeds2.ProtocolErrorEvent
    public ErrorMessage getErrorMessage() {
        return this.f6964b;
    }

    @Override // com.adyen.threeds2.ProtocolErrorEvent
    public String getSDKTransactionID() {
        return this.f6963a;
    }

    public String toString() {
        return atd.s0.a.a(-800941345139264L) + getSDKTransactionID() + atd.s0.a.a(-800752366578240L) + getErrorMessage();
    }
}