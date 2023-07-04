package org.webrtc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitorAutoDetect;

/* loaded from: classes4.dex */
public class NetworkMonitorAutoDetect extends BroadcastReceiver implements NetworkChangeDetector {
    private static final long INVALID_NET_ID = -1;
    private static final String TAG = "NetworkMonitorAutoDetect";
    private static boolean includeWifiDirect;
    private final ConnectivityManager.NetworkCallback allNetworkCallback;
    final Set<Network> availableNetworks;
    private NetworkChangeDetector.ConnectionType connectionType;
    private ConnectivityManagerDelegate connectivityManagerDelegate;
    private final Context context;
    private final IntentFilter intentFilter;
    private boolean isRegistered;
    private final ConnectivityManager.NetworkCallback mobileNetworkCallback;
    private final NetworkChangeDetector.Observer observer;
    private WifiDirectManagerDelegate wifiDirectManagerDelegate;
    private WifiManagerDelegate wifiManagerDelegate;
    private String wifiSSID;

    /* loaded from: classes4.dex */
    public static class ConnectivityManagerDelegate {
        private final Set<Network> availableNetworks;
        private final ConnectivityManager connectivityManager;
        private final boolean getAllNetworksFromCache;
        private final boolean includeOtherUidNetworks;
        private final boolean requestVPN;

        ConnectivityManagerDelegate(Context context, Set<Network> set, String str) {
            this((ConnectivityManager) context.getSystemService("connectivity"), set, str);
        }

        private static boolean checkFieldTrial(String str, String str2, boolean z11) {
            if (str.contains(str2 + ":true")) {
                return true;
            }
            if (str.contains(str2 + ":false")) {
                return false;
            }
            return z11;
        }

