package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class b0 {
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 BOOLEAN;
    public static final b0 BYTE_STRING;
    public static final b0 DOUBLE;
    public static final b0 ENUM;
    public static final b0 FLOAT;
    public static final b0 INT;
    public static final b0 LONG;
    public static final b0 MESSAGE;
    public static final b0 STRING;
    public static final b0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        b0 b0Var = new b0("VOID", 0, Void.class, Void.class, null);
        VOID = b0Var;
        Class cls = Integer.TYPE;
        b0 b0Var2 = new b0("INT", 1, cls, Integer.class, 0);
        INT = b0Var2;
        b0 b0Var3 = new b0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = b0Var3;
        b0 b0Var4 = new b0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
        FLOAT = b0Var4;
        b0 b0Var5 = new b0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = b0Var5;
        b0 b0Var6 = new b0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = b0Var6;
        b0 b0Var7 = new b0("STRING", 6, String.class, String.class, "");
        STRING = b0Var7;
        b0 b0Var8 = new b0("BYTE_STRING", 7, i.class, i.class, i.f16278b);
        BYTE_STRING = b0Var8;
        b0 b0Var9 = new b0("ENUM", 8, cls, Integer.class, null);
        ENUM = b0Var9;
        b0 b0Var10 = new b0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = b0Var10;
        $VALUES = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9, b0Var10};
    }

    private b0(String str, int i11, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}