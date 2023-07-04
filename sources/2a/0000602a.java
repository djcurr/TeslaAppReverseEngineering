package com.tesla.data.oapi;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import kotlin.jvm.internal.s;
import lt.h2;
import lt.j2;
import lt.y2;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class d {
    public static final yt.b a(ot.b bVar) {
        Map f11;
        Map f12;
        s.g(bVar, "<this>");
        if (bVar.c() != null) {
            return yt.b.DOMAIN_INFOTAINMENT;
        }
        if (bVar.g() == null && bVar.d() == null && bVar.e() == null && bVar.j() == null) {
            if (bVar.h() != null) {
                return yt.b.DOMAIN_AUTHD;
            }
            if (bVar.i() != null) {
                ot.k i11 = bVar.i();
                s.e(i11);
                return i11.c();
            } else if (bVar.f() != null) {
                ot.i f13 = bVar.f();
                s.e(f13);
                ot.j c11 = f13.c();
                if ((c11 == null ? null : c11.c()) == null) {
                    if ((c11 == null ? null : c11.e()) == null) {
                        if ((c11 == null ? null : c11.d()) == null) {
                            if ((c11 == null ? null : c11.b()) == null) {
                                TeslaLog teslaLog = TeslaLog.INSTANCE;
                                ht.a aVar = ht.a.f29422a;
                                f12 = r0.f(v.a("CommandAction#domain", "No CommandAction set"));
                                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                for (Map.Entry entry : f12.entrySet()) {
                                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                                }
                                firebaseCrashlytics.recordException(new Exception("No CommandAction set"));
                                TeslaLog.setTag$default(teslaLog, "CommandAction#domain", false, 2, null);
                                n80.a.a("No CommandAction set", new Object[0]);
                                return yt.b.DOMAIN_INFOTAINMENT;
                            }
                        }
                    }
                }
                return yt.b.DOMAIN_VEHICLE_SECURITY;
            } else {
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                ht.a aVar2 = ht.a.f29422a;
                f11 = r0.f(v.a("CommandActions#domain", "No CommandAction set"));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception("No CommandAction set"));
                TeslaLog.setTag$default(teslaLog2, "CommandActions#domain", false, 2, null);
                n80.a.a("No CommandAction set", new Object[0]);
                return yt.b.DOMAIN_INFOTAINMENT;
            }
        }
        return yt.b.DOMAIN_VEHICLE_SECURITY;
    }

    public static final boolean b(ot.b bVar) {
        j2 c11;
        h2 h2Var = null;
        if (bVar != null && (c11 = bVar.c()) != null) {
            h2Var = c11.f0();
        }
        return h2Var != null;
    }

    public static final boolean c(ot.b bVar) {
        j2 c11;
        y2 y2Var = null;
        if (bVar != null && (c11 = bVar.c()) != null) {
            y2Var = c11.u0();
        }
        return y2Var != null;
    }
}