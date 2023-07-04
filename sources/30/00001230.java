package coil.network;

import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okhttp3.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lokhttp3/Response;", "response", "<init>", "(Lokhttp3/Response;)V", "coil-base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class HttpException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(Response response) {
        super("HTTP " + response.code() + ": " + response.message());
        s.g(response, "response");
    }
}