package com.teslamotors.plugins.ble;

import android.content.ComponentName;
import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;

/* loaded from: classes6.dex */
public class BLEModule extends ReactContextBaseJavaModule {
    private b bleModuleHelper;
    private final Context context;

    public BLEModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext.getApplicationContext();
    }

    @ReactMethod
    private void currentBLEBootReceiverState(Promise promise) {
        int componentEnabledSetting = this.context.getPackageManager().getComponentEnabledSetting(new ComponentName(this.context, BLEBootReceiver.class));
        promise.resolve(componentEnabledSetting != 0 ? componentEnabledSetting != 1 ? componentEnabledSetting != 2 ? componentEnabledSetting != 3 ? componentEnabledSetting != 4 ? "unknown" : "disabled until used" : "disabled user" : "disabled" : "enabled" : "default");
    }

    @ReactMethod
    public void addToWhitelist(Promise promise) {
        this.bleModuleHelper.q(promise);
    }

    @ReactMethod
    public void cancelExternalAuthenticate(Promise promise) {
        this.bleModuleHelper.r(promise);
    }

    @ReactMethod
    public void clearPeripherals(String str, Promise promise) {
        this.bleModuleHelper.s(str, promise);
    }

    @ReactMethod
    public void commandCloseChargePort(Promise promise) {
        this.bleModuleHelper.t(promise);
    }

    @ReactMethod
    public void commandFrunk(Promise promise) {
        this.bleModuleHelper.w(promise);
    }

    @ReactMethod
    public void commandLock(Promise promise) {
        this.bleModuleHelper.x(promise);
    }

    @ReactMethod
    public void commandOpenChargePort(Promise promise) {
        this.bleModuleHelper.z(promise);
    }

    @ReactMethod
    public void commandTrunk(Promise promise) {
        this.bleModuleHelper.B(promise);
    }

    @ReactMethod
    public void commandUnlock(Promise promise) {
        this.bleModuleHelper.C(promise);
    }

    @ReactMethod
    public void deleteRSAKeyPair(String str, Promise promise) {
        this.bleModuleHelper.E(str, promise);
    }

    @ReactMethod
    public void getEpochSessionInfo(String str, Promise promise) {
        this.bleModuleHelper.H(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "TMBLE";
    }

    @ReactMethod
    public void getStatus(Promise promise) {
        this.bleModuleHelper.M(promise);
    }

    @ReactMethod
    public void getTokenForKey(String str, Promise promise) {
        this.bleModuleHelper.N(str, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.bleModuleHelper = b.I(getReactApplicationContext(), "from react module, BLEModule#initialize()");
    }

    @ReactMethod
    public void loadRSAKeyPair(String str, Promise promise) {
        this.bleModuleHelper.X(str, promise);
    }

    @ReactMethod
    public void markEventSubscriptionsReady(boolean z11) {
        this.bleModuleHelper.a0(z11);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.bleModuleHelper.c0();
    }

    @ReactMethod
    public void promoteServiceToForeground() {
        this.bleModuleHelper.j0();
    }

    @ReactMethod
    public void removeFromWhitelist(Promise promise) {
        this.bleModuleHelper.l0(promise);
    }

    @ReactMethod
    public void requestMTU() {
        this.bleModuleHelper.m0();
    }

    @ReactMethod
    public void resetCommandPeripheral() {
        this.bleModuleHelper.n0();
    }

    @ReactMethod
    public void restartService(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        b.I(this.context, "from ReactMethod: BLEModule#restartService").o0(str, str2, str3, readableArray, promise);
    }

    @ReactMethod
    public void scanForPeripherals(String str, boolean z11, int i11, Promise promise) {
        this.bleModuleHelper.p0(str, z11, i11, promise);
    }

    @ReactMethod
    public void sendBLEData(String str, Promise promise) {
        this.bleModuleHelper.q0(str, promise);
    }

    @ReactMethod
    public void sendNullAuthResponse(Promise promise) {
        this.bleModuleHelper.v0(promise);
    }

    @ReactMethod
    public void serviceStarted(Promise promise) {
        promise.resolve(Boolean.valueOf(b.I(this.context, "from ReactMethod: BLEModule#serviceStarted").T()));
    }

    @ReactMethod
    public void setAccountEmail(String str) {
        this.bleModuleHelper.x0(str);
    }

    @ReactMethod
    public void setPassiveAuthState(String str, boolean z11) {
        gv.k.c(str, z11);
    }

    @ReactMethod
    public void setSelectedVIN(String str, String str2, ReadableArray readableArray) {
        this.bleModuleHelper.y0(str, str2, readableArray);
    }

    @ReactMethod
    public void setStayConnectedWhenUnauthorized(boolean z11) {
        this.bleModuleHelper.z0(z11);
    }

    @ReactMethod
    public void startMonitoringRSSI() {
        this.bleModuleHelper.A0();
    }

    @ReactMethod
    public void startService(String str, String str2, String str3, ReadableArray readableArray, Promise promise) {
        this.bleModuleHelper.B0(str, str2, str3, readableArray, promise);
    }

    @ReactMethod
    public void stopMonitoringRSSI() {
        this.bleModuleHelper.D0();
    }

    @ReactMethod
    public void storeRSAKeyPair(String str, String str2, String str3, Promise promise) {
        this.bleModuleHelper.F0(str, str2, str3, promise);
    }

    @ReactMethod
    public void updateBackgroundPermission(boolean z11) {
        this.bleModuleHelper.H0(z11);
    }

    @ReactMethod
    public void updateWhitelist(Promise promise) {
        this.bleModuleHelper.I0(promise);
    }
}