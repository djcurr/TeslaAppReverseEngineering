package i5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.q;

/* loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final String f29883h = q.f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    private final BroadcastReceiver f29884g;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, m5.a aVar) {
        super(context, aVar);
        this.f29884g = new a();
    }

    @Override // i5.d
    public void e() {
        q.c().a(f29883h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f29888b.registerReceiver(this.f29884g, g());
    }

    @Override // i5.d
    public void f() {
        q.c().a(f29883h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f29888b.unregisterReceiver(this.f29884g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}