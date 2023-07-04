package androidx.work.impl;

import android.os.Build;
import androidx.room.p;
import androidx.room.t0;
import androidx.room.v0;
import androidx.room.y;
import ch.qos.logback.core.joran.action.Action;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import k5.b;
import k5.e;
import k5.f;
import k5.h;
import k5.i;
import k5.k;
import k5.l;
import k5.n;
import k5.o;
import k5.q;
import k5.r;
import k5.t;
import k5.u;
import u4.c;
import u4.g;
import v4.g;
import v4.h;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile q f6550b;

    /* renamed from: c  reason: collision with root package name */
    private volatile b f6551c;

    /* renamed from: d  reason: collision with root package name */
    private volatile t f6552d;

    /* renamed from: e  reason: collision with root package name */
    private volatile h f6553e;

    /* renamed from: f  reason: collision with root package name */
    private volatile k f6554f;

    /* renamed from: g  reason: collision with root package name */
    private volatile n f6555g;

    /* renamed from: h  reason: collision with root package name */
    private volatile e f6556h;

    /* loaded from: classes.dex */
    class a extends v0.a {
        a(int i11) {
            super(i11);
        }

        @Override // androidx.room.v0.a
        public void createAllTables(g gVar) {
            gVar.u("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.u("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.u("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.v0.a
        public void dropAllTables(g gVar) {
            gVar.u("DROP TABLE IF EXISTS `Dependency`");
            gVar.u("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.u("DROP TABLE IF EXISTS `WorkTag`");
            gVar.u("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.u("DROP TABLE IF EXISTS `WorkName`");
            gVar.u("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.u("DROP TABLE IF EXISTS `Preference`");
            if (((t0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((t0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((t0.b) ((t0) WorkDatabase_Impl.this).mCallbacks.get(i11)).b(gVar);
                }
            }
        }

        @Override // androidx.room.v0.a
        protected void onCreate(g gVar) {
            if (((t0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((t0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((t0.b) ((t0) WorkDatabase_Impl.this).mCallbacks.get(i11)).a(gVar);
                }
            }
        }

        @Override // androidx.room.v0.a
        public void onOpen(g gVar) {
            ((t0) WorkDatabase_Impl.this).mDatabase = gVar;
            gVar.u("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            if (((t0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((t0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((t0.b) ((t0) WorkDatabase_Impl.this).mCallbacks.get(i11)).c(gVar);
                }
            }
        }

        @Override // androidx.room.v0.a
        public void onPostMigrate(g gVar) {
        }

        @Override // androidx.room.v0.a
        public void onPreMigrate(g gVar) {
            c.b(gVar);
        }

        @Override // androidx.room.v0.a
        protected v0.b onValidateSchema(g gVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new g.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            u4.g gVar2 = new u4.g("Dependency", hashMap, hashSet, hashSet2);
            u4.g a11 = u4.g.a(gVar, "Dependency");
            if (!gVar2.equals(a11)) {
                return new v0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new g.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new g.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new g.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new g.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new g.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new g.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new g.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new g.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new g.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new g.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new g.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new g.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new g.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new g.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new g.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            u4.g gVar3 = new u4.g("WorkSpec", hashMap2, hashSet3, hashSet4);
            u4.g a12 = u4.g.a(gVar, "WorkSpec");
            if (!gVar3.equals(a12)) {
                return new v0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new g.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            u4.g gVar4 = new u4.g("WorkTag", hashMap3, hashSet5, hashSet6);
            u4.g a13 = u4.g.a(gVar, "WorkTag");
            if (!gVar4.equals(a13)) {
                return new v0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            u4.g gVar5 = new u4.g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            u4.g a14 = u4.g.a(gVar, "SystemIdInfo");
            if (!gVar5.equals(a14)) {
                return new v0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new g.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            u4.g gVar6 = new u4.g("WorkName", hashMap5, hashSet8, hashSet9);
            u4.g a15 = u4.g.a(gVar, "WorkName");
            if (!gVar6.equals(a15)) {
                return new v0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new g.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            u4.g gVar7 = new u4.g("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            u4.g a16 = u4.g.a(gVar, "WorkProgress");
            if (!gVar7.equals(a16)) {
                return new v0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar7 + "\n Found:\n" + a16);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(Action.KEY_ATTRIBUTE, new g.a(Action.KEY_ATTRIBUTE, "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new g.a("long_value", "INTEGER", false, 0, null, 1));
            u4.g gVar8 = new u4.g("Preference", hashMap7, new HashSet(0), new HashSet(0));
            u4.g a17 = u4.g.a(gVar, "Preference");
            if (!gVar8.equals(a17)) {
                return new v0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar8 + "\n Found:\n" + a17);
            }
            return new v0.b(true, null);
        }
    }

    @Override // androidx.room.t0
    public void clearAllTables() {
        super.assertNotMainThread();
        v4.g W0 = super.getOpenHelper().W0();
        boolean z11 = Build.VERSION.SDK_INT >= 21;
        if (!z11) {
            try {
                W0.u("PRAGMA foreign_keys = FALSE");
            } finally {
                super.endTransaction();
                if (!z11) {
                    W0.u("PRAGMA foreign_keys = TRUE");
                }
                W0.a1("PRAGMA wal_checkpoint(FULL)").close();
                if (!W0.s1()) {
                    W0.u("VACUUM");
                }
            }
        }
        super.beginTransaction();
        if (z11) {
            W0.u("PRAGMA defer_foreign_keys = TRUE");
        }
        W0.u("DELETE FROM `Dependency`");
        W0.u("DELETE FROM `WorkSpec`");
        W0.u("DELETE FROM `WorkTag`");
        W0.u("DELETE FROM `SystemIdInfo`");
        W0.u("DELETE FROM `WorkName`");
        W0.u("DELETE FROM `WorkProgress`");
        W0.u("DELETE FROM `Preference`");
        super.setTransactionSuccessful();
    }

    @Override // androidx.room.t0
    protected y createInvalidationTracker() {
        return new y(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.t0
    protected v4.h createOpenHelper(p pVar) {
        return pVar.f5805a.a(h.b.a(pVar.f5806b).c(pVar.f5807c).b(new v0(pVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b d() {
        b bVar;
        if (this.f6551c != null) {
            return this.f6551c;
        }
        synchronized (this) {
            if (this.f6551c == null) {
                this.f6551c = new k5.c(this);
            }
            bVar = this.f6551c;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e h() {
        e eVar;
        if (this.f6556h != null) {
            return this.f6556h;
        }
        synchronized (this) {
            if (this.f6556h == null) {
                this.f6556h = new f(this);
            }
            eVar = this.f6556h;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k5.h i() {
        k5.h hVar;
        if (this.f6553e != null) {
            return this.f6553e;
        }
        synchronized (this) {
            if (this.f6553e == null) {
                this.f6553e = new i(this);
            }
            hVar = this.f6553e;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k j() {
        k kVar;
        if (this.f6554f != null) {
            return this.f6554f;
        }
        synchronized (this) {
            if (this.f6554f == null) {
                this.f6554f = new l(this);
            }
            kVar = this.f6554f;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public n k() {
        n nVar;
        if (this.f6555g != null) {
            return this.f6555g;
        }
        synchronized (this) {
            if (this.f6555g == null) {
                this.f6555g = new o(this);
            }
            nVar = this.f6555g;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q l() {
        q qVar;
        if (this.f6550b != null) {
            return this.f6550b;
        }
        synchronized (this) {
            if (this.f6550b == null) {
                this.f6550b = new r(this);
            }
            qVar = this.f6550b;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t m() {
        t tVar;
        if (this.f6552d != null) {
            return this.f6552d;
        }
        synchronized (this) {
            if (this.f6552d == null) {
                this.f6552d = new u(this);
            }
            tVar = this.f6552d;
        }
        return tVar;
    }
}