package op;

import androidx.recyclerview.widget.l;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

@g(tags = {19, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_EMPLOYER_NOT_FOUND_VALUE, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 168, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 176, CipherSuite.TLS_PSK_WITH_NULL_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, 184, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, 188, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 190, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, Primes.SMALL_FACTOR_LIMIT, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, 251, 252, 253})
/* loaded from: classes2.dex */
public class i extends b {

    /* renamed from: d  reason: collision with root package name */
    byte[] f42913d;

    static {
        Logger.getLogger(i.class.getName());
    }

    @Override // op.b
    public void e(ByteBuffer byteBuffer) {
        if (a() > 0) {
            byte[] bArr = new byte[this.f42879b];
            this.f42913d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // op.b
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.f42913d;
        sb2.append(bArr == null ? Address.ADDRESS_NULL_PLACEHOLDER : hb.b.a(bArr));
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}