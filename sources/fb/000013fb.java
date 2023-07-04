package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.a.c
    public final Object a() {
        try {
            String str = new String(this.f10060b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt("resultStatus");
            if (i11 == 1000) {
                return this.f10059a == String.class ? jSONObject.optString("result") : s8.e.b(jSONObject.optString("result"), this.f10059a);
            }
            throw new RpcException(Integer.valueOf(i11), jSONObject.optString("tips"));
        } catch (Exception e11) {
            StringBuilder sb2 = new StringBuilder("response  =");
            sb2.append(new String(this.f10060b));
            sb2.append(":");
            sb2.append(e11);
            throw new RpcException((Integer) 10, sb2.toString() == null ? "" : e11.getMessage());
        }
    }
}