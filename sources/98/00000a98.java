package atd.h0;

import atd.i0.f;
import atd.i0.h;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    private final atd.e0.c f6873c;

    /* renamed from: d  reason: collision with root package name */
    private final List<X509Certificate> f6874d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        super(str);
        try {
            JSONObject d11 = d();
            this.f6873c = atd.e0.d.a(d11.getString(atd.s0.a.a(-797333572610624L)));
            this.f6874d = new ArrayList();
            JSONArray jSONArray = d11.getJSONArray(atd.s0.a.a(-797350752479808L));
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                this.f6874d.add(h.a(jSONArray.getString(i11)));
            }
        } catch (CertificateException | JSONException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    public List<X509Certificate> e() {
        return new ArrayList(this.f6874d);
    }

    public atd.e0.c f() {
        return this.f6873c;
    }
}