package com.google.crypto.tink.shaded.protobuf;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.y;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class s0 {
    private static final String a(String str) {
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

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        } else if (obj instanceof Float) {
            return ((Float) obj).floatValue() == BitmapDescriptorFactory.HUE_RED;
        } else if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof i) {
                return obj.equals(i.f16278b);
            }
            return obj instanceof q0 ? obj == ((q0) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                c(sb2, i11, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c(sb2, i11, str, entry);
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
                sb2.append(k1.c((String) obj));
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof i) {
                sb2.append(": \"");
                sb2.append(k1.a((i) obj));
                sb2.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            } else if (obj instanceof y) {
                sb2.append(" {");
                d((y) obj, sb2, i11 + 2);
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
                c(sb2, i14, Action.KEY_ATTRIBUTE, entry2.getKey());
                c(sb2, i14, "value", entry2.getValue());
                sb2.append("\n");
                while (i12 < i11) {
                    sb2.append(' ');
                    i12++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    private static void d(q0 q0Var, StringBuilder sb2, int i11) {
        Method[] declaredMethods;
        Map.Entry<y.d, Object> next;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : q0Var.getClass().getDeclaredMethods()) {
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
            boolean z11 = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb2, i11, a(str2), y.p(method2, q0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb2, i11, a(str3), y.p(method3, q0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object p11 = y.p(method4, q0Var, new Object[0]);
                    if (method5 == null) {
                        if (b(p11)) {
                            z11 = false;
                        }
                    } else {
                        z11 = ((Boolean) y.p(method5, q0Var, new Object[0])).booleanValue();
                    }
                    if (z11) {
                        c(sb2, i11, a(str4), p11);
                    }
                }
            }
        }
        if (q0Var instanceof y.c) {
            Iterator<Map.Entry<y.d, Object>> r11 = ((y.c) q0Var).extensions.r();
            while (r11.hasNext()) {
                c(sb2, i11, "[" + next.getKey().getNumber() + "]", r11.next().getValue());
            }
        }
        m1 m1Var = ((y) q0Var).unknownFields;
        if (m1Var != null) {
            m1Var.m(sb2, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(q0 q0Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(q0Var, sb2, 0);
        return sb2.toString();
    }
}