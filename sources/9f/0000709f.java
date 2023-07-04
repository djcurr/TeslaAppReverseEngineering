package gt;

import com.tesla.domain.model.widget.VehicleClosure;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import mt.l;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: gt.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C0534a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28090a;

        static {
            int[] iArr = new int[VehicleClosure.values().length];
            iArr[VehicleClosure.DRIVER_FRONT_DOOR.ordinal()] = 1;
            iArr[VehicleClosure.DRIVER_REAR_DOOR.ordinal()] = 2;
            iArr[VehicleClosure.PASSENGER_FRONT_DOOR.ordinal()] = 3;
            iArr[VehicleClosure.PASSENGER_REAR_DOOR.ordinal()] = 4;
            iArr[VehicleClosure.FRONT_TRUNK.ordinal()] = 5;
            iArr[VehicleClosure.REAR_TRUNK.ordinal()] = 6;
            iArr[VehicleClosure.LOCKED.ordinal()] = 7;
            f28090a = iArr;
        }
    }

    public static final boolean a(l lVar, VehicleClosure closure) {
        s.g(lVar, "<this>");
        s.g(closure, "closure");
        switch (C0534a.f28090a[closure.ordinal()]) {
            case 1:
                return s.c(lVar.d(), Boolean.TRUE);
            case 2:
                return s.c(lVar.f(), Boolean.TRUE);
            case 3:
                return s.c(lVar.h(), Boolean.TRUE);
            case 4:
                return s.c(lVar.j(), Boolean.TRUE);
            case 5:
                return s.c(lVar.l(), Boolean.TRUE);
            case 6:
                return s.c(lVar.n(), Boolean.TRUE);
            case 7:
                return s.c(lVar.p(), Boolean.TRUE);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}