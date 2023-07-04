package com.google.android.gms.internal.vision;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzabw uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public class zzjd {
    public static final zzjd zzabu;
    public static final zzjd zzabv;
    public static final zzjd zzabw;
    public static final zzjd zzabx;
    public static final zzjd zzaby;
    public static final zzjd zzabz;
    public static final zzjd zzaca;
    public static final zzjd zzacb;
    public static final zzjd zzacc;
    public static final zzjd zzacd;
    public static final zzjd zzace;
    public static final zzjd zzacf;
    public static final zzjd zzacg;
    public static final zzjd zzach;
    public static final zzjd zzaci;
    public static final zzjd zzacj;
    public static final zzjd zzack;
    public static final zzjd zzacl;
    private static final /* synthetic */ zzjd[] zzaco;
    private final zzji zzacm;
    private final int zzacn;

    static {
        zzjd zzjdVar = new zzjd("DOUBLE", 0, zzji.DOUBLE, 1);
        zzabu = zzjdVar;
        zzjd zzjdVar2 = new zzjd("FLOAT", 1, zzji.FLOAT, 5);
        zzabv = zzjdVar2;
        zzji zzjiVar = zzji.LONG;
        zzjd zzjdVar3 = new zzjd("INT64", 2, zzjiVar, 0);
        zzabw = zzjdVar3;
        zzjd zzjdVar4 = new zzjd("UINT64", 3, zzjiVar, 0);
        zzabx = zzjdVar4;
        zzji zzjiVar2 = zzji.INT;
        zzjd zzjdVar5 = new zzjd("INT32", 4, zzjiVar2, 0);
        zzaby = zzjdVar5;
        zzjd zzjdVar6 = new zzjd("FIXED64", 5, zzjiVar, 1);
        zzabz = zzjdVar6;
        zzjd zzjdVar7 = new zzjd("FIXED32", 6, zzjiVar2, 5);
        zzaca = zzjdVar7;
        zzjd zzjdVar8 = new zzjd("BOOL", 7, zzji.BOOLEAN, 0);
        zzacb = zzjdVar8;
        final zzji zzjiVar3 = zzji.STRING;
        zzjd zzjdVar9 = new zzjd("STRING", 8, zzjiVar3, 2) { // from class: com.google.android.gms.internal.vision.zzje
        };
        zzacc = zzjdVar9;
        final zzji zzjiVar4 = zzji.MESSAGE;
        zzjd zzjdVar10 = new zzjd("GROUP", 9, zzjiVar4, 3) { // from class: com.google.android.gms.internal.vision.zzjf
        };
        zzacd = zzjdVar10;
        zzjd zzjdVar11 = new zzjd("MESSAGE", 10, zzjiVar4, 2) { // from class: com.google.android.gms.internal.vision.zzjg
        };
        zzace = zzjdVar11;
        final zzji zzjiVar5 = zzji.BYTE_STRING;
        zzjd zzjdVar12 = new zzjd("BYTES", 11, zzjiVar5, 2) { // from class: com.google.android.gms.internal.vision.zzjh
        };
        zzacf = zzjdVar12;
        zzjd zzjdVar13 = new zzjd("UINT32", 12, zzjiVar2, 0);
        zzacg = zzjdVar13;
        zzjd zzjdVar14 = new zzjd("ENUM", 13, zzji.ENUM, 0);
        zzach = zzjdVar14;
        zzjd zzjdVar15 = new zzjd("SFIXED32", 14, zzjiVar2, 5);
        zzaci = zzjdVar15;
        zzjd zzjdVar16 = new zzjd("SFIXED64", 15, zzjiVar, 1);
        zzacj = zzjdVar16;
        zzjd zzjdVar17 = new zzjd("SINT32", 16, zzjiVar2, 0);
        zzack = zzjdVar17;
        zzjd zzjdVar18 = new zzjd("SINT64", 17, zzjiVar, 0);
        zzacl = zzjdVar18;
        zzaco = new zzjd[]{zzjdVar, zzjdVar2, zzjdVar3, zzjdVar4, zzjdVar5, zzjdVar6, zzjdVar7, zzjdVar8, zzjdVar9, zzjdVar10, zzjdVar11, zzjdVar12, zzjdVar13, zzjdVar14, zzjdVar15, zzjdVar16, zzjdVar17, zzjdVar18};
    }

    private zzjd(String str, int i11, zzji zzjiVar, int i12) {
        this.zzacm = zzjiVar;
        this.zzacn = i12;
    }

    public static zzjd[] values() {
        return (zzjd[]) zzaco.clone();
    }

    public final zzji zzho() {
        return this.zzacm;
    }

    public final int zzhp() {
        return this.zzacn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjd(String str, int i11, zzji zzjiVar, int i12, zzjc zzjcVar) {
        this(str, i11, zzjiVar, i12);
    }
}