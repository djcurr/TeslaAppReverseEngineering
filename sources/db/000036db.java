package com.google.android.vending.expansion.downloader.impl;

import al.g;
import al.h;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;

/* loaded from: classes3.dex */
public abstract class DownloaderService extends com.google.android.vending.expansion.downloader.impl.a implements g {
    public static final String ACTION_DOWNLOADS_CHANGED = "downloadsChanged";
    public static final String ACTION_DOWNLOAD_COMPLETE = "lvldownloader.intent.action.DOWNLOAD_COMPLETE";
    public static final String ACTION_DOWNLOAD_STATUS = "lvldownloader.intent.action.DOWNLOAD_STATUS";
    public static final int CONTROL_PAUSED = 1;
    public static final int CONTROL_RUN = 0;
    public static final int DOWNLOAD_REQUIRED = 2;
    public static final String EXTRA_FILE_NAME = "downloadId";
    public static final String EXTRA_IS_WIFI_REQUIRED = "isWifiRequired";
    public static final String EXTRA_MESSAGE_HANDLER = "EMH";
    public static final String EXTRA_PACKAGE_NAME = "EPN";
    public static final String EXTRA_PENDING_INTENT = "EPI";
    public static final String EXTRA_STATUS_CURRENT_FILE_SIZE = "CFS";
    public static final String EXTRA_STATUS_CURRENT_PROGRESS = "CFP";
    public static final String EXTRA_STATUS_STATE = "ESS";
    public static final String EXTRA_STATUS_TOTAL_PROGRESS = "TFP";
    public static final String EXTRA_STATUS_TOTAL_SIZE = "ETS";
    private static final String LOG_TAG = "LVLDL";
    public static final int LVL_CHECK_REQUIRED = 1;
    public static final int NETWORK_CANNOT_USE_ROAMING = 5;
    public static final int NETWORK_MOBILE = 1;
    public static final int NETWORK_NO_CONNECTION = 2;
    public static final int NETWORK_OK = 1;
    public static final int NETWORK_RECOMMENDED_UNUSABLE_DUE_TO_SIZE = 4;
    public static final int NETWORK_TYPE_DISALLOWED_BY_REQUESTOR = 6;
    public static final int NETWORK_UNUSABLE_DUE_TO_SIZE = 3;
    public static final int NETWORK_WIFI = 2;
    public static final int NO_DOWNLOAD_REQUIRED = 0;
    private static final float SMOOTHING_FACTOR = 0.005f;
    public static final int STATUS_CANCELED = 490;
    public static final int STATUS_CANNOT_RESUME = 489;
    public static final int STATUS_DEVICE_NOT_FOUND_ERROR = 499;
    public static final int STATUS_FILE_ALREADY_EXISTS_ERROR = 488;
    public static final int STATUS_FILE_DELIVERED_INCORRECTLY = 487;
    public static final int STATUS_FILE_ERROR = 492;
    public static final int STATUS_FORBIDDEN = 403;
    public static final int STATUS_HTTP_DATA_ERROR = 495;
    public static final int STATUS_HTTP_EXCEPTION = 496;
    public static final int STATUS_INSUFFICIENT_SPACE_ERROR = 498;
    public static final int STATUS_PAUSED_BY_APP = 193;
    public static final int STATUS_PENDING = 190;
    public static final int STATUS_QUEUED_FOR_WIFI = 197;
    public static final int STATUS_QUEUED_FOR_WIFI_OR_CELLULAR_PERMISSION = 196;
    public static final int STATUS_RUNNING = 192;
    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_TOO_MANY_REDIRECTS = 497;
    public static final int STATUS_UNHANDLED_HTTP_CODE = 494;
    public static final int STATUS_UNHANDLED_REDIRECT = 493;
    public static final int STATUS_UNKNOWN_ERROR = 491;
    public static final int STATUS_WAITING_FOR_NETWORK = 195;
    public static final int STATUS_WAITING_TO_RETRY = 194;
    private static final String TEMP_EXT = ".tmp";
    public static final int VISIBILITY_HIDDEN = 2;
    public static final int VISIBILITY_VISIBLE = 0;
    public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = 1;
    private static boolean sIsRunning;
    private PendingIntent mAlarmIntent;
    float mAverageDownloadSpeed;
    long mBytesAtSample;
    long mBytesSoFar;
    private Messenger mClientMessenger;
    private BroadcastReceiver mConnReceiver;
    private ConnectivityManager mConnectivityManager;
    private int mControl;
    int mFileCount;
    private boolean mIsAtLeast3G;
    private boolean mIsAtLeast4G;
    private boolean mIsCellularConnection;
    private boolean mIsConnected;
    private boolean mIsFailover;
    private boolean mIsRoaming;
    long mMillisecondsAtSample;
    private c mNotification;
    private PackageInfo mPackageInfo;
    private PendingIntent mPendingIntent;
    private final Messenger mServiceMessenger;
    private final h mServiceStub;
    private boolean mStateChanged;
    private int mStatus;
    long mTotalLength;
    private WifiManager mWifiManager;

