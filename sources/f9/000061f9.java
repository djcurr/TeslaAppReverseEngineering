package com.teslamotors.plugins.ble;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.stripe.android.networking.FraudDetectionData;
import com.tesla.logging.a;
import com.teslamotors.plugins.ble.c;
import com.teslamotors.plugins.ble.card.OemWalletProvider;
import gv.m;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import yu.z;
import zu.a0;
import zu.f0;
import zu.q;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: v */
    private static volatile b f22152v;

    /* renamed from: w */
    private static final com.tesla.logging.g f22153w = com.tesla.logging.g.g("BLEModuleHelper");

    /* renamed from: x */
    public static final Map<String, cu.b> f22154x = new HashMap();

    /* renamed from: b */
    private final Context f22156b;

    /* renamed from: c */
    private final z f22157c;

    /* renamed from: d */
    private Messenger f22158d;

    /* renamed from: e */
    private final Messenger f22159e;

    /* renamed from: f */
    private boolean f22160f;

    /* renamed from: g */
    private Promise f22161g;

    /* renamed from: h */
    private Promise f22162h;

    /* renamed from: i */
    private final Map<Integer, Promise> f22163i;

    /* renamed from: j */
    private final Handler f22164j;

    /* renamed from: l */
    private BluetoothManager f22166l;

    /* renamed from: m */
    private BluetoothAdapter f22167m;

    /* renamed from: n */
    private boolean f22168n;

    /* renamed from: o */
    private String f22169o;

    /* renamed from: p */
    private final zs.a f22170p;

    /* renamed from: q */
    private boolean f22171q;

    /* renamed from: r */
    private String f22172r;

    /* renamed from: s */
    private String f22173s;

    /* renamed from: a */
    private final BroadcastReceiver f22155a = new a();

    /* renamed from: k */
    private final AtomicInteger f22165k = new AtomicInteger(1);

    /* renamed from: t */
    final cz.e<Pair<String, cu.b>> f22174t = cz.b.W().U();

    /* renamed from: u */
    private final ServiceConnection f22175u = new ServiceConnectionC0405b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a extends BroadcastReceiver {
        a() {
            b.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            com.tesla.logging.g gVar = b.f22153w;
            gVar.i("Received action: " + action);
            action.hashCode();
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 10) {
                    b.f22153w.i("Bluetooth adapter is OFF");
                    mv.c.f39466a.d();
                    b.this.M(null);
                } else if (intExtra != 12) {
                    return;
                }
                b.f22153w.i("Bluetooth adapter is ON");
                mv.c.f39466a.e();
                b.this.M(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.teslamotors.plugins.ble.b$b */
    /* loaded from: classes6.dex */
    public class ServiceConnectionC0405b implements ServiceConnection {
        ServiceConnectionC0405b() {
            b.this = r1;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.f22158d = new Messenger(iBinder);
            b.this.f22160f = true;
            Message obtain = Message.obtain();
            obtain.what = nv.c.Register.getWhat();
            b.this.u0(obtain);
            b bVar = b.this;
            bVar.a0(bVar.f22168n);
            if (b.this.f22168n) {
                return;
            }
            b.Z("BLEService was bound when event subscriptions weren't ready");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f22160f = false;
            b.this.f22158d = null;
        }
    }

    /* loaded from: classes6.dex */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f22178a;

        static {
            int[] iArr = new int[nv.c.values().length];
            f22178a = iArr;
            try {
                iArr[nv.c.ClearPeripheralsResult.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22178a[nv.c.ScanForPeripheralsResult.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22178a[nv.c.CommandResult.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22178a[nv.c.VehicleStatusMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22178a[nv.c.SwitchProductMessage.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22178a[nv.c.VehicleEventMessage.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22178a[nv.c.RegisterComplete.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22178a[nv.c.ReceivedBLEData.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class d extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Looper looper) {
            super(looper);
            b.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            data.setClassLoader(d.class.getClassLoader());
            switch (c.f22178a[nv.c.get(message.what).ordinal()]) {
                case 1:
                    b.this.d0((nv.a) data.getParcelable(nv.c.ClearPeripheralsResult.getKey()));
                    return;
                case 2:
                    b.this.g0((nv.i) data.getParcelable(nv.c.ScanForPeripheralsResult.getKey()));
                    return;
                case 3:
                    b.this.e0((nv.a) data.getParcelable(nv.c.CommandResult.getKey()));
                    return;
                case 4:
                    b.this.i0((nv.j) data.getParcelable(nv.c.VehicleStatusMessage.getKey()));
                    return;
                case 5:
                    b.this.f0((nv.g) data.getParcelable(nv.c.SwitchProductMessage.getKey()));
                    return;
                case 6:
                    b.this.h0((nv.h) data.getParcelable(nv.c.VehicleEventMessage.getKey()));
                    return;
                case 7:
                    b.this.M(null);
                    return;
                case 8:
                    byte[] byteArray = data.getByteArray(nv.c.ReceivedBLEData.getKey());
                    if (byteArray != null && byteArray.length > 0) {
                        gv.h.b(new c.b(byteArray));
                        return;
                    } else {
                        b.f22153w.c("SendBLEData received null or length zero bytes!");
                        return;
                    }
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class e {

        /* renamed from: a */
        public final boolean f22180a;

        /* renamed from: b */
        public final String f22181b;

        /* renamed from: c */
        public final boolean f22182c;

        /* renamed from: d */
        public final String f22183d;

        /* renamed from: e */
        public final String f22184e;

        public e(boolean z11, String str, boolean z12, String str2, String str3) {
            this.f22180a = z11;
            this.f22181b = str;
            this.f22182c = z12;
            this.f22183d = str2;
            this.f22184e = str3;
        }
    }

    private b(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f22156b = applicationContext;
        this.f22157c = z.p(applicationContext);
        Looper mainLooper = applicationContext.getMainLooper();
        this.f22159e = new Messenger(new d(mainLooper));
        this.f22163i = new ConcurrentHashMap();
        this.f22164j = new Handler(mainLooper);
        this.f22170p = zs.a.l();
        O(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void D(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L7b
            int r2 = r6.length()
            if (r2 != 0) goto Lb
            goto L7b
        Lb:
            boolean r2 = r5.f22171q
            if (r2 != 0) goto L7a
            zs.a r2 = r5.f22170p     // Catch: java.lang.Exception -> L74
            android.content.Context r3 = r5.f22156b     // Catch: java.lang.Exception -> L74
            java.security.KeyPair r2 = r2.n(r6, r3)     // Catch: java.lang.Exception -> L74
            if (r2 != 0) goto L39
            java.lang.String r2 = "Generating key pair for "
            Z(r2)
            java.security.KeyPair r2 = zs.a.k()     // Catch: java.lang.Exception -> L32
            zs.a r3 = r5.f22170p
            android.content.Context r4 = r5.f22156b
            boolean r6 = r3.v(r2, r6, r4)
            if (r6 != 0) goto L3e
            java.lang.String r6 = "[TMBLE] Unable to store local key pair"
            Z(r6)
            goto L3f
        L32:
            r6 = move-exception
            java.lang.String r0 = "Unrecoverable failure trying to generate local key pair"
            Y(r0, r6)
            return
        L39:
            java.lang.String r6 = "Found key pair"
            Z(r6)
        L3e:
            r1 = r2
        L3f:
            if (r1 == 0) goto L7a
            r6 = 1
            r5.f22171q = r6
            java.security.PublicKey r6 = r1.getPublic()
            byte[] r6 = zs.a.t(r6)
            java.lang.String r6 = zu.f0.b(r6)
            r5.f22173s = r6
            java.security.PublicKey r6 = r1.getPublic()
            r1 = 20
            byte[] r6 = zs.a.q(r6, r1)
            java.lang.String r6 = zu.f0.b(r6)
            int r1 = r6.length()
            r2 = 8
            if (r1 < r2) goto L7a
            android.content.Context r1 = r5.f22156b
            yu.b.B(r6, r1)
            java.lang.String r6 = r6.substring(r0, r2)
            r5.f22172r = r6
            goto L7a
        L74:
            r6 = move-exception
            java.lang.String r0 = "Unrecoverable failure trying to get local key pair"
            Y(r0, r6)
        L7a:
            return
        L7b:
            r5.f22171q = r0
            r5.f22173s = r1
            r5.f22172r = r1
            android.content.Context r6 = r5.f22156b
            java.lang.String r0 = ""
            yu.b.B(r0, r6)
            r5.G0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.b.D(java.lang.String):void");
    }

    private void E0() {
        if (this.f22160f) {
            Message obtain = Message.obtain();
            obtain.what = nv.c.Unregister.getWhat();
            u0(obtain);
            this.f22156b.unbindService(this.f22175u);
            this.f22160f = false;
        }
        gv.g.b(this.f22156b);
        gv.g.a(this.f22156b);
        this.f22156b.stopService(new Intent(this.f22156b, BLEService.class));
    }

    private void F(int i11, String str, Promise promise) {
        if (promise == null) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("id", i11);
        writableNativeMap.putBoolean("success", false);
        writableNativeMap.putString("error", str);
        promise.resolve(writableNativeMap);
    }

    private void G0() {
        jv.a.a().b(this.f22156b);
        OemWalletProvider supportedProvider = OemWalletProvider.getSupportedProvider(this.f22156b);
        if (supportedProvider != null) {
            supportedProvider.withdrawAllCard(this.f22156b);
        }
        mv.d.a();
    }

    public static b I(Context context, String str) {
        if (f22152v == null) {
            synchronized (b.class) {
                if (f22152v == null) {
                    f22152v = new b(context, str);
                }
            }
        }
        return f22152v;
    }

    private WritableMap J(nv.e eVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (eVar != null) {
            for (Map.Entry<String, nv.d> entry : eVar.f41898a.entrySet()) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                nv.d value = entry.getValue();
                writableNativeMap2.putString("name", value.f41894a);
                writableNativeMap2.putBoolean("connected", value.f41895b);
                writableNativeMap2.putString("identifier", value.f41896c);
                writableNativeMap2.putInt("rssi", value.f41897d);
                writableNativeMap.putMap(entry.getKey(), writableNativeMap2);
            }
        }
        return writableNativeMap;
    }

    private WritableMap L() {
        e K = K();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("bluetooth_enabled", K.f22180a);
        writableNativeMap.putString("bluetooth_authorization", K.f22181b);
        writableNativeMap.putBoolean("local_key_pair", K.f22182c);
        writableNativeMap.putString("public_key_id", K.f22183d);
        writableNativeMap.putString("public_key", K.f22184e);
        return writableNativeMap;
    }

    private void P() {
        if (this.f22166l == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) this.f22156b.getSystemService("bluetooth");
            this.f22166l = bluetoothManager;
            if (bluetoothManager == null) {
                Z("Unable to initialize BluetoothManager.");
            }
        }
        BluetoothAdapter adapter = this.f22166l.getAdapter();
        this.f22167m = adapter;
        if (adapter == null) {
            Z("Unable to obtain a BluetoothAdapter.");
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.f22156b.registerReceiver(this.f22155a, intentFilter);
        }
        mv.c.f39466a.b(this.f22167m);
    }

    public static boolean Q(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        return (runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance > 100) ? false : true;
    }

    public /* synthetic */ void U(int i11) {
        if (this.f22163i.containsKey(Integer.valueOf(i11))) {
            F(i11, "PHONE_KEY_COMMAND_TIMEOUT", this.f22163i.remove(Integer.valueOf(i11)));
        }
    }

    public /* synthetic */ void V(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        f22153w.i("BLEService should be stopped, restarting it");
        B0(str, str2, str3, readableArray, promise);
    }

    public /* synthetic */ Object W(byte[] bArr) {
        try {
            new qu.h(this.f22156b.getApplicationContext()).d(wt.c.f56177d.decode(bArr));
        } catch (IOException e11) {
            f22153w.d("Error decoding ReportRequest", e11);
        }
        return new Object();
    }

    private static void Y(String str, Exception exc) {
        f22153w.d(String.format("[TMBLE Module Error] %s", str), exc);
    }

    public static void Z(String str) {
        f22153w.i(String.format("[TMBLE Module] %s", str));
    }

    public static /* synthetic */ Object a(b bVar, byte[] bArr) {
        return bVar.W(bArr);
    }

    public static /* synthetic */ void b(b bVar, int i11) {
        bVar.U(i11);
    }

    private int b0() {
        return this.f22165k.getAndAdd(1);
    }

    public static /* synthetic */ void c(b bVar, String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        bVar.V(str, str2, str3, readableArray, promise);
    }

    public void d0(nv.a aVar) {
        if (this.f22162h != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("success", aVar.f41889a == lv.b.OK);
            this.f22162h.resolve(writableNativeMap);
            this.f22162h = null;
        }
    }

    public void e0(nv.a aVar) {
        int i11 = aVar.f41891c;
        if (!this.f22163i.containsKey(Integer.valueOf(i11))) {
            Z(String.format("Got command result of %s - %s for ID %s with no associated promise", aVar.f41889a.name(), aVar.f41890b, Integer.valueOf(i11)));
            return;
        }
        Z(String.format("Got command result of %s - %s for ID %s", aVar.f41889a.name(), aVar.f41890b, Integer.valueOf(i11)));
        this.f22164j.removeCallbacksAndMessages(Integer.valueOf(i11));
        if (aVar.f41889a == lv.b.WAIT) {
            p(i11);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("id", i11);
        writableNativeMap.putBoolean("success", aVar.f41889a == lv.b.OK);
        writableNativeMap.putString("error", aVar.f41890b);
        String str = aVar.f41892d;
        if (str != null) {
            writableNativeMap.putString("result", str);
        }
        Promise remove = this.f22163i.remove(Integer.valueOf(i11));
        if (remove != null) {
            remove.resolve(writableNativeMap);
            return;
        }
        com.tesla.logging.g gVar = f22153w;
        gVar.c("Command promise " + i11 + " not found to process result" + aVar);
    }

    public void f0(nv.g gVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("vin", gVar.a());
        com.tesla.logging.a.b(a.EnumC0395a.BLE_PRODUCT_SWITCH, writableNativeMap);
    }

    public void g0(nv.i iVar) {
        if (this.f22161g != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("total_found", iVar.f41906c);
            writableNativeMap.putString("error", iVar.f41905b);
            writableNativeMap.putBoolean("success", iVar.f41904a);
            writableNativeMap.putMap("peripherals", J(iVar.f41907d));
            this.f22161g.resolve(writableNativeMap);
            this.f22161g = null;
        }
    }

    public void h0(nv.h hVar) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("vin", hVar.f41903b);
        writableNativeMap.putString("event_name", hVar.f41902a);
        com.tesla.logging.a.b(a.EnumC0395a.BLE_VEHICLE_EVENT, writableNativeMap);
    }

    public void i0(nv.j jVar) {
        Context context = this.f22156b;
        if (context != null && com.tesla.logging.f.c(context)) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            Integer num = jVar.f41908a;
            boolean z11 = false;
            writableNativeMap2.putInt("df", num == null ? 0 : num.intValue());
            Integer num2 = jVar.f41910c;
            writableNativeMap2.putInt("dr", num2 == null ? 0 : num2.intValue());
            Integer num3 = jVar.f41909b;
            writableNativeMap2.putInt("pf", num3 == null ? 0 : num3.intValue());
            Integer num4 = jVar.f41911d;
            writableNativeMap2.putInt("pr", num4 == null ? 0 : num4.intValue());
            Boolean bool = jVar.f41912e;
            writableNativeMap2.putBoolean("ft", bool != null && bool.booleanValue());
            Boolean bool2 = jVar.f41913f;
            writableNativeMap2.putBoolean("rt", bool2 != null && bool2.booleanValue());
            Boolean bool3 = jVar.f41914g;
            if (bool3 != null && bool3.booleanValue()) {
                z11 = true;
            }
            writableNativeMap2.putBoolean("cp", z11);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (String str : jVar.A) {
                writableNativeArray.pushString(str);
            }
            writableNativeMap2.putBoolean("locked", jVar.f41916i);
            writableNativeMap.putMap("peripherals", J(jVar.f41929z));
            writableNativeMap.putBoolean("is_connected", jVar.f41927x);
            writableNativeMap.putString("command_peripheral", jVar.f41928y);
            writableNativeMap.putMap("closure_state", writableNativeMap2);
            writableNativeMap.putInt("permissions", jVar.f41923p);
            writableNativeMap.putString("vin", jVar.f41918k);
            writableNativeMap.putDouble(FraudDetectionData.KEY_TIMESTAMP, jVar.f41924q);
            writableNativeMap.putArray("whitelist_keys", writableNativeArray);
            writableNativeMap.putBoolean("whitelist_has_key", jVar.f41919l);
            writableNativeMap.putDouble("whitelist_timestamp", jVar.f41925t);
            writableNativeMap.putBoolean("remote_key_pair", jVar.f41920m);
            writableNativeMap.putBoolean("shared_secret", jVar.f41921n);
            writableNativeMap.putInt("session_counter", (int) jVar.f41922o);
            com.tesla.logging.a.b(a.EnumC0395a.BLE_VEHICLE_STATUS, writableNativeMap);
        }
        cu.b a11 = mv.b.a(jVar);
        f22154x.put(jVar.f41918k, a11);
        this.f22174t.b(new Pair<>(jVar.f41918k, a11));
    }

    private static ArrayList<String> k0(ReadableArray readableArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(readableArray.toArrayList());
        return arrayList;
    }

    private void p(final int i11) {
        this.f22164j.removeCallbacksAndMessages(Integer.valueOf(i11));
        this.f22164j.postAtTime(new Runnable() { // from class: gv.b
            {
                com.teslamotors.plugins.ble.b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.teslamotors.plugins.ble.b.b(com.teslamotors.plugins.ble.b.this, i11);
            }
        }, Integer.valueOf(i11), SystemClock.uptimeMillis() + 6000);
    }

    private c.a.C0406a.EnumC0407a r0(Message message) {
        Messenger messenger;
        boolean z11 = this.f22160f;
        if (z11 && (messenger = this.f22158d) != null) {
            try {
                message.replyTo = this.f22159e;
                messenger.send(message);
                return null;
            } catch (RemoteException unused) {
                return c.a.C0406a.EnumC0407a.SERVICE_REMOTE_EXCEPTION;
            }
        } else if (!z11) {
            return c.a.C0406a.EnumC0407a.SERVICE_NOT_BOUND;
        } else {
            if (this.f22158d == null) {
                return c.a.C0406a.EnumC0407a.SERVICE_NULL;
            }
            return null;
        }
    }

    private Integer s0(nv.c cVar, Promise promise) {
        int b02 = b0();
        Message obtain = Message.obtain();
        obtain.what = cVar.getWhat();
        obtain.arg1 = b02;
        if (u0(obtain)) {
            this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
            p(obtain.arg1);
        } else {
            F(b02, "BLE_SERVICE_NOT_CONNECTED", promise);
        }
        return Integer.valueOf(b02);
    }

    public boolean u0(Message message) {
        Messenger messenger;
        if (this.f22160f && (messenger = this.f22158d) != null) {
            try {
                message.replyTo = this.f22159e;
                messenger.send(message);
                return true;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    @ReactMethod
    public int A(Promise promise, ot.g gVar) {
        int b02 = b0();
        Message obtain = Message.obtain();
        obtain.what = nv.c.OpenDoor.getWhat();
        obtain.arg1 = b02;
        obtain.arg2 = gVar.getValue();
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
        return b02;
    }

    @ReactMethod
    public void A0() {
        Message obtain = Message.obtain();
        obtain.what = nv.c.StartMonitoringRSSI.getWhat();
        u0(obtain);
    }

    @ReactMethod
    public int B(Promise promise) {
        return s0(nv.c.OpenTrunk, promise).intValue();
    }

    @ReactMethod
    public void B0(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", C0(str, str2, str3, k0(readableArray), "from ReactMethod: BLEModuleHelper#startService"));
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public int C(Promise promise) {
        return s0(nv.c.UnlockCar, promise).intValue();
    }

    public boolean C0(String str, String str2, String str3, ArrayList<String> arrayList, String str4) {
        com.tesla.logging.g gVar = f22153w;
        gVar.i("BLEModuleHelper#startService called with reason: " + str4);
        if (!a0.b(this.f22156b)) {
            Z("BLUETOOTH_CONNECT or BLUETOOTH_SCAN wasn't granted, skip startService");
            return false;
        }
        Intent intent = new Intent(this.f22156b, BLEService.class);
        intent.putStringArrayListExtra("VINS", arrayList);
        intent.putExtra("SELECTED_VIN", str);
        intent.putExtra("ACCOUNT_EMAIL", str2);
        intent.putExtra("VEHICLE_NAME", str3);
        ArrayList arrayList2 = new ArrayList(this.f22157c.y());
        ArrayList arrayList3 = new ArrayList();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (arrayList2.contains(next)) {
                arrayList3.add(next);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && m.b(this.f22156b, arrayList3, str2)) {
            if (!q.a() && i11 >= 31 && !Q(this.f22156b)) {
                f22153w.i("NOT Starting BLE as foreground service from background on API 31+");
                return false;
            }
            f22153w.i("Starting BLE as foreground service");
            intent.putExtra("SERVICE_IN_FOREGROUND", true);
            this.f22156b.startForegroundService(intent);
            return this.f22156b.bindService(intent, this.f22175u, 1);
        } else if (Q(this.f22156b)) {
            f22153w.i("Starting BLE service (not foreground service) because app is in foreground.");
            this.f22156b.startService(intent);
            return this.f22156b.bindService(intent, this.f22175u, 1);
        } else {
            return false;
        }
    }

    @ReactMethod
    public void D0() {
        Message obtain = Message.obtain();
        obtain.what = nv.c.StopMonitoringRSSI.getWhat();
        u0(obtain);
    }

    @ReactMethod
    public void E(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(this.f22170p.e(str, this.f22156b)));
        } catch (Exception e11) {
            f22153w.d("Failed to delete RSA keys", e11);
            promise.resolve(Boolean.FALSE);
        }
    }

    @ReactMethod
    public void F0(String str, String str2, String str3, Promise promise) {
        String replace = str2.replaceAll("\\n", "").replaceAll("\\r", "").replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "");
        String replace2 = str.replaceAll("\\n", "").replaceAll("\\r", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", new BouncyCastleProvider());
            boolean w11 = this.f22170p.w(new KeyPair((RSAPublicKey) keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(replace2, 2))), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(replace, 2)))), str3, this.f22156b);
            Z("[TMCRYPTO] Stored RSA keypair: " + w11);
            if (!w11) {
                str = "";
                str2 = str;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("privateKey", str2);
            writableNativeMap.putString("publicKey", str);
            promise.resolve(writableNativeMap);
        } catch (Exception e11) {
            f22153w.d("Failed to decode RSA keys", e11);
            promise.reject(new Throwable("Failed to decode RSA keys", e11));
        }
    }

    public void G() {
        Z("Fetching BLE status for widget");
        Message obtain = Message.obtain();
        obtain.what = nv.c.WidgetFetchStatus.getWhat();
        u0(obtain);
    }

    @ReactMethod
    public void H(String str, Promise promise) {
        Message obtain = Message.obtain();
        nv.c cVar = nv.c.GetEpochSessionInfo;
        obtain.what = cVar.getWhat();
        obtain.arg1 = b0();
        Bundle bundle = new Bundle();
        bundle.putString(cVar.getKey(), str);
        obtain.setData(bundle);
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
    }

    public void H0(boolean z11) {
        ct.i.i().t("svc-background-permission", String.valueOf(z11));
        Message obtain = Message.obtain();
        obtain.what = nv.c.UpdateBackgroundServicePermission.getWhat();
        Bundle bundle = new Bundle();
        bundle.putBoolean("svc-background-permission", z11);
        obtain.setData(bundle);
        u0(obtain);
    }

    @ReactMethod
    public void I0(Promise promise) {
        Message obtain = Message.obtain();
        obtain.what = nv.c.GetWhiteslistUpdate.getWhat();
        obtain.arg1 = b0();
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
    }

    public e K() {
        boolean R = R();
        String str = this.f22167m == null ? "not_determined" : "authorized";
        boolean z11 = this.f22171q;
        return new e(R, str, z11, z11 ? this.f22172r : null, z11 ? this.f22173s : null);
    }

    @ReactMethod
    public void M(Promise promise) {
        Message obtain = Message.obtain();
        obtain.what = nv.c.GetStatus.getWhat();
        u0(obtain);
        com.tesla.logging.a.b(a.EnumC0395a.BLE_SYSTEM_STATUS, L());
        if (promise != null) {
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void N(String str, Promise promise) {
        Message obtain = Message.obtain();
        nv.c cVar = nv.c.GetTokenForKey;
        obtain.what = cVar.getWhat();
        obtain.arg1 = b0();
        Bundle bundle = new Bundle();
        bundle.putString(cVar.getKey(), str);
        obtain.setData(bundle);
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
    }

    public void O(Context context, String str) {
        String str2;
        String str3;
        P();
        ArrayList<String> arrayList = new ArrayList<>(this.f22157c.y());
        String h11 = this.f22157c.h();
        if (arrayList.size() > 0) {
            String str4 = arrayList.get(0);
            str2 = this.f22157c.C(str4);
            str3 = str4;
        } else {
            str2 = null;
            str3 = null;
        }
        D(h11);
        if (a0.b(context) && m.c(this.f22156b, str3, h11)) {
            try {
                C0(str3, h11, str2, arrayList, "from BLEModuleHelper#initialize: reason: " + str);
            } catch (Exception e11) {
                String format = String.format("PRE-LAUNCH: [TMBLE Module] initialize(), Not Starting service - vin: %s account: %s, exception: %s", f0.f(str3), f0.e(h11), e11.getMessage());
                this.f22169o = format;
                f22153w.c(format);
            }
        }
    }

    public boolean R() {
        return mv.c.f39466a.a(this.f22167m);
    }

    public boolean S() {
        return this.f22158d != null && this.f22160f;
    }

    public boolean T() {
        return this.f22158d != null;
    }

    @ReactMethod
    public void X(String str, Promise promise) {
        try {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            KeyPair o11 = this.f22170p.o(str, this.f22156b);
            if (o11 == null) {
                writableNativeMap.putString("privateKey", "");
                writableNativeMap.putString("publicKey", "");
                promise.resolve(writableNativeMap);
                return;
            }
            String encodeToString = Base64.encodeToString(o11.getPrivate().getEncoded(), 2);
            writableNativeMap.putString("privateKey", "-----BEGIN PRIVATE KEY-----\n\r" + encodeToString + "\n\r-----END PRIVATE KEY-----\n\r");
            writableNativeMap.putString("publicKey", "-----BEGIN PUBLIC KEY-----\n\r" + Base64.encodeToString(((RSAPublicKey) o11.getPublic()).getEncoded(), 2) + "\n\r-----END PUBLIC KEY-----\n\r");
            promise.resolve(writableNativeMap);
        } catch (Exception e11) {
            f22153w.d("Failed to load RSA keys", e11);
            promise.reject(new Throwable("Failed to load RSA keys", e11));
        }
    }

    @ReactMethod
    public void a0(boolean z11) {
        String str;
        this.f22168n = z11;
        if (z11 && (str = this.f22169o) != null) {
            Z(str);
            this.f22169o = null;
        }
        Message obtain = Message.obtain();
        nv.c cVar = nv.c.SetEventSubscriptionsReady;
        obtain.what = cVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putBoolean(cVar.getKey(), this.f22168n);
        obtain.setData(bundle);
        if (u0(obtain) || !z11) {
            return;
        }
        Z("Failed to notify service that event subscriptions were ready");
    }

    public void c0() {
        if (this.f22160f) {
            Message obtain = Message.obtain();
            obtain.what = nv.c.Unregister.getWhat();
            u0(obtain);
            this.f22156b.unbindService(this.f22175u);
            this.f22160f = false;
        }
        this.f22156b.unregisterReceiver(this.f22155a);
    }

    @ReactMethod
    public void j0() {
        if (this.f22160f) {
            Message obtain = Message.obtain();
            obtain.what = nv.c.PromoteServiceToForeground.getWhat();
            u0(obtain);
        }
    }

    @ReactMethod
    public void l0(Promise promise) {
        Message obtain = Message.obtain();
        obtain.what = nv.c.RemoveFromWhitelist.getWhat();
        obtain.arg1 = b0();
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
    }

    @ReactMethod
    public void m0() {
        Message obtain = Message.obtain();
        obtain.what = nv.c.RequestMTU.getWhat();
        u0(obtain);
    }

    @ReactMethod
    public void n0() {
        Message obtain = Message.obtain();
        obtain.what = nv.c.ResetCommandPeripheral.getWhat();
        u0(obtain);
    }

    public void o0(final String str, final String str2, final String str3, final ReadableArray readableArray, final Promise promise) {
        com.tesla.logging.g gVar = f22153w;
        gVar.i("Restarting BLEService");
        gVar.i("Try to stop service to restart");
        E0();
        this.f22164j.postDelayed(new Runnable() { // from class: gv.c
            {
                com.teslamotors.plugins.ble.b.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.teslamotors.plugins.ble.b.c(com.teslamotors.plugins.ble.b.this, str, str2, str3, readableArray, promise);
            }
        }, 100L);
    }

    @ReactMethod
    public void p0(String str, boolean z11, int i11, Promise promise) {
        this.f22161g = promise;
        Message obtain = Message.obtain();
        nv.c cVar = nv.c.ScanForPeripherals;
        obtain.what = cVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putString(cVar.getKey(), str);
        obtain.setData(bundle);
        obtain.arg1 = z11 ? 1 : 0;
        obtain.arg2 = i11;
        if (u0(obtain) || this.f22161g == null) {
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("success", false);
        writableNativeMap.putString("error", "scanning_failure");
        this.f22161g.resolve(writableNativeMap);
        this.f22161g = null;
        O(this.f22156b, "from BLEModuleHelper#scanForPeripeherals");
    }

    @ReactMethod
    public void q(Promise promise) {
        Message obtain = Message.obtain();
        obtain.what = nv.c.AddToWhitelist.getWhat();
        obtain.arg1 = b0();
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
    }

    @ReactMethod
    public int q0(String str, Promise promise) {
        Message obtain = Message.obtain();
        nv.c cVar = nv.c.SendBLEDataLegacy;
        obtain.what = cVar.getWhat();
        int b02 = b0();
        obtain.arg1 = b02;
        Bundle bundle = new Bundle();
        bundle.putString(cVar.getKey(), str);
        obtain.setData(bundle);
        u0(obtain);
        this.f22163i.put(Integer.valueOf(b02), promise);
        p(b02);
        return b02;
    }

    @ReactMethod
    public void r(Promise promise) {
        Message obtain = Message.obtain();
        obtain.what = nv.c.CancelExternalAuthenticate.getWhat();
        obtain.arg1 = b0();
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
    }

    @ReactMethod
    public void s(String str, Promise promise) {
        Message obtain = Message.obtain();
        nv.c cVar = nv.c.ClearPeripherals;
        obtain.what = cVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putString(cVar.getKey(), str);
        obtain.setData(bundle);
        boolean u02 = u0(obtain);
        this.f22162h = promise;
        if (u02) {
            return;
        }
        z p11 = z.p(this.f22156b);
        p11.L(str, p11.h(), new HashSet());
        if (this.f22162h != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putBoolean("success", true);
            this.f22162h.resolve(writableNativeMap);
            this.f22162h = null;
        }
        G0();
    }

    @ReactMethod
    public int t(Promise promise) {
        return s0(nv.c.CloseChargePort, promise).intValue();
    }

    public int t0(String str, byte[] bArr) {
        Message obtain = Message.obtain();
        nv.c cVar = nv.c.SendBLEData;
        obtain.what = cVar.getWhat();
        int b02 = b0();
        obtain.arg1 = b02;
        Bundle bundle = new Bundle();
        bundle.putByteArray(cVar.getKey(), bArr);
        obtain.setData(bundle);
        c.a.C0406a.EnumC0407a r02 = r0(obtain);
        if (r02 != null) {
            gv.h.b(new c.a.C0406a(str, r02));
        }
        return b02;
    }

    @ReactMethod
    public int u(Promise promise, ot.g gVar) {
        int b02 = b0();
        Message obtain = Message.obtain();
        obtain.what = nv.c.CloseDoor.getWhat();
        obtain.arg1 = b02;
        obtain.arg2 = gVar.getValue();
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
        return b02;
    }

    @ReactMethod
    public int v(Promise promise) {
        return s0(nv.c.CloseDoorsAndLock, promise).intValue();
    }

    @ReactMethod
    public void v0(Promise promise) {
        Message obtain = Message.obtain();
        obtain.what = nv.c.SendNullAuthResponse.getWhat();
        obtain.arg1 = b0();
        u0(obtain);
        this.f22163i.put(Integer.valueOf(obtain.arg1), promise);
        p(obtain.arg1);
    }

    @ReactMethod
    public int w(Promise promise) {
        return s0(nv.c.OpenFrunk, promise).intValue();
    }

    public void w0(final byte[] bArr) {
        Message obtain = Message.obtain();
        nv.c cVar = nv.c.SendReportServiceRequest;
        obtain.what = cVar.getWhat();
        Bundle bundle = new Bundle();
        bundle.putByteArray(cVar.getKey(), bArr);
        obtain.setData(bundle);
        if (u0(obtain)) {
            return;
        }
        hy.b.e(new Callable() { // from class: gv.d
            {
                com.teslamotors.plugins.ble.b.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.teslamotors.plugins.ble.b.a(com.teslamotors.plugins.ble.b.this, bArr);
            }
        }).i(bz.a.c()).f();
    }

    @ReactMethod
    public int x(Promise promise) {
        return s0(nv.c.LockCar, promise).intValue();
    }

    @ReactMethod
    public void x0(String str) {
        D(str);
        z.p(this.f22156b).I(str);
        if (this.f22160f) {
            Message obtain = Message.obtain();
            nv.c cVar = nv.c.SetAccountEmail;
            obtain.what = cVar.getWhat();
            Bundle bundle = new Bundle();
            bundle.putString(cVar.getKey(), str);
            obtain.setData(bundle);
            u0(obtain);
        }
    }

    @ReactMethod
    public int y(Promise promise) {
        return s0(nv.c.OpenAllDoors, promise).intValue();
    }

    @ReactMethod
    public void y0(String str, String str2, ReadableArray readableArray) {
        String h11 = z.p(this.f22156b).h();
        if (this.f22160f) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            arrayList.add(str2);
            Message obtain = Message.obtain();
            nv.c cVar = nv.c.SetVin;
            obtain.what = cVar.getWhat();
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(cVar.getKey(), arrayList);
            bundle.putStringArrayList(cVar.getKey2(), k0(readableArray));
            obtain.setData(bundle);
            u0(obtain);
            return;
        }
        C0(str, h11, str2, k0(readableArray), "from ReactMethod: BLEModuleHelper#setSelectedVin");
    }

    @ReactMethod
    public int z(Promise promise) {
        return s0(nv.c.OpenChargePort, promise).intValue();
    }

    @ReactMethod
    public void z0(boolean z11) {
        Message obtain = Message.obtain();
        obtain.what = nv.c.SetConnectionBehaviorWhenUnauthorized.getWhat();
        obtain.arg1 = z11 ? 1 : 0;
        u0(obtain);
    }
}