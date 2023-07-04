package ic;

/* loaded from: classes.dex */
public class q extends cc.h<r> {
    public q(r rVar) {
        super(rVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1037) {
            return super.f(i11);
        }
        return v();
    }

    public String v() {
        byte[] e11 = ((r) this.f9060a).e(1037);
        if (e11 == null || e11.length < 4) {
            return null;
        }
        String format = String.format("%d %d %d %d", Byte.valueOf(e11[0]), Byte.valueOf(e11[1]), Byte.valueOf(e11[2]), Byte.valueOf(e11[3]));
        return format.equals("0 0 0 0") ? "Program AE" : format.equals("1 0 0 0") ? "Aperture-priority AE" : format.equals("1 1 0 0") ? "Aperture-priority AE (1)" : format.equals("2 0 0 0") ? "Shutter speed priority AE" : format.equals("3 0 0 0") ? "Manual" : String.format("Unknown (%s)", format);
    }
}