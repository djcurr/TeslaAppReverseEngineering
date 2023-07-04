package k5;

import android.database.Cursor;
import androidx.room.t0;
import androidx.room.w0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f34442a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.s<s> f34443b;

    /* loaded from: classes.dex */
    class a extends androidx.room.s<s> {
        a(u uVar, t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.s
        /* renamed from: b */
        public void bind(v4.k kVar, s sVar) {
            String str = sVar.f34440a;
            if (str == null) {
                kVar.o1(1);
            } else {
                kVar.A0(1, str);
            }
            String str2 = sVar.f34441b;
            if (str2 == null) {
                kVar.o1(2);
            } else {
                kVar.A0(2, str2);
            }
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public u(t0 t0Var) {
        this.f34442a = t0Var;
        this.f34443b = new a(this, t0Var);
    }

    @Override // k5.t
    public List<String> a(String str) {
        w0 j11 = w0.j("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        this.f34442a.assertNotSuspendingTransaction();
        Cursor c11 = u4.c.c(this.f34442a, j11, false, null);
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

    @Override // k5.t
    public void b(s sVar) {
        this.f34442a.assertNotSuspendingTransaction();
        this.f34442a.beginTransaction();
        try {
            this.f34443b.a(sVar);
            this.f34442a.setTransactionSuccessful();
        } finally {
            this.f34442a.endTransaction();
        }
    }
}