package net.time4j.format;

import java.lang.Comparable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class d<V extends Comparable<V>> extends net.time4j.engine.e<V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f41040a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("YEAR_OF_DISPLAY", "L_year");
        hashMap.put("MONTH_AS_NUMBER", "L_month");
        hashMap.put("HOUR_FROM_0_TO_24", "L_hour");
        hashMap.put("DAY_OF_MONTH", "L_day");
        hashMap.put("DAY_OF_DIVISION", "L_day");
        f41040a = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(String str) {
        super(str);
    }
}