package d40;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Modifier;
import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
class h {

    /* renamed from: g  reason: collision with root package name */
    static h f23600g;

    /* renamed from: h  reason: collision with root package name */
    static h f23601h;

    /* renamed from: i  reason: collision with root package name */
    static h f23602i;

    /* renamed from: a  reason: collision with root package name */
    boolean f23603a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f23604b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f23605c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f23606d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f23607e = false;

    /* renamed from: f  reason: collision with root package name */
    int f23608f;

    static {
        h hVar = new h();
        f23600g = hVar;
        hVar.f23603a = true;
        hVar.f23604b = false;
        hVar.f23605c = false;
        hVar.f23606d = false;
        hVar.f23607e = true;
        hVar.f23608f = 0;
        h hVar2 = new h();
        f23601h = hVar2;
        hVar2.f23603a = true;
        hVar2.f23604b = true;
        hVar2.f23605c = false;
        hVar2.f23606d = false;
        hVar2.f23607e = false;
        f23600g.f23608f = 1;
        h hVar3 = new h();
        f23602i = hVar3;
        hVar3.f23603a = false;
        hVar3.f23604b = true;
        hVar3.f23605c = false;
        hVar3.f23606d = true;
        hVar3.f23607e = false;
        hVar3.f23608f = 2;
    }

    h() {
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (!this.f23604b) {
            if (clsArr.length == 0) {
                stringBuffer.append("()");
                return;
            } else {
                stringBuffer.append("(..)");
                return;
            }
        }
        stringBuffer.append("(");
        c(stringBuffer, clsArr);
        stringBuffer.append(")");
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (!this.f23605c || clsArr == null || clsArr.length == 0) {
            return;
        }
        stringBuffer.append(" throws ");
        c(stringBuffer, clsArr);
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i11 = 0; i11 < clsArr.length; i11++) {
            if (i11 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i11]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e(int i11) {
        if (this.f23606d) {
            String modifier = Modifier.toString(i11);
            if (modifier.length() == 0) {
                return "";
            }
            return modifier + " ";
        }
        return "";
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f23607e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f23603a);
    }

    String h(Class cls, String str, boolean z11) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            if (z11) {
                return i(str).replace(CoreConstants.DOLLAR, CoreConstants.DOT);
            }
            return str.replace(CoreConstants.DOLLAR, CoreConstants.DOT);
        }
        Class<?> componentType = cls.getComponentType();
        return h(componentType, componentType.getName(), z11) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    String i(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }
}