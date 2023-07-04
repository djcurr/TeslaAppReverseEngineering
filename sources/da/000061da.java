package com.teslamotors.plugins.ble;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import bu.a1;
import bu.a2;
import bu.p0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.teslamotors.plugins.ble.BLEService;
import com.teslamotors.plugins.ble.card.OemWalletProvider;
import gv.m;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import yu.z;
import zu.a0;
import zu.f0;
import zu.q;

/* loaded from: classes6.dex */
public class BLEService extends Service implements SensorEventListener {

    /* renamed from: g1 */
    private static final com.tesla.logging.g f22067g1 = com.tesla.logging.g.g("BLEService");

    /* renamed from: p1 */
    public static final ScanSettings f22068p1 = new ScanSettings.Builder().setScanMode(2).build();
    private SensorManager E;
    private Sensor F;
    private Long O;
    private final BroadcastReceiver P;
    public final hv.d Q;
    private final Runnable R;
    private final Runnable T;
    private final Runnable Y;

    /* renamed from: b1 */
    private final ScanCallback f22071b1;

    /* renamed from: e */
    private BluetoothManager f22074e;

    /* renamed from: f */
    private BluetoothAdapter f22075f;

    /* renamed from: g */
    private volatile h f22076g;

    /* renamed from: n */
    private boolean f22083n;

    /* renamed from: o */
    private nv.j f22084o;

    /* renamed from: t */
    private Map<String, Peripheral> f22087t;

    /* renamed from: w */
    private boolean f22088w;

    /* renamed from: x */
    private String f22089x;

    /* renamed from: y */
    private BluetoothLeScanner f22090y;

    /* renamed from: z */
    private boolean f22091z;

    /* renamed from: a */
    private final AtomicBoolean f22069a = new AtomicBoolean();

    /* renamed from: b */
    private boolean f22070b = false;

    /* renamed from: c */
    private boolean f22072c = true;

    /* renamed from: d */
    private long f22073d = 0;

    /* renamed from: h */
    private com.teslamotors.plugins.ble.d f22077h = new l();

    /* renamed from: i */
    private final Map<String, com.teslamotors.plugins.ble.d> f22078i = new HashMap();

    /* renamed from: j */
    private String f22079j = null;

    /* renamed from: k */
    private List<String> f22080k = null;

    /* renamed from: l */
    private String f22081l = "";

    /* renamed from: m */
    private long f22082m = 0;

    /* renamed from: p */
    private final HashSet<String> f22085p = new HashSet<>();

    /* renamed from: q */
    private final HashSet<String> f22086q = new HashSet<>();
    private final List<Messenger> A = Collections.synchronizedList(new ArrayList());
    final Messenger B = new Messenger(new g());
    private Set<String> C = com.teslamotors.plugins.ble.a.f22149h;
    private final TriggerEventListener G = new i();
    private boolean H = false;
    private boolean K = false;
    private a1 L = a1.IMU_STATE_NOT_CONFIGURED;

