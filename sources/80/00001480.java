package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.android.volley.a;
import com.android.volley.k;
import com.android.volley.n;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class i<T> implements Comparable<i<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private a.C0196a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private k.a mErrorListener;
    private final n.a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private b mRequestCompleteListener;
    private j mRequestQueue;
    private boolean mResponseDelivered;
    private m mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f10289b;

        a(String str, long j11) {
            this.f10288a = str;
            this.f10289b = j11;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.mEventLog.a(this.f10288a, this.f10289b);
            i.this.mEventLog.b(i.this.toString());
        }
    }

    /* loaded from: classes.dex */
    interface b {
        void a(i<?> iVar, k<?> kVar);

        void b(i<?> iVar);
    }

    /* loaded from: classes.dex */
    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public i(String str, k.a aVar) {
        this(-1, str, aVar);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append('=');
                    sb2.append(URLEncoder.encode(entry.getValue(), str));
                    sb2.append('&');
                } else {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("Encoding not supported: " + str, e11);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (n.a.f10309c) {
            this.mEventLog.a(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((i) ((i) obj));
    }

    public void deliverError(VolleyError volleyError) {
        k.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.onErrorResponse(volleyError);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void deliverResponse(T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finish(String str) {
        j jVar = this.mRequestQueue;
        if (jVar != null) {
            jVar.c(this);
        }
        if (n.a.f10309c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
                return;
            }
            this.mEventLog.a(str, id2);
            this.mEventLog.b(toString());
        }
    }

    public byte[] getBody() {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public a.C0196a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + CoreConstants.DASH_CHAR + url;
    }

    public k.a getErrorListener() {
        k.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public Map<String, String> getHeaders() {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    protected Map<String, String> getParams() {
        return null;
    }

    protected String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    protected Map<String, String> getPostParams() {
        return getParams();
    }

    @Deprecated
    protected String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public c getPriority() {
        return c.NORMAL;
    }

    public m getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().c();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mResponseDelivered;
        }
        return z11;
    }

    public boolean isCanceled() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mCanceled;
        }
        return z11;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyListenerResponseNotUsable() {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyListenerResponseReceived(k<?> kVar) {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.a(this, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract k<T> parseNetworkResponse(h hVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendEvent(int i11) {
        j jVar = this.mRequestQueue;
        if (jVar != null) {
            jVar.e(this, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i<?> setCacheEntry(a.C0196a c0196a) {
        this.mCacheEntry = c0196a;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNetworkRequestCompleteListener(b bVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i<?> setRequestQueue(j jVar) {
        this.mRequestQueue = jVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i<?> setRetryPolicy(m mVar) {
        this.mRetryPolicy = mVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> setSequence(int i11) {
        this.mSequence = Integer.valueOf(i11);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> setShouldCache(boolean z11) {
        this.mShouldCache = z11;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> setShouldRetryConnectionErrors(boolean z11) {
        this.mShouldRetryConnectionErrors = z11;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> setShouldRetryServerErrors(boolean z11) {
        this.mShouldRetryServerErrors = z11;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "[X] " : "[ ] ");
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }

    public i(int i11, String str, k.a aVar) {
        this.mEventLog = n.a.f10309c ? new n.a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i11;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new com.android.volley.c());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    public int compareTo(i<T> iVar) {
        c priority = getPriority();
        c priority2 = iVar.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - iVar.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }
}