package com.teslamotors.plugins.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Keep;
import bu.p0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import zu.a0;
import zu.f0;

@Keep
/* loaded from: classes6.dex */
public class Peripheral {
    public static final int BACKGROUND_CONNECT_TIMEOUT_MS = 10000;
    private static final int COMMAND_QUEUE_SIZE = 10;
    public static final int COMMAND_TIMEOUT_DURATION_MS = 6000;
    public static final int DEFAULT_RSSI = -1000;
    private static final int DELAY_AFTER_ERROR = 2000;
    private static final int DELAY_AFTER_NORMAL_DISCONNECT = 500;
    private static final int FIND_SERVICES_INTERVAL_MS = 10000;
    private static final int MAX_FIND_SERVICE_FAILURE_COUNT = 4;
    private static final int MAX_INDICATION_RETRY_NUMBER = 3;
    private static final int MAX_RX_BUFFER_SIZE = 452;
    public static final int PERIPHERAL_DISCONNECTION_TIMEOUT = 3500;
    public static final int RECONNECTION_TIMEOUT_MS = 5000;
    private static final int SET_MTU_INTERVAL_MS = 3000;
    private Long createdTimestamp;
    private BluetoothGattService gattService;
    private String hashedId;
    private boolean mAuthenticated;
    private BluetoothAdapter mBluetoothAdapter;
    private final Context mContext;
    private final WeakReference<com.teslamotors.plugins.ble.d> mController;
    private BluetoothGatt mGatt;
    private Handler mHandler;
    private final String mPosition;
    private final String originalAddress;
    private volatile int rssi;
    private volatile long backgroundConnectTime = 0;
    private int indicationAttempts = 0;
    private final byte[] rxBuffer = new byte[MAX_RX_BUFFER_SIZE];
    private int rxSoFar = 0;
    private int rxExpected = 0;
    private Long connectedTimestamp = 0L;
    private Long disconnectedTimestamp = 0L;
    private Queue<v3.d<byte[], String>> mCommandQueue = new ArrayBlockingQueue(10);
    private final BluetoothGattCallback mGattCallback = new b();
    private AtomicBoolean mIsConnected = new AtomicBoolean(false);
    private AtomicLong connectionStartTime = new AtomicLong(0);
    private AtomicBoolean mBusy = new AtomicBoolean(false);
    private AtomicBoolean serviceConnected = new AtomicBoolean(false);
    private AtomicBoolean mtuEstablished = new AtomicBoolean(false);
    private AtomicBoolean mFinished = new AtomicBoolean(false);

