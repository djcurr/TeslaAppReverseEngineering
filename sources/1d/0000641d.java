package com.zxcpoiu.incallmanager;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.ToneGenerator;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.webrtc.MediaStreamTrack;
import rw.a;

/* loaded from: classes6.dex */
public class InCallManagerModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String REACT_NATIVE_MODULE_NAME = "InCallManager";
    private static final String SPEAKERPHONE_AUTO = "auto";
    private static final String SPEAKERPHONE_FALSE = "false";
    private static final String SPEAKERPHONE_TRUE = "true";
    private static final String TAG = "InCallManager";
    private static SparseArray<Promise> mRequestPermissionCodePromises;
    private static SparseArray<String> mRequestPermissionCodeTargetPermission;
    private Set<m> audioDevices;
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private AudioManager audioManager;
    private boolean audioManagerActivated;
    private Map<String, Uri> audioUriMap;
    private boolean automatic;
    private final rw.a bluetoothManager;
    private Uri bundleBusytoneUri;
    private Uri bundleRingbackUri;
    private Uri bundleRingtoneUri;
    private m defaultAudioDevice;
    private int defaultAudioMode;
    private Uri defaultBusytoneUri;
    private Uri defaultRingbackUri;
    private Uri defaultRingtoneUri;
    private boolean defaultSpeakerOn;
    private int forceSpeakerOn;
    private boolean hasWiredHeadset;
    private boolean isAudioFocused;
    private boolean isOrigAudioSetupStored;
    private boolean isProximityRegistered;
    private WindowManager.LayoutParams lastLayoutParams;
    private n mBusytone;
    private o mOnFocusChangeListener;
    private String mPackageName;
    private PowerManager mPowerManager;
    private n mRingback;
    private n mRingtone;
    private Handler mRingtoneCountDownHandler;
    private WindowManager mWindowManager;
    private String media;
    private BroadcastReceiver mediaButtonReceiver;
    private BroadcastReceiver noisyAudioReceiver;
    private int origAudioMode;
    private boolean origIsMicrophoneMute;
    private boolean origIsSpeakerPhoneOn;
    private boolean proximityIsNear;
    private final com.zxcpoiu.incallmanager.b proximityManager;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerPhoneOn;
    private m selectedAudioDevice;
    private final String useSpeakerphone;
    private m userSelectedAudioDevice;
    private final com.zxcpoiu.incallmanager.c wakeLockUtils;
    private BroadcastReceiver wiredHeadsetReceiver;
    private static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    private static String recordPermission = "unknow";
    private static String cameraPermission = "unknow";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements MediaPlayer.OnPreparedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f22973a;

        a(String str) {
            this.f22973a = str;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            Log.d("InCallManager", String.format("MediaPlayer %s onPrepared(), start play, isSpeakerPhoneOn %b", this.f22973a, Boolean.valueOf(InCallManagerModule.this.audioManager.isSpeakerphoneOn())));
            if (this.f22973a.equals("mBusytone")) {
                InCallManagerModule.this.audioManager.setMode(3);
            } else if (this.f22973a.equals("mRingback")) {
                InCallManagerModule.this.audioManager.setMode(3);
            } else if (this.f22973a.equals("mRingtone")) {
                InCallManagerModule.this.audioManager.setMode(1);
            }
            InCallManagerModule.this.updateAudioRoute();
            mediaPlayer.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b implements MediaPlayer.OnCompletionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f22975a;

        b(String str) {
            this.f22975a = str;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Log.d("InCallManager", String.format("MediaPlayer %s onCompletion()", this.f22975a));
            if (this.f22975a.equals("mBusytone")) {
                Log.d("InCallManager", "MyMediaPlayer(): invoke stop()");
                InCallManagerModule.this.stop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22977a;

        static {
            int[] iArr = new int[m.values().length];
            f22977a = iArr;
            try {
                iArr[m.SPEAKER_PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22977a[m.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22977a[m.WIRED_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22977a[m.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity currentActivity = InCallManagerModule.this.getCurrentActivity();
            if (currentActivity == null) {
                Log.d("InCallManager", "ReactContext doesn't hava any Activity attached.");
                return;
            }
            Window window = currentActivity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            InCallManagerModule.this.lastLayoutParams = attributes;
            attributes.screenBrightness = BitmapDescriptorFactory.HUE_RED;
            window.setAttributes(attributes);
            window.clearFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity currentActivity = InCallManagerModule.this.getCurrentActivity();
            if (currentActivity == null) {
                Log.d("InCallManager", "ReactContext doesn't hava any Activity attached.");
                return;
            }
            Window window = currentActivity.getWindow();
            if (InCallManagerModule.this.lastLayoutParams != null) {
                window.setAttributes(InCallManagerModule.this.lastLayoutParams);
            } else {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = -1.0f;
                window.setAttributes(attributes);
            }
            window.addFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!InCallManagerModule.ACTION_HEADSET_PLUG.equals(intent.getAction())) {
                InCallManagerModule.this.hasWiredHeadset = false;
                return;
            }
            InCallManagerModule.this.hasWiredHeadset = intent.getIntExtra("state", 0) == 1;
            InCallManagerModule.this.updateAudioRoute();
            String stringExtra = intent.getStringExtra("name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("isPlugged", intent.getIntExtra("state", 0) == 1);
            createMap.putBoolean("hasMic", intent.getIntExtra("microphone", 0) == 1);
            createMap.putString("deviceName", stringExtra);
            InCallManagerModule.this.sendEvent("WiredHeadset", createMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                InCallManagerModule.this.updateAudioRoute();
                InCallManagerModule.this.sendEvent("NoisyAudio", null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class h extends BroadcastReceiver {
        h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                int keyCode = ((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")).getKeyCode();
                switch (keyCode) {
                    case 85:
                        str = "KEYCODE_MEDIA_PLAY_PAUSE";
                        break;
                    case 86:
                        str = "KEYCODE_MEDIA_STOP";
                        break;
                    case 87:
                        str = "KEYCODE_MEDIA_NEXT";
                        break;
                    case 88:
                        str = "KEYCODE_MEDIA_PREVIOUS";
                        break;
                    default:
                        switch (keyCode) {
                            case 126:
                                str = "KEYCODE_MEDIA_PLAY";
                                break;
                            case 127:
                                str = "KEYCODE_MEDIA_PAUSE";
                                break;
                            case 128:
                                str = "KEYCODE_MEDIA_CLOSE";
                                break;
                            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                str = "KEYCODE_MEDIA_EJECT";
                                break;
                            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                str = "KEYCODE_MEDIA_RECORD";
                                break;
                            default:
                                str = "KEYCODE_UNKNOW";
                                break;
                        }
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("eventText", str);
                createMap.putInt("eventCode", keyCode);
                InCallManagerModule.this.sendEvent("MediaButton", createMap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f22983a;

        i(boolean z11) {
            this.f22983a = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity currentActivity = InCallManagerModule.this.getCurrentActivity();
            if (currentActivity == null) {
                Log.d("InCallManager", "ReactContext doesn't hava any Activity attached.");
                return;
            }
            Window window = currentActivity.getWindow();
            if (this.f22983a) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    /* loaded from: classes6.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f22985a;

        j(int i11) {
            this.f22985a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d("InCallManager", String.format("mRingtoneCountDownHandler.stopRingtone() timeout after %d seconds", Integer.valueOf(this.f22985a)));
                InCallManagerModule.this.stopRingtone();
            } catch (Exception unused) {
                Log.d("InCallManager", "mRingtoneCountDownHandler.stopRingtone() failed.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class k implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f22987a;

        k(InCallManagerModule inCallManagerModule, String str) {
            this.f22987a = str;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
            Log.d("InCallManager", String.format("MediaPlayer %s onError(). what: %d, extra: %d", this.f22987a, Integer.valueOf(i11), Integer.valueOf(i12)));
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class l implements MediaPlayer.OnInfoListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f22988a;

        l(InCallManagerModule inCallManagerModule, String str) {
            this.f22988a = str;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
            Log.d("InCallManager", String.format("MediaPlayer %s onInfo(). what: %d, extra: %d", this.f22988a, Integer.valueOf(i11), Integer.valueOf(i12)));
            return true;
        }
    }

    /* loaded from: classes6.dex */
    public enum m {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface n {
        void a();

        void b(Map<String, Object> map);

        boolean isPlaying();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class o implements AudioManager.OnAudioFocusChangeListener {
        private o() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i11) {
            String str = i11 != -3 ? i11 != -2 ? i11 != -1 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "AUDIOFOCUS_UNKNOW" : "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE" : "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK" : "AUDIOFOCUS_GAIN_TRANSIENT" : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
            Log.d("InCallManager", "onAudioFocusChange: " + i11 + " - " + str);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("eventText", str);
            createMap.putInt("eventCode", i11);
            InCallManagerModule.this.sendEvent("onAudioFocusChange", createMap);
        }

        /* synthetic */ o(InCallManagerModule inCallManagerModule, d dVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class p extends MediaPlayer implements n {
        private p() {
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.n
        public void a() {
            stop();
            reset();
            release();
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.n
        public void b(Map map) {
            try {
                boolean booleanValue = ((Boolean) map.get("setLooping")).booleanValue();
                int intValue = ((Integer) map.get("audioStream")).intValue();
                String str = (String) map.get("name");
                setDataSource(InCallManagerModule.this.getReactApplicationContext(), (Uri) map.get("sourceUri"));
                setLooping(booleanValue);
                setAudioStreamType(intValue);
                prepareAsync();
            } catch (Exception unused) {
                Log.d("InCallManager", "startPlay() failed");
            }
        }

        @Override // android.media.MediaPlayer, com.zxcpoiu.incallmanager.InCallManagerModule.n
        public boolean isPlaying() {
            return super.isPlaying();
        }

        /* synthetic */ p(InCallManagerModule inCallManagerModule, d dVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class q extends Thread implements n {

        /* renamed from: a  reason: collision with root package name */
        private int f22991a;

        /* renamed from: b  reason: collision with root package name */
        private int f22992b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f22993c = false;

        /* renamed from: d  reason: collision with root package name */
        public int f22994d = 3600000;

        /* renamed from: e  reason: collision with root package name */
        public String f22995e;

        q(int i11) {
            this.f22992b = i11;
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.n
        public void a() {
            synchronized (this) {
                if (this.f22993c) {
                    notify();
                }
                this.f22993c = false;
            }
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.n
        public void b(Map map) {
            this.f22995e = (String) map.get("name");
            start();
        }

        @Override // com.zxcpoiu.incallmanager.InCallManagerModule.n
        public boolean isPlaying() {
            return this.f22993c;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ToneGenerator toneGenerator;
            int i11 = 3600000;
            switch (this.f22992b) {
                case 101:
                    this.f22991a = 28;
                    i11 = 1000;
                    break;
                case 102:
                    this.f22991a = 20;
                    i11 = 4000;
                    break;
                case 103:
                    this.f22991a = 27;
                    i11 = 200;
                    break;
                case 104:
                    this.f22991a = 22;
                    break;
                case 105:
                    this.f22991a = 35;
                    break;
                case 106:
                    this.f22991a = 42;
                    i11 = 1000;
                    break;
                default:
                    Log.d("InCallManager", "myToneGenerator: use internal tone type: " + this.f22992b);
                    this.f22991a = this.f22992b;
                    i11 = this.f22994d;
                    break;
            }
            Log.d("InCallManager", String.format("myToneGenerator: toneCategory: %d ,toneType: %d, toneWaitTimeMs: %d", Integer.valueOf(this.f22992b), Integer.valueOf(this.f22991a), Integer.valueOf(i11)));
            try {
                toneGenerator = new ToneGenerator(0, 100);
            } catch (RuntimeException e11) {
                Log.d("InCallManager", "myToneGenerator: Exception caught while creating ToneGenerator: " + e11);
                toneGenerator = null;
            }
            if (toneGenerator != null) {
                synchronized (this) {
                    if (!this.f22993c) {
                        this.f22993c = true;
                        if (this.f22995e.equals("mBusytone")) {
                            InCallManagerModule.this.audioManager.setMode(3);
                        } else if (this.f22995e.equals("mRingback")) {
                            InCallManagerModule.this.audioManager.setMode(3);
                        } else if (this.f22995e.equals("mRingtone")) {
                            InCallManagerModule.this.audioManager.setMode(1);
                        }
                        InCallManagerModule.this.updateAudioRoute();
                        toneGenerator.startTone(this.f22991a);
                        try {
                            wait(i11 + 20);
                        } catch (InterruptedException unused) {
                            Log.d("InCallManager", "myToneGenerator stopped. toneType: " + this.f22991a);
                        }
                        toneGenerator.stopTone();
                    }
                    this.f22993c = false;
                    toneGenerator.release();
                }
            }
            Log.d("InCallManager", "MyToneGenerator(): play finished. caller=" + this.f22995e);
            if (this.f22995e.equals("mBusytone")) {
                Log.d("InCallManager", "MyToneGenerator(): invoke stop()");
                InCallManagerModule.this.stop();
            }
        }
    }

    public InCallManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mPackageName = "com.zxcpoiu.incallmanager";
        this.audioManagerActivated = false;
        this.isAudioFocused = false;
        this.isOrigAudioSetupStored = false;
        this.origIsSpeakerPhoneOn = false;
        this.origIsMicrophoneMute = false;
        this.origAudioMode = -2;
        this.defaultSpeakerOn = false;
        this.defaultAudioMode = 3;
        this.forceSpeakerOn = 0;
        this.automatic = true;
        this.isProximityRegistered = false;
        this.proximityIsNear = false;
        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
        this.defaultRingtoneUri = uri;
        this.defaultRingbackUri = uri;
        this.defaultBusytoneUri = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.media = MediaStreamTrack.AUDIO_TRACK_KIND;
        this.savedAudioMode = -2;
        this.savedIsSpeakerPhoneOn = false;
        this.savedIsMicrophoneMute = false;
        this.hasWiredHeadset = false;
        this.defaultAudioDevice = m.NONE;
        this.useSpeakerphone = SPEAKERPHONE_AUTO;
        this.audioDevices = new HashSet();
        this.mPackageName = reactApplicationContext.getPackageName();
        reactApplicationContext.addLifecycleEventListener(this);
        this.mWindowManager = (WindowManager) reactApplicationContext.getSystemService("window");
        this.mPowerManager = (PowerManager) reactApplicationContext.getSystemService("power");
        this.audioManager = (AudioManager) reactApplicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        HashMap hashMap = new HashMap();
        this.audioUriMap = hashMap;
        hashMap.put("defaultRingtoneUri", this.defaultRingtoneUri);
        this.audioUriMap.put("defaultRingbackUri", this.defaultRingbackUri);
        this.audioUriMap.put("defaultBusytoneUri", this.defaultBusytoneUri);
        this.audioUriMap.put("bundleRingtoneUri", this.bundleRingtoneUri);
        this.audioUriMap.put("bundleRingbackUri", this.bundleRingbackUri);
        this.audioUriMap.put("bundleBusytoneUri", this.bundleBusytoneUri);
        mRequestPermissionCodePromises = new SparseArray<>();
        mRequestPermissionCodeTargetPermission = new SparseArray<>();
        this.mOnFocusChangeListener = new o(this, null);
        this.bluetoothManager = rw.a.k(reactApplicationContext, this);
        this.proximityManager = com.zxcpoiu.incallmanager.b.d(reactApplicationContext, this);
        this.wakeLockUtils = new com.zxcpoiu.incallmanager.c(reactApplicationContext);
        Log.d("InCallManager", "InCallManager initialized");
    }

    private void _checkCameraPermission() {
        String _checkPermission = _checkPermission("android.permission.CAMERA");
        cameraPermission = _checkPermission;
        Log.d("InCallManager", String.format("RNInCallManager.checkCameraPermission(): cameraPermission=%s", _checkPermission));
    }

    private String _checkPermission(String str) {
        try {
            return androidx.core.content.b.checkSelfPermission(getReactApplicationContext(), str) == 0 ? PermissionsResponse.GRANTED_KEY : "denied";
        } catch (Exception unused) {
            Log.d("InCallManager", "_checkPermission() catch");
            return "denied";
        }
    }

    private void _checkRecordPermission() {
        String _checkPermission = _checkPermission("android.permission.RECORD_AUDIO");
        recordPermission = _checkPermission;
        Log.d("InCallManager", String.format("RNInCallManager.checkRecordPermission(): recordPermission=%s", _checkPermission));
    }

    private void _requestPermission(String str, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.d("InCallManager", String.format("RNInCallManager._requestPermission(): ReactContext doesn't hava any Activity attached when requesting %s", str));
            promise.reject(new Exception("_requestPermission(): currentActivity is not attached"));
            return;
        }
        int randomInteger = getRandomInteger(1, okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        while (mRequestPermissionCodePromises.get(randomInteger, null) != null) {
            randomInteger = getRandomInteger(1, okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
        mRequestPermissionCodePromises.put(randomInteger, promise);
        mRequestPermissionCodeTargetPermission.put(randomInteger, str);
        androidx.core.app.a.e(currentActivity, new String[]{str}, randomInteger);
    }

    private void debugScreenPowerState() {
        String str;
        String str2;
        String format;
        int i11 = Build.VERSION.SDK_INT;
        String str3 = "unknow";
        if (i11 >= 23) {
            str = String.format("%s", Boolean.valueOf(this.mPowerManager.isDeviceIdleMode()));
            str2 = String.format("%s", Boolean.valueOf(this.mPowerManager.isIgnoringBatteryOptimizations(this.mPackageName)));
        } else {
            str = "unknow";
            str2 = str;
        }
        String format2 = i11 >= 21 ? String.format("%s", Boolean.valueOf(this.mPowerManager.isPowerSaveMode())) : "unknow";
        if (i11 >= 20) {
            format = String.format("%s", Boolean.valueOf(this.mPowerManager.isInteractive()));
            int state = this.mWindowManager.getDefaultDisplay().getState();
            if (state == 1) {
                str3 = "STATE_OFF";
            } else if (state == 2) {
                str3 = "STATE_ON";
            } else if (state == 3) {
                str3 = "STATE_DOZE";
            } else if (state == 4) {
                str3 = "STATE_DOZE_SUSPEND";
            }
        } else {
            format = String.format("%s", Boolean.valueOf(this.mPowerManager.isScreenOn()));
        }
        Log.d("InCallManager", String.format("debugScreenPowerState(): screenState='%s', isInteractive='%s', isPowerSaveMode='%s', isDeviceIdleMode='%s', isIgnoringBatteryOptimizations='%s'", str3, format, format2, str, str2));
    }

    private WritableMap getAudioDeviceStatusMap() {
        Iterator<m> it2;
        WritableMap createMap = Arguments.createMap();
        String str = "[";
        while (this.audioDevices.iterator().hasNext()) {
            str = str + "\"" + it2.next().name() + "\",";
        }
        if (str.length() > 1) {
            str = str.substring(0, str.length() - 1);
        }
        createMap.putString("availableAudioDeviceList", str + "]");
        m mVar = this.selectedAudioDevice;
        createMap.putString("selectedAudioDevice", mVar == null ? "" : mVar.name());
        return createMap;
    }

    private Uri getAudioUri(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i11;
        if (str.equals("_BUNDLE_")) {
            if (this.audioUriMap.get(str6) == null) {
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                if (reactApplicationContext != null) {
                    i11 = reactApplicationContext.getResources().getIdentifier(str2, "raw", this.mPackageName);
                } else {
                    Log.d("InCallManager", "getAudioUri() reactContext is null");
                    i11 = 0;
                }
                if (i11 <= 0) {
                    Log.d("InCallManager", String.format("getAudioUri() %s.%s not found in bundle.", str2, str3));
                    this.audioUriMap.put(str6, null);
                    return getDefaultUserUri(str7);
                }
                this.audioUriMap.put(str6, Uri.parse("android.resource://" + this.mPackageName + "/" + Integer.toString(i11)));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getAudioUri() using: ");
                sb2.append(str);
                Log.d("InCallManager", sb2.toString());
                return this.audioUriMap.get(str6);
            }
            Log.d("InCallManager", "getAudioUri() using: " + str);
            return this.audioUriMap.get(str6);
        }
        String str8 = str5 + "/" + str;
        Uri sysFileUri = getSysFileUri(str8);
        if (sysFileUri == null) {
            Log.d("InCallManager", "getAudioUri() using user default");
            return getDefaultUserUri(str7);
        }
        Log.d("InCallManager", "getAudioUri() using internal: " + str8);
        this.audioUriMap.put(str7, sysFileUri);
        return sysFileUri;
    }

    private Uri getBusytoneUri(String str) {
        if (!str.equals("_DEFAULT_") && !str.isEmpty()) {
            return getAudioUri(str, "incallmanager_busytone", "mp3", "LowBattery.ogg", "/system/media/audio/ui", "bundleBusytoneUri", "defaultBusytoneUri");
        }
        return getDefaultUserUri("defaultBusytoneUri");
    }

    private Uri getDefaultUserUri(String str) {
        if (str.equals("defaultRingtoneUri")) {
            return Settings.System.DEFAULT_RINGTONE_URI;
        }
        if (str.equals("defaultRingbackUri")) {
            return Settings.System.DEFAULT_RINGTONE_URI;
        }
        if (str.equals("defaultBusytoneUri")) {
            return Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    private m getPreferredAudioDevice() {
        return getPreferredAudioDevice(false);
    }

    private static int getRandomInteger(int i11, int i12) {
        if (i11 < i12) {
            return new Random().nextInt((i12 - i11) + 1) + i11;
        }
        throw new IllegalArgumentException("max must be greater than min");
    }

    private Uri getRingbackUri(String str) {
        if (!str.equals("_DEFAULT_") && !str.isEmpty()) {
            return getAudioUri(str, "incallmanager_ringback", "mp3", "media_volume.ogg", "/system/media/audio/ui", "bundleRingbackUri", "defaultRingbackUri");
        }
        return getDefaultUserUri("defaultRingbackUri");
    }

    private Uri getRingtoneUri(String str) {
        if (!str.equals("_DEFAULT_") && !str.isEmpty()) {
            return getAudioUri(str, "incallmanager_ringtone", "mp3", "media_volume.ogg", "/system/media/audio/ui", "bundleRingtoneUri", "defaultRingtoneUri");
        }
        return getDefaultUserUri("defaultRingtoneUri");
    }

    private Uri getSysFileUri(String str) {
        File file = new File(str);
        if (file.isFile()) {
            return Uri.fromFile(file);
        }
        return null;
    }

    private boolean hasEarpiece() {
        return getReactApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    @Deprecated
    private boolean hasWiredHeadset() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.audioManager.isWiredHeadsetOn();
        }
        for (AudioDeviceInfo audioDeviceInfo : this.audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3) {
                Log.d("InCallManager", "hasWiredHeadset: found wired headset");
                return true;
            } else if (type == 11) {
                Log.d("InCallManager", "hasWiredHeadset: found USB audio device");
                return true;
            }
        }
        return false;
    }

    private void manualTurnScreenOff() {
        Log.d("InCallManager", "manualTurnScreenOff()");
        UiThreadUtil.runOnUiThread(new d());
    }

    private void manualTurnScreenOn() {
        Log.d("InCallManager", "manualTurnScreenOn()");
        UiThreadUtil.runOnUiThread(new e());
    }

    protected static void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        Log.d("InCallManager", "RNInCallManager.onRequestPermissionsResult(): enter");
        Promise promise = mRequestPermissionCodePromises.get(i11, null);
        String str = mRequestPermissionCodeTargetPermission.get(i11, null);
        mRequestPermissionCodePromises.delete(i11);
        mRequestPermissionCodeTargetPermission.delete(i11);
        if (promise != null && str != null) {
            HashMap hashMap = new HashMap();
            for (int i12 = 0; i12 < strArr.length; i12++) {
                hashMap.put(strArr[i12], Integer.valueOf(iArr[i12]));
            }
            if (!hashMap.containsKey(str)) {
                Log.wtf("InCallManager", String.format("RNInCallManager.onRequestPermissionsResult(): requested permission %s but did not appear", str));
                promise.reject(String.format("%s_PERMISSION_NOT_FOUND", str), String.format("requested permission %s but did not appear", str));
                return;
            }
            String str2 = ((Integer) hashMap.get(str)).intValue() == 0 ? PermissionsResponse.GRANTED_KEY : "denied";
            if (str.equals("android.permission.RECORD_AUDIO")) {
                recordPermission = str2;
            } else if (str.equals("android.permission.CAMERA")) {
                cameraPermission = str2;
            }
            promise.resolve(str2);
            return;
        }
        Log.wtf("InCallManager", "RNInCallManager.onRequestPermissionsResult(): request code not found");
        promise.reject("PERMISSION_REQUEST_CODE_NOT_FOUND", "request code not found");
    }

    private void pause() {
        if (this.audioManagerActivated) {
            Log.d("InCallManager", "pause audioRouteManager");
            stopEvents();
        }
    }

    private void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        getReactApplicationContext().registerReceiver(broadcastReceiver, intentFilter);
    }

    private void releaseAudioFocus() {
        if (this.isAudioFocused) {
            this.audioManager.abandonAudioFocus(null);
            this.isAudioFocused = false;
        }
    }

    private void requestAudioFocus() {
        if (this.isAudioFocused) {
            return;
        }
        int requestAudioFocus = this.audioManager.requestAudioFocus(this.mOnFocusChangeListener, 0, 1);
        if (requestAudioFocus == 1) {
            Log.d("InCallManager", "AudioFocus granted");
            this.isAudioFocused = true;
        } else if (requestAudioFocus == 0) {
            Log.d("InCallManager", "AudioFocus failed");
            this.isAudioFocused = false;
        }
    }

    private void restoreOriginalAudioSetup() {
        Log.d("InCallManager", "restoreOriginalAudioSetup()");
        if (this.isOrigAudioSetupStored) {
            setSpeakerphoneOn(this.origIsSpeakerPhoneOn);
            setMicrophoneMute(this.origIsMicrophoneMute);
            this.audioManager.setMode(this.origAudioMode);
            if (getCurrentActivity() != null) {
                getCurrentActivity().setVolumeControlStream(Integer.MIN_VALUE);
            }
            this.isOrigAudioSetupStored = false;
        }
    }

    private void resume() {
        if (this.audioManagerActivated) {
            Log.d("InCallManager", "resume audioRouteManager");
            startEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            } else {
                Log.e("InCallManager", "sendEvent(): reactContext is null or not having CatalystInstance yet.");
            }
        } catch (RuntimeException unused) {
            Log.e("InCallManager", "sendEvent(): java.lang.RuntimeException: Trying to invoke JS before CatalystInstance has been set!");
        }
    }

    private void setAudioDeviceInternal(m mVar) {
        Log.d("InCallManager", "setAudioDeviceInternal(device=" + mVar + ")");
        if (!this.audioDevices.contains(mVar)) {
            Log.e("InCallManager", "specified audio device does not exist");
            return;
        }
        int i11 = c.f22977a[mVar.ordinal()];
        if (i11 == 1) {
            setSpeakerphoneOn(true);
        } else if (i11 == 2) {
            setSpeakerphoneOn(false);
        } else if (i11 == 3) {
            setSpeakerphoneOn(false);
        } else if (i11 != 4) {
            Log.e("InCallManager", "Invalid audio device selection");
        } else {
            setSpeakerphoneOn(false);
        }
        this.selectedAudioDevice = mVar;
    }

    private void setMediaPlayerEvents(MediaPlayer mediaPlayer, String str) {
        mediaPlayer.setOnErrorListener(new k(this, str));
        mediaPlayer.setOnInfoListener(new l(this, str));
        mediaPlayer.setOnPreparedListener(new a(str));
        mediaPlayer.setOnCompletionListener(new b(str));
    }

    private void startEvents() {
        startWiredHeadsetEvent();
        startNoisyAudioEvent();
        startMediaButtonEvent();
        startProximitySensor();
        setKeepScreenOn(true);
    }

    private void startMediaButtonEvent() {
        if (this.mediaButtonReceiver == null) {
            Log.d("InCallManager", "startMediaButtonEvent()");
            IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
            this.mediaButtonReceiver = new h();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            if (reactApplicationContext != null) {
                reactApplicationContext.registerReceiver(this.mediaButtonReceiver, intentFilter);
            } else {
                Log.d("InCallManager", "startMediaButtonEvent() reactContext is null");
            }
        }
    }

    private void startNoisyAudioEvent() {
        if (this.noisyAudioReceiver == null) {
            Log.d("InCallManager", "startNoisyAudioEvent()");
            IntentFilter intentFilter = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
            this.noisyAudioReceiver = new g();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            if (reactApplicationContext != null) {
                reactApplicationContext.registerReceiver(this.noisyAudioReceiver, intentFilter);
            } else {
                Log.d("InCallManager", "startNoisyAudioEvent() reactContext is null");
            }
        }
    }

    private void startProximitySensor() {
        if (!this.proximityManager.e()) {
            Log.d("InCallManager", "Proximity Sensor is not supported.");
        } else if (this.isProximityRegistered) {
            Log.d("InCallManager", "Proximity Sensor is already registered.");
        } else if (!this.proximityManager.h()) {
            Log.d("InCallManager", "proximityManager.start() failed. return false");
        } else {
            Log.d("InCallManager", "startProximitySensor()");
            this.isProximityRegistered = true;
        }
    }

    private void startWiredHeadsetEvent() {
        if (this.wiredHeadsetReceiver == null) {
            Log.d("InCallManager", "startWiredHeadsetEvent()");
            IntentFilter intentFilter = new IntentFilter(ACTION_HEADSET_PLUG);
            this.wiredHeadsetReceiver = new f();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            if (reactApplicationContext != null) {
                reactApplicationContext.registerReceiver(this.wiredHeadsetReceiver, intentFilter);
            } else {
                Log.d("InCallManager", "startWiredHeadsetEvent() reactContext is null");
            }
        }
    }

    private void stopEvents() {
        stopWiredHeadsetEvent();
        stopNoisyAudioEvent();
        stopMediaButtonEvent();
        stopProximitySensor();
        setKeepScreenOn(false);
        turnScreenOn();
    }

    private void stopMediaButtonEvent() {
        if (this.mediaButtonReceiver != null) {
            Log.d("InCallManager", "stopMediaButtonEvent()");
            unregisterReceiver(this.mediaButtonReceiver);
            this.mediaButtonReceiver = null;
        }
    }

    private void stopNoisyAudioEvent() {
        if (this.noisyAudioReceiver != null) {
            Log.d("InCallManager", "stopNoisyAudioEvent()");
            unregisterReceiver(this.noisyAudioReceiver);
            this.noisyAudioReceiver = null;
        }
    }

    private void stopProximitySensor() {
        if (!this.proximityManager.e()) {
            Log.d("InCallManager", "Proximity Sensor is not supported.");
        } else if (!this.isProximityRegistered) {
            Log.d("InCallManager", "Proximity Sensor is not registered.");
        } else {
            Log.d("InCallManager", "stopProximitySensor()");
            this.proximityManager.i();
            this.isProximityRegistered = false;
        }
    }

    private void stopWiredHeadsetEvent() {
        if (this.wiredHeadsetReceiver != null) {
            Log.d("InCallManager", "stopWiredHeadsetEvent()");
            unregisterReceiver(this.wiredHeadsetReceiver);
            this.wiredHeadsetReceiver = null;
        }
    }

    private void storeOriginalAudioSetup() {
        Log.d("InCallManager", "storeOriginalAudioSetup()");
        if (this.isOrigAudioSetupStored) {
            return;
        }
        this.origAudioMode = this.audioManager.getMode();
        this.origIsSpeakerPhoneOn = this.audioManager.isSpeakerphoneOn();
        this.origIsMicrophoneMute = this.audioManager.isMicrophoneMute();
        this.isOrigAudioSetupStored = true;
    }

    private void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null) {
            try {
                reactApplicationContext.unregisterReceiver(broadcastReceiver);
                return;
            } catch (Exception unused) {
                Log.d("InCallManager", "unregisterReceiver() failed");
                return;
            }
        }
        Log.d("InCallManager", "unregisterReceiver() reactContext is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAudioRoute() {
        if (this.automatic) {
            updateAudioDeviceState();
        }
    }

    @ReactMethod
    public void checkCameraPermission(Promise promise) {
        Log.d("InCallManager", "RNInCallManager.checkCameraPermission(): enter");
        _checkCameraPermission();
        if (cameraPermission.equals("unknow")) {
            Log.d("InCallManager", "RNInCallManager.checkCameraPermission(): failed");
            promise.reject(new Exception("checkCameraPermission failed"));
            return;
        }
        promise.resolve(cameraPermission);
    }

    @ReactMethod
    public void checkRecordPermission(Promise promise) {
        Log.d("InCallManager", "RNInCallManager.checkRecordPermission(): enter");
        _checkRecordPermission();
        if (recordPermission.equals("unknow")) {
            Log.d("InCallManager", "RNInCallManager.checkRecordPermission(): failed");
            promise.reject(new Exception("checkRecordPermission failed"));
            return;
        }
        promise.resolve(recordPermission);
    }

    @ReactMethod
    public void chooseAudioRoute(String str, Promise promise) {
        Log.d("InCallManager", "RNInCallManager.chooseAudioRoute(): user choose audioDevice = " + str);
        m mVar = m.EARPIECE;
        if (str.equals(mVar.name())) {
            selectAudioDevice(mVar);
        } else {
            m mVar2 = m.SPEAKER_PHONE;
            if (str.equals(mVar2.name())) {
                selectAudioDevice(mVar2);
            } else {
                m mVar3 = m.WIRED_HEADSET;
                if (str.equals(mVar3.name())) {
                    selectAudioDevice(mVar3);
                } else {
                    m mVar4 = m.BLUETOOTH;
                    if (str.equals(mVar4.name())) {
                        selectAudioDevice(mVar4);
                    }
                }
            }
        }
        promise.resolve(getAudioDeviceStatusMap());
    }

    public Set<m> getAudioDevices() {
        return Collections.unmodifiableSet(new HashSet(this.audioDevices));
    }

    @ReactMethod
    public void getAudioUriJS(String str, String str2, Promise promise) {
        Uri ringtoneUri;
        if (str.equals("ringback")) {
            ringtoneUri = getRingbackUri(str2);
        } else if (str.equals("busytone")) {
            ringtoneUri = getBusytoneUri(str2);
        } else {
            ringtoneUri = str.equals("ringtone") ? getRingtoneUri(str2) : null;
        }
        try {
            if (ringtoneUri != null) {
                promise.resolve(ringtoneUri.toString());
            } else {
                promise.reject("failed");
            }
        } catch (Exception unused) {
            promise.reject("failed");
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "InCallManager";
    }

    public m getSelectedAudioDevice() {
        return this.selectedAudioDevice;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Log.d("InCallManager", "onDestroy()");
        stopRingtone();
        stopRingback();
        stopBusytone();
        stop();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Log.d("InCallManager", "onPause()");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Log.d("InCallManager", "onResume()");
    }

    public void onProximitySensorChangedState(boolean z11) {
        if (this.automatic && getSelectedAudioDevice() == m.EARPIECE) {
            if (z11) {
                turnScreenOff();
            } else {
                turnScreenOn();
            }
            updateAudioRoute();
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isNear", z11);
        sendEvent("Proximity", createMap);
    }

    @ReactMethod
    public void pokeScreen(int i11) {
        Log.d("InCallManager", "pokeScreen()");
        this.wakeLockUtils.e(i11);
    }

    @ReactMethod
    public void requestCameraPermission(Promise promise) {
        Log.d("InCallManager", "RNInCallManager.requestCameraPermission(): enter");
        _checkCameraPermission();
        if (!cameraPermission.equals(PermissionsResponse.GRANTED_KEY)) {
            _requestPermission("android.permission.CAMERA", promise);
        } else {
            promise.resolve(cameraPermission);
        }
    }

    @ReactMethod
    public void requestRecordPermission(Promise promise) {
        Log.d("InCallManager", "RNInCallManager.requestRecordPermission(): enter");
        _checkRecordPermission();
        if (!recordPermission.equals(PermissionsResponse.GRANTED_KEY)) {
            _requestPermission("android.permission.RECORD_AUDIO", promise);
        } else {
            promise.resolve(recordPermission);
        }
    }

    public void selectAudioDevice(m mVar) {
        if (mVar != m.NONE && !this.audioDevices.contains(mVar)) {
            Log.e("InCallManager", "selectAudioDevice() Can not select " + mVar + " from available " + this.audioDevices);
            return;
        }
        this.userSelectedAudioDevice = mVar;
        updateAudioDeviceState();
    }

    public void setDefaultAudioDevice(m mVar) {
        int i11 = c.f22977a[mVar.ordinal()];
        if (i11 == 1) {
            this.defaultAudioDevice = mVar;
        } else if (i11 != 2) {
            Log.e("InCallManager", "Invalid default audio device selection");
        } else if (hasEarpiece()) {
            this.defaultAudioDevice = mVar;
        } else {
            this.defaultAudioDevice = m.SPEAKER_PHONE;
        }
        Log.d("InCallManager", "setDefaultAudioDevice(device=" + this.defaultAudioDevice + ")");
        updateAudioDeviceState();
    }

    @ReactMethod
    public void setForceSpeakerphoneOn(int i11) {
        if (i11 < -1 || i11 > 1) {
            return;
        }
        Log.d("InCallManager", "setForceSpeakerphoneOn() flag: " + i11);
        this.forceSpeakerOn = i11;
        if (i11 == 1) {
            selectAudioDevice(m.SPEAKER_PHONE);
        } else if (i11 == -1) {
            selectAudioDevice(m.EARPIECE);
        } else {
            selectAudioDevice(m.NONE);
        }
    }

    @ReactMethod
    public void setKeepScreenOn(boolean z11) {
        Log.d("InCallManager", "setKeepScreenOn() " + z11);
        UiThreadUtil.runOnUiThread(new i(z11));
    }

    @ReactMethod
    public void setMicrophoneMute(boolean z11) {
        if (z11 != this.audioManager.isMicrophoneMute()) {
            Log.d("InCallManager", "setMicrophoneMute(): " + z11);
            this.audioManager.setMicrophoneMute(z11);
        }
    }

    @ReactMethod
    public void setSpeakerphoneOn(boolean z11) {
        if (z11 != this.audioManager.isSpeakerphoneOn()) {
            Log.d("InCallManager", "setSpeakerphoneOn(): " + z11);
            this.audioManager.setSpeakerphoneOn(z11);
        }
    }

    @ReactMethod
    public void start(String str, boolean z11, String str2) {
        this.media = str;
        if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            this.defaultSpeakerOn = true;
        } else {
            this.defaultSpeakerOn = false;
        }
        this.automatic = z11;
        if (this.audioManagerActivated) {
            return;
        }
        this.audioManagerActivated = true;
        Log.d("InCallManager", "start audioRouteManager");
        this.wakeLockUtils.d();
        n nVar = this.mRingtone;
        if (nVar != null && nVar.isPlaying()) {
            Log.d("InCallManager", "stop ringtone");
            stopRingtone();
        }
        storeOriginalAudioSetup();
        requestAudioFocus();
        startEvents();
        this.bluetoothManager.s();
        this.audioManager.setMode(this.defaultAudioMode);
        setSpeakerphoneOn(this.defaultSpeakerOn);
        setMicrophoneMute(false);
        this.forceSpeakerOn = 0;
        this.hasWiredHeadset = hasWiredHeadset();
        this.defaultAudioDevice = (!this.defaultSpeakerOn && hasEarpiece()) ? m.EARPIECE : m.SPEAKER_PHONE;
        m mVar = m.NONE;
        this.userSelectedAudioDevice = mVar;
        this.selectedAudioDevice = mVar;
        this.audioDevices.clear();
        updateAudioRoute();
        if (str2.isEmpty()) {
            return;
        }
        startRingback(str2);
    }

    public boolean startBusytone(String str) {
        if (str.isEmpty()) {
            return false;
        }
        try {
            Log.d("InCallManager", "startBusytone(): UriType=" + str);
            n nVar = this.mBusytone;
            if (nVar != null) {
                if (nVar.isPlaying()) {
                    Log.d("InCallManager", "startBusytone(): is already playing");
                    return false;
                }
                stopBusytone();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("name", "mBusytone");
            if (str.equals("_DTMF_")) {
                q qVar = new q(102);
                this.mBusytone = qVar;
                qVar.b(hashMap);
                return true;
            }
            Uri busytoneUri = getBusytoneUri(str);
            if (busytoneUri == null) {
                Log.d("InCallManager", "startBusytone(): no available media");
                return false;
            }
            this.mBusytone = new p(this, null);
            hashMap.put("sourceUri", busytoneUri);
            hashMap.put("setLooping", Boolean.FALSE);
            hashMap.put("audioStream", 0);
            setMediaPlayerEvents((MediaPlayer) this.mBusytone, "mBusytone");
            this.mBusytone.b(hashMap);
            return true;
        } catch (Exception e11) {
            Log.d("InCallManager", "startBusytone() failed");
            Log.d("InCallManager", e11.getMessage());
            return false;
        }
    }

    @ReactMethod
    public void startRingback(String str) {
        if (str.isEmpty()) {
            return;
        }
        try {
            Log.d("InCallManager", "startRingback(): UriType=" + str);
            n nVar = this.mRingback;
            if (nVar != null) {
                if (nVar.isPlaying()) {
                    Log.d("InCallManager", "startRingback(): is already playing");
                    return;
                }
                stopRingback();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("name", "mRingback");
            if (str.equals("_DTMF_")) {
                q qVar = new q(105);
                this.mRingback = qVar;
                qVar.b(hashMap);
                return;
            }
            Uri ringbackUri = getRingbackUri(str);
            if (ringbackUri == null) {
                Log.d("InCallManager", "startRingback(): no available media");
                return;
            }
            this.mRingback = new p(this, null);
            hashMap.put("sourceUri", ringbackUri);
            hashMap.put("setLooping", Boolean.TRUE);
            hashMap.put("audioStream", 0);
            setMediaPlayerEvents((MediaPlayer) this.mRingback, "mRingback");
            this.mRingback.b(hashMap);
        } catch (Exception unused) {
            Log.d("InCallManager", "startRingback() failed");
        }
    }

    @ReactMethod
    public void startRingtone(String str, int i11) {
        try {
            Log.d("InCallManager", "startRingtone(): UriType=" + str);
            n nVar = this.mRingtone;
            if (nVar != null) {
                if (nVar.isPlaying()) {
                    Log.d("InCallManager", "startRingtone(): is already playing");
                    return;
                }
                stopRingtone();
            }
            if (this.audioManager.getStreamVolume(2) == 0) {
                Log.d("InCallManager", "startRingtone(): ringer is silent. leave without play.");
                return;
            }
            Uri ringtoneUri = getRingtoneUri(str);
            if (ringtoneUri == null) {
                Log.d("InCallManager", "startRingtone(): no available media");
                return;
            }
            if (this.audioManagerActivated) {
                stop();
            }
            this.wakeLockUtils.d();
            storeOriginalAudioSetup();
            HashMap hashMap = new HashMap();
            this.mRingtone = new p(this, null);
            hashMap.put("name", "mRingtone");
            hashMap.put("sourceUri", ringtoneUri);
            hashMap.put("setLooping", Boolean.TRUE);
            hashMap.put("audioStream", 2);
            setMediaPlayerEvents((MediaPlayer) this.mRingtone, "mRingtone");
            this.mRingtone.b(hashMap);
            if (i11 > 0) {
                Handler handler = new Handler();
                this.mRingtoneCountDownHandler = handler;
                handler.postDelayed(new j(i11), i11 * 1000);
            }
        } catch (Exception unused) {
            this.wakeLockUtils.f();
            Log.d("InCallManager", "startRingtone() failed");
        }
    }

    public void stop() {
        stop("");
    }

    public void stopBusytone() {
        try {
            n nVar = this.mBusytone;
            if (nVar != null) {
                nVar.a();
                this.mBusytone = null;
            }
        } catch (Exception unused) {
            Log.d("InCallManager", "stopBusytone() failed");
        }
    }

    @ReactMethod
    public void stopRingback() {
        try {
            n nVar = this.mRingback;
            if (nVar != null) {
                nVar.a();
                this.mRingback = null;
            }
        } catch (Exception unused) {
            Log.d("InCallManager", "stopRingback() failed");
        }
    }

    @ReactMethod
    public void stopRingtone() {
        try {
            n nVar = this.mRingtone;
            if (nVar != null) {
                nVar.a();
                this.mRingtone = null;
                restoreOriginalAudioSetup();
            }
            Handler handler = this.mRingtoneCountDownHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.mRingtoneCountDownHandler = null;
            }
        } catch (Exception unused) {
            Log.d("InCallManager", "stopRingtone() failed");
        }
        this.wakeLockUtils.f();
    }

    @ReactMethod
    public void turnScreenOff() {
        if (this.proximityManager.f()) {
            Log.d("InCallManager", "turnScreenOff(): use proximity lock.");
            this.proximityManager.b();
            return;
        }
        Log.d("InCallManager", "turnScreenOff(): proximity lock is not supported. try manually.");
        manualTurnScreenOff();
    }

    @ReactMethod
    public void turnScreenOn() {
        if (this.proximityManager.f()) {
            Log.d("InCallManager", "turnScreenOn(): use proximity lock.");
            this.proximityManager.g(true);
            return;
        }
        Log.d("InCallManager", "turnScreenOn(): proximity lock is not supported. try manually.");
        manualTurnScreenOn();
    }

    public void updateAudioDeviceState() {
        m mVar;
        Log.d("InCallManager", "--- updateAudioDeviceState: wired headset=" + this.hasWiredHeadset + ", BT state=" + this.bluetoothManager.n());
        Log.d("InCallManager", "Device status: available=" + this.audioDevices + ", selected=" + this.selectedAudioDevice + ", user selected=" + this.userSelectedAudioDevice);
        a.d n11 = this.bluetoothManager.n();
        a.d dVar = a.d.HEADSET_AVAILABLE;
        if (n11 == dVar || this.bluetoothManager.n() == a.d.HEADSET_UNAVAILABLE || this.bluetoothManager.n() == a.d.SCO_DISCONNECTING) {
            this.bluetoothManager.A();
        }
        HashSet hashSet = new HashSet();
        hashSet.add(m.SPEAKER_PHONE);
        a.d n12 = this.bluetoothManager.n();
        a.d dVar2 = a.d.SCO_CONNECTED;
        if (n12 == dVar2 || this.bluetoothManager.n() == a.d.SCO_CONNECTING || this.bluetoothManager.n() == dVar) {
            hashSet.add(m.BLUETOOTH);
        }
        if (this.hasWiredHeadset) {
            hashSet.add(m.WIRED_HEADSET);
        }
        if (hasEarpiece()) {
            hashSet.add(m.EARPIECE);
        }
        m mVar2 = this.userSelectedAudioDevice;
        if (mVar2 != null && mVar2 != (mVar = m.NONE) && !hashSet.contains(mVar2)) {
            this.userSelectedAudioDevice = mVar;
        }
        boolean z11 = !this.audioDevices.equals(hashSet);
        this.audioDevices = hashSet;
        m preferredAudioDevice = getPreferredAudioDevice();
        m mVar3 = this.selectedAudioDevice;
        m mVar4 = m.BLUETOOTH;
        if (mVar3 == mVar4 && preferredAudioDevice != mVar4 && (this.bluetoothManager.n() == dVar2 || this.bluetoothManager.n() == a.d.SCO_CONNECTING)) {
            this.bluetoothManager.x();
            this.bluetoothManager.A();
        }
        if (this.selectedAudioDevice != mVar4 && preferredAudioDevice == mVar4 && this.bluetoothManager.n() == dVar && !this.bluetoothManager.t()) {
            this.audioDevices.remove(mVar4);
            if (this.userSelectedAudioDevice == mVar4) {
                this.userSelectedAudioDevice = m.NONE;
            }
            preferredAudioDevice = getPreferredAudioDevice();
            z11 = true;
        }
        if (preferredAudioDevice == mVar4 && this.bluetoothManager.n() != dVar2) {
            preferredAudioDevice = getPreferredAudioDevice(true);
        }
        if (preferredAudioDevice != this.selectedAudioDevice || z11) {
            setAudioDeviceInternal(preferredAudioDevice);
            Log.d("InCallManager", "New device status: available=" + this.audioDevices + ", selected=" + preferredAudioDevice);
            sendEvent("onAudioDeviceChanged", getAudioDeviceStatusMap());
        }
        Log.d("InCallManager", "--- updateAudioDeviceState done");
    }

    private m getPreferredAudioDevice(boolean z11) {
        m mVar = this.userSelectedAudioDevice;
        if (mVar == null || mVar == m.NONE) {
            if (!z11) {
                Set<m> set = this.audioDevices;
                m mVar2 = m.BLUETOOTH;
                if (set.contains(mVar2)) {
                    return mVar2;
                }
            }
            Set<m> set2 = this.audioDevices;
            m mVar3 = m.WIRED_HEADSET;
            if (set2.contains(mVar3)) {
                return mVar3;
            }
            if (this.audioDevices.contains(this.defaultAudioDevice)) {
                return this.defaultAudioDevice;
            }
            return m.SPEAKER_PHONE;
        }
        return mVar;
    }

    @ReactMethod
    public void stop(String str) {
        if (this.audioManagerActivated) {
            stopRingback();
            if (!str.isEmpty() && startBusytone(str)) {
                Log.d("InCallManager", "play busytone before stop InCallManager");
                return;
            }
            Log.d("InCallManager", "stop() InCallManager");
            stopBusytone();
            stopEvents();
            setSpeakerphoneOn(false);
            setMicrophoneMute(false);
            this.forceSpeakerOn = 0;
            this.bluetoothManager.w();
            restoreOriginalAudioSetup();
            releaseAudioFocus();
            this.audioManagerActivated = false;
            this.wakeLockUtils.f();
        }
    }
}