    /* loaded from: classes3.dex */
    public static class GenerateSaveFileError extends Exception {

        /* renamed from: a  reason: collision with root package name */
        int f15833a;

        /* renamed from: b  reason: collision with root package name */
        String f15834b;

        public GenerateSaveFileError(int i11, String str) {
            this.f15833a = i11;
            this.f15834b = str;
        }
    }

    /* loaded from: classes3.dex */
    private class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final Service f15835a;

        a(Service service) {
            this.f15835a = service;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DownloaderService.this.pollNetworkState();
            if (!DownloaderService.this.mStateChanged || DownloaderService.access$400()) {
                return;
            }
            Log.d(DownloaderService.LOG_TAG, "InnerBroadcastReceiver Called");
            Intent intent2 = new Intent(context, this.f15835a.getClass());
            intent2.putExtra(DownloaderService.EXTRA_PENDING_INTENT, DownloaderService.this.mPendingIntent);
            context.startService(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Context f15837a;

        /* loaded from: classes3.dex */
        class a implements bl.e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bl.b f15839a;

            a(bl.b bVar) {
                this.f15839a = bVar;
            }

            @Override // bl.e
            public void a(int i11) {
                int i12;
                try {
                    int g11 = this.f15839a.g();
                    e a11 = e.a(b.this.f15837a);
                    if (g11 != 0) {
                        i12 = 0;
                        for (int i13 = 0; i13 < g11; i13++) {
                            String d11 = this.f15839a.d(i13);
                            if (d11 != null) {
                                com.google.android.vending.expansion.downloader.impl.b bVar = new com.google.android.vending.expansion.downloader.impl.b(i13, d11, b.this.f15837a.getPackageName());
                                long e11 = this.f15839a.e(i13);
                                if (DownloaderService.this.handleFileUpdated(a11, i13, d11, e11)) {
                                    i12 |= -1;
                                    bVar.a();
                                    bVar.f15842a = this.f15839a.f(i13);
                                    bVar.f15846e = e11;
                                    bVar.f15849h = i12;
                                    a11.j(bVar);
                                } else {
                                    com.google.android.vending.expansion.downloader.impl.b c11 = a11.c(bVar.f15844c);
                                    if (c11 == null) {
                                        Log.d(DownloaderService.LOG_TAG, "file " + bVar.f15844c + " found. Not downloading.");
                                        bVar.f15849h = 200;
                                        bVar.f15846e = e11;
                                        bVar.f15847f = e11;
                                        bVar.f15842a = this.f15839a.f(i13);
                                        a11.j(bVar);
                                    } else if (c11.f15849h != 200) {
                                        c11.f15842a = this.f15839a.f(i13);
                                        a11.j(c11);
                                        i12 |= -1;
                                    }
                                }
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                    try {
                        a11.o(b.this.f15837a.getPackageManager().getPackageInfo(b.this.f15837a.getPackageName(), 0).versionCode, i12);
                        Class<?> cls = DownloaderService.this.getClass();
                        b bVar2 = b.this;
                        int startDownloadServiceIfRequired = DownloaderService.startDownloadServiceIfRequired(bVar2.f15837a, DownloaderService.this.mPendingIntent, cls);
                        if (startDownloadServiceIfRequired == 0) {
                            DownloaderService.this.mNotification.onDownloadStateChanged(5);
                        } else if (startDownloadServiceIfRequired == 1) {
                            Log.e(DownloaderService.LOG_TAG, "In LVL checking loop!");
                            DownloaderService.this.mNotification.onDownloadStateChanged(15);
                            throw new RuntimeException("Error with LVL checking and database integrity");
                        }
                    } catch (PackageManager.NameNotFoundException e12) {
                        e12.printStackTrace();
                        throw new RuntimeException("Error with getting information from package name");
                    }
                } finally {
                    DownloaderService.setServiceRunning(false);
                }
            }

            @Override // bl.e
            public void b(int i11) {
                try {
                    DownloaderService.this.mNotification.onDownloadStateChanged(16);
                } finally {
                    DownloaderService.setServiceRunning(false);
                }
            }

            @Override // bl.e
            public void c(int i11) {
                try {
                    if (i11 != 291) {
                        if (i11 == 561) {
                            DownloaderService.this.mNotification.onDownloadStateChanged(15);
                        }
                    }
                    DownloaderService.this.mNotification.onDownloadStateChanged(16);
                } finally {
                    DownloaderService.setServiceRunning(false);
                }
            }
        }

        b(Context context, PendingIntent pendingIntent) {
            this.f15837a = context;
            DownloaderService.this.mPendingIntent = pendingIntent;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloaderService.setServiceRunning(true);
            DownloaderService.this.mNotification.onDownloadStateChanged(2);
            bl.b bVar = new bl.b(this.f15837a, new bl.a(DownloaderService.this.getSALT(), this.f15837a.getPackageName(), Settings.Secure.getString(this.f15837a.getContentResolver(), "android_id")));
            bVar.h();
            new bl.d(this.f15837a, bVar, DownloaderService.this.getPublicKey()).f(new a(bVar));
        }
    }

    public DownloaderService() {
        super("LVLDownloadService");
        h b11 = al.d.b(this);
        this.mServiceStub = b11;
        this.mServiceMessenger = b11.b();
    }

    static /* synthetic */ boolean access$400() {
        return isServiceRunning();
    }

    private void cancelAlarms() {
        if (this.mAlarmIntent != null) {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            if (alarmManager == null) {
                Log.e(LOG_TAG, "couldn't get alarm manager");
                return;
            }
            alarmManager.cancel(this.mAlarmIntent);
            this.mAlarmIntent = null;
        }
    }

    private static boolean isLVLCheckRequired(e eVar, PackageInfo packageInfo) {
        return eVar.f15896e != packageInfo.versionCode;
    }

    private static synchronized boolean isServiceRunning() {
        boolean z11;
        synchronized (DownloaderService.class) {
            z11 = sIsRunning;
        }
        return z11;
    }

    public static boolean isStatusClientError(int i11) {
        return i11 >= 400 && i11 < 500;
    }

    public static boolean isStatusCompleted(int i11) {
        return (i11 >= 200 && i11 < 300) || (i11 >= 400 && i11 < 600);
    }

    public static boolean isStatusError(int i11) {
        return i11 >= 400 && i11 < 600;
    }

    public static boolean isStatusInformational(int i11) {
        return i11 >= 100 && i11 < 200;
    }

    public static boolean isStatusServerError(int i11) {
        return i11 >= 500 && i11 < 600;
    }

    public static boolean isStatusSuccess(int i11) {
        return i11 >= 200 && i11 < 300;
    }

    private void scheduleAlarm(long j11) {
        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
        if (alarmManager == null) {
            Log.e(LOG_TAG, "couldn't get alarm manager");
            return;
        }
        String alarmReceiverClassName = getAlarmReceiverClassName();
        Intent intent = new Intent("android.intent.action.DOWNLOAD_WAKEUP");
        intent.putExtra(EXTRA_PENDING_INTENT, this.mPendingIntent);
        intent.setClassName(getPackageName(), alarmReceiverClassName);
        this.mAlarmIntent = PendingIntent.getBroadcast(this, 0, intent, 1073741824);
        alarmManager.set(0, System.currentTimeMillis() + j11, this.mAlarmIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void setServiceRunning(boolean z11) {
        synchronized (DownloaderService.class) {
            sIsRunning = z11;
        }
    }

    public static int startDownloadServiceIfRequired(Context context, Intent intent, Class<?> cls) {
        return startDownloadServiceIfRequired(context, (PendingIntent) intent.getParcelableExtra(EXTRA_PENDING_INTENT), cls);
    }

    private void updateNetworkState(NetworkInfo networkInfo) {
        boolean z11 = this.mIsConnected;
        boolean z12 = this.mIsFailover;
        boolean z13 = this.mIsCellularConnection;
        boolean z14 = this.mIsRoaming;
        boolean z15 = this.mIsAtLeast3G;
        boolean z16 = false;
        if (networkInfo != null) {
            this.mIsRoaming = networkInfo.isRoaming();
            this.mIsFailover = networkInfo.isFailover();
            this.mIsConnected = networkInfo.isConnected();
            updateNetworkType(networkInfo.getType(), networkInfo.getSubtype());
        } else {
            this.mIsRoaming = false;
            this.mIsFailover = false;
            this.mIsConnected = false;
            updateNetworkType(-1, -1);
        }
        this.mStateChanged = (!this.mStateChanged && z11 == this.mIsConnected && z12 == this.mIsFailover && z13 == this.mIsCellularConnection && z14 == this.mIsRoaming && z15 == this.mIsAtLeast3G) ? true : true;
    }

    private void updateNetworkType(int i11, int i12) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 6) {
                    this.mIsCellularConnection = true;
                    this.mIsAtLeast3G = true;
                    this.mIsAtLeast4G = true;
                    return;
                } else if (i11 != 7 && i11 != 9) {
                    return;
                }
            }
            this.mIsCellularConnection = false;
            this.mIsAtLeast3G = false;
            this.mIsAtLeast4G = false;
            return;
        }
        this.mIsCellularConnection = true;
        switch (i12) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                this.mIsAtLeast3G = false;
                this.mIsAtLeast4G = false;
                return;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                this.mIsAtLeast3G = true;
                this.mIsAtLeast4G = false;
                return;
            case 12:
            default:
                this.mIsCellularConnection = false;
                this.mIsAtLeast3G = false;
                this.mIsAtLeast4G = false;
                return;
            case 13:
            case 14:
            case 15:
                this.mIsAtLeast3G = true;
                this.mIsAtLeast4G = true;
                return;
        }
    }

