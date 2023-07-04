package wi;

import bj.h;
import ci.i;

/* loaded from: classes3.dex */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f55902a = new a();

    /* loaded from: classes3.dex */
    class a implements c {
        a() {
        }

        @Override // wi.c
        public boolean a(i iVar) {
            String str = iVar.f9205l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // wi.c
        public b b(i iVar) {
            String str = iVar.f9205l;
            if (str != null) {
                char c11 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c11 = 4;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        return new xi.b();
                    case 1:
                        return new aj.a();
                    case 2:
                        return new h();
                    case 3:
                        return new yi.b();
                    case 4:
                        return new dj.c();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(i iVar);

    b b(i iVar);
}