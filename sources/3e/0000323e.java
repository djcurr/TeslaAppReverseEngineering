package com.google.android.libraries.places.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzafk {
    public static final zzafk zza;
    public static final zzafk zzb;
    public static final zzafk zzc;
    public static final zzafk zzd;
    public static final zzafk zze;
    public static final zzafk zzf;
    public static final zzafk zzg;
    public static final zzafk zzh;
    public static final zzafk zzi;
    public static final zzafk zzj;
    private static final /* synthetic */ zzafk[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzafk zzafkVar = new zzafk("VOID", 0, Void.class, Void.class, null);
        zza = zzafkVar;
        Class cls = Integer.TYPE;
        zzafk zzafkVar2 = new zzafk("INT", 1, cls, Integer.class, 0);
        zzb = zzafkVar2;
        zzafk zzafkVar3 = new zzafk("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzafkVar3;
        zzafk zzafkVar4 = new zzafk("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        zzd = zzafkVar4;
        zzafk zzafkVar5 = new zzafk("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzafkVar5;
        zzafk zzafkVar6 = new zzafk("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzafkVar6;
        zzafk zzafkVar7 = new zzafk("STRING", 6, String.class, String.class, "");
        zzg = zzafkVar7;
        zzafk zzafkVar8 = new zzafk("BYTE_STRING", 7, zzaed.class, zzaed.class, zzaed.zzb);
        zzh = zzafkVar8;
        zzafk zzafkVar9 = new zzafk("ENUM", 8, cls, Integer.class, null);
        zzi = zzafkVar9;
        zzafk zzafkVar10 = new zzafk("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzafkVar10;
        zzk = new zzafk[]{zzafkVar, zzafkVar2, zzafkVar3, zzafkVar4, zzafkVar5, zzafkVar6, zzafkVar7, zzafkVar8, zzafkVar9, zzafkVar10};
    }

    private zzafk(String str, int i11, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzafk[] values() {
        return (zzafk[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}