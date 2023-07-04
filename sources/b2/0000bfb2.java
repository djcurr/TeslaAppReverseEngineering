package xn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class m extends vn.h {

    /* renamed from: q  reason: collision with root package name */
    private final ArrayList<String> f57621q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f57622r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f57623s;

    /* renamed from: t  reason: collision with root package name */
    private HashMap<e, GroundOverlay> f57624t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<xn.b> f57625u;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private final String f57626a;

        public a(String str) {
            this.f57626a = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) FirebasePerfUrlConnection.getContent(new URL(this.f57626a)));
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f57626a);
            } catch (IOException e11) {
                Log.e("KmlRenderer", "Image [" + this.f57626a + "] download issue", e11);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e("KmlRenderer", "Image at this URL could not be found " + this.f57626a);
                return;
            }
            m.this.B(this.f57626a, bitmap);
            if (m.this.z()) {
                m mVar = m.this;
                mVar.X(this.f57626a, mVar.f57624t, true);
                m mVar2 = m.this;
                mVar2.W(this.f57626a, mVar2.f57625u, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private final String f57628a;

        public b(String str) {
            this.f57628a = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) FirebasePerfUrlConnection.getContent(new URL(this.f57628a)));
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f57628a);
            } catch (IOException e11) {
                e11.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e("KmlRenderer", "Image at this URL could not be found " + this.f57628a);
                return;
            }
            m.this.B(this.f57628a, bitmap);
            if (m.this.z()) {
                m mVar = m.this;
                mVar.a0(this.f57628a, mVar.q());
                m mVar2 = m.this;
                mVar2.T(this.f57628a, mVar2.f57625u);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(GoogleMap googleMap, Context context) {
        super(googleMap, context);
        this.f57621q = new ArrayList<>();
        this.f57622r = false;
        this.f57623s = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(String str, Iterable<xn.b> iterable) {
        for (xn.b bVar : iterable) {
            a0(str, bVar.d());
            if (bVar.i()) {
                T(str, bVar.a());
            }
        }
    }

    private void U(Iterable<xn.b> iterable, boolean z11) {
        for (xn.b bVar : iterable) {
            boolean f02 = f0(bVar, z11);
            if (bVar.h() != null) {
                D(bVar.h());
            }
            if (bVar.g() != null) {
                super.n(bVar.g(), y());
            }
            V(bVar, f02);
            if (bVar.i()) {
                U(bVar.a(), f02);
            }
        }
    }

    private void V(xn.b bVar, boolean z11) {
        for (j jVar : bVar.c()) {
            boolean z12 = z11 && vn.h.w(jVar);
            if (jVar.a() != null) {
                String b11 = jVar.b();
                vn.c a11 = jVar.a();
                n v11 = v(b11);
                j jVar2 = jVar;
                Object e11 = e(jVar2, a11, v11, jVar2.g(), z12);
                bVar.k(jVar2, e11);
                A(e11, jVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(String str, Iterable<xn.b> iterable, boolean z11) {
        for (xn.b bVar : iterable) {
            boolean f02 = f0(bVar, z11);
            X(str, bVar.b(), f02);
            if (bVar.i()) {
                W(str, bVar.a(), f02);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(String str, HashMap<e, GroundOverlay> hashMap, boolean z11) {
        BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(t().get(str));
        for (e eVar : hashMap.keySet()) {
            if (eVar.b().equals(str)) {
                GroundOverlay o11 = o(eVar.a().image(fromBitmap));
                if (!z11) {
                    o11.setVisible(false);
                }
                hashMap.put(eVar, o11);
            }
        }
    }

    private void Y(HashMap<e, GroundOverlay> hashMap) {
        for (e eVar : hashMap.keySet()) {
            String b11 = eVar.b();
            if (b11 != null && eVar.c() != null) {
                if (t().get(b11) != null) {
                    X(b11, this.f57624t, true);
                } else if (!this.f57621q.contains(b11)) {
                    this.f57621q.add(b11);
                }
            }
        }
    }

    private void Z(HashMap<e, GroundOverlay> hashMap, Iterable<xn.b> iterable) {
        Y(hashMap);
        for (xn.b bVar : iterable) {
            Z(bVar.b(), bVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(String str, HashMap<j, Object> hashMap) {
        for (j jVar : hashMap.keySet()) {
            n nVar = y().get(jVar.b());
            j jVar2 = jVar;
            n g11 = jVar2.g();
            if ("Point".equals(jVar.a().a())) {
                boolean z11 = true;
                boolean z12 = g11 != null && str.equals(g11.o());
                z11 = (nVar == null || !str.equals(nVar.o())) ? false : false;
                if (z12) {
                    h0(g11, hashMap, jVar2);
                } else if (z11) {
                    h0(nVar, hashMap, jVar2);
                }
            }
        }
    }

    private void c0(HashMap<? extends vn.b, Object> hashMap) {
        for (vn.b bVar : hashMap.keySet()) {
            b(bVar);
        }
    }

    private void d0() {
        this.f57623s = true;
        Iterator<String> it2 = this.f57621q.iterator();
        while (it2.hasNext()) {
            new a(it2.next()).execute(new String[0]);
            it2.remove();
        }
    }

    private void e0() {
        this.f57622r = true;
        Iterator<String> it2 = u().iterator();
        while (it2.hasNext()) {
            new b(it2.next()).execute(new String[0]);
            it2.remove();
        }
    }

    static boolean f0(xn.b bVar, boolean z11) {
        return z11 && (!bVar.j("visibility") || Integer.parseInt(bVar.e("visibility")) != 0);
    }

    private void h0(n nVar, HashMap<j, Object> hashMap, j jVar) {
        double n11 = nVar.n();
        ((Marker) hashMap.get(jVar)).setIcon(i0(t().get(nVar.o()), Double.valueOf(n11)));
    }

    private static BitmapDescriptor i0(Bitmap bitmap, Double d11) {
        return BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * d11.doubleValue()), (int) (bitmap.getHeight() * d11.doubleValue()), false));
    }

    public void b0() {
        J(true);
        this.f57624t = s();
        this.f57625u = r();
        C();
        n(x(), y());
        Z(this.f57624t, this.f57625u);
        U(this.f57625u, true);
        c0(q());
        if (!this.f57623s) {
            d0();
        }
        if (this.f57622r) {
            return;
        }
        e0();
    }

    public Iterable<xn.b> g0() {
        return this.f57625u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0(HashMap<String, n> hashMap, HashMap<String, String> hashMap2, HashMap<j, Object> hashMap3, ArrayList<xn.b> arrayList, HashMap<e, GroundOverlay> hashMap4) {
        L(hashMap, hashMap2, hashMap3, arrayList, hashMap4);
    }
}