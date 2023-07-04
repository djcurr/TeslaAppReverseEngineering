package com.facebook.imagepipeline.memory;

import md.k;
import qf.q;
import qf.u;
import qf.v;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final qd.h<byte[]> f11286a;

    /* renamed from: b  reason: collision with root package name */
    final b f11287b;

    /* loaded from: classes3.dex */
    class a implements qd.h<byte[]> {
        a() {
        }

        @Override // qd.h
        /* renamed from: b */
        public void a(byte[] bArr) {
            e.this.b(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends f {
        public b(pd.c cVar, u uVar, v vVar) {
            super(cVar, uVar, vVar);
        }

        @Override // com.facebook.imagepipeline.memory.BasePool
        com.facebook.imagepipeline.memory.b<byte[]> y(int i11) {
            return new i(q(i11), this.f11259c.f48143e, 0);
        }
    }

    public e(pd.c cVar, u uVar) {
        k.b(Boolean.valueOf(uVar.f48143e > 0));
        this.f11287b = new b(cVar, uVar, q.h());
        this.f11286a = new a();
    }

    public qd.a<byte[]> a(int i11) {
        return qd.a.u0(this.f11287b.get(i11), this.f11286a);
    }

    public void b(byte[] bArr) {
        this.f11287b.a(bArr);
    }
}