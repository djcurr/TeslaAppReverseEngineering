package nz;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f41995a;

    public c(List<f> list) {
        this.f41995a = list;
    }

    @Override // nz.f
    public Map<String, String> getMap(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (f fVar : this.f41995a) {
            concurrentHashMap.putAll(fVar.getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // nz.f
    public String getProperty(String str) {
        for (f fVar : this.f41995a) {
            String property = fVar.getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}