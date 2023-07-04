package ha;

import android.content.Context;
import com.bumptech.glide.load.Transformation;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public class c<T> implements h<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Collection<? extends h<T>> f29010b;

    @SafeVarargs
    public c(Transformation<T>... transformationArr) {
        if (transformationArr.length != 0) {
            this.f29010b = Arrays.asList(transformationArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // ha.h
    public ja.c<T> a(Context context, ja.c<T> cVar, int i11, int i12) {
        ja.c<T> cVar2 = cVar;
        for (h<T> hVar : this.f29010b) {
            ja.c<T> a11 = hVar.a(context, cVar2, i11, i12);
            if (cVar2 != null && !cVar2.equals(cVar) && !cVar2.equals(a11)) {
                cVar2.recycle();
            }
            cVar2 = a11;
        }
        return cVar2;
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        for (h<T> hVar : this.f29010b) {
            hVar.b(messageDigest);
        }
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f29010b.equals(((c) obj).f29010b);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        return this.f29010b.hashCode();
    }
}