package bv;

import av.e;
import kotlin.jvm.internal.s;
import mt.u;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum CLIMATE_TOGGLE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTUATE_ALL_DOORS;
    public static final c BIOWEAPON;
    public static final c CHARGE_PORT;
    public static final c CLIMATE_TOGGLE;
    public static final c FLASH_LIGHTS;
    public static final c FRUNK;
    public static final c HOME_LINK;
    public static final c HONK_HORN;
    public static final c LOCK = new c("LOCK", 0, e.ic_lock, e.ic_unlock);
    public static final c MAX_DEFROST;
    public static final c REMOTE_BOOMBOX;
    public static final c REMOTE_START;
    public static final c SENTRY;
    public static final c SUMMON;
    public static final c SUNROOF_CONTROL;
    public static final c TRUNK;
    public static final c UNLATCH_DRIVER_DOOR;
    public static final c VENT;
    private final int disableIcon;
    private final int enableIcon;

    private static final /* synthetic */ c[] $values() {
        return new c[]{LOCK, CLIMATE_TOGGLE, CHARGE_PORT, FRUNK, TRUNK, BIOWEAPON, SUMMON, REMOTE_START, FLASH_LIGHTS, HONK_HORN, HOME_LINK, SENTRY, VENT, MAX_DEFROST, SUNROOF_CONTROL, ACTUATE_ALL_DOORS, UNLATCH_DRIVER_DOOR, REMOTE_BOOMBOX};
    }

    static {
        int i11 = e.ic_climate;
        CLIMATE_TOGGLE = new c("CLIMATE_TOGGLE", 1, i11, i11);
        int i12 = e.ic_charging_bolt;
        CHARGE_PORT = new c("CHARGE_PORT", 2, i12, i12);
        int i13 = e.ic_frunk;
        FRUNK = new c("FRUNK", 3, i13, i13);
        int i14 = e.ic_trunk;
        TRUNK = new c("TRUNK", 4, i14, i14);
        int i15 = e.ic_biohazard;
        BIOWEAPON = new c("BIOWEAPON", 5, i15, i15);
        int i16 = e.ic_summon;
        SUMMON = new c("SUMMON", 6, i16, i16);
        int i17 = e.ic_remote_start;
        REMOTE_START = new c("REMOTE_START", 7, i17, i17);
        int i18 = e.ic_flash;
        FLASH_LIGHTS = new c("FLASH_LIGHTS", 8, i18, i18);
        int i19 = e.ic_horn;
        HONK_HORN = new c("HONK_HORN", 9, i19, i19);
        int i21 = e.ic_homelink;
        HOME_LINK = new c("HOME_LINK", 10, i21, i21);
        SENTRY = new c("SENTRY", 11, e.ic_sentry_off, e.ic_sentry_on);
        int i22 = e.ic_vent;
        VENT = new c("VENT", 12, i22, i22);
        int i23 = e.ic_defrost_car;
        MAX_DEFROST = new c("MAX_DEFROST", 13, i23, i23);
        SUNROOF_CONTROL = new c("SUNROOF_CONTROL", 14, e.ic_vent_sunroof, e.ic_close_sunroof);
        int i24 = e.ic_all_doors_model_x;
        ACTUATE_ALL_DOORS = new c("ACTUATE_ALL_DOORS", 15, i24, i24);
        int i25 = e.ic_unlatch_driver_door_lhd;
        UNLATCH_DRIVER_DOOR = new c("UNLATCH_DRIVER_DOOR", 16, i25, i25);
        int i26 = e.ic_boombox;
        REMOTE_BOOMBOX = new c("REMOTE_BOOMBOX", 17, i26, i26);
        $VALUES = $values();
    }

    private c(String str, int i11, int i12, int i13) {
        this.disableIcon = i12;
        this.enableIcon = i13;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getIcon(boolean z11, u uVar) {
        u.b m11;
        u.b m12;
        u.b m13;
        if (((uVar == null || (m11 = uVar.m()) == null || !et.a.E(m11)) ? false : true) && et.a.u(uVar) && this == SUMMON) {
            return e.ic_yoke;
        }
        if ((uVar != null ? s.c(uVar.r0(), Boolean.TRUE) : false) && this == UNLATCH_DRIVER_DOOR) {
            return e.ic_unlatch_driver_door_rhd;
        }
        kt.u uVar2 = null;
        if (et.a.R((uVar == null || (m12 = uVar.m()) == null) ? null : m12.h()) && this == FRUNK) {
            return e.ic_frunk_semi;
        }
        if (uVar != null && (m13 = uVar.m()) != null) {
            uVar2 = m13.h();
        }
        if (et.a.R(uVar2) && this == MAX_DEFROST) {
            return e.ic_defrost_semi;
        }
        if (z11) {
            return this.enableIcon;
        }
        return this.disableIcon;
    }
}