package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    static HashMap<String, Constructor<? extends d>> f3406b;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, ArrayList<d>> f3407a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> hashMap = new HashMap<>();
        f3406b = hashMap;
        try {
            hashMap.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            f3406b.put("KeyPosition", h.class.getConstructor(new Class[0]));
            f3406b.put("KeyCycle", f.class.getConstructor(new Class[0]));
            f3406b.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            f3406b.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e11) {
            Log.e("KeyFrames", "unable to load", e11);
        }
    }

    public g() {
    }

    public void a(m mVar) {
        ArrayList<d> arrayList = this.f3407a.get(-1);
        if (arrayList != null) {
            mVar.a(arrayList);
        }
    }

    public void b(d dVar) {
        if (!this.f3407a.containsKey(Integer.valueOf(dVar.f3363b))) {
            this.f3407a.put(Integer.valueOf(dVar.f3363b), new ArrayList<>());
        }
        ArrayList<d> arrayList = this.f3407a.get(Integer.valueOf(dVar.f3363b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public ArrayList<d> c(int i11) {
        return this.f3407a.get(Integer.valueOf(i11));
    }

    public g(Context context, XmlPullParser xmlPullParser) {
        d dVar;
        Exception e11;
        Constructor<? extends d> constructor;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap2;
        d dVar2 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f3406b.containsKey(name)) {
                        try {
                            constructor = f3406b.get(name);
                        } catch (Exception e12) {
                            dVar = dVar2;
                            e11 = e12;
                        }
                        if (constructor != null) {
                            dVar = constructor.newInstance(new Object[0]);
                            try {
                                dVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                b(dVar);
                            } catch (Exception e13) {
                                e11 = e13;
                                Log.e("KeyFrames", "unable to create ", e11);
                                dVar2 = dVar;
                                continue;
                                eventType = xmlPullParser.next();
                            }
                            dVar2 = dVar;
                            continue;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                            break;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar2 != null && (hashMap2 = dVar2.f3366e) != null) {
                            androidx.constraintlayout.widget.a.h(context, xmlPullParser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar2 != null && (hashMap = dVar2.f3366e) != null) {
                        androidx.constraintlayout.widget.a.h(context, xmlPullParser, hashMap);
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        } catch (XmlPullParserException e15) {
            e15.printStackTrace();
        }
    }
}