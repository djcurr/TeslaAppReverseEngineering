package r7;

import com.adyen.checkout.cse.exception.EncryptionException;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f49279a = new d();

    /* renamed from: b */
    private static final SimpleDateFormat f49280b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f49280b = simpleDateFormat;
    }

    private d() {
    }

    private final Date a(Date date) {
        return date == null ? new Date() : date;
    }

    public static final String b(String encryptionKey, Object fieldToEncrypt, String publicKey) {
        s.g(encryptionKey, "encryptionKey");
        s.g(fieldToEncrypt, "fieldToEncrypt");
        s.g(publicKey, "publicKey");
        b bVar = new b(publicKey);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(encryptionKey, fieldToEncrypt);
            jSONObject.put("generationtime", d(null, 1, null));
            String a11 = bVar.a(jSONObject.toString());
            s.f(a11, "{\n            val jsonToEncrypt = JSONObject()\n            jsonToEncrypt.put(encryptionKey, fieldToEncrypt)\n            jsonToEncrypt.put(CardEncrypter.GENERATION_TIME_KEY, makeGenerationTime())\n            encrypter.encrypt(jsonToEncrypt.toString())\n        }");
            return a11;
        } catch (JSONException e11) {
            throw new EncryptionException("Encryption failed.", e11);
        }
    }

    public static final String c(Date date) {
        String format = f49280b.format(f49279a.a(date));
        s.f(format, "GENERATION_DATE_FORMAT.format(assureGenerationTime(generationTime))");
        return format;
    }

    public static /* synthetic */ String d(Date date, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            date = null;
        }
        return c(date);
    }
}