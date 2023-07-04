package com.learnium.RNDeviceInfo;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.GoogleApiAvailability;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Kind;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

@fg.a(name = RNDeviceModule.NAME)
/* loaded from: classes2.dex */
public class RNDeviceModule extends ReactContextBaseJavaModule {
    private static String BATTERY_LEVEL = "batteryLevel";
    private static String BATTERY_STATE = "batteryState";
    private static String LOW_POWER_MODE = "lowPowerMode";
    public static final String NAME = "RNDeviceInfo";
    private final wp.a deviceIdResolver;
    private final wp.b deviceTypeResolver;
    private BroadcastReceiver headphoneConnectionReceiver;
    private c installReferrerClient;
    private double mLastBatteryLevel;
    private String mLastBatteryState;
    private boolean mLastPowerSaveState;
    private BroadcastReceiver receiver;

    /* loaded from: classes2.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WritableMap powerStateFromIntent = RNDeviceModule.this.getPowerStateFromIntent(intent);
            if (powerStateFromIntent == null) {
                return;
            }
            String string = powerStateFromIntent.getString(RNDeviceModule.BATTERY_STATE);
            Double valueOf = Double.valueOf(powerStateFromIntent.getDouble(RNDeviceModule.BATTERY_LEVEL));
            Boolean valueOf2 = Boolean.valueOf(powerStateFromIntent.getBoolean(RNDeviceModule.LOW_POWER_MODE));
            if (!RNDeviceModule.this.mLastBatteryState.equalsIgnoreCase(string) || RNDeviceModule.this.mLastPowerSaveState != valueOf2.booleanValue()) {
                RNDeviceModule rNDeviceModule = RNDeviceModule.this;
                rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_powerStateDidChange", string);
                RNDeviceModule.this.mLastBatteryState = string;
                RNDeviceModule.this.mLastPowerSaveState = valueOf2.booleanValue();
            }
            if (RNDeviceModule.this.mLastBatteryLevel != valueOf.doubleValue()) {
                RNDeviceModule rNDeviceModule2 = RNDeviceModule.this;
                rNDeviceModule2.sendEvent(rNDeviceModule2.getReactApplicationContext(), "RNDeviceInfo_batteryLevelDidChange", valueOf);
                if (valueOf.doubleValue() <= 0.15d) {
                    RNDeviceModule rNDeviceModule3 = RNDeviceModule.this;
                    rNDeviceModule3.sendEvent(rNDeviceModule3.getReactApplicationContext(), "RNDeviceInfo_batteryLevelIsLow", valueOf);
                }
                RNDeviceModule.this.mLastBatteryLevel = valueOf.doubleValue();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean isHeadphonesConnectedSync = RNDeviceModule.this.isHeadphonesConnectedSync();
            RNDeviceModule rNDeviceModule = RNDeviceModule.this;
            rNDeviceModule.sendEvent(rNDeviceModule.getReactApplicationContext(), "RNDeviceInfo_headphoneConnectionDidChange", Boolean.valueOf(isHeadphonesConnectedSync));
        }
    }

    public RNDeviceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mLastBatteryLevel = -1.0d;
        this.mLastBatteryState = "";
        this.mLastPowerSaveState = false;
        this.deviceTypeResolver = new wp.b(reactApplicationContext);
        this.deviceIdResolver = new wp.a(reactApplicationContext);
        this.installReferrerClient = new c(reactApplicationContext.getBaseContext());
    }

    private long getBlockSize(StatFs statFs, Boolean bool) {
        return bool.booleanValue() ? statFs.getBlockSizeLong() : statFs.getBlockSize();
    }

    private BigInteger getDirTotalCapacity(StatFs statFs) {
        boolean z11 = Build.VERSION.SDK_INT >= 18;
        return BigInteger.valueOf(z11 ? statFs.getBlockCountLong() : statFs.getBlockCount()).multiply(BigInteger.valueOf(z11 ? statFs.getBlockSizeLong() : statFs.getBlockSize()));
    }

    private PackageInfo getPackageInfo() {
        return getReactApplicationContext().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getPowerStateFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        int intExtra3 = intent.getIntExtra("plugged", -1);
        int intExtra4 = intent.getIntExtra(PermissionsResponse.STATUS_KEY, -1);
        float f11 = intExtra / intExtra2;
        String str = intExtra3 == 0 ? "unplugged" : intExtra4 == 2 ? "charging" : intExtra4 == 5 ? "full" : "unknown";
        boolean isPowerSaveMode = Build.VERSION.SDK_INT >= 21 ? ((PowerManager) getReactApplicationContext().getSystemService("power")).isPowerSaveMode() : false;
        WritableMap createMap = Arguments.createMap();
        createMap.putString(BATTERY_STATE, str);
        createMap.putDouble(BATTERY_LEVEL, f11);
        createMap.putBoolean(LOW_POWER_MODE, isPowerSaveMode);
        return createMap;
    }

    private long getTotalAvailableBlocks(StatFs statFs, Boolean bool) {
        return bool.booleanValue() ? statFs.getAvailableBlocksLong() : statFs.getAvailableBlocks();
    }

    private WifiInfo getWifiInfo() {
        WifiManager wifiManager = (WifiManager) getReactApplicationContext().getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.getConnectionInfo();
        }
        return null;
    }

    private void initializeHeadphoneConnectionReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        this.headphoneConnectionReceiver = new b();
        getReactApplicationContext().registerReceiver(this.headphoneConnectionReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, Object obj) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getAndroidId(Promise promise) {
        promise.resolve(getAndroidIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getAndroidIdSync() {
        return getUniqueIdSync();
    }

    @ReactMethod
    public void getApiLevel(Promise promise) {
        promise.resolve(Integer.valueOf(getApiLevelSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public int getApiLevelSync() {
        return Build.VERSION.SDK_INT;
    }

    @ReactMethod
    public void getAvailableLocationProviders(Promise promise) {
        promise.resolve(getAvailableLocationProvidersSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getAvailableLocationProvidersSync() {
        LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService(Kind.LOCATION);
        WritableMap createMap = Arguments.createMap();
        try {
            for (String str : locationManager.getProviders(false)) {
                createMap.putBoolean(str, locationManager.isProviderEnabled(str));
            }
        } catch (Exception unused) {
            System.err.println("Unable to get location providers. LocationManager was null");
        }
        return createMap;
    }

    @ReactMethod
    public void getBaseOs(Promise promise) {
        promise.resolve(getBaseOsSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBaseOsSync() {
        return Build.VERSION.SDK_INT >= 23 ? Build.VERSION.BASE_OS : "unknown";
    }

    @ReactMethod
    public void getBatteryLevel(Promise promise) {
        promise.resolve(Double.valueOf(getBatteryLevelSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getBatteryLevelSync() {
        WritableMap powerStateFromIntent = getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        if (powerStateFromIntent == null) {
            return 0.0d;
        }
        return powerStateFromIntent.getDouble(BATTERY_LEVEL);
    }

    @ReactMethod
    public void getBootloader(Promise promise) {
        promise.resolve(getBootloaderSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBootloaderSync() {
        return Build.BOOTLOADER;
    }

    @ReactMethod
    public void getBuildId(Promise promise) {
        promise.resolve(getBuildIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getBuildIdSync() {
        return Build.ID;
    }

    @ReactMethod
    public void getCarrier(Promise promise) {
        promise.resolve(getCarrierSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCarrierSync() {
        TelephonyManager telephonyManager = (TelephonyManager) getReactApplicationContext().getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        System.err.println("Unable to get network operator name. TelephonyManager was null");
        return "unknown";
    }

    @ReactMethod
    public void getCodename(Promise promise) {
        promise.resolve(getCodenameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCodenameSync() {
        return Build.VERSION.CODENAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        String str;
        String str2;
        String str3 = "unknown";
        try {
            String str4 = getPackageInfo().versionName;
            str2 = Integer.toString(getPackageInfo().versionCode);
            str = getReactApplicationContext().getApplicationInfo().loadLabel(getReactApplicationContext().getPackageManager()).toString();
            str3 = str4;
        } catch (Exception unused) {
            str = "unknown";
            str2 = str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceId", Build.BOARD);
        hashMap.put("bundleId", getReactApplicationContext().getPackageName());
        hashMap.put("systemName", "Android");
        hashMap.put("systemVersion", Build.VERSION.RELEASE);
        hashMap.put("appVersion", str3);
        hashMap.put("buildNumber", str2);
        hashMap.put("isTablet", Boolean.valueOf(this.deviceTypeResolver.d()));
        hashMap.put("appName", str);
        hashMap.put(AccountRangeJsonParser.FIELD_BRAND, Build.BRAND);
        hashMap.put("model", Build.MODEL);
        hashMap.put("deviceType", this.deviceTypeResolver.a().getValue());
        return hashMap;
    }

    @ReactMethod
    public void getDevice(Promise promise) {
        promise.resolve(getDeviceSync());
    }

    @ReactMethod
    public void getDeviceName(Promise promise) {
        promise.resolve(getDeviceNameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceNameSync() {
        try {
            String string = Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "bluetooth_name");
            if (string != null) {
                return string;
            }
            if (Build.VERSION.SDK_INT >= 25) {
                String string2 = Settings.Global.getString(getReactApplicationContext().getContentResolver(), "device_name");
                return string2 != null ? string2 : "unknown";
            }
            return "unknown";
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDeviceSync() {
        return Build.DEVICE;
    }

    @ReactMethod
    public void getDisplay(Promise promise) {
        promise.resolve(getDisplaySync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getDisplaySync() {
        return Build.DISPLAY;
    }

    @ReactMethod
    public void getFingerprint(Promise promise) {
        promise.resolve(getFingerprintSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getFingerprintSync() {
        return Build.FINGERPRINT;
    }

    @ReactMethod
    public void getFirstInstallTime(Promise promise) {
        promise.resolve(Double.valueOf(getFirstInstallTimeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFirstInstallTimeSync() {
        try {
            return getPackageInfo().firstInstallTime;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getFontScale(Promise promise) {
        promise.resolve(Float.valueOf(getFontScaleSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getFontScaleSync() {
        return getReactApplicationContext().getResources().getConfiguration().fontScale;
    }

    @ReactMethod
    public void getFreeDiskStorage(Promise promise) {
        promise.resolve(Double.valueOf(getFreeDiskStorageSync()));
    }

    @ReactMethod
    public void getFreeDiskStorageOld(Promise promise) {
        promise.resolve(Double.valueOf(getFreeDiskStorageOldSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageOldSync() {
        long availableBlocksLong;
        long blockSizeLong;
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            if (Build.VERSION.SDK_INT < 18) {
                availableBlocksLong = statFs.getAvailableBlocks();
                blockSizeLong = statFs.getBlockSize();
            } else {
                availableBlocksLong = statFs.getAvailableBlocksLong();
                blockSizeLong = statFs.getBlockSizeLong();
            }
            return BigInteger.valueOf(availableBlocksLong).multiply(BigInteger.valueOf(blockSizeLong)).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getFreeDiskStorageSync() {
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            Boolean valueOf = Boolean.valueOf(Build.VERSION.SDK_INT >= 18);
            return BigInteger.valueOf(getTotalAvailableBlocks(statFs, valueOf)).multiply(BigInteger.valueOf(getBlockSize(statFs, valueOf))).doubleValue() + BigInteger.valueOf(getTotalAvailableBlocks(statFs2, valueOf)).multiply(BigInteger.valueOf(getBlockSize(statFs2, valueOf))).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getHardware(Promise promise) {
        promise.resolve(getHardwareSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHardwareSync() {
        return Build.HARDWARE;
    }

    @ReactMethod
    public void getHost(Promise promise) {
        promise.resolve(getHostSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getHostSync() {
        return Build.HOST;
    }

    @ReactMethod
    public void getIncremental(Promise promise) {
        promise.resolve(getIncrementalSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIncrementalSync() {
        return Build.VERSION.INCREMENTAL;
    }

    @ReactMethod
    public void getInstallReferrer(Promise promise) {
        promise.resolve(getInstallReferrerSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallReferrerSync() {
        return getReactApplicationContext().getSharedPreferences("react-native-device-info", 0).getString("installReferrer", "unknown");
    }

    @ReactMethod
    public void getInstallerPackageName(Promise promise) {
        promise.resolve(getInstallerPackageNameSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstallerPackageNameSync() {
        String installerPackageName = getReactApplicationContext().getPackageManager().getInstallerPackageName(getReactApplicationContext().getPackageName());
        return installerPackageName == null ? "unknown" : installerPackageName;
    }

    @ReactMethod
    public void getInstanceId(Promise promise) {
        promise.resolve(getInstanceIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getInstanceIdSync() {
        return this.deviceIdResolver.c();
    }

    @ReactMethod
    public void getIpAddress(Promise promise) {
        promise.resolve(getIpAddressSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getIpAddressSync() {
        try {
            return InetAddress.getByAddress(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(getWifiInfo().getIpAddress()).array()).getHostAddress();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    @ReactMethod
    public void getLastUpdateTime(Promise promise) {
        promise.resolve(Double.valueOf(getLastUpdateTimeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getLastUpdateTimeSync() {
        try {
            return getPackageInfo().lastUpdateTime;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getMacAddress(Promise promise) {
        promise.resolve(getMacAddressSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getMacAddressSync() {
        WifiInfo wifiInfo = getWifiInfo();
        String macAddress = wifiInfo != null ? wifiInfo.getMacAddress() : "";
        if (getReactApplicationContext().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            try {
                for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress == null) {
                            macAddress = "";
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            int length = hardwareAddress.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                sb2.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i11])));
                            }
                            if (sb2.length() > 0) {
                                sb2.deleteCharAt(sb2.length() - 1);
                            }
                            macAddress = sb2.toString();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return macAddress;
    }

    @ReactMethod
    public void getMaxMemory(Promise promise) {
        promise.resolve(Double.valueOf(getMaxMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getMaxMemorySync() {
        return Runtime.getRuntime().maxMemory();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhoneNumber(Promise promise) {
        promise.resolve(getPhoneNumberSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getPhoneNumberSync() {
        int i11;
        if (getReactApplicationContext() != null) {
            if (getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0 || (((i11 = Build.VERSION.SDK_INT) >= 23 && getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_SMS") == 0) || (i11 >= 26 && getReactApplicationContext().checkCallingOrSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0))) {
                TelephonyManager telephonyManager = (TelephonyManager) getReactApplicationContext().getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
                if (telephonyManager != null) {
                    try {
                        return telephonyManager.getLine1Number();
                    } catch (SecurityException e11) {
                        PrintStream printStream = System.err;
                        printStream.println("getLine1Number called with permission, but threw anyway: " + e11.getMessage());
                        return "unknown";
                    }
                }
                System.err.println("Unable to getPhoneNumber. TelephonyManager was null");
                return "unknown";
            }
            return "unknown";
        }
        return "unknown";
    }

    @ReactMethod
    public void getPowerState(Promise promise) {
        promise.resolve(getPowerStateSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPowerStateSync() {
        return getPowerStateFromIntent(getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }

    @ReactMethod
    public void getPreviewSdkInt(Promise promise) {
        promise.resolve(getPreviewSdkIntSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getPreviewSdkIntSync() {
        return Build.VERSION.SDK_INT >= 23 ? Integer.toString(Build.VERSION.PREVIEW_SDK_INT) : "unknown";
    }

    @ReactMethod
    public void getProduct(Promise promise) {
        promise.resolve(getProductSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getProductSync() {
        return Build.PRODUCT;
    }

    @ReactMethod
    public void getSecurityPatch(Promise promise) {
        promise.resolve(getSecurityPatchSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSecurityPatchSync() {
        return Build.VERSION.SDK_INT >= 23 ? Build.VERSION.SECURITY_PATCH : "unknown";
    }

    @ReactMethod
    public void getSerialNumber(Promise promise) {
        promise.resolve(getSerialNumberSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSerialNumberSync() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return Build.getSerial();
            }
            return Build.SERIAL;
        } catch (Exception e11) {
            PrintStream printStream = System.err;
            printStream.println("getSerialNumber failed, it probably should not be used: " + e11.getMessage());
            return "unknown";
        }
    }

    @ReactMethod
    public void getSupported32BitAbis(Promise promise) {
        promise.resolve(getSupported32BitAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported32BitAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_32_BIT_ABIS) {
                writableNativeArray.pushString(str);
            }
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSupported64BitAbis(Promise promise) {
        promise.resolve(getSupported64BitAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupported64BitAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_64_BIT_ABIS) {
                writableNativeArray.pushString(str);
            }
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSupportedAbis(Promise promise) {
        promise.resolve(getSupportedAbisSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSupportedAbisSync() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_ABIS) {
                writableNativeArray.pushString(str);
            }
        } else {
            writableNativeArray.pushString(Build.CPU_ABI);
        }
        return writableNativeArray;
    }

    @ReactMethod
    public void getSystemAvailableFeatures(Promise promise) {
        promise.resolve(getSystemAvailableFeaturesSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableArray getSystemAvailableFeaturesSync() {
        FeatureInfo[] systemAvailableFeatures = getReactApplicationContext().getPackageManager().getSystemAvailableFeatures();
        WritableArray createArray = Arguments.createArray();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            String str = featureInfo.name;
            if (str != null) {
                createArray.pushString(str);
            }
        }
        return createArray;
    }

    @ReactMethod
    public void getSystemManufacturer(Promise promise) {
        promise.resolve(getSystemManufacturerSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getSystemManufacturerSync() {
        return Build.MANUFACTURER;
    }

    @ReactMethod
    public void getTags(Promise promise) {
        promise.resolve(getTagsSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTagsSync() {
        return Build.TAGS;
    }

    @ReactMethod
    public void getTotalDiskCapacity(Promise promise) {
        promise.resolve(Double.valueOf(getTotalDiskCapacitySync()));
    }

    @ReactMethod
    public void getTotalDiskCapacityOld(Promise promise) {
        promise.resolve(Double.valueOf(getTotalDiskCapacityOldSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    @Deprecated
    public double getTotalDiskCapacityOldSync() {
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            return BigInteger.valueOf(statFs.getBlockCount()).multiply(BigInteger.valueOf(statFs.getBlockSize())).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalDiskCapacitySync() {
        try {
            return getDirTotalCapacity(new StatFs(Environment.getRootDirectory().getAbsolutePath())).add(getDirTotalCapacity(new StatFs(Environment.getDataDirectory().getAbsolutePath()))).doubleValue();
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    @ReactMethod
    public void getTotalMemory(Promise promise) {
        promise.resolve(Double.valueOf(getTotalMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getTotalMemorySync() {
        ActivityManager activityManager = (ActivityManager) getReactApplicationContext().getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        }
        System.err.println("Unable to getMemoryInfo. ActivityManager was null");
        return -1.0d;
    }

    @ReactMethod
    public void getType(Promise promise) {
        promise.resolve(getTypeSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getTypeSync() {
        return Build.TYPE;
    }

    @ReactMethod
    public void getUniqueId(Promise promise) {
        promise.resolve(getUniqueIdSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUniqueIdSync() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    @ReactMethod
    public void getUsedMemory(Promise promise) {
        promise.resolve(Double.valueOf(getUsedMemorySync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public double getUsedMemorySync() {
        ActivityManager activityManager = (ActivityManager) getReactApplicationContext().getSystemService("activity");
        if (activityManager != null) {
            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo.length != 1) {
                System.err.println("Unable to getProcessMemoryInfo. getProcessMemoryInfo did not return any info for the PID");
                return -1.0d;
            }
            return processMemoryInfo[0].getTotalPss() * 1024.0d;
        }
        System.err.println("Unable to getProcessMemoryInfo. ActivityManager was null");
        return -1.0d;
    }

    @ReactMethod
    public void getUserAgent(Promise promise) {
        promise.resolve(getUserAgentSync());
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getUserAgentSync() {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return WebSettings.getDefaultUserAgent(getReactApplicationContext());
            }
            return System.getProperty("http.agent");
        } catch (RuntimeException unused) {
            return System.getProperty("http.agent");
        }
    }

    @ReactMethod
    public void hasGms(Promise promise) {
        promise.resolve(Boolean.valueOf(hasGmsSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasGmsSync() {
        try {
            int i11 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
            Object invoke = GoogleApiAvailability.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            return ((Integer) invoke.getClass().getMethod("isGooglePlayServicesAvailable", Context.class).invoke(invoke, getReactApplicationContext())).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void hasHms(Promise promise) {
        promise.resolve(Boolean.valueOf(hasHmsSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasHmsSync() {
        try {
            Object invoke = Class.forName("com.huawei.hms.api.HuaweiApiAvailability").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            return ((Integer) invoke.getClass().getMethod("isHuaweiMobileServicesAvailable", Context.class).invoke(invoke, getReactApplicationContext())).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void hasSystemFeature(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(hasSystemFeatureSync(str)));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasSystemFeatureSync(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        return getReactApplicationContext().getPackageManager().hasSystemFeature(str);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        if (Build.VERSION.SDK_INT >= 21) {
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        }
        this.receiver = new a();
        getReactApplicationContext().registerReceiver(this.receiver, intentFilter);
        initializeHeadphoneConnectionReceiver();
    }

    @ReactMethod
    public void isAirplaneMode(Promise promise) {
        promise.resolve(Boolean.valueOf(isAirplaneModeSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isAirplaneModeSync() {
        if (Build.VERSION.SDK_INT < 17) {
            if (Settings.System.getInt(getReactApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
        } else if (Settings.Global.getInt(getReactApplicationContext().getContentResolver(), "airplane_mode_on", 0) != 0) {
            return true;
        }
        return false;
    }

    @ReactMethod
    public void isBatteryCharging(Promise promise) {
        promise.resolve(Boolean.valueOf(isBatteryChargingSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isBatteryChargingSync() {
        Intent registerReceiver = getReactApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return (registerReceiver != null ? registerReceiver.getIntExtra(PermissionsResponse.STATUS_KEY, -1) : 0) == 2;
    }

    @ReactMethod
    public void isCameraPresent(Promise promise) {
        promise.resolve(Boolean.valueOf(isCameraPresentSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isCameraPresentSync() {
        if (Build.VERSION.SDK_INT < 21) {
            return Camera.getNumberOfCameras() > 0;
        }
        try {
            return ((CameraManager) getReactApplicationContext().getSystemService("camera")).getCameraIdList().length > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @ReactMethod
    public void isEmulator(Promise promise) {
        promise.resolve(Boolean.valueOf(isEmulatorSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isEmulatorSync() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk")) {
                Locale locale = Locale.ROOT;
                if (!str2.toLowerCase(locale).contains("droid4x") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                    String str3 = Build.HARDWARE;
                    if (!str3.contains("goldfish") && !str3.contains("ranchu") && !str3.contains("vbox86")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains(SdkAction.ACTION_TYPE) && !str4.contains("google_sdk") && !str4.contains("sdk_google") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator") && !Build.BOARD.toLowerCase(locale).contains("nox") && !Build.BOOTLOADER.toLowerCase(locale).contains("nox") && !str3.toLowerCase(locale).contains("nox") && !str4.toLowerCase(locale).contains("nox") && !Build.SERIAL.toLowerCase(locale).contains("nox") && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @ReactMethod
    public void isHeadphonesConnected(Promise promise) {
        promise.resolve(Boolean.valueOf(isHeadphonesConnectedSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isHeadphonesConnectedSync() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        return audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn();
    }

    @ReactMethod
    public void isLocationEnabled(Promise promise) {
        promise.resolve(Boolean.valueOf(isLocationEnabledSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isLocationEnabledSync() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            try {
                return ((LocationManager) getReactApplicationContext().getSystemService(Kind.LOCATION)).isLocationEnabled();
            } catch (Exception unused) {
                System.err.println("Unable to determine if location enabled. LocationManager was null");
                return false;
            }
        } else if (i11 >= 19) {
            return Settings.Secure.getInt(getReactApplicationContext().getContentResolver(), "location_mode", 0) != 0;
        } else {
            return !TextUtils.isEmpty(Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "location_providers_allowed"));
        }
    }

    @ReactMethod
    public void isPinOrFingerprintSet(Promise promise) {
        promise.resolve(Boolean.valueOf(isPinOrFingerprintSetSync()));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPinOrFingerprintSetSync() {
        KeyguardManager keyguardManager = (KeyguardManager) getReactApplicationContext().getSystemService("keyguard");
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardSecure();
        }
        System.err.println("Unable to determine keyguard status. KeyguardManager was null");
        return false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        getReactApplicationContext().unregisterReceiver(this.receiver);
        getReactApplicationContext().unregisterReceiver(this.headphoneConnectionReceiver);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}