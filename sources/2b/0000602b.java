package com.tesla.data.oapi;

import bu.e0;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final b f21728a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f21729b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21730c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21731d;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21732a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.FRONT_DRIVER_DOOR.ordinal()] = 1;
            iArr[b.FRONT_PASSENGER_DOOR.ordinal()] = 2;
            iArr[b.REAR_DRIVER_DOOR.ordinal()] = 3;
            iArr[b.REAR_PASSENGER_DOOR.ordinal()] = 4;
            f21732a = iArr;
        }
    }

    public e(b door, e0 moveType) {
        s.g(door, "door");
        s.g(moveType, "moveType");
        this.f21728a = door;
        this.f21729b = moveType;
        this.f21730c = moveType == e0.CLOSURE_MOVE_TYPE_OPEN;
        this.f21731d = moveType == e0.CLOSURE_MOVE_TYPE_CLOSE;
    }

    public final b a() {
        return this.f21728a;
    }

    public final ot.g b() {
        int i11 = a.f21732a[this.f21728a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    return ot.g.PASSENGER_REAR_DOOR;
                }
                return ot.g.DRIVER_REAR_DOOR;
            }
            return ot.g.PASSENGER_FRONT_DOOR;
        }
        return ot.g.DRIVER_FRONT_DOOR;
    }

    public final e0 c() {
        return this.f21729b;
    }

    public final boolean d() {
        return this.f21731d;
    }

    public final boolean e() {
        return this.f21730c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f21728a == eVar.f21728a && this.f21729b == eVar.f21729b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f21728a.hashCode() * 31) + this.f21729b.hashCode();
    }

    public String toString() {
        b bVar = this.f21728a;
        e0 e0Var = this.f21729b;
        return "DoorAndMoveType(door=" + bVar + ", moveType=" + e0Var + ")";
    }
}