        public NetworkChangeDetector.NetworkInformation networkToInfo(Network network) {
            ConnectivityManager connectivityManager;
            if (network == null || (connectivityManager = this.connectivityManager) == null) {
                return null;
            }
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                String network2 = network.toString();
                Logging.w(NetworkMonitorAutoDetect.TAG, "Detected unknown network: " + network2);
                return null;
            } else if (linkProperties.getInterfaceName() == null) {
                String network3 = network.toString();
                Logging.w(NetworkMonitorAutoDetect.TAG, "Null interface name for network " + network3);
                return null;
            } else {
                NetworkState networkState = getNetworkState(network);
                NetworkChangeDetector.ConnectionType connectionType = NetworkMonitorAutoDetect.getConnectionType(networkState);
                if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
                    String network4 = network.toString();
                    Logging.d(NetworkMonitorAutoDetect.TAG, "Network " + network4 + " is disconnected");
                    return null;
                }
                if (connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN || connectionType == NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                    String network5 = network.toString();
                    int networkType = networkState.getNetworkType();
                    int networkSubType = networkState.getNetworkSubType();
                    Logging.d(NetworkMonitorAutoDetect.TAG, "Network " + network5 + " connection type is " + connectionType + " because it has type " + networkType + " and subtype " + networkSubType);
                }
                return new NetworkChangeDetector.NetworkInformation(linkProperties.getInterfaceName(), connectionType, NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(networkState), NetworkMonitorAutoDetect.networkToNetId(network), getIPAddresses(linkProperties));
            }
        }

        NetworkRequest createNetworkRequest() {
            NetworkRequest.Builder addCapability = new NetworkRequest.Builder().addCapability(12);
            if (this.requestVPN) {
                addCapability.removeCapability(15);
            }
            if (Build.VERSION.SDK_INT >= 31 && this.includeOtherUidNetworks) {
                addCapability.setIncludeOtherUidNetworks(true);
            }
            return addCapability.build();
        }

        List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            if (supportNetworkCallback()) {
                ArrayList arrayList = new ArrayList();
                for (Network network : getAllNetworks()) {
                    NetworkChangeDetector.NetworkInformation networkToInfo = networkToInfo(network);
                    if (networkToInfo != null) {
                        arrayList.add(networkToInfo);
                    }
                }
                return arrayList;
            }
            return null;
        }

        Network[] getAllNetworks() {
            Network[] networkArr;
            if (this.connectivityManager == null) {
                return new Network[0];
            }
            if (supportNetworkCallback() && this.getAllNetworksFromCache) {
                synchronized (this.availableNetworks) {
                    networkArr = (Network[]) this.availableNetworks.toArray(new Network[0]);
                }
                return networkArr;
            }
            return this.connectivityManager.getAllNetworks();
        }

        long getDefaultNetId() {
            NetworkInfo activeNetworkInfo;
            Network[] allNetworks;
            NetworkInfo networkInfo;
            if (supportNetworkCallback() && (activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo()) != null) {
                long j11 = -1;
                for (Network network : getAllNetworks()) {
                    if (hasInternetCapability(network) && (networkInfo = this.connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                        if (j11 == -1) {
                            j11 = NetworkMonitorAutoDetect.networkToNetId(network);
                        } else {
                            throw new RuntimeException("Multiple connected networks of same type are not supported.");
                        }
                    }
                }
                return j11;
            }
            return -1L;
        }

        NetworkChangeDetector.IPAddress[] getIPAddresses(LinkProperties linkProperties) {
            NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[linkProperties.getLinkAddresses().size()];
            int i11 = 0;
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                iPAddressArr[i11] = new NetworkChangeDetector.IPAddress(linkAddress.getAddress().getAddress());
                i11++;
            }
            return iPAddressArr;
        }

        NetworkState getNetworkState() {
            ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager == null) {
                return new NetworkState(false, -1, -1, -1, -1);
            }
            return getNetworkState(connectivityManager.getActiveNetworkInfo());
        }

        boolean hasInternetCapability(Network network) {
            NetworkCapabilities networkCapabilities;
            ConnectivityManager connectivityManager = this.connectivityManager;
            return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null || !networkCapabilities.hasCapability(12)) ? false : true;
        }

        public void registerNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
            this.connectivityManager.registerNetworkCallback(createNetworkRequest(), networkCallback);
        }

        public void releaseCallback(ConnectivityManager.NetworkCallback networkCallback) {
            if (supportNetworkCallback()) {
                Logging.d(NetworkMonitorAutoDetect.TAG, "Unregister network callback");
                this.connectivityManager.unregisterNetworkCallback(networkCallback);
            }
        }

        public void requestMobileNetwork(ConnectivityManager.NetworkCallback networkCallback) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            this.connectivityManager.requestNetwork(builder.build(), networkCallback);
        }

        public boolean supportNetworkCallback() {
            return this.connectivityManager != null;
        }

        ConnectivityManagerDelegate(ConnectivityManager connectivityManager, Set<Network> set, String str) {
            this.connectivityManager = connectivityManager;
            this.availableNetworks = set;
            this.getAllNetworksFromCache = checkFieldTrial(str, "getAllNetworksFromCache", false);
            this.requestVPN = checkFieldTrial(str, "requestVPN", false);
            this.includeOtherUidNetworks = checkFieldTrial(str, "includeOtherUidNetworks", false);
        }

        NetworkState getNetworkState(Network network) {
            ConnectivityManager connectivityManager;
            NetworkInfo activeNetworkInfo;
            if (network != null && (connectivityManager = this.connectivityManager) != null) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo == null) {
                    String network2 = network.toString();
                    Logging.w(NetworkMonitorAutoDetect.TAG, "Couldn't retrieve information from network " + network2);
                    return new NetworkState(false, -1, -1, -1, -1);
                } else if (networkInfo.getType() != 17) {
                    NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        return new NetworkState(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                    }
                    return getNetworkState(networkInfo);
                } else if (networkInfo.getType() == 17) {
                    if (Build.VERSION.SDK_INT >= 23 && network.equals(this.connectivityManager.getActiveNetwork()) && (activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 17) {
                        return new NetworkState(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                    }
                    return new NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
                } else {
                    return getNetworkState(networkInfo);
                }
            }
            return new NetworkState(false, -1, -1, -1, -1);
        }

        private NetworkState getNetworkState(NetworkInfo networkInfo) {
            if (networkInfo != null && networkInfo.isConnected()) {
                return new NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
            }
            return new NetworkState(false, -1, -1, -1, -1);
        }
    }

    /* loaded from: classes4.dex */
    public static class NetworkState {
        private final boolean connected;
        private final int subtype;
        private final int type;
        private final int underlyingNetworkSubtypeForVpn;
        private final int underlyingNetworkTypeForVpn;

        public NetworkState(boolean z11, int i11, int i12, int i13, int i14) {
            this.connected = z11;
            this.type = i11;
            this.subtype = i12;
            this.underlyingNetworkTypeForVpn = i13;
            this.underlyingNetworkSubtypeForVpn = i14;
        }

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public boolean isConnected() {
            return this.connected;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class SimpleNetworkCallback extends ConnectivityManager.NetworkCallback {
        final Set<Network> availableNetworks;

        SimpleNetworkCallback(Set<Network> set) {
            NetworkMonitorAutoDetect.this = r1;
            this.availableNetworks = set;
        }

        private void onNetworkChanged(Network network) {
            NetworkChangeDetector.NetworkInformation networkToInfo = NetworkMonitorAutoDetect.this.connectivityManagerDelegate.networkToInfo(network);
            if (networkToInfo != null) {
                NetworkMonitorAutoDetect.this.observer.onNetworkConnect(networkToInfo);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            String network2 = network.toString();
            Logging.d(NetworkMonitorAutoDetect.TAG, "Network becomes available: " + network2);
            synchronized (this.availableNetworks) {
                this.availableNetworks.add(network);
            }
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            String networkCapabilities2 = networkCapabilities.toString();
            Logging.d(NetworkMonitorAutoDetect.TAG, "capabilities changed: " + networkCapabilities2);
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            Logging.d(NetworkMonitorAutoDetect.TAG, "link properties changed");
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i11) {
            String network2 = network.toString();
            Logging.d(NetworkMonitorAutoDetect.TAG, "Network " + network2 + " is about to lose in " + i11 + "ms");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String network2 = network.toString();
            Logging.d(NetworkMonitorAutoDetect.TAG, "Network " + network2 + " is disconnected");
            synchronized (this.availableNetworks) {
                this.availableNetworks.remove(network);
            }
            NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(NetworkMonitorAutoDetect.networkToNetId(network));
        }
    }

    /* loaded from: classes4.dex */
    public static class WifiDirectManagerDelegate extends BroadcastReceiver {
        private static final int WIFI_P2P_NETWORK_HANDLE = 0;
        private final Context context;
        private final NetworkChangeDetector.Observer observer;
        private NetworkChangeDetector.NetworkInformation wifiP2pNetworkInfo;

        WifiDirectManagerDelegate(NetworkChangeDetector.Observer observer, Context context) {
            this.context = context;
            this.observer = observer;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context.registerReceiver(this, intentFilter);
            if (Build.VERSION.SDK_INT > 28) {
                WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
                wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), null), new WifiP2pManager.GroupInfoListener() { // from class: org.webrtc.h0
                    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                        NetworkMonitorAutoDetect.WifiDirectManagerDelegate.a(NetworkMonitorAutoDetect.WifiDirectManagerDelegate.this, wifiP2pGroup);
                    }
                });
            }
        }

        public static /* synthetic */ void a(WifiDirectManagerDelegate wifiDirectManagerDelegate, WifiP2pGroup wifiP2pGroup) {
            wifiDirectManagerDelegate.lambda$new$0(wifiP2pGroup);
        }

        /* renamed from: onWifiP2pGroupChange */
        public void lambda$new$0(WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup == null || wifiP2pGroup.getInterface() == null) {
                return;
            }
            try {
                ArrayList list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                NetworkChangeDetector.IPAddress[] iPAddressArr = new NetworkChangeDetector.IPAddress[list.size()];
                for (int i11 = 0; i11 < list.size(); i11++) {
                    iPAddressArr[i11] = new NetworkChangeDetector.IPAddress(((InetAddress) list.get(i11)).getAddress());
                }
                NetworkChangeDetector.NetworkInformation networkInformation = new NetworkChangeDetector.NetworkInformation(wifiP2pGroup.getInterface(), NetworkChangeDetector.ConnectionType.CONNECTION_WIFI, NetworkChangeDetector.ConnectionType.CONNECTION_NONE, 0L, iPAddressArr);
                this.wifiP2pNetworkInfo = networkInformation;
                this.observer.onNetworkConnect(networkInformation);
            } catch (SocketException e11) {
                Logging.e(NetworkMonitorAutoDetect.TAG, "Unable to get WifiP2p network interface", e11);
            }
        }

        private void onWifiP2pStateChange(int i11) {
            if (i11 == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0L);
            }
        }

        public List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            NetworkChangeDetector.NetworkInformation networkInformation = this.wifiP2pNetworkInfo;
            if (networkInformation != null) {
                return Collections.singletonList(networkInformation);
            }
            return Collections.emptyList();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                lambda$new$0((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
        }

        public void release() {
            this.context.unregisterReceiver(this);
        }
    }

    public NetworkMonitorAutoDetect(NetworkChangeDetector.Observer observer, Context context) {
        HashSet hashSet = new HashSet();
        this.availableNetworks = hashSet;
        this.observer = observer;
        this.context = context;
        this.connectivityManagerDelegate = new ConnectivityManagerDelegate(context, hashSet, observer.getFieldTrialsString());
        this.wifiManagerDelegate = new WifiManagerDelegate(context);
        NetworkState networkState = this.connectivityManagerDelegate.getNetworkState();
        this.connectionType = getConnectionType(networkState);
        this.wifiSSID = getWifiSSID(networkState);
        this.intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (includeWifiDirect) {
            this.wifiDirectManagerDelegate = new WifiDirectManagerDelegate(observer, context);
        }
        registerReceiver();
        ConnectivityManager.NetworkCallback networkCallback = null;
        if (this.connectivityManagerDelegate.supportNetworkCallback()) {
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
            try {
                this.connectivityManagerDelegate.requestMobileNetwork(networkCallback2);
                networkCallback = networkCallback2;
            } catch (SecurityException unused) {
                Logging.w(TAG, "Unable to obtain permission to request a cellular network.");
            }
            this.mobileNetworkCallback = networkCallback;
            SimpleNetworkCallback simpleNetworkCallback = new SimpleNetworkCallback(this.availableNetworks);
            this.allNetworkCallback = simpleNetworkCallback;
            this.connectivityManagerDelegate.registerNetworkCallback(simpleNetworkCallback);
            return;
        }
        this.mobileNetworkCallback = null;
        this.allNetworkCallback = null;
    }

    private void connectionTypeChanged(NetworkState networkState) {
        NetworkChangeDetector.ConnectionType connectionType = getConnectionType(networkState);
        String wifiSSID = getWifiSSID(networkState);
        if (connectionType == this.connectionType && wifiSSID.equals(this.wifiSSID)) {
            return;
        }
        this.connectionType = connectionType;
        this.wifiSSID = wifiSSID;
        Logging.d(TAG, "Network connectivity changed, type is: " + connectionType);
        this.observer.onConnectionTypeChanged(connectionType);
    }

    private static NetworkChangeDetector.ConnectionType getConnectionType(boolean z11, int i11, int i12) {
        if (z11) {
            if (i11 == 0) {
                switch (i12) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return NetworkChangeDetector.ConnectionType.CONNECTION_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return NetworkChangeDetector.ConnectionType.CONNECTION_3G;
                    case 13:
                    case 18:
                        return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
                    case 19:
                    default:
                        return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                    case 20:
                        return NetworkChangeDetector.ConnectionType.CONNECTION_5G;
                }
            } else if (i11 != 1) {
                if (i11 != 6) {
                    if (i11 != 7) {
                        if (i11 != 9) {
                            if (i11 != 17) {
                                return NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
                            }
                            return NetworkChangeDetector.ConnectionType.CONNECTION_VPN;
                        }
                        return NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET;
                    }
                    return NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH;
                }
                return NetworkChangeDetector.ConnectionType.CONNECTION_4G;
            } else {
                return NetworkChangeDetector.ConnectionType.CONNECTION_WIFI;
            }
        }
        return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
    }

    public static NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn(NetworkState networkState) {
        if (networkState.getNetworkType() != 17) {
            return NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        return getConnectionType(networkState.isConnected(), networkState.getUnderlyingNetworkTypeForVpn(), networkState.getUnderlyingNetworkSubtypeForVpn());
    }

    private String getWifiSSID(NetworkState networkState) {
        return getConnectionType(networkState) != NetworkChangeDetector.ConnectionType.CONNECTION_WIFI ? "" : this.wifiManagerDelegate.getWifiSSID();
    }

    public static long networkToNetId(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return Integer.parseInt(network.toString());
    }

    private void registerReceiver() {
        if (this.isRegistered) {
            return;
        }
        this.isRegistered = true;
        this.context.registerReceiver(this, this.intentFilter);
    }

    public static void setIncludeWifiDirect(boolean z11) {
        includeWifiDirect = z11;
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }

    @Override // org.webrtc.NetworkChangeDetector
    public void destroy() {
        ConnectivityManager.NetworkCallback networkCallback = this.allNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = this.mobileNetworkCallback;
        if (networkCallback2 != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback2);
        }
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            wifiDirectManagerDelegate.release();
        }
        unregisterReceiver();
    }

    @Override // org.webrtc.NetworkChangeDetector
    public List<NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
        List<NetworkChangeDetector.NetworkInformation> activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(activeNetworkList);
        WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            arrayList.addAll(wifiDirectManagerDelegate.getActiveNetworkList());
        }
        return arrayList;
    }

    @Override // org.webrtc.NetworkChangeDetector
    public NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return getConnectionType(getCurrentNetworkState());
    }

    public NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkState currentNetworkState = getCurrentNetworkState();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            connectionTypeChanged(currentNetworkState);
        }
    }

    void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.connectivityManagerDelegate = connectivityManagerDelegate;
    }

    void setWifiManagerDelegateForTests(WifiManagerDelegate wifiManagerDelegate) {
        this.wifiManagerDelegate = wifiManagerDelegate;
    }

    @Override // org.webrtc.NetworkChangeDetector
    public boolean supportNetworkCallback() {
        return this.connectivityManagerDelegate.supportNetworkCallback();
    }

    /* loaded from: classes4.dex */
    public static class WifiManagerDelegate {
        private final Context context;

        WifiManagerDelegate(Context context) {
            this.context = context;
        }

        String getWifiSSID() {
            WifiInfo wifiInfo;
            String ssid;
            Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            return (registerReceiver == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) ? "" : ssid;
        }

        WifiManagerDelegate() {
            this.context = null;
        }
    }

    public static NetworkChangeDetector.ConnectionType getConnectionType(NetworkState networkState) {
        return getConnectionType(networkState.isConnected(), networkState.getNetworkType(), networkState.getNetworkSubType());
    }
}