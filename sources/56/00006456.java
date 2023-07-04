package ct;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import io.realm.a0;
import io.realm.exceptions.RealmError;
import io.realm.f0;
import io.realm.g0;
import io.realm.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import zu.z;

/* loaded from: classes6.dex */
public class i {

    /* renamed from: e */
    private static volatile i f23090e;

    /* renamed from: f */
    private static final BlockingQueue<Runnable> f23091f;

    /* renamed from: g */
    private static final ThreadPoolExecutor f23092g;

    /* renamed from: a */
    private final com.tesla.logging.g f23093a = com.tesla.logging.g.g("RealmHelper");

    /* renamed from: d */
    private final Map<String, a> f23096d = new HashMap();

    /* renamed from: b */
    private final g0 f23094b = new g0.a().d("TrealmStorage").e(3).c(new o()).a();

    /* renamed from: c */
    private final n f23095c = n.c();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a */
        f0<q0<j>> f23097a;

        private a() {
        }
    }

    static {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1000);
        f23091f = arrayBlockingQueue;
        f23092g = new ThreadPoolExecutor(5, 16, 500L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
    }

    private i() {
    }

    public static /* synthetic */ void a(i iVar, String str, String str2, List list, CountDownLatch countDownLatch) {
        iVar.m(str, str2, list, countDownLatch);
    }

    public static /* synthetic */ void b(i iVar, Map map, Bundle bundle, String str, CountDownLatch countDownLatch) {
        iVar.o(map, bundle, str, countDownLatch);
    }

    private String e(String str, String str2) {
        return str.startsWith("_") ? this.f23095c.a(str2) : str2;
    }

    private String f(String str, String str2) {
        return str.startsWith("_") ? this.f23095c.b(str2) : str2;
    }

    public static i i() {
        if (f23090e == null) {
            synchronized (i.class) {
                if (f23090e == null) {
                    f23090e = new i();
                }
            }
        }
        return f23090e;
    }

    private q0<j> k(String str, a0 a0Var) {
        return a0Var.v1(j.class).i("async_key", str).k();
    }

    private void l(Error error) {
        String message;
        if ((error instanceof RealmError) && (message = error.getMessage()) != null && message.contains("No space left on device")) {
            bt.a.b();
        }
    }

    public /* synthetic */ void m(String str, String str2, List list, CountDownLatch countDownLatch) {
        String e11 = e(str, str2);
        synchronized (list) {
            list.add(new Pair(str, e11));
        }
        countDownLatch.countDown();
    }

    public /* synthetic */ void n(z zVar, String str, q0 q0Var) {
        if (q0Var.size() == 1) {
            zVar.a(str, e(str, ((j) q0Var.first()).l()));
        } else {
            zVar.b(str);
        }
    }

    public /* synthetic */ void o(Map map, Bundle bundle, String str, CountDownLatch countDownLatch) {
        synchronized (map) {
            map.put(str, f(str, bundle.getString(str)));
        }
        countDownLatch.countDown();
    }

    public boolean d(List<String> list, List<String> list2) {
        try {
            a0 X0 = a0.X0(this.f23094b);
            X0.beginTransaction();
            q0 k11 = X0.v1(j.class).k();
            if (list.size() > 0) {
                k11 = k11.k().p().l("async_key", (String[]) list.toArray(new String[0])).k();
            }
            if (list2.size() > 0) {
                for (String str : list2) {
                    k11 = k11.k().p().c("async_key", str).k();
                }
            }
            if (k11.size() > 0) {
                k11.b();
            }
            com.tesla.logging.g gVar = this.f23093a;
            gVar.a("Clear Values: Keep Keys [" + TextUtils.join(",", list) + "] Keep Prefixes [" + TextUtils.join(",", list2) + "] Success for string items");
            q0 k12 = X0.v1(l.class).k();
            if (list.size() > 0) {
                k12 = k12.k().p().l("async_key", (String[]) list.toArray(new String[0])).k();
            }
            if (list2.size() > 0) {
                for (String str2 : list2) {
                    k12 = k12.k().p().c("async_key", str2).k();
                }
            }
            if (k12.size() > 0) {
                k12.b();
            }
            com.tesla.logging.g gVar2 = this.f23093a;
            gVar2.a("Clear Values: Keep Keys [" + TextUtils.join(",", list) + "] Keep Prefixes [" + TextUtils.join(",", list2) + "] Success for raw items");
            X0.j();
            X0.close();
            return true;
        } catch (Error e11) {
            this.f23093a.f("Clear Values Error", e11);
            l(e11);
            return false;
        }
    }

    public String g(String str) {
        try {
            a0 X0 = a0.X0(this.f23094b);
            q0<j> k11 = k(str, X0);
            if (k11.size() == 1) {
                com.tesla.logging.g gVar = this.f23093a;
                gVar.a("Retrieving Value " + str + " Success ");
                String e11 = e(str, k11.get(0).l());
                if (X0 != null) {
                    X0.close();
                }
                return e11;
            }
            com.tesla.logging.g gVar2 = this.f23093a;
            gVar2.a("Retrieving Value " + str + " Fail");
            if (X0 != null) {
                X0.close();
            }
            return null;
        } catch (Error e12) {
            com.tesla.logging.g gVar3 = this.f23093a;
            gVar3.d("Retrieving Value " + str + " Error", e12);
            l(e12);
            return null;
        }
    }

    public List<Pair<String, String>> h(List<String> list, List<String> list2) {
        if (list.size() == 0 && list2.size() == 0) {
            return Collections.emptyList();
        }
        try {
            a0 X0 = a0.X0(this.f23094b);
            try {
                ArrayList<j> arrayList = new ArrayList();
                if (list.size() != 0) {
                    arrayList.addAll(X0.D0(X0.v1(j.class).l("async_key", (String[]) list.toArray(new String[0])).k()));
                }
                if (list2.size() != 0) {
                    for (String str : list2) {
                        arrayList.addAll(X0.D0(X0.v1(j.class).c("async_key", str).k()));
                    }
                }
                com.tesla.logging.g gVar = this.f23093a;
                gVar.a("Retrieve Values: Keys [" + TextUtils.join(",", list) + "] Prefixes [" + TextUtils.join(",", list2) + "] Success with # of Results " + arrayList.size());
                final List<Pair<String, String>> synchronizedList = Collections.synchronizedList(new ArrayList());
                final CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                for (j jVar : arrayList) {
                    final String k11 = jVar.k();
                    final String l11 = jVar.l();
                    f23092g.execute(new Runnable() { // from class: ct.f
                        {
                            i.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            i.a(i.this, k11, l11, synchronizedList, countDownLatch);
                        }
                    });
                }
                countDownLatch.await();
                if (X0 != null) {
                    X0.close();
                }
                return synchronizedList;
            } catch (Throwable th2) {
                if (X0 != null) {
                    try {
                        X0.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Error e11) {
            this.f23093a.f("Retrieving Values Error", e11);
            l(e11);
            return Collections.emptyList();
        } catch (InterruptedException e12) {
            this.f23093a.d("Countdown Interrupted", e12);
            return Collections.emptyList();
        }
    }

    public List<Pair<String, String>> j() {
        return new ArrayList();
    }

    public String p(final String str, final z zVar) {
        String uuid = UUID.randomUUID().toString();
        try {
            q0<j> k11 = k(str, a0.X0(this.f23094b));
            a aVar = new a();
            aVar.f23097a = new f0() { // from class: ct.e
                @Override // io.realm.f0
                public final void a(Object obj) {
                    i.this.n(zVar, str, (q0) obj);
                }
            };
            this.f23096d.put(uuid, aVar);
            k11.h(aVar.f23097a);
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.f23093a;
            gVar.f("Failed to observe key " + str, e11);
        }
        return uuid;
    }

    public boolean q(String str) {
        try {
            a0 X0 = a0.X0(this.f23094b);
            X0.beginTransaction();
            X0.v1(j.class).i("async_key", str).k().b();
            X0.v1(l.class).i("async_key", str).k().b();
            com.tesla.logging.g gVar = this.f23093a;
            gVar.a("Remove Value " + str + " Success");
            X0.j();
            X0.close();
            return true;
        } catch (Error e11) {
            com.tesla.logging.g gVar2 = this.f23093a;
            gVar2.f("Remove Value " + str + " Error", e11);
            l(e11);
            return false;
        }
    }

    public boolean r(List<String> list, List<String> list2) {
        if (list.size() == 0 && list2.size() == 0) {
            return true;
        }
        try {
            a0 X0 = a0.X0(this.f23094b);
            X0.beginTransaction();
            if (list.size() != 0) {
                X0.v1(j.class).l("async_key", (String[]) list.toArray(new String[0])).k().b();
                X0.v1(l.class).l("async_key", (String[]) list.toArray(new String[0])).k().b();
            }
            if (list2.size() != 0) {
                for (String str : list2) {
                    X0.v1(j.class).c("async_key", str).k().b();
                    X0.v1(l.class).c("async_key", str).k().b();
                }
            }
            com.tesla.logging.g gVar = this.f23093a;
            gVar.a("Remove Values: Keys [" + TextUtils.join(",", list) + "] Prefixes [" + TextUtils.join(",", list2) + "] Success");
            X0.j();
            X0.close();
            return true;
        } catch (Error e11) {
            this.f23093a.f("Remove Values Error", e11);
            l(e11);
            return false;
        }
    }

    public boolean s(final Bundle bundle) {
        a0 a0Var = null;
        try {
            try {
                try {
                    Set<String> keySet = bundle.keySet();
                    final Map synchronizedMap = Collections.synchronizedMap(new HashMap());
                    final CountDownLatch countDownLatch = new CountDownLatch(keySet.size());
                    for (final String str : keySet) {
                        f23092g.execute(new Runnable() { // from class: ct.g
                            {
                                i.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                i.b(i.this, synchronizedMap, bundle, str, countDownLatch);
                            }
                        });
                    }
                    countDownLatch.await();
                    a0Var = a0.X0(this.f23094b);
                    a0Var.beginTransaction();
                    for (String str2 : keySet) {
                        a0Var.I0(new j().m(str2).n((String) synchronizedMap.get(str2)), new io.realm.o[0]);
                    }
                    a0Var.j();
                    a0Var.close();
                    return true;
                } catch (InterruptedException e11) {
                    this.f23093a.d("Countdown Interrupted", e11);
                    if (a0Var != null) {
                        a0Var.close();
                    }
                    return false;
                }
            } catch (Error e12) {
                this.f23093a.f("Set Values Error", e12);
                l(e12);
                if (a0Var != null) {
                    a0Var.close();
                }
                return false;
            }
        } catch (Throwable th2) {
            if (a0Var != null) {
                a0Var.close();
            }
            throw th2;
        }
    }

    public boolean t(String str, String str2) {
        if (str2 == null) {
            return q(str);
        }
        try {
            a0 X0 = a0.X0(this.f23094b);
            X0.beginTransaction();
            X0.I0(new j().m(str).n(f(str, str2)), new io.realm.o[0]);
            com.tesla.logging.g gVar = this.f23093a;
            gVar.a("Set Value " + str + " Success");
            X0.j();
            X0.close();
            return true;
        } catch (Error e11) {
            com.tesla.logging.g gVar2 = this.f23093a;
            gVar2.f("Set Value " + str + " Error", e11);
            l(e11);
            return false;
        }
    }
}