package xn;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes2.dex */
public class n extends vn.i {

    /* renamed from: h  reason: collision with root package name */
    private String f57634h;

    /* renamed from: f  reason: collision with root package name */
    private boolean f57632f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f57633g = true;

    /* renamed from: j  reason: collision with root package name */
    private String f57636j = null;

    /* renamed from: d  reason: collision with root package name */
    private final HashMap<String, String> f57630d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f57631e = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    private double f57635i = 1.0d;

    /* renamed from: n  reason: collision with root package name */
    private float f57640n = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57637k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f57638l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f57639m = false;

    public static int g(int i11) {
        Random random = new Random();
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        if (red != 0) {
            red = random.nextInt(red);
        }
        if (blue != 0) {
            blue = random.nextInt(blue);
        }
        if (green != 0) {
            green = random.nextInt(green);
        }
        return Color.rgb(red, green, blue);
    }

    private static String h(String str) {
        String str2;
        if (str.length() > 6) {
            str2 = str.substring(0, 2) + str.substring(6, 8) + str.substring(4, 6) + str.substring(2, 4);
        } else {
            str2 = str.substring(4, 6) + str.substring(2, 4) + str.substring(0, 2);
        }
        if (str2.substring(0, 1).equals(" ")) {
            return "0" + str2.substring(1, str2.length());
        }
        return str2;
    }

    private static MarkerOptions i(MarkerOptions markerOptions, boolean z11, float f11) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.rotation(markerOptions.getRotation());
        markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        if (z11) {
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(m(g((int) f11))));
        }
        markerOptions2.icon(markerOptions.getIcon());
        return markerOptions2;
    }

    private static PolygonOptions j(PolygonOptions polygonOptions, boolean z11, boolean z12) {
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z11) {
            polygonOptions2.fillColor(polygonOptions.getFillColor());
        }
        if (z12) {
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            polygonOptions2.strokeWidth(polygonOptions.getStrokeWidth());
        }
        return polygonOptions2;
    }

    private static PolylineOptions k(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.color(polylineOptions.getColor());
        polylineOptions2.width(polylineOptions.getWidth());
        return polylineOptions2;
    }

    private static float m(int i11) {
        float[] fArr = new float[3];
        Color.colorToHSV(i11, fArr);
        return fArr[0];
    }

    public void A(boolean z11) {
        this.f57632f = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(String str) {
        e(Color.parseColor("#" + h(str)));
        this.f57631e.add("fillColor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(float f11) {
        d(f11);
        this.f57631e.add("heading");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(float f11, float f12, String str, String str2) {
        c(f11, f12, str, str2);
        this.f57631e.add("hotSpot");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(String str) {
        this.f57637k = str.equals("random");
        this.f57631e.add("iconColorMode");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(double d11) {
        this.f57635i = d11;
        this.f57631e.add("iconScale");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(String str) {
        this.f57634h = str;
        this.f57631e.add("iconUrl");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(String str) {
        this.f57630d.put(TextBundle.TEXT_ENTRY, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(String str) {
        this.f57638l = str.equals("random");
        this.f57631e.add("lineColorMode");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(String str) {
        float m11 = m(Color.parseColor("#" + h(str)));
        this.f57640n = m11;
        this.f54571a.icon(BitmapDescriptorFactory.defaultMarker(m11));
        this.f57631e.add("markerColor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(boolean z11) {
        this.f57633g = z11;
        this.f57631e.add("outline");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(String str) {
        PolylineOptions polylineOptions = this.f54572b;
        polylineOptions.color(Color.parseColor("#" + h(str)));
        PolygonOptions polygonOptions = this.f54573c;
        polygonOptions.strokeColor(Color.parseColor("#" + str));
        this.f57631e.add("outlineColor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(String str) {
        this.f57639m = str.equals("random");
        this.f57631e.add("polyColorMode");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(String str) {
        this.f57636j = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(Float f11) {
        b(f11.floatValue());
        f(f11.floatValue());
        this.f57631e.add(Snapshot.WIDTH);
    }

    public HashMap<String, String> l() {
        return this.f57630d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double n() {
        return this.f57635i;
    }

    public String o() {
        return this.f57634h;
    }

    public MarkerOptions p() {
        return i(this.f54571a, w(), this.f57640n);
    }

    public PolygonOptions q() {
        return j(this.f54573c, this.f57632f, this.f57633g);
    }

    public PolylineOptions r() {
        return k(this.f54572b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String s() {
        return this.f57636j;
    }

    public boolean t() {
        return this.f57630d.size() > 0;
    }

    public String toString() {
        return "Style{\n balloon options=" + this.f57630d + ",\n fill=" + this.f57632f + ",\n outline=" + this.f57633g + ",\n icon url=" + this.f57634h + ",\n scale=" + this.f57635i + ",\n style id=" + this.f57636j + "\n}\n";
    }

    public boolean u() {
        return this.f57632f;
    }

    public boolean v() {
        return this.f57633g;
    }

    boolean w() {
        return this.f57637k;
    }

    public boolean x() {
        return this.f57638l;
    }

    public boolean y() {
        return this.f57639m;
    }

    public boolean z(String str) {
        return this.f57631e.contains(str);
    }
}