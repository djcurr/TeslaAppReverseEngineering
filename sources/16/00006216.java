package com.teslamotors.plugins.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bu.a1;
import bu.c1;
import bu.c4;
import bu.d0;
import bu.d4;
import bu.e0;
import bu.g2;
import bu.i0;
import bu.j3;
import bu.n;
import bu.p0;
import bu.r0;
import bu.w3;
import bu.x0;
import bu.z0;
import ch.qos.logback.classic.spi.CallerData;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.teslamotors.plugins.ble.Peripheral;
import gv.m;
import gv.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import yu.z;
import zu.a0;
import zu.f0;

/* loaded from: classes6.dex */
public class j implements com.teslamotors.plugins.ble.d {

    /* renamed from: a  reason: collision with root package name */
    private final BLEService f22218a;

    /* renamed from: d  reason: collision with root package name */
    private final String f22221d;

    /* renamed from: e  reason: collision with root package name */
    private final q f22222e;

    /* renamed from: j  reason: collision with root package name */
    private final Context f22227j;

    /* renamed from: k  reason: collision with root package name */
    private final BluetoothAdapter f22228k;

    /* renamed from: l  reason: collision with root package name */
    private final String f22229l;

    /* renamed from: m  reason: collision with root package name */
    private lv.f f22230m;

    /* renamed from: o  reason: collision with root package name */
    private volatile Handler f22232o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f22233p;

    /* renamed from: q  reason: collision with root package name */
    private BluetoothLeScanner f22234q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f22235r;

    /* renamed from: t  reason: collision with root package name */
    private boolean f22237t;

    /* renamed from: u  reason: collision with root package name */
    private long f22238u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f22239v;

    /* renamed from: f  reason: collision with root package name */
    private ConcurrentHashMap<String, Peripheral> f22223f = new ConcurrentHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private Set<Peripheral> f22224g = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: n  reason: collision with root package name */
    private List<String> f22231n = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    private Long f22241x = 0L;

    /* renamed from: y  reason: collision with root package name */
    private final ScanCallback f22242y = new c();

    /* renamed from: s  reason: collision with root package name */
    private byte[] f22236s = null;

    /* renamed from: w  reason: collision with root package name */
    private String f22240w = null;

    /* renamed from: h  reason: collision with root package name */
    private volatile Peripheral f22225h = null;

    /* renamed from: i  reason: collision with root package name */
    private volatile Peripheral f22226i = null;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f22219b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f22220c = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Peripheral f22243a;

        a(Peripheral peripheral) {
            this.f22243a = peripheral;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.w0(this.f22243a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            if (j.this.f22218a.f0() || j.this.f22233p || !m.c(j.this.f22227j, j.this.f22221d, j.this.f22229l)) {
                return;
            }
            j jVar = j.this;
            jVar.f22234q = jVar.f22228k == null ? null : j.this.f22228k.getBluetoothLeScanner();
            if (j.this.f22234q == null) {
                j.this.z("Failed to BG Scan - Unable to obtain a Bluetooth LE Scanner/Adapter/Manager");
            } else if (j.this.i0()) {
                j.this.z("Skipping BG Scan - already has connected peripherals");
            } else if (j.this.g0() && j.this.v() == lv.e.CONNECTED) {
                j.this.z("Skipping BG Scan - already has command peripheral");
            } else if (!j.this.j0()) {
                j.this.z("Skipping BG Scan - adapter not enabled");
            } else if (!j.this.f22231n.isEmpty()) {
                try {
                    z11 = j.this.f22228k.isOffloadedFilteringSupported();
                } catch (Exception unused) {
                    z11 = false;
                }
                if (!z11) {
                    j.this.z("Skipping BG Scan - offloaded filtering NOT supported");
                    return;
                }
                ScanSettings build = new ScanSettings.Builder().setScanMode(0).build();
                ArrayList arrayList = new ArrayList();
                for (String str : j.this.f22231n) {
                    arrayList.add(new ScanFilter.Builder().setDeviceAddress(str).build());
                }
                j.this.z(String.format("Starting BG Scan for %s address(es)", Integer.valueOf(arrayList.size())));
                try {
                    if (!a0.c(j.this.f22227j)) {
                        j.this.z("BLUETOOTH_SCAN permission is not granted, cannot start background scan");
                    } else {
                        j.this.f22234q.startScan(arrayList, build, j.this.f22242y);
                        j.this.f22233p = true;
                    }
                } catch (Exception e11) {
                    j.this.c("BG Scan failed", e11);
                }
                gv.g.e(j.this.f22227j);
            }
        }
    }

    /* loaded from: classes6.dex */
    class c extends ScanCallback {
        c() {
        }

