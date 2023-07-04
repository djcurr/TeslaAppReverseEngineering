package expo.modules.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.interfaces.services.EventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lexpo/modules/battery/BatteryLevelReceiver;", "Landroid/content/BroadcastReceiver;", "", "BatteryLevel", "Lvz/b0;", "onBatteryLevelChange", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "onReceive", "Lexpo/modules/core/interfaces/services/EventEmitter;", "eventEmitter", "Lexpo/modules/core/interfaces/services/EventEmitter;", "", "BATTERY_LEVEL_EVENT_NAME", "Ljava/lang/String;", "<init>", "(Lexpo/modules/core/interfaces/services/EventEmitter;)V", "expo-battery_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class BatteryLevelReceiver extends BroadcastReceiver {
    private final String BATTERY_LEVEL_EVENT_NAME = "Expo.batteryLevelDidChange";
    private final EventEmitter eventEmitter;

    public BatteryLevelReceiver(EventEmitter eventEmitter) {
        this.eventEmitter = eventEmitter;
    }

    private final void onBatteryLevelChange(float f11) {
        EventEmitter eventEmitter = this.eventEmitter;
        if (eventEmitter == null) {
            return;
        }
        String str = this.BATTERY_LEVEL_EVENT_NAME;
        Bundle bundle = new Bundle();
        bundle.putFloat("batteryLevel", f11);
        b0 b0Var = b0.f54756a;
        eventEmitter.emit(str, bundle);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s.g(context, "context");
        s.g(intent, "intent");
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            Log.e("Battery", "ACTION_BATTERY_CHANGED unavailable. Events wont be received");
            return;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        onBatteryLevelChange((intExtra == -1 || intExtra2 == -1) ? -1.0f : intExtra / intExtra2);
    }
}