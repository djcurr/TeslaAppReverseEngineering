package xn;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d {
    private static LatLng a(String str) {
        String[] split = str.split(",");
        return new LatLng(Double.valueOf(Double.parseDouble(split[1])).doubleValue(), Double.valueOf(Double.parseDouble(split[0])).doubleValue());
    }

    private static ArrayList<LatLng> b(String str) {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        for (String str2 : str.trim().split("(\\s+)")) {
            arrayList.add(a(str2));
        }
        return arrayList;
    }

    private static vn.c c(XmlPullParser xmlPullParser, String str) {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Point")) {
                    return i(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("LineString")) {
                    return f(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("Polygon")) {
                    return j(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiGeometry")) {
                    return g(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e d(XmlPullParser xmlPullParser) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        float f11 = 0.0f;
        int i11 = 1;
        float f12 = 0.0f;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("GroundOverlay")) {
                return new e(str, e((Double) hashMap2.get("north"), (Double) hashMap2.get("south"), (Double) hashMap2.get("east"), (Double) hashMap2.get("west")), f12, i11, hashMap, f11);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Icon")) {
                    str = k(xmlPullParser);
                } else if (xmlPullParser.getName().equals("drawOrder")) {
                    f12 = Float.parseFloat(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("visibility")) {
                    i11 = Integer.parseInt(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    hashMap.putAll(m(xmlPullParser));
                } else if (xmlPullParser.getName().equals("rotation")) {
                    f11 = l(xmlPullParser);
                } else if (!xmlPullParser.getName().matches("name|description|drawOrder|visibility|open|address|phoneNumber") && !xmlPullParser.getName().equals("color")) {
                    if (xmlPullParser.getName().matches("north|south|east|west")) {
                        hashMap2.put(xmlPullParser.getName(), Double.valueOf(Double.parseDouble(xmlPullParser.nextText())));
                    }
                } else {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static LatLngBounds e(Double d11, Double d12, Double d13, Double d14) {
        return new LatLngBounds(new LatLng(d12.doubleValue(), d14.doubleValue()), new LatLng(d11.doubleValue(), d13.doubleValue()));
    }

    private static g f(XmlPullParser xmlPullParser) {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineString")) {
                return new g(arrayList);
            }
            if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                arrayList = b(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static h g(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiGeometry")) {
                return new h(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches("Point|LineString|Polygon|MultiGeometry")) {
                arrayList.add(c(xmlPullParser, xmlPullParser.getName()));
            }
            next = xmlPullParser.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j h(XmlPullParser xmlPullParser) {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        vn.c cVar = null;
        String str = null;
        n nVar = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Placemark")) {
                return new j(cVar, str, nVar, hashMap);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("styleUrl")) {
                    str = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().matches("Point|LineString|Polygon|MultiGeometry")) {
                    cVar = c(xmlPullParser, xmlPullParser.getName());
                } else if (xmlPullParser.getName().matches("name|description|drawOrder|visibility|open|address|phoneNumber")) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    hashMap.putAll(m(xmlPullParser));
                } else if (xmlPullParser.getName().equals("Style")) {
                    nVar = o.e(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static k i(XmlPullParser xmlPullParser) {
        int eventType = xmlPullParser.getEventType();
        LatLng latLng = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Point")) {
                return new k(latLng);
            }
            if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                latLng = a(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static l j(XmlPullParser xmlPullParser) {
        Boolean bool = Boolean.FALSE;
        ArrayList<LatLng> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Polygon")) {
                return new l(arrayList, arrayList2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches("outerBoundaryIs|innerBoundaryIs")) {
                    bool = Boolean.valueOf(xmlPullParser.getName().equals("outerBoundaryIs"));
                } else if (xmlPullParser.getName().equals("coordinates")) {
                    if (bool.booleanValue()) {
                        arrayList = b(xmlPullParser.nextText());
                    } else {
                        arrayList2.add(b(xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static String k(XmlPullParser xmlPullParser) {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Icon")) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    private static float l(XmlPullParser xmlPullParser) {
        return -Float.parseFloat(xmlPullParser.nextText());
    }

    private static HashMap<String, String> m(XmlPullParser xmlPullParser) {
        HashMap<String, String> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("ExtendedData")) {
                return hashMap;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    str = xmlPullParser.getAttributeValue(null, "name");
                } else if (xmlPullParser.getName().equals("value") && str != null) {
                    hashMap.put(str, xmlPullParser.nextText());
                    str = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}