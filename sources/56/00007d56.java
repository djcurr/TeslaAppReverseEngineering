package k5;

import android.database.Cursor;
import androidx.room.t0;
import androidx.room.w0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f34382a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.s<k5.a> f34383b;

    /* loaded from: classes.dex */
    class a extends androidx.room.s<k5.a> {
        a(c cVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.s
        /* renamed from: b */
        public void bind(v4.k kVar, k5.a aVar) {
            String str = aVar.f34380a;
            if (str == null) {
                kVar.o1(1);
            } else {
                kVar.A0(1, str);
            }
            String str2 = aVar.f34381b;
            if (str2 == null) {
                kVar.o1(2);
            } else {
                kVar.A0(2, str2);
            }
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public c(t0 t0Var) {
        this.f34382a = t0Var;
        this.f34383b = new a(this, t0Var);
    }

    @Override // k5.b
    public List<String> a(String str) {
        w0 j11 = w0.j("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34382a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34382a, j11, false, null);
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

    @Override // k5.b
    public boolean b(String str) {
        w0 j11 = w0.j("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34382a.assertNotSuspendingTransaction();
        boolean z11 = false;
        Cursor c11 = u4.c.c(this.f34382a, j11, false, null);
        try {
            if (c11.moveToFirst()) {
                z11 = c11.getInt(0) != 0;
            }
            return z11;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.b
    public boolean c(String str) {
        w0 j11 = w0.j("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34382a.assertNotSuspendingTransaction();
        boolean z11 = false;
        Cursor c11 = u4.c.c(this.f34382a, j11, false, null);
        try {
            if (c11.moveToFirst()) {
                z11 = c11.getInt(0) != 0;
            }
            return z11;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.b
    public void d(k5.a aVar) {
        this.f34382a.assertNotSuspendingTransaction();
        this.f34382a.beginTransaction();
        try {
            this.f34383b.a(aVar);
            this.f34382a.setTransactionSuccessful();
        } finally {
            this.f34382a.endTransaction();
        }
    }
}