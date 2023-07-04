package com.android.volley.toolbox;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* loaded from: classes.dex */
public abstract class b implements i {
    @Override // com.android.volley.toolbox.i
    @Deprecated
    public final HttpResponse a(com.android.volley.i<?> iVar, Map<String, String> map) {
        h b11 = b(iVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b11.d(), ""));
        ArrayList arrayList = new ArrayList();
        for (com.android.volley.e eVar : b11.c()) {
            arrayList.add(new BasicHeader(eVar.a(), eVar.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[0]));
        InputStream a11 = b11.a();
        if (a11 != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a11);
            basicHttpEntity.setContentLength(b11.b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    public abstract h b(com.android.volley.i<?> iVar, Map<String, String> map);
}