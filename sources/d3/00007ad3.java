package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.List;

/* loaded from: classes7.dex */
class e implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f32987a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(List list) {
        this.f32987a = list;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            g.d(new f());
            return null;
        }
        try {
            g gVar = (g) g.class.cast(Class.forName(property, true, g.class.getClassLoader()).newInstance());
            g.d(gVar);
            this.f32987a.add(gVar);
            return null;
        } catch (Exception e11) {
            throw new Error(e11);
        }
    }
}