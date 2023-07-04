package com.RNFetchBlob;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.os.Build;
import android.util.Base64;
import ch.qos.logback.core.net.ssl.SSL;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.stripe.android.core.networking.NetworkConstantsKt;
import expo.modules.imagepicker.ImagePickerConstants;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TlsVersion;
import org.spongycastle.i18n.MessageBundle;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes.dex */
public class g extends BroadcastReceiver implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    com.RNFetchBlob.b f9402a;

    /* renamed from: b  reason: collision with root package name */
    String f9403b;

    /* renamed from: c  reason: collision with root package name */
    String f9404c;

    /* renamed from: d  reason: collision with root package name */
    String f9405d;

    /* renamed from: e  reason: collision with root package name */
    String f9406e;

    /* renamed from: f  reason: collision with root package name */
    String f9407f;

    /* renamed from: g  reason: collision with root package name */
    ReadableArray f9408g;

    /* renamed from: h  reason: collision with root package name */
    ReadableMap f9409h;

    /* renamed from: i  reason: collision with root package name */
    Callback f9410i;

    /* renamed from: j  reason: collision with root package name */
    long f9411j;

    /* renamed from: k  reason: collision with root package name */
    long f9412k;

    /* renamed from: l  reason: collision with root package name */
    com.RNFetchBlob.a f9413l;

    /* renamed from: m  reason: collision with root package name */
    e f9414m;

    /* renamed from: n  reason: collision with root package name */
    EnumC0183g f9415n;

    /* renamed from: p  reason: collision with root package name */
    WritableMap f9417p;

    /* renamed from: w  reason: collision with root package name */
    OkHttpClient f9420w;

    /* renamed from: x  reason: collision with root package name */
    public static HashMap<String, Call> f9399x = new HashMap<>();

    /* renamed from: y  reason: collision with root package name */
    public static HashMap<String, Long> f9400y = new HashMap<>();

    /* renamed from: z  reason: collision with root package name */
    static HashMap<String, com.RNFetchBlob.f> f9401z = new HashMap<>();
    static HashMap<String, com.RNFetchBlob.f> A = new HashMap<>();
    static ConnectionPool B = new ConnectionPool();

    /* renamed from: o  reason: collision with root package name */
    f f9416o = f.Auto;

    /* renamed from: q  reason: collision with root package name */
    boolean f9418q = false;

    /* renamed from: t  reason: collision with root package name */
    ArrayList<String> f9419t = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Interceptor {
        a() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            g.this.f9419t.add(chain.request().url().toString());
            return chain.proceed(chain.request());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Interceptor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Request f9422a;

        b(Request request) {
            this.f9422a = request;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            ResponseBody aVar;
            try {
                Response proceed = chain.proceed(this.f9422a);
                int i11 = d.f9426b[g.this.f9415n.ordinal()];
                if (i11 == 1) {
                    aVar = new h6.a(RNFetchBlob.RCTContext, g.this.f9403b, proceed.body(), g.this.f9402a.f9382k.booleanValue());
                } else if (i11 != 2) {
                    aVar = new h6.a(RNFetchBlob.RCTContext, g.this.f9403b, proceed.body(), g.this.f9402a.f9382k.booleanValue());
                } else {
                    ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
                    String str = g.this.f9403b;
                    ResponseBody body = proceed.body();
                    g gVar = g.this;
                    aVar = new h6.b(reactApplicationContext, str, body, gVar.f9407f, gVar.f9402a.f9380i.booleanValue());
                }
                return proceed.newBuilder().body(aVar).build();
            } catch (SocketException unused) {
                g.this.f9418q = true;
                return chain.proceed(chain.request());
            } catch (SocketTimeoutException unused2) {
                g.this.f9418q = true;
                return chain.proceed(chain.request());
            } catch (Exception unused3) {
                return chain.proceed(chain.request());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements okhttp3.Callback {
        c() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            g.c(g.this.f9403b);
            g gVar = g.this;
            if (gVar.f9417p == null) {
                gVar.f9417p = Arguments.createMap();
            }
            if (iOException.getClass().equals(SocketTimeoutException.class)) {
                g.this.f9417p.putBoolean("timeout", true);
                g.this.f9410i.invoke("The request timed out.", null, null);
            } else {
                g.this.f9410i.invoke(iOException.getLocalizedMessage(), null, null);
            }
            g.this.m();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            ReadableMap readableMap = g.this.f9402a.f9375d;
            if (readableMap != null) {
                String string = readableMap.hasKey(MessageBundle.TITLE_ENTRY) ? g.this.f9402a.f9375d.getString(MessageBundle.TITLE_ENTRY) : "";
                String string2 = readableMap.hasKey("description") ? readableMap.getString("description") : "";
                String string3 = readableMap.hasKey("mime") ? readableMap.getString("mime") : "text/plain";
                boolean z11 = readableMap.hasKey("mediaScannable") ? readableMap.getBoolean("mediaScannable") : false;
                boolean z12 = readableMap.hasKey("notification") ? readableMap.getBoolean("notification") : false;
                DownloadManager downloadManager = (DownloadManager) RNFetchBlob.RCTContext.getSystemService("download");
                g gVar = g.this;
                downloadManager.addCompletedDownload(string, string2, z11, string3, gVar.f9407f, gVar.f9411j, z12);
            }
            g.this.d(response);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9425a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f9426b;

        static {
            int[] iArr = new int[EnumC0183g.values().length];
            f9426b = iArr;
            try {
                iArr[EnumC0183g.KeepInMemory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9426b[EnumC0183g.FileStorage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            f9425a = iArr2;
            try {
                iArr2[e.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9425a[e.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9425a[e.Form.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9425a[e.WithoutBody.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum e {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum f {
        Auto,
        UTF8,
        BASE64
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.RNFetchBlob.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0183g {
        KeepInMemory,
        FileStorage
    }

    public g(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, OkHttpClient okHttpClient, Callback callback) {
        this.f9404c = str2.toUpperCase();
        com.RNFetchBlob.b bVar = new com.RNFetchBlob.b(readableMap);
        this.f9402a = bVar;
        this.f9403b = str;
        this.f9405d = str3;
        this.f9409h = readableMap2;
        this.f9410i = callback;
        this.f9406e = str4;
        this.f9408g = readableArray;
        this.f9420w = okHttpClient;
        if (!bVar.f9372a.booleanValue() && this.f9402a.f9373b == null) {
            this.f9415n = EnumC0183g.KeepInMemory;
        } else {
            this.f9415n = EnumC0183g.FileStorage;
        }
        if (str4 != null) {
            this.f9414m = e.SingleFile;
        } else if (readableArray != null) {
            this.f9414m = e.Form;
        } else {
            this.f9414m = e.WithoutBody;
        }
    }

    public static void c(String str) {
        if (f9399x.containsKey(str)) {
            f9399x.get(str).cancel();
            f9399x.remove(str);
        }
        if (f9400y.containsKey(str)) {
            ((DownloadManager) RNFetchBlob.RCTContext.getApplicationContext().getSystemService("download")).remove(f9400y.get(str).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Response response) {
        boolean l11 = l(response);
        e(k(response, l11));
        int i11 = d.f9426b[this.f9415n.ordinal()];
        if (i11 == 1) {
            ResponseBody body = response.body();
            if (l11) {
                try {
                    if (this.f9402a.f9379h.booleanValue()) {
                        String n11 = com.RNFetchBlob.d.n(this.f9403b);
                        InputStream byteStream = response.body().byteStream();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(n11));
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int read = byteStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        byteStream.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        this.f9410i.invoke(null, "path", n11);
                    }
                } catch (IOException unused) {
                    if (body.contentLength() != -1 && body.contentLength() != 0) {
                        this.f9410i.invoke("RNFetchBlob failed to encode response data to BASE64 string.", null);
                    } else {
                        this.f9410i.invoke(null, "utf8", "");
                    }
                }
            }
            byte[] bytes = response.body().bytes();
            CharsetEncoder newEncoder = Charset.forName("UTF-8").newEncoder();
            if (this.f9416o == f.BASE64) {
                this.f9410i.invoke(null, ImagePickerConstants.OPTION_BASE64, Base64.encodeToString(bytes, 2));
                return;
            }
            try {
                newEncoder.encode(ByteBuffer.wrap(bytes).asCharBuffer());
                this.f9410i.invoke(null, "utf8", new String(bytes));
            } catch (CharacterCodingException unused2) {
                if (this.f9416o == f.UTF8) {
                    this.f9410i.invoke(null, "utf8", new String(bytes));
                } else {
                    this.f9410i.invoke(null, ImagePickerConstants.OPTION_BASE64, Base64.encodeToString(bytes, 2));
                }
            }
        } else if (i11 != 2) {
            try {
                this.f9410i.invoke(null, "utf8", new String(response.body().bytes(), "UTF-8"));
            } catch (IOException unused3) {
                this.f9410i.invoke("RNFetchBlob failed to encode response data to UTF8 string.", null);
            }
        } else {
            ResponseBody body2 = response.body();
            try {
                body2.bytes();
            } catch (Exception unused4) {
            }
            h6.b bVar = (h6.b) body2;
            if (bVar != null && !bVar.a()) {
                this.f9410i.invoke("Download interrupted.", null);
            } else {
                String replace = this.f9407f.replace("?append=true", "");
                this.f9407f = replace;
                this.f9410i.invoke(null, "path", replace);
            }
        }
        response.body().close();
        m();
    }

    private void e(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobState", writableMap);
    }

    public static OkHttpClient.Builder f(OkHttpClient.Builder builder) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 16 && i11 <= 19) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                    SSLContext sSLContext = SSLContext.getInstance(SSL.DEFAULT_PROTOCOL);
                    sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
                    builder.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager);
                    ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(build);
                    arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                    arrayList.add(ConnectionSpec.CLEARTEXT);
                    builder.connectionSpecs(arrayList);
                } else {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
            } catch (Exception e11) {
                nd.a.k("OkHttpClientProvider", "Error while enabling TLS 1.2", e11);
            }
        }
        return builder;
    }

    private String g(HashMap<String, String> hashMap, String str) {
        String str2 = hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = hashMap.get(str.toLowerCase());
        return str3 == null ? "" : str3;
    }

    private String h(Headers headers, String str) {
        String str2 = headers.get(str);
        return str2 != null ? str2 : headers.get(str.toLowerCase()) == null ? "" : headers.get(str.toLowerCase());
    }

    public static com.RNFetchBlob.f i(String str) {
        if (f9401z.containsKey(str)) {
            return f9401z.get(str);
        }
        return null;
    }

    public static com.RNFetchBlob.f j(String str) {
        if (A.containsKey(str)) {
            return A.get(str);
        }
        return null;
    }

    private WritableMap k(Response response, boolean z11) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(PermissionsResponse.STATUS_KEY, response.code());
        createMap.putString("state", "2");
        createMap.putString("taskId", this.f9403b);
        createMap.putBoolean("timeout", this.f9418q);
        WritableMap createMap2 = Arguments.createMap();
        for (int i11 = 0; i11 < response.headers().size(); i11++) {
            createMap2.putString(response.headers().name(i11), response.headers().value(i11));
        }
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it2 = this.f9419t.iterator();
        while (it2.hasNext()) {
            createArray.pushString(it2.next());
        }
        createMap.putArray("redirects", createArray);
        createMap.putMap("headers", createMap2);
        Headers headers = response.headers();
        if (z11) {
            createMap.putString("respType", "blob");
        } else if (h(headers, "content-type").equalsIgnoreCase("text/")) {
            createMap.putString("respType", TextBundle.TEXT_ENTRY);
        } else if (h(headers, "content-type").contains("application/json")) {
            createMap.putString("respType", "json");
        } else {
            createMap.putString("respType", "");
        }
        return createMap;
    }

    private boolean l(Response response) {
        boolean z11;
        String h11 = h(response.headers(), NetworkConstantsKt.HEADER_CONTENT_TYPE);
        boolean z12 = !h11.equalsIgnoreCase("text/");
        boolean z13 = !h11.equalsIgnoreCase("application/json");
        if (this.f9402a.f9384m != null) {
            for (int i11 = 0; i11 < this.f9402a.f9384m.size(); i11++) {
                if (h11.toLowerCase().contains(this.f9402a.f9384m.getString(i11).toLowerCase())) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        return !(z13 || z12) || z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (f9399x.containsKey(this.f9403b)) {
            f9399x.remove(this.f9403b);
        }
        if (f9400y.containsKey(this.f9403b)) {
            f9400y.remove(this.f9403b);
        }
        if (A.containsKey(this.f9403b)) {
            A.remove(this.f9403b);
        }
        if (f9401z.containsKey(this.f9403b)) {
            f9401z.remove(this.f9403b);
        }
        com.RNFetchBlob.a aVar = this.f9413l;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.g.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0408 A[Catch: Exception -> 0x049a, TryCatch #1 {Exception -> 0x049a, blocks: (B:55:0x01a4, B:57:0x01ae, B:59:0x01bb, B:61:0x01c6, B:63:0x01cc, B:65:0x01de, B:69:0x01ed, B:72:0x01f4, B:74:0x01fa, B:78:0x020f, B:75:0x0208, B:80:0x0223, B:81:0x0228, B:82:0x022d, B:86:0x023c, B:88:0x0245, B:89:0x0249, B:91:0x024f, B:93:0x0261, B:95:0x0269, B:96:0x026e, B:98:0x0276, B:99:0x027b, B:100:0x028a, B:103:0x029a, B:105:0x02a2, B:107:0x02aa, B:110:0x02b3, B:141:0x0337, B:164:0x0432, B:166:0x0450, B:167:0x045c, B:150:0x035a, B:152:0x0362, B:154:0x036a, B:156:0x0372, B:159:0x037b, B:160:0x0383, B:161:0x0392, B:162:0x03dd, B:163:0x0408, B:111:0x02b9, B:113:0x02c5, B:120:0x02df, B:122:0x02e3, B:124:0x02eb, B:127:0x02f6, B:129:0x0300, B:132:0x030d, B:133:0x0312, B:135:0x0322, B:136:0x0325, B:138:0x032b, B:139:0x032e, B:140:0x0333, B:114:0x02ca, B:116:0x02d0, B:118:0x02d6, B:119:0x02db, B:85:0x0239, B:58:0x01b5), top: B:174:0x01a4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0450 A[Catch: Exception -> 0x049a, TryCatch #1 {Exception -> 0x049a, blocks: (B:55:0x01a4, B:57:0x01ae, B:59:0x01bb, B:61:0x01c6, B:63:0x01cc, B:65:0x01de, B:69:0x01ed, B:72:0x01f4, B:74:0x01fa, B:78:0x020f, B:75:0x0208, B:80:0x0223, B:81:0x0228, B:82:0x022d, B:86:0x023c, B:88:0x0245, B:89:0x0249, B:91:0x024f, B:93:0x0261, B:95:0x0269, B:96:0x026e, B:98:0x0276, B:99:0x027b, B:100:0x028a, B:103:0x029a, B:105:0x02a2, B:107:0x02aa, B:110:0x02b3, B:141:0x0337, B:164:0x0432, B:166:0x0450, B:167:0x045c, B:150:0x035a, B:152:0x0362, B:154:0x036a, B:156:0x0372, B:159:0x037b, B:160:0x0383, B:161:0x0392, B:162:0x03dd, B:163:0x0408, B:111:0x02b9, B:113:0x02c5, B:120:0x02df, B:122:0x02e3, B:124:0x02eb, B:127:0x02f6, B:129:0x0300, B:132:0x030d, B:133:0x0312, B:135:0x0322, B:136:0x0325, B:138:0x032b, B:139:0x032e, B:140:0x0333, B:114:0x02ca, B:116:0x02d0, B:118:0x02d6, B:119:0x02db, B:85:0x0239, B:58:0x01b5), top: B:174:0x01a4, inners: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.g.run():void");
    }
}