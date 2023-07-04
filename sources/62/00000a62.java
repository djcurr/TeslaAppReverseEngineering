package atd.d;

import android.net.Uri;
import android.os.Parcel;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
class k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(JSONObject jSONObject) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getInt(str);
        } catch (NumberFormatException e11) {
            throw new atd.a0.a(atd.s0.a.a(-94895966317120L) + str, e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b(JSONObject jSONObject, String str) {
        String string = jSONObject.getString(str);
        a(str, string, atd.e.c.DATA_ELEMENT_MISSING);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c(JSONObject jSONObject, String str) {
        String string = jSONObject.getString(str);
        a(str, string, atd.e.c.DATA_ELEMENT_MISSING);
        return a(str, string);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str, null);
        a(str, optString, atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
        return optString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri e(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str, null);
        if (optString == null) {
            return null;
        }
        atd.e.c cVar = atd.e.c.DATA_ELEMENT_INVALID_FORMAT;
        a(str, optString, cVar);
        Uri parse = Uri.parse(optString);
        if (parse.toString().equalsIgnoreCase(optString)) {
            return parse;
        }
        throw new atd.a0.a(atd.s0.a.a(-94191591680576L) + str, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str, null);
        a(str, optString, atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
        if (optString == null) {
            return null;
        }
        return a(str, optString);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k(Parcel parcel) {
    }

    private String a(String str, String str2) {
        try {
            if (UUID.fromString(str2).toString().equalsIgnoreCase(str2)) {
                return str2;
            }
            throw new atd.a0.a(atd.s0.a.a(-94118577236544L) + str, atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
        } catch (IllegalArgumentException e11) {
            throw new atd.a0.a(atd.s0.a.a(-94019792988736L) + str, e11, atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
        }
    }

    private void a(String str, String str2, atd.e.c cVar) {
        if (str2 == null || str2.length() != 0) {
            return;
        }
        throw new atd.a0.a(atd.s0.a.a(-94492239391296L) + str, cVar);
    }
}