package com.google.android.libraries.places.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzahx {
    public static final zzahx zza;
    public static final zzahx zzb;
    public static final zzahx zzc;
    public static final zzahx zzd;
    public static final zzahx zze;
    public static final zzahx zzf;
    public static final zzahx zzg;
    public static final zzahx zzh;
    public static final zzahx zzi;
    public static final zzahx zzj;
    public static final zzahx zzk;
    public static final zzahx zzl;
    public static final zzahx zzm;
    public static final zzahx zzn;
    public static final zzahx zzo;
    public static final zzahx zzp;
    public static final zzahx zzq;
    public static final zzahx zzr;
    private static final /* synthetic */ zzahx[] zzs;
    private final zzahy zzt;

    static {
        zzahx zzahxVar = new zzahx("DOUBLE", 0, zzahy.DOUBLE, 1);
        zza = zzahxVar;
        zzahx zzahxVar2 = new zzahx("FLOAT", 1, zzahy.FLOAT, 5);
        zzb = zzahxVar2;
        zzahy zzahyVar = zzahy.LONG;
        zzahx zzahxVar3 = new zzahx("INT64", 2, zzahyVar, 0);
        zzc = zzahxVar3;
        zzahx zzahxVar4 = new zzahx("UINT64", 3, zzahyVar, 0);
        zzd = zzahxVar4;
        zzahy zzahyVar2 = zzahy.INT;
        zzahx zzahxVar5 = new zzahx("INT32", 4, zzahyVar2, 0);
        zze = zzahxVar5;
        zzahx zzahxVar6 = new zzahx("FIXED64", 5, zzahyVar, 1);
        zzf = zzahxVar6;
        zzahx zzahxVar7 = new zzahx("FIXED32", 6, zzahyVar2, 5);
        zzg = zzahxVar7;
        zzahx zzahxVar8 = new zzahx("BOOL", 7, zzahy.BOOLEAN, 0);
        zzh = zzahxVar8;
        zzahx zzahxVar9 = new zzahx("STRING", 8, zzahy.STRING, 2);
        zzi = zzahxVar9;
        zzahy zzahyVar3 = zzahy.MESSAGE;
        zzahx zzahxVar10 = new zzahx("GROUP", 9, zzahyVar3, 3);
        zzj = zzahxVar10;
        zzahx zzahxVar11 = new zzahx("MESSAGE", 10, zzahyVar3, 2);
        zzk = zzahxVar11;
        zzahx zzahxVar12 = new zzahx("BYTES", 11, zzahy.BYTE_STRING, 2);
        zzl = zzahxVar12;
        zzahx zzahxVar13 = new zzahx("UINT32", 12, zzahyVar2, 0);
        zzm = zzahxVar13;
        zzahx zzahxVar14 = new zzahx("ENUM", 13, zzahy.ENUM, 0);
        zzn = zzahxVar14;
        zzahx zzahxVar15 = new zzahx("SFIXED32", 14, zzahyVar2, 5);
        zzo = zzahxVar15;
        zzahx zzahxVar16 = new zzahx("SFIXED64", 15, zzahyVar, 1);
        zzp = zzahxVar16;
        zzahx zzahxVar17 = new zzahx("SINT32", 16, zzahyVar2, 0);
        zzq = zzahxVar17;
        zzahx zzahxVar18 = new zzahx("SINT64", 17, zzahyVar, 0);
        zzr = zzahxVar18;
        zzs = new zzahx[]{zzahxVar, zzahxVar2, zzahxVar3, zzahxVar4, zzahxVar5, zzahxVar6, zzahxVar7, zzahxVar8, zzahxVar9, zzahxVar10, zzahxVar11, zzahxVar12, zzahxVar13, zzahxVar14, zzahxVar15, zzahxVar16, zzahxVar17, zzahxVar18};
    }

    private zzahx(String str, int i11, zzahy zzahyVar, int i12) {
        this.zzt = zzahyVar;
    }

    public static zzahx[] values() {
        return (zzahx[]) zzs.clone();
    }

    public final zzahy zza() {
        return this.zzt;
    }
}