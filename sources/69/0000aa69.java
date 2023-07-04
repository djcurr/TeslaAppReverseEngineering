package p7;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    static {
        new a();
    }

    private a() {
    }

    public static final List<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int length = jSONArray.length();
        if (length > 0) {
            while (true) {
                int i12 = i11 + 1;
                String optString = jSONArray.optString(i11, null);
                if (optString != null) {
                    arrayList.add(optString);
                }
                if (i12 >= length) {
                    break;
                }
                i11 = i12;
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static final JSONObject b(Parcel parcel) {
        s.g(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt == 1) {
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                return new JSONObject(readString);
            }
            throw new IllegalArgumentException("Invalid flag.");
        }
        return null;
    }

    public static final JSONArray c(List<String> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            if (!(str == null || str.length() == 0)) {
                arrayList.add(obj);
            }
        }
        for (String str2 : arrayList) {
            jSONArray.put(str2);
        }
        return jSONArray;
    }

    public static final void d(Parcel parcel, JSONObject jSONObject) {
        s.g(parcel, "parcel");
        if (jSONObject == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(jSONObject.toString());
    }
}