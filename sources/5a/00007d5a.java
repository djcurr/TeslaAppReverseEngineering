package k5;

import android.database.Cursor;
import androidx.room.t0;
import androidx.room.w0;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f34386a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.s<d> f34387b;

    /* loaded from: classes.dex */
    class a extends androidx.room.s<d> {
        a(f fVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.s
        /* renamed from: b */
        public void bind(v4.k kVar, d dVar) {
            String str = dVar.f34384a;
            if (str == null) {
                kVar.o1(1);
            } else {
                kVar.A0(1, str);
            }
            Long l11 = dVar.f34385b;
            if (l11 == null) {
                kVar.o1(2);
            } else {
                kVar.U0(2, l11.longValue());
            }
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public f(t0 t0Var) {
        this.f34386a = t0Var;
        this.f34387b = new a(this, t0Var);
    }

    @Override // k5.e
    public Long a(String str) {
        w0 j11 = w0.j("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34386a.assertNotSuspendingTransaction();
        Long l11 = null;
        Cursor c11 = u4.c.c(this.f34386a, j11, false, null);
        try {
            if (c11.moveToFirst() && !c11.isNull(0)) {
                l11 = Long.valueOf(c11.getLong(0));
            }
            return l11;
        } finally {
            c11.close();
            j11.release();
        }
    }

    @Override // k5.e
    public void b(d dVar) {
        this.f34386a.assertNotSuspendingTransaction();
        this.f34386a.beginTransaction();
        try {
            this.f34387b.a(dVar);
            this.f34386a.setTransactionSuccessful();
        } finally {
            this.f34386a.endTransaction();
        }
    }
}