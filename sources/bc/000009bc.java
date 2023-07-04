package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static t4.b f6558a = new C0116a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static t4.b f6559b = new b(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static t4.b f6560c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static t4.b f6561d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static t4.b f6562e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static t4.b f6563f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static t4.b f6564g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0116a extends t4.b {
        C0116a(int i11, int i12) {
            super(i11, i12);
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            gVar.u("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            gVar.u("DROP TABLE IF EXISTS alarmInfo");
            gVar.u("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    class b extends t4.b {
        b(int i11, int i12) {
            super(i11, i12);
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                gVar.u("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends t4.b {
        c(int i11, int i12) {
            super(i11, i12);
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            gVar.u("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            gVar.u("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    class d extends t4.b {
        d(int i11, int i12) {
            super(i11, i12);
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: classes.dex */
    class e extends t4.b {
        e(int i11, int i12) {
            super(i11, i12);
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: classes.dex */
    class f extends t4.b {
        f(int i11, int i12) {
            super(i11, i12);
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            gVar.u("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    class g extends t4.b {
        g(int i11, int i12) {
            super(i11, i12);
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            gVar.u("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static class h extends t4.b {

        /* renamed from: c  reason: collision with root package name */
        final Context f6565c;

        public h(Context context, int i11, int i12) {
            super(i11, i12);
            this.f6565c = context;
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            if (this.f51627b >= 10) {
                gVar.P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f6565c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends t4.b {

        /* renamed from: c  reason: collision with root package name */
        final Context f6566c;

        public i(Context context) {
            super(9, 10);
            this.f6566c = context;
        }

        @Override // t4.b
        public void a(v4.g gVar) {
            gVar.u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            l5.e.b(this.f6566c, gVar);
            l5.c.a(this.f6566c, gVar);
        }
    }
}