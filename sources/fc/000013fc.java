package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    public int f10063c;

    /* renamed from: d  reason: collision with root package name */
    public Object f10064d;

    public e(int i11, String str, Object obj) {
        super(str, obj);
        this.f10063c = i11;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final void a(Object obj) {
        this.f10064d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f10064d != null) {
                arrayList.add(new BasicNameValuePair("extParam", s8.f.a(this.f10064d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f10061a));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f10063c);
            arrayList.add(new BasicNameValuePair("id", sb2.toString()));
            Objects.toString(this.f10062b);
            Object obj = this.f10062b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : s8.f.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder("request  =");
            sb3.append(this.f10062b);
            sb3.append(":");
            sb3.append(e11);
            throw new RpcException(9, sb3.toString() == null ? "" : e11.getMessage(), e11);
        }
    }
}