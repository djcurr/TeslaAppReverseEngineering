package qc;

/* loaded from: classes.dex */
public class a extends cc.h<b> {
    public a(b bVar) {
        super(bVar);
    }

    @Override // cc.h
    public String f(int i11) {
        if (i11 != 1) {
            return super.f(i11);
        }
        return v();
    }

    public String v() {
        Integer l11 = ((b) this.f9060a).l(1);
        if (l11 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l11);
        sb2.append(l11.intValue() == 1 ? " Huffman table" : " Huffman tables");
        return sb2.toString();
    }
}