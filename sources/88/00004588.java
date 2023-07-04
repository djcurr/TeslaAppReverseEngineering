package com.plaid.internal;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class t6 implements s6 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.room.t0 f19502a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.room.z0 f19503b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.room.z0 f19504c;

    /* loaded from: classes2.dex */
    public class a extends androidx.room.z0 {
        public a(t6 t6Var, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "REPLACE INTO workflow_local_key_values (pane_id, `key`, string) VALUES (?, ?, ?)";
        }
    }

    /* loaded from: classes2.dex */
    public class b extends androidx.room.z0 {
        public b(t6 t6Var, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "REPLACE INTO workflow_local_key_values (pane_id, `key`, byte_array) VALUES (?, ?, ?)";
        }
    }

    /* loaded from: classes2.dex */
    public class c extends androidx.room.z0 {
        public c(t6 t6Var, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE FROM workflow_local_key_values WHERE pane_id=?";
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Callable<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19505a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f19506b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f19507c;

        public d(String str, String str2, String str3) {
            this.f19505a = str;
            this.f19506b = str2;
            this.f19507c = str3;
        }

        @Override // java.util.concurrent.Callable
        public vz.b0 call() {
            v4.k acquire = t6.this.f19503b.acquire();
            String str = this.f19505a;
            if (str == null) {
                acquire.o1(1);
            } else {
                acquire.A0(1, str);
            }
            String str2 = this.f19506b;
            if (str2 == null) {
                acquire.o1(2);
            } else {
                acquire.A0(2, str2);
            }
            String str3 = this.f19507c;
            if (str3 == null) {
                acquire.o1(3);
            } else {
                acquire.A0(3, str3);
            }
            t6.this.f19502a.beginTransaction();
            try {
                acquire.s0();
                t6.this.f19502a.setTransactionSuccessful();
                return vz.b0.f54756a;
            } finally {
                t6.this.f19502a.endTransaction();
                t6.this.f19503b.release(acquire);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Callable<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19509a;

        public e(String str) {
            this.f19509a = str;
        }

        @Override // java.util.concurrent.Callable
        public vz.b0 call() {
            v4.k acquire = t6.this.f19504c.acquire();
            String str = this.f19509a;
            if (str == null) {
                acquire.o1(1);
            } else {
                acquire.A0(1, str);
            }
            t6.this.f19502a.beginTransaction();
            try {
                acquire.w();
                t6.this.f19502a.setTransactionSuccessful();
                return vz.b0.f54756a;
            } finally {
                t6.this.f19502a.endTransaction();
                t6.this.f19504c.release(acquire);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.room.w0 f19511a;

        public f(androidx.room.w0 w0Var) {
            this.f19511a = w0Var;
        }

        @Override // java.util.concurrent.Callable
        public String call() {
            String str = null;
            Cursor c11 = u4.c.c(t6.this.f19502a, this.f19511a, false, null);
            try {
                if (c11.moveToFirst() && !c11.isNull(0)) {
                    str = c11.getString(0);
                }
                return str;
            } finally {
                c11.close();
                this.f19511a.release();
            }
        }
    }

    public t6(androidx.room.t0 t0Var) {
        this.f19502a = t0Var;
        this.f19503b = new a(this, t0Var);
        new b(this, t0Var);
        this.f19504c = new c(this, t0Var);
    }

    @Override // com.plaid.internal.s6
    public Object a(String str, String str2, String str3, zz.d<? super vz.b0> dVar) {
        return androidx.room.n.b(this.f19502a, true, new d(str, str2, str3), dVar);
    }

    @Override // com.plaid.internal.s6
    public Object a(String str, zz.d<? super vz.b0> dVar) {
        return androidx.room.n.b(this.f19502a, true, new e(str), dVar);
    }

    @Override // com.plaid.internal.s6
    public Object a(String str, String str2, zz.d<? super String> dVar) {
        androidx.room.w0 j11 = androidx.room.w0.j("SELECT string FROM workflow_local_key_values WHERE pane_id=? AND `key`=?", 2);
        if (str == null) {
            j11.o1(1);
        } else {
            j11.A0(1, str);
        }
        if (str2 == null) {
            j11.o1(2);
        } else {
            j11.A0(2, str2);
        }
        return androidx.room.n.a(this.f19502a, false, u4.c.a(), new f(j11), dVar);
    }
}