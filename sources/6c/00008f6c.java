package okhttp3.internal.tls;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.g0;
import org.slf4j.Marker;
import wz.e0;
import wz.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "verifyIpAddress", "hostname", "verifyHostname", "asciiToLowercase", "isAscii", "pattern", "", "type", "", "getSubjectAltNames", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "allSubjectAltNames", "ALT_DNS_NAME", "I", "ALT_IPA_NAME", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            s.f(locale, "Locale.US");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            s.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i11) {
        List<String> i12;
        List<String> i13;
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!s.c(list.get(0), Integer.valueOf(i11))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            i13 = w.i();
            return i13;
        } catch (CertificateParsingException unused) {
            i12 = w.i();
            return i12;
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) g0.b(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (INSTANCE.verifyHostname(asciiToLowercase, str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String str2 : subjectAltNames) {
            if (s.c(canonicalHost, HostnamesKt.toCanonicalHost(str2))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        List<String> y02;
        s.g(certificate, "certificate");
        y02 = e0.y0(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
        return y02;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Certificate certificate;
        s.g(host, "host");
        s.g(session, "session");
        if (isAscii(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(host, (X509Certificate) certificate);
    }

    public final boolean verify(String host, X509Certificate certificate) {
        s.g(host, "host");
        s.g(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        boolean H;
        boolean t11;
        boolean H2;
        boolean t12;
        boolean t13;
        boolean t14;
        boolean M;
        boolean H3;
        int Y;
        boolean t15;
        int d02;
        if (!(str == null || str.length() == 0)) {
            H = v.H(str, ".", false, 2, null);
            if (!H) {
                t11 = v.t(str, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false, 2, null);
                if (!t11) {
                    if (!(str2 == null || str2.length() == 0)) {
                        H2 = v.H(str2, ".", false, 2, null);
                        if (!H2) {
                            t12 = v.t(str2, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false, 2, null);
                            if (!t12) {
                                t13 = v.t(str, ".", false, 2, null);
                                if (!t13) {
                                    str = str + ".";
                                }
                                String str3 = str;
                                t14 = v.t(str2, ".", false, 2, null);
                                if (!t14) {
                                    str2 = str2 + ".";
                                }
                                String asciiToLowercase = asciiToLowercase(str2);
                                M = kotlin.text.w.M(asciiToLowercase, Marker.ANY_MARKER, false, 2, null);
                                if (!M) {
                                    return s.c(str3, asciiToLowercase);
                                }
                                H3 = v.H(asciiToLowercase, "*.", false, 2, null);
                                if (H3) {
                                    Y = kotlin.text.w.Y(asciiToLowercase, '*', 1, false, 4, null);
                                    if (Y == -1 && str3.length() >= asciiToLowercase.length() && !s.c("*.", asciiToLowercase)) {
                                        String substring = asciiToLowercase.substring(1);
                                        s.f(substring, "(this as java.lang.String).substring(startIndex)");
                                        t15 = v.t(str3, substring, false, 2, null);
                                        if (t15) {
                                            int length = str3.length() - substring.length();
                                            if (length > 0) {
                                                d02 = kotlin.text.w.d0(str3, CoreConstants.DOT, length - 1, false, 4, null);
                                                if (d02 != -1) {
                                                    return false;
                                                }
                                            }
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}