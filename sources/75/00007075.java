package gk;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.g<String, i> f28006a = new androidx.collection.g<>();

    /* renamed from: b  reason: collision with root package name */
    private final androidx.collection.g<String, PropertyValuesHolder[]> f28007b = new androidx.collection.g<>();

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.i(objectAnimator.getPropertyName(), i.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static h b(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static h c(Context context, int i11) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i11);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return d(arrayList);
            }
            return null;
        } catch (Exception e11) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i11), e11);
            return null;
        }
    }

    private static h d(List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            a(hVar, list.get(i11));
        }
        return hVar;
    }

    public i e(String str) {
        if (g(str)) {
            return this.f28006a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f28006a.equals(((h) obj).f28006a);
        }
        return false;
    }

    public long f() {
        int size = this.f28006a.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i o11 = this.f28006a.o(i11);
            j11 = Math.max(j11, o11.c() + o11.d());
        }
        return j11;
    }

    public boolean g(String str) {
        return this.f28006a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f28007b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f28006a.hashCode();
    }

    public void i(String str, i iVar) {
        this.f28006a.put(str, iVar);
    }

    public String toString() {
        return '\n' + h.class.getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f28006a + "}\n";
    }
}