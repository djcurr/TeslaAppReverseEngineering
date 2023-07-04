package ll;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.shaded.protobuf.p;
import hl.k;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import ol.c0;
import ol.t;
import pl.o;

/* loaded from: classes3.dex */
public final class d implements k {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f37230a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37231b;

    public d(Context context, String str, String str2) {
        if (str != null) {
            this.f37231b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.f37230a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                return;
            } else {
                this.f37230a = applicationContext.getSharedPreferences(str2, 0);
                return;
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    private byte[] b() {
        try {
            String string = this.f37230a.getString(this.f37231b, null);
            if (string != null) {
                return o.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f37231b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f37231b));
        }
    }

    @Override // hl.k
    public t a() {
        return t.H(b(), p.b());
    }

    @Override // hl.k
    public c0 read() {
        return c0.M(b(), p.b());
    }
}