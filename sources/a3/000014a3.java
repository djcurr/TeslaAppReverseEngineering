package com.android.volley.toolbox;

import com.android.volley.k;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public abstract class m<T> extends com.android.volley.i<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", PROTOCOL_CHARSET);
    private k.b<T> mListener;
    private final Object mLock;
    private final String mRequestBody;

    @Deprecated
    public m(String str, String str2, k.b<T> bVar, k.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    @Override // com.android.volley.i
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.i
    public void deliverResponse(T t11) {
        k.b<T> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(t11);
        }
    }

    @Override // com.android.volley.i
    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            com.android.volley.n.f("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, PROTOCOL_CHARSET);
            return null;
        }
    }

    @Override // com.android.volley.i
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // com.android.volley.i
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.i
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.i
    public abstract com.android.volley.k<T> parseNetworkResponse(com.android.volley.h hVar);

    public m(int i11, String str, String str2, k.b<T> bVar, k.a aVar) {
        super(i11, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
        this.mRequestBody = str2;
    }
}