package expo.modules.battery;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.core.interfaces.services.EventEmitter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lexpo/modules/battery/BatteryModule;", "Lexpo/modules/core/ExportedModule;", "Lexpo/modules/core/interfaces/RegistryLifecycleListener;", "", "getName", "", "", "getConstants", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "Lvz/b0;", "onCreate", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getBatteryLevelAsync", "getBatteryStateAsync", "isLowPowerModeEnabledAsync", "isBatteryOptimizationEnabledAsync", "NAME", "Ljava/lang/String;", "", "isLowPowerModeEnabled", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "BatteryState", "expo-battery_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class BatteryModule extends ExportedModule {
    private final String NAME;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lexpo/modules/battery/BatteryModule$BatteryState;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "UNKNOWN", "UNPLUGGED", "CHARGING", "FULL", "expo-battery_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public enum BatteryState {
        UNKNOWN(0),
        UNPLUGGED(1),
        CHARGING(2),
        FULL(3);
        
        private final int value;

        BatteryState(int i11) {
            this.value = i11;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryModule(Context context) {
        super(context);
        s.g(context, "context");
        this.NAME = "ExpoBattery";
    }

    private final boolean isLowPowerModeEnabled() {
        Object systemService = getContext().getApplicationContext().getSystemService("power");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }

    @ExpoMethod
    public final void getBatteryLevelAsync(Promise promise) {
        s.g(promise, "promise");
        Intent registerReceiver = getContext().getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            promise.resolve(-1);
            return;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        promise.resolve(Float.valueOf((intExtra == -1 || intExtra2 == -1) ? -1.0f : intExtra / intExtra2));
    }

    @ExpoMethod
    public final void getBatteryStateAsync(Promise promise) {
        s.g(promise, "promise");
        Intent registerReceiver = getContext().getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            promise.resolve(Integer.valueOf(BatteryState.UNKNOWN.getValue()));
        } else {
            promise.resolve(Integer.valueOf(BatteryStatusNativeToJSKt.batteryStatusNativeToJS(registerReceiver.getIntExtra(PermissionsResponse.STATUS_KEY, -1)).getValue()));
        }
    }

    @Override // expo.modules.core.ExportedModule
    public Map<String, Object> getConstants() {
        HashMap k11;
        k11 = s0.k(v.a("isSupported", Boolean.TRUE));
        return k11;
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return this.NAME;
    }

    @ExpoMethod
    public final void isBatteryOptimizationEnabledAsync(Promise promise) {
        s.g(promise, "promise");
        if (Build.VERSION.SDK_INT >= 23) {
            String packageName = getContext().getApplicationContext().getPackageName();
            s.f(packageName, "context.applicationContext.packageName");
            PowerManager powerManager = (PowerManager) getContext().getApplicationContext().getSystemService("power");
            if (powerManager != null && !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                promise.resolve(Boolean.TRUE);
                return;
            }
        }
        promise.resolve(Boolean.FALSE);
    }

    @ExpoMethod
    public final void isLowPowerModeEnabledAsync(Promise promise) {
        s.g(promise, "promise");
        promise.resolve(Boolean.valueOf(isLowPowerModeEnabled()));
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        EventEmitter eventEmitter = (EventEmitter) moduleRegistry.getModule(EventEmitter.class);
        getContext().registerReceiver(new BatteryStateReceiver(eventEmitter), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        getContext().registerReceiver(new PowerSaverReceiver(eventEmitter), new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        getContext().registerReceiver(new BatteryLevelReceiver(eventEmitter), intentFilter);
    }
}