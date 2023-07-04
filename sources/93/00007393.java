package hn;

import android.content.Context;
import com.google.firebase.perf.util.i;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.net.URI;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final fn.a f29346c = fn.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final NetworkRequestMetric f29347a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f29348b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f29348b = context;
        this.f29347a = networkRequestMetric;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e11) {
            f29346c.k("getResultUrl throws exception %s", e11.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return i.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    private boolean m(int i11) {
        return i11 > 0;
    }

    private boolean n(long j11) {
        return j11 >= 0;
    }

    private boolean o(int i11) {
        return i11 == -1 || i11 > 0;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    private boolean q(long j11) {
        return j11 >= 0;
    }

    private boolean r(String str) {
        return str == null;
    }

    @Override // hn.e
    public boolean c() {
        if (j(this.f29347a.getUrl())) {
            fn.a aVar = f29346c;
            aVar.j("URL is missing:" + this.f29347a.getUrl());
            return false;
        }
        URI g11 = g(this.f29347a.getUrl());
        if (g11 == null) {
            f29346c.j("URL cannot be parsed");
            return false;
        } else if (!h(g11, this.f29348b)) {
            fn.a aVar2 = f29346c;
            aVar2.j("URL fails allowlist rule: " + g11);
            return false;
        } else if (!k(g11.getHost())) {
            f29346c.j("URL host is null or invalid");
            return false;
        } else if (!p(g11.getScheme())) {
            f29346c.j("URL scheme is null or invalid");
            return false;
        } else if (!r(g11.getUserInfo())) {
            f29346c.j("URL user info is null");
            return false;
        } else if (!o(g11.getPort())) {
            f29346c.j("URL port is less than or equal to 0");
            return false;
        } else {
            if (!l(this.f29347a.hasHttpMethod() ? this.f29347a.getHttpMethod() : null)) {
                fn.a aVar3 = f29346c;
                aVar3.j("HTTP Method is null or invalid: " + this.f29347a.getHttpMethod());
                return false;
            } else if (this.f29347a.hasHttpResponseCode() && !m(this.f29347a.getHttpResponseCode())) {
                fn.a aVar4 = f29346c;
                aVar4.j("HTTP ResponseCode is a negative value:" + this.f29347a.getHttpResponseCode());
                return false;
            } else if (this.f29347a.hasRequestPayloadBytes() && !n(this.f29347a.getRequestPayloadBytes())) {
                fn.a aVar5 = f29346c;
                aVar5.j("Request Payload is a negative value:" + this.f29347a.getRequestPayloadBytes());
                return false;
            } else if (this.f29347a.hasResponsePayloadBytes() && !n(this.f29347a.getResponsePayloadBytes())) {
                fn.a aVar6 = f29346c;
                aVar6.j("Response Payload is a negative value:" + this.f29347a.getResponsePayloadBytes());
                return false;
            } else if (this.f29347a.hasClientStartTimeUs() && this.f29347a.getClientStartTimeUs() > 0) {
                if (this.f29347a.hasTimeToRequestCompletedUs() && !q(this.f29347a.getTimeToRequestCompletedUs())) {
                    fn.a aVar7 = f29346c;
                    aVar7.j("Time to complete the request is a negative value:" + this.f29347a.getTimeToRequestCompletedUs());
                    return false;
                } else if (this.f29347a.hasTimeToResponseInitiatedUs() && !q(this.f29347a.getTimeToResponseInitiatedUs())) {
                    fn.a aVar8 = f29346c;
                    aVar8.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f29347a.getTimeToResponseInitiatedUs());
                    return false;
                } else if (this.f29347a.hasTimeToResponseCompletedUs() && this.f29347a.getTimeToResponseCompletedUs() > 0) {
                    if (this.f29347a.hasHttpResponseCode()) {
                        return true;
                    }
                    f29346c.j("Did not receive a HTTP Response Code");
                    return false;
                } else {
                    fn.a aVar9 = f29346c;
                    aVar9.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f29347a.getTimeToResponseCompletedUs());
                    return false;
                }
            } else {
                fn.a aVar10 = f29346c;
                aVar10.j("Start time of the request is null, or zero, or a negative value:" + this.f29347a.getClientStartTimeUs());
                return false;
            }
        }
    }

    boolean l(NetworkRequestMetric.d dVar) {
        return (dVar == null || dVar == NetworkRequestMetric.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}