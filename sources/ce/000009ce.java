package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.z;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.q;
import l5.l;

/* loaded from: classes.dex */
public class SystemAlarmService extends z implements e.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f6573d = q.f("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private e f6574b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6575c;

    private void e() {
        e eVar = new e(this);
        this.f6574b = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void b() {
        this.f6575c = true;
        q.c().a(f6573d, "All commands completed in dispatcher", new Throwable[0]);
        l.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f6575c = false;
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f6575c = true;
        this.f6574b.j();
    }

    @Override // androidx.lifecycle.z, android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f6575c) {
            q.c().d(f6573d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f6574b.j();
            e();
            this.f6575c = false;
        }
        if (intent != null) {
            this.f6574b.a(intent, i12);
            return 3;
        }
        return 3;
    }
}