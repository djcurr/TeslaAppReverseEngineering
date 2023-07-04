package p7;

import com.adyen.checkout.core.exception.BadModelException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.c;

/* loaded from: classes.dex */
public final class d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends c> T a(JSONObject jSONObject, Class<T> cls) {
        return (T) d(cls).a(jSONObject);
    }

    public static <T extends c> T b(JSONObject jSONObject, c.b<T> bVar) {
        if (jSONObject == null) {
            return null;
        }
        return bVar.a(jSONObject);
    }

    public static <T extends c> List<T> c(JSONArray jSONArray, c.b<T> bVar) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            if (optJSONObject != null) {
                arrayList.add(bVar.a(optJSONObject));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static c.b<?> d(Class<?> cls) {
        try {
            Field field = cls.getField("SERIALIZER");
            if ((field.getModifiers() & 8) != 0) {
                if (c.b.class.isAssignableFrom(field.getType())) {
                    return (c.b) field.get(null);
                }
                throw new BadModelException(cls, null);
            }
            throw new BadModelException(cls, null);
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            throw new BadModelException(cls, e11);
        }
    }

    public static <T extends c> JSONObject e(T t11, c.b<T> bVar) {
        if (t11 == null) {
            return null;
        }
        return bVar.b(t11);
    }

    public static <T extends c> JSONArray f(List<T> list, c.b<T> bVar) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (T t11 : list) {
            jSONArray.put(bVar.b(t11));
        }
        return jSONArray;
    }
}