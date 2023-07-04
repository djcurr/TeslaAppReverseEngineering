package com.android.volley.toolbox;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes.dex */
class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final i f10320a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(i iVar) {
        this.f10320a = iVar;
    }

    @Override // com.android.volley.toolbox.b
    public h b(com.android.volley.i<?> iVar, Map<String, String> map) {
        try {
            HttpResponse a11 = this.f10320a.a(iVar, map);
            int statusCode = a11.getStatusLine().getStatusCode();
            Header[] allHeaders = a11.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new com.android.volley.e(header.getName(), header.getValue()));
            }
            if (a11.getEntity() == null) {
                return new h(statusCode, arrayList);
            }
            long contentLength = a11.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new h(statusCode, arrayList, (int) a11.getEntity().getContentLength(), a11.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e11) {
            throw new SocketTimeoutException(e11.getMessage());
        }
    }
}