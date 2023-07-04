package atd.d;

import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class j extends k {

    /* renamed from: a  reason: collision with root package name */
    private final atd.e.d f6817a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6818b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6819c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6820d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6821e;

    /* renamed from: f  reason: collision with root package name */
    private final List<h> f6822f;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6823a;

        static {
            int[] iArr = new int[atd.e.d.values().length];
            f6823a = iArr;
            try {
                iArr[atd.e.d.CHALLENGE_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6823a[atd.e.d.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.f6817a = atd.e.d.a(b(jSONObject, atd.s0.a.a(-95630405724736L)));
            this.f6818b = b(jSONObject, atd.s0.a.a(-95407067425344L));
            this.f6819c = c(jSONObject, atd.s0.a.a(-95480081869376L));
            this.f6820d = g(jSONObject, atd.s0.a.a(-94737052527168L));
            this.f6821e = c(jSONObject, atd.s0.a.a(-94792887102016L));
            JSONArray optJSONArray = jSONObject.optJSONArray(atd.s0.a.a(-94573843769920L));
            List<h> a11 = optJSONArray != null ? h.a(optJSONArray) : null;
            this.f6822f = a11;
            if (a11 != null && a11.size() > 10) {
                throw new atd.a0.a(String.format(Locale.ENGLISH, atd.s0.a.a(-94638268279360L), Integer.valueOf(a11.size())), atd.e.c.DATA_ELEMENT_INVALID_FORMAT);
            }
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-95007635466816L), e11, atd.e.c.DATA_ELEMENT_MISSING);
        }
    }

    public static j a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(atd.s0.a.a(-95346937883200L));
            int i11 = a.f6823a[atd.e.d.a(string).ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return new e(jSONObject);
                }
                throw new atd.a0.a(atd.s0.a.a(-95527326509632L) + string, atd.e.c.MESSAGE_RECEIVED_INVALID);
            }
            return new c(jSONObject);
        } catch (JSONException e11) {
            throw new atd.a0.a(atd.s0.a.a(-95123599583808L), e11, atd.e.c.MESSAGE_RECEIVED_INVALID);
        }
    }

    public atd.e.d b() {
        return this.f6817a;
    }

    public String c() {
        return this.f6818b;
    }

    public String d() {
        return this.f6821e;
    }

    public String e() {
        return this.f6819c;
    }

    public abstract boolean f();

    abstract String g(JSONObject jSONObject, String str);

    public String a() {
        return this.f6820d;
    }
}