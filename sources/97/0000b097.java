package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final Method f49401a;

    /* renamed from: b  reason: collision with root package name */
    private final List<?> f49402b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Method method, List<?> list) {
        this.f49401a = method;
        this.f49402b = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.f49401a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f49401a.getDeclaringClass().getName(), this.f49401a.getName(), this.f49402b);
    }
}