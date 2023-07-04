package com.tesla.data.oapi;

import bu.b1;
import bu.b4;
import bu.c1;
import bu.d0;
import bu.g2;
import com.tesla.logging.TeslaLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import lt.e1;
import lt.j2;
import lt.l0;
import lt.m;
import lt.n0;
import n00.o;
import wz.u;
import wz.x0;
import zu.b0;
import zu.e0;

/* loaded from: classes6.dex */
public final class c {

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21726a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21727b;

        static {
            int[] iArr = new int[g2.values().length];
            iArr[g2.RKE_ACTION_UNLOCK.ordinal()] = 1;
            iArr[g2.RKE_ACTION_LOCK.ordinal()] = 2;
            iArr[g2.RKE_ACTION_OPEN_TRUNK.ordinal()] = 3;
            iArr[g2.RKE_ACTION_OPEN_FRUNK.ordinal()] = 4;
            iArr[g2.RKE_ACTION_OPEN_CHARGE_PORT.ordinal()] = 5;
            iArr[g2.RKE_ACTION_CLOSE_CHARGE_PORT.ordinal()] = 6;
            iArr[g2.RKE_ACTION_AUTO_SECURE_VEHICLE.ordinal()] = 7;
            iArr[g2.RKE_ACTION_WAKE_VEHICLE.ordinal()] = 8;
            iArr[g2.RKE_ACTION_REMOTE_DRIVE.ordinal()] = 9;
            f21726a = iArr;
            int[] iArr2 = new int[yt.b.values().length];
            iArr2[yt.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            iArr2[yt.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            f21727b = iArr2;
        }
    }

    public static final String a(ot.b bVar) {
        s.g(bVar, "<this>");
        String g11 = g(bVar);
        Objects.requireNonNull(g11, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = g11.toLowerCase(Locale.ROOT);
        s.f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final Integer b(ot.b bVar) {
        s.g(bVar, "<this>");
        if (bVar.f() != null) {
            ot.i f11 = bVar.f();
            s.e(f11);
            return Integer.valueOf(f11.d());
        }
        return null;
    }

    public static final String c(b1 b1Var) {
        s.g(b1Var, "<this>");
        String name = b1Var.c().name();
        return name + "_INFORMATION_REQUEST";
    }

    public static final String d(g2 g2Var) {
        String P0;
        s.g(g2Var, "<this>");
        switch (a.f21726a[g2Var.ordinal()]) {
            case 1:
                return "UNLOCK";
            case 2:
                return "LOCK";
            case 3:
            case 4:
                return "ACTUATE_TRUNK";
            case 5:
                return "CHARGE_PORT_OPEN";
            case 6:
                return "CHARGE_PORT_DOOR_CLOSE";
            case 7:
                return "CLOSE_DOORS_AND_LOCK";
            case 8:
                return "WAKE";
            case 9:
                return "REMOTE_START";
            default:
                P0 = w.P0(g2Var.name(), "RKE_ACTION_", null, 2, null);
                return P0;
        }
    }

    public static final String e(j2 j2Var) {
        s.g(j2Var, "<this>");
        if (j2Var.T() != null) {
            return "REMOTE_START";
        }
        if (j2Var.k() != null) {
            return "CREATE_STREAM_SESSION";
        }
        if (j2Var.c0() != null) {
            return "SEND_STREAM_MESSAGE";
        }
        if (j2Var.i() != null) {
            return "CHANGE_CHARGE_LIMIT";
        }
        if (j2Var.m() != null) {
            return "SPEED_LIMIT_CLEAR_PIN";
        }
        if (j2Var.n() != null) {
            return "SPEED_LIMIT_SET_LIMIT";
        }
        if (j2Var.D() != null) {
            return "SET_DEFROST";
        }
        if (j2Var.E() != null) {
            return "REMOTE_STEERING_WHEEL_HEATER_REQUEST";
        }
        if (j2Var.d() != null) {
            return "REMOTE_AUTO_STEERING_WHEEL_HEAT_CLIMATE_REQUEST";
        }
        if (j2Var.d0() != null) {
            return "REMOTE_STEERING_WHEEL_HEAT_LEVEL_REQUEST";
        }
        if (j2Var.F() != null) {
            return "CHANGE_CLIMATE_TEMPERATURE_SETTING";
        }
        if (j2Var.I() != null) {
            return "MEDIA_TOGGLE_PLAYBACK";
        }
        if (j2Var.H() != null) {
            return "MEDIA_NEXT_TRACK";
        }
        if (j2Var.K() != null) {
            return "MEDIA_PREVIOUS_TRACK";
        }
        if (j2Var.N() != null) {
            return "NAVIGATION_REQUEST";
        }
        if (j2Var.M() != null) {
            return "NAVIGATION_GPS_REQUEST";
        }
        if (j2Var.P() != null) {
            return "NAVIGATION_SC_REQUEST";
        }
        if (j2Var.v0() != null) {
            return "VIDEO_REQUEST";
        }
        if (j2Var.f0() != null) {
            return "CALENDAR_SYNC";
        }
        if (j2Var.h0() != null) {
            return "CANCEL_SOFTWARE_UPDATE";
        }
        if (j2Var.i0() != null) {
            return "FLASH_LIGHTS";
        }
        if (j2Var.j0() != null) {
            return "HONK_HORN";
        }
        if (j2Var.f() != null) {
            return "REMOTE_BOOMBOX";
        }
        if (j2Var.l0() != null) {
            return "RESET_VALET_PIN";
        }
        if (j2Var.m0() != null) {
            return "SCHEDULE_SOFTWARE_UPDATE";
        }
        if (j2Var.o0() != null) {
            return "SET_SENTRY_MODE";
        }
        if (j2Var.p0() != null) {
            return "SET_VALET_MODE";
        }
        if (j2Var.q0() != null) {
            return "CHANGE_SUNROOF_STATE";
        }
        if (j2Var.r0() != null) {
            return "TRIGGER_HOMELINK";
        }
        if (j2Var.s0() != null) {
            return "WINDOW_CONTROL";
        }
        if (j2Var.y() != null) {
            return "HVAC_BIOWEAPON_MODE";
        }
        if (j2Var.C() != null) {
            return "REMOTE_SEAT_HEATER_REQUEST";
        }
        if (j2Var.u0() != null) {
            return "VEHICLE_DATA_SUBSCRIPTION";
        }
        if (j2Var.t0() != null) {
            return "VEHICLE_DATA_ACK";
        }
        if (j2Var.V() != null) {
            return "SET_SCHEDULED_CHARGING";
        }
        if (j2Var.W() != null) {
            return "SET_SCHEDULED_DEPARTURE";
        }
        if (j2Var.Y() != null) {
            return "SET_CHARGING_AMPS";
        }
        if (j2Var.z() != null) {
            return "SET_CLIMATE_KEEPER_MODE";
        }
        if (j2Var.c() != null) {
            return "REMOTE_AUTO_SEAT_CLIMATE_REQUEST";
        }
        if (j2Var.B() != null) {
            return "REMOTE_SEAT_COOLING_REQUEST";
        }
        if (j2Var.X() != null) {
            return "SET_CABIN_OVERHEAT_PROTECTION";
        }
        if (j2Var.S() != null) {
            return "SYNC_PSEUDONYM";
        }
        if (j2Var.e0() != null) {
            return "TAKE_DRIVENOTE";
        }
        if (j2Var.o() != null) {
            lt.s o11 = j2Var.o();
            s.e(o11);
            return o11.c() ? "SPEED_LIMIT_ACTIVATE" : "SPEED_LIMIT_DEACTIVATE";
        } else if (j2Var.x() != null) {
            n0 x11 = j2Var.x();
            s.e(x11);
            return x11.d() ? "CLIMATE_ON" : "CLIMATE_OFF";
        } else if (j2Var.L() != null) {
            e1 L = j2Var.L();
            s.e(L);
            if (L.d() == null) {
                return "ADJUST_VOLUME";
            }
            e1 L2 = j2Var.L();
            s.e(L2);
            Integer d11 = L2.d();
            return (d11 == null ? 0 : d11.intValue()) > 0 ? "MEDIA_VOLUME_UP" : "MEDIA_VOLUME_DOWN";
        } else if (j2Var.j() != null) {
            m j11 = j2Var.j();
            s.e(j11);
            return j11.b() != null ? "START_CHARGE" : "STOP_CHARGE";
        } else if (j2Var.v() != null) {
            StringBuilder sb2 = new StringBuilder();
            l0 v11 = j2Var.v();
            if ((v11 == null ? null : v11.h()) != null) {
                sb2.append("GET_VEHICLE_CONFIG ");
            }
            l0 v12 = j2Var.v();
            if ((v12 == null ? null : v12.c()) != null) {
                sb2.append("GET_CLIMATE_STATE ");
            }
            l0 v13 = j2Var.v();
            if ((v13 == null ? null : v13.e()) != null) {
                sb2.append("GET_DRIVE_STATE ");
            }
            l0 v14 = j2Var.v();
            if ((v14 == null ? null : v14.f()) != null) {
                sb2.append("GET_GUI_SETTINGS ");
            }
            l0 v15 = j2Var.v();
            if ((v15 == null ? null : v15.b()) != null) {
                sb2.append("GET_CHARGE_STATE ");
            }
            l0 v16 = j2Var.v();
            if ((v16 == null ? null : v16.g()) != null) {
                sb2.append("GET_LOCATION_STATE ");
            }
            l0 v17 = j2Var.v();
            if ((v17 == null ? null : v17.d()) != null) {
                sb2.append("GET_CLOSURES_STATE ");
            }
            l0 v18 = j2Var.v();
            if ((v18 != null ? v18.i() : null) != null) {
                sb2.append("GET_VEHICLE_STATE");
            }
            return "GET_VEHICLE_DATA:" + ((Object) sb2);
        } else if (j2Var.Q() != null) {
            return "PII_KEY_REQUEST";
        } else {
            if (j2Var.e() != null) {
                return "BLUETOOTH_CLASSIC_PAIRING_REQUEST";
            }
            if (j2Var.r() != null) {
                return "GET_CHARGE_ON_SOLAR_FEATURE_REQUEST";
            }
            if (j2Var.d() != null) {
                return "AUTO_STW_HEAT_ACTION";
            }
            if (j2Var.d0() != null) {
                return "STW_HEAT_LEVEL_ACTION";
            }
            if (j2Var.q() != null) {
                return "ERASE_USER_DATA_ACTION";
            }
            if (j2Var.s() != null) {
                return "GET_MANAGED_CHARGING_SITES_REQUEST";
            }
            if (j2Var.g0() != null) {
                return "UPDATE_CHARGE_ON_SOLAR_FEATURE_REQUEST";
            }
            if (j2Var.n0() != null) {
                return "VEHICLE_CONTROLLER_SET_PIN_TO_DRIVE_REQUEST";
            }
            if (j2Var.k0() != null) {
                return "VEHICLE_CONTROLLER_RESET_PIN_TO_DRIVE_REQUEST";
            }
            if (j2Var.x0() != null) {
                return "VITALS_SUBSCRIPTION";
            }
            if (j2Var.w0() != null) {
                return "VITALS_ACK";
            }
            o oVar = (o) u20.k.A(b0.a(j2Var));
            if (oVar == null) {
                String str = "COMMAND_CENTER_NAME_NOT_SET: Possibly `" + ((o) u20.k.A(b0.b(j2Var))) + "` is a new command and isn't setup!";
                TeslaLog.INSTANCE.e("CommandActionsExtensions", str, new Throwable(str));
                return "COMMAND_CENTER_NAME_NOT_SET";
            }
            return f(oVar);
        }
    }

    private static final String f(o<? extends Object, ?> oVar) {
        String name = oVar.getName();
        String a11 = e0.a(name);
        String str = "COMMAND_CENTER_NAME_NOT_SET: Add `" + name + "` -> `" + a11 + "`";
        TeslaLog.INSTANCE.e("CommandActionsExtensions", str, new Throwable(str));
        return a11;
    }

    public static final String g(ot.b bVar) {
        s.g(bVar, "<this>");
        j2 c11 = bVar.c();
        if (c11 == null) {
            g2 g11 = bVar.g();
            if (g11 == null) {
                d0 d11 = bVar.d();
                if (d11 == null) {
                    ot.k i11 = bVar.i();
                    if (i11 == null) {
                        b1 e11 = bVar.e();
                        if (e11 == null) {
                            if (bVar.j() == null) {
                                ot.l h11 = bVar.h();
                                if (h11 == null) {
                                    ot.i f11 = bVar.f();
                                    if (f11 == null) {
                                        return "MISSING_PAYLOAD";
                                    }
                                    String h12 = h(f11);
                                    return h12 + "_PROXY_COMMAND";
                                }
                                String j11 = j(h11);
                                return j11 + "_WHITELIST_OPERATION";
                            }
                            return "WHITELIST_OPERATION";
                        }
                        return c(e11);
                    }
                    return i(i11);
                }
                return n(d11);
            }
            return d(g11);
        }
        return e(c11);
    }

    public static final String h(ot.i iVar) {
        s.g(iVar, "<this>");
        ot.j c11 = iVar.c();
        if ((c11 == null ? null : c11.b()) != null) {
            return "ADD_KEY";
        }
        ot.j c12 = iVar.c();
        if ((c12 == null ? null : c12.c()) != null) {
            return "LOCK";
        }
        ot.j c13 = iVar.c();
        if ((c13 == null ? null : c13.e()) != null) {
            return "UNLOCK";
        }
        ot.j c14 = iVar.c();
        if ((c14 != null ? c14.d() : null) != null) {
            return "REMOTE_START";
        }
        o oVar = (o) u20.k.A(b0.a(iVar));
        return oVar == null ? "MISSING_PAYLOAD" : f(oVar);
    }

    public static final String i(ot.k kVar) {
        String P0;
        s.g(kVar, "<this>");
        int i11 = a.f21727b[kVar.c().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                P0 = w.P0(kVar.c().name(), "DOMAIN_", null, 2, null);
                return P0;
            }
            return "GET_CARAPI_SESSION_DATA";
        }
        return "GET_SESSION_DATA";
    }

    public static final String j(ot.l lVar) {
        s.g(lVar, "<this>");
        if (lVar.d() == null) {
            return "NO_SUBMESSAGE";
        }
        b4 d11 = lVar.d();
        s.e(d11);
        if (d11.h() == null) {
            if (d11.g() == null) {
                if (d11.k() == null) {
                    if (d11.f() == null) {
                        if (d11.j() == null) {
                            if (d11.e() == null) {
                                if (d11.m() == null) {
                                    if (d11.c() == null) {
                                        if (d11.d() == null) {
                                            Boolean i11 = d11.i();
                                            if (i11 == null) {
                                                o oVar = (o) u20.k.A(b0.a(lVar));
                                                return oVar == null ? "NO_SUBMESSAGE" : f(oVar);
                                            }
                                            i11.booleanValue();
                                            return "REMOVE_ALL_IMPERMANENT_KEYS";
                                        }
                                        return "ADD_IMPERMANENT_KEY_AND_REMOVE_EXISTING";
                                    }
                                    return "ADD_IMPERMANENT_KEY";
                                }
                                return "UPDATE_KEY_AND_PERMISSIONS";
                            }
                            return "ADD_KEY_TO_WHITELIST_AND_ADD_PERMISSIONS";
                        }
                        return "REMOVE_PERMISSIONS_FROM_PUBLIC_KEY";
                    }
                    return "ADD_PERMISSIONS_TO_PUBLIC_KEY";
                }
                return "REMOVE_PUBLIC_KEY_FROM_WHITELIST";
            }
            return "ADD_PUBLIC_KEY_TO_WHITELIST";
        }
        return "METADATA_FOR_KEY";
    }

    public static final String k(ot.b bVar) {
        String str;
        s.g(bVar, "<this>");
        if (bVar.f() != null) {
            ot.i f11 = bVar.f();
            ot.j c11 = f11 == null ? null : f11.c();
            if ((c11 == null ? null : c11.c()) != null) {
                str = "lock";
            } else {
                if ((c11 == null ? null : c11.e()) != null) {
                    str = "unlock";
                } else {
                    if ((c11 == null ? null : c11.d()) == null) {
                        return null;
                    }
                    str = "remote_start_drive";
                }
            }
            return str;
        }
        return null;
    }

    public static final List<e> l(d0 d0Var) {
        s.g(d0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        bu.e0 d11 = d0Var.d();
        bu.e0 e0Var = bu.e0.CLOSURE_MOVE_TYPE_NONE;
        if (!(d11 != e0Var)) {
            d11 = null;
        }
        if (d11 != null) {
            arrayList.add(new e(b.FRONT_DRIVER_DOOR, d11));
        }
        bu.e0 e11 = d0Var.e();
        if (!(e11 != e0Var)) {
            e11 = null;
        }
        if (e11 != null) {
            arrayList.add(new e(b.FRONT_PASSENGER_DOOR, e11));
        }
        bu.e0 g11 = d0Var.g();
        if (!(g11 != e0Var)) {
            g11 = null;
        }
        if (g11 != null) {
            arrayList.add(new e(b.REAR_DRIVER_DOOR, g11));
        }
        bu.e0 h11 = d0Var.h();
        if (!(h11 != e0Var)) {
            h11 = null;
        }
        if (h11 != null) {
            arrayList.add(new e(b.REAR_PASSENGER_DOOR, h11));
        }
        bu.e0 i11 = d0Var.i();
        if (!(i11 != e0Var)) {
            i11 = null;
        }
        if (i11 != null) {
            arrayList.add(new e(b.REAR_TRUNK, i11));
        }
        bu.e0 f11 = d0Var.f();
        if (!(f11 != e0Var)) {
            f11 = null;
        }
        if (f11 != null) {
            arrayList.add(new e(b.FRONT_TRUNK, f11));
        }
        bu.e0 c11 = d0Var.c();
        bu.e0 e0Var2 = c11 != e0Var ? c11 : null;
        if (e0Var2 != null) {
            arrayList.add(new e(b.CHARGE_PORT, e0Var2));
        }
        return arrayList;
    }

    public static final Integer m(ot.b bVar) {
        s.g(bVar, "<this>");
        if (bVar.f() != null) {
            ot.i f11 = bVar.f();
            s.e(f11);
            return Integer.valueOf(f11.e());
        }
        return null;
    }

    public static final String n(d0 d0Var) {
        s.g(d0Var, "<this>");
        if (l(d0Var).size() == 1) {
            e eVar = (e) u.b0(l(d0Var));
            String name = eVar.a().name();
            String name2 = eVar.c().name();
            return name + "_" + name2;
        }
        return "MULTIPLE_DOORS";
    }

    public static final String o(ot.b bVar) {
        s.g(bVar, "<this>");
        if (bVar.c() == null && bVar.g() == null && bVar.d() == null && bVar.j() == null && bVar.h() == null && bVar.f() == null) {
            if (bVar.i() == null && bVar.e() == null) {
                return null;
            }
            return "infoRequest";
        }
        return "command";
    }

    public static final boolean p(ot.b bVar) {
        s.g(bVar, "<this>");
        return bVar.f() != null;
    }

    public static final boolean q(ot.b bVar) {
        Set i11;
        s.g(bVar, "<this>");
        if (bVar.c() == null && bVar.g() == null && bVar.d() == null && bVar.j() == null && bVar.f() == null) {
            if (bVar.h() == null && bVar.i() == null && bVar.e() != null) {
                i11 = x0.i(c1.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO, c1.INFORMATION_REQUEST_TYPE_GET_SESSION_DATA);
                b1 e11 = bVar.e();
                s.e(e11);
                i11.contains(e11.c());
            }
            return false;
        }
        return true;
    }

    public static final String r(ot.b bVar) {
        s.g(bVar, "<this>");
        if (bVar.f() != null) {
            ot.i f11 = bVar.f();
            s.e(f11);
            return f11.f();
        }
        return null;
    }

    public static final boolean s(List<e> list) {
        return list != null && list.size() > 1 && ((e) u.b0(list)).d();
    }

    public static final boolean t(List<e> list) {
        return list != null && list.size() > 1 && ((e) u.b0(list)).e();
    }

    public static final boolean u(ot.b bVar) {
        s.g(bVar, "<this>");
        return bVar.f() != null;
    }

    public static final boolean v(ot.b bVar) {
        ot.j c11;
        s.g(bVar, "<this>");
        if (bVar.j() != null) {
            return true;
        }
        ot.i f11 = bVar.f();
        ot.a aVar = null;
        if (f11 != null && (c11 = f11.c()) != null) {
            aVar = c11.b();
        }
        return aVar != null;
    }
}