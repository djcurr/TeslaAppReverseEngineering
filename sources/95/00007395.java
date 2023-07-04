package hn;

import android.content.Context;
import com.google.firebase.perf.v1.PerfMetric;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class e {
    private static List<e> a(PerfMetric perfMetric, Context context) {
        ArrayList arrayList = new ArrayList();
        if (perfMetric.hasTraceMetric()) {
            arrayList.add(new d(perfMetric.getTraceMetric()));
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            arrayList.add(new c(perfMetric.getNetworkRequestMetric(), context));
        }
        if (perfMetric.hasApplicationInfo()) {
            arrayList.add(new a(perfMetric.getApplicationInfo()));
        }
        if (perfMetric.hasGaugeMetric()) {
            arrayList.add(new b(perfMetric.getGaugeMetric()));
        }
        return arrayList;
    }

    public static boolean b(PerfMetric perfMetric, Context context) {
        List<e> a11 = a(perfMetric, context);
        if (a11.isEmpty()) {
            fn.a.e().a("No validators found for PerfMetric.");
            return false;
        }
        for (e eVar : a11) {
            if (!eVar.c()) {
                return false;
            }
        }
        return true;
    }

    public static String d(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        String value = entry.getValue();
        if (key == null) {
            return "Attribute key must not be null";
        }
        if (value == null) {
            return "Attribute value must not be null";
        }
        if (key.length() > 40) {
            return String.format(Locale.US, "Attribute key length must not exceed %d characters", 40);
        }
        if (value.length() > 100) {
            return String.format(Locale.US, "Attribute value length must not exceed %d characters", 100);
        }
        if (key.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            return null;
        }
        return "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_";
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (str.startsWith("_")) {
            for (com.google.firebase.perf.util.b bVar : com.google.firebase.perf.util.b.values()) {
                if (bVar.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
        return null;
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (str.startsWith("_")) {
            for (com.google.firebase.perf.util.c cVar : com.google.firebase.perf.util.c.values()) {
                if (cVar.toString().equals(str)) {
                    return null;
                }
            }
            if (str.startsWith("_st_")) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
        return null;
    }

    public abstract boolean c();
}