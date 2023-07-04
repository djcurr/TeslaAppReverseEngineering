package okhttp3;

import com.stripe.android.core.networking.RequestHeadersFactory;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import okhttp3.Cookie;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import wz.r0;
import wz.s0;
import wz.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lokhttp3/JavaNetCookieJar;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "", "header", "", "Lokhttp3/Cookie;", "decodeHeaderAsJavaNetCookies", "cookies", "Lvz/b0;", "saveFromResponse", "loadForRequest", "Ljava/net/CookieHandler;", "cookieHandler", "Ljava/net/CookieHandler;", "<init>", "(Ljava/net/CookieHandler;)V", "okhttp-urlconnection"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class JavaNetCookieJar implements CookieJar {
    private final CookieHandler cookieHandler;

    public JavaNetCookieJar(CookieHandler cookieHandler) {
        s.g(cookieHandler, "cookieHandler");
        this.cookieHandler = cookieHandler;
    }

    private final List<Cookie> decodeHeaderAsJavaNetCookies(HttpUrl httpUrl, String str) {
        boolean H;
        boolean H2;
        boolean t11;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int delimiterOffset = Util.delimiterOffset(str, ";,", i11, length);
            int delimiterOffset2 = Util.delimiterOffset(str, '=', i11, delimiterOffset);
            String trimSubstring = Util.trimSubstring(str, i11, delimiterOffset2);
            H = v.H(trimSubstring, "$", false, 2, null);
            if (!H) {
                String trimSubstring2 = delimiterOffset2 < delimiterOffset ? Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset) : "";
                H2 = v.H(trimSubstring2, "\"", false, 2, null);
                if (H2) {
                    t11 = v.t(trimSubstring2, "\"", false, 2, null);
                    if (t11) {
                        trimSubstring2 = trimSubstring2.substring(1, trimSubstring2.length() - 1);
                        s.f(trimSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                }
                arrayList.add(new Cookie.Builder().name(trimSubstring).value(trimSubstring2).domain(httpUrl.host()).build());
            }
            i11 = delimiterOffset + 1;
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl url) {
        List<Cookie> i11;
        Map<String, List<String>> i12;
        List<Cookie> i13;
        boolean u11;
        boolean u12;
        s.g(url, "url");
        try {
            CookieHandler cookieHandler = this.cookieHandler;
            URI uri = url.uri();
            i12 = s0.i();
            Map<String, List<String>> cookieHeaders = cookieHandler.get(uri, i12);
            ArrayList arrayList = null;
            s.f(cookieHeaders, "cookieHeaders");
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                u11 = v.u(RequestHeadersFactory.FraudDetection.HEADER_COOKIE, key, true);
                if (!u11) {
                    u12 = v.u("Cookie2", key, true);
                    if (u12) {
                    }
                }
                s.f(value, "value");
                if (!value.isEmpty()) {
                    for (String header : value) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        s.f(header, "header");
                        arrayList.addAll(decodeHeaderAsJavaNetCookies(url, header));
                    }
                }
            }
            if (arrayList != null) {
                List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
                s.f(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            i13 = w.i();
            return i13;
        } catch (IOException e11) {
            Platform platform = Platform.Companion.get();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            HttpUrl resolve = url.resolve("/...");
            s.e(resolve);
            sb2.append(resolve);
            platform.log(sb2.toString(), 5, e11);
            i11 = w.i();
            return i11;
        }
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        Map<String, List<String>> f11;
        s.g(url, "url");
        s.g(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : cookies) {
            arrayList.add(Internal.cookieToString(cookie, true));
        }
        f11 = r0.f(vz.v.a("Set-Cookie", arrayList));
        try {
            this.cookieHandler.put(url.uri(), f11);
        } catch (IOException e11) {
            Platform platform = Platform.Companion.get();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            HttpUrl resolve = url.resolve("/...");
            s.e(resolve);
            sb2.append(resolve);
            platform.log(sb2.toString(), 5, e11);
        }
    }
}