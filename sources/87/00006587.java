package da;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23861a;

    /* renamed from: b  reason: collision with root package name */
    private b f23862b = b.D;

    public a(Context context) {
        this.f23861a = context.getApplicationContext();
    }

    public void a() {
        this.f23862b = b.D;
        try {
            this.f23861a.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    public void b(b bVar) {
        this.f23862b = bVar;
        this.f23861a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f23862b.b();
        }
    }
}