package ll;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import hl.l;
import java.io.IOException;
import ol.c0;
import ol.t;
import pl.o;

/* loaded from: classes3.dex */
public final class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences.Editor f37232a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37233b;

    public e(Context context, String str, String str2) {
        if (str != null) {
            this.f37233b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f37232a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.f37232a = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    @Override // hl.l
    public void a(c0 c0Var) {
        if (!this.f37232a.putString(this.f37233b, o.b(c0Var.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // hl.l
    public void b(t tVar) {
        if (!this.f37232a.putString(this.f37233b, o.b(tVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}