    public String generateSaveFile(String str, long j11) {
        String generateTempSaveFileName = generateTempSaveFileName(str);
        File file = new File(generateTempSaveFileName);
        if (al.e.j()) {
            if (!file.exists()) {
                if (al.e.c(al.e.f(generateTempSaveFileName)) >= j11) {
                    return generateTempSaveFileName;
                }
                throw new GenerateSaveFileError(STATUS_INSUFFICIENT_SPACE_ERROR, "insufficient space on external storage");
            }
            Log.d(LOG_TAG, "File already exists: " + generateTempSaveFileName);
            throw new GenerateSaveFileError(STATUS_FILE_ALREADY_EXISTS_ERROR, "requested destination file already exists");
        }
        Log.d(LOG_TAG, "External media not mounted: " + generateTempSaveFileName);
        throw new GenerateSaveFileError(STATUS_DEVICE_NOT_FOUND_ERROR, "external media is not yet mounted");
    }

    public String generateTempSaveFileName(String str) {
        return al.e.g(this) + File.separator + str + TEMP_EXT;
    }

    public abstract String getAlarmReceiverClassName();

    public int getControl() {
        return this.mControl;
    }

    public String getLogMessageForNetworkError(int i11) {
        return i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? i11 != 6 ? "unknown error with network connectivity" : "download was requested to not use the current network type" : "download cannot use the current network connection because it is roaming" : "download size exceeds recommended limit for mobile network" : "download size exceeds limit for mobile network" : "no network connection available";
    }

