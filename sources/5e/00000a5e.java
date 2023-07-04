package atd.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class h extends k {

    /* renamed from: e  reason: collision with root package name */
    private static final Collection<String> f6805e = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    private final String f6806a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6807b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6808c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f6809d;

    h(JSONObject jSONObject) {
        super(jSONObject);
        try {
            String b11 = b(jSONObject, atd.s0.a.a(-97125054343744L));
            this.f6806a = b11;
            if (b11.length() <= 64) {
                String b12 = b(jSONObject, atd.s0.a.a(-96429269641792L));
                this.f6807b = b12;
                if (b12.length() <= 64) {
                    boolean z11 = jSONObject.getBoolean(atd.s0.a.a(-96257470949952L));
                    this.f6808c = z11;
                    if (z11 && !f6805e.contains(b12)) {
                        throw new atd.a0.a(atd.s0.a.a(-96339075328576L), atd.e.c.MESSAGE_EXTENSION_MISSING);
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject(atd.s0.a.a(-96506579053120L));
                    this.f6809d = jSONObject2;
                    if (jSONObject2.toString().length() > 8059) {
                        throw new atd.a0.a(atd.s0.a.a(-96519463955008L), atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
                    }
                    return;
                }
                throw new atd.a0.a(atd.s0.a.a(-96416384739904L), atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
            }
            throw new atd.a0.a(atd.s0.a.a(-97137939245632L), atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-95810794351168L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<h> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(new h(jSONArray.getJSONObject(i11)));
        }
        return arrayList;
    }
}