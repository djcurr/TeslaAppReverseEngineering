package k5;

import android.database.Cursor;
import androidx.room.t0;
import androidx.room.w0;
import androidx.room.z0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f34390a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.s<g> f34391b;

    /* renamed from: c  reason: collision with root package name */
    private final z0 f34392c;

    /* loaded from: classes.dex */
    class a extends androidx.room.s<g> {
        a(i iVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.s
        /* renamed from: b */
        public void bind(v4.k kVar, g gVar) {
            String str = gVar.f34388a;
            if (str == null) {
                kVar.o1(1);
            } else {
                kVar.A0(1, str);
            }
            kVar.U0(2, gVar.f34389b);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* loaded from: classes.dex */
    class b extends z0 {
        b(i iVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(t0 t0Var) {
        this.f34390a = t0Var;
        this.f34391b = new a(this, t0Var);
        this.f34392c = new b(this, t0Var);
    }

    @Override // k5.h
    public g a(String str) {
        w0 j11 = w0.j("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34390a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34390a, j11, false, null);
        try {
            return c11.moveToFirst() ? new g(c11.getString(u4.b.e(c11, "work_spec_id")), c11.getInt(u4.b.e(c11, "system_id"))) : null;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.h
    public void b(g gVar) {
        this.f34390a.assertNotSuspendingTransaction();
        this.f34390a.beginTransaction();
        try {
            this.f34391b.a(gVar);
            this.f34390a.setTransactionSuccessful();
        } finally {
            this.f34390a.endTransaction();
        }
    }

    @Override // k5.h
    public List<String> c() {
        w0 j11 = w0.j("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f34390a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34390a, j11, false, null);
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

    @Override // k5.h
    public void d(String str) {
        this.f34390a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34392c.acquire();
        if (str == null) {
            acquire.o1(1);
        } else {
            acquire.A0(1, str);
        }
        this.f34390a.beginTransaction();
        try {
            acquire.w();
            this.f34390a.setTransactionSuccessful();
        } finally {
            this.f34390a.endTransaction();
            this.f34392c.release(acquire);
        }
    }
}