    /* loaded from: classes6.dex */
    public class a implements Runnable {
        a() {
            Peripheral.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean isConnected = Peripheral.this.isConnected();
            boolean reconnectionInProgress = Peripheral.this.reconnectionInProgress();
            if (Peripheral.this.getIdentifier() != null && !isConnected && !reconnectionInProgress) {
                BluetoothGatt gatt = Peripheral.this.getGatt();
                if (Peripheral.this.getGatt() != null) {
                    if (!a0.a(Peripheral.this.mContext)) {
                        Peripheral.this.logInfo("BLUETOOTH_CONNECT permission is not granted, cannot reconnect Gatt");
                        return;
                    }
                    if (gatt.connect()) {
                        Peripheral peripheral = Peripheral.this;
                        peripheral.logInfo(String.format("%s - Setting up long connect via mGatt.connect()", peripheral));
                    } else {
                        String format = String.format("Failed to setting up long connect to %s via mGatt.connect()", Peripheral.this);
                        Peripheral.this.logError(format, new Throwable(format));
                    }
                    Peripheral.this.setLastConnectionStartTime(false);
                    return;
                }
                Peripheral.this.createInitialConnection();
                return;
            }
            Peripheral peripheral2 = Peripheral.this;
            peripheral2.logInfo(String.format("%s - Unable to reconnect. isConnected: %s inProgress: %s", peripheral2, Boolean.valueOf(isConnected), Boolean.valueOf(reconnectionInProgress)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b extends BluetoothGattCallback {

        /* loaded from: classes6.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattDescriptor f22102a;

            /* renamed from: b */
            final /* synthetic */ int f22103b;

            a(BluetoothGattDescriptor bluetoothGattDescriptor, int i11) {
                b.this = r1;
                this.f22102a = bluetoothGattDescriptor;
                this.f22103b = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                byte[] value = this.f22102a.getValue();
                boolean equals = Arrays.equals(value, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                Peripheral peripheral = Peripheral.this;
                peripheral.logInfo(String.format("%s - onDescriptorWrite status: 0x%02X, value: %s attempts: %d", peripheral, Integer.valueOf(this.f22103b), f0.b(value), Integer.valueOf(Peripheral.this.indicationAttempts)));
                if (equals && this.f22103b != 0) {
                    if (Peripheral.this.indicationAttempts > 3) {
                        return;
                    }
                    Peripheral.this.requestIndications();
                    return;
                }
                Peripheral.this.mBusy.set(false);
                com.teslamotors.plugins.ble.d dVar = (com.teslamotors.plugins.ble.d) Peripheral.this.mController.get();
                if (dVar != null && dVar.w(Peripheral.this) && Arrays.equals(value, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE)) {
                    Peripheral.this.rxSoFar = 0;
                    Peripheral.this.rxExpected = 0;
                    dVar.t(Peripheral.this);
                }
            }
        }

        /* renamed from: com.teslamotors.plugins.ble.Peripheral$b$b */
        /* loaded from: classes6.dex */
        class RunnableC0404b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22105a;

            /* renamed from: b */
            final /* synthetic */ int f22106b;

            RunnableC0404b(int i11, int i12) {
                b.this = r1;
                this.f22105a = i11;
                this.f22106b = i12;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.teslamotors.plugins.ble.d dVar = (com.teslamotors.plugins.ble.d) Peripheral.this.mController.get();
                if (dVar == null) {
                    return;
                }
                int i11 = this.f22105a;
                String str = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
                Peripheral peripheral = Peripheral.this;
                peripheral.logInfo(String.format("%s - onConnectionStateChange: %s status: 0x%02X", peripheral, str, Integer.valueOf(this.f22106b)));
                int i12 = this.f22105a;
                if (i12 == 0) {
                    Peripheral.this.onConnectionLost("BECAME_DISCONNECTED");
                    Peripheral.this.clearConnectionStartTime();
                    Peripheral.this.getHandler().removeCallbacksAndMessages(Peripheral.this.getIdentifier());
                    if (!Peripheral.this.mFinished.get() && mv.c.f39466a.a(Peripheral.this.mBluetoothAdapter)) {
                        Peripheral.this.reconnect(this.f22106b);
                    } else {
                        Peripheral peripheral2 = Peripheral.this;
                        peripheral2.logInfo(String.format("%s - Disconnected but adapter is not on; doing nothing", peripheral2));
                    }
                } else if (i12 == 2) {
                    if (Peripheral.this.mFinished.get()) {
                        String format = String.format("Got CONNECTED callback for peripheral when 'finished' - %s", Peripheral.this);
                        Peripheral.this.logError(format, new Throwable(format));
                        return;
                    } else if (this.f22106b == 0 && !Peripheral.this.isConnected()) {
                        Peripheral.this.setConnected(true);
                        Peripheral.this.requestMtu();
                    }
                }
                dVar.g(Peripheral.this, this.f22105a);
            }
        }

        /* loaded from: classes6.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22108a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGatt f22109b;

            c(int i11, BluetoothGatt bluetoothGatt) {
                b.this = r1;
                this.f22108a = i11;
                this.f22109b = bluetoothGatt;
            }

            @Override // java.lang.Runnable
            public void run() {
                Peripheral.this.mBusy.set(false);
                int i11 = this.f22108a;
                if (i11 == 0) {
                    Peripheral peripheral = Peripheral.this;
                    peripheral.logInfo(String.format("%s - onServicesDiscovered Success - status: 0x%02X", peripheral, Integer.valueOf(i11)));
                    Peripheral.this.handleService(this.f22109b.getService(com.teslamotors.plugins.ble.a.f22143b));
                    return;
                }
                Peripheral peripheral2 = Peripheral.this;
                peripheral2.logInfo(String.format("%s - onServicesDiscovered FAILURE - status: 0x%02X", peripheral2, Integer.valueOf(i11)));
            }
        }

        /* loaded from: classes6.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f22111a;

            /* renamed from: b */
            final /* synthetic */ int f22112b;

            d(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
                b.this = r1;
                this.f22111a = bluetoothGattCharacteristic;
                this.f22112b = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.teslamotors.plugins.ble.d dVar = (com.teslamotors.plugins.ble.d) Peripheral.this.mController.get();
                if (dVar == null) {
                    return;
                }
                try {
                    byte[] value = this.f22111a.getValue();
                    Object[] objArr = new Object[1];
                    objArr[0] = Integer.valueOf(value == null ? 0 : value.length);
                    String format = String.format("(%s)", objArr);
                    Peripheral peripheral = Peripheral.this;
                    peripheral.logInfo(String.format("%s - onCharacteristicRead: %s - status 0x%02X", peripheral, format, Integer.valueOf(this.f22112b)));
                    if (com.teslamotors.plugins.ble.a.f22147f.equals(this.f22111a.getUuid())) {
                        byte[] value2 = this.f22111a.getValue();
                        Peripheral peripheral2 = Peripheral.this;
                        peripheral2.logInfo(String.format("%s - Got serial port version: %s", peripheral2, f0.b(value2)));
                        dVar.A(value2);
                        Peripheral.this.mBusy.set(false);
                        Peripheral.this.setServiceConnected(true);
                        dVar.e(Peripheral.this);
                    }
                } catch (Exception e11) {
                    Peripheral peripheral3 = Peripheral.this;
                    peripheral3.logError(String.format("%s - Peripheral characteristic read failed", peripheral3), e11);
                }
            }
        }

        /* loaded from: classes6.dex */
        class e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f22114a;

            /* renamed from: b */
            final /* synthetic */ int f22115b;

            e(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
                b.this = r1;
                this.f22114a = bluetoothGattCharacteristic;
                this.f22115b = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.teslamotors.plugins.ble.d dVar = (com.teslamotors.plugins.ble.d) Peripheral.this.mController.get();
                if (dVar == null) {
                    return;
                }
                try {
                    String b11 = f0.b(this.f22114a.getValue());
                    Peripheral.this.mBusy.set(false);
                    Peripheral.this.checkCommandQueue();
                    String format = String.format("(%s)", Integer.valueOf(b11.length() / 2));
                    int i11 = this.f22115b;
                    if (i11 == 0) {
                        Peripheral peripheral = Peripheral.this;
                        peripheral.logInfo(String.format("%s - onCharacteristicWrite: status 0x%02X, %s", peripheral, Integer.valueOf(i11), format));
                    } else {
                        Peripheral peripheral2 = Peripheral.this;
                        peripheral2.logInfo(String.format("%s - onCharacteristicWrite TRANSMISSION FAILURE: status 0x%02X, %s", peripheral2, Integer.valueOf(i11), format));
                    }
                    int i12 = this.f22115b;
                    dVar.p(i12 == 0, i12 == 0 ? null : "PHONE_KEY_TRANSMISSION_FAILURE", b11, Peripheral.this);
                } catch (Exception e11) {
                    Peripheral.this.logError("Peripheral characteristic write failed", e11);
                }
            }
        }

        /* loaded from: classes6.dex */
        class f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGattCharacteristic f22117a;

            f(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                b.this = r1;
                this.f22117a = bluetoothGattCharacteristic;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.teslamotors.plugins.ble.d dVar = (com.teslamotors.plugins.ble.d) Peripheral.this.mController.get();
                if (dVar == null) {
                    return;
                }
                try {
                    byte[] value = this.f22117a.getValue();
                    String format = String.format("(%s)", Integer.valueOf(value.length));
                    String str = "[complete]";
                    if (Peripheral.this.rxSoFar > 0 && Peripheral.this.rxExpected > 0) {
                        str = String.format("[%d bytes remaining]", Integer.valueOf(Peripheral.this.rxExpected - Peripheral.this.rxSoFar));
                    }
                    if (!dVar.b(Peripheral.this) && !dVar.w(Peripheral.this)) {
                        Peripheral peripheral = Peripheral.this;
                        peripheral.logInfo(String.format("%s - onCharacteristicChanged - Wrong peripheral! ignoring %s", peripheral, format));
                    } else if (value.length == 0) {
                        Peripheral peripheral2 = Peripheral.this;
                        peripheral2.logInfo(String.format("%s - onCharacteristicChanged - got empty data from VCSEC! ignoring %s", peripheral2, format));
                    } else {
                        if (!dVar.b(Peripheral.this) && dVar.w(Peripheral.this)) {
                            Peripheral peripheral3 = Peripheral.this;
                            peripheral3.logInfo(String.format("%s - got onCharacteristicChanged before onDescriptorWrite for indications! Promoting to command peripheral", peripheral3));
                            Peripheral.this.mBusy.set(false);
                            Peripheral.this.rxSoFar = 0;
                            Peripheral.this.rxExpected = 0;
                            dVar.t(Peripheral.this);
                        }
                        Peripheral peripheral4 = Peripheral.this;
                        peripheral4.logInfo(String.format("%s - onCharacteristicChanged - %s - %s", peripheral4, format, str));
                        Peripheral.this.onBytesReceived(value);
                    }
                } catch (Exception e11) {
                    Peripheral.this.logError("FAILED to parse incoming message", e11);
                }
            }
        }

