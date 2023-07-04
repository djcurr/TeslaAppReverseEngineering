package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.t0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l implements com.facebook.react.uimanager.events.f {

    /* renamed from: e  reason: collision with root package name */
    private final ReactApplicationContext f11764e;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<com.facebook.react.animated.b> f11760a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<d> f11761b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<com.facebook.react.animated.b> f11762c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, List<EventAnimationDriver>> f11763d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private int f11765f = 0;

    /* renamed from: g  reason: collision with root package name */
    private final List<com.facebook.react.animated.b> f11766g = new LinkedList();

    /* renamed from: h  reason: collision with root package name */
    private boolean f11767h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11768i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11769j = false;

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11770a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f11771b;

        a(int i11, l lVar) {
            this.f11770a = i11;
            this.f11771b = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            UIManager g11 = t0.g(l.this.f11764e, this.f11770a);
            if (g11 != null) {
                ((com.facebook.react.uimanager.events.d) g11.getEventDispatcher()).f(this.f11771b);
                if (this.f11770a == 2) {
                    l.this.f11767h = true;
                } else {
                    l.this.f11768i = true;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.c f11773a;

        b(com.facebook.react.uimanager.events.c cVar) {
            this.f11773a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.p(this.f11773a);
        }
    }

    public l(ReactApplicationContext reactApplicationContext) {
        this.f11764e = reactApplicationContext;
    }

    private void A(com.facebook.react.animated.b bVar) {
        int i11 = 0;
        while (i11 < this.f11761b.size()) {
            d valueAt = this.f11761b.valueAt(i11);
            if (bVar.equals(valueAt.f11720b)) {
                if (valueAt.f11721c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f11721c.invoke(createMap);
                }
                this.f11761b.removeAt(i11);
                i11--;
            }
            i11++;
        }
    }

    private void C(List<com.facebook.react.animated.b> list) {
        int i11 = this.f11765f + 1;
        this.f11765f = i11;
        if (i11 == 0) {
            this.f11765f = i11 + 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i12 = 0;
        for (com.facebook.react.animated.b bVar : list) {
            int i13 = bVar.f11717c;
            int i14 = this.f11765f;
            if (i13 != i14) {
                bVar.f11717c = i14;
                i12++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            com.facebook.react.animated.b bVar2 = (com.facebook.react.animated.b) arrayDeque.poll();
            if (bVar2.f11715a != null) {
                for (int i15 = 0; i15 < bVar2.f11715a.size(); i15++) {
                    com.facebook.react.animated.b bVar3 = bVar2.f11715a.get(i15);
                    bVar3.f11716b++;
                    int i16 = bVar3.f11717c;
                    int i17 = this.f11765f;
                    if (i16 != i17) {
                        bVar3.f11717c = i17;
                        i12++;
                        arrayDeque.add(bVar3);
                    }
                }
            }
        }
        int i18 = this.f11765f + 1;
        this.f11765f = i18;
        if (i18 == 0) {
            this.f11765f = i18 + 1;
        }
        int i19 = 0;
        for (com.facebook.react.animated.b bVar4 : list) {
            if (bVar4.f11716b == 0) {
                int i21 = bVar4.f11717c;
                int i22 = this.f11765f;
                if (i21 != i22) {
                    bVar4.f11717c = i22;
                    i19++;
                    arrayDeque.add(bVar4);
                }
            }
        }
        int i23 = 0;
        while (!arrayDeque.isEmpty()) {
            com.facebook.react.animated.b bVar5 = (com.facebook.react.animated.b) arrayDeque.poll();
            try {
                bVar5.g();
                if (bVar5 instanceof m) {
                    ((m) bVar5).k();
                }
            } catch (JSApplicationCausedNativeException e11) {
                nd.a.k("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e11);
            }
            if (bVar5 instanceof s) {
                ((s) bVar5).l();
            }
            if (bVar5.f11715a != null) {
                for (int i24 = 0; i24 < bVar5.f11715a.size(); i24++) {
                    com.facebook.react.animated.b bVar6 = bVar5.f11715a.get(i24);
                    int i25 = bVar6.f11716b - 1;
                    bVar6.f11716b = i25;
                    int i26 = bVar6.f11717c;
                    int i27 = this.f11765f;
                    if (i26 != i27 && i25 == 0) {
                        bVar6.f11717c = i27;
                        i19++;
                        arrayDeque.add(bVar6);
                    } else if (i26 == i27) {
                        i23++;
                    }
                }
            }
        }
        if (i12 != i19) {
            if (this.f11769j) {
                return;
            }
            this.f11769j = true;
            nd.a.j("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
            for (com.facebook.react.animated.b bVar7 : list) {
                nd.a.j("NativeAnimatedNodesManager", bVar7.e());
            }
            IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i23 > 0 ? "cycles (" + i23 + ")" : "disconnected regions") + ", there are " + i12 + " but toposort visited only " + i19);
            boolean z11 = this.f11767h;
            if (z11 && i23 == 0) {
                ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
                return;
            } else if (z11) {
                ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException(illegalStateException));
                return;
            } else {
                throw illegalStateException;
            }
        }
        this.f11769j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(com.facebook.react.uimanager.events.c cVar) {
        ReactApplicationContext reactApplicationContext;
        UIManager g11;
        if (this.f11763d.isEmpty() || (reactApplicationContext = this.f11764e) == null || (g11 = t0.g(reactApplicationContext, cVar.getUIManagerType())) == null) {
            return;
        }
        String resolveCustomDirectEventName = g11.resolveCustomDirectEventName(cVar.getEventName());
        if (resolveCustomDirectEventName == null) {
            resolveCustomDirectEventName = "";
        }
        Map<String, List<EventAnimationDriver>> map = this.f11763d;
        List<EventAnimationDriver> list = map.get(cVar.getViewTag() + resolveCustomDirectEventName);
        if (list != null) {
            for (EventAnimationDriver eventAnimationDriver : list) {
                A(eventAnimationDriver.mValueNode);
                cVar.dispatch(eventAnimationDriver);
                this.f11766g.add(eventAnimationDriver.mValueNode);
            }
            C(this.f11766g);
            this.f11766g.clear();
        }
    }

    public void B(int i11) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).m(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    public void e(int i11, String str, ReadableMap readableMap) {
        int i12 = readableMap.getInt("animatedValueTag");
        com.facebook.react.animated.b bVar = this.f11760a.get(i12);
        if (bVar != null) {
            if (bVar instanceof s) {
                ReadableArray array = readableMap.getArray("nativeEventPath");
                ArrayList arrayList = new ArrayList(array.size());
                for (int i13 = 0; i13 < array.size(); i13++) {
                    arrayList.add(array.getString(i13));
                }
                EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (s) bVar);
                String str2 = i11 + str;
                if (this.f11763d.containsKey(str2)) {
                    this.f11763d.get(str2).add(eventAnimationDriver);
                    return;
                }
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(eventAnimationDriver);
                this.f11763d.put(str2, arrayList2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i11 + "] connected to event (" + str + ") should be of type " + s.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i12 + "] does not exist");
    }

    public void f(int i11, int i12) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null) {
            if (bVar instanceof m) {
                ReactApplicationContext reactApplicationContext = this.f11764e;
                if (reactApplicationContext != null) {
                    UIManager i13 = t0.i(reactApplicationContext, i12);
                    if (i13 == null) {
                        ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i12));
                        return;
                    }
                    ((m) bVar).h(i12, i13);
                    this.f11762c.put(i11, bVar);
                    return;
                }
                throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i12);
            }
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i12 + "] should be of type " + m.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i11 + "] does not exist");
    }

    public void g(int i11, int i12) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null) {
            com.facebook.react.animated.b bVar2 = this.f11760a.get(i12);
            if (bVar2 != null) {
                bVar.a(bVar2);
                this.f11762c.put(i12, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i12 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i11 + "] does not exist");
    }

    public void h(int i11, ReadableMap readableMap) {
        com.facebook.react.animated.b qVar;
        if (this.f11760a.get(i11) == null) {
            String string = readableMap.getString("type");
            if ("style".equals(string)) {
                qVar = new o(readableMap, this);
            } else if ("value".equals(string)) {
                qVar = new s(readableMap);
            } else if ("props".equals(string)) {
                qVar = new m(readableMap, this);
            } else if ("interpolation".equals(string)) {
                qVar = new i(readableMap);
            } else if ("addition".equals(string)) {
                qVar = new com.facebook.react.animated.a(readableMap, this);
            } else if ("subtraction".equals(string)) {
                qVar = new p(readableMap, this);
            } else if ("division".equals(string)) {
                qVar = new g(readableMap, this);
            } else if ("multiplication".equals(string)) {
                qVar = new k(readableMap, this);
            } else if ("modulus".equals(string)) {
                qVar = new j(readableMap, this);
            } else if ("diffclamp".equals(string)) {
                qVar = new f(readableMap, this);
            } else if ("transform".equals(string)) {
                qVar = new r(readableMap, this);
            } else if ("tracking".equals(string)) {
                qVar = new q(readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            qVar.f11718d = i11;
            this.f11760a.put(i11, qVar);
            this.f11762c.put(i11, qVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i11 + "] already exists");
    }

    public void i(int i11, int i12) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null) {
            if (bVar instanceof m) {
                ((m) bVar).i(i12);
                return;
            }
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i12 + "] should be of type " + m.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i11 + "] does not exist");
    }

    public void j(int i11, int i12) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null) {
            com.facebook.react.animated.b bVar2 = this.f11760a.get(i12);
            if (bVar2 != null) {
                bVar.f(bVar2);
                this.f11762c.put(i12, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i12 + "] does not exist");
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i11 + "] does not exist");
    }

    public void k(int i11) {
        this.f11760a.remove(i11);
        this.f11762c.remove(i11);
    }

    public void l(int i11) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).h();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    public void m(int i11) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).i();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.facebook.react.animated.b n(int i11) {
        return this.f11760a.get(i11);
    }

    public void o(int i11, Callback callback) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null && (bVar instanceof s)) {
            callback.invoke(Double.valueOf(((s) bVar).k()));
            return;
        }
        throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i11 + "] does not exist or is not a 'value' node");
    }

    @Override // com.facebook.react.uimanager.events.f
    public void onEventDispatch(com.facebook.react.uimanager.events.c cVar) {
        if (UiThreadUtil.isOnUiThread()) {
            p(cVar);
        } else {
            UiThreadUtil.runOnUiThread(new b(cVar));
        }
    }

    public boolean q() {
        return this.f11761b.size() > 0 || this.f11762c.size() > 0;
    }

    public void r(int i11) {
        if (i11 == 2 && this.f11767h) {
            return;
        }
        if (i11 == 1 && this.f11768i) {
            return;
        }
        this.f11764e.runOnUiQueueThread(new a(i11, this));
    }

    public void s(int i11, String str, int i12) {
        String str2 = i11 + str;
        if (this.f11763d.containsKey(str2)) {
            List<EventAnimationDriver> list = this.f11763d.get(str2);
            if (list.size() == 1) {
                this.f11763d.remove(i11 + str);
                return;
            }
            ListIterator<EventAnimationDriver> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().mValueNode.f11718d == i12) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    public void t(int i11) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar == null) {
            return;
        }
        if (bVar instanceof m) {
            ((m) bVar).j();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + m.class.getName());
    }

    public void u(long j11) {
        UiThreadUtil.assertOnUiThread();
        for (int i11 = 0; i11 < this.f11762c.size(); i11++) {
            this.f11766g.add(this.f11762c.valueAt(i11));
        }
        this.f11762c.clear();
        boolean z11 = false;
        for (int i12 = 0; i12 < this.f11761b.size(); i12++) {
            d valueAt = this.f11761b.valueAt(i12);
            valueAt.b(j11);
            this.f11766g.add(valueAt.f11720b);
            if (valueAt.f11719a) {
                z11 = true;
            }
        }
        C(this.f11766g);
        this.f11766g.clear();
        if (z11) {
            for (int size = this.f11761b.size() - 1; size >= 0; size--) {
                d valueAt2 = this.f11761b.valueAt(size);
                if (valueAt2.f11719a) {
                    if (valueAt2.f11721c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        valueAt2.f11721c.invoke(createMap);
                    }
                    this.f11761b.removeAt(size);
                }
            }
        }
    }

    public void v(int i11, double d11) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).f11814g = d11;
            this.f11762c.put(i11, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    public void w(int i11, double d11) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null && (bVar instanceof s)) {
            A(bVar);
            ((s) bVar).f11813f = d11;
            this.f11762c.put(i11, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    public void x(int i11, int i12, ReadableMap readableMap, Callback callback) {
        d eVar;
        com.facebook.react.animated.b bVar = this.f11760a.get(i12);
        if (bVar != null) {
            if (bVar instanceof s) {
                d dVar = this.f11761b.get(i11);
                if (dVar != null) {
                    dVar.a(readableMap);
                    return;
                }
                String string = readableMap.getString("type");
                if ("frames".equals(string)) {
                    eVar = new h(readableMap);
                } else if ("spring".equals(string)) {
                    eVar = new n(readableMap);
                } else if ("decay".equals(string)) {
                    eVar = new e(readableMap);
                } else {
                    throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i12 + "]: " + string);
                }
                eVar.f11722d = i11;
                eVar.f11721c = callback;
                eVar.f11720b = (s) bVar;
                this.f11761b.put(i11, eVar);
                return;
            }
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i12 + "] should be of type " + s.class.getName());
        }
        throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i12 + "] does not exist");
    }

    public void y(int i11, c cVar) {
        com.facebook.react.animated.b bVar = this.f11760a.get(i11);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).m(cVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i11 + "] does not exist, or is not a 'value' node");
    }

    public void z(int i11) {
        for (int i12 = 0; i12 < this.f11761b.size(); i12++) {
            d valueAt = this.f11761b.valueAt(i12);
            if (valueAt.f11722d == i11) {
                if (valueAt.f11721c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f11721c.invoke(createMap);
                }
                this.f11761b.removeAt(i12);
                return;
            }
        }
    }
}