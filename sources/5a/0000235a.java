package com.google.android.gms.internal.measurement;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzli {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzlg zzlgVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzlgVar, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzb(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb2, i11, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb2, i11, str, entry);
            }
        } else {
            sb2.append('\n');
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzmg.zza(zziy.zzm((String) obj)));
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof zziy) {
                sb2.append(": \"");
                sb2.append(zzmg.zza((zziy) obj));
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof zzjz) {
                sb2.append(" {");
                zzd((zzjz) obj, sb2, i11 + 2);
                sb2.append("\n");
                while (i12 < i11) {
                    sb2.append(' ');
                    i12++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i14 = i11 + 2;
                zzb(sb2, i14, Action.KEY_ATTRIBUTE, entry2.getKey());
                zzb(sb2, i14, "value", entry2.getValue());
                sb2.append("\n");
                while (i12 < i11) {
                    sb2.append(' ');
                    i12++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static void zzd(zzlg zzlgVar, StringBuilder sb2, int i11) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzlgVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i11, zzc(concat), zzjz.zzbC(method2, zzlgVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i11, zzc(concat2), zzjz.zzbC(method3, zzlgVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object zzbC = zzjz.zzbC(method4, zzlgVar, new Object[0]);
                    if (method5 == null) {
                        if (zzbC instanceof Boolean) {
                            if (((Boolean) zzbC).booleanValue()) {
                                zzb(sb2, i11, zzc(concat3), zzbC);
                            }
                        } else if (zzbC instanceof Integer) {
                            if (((Integer) zzbC).intValue() != 0) {
                                zzb(sb2, i11, zzc(concat3), zzbC);
                            }
                        } else if (zzbC instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbC).floatValue()) != 0) {
                                zzb(sb2, i11, zzc(concat3), zzbC);
                            }
                        } else if (zzbC instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzbC).doubleValue()) != 0) {
                                zzb(sb2, i11, zzc(concat3), zzbC);
                            }
                        } else {
                            if (zzbC instanceof String) {
                                equals = zzbC.equals("");
                            } else if (zzbC instanceof zziy) {
                                equals = zzbC.equals(zziy.zzb);
                            } else if (zzbC instanceof zzlg) {
                                if (zzbC != ((zzlg) zzbC).zzbJ()) {
                                    zzb(sb2, i11, zzc(concat3), zzbC);
                                }
                            } else {
                                if ((zzbC instanceof Enum) && ((Enum) zzbC).ordinal() == 0) {
                                }
                                zzb(sb2, i11, zzc(concat3), zzbC);
                            }
                            if (!equals) {
                                zzb(sb2, i11, zzc(concat3), zzbC);
                            }
                        }
                    } else if (((Boolean) zzjz.zzbC(method5, zzlgVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i11, zzc(concat3), zzbC);
                    }
                }
            }
        }
        if (!(zzlgVar instanceof zzjw)) {
            zzmj zzmjVar = ((zzjz) zzlgVar).zzc;
            if (zzmjVar != null) {
                zzmjVar.zzg(sb2, i11);
                return;
            }
            return;
        }
        zzjw zzjwVar = (zzjw) zzlgVar;
        throw null;
    }
}