        private void a(ScanResult scanResult) {
            BluetoothDevice device;
            Peripheral peripheral;
            if ((Build.VERSION.SDK_INT >= 26 && !scanResult.isConnectable()) || scanResult == null || (device = scanResult.getDevice()) == null || (peripheral = (Peripheral) j.this.f22223f.get(device.getAddress())) == null || peripheral.isConnected()) {
                return;
            }
            if (peripheral.shouldTryBackgroundScanConnect() && scanResult.getRssi() > -95) {
                j.this.z(String.format("BG Scan; making direct connection to %s with RSSI %s", peripheral, Integer.valueOf(scanResult.getRssi())));
                j.this.x0(peripheral);
                return;
            }
            j.this.z(String.format("BG Scan; NOT re-initializing connection to %s - last connection occurred %s seconds ago / RSSI: %s", peripheral, Long.valueOf(peripheral.secondsSinceConnect()), Integer.valueOf(scanResult.getRssi())));
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i11) {
            j.this.z(String.format("BG Scan failed with error %s", f0.g(i11)));
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i11, ScanResult scanResult) {
            a(scanResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22247a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f22248b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f22249c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f22250d;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ int[] f22251e;

        static {
            int[] iArr = new int[c4.values().length];
            f22251e = iArr;
            try {
                iArr[c4.WHITELISTOPERATION_INFORMATION_KEYFOB_SLOTS_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22251e[c4.WHITELISTOPERATION_INFORMATION_WHITELIST_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22251e[c4.WHITELISTOPERATION_INFORMATION_KEYCHAIN_WHILE_FS_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[bu.h.values().length];
            f22250d = iArr2;
            try {
                iArr2[bu.h.APP_DEVICE_INFO_REQUEST_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22250d[bu.h.APP_DEVICE_INFO_REQUEST_GET_MODEL_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[z0.values().length];
            f22249c = iArr3;
            try {
                iArr3[z0.IMU_REQUEST_ENABLE_CONTINUOUS_ACTIVITY_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22249c[z0.IMU_REQUEST_DISABLE_CONTINUOUS_ACTIVITY_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22249c[z0.IMU_REQUEST_GET_SLEEP_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr4 = new int[ot.g.values().length];
            f22248b = iArr4;
            try {
                iArr4[ot.g.DRIVER_FRONT_DOOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22248b[ot.g.DRIVER_REAR_DOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22248b[ot.g.PASSENGER_FRONT_DOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22248b[ot.g.PASSENGER_REAR_DOOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr5 = new int[nv.c.values().length];
            f22247a = iArr5;
            try {
                iArr5[nv.c.ClearPeripherals.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22247a[nv.c.RequestMTU.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22247a[nv.c.ResetCommandPeripheral.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22247a[nv.c.StartMonitoringRSSI.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22247a[nv.c.StopMonitoringRSSI.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22247a[nv.c.SendNullAuthResponse.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22247a[nv.c.UnlockCar.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22247a[nv.c.LockCar.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22247a[nv.c.OpenFrunk.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22247a[nv.c.OpenTrunk.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22247a[nv.c.OpenChargePort.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22247a[nv.c.CloseChargePort.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f22247a[nv.c.AddToWhitelist.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22247a[nv.c.CancelExternalAuthenticate.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f22247a[nv.c.GetWhiteslistUpdate.ordinal()] = 15;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f22247a[nv.c.GetEpochSessionInfo.ordinal()] = 16;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f22247a[nv.c.RemoveFromWhitelist.ordinal()] = 17;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f22247a[nv.c.OpenDoor.ordinal()] = 18;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f22247a[nv.c.CloseDoor.ordinal()] = 19;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f22247a[nv.c.CloseDoorsAndLock.ordinal()] = 20;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f22247a[nv.c.OpenAllDoors.ordinal()] = 21;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f22247a[nv.c.SendBLEDataLegacy.ordinal()] = 22;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f22247a[nv.c.SendBLEData.ordinal()] = 23;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f22247a[nv.c.SetConnectionBehaviorWhenUnauthorized.ordinal()] = 24;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public j(String str, String str2, Context context, BluetoothAdapter bluetoothAdapter, BLEService bLEService) {
        this.f22221d = str;
        this.f22229l = str2;
        this.f22228k = bluetoothAdapter;
        this.f22227j = context;
        q qVar = new q(this, str, str2, context);
        this.f22222e = qVar;
        qVar.l0();
        this.f22230m = new lv.f();
        this.f22218a = bLEService;
        this.f22238u = z.p(context).a0(str, str2);
        this.f22230m.g(z.p(context).X(str, str2));
        this.f22230m.e(1.0d);
        this.f22232o = new Handler(Looper.getMainLooper());
        k();
        f();
    }

    private void E0(byte[] bArr, Peripheral peripheral, String str) {
        if (bArr == null) {
            z(String.format("WARNING: Null bytes to send for type %s", str));
            return;
        }
        String b11 = f0.b(bArr);
        if (peripheral != null && peripheral.getServiceConnected()) {
            peripheral.enqueue(bArr, str);
        } else {
            p(false, "PHONE_KEY_NOT_CONNECTED", b11, peripheral);
        }
    }

    private void F0(byte[] bArr, String str) {
        E0(bArr, this.f22225h, str);
    }

    private void K0(int i11) {
        R0(i11, lv.c.AUTH_RESPONSE_NULL.name());
    }

    private void L0() {
        for (Map.Entry<String, Peripheral> entry : this.f22223f.entrySet()) {
            entry.getValue().setReadingRssi(true);
        }
    }

    public static byte[] N(j3 j3Var) {
        if (j3Var == null) {
            return null;
        }
        byte[] encode = j3Var.encode();
        int length = encode.length + 2;
        byte[] bArr = new byte[length];
        for (int i11 = 2; i11 < length; i11++) {
            bArr[i11] = encode[i11 - 2];
        }
        bArr[0] = (byte) ((encode.length >> 8) & 255);
        bArr[1] = (byte) (encode.length & 255);
        return bArr;
    }

    public static byte[] O(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length + 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 2, length - 2);
        bArr2[0] = (byte) ((bArr.length >> 8) & 255);
        bArr2[1] = (byte) (bArr.length & 255);
        return bArr2;
    }

    private void O0(d0 d0Var, int i11, String str) {
        Q0(this.f22222e.H(d0Var), i11, str);
    }

    private void P(int i11) {
        byte[] N = N(this.f22222e.z());
        if (N == null) {
            this.f22218a.u0(nv.c.CommandResult, new nv.a(lv.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i11));
            return;
        }
        this.f22220c.put(f0.b(N), Integer.valueOf(i11));
        F0(N, lv.c.ADD_TO_WHITELIST.name());
    }

    private void P0(g2 g2Var, int i11, String str) {
        Q0(this.f22222e.I(g2Var), i11, str);
    }

    private void Q0(lv.a aVar, int i11, String str) {
        byte[] N = aVar != null ? N(aVar.b()) : null;
        if (N == null) {
            this.f22218a.u0(nv.c.CommandResult, new nv.a(lv.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i11));
            return;
        }
        this.f22219b.put(v0(aVar.a()), Integer.valueOf(i11));
        this.f22219b.put(f0.b(N), Integer.valueOf(i11));
        F0(N, str);
    }

    private List<String> R(Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT <= 26 && collection != null && !collection.isEmpty()) {
            for (String str : collection) {
                if ((f0.a(str.split(":")[0])[0] & 192) != 128) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    private void R0(int i11, String str) {
        Q0(this.f22222e.Q(), i11, str);
    }

    private void S(int i11) {
        byte[] N = N(this.f22222e.A());
        if (N == null) {
            this.f22218a.u0(nv.c.CommandResult, new nv.a(lv.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i11));
            return;
        }
        this.f22220c.put(f0.b(N), Integer.valueOf(i11));
        F0(N, lv.c.CANCEL_EXTERNAL_AUTHENTICATE.name());
    }

    private void X(int i11) {
        g2 g2Var = g2.RKE_ACTION_AUTO_SECURE_VEHICLE;
        P0(g2Var, i11, g2Var.name());
    }

    private void a0() {
        Iterator<Map.Entry<String, Peripheral>> it2 = this.f22223f.entrySet().iterator();
        while (it2.hasNext()) {
            it2.remove();
            it2.next().getValue().disconnect();
        }
        this.f22231n = Collections.EMPTY_LIST;
        u(true);
    }

    private void b0(int i11, String str) {
        byte[] N = N(this.f22222e.J(str));
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f22220c;
        lv.c cVar = lv.c.GET_EPOCH_SESSION_INFO;
        concurrentHashMap.put(cVar.name(), Integer.valueOf(i11));
        F0(N, cVar.name());
    }

    private List<Peripheral> d0() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Peripheral> entry : this.f22223f.entrySet()) {
            if (entry.getValue() != null && entry.getValue().isCentralPeripheral()) {
                arrayList.add(0, entry.getValue());
            } else {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    private Set<v3.d<String, String>> e0() {
        HashSet hashSet = new HashSet();
        z p11 = z.p(this.f22227j);
        for (String str : p11.u(this.f22221d, this.f22229l)) {
            String[] split = str.split("-");
            if (split.length == 2) {
                if (BLEService.X(p11) <= 1 || Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE.equalsIgnoreCase(split[0])) {
                    hashSet.add(new v3.d(split[0], split[1]));
                } else {
                    z(String.format("Key version greater than 1; - skipping %s", split[0]));
                }
            }
        }
        return hashSet;
    }

    private void f0(int i11) {
        c1 c1Var = c1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO;
        j3 K = this.f22222e.K(c1Var);
        if (K == null) {
            String str = "requestInformation(InformationRequestType requestType) failed to build request. requestType=" + c1Var;
            c(str, new Exception(str));
            this.f22218a.u0(nv.c.CommandResult, new nv.a(lv.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i11));
            return;
        }
        byte[] N = N(K);
        this.f22220c.put(f0.b(N), Integer.valueOf(i11));
        F0(N, lv.c.GET_WHITELIST_INFO.name());
    }

    private void k0() {
        z("loadPeripherals() called. Clearing command peripheral!");
        this.f22225h = null;
        for (v3.d<String, String> dVar : e0()) {
            String str = dVar.f54020b;
            this.f22223f.put(str, new Peripheral(dVar.f54019a, this.f22228k.getRemoteDevice(str), null, this, this.f22228k, null, this.f22227j));
        }
        this.f22231n = R(this.f22223f.keySet());
    }

    private boolean n0(bu.m mVar) {
        boolean z11;
        String[] a11 = iv.a.a(mVar.c());
        z(String.format("Received auth request with level %s. auth reasons: '%s'. Trying to reply", mVar.d(), Arrays.toString(this.f22230m.f37751d)));
        if (a11.length > 0) {
            this.f22230m.f37751d = a11;
            z11 = true;
        } else {
            z11 = false;
        }
        n e11 = mVar.e();
        boolean z12 = e11 != null && e11.c().z() == 20;
        if (z12 && this.f22238u < 1) {
            z.p(this.f22227j).U(this.f22221d, this.f22229l, 1L);
            this.f22238u = 1L;
        }
        boolean z13 = mVar.d() == bu.j.AUTHENTICATION_LEVEL_NONE;
        boolean z14 = z13 || this.f22238u < 1 || z12;
        if (this.f22222e.Y()) {
            if (z14) {
                if (e11 != null) {
                    z(String.format("has token of size %d", Integer.valueOf(e11.c().z())));
                }
                lv.a E = this.f22222e.E(mVar, this.f22218a.Q.c(this.f22227j, this.f22221d, mVar.d(), a11));
                if (E != null) {
                    byte[] N = N(E.b());
                    z("Sending auth response...");
                    F0(N, mVar.d().name());
                    if (z13) {
                        q(this.f22218a.W());
                        return true;
                    }
                    return true;
                }
                z(String.format("Cannot reply to auth request with level %s", mVar.d().name()));
            } else {
                z("replying to token-less auth challenge with null auth");
                lv.a R = this.f22222e.R(bu.l.AUTHENTICATIONREJECTION_NO_TOKEN);
                if (R == null) {
                    z("failed to send null auth to token-less auth challenge");
                } else {
                    F0(N(R.b()), mVar.d().name());
                    return true;
                }
            }
        }
        return z11;
    }

    private void q0(int i11) {
        e0 e0Var = e0.CLOSURE_MOVE_TYPE_NONE;
        e0 e0Var2 = e0.CLOSURE_MOVE_TYPE_OPEN;
        O0(new d0(e0Var2, e0Var2, e0Var2, e0Var2, e0Var, e0Var, e0Var, okio.i.f42656d), i11, "OPEN_ALL_DOORS");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void s0(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            bu.e0 r7 = bu.e0.CLOSURE_MOVE_TYPE_NONE
            if (r13 == 0) goto L7
            bu.e0 r0 = bu.e0.CLOSURE_MOVE_TYPE_OPEN
            goto L9
        L7:
            bu.e0 r0 = bu.e0.CLOSURE_MOVE_TYPE_CLOSE
        L9:
            int[] r1 = com.teslamotors.plugins.ble.j.d.f22248b
            ot.g r2 = ot.g.fromValue(r12)
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L34
            r2 = 2
            if (r1 == r2) goto L2f
            r2 = 3
            if (r1 == r2) goto L2b
            r2 = 4
            if (r1 == r2) goto L26
            r1 = r7
            r2 = r1
        L23:
            r3 = r2
        L24:
            r4 = r3
            goto L37
        L26:
            r4 = r0
            r1 = r7
            r2 = r1
            r3 = r2
            goto L37
        L2b:
            r2 = r0
            r1 = r7
            r3 = r1
            goto L24
        L2f:
            r3 = r0
            r1 = r7
            r2 = r1
            r4 = r2
            goto L37
        L34:
            r1 = r0
            r2 = r7
            goto L23
        L37:
            bu.d0 r9 = new bu.d0
            okio.i r8 = okio.i.f42656d
            r0 = r9
            r5 = r7
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r13 == 0) goto L4b
            java.lang.String r13 = "OPEN_"
            goto L4d
        L4b:
            java.lang.String r13 = "CLOSE_"
        L4d:
            r0.append(r13)
            ot.g r12 = ot.g.fromValue(r12)
            java.lang.String r12 = r12.name()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r10.O0(r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.j.s0(int, int, boolean):void");
    }

    private static String v0(long j11) {
        return String.format("IV-%s", Long.valueOf(j11));
    }

    private void y0(int i11) {
        byte[] N = N(this.f22222e.f0());
        if (N == null) {
            this.f22218a.u0(nv.c.CommandResult, new nv.a(lv.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i11));
            return;
        }
        this.f22220c.put(f0.b(N), Integer.valueOf(i11));
        F0(N, lv.c.REMOVE_FROM_WHITELIST.name());
    }

    private void z0(Integer num) {
        Iterator<Map.Entry<String, Integer>> it2 = this.f22219b.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().equals(num)) {
                it2.remove();
                return;
            }
        }
    }

    @Override // com.teslamotors.plugins.ble.d
    public void A(byte[] bArr) {
        this.f22236s = bArr;
    }

    public void A0() {
        if (this.f22225h != null) {
            this.f22225h.requestMtuDebug();
        }
    }

    public void B0(String str) {
        if (this.f22225h != null) {
            x(this.f22225h, str);
        }
    }

    public void C0(int i11, byte[] bArr) {
        if (bArr == null) {
            c("sendBleData called with null data.", new Exception("sendBleData called with null data."));
            this.f22218a.u0(nv.c.CommandResult, new nv.a(lv.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i11));
            return;
        }
        this.f22239v = true;
        F0(O(bArr), lv.c.BLE_DATA.name());
    }

    public void D0(int i11, String str) {
        byte[] a11 = f0.a(str);
        if (a11 == null) {
            this.f22218a.u0(nv.c.CommandResult, new nv.a(lv.b.ERROR, "PHONE_KEY_COULD_NOT_CREATE_MESSAGE", i11));
            return;
        }
        this.f22220c.put(f0.b(a11), Integer.valueOf(i11));
        F0(a11, lv.c.UNKNOWN.name());
    }

    public void G0() {
        I0(gv.i.d(gv.i.m(Build.MODEL)), lv.c.DEVICE_INFO_RESPONSE.name());
    }

    public void H0(String str) {
        this.f22218a.s0(str);
    }

    public void I0(j3 j3Var, String str) {
        F0(N(j3Var), str);
    }

    public void J0(byte[] bArr, String str) {
        F0(O(bArr), str);
    }

    public boolean M0() {
        return this.f22237t;
    }

    public void N0() {
        for (Map.Entry<String, Peripheral> entry : this.f22223f.entrySet()) {
            entry.getValue().setReadingRssi(false);
        }
    }

    public boolean Q() {
        for (Map.Entry<String, Peripheral> entry : this.f22223f.entrySet()) {
            if (!entry.getValue().isConnected()) {
                return false;
            }
        }
        return this.f22223f.size() > 0;
    }

    public void S0(int i11) {
        P0(g2.RKE_ACTION_UNLOCK, i11, lv.c.RKE_ACTION_UNLOCK.name());
    }

    public void T() {
        if (this.f22235r) {
            L0();
        } else {
            N0();
        }
    }

    public void U() {
    }

    public void V() {
        z("clearPeripherals() called. Clearing command peripheral!");
        this.f22225h = null;
        a(Collections.EMPTY_MAP);
        a0();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        z.p(this.f22227j).R(this.f22221d, this.f22229l, currentTimeMillis);
        this.f22230m.g(currentTimeMillis);
        gv.g.b(this.f22227j);
        this.f22222e.h0();
        this.f22218a.u0(nv.c.ClearPeripheralsResult, new nv.a(lv.b.OK, "", -1));
        this.f22218a.S("from clearPeripherals");
        u(true);
        this.f22218a.l0("from clearPeripherals");
    }

    public void W(int i11) {
        P0(g2.RKE_ACTION_CLOSE_CHARGE_PORT, i11, lv.c.RKE_ACTION_CLOSE_CHARGE_PORT.name());
    }

    public void Y() {
        if (this.f22225h != null) {
            z("Command peripheral already exists - not connecting new command peripheral");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Peripheral> entry : this.f22223f.entrySet()) {
            Peripheral value = entry.getValue();
            if (value.isConnected() && value.getServiceConnected()) {
                arrayList.add(value);
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            Peripheral peripheral = (Peripheral) (size == 1 ? arrayList.get(0) : arrayList.get(new Random().nextInt(size)));
            z(String.format("%s - connectCommandPeripheral", peripheral));
            if (peripheral.requestIndications()) {
                this.f22226i = peripheral;
            }
        }
    }

    public void Z(Peripheral peripheral) {
        if (!j0()) {
            z("Cannot create connection - adapter is not enabled");
        } else if (peripheral == null) {
            z("Cannot create connection - peripheral is null");
        } else if (peripheral.getIdentifier() == null) {
            z("Cannot create connection - mac is null");
        } else {
            peripheral.createInitialConnection();
        }
    }

    @Override // com.teslamotors.plugins.ble.d
    public void a(Map<String, Peripheral> map) {
        boolean z11;
        HashSet hashSet = new HashSet();
        this.f22231n = R(this.f22223f.keySet());
        Iterator<Map.Entry<String, Peripheral>> it2 = map.entrySet().iterator();
        while (true) {
            z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, Peripheral> next = it2.next();
            hashSet.add(String.format("%s%s%s", next.getValue().getPosition(), "-", next.getValue().getIdentifier()));
        }
        z(String.format("Setting stored device addresses to %s", hashSet));
        z.p(this.f22227j).L(this.f22221d, this.f22229l, hashSet);
        if (hashSet.isEmpty()) {
            gv.g.b(this.f22227j);
        } else {
            gv.g.f(this.f22227j);
        }
        z("checking descriptors is empty: " + hashSet.isEmpty());
        z("checking isUserAllowBackgroundServiceRunning: " + this.f22218a.g0());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("resetting boot receiver flag to ");
        sb2.append(!hashSet.isEmpty() && this.f22218a.g0());
        sb2.append(" in vehicle controller");
        z(sb2.toString());
        BLEService bLEService = this.f22218a;
        if (!hashSet.isEmpty() && this.f22218a.g0()) {
            z11 = true;
        }
        bLEService.I0(z11);
    }

    @Override // com.teslamotors.plugins.ble.d
    public synchronized boolean b(Peripheral peripheral) {
        boolean z11;
        if (peripheral != null) {
            if (this.f22225h != null && this.f22225h.getIdentifier() != null) {
                z11 = this.f22225h.getIdentifier().equals(peripheral.getIdentifier()) ? true : true;
            }
        }
        z11 = false;
        return z11;
    }

    @Override // com.teslamotors.plugins.ble.d
    public void c(String str, Throwable th2) {
        BLEService.j0("BLEVehicleController", String.format("[%s] (%s) %s", f0.f(this.f22221d), Integer.valueOf(hashCode()), str), th2);
    }

    public boolean c0() {
        return this.f22239v;
    }

    @Override // com.teslamotors.plugins.ble.d
    public String d() {
        return this.f22221d;
    }

    @Override // com.teslamotors.plugins.ble.d
    public void disconnect() {
        a0();
    }

    @Override // com.teslamotors.plugins.ble.d
    public void e(Peripheral peripheral) {
        this.f22222e.e0(peripheral);
    }

    @Override // com.teslamotors.plugins.ble.d
    public void f() {
        if (this.f22231n.isEmpty()) {
            return;
        }
        this.f22232o.postDelayed(new b(), 2000L);
    }

    @Override // com.teslamotors.plugins.ble.d
    public void g(Peripheral peripheral, int i11) {
        T();
        u(true);
        if (!i0()) {
            f();
        } else if (Q()) {
            i();
        }
    }

    public boolean g0() {
        return this.f22225h != null;
    }

    @Override // com.teslamotors.plugins.ble.d
    public void h(nv.j jVar, boolean z11) {
        this.f22230m.j(jVar);
        jVar.A = this.f22222e.N();
        jVar.f41919l = this.f22222e.Y();
        jVar.f41920m = this.f22222e.W();
        jVar.f41921n = this.f22222e.X();
        jVar.f41922o = this.f22222e.U();
        jVar.f41927x = this.f22225h != null && this.f22225h.getServiceConnected();
        jVar.f41928y = this.f22225h == null ? "" : this.f22225h.getIdentifier();
        lv.f fVar = this.f22230m;
        jVar.f41915h = fVar.f37751d;
        jVar.f41924q = fVar.c();
        jVar.f41925t = this.f22230m.d();
        jVar.f41918k = this.f22221d;
        nv.e k02 = BLEService.k0(this.f22223f);
        if (k02.f41898a.isEmpty()) {
            for (v3.d<String, String> dVar : e0()) {
                k02.f41898a.put(dVar.f54019a, new nv.d(CallerData.NA, false, dVar.f54020b, -1000));
            }
        }
        jVar.f41929z = k02;
    }

    public boolean h0() {
        for (Map.Entry<String, Peripheral> entry : this.f22223f.entrySet()) {
            if (entry.getValue().isConnected() && entry.getValue().getServiceConnected()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.teslamotors.plugins.ble.d
    public void i() {
        if (this.f22233p) {
            if (!a0.c(this.f22227j)) {
                z("BLUETOOTH_SCAN permission is not granted, cannot stop background scan");
                return;
            }
            gv.g.a(this.f22227j);
            this.f22233p = false;
            if (this.f22234q == null || !j0()) {
                return;
            }
            z("Stopping BG Scan");
            this.f22234q.stopScan(this.f22242y);
        }
    }

    public boolean i0() {
        for (Map.Entry<String, Peripheral> entry : this.f22223f.entrySet()) {
            if (entry.getValue().isConnected()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.teslamotors.plugins.ble.d
    public void j(Message message) {
        switch (d.f22247a[nv.c.get(message.what).ordinal()]) {
            case 1:
                V();
                return;
            case 2:
                A0();
                return;
            case 3:
                B0("UI Button");
                return;
            case 4:
                this.f22235r = true;
                L0();
                return;
            case 5:
                this.f22235r = false;
                N0();
                return;
            case 6:
                K0(message.arg1);
                return;
            case 7:
                S0(message.arg1);
                return;
            case 8:
                l0(message.arg1);
                return;
            case 9:
                t0(message.arg1);
                return;
            case 10:
                u0(message.arg1);
                return;
            case 11:
                r0(message.arg1);
                return;
            case 12:
                W(message.arg1);
                return;
            case 13:
                P(message.arg1);
                return;
            case 14:
                S(message.arg1);
                return;
            case 15:
                f0(message.arg1);
                return;
            case 16:
                b0(message.arg1, message.getData().getString(nv.c.GetEpochSessionInfo.getKey()));
                return;
            case 17:
                y0(message.arg1);
                return;
            case 18:
                s0(message.arg1, message.arg2, true);
                return;
            case 19:
                s0(message.arg1, message.arg2, false);
                return;
            case 20:
                X(message.arg1);
                return;
            case 21:
                q0(message.arg1);
                return;
            case 22:
                D0(message.arg1, message.getData().getString(nv.c.SendBLEDataLegacy.getKey()));
                return;
            case 23:
                C0(message.arg1, message.getData().getByteArray(nv.c.SendBLEData.getKey()));
                return;
            case 24:
                this.f22237t = message.arg1 > 0;
                return;
            default:
                return;
        }
    }

    public boolean j0() {
        return mv.c.f39466a.a(this.f22228k);
    }

    @Override // com.teslamotors.plugins.ble.d
    public void k() {
        k0();
        for (Peripheral peripheral : d0()) {
            Z(peripheral);
        }
    }

    @Override // com.teslamotors.plugins.ble.d
    public nv.b l(byte[] bArr, byte[] bArr2) {
        return new nv.b(this.f22222e.G(bArr, bArr2));
    }

    public void l0(int i11) {
        P0(g2.RKE_ACTION_LOCK, i11, lv.c.RKE_ACTION_LOCK.name());
    }

    @Override // com.teslamotors.plugins.ble.d
    public void m() {
        if (this.f22223f.size() == 0) {
            k();
        } else {
            ArrayList<Peripheral> arrayList = new ArrayList();
            for (Peripheral peripheral : d0()) {
                if (peripheral != null && !peripheral.isConnected() && peripheral.getIdentifier() != this.f22240w) {
                    peripheral.disconnect();
                    arrayList.add(new Peripheral(peripheral.getPosition(), this.f22228k.getRemoteDevice(peripheral.getIdentifier()), null, this, this.f22228k, null, this.f22227j));
                }
            }
            for (Peripheral peripheral2 : arrayList) {
                if (peripheral2 != null) {
                    this.f22223f.put(peripheral2.getIdentifier(), peripheral2);
                    Z(peripheral2);
                }
            }
        }
        u(true);
    }

    public void m0(boolean z11, String str, String str2) {
        if (this.f22220c.containsKey(str2)) {
            this.f22218a.u0(nv.c.CommandResult, new nv.a(z11 ? lv.b.OK : lv.b.ERROR, "", this.f22220c.remove(str2).intValue(), str));
        }
    }

    @Override // com.teslamotors.plugins.ble.d
    public void n(Peripheral.e eVar, Peripheral peripheral) {
        if (eVar.f22129a != null) {
            z("Processing FromVCSECMessage");
            p0(eVar.f22129a, peripheral, eVar.f22130b != null);
        }
        if (eVar.f22130b != null) {
            try {
                z("Sending RoutableMessage as BLEData");
                this.f22218a.v0(nv.c.ReceivedBLEData, eVar.f22130b.encode());
            } catch (Exception e11) {
                c("Error sending encoded routable message", e11);
            }
        }
    }

    @Override // com.teslamotors.plugins.ble.d
    public void o(bu.d dVar) {
        I0(gv.i.d(gv.i.e(dVar)), dVar.name());
    }

    public void o0(int i11, lv.b bVar, String str, Peripheral peripheral) {
        String v02 = v0(i11);
        if (this.f22219b.containsKey(v02)) {
            Integer num = this.f22219b.get(v02);
            this.f22219b.remove(v02);
            z0(num);
            this.f22218a.u0(nv.c.CommandResult, new nv.a(bVar, str, num.intValue()));
        }
        if (bVar.equals(lv.b.OK)) {
            peripheral.setAuthenticated(true);
            this.f22224g.remove(peripheral);
        }
    }

    @Override // com.teslamotors.plugins.ble.d
    public void p(boolean z11, String str, String str2, Peripheral peripheral) {
        if (!z11 && Objects.equals(str, "PHONE_KEY_TRANSMISSION_FAILURE")) {
            x(peripheral, "notifyCommandResult: transmission failure");
            return;
        }
        U();
        if (!z11 && this.f22219b.containsKey(str2)) {
            Integer remove = this.f22219b.remove(str2);
            z0(remove);
            this.f22218a.u0(nv.c.CommandResult, new nv.a(lv.b.ERROR, str, remove.intValue()));
        } else if (this.f22220c.containsKey(str2)) {
            this.f22218a.u0(nv.c.CommandResult, new nv.a(z11 ? lv.b.OK : lv.b.ERROR, str, this.f22220c.remove(str2).intValue()));
        }
    }

    public void p0(p0 p0Var, Peripheral peripheral, boolean z11) {
        boolean z12;
        d4 e11;
        bu.f b11;
        this.f22222e.c0(p0Var, peripheral);
        if (p0Var.J() != null) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            z.p(this.f22227j).R(this.f22221d, this.f22229l, currentTimeMillis);
            this.f22230m.g(currentTimeMillis);
        }
        w3 H = p0Var.H();
        if (H != null) {
            this.f22230m.e(System.currentTimeMillis());
            this.f22230m.f(H);
            lv.f fVar = this.f22230m;
            z(String.format("Got vehicle status: %s - %s", fVar, fVar.h()));
            z12 = true;
        } else {
            z12 = false;
        }
        bu.m f11 = p0Var.f();
        if (f11 != null) {
            z12 = n0(f11) || z12;
        }
        r0 m11 = p0Var.m();
        if (m11 == r0.GENEALOGYREQUEST_READ && this.f22222e.Y()) {
            lv.a O = this.f22222e.O();
            if (O == null) {
                z(String.format("Cannot reply to genealogy request", new Object[0]));
            } else {
                byte[] N = N(O.b());
                z(String.format("Received genealogy request", new Object[0]));
                F0(N, m11.name());
            }
        }
        z0 n11 = p0Var.n() == null ? z0.IMU_REQUEST_NONE : p0Var.n();
        if (this.f22222e.Y()) {
            int i11 = d.f22249c[n11.ordinal()];
            if (i11 == 1) {
                this.f22218a.z0(true);
                z(String.format("Enabling continuous activity updates", new Object[0]));
            } else if (i11 == 2) {
                this.f22218a.z0(false);
                z(String.format("Disabling continuous activity updates", new Object[0]));
            } else if (i11 == 3) {
                z(String.format("Sending IMU activity state", new Object[0]));
                q(this.f22218a.W());
            }
        }
        bu.h e12 = p0Var.e();
        if (e12 != null && d.f22250d[e12.ordinal()] == 2) {
            z("Received device info request.");
            G0();
        }
        if (p0Var.d() != null && (b11 = p0Var.d().b()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("bluetooth_enabled", String.valueOf(j0()));
            hashMap.put("peripheral_connection_started_timestamp", Long.toString(this.f22241x.longValue()));
            if (this.f22225h != null) {
                hashMap.put("indications_connection_started_timestamp", Long.toString(this.f22225h.getConnectedTimestamp().longValue()));
                hashMap.put("indications_disconnection_timestamp", Long.toString(this.f22225h.getDisconnectedTimestamp().longValue()));
                hashMap.put("controller_created_timestamp", Long.toString(this.f22225h.getCreatedTimestamp().longValue()));
            }
            BLEService bLEService = this.f22218a;
            if (bLEService != null) {
                hashMap.put("bluetooth_enabled_timestamp", Long.toString(bLEService.T().longValue()));
            }
            gv.j.d(this.f22227j, b11, hashMap);
            StringBuilder sb2 = new StringBuilder("Failed Handle Pull handle: " + b11.f());
            sb2.append(" timeSince(ms): ");
            sb2.append(b11.g());
            sb2.append(" connectionCount: ");
            sb2.append(b11.d());
            sb2.append(" unknown device present: ");
            sb2.append(b11.h());
            sb2.append(" devices: ");
            for (x0 x0Var : b11.e()) {
                sb2.append(" keyChannel: ");
                sb2.append(x0Var.m());
                sb2.append(" authenticationLevel: ");
                sb2.append(x0Var.c());
                sb2.append(" present: %@ ");
                sb2.append(x0Var.n());
                sb2.append(" left: %d");
                sb2.append(x0Var.q());
                sb2.append(" right: %d");
                sb2.append(x0Var.v());
                sb2.append(" rear: %d");
                sb2.append(x0Var.s());
                sb2.append(" center: %d");
                sb2.append(x0Var.o());
                sb2.append(" front: %d");
                sb2.append(x0Var.p());
                sb2.append(" secondary: %d");
                sb2.append(x0Var.w());
                sb2.append(" nFCCradle: %d");
                sb2.append(x0Var.r());
                sb2.append(" rearLeft: %d");
                sb2.append(x0Var.t());
                sb2.append(" rearRight: %d");
                sb2.append(x0Var.u());
                sb2.append(" highThreshLeftPresent: %@");
                sb2.append(x0Var.d());
                sb2.append(" highThreshRightPresent: %@");
                sb2.append(x0Var.k());
                sb2.append(" highThreshCenterPresent: %@");
                sb2.append(x0Var.d());
                sb2.append(" highThreshFrontPresent: %@");
                sb2.append(x0Var.e());
                sb2.append(" highThreshRearPresent: %@");
                sb2.append(x0Var.i());
                sb2.append(" highThreshRearLeftPresent: %@");
                sb2.append(x0Var.h());
                sb2.append(" highThreshRearRightPresent: %@");
                sb2.append(x0Var.j());
                sb2.append(" highThreshSecondaryPresent: %@");
                sb2.append(x0Var.l());
                sb2.append(" highThreshNFCPresent: %@");
                sb2.append(x0Var.g());
                sb2.append(" sortedDeltaBayesLeftPresent: %@");
                sb2.append(x0Var.z());
                sb2.append(" sortedDeltaBayesRightPresent: %@");
                sb2.append(x0Var.A());
                sb2.append(" rawDeltaBayesLeftPresent: %@");
                sb2.append(x0Var.x());
                sb2.append(" rawDeltaBayesRightPresent: %@");
                sb2.append(x0Var.y());
            }
            z(sb2.toString());
        }
        i0 k11 = p0Var.k();
        if (k11 != null && (e11 = k11.e()) != null) {
            c4 e13 = e11.e();
            if (e13 != c4.WHITELISTOPERATION_INFORMATION_NONE) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "mobile-app-whitelist-operation-failure");
                hashMap2.put("information", e13.name());
                yu.m.f(this.f22227j).d(hashMap2, false);
            }
            int i12 = d.f22251e[e13.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                H0("whitelist_is_full");
            }
        }
        u(z12);
    }

    @Override // com.teslamotors.plugins.ble.d
    public void q(a1 a1Var) {
        I0(gv.i.d(gv.i.h(a1Var)), a1Var.name());
    }

    @Override // com.teslamotors.plugins.ble.d
    public nv.f r() {
        return new nv.f(this.f22222e.T(), this.f22222e.S());
    }

    public void r0(int i11) {
        P0(g2.RKE_ACTION_OPEN_CHARGE_PORT, i11, lv.c.RKE_ACTION_OPEN_CHARGE_PORT.name());
    }

    @Override // com.teslamotors.plugins.ble.d
    public void s(Peripheral peripheral) {
        boolean z11 = true;
        if (b(peripheral)) {
            z(String.format("%s connection to command peripheral lost", peripheral));
            this.f22225h = null;
        } else if (w(peripheral)) {
            z(String.format("%s connection to candidate peripheral lost", peripheral));
            this.f22226i = null;
        } else {
            z11 = false;
        }
        this.f22224g.remove(peripheral);
        this.f22222e.D(peripheral, z11);
        this.f22218a.z0(false);
    }

    @Override // com.teslamotors.plugins.ble.d
    public synchronized void t(Peripheral peripheral) {
        if (peripheral != null) {
            if (this.f22226i != null && this.f22226i.getIdentifier().equalsIgnoreCase(peripheral.getIdentifier())) {
                this.f22225h = peripheral;
                z(String.format("%s - promoteToCommandPeripheral() called", peripheral));
                this.f22226i = null;
                this.f22222e.C();
                this.f22241x = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    public void t0(int i11) {
        P0(g2.RKE_ACTION_OPEN_FRUNK, i11, lv.c.RKE_ACTION_OPEN_FRUNK.name());
    }

    @Override // com.teslamotors.plugins.ble.d
    public void u(boolean z11) {
        this.f22218a.x0(z11);
    }

    public void u0(int i11) {
        P0(g2.RKE_ACTION_OPEN_TRUNK, i11, lv.c.RKE_ACTION_OPEN_TRUNK.name());
    }

    @Override // com.teslamotors.plugins.ble.d
    public lv.e v() {
        if (this.f22225h == null) {
            return lv.e.DISCONNECTED;
        }
        return this.f22225h.isConnected() ? lv.e.CONNECTED : lv.e.DISCONNECTED;
    }

    @Override // com.teslamotors.plugins.ble.d
    public synchronized boolean w(Peripheral peripheral) {
        boolean z11;
        if (peripheral != null) {
            if (this.f22226i != null) {
                z11 = this.f22226i.getIdentifier().equalsIgnoreCase(peripheral.getIdentifier()) ? true : true;
            }
        }
        z11 = false;
        return z11;
    }

    synchronized void w0(Peripheral peripheral) {
        if (this.f22240w != null) {
            this.f22240w = null;
            z(String.format("%s [resetPeripheral] reconnecting now", peripheral));
            Peripheral peripheral2 = new Peripheral(peripheral.getPosition(), this.f22228k.getRemoteDevice(peripheral.getIdentifier()), null, this, this.f22228k, null, this.f22227j);
            this.f22223f.put(peripheral.getIdentifier(), peripheral2);
            Z(peripheral2);
        }
    }

    @Override // com.teslamotors.plugins.ble.d
    public synchronized void x(Peripheral peripheral, String str) {
        z(String.format("%s - resetPeripheral with reason: %s", peripheral, str));
        if (peripheral != null && peripheral.getIdentifier() != null && !peripheral.isFinished()) {
            z(String.format("%s - [resetPeripheral] disconnecting, reconnecting upon clean disconnect or %ss timeout", peripheral, 3));
            this.f22240w = peripheral.getIdentifier();
            peripheral.disconnect();
            this.f22232o.postDelayed(new a(peripheral), 3500L);
        }
    }

    public void x0(Peripheral peripheral) {
        if (peripheral == null || peripheral.isConnected() || this.f22240w != null) {
            return;
        }
        x(peripheral, "reinitialization");
    }

    @Override // com.teslamotors.plugins.ble.d
    public boolean y() {
        return this.f22236s != null;
    }

    @Override // com.teslamotors.plugins.ble.d
    public void z(String str) {
        BLEService.i0("BLEVehicleController", String.format("[%s] (%s) %s", f0.f(this.f22221d), Integer.valueOf(hashCode()), str));
    }
}