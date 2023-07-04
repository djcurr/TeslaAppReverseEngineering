package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
final class zzagi {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzagg zzaggVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzaggVar, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i11, String str, Object obj) {
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
            zzc(i11, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i12 = 1; i12 < str.length(); i12++) {
                    char charAt = str.charAt(i12);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzahg.zza(zzaed.zzl((String) obj)));
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof zzaed) {
                sb2.append(": \"");
                sb2.append(zzahg.zza((zzaed) obj));
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof zzaey) {
                sb2.append(" {");
                zzd((zzaey) obj, sb2, i11 + 2);
                sb2.append("\n");
                zzc(i11, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i11 + 2;
                zzb(sb2, i13, Action.KEY_ATTRIBUTE, entry2.getKey());
                zzb(sb2, i13, "value", entry2.getValue());
                sb2.append("\n");
                zzc(i11, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void zzc(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(zza, 0, i12);
            i11 -= i12;
        }
    }

    private static void zzd(zzagg zzaggVar, StringBuilder sb2, int i11) {
        int i12;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzaggVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i12 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i12);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i11, substring.substring(0, substring.length() - 4), zzaey.zzE(method2, zzaggVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i11, substring.substring(0, substring.length() - 3), zzaey.zzE(method, zzaggVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzE = zzaey.zzE(method4, zzaggVar, new Object[0]);
                    if (method5 == null) {
                        if (zzE instanceof Boolean) {
                            if (!((Boolean) zzE).booleanValue()) {
                            }
                            zzb(sb2, i11, substring, zzE);
                        } else if (zzE instanceof Integer) {
                            if (((Integer) zzE).intValue() == 0) {
                            }
                            zzb(sb2, i11, substring, zzE);
                        } else if (zzE instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzE).floatValue()) == 0) {
                            }
                            zzb(sb2, i11, substring, zzE);
                        } else if (zzE instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzE).doubleValue()) == 0) {
                            }
                            zzb(sb2, i11, substring, zzE);
                        } else {
                            if (zzE instanceof String) {
                                equals = zzE.equals("");
                            } else if (zzE instanceof zzaed) {
                                equals = zzE.equals(zzaed.zzb);
                            } else if (zzE instanceof zzagg) {
                                if (zzE == ((zzagg) zzE).zzt()) {
                                }
                                zzb(sb2, i11, substring, zzE);
                            } else {
                                if ((zzE instanceof Enum) && ((Enum) zzE).ordinal() == 0) {
                                }
                                zzb(sb2, i11, substring, zzE);
                            }
                            if (equals) {
                            }
                            zzb(sb2, i11, substring, zzE);
                        }
                    } else {
                        if (!((Boolean) zzaey.zzE(method5, zzaggVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i11, substring, zzE);
                    }
                }
            }
            i12 = 3;
        }
        if (!(zzaggVar instanceof zzaew)) {
            zzahj zzahjVar = ((zzaey) zzaggVar).zzc;
            if (zzahjVar != null) {
                zzahjVar.zzg(sb2, i11);
                return;
            }
            return;
        }
        zzaew zzaewVar = (zzaew) zzaggVar;
        throw null;
    }
}