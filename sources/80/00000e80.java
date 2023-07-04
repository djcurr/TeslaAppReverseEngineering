package bv;
//NOTES
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import lt.t0;
import lt.w2;
import mt.k;
import vz.p;
import wz.w;

/* loaded from: classes6.dex */
public final class d {

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8306a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.SUMMON.ordinal()] = 1;
            iArr[c.FRUNK.ordinal()] = 2;
            iArr[c.HOME_LINK.ordinal()] = 3;
            iArr[c.LOCK.ordinal()] = 4;
            iArr[c.CLIMATE_TOGGLE.ordinal()] = 5;
            iArr[c.CHARGE_PORT.ordinal()] = 6;
            iArr[c.TRUNK.ordinal()] = 7;
            iArr[c.BIOWEAPON.ordinal()] = 8;
            iArr[c.SENTRY.ordinal()] = 9;
            iArr[c.VENT.ordinal()] = 10;
            iArr[c.MAX_DEFROST.ordinal()] = 11;
            iArr[c.SUNROOF_CONTROL.ordinal()] = 12;
            iArr[c.ACTUATE_ALL_DOORS.ordinal()] = 13;
            iArr[c.REMOTE_START.ordinal()] = 14;
            iArr[c.FLASH_LIGHTS.ordinal()] = 15;
            iArr[c.HONK_HORN.ordinal()] = 16;
            iArr[c.UNLATCH_DRIVER_DOOR.ordinal()] = 17;
            iArr[c.REMOTE_BOOMBOX.ordinal()] = 18;
            f8306a = iArr;
        }
    }

    private static final boolean a(cu.a aVar) {
        w2 g11 = aVar.g();
        k d11 = g11 == null ? null : g11.d();
        if (d11 == null) {
            return false;
        }
        k.g x11 = d11.x();
        if (et.a.R(x11 == null ? null : x11.b())) {
            return false;
        }
        k.c t11 = d11.t();
        if (!et.a.R(t11 != null ? t11.b() : null)) {
            Float E = d11.E();
            if (!(E != null && E.floatValue() > 10.0f)) {
                return false;
            }
            w2 g12 = aVar.g();
            if (g12 != null && et.a.D(g12)) {
                return false;
            }
        }
        return true;
    }

    public static final ot.c b(c cVar, cu.a vehicle) {
        List<? extends t0.c> i11;
        s.g(cVar, "<this>");
        s.g(vehicle, "vehicle");
        if (c(cVar, vehicle)) {
            return null;
        }
        ot.d dVar = ot.d.SOURCE_WIDGET;
        boolean d11 = com.tesla.widget.c.d(cVar, vehicle);
        String h11 = vehicle.h();
        boolean z11 = false;
        switch (a.f8306a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return null;
            case 4:
                if (d11) {
                    return xs.b.f57689a.x(h11, dVar);
                }
                return xs.b.f57689a.N(h11, dVar);
            case 5:
                if (d11) {
                    return xs.b.f57689a.l(h11, dVar);
                }
                return xs.b.f57689a.n(h11, false, dVar);
            case 6:
                w2 g11 = vehicle.g();
                if (g11 != null && et.a.c(g11)) {
                    return xs.b.f57689a.r(h11, dVar);
                }
                w2 g12 = vehicle.g();
                if (g12 != null && et.a.b(g12)) {
                    z11 = true;
                }
                if (z11) {
                    if (et.a.x(vehicle)) {
                        return xs.b.f57689a.r(h11, dVar);
                    }
                    return xs.b.f57689a.B(h11, dVar);
                }
                return null;
            case 7:
                return xs.b.f57689a.a(h11, dVar);
            case 8:
                return xs.b.d(xs.b.f57689a, h11, d11, false, dVar, 4, null);
            case 9:
                if (d11) {
                    return xs.b.f57689a.F(h11, dVar);
                }
                return xs.b.f57689a.H(h11, dVar);
            case 10:
                w2 g13 = vehicle.g();
                p<Double, Double> n11 = g13 == null ? null : et.a.n(g13);
                if (n11 == null) {
                    return null;
                }
                return xs.b.f57689a.O(h11, n11.c().doubleValue(), n11.d().doubleValue(), d11, dVar);
            case 11:
                i11 = w.i();
                return xs.b.f57689a.z(h11, true ^ d11, false, i11, dVar);
            case 12:
                w2 g14 = vehicle.g();
                if (!(g14 != null && et.a.I(g14))) {
                    w2 g15 = vehicle.g();
                    if (g15 != null && et.a.H(g15)) {
                        z11 = true;
                    }
                    if (!z11) {
                        return null;
                    }
                }
                return xs.b.f57689a.K(h11, !d11, dVar);
            case 13:
                if (d11) {
                    return xs.b.f57689a.s(h11, dVar);
                }
                return xs.b.f57689a.A(h11, dVar);
            case 14:
                return xs.b.f57689a.C(h11, dVar);
            case 15:
                return xs.b.f57689a.t(h11, dVar);
            case 16:
                return xs.b.f57689a.v(h11, dVar);
            case 17:
                return xs.b.f57689a.M(h11, dVar);
            case 18:
                return xs.b.f57689a.e(h11, dVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean c(c cVar, cu.a appVehicle) {
        s.g(cVar, "<this>");
        s.g(appVehicle, "appVehicle");
        w2 g11 = appVehicle.g();
        if (g11 == null) {
            return false;
        }
        int i11 = a.f8306a[cVar.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 != 5) {
                if (i11 != 7) {
                    if (i11 == 17) {
                        cu.b c11 = appVehicle.c();
                        if (c11 != null && c11.e()) {
                            return false;
                        }
                    } else if (i11 == 10) {
                        return et.a.M(g11);
                    } else {
                        if (i11 == 11) {
                            return a(appVehicle);
                        }
                        if (i11 != 13) {
                            if (i11 != 14) {
                                return false;
                            }
                            return et.a.F(g11);
                        }
                        cu.b c12 = appVehicle.c();
                        if (c12 != null && c12.e()) {
                            return false;
                        }
                    }
                } else if (et.a.J(appVehicle) || et.a.t(g11)) {
                    return false;
                }
            } else if (!et.a.z(g11) || !et.a.y(g11)) {
                return false;
            }
        }
        return true;
    }

    public static final c d(String str) {
        Enum r32;
        s.g(str, "<this>");
        Object[] enumConstants = c.class.getEnumConstants();
        s.f(enumConstants, "T::class.java.enumConstants");
        int length = enumConstants.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                r32 = null;
                break;
            }
            r32 = enumConstants[i11];
            if (s.c(((Enum) r32).name(), str)) {
                break;
            }
            i11++;
        }
        return (c) r32;
    }
}