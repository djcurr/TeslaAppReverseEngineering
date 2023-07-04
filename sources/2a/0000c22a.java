package y70;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: s */
    static volatile c f59320s;

    /* renamed from: t */
    private static final d f59321t = new d();

    /* renamed from: u */
    private static final Map<Class<?>, List<Class<?>>> f59322u = new HashMap();

    /* renamed from: a */
    private final Map<Class<?>, CopyOnWriteArrayList<o>> f59323a;

    /* renamed from: b */
    private final Map<Object, List<Class<?>>> f59324b;

    /* renamed from: c */
    private final Map<Class<?>, Object> f59325c;

    /* renamed from: d */
    private final ThreadLocal<C1353c> f59326d;

    /* renamed from: e */
    private final g f59327e;

    /* renamed from: f */
    private final k f59328f;

    /* renamed from: g */
    private final y70.b f59329g;

    /* renamed from: h */
    private final y70.a f59330h;

    /* renamed from: i */
    private final n f59331i;

    /* renamed from: j */
    private final ExecutorService f59332j;

    /* renamed from: k */
    private final boolean f59333k;

    /* renamed from: l */
    private final boolean f59334l;

    /* renamed from: m */
    private final boolean f59335m;

    /* renamed from: n */
    private final boolean f59336n;

    /* renamed from: o */
    private final boolean f59337o;

    /* renamed from: p */
    private final boolean f59338p;

    /* renamed from: q */
    private final int f59339q;

    /* renamed from: r */
    private final f f59340r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a extends ThreadLocal<C1353c> {
        a(c cVar) {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C1353c initialValue() {
            return new C1353c();
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f59341a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f59341a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59341a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59341a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59341a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: y70.c$c */
    /* loaded from: classes5.dex */
    public static final class C1353c {

        /* renamed from: a */
        final List<Object> f59342a = new ArrayList();

        /* renamed from: b */
        boolean f59343b;

        /* renamed from: c */
        boolean f59344c;

        /* renamed from: d */
        Object f59345d;

        /* renamed from: e */
        boolean f59346e;

        C1353c() {
        }
    }

    public c() {
        this(f59321t);
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    private void b(o oVar, Object obj) {
        if (obj != null) {
            o(oVar, obj, i());
        }
    }

    public static c c() {
        if (f59320s == null) {
            synchronized (c.class) {
                if (f59320s == null) {
                    f59320s = new c();
                }
            }
        }
        return f59320s;
    }

    private void f(o oVar, Object obj, Throwable th2) {
        if (obj instanceof l) {
            if (this.f59334l) {
                f fVar = this.f59340r;
                Level level = Level.SEVERE;
                fVar.a(level, "SubscriberExceptionEvent subscriber " + oVar.f59395a.getClass() + " threw an exception", th2);
                l lVar = (l) obj;
                f fVar2 = this.f59340r;
                fVar2.a(level, "Initial event " + lVar.f59375b + " caused exception in " + lVar.f59376c, lVar.f59374a);
            }
        } else if (!this.f59333k) {
            if (this.f59334l) {
                f fVar3 = this.f59340r;
                Level level2 = Level.SEVERE;
                fVar3.a(level2, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + oVar.f59395a.getClass(), th2);
            }
            if (this.f59336n) {
                l(new l(this, th2, obj, oVar.f59395a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th2);
        }
    }

    private boolean i() {
        g gVar = this.f59327e;
        if (gVar != null) {
            return gVar.a();
        }
        return true;
    }

    private static List<Class<?>> k(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f59322u;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                f59322u.put(cls, list);
            }
        }
        return list;
    }

    private void m(Object obj, C1353c c1353c) {
        boolean n11;
        Class<?> cls = obj.getClass();
        if (this.f59338p) {
            List<Class<?>> k11 = k(cls);
            int size = k11.size();
            n11 = false;
            for (int i11 = 0; i11 < size; i11++) {
                n11 |= n(obj, c1353c, k11.get(i11));
            }
        } else {
            n11 = n(obj, c1353c, cls);
        }
        if (n11) {
            return;
        }
        if (this.f59335m) {
            this.f59340r.b(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f59337o || cls == h.class || cls == l.class) {
            return;
        }
        l(new h(this, obj));
    }

    private boolean n(Object obj, C1353c c1353c, Class<?> cls) {
        CopyOnWriteArrayList<o> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f59323a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<o> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            o next = it2.next();
            c1353c.f59345d = obj;
            try {
                o(next, obj, c1353c.f59344c);
                if (c1353c.f59346e) {
                    return true;
                }
            } finally {
                c1353c.f59346e = false;
            }
        }
        return true;
    }

    private void o(o oVar, Object obj, boolean z11) {
        int i11 = b.f59341a[oVar.f59396b.f59378b.ordinal()];
        if (i11 == 1) {
            h(oVar, obj);
        } else if (i11 == 2) {
            if (z11) {
                h(oVar, obj);
            } else {
                this.f59328f.a(oVar, obj);
            }
        } else if (i11 == 3) {
            if (z11) {
                this.f59329g.a(oVar, obj);
            } else {
                h(oVar, obj);
            }
        } else if (i11 == 4) {
            this.f59330h.a(oVar, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + oVar.f59396b.f59378b);
        }
    }

    private void q(Object obj, m mVar) {
        Class<?> cls = mVar.f59379c;
        o oVar = new o(obj, mVar);
        CopyOnWriteArrayList<o> copyOnWriteArrayList = this.f59323a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f59323a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(oVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i11 = 0; i11 <= size; i11++) {
            if (i11 == size || mVar.f59380d > copyOnWriteArrayList.get(i11).f59396b.f59380d) {
                copyOnWriteArrayList.add(i11, oVar);
                break;
            }
        }
        List<Class<?>> list = this.f59324b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f59324b.put(obj, list);
        }
        list.add(cls);
        if (mVar.f59381e) {
            if (this.f59338p) {
                for (Map.Entry<Class<?>, Object> entry : this.f59325c.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey())) {
                        b(oVar, entry.getValue());
                    }
                }
                return;
            }
            b(oVar, this.f59325c.get(cls));
        }
    }

    private void s(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<o> copyOnWriteArrayList = this.f59323a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i11 = 0;
            while (i11 < size) {
                o oVar = copyOnWriteArrayList.get(i11);
                if (oVar.f59395a == obj) {
                    oVar.f59397c = false;
                    copyOnWriteArrayList.remove(i11);
                    i11--;
                    size--;
                }
                i11++;
            }
        }
    }

    public ExecutorService d() {
        return this.f59332j;
    }

    public f e() {
        return this.f59340r;
    }

    public void g(i iVar) {
        Object obj = iVar.f59369a;
        o oVar = iVar.f59370b;
        i.b(iVar);
        if (oVar.f59397c) {
            h(oVar, obj);
        }
    }

    void h(o oVar, Object obj) {
        try {
            oVar.f59396b.f59377a.invoke(oVar.f59395a, obj);
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unexpected exception", e11);
        } catch (InvocationTargetException e12) {
            f(oVar, obj, e12.getCause());
        }
    }

    public synchronized boolean j(Object obj) {
        return this.f59324b.containsKey(obj);
    }

    public void l(Object obj) {
        C1353c c1353c = this.f59326d.get();
        List<Object> list = c1353c.f59342a;
        list.add(obj);
        if (c1353c.f59343b) {
            return;
        }
        c1353c.f59344c = i();
        c1353c.f59343b = true;
        if (c1353c.f59346e) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                m(list.remove(0), c1353c);
            } finally {
                c1353c.f59343b = false;
                c1353c.f59344c = false;
            }
        }
    }

    public void p(Object obj) {
        List<m> a11 = this.f59331i.a(obj.getClass());
        synchronized (this) {
            for (m mVar : a11) {
                q(obj, mVar);
            }
        }
    }

    public synchronized void r(Object obj) {
        List<Class<?>> list = this.f59324b.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                s(obj, cls);
            }
            this.f59324b.remove(obj);
        } else {
            f fVar = this.f59340r;
            Level level = Level.WARNING;
            fVar.b(level, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f59339q + ", eventInheritance=" + this.f59338p + "]";
    }

    c(d dVar) {
        this.f59326d = new a(this);
        this.f59340r = dVar.b();
        this.f59323a = new HashMap();
        this.f59324b = new HashMap();
        this.f59325c = new ConcurrentHashMap();
        g c11 = dVar.c();
        this.f59327e = c11;
        this.f59328f = c11 != null ? c11.b(this) : null;
        this.f59329g = new y70.b(this);
        this.f59330h = new y70.a(this);
        List<z70.b> list = dVar.f59357j;
        this.f59339q = list != null ? list.size() : 0;
        this.f59331i = new n(dVar.f59357j, dVar.f59355h, dVar.f59354g);
        this.f59334l = dVar.f59348a;
        this.f59335m = dVar.f59349b;
        this.f59336n = dVar.f59350c;
        this.f59337o = dVar.f59351d;
        this.f59333k = dVar.f59352e;
        this.f59338p = dVar.f59353f;
        this.f59332j = dVar.f59356i;
    }
}