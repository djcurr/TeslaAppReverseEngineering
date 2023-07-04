package at;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private static g f6725b;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<SharedPreferences.Editor> f6726a = new ArrayList<>();

    public static synchronized g c() {
        g gVar;
        synchronized (g.class) {
            if (f6725b == null) {
                f6725b = new g();
            }
            gVar = f6725b;
        }
        return gVar;
    }

    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences("non_secure", 0);
    }

    public static SharedPreferences i(Context context) {
        return context.getSharedPreferences("secure", 0);
    }

    public static SharedPreferences j(Context context) {
        return context.getSharedPreferences("svc_data", 0);
    }

    public boolean a(SharedPreferences sharedPreferences, boolean z11) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        if (!z11) {
            this.f6726a.add(edit);
        }
        return !z11 || edit.commit();
    }

    public boolean b() {
        Iterator<SharedPreferences.Editor> it2 = this.f6726a.iterator();
        while (true) {
            boolean z11 = true;
            while (it2.hasNext()) {
                if (!it2.next().commit() || !z11) {
                    z11 = false;
                }
            }
            this.f6726a.clear();
            return z11;
        }
    }

    public long e(String str, SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong(str, 0L);
    }

    public Set<String> f(String str, SharedPreferences sharedPreferences) {
        return sharedPreferences.getStringSet(str, null);
    }

    public String g(String str, SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(str)) {
            try {
                return sharedPreferences.getString(str, null);
            } catch (Exception unused) {
                Map<String, ?> all = sharedPreferences.getAll();
                if (all.containsKey(str)) {
                    return all.get(str).toString();
                }
                return null;
            }
        }
        return null;
    }

    public Set<String> h(String str, SharedPreferences sharedPreferences, Set<String> set) {
        return sharedPreferences.getStringSet(str, set);
    }

    public long k(String str, long j11, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong(str, j11);
        edit.apply();
        return j11;
    }

    public Set<String> l(String str, Set<String> set, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet(str, set);
        edit.apply();
        return set;
    }

    public void m(String str, Set<String> set, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet(str, set);
        edit.commit();
    }
}