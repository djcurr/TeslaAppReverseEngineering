package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.q;
import d5.i;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f6568a = q.f("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f6569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f6570b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f6571c;

        a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f6569a = intent;
            this.f6570b = context;
            this.f6571c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f6569a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f6569a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f6569a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f6569a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                q.c().a(ConstraintProxyUpdateReceiver.f6568a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                l5.d.a(this.f6570b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                l5.d.a(this.f6570b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                l5.d.a(this.f6570b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                l5.d.a(this.f6570b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f6571c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z12).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z13).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z14);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            q.c().a(f6568a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        } else {
            i.r(context).w().b(new a(this, intent, context, goAsync()));
        }
    }
}