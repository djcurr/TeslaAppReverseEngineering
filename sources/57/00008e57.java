package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0019\u0010\u0005\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lokhttp3/CipherSuite;", "", "", "-deprecated_javaName", "()Ljava/lang/String;", "javaName", "toString", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class CipherSuite {
    public static final Companion Companion;
    private static final Map<String, CipherSuite> INSTANCES;
    private static final Comparator<String> ORDER_BY_NAME;
    public static final CipherSuite TLS_AES_128_CCM_8_SHA256;
    public static final CipherSuite TLS_AES_128_CCM_SHA256;
    public static final CipherSuite TLS_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_DSS_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_DHE_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_DH_anon_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_DH_anon_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA;
    public static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    public static final CipherSuite TLS_FALLBACK_SCSV;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_MD5;
    public static final CipherSuite TLS_KRB5_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_KRB5_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_PSK_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final CipherSuite TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    public static final CipherSuite TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_128_GCM_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA256;
    public static final CipherSuite TLS_RSA_WITH_AES_256_GCM_SHA384;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_DES_CBC_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_MD5;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA;
    public static final CipherSuite TLS_RSA_WITH_NULL_SHA256;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_MD5;
    public static final CipherSuite TLS_RSA_WITH_RC4_128_SHA;
    public static final CipherSuite TLS_RSA_WITH_SEED_CBC_SHA;
    private final String javaName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b}\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R,\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001c\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0016\u0010\u001d\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010\u001f\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0016\u0010 \u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0016\u0010!\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0016\u0010\"\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0016\u0010#\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0016\u0010$\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u0016\u0010%\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0016\u0010&\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0014R\u0016\u0010'\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0014R\u0016\u0010(\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014R\u0016\u0010)\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0014R\u0016\u0010*\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0014R\u0016\u0010+\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0014R\u0016\u0010,\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0014R\u0016\u0010-\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0014R\u0016\u0010.\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0014R\u0016\u0010/\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0014R\u0016\u00100\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0014R\u0016\u00101\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0014R\u0016\u00102\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u0016\u00103\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0014R\u0016\u00104\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0014R\u0016\u00105\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0014R\u0016\u00106\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0014R\u0016\u00107\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0014R\u0016\u00108\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0014R\u0016\u00109\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0014R\u0016\u0010:\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u0016\u0010;\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0014R\u0016\u0010<\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0014R\u0016\u0010=\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0014R\u0016\u0010>\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0014R\u0016\u0010?\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0014R\u0016\u0010@\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0014R\u0016\u0010A\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0014R\u0016\u0010B\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0014R\u0016\u0010C\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0014R\u0016\u0010D\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0014R\u0016\u0010E\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0014R\u0016\u0010F\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0014R\u0016\u0010G\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0014R\u0016\u0010H\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0014R\u0016\u0010I\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0014R\u0016\u0010J\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0014R\u0016\u0010K\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0014R\u0016\u0010L\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0014R\u0016\u0010M\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0014R\u0016\u0010N\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0014R\u0016\u0010O\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0014R\u0016\u0010P\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0014R\u0016\u0010Q\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0014R\u0016\u0010R\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0014R\u0016\u0010S\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0014R\u0016\u0010T\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0014R\u0016\u0010U\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0014R\u0016\u0010V\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0014R\u0016\u0010W\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0014R\u0016\u0010X\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0014R\u0016\u0010Y\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0014R\u0016\u0010Z\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0014R\u0016\u0010[\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0014R\u0016\u0010\\\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0014R\u0016\u0010]\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0014R\u0016\u0010^\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0014R\u0016\u0010_\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0014R\u0016\u0010`\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0014R\u0016\u0010a\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0014R\u0016\u0010b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0014R\u0016\u0010c\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0014R\u0016\u0010d\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0014R\u0016\u0010e\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0014R\u0016\u0010f\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0014R\u0016\u0010g\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0014R\u0016\u0010h\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0014R\u0016\u0010i\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0014R\u0016\u0010j\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0014R\u0016\u0010k\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0014R\u0016\u0010l\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0014R\u0016\u0010m\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0014R\u0016\u0010n\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0014R\u0016\u0010o\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0014R\u0016\u0010p\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0014R\u0016\u0010q\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0014R\u0016\u0010r\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0014R\u0016\u0010s\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0014R\u0016\u0010t\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0014R\u0016\u0010u\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0014R\u0016\u0010v\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0014R\u0016\u0010w\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0014R\u0016\u0010x\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0014R\u0016\u0010y\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0014R\u0016\u0010z\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0014R\u0016\u0010{\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0014R\u0016\u0010|\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0014R\u0016\u0010}\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0014R\u0016\u0010~\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0014R\u0016\u0010\u007f\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0014R\u0018\u0010\u0080\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0014R\u0018\u0010\u0081\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0014R\u0018\u0010\u0082\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0014R\u0018\u0010\u0083\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0014R\u0018\u0010\u0084\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0014R\u0018\u0010\u0085\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0014R\u0018\u0010\u0086\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0014R\u0018\u0010\u0087\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0014R\u0018\u0010\u0088\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0014R\u0018\u0010\u0089\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0014R\u0018\u0010\u008a\u0001\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0014¨\u0006\u008d\u0001"}, d2 = {"Lokhttp3/CipherSuite$Companion;", "", "", "javaName", "secondaryName", "", "value", "Lokhttp3/CipherSuite;", "init", "forJavaName", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "getORDER_BY_NAME$okhttp", "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lokhttp3/CipherSuite;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CipherSuite init(String str, int i11) {
            CipherSuite cipherSuite = new CipherSuite(str, null);
            CipherSuite.INSTANCES.put(str, cipherSuite);
            return cipherSuite;
        }

        private final String secondaryName(String str) {
            boolean H;
            boolean H2;
            H = v.H(str, "TLS_", false, 2, null);
            if (H) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SSL_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring = str.substring(4);
                s.f(substring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                return sb2.toString();
            }
            H2 = v.H(str, "SSL_", false, 2, null);
            if (H2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("TLS_");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String substring2 = str.substring(4);
                s.f(substring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(substring2);
                return sb3.toString();
            }
            return str;
        }

        public final synchronized CipherSuite forJavaName(String javaName) {
            CipherSuite cipherSuite;
            s.g(javaName, "javaName");
            cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(javaName);
            if (cipherSuite == null) {
                cipherSuite = (CipherSuite) CipherSuite.INSTANCES.get(secondaryName(javaName));
                if (cipherSuite == null) {
                    cipherSuite = new CipherSuite(javaName, null);
                }
                CipherSuite.INSTANCES.put(javaName, cipherSuite);
            }
            return cipherSuite;
        }

        public final Comparator<String> getORDER_BY_NAME$okhttp() {
            return CipherSuite.ORDER_BY_NAME;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        ORDER_BY_NAME = new Comparator<String>() { // from class: okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1
            @Override // java.util.Comparator
            public int compare(String a11, String b11) {
                s.g(a11, "a");
                s.g(b11, "b");
                int min = Math.min(a11.length(), b11.length());
                for (int i11 = 4; i11 < min; i11++) {
                    char charAt = a11.charAt(i11);
                    char charAt2 = b11.charAt(i11);
                    if (charAt != charAt2) {
                        return s.i(charAt, charAt2) < 0 ? -1 : 1;
                    }
                }
                int length = a11.length();
                int length2 = b11.length();
                if (length != length2) {
                    return length < length2 ? -1 : 1;
                }
                return 0;
            }
        };
        INSTANCES = new LinkedHashMap();
        TLS_RSA_WITH_NULL_MD5 = companion.init("SSL_RSA_WITH_NULL_MD5", 1);
        TLS_RSA_WITH_NULL_SHA = companion.init("SSL_RSA_WITH_NULL_SHA", 2);
        TLS_RSA_EXPORT_WITH_RC4_40_MD5 = companion.init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        TLS_RSA_WITH_RC4_128_MD5 = companion.init("SSL_RSA_WITH_RC4_128_MD5", 4);
        TLS_RSA_WITH_RC4_128_SHA = companion.init("SSL_RSA_WITH_RC4_128_SHA", 5);
        TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = companion.init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        TLS_RSA_WITH_DES_CBC_SHA = companion.init("SSL_RSA_WITH_DES_CBC_SHA", 9);
        TLS_RSA_WITH_3DES_EDE_CBC_SHA = companion.init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = companion.init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        TLS_DHE_DSS_WITH_DES_CBC_SHA = companion.init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = companion.init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = companion.init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        TLS_DHE_RSA_WITH_DES_CBC_SHA = companion.init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = companion.init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = companion.init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        TLS_DH_anon_WITH_RC4_128_MD5 = companion.init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = companion.init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        TLS_DH_anon_WITH_DES_CBC_SHA = companion.init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = companion.init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        TLS_KRB5_WITH_DES_CBC_SHA = companion.init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        TLS_KRB5_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        TLS_KRB5_WITH_RC4_128_SHA = companion.init("TLS_KRB5_WITH_RC4_128_SHA", 32);
        TLS_KRB5_WITH_DES_CBC_MD5 = companion.init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = companion.init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        TLS_KRB5_WITH_RC4_128_MD5 = companion.init("TLS_KRB5_WITH_RC4_128_MD5", 36);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = companion.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        TLS_KRB5_EXPORT_WITH_RC4_40_SHA = companion.init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = companion.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = companion.init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        TLS_RSA_WITH_AES_128_CBC_SHA = companion.init("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA = companion.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA = companion.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        TLS_DH_anon_WITH_AES_128_CBC_SHA = companion.init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        TLS_RSA_WITH_AES_256_CBC_SHA = companion.init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA = companion.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA = companion.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        TLS_DH_anon_WITH_AES_256_CBC_SHA = companion.init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        TLS_RSA_WITH_NULL_SHA256 = companion.init("TLS_RSA_WITH_NULL_SHA256", 59);
        TLS_RSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        TLS_RSA_WITH_AES_256_CBC_SHA256 = companion.init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = companion.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = companion.init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = companion.init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = companion.init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = companion.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = companion.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        TLS_DH_anon_WITH_AES_128_CBC_SHA256 = companion.init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        TLS_DH_anon_WITH_AES_256_CBC_SHA256 = companion.init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = companion.init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = companion.init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = companion.init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        TLS_PSK_WITH_RC4_128_SHA = companion.init("TLS_PSK_WITH_RC4_128_SHA", 138);
        TLS_PSK_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        TLS_PSK_WITH_AES_128_CBC_SHA = companion.init("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        TLS_PSK_WITH_AES_256_CBC_SHA = companion.init("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        TLS_RSA_WITH_SEED_CBC_SHA = companion.init("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        TLS_RSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        TLS_RSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = companion.init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256);
        TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = companion.init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
        TLS_DH_anon_WITH_AES_128_GCM_SHA256 = companion.init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256);
        TLS_DH_anon_WITH_AES_256_GCM_SHA384 = companion.init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384);
        TLS_EMPTY_RENEGOTIATION_INFO_SCSV = companion.init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        TLS_FALLBACK_SCSV = companion.init("TLS_FALLBACK_SCSV", org.spongycastle.crypto.tls.CipherSuite.TLS_FALLBACK_SCSV);
        TLS_ECDH_ECDSA_WITH_NULL_SHA = companion.init("TLS_ECDH_ECDSA_WITH_NULL_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA);
        TLS_ECDH_ECDSA_WITH_RC4_128_SHA = companion.init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA);
        TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA);
        TLS_ECDHE_ECDSA_WITH_NULL_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA);
        TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA);
        TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA);
        TLS_ECDH_RSA_WITH_NULL_SHA = companion.init("TLS_ECDH_RSA_WITH_NULL_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA);
        TLS_ECDH_RSA_WITH_RC4_128_SHA = companion.init("TLS_ECDH_RSA_WITH_RC4_128_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA);
        TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA);
        TLS_ECDHE_RSA_WITH_NULL_SHA = companion.init("TLS_ECDHE_RSA_WITH_NULL_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA);
        TLS_ECDHE_RSA_WITH_RC4_128_SHA = companion.init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA);
        TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA);
        TLS_ECDH_anon_WITH_NULL_SHA = companion.init("TLS_ECDH_anon_WITH_NULL_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA);
        TLS_ECDH_anon_WITH_RC4_128_SHA = companion.init("TLS_ECDH_anon_WITH_RC4_128_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA);
        TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = companion.init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA);
        TLS_ECDH_anon_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA);
        TLS_ECDH_anon_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = companion.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = companion.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = companion.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = companion.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384);
        TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256);
        TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384);
        TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256);
        TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384);
        TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256);
        TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384);
        TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = companion.init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256);
        TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = companion.init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384);
        TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = companion.init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA);
        TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = companion.init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", org.spongycastle.crypto.tls.CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA);
        TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = companion.init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", org.spongycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = companion.init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", org.spongycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256);
        TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = companion.init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", org.spongycastle.crypto.tls.CipherSuite.DRAFT_TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = companion.init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", org.spongycastle.crypto.tls.CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256);
        TLS_AES_128_GCM_SHA256 = companion.init("TLS_AES_128_GCM_SHA256", 4865);
        TLS_AES_256_GCM_SHA384 = companion.init("TLS_AES_256_GCM_SHA384", 4866);
        TLS_CHACHA20_POLY1305_SHA256 = companion.init("TLS_CHACHA20_POLY1305_SHA256", 4867);
        TLS_AES_128_CCM_SHA256 = companion.init("TLS_AES_128_CCM_SHA256", 4868);
        TLS_AES_128_CCM_8_SHA256 = companion.init("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private CipherSuite(String str) {
        this.javaName = str;
    }

    public static final synchronized CipherSuite forJavaName(String str) {
        CipherSuite forJavaName;
        synchronized (CipherSuite.class) {
            forJavaName = Companion.forJavaName(str);
        }
        return forJavaName;
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m842deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }

    public /* synthetic */ CipherSuite(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}