package op;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.nio.ByteBuffer;

@g(tags = {19})
/* loaded from: classes2.dex */
public class j extends b {

    /* renamed from: d  reason: collision with root package name */
    byte[] f42914d;

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        if (a() > 0) {
            byte[] bArr = new byte[a()];
            this.f42914d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // op.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.f42914d;
        sb2.append(bArr == null ? Address.ADDRESS_NULL_PLACEHOLDER : hb.b.a(bArr));
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}