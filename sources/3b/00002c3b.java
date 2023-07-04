package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zztr uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zzfs {
    private static final zzfs zztr;
    private static final zzfs zzts;
    private static final zzfs zztt;
    private static final zzfs zztu;
    private static final zzfs zztv;
    private static final zzfs zztw;
    private static final zzfs zztx;
    private static final zzfs zzty;
    private static final zzfs zztz;
    private static final zzfs zzua;
    private static final zzfs zzub;
    private static final zzfs zzuc;
    private static final zzfs zzud;
    private static final zzfs zzue;
    private static final zzfs zzuf;
    private static final zzfs zzug;
    private static final zzfs zzuh;
    private static final zzfs zzui;
    private static final zzfs zzuj;
    private static final zzfs zzuk;
    private static final zzfs zzul;
    private static final zzfs zzum;
    private static final zzfs zzun;
    private static final zzfs zzuo;
    private static final zzfs zzup;
    private static final zzfs zzuq;
    private static final zzfs zzur;
    private static final zzfs zzus;
    private static final zzfs zzut;
    private static final zzfs zzuu;
    private static final zzfs zzuv;
    private static final zzfs zzuw;
    private static final zzfs zzux;
    private static final zzfs zzuy;
    private static final zzfs zzuz;
    public static final zzfs zzva;
    private static final zzfs zzvb;
    private static final zzfs zzvc;
    private static final zzfs zzvd;
    private static final zzfs zzve;
    private static final zzfs zzvf;
    private static final zzfs zzvg;
    private static final zzfs zzvh;
    private static final zzfs zzvi;
    private static final zzfs zzvj;
    private static final zzfs zzvk;
    private static final zzfs zzvl;
    private static final zzfs zzvm;
    public static final zzfs zzvn;
    private static final zzfs zzvo;
    private static final zzfs zzvp;
    private static final zzfs[] zzvu;
    private static final Type[] zzvv;
    private static final /* synthetic */ zzfs[] zzvw;

    /* renamed from: id  reason: collision with root package name */
    private final int f14805id;
    private final zzgh zzvq;
    private final zzfu zzvr;
    private final Class<?> zzvs;
    private final boolean zzvt;

    static {
        zzfu zzfuVar = zzfu.SCALAR;
        zzgh zzghVar = zzgh.zzxv;
        zzfs zzfsVar = new zzfs("DOUBLE", 0, 0, zzfuVar, zzghVar);
        zztr = zzfsVar;
        zzgh zzghVar2 = zzgh.zzxu;
        zzfs zzfsVar2 = new zzfs("FLOAT", 1, 1, zzfuVar, zzghVar2);
        zzts = zzfsVar2;
        zzgh zzghVar3 = zzgh.zzxt;
        zzfs zzfsVar3 = new zzfs("INT64", 2, 2, zzfuVar, zzghVar3);
        zztt = zzfsVar3;
        zzfs zzfsVar4 = new zzfs("UINT64", 3, 3, zzfuVar, zzghVar3);
        zztu = zzfsVar4;
        zzgh zzghVar4 = zzgh.zzxs;
        zzfs zzfsVar5 = new zzfs("INT32", 4, 4, zzfuVar, zzghVar4);
        zztv = zzfsVar5;
        zzfs zzfsVar6 = new zzfs("FIXED64", 5, 5, zzfuVar, zzghVar3);
        zztw = zzfsVar6;
        zzfs zzfsVar7 = new zzfs("FIXED32", 6, 6, zzfuVar, zzghVar4);
        zztx = zzfsVar7;
        zzgh zzghVar5 = zzgh.zzxw;
        zzfs zzfsVar8 = new zzfs("BOOL", 7, 7, zzfuVar, zzghVar5);
        zzty = zzfsVar8;
        zzgh zzghVar6 = zzgh.zzxx;
        zzfs zzfsVar9 = new zzfs("STRING", 8, 8, zzfuVar, zzghVar6);
        zztz = zzfsVar9;
        zzgh zzghVar7 = zzgh.zzya;
        zzfs zzfsVar10 = new zzfs("MESSAGE", 9, 9, zzfuVar, zzghVar7);
        zzua = zzfsVar10;
        zzgh zzghVar8 = zzgh.zzxy;
        zzfs zzfsVar11 = new zzfs("BYTES", 10, 10, zzfuVar, zzghVar8);
        zzub = zzfsVar11;
        zzfs zzfsVar12 = new zzfs("UINT32", 11, 11, zzfuVar, zzghVar4);
        zzuc = zzfsVar12;
        zzgh zzghVar9 = zzgh.zzxz;
        zzfs zzfsVar13 = new zzfs("ENUM", 12, 12, zzfuVar, zzghVar9);
        zzud = zzfsVar13;
        zzfs zzfsVar14 = new zzfs("SFIXED32", 13, 13, zzfuVar, zzghVar4);
        zzue = zzfsVar14;
        zzfs zzfsVar15 = new zzfs("SFIXED64", 14, 14, zzfuVar, zzghVar3);
        zzuf = zzfsVar15;
        zzfs zzfsVar16 = new zzfs("SINT32", 15, 15, zzfuVar, zzghVar4);
        zzug = zzfsVar16;
        zzfs zzfsVar17 = new zzfs("SINT64", 16, 16, zzfuVar, zzghVar3);
        zzuh = zzfsVar17;
        zzfs zzfsVar18 = new zzfs("GROUP", 17, 17, zzfuVar, zzghVar7);
        zzui = zzfsVar18;
        zzfu zzfuVar2 = zzfu.VECTOR;
        zzfs zzfsVar19 = new zzfs("DOUBLE_LIST", 18, 18, zzfuVar2, zzghVar);
        zzuj = zzfsVar19;
        zzfs zzfsVar20 = new zzfs("FLOAT_LIST", 19, 19, zzfuVar2, zzghVar2);
        zzuk = zzfsVar20;
        zzfs zzfsVar21 = new zzfs("INT64_LIST", 20, 20, zzfuVar2, zzghVar3);
        zzul = zzfsVar21;
        zzfs zzfsVar22 = new zzfs("UINT64_LIST", 21, 21, zzfuVar2, zzghVar3);
        zzum = zzfsVar22;
        zzfs zzfsVar23 = new zzfs("INT32_LIST", 22, 22, zzfuVar2, zzghVar4);
        zzun = zzfsVar23;
        zzfs zzfsVar24 = new zzfs("FIXED64_LIST", 23, 23, zzfuVar2, zzghVar3);
        zzuo = zzfsVar24;
        zzfs zzfsVar25 = new zzfs("FIXED32_LIST", 24, 24, zzfuVar2, zzghVar4);
        zzup = zzfsVar25;
        zzfs zzfsVar26 = new zzfs("BOOL_LIST", 25, 25, zzfuVar2, zzghVar5);
        zzuq = zzfsVar26;
        zzfs zzfsVar27 = new zzfs("STRING_LIST", 26, 26, zzfuVar2, zzghVar6);
        zzur = zzfsVar27;
        zzfs zzfsVar28 = new zzfs("MESSAGE_LIST", 27, 27, zzfuVar2, zzghVar7);
        zzus = zzfsVar28;
        zzfs zzfsVar29 = new zzfs("BYTES_LIST", 28, 28, zzfuVar2, zzghVar8);
        zzut = zzfsVar29;
        zzfs zzfsVar30 = new zzfs("UINT32_LIST", 29, 29, zzfuVar2, zzghVar4);
        zzuu = zzfsVar30;
        zzfs zzfsVar31 = new zzfs("ENUM_LIST", 30, 30, zzfuVar2, zzghVar9);
        zzuv = zzfsVar31;
        zzfs zzfsVar32 = new zzfs("SFIXED32_LIST", 31, 31, zzfuVar2, zzghVar4);
        zzuw = zzfsVar32;
        zzfs zzfsVar33 = new zzfs("SFIXED64_LIST", 32, 32, zzfuVar2, zzghVar3);
        zzux = zzfsVar33;
        zzfs zzfsVar34 = new zzfs("SINT32_LIST", 33, 33, zzfuVar2, zzghVar4);
        zzuy = zzfsVar34;
        zzfs zzfsVar35 = new zzfs("SINT64_LIST", 34, 34, zzfuVar2, zzghVar3);
        zzuz = zzfsVar35;
        zzfu zzfuVar3 = zzfu.PACKED_VECTOR;
        zzfs zzfsVar36 = new zzfs("DOUBLE_LIST_PACKED", 35, 35, zzfuVar3, zzghVar);
        zzva = zzfsVar36;
        zzfs zzfsVar37 = new zzfs("FLOAT_LIST_PACKED", 36, 36, zzfuVar3, zzghVar2);
        zzvb = zzfsVar37;
        zzfs zzfsVar38 = new zzfs("INT64_LIST_PACKED", 37, 37, zzfuVar3, zzghVar3);
        zzvc = zzfsVar38;
        zzfs zzfsVar39 = new zzfs("UINT64_LIST_PACKED", 38, 38, zzfuVar3, zzghVar3);
        zzvd = zzfsVar39;
        zzfs zzfsVar40 = new zzfs("INT32_LIST_PACKED", 39, 39, zzfuVar3, zzghVar4);
        zzve = zzfsVar40;
        zzfs zzfsVar41 = new zzfs("FIXED64_LIST_PACKED", 40, 40, zzfuVar3, zzghVar3);
        zzvf = zzfsVar41;
        zzfs zzfsVar42 = new zzfs("FIXED32_LIST_PACKED", 41, 41, zzfuVar3, zzghVar4);
        zzvg = zzfsVar42;
        zzfs zzfsVar43 = new zzfs("BOOL_LIST_PACKED", 42, 42, zzfuVar3, zzghVar5);
        zzvh = zzfsVar43;
        zzfs zzfsVar44 = new zzfs("UINT32_LIST_PACKED", 43, 43, zzfuVar3, zzghVar4);
        zzvi = zzfsVar44;
        zzfs zzfsVar45 = new zzfs("ENUM_LIST_PACKED", 44, 44, zzfuVar3, zzghVar9);
        zzvj = zzfsVar45;
        zzfs zzfsVar46 = new zzfs("SFIXED32_LIST_PACKED", 45, 45, zzfuVar3, zzghVar4);
        zzvk = zzfsVar46;
        zzfs zzfsVar47 = new zzfs("SFIXED64_LIST_PACKED", 46, 46, zzfuVar3, zzghVar3);
        zzvl = zzfsVar47;
        zzfs zzfsVar48 = new zzfs("SINT32_LIST_PACKED", 47, 47, zzfuVar3, zzghVar4);
        zzvm = zzfsVar48;
        zzfs zzfsVar49 = new zzfs("SINT64_LIST_PACKED", 48, 48, zzfuVar3, zzghVar3);
        zzvn = zzfsVar49;
        zzfs zzfsVar50 = new zzfs("GROUP_LIST", 49, 49, zzfuVar2, zzghVar7);
        zzvo = zzfsVar50;
        zzfs zzfsVar51 = new zzfs("MAP", 50, 50, zzfu.MAP, zzgh.zzxr);
        zzvp = zzfsVar51;
        zzvw = new zzfs[]{zzfsVar, zzfsVar2, zzfsVar3, zzfsVar4, zzfsVar5, zzfsVar6, zzfsVar7, zzfsVar8, zzfsVar9, zzfsVar10, zzfsVar11, zzfsVar12, zzfsVar13, zzfsVar14, zzfsVar15, zzfsVar16, zzfsVar17, zzfsVar18, zzfsVar19, zzfsVar20, zzfsVar21, zzfsVar22, zzfsVar23, zzfsVar24, zzfsVar25, zzfsVar26, zzfsVar27, zzfsVar28, zzfsVar29, zzfsVar30, zzfsVar31, zzfsVar32, zzfsVar33, zzfsVar34, zzfsVar35, zzfsVar36, zzfsVar37, zzfsVar38, zzfsVar39, zzfsVar40, zzfsVar41, zzfsVar42, zzfsVar43, zzfsVar44, zzfsVar45, zzfsVar46, zzfsVar47, zzfsVar48, zzfsVar49, zzfsVar50, zzfsVar51};
        zzvv = new Type[0];
        zzfs[] values = values();
        zzvu = new zzfs[values.length];
        for (zzfs zzfsVar52 : values) {
            zzvu[zzfsVar52.f14805id] = zzfsVar52;
        }
    }

    private zzfs(String str, int i11, int i12, zzfu zzfuVar, zzgh zzghVar) {
        int i13;
        this.f14805id = i12;
        this.zzvr = zzfuVar;
        this.zzvq = zzghVar;
        int i14 = zzft.zzvx[zzfuVar.ordinal()];
        boolean z11 = true;
        if (i14 == 1) {
            this.zzvs = zzghVar.zzfq();
        } else if (i14 != 2) {
            this.zzvs = null;
        } else {
            this.zzvs = zzghVar.zzfq();
        }
        this.zzvt = (zzfuVar != zzfu.SCALAR || (i13 = zzft.zzvy[zzghVar.ordinal()]) == 1 || i13 == 2 || i13 == 3) ? false : z11;
    }

    public static zzfs[] values() {
        return (zzfs[]) zzvw.clone();
    }

    public final int id() {
        return this.f14805id;
    }
}