    public int getNetworkAvailabilityState(e eVar) {
        if (this.mIsConnected) {
            if (this.mIsCellularConnection) {
                int i11 = eVar.f15898g;
                if (this.mIsRoaming) {
                    return 5;
                }
                return (i11 & 1) != 0 ? 1 : 6;
            }
            return 1;
        }
        return 2;
    }

    public abstract String getPublicKey();

    public abstract byte[] getSALT();

    public int getStatus() {
        return this.mStatus;
    }

    public boolean handleFileUpdated(e eVar, int i11, String str, long j11) {
        String str2;
        com.google.android.vending.expansion.downloader.impl.b c11 = eVar.c(str);
        if (c11 != null && (str2 = c11.f15844c) != null) {
            if (str.equals(str2)) {
                return false;
            }
            File file = new File(al.e.b(this, str2));
            if (file.exists()) {
                file.delete();
            }
        }
        return true ^ al.e.a(this, str, j11, true);
    }

    public boolean isWiFi() {
        return this.mIsConnected && !this.mIsCellularConnection;
    }

    public void notifyUpdateBytes(long j11) {
        long j12;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j13 = this.mMillisecondsAtSample;
        if (0 != j13) {
            float f11 = ((float) (j11 - this.mBytesAtSample)) / ((float) (uptimeMillis - j13));
            float f12 = this.mAverageDownloadSpeed;
            if (BitmapDescriptorFactory.HUE_RED != f12) {
                this.mAverageDownloadSpeed = (f11 * SMOOTHING_FACTOR) + (f12 * 0.995f);
            } else {
                this.mAverageDownloadSpeed = f11;
            }
            j12 = ((float) (this.mTotalLength - j11)) / this.mAverageDownloadSpeed;
        } else {
            j12 = -1;
        }
        this.mMillisecondsAtSample = uptimeMillis;
        this.mBytesAtSample = j11;
        this.mNotification.onDownloadProgress(new al.b(this.mTotalLength, j11, j12, this.mAverageDownloadSpeed));
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a, android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d(LOG_TAG, "Service Bound");
        return this.mServiceMessenger.getBinder();
    }

