package com.android.volley.toolbox;

import com.android.volley.ParseError;
import com.android.volley.k;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l extends m<JSONObject> {
    public l(String str, k.b<JSONObject> bVar, k.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.m, com.android.volley.i
    public com.android.volley.k<JSONObject> parseNetworkResponse(com.android.volley.h hVar) {
        try {
            return com.android.volley.k.c(new JSONObject(new String(hVar.f10284b, g.f(hVar.f10285c, "utf-8"))), g.e(hVar));
        } catch (UnsupportedEncodingException e11) {
            return com.android.volley.k.a(new ParseError(e11));
        } catch (JSONException e12) {
            return com.android.volley.k.a(new ParseError(e12));
        }
    }

    @Deprecated
    public l(String str, JSONObject jSONObject, k.b<JSONObject> bVar, k.a aVar) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }

    public l(int i11, String str, JSONObject jSONObject, k.b<JSONObject> bVar, k.a aVar) {
        super(i11, str, jSONObject != null ? jSONObject.toString() : null, bVar, aVar);
    }
}