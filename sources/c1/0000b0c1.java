package retrofit2;

import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class s<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Response f49532a;

    /* renamed from: b  reason: collision with root package name */
    private final T f49533b;

    /* renamed from: c  reason: collision with root package name */
    private final ResponseBody f49534c;

    private s(Response response, T t11, ResponseBody responseBody) {
        this.f49532a = response;
        this.f49533b = t11;
        this.f49534c = responseBody;
    }

    public static <T> s<T> c(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new s<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> s<T> h(T t11) {
        return i(t11, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> s<T> i(T t11, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new s<>(response, t11, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.f49533b;
    }

    public int b() {
        return this.f49532a.code();
    }

    public ResponseBody d() {
        return this.f49534c;
    }

    public Headers e() {
        return this.f49532a.headers();
    }

    public boolean f() {
        return this.f49532a.isSuccessful();
    }

    public String g() {
        return this.f49532a.message();
    }

    public String toString() {
        return this.f49532a.toString();
    }
}