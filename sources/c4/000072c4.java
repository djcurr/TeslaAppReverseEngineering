package h60;

import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class s implements AlgorithmParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private Map f28963a;

    public s() {
        this(new HashMap());
    }

    private s(Map map) {
        this.f28963a = Collections.unmodifiableMap(map);
    }

    public Map a() {
        return this.f28963a;
    }
}