package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import java.util.Arrays;
import java.util.List;
import ul.d;
import ul.e;
import ul.h;
import ul.i;
import ul.q;

@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements i {
    public static /* synthetic */ a a(e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ a lambda$getComponents$0(e eVar) {
        return new a((Context) eVar.a(Context.class), eVar.d(sl.a.class));
    }

    @Override // ul.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(a.class).b(q.j(Context.class)).b(q.i(sl.a.class)).f(new h() { // from class: rl.a
            @Override // ul.h
            public final Object a(e eVar) {
                return AbtRegistrar.a(eVar);
            }
        }).d(), ln.h.b("fire-abt", "21.0.1"));
    }
}