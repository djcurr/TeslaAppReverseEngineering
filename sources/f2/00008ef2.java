package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "", "method", "", "requiresRequestBody", "permitsRequestBody", "invalidatesCache", "redirectsWithBody", "redirectsToGet", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        s.g(method, "method");
        return (s.c(method, "GET") || s.c(method, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        s.g(method, "method");
        return s.c(method, "POST") || s.c(method, "PUT") || s.c(method, "PATCH") || s.c(method, "PROPPATCH") || s.c(method, "REPORT");
    }

    public final boolean invalidatesCache(String method) {
        s.g(method, "method");
        return s.c(method, "POST") || s.c(method, "PATCH") || s.c(method, "PUT") || s.c(method, "DELETE") || s.c(method, "MOVE");
    }

    public final boolean redirectsToGet(String method) {
        s.g(method, "method");
        return !s.c(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        s.g(method, "method");
        return s.c(method, "PROPFIND");
    }
}