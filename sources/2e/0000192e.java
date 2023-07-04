package com.facebook.react.modules.websocket;

import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.i;
import org.spongycastle.i18n.TextBundle;

@fg.a(hasConstants = false, name = "WebSocketModule")
/* loaded from: classes3.dex */
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    public static final String NAME = "WebSocketModule";
    public static final String TAG = "WebSocketModule";
    private final Map<Integer, b> mContentHandlers;
    private c mCookieHandler;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    /* loaded from: classes3.dex */
    public interface b {
        void a(i iVar, WritableMap writableMap);

        void b(String str, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new c(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get(RequestHeadersFactory.FraudDetection.HEADER_COOKIE);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    private static String getDefaultOrigin(String str) {
        boolean z11;
        try {
            String str2 = "";
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            if (hashCode == 3804) {
                if (scheme.equals("ws")) {
                    z11 = true;
                }
                z11 = true;
            } else if (hashCode == 118039) {
                if (scheme.equals("wss")) {
                    z11 = false;
                }
                z11 = true;
            } else if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    z11 = true;
                }
                z11 = true;
            } else {
                if (scheme.equals("http")) {
                    z11 = true;
                }
                z11 = true;
            }
            if (!z11) {
                str2 = "https";
            } else if (z11) {
                str2 = "http";
            } else if (z11 || z11) {
                str2 = "" + uri.getScheme();
            }
            return uri.getPort() != -1 ? String.format("%s://%s:%s", str2, uri.getHost(), Integer.valueOf(uri.getPort())) : String.format("%s://%s", str2, uri.getHost());
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i11, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i11);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d11, String str, double d12) {
        int i11 = (int) d12;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) d11, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i11));
            this.mContentHandlers.remove(Integer.valueOf(i11));
        } catch (Exception e11) {
            nd.a.k("ReactNative", "Could not close WebSocket connection for id " + i11, e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d11) {
        boolean z11;
        int i11 = (int) d11;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient build = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
        Request.Builder url = new Request.Builder().tag(Integer.valueOf(i11)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            url.addHeader(RequestHeadersFactory.FraudDetection.HEADER_COOKIE, cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            z11 = false;
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    if (nextKey.equalsIgnoreCase(AppMeasurementSdk.ConditionalUserProperty.ORIGIN)) {
                        z11 = true;
                    }
                    url.addHeader(nextKey, map.getString(nextKey));
                } else {
                    nd.a.G("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        } else {
            z11 = false;
        }
        if (!z11) {
            url.addHeader(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            for (int i12 = 0; i12 < readableArray.size(); i12++) {
                String trim = readableArray.getString(i12).trim();
                if (!trim.isEmpty() && !trim.contains(",")) {
                    sb2.append(trim);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                url.addHeader("Sec-WebSocket-Protocol", sb2.toString());
            }
        }
        build.newWebSocket(url.build(), new a(i11));
        build.dispatcher().executorService().shutdown();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebSocketModule";
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d11) {
        int i11 = (int) d11;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i11);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i11);
            createMap2.putInt(PaymentMethodOptionsParams.Blik.PARAM_CODE, 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i11));
            this.mContentHandlers.remove(Integer.valueOf(i11));
            return;
        }
        try {
            webSocket.send(i.f42656d);
        } catch (Exception e11) {
            notifyWebSocketFailed(i11, e11.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d11) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d11) {
        int i11 = (int) d11;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i11);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i11);
            createMap2.putInt(PaymentMethodOptionsParams.Blik.PARAM_CODE, 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i11));
            this.mContentHandlers.remove(Integer.valueOf(i11));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e11) {
            notifyWebSocketFailed(i11, e11.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d11) {
        int i11 = (int) d11;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i11);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i11);
            createMap2.putInt(PaymentMethodOptionsParams.Blik.PARAM_CODE, 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i11));
            this.mContentHandlers.remove(Integer.valueOf(i11));
            return;
        }
        try {
            webSocket.send(i.c(str));
        } catch (Exception e11) {
            notifyWebSocketFailed(i11, e11.getMessage());
        }
    }

    public void setContentHandler(int i11, b bVar) {
        if (bVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i11), bVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i11));
        }
    }

    /* loaded from: classes3.dex */
    class a extends WebSocketListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12123a;

        a(int i11) {
            this.f12123a = i11;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i11, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f12123a);
            createMap.putInt(PaymentMethodOptionsParams.Blik.PARAM_CODE, i11);
            createMap.putString("reason", str);
            WebSocketModule.this.sendEvent("websocketClosed", createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i11, String str) {
            webSocket.close(i11, str);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th2, Response response) {
            WebSocketModule.this.notifyWebSocketFailed(this.f12123a, th2.getMessage());
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f12123a);
            createMap.putString("type", TextBundle.TEXT_ENTRY);
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f12123a));
            if (bVar != null) {
                bVar.b(str, createMap);
            } else {
                createMap.putString(MessageExtension.FIELD_DATA, str);
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(this.f12123a), webSocket);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f12123a);
            createMap.putString("protocol", response.header("Sec-WebSocket-Protocol", ""));
            WebSocketModule.this.sendEvent("websocketOpen", createMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, i iVar) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f12123a);
            createMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f12123a));
            if (bVar != null) {
                bVar.a(iVar, createMap);
            } else {
                createMap.putString(MessageExtension.FIELD_DATA, iVar.a());
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }
    }

    public void sendBinary(i iVar, int i11) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i11));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i11);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i11);
            createMap2.putInt(PaymentMethodOptionsParams.Blik.PARAM_CODE, 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i11));
            this.mContentHandlers.remove(Integer.valueOf(i11));
            return;
        }
        try {
            webSocket.send(iVar);
        } catch (Exception e11) {
            notifyWebSocketFailed(i11, e11.getMessage());
        }
    }
}