    /* loaded from: classes6.dex */
    class a extends CountDownTimer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, long j12) {
            super(j11, j12);
            BLEService.this = r1;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            BLEService.f22067g1.i("Stationary alarm triggered");
            if (BLEService.this.K) {
                BLEService.this.o0(new com.teslamotors.plugins.ble.g(bu.d.ACTIVITY_STATIONARY));
            }
            a1 a1Var = BLEService.this.L;
            a1 a1Var2 = a1.IMU_STATE_INACTIVITY;
            if (a1Var != a1Var2) {
                BLEService.this.L = a1Var2;
                BLEService.this.o0(new com.teslamotors.plugins.ble.h(a1Var2));
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            BLEService.f22067g1.i(String.format("Stationary alarm seconds remaining: %d", Long.valueOf(j11 / 1000)));
            if (BLEService.this.H || BLEService.this.F == null) {
                return;
            }
            BLEService bLEService = BLEService.this;
            bLEService.H = bLEService.E.requestTriggerSensor(BLEService.this.G, BLEService.this.F);
        }
    }

    /* loaded from: classes6.dex */
    class b extends BroadcastReceiver {
        b() {
            BLEService.this = r1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            BLEService.f22067g1.i("Received action: " + action);
            action.hashCode();
            char c11 = 65535;
            switch (action.hashCode()) {
                case -2128145023:
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1530327060:
                    if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1454123155:
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        c11 = 2;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    BLEService.f22067g1.i("Screen Off received");
                    return;
                case 1:
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    BLEService.this.f22076g.removeCallbacks(BLEService.this.T);
                    switch (intExtra) {
                        case 10:
                            BLEService.this.O = 0L;
                            mv.c.f39466a.d();
                            BLEService.this.f22076g.postDelayed(BLEService.this.T, 5000L);
                            break;
                        case 11:
                            BLEService.f22067g1.i("Bluetooth adapter is turning ON");
                            return;
                        case 12:
                            BLEService.f22067g1.i("Bluetooth adapter is ON");
                            BLEService.this.O = Long.valueOf(System.currentTimeMillis());
                            mv.c.f39466a.e();
                            BLEService.this.o0(new com.teslamotors.plugins.ble.e(Boolean.TRUE));
                            BLEService.this.f22076g.postDelayed(BLEService.this.T, 100L);
                            return;
                        case 13:
                            break;
                        default:
                            return;
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = intExtra == 10 ? "" : "turning ";
                    BLEService.f22067g1.i(String.format("Bluetooth adapter is %sOFF", objArr));
                    BLEService.this.F0(false, "bluetooth_unavailable");
                    BLEService.this.f22091z = false;
                    BLEService.this.K = false;
                    BLEService.this.o0(new com.teslamotors.plugins.ble.i());
                    return;
                case 2:
                    BLEService.f22067g1.i("Screen On received");
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes6.dex */
    class c implements Runnable {
        c() {
            BLEService.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tesla.logging.g gVar = BLEService.f22067g1;
            Object[] objArr = new Object[1];
            objArr[0] = BLEService.this.f22088w ? "saving" : "NOT saving";
            gVar.i(String.format("Timeout fired - stopping scan and %s results", objArr));
            BLEService bLEService = BLEService.this;
            bLEService.F0(bLEService.f22088w, null);
        }
    }

    /* loaded from: classes6.dex */
    class d implements Runnable {
        d() {
            BLEService.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context applicationContext = BLEService.this.getApplicationContext();
            if (BLEService.this.f22075f != null && !BLEService.this.e0()) {
                BLEService bLEService = BLEService.this;
                if (m.b(bLEService, bLEService.f22080k, BLEService.this.f22081l)) {
                    if (!BLEService.this.f22083n) {
                        gv.l.i(applicationContext);
                        return;
                    } else {
                        BLEService.f22067g1.i("BLE Service is in foreground. Notification Omitted");
                        return;
                    }
                }
            }
            try {
                gv.l.a(applicationContext);
            } catch (Exception e11) {
                BLEService.f22067g1.d("Failed to cancel BLE disabled notification", e11);
            }
        }
    }

    /* loaded from: classes6.dex */
    class e extends ScanCallback {
        e() {
            BLEService.this = r1;
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i11) {
            BLEService.f22067g1.i(String.format("Scan Failed: %s", f0.g(i11)));
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i11, ScanResult scanResult) {
            BluetoothDevice device = scanResult.getDevice();
            String address = device.getAddress();
            if (!BLEService.this.f22086q.contains(address)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    com.tesla.logging.g gVar = BLEService.f22067g1;
                    Object[] objArr = new Object[4];
                    objArr[0] = scanResult.getScanRecord().getDeviceName();
                    objArr[1] = scanResult.getDevice().getAddress();
                    objArr[2] = Integer.valueOf(scanResult.getRssi());
                    objArr[3] = scanResult.isConnectable() ? "connectable" : "non-connectable";
                    gVar.i(String.format("Scan result: %s - %s, RSSI: %s, %s", objArr));
                } else {
                    BLEService.f22067g1.i(String.format("Scan result: %s - %s, RSSI: %s", scanResult.getScanRecord().getDeviceName(), scanResult.getDevice().getAddress(), Integer.valueOf(scanResult.getRssi())));
                }
            }
            if (BLEService.this.f22086q.contains(address)) {
                return;
            }
            if (scanResult.getScanRecord() != null && scanResult.getScanRecord().getServiceUuids() != null) {
                BLEService.this.f22086q.add(address);
                for (ParcelUuid parcelUuid : scanResult.getScanRecord().getServiceUuids()) {
                    if (parcelUuid.equals(com.teslamotors.plugins.ble.a.f22144c)) {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (!a0.a(BLEService.this)) {
                            BLEService.f22067g1.i("BLUETOOTH_CONNECT permission is not granted, can not process scan result");
                            return;
                        }
                        BLEService.f22067g1.i(String.format("Scan result service: %s %s %s", device.getName(), device.getAddress(), parcelUuid));
                        if (BLEService.this.f22088w) {
                            try {
                                if (BLEService.this.P(scanResult) && !BLEService.this.f22087t.containsKey(address)) {
                                    BLEService.this.f22085p.add(address);
                                    if (Build.VERSION.SDK_INT >= 26 && !scanResult.isConnectable() && BLEService.this.f22085p.size() >= BLEService.this.C.size()) {
                                        BLEService.f22067g1.i("Peripheral is not connectable");
                                        BLEService.this.F0(false, "too_many_devices_connected");
                                    }
                                    BLEService.this.f22087t.put(address, new Peripheral(BLEService.this.Y(scanResult.getScanRecord().getDeviceName()), scanResult.getDevice(), null, BLEService.this.f22077h, BLEService.this.f22075f, Integer.valueOf(scanResult.getRssi()), BLEService.this.getApplicationContext()));
                                    if (BLEService.this.f22085p.size() >= BLEService.this.C.size()) {
                                        BLEService.f22067g1.i("Found all peripherals - stopping scan");
                                        BLEService.this.F0(true, null);
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                BLEService.f22067g1.d("error happens when add peripheral", th);
                            }
                        }
                    }
                }
                return;
            }
            BLEService.this.f22086q.add(address);
        }
    }

    /* loaded from: classes6.dex */
    static /* synthetic */ class f {

        /* renamed from: a */
        static final /* synthetic */ int[] f22097a;

        static {
            int[] iArr = new int[nv.c.values().length];
            f22097a = iArr;
            try {
                iArr[nv.c.ScanForPeripherals.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22097a[nv.c.GetStatus.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22097a[nv.c.SetVin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22097a[nv.c.SetAccountEmail.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22097a[nv.c.PromoteServiceToForeground.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22097a[nv.c.Register.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22097a[nv.c.Unregister.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22097a[nv.c.SetEventSubscriptionsReady.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22097a[nv.c.NFCGetPublicKeyBytes.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22097a[nv.c.NFCEncryptWithSharedSecret.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22097a[nv.c.NFCProtoMessage.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22097a[nv.c.ClearPeripherals.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22097a[nv.c.SendNullAuthResponse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22097a[nv.c.AuthResponse.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22097a[nv.c.SetConnectionBehaviorWhenUnauthorized.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22097a[nv.c.ResetCommandPeripheral.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22097a[nv.c.RequestMTU.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22097a[nv.c.StartMonitoringRSSI.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22097a[nv.c.StopMonitoringRSSI.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22097a[nv.c.UnlockCar.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22097a[nv.c.LockCar.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22097a[nv.c.OpenFrunk.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22097a[nv.c.OpenTrunk.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22097a[nv.c.OpenChargePort.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f22097a[nv.c.CloseChargePort.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22097a[nv.c.AddToWhitelist.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f22097a[nv.c.CancelExternalAuthenticate.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f22097a[nv.c.GetWhiteslistUpdate.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f22097a[nv.c.GetEpochSessionInfo.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f22097a[nv.c.RemoveFromWhitelist.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f22097a[nv.c.SendBLEData.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f22097a[nv.c.SendBLEDataLegacy.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f22097a[nv.c.GetTokenForKey.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f22097a[nv.c.OpenDoor.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f22097a[nv.c.OpenAllDoors.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f22097a[nv.c.CloseDoor.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f22097a[nv.c.CloseDoorsAndLock.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f22097a[nv.c.WidgetFetchStatus.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f22097a[nv.c.UpdateBackgroundServicePermission.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f22097a[nv.c.SendReportServiceRequest.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
        }
    }

    /* loaded from: classes6.dex */
    class g extends Handler {
        g() {
            BLEService.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte b11;
            List<Pair<String, String>> j11;
            p0 p0Var = null;
            switch (f.f22097a[nv.c.get(message.what).ordinal()]) {
                case 1:
                    BLEService.this.C = message.arg2 > 1 ? com.teslamotors.plugins.ble.a.f22150i : com.teslamotors.plugins.ble.a.f22149h;
                    BLEService.this.p0((String) message.getData().get(nv.c.ScanForPeripherals.getKey()), message.arg1 > 0);
                    return;
                case 2:
                    BLEService.this.x0(true);
                    return;
                case 3:
                    Bundle data = message.getData();
                    nv.c cVar = nv.c.SetVin;
                    ArrayList<String> stringArrayList = data.getStringArrayList(cVar.getKey());
                    BLEService.this.B0(stringArrayList.get(0), stringArrayList.get(1), message.getData().getStringArrayList(cVar.getKey2()));
                    return;
                case 4:
                    BLEService.this.y0(message.getData().getString(nv.c.SetAccountEmail.getKey()));
                    return;
                case 5:
                    BLEService.this.l0("IncomingHandler: PromoteServiceToForeground");
                    return;
                case 6:
                    BLEService.this.m0(message.replyTo);
                    return;
                case 7:
                    BLEService.this.G0(message.replyTo);
                    return;
                case 8:
                    BLEService.this.A0(Boolean.valueOf(message.getData().getBoolean(nv.c.SetEventSubscriptionsReady.getKey())));
                    return;
                case 9:
                    Message obtain = Message.obtain();
                    nv.c cVar2 = nv.c.NFCGetPublicKeyBytesInfo;
                    obtain.what = cVar2.getWhat();
                    Bundle bundle = new Bundle();
                    nv.f r11 = BLEService.this.f22077h.r();
                    if (r11 != null) {
                        bundle.putParcelable(cVar2.getKey(), r11);
                    } else {
                        BLEService.f22067g1.i("on receiving NFCGetPublicKeyBytes, Pubkey is not ready yet");
                    }
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                        return;
                    } catch (RemoteException unused) {
                        BLEService.f22067g1.i("Failed to send message to NFC client");
                        return;
                    }
                case 10:
                    ArrayList<String> stringArrayList2 = message.getData().getStringArrayList(nv.c.NFCEncryptWithSharedSecret.getKey());
                    byte[] a11 = f0.a(stringArrayList2.get(0));
                    byte[] a12 = f0.a(stringArrayList2.get(1));
                    Message obtain2 = Message.obtain();
                    nv.c cVar3 = nv.c.NFCEncryptWithSharedSecretResponse;
                    obtain2.what = cVar3.getWhat();
                    Bundle bundle2 = new Bundle();
                    nv.b l11 = BLEService.this.f22077h.l(a11, a12);
                    if (l11 != null) {
                        bundle2.putParcelable(cVar3.getKey(), l11);
                    } else {
                        BLEService.f22067g1.i("on receiving NFCEncryptWithSharedSecret, shared secret is not ready yet");
                    }
                    obtain2.setData(bundle2);
                    try {
                        message.replyTo.send(obtain2);
                    } catch (RemoteException unused2) {
                        BLEService.f22067g1.i("Failed to send message to client; main app likely not running");
                    }
                    z p11 = z.p(BLEService.this.getApplicationContext());
                    String D = p11.D(BLEService.this.f22079j);
                    if (D != null) {
                        BLEService.f22067g1.i("Currently Selected VIN : " + f0.f(BLEService.this.f22079j));
                        if (D.equalsIgnoreCase(stringArrayList2.get(1))) {
                            BLEService.f22067g1.i("Not switching VIN");
                            b11 = 0;
                            if (b11 != 0 || (j11 = p11.j()) == null) {
                                return;
                            }
                            BLEService.f22067g1.i("Looking for the key" + stringArrayList2.get(1));
                            BLEService.f22067g1.i("Vehicles Public key Found ::::");
                            for (int i11 = 0; i11 < j11.size(); i11++) {
                                String str = TextUtils.split((String) j11.get(i11).first, "VEHICLE_BLE_PUBLIC_KEY_")[1];
                                BLEService.f22067g1.i("VIN: " + f0.f(str));
                                if (Arrays.equals(f0.a((String) j11.get(i11).second), a12)) {
                                    BLEService.f22067g1.i("Matching vehicle Found" + f0.f(str));
                                    BLEService.this.q0(str);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    b11 = 1;
                    if (b11 != 0) {
                        return;
                    }
                    return;
                case 11:
                    try {
                        p0Var = p0.R.decode(message.getData().getByteArray(nv.c.NFCProtoMessage.getKey()));
                    } catch (IOException e11) {
                        BLEService.f22067g1.i(String.format("Failed to deserialize message: %s", e11));
                    }
                    if (p0Var != null) {
                        a2 r12 = p0Var.r();
                        if (r12.c().z() > 0) {
                            String B = r12.c().B(StandardCharsets.UTF_8);
                            BLEService.f22067g1.i("VIN through NFC Proto message: " + f0.f(B));
                            BLEService.f22067g1.i("Currently Selected VIN : " + f0.f(BLEService.this.f22079j));
                            if (BLEService.this.f22079j.equalsIgnoreCase(B)) {
                                BLEService.f22067g1.i("Proto message ignored, Not Switching VIN");
                                return;
                            }
                            BLEService.f22067g1.i("Using Proto message to switch VIN");
                            BLEService.this.q0(B);
                            return;
                        }
                        return;
                    }
                    return;
                case 12:
                    BLEService.this.F0(false, null);
                    String string = message.getData().getString(nv.c.ClearPeripherals.getKey());
                    if (!BLEService.this.f22078i.containsKey(string)) {
                        BLEService.this.u0(nv.c.ClearPeripheralsResult, new nv.a(lv.b.ERROR, "VEHICLE_CONTROLLER_NOT_FOUND", -1));
                        return;
                    } else {
                        ((com.teslamotors.plugins.ble.d) BLEService.this.f22078i.get(string)).j(message);
                        return;
                    }
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    BLEService.this.f22077h.j(message);
                    return;
                case 38:
                    BLEService.this.r0();
                    return;
                case 39:
                    boolean z11 = message.getData().getBoolean("svc-background-permission", !q.a());
                    BLEService.this.f22069a.set(z11);
                    BLEService.f22067g1.i("received UpdateBackgroundServicePermission message, resetting permission to " + z11);
                    BLEService.this.I0(z11);
                    return;
                case 40:
                    try {
                        new qu.h(BLEService.this.getApplicationContext()).d(wt.c.f56177d.decode(message.getData().getByteArray(nv.c.SendReportServiceRequest.getKey())));
                        return;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        return;
                    }
                default:
                    super.handleMessage(message);
                    throw new RuntimeException(String.format("Unsupported message: %s", nv.c.get(message.what)));
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends Handler {
        public h(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.tesla.logging.g gVar = BLEService.f22067g1;
            gVar.i("Handling msg:" + message);
        }
    }

    /* loaded from: classes6.dex */
    class i extends TriggerEventListener {
        i() {
            BLEService.this = r1;
        }

        @Override // android.hardware.TriggerEventListener
        public void onTrigger(TriggerEvent triggerEvent) {
            BLEService.i0("SignificantMotionListener", "Significant Motion detected !");
            if (BLEService.this.K) {
                BLEService.this.o0(new com.teslamotors.plugins.ble.g(bu.d.ACTIVITY_SIGNIFICANT_MOTION));
            }
            BLEService bLEService = BLEService.this;
            bLEService.H = bLEService.E.requestTriggerSensor(BLEService.this.G, BLEService.this.F);
        }
    }

    public BLEService() {
        new a(300000L, 60000L);
        this.O = 0L;
        this.P = new b();
        this.Q = new hv.d();
        this.R = new c();
        this.T = new d();
        this.Y = new Runnable() { // from class: gv.f
            {
                BLEService.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BLEService.a(BLEService.this);
            }
        };
        this.f22071b1 = new e();
    }

    public void A0(Boolean bool) {
        boolean z11 = !this.f22070b && bool.booleanValue();
        this.f22070b = bool.booleanValue();
        if (z11) {
            x0(true);
        }
    }

    public void B0(String str, String str2, List<String> list) {
        if (str == null) {
            str = "";
        }
        z p11 = z.p(getApplicationContext());
        K0(str, list);
        if (str.equals(this.f22079j) && this.f22077h.d().equals(str)) {
            if (str2 == null || str2.equals(p11.C(str))) {
                return;
            }
            p11.S(str, str2);
            J0();
            return;
        }
        f22067g1.i(String.format("Setting VIN from %s to %s", f0.f(this.f22079j), f0.f(str)));
        p11.S(str, str2);
        if (str.length() > 0) {
            c0();
            this.f22077h.u(true);
        }
    }

    private void C0(String str, Notification notification) {
        if (str == null) {
            str = "call startForeground along with Service.startForegroundService";
        }
        com.tesla.logging.g gVar = f22067g1;
        gVar.i("Promoting service to foreground with reason: " + str);
        if (notification == null) {
            try {
                notification = V();
            } catch (Exception e11) {
                com.tesla.logging.g gVar2 = f22067g1;
                gVar2.c("Stopping service caused by: " + e11.getMessage());
                stopSelf();
                return;
            }
        }
        startForeground(333, notification);
        this.f22083n = true;
    }

    private void D0() {
        ku.e.d().j(tt.l.ANDROID_BLESERVICE_LAUNCH_TIME, Collections.emptyList());
    }

    private void E0(String str) {
        if (this.f22072c) {
            this.f22072c = false;
            ArrayList arrayList = new ArrayList();
            arrayList.add(ku.a.c("action", str));
            ku.e.d().e(tt.l.ANDROID_BLESERVICE_LAUNCH_TIME, arrayList, Collections.emptyList());
        }
    }

    public void F0(boolean z11, String str) {
        this.f22076g.removeCallbacks(this.R);
        if (this.f22091z) {
            this.f22091z = false;
            if (this.f22090y != null && e0()) {
                com.tesla.logging.g gVar = f22067g1;
                gVar.i(String.format("Stopping pairing scan with %d peripherals", Integer.valueOf(this.f22085p.size())));
                if (a0.c(this)) {
                    this.f22090y.stopScan(this.f22071b1);
                } else {
                    gVar.i("BLUETOOTH_SCAN permission is not granted,failed to stop scan");
                }
                if (z11 && this.f22085p.size() > 0) {
                    this.f22077h.disconnect();
                    this.f22077h.a(this.f22087t);
                    this.f22077h.k();
                }
            }
            w0(str);
        }
    }

    public void G0(Messenger messenger) {
        com.tesla.logging.g gVar = f22067g1;
        gVar.i("Unregistering " + messenger);
        this.A.remove(messenger);
    }

    private void H0(String str) {
        jv.a a11 = jv.a.a();
        if (a11.isSupported(this)) {
            for (String str2 : z.p(this).u(str, this.f22081l)) {
                a11.c(str2.substring(2), str, this);
            }
        }
    }

    private void J0() {
        if (com.teslamotors.plugins.ble.a.f22142a && m.b(this, this.f22080k, this.f22081l) && this.f22083n) {
            ((NotificationManager) getSystemService("notification")).notify(333, V());
        }
    }

    private void K0(String str, List<String> list) {
        if (list == null) {
            return;
        }
        for (int size = this.f22080k.size() - 1; size >= 0; size--) {
            String str2 = this.f22080k.get(size);
            if (!list.contains(str2) && this.f22078i.containsKey(str2)) {
                com.teslamotors.plugins.ble.d remove = this.f22078i.remove(str2);
                this.f22080k.remove(size);
                H0(str2);
                if (remove != null) {
                    remove.disconnect();
                }
            }
        }
        int indexOf = this.f22080k.indexOf(str);
        if (!str.equals("")) {
            if (indexOf == -1) {
                f22067g1.i(String.format("Adding %s to top of recently selected VINs", f0.f(str)));
                this.f22080k.add(0, str);
            } else if (indexOf > 0) {
                f22067g1.i(String.format("Promoting %s to top of recently selected VINs", f0.f(str)));
                this.f22080k.remove(indexOf);
                this.f22080k.add(0, str);
            }
        }
        if (this.f22080k.size() > 4) {
            List<String> list2 = this.f22080k;
            String remove2 = list2.remove(list2.size() - 1);
            com.teslamotors.plugins.ble.d remove3 = this.f22078i.remove(remove2);
            if (remove3 != null) {
                remove3.disconnect();
            }
            f22067g1.i(String.format("Removed %s from tail of recently selected VINs", f0.f(remove2)));
        }
        f22067g1.i(String.format("Updated recently selected VINs: %s", this.f22080k));
        z.p(getApplicationContext()).P(this.f22080k);
    }

    public boolean P(ScanResult scanResult) {
        String str;
        if (scanResult.getScanRecord() == null || scanResult.getScanRecord().getDeviceName() == null) {
            return false;
        }
        String deviceName = scanResult.getScanRecord().getDeviceName();
        return deviceName.startsWith("S") && (str = this.f22089x) != null && deviceName.contains(str) && this.C.contains(Y(deviceName));
    }

    private boolean Q(boolean z11) {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f22073d;
        if (!com.tesla.logging.f.c(this) && this.f22073d != 0 && j11 < AbstractComponentTracker.LINGERING_TIMEOUT) {
            f22067g1.i(String.format("Time interval of two start commands is too close within %d ms", Long.valueOf(j11)));
            E0("onStartCommand gate");
            if (z11) {
                C0("from onStartCommand: Intent extra: `EXTRA_SERVICE_IN_FOREGROUND` was true. Service was started as foreground service.", null);
            }
            return true;
        }
        this.f22073d = currentTimeMillis;
        return false;
    }

    private boolean R() {
        if (a0.b(this)) {
            return true;
        }
        f22067g1.i("onStartCommand: BLUETOOTH_CONNECT or BLUETOOTH_SCAN permission is not granted. Destroying service");
        C0("checkPermission", gv.l.f(this));
        stopForeground(true);
        stopSelf();
        return false;
    }

    private String U(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.update(str.getBytes());
            return f0.b(messageDigest.digest()).substring(0, 16);
        } catch (Exception e11) {
            f22067g1.d("Failed to get VIN identifier", e11);
            return null;
        }
    }

    private Notification V() {
        return gv.l.d(this, this.f22081l, this.f22079j, this.f22077h, this.f22078i, this.f22084o, this.f22080k, this.f22075f).b();
    }

    public static int X(z zVar) {
        at.h B = zVar.B();
        if (B != null) {
            return B.c();
        }
        return 1;
    }

    public String Y(String str) {
        return (str == null || str.length() <= 0) ? "X" : str.substring(str.length() - 1);
    }

    private List<String> Z() {
        List<String> emptyList;
        List<String> y11 = z.p(getApplicationContext()).y();
        if (!y11.isEmpty()) {
            return new ArrayList(y11);
        }
        String A = z.p(getApplicationContext()).A();
        if (A != null && !A.isEmpty()) {
            emptyList = Collections.singletonList(A);
        } else {
            emptyList = Collections.emptyList();
        }
        z.p(getApplicationContext()).P(emptyList);
        return new ArrayList(emptyList);
    }

    public static /* synthetic */ void a(BLEService bLEService) {
        bLEService.h0();
    }

    private void a0() {
        if (this.f22074e == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
            this.f22074e = bluetoothManager;
            if (bluetoothManager == null) {
                f22067g1.i("Unable to initialize BluetoothManager.");
            }
        }
        BluetoothAdapter adapter = this.f22074e.getAdapter();
        this.f22075f = adapter;
        if (adapter == null) {
            f22067g1.i("Unable to obtain a BluetoothAdapter.");
        }
        mv.c.f39466a.b(this.f22075f);
    }

    private void b0(Context context) {
        z p11 = z.p(this);
        String A = p11.A();
        ArrayList arrayList = new ArrayList(p11.y());
        String h11 = p11.h();
        String C = p11.C(A);
        y0(h11);
        B0(A, C, arrayList);
        d0();
        OemWalletProvider supportedProvider = OemWalletProvider.getSupportedProvider(this);
        if (supportedProvider != null) {
            supportedProvider.onBLEServiceInitialized(A, context);
        }
    }

    private void c0() {
        boolean z11;
        this.f22080k = Z();
        String h11 = z.p(getApplicationContext()).h();
        this.f22081l = h11;
        if (h11 == null || h11.equals("")) {
            f22067g1.i("Skipping initialization due to missing account email");
            z11 = true;
        } else {
            z11 = false;
        }
        List<String> list = this.f22080k;
        if (list == null || list.size() == 0) {
            f22067g1.i("Skipping initialization due to missing vins");
            z11 = true;
        }
        if (z11) {
            this.f22077h = new l();
            return;
        }
        String str = this.f22080k.get(0);
        this.f22079j = str;
        f22067g1.i(String.format("Initializing with valid login and VIN %s", f0.f(str)));
        a0();
        for (String str2 : this.f22080k) {
            if (this.f22078i.containsKey(str2)) {
                f22067g1.i(String.format("BLE controller already exists for %s", f0.f(str2)));
            } else {
                f22067g1.i(String.format("creating new ble controller for vin %s", f0.f(str2)));
                this.f22078i.put(str2, new j(str2, this.f22081l, getApplicationContext(), this.f22075f, this));
            }
        }
        f22067g1.i(String.format("initializing with %d VINs", Integer.valueOf(this.f22080k.size())));
        if (this.f22080k.size() > 0) {
            this.f22077h = this.f22078i.get(this.f22080k.get(0));
        } else {
            this.f22077h = new l();
        }
        if (m.b(this, this.f22080k, this.f22081l)) {
            n0();
            l0("from initializePendingLogin: shouldRunInForeground returned true");
            return;
        }
        S("from initializePendingLogin: shouldRunInForeground returned false");
    }

    private void d0() {
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        this.E = sensorManager;
        if (sensorManager == null) {
            f22067g1.i("could not initialize sensor manager");
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(17);
        this.F = defaultSensor;
        if (defaultSensor != null) {
            if (defaultSensor.getReportingMode() != 2) {
                this.H = this.E.registerListener(this, this.F, 3);
                i0("SignificantMotionListener", String.format("SignificantMotionListener REPORTING_MODE: %d", Integer.valueOf(this.F.getReportingMode())));
            } else {
                this.H = this.E.requestTriggerSensor(this.G, this.F);
                i0("SignificantMotionListener", "REPORTING_MODE_ONE_SHOT");
            }
        }
        this.Q.d(getApplicationContext());
    }

    public /* synthetic */ void h0() {
        x0(false);
    }

    public static void i0(String str, String str2) {
        f22067g1.n(str).i(str2);
    }

    public static void j0(String str, String str2, Throwable th2) {
        com.tesla.logging.g n11 = f22067g1.n(str);
        if (th2 == null) {
            th2 = new Throwable(str2);
        }
        n11.d(str2, th2);
    }

    public static nv.e k0(Map<String, Peripheral> map) {
        nv.e eVar = new nv.e();
        for (Map.Entry<String, Peripheral> entry : map.entrySet()) {
            Peripheral value = entry.getValue();
            eVar.f41898a.put(value.getPosition(), new nv.d(value));
        }
        return eVar;
    }

    public void m0(Messenger messenger) {
        this.A.add(messenger);
        Message obtain = Message.obtain();
        obtain.what = nv.c.RegisterComplete.getWhat();
        try {
            messenger.send(obtain);
            com.tesla.logging.g gVar = f22067g1;
            gVar.i("Registering " + messenger);
        } catch (RemoteException unused) {
            f22067g1.i("Failed to send message to client. Main app likely not running");
        }
    }

    private void n0() {
        jv.a a11 = jv.a.a();
        if (a11.isSupported(this)) {
            z p11 = z.p(this);
            for (String str : this.f22080k) {
                for (String str2 : p11.u(str, this.f22081l)) {
                    a11.d(str2.substring(2), str, this);
                }
            }
        }
    }

    public <T> void o0(k<T> kVar) {
        for (Map.Entry<String, com.teslamotors.plugins.ble.d> entry : this.f22078i.entrySet()) {
            kVar.a(entry.getValue());
        }
    }

    public void p0(String str, boolean z11) {
        this.f22089x = U(str);
        this.f22085p.clear();
        this.f22086q.clear();
        this.f22088w = z11;
        this.f22087t = new HashMap();
        String str2 = androidx.core.content.b.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0 ? "scanning_missing_permissions" : null;
        if (!a0.c(this)) {
            str2 = "scanning_missing_permissions_nearby_devices";
        }
        a0();
        String str3 = "bluetooth_unsupported";
        if (this.f22074e == null) {
            f22067g1.i("Unable to obtain a BluetoothManager.");
            str2 = "bluetooth_unsupported";
        }
        BluetoothAdapter adapter = this.f22074e.getAdapter();
        if (adapter == null) {
            f22067g1.i("Unable to obtain a BluetoothAdapter.");
            str2 = "bluetooth_unsupported";
        } else if (!e0()) {
            str2 = "bluetooth_unavailable";
        }
        if (adapter != null) {
            BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
            this.f22090y = bluetoothLeScanner;
            if (bluetoothLeScanner == null) {
                f22067g1.i("Unable to obtain a Bluetooth LE Scanner.");
            } else {
                str3 = str2;
            }
            str2 = this.f22091z ? "already_scanning" : str3;
            if (str2 == null) {
                f22067g1.i("Starting Scan");
                try {
                    this.f22091z = true;
                    this.f22090y.startScan((List<ScanFilter>) null, f22068p1, this.f22071b1);
                    this.f22076g.postDelayed(this.R, AbstractComponentTracker.LINGERING_TIMEOUT);
                } catch (Exception e11) {
                    this.f22091z = false;
                    f22067g1.d("Failed to start scan", e11);
                    str2 = "scanning_failure";
                }
            }
        }
        if (str2 != null) {
            w0(str2);
        }
    }

    public void q0(String str) {
        z p11 = z.p(getApplicationContext());
        if (p11.Q(str)) {
            B0(str, p11.C(str), this.f22080k);
            u0(nv.c.SwitchProductMessage, new nv.g(str));
            return;
        }
        f22067g1.i("VIN Not found in the Product list.");
    }

    public void r0() {
        for (com.teslamotors.plugins.ble.d dVar : this.f22078i.values()) {
            if (dVar instanceof j) {
                nv.j jVar = new nv.j();
                jVar.f41926w = e0();
                dVar.h(jVar, false);
                nv.e eVar = jVar.f41929z;
                if (eVar != null && eVar.f41898a.size() > 0) {
                    try {
                        Intent intent = new Intent(this, Class.forName("com.tesla.widget.VehicleStatusWidget"));
                        intent.putExtra("com.teslamotors.tesla.action.ACTION_VEHICLE_BLE_UPDATE_KEY", jVar);
                        intent.setAction("com.teslamotors.tesla.action.ACTION_VEHICLE_BLE_UPDATE");
                        sendBroadcast(intent);
                    } catch (ClassNotFoundException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }

    private void t0(nv.c cVar, Bundle bundle) {
        for (int size = this.A.size() - 1; size >= 0; size--) {
            Message obtain = Message.obtain();
            obtain.what = cVar.getWhat();
            obtain.setData(bundle);
            try {
                this.A.get(size).send(obtain);
            } catch (RemoteException unused) {
                f22067g1.i("Failed to send message to client. Main app likely not running");
                if (this.A.size() > size) {
                    try {
                        this.A.remove(size);
                    } catch (Exception e11) {
                        f22067g1.d("Exception thrown removing messenger from clients", e11);
                    }
                }
            }
        }
    }

    private void w0(String str) {
        u0(nv.c.ScanForPeripheralsResult, new nv.i(str == null, str, this.f22085p.size(), k0(this.f22087t)));
    }

    public void y0(String str) {
        if (str == null) {
            str = "";
        }
        String str2 = this.f22081l;
        if (str2 == null || !str2.equals(str)) {
            com.tesla.logging.g gVar = f22067g1;
            gVar.i(String.format("Changing email from %s to %s", f0.e(this.f22081l), f0.e(str)));
            if (!str.equalsIgnoreCase(this.f22081l)) {
                this.f22077h.disconnect();
                this.f22082m = 0L;
                this.f22081l = str;
            }
            if (!m.b(this, this.f22080k, this.f22081l)) {
                gVar.i("No VIN, non-applicable VIN, or no user - stopping BLE Service");
                C0("setAccountEmail", gv.l.f(this));
                S("from setAccountEmail: shouldRunInForeground returned false");
                stopSelf();
            }
            c0();
        }
    }

    public void I0(boolean z11) {
        Context applicationContext = getApplicationContext();
        int i11 = z11 ? 1 : 2;
        com.tesla.logging.g gVar = f22067g1;
        gVar.i("resetting boot receiver flag to " + z11);
        applicationContext.getPackageManager().setComponentEnabledSetting(new ComponentName(applicationContext, BLEBootReceiver.class), i11, 1);
    }

    public void S(String str) {
        com.tesla.logging.g gVar = f22067g1;
        gVar.i("Demoting service from foreground! Reason:" + str + ", `isForegroundService`=" + this.f22083n);
        this.f22083n = false;
        stopForeground(true);
    }

    public Long T() {
        return this.O;
    }

    public a1 W() {
        return this.L;
    }

    public boolean e0() {
        return mv.c.f39466a.a(this.f22075f);
    }

    public boolean f0() {
        return this.f22091z;
    }

    public boolean g0() {
        if (q.a()) {
            return this.f22069a.get();
        }
        return true;
    }

    public void l0(String str) {
        boolean b11 = m.b(this, this.f22080k, this.f22081l);
        com.tesla.logging.g gVar = f22067g1;
        gVar.i("promoteToForegroundIfNeeded called with reason: " + str);
        gVar.i("shouldRunInForeground(this, mRecentlySelectedVins, mAccountEmail) =>" + b11);
        if (com.teslamotors.plugins.ble.a.f22142a && b11) {
            C0("shouldRunInForeground returned true.", null);
            return;
        }
        gVar.i("NOT promoting service to foreground. shouldRunInForeground=" + b11);
        S(str);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
        com.tesla.logging.g gVar = f22067g1;
        gVar.i("Sensor Accuracy changed ! " + i11);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.B.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (R()) {
            D0();
            this.f22069a.set(Boolean.parseBoolean(ct.i.i().g("svc-background-permission")));
            nu.j.b(this);
            z p11 = z.p(getApplicationContext());
            p11.H();
            this.f22076g = new h(Looper.getMainLooper());
            this.f22081l = p11.h();
            f22067g1.i("onCreate");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            registerReceiver(this.P, intentFilter);
            gv.g.f(getApplicationContext());
            c0();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        try {
            unregisterReceiver(this.P);
        } catch (Exception unused) {
            f22067g1.i("broadcast wasn't registered.");
        }
        this.f22077h.disconnect();
        if (this.f22076g != null) {
            this.f22076g.removeCallbacksAndMessages(null);
        }
        x0(true);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 29) {
            f22067g1.i("onSensorChanged: stationary detected !");
        }
        if (sensorEvent.sensor.getType() == 30) {
            f22067g1.i("onSensorChanged: Motion detected !");
        }
        if (sensorEvent.sensor.getType() == 17) {
            f22067g1.i("onSensorChanged: Significant motion detected !");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        String str;
        if (!R()) {
            E0("permission not granted");
            return 2;
        }
        com.tesla.logging.g gVar = f22067g1;
        gVar.i("onStartCommand");
        boolean z11 = false;
        if (intent != null) {
            str = intent.getAction();
            boolean booleanExtra = intent.getBooleanExtra("SERVICE_IN_FOREGROUND", false);
            if (!"com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION".equalsIgnoreCase(str) && !"com.teslamotors.plugins.ble.action.RESTART_BG_SCAN".equalsIgnoreCase(str) && !"com.teslamotors.plugins.ble.action.OEM_WAKE_UP_ON_CAR_FOUND".equalsIgnoreCase(str)) {
                if ("com.teslamotors.ble.action.COMMAND".equalsIgnoreCase(str)) {
                    Message obtain = Message.obtain();
                    int intExtra = intent.getIntExtra("command_id", nv.c.GetStatus.getWhat());
                    obtain.what = intExtra;
                    obtain.arg1 = -intExtra;
                    this.f22077h.j(obtain);
                } else if (intent.getIntExtra("StartType", 0) == 1) {
                    gVar.i("[MiBeacon] MiBeacon start triggered");
                    if (Q(booleanExtra)) {
                        if (g0()) {
                            return super.onStartCommand(intent, i11, i12);
                        }
                        return 2;
                    }
                    b0(getApplicationContext());
                } else if (intent.getStringExtra("BleParamsOrigin") != null) {
                    gVar.i("[HonorWallet] HonorWallet Ble wake up triggered");
                    if (Q(booleanExtra)) {
                        if (g0()) {
                            return super.onStartCommand(intent, i11, i12);
                        }
                        return 2;
                    }
                    b0(getApplicationContext());
                } else {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("VINS");
                    String stringExtra = intent.getStringExtra("ACCOUNT_EMAIL");
                    String stringExtra2 = intent.getStringExtra("VEHICLE_NAME");
                    String stringExtra3 = intent.getStringExtra("SELECTED_VIN");
                    if ((stringExtra3 == null || stringExtra3.isEmpty()) && stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                        stringExtra3 = stringArrayListExtra.get(0);
                    }
                    B0(stringExtra3, stringExtra2, stringArrayListExtra);
                    y0(stringExtra);
                    d0();
                }
            }
            z11 = booleanExtra;
        } else {
            str = null;
        }
        if (!"com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION".equalsIgnoreCase(str) && !"com.teslamotors.plugins.ble.action.OEM_WAKE_UP_ON_CAR_FOUND".equalsIgnoreCase(str)) {
            if ("com.teslamotors.plugins.ble.action.RESTART_BG_SCAN".equalsIgnoreCase(str)) {
                o0(new com.teslamotors.plugins.ble.f());
            }
        } else {
            o0(new com.teslamotors.plugins.ble.e(Boolean.FALSE));
            gv.g.f(getApplicationContext());
        }
        x0(true);
        if (intent == null) {
            str = "no-intent";
        } else if (str == null) {
            str = "no-action";
        }
        E0(str);
        if (z11) {
            C0("from onStartCommand: Intent extra: `EXTRA_SERVICE_IN_FOREGROUND` was true. Service was started as foreground service.", null);
        } else if (m.b(this, this.f22080k, this.f22081l)) {
            l0("from onStartCommand: shouldRunInForeground returned true.");
        } else {
            S("from onStartCommand: shouldRunInForeground returned false");
        }
        if (g0()) {
            return super.onStartCommand(intent, i11, i12);
        }
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        if (g0()) {
            return;
        }
        C0("onTaskRemoved", gv.l.f(this));
        stopForeground(true);
        stopSelf();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public synchronized void s0(String str) {
        nv.h hVar = new nv.h();
        hVar.f41902a = str;
        hVar.f41903b = this.f22079j;
        u0(nv.c.VehicleEventMessage, hVar);
    }

    public void u0(nv.c cVar, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        if (parcelable != null) {
            bundle.putParcelable(cVar.getKey(), parcelable);
        }
        t0(cVar, bundle);
    }

    public void v0(nv.c cVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        if (bArr != null) {
            bundle.putByteArray(cVar.getKey(), bArr);
        }
        t0(cVar, bundle);
    }

    public synchronized void x0(boolean z11) {
        long currentTimeMillis = System.currentTimeMillis() - this.f22082m;
        if (!z11 && currentTimeMillis < 500) {
            this.f22076g.removeCallbacks(this.Y);
            this.f22076g.postDelayed(this.Y, 500 - currentTimeMillis);
            return;
        }
        this.f22082m = System.currentTimeMillis();
        nv.j jVar = new nv.j();
        this.f22084o = jVar;
        jVar.f41926w = e0();
        this.f22077h.h(this.f22084o, true);
        J0();
        u0(nv.c.VehicleStatusMessage, this.f22084o);
        r0();
    }

    public void z0(boolean z11) {
        this.K = z11;
    }
}