package com.stripe.android.model.parsers;

import com.stripe.android.cards.Bin;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import wz.n0;

/* loaded from: classes6.dex */
public final class CardMetadataJsonParser implements ModelJsonParser<CardMetadata> {
    private final AccountRangeJsonParser accountRangeJsonParser;
    private final Bin bin;

    public CardMetadataJsonParser(Bin bin) {
        s.g(bin, "bin");
        this.bin = bin;
        this.accountRangeJsonParser = new AccountRangeJsonParser();
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public CardMetadata parse(JSONObject json) {
        i r11;
        s.g(json, "json");
        JSONArray optJSONArray = json.optJSONArray(MessageExtension.FIELD_DATA);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        r11 = l.r(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            int a11 = ((n0) it2).a();
            AccountRangeJsonParser accountRangeJsonParser = this.accountRangeJsonParser;
            JSONObject jSONObject = optJSONArray.getJSONObject(a11);
            s.f(jSONObject, "data.getJSONObject(it)");
            AccountRange parse = accountRangeJsonParser.parse(jSONObject);
            if (parse != null) {
                arrayList.add(parse);
            }
        }
        return new CardMetadata(this.bin, arrayList);
    }
}