    @Override // al.g
    public void onClientUpdated(Messenger messenger) {
        this.mClientMessenger = messenger;
        this.mNotification.c(messenger);
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a, android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            this.mPackageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.mNotification = new c(this, getPackageManager().getApplicationLabel(getApplicationInfo()));
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a, android.app.Service
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.mConnReceiver;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.mConnReceiver = null;
        }
        this.mServiceStub.c(this);
        super.onDestroy();
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a
    protected void onHandleIntent(Intent intent) {
        int i11;
        int i12;
        boolean z11 = true;
        setServiceRunning(true);
        try {
            e a11 = e.a(this);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(EXTRA_PENDING_INTENT);
            if (pendingIntent != null) {
                this.mNotification.b(pendingIntent);
                this.mPendingIntent = pendingIntent;
            } else {
                PendingIntent pendingIntent2 = this.mPendingIntent;
                if (pendingIntent2 != null) {
                    this.mNotification.b(pendingIntent2);
                } else {
                    Log.e(LOG_TAG, "Downloader started in bad state without notification intent.");
                    return;
                }
            }
            if (isLVLCheckRequired(a11, this.mPackageInfo)) {
                updateLVL(this);
                return;
            }
            com.google.android.vending.expansion.downloader.impl.b[] e11 = a11.e();
            long j11 = 0;
            this.mBytesSoFar = 0L;
            this.mTotalLength = 0L;
            this.mFileCount = e11.length;
            for (com.google.android.vending.expansion.downloader.impl.b bVar : e11) {
                if (bVar.f15849h == 200 && !al.e.a(this, bVar.f15844c, bVar.f15846e, true)) {
                    bVar.f15849h = 0;
                    bVar.f15847f = 0L;
                }
                this.mTotalLength += bVar.f15846e;
                this.mBytesSoFar += bVar.f15847f;
            }
            pollNetworkState();
            if (this.mConnReceiver == null) {
                this.mConnReceiver = new a(this);
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                registerReceiver(this.mConnReceiver, intentFilter);
            }
            int length = e11.length;
            int i13 = 0;
            while (i13 < length) {
                com.google.android.vending.expansion.downloader.impl.b bVar2 = e11[i13];
                long j12 = bVar2.f15847f;
                if (bVar2.f15849h != 200) {
                    d dVar = new d(bVar2, this, this.mNotification);
                    cancelAlarms();
                    scheduleAlarm(5000L);
                    dVar.u();
                    cancelAlarms();
                }
                a11.n(bVar2);
                int i14 = bVar2.f15849h;
                if (i14 != 200) {
                    if (i14 != 403) {
                        if (i14 == 487) {
                            bVar2.f15847f = j11;
                            a11.j(bVar2);
                            i11 = 13;
                        } else if (i14 == 490) {
                            i11 = 18;
                        } else if (i14 == 498) {
                            i11 = 17;
                        } else if (i14 != 499) {
                            switch (i14) {
                                case 193:
                                    i12 = 7;
                                    i11 = i12;
                                    z11 = false;
                                    break;
                                case 194:
                                case 195:
                                    i11 = 6;
                                    break;
                                case 196:
                                case 197:
                                    WifiManager wifiManager = this.mWifiManager;
                                    if (wifiManager != null && !wifiManager.isWifiEnabled()) {
                                        i11 = 8;
                                        break;
                                    } else {
                                        i11 = 9;
                                        break;
                                    }
                                    break;
                                default:
                                    i12 = 19;
                                    i11 = i12;
                                    z11 = false;
                                    break;
                            }
                        } else {
                            i11 = 14;
                        }
                        if (z11) {
                            scheduleAlarm(60000L);
                        } else {
                            cancelAlarms();
                        }
                        this.mNotification.onDownloadStateChanged(i11);
                        return;
                    }
                    updateLVL(this);
                    return;
                }
                this.mBytesSoFar += bVar2.f15847f - j12;
                a11.o(this.mPackageInfo.versionCode, 0);
                i13++;
                j11 = 0;
            }
            this.mNotification.onDownloadStateChanged(5);
        } finally {
            setServiceRunning(false);
        }
    }

