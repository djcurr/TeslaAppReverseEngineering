package op;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.nio.ByteBuffer;
import java.util.Arrays;

@g(tags = {5})
/* loaded from: classes2.dex */
public class f extends b {

    /* renamed from: d  reason: collision with root package name */
    byte[] f42898d;

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        int i11 = this.f42879b;
        if (i11 > 0) {
            byte[] bArr = new byte[i11];
            this.f42898d = bArr;
            byteBuffer.get(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f.class == obj.getClass() && Arrays.equals(this.f42898d, ((f) obj).f42898d);
    }

    public int hashCode() {
        byte[] bArr = this.f42898d;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override // op.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderSpecificInfo");
        sb2.append("{bytes=");
        byte[] bArr = this.f42898d;
        sb2.append(bArr == null ? Address.ADDRESS_NULL_PLACEHOLDER : hb.b.a(bArr));
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}