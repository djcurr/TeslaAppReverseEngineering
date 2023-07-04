package com.tesla.data.oapi;

import android.content.Context;
import bu.d0;
import bu.e0;
import bu.g2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.data.oapi.i;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kt.q;
import lt.a2;
import lt.a3;
import lt.c2;
import lt.e;
import lt.e1;
import lt.e2;
import lt.f1;
import lt.g1;
import lt.h0;
import lt.h2;
import lt.i2;
import lt.j1;
import lt.j2;
import lt.m;
import lt.n0;
import lt.o0;
import lt.p0;
import lt.r;
import lt.r0;
import lt.r2;
import lt.s;
import lt.s0;
import lt.s2;
import lt.t0;
import lt.t1;
import lt.t2;
import lt.u0;
import lt.u2;
import lt.v0;
import lt.v2;
import lt.w0;
import lt.w1;
import lt.x1;
import lt.y0;
import lt.y1;
import lt.z1;
import vz.b0;
import vz.o;
import vz.v;
import wz.u;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f21795a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f21796b = com.tesla.logging.g.f21878b.a("Proto2OAPI");

    /* loaded from: classes6.dex */
    public interface a {
        h00.l<CalendarSyncParameters, CalendarSyncBody> a();

        Context b();

        String c();
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21797a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21798b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f21799c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f21800d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f21801e;

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int[] f21802f;

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ int[] f21803g;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int[] f21804h;

        static {
            int[] iArr = new int[g2.values().length];
            iArr[g2.RKE_ACTION_UNLOCK.ordinal()] = 1;
            iArr[g2.RKE_ACTION_LOCK.ordinal()] = 2;
            iArr[g2.RKE_ACTION_OPEN_FRUNK.ordinal()] = 3;
            iArr[g2.RKE_ACTION_OPEN_TRUNK.ordinal()] = 4;
            iArr[g2.RKE_ACTION_OPEN_CHARGE_PORT.ordinal()] = 5;
            iArr[g2.RKE_ACTION_CLOSE_CHARGE_PORT.ordinal()] = 6;
            iArr[g2.RKE_ACTION_REMOTE_DRIVE.ordinal()] = 7;
            f21797a = iArr;
            int[] iArr2 = new int[com.tesla.data.oapi.b.values().length];
            iArr2[com.tesla.data.oapi.b.REAR_TRUNK.ordinal()] = 1;
            iArr2[com.tesla.data.oapi.b.FRONT_TRUNK.ordinal()] = 2;
            iArr2[com.tesla.data.oapi.b.CHARGE_PORT.ordinal()] = 3;
            iArr2[com.tesla.data.oapi.b.FRONT_DRIVER_DOOR.ordinal()] = 4;
            iArr2[com.tesla.data.oapi.b.FRONT_PASSENGER_DOOR.ordinal()] = 5;
            iArr2[com.tesla.data.oapi.b.REAR_DRIVER_DOOR.ordinal()] = 6;
            iArr2[com.tesla.data.oapi.b.REAR_PASSENGER_DOOR.ordinal()] = 7;
            f21798b = iArr2;
            int[] iArr3 = new int[t0.c.values().length];
            iArr3[t0.c.Soc.ordinal()] = 1;
            iArr3[t0.c.DogMode.ordinal()] = 2;
            iArr3[t0.c.Doors.ordinal()] = 3;
            f21799c = iArr3;
            int[] iArr4 = new int[r0.d.values().length];
            iArr4[r0.d.HvacSeatCoolerLevel_Unknown.ordinal()] = 1;
            iArr4[r0.d.HvacSeatCoolerLevel_Off.ordinal()] = 2;
            iArr4[r0.d.HvacSeatCoolerLevel_Low.ordinal()] = 3;
            iArr4[r0.d.HvacSeatCoolerLevel_Med.ordinal()] = 4;
            iArr4[r0.d.HvacSeatCoolerLevel_High.ordinal()] = 5;
            f21800d = iArr4;
            int[] iArr5 = new int[e0.values().length];
            iArr5[e0.CLOSURE_MOVE_TYPE_NONE.ordinal()] = 1;
            iArr5[e0.CLOSURE_MOVE_TYPE_MOVE.ordinal()] = 2;
            iArr5[e0.CLOSURE_MOVE_TYPE_STOP.ordinal()] = 3;
            iArr5[e0.CLOSURE_MOVE_TYPE_OPEN.ordinal()] = 4;
            iArr5[e0.CLOSURE_MOVE_TYPE_CLOSE.ordinal()] = 5;
            int[] iArr6 = new int[p0.a.values().length];
            iArr6[p0.a.ClimateKeeperAction_Off.ordinal()] = 1;
            iArr6[p0.a.ClimateKeeperAction_On.ordinal()] = 2;
            iArr6[p0.a.ClimateKeeperAction_Dog.ordinal()] = 3;
            iArr6[p0.a.ClimateKeeperAction_Camp.ordinal()] = 4;
            f21801e = iArr6;
            int[] iArr7 = new int[e.a.values().length];
            iArr7[e.a.AutoSeatPosition_Unknown.ordinal()] = 1;
            iArr7[e.a.AutoSeatPosition_FrontLeft.ordinal()] = 2;
            iArr7[e.a.AutoSeatPosition_FrontRight.ordinal()] = 3;
            f21802f = iArr7;
            int[] iArr8 = new int[r0.e.values().length];
            iArr8[r0.e.HvacSeatCoolerPosition_Unknown.ordinal()] = 1;
            iArr8[r0.e.HvacSeatCoolerPosition_FrontLeft.ordinal()] = 2;
            iArr8[r0.e.HvacSeatCoolerPosition_FrontRight.ordinal()] = 3;
            f21803g = iArr8;
            int[] iArr9 = new int[q.values().length];
            iArr9[q.StwHeatLevel_Unknown.ordinal()] = 1;
            iArr9[q.StwHeatLevel_Off.ordinal()] = 2;
            iArr9[q.StwHeatLevel_Low.ordinal()] = 3;
            iArr9[q.StwHeatLevel_High.ordinal()] = 4;
            f21804h = iArr9;
        }
    }

    private l() {
    }

    private final WindowControlCommand a(v2 v2Var) {
        return v2Var.e() != null ? WindowControlCommand.VENT : v2Var.b() != null ? WindowControlCommand.CLOSE : v2Var.d() != null ? WindowControlCommand.UNKNOWN : WindowControlCommand.UNKNOWN;
    }

    private final SeatHeater b(s0.c cVar) {
        return cVar.b() != null ? SeatHeater.FRONT_LEFT : cVar.c() != null ? SeatHeater.FRONT_RIGHT : cVar.e() != null ? SeatHeater.REAR_LEFT : cVar.d() != null ? SeatHeater.REAR_CENTER : cVar.g() != null ? SeatHeater.REAR_RIGHT : cVar.h() != null ? SeatHeater.REAR_RIGHT_BACK : cVar.f() != null ? SeatHeater.REAR_LEFT_BACK : cVar.j() != null ? SeatHeater.THIRD_ROW_RIGHT : cVar.i() != null ? SeatHeater.THIRD_ROW_LEFT : cVar.k() != null ? SeatHeater.UNKNOWN : SeatHeater.UNKNOWN;
    }

    private final CoolingLevel c(r0.d dVar) {
        int i11 = b.f21800d[dVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return CoolingLevel.OFF;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    return CoolingLevel.HIGH;
                }
                throw new NoWhenBranchMatchedException();
            }
            return CoolingLevel.MEDIUM;
        }
        return CoolingLevel.LOW;
    }

    private final SeatHeaterLevel d(s0.c cVar) {
        if (cVar == null) {
            return SeatHeaterLevel.OFF;
        }
        if (cVar.p() == null && cVar.o() == null) {
            return cVar.m() != null ? SeatHeaterLevel.LOW : cVar.n() != null ? SeatHeaterLevel.MEDIUM : cVar.l() != null ? SeatHeaterLevel.HIGH : SeatHeaterLevel.OFF;
        }
        return SeatHeaterLevel.OFF;
    }

    private final OverrideMode f(t0.c cVar) {
        int i11 = cVar == null ? -1 : b.f21799c[cVar.ordinal()];
        if (i11 != -1) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return OverrideMode.NONE;
                    }
                    return OverrideMode.DOORS;
                }
                return OverrideMode.DOG_MODE;
            }
            return OverrideMode.SOC;
        }
        return OverrideMode.NONE;
    }

    private final RemoteSeatHeaterBody h(s0 s0Var) {
        s0.c cVar = (s0.c) u.d0(s0Var.b());
        if (cVar == null) {
            return null;
        }
        return new RemoteSeatHeaterBody(b(cVar), d(cVar));
    }

    private final i k(d0 d0Var) {
        e eVar = (e) u.d0(c.l(d0Var));
        if (eVar == null) {
            return null;
        }
        switch (b.f21798b[eVar.a().ordinal()]) {
            case 1:
                return new i.a(new ActuateTrunkBody(Trunk.REAR));
            case 2:
                return new i.a(new ActuateTrunkBody(Trunk.FRONT));
            case 3:
                if (eVar.e()) {
                    return new i.l();
                }
                if (eVar.d()) {
                    return new i.k();
                }
                return null;
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final i l(g2 g2Var) {
        switch (b.f21797a[g2Var.ordinal()]) {
            case 1:
                return new i.h1();
            case 2:
                return new i.u();
            case 3:
                return new i.a(new ActuateTrunkBody(Trunk.FRONT));
            case 4:
                return new i.a(new ActuateTrunkBody(Trunk.REAR));
            case 5:
                return new i.l();
            case 6:
                return new i.k();
            case 7:
                return new i.h0();
            default:
                return null;
        }
    }

    private final i m(j2 j2Var, a aVar) {
        String e11;
        kt.f c11;
        kt.f c12;
        y0 d11;
        c2 b11;
        String c13;
        String c14;
        ChangeSunroofStateBody changeSunroofStateBody;
        Map f11;
        Map f12;
        Map f13;
        SeatPosition i11;
        l lVar;
        SeatPosition g11;
        String c15;
        CalendarSyncBody mo12invoke;
        CalendarData a11;
        b0 b0Var;
        Float c16;
        if (j2Var.T() == null) {
            lt.l i12 = j2Var.i();
            if (i12 == null) {
                m j11 = j2Var.j();
                if (j11 == null) {
                    lt.q m11 = j2Var.m();
                    if (m11 == null) {
                        r n11 = j2Var.n();
                        if (n11 == null) {
                            s o11 = j2Var.o();
                            if (o11 == null) {
                                n0 x11 = j2Var.x();
                                if (x11 == null) {
                                    t0 D = j2Var.D();
                                    if (D == null) {
                                        u0 E = j2Var.E();
                                        if (E == null) {
                                            lt.f d12 = j2Var.d();
                                            if (d12 == null) {
                                                e2 d02 = j2Var.d0();
                                                if (d02 == null) {
                                                    v0 F = j2Var.F();
                                                    if (F == null) {
                                                        e1 L = j2Var.L();
                                                        if (L != null) {
                                                            Integer d13 = L.d();
                                                            if (d13 == null) {
                                                                b0Var = null;
                                                            } else {
                                                                int intValue = d13.intValue();
                                                                if (intValue < 0) {
                                                                    return new i.c0();
                                                                }
                                                                if (intValue > 0) {
                                                                    return new i.d0();
                                                                }
                                                                b0Var = b0.f54756a;
                                                            }
                                                            if (b0Var == null && (c16 = L.c()) != null) {
                                                                return new i.b0(new MediaVolumeBody(c16.floatValue()));
                                                            }
                                                        }
                                                        if (j2Var.I() == null) {
                                                            if (j2Var.G() == null) {
                                                                if (j2Var.J() == null) {
                                                                    if (j2Var.H() == null) {
                                                                        if (j2Var.K() == null) {
                                                                            a2 Z = j2Var.Z();
                                                                            if (Z == null) {
                                                                                lt.c b12 = j2Var.b();
                                                                                if (b12 == null) {
                                                                                    t1 U = j2Var.U();
                                                                                    if (U == null) {
                                                                                        if (j2Var.s() == null) {
                                                                                            i2 g02 = j2Var.g0();
                                                                                            if (g02 == null) {
                                                                                                if (j2Var.r() == null) {
                                                                                                    g1 N = j2Var.N();
                                                                                                    if (N == null) {
                                                                                                        f1 M = j2Var.M();
                                                                                                        if (M == null) {
                                                                                                            a3 v02 = j2Var.v0();
                                                                                                            if (v02 == null) {
                                                                                                                j1 P = j2Var.P();
                                                                                                                if (P == null) {
                                                                                                                    h0 t11 = j2Var.t();
                                                                                                                    if (t11 == null) {
                                                                                                                        h2 f02 = j2Var.f0();
                                                                                                                        if (f02 != null && (c15 = f02.c()) != null) {
                                                                                                                            com.tesla.data.oapi.a aVar2 = com.tesla.data.oapi.a.f21724a;
                                                                                                                            CalendarData c17 = new CalendarDataJsonAdapter(aVar2.a()).c(c15);
                                                                                                                            if (c17 == null) {
                                                                                                                                JsCalendarSyncParameters c18 = new JsCalendarSyncParametersJsonAdapter(aVar2.a()).c(c15);
                                                                                                                                if (c18 != null && (mo12invoke = aVar.a().mo12invoke(new CalendarSyncParameters(c18.b(), c18.a(), aVar.c()))) != null && (a11 = mo12invoke.a()) != null) {
                                                                                                                                    return new i.f(new CalendarSyncBody(a11));
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new i.f(new CalendarSyncBody(c17));
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (j2Var.h0() == null) {
                                                                                                                            if (j2Var.i0() == null) {
                                                                                                                                if (j2Var.j0() == null) {
                                                                                                                                    if (j2Var.O() == null) {
                                                                                                                                        if (j2Var.f() == null) {
                                                                                                                                            if (j2Var.l0() == null) {
                                                                                                                                                if (j2Var.m0() == null) {
                                                                                                                                                    r2 o02 = j2Var.o0();
                                                                                                                                                    if (o02 == null) {
                                                                                                                                                        s2 p02 = j2Var.p0();
                                                                                                                                                        if (p02 == null) {
                                                                                                                                                            t2 q02 = j2Var.q0();
                                                                                                                                                            if (q02 == null) {
                                                                                                                                                                u2 r02 = j2Var.r0();
                                                                                                                                                                if (r02 == null) {
                                                                                                                                                                    v2 s02 = j2Var.s0();
                                                                                                                                                                    if (s02 == null) {
                                                                                                                                                                        o0 y11 = j2Var.y();
                                                                                                                                                                        if (y11 == null) {
                                                                                                                                                                            s0 C = j2Var.C();
                                                                                                                                                                            if (C == null) {
                                                                                                                                                                                w1 V = j2Var.V();
                                                                                                                                                                                if (V == null) {
                                                                                                                                                                                    x1 W = j2Var.W();
                                                                                                                                                                                    if (W == null) {
                                                                                                                                                                                        z1 Y = j2Var.Y();
                                                                                                                                                                                        if (Y == null) {
                                                                                                                                                                                            p0 z11 = j2Var.z();
                                                                                                                                                                                            if (z11 == null) {
                                                                                                                                                                                                if (j2Var.l() == null) {
                                                                                                                                                                                                    lt.e c19 = j2Var.c();
                                                                                                                                                                                                    if (c19 == null) {
                                                                                                                                                                                                        r0 B = j2Var.B();
                                                                                                                                                                                                        if (B == null) {
                                                                                                                                                                                                            y1 X = j2Var.X();
                                                                                                                                                                                                            if (X == null) {
                                                                                                                                                                                                                f1 M2 = j2Var.M();
                                                                                                                                                                                                                if (M2 == null) {
                                                                                                                                                                                                                    if (j2Var.v0() == null) {
                                                                                                                                                                                                                        lt.g2 e02 = j2Var.e0();
                                                                                                                                                                                                                        if (e02 == null) {
                                                                                                                                                                                                                            if (j2Var.h() == null) {
                                                                                                                                                                                                                                if (j2Var.g() == null) {
                                                                                                                                                                                                                                    return null;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                return new i.k();
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return new i.l();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return new i.f1(new TakeDriveNoteBody(e02.c()));
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    throw new o("An operation is not implemented: Not implemented on iOS/Android yet");
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return new i.o0(new SendGPSToVehicleBody(M2.c(), M2.d()));
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return new i.r0(new SetCabinOverheatProtectionBody(X.c(), X.d()));
                                                                                                                                                                                                        }
                                                                                                                                                                                                        r0.c cVar = (r0.c) u.d0(B.b());
                                                                                                                                                                                                        if (cVar == null || (g11 = (lVar = f21795a).g(cVar.d())) == null) {
                                                                                                                                                                                                            return null;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return new i.n0(new SeatCoolingBody(g11, lVar.c(cVar.c())));
                                                                                                                                                                                                    }
                                                                                                                                                                                                    e.b bVar = (e.b) u.d0(c19.b());
                                                                                                                                                                                                    if (bVar == null || (i11 = f21795a.i(bVar.d())) == null) {
                                                                                                                                                                                                        return null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return new i.c(new AutoSeatClimateBody(i11, bVar.c()));
                                                                                                                                                                                                }
                                                                                                                                                                                                return new i.o();
                                                                                                                                                                                            }
                                                                                                                                                                                            return new i.t0(new ClimateKeeperModeBody(f21795a.e(z11.c()), z11.d()));
                                                                                                                                                                                        }
                                                                                                                                                                                        return new i.s0(new ChargingAmpsBody(Y.c()));
                                                                                                                                                                                    }
                                                                                                                                                                                    boolean d14 = W.d();
                                                                                                                                                                                    Integer valueOf = Integer.valueOf(W.c());
                                                                                                                                                                                    boolean z12 = W.g() != null;
                                                                                                                                                                                    kt.i g12 = W.g();
                                                                                                                                                                                    boolean z13 = (g12 == null ? null : g12.c()) != null;
                                                                                                                                                                                    boolean z14 = W.e() != null;
                                                                                                                                                                                    kt.h e12 = W.e();
                                                                                                                                                                                    return new i.m0(new SetScheduledDepartureBody(d14, valueOf, z12, z13, z14, (e12 != null ? e12.c() : null) != null, Integer.valueOf(W.f())));
                                                                                                                                                                                }
                                                                                                                                                                                return new i.l0(new SetScheduledChargingBody(V.d(), V.c()));
                                                                                                                                                                            }
                                                                                                                                                                            RemoteSeatHeaterBody h11 = f21795a.h(C);
                                                                                                                                                                            if (h11 == null) {
                                                                                                                                                                                return null;
                                                                                                                                                                            }
                                                                                                                                                                            return new i.g0(h11);
                                                                                                                                                                        }
                                                                                                                                                                        return new i.t(new HVACBioweaponModeBody(y11.d(), y11.c()));
                                                                                                                                                                    }
                                                                                                                                                                    kt.f c21 = s02.c();
                                                                                                                                                                    if (c21 == null) {
                                                                                                                                                                        com.tesla.logging.g gVar = f21796b;
                                                                                                                                                                        TeslaLog teslaLog = TeslaLog.INSTANCE;
                                                                                                                                                                        String h12 = gVar.h();
                                                                                                                                                                        ht.a aVar3 = ht.a.f29422a;
                                                                                                                                                                        f13 = wz.r0.f(v.a(h12, "Control window action location is null"));
                                                                                                                                                                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                                                                                                                                                                        for (Map.Entry entry : f13.entrySet()) {
                                                                                                                                                                            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                                                                                                                                                                        }
                                                                                                                                                                        firebaseCrashlytics.recordException(new Exception("Control window action location is null"));
                                                                                                                                                                        TeslaLog.setTag$default(teslaLog, h12, false, 2, null);
                                                                                                                                                                        n80.a.a("Control window action location is null", new Object[0]);
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                    WindowControlCommand a12 = f21795a.a(s02);
                                                                                                                                                                    if (a12 == WindowControlCommand.UNKNOWN) {
                                                                                                                                                                        com.tesla.logging.g gVar2 = f21796b;
                                                                                                                                                                        TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                                                                                                                                                                        String h13 = gVar2.h();
                                                                                                                                                                        ht.a aVar4 = ht.a.f29422a;
                                                                                                                                                                        f12 = wz.r0.f(v.a(h13, "Control window action unknown"));
                                                                                                                                                                        FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                                                                                                                                                                        for (Map.Entry entry2 : f12.entrySet()) {
                                                                                                                                                                            ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                                                                                                                                                                        }
                                                                                                                                                                        firebaseCrashlytics2.recordException(new Exception("Control window action unknown"));
                                                                                                                                                                        TeslaLog.setTag$default(teslaLog2, h13, false, 2, null);
                                                                                                                                                                        n80.a.a("Control window action unknown", new Object[0]);
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                    return new i.j1(new WindowControlBody(c21.c(), c21.d(), a12));
                                                                                                                                                                }
                                                                                                                                                                kt.f c22 = r02.c();
                                                                                                                                                                if (c22 == null) {
                                                                                                                                                                    com.tesla.logging.g gVar3 = f21796b;
                                                                                                                                                                    TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                                                                                                                                                                    String h14 = gVar3.h();
                                                                                                                                                                    ht.a aVar5 = ht.a.f29422a;
                                                                                                                                                                    f11 = wz.r0.f(v.a(h14, "Homelink action missing location"));
                                                                                                                                                                    FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                                                                                                                                                                    for (Map.Entry entry3 : f11.entrySet()) {
                                                                                                                                                                        ht.a.f29422a.a((String) entry3.getKey(), (String) entry3.getValue());
                                                                                                                                                                    }
                                                                                                                                                                    firebaseCrashlytics3.recordException(new Exception("Homelink action missing location"));
                                                                                                                                                                    TeslaLog.setTag$default(teslaLog3, h14, false, 2, null);
                                                                                                                                                                    n80.a.a("Homelink action missing location", new Object[0]);
                                                                                                                                                                    return null;
                                                                                                                                                                }
                                                                                                                                                                return new i.g1(new TriggerHomelinkBody(c22.c(), c22.d()));
                                                                                                                                                            }
                                                                                                                                                            if (q02.g() != null) {
                                                                                                                                                                changeSunroofStateBody = new ChangeSunroofStateBody(SunroofStateChange.VENT);
                                                                                                                                                            } else if (q02.d() != null) {
                                                                                                                                                                changeSunroofStateBody = new ChangeSunroofStateBody(SunroofStateChange.CLOSE);
                                                                                                                                                            } else {
                                                                                                                                                                changeSunroofStateBody = new ChangeSunroofStateBody(SunroofStateChange.CLOSE);
                                                                                                                                                            }
                                                                                                                                                            return new i.j(changeSunroofStateBody);
                                                                                                                                                        }
                                                                                                                                                        return new i.x0(new SetValetModeBody(p02.c(), p02.d()));
                                                                                                                                                    }
                                                                                                                                                    return new i.v0(new SetSentryModeBody(o02.c()));
                                                                                                                                                }
                                                                                                                                                return new i.k0();
                                                                                                                                            }
                                                                                                                                            return new i.j0();
                                                                                                                                        }
                                                                                                                                        return new i.e(new BoomboxBody(0));
                                                                                                                                    }
                                                                                                                                    return new i.e0();
                                                                                                                                }
                                                                                                                                return new i.s();
                                                                                                                            }
                                                                                                                            return new i.p();
                                                                                                                        }
                                                                                                                        return new i.g();
                                                                                                                    }
                                                                                                                    return new i.f0(new FetchNearbyChargingBody(t11.e(), t11.c(), t11.d(), true));
                                                                                                                }
                                                                                                                return new i.p0(new NavigationSuperchargerRequestBody(P.c()));
                                                                                                            }
                                                                                                            return new i.q0(v02.c(), aVar.b());
                                                                                                        }
                                                                                                        return new i.o0(new SendGPSToVehicleBody(M.c(), M.d()));
                                                                                                    }
                                                                                                    if (zu.q.a()) {
                                                                                                        c14 = "这里是" + N.c() + "：\n查看详情 http://j.map.baidu.com/placeholder";
                                                                                                    } else {
                                                                                                        c14 = N.c();
                                                                                                    }
                                                                                                    return new i.q0(c14, aVar.b());
                                                                                                }
                                                                                                return new i.q();
                                                                                            }
                                                                                            lt.i b13 = g02.b();
                                                                                            boolean c23 = b13 != null ? b13.c() : false;
                                                                                            lt.i b14 = g02.b();
                                                                                            float d15 = b14 == null ? 40.0f : b14.d();
                                                                                            lt.i b15 = g02.b();
                                                                                            return new i.i1(new UpdateChargeOnSolarFeatureRequestBody(c23, d15, b15 == null ? 90.0f : b15.e()));
                                                                                        }
                                                                                        return new i.r();
                                                                                    }
                                                                                    return new i.i0(new RemoveManagedChargingSiteBody(U.c()));
                                                                                }
                                                                                w0 b16 = b12.b();
                                                                                String str = "";
                                                                                if (b16 == null || (e11 = b16.e()) == null) {
                                                                                    e11 = "";
                                                                                }
                                                                                w0 b17 = b12.b();
                                                                                if (b17 != null && (d11 = b17.d()) != null && (b11 = d11.b()) != null && (c13 = b11.c()) != null) {
                                                                                    str = c13;
                                                                                }
                                                                                w0 b18 = b12.b();
                                                                                float f14 = BitmapDescriptorFactory.HUE_RED;
                                                                                float c24 = (b18 == null || (c11 = b18.c()) == null) ? 0.0f : c11.c();
                                                                                w0 b19 = b12.b();
                                                                                if (b19 != null && (c12 = b19.c()) != null) {
                                                                                    f14 = c12.d();
                                                                                }
                                                                                return new i.b(new AddManagedChargingSiteBody(e11, str, c24, f14));
                                                                            }
                                                                            return new i.u0(new SetCopTempBody(Z.c().getValue()));
                                                                        }
                                                                        return new i.z();
                                                                    }
                                                                    return new i.x();
                                                                }
                                                                return new i.y();
                                                            }
                                                            return new i.w();
                                                        }
                                                        return new i.a0();
                                                    }
                                                    return new i.C0393i(new ChangeClimateTemperatureSettingBody(F.i(), F.f()));
                                                }
                                                return new i.e1(new StwHeatLevelBody(f21795a.j(d02.c())));
                                            }
                                            return new i.d(new AutoStwHeatBody(d12.c()));
                                        }
                                        return new i.c1(new RemoteSteeringWheelHeaterBody(E.c()));
                                    }
                                    return new i.v(new MaxDefrostBody(D.e(), f21795a.f((t0.c) u.d0(D.d()))));
                                } else if (x11.d()) {
                                    return new i.n(new ClimateOnBody(x11.c() ? ClimateOverrideMode.SOCDOORS : null));
                                } else {
                                    return new i.m();
                                }
                            }
                            String d16 = o11.d();
                            if (o11.c()) {
                                return new i.y0(new ActivateSpeedLimitBody(d16));
                            }
                            return new i.a1(new ActivateSpeedLimitBody(d16));
                        }
                        return new i.w0(new SpeedLimitSetLimitBody(n11.c()));
                    }
                    return new i.z0(new ActivateSpeedLimitBody(m11.c()));
                } else if (kotlin.jvm.internal.s.c(j11.b(), new kt.u(null, 1, null))) {
                    return new i.b1();
                } else {
                    return new i.d1();
                }
            }
            return new i.h(new ChangeChargeLimitBody(i12.c()));
        }
        return new i.h0();
    }

    public final ClimateKeeperMode e(p0.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        int i11 = b.f21801e[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return ClimateKeeperMode.CAMP;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return ClimateKeeperMode.DOG;
            }
            return ClimateKeeperMode.ON;
        }
        return ClimateKeeperMode.OFF;
    }

    public final SeatPosition g(r0.e eVar) {
        kotlin.jvm.internal.s.g(eVar, "<this>");
        int i11 = b.f21803g[eVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return SeatPosition.FRONT_RIGHT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return SeatPosition.FRONT_LEFT;
        }
        return null;
    }

    public final SeatPosition i(e.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        int i11 = b.f21802f[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return SeatPosition.FRONT_RIGHT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return SeatPosition.FRONT_LEFT;
        }
        return null;
    }

    public final StwHeatLevel j(q qVar) {
        kotlin.jvm.internal.s.g(qVar, "<this>");
        int i11 = b.f21804h[qVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return StwHeatLevel.HIGH;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return StwHeatLevel.LOW;
            }
            return StwHeatLevel.OFF;
        }
        return StwHeatLevel.UNKNOWN;
    }

    public final i n(ot.b action, a dependencies) {
        kotlin.jvm.internal.s.g(action, "action");
        kotlin.jvm.internal.s.g(dependencies, "dependencies");
        j2 c11 = action.c();
        if (c11 == null) {
            g2 g11 = action.g();
            if (g11 == null) {
                d0 d11 = action.d();
                if (d11 == null) {
                    return null;
                }
                return f21795a.k(d11);
            }
            return f21795a.l(g11);
        }
        return f21795a.m(c11, dependencies);
    }
}