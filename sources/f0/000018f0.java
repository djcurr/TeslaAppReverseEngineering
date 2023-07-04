package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.stripe.android.core.networking.NetworkConstantsKt;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.o;
import okio.r;
import org.spongycastle.i18n.TextBundle;

@fg.a(name = NetworkingModule.NAME)
/* loaded from: classes3.dex */
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static e customClientBuilder;
    private final OkHttpClient mClient;
    private final com.facebook.react.modules.network.c mCookieHandler;
    private final com.facebook.react.modules.network.a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<f> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<g> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<h> mUriHandlers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Interceptor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f12032b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12033c;

        /* renamed from: com.facebook.react.modules.network.NetworkingModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0232a implements com.facebook.react.modules.network.h {

            /* renamed from: a  reason: collision with root package name */
            long f12034a = System.nanoTime();

            C0232a() {
            }

            @Override // com.facebook.react.modules.network.h
            public void a(long j11, long j12, boolean z11) {
                long nanoTime = System.nanoTime();
                if ((z11 || NetworkingModule.shouldDispatch(nanoTime, this.f12034a)) && !a.this.f12031a.equals(TextBundle.TEXT_ENTRY)) {
                    a aVar = a.this;
                    n.c(aVar.f12032b, aVar.f12033c, j11, j12);
                    this.f12034a = nanoTime;
                }
            }
        }

        a(NetworkingModule networkingModule, String str, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11) {
            this.f12031a = str;
            this.f12032b = rCTDeviceEventEmitter;
            this.f12033c = i11;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            Response proceed = chain.proceed(chain.request());
            return proceed.newBuilder().body(new j(proceed.body(), new C0232a())).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f12037b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f12038c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f12039d;

        b(int i11, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z11) {
            this.f12036a = i11;
            this.f12037b = rCTDeviceEventEmitter;
            this.f12038c = str;
            this.f12039d = z11;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            String str;
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f12036a);
            if (iOException.getMessage() != null) {
                str = iOException.getMessage();
            } else {
                str = "Error while executing request: " + iOException.getClass().getSimpleName();
            }
            n.f(this.f12037b, this.f12036a, str, iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f12036a);
            n.h(this.f12037b, this.f12036a, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
            try {
                ResponseBody body = response.body();
                if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                    o oVar = new o(body.source());
                    String header = response.header(NetworkConstantsKt.HEADER_CONTENT_TYPE);
                    body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1L, r.d(oVar));
                }
                for (g gVar : NetworkingModule.this.mResponseHandlers) {
                    if (gVar.b(this.f12038c)) {
                        n.a(this.f12037b, this.f12036a, gVar.a(body));
                        n.g(this.f12037b, this.f12036a);
                        return;
                    }
                }
                if (this.f12039d && this.f12038c.equals(TextBundle.TEXT_ENTRY)) {
                    NetworkingModule.this.readWithProgress(this.f12037b, this.f12036a, body);
                    n.g(this.f12037b, this.f12036a);
                    return;
                }
                String str = "";
                if (this.f12038c.equals(TextBundle.TEXT_ENTRY)) {
                    try {
                        str = body.string();
                    } catch (IOException e11) {
                        if (!response.request().method().equalsIgnoreCase("HEAD")) {
                            n.f(this.f12037b, this.f12036a, e11.getMessage(), e11);
                        }
                    }
                } else if (this.f12038c.equals("base64")) {
                    str = Base64.encodeToString(body.bytes(), 2);
                }
                n.b(this.f12037b, this.f12036a, str);
                n.g(this.f12037b, this.f12036a);
            } catch (IOException e12) {
                n.f(this.f12037b, this.f12036a, e12.getMessage(), e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements com.facebook.react.modules.network.h {

        /* renamed from: a  reason: collision with root package name */
        long f12041a = System.nanoTime();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f12042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12043c;

        c(NetworkingModule networkingModule, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11) {
            this.f12042b = rCTDeviceEventEmitter;
            this.f12043c = i11;
        }

        @Override // com.facebook.react.modules.network.h
        public void a(long j11, long j12, boolean z11) {
            long nanoTime = System.nanoTime();
            if (z11 || NetworkingModule.shouldDispatch(nanoTime, this.f12041a)) {
                n.d(this.f12042b, this.f12043c, j11, j12);
                this.f12041a = nanoTime;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12044a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, int i11) {
            super(reactContext);
            this.f12044a = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            ag.a.a(NetworkingModule.this.mClient, Integer.valueOf(this.f12044a));
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(OkHttpClient.Builder builder);
    }

    /* loaded from: classes3.dex */
    public interface f {
        boolean a(ReadableMap readableMap);

        RequestBody b(ReadableMap readableMap, String str);
    }

    /* loaded from: classes3.dex */
    public interface g {
        WritableMap a(ResponseBody responseBody);

        boolean b(String str);
    }

    /* loaded from: classes3.dex */
    public interface h {
        WritableMap a(Uri uri);

        boolean b(Uri uri, String str);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<com.facebook.react.modules.network.e> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            for (com.facebook.react.modules.network.e eVar : list) {
                newBuilder.addNetworkInterceptor(eVar.create());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new com.facebook.react.modules.network.c(reactApplicationContext);
        this.mCookieJarContainer = (com.facebook.react.modules.network.a) okHttpClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i11) {
        this.mRequestIds.add(Integer.valueOf(i11));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        e eVar = customClientBuilder;
        if (eVar != null) {
            eVar.a(builder);
        }
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(int i11) {
        new d(getReactApplicationContext(), i11).execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i11) {
        MediaType mediaType;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("constructMultipartBody");
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            ReadableMap map = readableArray.getMap(i12);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                n.f(eventEmitter, i11, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str2 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                extractHeaders = extractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
            } else {
                mediaType = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                builder.addPart(extractHeaders, RequestBody.create(mediaType, map.getString(REQUEST_BODY_KEY_STRING)));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                n.f(eventEmitter, i11, "Unrecognized FormData part.", null);
            } else if (mediaType == null) {
                n.f(eventEmitter, i11, "Binary FormData part needs a content-type header.", null);
                return null;
            } else {
                String string = map.getString(REQUEST_BODY_KEY_URI);
                InputStream f11 = m.f(getReactApplicationContext(), string);
                if (f11 == null) {
                    n.f(eventEmitter, i11, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.addPart(extractHeaders, m.a(mediaType, f11));
            }
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ReadableArray array = readableArray.getArray(i11);
            if (array != null && array.size() == 2) {
                String a11 = com.facebook.react.modules.network.d.a(array.getString(0));
                String b11 = com.facebook.react.modules.network.d.b(array.getString(1));
                if (a11 != null && b11 != null) {
                    builder.add(a11, b11);
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            z11 = true;
        }
        if (!z11) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String str) {
        if (getReactApplicationContextIfActiveOrWarn() != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11, ResponseBody responseBody) {
        long j11;
        Charset charset;
        long j12 = -1;
        try {
            j jVar = (j) responseBody;
            j11 = jVar.m();
            try {
                j12 = jVar.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j11 = -1;
        }
        if (responseBody.contentType() == null) {
            charset = yf.f.f59495a;
        } else {
            charset = responseBody.contentType().charset(yf.f.f59495a);
        }
        k kVar = new k(charset);
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = byteStream.read(bArr);
                if (read == -1) {
                    return;
                }
                n.e(rCTDeviceEventEmitter, i11, kVar.a(bArr, read), j11, j12);
            }
        } finally {
            byteStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i11) {
        this.mRequestIds.remove(Integer.valueOf(i11));
    }

    public static void setCustomClientBuilder(e eVar) {
        customClientBuilder = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j11, long j12) {
        return j12 + 100000000 < j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < headers.size(); i11++) {
            String name = headers.name(i11);
            if (bundle.containsKey(name)) {
                bundle.putString(name, bundle.getString(name) + ", " + headers.value(i11));
            } else {
                bundle.putString(name, headers.value(i11));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11) {
        if (requestBody == null) {
            return null;
        }
        return m.c(requestBody, new c(this, rCTDeviceEventEmitter, i11));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d11) {
        int i11 = (int) d11;
        cancelRequest(i11);
        removeRequest(i11);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.add(fVar);
    }

    public void addResponseHandler(g gVar) {
        this.mResponseHandlers.add(gVar);
    }

    public void addUriHandler(h hVar) {
        this.mUriHandlers.add(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) {
        this.mCookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mCookieJarContainer.b(new JavaNetCookieJar(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.destroy();
        this.mCookieJarContainer.a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d11) {
    }

    public void removeRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.remove(fVar);
    }

    public void removeResponseHandler(g gVar) {
        this.mResponseHandlers.remove(gVar);
    }

    public void removeUriHandler(h hVar) {
        this.mUriHandlers.remove(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d11, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z11, double d12, boolean z12) {
        int i11 = (int) d11;
        try {
            sendRequestInternal(str, str2, i11, readableArray, readableMap, str3, z11, (int) d12, z12);
        } catch (Throwable th2) {
            nd.a.k(TAG, "Failed to send url request: " + str2, th2);
            DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequest error");
            if (eventEmitter != null) {
                n.f(eventEmitter, i11, th2.getMessage(), th2);
            }
        }
    }

    public void sendRequestInternal(String str, String str2, int i11, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z11, int i12, boolean z12) {
        f fVar;
        RequestBody e11;
        Charset charset;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequestInternal");
        try {
            Uri parse = Uri.parse(str2);
            for (h hVar : this.mUriHandlers) {
                if (hVar.b(parse, str3)) {
                    n.a(eventEmitter, i11, hVar.a(parse));
                    n.g(eventEmitter, i11);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i11 != 0) {
                    url.tag(Integer.valueOf(i11));
                }
                OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
                applyCustomBuilder(newBuilder);
                if (!z12) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z11) {
                    newBuilder.addNetworkInterceptor(new a(this, str3, eventEmitter, i11));
                }
                if (i12 != this.mClient.connectTimeoutMillis()) {
                    newBuilder.connectTimeout(i12, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    n.f(eventEmitter, i11, "Unrecognized headers format", null);
                    return;
                }
                String str4 = extractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str5 = extractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator<f> it2 = this.mRequestBodyHandlers.iterator();
                    while (it2.hasNext()) {
                        fVar = it2.next();
                        if (fVar.a(readableMap)) {
                            break;
                        }
                    }
                }
                fVar = null;
                if (readableMap == null || str.toLowerCase().equals("get") || str.toLowerCase().equals("head")) {
                    e11 = m.e(str);
                } else if (fVar != null) {
                    e11 = fVar.b(readableMap, str4);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                    if (str4 == null) {
                        n.f(eventEmitter, i11, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                    MediaType parse2 = MediaType.parse(str4);
                    if (m.g(str5)) {
                        e11 = m.b(parse2, string);
                        if (e11 == null) {
                            n.f(eventEmitter, i11, "Failed to gzip request body", null);
                            return;
                        }
                    } else {
                        if (parse2 == null) {
                            charset = yf.f.f59495a;
                        } else {
                            charset = parse2.charset(yf.f.f59495a);
                        }
                        e11 = RequestBody.create(parse2, string.getBytes(charset));
                    }
                } else if (readableMap.hasKey("base64")) {
                    if (str4 == null) {
                        n.f(eventEmitter, i11, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    e11 = RequestBody.create(MediaType.parse(str4), okio.i.c(readableMap.getString("base64")));
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                    if (str4 == null) {
                        n.f(eventEmitter, i11, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                    InputStream f11 = m.f(getReactApplicationContext(), string2);
                    if (f11 == null) {
                        n.f(eventEmitter, i11, "Could not retrieve file for uri " + string2, null);
                        return;
                    }
                    e11 = m.a(MediaType.parse(str4), f11);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                    if (str4 == null) {
                        str4 = "multipart/form-data";
                    }
                    MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), str4, i11);
                    if (constructMultipartBody == null) {
                        return;
                    }
                    e11 = constructMultipartBody.build();
                } else {
                    e11 = m.e(str);
                }
                url.method(str, wrapRequestBodyWithProgressEmitter(e11, eventEmitter, i11));
                addRequest(i11);
                FirebasePerfOkHttpClient.enqueue(build.newCall(url.build()), new b(i11, eventEmitter, str3, z11));
            } catch (Exception e12) {
                n.f(eventEmitter, i11, e12.getMessage(), null);
            }
        } catch (IOException e13) {
            n.f(eventEmitter, i11, e13.getMessage(), e13);
        }
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, com.facebook.react.modules.network.g.b(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<com.facebook.react.modules.network.e> list) {
        this(reactApplicationContext, null, com.facebook.react.modules.network.g.b(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, com.facebook.react.modules.network.g.b(reactApplicationContext), null);
    }
}