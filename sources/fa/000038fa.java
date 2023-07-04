package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import nh.g;
import ph.t;
import ul.d;
import ul.e;
import ul.h;
import ul.i;
import ul.q;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements i {
    public static /* synthetic */ g a(e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        t.f((Context) eVar.a(Context.class));
        return t.c().h(a.f12991h);
    }

    @Override // ul.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(g.class).b(q.j(Context.class)).f(new h() { // from class: jm.a
            @Override // ul.h
            public final Object a(e eVar) {
                return TransportRegistrar.a(eVar);
            }
        }).d(), ln.h.b("fire-transport", "18.1.1"));
    }
}