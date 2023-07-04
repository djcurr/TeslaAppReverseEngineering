package atd.h;

import android.content.Context;
import atd.i.c;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<atd.h.a, JSONObject> f6869a = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6870a;

        static {
            int[] iArr = new int[atd.h.a.values().length];
            f6870a = iArr;
            try {
                iArr[atd.h.a.V1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6870a[atd.h.a.V1_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private b(Context context, ConfigParameters configParameters, List<Warning> list) {
        JSONArray a11 = a(list);
        for (atd.h.a aVar : atd.h.a.a()) {
            try {
                JSONObject a12 = a(context, aVar, configParameters);
                a12.put(atd.s0.a.a(-85910894733888L), a11);
                this.f6869a.put(aVar, a12);
            } catch (JSONException e11) {
                throw atd.y.c.DEVICE_DATA_FAILURE.a(e11);
            }
        }
    }

    public static b a(Context context, ConfigParameters configParameters, List<Warning> list) {
        return new b(context.getApplicationContext(), configParameters, list);
    }

    private boolean b(Object obj) {
        if (obj == null) {
            return true;
        }
        if ((obj instanceof String) && ((String) obj).isEmpty()) {
            return true;
        }
        if ((obj instanceof JSONArray) && ((JSONArray) obj).length() == 0) {
            return true;
        }
        return (obj instanceof JSONObject) && ((JSONObject) obj).length() == 0;
    }

    public JSONObject a(atd.h.a aVar) {
        if (aVar.c()) {
            JSONObject jSONObject = this.f6869a.get(aVar);
            if (jSONObject != null) {
                return jSONObject;
            }
            throw atd.y.c.DEVICE_DATA_FAILURE.a();
        }
        throw atd.y.c.DEVICE_DATA_FAILURE.a();
    }

    private JSONObject a(Context context, atd.h.a aVar, ConfigParameters configParameters) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        List<atd.i.b> b11 = f.a(aVar).b();
        Collection<String> paramValues = AdyenConfigParameters.getParamValues(configParameters, AdyenConfigParameters.DEVICE_PARAMETER_BLOCK_LIST);
        for (atd.i.b bVar : b11) {
            String a11 = bVar.a();
            if (paramValues != null && paramValues.contains(a11)) {
                jSONObject2.put(a11, c.a.MARKET_OR_REGIONAL_RESTRICTION.a());
            } else {
                try {
                    Object a12 = bVar.a(context);
                    if (b(a12)) {
                        int i11 = a.f6870a[aVar.ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new InvalidInputException(atd.s0.a.a(-85932369570368L) + aVar.toString(), null);
                            }
                            throw new atd.i.c(c.a.PARAMETER_NULL_OR_BLANK, null);
                        }
                        jSONObject.put(a11, a(a12));
                    } else {
                        if (aVar == atd.h.a.V1_4 && !(a12 instanceof JSONArray)) {
                            a12 = a12.toString();
                        }
                        jSONObject.put(a11, a12);
                    }
                } catch (atd.i.c e11) {
                    jSONObject2.put(a11, e11.a());
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(atd.s0.a.a(-86035448785472L), aVar.b());
        jSONObject3.put(atd.s0.a.a(-86022563883584L), jSONObject);
        jSONObject3.put(atd.s0.a.a(-85769160813120L), jSONObject2);
        return jSONObject3;
    }

    private JSONArray a(List<Warning> list) {
        JSONArray jSONArray = new JSONArray();
        for (Warning warning : list) {
            jSONArray.put(warning.getID());
        }
        return jSONArray;
    }

    private Object a(Object obj) {
        return (obj != null && (obj instanceof JSONArray) && ((JSONArray) obj).length() == 0) ? obj : atd.s0.a.a(-85782045715008L);
    }
}