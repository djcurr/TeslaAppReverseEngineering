package io.grpc.okhttp.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class f implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final f f31543a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f31544b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private f() {
    }

    private static List<String> a(X509Certificate x509Certificate, int i11) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i11 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    static boolean c(String str) {
        return f31544b.matcher(str).matches();
    }

    private boolean d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith(CallerDataConverter.DEFAULT_RANGE_DELIMITER) && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith(CallerDataConverter.DEFAULT_RANGE_DELIMITER)) {
            if (!str.endsWith(".")) {
                str = str + CoreConstants.DOT;
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + CoreConstants.DOT;
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(Marker.ANY_MARKER)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (str.endsWith(substring)) {
                int length = str.length() - substring.length();
                return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
            }
            return false;
        }
        return false;
    }

    private boolean e(String str, X509Certificate x509Certificate) {
        String b11;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> a11 = a(x509Certificate, 2);
        int size = a11.size();
        int i11 = 0;
        boolean z11 = false;
        while (i11 < size) {
            if (d(lowerCase, a11.get(i11))) {
                return true;
            }
            i11++;
            z11 = true;
        }
        if (z11 || (b11 = new d(x509Certificate.getSubjectX500Principal()).b("cn")) == null) {
            return false;
        }
        return d(lowerCase, b11);
    }

    private boolean f(String str, X509Certificate x509Certificate) {
        List<String> a11 = a(x509Certificate, 7);
        int size = a11.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (str.equalsIgnoreCase(a11.get(i11))) {
                return true;
            }
        }
        return false;
    }

    public boolean b(String str, X509Certificate x509Certificate) {
        if (c(str)) {
            return f(str, x509Certificate);
        }
        return e(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}