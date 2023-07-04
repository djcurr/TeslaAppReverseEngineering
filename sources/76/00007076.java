package gk;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private long f28008a;

    /* renamed from: b  reason: collision with root package name */
    private long f28009b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f28010c;

    /* renamed from: d  reason: collision with root package name */
    private int f28011d;

    /* renamed from: e  reason: collision with root package name */
    private int f28012e;

    public i(long j11, long j12) {
        this.f28008a = 0L;
        this.f28009b = 300L;
        this.f28010c = null;
        this.f28011d = 0;
        this.f28012e = 1;
        this.f28008a = j11;
        this.f28009b = j12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f28011d = valueAnimator.getRepeatCount();
        iVar.f28012e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return a.f27995c;
            }
            return interpolator instanceof DecelerateInterpolator ? a.f27996d : interpolator;
        }
        return a.f27994b;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f28008a;
    }

    public long d() {
        return this.f28009b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f28010c;
        return timeInterpolator != null ? timeInterpolator : a.f27994b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
                return e().getClass().equals(iVar.e().getClass());
            }
            return false;
        }
        return false;
    }

    public int g() {
        return this.f28011d;
    }

    public int h() {
        return this.f28012e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + i.class.getName() + CoreConstants.CURLY_LEFT + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j11, long j12, TimeInterpolator timeInterpolator) {
        this.f28008a = 0L;
        this.f28009b = 300L;
        this.f28010c = null;
        this.f28011d = 0;
        this.f28012e = 1;
        this.f28008a = j11;
        this.f28009b = j12;
        this.f28010c = timeInterpolator;
    }
}