package ic;

import java.util.HashMap;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class f1 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30327e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30327e = hashMap;
        hashMap.put(1299, "Makernote Thumb Offset");
        hashMap.put(1300, "Makernote Thumb Length");
        hashMap.put(Integer.valueOf((int) PKIFailureInfo.certRevoked), "Makernote Thumb Version");
    }

    public f1() {
        E(new e1(this));
    }

    @Override // cc.b
    public String n() {
        return "Sony Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30327e;
    }
}