package d40;

import a40.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class c implements a40.a {

    /* renamed from: a  reason: collision with root package name */
    Object f23582a;

    /* renamed from: b  reason: collision with root package name */
    Object f23583b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f23584c;

    /* renamed from: d  reason: collision with root package name */
    a.InterfaceC0010a f23585d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements a.InterfaceC0010a {

        /* renamed from: a  reason: collision with root package name */
        String f23586a;

        /* renamed from: b  reason: collision with root package name */
        a40.b f23587b;

        public a(int i11, String str, a40.b bVar, b40.b bVar2) {
            this.f23586a = str;
            this.f23587b = bVar;
        }

        public String a() {
            return this.f23586a;
        }

        public a40.b b() {
            return this.f23587b;
        }

        String c(h hVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(hVar.d(a()));
            stringBuffer.append("(");
            stringBuffer.append(((f) b()).k(hVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // a40.a.InterfaceC0010a
        public final String toString() {
            return c(h.f23601h);
        }
    }

    public c(a.InterfaceC0010a interfaceC0010a, Object obj, Object obj2, Object[] objArr) {
        this.f23585d = interfaceC0010a;
        this.f23582a = obj;
        this.f23583b = obj2;
        this.f23584c = objArr;
    }

    @Override // a40.a
    public Object a() {
        return this.f23583b;
    }

    public final String toString() {
        return this.f23585d.toString();
    }
}