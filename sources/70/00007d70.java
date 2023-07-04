package k5;

import android.database.Cursor;
import androidx.room.t0;
import androidx.room.w0;
import androidx.room.z0;
import androidx.work.a0;
import ch.qos.logback.classic.spi.CallerData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k5.p;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f34431a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.s<p> f34432b;

    /* renamed from: c  reason: collision with root package name */
    private final z0 f34433c;

    /* renamed from: d  reason: collision with root package name */
    private final z0 f34434d;

    /* renamed from: e  reason: collision with root package name */
    private final z0 f34435e;

    /* renamed from: f  reason: collision with root package name */
    private final z0 f34436f;

    /* renamed from: g  reason: collision with root package name */
    private final z0 f34437g;

    /* renamed from: h  reason: collision with root package name */
    private final z0 f34438h;

    /* renamed from: i  reason: collision with root package name */
    private final z0 f34439i;

    /* loaded from: classes.dex */
    class a extends androidx.room.s<p> {
        a(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.s
        /* renamed from: b */
        public void bind(v4.k kVar, p pVar) {
            String str = pVar.f34405a;
            if (str == null) {
                kVar.o1(1);
            } else {
                kVar.A0(1, str);
            }
            kVar.U0(2, v.j(pVar.f34406b));
            String str2 = pVar.f34407c;
            if (str2 == null) {
                kVar.o1(3);
            } else {
                kVar.A0(3, str2);
            }
            String str3 = pVar.f34408d;
            if (str3 == null) {
                kVar.o1(4);
            } else {
                kVar.A0(4, str3);
            }
            byte[] m11 = androidx.work.e.m(pVar.f34409e);
            if (m11 == null) {
                kVar.o1(5);
            } else {
                kVar.V0(5, m11);
            }
            byte[] m12 = androidx.work.e.m(pVar.f34410f);
            if (m12 == null) {
                kVar.o1(6);
            } else {
                kVar.V0(6, m12);
            }
            kVar.U0(7, pVar.f34411g);
            kVar.U0(8, pVar.f34412h);
            kVar.U0(9, pVar.f34413i);
            kVar.U0(10, pVar.f34415k);
            kVar.U0(11, v.a(pVar.f34416l));
            kVar.U0(12, pVar.f34417m);
            kVar.U0(13, pVar.f34418n);
            kVar.U0(14, pVar.f34419o);
            kVar.U0(15, pVar.f34420p);
            kVar.U0(16, pVar.f34421q ? 1L : 0L);
            kVar.U0(17, v.i(pVar.f34422r));
            androidx.work.c cVar = pVar.f34414j;
            if (cVar != null) {
                kVar.U0(18, v.h(cVar.b()));
                kVar.U0(19, cVar.g() ? 1L : 0L);
                kVar.U0(20, cVar.h() ? 1L : 0L);
                kVar.U0(21, cVar.f() ? 1L : 0L);
                kVar.U0(22, cVar.i() ? 1L : 0L);
                kVar.U0(23, cVar.c());
                kVar.U0(24, cVar.d());
                byte[] c11 = v.c(cVar.a());
                if (c11 == null) {
                    kVar.o1(25);
                    return;
                } else {
                    kVar.V0(25, c11);
                    return;
                }
            }
            kVar.o1(18);
            kVar.o1(19);
            kVar.o1(20);
            kVar.o1(21);
            kVar.o1(22);
            kVar.o1(23);
            kVar.o1(24);
            kVar.o1(25);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* loaded from: classes.dex */
    class b extends z0 {
        b(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class c extends z0 {
        c(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class d extends z0 {
        d(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class e extends z0 {
        e(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class f extends z0 {
        f(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class g extends z0 {
        g(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* loaded from: classes.dex */
    class h extends z0 {
        h(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* loaded from: classes.dex */
    class i extends z0 {
        i(r rVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(t0 t0Var) {
        this.f34431a = t0Var;
        this.f34432b = new a(this, t0Var);
        this.f34433c = new b(this, t0Var);
        this.f34434d = new c(this, t0Var);
        this.f34435e = new d(this, t0Var);
        this.f34436f = new e(this, t0Var);
        this.f34437g = new f(this, t0Var);
        this.f34438h = new g(this, t0Var);
        this.f34439i = new h(this, t0Var);
        new i(this, t0Var);
    }

    private void v(androidx.collection.a<String, ArrayList<androidx.work.e>> aVar) {
        ArrayList<androidx.work.e> arrayList;
        Set<String> keySet = aVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>(999);
            int size = aVar.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                aVar2.put(aVar.k(i11), aVar.o(i11));
                i11++;
                i12++;
                if (i12 == 999) {
                    v(aVar2);
                    aVar2 = new androidx.collection.a<>(999);
                    i12 = 0;
                }
            }
            if (i12 > 0) {
                v(aVar2);
                return;
            }
            return;
        }
        StringBuilder b11 = u4.f.b();
        b11.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        u4.f.a(b11, size2);
        b11.append(")");
        w0 j11 = w0.j(b11.toString(), size2 + 0);
        int i13 = 1;
        for (String str : keySet) {
            if (str == null) {
                j11.o1(i13);
            } else {
                j11.A0(i13, str);
            }
            i13++;
        }
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            int d11 = u4.b.d(c11, "work_spec_id");
            if (d11 == -1) {
                return;
            }
            while (c11.moveToNext()) {
                if (!c11.isNull(d11) && (arrayList = aVar.get(c11.getString(d11))) != null) {
                    arrayList.add(androidx.work.e.g(c11.getBlob(0)));
                }
            }
        } finally {
            c11.close();
        }
    }

    private void w(androidx.collection.a<String, ArrayList<String>> aVar) {
        ArrayList<String> arrayList;
        Set<String> keySet = aVar.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<String>> aVar2 = new androidx.collection.a<>(999);
            int size = aVar.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                aVar2.put(aVar.k(i11), aVar.o(i11));
                i11++;
                i12++;
                if (i12 == 999) {
                    w(aVar2);
                    aVar2 = new androidx.collection.a<>(999);
                    i12 = 0;
                }
            }
            if (i12 > 0) {
                w(aVar2);
                return;
            }
            return;
        }
        StringBuilder b11 = u4.f.b();
        b11.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        u4.f.a(b11, size2);
        b11.append(")");
        w0 j11 = w0.j(b11.toString(), size2 + 0);
        int i13 = 1;
        for (String str : keySet) {
            if (str == null) {
                j11.o1(i13);
            } else {
                j11.A0(i13, str);
            }
            i13++;
        }
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            int d11 = u4.b.d(c11, "work_spec_id");
            if (d11 == -1) {
                return;
            }
            while (c11.moveToNext()) {
                if (!c11.isNull(d11) && (arrayList = aVar.get(c11.getString(d11))) != null) {
                    arrayList.add(c11.getString(0));
                }
            }
        } finally {
            c11.close();
        }
    }

    @Override // k5.q
    public void a(String str) {
        this.f34431a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34433c.acquire();
        if (str == null) {
            acquire.o1(1);
        } else {
            acquire.A0(1, str);
        }
        this.f34431a.beginTransaction();
        try {
            acquire.w();
            this.f34431a.setTransactionSuccessful();
        } finally {
            this.f34431a.endTransaction();
            this.f34433c.release(acquire);
        }
    }

    @Override // k5.q
    public int b(a0.a aVar, String... strArr) {
        this.f34431a.assertNotSuspendingTransaction();
        StringBuilder b11 = u4.f.b();
        b11.append("UPDATE workspec SET state=");
        b11.append(CallerData.NA);
        b11.append(" WHERE id IN (");
        u4.f.a(b11, strArr.length);
        b11.append(")");
        v4.k compileStatement = this.f34431a.compileStatement(b11.toString());
        compileStatement.U0(1, v.j(aVar));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.o1(i11);
            } else {
                compileStatement.A0(i11, str);
            }
            i11++;
        }
        this.f34431a.beginTransaction();
        try {
            int w11 = compileStatement.w();
            this.f34431a.setTransactionSuccessful();
            return w11;
        } finally {
            this.f34431a.endTransaction();
        }
    }

    @Override // k5.q
    public List<p> c(long j11) {
        w0 w0Var;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e21;
        int e22;
        int e23;
        int e24;
        int e25;
        w0 j12 = w0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        j12.U0(1, j11);
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j12, false, null);
        try {
            e11 = u4.b.e(c11, "required_network_type");
            e12 = u4.b.e(c11, "requires_charging");
            e13 = u4.b.e(c11, "requires_device_idle");
            e14 = u4.b.e(c11, "requires_battery_not_low");
            e15 = u4.b.e(c11, "requires_storage_not_low");
            e16 = u4.b.e(c11, "trigger_content_update_delay");
            e17 = u4.b.e(c11, "trigger_max_content_delay");
            e18 = u4.b.e(c11, "content_uri_triggers");
            e19 = u4.b.e(c11, "id");
            e21 = u4.b.e(c11, "state");
            e22 = u4.b.e(c11, "worker_class_name");
            e23 = u4.b.e(c11, "input_merger_class_name");
            e24 = u4.b.e(c11, "input");
            e25 = u4.b.e(c11, "output");
            w0Var = j12;
        } catch (Throwable th2) {
            th = th2;
            w0Var = j12;
        }
        try {
            int e26 = u4.b.e(c11, "initial_delay");
            int e27 = u4.b.e(c11, "interval_duration");
            int e28 = u4.b.e(c11, "flex_duration");
            int e29 = u4.b.e(c11, "run_attempt_count");
            int e31 = u4.b.e(c11, "backoff_policy");
            int e32 = u4.b.e(c11, "backoff_delay_duration");
            int e33 = u4.b.e(c11, "period_start_time");
            int e34 = u4.b.e(c11, "minimum_retention_duration");
            int e35 = u4.b.e(c11, "schedule_requested_at");
            int e36 = u4.b.e(c11, "run_in_foreground");
            int e37 = u4.b.e(c11, "out_of_quota_policy");
            int i11 = e25;
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                String string = c11.getString(e19);
                int i12 = e19;
                String string2 = c11.getString(e22);
                int i13 = e22;
                androidx.work.c cVar = new androidx.work.c();
                int i14 = e11;
                cVar.k(v.e(c11.getInt(e11)));
                cVar.m(c11.getInt(e12) != 0);
                cVar.n(c11.getInt(e13) != 0);
                cVar.l(c11.getInt(e14) != 0);
                cVar.o(c11.getInt(e15) != 0);
                int i15 = e12;
                int i16 = e13;
                cVar.p(c11.getLong(e16));
                cVar.q(c11.getLong(e17));
                cVar.j(v.b(c11.getBlob(e18)));
                p pVar = new p(string, string2);
                pVar.f34406b = v.g(c11.getInt(e21));
                pVar.f34408d = c11.getString(e23);
                pVar.f34409e = androidx.work.e.g(c11.getBlob(e24));
                int i17 = i11;
                pVar.f34410f = androidx.work.e.g(c11.getBlob(i17));
                int i18 = e26;
                i11 = i17;
                pVar.f34411g = c11.getLong(i18);
                int i19 = e23;
                int i21 = e27;
                pVar.f34412h = c11.getLong(i21);
                int i22 = e14;
                int i23 = e28;
                pVar.f34413i = c11.getLong(i23);
                int i24 = e29;
                pVar.f34415k = c11.getInt(i24);
                int i25 = e31;
                pVar.f34416l = v.d(c11.getInt(i25));
                e28 = i23;
                int i26 = e32;
                pVar.f34417m = c11.getLong(i26);
                int i27 = e33;
                pVar.f34418n = c11.getLong(i27);
                e33 = i27;
                int i28 = e34;
                pVar.f34419o = c11.getLong(i28);
                int i29 = e35;
                pVar.f34420p = c11.getLong(i29);
                int i31 = e36;
                pVar.f34421q = c11.getInt(i31) != 0;
                int i32 = e37;
                pVar.f34422r = v.f(c11.getInt(i32));
                pVar.f34414j = cVar;
                arrayList.add(pVar);
                e12 = i15;
                e37 = i32;
                e23 = i19;
                e26 = i18;
                e27 = i21;
                e29 = i24;
                e35 = i29;
                e19 = i12;
                e22 = i13;
                e11 = i14;
                e36 = i31;
                e34 = i28;
                e13 = i16;
                e32 = i26;
                e14 = i22;
                e31 = i25;
            }
            c11.close();
            w0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c11.close();
            w0Var.release();
            throw th;
        }
    }

    @Override // k5.q
    public List<p> d() {
        w0 w0Var;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e21;
        int e22;
        int e23;
        int e24;
        int e25;
        w0 j11 = w0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            e11 = u4.b.e(c11, "required_network_type");
            e12 = u4.b.e(c11, "requires_charging");
            e13 = u4.b.e(c11, "requires_device_idle");
            e14 = u4.b.e(c11, "requires_battery_not_low");
            e15 = u4.b.e(c11, "requires_storage_not_low");
            e16 = u4.b.e(c11, "trigger_content_update_delay");
            e17 = u4.b.e(c11, "trigger_max_content_delay");
            e18 = u4.b.e(c11, "content_uri_triggers");
            e19 = u4.b.e(c11, "id");
            e21 = u4.b.e(c11, "state");
            e22 = u4.b.e(c11, "worker_class_name");
            e23 = u4.b.e(c11, "input_merger_class_name");
            e24 = u4.b.e(c11, "input");
            e25 = u4.b.e(c11, "output");
            w0Var = j11;
        } catch (Throwable th2) {
            th = th2;
            w0Var = j11;
        }
        try {
            int e26 = u4.b.e(c11, "initial_delay");
            int e27 = u4.b.e(c11, "interval_duration");
            int e28 = u4.b.e(c11, "flex_duration");
            int e29 = u4.b.e(c11, "run_attempt_count");
            int e31 = u4.b.e(c11, "backoff_policy");
            int e32 = u4.b.e(c11, "backoff_delay_duration");
            int e33 = u4.b.e(c11, "period_start_time");
            int e34 = u4.b.e(c11, "minimum_retention_duration");
            int e35 = u4.b.e(c11, "schedule_requested_at");
            int e36 = u4.b.e(c11, "run_in_foreground");
            int e37 = u4.b.e(c11, "out_of_quota_policy");
            int i11 = e25;
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                String string = c11.getString(e19);
                int i12 = e19;
                String string2 = c11.getString(e22);
                int i13 = e22;
                androidx.work.c cVar = new androidx.work.c();
                int i14 = e11;
                cVar.k(v.e(c11.getInt(e11)));
                cVar.m(c11.getInt(e12) != 0);
                cVar.n(c11.getInt(e13) != 0);
                cVar.l(c11.getInt(e14) != 0);
                cVar.o(c11.getInt(e15) != 0);
                int i15 = e12;
                int i16 = e13;
                cVar.p(c11.getLong(e16));
                cVar.q(c11.getLong(e17));
                cVar.j(v.b(c11.getBlob(e18)));
                p pVar = new p(string, string2);
                pVar.f34406b = v.g(c11.getInt(e21));
                pVar.f34408d = c11.getString(e23);
                pVar.f34409e = androidx.work.e.g(c11.getBlob(e24));
                int i17 = i11;
                pVar.f34410f = androidx.work.e.g(c11.getBlob(i17));
                i11 = i17;
                int i18 = e26;
                pVar.f34411g = c11.getLong(i18);
                int i19 = e24;
                int i21 = e27;
                pVar.f34412h = c11.getLong(i21);
                int i22 = e14;
                int i23 = e28;
                pVar.f34413i = c11.getLong(i23);
                int i24 = e29;
                pVar.f34415k = c11.getInt(i24);
                int i25 = e31;
                pVar.f34416l = v.d(c11.getInt(i25));
                e28 = i23;
                int i26 = e32;
                pVar.f34417m = c11.getLong(i26);
                int i27 = e33;
                pVar.f34418n = c11.getLong(i27);
                e33 = i27;
                int i28 = e34;
                pVar.f34419o = c11.getLong(i28);
                int i29 = e35;
                pVar.f34420p = c11.getLong(i29);
                int i31 = e36;
                pVar.f34421q = c11.getInt(i31) != 0;
                int i32 = e37;
                pVar.f34422r = v.f(c11.getInt(i32));
                pVar.f34414j = cVar;
                arrayList.add(pVar);
                e37 = i32;
                e12 = i15;
                e24 = i19;
                e26 = i18;
                e27 = i21;
                e29 = i24;
                e35 = i29;
                e19 = i12;
                e22 = i13;
                e11 = i14;
                e36 = i31;
                e34 = i28;
                e13 = i16;
                e32 = i26;
                e14 = i22;
                e31 = i25;
            }
            c11.close();
            w0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c11.close();
            w0Var.release();
            throw th;
        }
    }

    @Override // k5.q
    public List<String> e(String str) {
        w0 j11 = w0.j("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                arrayList.add(c11.getString(0));
            }
            return arrayList;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.q
    public a0.a f(String str) {
        w0 j11 = w0.j("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            return c11.moveToFirst() ? v.g(c11.getInt(0)) : null;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.q
    public p g(String str) {
        w0 w0Var;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e21;
        int e22;
        int e23;
        int e24;
        int e25;
        p pVar;
        w0 j11 = w0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            e11 = u4.b.e(c11, "required_network_type");
            e12 = u4.b.e(c11, "requires_charging");
            e13 = u4.b.e(c11, "requires_device_idle");
            e14 = u4.b.e(c11, "requires_battery_not_low");
            e15 = u4.b.e(c11, "requires_storage_not_low");
            e16 = u4.b.e(c11, "trigger_content_update_delay");
            e17 = u4.b.e(c11, "trigger_max_content_delay");
            e18 = u4.b.e(c11, "content_uri_triggers");
            e19 = u4.b.e(c11, "id");
            e21 = u4.b.e(c11, "state");
            e22 = u4.b.e(c11, "worker_class_name");
            e23 = u4.b.e(c11, "input_merger_class_name");
            e24 = u4.b.e(c11, "input");
            e25 = u4.b.e(c11, "output");
            w0Var = j11;
        } catch (Throwable th2) {
            th = th2;
            w0Var = j11;
        }
        try {
            int e26 = u4.b.e(c11, "initial_delay");
            int e27 = u4.b.e(c11, "interval_duration");
            int e28 = u4.b.e(c11, "flex_duration");
            int e29 = u4.b.e(c11, "run_attempt_count");
            int e31 = u4.b.e(c11, "backoff_policy");
            int e32 = u4.b.e(c11, "backoff_delay_duration");
            int e33 = u4.b.e(c11, "period_start_time");
            int e34 = u4.b.e(c11, "minimum_retention_duration");
            int e35 = u4.b.e(c11, "schedule_requested_at");
            int e36 = u4.b.e(c11, "run_in_foreground");
            int e37 = u4.b.e(c11, "out_of_quota_policy");
            if (c11.moveToFirst()) {
                String string = c11.getString(e19);
                String string2 = c11.getString(e22);
                androidx.work.c cVar = new androidx.work.c();
                cVar.k(v.e(c11.getInt(e11)));
                cVar.m(c11.getInt(e12) != 0);
                cVar.n(c11.getInt(e13) != 0);
                cVar.l(c11.getInt(e14) != 0);
                cVar.o(c11.getInt(e15) != 0);
                cVar.p(c11.getLong(e16));
                cVar.q(c11.getLong(e17));
                cVar.j(v.b(c11.getBlob(e18)));
                p pVar2 = new p(string, string2);
                pVar2.f34406b = v.g(c11.getInt(e21));
                pVar2.f34408d = c11.getString(e23);
                pVar2.f34409e = androidx.work.e.g(c11.getBlob(e24));
                pVar2.f34410f = androidx.work.e.g(c11.getBlob(e25));
                pVar2.f34411g = c11.getLong(e26);
                pVar2.f34412h = c11.getLong(e27);
                pVar2.f34413i = c11.getLong(e28);
                pVar2.f34415k = c11.getInt(e29);
                pVar2.f34416l = v.d(c11.getInt(e31));
                pVar2.f34417m = c11.getLong(e32);
                pVar2.f34418n = c11.getLong(e33);
                pVar2.f34419o = c11.getLong(e34);
                pVar2.f34420p = c11.getLong(e35);
                pVar2.f34421q = c11.getInt(e36) != 0;
                pVar2.f34422r = v.f(c11.getInt(e37));
                pVar2.f34414j = cVar;
                pVar = pVar2;
            } else {
                pVar = null;
            }
            c11.close();
            w0Var.release();
            return pVar;
        } catch (Throwable th3) {
            th = th3;
            c11.close();
            w0Var.release();
            throw th;
        }
    }

    @Override // k5.q
    public List<androidx.work.e> h(String str) {
        w0 j11 = w0.j("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                arrayList.add(androidx.work.e.g(c11.getBlob(0)));
            }
            return arrayList;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.q
    public List<p> i(int i11) {
        w0 w0Var;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e21;
        int e22;
        int e23;
        int e24;
        int e25;
        w0 j11 = w0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        j11.U0(1, i11);
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            e11 = u4.b.e(c11, "required_network_type");
            e12 = u4.b.e(c11, "requires_charging");
            e13 = u4.b.e(c11, "requires_device_idle");
            e14 = u4.b.e(c11, "requires_battery_not_low");
            e15 = u4.b.e(c11, "requires_storage_not_low");
            e16 = u4.b.e(c11, "trigger_content_update_delay");
            e17 = u4.b.e(c11, "trigger_max_content_delay");
            e18 = u4.b.e(c11, "content_uri_triggers");
            e19 = u4.b.e(c11, "id");
            e21 = u4.b.e(c11, "state");
            e22 = u4.b.e(c11, "worker_class_name");
            e23 = u4.b.e(c11, "input_merger_class_name");
            e24 = u4.b.e(c11, "input");
            e25 = u4.b.e(c11, "output");
            w0Var = j11;
        } catch (Throwable th2) {
            th = th2;
            w0Var = j11;
        }
        try {
            int e26 = u4.b.e(c11, "initial_delay");
            int e27 = u4.b.e(c11, "interval_duration");
            int e28 = u4.b.e(c11, "flex_duration");
            int e29 = u4.b.e(c11, "run_attempt_count");
            int e31 = u4.b.e(c11, "backoff_policy");
            int e32 = u4.b.e(c11, "backoff_delay_duration");
            int e33 = u4.b.e(c11, "period_start_time");
            int e34 = u4.b.e(c11, "minimum_retention_duration");
            int e35 = u4.b.e(c11, "schedule_requested_at");
            int e36 = u4.b.e(c11, "run_in_foreground");
            int e37 = u4.b.e(c11, "out_of_quota_policy");
            int i12 = e25;
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                String string = c11.getString(e19);
                int i13 = e19;
                String string2 = c11.getString(e22);
                int i14 = e22;
                androidx.work.c cVar = new androidx.work.c();
                int i15 = e11;
                cVar.k(v.e(c11.getInt(e11)));
                cVar.m(c11.getInt(e12) != 0);
                cVar.n(c11.getInt(e13) != 0);
                cVar.l(c11.getInt(e14) != 0);
                cVar.o(c11.getInt(e15) != 0);
                int i16 = e12;
                int i17 = e13;
                cVar.p(c11.getLong(e16));
                cVar.q(c11.getLong(e17));
                cVar.j(v.b(c11.getBlob(e18)));
                p pVar = new p(string, string2);
                pVar.f34406b = v.g(c11.getInt(e21));
                pVar.f34408d = c11.getString(e23);
                pVar.f34409e = androidx.work.e.g(c11.getBlob(e24));
                int i18 = i12;
                pVar.f34410f = androidx.work.e.g(c11.getBlob(i18));
                i12 = i18;
                int i19 = e26;
                pVar.f34411g = c11.getLong(i19);
                int i21 = e23;
                int i22 = e27;
                pVar.f34412h = c11.getLong(i22);
                int i23 = e14;
                int i24 = e28;
                pVar.f34413i = c11.getLong(i24);
                int i25 = e29;
                pVar.f34415k = c11.getInt(i25);
                int i26 = e31;
                pVar.f34416l = v.d(c11.getInt(i26));
                e28 = i24;
                int i27 = e32;
                pVar.f34417m = c11.getLong(i27);
                int i28 = e33;
                pVar.f34418n = c11.getLong(i28);
                e33 = i28;
                int i29 = e34;
                pVar.f34419o = c11.getLong(i29);
                int i31 = e35;
                pVar.f34420p = c11.getLong(i31);
                int i32 = e36;
                pVar.f34421q = c11.getInt(i32) != 0;
                int i33 = e37;
                pVar.f34422r = v.f(c11.getInt(i33));
                pVar.f34414j = cVar;
                arrayList.add(pVar);
                e37 = i33;
                e12 = i16;
                e23 = i21;
                e26 = i19;
                e27 = i22;
                e29 = i25;
                e35 = i31;
                e19 = i13;
                e22 = i14;
                e11 = i15;
                e36 = i32;
                e34 = i29;
                e13 = i17;
                e32 = i27;
                e14 = i23;
                e31 = i26;
            }
            c11.close();
            w0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c11.close();
            w0Var.release();
            throw th;
        }
    }

    @Override // k5.q
    public int j() {
        this.f34431a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34439i.acquire();
        this.f34431a.beginTransaction();
        try {
            int w11 = acquire.w();
            this.f34431a.setTransactionSuccessful();
            return w11;
        } finally {
            this.f34431a.endTransaction();
            this.f34439i.release(acquire);
        }
    }

    @Override // k5.q
    public int k(String str, long j11) {
        this.f34431a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34438h.acquire();
        acquire.U0(1, j11);
        if (str == null) {
            acquire.o1(2);
        } else {
            acquire.A0(2, str);
        }
        this.f34431a.beginTransaction();
        try {
            int w11 = acquire.w();
            this.f34431a.setTransactionSuccessful();
            return w11;
        } finally {
            this.f34431a.endTransaction();
            this.f34438h.release(acquire);
        }
    }

    @Override // k5.q
    public List<p.b> l(String str) {
        w0 j11 = w0.j("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            int e11 = u4.b.e(c11, "id");
            int e12 = u4.b.e(c11, "state");
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f34423a = c11.getString(e11);
                bVar.f34424b = v.g(c11.getInt(e12));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.q
    public List<p> m(int i11) {
        w0 w0Var;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e21;
        int e22;
        int e23;
        int e24;
        int e25;
        w0 j11 = w0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        j11.U0(1, i11);
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            e11 = u4.b.e(c11, "required_network_type");
            e12 = u4.b.e(c11, "requires_charging");
            e13 = u4.b.e(c11, "requires_device_idle");
            e14 = u4.b.e(c11, "requires_battery_not_low");
            e15 = u4.b.e(c11, "requires_storage_not_low");
            e16 = u4.b.e(c11, "trigger_content_update_delay");
            e17 = u4.b.e(c11, "trigger_max_content_delay");
            e18 = u4.b.e(c11, "content_uri_triggers");
            e19 = u4.b.e(c11, "id");
            e21 = u4.b.e(c11, "state");
            e22 = u4.b.e(c11, "worker_class_name");
            e23 = u4.b.e(c11, "input_merger_class_name");
            e24 = u4.b.e(c11, "input");
            e25 = u4.b.e(c11, "output");
            w0Var = j11;
        } catch (Throwable th2) {
            th = th2;
            w0Var = j11;
        }
        try {
            int e26 = u4.b.e(c11, "initial_delay");
            int e27 = u4.b.e(c11, "interval_duration");
            int e28 = u4.b.e(c11, "flex_duration");
            int e29 = u4.b.e(c11, "run_attempt_count");
            int e31 = u4.b.e(c11, "backoff_policy");
            int e32 = u4.b.e(c11, "backoff_delay_duration");
            int e33 = u4.b.e(c11, "period_start_time");
            int e34 = u4.b.e(c11, "minimum_retention_duration");
            int e35 = u4.b.e(c11, "schedule_requested_at");
            int e36 = u4.b.e(c11, "run_in_foreground");
            int e37 = u4.b.e(c11, "out_of_quota_policy");
            int i12 = e25;
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                String string = c11.getString(e19);
                int i13 = e19;
                String string2 = c11.getString(e22);
                int i14 = e22;
                androidx.work.c cVar = new androidx.work.c();
                int i15 = e11;
                cVar.k(v.e(c11.getInt(e11)));
                cVar.m(c11.getInt(e12) != 0);
                cVar.n(c11.getInt(e13) != 0);
                cVar.l(c11.getInt(e14) != 0);
                cVar.o(c11.getInt(e15) != 0);
                int i16 = e12;
                int i17 = e13;
                cVar.p(c11.getLong(e16));
                cVar.q(c11.getLong(e17));
                cVar.j(v.b(c11.getBlob(e18)));
                p pVar = new p(string, string2);
                pVar.f34406b = v.g(c11.getInt(e21));
                pVar.f34408d = c11.getString(e23);
                pVar.f34409e = androidx.work.e.g(c11.getBlob(e24));
                int i18 = i12;
                pVar.f34410f = androidx.work.e.g(c11.getBlob(i18));
                i12 = i18;
                int i19 = e26;
                pVar.f34411g = c11.getLong(i19);
                int i21 = e23;
                int i22 = e27;
                pVar.f34412h = c11.getLong(i22);
                int i23 = e14;
                int i24 = e28;
                pVar.f34413i = c11.getLong(i24);
                int i25 = e29;
                pVar.f34415k = c11.getInt(i25);
                int i26 = e31;
                pVar.f34416l = v.d(c11.getInt(i26));
                e28 = i24;
                int i27 = e32;
                pVar.f34417m = c11.getLong(i27);
                int i28 = e33;
                pVar.f34418n = c11.getLong(i28);
                e33 = i28;
                int i29 = e34;
                pVar.f34419o = c11.getLong(i29);
                int i31 = e35;
                pVar.f34420p = c11.getLong(i31);
                int i32 = e36;
                pVar.f34421q = c11.getInt(i32) != 0;
                int i33 = e37;
                pVar.f34422r = v.f(c11.getInt(i33));
                pVar.f34414j = cVar;
                arrayList.add(pVar);
                e37 = i33;
                e12 = i16;
                e23 = i21;
                e26 = i19;
                e27 = i22;
                e29 = i25;
                e35 = i31;
                e19 = i13;
                e22 = i14;
                e11 = i15;
                e36 = i32;
                e34 = i29;
                e13 = i17;
                e32 = i27;
                e14 = i23;
                e31 = i26;
            }
            c11.close();
            w0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c11.close();
            w0Var.release();
            throw th;
        }
    }

    @Override // k5.q
    public void n(String str, androidx.work.e eVar) {
        this.f34431a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34434d.acquire();
        byte[] m11 = androidx.work.e.m(eVar);
        if (m11 == null) {
            acquire.o1(1);
        } else {
            acquire.V0(1, m11);
        }
        if (str == null) {
            acquire.o1(2);
        } else {
            acquire.A0(2, str);
        }
        this.f34431a.beginTransaction();
        try {
            acquire.w();
            this.f34431a.setTransactionSuccessful();
        } finally {
            this.f34431a.endTransaction();
            this.f34434d.release(acquire);
        }
    }

    @Override // k5.q
    public List<p> o() {
        w0 w0Var;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e21;
        int e22;
        int e23;
        int e24;
        int e25;
        w0 j11 = w0.j("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            e11 = u4.b.e(c11, "required_network_type");
            e12 = u4.b.e(c11, "requires_charging");
            e13 = u4.b.e(c11, "requires_device_idle");
            e14 = u4.b.e(c11, "requires_battery_not_low");
            e15 = u4.b.e(c11, "requires_storage_not_low");
            e16 = u4.b.e(c11, "trigger_content_update_delay");
            e17 = u4.b.e(c11, "trigger_max_content_delay");
            e18 = u4.b.e(c11, "content_uri_triggers");
            e19 = u4.b.e(c11, "id");
            e21 = u4.b.e(c11, "state");
            e22 = u4.b.e(c11, "worker_class_name");
            e23 = u4.b.e(c11, "input_merger_class_name");
            e24 = u4.b.e(c11, "input");
            e25 = u4.b.e(c11, "output");
            w0Var = j11;
        } catch (Throwable th2) {
            th = th2;
            w0Var = j11;
        }
        try {
            int e26 = u4.b.e(c11, "initial_delay");
            int e27 = u4.b.e(c11, "interval_duration");
            int e28 = u4.b.e(c11, "flex_duration");
            int e29 = u4.b.e(c11, "run_attempt_count");
            int e31 = u4.b.e(c11, "backoff_policy");
            int e32 = u4.b.e(c11, "backoff_delay_duration");
            int e33 = u4.b.e(c11, "period_start_time");
            int e34 = u4.b.e(c11, "minimum_retention_duration");
            int e35 = u4.b.e(c11, "schedule_requested_at");
            int e36 = u4.b.e(c11, "run_in_foreground");
            int e37 = u4.b.e(c11, "out_of_quota_policy");
            int i11 = e25;
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                String string = c11.getString(e19);
                int i12 = e19;
                String string2 = c11.getString(e22);
                int i13 = e22;
                androidx.work.c cVar = new androidx.work.c();
                int i14 = e11;
                cVar.k(v.e(c11.getInt(e11)));
                cVar.m(c11.getInt(e12) != 0);
                cVar.n(c11.getInt(e13) != 0);
                cVar.l(c11.getInt(e14) != 0);
                cVar.o(c11.getInt(e15) != 0);
                int i15 = e12;
                int i16 = e13;
                cVar.p(c11.getLong(e16));
                cVar.q(c11.getLong(e17));
                cVar.j(v.b(c11.getBlob(e18)));
                p pVar = new p(string, string2);
                pVar.f34406b = v.g(c11.getInt(e21));
                pVar.f34408d = c11.getString(e23);
                pVar.f34409e = androidx.work.e.g(c11.getBlob(e24));
                int i17 = i11;
                pVar.f34410f = androidx.work.e.g(c11.getBlob(i17));
                i11 = i17;
                int i18 = e26;
                pVar.f34411g = c11.getLong(i18);
                int i19 = e24;
                int i21 = e27;
                pVar.f34412h = c11.getLong(i21);
                int i22 = e14;
                int i23 = e28;
                pVar.f34413i = c11.getLong(i23);
                int i24 = e29;
                pVar.f34415k = c11.getInt(i24);
                int i25 = e31;
                pVar.f34416l = v.d(c11.getInt(i25));
                e28 = i23;
                int i26 = e32;
                pVar.f34417m = c11.getLong(i26);
                int i27 = e33;
                pVar.f34418n = c11.getLong(i27);
                e33 = i27;
                int i28 = e34;
                pVar.f34419o = c11.getLong(i28);
                int i29 = e35;
                pVar.f34420p = c11.getLong(i29);
                int i31 = e36;
                pVar.f34421q = c11.getInt(i31) != 0;
                int i32 = e37;
                pVar.f34422r = v.f(c11.getInt(i32));
                pVar.f34414j = cVar;
                arrayList.add(pVar);
                e37 = i32;
                e12 = i15;
                e24 = i19;
                e26 = i18;
                e27 = i21;
                e29 = i24;
                e35 = i29;
                e19 = i12;
                e22 = i13;
                e11 = i14;
                e36 = i31;
                e34 = i28;
                e13 = i16;
                e32 = i26;
                e14 = i22;
                e31 = i25;
            }
            c11.close();
            w0Var.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c11.close();
            w0Var.release();
            throw th;
        }
    }

    @Override // k5.q
    public boolean p() {
        boolean z11 = false;
        w0 j11 = w0.j("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f34431a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34431a, j11, false, null);
        try {
            if (c11.moveToFirst()) {
                if (c11.getInt(0) != 0) {
                    z11 = true;
                }
            }
            return z11;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.q
    public int q(String str) {
        this.f34431a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34437g.acquire();
        if (str == null) {
            acquire.o1(1);
        } else {
            acquire.A0(1, str);
        }
        this.f34431a.beginTransaction();
        try {
            int w11 = acquire.w();
            this.f34431a.setTransactionSuccessful();
            return w11;
        } finally {
            this.f34431a.endTransaction();
            this.f34437g.release(acquire);
        }
    }

    @Override // k5.q
    public List<p.c> r(String str) {
        w0 j11 = w0.j("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34431a.assertNotSuspendingTransaction();
        this.f34431a.beginTransaction();
        try {
            Cursor c11 = u4.c.c(this.f34431a, j11, true, null);
            int e11 = u4.b.e(c11, "id");
            int e12 = u4.b.e(c11, "state");
            int e13 = u4.b.e(c11, "output");
            int e14 = u4.b.e(c11, "run_attempt_count");
            androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
            androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>();
            while (c11.moveToNext()) {
                if (!c11.isNull(e11)) {
                    String string = c11.getString(e11);
                    if (aVar.get(string) == null) {
                        aVar.put(string, new ArrayList<>());
                    }
                }
                if (!c11.isNull(e11)) {
                    String string2 = c11.getString(e11);
                    if (aVar2.get(string2) == null) {
                        aVar2.put(string2, new ArrayList<>());
                    }
                }
            }
            c11.moveToPosition(-1);
            w(aVar);
            v(aVar2);
            ArrayList arrayList = new ArrayList(c11.getCount());
            while (c11.moveToNext()) {
                ArrayList<String> arrayList2 = !c11.isNull(e11) ? aVar.get(c11.getString(e11)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<androidx.work.e> arrayList3 = !c11.isNull(e11) ? aVar2.get(c11.getString(e11)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                p.c cVar = new p.c();
                cVar.f34425a = c11.getString(e11);
                cVar.f34426b = v.g(c11.getInt(e12));
                cVar.f34427c = androidx.work.e.g(c11.getBlob(e13));
                cVar.f34428d = c11.getInt(e14);
                cVar.f34429e = arrayList2;
                cVar.f34430f = arrayList3;
                arrayList.add(cVar);
            }
            this.f34431a.setTransactionSuccessful();
            c11.close();
            j11.release();
            return arrayList;
        } finally {
            this.f34431a.endTransaction();
        }
    }

    @Override // k5.q
    public int s(String str) {
        this.f34431a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34436f.acquire();
        if (str == null) {
            acquire.o1(1);
        } else {
            acquire.A0(1, str);
        }
        this.f34431a.beginTransaction();
        try {
            int w11 = acquire.w();
            this.f34431a.setTransactionSuccessful();
            return w11;
        } finally {
            this.f34431a.endTransaction();
            this.f34436f.release(acquire);
        }
    }

    @Override // k5.q
    public void t(String str, long j11) {
        this.f34431a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34435e.acquire();
        acquire.U0(1, j11);
        if (str == null) {
            acquire.o1(2);
        } else {
            acquire.A0(2, str);
        }
        this.f34431a.beginTransaction();
        try {
            acquire.w();
            this.f34431a.setTransactionSuccessful();
        } finally {
            this.f34431a.endTransaction();
            this.f34435e.release(acquire);
        }
    }

    @Override // k5.q
    public void u(p pVar) {
        this.f34431a.assertNotSuspendingTransaction();
        this.f34431a.beginTransaction();
        try {
            this.f34432b.a(pVar);
            this.f34431a.setTransactionSuccessful();
        } finally {
            this.f34431a.endTransaction();
        }
    }
}