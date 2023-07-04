package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.q;
import d5.i;
import g5.c;
import g5.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k5.p;

/* loaded from: classes.dex */
public class a implements c, d5.b {

    /* renamed from: k  reason: collision with root package name */
    static final String f6632k = q.f("SystemFgDispatcher");

    /* renamed from: a  reason: collision with root package name */
    private Context f6633a;

    /* renamed from: b  reason: collision with root package name */
    private i f6634b;

    /* renamed from: c  reason: collision with root package name */
    private final m5.a f6635c;

    /* renamed from: d  reason: collision with root package name */
    final Object f6636d = new Object();

    /* renamed from: e  reason: collision with root package name */
    String f6637e;

    /* renamed from: f  reason: collision with root package name */
    final Map<String, androidx.work.i> f6638f;

    /* renamed from: g  reason: collision with root package name */
    final Map<String, p> f6639g;

    /* renamed from: h  reason: collision with root package name */
    final Set<p> f6640h;

    /* renamed from: i  reason: collision with root package name */
    final d f6641i;

    /* renamed from: j  reason: collision with root package name */
    private b f6642j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0117a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WorkDatabase f6643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6644b;

        RunnableC0117a(WorkDatabase workDatabase, String str) {
            this.f6643a = workDatabase;
            this.f6644b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p g11 = this.f6643a.l().g(this.f6644b);
            if (g11 == null || !g11.b()) {
                return;
            }
            synchronized (a.this.f6636d) {
                a.this.f6639g.put(this.f6644b, g11);
                a.this.f6640h.add(g11);
                a aVar = a.this;
                aVar.f6641i.d(aVar.f6640h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i11, Notification notification);

        void c(int i11, int i12, Notification notification);

        void d(int i11);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f6633a = context;
        i r11 = i.r(context);
        this.f6634b = r11;
        m5.a w11 = r11.w();
        this.f6635c = w11;
        this.f6637e = null;
        this.f6638f = new LinkedHashMap();
        this.f6640h = new HashSet();
        this.f6639g = new HashMap();
        this.f6641i = new d(this.f6633a, w11, this);
        this.f6634b.t().c(this);
    }

    public static Intent a(Context context, String str, androidx.work.i iVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.a());
        intent.putExtra("KEY_NOTIFICATION", iVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, androidx.work.i iVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.a());
        intent.putExtra("KEY_NOTIFICATION", iVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        q.c().d(f6632k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f6634b.l(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int i11 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q.c().a(f6632k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f6642j == null) {
            return;
        }
        this.f6638f.put(stringExtra, new androidx.work.i(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f6637e)) {
            this.f6637e = stringExtra;
            this.f6642j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f6642j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, androidx.work.i> entry : this.f6638f.entrySet()) {
            i11 |= entry.getValue().a();
        }
        androidx.work.i iVar = this.f6638f.get(this.f6637e);
        if (iVar != null) {
            this.f6642j.c(iVar.c(), i11, iVar.b());
        }
    }

    private void i(Intent intent) {
        q.c().d(f6632k, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f6635c.b(new RunnableC0117a(this.f6634b.v(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // g5.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            q.c().a(f6632k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f6634b.D(str);
        }
    }

    @Override // d5.b
    public void e(String str, boolean z11) {
        Map.Entry<String, androidx.work.i> entry;
        synchronized (this.f6636d) {
            p remove = this.f6639g.remove(str);
            if (remove != null ? this.f6640h.remove(remove) : false) {
                this.f6641i.d(this.f6640h);
            }
        }
        androidx.work.i remove2 = this.f6638f.remove(str);
        if (str.equals(this.f6637e) && this.f6638f.size() > 0) {
            Iterator<Map.Entry<String, androidx.work.i>> it2 = this.f6638f.entrySet().iterator();
            Map.Entry<String, androidx.work.i> next = it2.next();
            while (true) {
                entry = next;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            }
            this.f6637e = entry.getKey();
            if (this.f6642j != null) {
                androidx.work.i value = entry.getValue();
                this.f6642j.c(value.c(), value.a(), value.b());
                this.f6642j.d(value.c());
            }
        }
        b bVar = this.f6642j;
        if (remove2 == null || bVar == null) {
            return;
        }
        q.c().a(f6632k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
        bVar.d(remove2.c());
    }

    @Override // g5.c
    public void f(List<String> list) {
    }

    void j(Intent intent) {
        q.c().d(f6632k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f6642j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.f6642j = null;
        synchronized (this.f6636d) {
            this.f6641i.e();
        }
        this.f6634b.t().i(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(b bVar) {
        if (this.f6642j != null) {
            q.c().b(f6632k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f6642j = bVar;
        }
    }
}