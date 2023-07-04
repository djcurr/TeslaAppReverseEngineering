package expo.modules.battery;

import expo.modules.battery.BatteryModule;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", PermissionsResponse.STATUS_KEY, "Lexpo/modules/battery/BatteryModule$BatteryState;", "batteryStatusNativeToJS", "expo-battery_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class BatteryStatusNativeToJSKt {
    public static final BatteryModule.BatteryState batteryStatusNativeToJS(int i11) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return BatteryModule.BatteryState.UNKNOWN;
                    }
                    return BatteryModule.BatteryState.FULL;
                }
                return BatteryModule.BatteryState.UNPLUGGED;
            }
            return BatteryModule.BatteryState.UNPLUGGED;
        }
        return BatteryModule.BatteryState.CHARGING;
    }
}