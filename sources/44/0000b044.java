package r7;

import com.adyen.checkout.cse.exception.EncryptionException;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final SimpleDateFormat f49271a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f49271a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public static String a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("binValue", str);
            jSONObject.put("generationtime", d.c(new Date()));
            return new b(str2).a(jSONObject.toString());
        } catch (JSONException e11) {
            throw new EncryptionException("Failed to created encrypted JSON data.", e11);
        }
    }

    public static c b(e eVar, String str) {
        String str2;
        String str3;
        try {
            String b11 = eVar.d() != null ? d.b("number", eVar.d(), str) : null;
            if (eVar.b() != null && eVar.c() != null) {
                str2 = d.b("expiryMonth", eVar.b(), str);
                str3 = d.b("expiryYear", eVar.c(), str);
            } else if (eVar.b() != null || eVar.c() != null) {
                throw new EncryptionException("Both expiryMonth and expiryYear need to be set for encryption.", null);
            } else {
                str2 = null;
                str3 = null;
            }
            return new c(b11, str2, str3, eVar.a() != null ? d.b("cvc", eVar.a(), str) : null);
        } catch (EncryptionException | IllegalStateException e11) {
            throw new EncryptionException(e11.getMessage() == null ? "No message." : e11.getMessage(), e11);
        }
    }
}