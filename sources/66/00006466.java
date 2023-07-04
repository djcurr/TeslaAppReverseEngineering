package cv;

import com.squareup.wire.ProtoAdapter;
import expo.modules.contacts.EXColumns;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.s;
import lt.w2;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23118a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Charset f23119b = StandardCharsets.ISO_8859_1;

    private a() {
    }

    public final String a(cu.a aVar) {
        s.g(aVar, "<this>");
        byte[] encode = cu.a.f23105h.encode(aVar);
        Charset encodeCharset = f23119b;
        s.f(encodeCharset, "encodeCharset");
        return new String(encode, encodeCharset);
    }

    public final cu.a b(JSONObject jSONObject) {
        s.g(jSONObject, "<this>");
        try {
            w2 c11 = du.j.f24245a.c(jSONObject);
            String optString = jSONObject.optString("id");
            boolean optBoolean = jSONObject.optBoolean("is_predelivery");
            String optString2 = jSONObject.optString("snapshotConfigHash");
            String optString3 = jSONObject.optString(EXColumns.DISPLAY_NAME);
            s.f(optString, "optString(\"id\")");
            s.f(optString2, "optString(\"snapshotConfigHash\")");
            s.f(optString3, "optString(\"display_name\")");
            return new cu.a(optString, optString2, optBoolean, optString3, c11, null, null, null, 224, null);
        } catch (Exception e11) {
            av.a.a().d("parseWidgetVehicleFromJson failed", e11);
            return null;
        }
    }

    public final cu.a c(JSONObject jSONObject) {
        s.g(jSONObject, "<this>");
        try {
            w2 d11 = du.j.f24245a.d(jSONObject);
            String optString = jSONObject.optString("id");
            boolean optBoolean = jSONObject.optBoolean("is_predelivery");
            String optString2 = jSONObject.optString("snapshotConfigHash");
            String optString3 = jSONObject.optString(EXColumns.DISPLAY_NAME);
            s.f(optString, "optString(\"id\")");
            s.f(optString2, "optString(\"snapshotConfigHash\")");
            s.f(optString3, "optString(\"display_name\")");
            return new cu.a(optString, optString2, optBoolean, optString3, d11, null, null, null, 224, null);
        } catch (Exception e11) {
            av.a.a().d("parseWidgetVehicleFromJson failed", e11);
            return null;
        }
    }

    public final cu.a d(String str) {
        s.g(str, "<this>");
        try {
            ProtoAdapter<cu.a> protoAdapter = cu.a.f23105h;
            Charset encodeCharset = f23119b;
            s.f(encodeCharset, "encodeCharset");
            byte[] bytes = str.getBytes(encodeCharset);
            s.f(bytes, "(this as java.lang.String).getBytes(charset)");
            return protoAdapter.decode(bytes);
        } catch (IOException e11) {
            av.a.a().d("decode AppVehicle failed", e11);
            return null;
        }
    }
}