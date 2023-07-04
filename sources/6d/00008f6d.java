package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/tls/TrustRootIndex;", "", "Ljava/security/cert/X509Certificate;", "cert", "findByIssuerAndSignature", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface TrustRootIndex {
    X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate);
}