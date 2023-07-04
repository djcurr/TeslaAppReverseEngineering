package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.e;
import zj.n;

/* loaded from: classes3.dex */
public final class d implements a.InterfaceC0258a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14663a;

    /* renamed from: b  reason: collision with root package name */
    private final n f14664b;

    /* renamed from: c  reason: collision with root package name */
    private final a.InterfaceC0258a f14665c;

    public d(Context context) {
        this(context, (String) null, (n) null);
    }

    @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0258a
    /* renamed from: b */
    public c a() {
        c cVar = new c(this.f14663a, this.f14665c.a());
        n nVar = this.f14664b;
        if (nVar != null) {
            cVar.b(nVar);
        }
        return cVar;
    }

    public d(Context context, String str, n nVar) {
        this(context, nVar, new e.b().c(str));
    }

    public d(Context context, n nVar, a.InterfaceC0258a interfaceC0258a) {
        this.f14663a = context.getApplicationContext();
        this.f14664b = nVar;
        this.f14665c = interfaceC0258a;
    }
}