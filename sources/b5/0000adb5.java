package qb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<Byte, List<byte[]>> f48043a = new HashMap<>(10);

    private List<byte[]> b(byte b11) {
        if (this.f48043a.containsKey(Byte.valueOf(b11))) {
            return this.f48043a.get(Byte.valueOf(b11));
        }
        ArrayList arrayList = new ArrayList();
        this.f48043a.put(Byte.valueOf(b11), arrayList);
        return arrayList;
    }

    private List<byte[]> c(byte b11) {
        return this.f48043a.get(Byte.valueOf(b11));
    }

    public void a(byte b11, byte[] bArr) {
        b(b11).add(bArr);
    }

    public Iterable<byte[]> d(byte b11) {
        List<byte[]> c11 = c(b11);
        return c11 == null ? new ArrayList() : c11;
    }

    public Iterable<byte[]> e(com.drew.imaging.jpeg.a aVar) {
        return d(aVar.byteValue);
    }
}