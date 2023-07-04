package tb;

import bc.m;
import com.drew.imaging.png.PngProcessingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f51872a = {-119, 80, 78, 71, 13, 10, 26, 10};

    public Iterable<b> a(m mVar, Set<d> set) {
        mVar.s(true);
        byte[] bArr = f51872a;
        if (Arrays.equals(bArr, mVar.d(bArr.length))) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                int f11 = mVar.f();
                if (f11 >= 0) {
                    d dVar = new d(mVar.d(4));
                    boolean z13 = set == null || set.contains(dVar);
                    byte[] d11 = mVar.d(f11);
                    mVar.t(4L);
                    if (z13 && hashSet.contains(dVar) && !dVar.a()) {
                        throw new PngProcessingException(String.format("Observed multiple instances of PNG chunk '%s', for which multiples are not allowed", dVar));
                    }
                    d dVar2 = d.f51874d;
                    if (dVar.equals(dVar2)) {
                        z12 = true;
                    } else if (!z12) {
                        throw new PngProcessingException(String.format("First chunk should be '%s', but '%s' was observed", dVar2, dVar));
                    }
                    if (dVar.equals(d.f51876f)) {
                        z11 = true;
                    }
                    if (z13) {
                        arrayList.add(new b(dVar, d11));
                    }
                    hashSet.add(dVar);
                } else {
                    throw new PngProcessingException("PNG chunk length exceeds maximum");
                }
            }
            return arrayList;
        }
        throw new PngProcessingException("PNG signature mismatch");
    }
}