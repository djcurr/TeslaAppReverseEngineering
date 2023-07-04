package vn;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.i18n.TextBundle;
import wn.j;
import wn.k;
import wn.l;
import xn.n;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: p  reason: collision with root package name */
    private static final Object f54554p = null;

    /* renamed from: a  reason: collision with root package name */
    private GoogleMap f54555a;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, n> f54557c;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, String> f54559e;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<xn.e, GroundOverlay> f54561g;

    /* renamed from: k  reason: collision with root package name */
    private Context f54565k;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<xn.b> f54566l;

    /* renamed from: m  reason: collision with root package name */
    private final j f54567m;

    /* renamed from: n  reason: collision with root package name */
    private final wn.e f54568n;

    /* renamed from: o  reason: collision with root package name */
    private final l f54569o;

    /* renamed from: b  reason: collision with root package name */
    private final wn.a<b> f54556b = new wn.a<>();

    /* renamed from: j  reason: collision with root package name */
    private boolean f54564j = false;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.collection.e<String, Bitmap> f54563i = new androidx.collection.e<>(50);

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<String> f54562h = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, n> f54558d = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private wn.a<b> f54560f = new wn.a<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements GoogleMap.InfoWindowAdapter {
        a() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
        public View getInfoContents(Marker marker) {
            View inflate = LayoutInflater.from(h.this.f54565k).inflate(un.c.amu_info_window, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(un.b.window);
            if (marker.getSnippet() != null) {
                textView.setText(Html.fromHtml(marker.getTitle() + "<br>" + marker.getSnippet()));
            } else {
                textView.setText(Html.fromHtml(marker.getTitle()));
            }
            return inflate;
        }

        @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
        public View getInfoWindow(Marker marker) {
            return null;
        }
    }

    public h(GoogleMap googleMap, Context context) {
        this.f54555a = googleMap;
        this.f54565k = context;
    }

    public static void E(Object obj) {
        if (obj instanceof Marker) {
            ((Marker) obj).remove();
        } else if (obj instanceof Polyline) {
            ((Polyline) obj).remove();
        } else if (obj instanceof Polygon) {
            ((Polygon) obj).remove();
        } else if (obj instanceof ArrayList) {
            Iterator it2 = ((ArrayList) obj).iterator();
            while (it2.hasNext()) {
                E(it2.next());
            }
        }
    }

    private void F(wn.b bVar) {
        bVar.j();
        bVar.o(this.f54567m);
        bVar.h();
        bVar.n(this.f54568n);
        bVar.l();
        bVar.p(this.f54569o);
    }

    private void G(PolylineOptions polylineOptions, n nVar) {
        PolylineOptions r11 = nVar.r();
        if (nVar.z("outlineColor")) {
            polylineOptions.color(r11.getColor());
        }
        if (nVar.z(Snapshot.WIDTH)) {
            polylineOptions.width(r11.getWidth());
        }
        if (nVar.x()) {
            polylineOptions.color(n.g(r11.getColor()));
        }
    }

    private void H(MarkerOptions markerOptions, n nVar, String str) {
        MarkerOptions p11 = nVar.p();
        if (nVar.z("heading")) {
            markerOptions.rotation(p11.getRotation());
        }
        if (nVar.z("hotSpot")) {
            markerOptions.anchor(p11.getAnchorU(), p11.getAnchorV());
        }
        if (nVar.z("markerColor")) {
            markerOptions.icon(p11.getIcon());
        }
        if (nVar.z("iconUrl")) {
            g(nVar.o(), markerOptions);
        } else if (str != null) {
            g(str, markerOptions);
        }
    }

    private void I(PolygonOptions polygonOptions, n nVar) {
        PolygonOptions q11 = nVar.q();
        if (nVar.u() && nVar.z("fillColor")) {
            polygonOptions.fillColor(q11.getFillColor());
        }
        if (nVar.v()) {
            if (nVar.z("outlineColor")) {
                polygonOptions.strokeColor(q11.getStrokeColor());
            }
            if (nVar.z(Snapshot.WIDTH)) {
                polygonOptions.strokeWidth(q11.getStrokeWidth());
            }
        }
        if (nVar.y()) {
            polygonOptions.fillColor(n.g(q11.getFillColor()));
        }
    }

    private void K(n nVar, Marker marker, xn.j jVar) {
        boolean f11 = jVar.f("name");
        boolean f12 = jVar.f("description");
        boolean t11 = nVar.t();
        boolean containsKey = nVar.l().containsKey(TextBundle.TEXT_ENTRY);
        if (t11 && containsKey) {
            marker.setTitle(nVar.l().get(TextBundle.TEXT_ENTRY));
            p();
        } else if (t11 && f11) {
            marker.setTitle(jVar.d("name"));
            p();
        } else if (f11 && f12) {
            marker.setTitle(jVar.d("name"));
            marker.setSnippet(jVar.d("description"));
            p();
        } else if (f12) {
            marker.setTitle(jVar.d("description"));
            p();
        } else if (f11) {
            marker.setTitle(jVar.d("name"));
            p();
        }
    }

    private ArrayList<Object> d(wn.b bVar, List<c> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (c cVar : list) {
            arrayList.add(c(bVar, cVar));
        }
        return arrayList;
    }

    private void g(String str, MarkerOptions markerOptions) {
        if (this.f54563i.get(str) != null) {
            markerOptions.icon(BitmapDescriptorFactory.fromBitmap(this.f54563i.get(str)));
        } else if (this.f54562h.contains(str)) {
        } else {
            this.f54562h.add(str);
        }
    }

    private ArrayList<Object> h(xn.j jVar, xn.h hVar, n nVar, n nVar2, boolean z11) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<c> it2 = hVar.e().iterator();
        while (it2.hasNext()) {
            arrayList.add(e(jVar, it2.next(), nVar, nVar2, z11));
        }
        return arrayList;
    }

    private ArrayList<Polyline> i(wn.e eVar, wn.f fVar) {
        ArrayList<Polyline> arrayList = new ArrayList<>();
        Iterator<wn.d> it2 = fVar.f().iterator();
        if (it2.hasNext()) {
            it2.next();
            throw null;
        }
        return arrayList;
    }

    private ArrayList<Marker> j(j jVar, wn.g gVar) {
        ArrayList<Marker> arrayList = new ArrayList<>();
        Iterator<wn.i> it2 = gVar.f().iterator();
        if (it2.hasNext()) {
            it2.next();
            throw null;
        }
        return arrayList;
    }

    private ArrayList<Polygon> k(l lVar, wn.h hVar) {
        ArrayList<Polygon> arrayList = new ArrayList<>();
        Iterator<k> it2 = hVar.f().iterator();
        if (it2.hasNext()) {
            it2.next();
            throw null;
        }
        return arrayList;
    }

    private void p() {
        this.f54555a.setInfoWindowAdapter(new a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean w(b bVar) {
        return (bVar.f("visibility") && Integer.parseInt(bVar.d("visibility")) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A(Object obj, b bVar) {
        this.f54560f.put(bVar, obj);
    }

    public void B(String str, Bitmap bitmap) {
        this.f54563i.put(str, bitmap);
    }

    public void C() {
        this.f54558d.putAll(this.f54557c);
    }

    public void D(HashMap<String, n> hashMap) {
        this.f54558d.putAll(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J(boolean z11) {
        this.f54564j = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(HashMap<String, n> hashMap, HashMap<String, String> hashMap2, HashMap<xn.j, Object> hashMap3, ArrayList<xn.b> arrayList, HashMap<xn.e, GroundOverlay> hashMap4) {
        this.f54557c = hashMap;
        this.f54559e = hashMap2;
        this.f54556b.putAll(hashMap3);
        this.f54566l = arrayList;
        this.f54561g = hashMap4;
    }

    public void b(b bVar) {
        Object obj = f54554p;
        if (bVar instanceof wn.b) {
            F((wn.b) bVar);
        }
        if (this.f54564j) {
            if (this.f54556b.containsKey(bVar)) {
                E(this.f54556b.get(bVar));
            }
            if (bVar.e()) {
                if (bVar instanceof xn.j) {
                    xn.j jVar = (xn.j) bVar;
                    obj = e(jVar, bVar.a(), v(bVar.b()), jVar.g(), w(bVar));
                } else {
                    obj = c(bVar, bVar.a());
                }
            }
        }
        this.f54556b.put(bVar, obj);
    }

    protected Object c(b bVar, c cVar) {
        String a11 = cVar.a();
        a11.hashCode();
        char c11 = 65535;
        switch (a11.hashCode()) {
            case -2116761119:
                if (a11.equals("MultiPolygon")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1065891849:
                if (a11.equals("MultiPoint")) {
                    c11 = 1;
                    break;
                }
                break;
            case -627102946:
                if (a11.equals("MultiLineString")) {
                    c11 = 2;
                    break;
                }
                break;
            case 77292912:
                if (a11.equals("Point")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1267133722:
                if (a11.equals("Polygon")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1806700869:
                if (a11.equals("LineString")) {
                    c11 = 5;
                    break;
                }
                break;
            case 1950410960:
                if (a11.equals("GeometryCollection")) {
                    c11 = 6;
                    break;
                }
                break;
        }
        MarkerOptions markerOptions = null;
        PolylineOptions j11 = null;
        PolygonOptions i11 = null;
        switch (c11) {
            case 0:
                return k(((wn.b) bVar).l(), (wn.h) cVar);
            case 1:
                return j(((wn.b) bVar).j(), (wn.g) cVar);
            case 2:
                return i(((wn.b) bVar).h(), (wn.f) cVar);
            case 3:
                if (bVar instanceof wn.b) {
                    markerOptions = ((wn.b) bVar).i();
                } else if (bVar instanceof xn.j) {
                    markerOptions = ((xn.j) bVar).h();
                }
                return l(markerOptions, (wn.i) cVar);
            case 4:
                if (bVar instanceof wn.b) {
                    i11 = ((wn.b) bVar).k();
                } else if (bVar instanceof xn.j) {
                    i11 = ((xn.j) bVar).i();
                }
                return m(i11, (vn.a) cVar);
            case 5:
                if (bVar instanceof wn.b) {
                    j11 = ((wn.b) bVar).m();
                } else if (bVar instanceof xn.j) {
                    j11 = ((xn.j) bVar).j();
                }
                return f(j11, (wn.d) cVar);
            case 6:
                return d((wn.b) bVar, ((wn.c) cVar).f());
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r0.equals("Point") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(xn.j r10, vn.c r11, xn.n r12, xn.n r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = r11.a()
            java.lang.String r2 = "drawOrder"
            boolean r3 = r10.f(r2)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L18
            java.lang.String r2 = r10.d(r2)     // Catch: java.lang.NumberFormatException -> L17
            float r7 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L17
            goto L18
        L17:
            r3 = r6
        L18:
            r0.hashCode()
            r2 = -1
            int r8 = r0.hashCode()
            switch(r8) {
                case 77292912: goto L46;
                case 89139371: goto L3b;
                case 1267133722: goto L30;
                case 1806700869: goto L25;
                default: goto L23;
            }
        L23:
            r6 = r2
            goto L4f
        L25:
            java.lang.String r6 = "LineString"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L2e
            goto L23
        L2e:
            r6 = 3
            goto L4f
        L30:
            java.lang.String r6 = "Polygon"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L39
            goto L23
        L39:
            r6 = 2
            goto L4f
        L3b:
            java.lang.String r6 = "MultiGeometry"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L44
            goto L23
        L44:
            r6 = 1
            goto L4f
        L46:
            java.lang.String r8 = "Point"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L4f
            goto L23
        L4f:
            switch(r6) {
                case 0: goto Lb7;
                case 1: goto Laa;
                case 2: goto L7f;
                case 3: goto L54;
                default: goto L52;
            }
        L52:
            r0 = 0
            return r0
        L54:
            com.google.android.gms.maps.model.PolylineOptions r0 = r12.r()
            if (r13 == 0) goto L5e
            r9.G(r0, r13)
            goto L6f
        L5e:
            boolean r1 = r12.x()
            if (r1 == 0) goto L6f
            int r1 = r0.getColor()
            int r1 = xn.n.g(r1)
            r0.color(r1)
        L6f:
            r1 = r11
            vn.e r1 = (vn.e) r1
            com.google.android.gms.maps.model.Polyline r0 = r9.f(r0, r1)
            r0.setVisible(r14)
            if (r3 == 0) goto L7e
            r0.setZIndex(r7)
        L7e:
            return r0
        L7f:
            com.google.android.gms.maps.model.PolygonOptions r0 = r12.q()
            if (r13 == 0) goto L89
            r9.I(r0, r13)
            goto L9a
        L89:
            boolean r1 = r12.y()
            if (r1 == 0) goto L9a
            int r1 = r0.getFillColor()
            int r1 = xn.n.g(r1)
            r0.fillColor(r1)
        L9a:
            r1 = r11
            vn.a r1 = (vn.a) r1
            com.google.android.gms.maps.model.Polygon r0 = r9.m(r0, r1)
            r0.setVisible(r14)
            if (r3 == 0) goto La9
            r0.setZIndex(r7)
        La9:
            return r0
        Laa:
            r2 = r11
            xn.h r2 = (xn.h) r2
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            java.util.ArrayList r0 = r0.h(r1, r2, r3, r4, r5)
            return r0
        Lb7:
            com.google.android.gms.maps.model.MarkerOptions r0 = r12.p()
            if (r13 == 0) goto Lc5
            java.lang.String r2 = r12.o()
            r9.H(r0, r13, r2)
            goto Ld2
        Lc5:
            java.lang.String r2 = r12.o()
            if (r2 == 0) goto Ld2
            java.lang.String r2 = r12.o()
            r9.g(r2, r0)
        Ld2:
            r2 = r11
            xn.k r2 = (xn.k) r2
            com.google.android.gms.maps.model.Marker r0 = r9.l(r0, r2)
            r0.setVisible(r14)
            r9.K(r12, r0, r10)
            if (r3 == 0) goto Le4
            r0.setZIndex(r7)
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.h.e(xn.j, vn.c, xn.n, xn.n, boolean):java.lang.Object");
    }

    protected Polyline f(PolylineOptions polylineOptions, e eVar) {
        polylineOptions.addAll(eVar.d());
        Polyline addPolyline = this.f54555a.addPolyline(polylineOptions);
        addPolyline.setClickable(true);
        return addPolyline;
    }

    protected Marker l(MarkerOptions markerOptions, g gVar) {
        markerOptions.position(gVar.d());
        return this.f54555a.addMarker(markerOptions);
    }

    protected Polygon m(PolygonOptions polygonOptions, vn.a aVar) {
        polygonOptions.addAll(aVar.b());
        for (List<LatLng> list : aVar.c()) {
            polygonOptions.addHole(list);
        }
        Polygon addPolygon = this.f54555a.addPolygon(polygonOptions);
        addPolygon.setClickable(true);
        return addPolygon;
    }

    public void n(HashMap<String, String> hashMap, HashMap<String, n> hashMap2) {
        for (String str : hashMap.keySet()) {
            String str2 = hashMap.get(str);
            if (hashMap2.containsKey(str2)) {
                hashMap2.put(str, hashMap2.get(str2));
            }
        }
    }

    public GroundOverlay o(GroundOverlayOptions groundOverlayOptions) {
        return this.f54555a.addGroundOverlay(groundOverlayOptions);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HashMap<? extends b, Object> q() {
        return this.f54556b;
    }

    public ArrayList<xn.b> r() {
        return this.f54566l;
    }

    public HashMap<xn.e, GroundOverlay> s() {
        return this.f54561g;
    }

    public androidx.collection.e<String, Bitmap> t() {
        return this.f54563i;
    }

    public ArrayList<String> u() {
        return this.f54562h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public n v(String str) {
        return this.f54558d.get(str) != null ? this.f54558d.get(str) : this.f54558d.get(null);
    }

    public HashMap<String, String> x() {
        return this.f54559e;
    }

    public HashMap<String, n> y() {
        return this.f54558d;
    }

    public boolean z() {
        return this.f54564j;
    }
}