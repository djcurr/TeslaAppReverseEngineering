package com.facebook.react.uimanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class v0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(e1 e1Var) {
        Map<String, Object> b11 = u0.b();
        b11.put("ViewManagerNames", e1Var.a());
        b11.put("LazyViewManagersEnabled", Boolean.TRUE);
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> b(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> b11 = u0.b();
        Map<? extends String, ? extends Object> a11 = u0.a();
        Map<? extends String, ? extends Object> c11 = u0.c();
        if (map != null) {
            map.putAll(a11);
        }
        if (map2 != null) {
            map2.putAll(c11);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            zg.a.a(0L, "UIManagerModuleConstantsHelper.createConstants").b("ViewManager", name).b("Lazy", Boolean.FALSE).c();
            try {
                Map<String, Object> c12 = c(viewManager, null, null, map, map2);
                if (!c12.isEmpty()) {
                    b11.put(name, c12);
                }
            } finally {
                zg.a.b(0L);
            }
        }
        b11.put("genericBubblingEventTypes", a11);
        b11.put("genericDirectEventTypes", c11);
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap b11 = yf.c.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            e(map3, exportedCustomBubblingEventTypeConstants);
            e(exportedCustomBubblingEventTypeConstants, map);
            b11.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            b11.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            e(map4, exportedCustomDirectEventTypeConstants);
            e(exportedCustomDirectEventTypeConstants, map2);
            b11.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            b11.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            b11.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            b11.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            b11.put("NativeProps", nativeProps);
        }
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> d() {
        return yf.c.e("bubblingEventTypes", u0.a(), "directEventTypes", u0.c());
    }

    private static void e(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                e((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }
}