package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class, Map<String, m>> f12293a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, m> f12294b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends ThreadLocal<Object[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12295a;

        a(int i11) {
            this.f12295a = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Object[] initialValue() {
            return new Object[this.f12295a];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b extends m {
        public b(ng.a aVar, Method method) {
            super(aVar, "Array", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends m {

        /* renamed from: i  reason: collision with root package name */
        private final boolean f12296i;

        public c(ng.a aVar, Method method, boolean z11) {
            super(aVar, "boolean", method, (a) null);
            this.f12296i = z11;
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            return obj == null ? this.f12296i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d extends m {
        public d(ng.a aVar, Method method) {
            super(aVar, "boolean", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class e extends m {
        public e(ng.a aVar, Method method) {
            super(aVar, "mixed", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                return ColorPropConverter.getColor(obj, context);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class f extends m {
        public f(ng.a aVar, Method method) {
            super(aVar, "number", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            if (obj != null) {
                if (obj instanceof Double) {
                    return Integer.valueOf(((Double) obj).intValue());
                }
                return (Integer) obj;
            }
            return null;
        }

        public f(ng.b bVar, Method method, int i11) {
            super(bVar, "number", method, i11, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class g extends m {

        /* renamed from: i  reason: collision with root package name */
        private final int f12297i;

        public g(ng.a aVar, Method method, int i11) {
            super(aVar, "mixed", method, (a) null);
            this.f12297i = i11;
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            if (obj == null) {
                return Integer.valueOf(this.f12297i);
            }
            return ColorPropConverter.getColor(obj, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class i extends m {
        public i(ng.a aVar, Method method) {
            super(aVar, "mixed", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            return obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }

        public i(ng.b bVar, Method method, int i11) {
            super(bVar, "mixed", method, i11, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class l extends m {
        public l(ng.a aVar, Method method) {
            super(aVar, "Map", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class m {

        /* renamed from: e  reason: collision with root package name */
        private static final ThreadLocal<Object[]> f12301e = f1.e(2);

        /* renamed from: f  reason: collision with root package name */
        private static final ThreadLocal<Object[]> f12302f = f1.e(3);

        /* renamed from: g  reason: collision with root package name */
        private static final ThreadLocal<Object[]> f12303g = f1.e(1);

        /* renamed from: h  reason: collision with root package name */
        private static final ThreadLocal<Object[]> f12304h = f1.e(2);

        /* renamed from: a  reason: collision with root package name */
        protected final String f12305a;

        /* renamed from: b  reason: collision with root package name */
        protected final String f12306b;

        /* renamed from: c  reason: collision with root package name */
        protected final Method f12307c;

        /* renamed from: d  reason: collision with root package name */
        protected final Integer f12308d;

        /* synthetic */ m(ng.a aVar, String str, Method method, a aVar2) {
            this(aVar, str, method);
        }

        public String a() {
            return this.f12305a;
        }

        public String b() {
            return this.f12306b;
        }

        protected abstract Object c(Object obj, Context context);

        public void d(c0 c0Var, Object obj) {
            Object[] objArr;
            try {
                if (this.f12308d == null) {
                    objArr = f12303g.get();
                    objArr[0] = c(obj, c0Var.R());
                } else {
                    objArr = f12304h.get();
                    objArr[0] = this.f12308d;
                    objArr[1] = c(obj, c0Var.R());
                }
                this.f12307c.invoke(c0Var, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th2) {
                nd.a.g(ViewManager.class, "Error while updating prop " + this.f12305a, th2);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f12305a + "' in shadow node of type: " + c0Var.u(), th2);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            Object[] objArr;
            try {
                if (this.f12308d == null) {
                    objArr = f12301e.get();
                    objArr[0] = view;
                    objArr[1] = c(obj, view.getContext());
                } else {
                    objArr = f12302f.get();
                    objArr[0] = view;
                    objArr[1] = this.f12308d;
                    objArr[2] = c(obj, view.getContext());
                }
                this.f12307c.invoke(viewManager, objArr);
                Arrays.fill(objArr, (Object) null);
            } catch (Throwable th2) {
                nd.a.g(ViewManager.class, "Error while updating prop " + this.f12305a, th2);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.f12305a + "' of a view managed by: " + viewManager.getName(), th2);
            }
        }

        /* synthetic */ m(ng.b bVar, String str, Method method, int i11, a aVar) {
            this(bVar, str, method, i11);
        }

        private m(ng.a aVar, String str, Method method) {
            this.f12305a = aVar.name();
            this.f12306b = "__default_type__".equals(aVar.customType()) ? str : aVar.customType();
            this.f12307c = method;
            this.f12308d = null;
        }

        private m(ng.b bVar, String str, Method method, int i11) {
            this.f12305a = bVar.names()[i11];
            this.f12306b = "__default_type__".equals(bVar.customType()) ? str : bVar.customType();
            this.f12307c = method;
            this.f12308d = Integer.valueOf(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class n extends m {
        public n(ng.a aVar, Method method) {
            super(aVar, "String", method, (a) null);
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static void b() {
        f12293a.clear();
        f12294b.clear();
    }

    private static m c(ng.a aVar, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new i(aVar, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(aVar, method, aVar.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            if ("Color".equals(aVar.customType())) {
                return new g(aVar, method, aVar.defaultInt());
            }
            return new k(aVar, method, aVar.defaultInt());
        } else if (cls == Float.TYPE) {
            return new j(aVar, method, aVar.defaultFloat());
        } else {
            if (cls == Double.TYPE) {
                return new h(aVar, method, aVar.defaultDouble());
            }
            if (cls == String.class) {
                return new n(aVar, method);
            }
            if (cls == Boolean.class) {
                return new d(aVar, method);
            }
            if (cls == Integer.class) {
                if ("Color".equals(aVar.customType())) {
                    return new e(aVar, method);
                }
                return new f(aVar, method);
            } else if (cls == ReadableArray.class) {
                return new b(aVar, method);
            } else {
                if (cls == ReadableMap.class) {
                    return new l(aVar, method);
                }
                throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
            }
        }
    }

    private static void d(ng.b bVar, Method method, Class<?> cls, Map<String, m> map) {
        String[] names = bVar.names();
        int i11 = 0;
        if (cls == Dynamic.class) {
            while (i11 < names.length) {
                map.put(names[i11], new i(bVar, method, i11));
                i11++;
            }
        } else if (cls == Integer.TYPE) {
            while (i11 < names.length) {
                map.put(names[i11], new k(bVar, method, i11, bVar.defaultInt()));
                i11++;
            }
        } else if (cls == Float.TYPE) {
            while (i11 < names.length) {
                map.put(names[i11], new j(bVar, method, i11, bVar.defaultFloat()));
                i11++;
            }
        } else if (cls == Double.TYPE) {
            while (i11 < names.length) {
                map.put(names[i11], new h(bVar, method, i11, bVar.defaultDouble()));
                i11++;
            }
        } else if (cls == Integer.class) {
            while (i11 < names.length) {
                map.put(names[i11], new f(bVar, method, i11));
                i11++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ThreadLocal<Object[]> e(int i11) {
        if (i11 <= 0) {
            return null;
        }
        return new a(i11);
    }

    private static void f(Class<? extends c0> cls, Map<String, m> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            ng.a aVar = (ng.a) method.getAnnotation(ng.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(aVar.name(), c(aVar, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            ng.b bVar = (ng.b) method.getAnnotation(ng.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 2) {
                    if (parameterTypes2[0] == Integer.TYPE) {
                        d(bVar, method, parameterTypes2[1], map);
                    } else {
                        throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                    }
                } else {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    private static void g(Class<? extends ViewManager> cls, Map<String, m> map) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            ng.a aVar = (ng.a) method.getAnnotation(ng.a.class);
            if (aVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 2) {
                    if (View.class.isAssignableFrom(parameterTypes[0])) {
                        map.put(aVar.name(), c(aVar, method, parameterTypes[1]));
                    } else {
                        throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                    }
                } else {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
            ng.b bVar = (ng.b) method.getAnnotation(ng.b.class);
            if (bVar != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 3) {
                    if (View.class.isAssignableFrom(parameterTypes2[0])) {
                        if (parameterTypes2[1] == Integer.TYPE) {
                            d(bVar, method, parameterTypes2[2], map);
                        } else {
                            throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                        }
                    } else {
                        throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                    }
                } else {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, m> h(Class<? extends c0> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == c0.class) {
                return f12294b;
            }
        }
        Map<Class, Map<String, m>> map = f12293a;
        Map<String, m> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(h(cls.getSuperclass()));
        f(cls, hashMap);
        map.put(cls, hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, m> i(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return f12294b;
        }
        Map<Class, Map<String, m>> map = f12293a;
        Map<String, m> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(i(cls.getSuperclass()));
        g(cls, hashMap);
        map.put(cls, hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class h extends m {

        /* renamed from: i  reason: collision with root package name */
        private final double f12298i;

        public h(ng.a aVar, Method method, double d11) {
            super(aVar, "number", method, (a) null);
            this.f12298i = d11;
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.f12298i : ((Double) obj).doubleValue());
        }

        public h(ng.b bVar, Method method, int i11, double d11) {
            super(bVar, "number", method, i11, null);
            this.f12298i = d11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class j extends m {

        /* renamed from: i  reason: collision with root package name */
        private final float f12299i;

        public j(ng.a aVar, Method method, float f11) {
            super(aVar, "number", method, (a) null);
            this.f12299i = f11;
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.f12299i : Float.valueOf(((Double) obj).floatValue()).floatValue());
        }

        public j(ng.b bVar, Method method, int i11, float f11) {
            super(bVar, "number", method, i11, null);
            this.f12299i = f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class k extends m {

        /* renamed from: i  reason: collision with root package name */
        private final int f12300i;

        public k(ng.a aVar, Method method, int i11) {
            super(aVar, "number", method, (a) null);
            this.f12300i = i11;
        }

        @Override // com.facebook.react.uimanager.f1.m
        protected Object c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.f12300i : Integer.valueOf(((Double) obj).intValue()).intValue());
        }

        public k(ng.b bVar, Method method, int i11, int i12) {
            super(bVar, "number", method, i11, null);
            this.f12300i = i12;
        }
    }
}