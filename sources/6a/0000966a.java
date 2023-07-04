package org.bouncycastle.jce.provider;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import e60.l;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import r70.b;
import r70.k;

/* loaded from: classes5.dex */
class CrlCache {
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<l>> cache = Collections.synchronizedMap(new WeakHashMap());

    /* loaded from: classes5.dex */
    private static class LocalCRLStore<T extends CRL> implements l, Iterable {
        private Collection<CRL> _local;

        public LocalCRLStore(r70.l<CRL> lVar) {
            this._local = new ArrayList(lVar.getMatches(null));
        }

        @Override // e60.l, r70.l
        public Collection getMatches(k kVar) {
            if (kVar == null) {
                return new ArrayList(this._local);
            }
            ArrayList arrayList = new ArrayList();
            for (CRL crl : this._local) {
                if (kVar.match(crl)) {
                    arrayList.add(crl);
                }
            }
            return arrayList;
        }

        @Override // java.lang.Iterable
        public Iterator<CRL> iterator() {
            return getMatches(null).iterator();
        }
    }

    CrlCache() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized l getCrl(CertificateFactory certificateFactory, Date date, URI uri) {
        synchronized (CrlCache.class) {
            WeakReference<l> weakReference = cache.get(uri);
            l lVar = weakReference != null ? weakReference.get() : null;
            if (lVar != null) {
                boolean z11 = false;
                Iterator it2 = lVar.getMatches(null).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Date nextUpdate = ((X509CRL) it2.next()).getNextUpdate();
                    if (nextUpdate != null && nextUpdate.before(date)) {
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    return lVar;
                }
            }
            LocalCRLStore localCRLStore = new LocalCRLStore(new b(uri.getScheme().equals("ldap") ? getCrlsFromLDAP(certificateFactory, uri) : getCrls(certificateFactory, uri)));
            cache.put(uri, new WeakReference<>(localCRLStore));
            return localCRLStore;
        }
    }

    private static Collection getCrls(CertificateFactory certificateFactory, URI uri) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uri.toURL().openConnection()));
        httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
        httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
        InputStream inputStream = httpURLConnection.getInputStream();
        Collection<? extends CRL> generateCRLs = certificateFactory.generateCRLs(inputStream);
        inputStream.close();
        return generateCRLs;
    }

    private static Collection getCrlsFromLDAP(CertificateFactory certificateFactory, URI uri) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr == null || bArr.length == 0) {
                throw new CRLException("no CRL returned from: " + uri);
            }
            return certificateFactory.generateCRLs(new ByteArrayInputStream(bArr));
        } catch (NamingException e11) {
            throw new CRLException("issue connecting to: " + uri.toString(), e11);
        }
    }
}