package com.plaid.internal;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class kd implements jd {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.room.t0 f18939a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.room.r<ld> f18940b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.room.z0 f18941c;

    /* loaded from: classes2.dex */
    public class a implements Callable<List<ld>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.room.w0 f18942a;

        public a(androidx.room.w0 w0Var) {
            this.f18942a = w0Var;
        }

        @Override // java.util.concurrent.Callable
        public List<ld> call() {
            Cursor c11 = u4.c.c(kd.this.f18939a, this.f18942a, false, null);
            try {
                int e11 = u4.b.e(c11, "workflow_id");
                int e12 = u4.b.e(c11, "id");
                int e13 = u4.b.e(c11, "analytics_model");
                ArrayList arrayList = new ArrayList(c11.getCount());
                while (c11.moveToNext()) {
                    arrayList.add(new ld(c11.isNull(e11) ? null : c11.getString(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getBlob(e13)));
                }
                return arrayList;
            } finally {
                c11.close();
                this.f18942a.release();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends androidx.room.r<ld> {
        public b(kd kdVar, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.r
        public void bind(v4.k kVar, ld ldVar) {
            ld ldVar2 = ldVar;
            String str = ldVar2.f18984a;
            if (str == null) {
                kVar.o1(1);
            } else {
                kVar.A0(1, str);
            }
            String str2 = ldVar2.f18985b;
            if (str2 == null) {
                kVar.o1(2);
            } else {
                kVar.A0(2, str2);
            }
        }

        @Override // androidx.room.r, androidx.room.z0
        public String createQuery() {
            return "DELETE FROM `workflow_analytics` WHERE `workflow_id` = ? AND `id` = ?";
        }
    }

    /* loaded from: classes2.dex */
    public class c extends androidx.room.z0 {
        public c(kd kdVar, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "REPLACE INTO workflow_analytics (workflow_id, id, analytics_model) VALUES (?, ?, ?)";
        }
    }

    /* loaded from: classes2.dex */
    public class d extends androidx.room.z0 {
        public d(kd kdVar, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE FROM workflow_analytics WHERE workflow_id=?";
        }
    }

    /* loaded from: classes2.dex */
    public class e extends androidx.room.z0 {
        public e(kd kdVar, androidx.room.t0 t0Var) {
            super(t0Var);
        }

        @Override // androidx.room.z0
        public String createQuery() {
            return "DELETE FROM workflow_analytics";
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Callable<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Collection f18944a;

        public f(Collection collection) {
            this.f18944a = collection;
        }

        @Override // java.util.concurrent.Callable
        public vz.b0 call() {
            kd.this.f18939a.beginTransaction();
            try {
                kd.this.f18940b.handleMultiple(this.f18944a);
                kd.this.f18939a.setTransactionSuccessful();
                return vz.b0.f54756a;
            } finally {
                kd.this.f18939a.endTransaction();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Callable<vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18946a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f18947b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ byte[] f18948c;

        public g(String str, String str2, byte[] bArr) {
            this.f18946a = str;
            this.f18947b = str2;
            this.f18948c = bArr;
        }

        @Override // java.util.concurrent.Callable
        public vz.b0 call() {
            v4.k acquire = kd.this.f18941c.acquire();
            String str = this.f18946a;
            if (str == null) {
                acquire.o1(1);
            } else {
                acquire.A0(1, str);
            }
            String str2 = this.f18947b;
            if (str2 == null) {
                acquire.o1(2);
            } else {
                acquire.A0(2, str2);
            }
            byte[] bArr = this.f18948c;
            if (bArr == null) {
                acquire.o1(3);
            } else {
                acquire.V0(3, bArr);
            }
            kd.this.f18939a.beginTransaction();
            try {
                acquire.s0();
                kd.this.f18939a.setTransactionSuccessful();
                return vz.b0.f54756a;
            } finally {
                kd.this.f18939a.endTransaction();
                kd.this.f18941c.release(acquire);
            }
        }
    }

    public kd(androidx.room.t0 t0Var) {
        this.f18939a = t0Var;
        this.f18940b = new b(this, t0Var);
        this.f18941c = new c(this, t0Var);
        new d(this, t0Var);
        new e(this, t0Var);
    }

    @Override // com.plaid.internal.jd
    public Object a(Collection<ld> collection, zz.d<? super vz.b0> dVar) {
        return androidx.room.n.b(this.f18939a, true, new f(collection), dVar);
    }

    @Override // com.plaid.internal.jd
    public Object a(String str, String str2, byte[] bArr, zz.d<? super vz.b0> dVar) {
        return androidx.room.n.b(this.f18939a, true, new g(str, str2, bArr), dVar);
    }

    @Override // com.plaid.internal.jd
    public Object a(zz.d<? super List<ld>> dVar) {
        androidx.room.w0 j11 = androidx.room.w0.j("SELECT * FROM workflow_analytics", 0);
        return androidx.room.n.a(this.f18939a, false, u4.c.a(), new a(j11), dVar);
    }
}