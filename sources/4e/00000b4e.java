package atd.z;

import com.adyen.threeds2.ErrorMessage;

/* loaded from: classes.dex */
public final class b implements ErrorMessage {

    /* renamed from: a  reason: collision with root package name */
    private final String f6959a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6960b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6961c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6962d;

    public b(String str, String str2, String str3, String str4) {
        this.f6959a = str;
        this.f6960b = str2;
        this.f6961c = str3;
        this.f6962d = str4;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public String getErrorCode() {
        return this.f6960b;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public String getErrorDescription() {
        return this.f6961c;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public String getErrorDetails() {
        return this.f6962d;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public String getTransactionID() {
        return this.f6959a;
    }

    public String toString() {
        return atd.s0.a.a(-800640697428544L) + getTransactionID() + atd.s0.a.a(-800705121937984L) + getErrorCode() + atd.s0.a.a(-800511848409664L) + getErrorDescription() + atd.s0.a.a(-800872625662528L) + getErrorDetails();
    }
}