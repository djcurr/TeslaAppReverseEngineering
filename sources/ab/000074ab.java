package i5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.q;

/* loaded from: classes.dex */
public class f extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    private static final String f29900i = q.f("StorageNotLowTracker");

    public f(Context context, m5.a aVar) {
        super(context, aVar);
    }

    @Override // i5.c
    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // i5.c
    public void h(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        q.c().a(f29900i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            d(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            d(Boolean.TRUE);
        }
    }

    @Override // i5.d
    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.f29888b.registerReceiver(null, g());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return Boolean.TRUE;
            }
            return null;
        }
        return Boolean.TRUE;
    }
}