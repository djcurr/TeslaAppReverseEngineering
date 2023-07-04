package expo.modules.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import expo.modules.core.interfaces.services.EventEmitter;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lexpo/modules/battery/PowerSaverReceiver;", "Landroid/content/BroadcastReceiver;", "", "lowPowerMode", "Lvz/b0;", "onLowPowerModeChange", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "onReceive", "Lexpo/modules/core/interfaces/services/EventEmitter;", "eventEmitter", "Lexpo/modules/core/interfaces/services/EventEmitter;", "<init>", "(Lexpo/modules/core/interfaces/services/EventEmitter;)V", "expo-battery_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class PowerSaverReceiver extends BroadcastReceiver {
    private final EventEmitter eventEmitter;

    public PowerSaverReceiver(EventEmitter eventEmitter) {
        this.eventEmitter = eventEmitter;
    }

    private final void onLowPowerModeChange(boolean z11) {
        String str;
        EventEmitter eventEmitter = this.eventEmitter;
        if (eventEmitter == null) {
            return;
        }
        str = PowerSaverReceiverKt.POWERMODE_EVENT_NAME;
        Bundle bundle = new Bundle();
        bundle.putBoolean("lowPowerMode", z11);
        b0 b0Var = b0.f54756a;
        eventEmitter.emit(str, bundle);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s.g(context, "context");
        s.g(intent, "intent");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        onLowPowerModeChange(((PowerManager) systemService).isPowerSaveMode());
    }
}