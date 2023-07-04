package hq;

import com.adyen.checkout.components.model.payments.request.Address;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a */
    public static g f29395a = g.f29386h;

    /* renamed from: b */
    public static final kq.d f29396b = new kq.d();

    /* renamed from: c */
    public static final lq.e f29397c = new lq.e();

    public static void a(String str, Appendable appendable, g gVar) {
        if (str == null) {
            return;
        }
        gVar.f(str, appendable);
    }

    public static void b(Object obj, Appendable appendable, g gVar) {
        if (obj == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
            return;
        }
        Class<?> cls = obj.getClass();
        kq.d dVar = f29396b;
        kq.e<Object> a11 = dVar.a(cls);
        if (a11 == null) {
            if (cls.isArray()) {
                a11 = kq.d.f35682k;
            } else {
                a11 = dVar.b(obj.getClass());
                if (a11 == null) {
                    a11 = kq.d.f35681j;
                }
            }
            dVar.d(a11, cls);
        }
        a11.a(obj, appendable, gVar);
    }
}