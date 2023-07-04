package com.google.firebase.perf;

import androidx.annotation.Keep;
import cn.c;
import com.google.firebase.d;
import com.google.firebase.perf.FirebasePerfRegistrar;
import dn.a;
import java.util.Arrays;
import java.util.List;
import nh.g;
import ul.e;
import ul.h;
import ul.i;
import ul.q;

@Keep
/* loaded from: classes2.dex */
public class FirebasePerfRegistrar implements i {
    public static /* synthetic */ c a(e eVar) {
        return providesFirebasePerformance(eVar);
    }

    public static c providesFirebasePerformance(e eVar) {
        return a.b().b(new en.a((d) eVar.a(d.class), (tm.e) eVar.a(tm.e.class), eVar.d(com.google.firebase.remoteconfig.c.class), eVar.d(g.class))).a().a();
    }

    @Override // ul.i
    @Keep
    public List<ul.d<?>> getComponents() {
        return Arrays.asList(ul.d.c(c.class).b(q.j(d.class)).b(q.k(com.google.firebase.remoteconfig.c.class)).b(q.j(tm.e.class)).b(q.k(g.class)).f(new h() { // from class: cn.b
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return FirebasePerfRegistrar.a(eVar);
            }
        }).d(), ln.h.b("fire-perf", "20.0.6"));
    }
}