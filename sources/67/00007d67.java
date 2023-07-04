package k5;

import androidx.room.t0;
import androidx.room.z0;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f34399a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.s<m> f34400b;

    /* renamed from: c  reason: collision with root package name */
    private final z0 f34401c;

    /* renamed from: d  reason: collision with root package name */
    private final z0 f34402d;

    /* loaded from: classes.dex */
    class a extends androidx.room.s<m> {
        a(o oVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.s
        /* renamed from: b */
        public void bind(v4.k kVar, m mVar) {
            String str = mVar.f34397a;
            if (str == null) {
                kVar.o1(1);
            } else {
                kVar.A0(1, str);
            }
            byte[] m11 = androidx.work.e.m(mVar.f34398b);
            if (m11 == null) {
                kVar.o1(2);
            } else {
                kVar.V0(2, m11);
            }
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* loaded from: classes.dex */
    class b extends z0 {
        b(o oVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    class c extends z0 {
        c(o oVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(t0 t0Var) {
        this.f34399a = t0Var;
        this.f34400b = new a(this, t0Var);
        this.f34401c = new b(this, t0Var);
        this.f34402d = new c(this, t0Var);
    }

    @Override // k5.n
    public void a(String str) {
        this.f34399a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34401c.acquire();
        if (str == null) {
            acquire.o1(1);
        } else {
            acquire.A0(1, str);
        }
        this.f34399a.beginTransaction();
        try {
            acquire.w();
            this.f34399a.setTransactionSuccessful();
        } finally {
            this.f34399a.endTransaction();
            this.f34401c.release(acquire);
        }
    }

    @Override // k5.n
    public void b() {
        this.f34399a.assertNotSuspendingTransaction();
        v4.k acquire = this.f34402d.acquire();
        this.f34399a.beginTransaction();
        try {
            acquire.w();
            this.f34399a.setTransactionSuccessful();
        } finally {
            this.f34399a.endTransaction();
            this.f34402d.release(acquire);
        }
    }

    @Override // k5.n
    public void c(m mVar) {
        this.f34399a.assertNotSuspendingTransaction();
        this.f34399a.beginTransaction();
        try {
            this.f34400b.a(mVar);
            this.f34399a.setTransactionSuccessful();
        } finally {
            this.f34399a.endTransaction();
        }
    }
}