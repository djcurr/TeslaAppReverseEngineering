package op;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    protected static Logger f42915a = Logger.getLogger(l.class.getName());

    /* renamed from: b  reason: collision with root package name */
    protected static Map<Integer, Map<Integer, Class<? extends b>>> f42916b = new HashMap();

    static {
        HashSet<Class<? extends b>> hashSet = new HashSet();
        hashSet.add(f.class);
        hashSet.add(n.class);
        hashSet.add(b.class);
        hashSet.add(i.class);
        hashSet.add(k.class);
        hashSet.add(m.class);
        hashSet.add(a.class);
        hashSet.add(j.class);
        hashSet.add(h.class);
        hashSet.add(e.class);
        for (Class<? extends b> cls : hashSet) {
            g gVar = (g) cls.getAnnotation(g.class);
            int[] tags = gVar.tags();
            int objectTypeIndication = gVar.objectTypeIndication();
            Map<Integer, Class<? extends b>> map = f42916b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i11 : tags) {
                map.put(Integer.valueOf(i11), cls);
            }
            f42916b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i11, ByteBuffer byteBuffer) {
        b oVar;
        int l11 = hb.d.l(byteBuffer);
        Map<Integer, Class<? extends b>> map = f42916b.get(Integer.valueOf(i11));
        if (map == null) {
            map = f42916b.get(-1);
        }
        Class<? extends b> cls = map.get(Integer.valueOf(l11));
        if (cls != null && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                oVar = cls.newInstance();
            } catch (Exception e11) {
                Logger logger = f42915a;
                Level level = Level.SEVERE;
                logger.log(level, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i11 + " and tag " + l11, (Throwable) e11);
                throw new RuntimeException(e11);
            }
        } else {
            Logger logger2 = f42915a;
            logger2.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i11) + " and tag " + Integer.toHexString(l11) + " found: " + cls);
            oVar = new o();
        }
        oVar.d(l11, byteBuffer);
        return oVar;
    }
}