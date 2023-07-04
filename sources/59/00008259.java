package l5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f36602a;

    public e(WorkDatabase workDatabase) {
        this.f36602a = workDatabase;
    }

    public static void b(Context context, v4.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j12 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            gVar.beginTransaction();
            try {
                gVar.P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                gVar.P("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j12)});
                sharedPreferences.edit().clear().apply();
                gVar.N();
            } finally {
                gVar.X();
            }
        }
    }

    public boolean a() {
        Long a11 = this.f36602a.h().a("reschedule_needed");
        return a11 != null && a11.longValue() == 1;
    }

    public void c(boolean z11) {
        this.f36602a.h().b(new k5.d("reschedule_needed", z11));
    }
}