package com.google.mlkit.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzao;
import com.google.mlkit.common.sdkinternal.a;
import com.google.mlkit.common.sdkinternal.j;
import com.google.mlkit.common.sdkinternal.n;
import eo.c;
import fo.b;
import java.util.List;
import ul.d;
import ul.h;
import ul.i;
import ul.q;

@KeepForSdk
/* loaded from: classes2.dex */
public class CommonComponentRegistrar implements i {
    @Override // ul.i
    public final List getComponents() {
        return zzao.zzk(n.f17267b, d.c(b.class).b(q.j(com.google.mlkit.common.sdkinternal.i.class)).f(new h() { // from class: co.a
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new fo.b((com.google.mlkit.common.sdkinternal.i) eVar.a(com.google.mlkit.common.sdkinternal.i.class));
            }
        }).d(), d.c(j.class).f(new h() { // from class: co.b
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new j();
            }
        }).d(), d.c(c.class).b(q.l(c.a.class)).f(new h() { // from class: co.c
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new eo.c(eVar.c(c.a.class));
            }
        }).d(), d.c(com.google.mlkit.common.sdkinternal.d.class).b(q.k(j.class)).f(new h() { // from class: co.d
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new com.google.mlkit.common.sdkinternal.d(eVar.d(j.class));
            }
        }).d(), d.c(a.class).f(new h() { // from class: co.e
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return com.google.mlkit.common.sdkinternal.a.a();
            }
        }).d(), d.c(com.google.mlkit.common.sdkinternal.b.class).b(q.j(a.class)).f(new h() { // from class: co.f
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new com.google.mlkit.common.sdkinternal.b((com.google.mlkit.common.sdkinternal.a) eVar.a(com.google.mlkit.common.sdkinternal.a.class));
            }
        }).d(), d.c(p000do.a.class).b(q.j(com.google.mlkit.common.sdkinternal.i.class)).f(new h() { // from class: co.g
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new p000do.a((com.google.mlkit.common.sdkinternal.i) eVar.a(com.google.mlkit.common.sdkinternal.i.class));
            }
        }).d(), d.j(c.a.class).b(q.k(p000do.a.class)).f(new h() { // from class: co.h
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return new c.a(eo.a.class, eVar.d(p000do.a.class));
            }
        }).d());
    }
}