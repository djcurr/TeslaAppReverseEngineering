package i5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.q;
import expo.modules.interfaces.permissions.PermissionsResponse;

/* loaded from: classes.dex */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    private static final String f29882i = q.f("BatteryNotLowTracker");

    public b(Context context, m5.a aVar) {
        super(context, aVar);
    }

    @Override // i5.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // i5.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        q.c().a(f29882i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            d(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            d(Boolean.FALSE);
        }
    }

    @Override // i5.d
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.f29888b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z11 = false;
        if (registerReceiver == null) {
            q.c().b(f29882i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra(PermissionsResponse.STATUS_KEY, -1) == 1 || intExtra > 0.15f) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}