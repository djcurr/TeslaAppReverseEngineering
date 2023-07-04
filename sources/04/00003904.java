package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import qm.j;
import ul.i;
import ul.q;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements i {
    public static /* synthetic */ tm.e a(ul.e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ tm.e lambda$getComponents$0(ul.e eVar) {
        return new c((com.google.firebase.d) eVar.a(com.google.firebase.d.class), eVar.d(j.class));
    }

    @Override // ul.i
    public List<ul.d<?>> getComponents() {
        return Arrays.asList(ul.d.c(tm.e.class).b(q.j(com.google.firebase.d.class)).b(q.i(j.class)).f(new ul.h() { // from class: tm.f
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return FirebaseInstallationsRegistrar.a(eVar);
            }
        }).d(), qm.i.a(), ln.h.b("fire-installations", "17.0.1"));
    }
}