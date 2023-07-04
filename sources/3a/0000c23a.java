package y70;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    final Method f59377a;

    /* renamed from: b  reason: collision with root package name */
    final ThreadMode f59378b;

    /* renamed from: c  reason: collision with root package name */
    final Class<?> f59379c;

    /* renamed from: d  reason: collision with root package name */
    final int f59380d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f59381e;

    /* renamed from: f  reason: collision with root package name */
    String f59382f;

    public m(Method method, Class<?> cls, ThreadMode threadMode, int i11, boolean z11) {
        this.f59377a = method;
        this.f59378b = threadMode;
        this.f59379c = cls;
        this.f59380d = i11;
        this.f59381e = z11;
    }

    private synchronized void a() {
        if (this.f59382f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f59377a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f59377a.getName());
            sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb2.append(this.f59379c.getName());
            this.f59382f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            a();
            m mVar = (m) obj;
            mVar.a();
            return this.f59382f.equals(mVar.f59382f);
        }
        return false;
    }

    public int hashCode() {
        return this.f59377a.hashCode();
    }
}