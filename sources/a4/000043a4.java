package com.plaid.internal;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e8 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18527a = new a();

    /* loaded from: classes2.dex */
    public static final class a {
        public final String a(String input) {
            String kVar;
            String kVar2;
            kotlin.jvm.internal.s.g(input, "input");
            com.google.gson.k c11 = com.google.gson.n.c(input);
            if (c11.h()) {
                com.google.gson.h b11 = c11.b();
                kotlin.jvm.internal.s.f(b11, "jsonBlob.asJsonArray");
                Iterator<com.google.gson.k> it2 = b11.iterator();
                while (it2.hasNext()) {
                    com.google.gson.k next = it2.next();
                    if (next.j()) {
                        com.google.gson.m account = next.c();
                        kotlin.jvm.internal.s.f(account, "account");
                        if (account.q("meta")) {
                            com.google.gson.k s11 = account.s("meta");
                            if (s11.j()) {
                                Set<String> r11 = s11.c().r();
                                kotlin.jvm.internal.s.f(r11, "childObject.asJsonObject.keySet()");
                                kVar2 = wz.e0.l0(r11, null, null, null, 0, null, null, 63, null);
                            } else {
                                kVar2 = s11.toString();
                                kotlin.jvm.internal.s.f(kVar2, "childObject.toString()");
                            }
                            account.n("meta", kVar2);
                        }
                        if (account.q("balance")) {
                            com.google.gson.k s12 = account.s("balance");
                            if (s12.j()) {
                                Set<String> r12 = s12.c().r();
                                kotlin.jvm.internal.s.f(r12, "childObject.asJsonObject.keySet()");
                                kVar = wz.e0.l0(r12, null, null, null, 0, null, null, 63, null);
                            } else {
                                kVar = s12.toString();
                                kotlin.jvm.internal.s.f(kVar, "childObject.toString()");
                            }
                            account.n("balance", kVar);
                        }
                    }
                }
            } else if (c11.j()) {
                com.google.gson.m c12 = c11.c();
                kotlin.jvm.internal.s.f(c12, "jsonBlob.asJsonObject");
                a(c12, "meta");
                a(c12, "balance");
            }
            String kVar3 = c11.toString();
            kotlin.jvm.internal.s.f(kVar3, "jsonBlob.toString()");
            return kVar3;
        }

        public final void a(com.google.gson.m mVar, String str) {
            String kVar;
            if (mVar.q(str)) {
                com.google.gson.k s11 = mVar.s(str);
                if (s11.j()) {
                    Set<String> r11 = s11.c().r();
                    kotlin.jvm.internal.s.f(r11, "childObject.asJsonObject.keySet()");
                    kVar = wz.e0.l0(r11, null, null, null, 0, null, null, 63, null);
                } else {
                    kVar = s11.toString();
                    kotlin.jvm.internal.s.f(kVar, "childObject.toString()");
                }
                mVar.n(str, kVar);
            }
        }
    }
}