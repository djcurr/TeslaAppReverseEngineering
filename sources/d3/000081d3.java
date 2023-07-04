package l1;

import h00.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import l1.f;
import wz.s0;
import wz.w;

/* loaded from: classes.dex */
final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final l<Object, Boolean> f36368a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<Object>> f36369b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<h00.a<Object>>> f36370c;

    /* loaded from: classes.dex */
    public static final class a implements f.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f36372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.a<Object> f36373c;

        a(String str, h00.a<? extends Object> aVar) {
            this.f36372b = str;
            this.f36373c = aVar;
        }

        @Override // l1.f.a
        public void a() {
            List list = (List) g.this.f36370c.remove(this.f36372b);
            if (list != null) {
                list.remove(this.f36373c);
            }
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            g.this.f36370c.put(this.f36372b, list);
        }
    }

    public g(Map<String, ? extends List<? extends Object>> map, l<Object, Boolean> canBeSaved) {
        s.g(canBeSaved, "canBeSaved");
        this.f36368a = canBeSaved;
        Map<String, List<Object>> y11 = map == null ? null : s0.y(map);
        this.f36369b = y11 == null ? new LinkedHashMap<>() : y11;
        this.f36370c = new LinkedHashMap();
    }

    @Override // l1.f
    public boolean a(Object value) {
        s.g(value, "value");
        return this.f36368a.invoke(value).booleanValue();
    }

    @Override // l1.f
    public Map<String, List<Object>> b() {
        Map<String, List<Object>> y11;
        ArrayList e11;
        y11 = s0.y(this.f36369b);
        for (Map.Entry<String, List<h00.a<Object>>> entry : this.f36370c.entrySet()) {
            String key = entry.getKey();
            List<h00.a<Object>> value = entry.getValue();
            int i11 = 0;
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (a(invoke)) {
                    e11 = w.e(invoke);
                    y11.put(key, e11);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                while (i11 < size) {
                    int i12 = i11 + 1;
                    Object invoke2 = value.get(i11).invoke();
                    if (invoke2 != null && !a(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                    i11 = i12;
                }
                y11.put(key, arrayList);
            }
        }
        return y11;
    }

    @Override // l1.f
    public Object c(String key) {
        s.g(key, "key");
        List<Object> remove = this.f36369b.remove(key);
        if (remove == null || !(!remove.isEmpty())) {
            return null;
        }
        if (remove.size() > 1) {
            this.f36369b.put(key, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }

    @Override // l1.f
    public f.a d(String key, h00.a<? extends Object> valueProvider) {
        boolean w11;
        s.g(key, "key");
        s.g(valueProvider, "valueProvider");
        w11 = v.w(key);
        if (!w11) {
            Map<String, List<h00.a<Object>>> map = this.f36370c;
            List<h00.a<Object>> list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(valueProvider);
            return new a(key, valueProvider);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}