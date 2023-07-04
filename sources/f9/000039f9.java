package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.d;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import ul.e;
import ul.h;
import ul.i;
import ul.q;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements i {
    public static /* synthetic */ c a(e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ c lambda$getComponents$0(e eVar) {
        return new c((Context) eVar.a(Context.class), (d) eVar.a(d.class), (tm.e) eVar.a(tm.e.class), ((com.google.firebase.abt.component.a) eVar.a(com.google.firebase.abt.component.a.class)).b("frc"), eVar.d(sl.a.class));
    }

    @Override // ul.i
    public List<ul.d<?>> getComponents() {
        return Arrays.asList(ul.d.c(c.class).b(q.j(Context.class)).b(q.j(d.class)).b(q.j(tm.e.class)).b(q.j(com.google.firebase.abt.component.a.class)).b(q.i(sl.a.class)).f(new h() { // from class: mn.j
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return RemoteConfigRegistrar.a(eVar);
            }
        }).e().d(), ln.h.b("fire-rc", "21.0.2"));
    }
}