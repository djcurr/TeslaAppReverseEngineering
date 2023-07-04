package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
class l {

    /* renamed from: a  reason: collision with root package name */
    private static Field f1242a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1243b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f1244c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f1245d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f1246e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f1247f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f1248g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f1249h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Resources resources) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return;
        }
        if (i11 >= 24) {
            d(resources);
        } else if (i11 >= 23) {
            c(resources);
        } else if (i11 >= 21) {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        if (!f1243b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1242a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e11);
            }
            f1243b = true;
        }
        Field field = f1242a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e12);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        if (!f1243b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1242a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e11);
            }
            f1243b = true;
        }
        Object obj = null;
        Field field = f1242a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e12);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f1249h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1248g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
            }
            f1249h = true;
        }
        Field field = f1248g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f1243b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f1242a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
            }
            f1243b = true;
        }
        Field field2 = f1242a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e14) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    private static void e(Object obj) {
        if (!f1245d) {
            try {
                f1244c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e11) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e11);
            }
            f1245d = true;
        }
        Class<?> cls = f1244c;
        if (cls == null) {
            return;
        }
        if (!f1247f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1246e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e12);
            }
            f1247f = true;
        }
        Field field = f1246e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e13) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e13);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}