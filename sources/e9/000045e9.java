package com.plaid.internal;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class w7 implements v7 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.room.t0 f19666a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.room.z0 f19667b;

    /* loaded from: classes2.dex */
    public class a extends androidx.room.z0 {
        public a(w7 w7Var, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "REPLACE INTO workflow_pane (workflow_id, id, model) VALUES (?, ?, ?)";
        }
    }

    /* loaded from: classes2.dex */
    public class b extends androidx.room.z0 {
        public b(w7 w7Var, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE FROM workflow_pane";
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19668a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f19669b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ byte[] f19670c;

        public c(String str, String str2, byte[] bArr) {
            this.f19668a = str;
            this.f19669b = str2;
            this.f19670c = bArr;
        }

        @Override // java.util.concurrent.Callable
        public vz.b0 call() {
            v4.k acquire = w7.this.f19667b.acquire();
            String str = this.f19668a;
            if (str == null) {
                acquire.o1(1);
            } else {
                acquire.A0(1, str);
            }
            String str2 = this.f19669b;
            if (str2 == null) {
                acquire.o1(2);
            } else {
                acquire.A0(2, str2);
            }
            byte[] bArr = this.f19670c;
            if (bArr == null) {
                acquire.o1(3);
            } else {
                acquire.V0(3, bArr);
            }
            w7.this.f19666a.beginTransaction();
            try {
                acquire.s0();
                w7.this.f19666a.setTransactionSuccessful();
                return vz.b0.f54756a;
            } finally {
                w7.this.f19666a.endTransaction();
                w7.this.f19667b.release(acquire);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Callable<x7> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.room.w0 f19672a;

        public d(androidx.room.w0 w0Var) {
            this.f19672a = w0Var;
        }

        @Override // java.util.concurrent.Callable
        public x7 call() {
            x7 x7Var = null;
            byte[] blob = null;
            Cursor c11 = u4.c.c(w7.this.f19666a, this.f19672a, false, null);
            try {
                int e11 = u4.b.e(c11, "workflow_id");
                int e12 = u4.b.e(c11, "id");
                int e13 = u4.b.e(c11, "model");
                if (c11.moveToFirst()) {
                    String string = c11.isNull(e11) ? null : c11.getString(e11);
                    String string2 = c11.isNull(e12) ? null : c11.getString(e12);
                    if (!c11.isNull(e13)) {
                        blob = c11.getBlob(e13);
                    }
                    x7Var = new x7(string, string2, blob);
                }
                return x7Var;
            } finally {
                c11.close();
                this.f19672a.release();
            }
        }
    }

    public w7(androidx.room.t0 t0Var) {
        this.f19666a = t0Var;
        this.f19667b = new a(this, t0Var);
        new b(this, t0Var);
    }

    @Override // com.plaid.internal.v7
    public Object a(String str, String str2, byte[] bArr, zz.d<? super vz.b0> dVar) {
        return androidx.room.n.b(this.f19666a, true, new c(str, str2, bArr), dVar);
    }

    @Override // com.plaid.internal.v7
    public Object a(String str, String str2, zz.d<? super x7> dVar) {
        androidx.room.w0 j11 = androidx.room.w0.j("SELECT * FROM workflow_pane WHERE workflow_id=? AND id=?", 2);
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
        return androidx.room.n.a(this.f19666a, false, u4.c.a(), new d(j11), dVar);
    }
}