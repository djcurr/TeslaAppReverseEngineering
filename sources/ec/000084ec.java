package lx;

import okhttp3.RequestBody;

/* loaded from: classes5.dex */
public class b {
    public static RequestBody a(RequestBody requestBody, c cVar) {
        if (requestBody != null) {
            if (cVar != null) {
                return new e(requestBody, cVar);
            }
            throw new IllegalArgumentException("progressListener == null");
        }
        throw new IllegalArgumentException("requestBody == null");
    }
}