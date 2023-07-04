package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.stripe.android.model.PaymentMethod;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Locale;
import org.spongycastle.i18n.ErrorBundle;

/* loaded from: classes2.dex */
abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f20102a;

    /* renamed from: b  reason: collision with root package name */
    private final WifiManager f20103b;

    /* renamed from: c  reason: collision with root package name */
    private final TelephonyManager f20104c;

    /* renamed from: d  reason: collision with root package name */
    private final ReactApplicationContext f20105d;

    /* renamed from: e  reason: collision with root package name */
    private wq.b f20106e = wq.b.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    private wq.a f20107f = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20108g = false;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f20109h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(ReactApplicationContext reactApplicationContext) {
        this.f20105d = reactApplicationContext;
        this.f20102a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f20103b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f20104c = (TelephonyManager) reactApplicationContext.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
    }

    private WritableMap a(String str) {
        WritableMap createMap = Arguments.createMap();
        if (vq.b.a(e())) {
            createMap.putBoolean("isWifiEnabled", this.f20103b.isWifiEnabled());
        }
        createMap.putString("type", str != null ? str : this.f20106e.label);
        boolean z11 = false;
        boolean z12 = (this.f20106e.equals(wq.b.NONE) || this.f20106e.equals(wq.b.UNKNOWN)) ? false : true;
        createMap.putBoolean("isConnected", z12);
        if (this.f20108g && (str == null || str.equals(this.f20106e.label))) {
            z11 = true;
        }
        createMap.putBoolean("isInternetReachable", z11);
        if (str == null) {
            str = this.f20106e.label;
        }
        WritableMap b11 = b(str);
        if (z12) {
            b11.putBoolean("isConnectionExpensive", c() != null ? c().isActiveNetworkMetered() : true);
        }
        createMap.putMap(ErrorBundle.DETAIL_ENTRY, b11);
        return createMap;
    }

    private WritableMap b(String str) {
        WifiInfo connectionInfo;
        WritableMap createMap = Arguments.createMap();
        str.hashCode();
        if (!str.equals("cellular")) {
            if (str.equals("wifi") && vq.b.a(e()) && (connectionInfo = this.f20103b.getConnectionInfo()) != null) {
                try {
                    String ssid = connectionInfo.getSSID();
                    if (ssid != null && !ssid.contains("<unknown ssid>")) {
                        createMap.putString("ssid", ssid.replace("\"", ""));
                    }
                } catch (Exception unused) {
                }
                try {
                    String bssid = connectionInfo.getBSSID();
                    if (bssid != null) {
                        createMap.putString("bssid", bssid);
                    }
                } catch (Exception unused2) {
                }
                try {
                    createMap.putInt("strength", WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                } catch (Exception unused3) {
                }
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        createMap.putInt("frequency", connectionInfo.getFrequency());
                    }
                } catch (Exception unused4) {
                }
                try {
                    byte[] byteArray = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                    vq.b.b(byteArray);
                    createMap.putString("ipAddress", InetAddress.getByAddress(byteArray).getHostAddress());
                } catch (Exception unused5) {
                }
                try {
                    byte[] byteArray2 = BigInteger.valueOf(connectionInfo.getIpAddress()).toByteArray();
                    vq.b.b(byteArray2);
                    int networkPrefixLength = (-1) << (32 - NetworkInterface.getByInetAddress(InetAddress.getByAddress(byteArray2)).getInterfaceAddresses().get(1).getNetworkPrefixLength());
                    createMap.putString("subnet", String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255)));
                } catch (Exception unused6) {
                }
            }
        } else {
            wq.a aVar = this.f20107f;
            if (aVar != null) {
                createMap.putString("cellularGeneration", aVar.label);
            }
            String networkOperatorName = this.f20104c.getNetworkOperatorName();
            if (networkOperatorName != null) {
                createMap.putString("carrier", networkOperatorName);
            }
        }
        return createMap;
    }

    private void g() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", a(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectivityManager c() {
        return this.f20102a;
    }

    public void d(String str, Promise promise) {
        promise.resolve(a(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactApplicationContext e() {
        return this.f20105d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    public void h(boolean z11) {
        this.f20109h = Boolean.valueOf(z11);
        j(this.f20106e, this.f20107f, this.f20108g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(wq.b bVar, wq.a aVar, boolean z11) {
        Boolean bool = this.f20109h;
        if (bool != null) {
            z11 = bool.booleanValue();
        }
        boolean z12 = bVar != this.f20106e;
        boolean z13 = aVar != this.f20107f;
        boolean z14 = z11 != this.f20108g;
        if (z12 || z13 || z14) {
            this.f20106e = bVar;
            this.f20107f = aVar;
            this.f20108g = z11;
            g();
        }
    }
}