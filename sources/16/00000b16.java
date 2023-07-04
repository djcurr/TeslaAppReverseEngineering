package atd.s;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class j implements atd.i.b {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-140487044164160L);
    }

    @Override // atd.i.b
    public Object a(Context context) {
        JSONArray jSONArray = new JSONArray();
        String string = Settings.Secure.getString(context.getContentResolver(), atd.s0.a.a(-140499929066048L));
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(atd.s0.a.a(-140585828411968L))) {
                jSONArray.put(str);
            }
        }
        return jSONArray;
    }
}