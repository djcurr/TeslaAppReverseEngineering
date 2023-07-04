package n9;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import k9.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends l9.e {
    @Override // l9.e
    public String c(r9.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // l9.e
    public Map<String, String> e(boolean z11, String str) {
        return new HashMap();
    }

    @Override // l9.e
    public l9.b g(r9.a aVar, Context context, String str) {
        t9.e.h("mspl", "mdap post");
        byte[] a11 = i9.b.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap hashMap = new HashMap();
        hashMap.put("utdId", r9.b.e().d());
        hashMap.put("logHeader", "RAW");
        hashMap.put("bizCode", "alipaysdk");
        hashMap.put("productId", "alipaysdk_android");
        hashMap.put("Content-Encoding", "Gzip");
        hashMap.put("productVersion", "15.8.14");
        a.b b11 = k9.a.b(context, new a.C0642a("https://loggw-exsdk.alipay.com/loggw/logUpload.do", hashMap, a11));
        t9.e.h("mspl", "mdap got " + b11);
        if (b11 != null) {
            boolean m11 = l9.e.m(b11);
            try {
                byte[] bArr = b11.f34504b;
                if (m11) {
                    bArr = i9.b.b(bArr);
                }
                return new l9.b("", new String(bArr, Charset.forName("UTF-8")));
            } catch (Exception e11) {
                t9.e.d(e11);
                return null;
            }
        }
        throw new RuntimeException("Response is null");
    }

    @Override // l9.e
    public JSONObject j() {
        return null;
    }

    @Override // l9.e
    public boolean o() {
        return false;
    }
}