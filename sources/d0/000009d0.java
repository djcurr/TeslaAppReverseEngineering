package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.q;
import java.util.HashMap;
import java.util.Map;
import k5.p;

/* loaded from: classes.dex */
public class b implements d5.b {

    /* renamed from: d  reason: collision with root package name */
    private static final String f6577d = q.f("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f6578a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, d5.b> f6579b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f6580c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f6578a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent c(Context context, String str, boolean z11) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z11);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent d(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i11, e eVar) {
        q.c().a(f6577d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f6578a, i11, eVar).a();
    }

    private void i(Intent intent, int i11, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f6580c) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            q c11 = q.c();
            String str = f6577d;
            c11.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (!this.f6579b.containsKey(string)) {
                d dVar = new d(this.f6578a, i11, string, eVar);
                this.f6579b.put(string, dVar);
                dVar.d();
            } else {
                q.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            }
        }
    }

    private void j(Intent intent, int i11) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z11 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        q.c().a(f6577d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i11)), new Throwable[0]);
        e(string, z11);
    }

    private void k(Intent intent, int i11, e eVar) {
        q.c().a(f6577d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i11)), new Throwable[0]);
        eVar.g().z();
    }

    private void l(Intent intent, int i11, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        q c11 = q.c();
        String str = f6577d;
        c11.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase v11 = eVar.g().v();
        v11.beginTransaction();
        try {
            p g11 = v11.l().g(string);
            if (g11 == null) {
                q c12 = q.c();
                c12.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (g11.f34406b.isFinished()) {
                q c13 = q.c();
                c13.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long a11 = g11.a();
                if (!g11.b()) {
                    q.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a11)), new Throwable[0]);
                    a.c(this.f6578a, eVar.g(), string, a11);
                } else {
                    q.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a11)), new Throwable[0]);
                    a.c(this.f6578a, eVar.g(), string, a11);
                    eVar.k(new e.b(eVar, a(this.f6578a), i11));
                }
                v11.setTransactionSuccessful();
            }
        } finally {
            v11.endTransaction();
        }
    }

    private void m(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        q.c().a(f6577d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().E(string);
        a.a(this.f6578a, eVar.g(), string);
        eVar.e(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // d5.b
    public void e(String str, boolean z11) {
        synchronized (this.f6580c) {
            d5.b remove = this.f6579b.remove(str);
            if (remove != null) {
                remove.e(str, z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        boolean z11;
        synchronized (this.f6580c) {
            z11 = !this.f6579b.isEmpty();
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Intent intent, int i11, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i11, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i11, eVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            q.c().b(f6577d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i11, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i11, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i11);
        } else {
            q.c().h(f6577d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}