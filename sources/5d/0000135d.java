package com.adyen.threeds2.internal;

import android.text.TextUtils;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum V2_1_0 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d V2_1_0;
    public static final d V2_2_0;
    private final atd.h.a mDataVersion;
    private final String mVersion;

    static {
        String a11 = atd.s0.a.a(-105087923710528L);
        String a12 = atd.s0.a.a(-105092218677824L);
        atd.h.a aVar = atd.h.a.V1_4;
        d dVar = new d(a11, 0, a12, aVar);
        V2_1_0 = dVar;
        d dVar2 = new d(atd.s0.a.a(-105483060701760L), 1, atd.s0.a.a(-105487355669056L), aVar);
        V2_2_0 = dVar2;
        $VALUES = new d[]{dVar, dVar2};
    }

    private d(String str, int i11, String str2, atd.h.a aVar) {
        this.mVersion = str2;
        this.mDataVersion = aVar;
    }

    public static d[] a() {
        return values();
    }

    public static d b(String str) {
        d[] values;
        if (!TextUtils.isEmpty(str)) {
            for (d dVar : values()) {
                if (dVar.c().equals(str)) {
                    return dVar;
                }
            }
        }
        throw atd.y.a.MESSAGE_VERSION.a();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public String c() {
        return a(this.mVersion);
    }

    @Override // java.lang.Enum
    public String toString() {
        return c();
    }

    private String a(String str) {
        return atd.r0.g.a(str);
    }

    public atd.h.a b() {
        return this.mDataVersion;
    }
}