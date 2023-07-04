package com.auth0.android.jwt;

import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class d implements j<e> {
    private Date b(m mVar, String str) {
        if (mVar.q(str)) {
            return new Date(mVar.p(str).e() * 1000);
        }
        return null;
    }

    private String c(m mVar, String str) {
        if (mVar.q(str)) {
            return mVar.p(str).f();
        }
        return null;
    }

    private List<String> d(m mVar, String str) {
        List<String> emptyList = Collections.emptyList();
        if (mVar.q(str)) {
            k p11 = mVar.p(str);
            if (p11.h()) {
                h b11 = p11.b();
                ArrayList arrayList = new ArrayList(b11.size());
                for (int i11 = 0; i11 < b11.size(); i11++) {
                    arrayList.add(b11.n(i11).f());
                }
                return arrayList;
            }
            return Collections.singletonList(p11.f());
        }
        return emptyList;
    }

    @Override // com.google.gson.j
    /* renamed from: a */
    public e deserialize(k kVar, Type type, i iVar) {
        if (!kVar.i() && kVar.j()) {
            m c11 = kVar.c();
            String c12 = c(c11, "iss");
            String c13 = c(c11, "sub");
            Date b11 = b(c11, "exp");
            Date b12 = b(c11, "nbf");
            Date b13 = b(c11, "iat");
            String c14 = c(c11, "jti");
            List<String> d11 = d(c11, "aud");
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, k> entry : c11.o()) {
                hashMap.put(entry.getKey(), new b(entry.getValue()));
            }
            return new e(c12, c13, b11, b12, b13, c14, d11, hashMap);
        }
        throw new DecodeException("The token's payload had an invalid JSON format.");
    }
}