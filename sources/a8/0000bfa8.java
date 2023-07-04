package xn;

import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
class c {
    private static b a(XmlPullParser xmlPullParser) {
        String name = xmlPullParser.getName();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        String attributeValue = xmlPullParser.getAttributeValue(null, "id") != null ? xmlPullParser.getAttributeValue(null, "id") : null;
        xmlPullParser.next();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(name)) {
                return new b(hashMap, hashMap2, hashMap3, hashMap4, arrayList, hashMap5, attributeValue);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches("altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when")) {
                    i.g(xmlPullParser);
                } else if (xmlPullParser.getName().matches("Folder|Document")) {
                    arrayList.add(a(xmlPullParser));
                } else if (xmlPullParser.getName().matches("name|description|visibility|open|address|phoneNumber")) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("StyleMap")) {
                    e(xmlPullParser, hashMap4);
                } else if (xmlPullParser.getName().equals("Style")) {
                    d(xmlPullParser, hashMap2);
                } else if (xmlPullParser.getName().equals("Placemark")) {
                    c(xmlPullParser, hashMap3);
                } else if (xmlPullParser.getName().equals("ExtendedData")) {
                    f(xmlPullParser, hashMap);
                } else if (xmlPullParser.getName().equals("GroundOverlay")) {
                    hashMap5.put(d.d(xmlPullParser), null);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b(XmlPullParser xmlPullParser) {
        return a(xmlPullParser);
    }

    private static void c(XmlPullParser xmlPullParser, HashMap<j, Object> hashMap) {
        hashMap.put(d.h(xmlPullParser), null);
    }

    private static void d(XmlPullParser xmlPullParser, HashMap<String, n> hashMap) {
        if (xmlPullParser.getAttributeValue(null, "id") != null) {
            n e11 = o.e(xmlPullParser);
            hashMap.put(e11.s(), e11);
        }
    }

    private static void e(XmlPullParser xmlPullParser, HashMap<String, String> hashMap) {
        hashMap.putAll(o.f(xmlPullParser));
    }

    private static void f(XmlPullParser xmlPullParser, HashMap<String, String> hashMap) {
        int eventType = xmlPullParser.getEventType();
        String str = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("ExtendedData")) {
                return;
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