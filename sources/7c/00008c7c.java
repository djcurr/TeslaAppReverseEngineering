package nj;

/* loaded from: classes3.dex */
public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f41726a = new a();

    /* loaded from: classes3.dex */
    class a implements h {
        a() {
        }

        @Override // nj.h
        public boolean a(ci.i iVar) {
            String str = iVar.f9205l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // nj.h
        public g b(ci.i iVar) {
            String str = iVar.f9205l;
            if (str != null) {
                char c11 = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c11 = '\t';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c11 = '\n';
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        return new pj.a(iVar.f9207n);
                    case 1:
                        return new qj.a();
                    case 2:
                        return new wj.b();
                    case 3:
                        return new wj.h();
                    case 4:
                        return new vj.a(iVar.f9207n);
                    case 5:
                        return new sj.a(iVar.f9207n);
                    case 6:
                    case 7:
                        return new oj.a(str, iVar.K, 16000L);
                    case '\b':
                        return new oj.c(iVar.K, iVar.f9207n);
                    case '\t':
                        return new tj.a();
                    case '\n':
                        return new uj.b();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(ci.i iVar);

    g b(ci.i iVar);
}