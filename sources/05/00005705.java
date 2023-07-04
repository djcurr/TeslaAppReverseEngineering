package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.i;
import kotlin.text.k;
import u20.p;
import vz.v;
import wz.s0;

/* loaded from: classes6.dex */
public interface TransformToBankIcon {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final int invoke(String str) {
            Map l11;
            Integer num;
            boolean m11;
            if (str == null) {
                return R.drawable.stripe_ic_bank;
            }
            k kVar = k.IGNORE_CASE;
            l11 = s0.l(v.a(new i("Bank of America", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_boa)), v.a(new i("Capital One", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_capitalone)), v.a(new i("Citibank", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_citi)), v.a(new i("BBVA|COMPASS", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_compass)), v.a(new i("MORGAN CHASE|JP MORGAN|Chase", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_morganchase)), v.a(new i("NAVY FEDERAL CREDIT UNION", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_nfcu)), v.a(new i("PNC\\s?BANK|PNC Bank", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_pnc)), v.a(new i("SUNTRUST|SunTrust Bank", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_suntrust)), v.a(new i("Silicon Valley Bank", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_svb)), v.a(new i("Stripe|TestInstitution", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_stripe)), v.a(new i("TD Bank", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_td)), v.a(new i("USAA FEDERAL SAVINGS BANK|USAA Bank", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_usaa)), v.a(new i("U\\.?S\\. BANK|US Bank", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_usbank)), v.a(new i("Wells Fargo", kVar), Integer.valueOf(R.drawable.stripe_ic_bank_wellsfargo)));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = l11.entrySet().iterator();
            while (true) {
                num = null;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                m11 = p.m(i.e((i) entry.getKey(), str, 0, 2, null));
                if (m11) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Integer num2 = (Integer) ((Map.Entry) it3.next()).getValue();
                if (num2 != null) {
                    num = num2;
                    break;
                }
            }
            if (num == null) {
                return R.drawable.stripe_ic_bank;
            }
            return num.intValue();
        }
    }
}