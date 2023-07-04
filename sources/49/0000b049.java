package r7;

import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f49281a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49282b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49283c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49284d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49285e;

    /* renamed from: f  reason: collision with root package name */
    private final Date f49286f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f49287a;

        /* renamed from: b  reason: collision with root package name */
        private String f49288b;

        /* renamed from: c  reason: collision with root package name */
        private String f49289c;

        /* renamed from: d  reason: collision with root package name */
        private String f49290d;

        /* renamed from: e  reason: collision with root package name */
        private String f49291e;

        /* renamed from: f  reason: collision with root package name */
        private Date f49292f;

        private String b(String str) {
            if (str != null) {
                return str.replaceAll("\\s", "");
            }
            return null;
        }

        public e a() {
            return new e(this.f49287a, this.f49288b, this.f49289c, this.f49291e, this.f49290d, this.f49292f);
        }

        public a c(String str) {
            this.f49291e = b(str);
            return this;
        }

        public a d(String str) {
            this.f49288b = b(str);
            return this;
        }

        public a e(String str) {
            this.f49289c = b(str);
            return this;
        }

        public a f(String str) {
            this.f49287a = b(str);
            return this;
        }
    }

    public e(String str, String str2, String str3, String str4, String str5, Date date) {
        this.f49281a = str;
        this.f49282b = str2;
        this.f49283c = str3;
        this.f49284d = str4;
        this.f49285e = str5;
        this.f49286f = date;
    }

    public String a() {
        return this.f49284d;
    }

    public String b() {
        return this.f49282b;
    }

    public String c() {
        return this.f49283c;
    }

    public String d() {
        return this.f49281a;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Date date = this.f49286f;
            if (date != null) {
                jSONObject.put("generationtime", r7.a.f49271a.format(date));
            }
            String str = this.f49281a;
            if (str != null) {
                jSONObject.put("number", str.substring(0, 3));
            }
            jSONObject.putOpt("holderName", this.f49285e);
            return jSONObject.toString();
        } catch (JSONException e11) {
            throw new RuntimeException("UnencryptedCard toString() failed.", e11);
        }
    }
}