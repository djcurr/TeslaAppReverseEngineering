package com.tesla.TeslaV4.reactnative.module;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.WifiNetworkSuggestion;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.net.Inet4Address;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;
import wz.r0;
import wz.x0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001!\u0018\u0000 (2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/NetInfoModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "bindProcessToWifi", "", "Ljava/net/InterfaceAddress;", "getInetAddresses", "", "ip", "inDSLITERange", "getName", "ssid", "password", "securityType", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "connectToWifi", "bindDataToWifi", "didUserCancelWifiSuggestion", "disconnectFromWifi", "getIPAddress", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "userCancelled", "Z", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "com/tesla/TeslaV4/reactnative/module/NetInfoModule$b", "networkCallback", "Lcom/tesla/TeslaV4/reactnative/module/NetInfoModule$b;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class NetInfoModule extends ReactContextBaseJavaModule {
    public static final a Companion = new a(null);
    private static final Set<String> DSLITE_LIST;
    private static final String TAG = "NetInfoModule";
    private final ConnectivityManager connectivityManager;
    private final com.tesla.logging.g logger;
    private final b networkCallback;
    private boolean userCancelled;
    private final WifiManager wifiManager;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            kotlin.jvm.internal.s.g(network, "network");
            super.onAvailable(network);
            boolean bindProcessToNetwork = NetInfoModule.this.connectivityManager.bindProcessToNetwork(network);
            com.tesla.logging.g gVar = NetInfoModule.this.logger;
            gVar.i("Network onAvailable: " + bindProcessToNetwork);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            kotlin.jvm.internal.s.g(network, "network");
            super.onLost(network);
            boolean bindProcessToNetwork = NetInfoModule.this.connectivityManager.bindProcessToNetwork(null);
            NetInfoModule.this.connectivityManager.unregisterNetworkCallback(this);
            com.tesla.logging.g gVar = NetInfoModule.this.logger;
            gVar.i("Network onLost: " + bindProcessToNetwork);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            NetInfoModule.this.logger.i("Network onUnavailable");
            NetInfoModule.this.userCancelled = true;
        }
    }

    static {
        Set<String> i11;
        i11 = x0.i("192.0.0.0", "192.0.0.1", "192.0.0.2", "192.0.0.3", "192.0.0.4", "192.0.0.5", "192.0.0.6", "192.0.0.7");
        DSLITE_LIST = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetInfoModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        this.logger = com.tesla.logging.g.f21878b.a(TAG);
        Object systemService = getReactApplicationContext().getSystemService("wifi");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        this.wifiManager = (WifiManager) systemService;
        Object systemService2 = getReactApplicationContext().getSystemService("connectivity");
        Objects.requireNonNull(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService2;
        this.networkCallback = new b();
    }

    private final boolean bindProcessToWifi() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        Network[] allNetworks = this.connectivityManager.getAllNetworks();
        kotlin.jvm.internal.s.f(allNetworks, "connectivityManager.getAllNetworks()");
        if (allNetworks.length == 0) {
            this.logger.i("No networks found");
        }
        int i11 = 0;
        int length = allNetworks.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Network network = allNetworks[i11];
            i11++;
            if (Build.VERSION.SDK_INT >= 28) {
                NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                    this.logger.i("Binding process to WiFi transport");
                    this.connectivityManager.bindProcessToNetwork(network);
                    break;
                }
            } else {
                NetworkInfo networkInfo = this.connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.getType() == 1) {
                    this.logger.i("Binding process to WiFi type");
                    this.connectivityManager.bindProcessToNetwork(network);
                    break;
                }
            }
        }
        return true;
    }

    private final List<InterfaceAddress> getInetAddresses() {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        kotlin.jvm.internal.s.f(networkInterfaces, "getNetworkInterfaces()");
        ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
        kotlin.jvm.internal.s.f(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (NetworkInterface networkInterface : list) {
            wz.b0.z(arrayList, networkInterface.getInterfaceAddresses());
        }
        return arrayList;
    }

    private final boolean inDSLITERange(String str) {
        return DSLITE_LIST.contains(str);
    }

    @ReactMethod
    public final void bindDataToWifi(Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        promise.resolve(Boolean.valueOf(bindProcessToWifi()));
    }

    @ReactMethod
    public final void connectToWifi(String ssid, String password, String securityType, Promise promise) {
        List<WifiNetworkSuggestion> d11;
        List<WifiNetworkSuggestion> d12;
        Map f11;
        kotlin.jvm.internal.s.g(ssid, "ssid");
        kotlin.jvm.internal.s.g(password, "password");
        kotlin.jvm.internal.s.g(securityType, "securityType");
        kotlin.jvm.internal.s.g(promise, "promise");
        boolean z11 = false;
        this.userCancelled = false;
        if (Build.VERSION.SDK_INT >= 29) {
            WifiManager wifiManager = this.wifiManager;
            d11 = wz.v.d(new WifiNetworkSuggestion.Builder().setSsid(ssid).build());
            wifiManager.removeNetworkSuggestions(d11);
            WifiNetworkSuggestion build = new WifiNetworkSuggestion.Builder().setSsid(ssid).setWpa2Passphrase(password).build();
            kotlin.jvm.internal.s.f(build, "Builder()\n          .set…sword)\n          .build()");
            WifiNetworkSpecifier build2 = new WifiNetworkSpecifier.Builder().setSsid(ssid).setWpa2Passphrase(password).build();
            kotlin.jvm.internal.s.f(build2, "Builder()\n          .set…sword)\n          .build()");
            WifiManager wifiManager2 = this.wifiManager;
            d12 = wz.v.d(build);
            int addNetworkSuggestions = wifiManager2.addNetworkSuggestions(d12);
            if (addNetworkSuggestions != 0) {
                String str = "Error Wi-Fi Suggestions: Status " + addNetworkSuggestions;
                com.tesla.logging.g gVar = this.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f11 = r0.f(vz.v.a(h11, str));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(str));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a(str, new Object[0]);
                promise.reject("E_ADD_WIFI_NETWORK", String.valueOf(addNetworkSuggestions));
                return;
            }
            NetworkRequest build3 = new NetworkRequest.Builder().addTransportType(1).setNetworkSpecifier(build2).build();
            kotlin.jvm.internal.s.f(build3, "Builder()\n          .add…ifier)\n          .build()");
            this.connectivityManager.requestNetwork(build3, this.networkCallback);
            promise.resolve(Boolean.TRUE);
            return;
        }
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        q0 q0Var = q0.f34921a;
        String format = String.format("\"%s\"", Arrays.copyOf(new Object[]{ssid}, 1));
        kotlin.jvm.internal.s.f(format, "format(format, *args)");
        wifiConfiguration.SSID = format;
        String format2 = String.format("\"%s\"", Arrays.copyOf(new Object[]{password}, 1));
        kotlin.jvm.internal.s.f(format2, "format(format, *args)");
        wifiConfiguration.preSharedKey = format2;
        wifiConfiguration.priority = 999999;
        if (this.wifiManager.addNetwork(wifiConfiguration) == -1) {
            this.logger.i("WiFi Config has already been added before");
        }
        Iterator<WifiConfiguration> it2 = this.wifiManager.getConfiguredNetworks().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            WifiConfiguration next = it2.next();
            String str2 = next.SSID;
            if (str2 != null) {
                if (str2.equals("\"" + ssid + "\"")) {
                    this.wifiManager.disconnect();
                    this.wifiManager.enableNetwork(next.networkId, true);
                    this.wifiManager.reconnect();
                    z11 = true;
                    break;
                }
            }
        }
        promise.resolve(Boolean.valueOf(z11));
    }

    @ReactMethod
    public final void didUserCancelWifiSuggestion(Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        promise.resolve(Boolean.valueOf(this.userCancelled));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v8 */
    @ReactMethod
    public final void disconnectFromWifi(String ssid, Promise promise) {
        Map f11;
        List<WifiNetworkSuggestion> d11;
        kotlin.jvm.internal.s.g(ssid, "ssid");
        kotlin.jvm.internal.s.g(promise, "promise");
        try {
        } catch (Exception e11) {
            e = e11;
            ssid = 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                WifiManager wifiManager = this.wifiManager;
                d11 = wz.v.d(new WifiNetworkSuggestion.Builder().setSsid(ssid).build());
                wifiManager.removeNetworkSuggestions(d11);
                boolean bindProcessToNetwork = this.connectivityManager.bindProcessToNetwork(null);
                this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
                ssid = bindProcessToNetwork;
            } else {
                for (WifiConfiguration wifiConfiguration : this.wifiManager.getConfiguredNetworks()) {
                    String str = wifiConfiguration.SSID;
                    if (str != null) {
                        if (str.equals("\"" + ssid + "\"")) {
                            this.wifiManager.removeNetwork(wifiConfiguration.networkId);
                        }
                    }
                }
                boolean disconnect = this.wifiManager.disconnect();
                this.connectivityManager.bindProcessToNetwork(null);
                ssid = disconnect;
            }
        } catch (Exception e12) {
            e = e12;
            com.tesla.logging.g gVar = this.logger;
            String localizedMessage = e.getLocalizedMessage();
            kotlin.jvm.internal.s.f(localizedMessage, "e.localizedMessage");
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, localizedMessage));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(localizedMessage));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(localizedMessage, new Object[0]);
            promise.resolve(Boolean.valueOf(ssid));
        }
        promise.resolve(Boolean.valueOf(ssid));
    }

    @ReactMethod
    public final void getIPAddress(Promise promise) {
        Map f11;
        boolean M;
        kotlin.jvm.internal.s.g(promise, "promise");
        try {
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            for (InterfaceAddress interfaceAddress : getInetAddresses()) {
                if (!interfaceAddress.getAddress().isLoopbackAddress()) {
                    String str = interfaceAddress.getAddress().getHostAddress().toString();
                    if (!inDSLITERange(str)) {
                        M = kotlin.text.w.M(str, "wlan", false, 2, null);
                        if (M) {
                            obj2 = str;
                        }
                        if (interfaceAddress.getAddress() instanceof Inet4Address) {
                            obj = str;
                            obj3 = obj;
                        } else {
                            obj3 = str;
                        }
                    }
                }
            }
            if (obj == null) {
                obj = obj2 == null ? obj3 : obj2;
            }
            promise.resolve(obj);
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.logger;
            String localizedMessage = e11.getLocalizedMessage();
            kotlin.jvm.internal.s.f(localizedMessage, "e.localizedMessage");
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h11, localizedMessage));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(localizedMessage));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(localizedMessage, new Object[0]);
            promise.resolve(null);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }
}