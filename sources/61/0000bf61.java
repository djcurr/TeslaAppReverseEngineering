package xg;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.a0;
import com.facebook.react.views.text.p;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a extends p {
    private ReadableMap A;
    private final ge.b B;
    private final Object C;
    private String E;

    /* renamed from: z  reason: collision with root package name */
    private Uri f57373z;
    private float D = Float.NaN;
    private float F = Float.NaN;
    private int G = 0;

    public a(ge.b bVar, Object obj) {
        this.B = bVar;
        this.C = obj;
    }

    private static Uri t1(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public boolean O() {
        return true;
    }

    @Override // com.facebook.react.views.text.p
    public a0 p1() {
        return new b(R().getResources(), (int) Math.ceil(this.F), (int) Math.ceil(this.D), this.G, u1(), s1(), r1(), q1(), this.E);
    }

    public Object q1() {
        return this.C;
    }

    public ge.b r1() {
        return this.B;
    }

    public ReadableMap s1() {
        return this.A;
    }

    @ng.a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.A = readableMap;
    }

    @Override // com.facebook.react.uimanager.i
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.F = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
    }

    @ng.a(name = "resizeMode")
    public void setResizeMode(String str) {
        this.E = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r1.getScheme() == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    @ng.a(name = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L16
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L16
        La:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L17
        L16:
            r4 = r0
        L17:
            if (r4 == 0) goto L2f
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L24
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L2f
            com.facebook.react.uimanager.n0 r0 = r3.R()
            android.net.Uri r0 = t1(r0, r4)
        L2f:
            android.net.Uri r4 = r3.f57373z
            if (r0 == r4) goto L36
            r3.w0()
        L36:
            r3.f57373z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.a.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    @ng.a(customType = "Color", name = "tintColor")
    public void setTintColor(int i11) {
        this.G = i11;
    }

    @Override // com.facebook.react.uimanager.i
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.D = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
    }

    public Uri u1() {
        return this.f57373z;
    }
}