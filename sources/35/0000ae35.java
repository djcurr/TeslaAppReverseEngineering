package qm;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.retarget.C$r8$retargetLibraryMember$virtualDispatch$Date$toInstant$dispatchHolder;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f48373a;

    public l(Context context, String str) {
        this.f48373a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j11 = this.f48373a.getLong("fire-count", 0L);
        String str = null;
        String str2 = "";
        for (Map.Entry<String, ?> entry : this.f48373a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = entry.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f48373a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f48373a.edit().putStringSet(str2, hashSet).putLong("fire-count", j11 - 1).commit();
    }

    private synchronized String d(long j11) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C$r8$retargetLibraryMember$virtualDispatch$Date$toInstant$dispatchHolder.toInstant(new Date(j11)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j11));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f48373a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        String e11 = e(str);
        if (e11 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f48373a.getStringSet(e11, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f48373a.edit().remove(e11).commit();
        } else {
            this.f48373a.edit().putStringSet(e11, hashSet).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        SharedPreferences.Editor edit = this.f48373a.edit();
        for (Map.Entry<String, ?> entry : this.f48373a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<m> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f48373a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(m.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    synchronized boolean f(long j11, long j12) {
        return d(j11).equals(d(j12));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        String d11 = d(System.currentTimeMillis());
        this.f48373a.edit().putString("last-used-date", d11).commit();
        h(d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean i(long j11) {
        return j("fire-global", j11);
    }

    synchronized boolean j(String str, long j11) {
        if (this.f48373a.contains(str)) {
            if (f(this.f48373a.getLong(str, -1L), j11)) {
                return false;
            }
            this.f48373a.edit().putLong(str, j11).commit();
            return true;
        }
        this.f48373a.edit().putLong(str, j11).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void k(long j11, String str) {
        String d11 = d(j11);
        if (this.f48373a.getString("last-used-date", "").equals(d11)) {
            return;
        }
        long j12 = this.f48373a.getLong("fire-count", 0L);
        if (j12 + 1 == 30) {
            a();
            j12 = this.f48373a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f48373a.getStringSet(str, new HashSet()));
        hashSet.add(d11);
        this.f48373a.edit().putStringSet(str, hashSet).putLong("fire-count", j12 + 1).putString("last-used-date", d11).commit();
    }

    synchronized void l(long j11) {
        this.f48373a.edit().putLong("fire-global", j11).commit();
    }
}