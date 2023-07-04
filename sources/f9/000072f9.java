package hc;

import java.util.HashMap;

/* loaded from: classes.dex */
public class p extends b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f29023e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f29023e = hashMap;
        b.V(hashMap);
        hashMap.put(0, "GPS Version ID");
        hashMap.put(1, "GPS Latitude Ref");
        hashMap.put(2, "GPS Latitude");
        hashMap.put(3, "GPS Longitude Ref");
        hashMap.put(4, "GPS Longitude");
        hashMap.put(5, "GPS Altitude Ref");
        hashMap.put(6, "GPS Altitude");
        hashMap.put(7, "GPS Time-Stamp");
        hashMap.put(8, "GPS Satellites");
        hashMap.put(9, "GPS Status");
        hashMap.put(10, "GPS Measure Mode");
        hashMap.put(11, "GPS DOP");
        hashMap.put(12, "GPS Speed Ref");
        hashMap.put(13, "GPS Speed");
        hashMap.put(14, "GPS Track Ref");
        hashMap.put(15, "GPS Track");
        hashMap.put(16, "GPS Img Direction Ref");
        hashMap.put(17, "GPS Img Direction");
        hashMap.put(18, "GPS Map Datum");
        hashMap.put(19, "GPS Dest Latitude Ref");
        hashMap.put(20, "GPS Dest Latitude");
        hashMap.put(21, "GPS Dest Longitude Ref");
        hashMap.put(22, "GPS Dest Longitude");
        hashMap.put(23, "GPS Dest Bearing Ref");
        hashMap.put(24, "GPS Dest Bearing");
        hashMap.put(25, "GPS Dest Distance Ref");
        hashMap.put(26, "GPS Dest Distance");
        hashMap.put(27, "GPS Processing Method");
        hashMap.put(28, "GPS Area Information");
        hashMap.put(29, "GPS Date Stamp");
        hashMap.put(30, "GPS Differential");
    }

    public p() {
        E(new o(this));
    }

    public bc.g W() {
        bc.k[] q11 = q(2);
        bc.k[] q12 = q(4);
        String r11 = r(1);
        String r12 = r(3);
        if (q11 != null && q11.length == 3 && q12 != null && q12.length == 3 && r11 != null && r12 != null) {
            Double c11 = bc.g.c(q11[0], q11[1], q11[2], r11.equalsIgnoreCase("S"));
            Double c12 = bc.g.c(q12[0], q12[1], q12[2], r12.equalsIgnoreCase("W"));
            if (c11 != null && c12 != null) {
                return new bc.g(c11.doubleValue(), c12.doubleValue());
            }
        }
        return null;
    }

    @Override // cc.b
    public String n() {
        return "GPS";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f29023e;
    }
}