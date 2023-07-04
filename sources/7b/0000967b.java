package org.bouncycastle.jce.provider;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import e50.u;
import e50.v;
import e60.o;
import i60.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
import u40.a;
import u40.b;
import u40.e;
import u40.f;
import u40.h;
import u40.j;
import u40.k;
import u40.n;

/* loaded from: classes5.dex */
class OcspCache {
    private static final int DEFAULT_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<Map<b, f>>> cache = Collections.synchronizedMap(new WeakHashMap());

    OcspCache() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f getOcspResponse(b bVar, o oVar, URI uri, X509Certificate x509Certificate, List<Extension> list, c cVar) {
        f fVar;
        g i11;
        WeakReference<Map<b, f>> weakReference = cache.get(uri);
        Map<b, f> map = weakReference != null ? weakReference.get() : null;
        boolean z11 = false;
        if (map != null && (fVar = map.get(bVar)) != null) {
            p i12 = k.e(a.f(l.p(fVar.f().h()).r()).j()).i();
            for (int i13 = 0; i13 != i12.size(); i13++) {
                n h11 = n.h(i12.r(i13));
                if (bVar.equals(h11.e()) && (i11 = h11.i()) != null) {
                    try {
                    } catch (ParseException unused) {
                        map.remove(bVar);
                    }
                    if (oVar.e().after(i11.s())) {
                        map.remove(bVar);
                        fVar = null;
                    }
                }
            }
            if (fVar != null) {
                return fVar;
            }
        }
        try {
            URL url = uri.toURL();
            d dVar = new d();
            dVar.a(new h(bVar, null));
            d dVar2 = new d();
            byte[] bArr = null;
            for (int i14 = 0; i14 != list.size(); i14++) {
                Extension extension = list.get(i14);
                byte[] value = extension.getValue();
                if (u40.d.f53147c.t().equals(extension.getId())) {
                    bArr = value;
                }
                dVar2.a(new u(new org.bouncycastle.asn1.k(extension.getId()), extension.isCritical(), value));
            }
            try {
                byte[] encoded = new e(new u40.o(null, new w0(dVar), v.f(new w0(dVar2))), null).getEncoded();
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(encoded.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(encoded);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = 32768;
                }
                f e11 = f.e(t70.a.d(inputStream, contentLength));
                try {
                    if (e11.h().f() != 0) {
                        throw new CertPathValidatorException("OCSP responder failed: " + e11.h().h(), null, oVar.a(), oVar.b());
                    }
                    j e12 = j.e(e11.f());
                    if (e12.i().j(u40.d.f53146b)) {
                        z11 = ProvOcspRevocationChecker.validatedOcspResponse(a.f(e12.h().r()), oVar, bArr, x509Certificate, cVar);
                    }
                    if (z11) {
                        WeakReference<Map<b, f>> weakReference2 = cache.get(uri);
                        if (weakReference2 != null) {
                            weakReference2.get().put(bVar, e11);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put(bVar, e11);
                            cache.put(uri, new WeakReference<>(hashMap));
                        }
                        return e11;
                    }
                    throw new CertPathValidatorException("OCSP response failed to validate", null, oVar.a(), oVar.b());
                } catch (IOException e13) {
                    e = e13;
                    throw new CertPathValidatorException("configuration error: " + e.getMessage(), e, oVar.a(), oVar.b());
                }
            } catch (IOException e14) {
                e = e14;
            }
        } catch (MalformedURLException e15) {
            throw new CertPathValidatorException("configuration error: " + e15.getMessage(), e15, oVar.a(), oVar.b());
        }
    }
}