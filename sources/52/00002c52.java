package com.google.android.gms.internal.vision;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzxs uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzgh {
    public static final zzgh zzxr;
    public static final zzgh zzxs;
    public static final zzgh zzxt;
    public static final zzgh zzxu;
    public static final zzgh zzxv;
    public static final zzgh zzxw;
    public static final zzgh zzxx;
    public static final zzgh zzxy;
    public static final zzgh zzxz;
    public static final zzgh zzya;
    private static final /* synthetic */ zzgh[] zzye;
    private final Class<?> zzyb;
    private final Class<?> zzyc;
    private final Object zzyd;

    static {
        zzgh zzghVar = new zzgh("VOID", 0, Void.class, Void.class, null);
        zzxr = zzghVar;
        Class cls = Integer.TYPE;
        zzgh zzghVar2 = new zzgh("INT", 1, cls, Integer.class, 0);
        zzxs = zzghVar2;
        zzgh zzghVar3 = new zzgh("LONG", 2, Long.TYPE, Long.class, 0L);
        zzxt = zzghVar3;
        zzgh zzghVar4 = new zzgh("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        zzxu = zzghVar4;
        zzgh zzghVar5 = new zzgh("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zzxv = zzghVar5;
        zzgh zzghVar6 = new zzgh("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzxw = zzghVar6;
        zzgh zzghVar7 = new zzgh("STRING", 6, String.class, String.class, "");
        zzxx = zzghVar7;
        zzgh zzghVar8 = new zzgh("BYTE_STRING", 7, zzeo.class, zzeo.class, zzeo.zzrx);
        zzxy = zzghVar8;
        zzgh zzghVar9 = new zzgh("ENUM", 8, cls, Integer.class, null);
        zzxz = zzghVar9;
        zzgh zzghVar10 = new zzgh("MESSAGE", 9, Object.class, Object.class, null);
        zzya = zzghVar10;
        zzye = new zzgh[]{zzghVar, zzghVar2, zzghVar3, zzghVar4, zzghVar5, zzghVar6, zzghVar7, zzghVar8, zzghVar9, zzghVar10};
    }

    private zzgh(String str, int i11, Class cls, Class cls2, Object obj) {
        this.zzyb = cls;
        this.zzyc = cls2;
        this.zzyd = obj;
    }

    public static zzgh[] values() {
        return (zzgh[]) zzye.clone();
    }

    public final Class<?> zzfq() {
        return this.zzyc;
    }
}