package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import ch.qos.logback.classic.Level;
import com.google.android.datatransport.cct.d;
import com.google.firebase.encoders.EncodingException;
import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.model.PaymentMethod;
import ezvcard.property.Kind;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import oh.j;
import oh.k;
import oh.l;
import oh.m;
import oh.n;
import oh.o;
import oh.p;
import ph.h;
import ph.i;
import qh.k;

/* loaded from: classes3.dex */
public final class d implements k {

    /* renamed from: a */
    private final lm.a f12996a;

    /* renamed from: b */
    private final ConnectivityManager f12997b;

    /* renamed from: c */
    private final Context f12998c;

    /* renamed from: d */
    final URL f12999d;

    /* renamed from: e */
    private final ai.a f13000e;

    /* renamed from: f */
    private final ai.a f13001f;

    /* renamed from: g */
    private final int f13002g;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        final URL f13003a;

        /* renamed from: b */
        final j f13004b;

        /* renamed from: c */
        final String f13005c;

        a(URL url, j jVar, String str) {
            this.f13003a = url;
            this.f13004b = jVar;
            this.f13005c = str;
        }

        a a(URL url) {
            return new a(url, this.f13004b, this.f13005c);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        final int f13006a;

        /* renamed from: b */
        final URL f13007b;

        /* renamed from: c */
        final long f13008c;

        b(int i11, URL url, long j11) {
            this.f13006a = i11;
            this.f13007b = url;
            this.f13008c = j11;
        }
    }

    d(Context context, ai.a aVar, ai.a aVar2, int i11) {
        this.f12996a = j.b();
        this.f12998c = context;
        this.f12997b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f12999d = n(com.google.android.datatransport.cct.a.f12986c);
        this.f13000e = aVar2;
        this.f13001f = aVar;
        this.f13002g = i11;
    }

    public static /* synthetic */ a c(a aVar, b bVar) {
        return l(aVar, bVar);
    }

    public static /* synthetic */ b d(d dVar, a aVar) {
        return dVar.e(aVar);
    }

    public b e(a aVar) {
        uh.a.a("CctTransportBackend", "Making request to: %s", aVar.f13003a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f13003a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f13002g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(NetworkConstantsKt.HEADER_USER_AGENT, String.format("datatransport/%s android/", "3.1.2"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(NetworkConstantsKt.HEADER_CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f13005c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f12996a.a(aVar.f13004b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                uh.a.e("CctTransportBackend", "Status Code: " + responseCode);
                uh.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField(NetworkConstantsKt.HEADER_CONTENT_TYPE));
                uh.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m11 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(m11))).c());
                    if (m11 != null) {
                        m11.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (EncodingException e11) {
            e = e11;
            uh.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e12) {
            e = e12;
            uh.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e13) {
            e = e13;
            uh.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e14) {
            e = e14;
            uh.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.getValue();
        }
        if (o.b.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.getValue();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e11) {
            uh.a.c("CctTransportBackend", "Unable to find version code for package", e11);
            return -1;
        }
    }

    private j i(qh.e eVar) {
        l.a j11;
        HashMap hashMap = new HashMap();
        for (i iVar : eVar.b()) {
            String j12 = iVar.j();
            if (!hashMap.containsKey(j12)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j12, arrayList);
            } else {
                ((List) hashMap.get(j12)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b11 = m.a().f(p.DEFAULT).g(this.f13001f.a()).h(this.f13000e.a()).b(oh.k.a().c(k.b.ANDROID_FIREBASE).b(oh.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b(Kind.DEVICE)).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b11.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b11.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e11 = iVar3.e();
                nh.b b12 = e11.b();
                if (b12.equals(nh.b.b("proto"))) {
                    j11 = l.j(e11.a());
                } else if (b12.equals(nh.b.b("json"))) {
                    j11 = l.i(new String(e11.a(), Charset.forName("UTF-8")));
                } else {
                    uh.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b12);
                }
                j11.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.forNumber(iVar3.g("net-type"))).b(o.b.forNumber(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j11.b(iVar3.d());
                }
                arrayList3.add(j11.a());
            }
            b11.c(arrayList3);
            arrayList2.add(b11.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE);
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f13007b;
        if (url != null) {
            uh.a.a("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.f13007b);
        }
        return null;
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e11) {
            throw new IllegalArgumentException("Invalid url: " + str, e11);
        }
    }

    @Override // qh.k
    public com.google.android.datatransport.runtime.backends.b a(qh.e eVar) {
        j i11 = i(eVar);
        URL url = this.f12999d;
        if (eVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a c11 = com.google.android.datatransport.cct.a.c(eVar.c());
                r3 = c11.d() != null ? c11.d() : null;
                if (c11.e() != null) {
                    url = n(c11.e());
                }
            } catch (IllegalArgumentException unused) {
                return com.google.android.datatransport.runtime.backends.b.a();
            }
        }
        try {
            b bVar = (b) vh.b.a(5, new a(url, i11, r3), new vh.a() { // from class: com.google.android.datatransport.cct.b
                {
                    d.this = this;
                }

                @Override // vh.a
                public final Object apply(Object obj) {
                    return d.d(d.this, (d.a) obj);
                }
            }, new vh.c() { // from class: com.google.android.datatransport.cct.c
                @Override // vh.c
                public final Object a(Object obj, Object obj2) {
                    return d.c((d.a) obj, (d.b) obj2);
                }
            });
            int i12 = bVar.f13006a;
            if (i12 == 200) {
                return com.google.android.datatransport.runtime.backends.b.e(bVar.f13008c);
            }
            if (i12 < 500 && i12 != 404) {
                if (i12 == 400) {
                    return com.google.android.datatransport.runtime.backends.b.d();
                }
                return com.google.android.datatransport.runtime.backends.b.a();
            }
            return com.google.android.datatransport.runtime.backends.b.f();
        } catch (IOException e11) {
            uh.a.c("CctTransportBackend", "Could not make request to the backend", e11);
            return com.google.android.datatransport.runtime.backends.b.f();
        }
    }

    @Override // qh.k
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f12997b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c(Kind.DEVICE, Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f12998c).getSimOperator()).c("application_build", Integer.toString(h(this.f12998c))).d();
    }

    public d(Context context, ai.a aVar, ai.a aVar2) {
        this(context, aVar, aVar2, Level.ERROR_INT);
    }
}