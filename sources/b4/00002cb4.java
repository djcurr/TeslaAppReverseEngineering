package com.google.android.gms.internal.vision;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class zzju {
    private static void zza(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        Field[] fields;
        if (obj != null) {
            if (obj instanceof zzjt) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(zzs(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (type.isArray() && type.getComponentType() != Byte.TYPE) {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i11 = 0; i11 < length2; i11++) {
                                zza(name, Array.get(obj2, i11), stringBuffer, stringBuffer2);
                            }
                        } else {
                            zza(name, obj2, stringBuffer, stringBuffer2);
                        }
                    }
                }
                for (Method method : cls.getMethods()) {
                    String name2 = method.getName();
                    if (name2.startsWith("set")) {
                        String substring = name2.substring(3);
                        try {
                            String valueOf = String.valueOf(substring);
                            if (((Boolean) cls.getMethod(valueOf.length() != 0 ? "has".concat(valueOf) : new String("has"), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                String valueOf2 = String.valueOf(substring);
                                zza(substring, cls.getMethod(valueOf2.length() != 0 ? "get".concat(valueOf2) : new String("get"), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                    return;
                }
                return;
            }
            String zzs = zzs(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(zzs);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.startsWith("http") && str2.length() > 200) {
                    str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
                }
                int length3 = str2.length();
                StringBuilder sb2 = new StringBuilder(length3);
                for (int i12 = 0; i12 < length3; i12++) {
                    char charAt = str2.charAt(i12);
                    if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                        sb2.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                    } else {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                stringBuffer2.append("\"");
                stringBuffer2.append(sb3);
                stringBuffer2.append("\"");
            } else if (obj instanceof byte[]) {
                stringBuffer2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                for (byte b11 : (byte[]) obj) {
                    int i13 = b11 & 255;
                    if (i13 == 92 || i13 == 34) {
                        stringBuffer2.append(CoreConstants.ESCAPE_CHAR);
                        stringBuffer2.append((char) i13);
                    } else if (i13 < 32 || i13 >= 127) {
                        stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i13)));
                    } else {
                        stringBuffer2.append((char) i13);
                    }
                }
                stringBuffer2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    public static <T extends zzjt> String zzb(T t11) {
        if (t11 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            zza(null, t11, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e11) {
            String valueOf = String.valueOf(e11.getMessage());
            return valueOf.length() != 0 ? "Error printing proto: ".concat(valueOf) : new String("Error printing proto: ");
        } catch (InvocationTargetException e12) {
            String valueOf2 = String.valueOf(e12.getMessage());
            return valueOf2.length() != 0 ? "Error printing proto: ".concat(valueOf2) : new String("Error printing proto: ");
        }
    }

    private static String zzs(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (i11 == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }
}