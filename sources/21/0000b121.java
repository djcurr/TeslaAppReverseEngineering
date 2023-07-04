package rw;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.zxcpoiu.incallmanager.InCallManagerModule;
import java.util.List;
import java.util.Set;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49701a;

    /* renamed from: b  reason: collision with root package name */
    private final InCallManagerModule f49702b;

    /* renamed from: c  reason: collision with root package name */
    private final AudioManager f49703c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f49704d;

    /* renamed from: e  reason: collision with root package name */
    int f49705e;

    /* renamed from: f  reason: collision with root package name */
    private d f49706f;

    /* renamed from: g  reason: collision with root package name */
    private final BluetoothProfile.ServiceListener f49707g;

    /* renamed from: h  reason: collision with root package name */
    private BluetoothAdapter f49708h;

    /* renamed from: i  reason: collision with root package name */
    private BluetoothHeadset f49709i;

    /* renamed from: j  reason: collision with root package name */
    private BluetoothDevice f49710j;

    /* renamed from: k  reason: collision with root package name */
    private final BroadcastReceiver f49711k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f49712l = new RunnableC1087a();

    /* renamed from: rw.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class RunnableC1087a implements Runnable {
        RunnableC1087a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.i();
        }
    }

    /* loaded from: classes6.dex */
    private class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (a.this.f49706f == d.UNINITIALIZED) {
                return;
            }
            String action = intent.getAction();
            if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                Log.d("AppRTCBluetoothManager", "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_CONNECTION_STATE_CHANGED, s=" + a.this.v(intExtra) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + a.this.f49706f);
                if (intExtra == 2) {
                    a aVar = a.this;
                    aVar.f49705e = 0;
                    aVar.z();
                } else if (intExtra != 1 && intExtra != 3 && intExtra == 0) {
                    a.this.x();
                    a.this.z();
                }
            } else if (action.equals("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                Log.d("AppRTCBluetoothManager", "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_AUDIO_STATE_CHANGED, s=" + a.this.v(intExtra2) + ", sb=" + isInitialStickyBroadcast() + ", BT state: " + a.this.f49706f);
                if (intExtra2 == 12) {
                    a.this.j();
                    if (a.this.f49706f == d.SCO_CONNECTING) {
                        Log.d("AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now connected");
                        a.this.f49706f = d.SCO_CONNECTED;
                        a aVar2 = a.this;
                        aVar2.f49705e = 0;
                        aVar2.z();
                    } else {
                        Log.w("AppRTCBluetoothManager", "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED");
                    }
                } else if (intExtra2 == 11) {
                    Log.d("AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now connecting...");
                } else if (intExtra2 == 10) {
                    Log.d("AppRTCBluetoothManager", "+++ Bluetooth audio SCO is now disconnected");
                    if (!isInitialStickyBroadcast()) {
                        a.this.z();
                    } else {
                        Log.d("AppRTCBluetoothManager", "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast.");
                        return;
                    }
                }
            }
            Log.d("AppRTCBluetoothManager", "onReceive done: BT state=" + a.this.f49706f);
        }

        /* synthetic */ b(a aVar, RunnableC1087a runnableC1087a) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    private class c implements BluetoothProfile.ServiceListener {
        private c() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i11, BluetoothProfile bluetoothProfile) {
            if (i11 != 1 || a.this.f49706f == d.UNINITIALIZED) {
                return;
            }
            Log.d("AppRTCBluetoothManager", "BluetoothServiceListener.onServiceConnected: BT state=" + a.this.f49706f);
            a.this.f49709i = (BluetoothHeadset) bluetoothProfile;
            a.this.z();
            Log.d("AppRTCBluetoothManager", "onServiceConnected done: BT state=" + a.this.f49706f);
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i11) {
            if (i11 != 1 || a.this.f49706f == d.UNINITIALIZED) {
                return;
            }
            Log.d("AppRTCBluetoothManager", "BluetoothServiceListener.onServiceDisconnected: BT state=" + a.this.f49706f);
            a.this.x();
            a.this.f49709i = null;
            a.this.f49710j = null;
            a.this.f49706f = d.HEADSET_UNAVAILABLE;
            a.this.z();
            Log.d("AppRTCBluetoothManager", "onServiceDisconnected done: BT state=" + a.this.f49706f);
        }

        /* synthetic */ c(a aVar, RunnableC1087a runnableC1087a) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public enum d {
        UNINITIALIZED,
        ERROR,
        HEADSET_UNAVAILABLE,
        HEADSET_AVAILABLE,
        SCO_DISCONNECTING,
        SCO_CONNECTING,
        SCO_CONNECTED
    }

    protected a(Context context, InCallManagerModule inCallManagerModule) {
        Log.d("AppRTCBluetoothManager", "ctor");
        this.f49701a = context;
        this.f49702b = inCallManagerModule;
        this.f49703c = l(context);
        this.f49706f = d.UNINITIALIZED;
        this.f49707g = new c(this, null);
        this.f49711k = new b(this, null);
        this.f49704d = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            r4 = this;
            rw.a$d r0 = r4.f49706f
            rw.a$d r1 = rw.a.d.UNINITIALIZED
            if (r0 == r1) goto Lbf
            android.bluetooth.BluetoothHeadset r0 = r4.f49709i
            if (r0 != 0) goto Lc
            goto Lbf
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bluetoothTimeout: BT state="
            r0.append(r1)
            rw.a$d r1 = r4.f49706f
            r0.append(r1)
            java.lang.String r1 = ", attempts: "
            r0.append(r1)
            int r1 = r4.f49705e
            r0.append(r1)
            java.lang.String r1 = ", SCO is on: "
            r0.append(r1)
            boolean r1 = r4.p()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AppRTCBluetoothManager"
            android.util.Log.d(r1, r0)
            rw.a$d r0 = r4.f49706f
            rw.a$d r2 = rw.a.d.SCO_CONNECTING
            if (r0 == r2) goto L41
            return
        L41:
            android.bluetooth.BluetoothHeadset r0 = r4.f49709i
            java.util.List r0 = r0.getConnectedDevices()
            int r2 = r0.size()
            r3 = 0
            if (r2 <= 0) goto L94
            java.lang.Object r0 = r0.get(r3)
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            r4.f49710j = r0
            android.bluetooth.BluetoothHeadset r2 = r4.f49709i
            boolean r0 = r2.isAudioConnected(r0)
            if (r0 == 0) goto L7a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SCO connected with "
            r0.append(r2)
            android.bluetooth.BluetoothDevice r2 = r4.f49710j
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
            r0 = 1
            goto L95
        L7a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SCO is not connected with "
            r0.append(r2)
            android.bluetooth.BluetoothDevice r2 = r4.f49710j
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L94:
            r0 = r3
        L95:
            if (r0 == 0) goto L9e
            rw.a$d r0 = rw.a.d.SCO_CONNECTED
            r4.f49706f = r0
            r4.f49705e = r3
            goto La6
        L9e:
            java.lang.String r0 = "BT failed to connect after timeout"
            android.util.Log.w(r1, r0)
            r4.x()
        La6:
            r4.z()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "bluetoothTimeout done: BT state="
            r0.append(r2)
            rw.a$d r2 = r4.f49706f
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rw.a.i():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Log.d("AppRTCBluetoothManager", "cancelTimer");
        this.f49704d.removeCallbacks(this.f49712l);
    }

    public static a k(Context context, InCallManagerModule inCallManagerModule) {
        Log.d("AppRTCBluetoothManager", "create");
        return new a(context, inCallManagerModule);
    }

    private boolean p() {
        return this.f49703c.isBluetoothScoOn();
    }

    private void u() {
        Log.d("AppRTCBluetoothManager", "startTimer");
        this.f49704d.postDelayed(this.f49712l, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String v(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        switch (i11) {
                            case 10:
                                return "OFF";
                            case 11:
                                return "TURNING_ON";
                            case 12:
                                return "ON";
                            case 13:
                                return "TURNING_OFF";
                            default:
                                return "INVALID";
                        }
                    }
                    return "DISCONNECTING";
                }
                return "CONNECTED";
            }
            return "CONNECTING";
        }
        return "DISCONNECTED";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        Log.d("AppRTCBluetoothManager", "updateAudioDeviceState");
        this.f49702b.updateAudioDeviceState();
    }

    public void A() {
        if (this.f49706f == d.UNINITIALIZED || this.f49709i == null) {
            return;
        }
        Log.d("AppRTCBluetoothManager", "updateDevice");
        List<BluetoothDevice> connectedDevices = this.f49709i.getConnectedDevices();
        if (connectedDevices.isEmpty()) {
            this.f49710j = null;
            this.f49706f = d.HEADSET_UNAVAILABLE;
            Log.d("AppRTCBluetoothManager", "No connected bluetooth headset");
        } else {
            this.f49710j = connectedDevices.get(0);
            this.f49706f = d.HEADSET_AVAILABLE;
            Log.d("AppRTCBluetoothManager", "Connected bluetooth headset: name=" + this.f49710j.getName() + ", state=" + v(this.f49709i.getConnectionState(this.f49710j)) + ", SCO audio=" + this.f49709i.isAudioConnected(this.f49710j));
        }
        Log.d("AppRTCBluetoothManager", "updateDevice done: BT state=" + this.f49706f);
    }

    protected AudioManager l(Context context) {
        return (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    protected boolean m(Context context, BluetoothProfile.ServiceListener serviceListener, int i11) {
        return this.f49708h.getProfileProxy(context, serviceListener, i11);
    }

    public d n() {
        return this.f49706f;
    }

    protected boolean o(Context context, String str) {
        return this.f49701a.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    protected void q(BluetoothAdapter bluetoothAdapter) {
        Log.d("AppRTCBluetoothManager", "BluetoothAdapter: enabled=" + bluetoothAdapter.isEnabled() + ", state=" + v(bluetoothAdapter.getState()) + ", name=" + bluetoothAdapter.getName() + ", address=" + bluetoothAdapter.getAddress());
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        if (bondedDevices.isEmpty()) {
            return;
        }
        Log.d("AppRTCBluetoothManager", "paired devices:");
        for (BluetoothDevice bluetoothDevice : bondedDevices) {
            Log.d("AppRTCBluetoothManager", " name=" + bluetoothDevice.getName() + ", address=" + bluetoothDevice.getAddress());
        }
    }

    protected void r(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f49701a.registerReceiver(broadcastReceiver, intentFilter);
    }

    public void s() {
        Log.d("AppRTCBluetoothManager", "start");
        if (!o(this.f49701a, "android.permission.BLUETOOTH")) {
            Log.w("AppRTCBluetoothManager", "Process (pid=" + Process.myPid() + ") lacks BLUETOOTH permission");
        } else if (this.f49706f != d.UNINITIALIZED) {
            Log.w("AppRTCBluetoothManager", "Invalid BT state");
        } else {
            this.f49709i = null;
            this.f49710j = null;
            this.f49705e = 0;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.f49708h = defaultAdapter;
            if (defaultAdapter == null) {
                Log.w("AppRTCBluetoothManager", "Device does not support Bluetooth");
            } else if (!this.f49703c.isBluetoothScoAvailableOffCall()) {
                Log.e("AppRTCBluetoothManager", "Bluetooth SCO audio is not available off call");
            } else {
                q(this.f49708h);
                if (!m(this.f49701a, this.f49707g, 1)) {
                    Log.e("AppRTCBluetoothManager", "BluetoothAdapter.getProfileProxy(HEADSET) failed");
                    return;
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                r(this.f49711k, intentFilter);
                Log.d("AppRTCBluetoothManager", "HEADSET profile state: " + v(this.f49708h.getProfileConnectionState(1)));
                Log.d("AppRTCBluetoothManager", "Bluetooth proxy for headset profile has started");
                this.f49706f = d.HEADSET_UNAVAILABLE;
                Log.d("AppRTCBluetoothManager", "start done: BT state=" + this.f49706f);
            }
        }
    }

    public boolean t() {
        Log.d("AppRTCBluetoothManager", "startSco: BT state=" + this.f49706f + ", attempts: " + this.f49705e + ", SCO is on: " + p());
        if (this.f49705e >= 2) {
            Log.e("AppRTCBluetoothManager", "BT SCO connection fails - no more attempts");
            return false;
        } else if (this.f49706f != d.HEADSET_AVAILABLE) {
            Log.e("AppRTCBluetoothManager", "BT SCO connection fails - no headset available");
            return false;
        } else {
            Log.d("AppRTCBluetoothManager", "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED...");
            this.f49706f = d.SCO_CONNECTING;
            this.f49703c.startBluetoothSco();
            this.f49703c.setBluetoothScoOn(true);
            this.f49705e++;
            u();
            Log.d("AppRTCBluetoothManager", "startScoAudio done: BT state=" + this.f49706f + ", SCO is on: " + p());
            return true;
        }
    }

    public void w() {
        Log.d("AppRTCBluetoothManager", "stop: BT state=" + this.f49706f);
        if (this.f49708h == null) {
            return;
        }
        x();
        d dVar = this.f49706f;
        d dVar2 = d.UNINITIALIZED;
        if (dVar == dVar2) {
            return;
        }
        y(this.f49711k);
        j();
        BluetoothHeadset bluetoothHeadset = this.f49709i;
        if (bluetoothHeadset != null) {
            this.f49708h.closeProfileProxy(1, bluetoothHeadset);
            this.f49709i = null;
        }
        this.f49708h = null;
        this.f49710j = null;
        this.f49706f = dVar2;
        Log.d("AppRTCBluetoothManager", "stop done: BT state=" + this.f49706f);
    }

    public void x() {
        Log.d("AppRTCBluetoothManager", "stopScoAudio: BT state=" + this.f49706f + ", SCO is on: " + p());
        d dVar = this.f49706f;
        if (dVar == d.SCO_CONNECTING || dVar == d.SCO_CONNECTED) {
            j();
            this.f49703c.stopBluetoothSco();
            this.f49703c.setBluetoothScoOn(false);
            this.f49706f = d.SCO_DISCONNECTING;
            Log.d("AppRTCBluetoothManager", "stopScoAudio done: BT state=" + this.f49706f + ", SCO is on: " + p());
        }
    }

    protected void y(BroadcastReceiver broadcastReceiver) {
        this.f49701a.unregisterReceiver(broadcastReceiver);
    }
}