package com.stripe.android.cards;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.k;
import vz.m;
import wz.e0;
import wz.x;
import wz.x0;
import zz.d;

/* loaded from: classes2.dex */
public final class DefaultCardAccountRangeStore implements CardAccountRangeStore {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String PREF_FILE = "InMemoryCardAccountRangeSource.Store";
    @Deprecated
    private static final String PREF_KEY_ACCOUNT_RANGES = "key_account_ranges";
    private final AccountRangeJsonParser accountRangeJsonParser;
    private final Context context;
    private final k prefs$delegate;

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DefaultCardAccountRangeStore(Context context) {
        k a11;
        s.g(context, "context");
        this.context = context;
        this.accountRangeJsonParser = new AccountRangeJsonParser();
        a11 = m.a(new DefaultCardAccountRangeStore$prefs$2(this));
        this.prefs$delegate = a11;
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object contains(Bin bin, d<? super Boolean> dVar) {
        return b.a(getPrefs().contains(createPrefKey$payments_core_release(bin)));
    }

    public final String createPrefKey$payments_core_release(Bin bin) {
        s.g(bin, "bin");
        return s.p("key_account_ranges:", bin);
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object get(Bin bin, d<? super List<AccountRange>> dVar) {
        Set<String> stringSet = getPrefs().getStringSet(createPrefKey$payments_core_release(bin), null);
        if (stringSet == null) {
            stringSet = x0.d();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringSet) {
            AccountRange parse = this.accountRangeJsonParser.parse(new JSONObject(str));
            if (parse != null) {
                arrayList.add(parse);
            }
        }
        return arrayList;
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public void save(Bin bin, List<AccountRange> accountRanges) {
        int t11;
        Set<String> S0;
        s.g(bin, "bin");
        s.g(accountRanges, "accountRanges");
        t11 = x.t(accountRanges, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (AccountRange accountRange : accountRanges) {
            arrayList.add(this.accountRangeJsonParser.serialize(accountRange).toString());
        }
        S0 = e0.S0(arrayList);
        getPrefs().edit().putStringSet(createPrefKey$payments_core_release(bin), S0).apply();
    }
}