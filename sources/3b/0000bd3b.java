package wu;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.VCard;
import ezvcard.property.Address;
import ezvcard.property.Email;
import ezvcard.property.Telephone;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f56208a = new h();

    private h() {
    }

    public final JSONObject a(Context appContext, Intent intent) {
        Uri uri;
        s.g(appContext, "appContext");
        s.g(intent, "intent");
        try {
            ContentResolver contentResolver = appContext.getContentResolver();
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                s.e(extras);
                uri = (Uri) extras.get("android.intent.extra.STREAM");
            } else {
                uri = null;
            }
            if (uri != null) {
                InputStream openInputStream = contentResolver.openInputStream(uri);
                VCard c11 = vw.a.a(openInputStream).c();
                s.f(c11, "parse(input).first()");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("first_name", c11.o().getGiven());
                jSONObject.put("last_name", c11.o().getFamily());
                if (c11.j() != null) {
                    jSONObject.put("org_name", TextUtils.join(",", c11.j().getValues()));
                }
                List<Telephone> p11 = c11.p();
                s.f(p11, "vCard.getTelephoneNumbers()");
                JSONArray jSONArray = new JSONArray();
                for (Telephone telephone : p11) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", TextUtils.join(",", telephone.getTypes()));
                    jSONObject2.put("phone_number", telephone.getText());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("phone_numbers", jSONArray);
                List<Email> f11 = c11.f();
                s.f(f11, "vCard.getEmails()");
                if (!f11.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (Email email : f11) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", TextUtils.join(",", email.getTypes()));
                        jSONObject3.put("email_address", email.getValue());
                        jSONArray2.put(jSONObject3);
                    }
                    jSONObject.put("email_addresses", jSONArray2);
                }
                List<Address> e11 = c11.e();
                s.f(e11, "vCard.getAddresses()");
                if (!e11.isEmpty()) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (Address address : e11) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("type", TextUtils.join(",", address.getTypes()));
                        jSONObject4.put("address_string", address.getStreetAddress());
                        jSONObject4.put("city", address.getLocality());
                        jSONObject4.put("country", address.getCountry());
                        jSONObject4.put(PlaceTypes.POSTAL_CODE, address.getPostalCode());
                        jSONObject4.put("state", address.getRegion());
                        jSONArray3.put(jSONObject4);
                    }
                    jSONObject.put("postal_addresses", jSONArray3);
                }
                s.e(openInputStream);
                openInputStream.close();
                return jSONObject;
            }
        } catch (IOException | NullPointerException | JSONException unused) {
        }
        return null;
    }
}