    void pollNetworkState() {
        if (this.mConnectivityManager == null) {
            this.mConnectivityManager = (ConnectivityManager) getSystemService("connectivity");
        }
        if (this.mWifiManager == null) {
            this.mWifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        }
        ConnectivityManager connectivityManager = this.mConnectivityManager;
        if (connectivityManager == null) {
            Log.w(LOG_TAG, "couldn't get connectivity manager to poll network state");
        } else {
            updateNetworkState(connectivityManager.getActiveNetworkInfo());
        }
    }

    @Override // al.g
    public void requestAbortDownload() {
        this.mControl = 1;
        this.mStatus = STATUS_CANCELED;
    }

    @Override // al.g
    public void requestContinueDownload() {
        if (this.mControl == 1) {
            this.mControl = 0;
        }
        Intent intent = new Intent(this, getClass());
        intent.putExtra(EXTRA_PENDING_INTENT, this.mPendingIntent);
        startService(intent);
    }

    @Override // al.g
    public void requestDownloadStatus() {
        this.mNotification.a();
    }

    @Override // al.g
    public void requestPauseDownload() {
        this.mControl = 1;
        this.mStatus = 193;
    }

    @Override // al.g
    public void setDownloadFlags(int i11) {
        e.a(this).m(i11);
    }

    @Override // com.google.android.vending.expansion.downloader.impl.a
    protected boolean shouldStop() {
        return e.a(this).f15897f == 0;
    }

    public void updateLVL(Context context) {
        Context applicationContext = context.getApplicationContext();
        new Handler(applicationContext.getMainLooper()).post(new b(applicationContext, this.mPendingIntent));
    }

    public static int startDownloadServiceIfRequired(Context context, PendingIntent pendingIntent, Class<?> cls) {
        return startDownloadServiceIfRequired(context, pendingIntent, context.getPackageName(), cls.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    public static int startDownloadServiceIfRequired(Context context, PendingIntent pendingIntent, String str, String str2) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        e a11 = e.a(context);
        ?? isLVLCheckRequired = isLVLCheckRequired(a11, packageInfo);
        if (a11.f15897f == 0) {
            com.google.android.vending.expansion.downloader.impl.b[] e11 = a11.e();
            if (e11 != null) {
                for (com.google.android.vending.expansion.downloader.impl.b bVar : e11) {
                    if (!al.e.a(context, bVar.f15844c, bVar.f15846e, true)) {
                        a11.q(-1);
                    }
                }
            }
            if (isLVLCheckRequired != 1 || isLVLCheckRequired == 2) {
                Intent intent = new Intent();
                intent.setClassName(str, str2);
                intent.putExtra(EXTRA_PENDING_INTENT, pendingIntent);
                context.startService(intent);
            }
            return isLVLCheckRequired;
        }
        isLVLCheckRequired = 2;
        if (isLVLCheckRequired != 1) {
        }
        Intent intent2 = new Intent();
        intent2.setClassName(str, str2);
        intent2.putExtra(EXTRA_PENDING_INTENT, pendingIntent);
        context.startService(intent2);
        return isLVLCheckRequired;
    }
}