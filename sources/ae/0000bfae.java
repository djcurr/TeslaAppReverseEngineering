package xn;

import com.google.android.gms.maps.model.GroundOverlay;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParser f57611a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<j, Object> f57612b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<b> f57613c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, n> f57614d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, String> f57615e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<e, GroundOverlay> f57616f = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(XmlPullParser xmlPullParser) {
        this.f57611a = xmlPullParser;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i11 = 1;
        while (i11 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i11++;
            } else if (next == 3) {
                i11--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<b> a() {
        return this.f57613c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<e, GroundOverlay> b() {
        return this.f57616f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<j, Object> c() {
        return this.f57612b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, String> d() {
        return this.f57615e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HashMap<String, n> e() {
        return this.f57614d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        int eventType = this.f57611a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.f57611a.getName().matches("altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|NetworkLink|NetworkLinkControl|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when")) {
                    g(this.f57611a);
                }
                if (this.f57611a.getName().matches("Folder|Document")) {
                    this.f57613c.add(c.b(this.f57611a));
                }
                if (this.f57611a.getName().equals("Style")) {
                    n e11 = o.e(this.f57611a);
                    this.f57614d.put(e11.s(), e11);
                }
                if (this.f57611a.getName().equals("StyleMap")) {
                    this.f57615e.putAll(o.f(this.f57611a));
                }
                if (this.f57611a.getName().equals("Placemark")) {
                    this.f57612b.put(d.h(this.f57611a), null);
                }
                if (this.f57611a.getName().equals("GroundOverlay")) {
                    this.f57616f.put(d.d(this.f57611a), null);
                }
            }
            eventType = this.f57611a.next();
        }
        this.f57614d.put(null, new n());
    }
}