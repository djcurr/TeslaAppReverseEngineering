package expo.modules.kotlin.types;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.JSTypeConverter;
import g00.a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.h;
import n00.l;
import n00.o;
import o00.b;
import vz.b0;
import wz.u;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u0014\n\u0002\u0010\u0013\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001e\u0010\u0004\u001a\u00020\u000b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001a%\u0010\u0004\u001a\u00020\u000b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\r\u001a\u0012\u0010\u0004\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u000b*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u0011\u001a\u001e\u0010\u0017\u001a\u00020\u0016*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0000\u001a\u0016\u0010\u0017\u001a\u00020\u0016*\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0000¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/records/Record;", "Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;", "containerProvider", "Lcom/facebook/react/bridge/WritableMap;", "toJSValue", "Landroid/os/Bundle;", "K", "V", "", "T", "", "Lcom/facebook/react/bridge/WritableArray;", "", "([Ljava/lang/Object;Lexpo/modules/kotlin/types/JSTypeConverter$ContainerProvider;)Lcom/facebook/react/bridge/WritableArray;", "", "", "", "", "", "", Action.KEY_ATTRIBUTE, "value", "Lvz/b0;", "putGeneric", "expo-modules-core_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class JSTypeConverterHelperKt {
    public static final void putGeneric(WritableMap writableMap, String key, Object obj) {
        s.g(writableMap, "<this>");
        s.g(key, "key");
        if (obj == null ? true : obj instanceof b0) {
            writableMap.putNull(key);
        } else if (obj instanceof ReadableArray) {
            writableMap.putArray(key, (ReadableArray) obj);
        } else if (obj instanceof ReadableMap) {
            writableMap.putMap(key, (ReadableMap) obj);
        } else if (obj instanceof String) {
            writableMap.putString(key, (String) obj);
        } else if (obj instanceof Integer) {
            writableMap.putInt(key, ((Number) obj).intValue());
        } else if (obj instanceof Number) {
            writableMap.putDouble(key, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(key, ((Boolean) obj).booleanValue());
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalArgumentException("Could not put '" + cls + "' to WritableMap");
        }
    }

    public static final WritableMap toJSValue(Record record, JSTypeConverter.ContainerProvider containerProvider) {
        int t11;
        Object obj;
        s.g(record, "<this>");
        s.g(containerProvider, "containerProvider");
        WritableMap createMap = containerProvider.createMap();
        Collection<o> c11 = b.c(a.e(record.getClass()));
        t11 = x.t(c11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (o oVar : c11) {
            Iterator<T> it2 = oVar.getAnnotations().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((Annotation) obj) instanceof Field) {
                    break;
                }
            }
            Field field = (Field) obj;
            if (field != null) {
                String key = field.key();
                String str = s.c(key, "") ? null : key;
                if (str == null) {
                    str = oVar.getName();
                }
                p00.a.a(oVar, true);
                putGeneric(createMap, str, JSTypeConverter.INSTANCE.convertToJSValue(oVar.get(record), containerProvider));
            }
            arrayList.add(b0.f54756a);
        }
        return createMap;
    }

    public static final void putGeneric(WritableArray writableArray, Object obj) {
        s.g(writableArray, "<this>");
        if (obj == null ? true : obj instanceof b0) {
            writableArray.pushNull();
        } else if (obj instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) obj);
        } else if (obj instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) obj);
        } else if (obj instanceof String) {
            writableArray.pushString((String) obj);
        } else if (obj instanceof Integer) {
            writableArray.pushInt(((Number) obj).intValue());
        } else if (obj instanceof Number) {
            writableArray.pushDouble(((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
        } else {
            Class<?> cls = obj.getClass();
            throw new IllegalArgumentException("Could not put '" + cls + "' to WritableArray");
        }
    }

    public static final WritableMap toJSValue(Bundle bundle, JSTypeConverter.ContainerProvider containerProvider) {
        s.g(bundle, "<this>");
        s.g(containerProvider, "containerProvider");
        WritableMap createMap = containerProvider.createMap();
        for (String key : bundle.keySet()) {
            Object convertToJSValue = JSTypeConverter.INSTANCE.convertToJSValue(bundle.get(key), containerProvider);
            s.f(key, "key");
            putGeneric(createMap, key, convertToJSValue);
        }
        return createMap;
    }

    public static final <K, V> WritableMap toJSValue(Map<K, ? extends V> map, JSTypeConverter.ContainerProvider containerProvider) {
        s.g(map, "<this>");
        s.g(containerProvider, "containerProvider");
        WritableMap createMap = containerProvider.createMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            putGeneric(createMap, String.valueOf(key), JSTypeConverter.INSTANCE.convertToJSValue(entry.getValue(), containerProvider));
        }
        return createMap;
    }

    public static final <T> WritableArray toJSValue(Iterable<? extends T> iterable, JSTypeConverter.ContainerProvider containerProvider) {
        s.g(iterable, "<this>");
        s.g(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        for (T t11 : iterable) {
            putGeneric(createArray, JSTypeConverter.INSTANCE.convertToJSValue(t11, containerProvider));
        }
        return createArray;
    }

    public static final <T> WritableArray toJSValue(T[] tArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.g(tArr, "<this>");
        s.g(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        int length = tArr.length;
        int i11 = 0;
        while (i11 < length) {
            T t11 = tArr[i11];
            i11++;
            putGeneric(createArray, JSTypeConverter.INSTANCE.convertToJSValue(t11, containerProvider));
        }
        return createArray;
    }

    public static final WritableArray toJSValue(int[] iArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.g(iArr, "<this>");
        s.g(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = iArr[i11];
            i11++;
            createArray.pushInt(i12);
        }
        return createArray;
    }

    public static final WritableArray toJSValue(float[] fArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.g(fArr, "<this>");
        s.g(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        int length = fArr.length;
        int i11 = 0;
        while (i11 < length) {
            float f11 = fArr[i11];
            i11++;
            createArray.pushDouble(f11);
        }
        return createArray;
    }

    public static final WritableArray toJSValue(double[] dArr, JSTypeConverter.ContainerProvider containerProvider) {
        s.g(dArr, "<this>");
        s.g(containerProvider, "containerProvider");
        WritableArray createArray = containerProvider.createArray();
        int length = dArr.length;
        int i11 = 0;
        while (i11 < length) {
            double d11 = dArr[i11];
            i11++;
            createArray.pushDouble(d11);
        }
        return createArray;
    }

    public static final Object toJSValue(Enum<?> r42) {
        Object obj;
        s.g(r42, "<this>");
        h d11 = b.d(m0.b(r42.getClass()));
        if (d11 != null) {
            if (d11.getParameters().isEmpty()) {
                return r42.name();
            }
            if (d11.getParameters().size() == 1) {
                String name = ((l) u.b0(d11.getParameters())).getName();
                s.e(name);
                Iterator it2 = b.b(m0.b(r42.getClass())).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (s.c(((o) obj).getName(), name)) {
                        break;
                    }
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Enum<*>, *>");
                return ((o) obj).get(r42);
            }
            Class<?> cls = r42.getClass();
            throw new IllegalStateException("Enum '" + cls + "' cannot be used as return type (incompatible with JS)");
        }
        throw new IllegalArgumentException("Cannot convert enum without the primary constructor to js value".toString());
    }
}