        /* loaded from: classes6.dex */
        class g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f22119a;

            /* renamed from: b */
            final /* synthetic */ int f22120b;

            g(int i11, int i12) {
                b.this = r1;
                this.f22119a = i11;
                this.f22120b = i12;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.teslamotors.plugins.ble.d dVar = (com.teslamotors.plugins.ble.d) Peripheral.this.mController.get();
                if (dVar == null) {
                    return;
                }
                if (this.f22119a == 0) {
                    Peripheral.this.setRssi(this.f22120b);
                } else {
                    Peripheral peripheral = Peripheral.this;
                    peripheral.logInfo(String.format("%s - FAILED to get RSSI", peripheral));
                    Peripheral.this.setRssi(-1000);
                }
                dVar.u(false);
            }
        }

        /* loaded from: classes6.dex */
        class h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f22122a;

            /* renamed from: b */
            final /* synthetic */ int f22123b;

            /* renamed from: c */
            final /* synthetic */ int f22124c;

            h(BluetoothGatt bluetoothGatt, int i11, int i12) {
                b.this = r1;
                this.f22122a = bluetoothGatt;
                this.f22123b = i11;
                this.f22124c = i12;
            }

            @Override // java.lang.Runnable
            public void run() {
                f0.d(this.f22122a.getDevice().getAddress());
                Peripheral peripheral = Peripheral.this;
                peripheral.logInfo(String.format("%s - MTU Size changed to %s with status 0x%02X", peripheral, Integer.valueOf(this.f22123b), Integer.valueOf(this.f22124c)));
                Peripheral.this.onMtuCompletion(this.f22122a);
            }
        }

        b() {
            Peripheral.this = r1;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            Peripheral.this.getHandler().post(new f(bluetoothGattCharacteristic));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
            Peripheral.this.getHandler().post(new d(bluetoothGattCharacteristic, i11));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i11) {
            Peripheral.this.getHandler().post(new e(bluetoothGattCharacteristic, i11));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i11, int i12) {
            Peripheral.this.mHandler.post(new RunnableC0404b(i12, i11));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i11) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format("%s onDescriptorRead - status: 0x%02X, value: %s", peripheral, Integer.valueOf(i11), f0.b(bluetoothGattDescriptor.getValue())));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i11) {
            Peripheral.this.mHandler.post(new a(bluetoothGattDescriptor, i11));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i11, int i12) {
            Peripheral.this.mHandler.post(new h(bluetoothGatt, i11, i12));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyRead(BluetoothGatt bluetoothGatt, int i11, int i12, int i13) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format("%s onPhyRead: txPhy %d rxPhy %d status: 0x%02s", peripheral, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i11, int i12, int i13) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format("%s onPhyUpdate: txPhy %d rxPhy %d", peripheral, Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i11, int i12) {
            Peripheral.this.mHandler.post(new g(i12, i11));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i11) {
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format("%s onReliableWriteCompleted - status: 0x%02Xs", peripheral, Integer.valueOf(i11)));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i11) {
            Peripheral.this.mHandler.post(new c(i11, bluetoothGatt));
        }
    }

    /* loaded from: classes6.dex */
    public class c implements Runnable {

        /* renamed from: a */
        int f22126a = 0;

        c() {
            Peripheral.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.teslamotors.plugins.ble.d dVar = (com.teslamotors.plugins.ble.d) Peripheral.this.mController.get();
            if (dVar == null) {
                return;
            }
            BluetoothGatt gatt = Peripheral.this.getGatt();
            if (gatt != null && Peripheral.this.isConnected()) {
                if (Peripheral.this.getServiceConnected()) {
                    return;
                }
                this.f22126a++;
                if (!a0.a(Peripheral.this.mContext)) {
                    Peripheral.this.logInfo("BLUETOOTH_CONNECT permission is not granted, cannot discoverServices");
                    return;
                }
                if (!gatt.discoverServices()) {
                    this.f22126a = 5;
                }
                Peripheral.this.mBusy.set(true);
                if (this.f22126a <= 4) {
                    Peripheral peripheral = Peripheral.this;
                    peripheral.logInfo(String.format("%s - looking for services", peripheral));
                    Peripheral.this.getHandler().postAtTime(this, Peripheral.this.getIdentifier(), SystemClock.uptimeMillis() + AbstractComponentTracker.LINGERING_TIMEOUT);
                    return;
                }
                Peripheral.this.logInfo(String.format("Exceeded max retries of %s for finding services on %s", 4, Peripheral.this));
                dVar.x(Peripheral.this, "service discovery max retries");
                return;
            }
            Peripheral peripheral2 = Peripheral.this;
            peripheral2.logInfo(String.format("%s - Not connected to; cancelling service discovery", peripheral2));
        }
    }

    /* loaded from: classes6.dex */
    public class d implements Runnable {
        d() {
            Peripheral.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Peripheral.this.getMtuEstablished()) {
                return;
            }
            Peripheral peripheral = Peripheral.this;
            peripheral.logInfo(String.format("%s - timed out waiting for onMTUChanged - moving on", peripheral));
            Peripheral.this.onMtuCompletion(Peripheral.this.getGatt());
        }
    }

    /* loaded from: classes6.dex */
    public static class e {

        /* renamed from: a */
        public p0 f22129a = null;

        /* renamed from: b */
        public yt.f f22130b = null;
    }

    public Peripheral(String str, BluetoothDevice bluetoothDevice, BluetoothGatt bluetoothGatt, com.teslamotors.plugins.ble.d dVar, BluetoothAdapter bluetoothAdapter, Integer num, Context context) {
        this.createdTimestamp = 0L;
        this.mPosition = str;
        this.mGatt = bluetoothGatt;
        this.mController = new WeakReference<>(dVar);
        this.mBluetoothAdapter = bluetoothAdapter;
        this.mContext = context;
        this.rssi = num != null ? num.intValue() : -1000;
        this.originalAddress = bluetoothDevice.getAddress();
        this.mAuthenticated = false;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.createdTimestamp = Long.valueOf(System.currentTimeMillis());
    }

    public void checkCommandQueue() {
        if (this.mBusy.get()) {
            return;
        }
        this.mBusy.set(true);
        writeToCar(this.mCommandQueue.poll());
    }

    public void clearConnectionStartTime() {
        this.connectionStartTime.set(0L);
    }

    private void destroy() {
        this.mGatt = null;
        this.mController.clear();
        this.mBluetoothAdapter = null;
    }

    private int getDelayDurationForStatus(int i11) {
        if (i11 != 0 && i11 != 8) {
            if (i11 == 22) {
                return DELAY_AFTER_ERROR;
            }
            if (i11 != 34) {
                if (i11 != 133) {
                    logInfo(String.format("%s - Got unknown status code: 0x%02X", this, Integer.valueOf(i11)));
                    return DELAY_AFTER_NORMAL_DISCONNECT;
                }
                return DELAY_AFTER_ERROR;
            }
        }
        return DELAY_AFTER_NORMAL_DISCONNECT;
    }

    public BluetoothGatt getGatt() {
        return this.mGatt;
    }

    private BluetoothGattService getGattService() {
        return this.gattService;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x00c1 -> B:86:0x00ea). Please submit an issue!!! */
    private e getMessageFromBytes(byte[] bArr) {
        byte[] bArr2;
        e eVar = new e();
        int i11 = this.rxSoFar;
        if (i11 == 0 && this.rxExpected == 0) {
            int i12 = (bArr[0] << 8) | (bArr[1] & 255);
            if (i12 > MAX_RX_BUFFER_SIZE || i12 < 0) {
                logInfo(String.format("%s - Got 'initial' message with length header of %d, ignoring", this, Integer.valueOf(i12)));
                return null;
            }
            this.rxExpected = i12;
            this.rxSoFar = bArr.length - 2;
            System.arraycopy(bArr, 2, this.rxBuffer, 0, bArr.length - 2);
        } else if (bArr.length <= this.rxExpected - i11) {
            System.arraycopy(bArr, 0, this.rxBuffer, i11, bArr.length);
            this.rxSoFar += bArr.length;
        } else {
            logInfo(String.format("%s - Failed to add data of length %s to buffer of size %s with %s remaining. Clearing buffer", this, Integer.valueOf(bArr.length), Integer.valueOf(this.rxExpected), Integer.valueOf(this.rxExpected - this.rxSoFar)));
            this.rxSoFar = 0;
            this.rxExpected = 0;
            return null;
        }
        int i13 = this.rxSoFar;
        int i14 = this.rxExpected;
        if (i13 >= i14) {
            try {
                logInfo(String.format("%s - Received complete message: %s", this, String.format("(%s bytes)", Integer.valueOf(i14))));
                byte[] copyOfRange = Arrays.copyOfRange(this.rxBuffer, 0, this.rxExpected);
                try {
                    yt.f decode = yt.f.f59754k.decode(copyOfRange);
                    yt.a d11 = decode.d();
                    if (d11 == null && decode.k() == null) {
                        eVar.f22129a = p0.R.decode(copyOfRange);
                        bArr2 = copyOfRange;
                    } else {
                        eVar.f22130b = decode;
                        bArr2 = copyOfRange;
                        bArr2 = copyOfRange;
                        if (decode.e() != null && d11 != null) {
                            bArr2 = copyOfRange;
                            if (d11.c() == yt.b.DOMAIN_VEHICLE_SECURITY) {
                                eVar.f22129a = p0.R.decode(decode.e());
                                bArr2 = copyOfRange;
                            }
                        }
                    }
                } catch (IOException e11) {
                    logError("Error thrown decoding RoutableMessage", e11);
                    p0 decode2 = p0.R.decode(bArr2);
                    eVar.f22129a = decode2;
                    bArr2 = decode2;
                }
            } catch (IOException e12) {
                String format = String.format("%s - Failed to deserialize message: %s", this, e12.toString());
                logError(format, new Throwable(format));
            }
            this.rxExpected = 0;
            this.rxSoFar = 0;
        }
        return eVar;
    }

    public void handleService(BluetoothGattService bluetoothGattService) {
        if (bluetoothGattService != null && com.teslamotors.plugins.ble.a.f22143b.equals(bluetoothGattService.getUuid())) {
            setGattService(bluetoothGattService);
            List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
            logInfo(String.format("%s - tesla service found - %s characteristics", this, Integer.valueOf(characteristics.size())));
            com.teslamotors.plugins.ble.d dVar = this.mController.get();
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                logInfo(String.format("%s - characteristic found - %s", this, uuid));
                if (com.teslamotors.plugins.ble.a.f22146e.equals(uuid)) {
                    z11 = true;
                } else if (com.teslamotors.plugins.ble.a.f22145d.equals(uuid)) {
                    z12 = true;
                } else if (com.teslamotors.plugins.ble.a.f22147f.equals(uuid) && !dVar.y()) {
                    BluetoothGatt gatt = getGatt();
                    if (!a0.a(this.mContext)) {
                        logInfo("BLUETOOTH_CONNECT permission is not granted, can not found version");
                    } else {
                        z13 = gatt != null && gatt.readCharacteristic(bluetoothGattCharacteristic);
                    }
                }
                if (z11 && z12) {
                    Object[] objArr = new Object[2];
                    objArr[0] = this;
                    objArr[1] = z13 ? "including" : "NOT including";
                    logInfo(String.format("%s - found RX and TX characteristics, %s version", objArr));
                    if (z13) {
                        return;
                    }
                    this.mBusy.set(false);
                    setServiceConnected(true);
                    dVar.e(this);
                    return;
                }
            }
        }
        logInfo(String.format("%s - DID NOT find RX and TX characteristics!", this));
    }

    public void logError(String str, Throwable th2) {
        com.teslamotors.plugins.ble.d dVar = this.mController.get();
        if (dVar != null) {
            dVar.c(str, th2);
        }
    }

    public void logInfo(String str) {
        com.teslamotors.plugins.ble.d dVar = this.mController.get();
        if (dVar != null) {
            dVar.z(str);
        }
    }

    public void onBytesReceived(byte[] bArr) {
        com.teslamotors.plugins.ble.d dVar;
        e messageFromBytes = getMessageFromBytes(bArr);
        if (messageFromBytes != null) {
            if ((messageFromBytes.f22130b == null && messageFromBytes.f22129a == null) || (dVar = this.mController.get()) == null) {
                return;
            }
            dVar.n(messageFromBytes, this);
        }
    }

    public void onConnectionLost(String str) {
        logInfo(String.format("%s - onConnectionLost %s", this, str));
        this.indicationAttempts = 0;
        setConnected(false);
        this.mtuEstablished.set(false);
        setServiceConnected(false);
        setAuthenticated(false);
        com.teslamotors.plugins.ble.d dVar = this.mController.get();
        if (dVar != null) {
            dVar.s(this);
            int i11 = 0;
            while (true) {
                v3.d<byte[], String> poll = this.mCommandQueue.poll();
                if (poll == null) {
                    break;
                }
                dVar.p(false, "PHONE_KEY_NOT_CONNECTED", f0.b(poll.f54019a), this);
                i11++;
            }
            logInfo(String.format("%s - dropped %d pending commands", this, Integer.valueOf(i11)));
        }
        if (this.mFinished.get()) {
            destroy();
        }
    }

    public void onMtuCompletion(BluetoothGatt bluetoothGatt) {
        this.mtuEstablished.set(true);
        this.mBusy.set(false);
        if (bluetoothGatt == null) {
            return;
        }
        if (bluetoothGatt.getService(com.teslamotors.plugins.ble.a.f22143b) != null) {
            logInfo(String.format("%s - Already know about services; discovering anyway", this));
        }
        getHandler().postAtTime(new c(), getIdentifier(), SystemClock.uptimeMillis());
    }

    public void reconnect(int i11) {
        getHandler().removeCallbacksAndMessages(getIdentifier());
        getHandler().postAtTime(new a(), getIdentifier(), getDelayDurationForStatus(i11) + SystemClock.uptimeMillis());
    }

    public boolean reconnectionInProgress() {
        return this.connectionStartTime.get() + 5000 > SystemClock.elapsedRealtime();
    }

    public void setConnected(boolean z11) {
        if (z11) {
            this.disconnectedTimestamp = 0L;
            this.connectedTimestamp = Long.valueOf(System.currentTimeMillis());
        } else {
            this.disconnectedTimestamp = Long.valueOf(System.currentTimeMillis());
        }
        this.mIsConnected.set(z11);
    }

    private void setGatt(BluetoothGatt bluetoothGatt) {
        this.mGatt = bluetoothGatt;
    }

    private void setGattService(BluetoothGattService bluetoothGattService) {
        this.gattService = bluetoothGattService;
    }

    private void setLastBackgroundConnectTime() {
        this.backgroundConnectTime = SystemClock.elapsedRealtime();
    }

    public void setLastConnectionStartTime(boolean z11) {
        this.connectionStartTime.set(SystemClock.elapsedRealtime());
        if (z11) {
            setLastBackgroundConnectTime();
        }
    }

    public void setRssi(int i11) {
        this.rssi = i11;
    }

    private void writeToCar(v3.d<byte[], String> dVar) {
        if (dVar == null) {
            this.mBusy.set(false);
        } else if (this.mFinished.get()) {
            logInfo("SKIPPING Sending messages; this peripheral object is finished");
        } else if (!a0.a(this.mContext)) {
            logInfo("BLUETOOTH_CONNECT permission is not granted, skip writeToCar");
        } else {
            com.teslamotors.plugins.ble.d dVar2 = this.mController.get();
            if (dVar2 == null) {
                return;
            }
            BluetoothGatt gatt = getGatt();
            BluetoothGattService gattService = getGattService();
            String b11 = f0.b(dVar.f54019a);
            String format = String.format("(%s)", Integer.valueOf(b11.length()));
            if (gatt != null && gattService != null) {
                BluetoothGattCharacteristic characteristic = gattService.getCharacteristic(com.teslamotors.plugins.ble.a.f22145d);
                if (characteristic == null) {
                    String format2 = String.format("%s - FAILED to write to car - empty TX characteristic!", this);
                    logError(format2, new Throwable(format2));
                    this.mBusy.set(false);
                    dVar2.p(false, "PHONE_KEY_TRANSMISSION_FAILURE", b11, this);
                    return;
                }
                String str = dVar.f54020b;
                try {
                    if (characteristic.setValue(dVar.f54019a)) {
                        if (gatt.writeCharacteristic(characteristic)) {
                            logInfo(String.format("%s - Sending %s: %s", this, str, format));
                            return;
                        }
                        logInfo(String.format("%s - FAILED to WRITE CHARACTERISTIC %s: %s", this, str, format));
                    } else {
                        logInfo(String.format("%s - FAILED to SET VALUE %s: %s", this, str, format));
                    }
                } catch (Exception e11) {
                    logError(String.format("%s - EXCEPTION when sending %s: %s", this, str, format), e11);
                }
                this.mBusy.set(false);
                dVar2.p(false, "PHONE_KEY_TRANSMISSION_FAILURE", b11, this);
                return;
            }
            logInfo(String.format("%s - FAILED to write to car - peripheral Gatt or Gatt Service was null!", this));
            this.mBusy.set(false);
            dVar2.p(false, "PHONE_KEY_TRANSMISSION_FAILURE", b11, this);
        }
    }

    public void createInitialConnection() {
        String identifier = getIdentifier();
        if (!a0.a(this.mContext)) {
            logInfo("BLUETOOTH_CONNECT permission is not granted, skip createInitialConnection");
        } else if (identifier == null || this.mBluetoothAdapter == null) {
        } else {
            logInfo(this + " - creating direct connection");
            BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(identifier);
            if (Build.VERSION.SDK_INT >= 26) {
                setGatt(remoteDevice.connectGatt(this.mContext, false, this.mGattCallback, 2, 1, this.mHandler));
            } else {
                setGatt(remoteDevice.connectGatt(this.mContext, false, this.mGattCallback));
            }
            setLastConnectionStartTime(true);
        }
    }

    public void disconnect() {
        if (this.mFinished.getAndSet(true)) {
            return;
        }
        BluetoothGatt gatt = getGatt();
        if (gatt != null) {
            try {
                try {
                    if (!a0.a(this.mContext)) {
                        logInfo("BLUETOOTH_CONNECT permission is not granted, failed to disconnect Gatt object");
                    } else {
                        logInfo(String.format("%s - disconnecting and closing Gatt object", this));
                        gatt.disconnect();
                        gatt.close();
                    }
                } catch (Exception e11) {
                    logError("Failed to disconnect Gatt object", e11);
                }
            } finally {
                setGatt(null);
            }
        } else {
            logInfo(String.format("%s - Gatt object already null!", this));
        }
        onConnectionLost("SELF-DIRECTED");
    }

    public void enqueue(byte[] bArr, String str) {
        if (this.mCommandQueue.offer(new v3.d<>(bArr, str))) {
            logInfo(String.format("%s - added message %s - %s to queue of size %d", this, f0.b(bArr), str, Integer.valueOf(this.mCommandQueue.size() - 1)));
        } else {
            logInfo(String.format("%s - FAILED to add message %s - %s to queue of size %s", this, f0.b(bArr), str, Integer.valueOf(this.mCommandQueue.size())));
        }
        checkCommandQueue();
    }

    public Long getConnectedTimestamp() {
        return this.connectedTimestamp;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public Long getDisconnectedTimestamp() {
        return this.disconnectedTimestamp;
    }

    public String getHashedIdentifier() {
        if (this.hashedId == null) {
            this.hashedId = f0.d(this.originalAddress);
        }
        return this.hashedId;
    }

    public String getIdentifier() {
        return this.originalAddress;
    }

    public boolean getMtuEstablished() {
        return this.mtuEstablished.get();
    }

    public String getPosition() {
        return this.mPosition;
    }

    public int getRssi() {
        return this.rssi;
    }

    public boolean getServiceConnected() {
        return this.serviceConnected.get();
    }

    public boolean isAuthenticated() {
        return this.mAuthenticated;
    }

    public boolean isBusyOrQueued() {
        return this.mBusy.get() || this.mCommandQueue.peek() != null;
    }

    public boolean isCentralPeripheral() {
        return this.mPosition.equals(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE);
    }

    public boolean isConnected() {
        return this.mIsConnected.get();
    }

    public boolean isFinished() {
        return this.mFinished.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00c8 A[Catch: Exception -> 0x00dd, TRY_ENTER, TryCatch #1 {Exception -> 0x00dd, blocks: (B:81:0x009c, B:87:0x00c8, B:90:0x00e2), top: B:97:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e2 A[Catch: Exception -> 0x00dd, TRY_LEAVE, TryCatch #1 {Exception -> 0x00dd, blocks: (B:81:0x009c, B:87:0x00c8, B:90:0x00e2), top: B:97:0x009c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean requestIndications() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.plugins.ble.Peripheral.requestIndications():boolean");
    }

    public void requestMtu() {
        BluetoothGatt gatt = getGatt();
        if (gatt != null && isConnected()) {
            if (getMtuEstablished()) {
                return;
            }
            if (!a0.a(this.mContext)) {
                logInfo("BLUETOOTH_CONNECT permission is not granted, cannot requestMtu");
                return;
            }
            this.mBusy.set(true);
            logInfo(String.format("%s - requested MTU of size 115 with result %s", this, Boolean.valueOf(gatt.requestMtu(115))));
            getHandler().postAtTime(new d(), getIdentifier(), SystemClock.uptimeMillis() + 3000);
            return;
        }
        logInfo(String.format("%s - not connected; cancelling MTU set", this));
    }

    public void requestMtuDebug() {
        BluetoothGatt gatt = getGatt();
        if (gatt != null && isConnected()) {
            if (getMtuEstablished()) {
                return;
            }
            this.mBusy.set(true);
            logInfo(String.format("%s - debug requested MTU of size 115 with result %s", this, Boolean.valueOf(gatt.requestMtu(115))));
            getHandler().postAtTime(new d(), getIdentifier(), SystemClock.uptimeMillis() + 3000);
            return;
        }
        logInfo(String.format("%s - not connected; cancelling MTU set", this));
    }

    public long secondsSinceConnect() {
        return (SystemClock.elapsedRealtime() - this.backgroundConnectTime) / 1000;
    }

    public void setAuthenticated(boolean z11) {
        this.mAuthenticated = z11;
    }

    public void setReadingRssi(boolean z11) {
    }

    public void setServiceConnected(boolean z11) {
        this.serviceConnected.set(z11);
    }

    public boolean shouldTryBackgroundScanConnect() {
        return this.backgroundConnectTime + AbstractComponentTracker.LINGERING_TIMEOUT < SystemClock.elapsedRealtime();
    }

    public String toString() {
        String hashedIdentifier = getHashedIdentifier();
        Object[] objArr = new Object[4];
        objArr[0] = this.mPosition;
        objArr[1] = hashedIdentifier;
        objArr[2] = Integer.valueOf(hashCode());
        objArr[3] = this.mIsConnected.get() ? "connected" : "disconnected";
        return String.format("%s - %s (%s) (%s)", objArr);
    }
}