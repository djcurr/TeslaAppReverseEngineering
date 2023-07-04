package xn;

import ch.qos.logback.core.joran.action.Action;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.HashMap;
import org.spongycastle.i18n.TextBundle;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
class o {
    private static void a(XmlPullParser xmlPullParser, n nVar) {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("BalloonStyle")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals(TextBundle.TEXT_ENTRY)) {
                nVar.H(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void b(XmlPullParser xmlPullParser, n nVar) {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("IconStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("heading")) {
                    nVar.C(Float.parseFloat(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("Icon")) {
                    h(xmlPullParser, nVar);
                } else if (xmlPullParser.getName().equals("hotSpot")) {
                    g(xmlPullParser, nVar);
                } else if (xmlPullParser.getName().equals("scale")) {
                    nVar.F(Double.parseDouble(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("color")) {
                    nVar.J(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    nVar.E(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void c(XmlPullParser xmlPullParser, n nVar) {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    nVar.L(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(Snapshot.WIDTH)) {
                    nVar.O(Float.valueOf(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    nVar.I(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void d(XmlPullParser xmlPullParser, n nVar) {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("PolyStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    nVar.B(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("outline")) {
                    nVar.K(a.a(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("fill")) {
                    nVar.A(a.a(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    nVar.M(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n e(XmlPullParser xmlPullParser) {
        n nVar = new n();
        i(xmlPullParser.getAttributeValue(null, "id"), nVar);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return nVar;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    b(xmlPullParser, nVar);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    c(xmlPullParser, nVar);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    d(xmlPullParser, nVar);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    a(xmlPullParser, nVar);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HashMap<String, String> f(XmlPullParser xmlPullParser) {
        HashMap<String, String> hashMap = new HashMap<>();
        Boolean bool = Boolean.FALSE;
        String str = "#" + xmlPullParser.getAttributeValue(null, "id");
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return hashMap;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(Action.KEY_ATTRIBUTE) && xmlPullParser.nextText().equals("normal")) {
                    bool = Boolean.TRUE;
                } else if (xmlPullParser.getName().equals("styleUrl") && bool.booleanValue()) {
                    hashMap.put(str, xmlPullParser.nextText());
                    bool = Boolean.FALSE;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void g(XmlPullParser xmlPullParser, n nVar) {
        Float valueOf = Float.valueOf(Float.parseFloat(xmlPullParser.getAttributeValue(null, "x")));
        Float valueOf2 = Float.valueOf(Float.parseFloat(xmlPullParser.getAttributeValue(null, "y")));
        nVar.D(valueOf.floatValue(), valueOf2.floatValue(), xmlPullParser.getAttributeValue(null, "xunits"), xmlPullParser.getAttributeValue(null, "yunits"));
    }

    private static void h(XmlPullParser xmlPullParser, n nVar) {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Icon")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                nVar.G(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void i(String str, n nVar) {
        if (str != null) {
            nVar.N("#" + str);
        }
    }
}