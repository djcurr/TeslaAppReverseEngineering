package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private Random f1031a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f1032b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f1033c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f1034d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f1035e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f1036f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f1037g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f1038h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends androidx.activity.result.d<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a f1044b;

        a(String str, f.a aVar) {
            this.f1043a = str;
            this.f1044b = aVar;
        }

        @Override // androidx.activity.result.d
        public f.a<I, ?> a() {
            return this.f1044b;
        }

        @Override // androidx.activity.result.d
        public void c(I i11, androidx.core.app.b bVar) {
            Integer num = ActivityResultRegistry.this.f1033c.get(this.f1043a);
            if (num != null) {
                ActivityResultRegistry.this.f1035e.add(this.f1043a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f1044b, i11, bVar);
                    return;
                } catch (Exception e11) {
                    ActivityResultRegistry.this.f1035e.remove(this.f1043a);
                    throw e11;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1044b + " and input " + i11 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.d
        public void d() {
            ActivityResultRegistry.this.l(this.f1043a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends androidx.activity.result.d<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f1046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a f1047b;

        b(String str, f.a aVar) {
            this.f1046a = str;
            this.f1047b = aVar;
        }

        @Override // androidx.activity.result.d
        public f.a<I, ?> a() {
            return this.f1047b;
        }

        @Override // androidx.activity.result.d
        public void c(I i11, androidx.core.app.b bVar) {
            Integer num = ActivityResultRegistry.this.f1033c.get(this.f1046a);
            if (num != null) {
                ActivityResultRegistry.this.f1035e.add(this.f1046a);
                ActivityResultRegistry.this.f(num.intValue(), this.f1047b, i11, bVar);
                return;
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f1047b + " and input " + i11 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.d
        public void d() {
            ActivityResultRegistry.this.l(this.f1046a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        final androidx.activity.result.b<O> f1049a;

        /* renamed from: b  reason: collision with root package name */
        final f.a<?, O> f1050b;

        c(androidx.activity.result.b<O> bVar, f.a<?, O> aVar) {
            this.f1049a = bVar;
            this.f1050b = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final p f1051a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<s> f1052b = new ArrayList<>();

        d(p pVar) {
            this.f1051a = pVar;
        }

        void a(s sVar) {
            this.f1051a.a(sVar);
            this.f1052b.add(sVar);
        }

        void b() {
            Iterator<s> it2 = this.f1052b.iterator();
            while (it2.hasNext()) {
                this.f1051a.c(it2.next());
            }
            this.f1052b.clear();
        }
    }

    private void a(int i11, String str) {
        this.f1032b.put(Integer.valueOf(i11), str);
        this.f1033c.put(str, Integer.valueOf(i11));
    }

    private <O> void d(String str, int i11, Intent intent, c<O> cVar) {
        if (cVar != null && cVar.f1049a != null && this.f1035e.contains(str)) {
            cVar.f1049a.a(cVar.f1050b.parseResult(i11, intent));
            this.f1035e.remove(str);
            return;
        }
        this.f1037g.remove(str);
        this.f1038h.putParcelable(str, new androidx.activity.result.a(i11, intent));
    }

    private int e() {
        int nextInt = this.f1031a.nextInt(2147418112);
        while (true) {
            int i11 = nextInt + 65536;
            if (!this.f1032b.containsKey(Integer.valueOf(i11))) {
                return i11;
            }
            nextInt = this.f1031a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f1033c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i11, int i12, Intent intent) {
        String str = this.f1032b.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        d(str, i12, intent, this.f1036f.get(str));
        return true;
    }

    public final <O> boolean c(int i11, O o11) {
        androidx.activity.result.b<?> bVar;
        String str = this.f1032b.get(Integer.valueOf(i11));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f1036f.get(str);
        if (cVar != null && (bVar = cVar.f1049a) != null) {
            if (this.f1035e.remove(str)) {
                bVar.a(o11);
                return true;
            }
            return true;
        }
        this.f1038h.remove(str);
        this.f1037g.put(str, o11);
        return true;
    }

    public abstract <I, O> void f(int i11, f.a<I, O> aVar, I i12, androidx.core.app.b bVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f1035e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f1031a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f1038h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
            String str = stringArrayList.get(i11);
            if (this.f1033c.containsKey(str)) {
                Integer remove = this.f1033c.remove(str);
                if (!this.f1038h.containsKey(str)) {
                    this.f1032b.remove(remove);
                }
            }
            a(integerArrayList.get(i11).intValue(), stringArrayList.get(i11));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f1033c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f1033c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f1035e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f1038h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f1031a);
    }

    public final <I, O> androidx.activity.result.d<I> i(final String str, v vVar, final f.a<I, O> aVar, final androidx.activity.result.b<O> bVar) {
        p lifecycle = vVar.getLifecycle();
        if (!lifecycle.b().isAtLeast(p.c.STARTED)) {
            k(str);
            d dVar = this.f1034d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new s() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.s
                public void g(v vVar2, p.b bVar2) {
                    if (p.b.ON_START.equals(bVar2)) {
                        ActivityResultRegistry.this.f1036f.put(str, new c<>(bVar, aVar));
                        if (ActivityResultRegistry.this.f1037g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f1037g.get(str);
                            ActivityResultRegistry.this.f1037g.remove(str);
                            bVar.a(obj);
                        }
                        androidx.activity.result.a aVar2 = (androidx.activity.result.a) ActivityResultRegistry.this.f1038h.getParcelable(str);
                        if (aVar2 != null) {
                            ActivityResultRegistry.this.f1038h.remove(str);
                            bVar.a(aVar.parseResult(aVar2.b(), aVar2.a()));
                        }
                    } else if (p.b.ON_STOP.equals(bVar2)) {
                        ActivityResultRegistry.this.f1036f.remove(str);
                    } else if (p.b.ON_DESTROY.equals(bVar2)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f1034d.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + vVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.d<I> j(String str, f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        k(str);
        this.f1036f.put(str, new c<>(bVar, aVar));
        if (this.f1037g.containsKey(str)) {
            Object obj = this.f1037g.get(str);
            this.f1037g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.f1038h.getParcelable(str);
        if (aVar2 != null) {
            this.f1038h.remove(str);
            bVar.a(aVar.parseResult(aVar2.b(), aVar2.a()));
        }
        return new b(str, aVar);
    }

    final void l(String str) {
        Integer remove;
        if (!this.f1035e.contains(str) && (remove = this.f1033c.remove(str)) != null) {
            this.f1032b.remove(remove);
        }
        this.f1036f.remove(str);
        if (this.f1037g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f1037g.get(str));
            this.f1037g.remove(str);
        }
        if (this.f1038h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f1038h.getParcelable(str));
            this.f1038h.remove(str);
        }
        d dVar = this.f1034d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f1034d.remove(str);
        }
    }
}