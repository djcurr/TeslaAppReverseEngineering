package com.stripe.android.core.model.parsers;

import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.n0;
import wz.w;
import wz.x;

/* loaded from: classes2.dex */
public interface ModelJsonParser<ModelType extends StripeModel> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final List<String> jsonArrayToList(JSONArray jSONArray) {
            i r11;
            int t11;
            ArrayList arrayList;
            List<String> i11;
            if (jSONArray == null) {
                arrayList = null;
            } else {
                r11 = l.r(0, jSONArray.length());
                t11 = x.t(r11, 10);
                ArrayList arrayList2 = new ArrayList(t11);
                Iterator<Integer> it2 = r11.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(jSONArray.getString(((n0) it2).a()));
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                i11 = w.i();
                return i11;
            }
            return arrayList;
        }
    }

    ModelType parse(JSONObject jSONObject);
}