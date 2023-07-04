package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ul.i {
    public static /* synthetic */ FirebaseMessaging a(ul.e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ul.e eVar) {
        return new FirebaseMessaging((com.google.firebase.d) eVar.a(com.google.firebase.d.class), (rm.a) eVar.a(rm.a.class), eVar.d(ln.i.class), eVar.d(qm.k.class), (tm.e) eVar.a(tm.e.class), (nh.g) eVar.a(nh.g.class), (pm.d) eVar.a(pm.d.class));
    }

    @Override // ul.i
    @Keep
    public List<ul.d<?>> getComponents() {
        return Arrays.asList(ul.d.c(FirebaseMessaging.class).b(ul.q.j(com.google.firebase.d.class)).b(ul.q.h(rm.a.class)).b(ul.q.i(ln.i.class)).b(ul.q.i(qm.k.class)).b(ul.q.h(nh.g.class)).b(ul.q.j(tm.e.class)).b(ul.q.j(pm.d.class)).f(new ul.h() { // from class: com.google.firebase.messaging.b0
            @Override // ul.h
            public final Object a(ul.e eVar) {
                return FirebaseMessagingRegistrar.a(eVar);
            }
        }).c().d(), ln.h.b("fire-fcm", "23.0.2"));
    }
}