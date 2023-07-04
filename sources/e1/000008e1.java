package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.y;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c0 extends y {

    /* renamed from: c  reason: collision with root package name */
    int f6058c;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<y> f6056a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6057b = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f6059d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f6060e = 0;

    /* loaded from: classes.dex */
    class a extends z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f6061a;

        a(c0 c0Var, y yVar) {
            this.f6061a = yVar;
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            this.f6061a.runAnimators();
            yVar.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends z {

        /* renamed from: a  reason: collision with root package name */
        c0 f6062a;

        b(c0 c0Var) {
            this.f6062a = c0Var;
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            c0 c0Var = this.f6062a;
            int i11 = c0Var.f6058c - 1;
            c0Var.f6058c = i11;
            if (i11 == 0) {
                c0Var.f6059d = false;
                c0Var.end();
            }
            yVar.removeListener(this);
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionStart(y yVar) {
            c0 c0Var = this.f6062a;
            if (c0Var.f6059d) {
                return;
            }
            c0Var.start();
            this.f6062a.f6059d = true;
        }
    }

    private void g(y yVar) {
        this.f6056a.add(yVar);
        yVar.mParent = this;
    }

    private void s() {
        b bVar = new b(this);
        Iterator<y> it2 = this.f6056a.iterator();
        while (it2.hasNext()) {
            it2.next().addListener(bVar);
        }
        this.f6058c = this.f6056a.size();
    }

    @Override // androidx.transition.y
    /* renamed from: a */
    public c0 addListener(y.g gVar) {
        return (c0) super.addListener(gVar);
    }

    @Override // androidx.transition.y
    /* renamed from: b */
    public c0 addTarget(int i11) {
        for (int i12 = 0; i12 < this.f6056a.size(); i12++) {
            this.f6056a.get(i12).addTarget(i11);
        }
        return (c0) super.addTarget(i11);
    }

    @Override // androidx.transition.y
    /* renamed from: c */
    public c0 addTarget(View view) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).addTarget(view);
        }
        return (c0) super.addTarget(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.y
    public void cancel() {
        super.cancel();
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6056a.get(i11).cancel();
        }
    }

    @Override // androidx.transition.y
    public void captureEndValues(e0 e0Var) {
        if (isValidTarget(e0Var.f6130b)) {
            Iterator<y> it2 = this.f6056a.iterator();
            while (it2.hasNext()) {
                y next = it2.next();
                if (next.isValidTarget(e0Var.f6130b)) {
                    next.captureEndValues(e0Var);
                    e0Var.f6131c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.y
    public void capturePropagationValues(e0 e0Var) {
        super.capturePropagationValues(e0Var);
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6056a.get(i11).capturePropagationValues(e0Var);
        }
    }

    @Override // androidx.transition.y
    public void captureStartValues(e0 e0Var) {
        if (isValidTarget(e0Var.f6130b)) {
            Iterator<y> it2 = this.f6056a.iterator();
            while (it2.hasNext()) {
                y next = it2.next();
                if (next.isValidTarget(e0Var.f6130b)) {
                    next.captureStartValues(e0Var);
                    e0Var.f6131c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.y
    public void createAnimators(ViewGroup viewGroup, f0 f0Var, f0 f0Var2, ArrayList<e0> arrayList, ArrayList<e0> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            y yVar = this.f6056a.get(i11);
            if (startDelay > 0 && (this.f6057b || i11 == 0)) {
                long startDelay2 = yVar.getStartDelay();
                if (startDelay2 > 0) {
                    yVar.setStartDelay(startDelay2 + startDelay);
                } else {
                    yVar.setStartDelay(startDelay);
                }
            }
            yVar.createAnimators(viewGroup, f0Var, f0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.y
    /* renamed from: d */
    public c0 addTarget(Class<?> cls) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).addTarget(cls);
        }
        return (c0) super.addTarget(cls);
    }

    @Override // androidx.transition.y
    /* renamed from: e */
    public c0 addTarget(String str) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).addTarget(str);
        }
        return (c0) super.addTarget(str);
    }

    @Override // androidx.transition.y
    public y excludeTarget(View view, boolean z11) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).excludeTarget(view, z11);
        }
        return super.excludeTarget(view, z11);
    }

    public c0 f(y yVar) {
        g(yVar);
        long j11 = this.mDuration;
        if (j11 >= 0) {
            yVar.setDuration(j11);
        }
        if ((this.f6060e & 1) != 0) {
            yVar.setInterpolator(getInterpolator());
        }
        if ((this.f6060e & 2) != 0) {
            yVar.setPropagation(getPropagation());
        }
        if ((this.f6060e & 4) != 0) {
            yVar.setPathMotion(getPathMotion());
        }
        if ((this.f6060e & 8) != 0) {
            yVar.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.y
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6056a.get(i11).forceToEnd(viewGroup);
        }
    }

    public y h(int i11) {
        if (i11 < 0 || i11 >= this.f6056a.size()) {
            return null;
        }
        return this.f6056a.get(i11);
    }

    public int i() {
        return this.f6056a.size();
    }

    @Override // androidx.transition.y
    /* renamed from: j */
    public c0 removeListener(y.g gVar) {
        return (c0) super.removeListener(gVar);
    }

    @Override // androidx.transition.y
    /* renamed from: k */
    public c0 removeTarget(int i11) {
        for (int i12 = 0; i12 < this.f6056a.size(); i12++) {
            this.f6056a.get(i12).removeTarget(i11);
        }
        return (c0) super.removeTarget(i11);
    }

    @Override // androidx.transition.y
    /* renamed from: l */
    public c0 removeTarget(View view) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).removeTarget(view);
        }
        return (c0) super.removeTarget(view);
    }

    @Override // androidx.transition.y
    /* renamed from: m */
    public c0 removeTarget(Class<?> cls) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).removeTarget(cls);
        }
        return (c0) super.removeTarget(cls);
    }

    @Override // androidx.transition.y
    /* renamed from: n */
    public c0 removeTarget(String str) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).removeTarget(str);
        }
        return (c0) super.removeTarget(str);
    }

    @Override // androidx.transition.y
    /* renamed from: o */
    public c0 setDuration(long j11) {
        ArrayList<y> arrayList;
        super.setDuration(j11);
        if (this.mDuration >= 0 && (arrayList = this.f6056a) != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f6056a.get(i11).setDuration(j11);
            }
        }
        return this;
    }

    @Override // androidx.transition.y
    /* renamed from: p */
    public c0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f6060e |= 1;
        ArrayList<y> arrayList = this.f6056a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f6056a.get(i11).setInterpolator(timeInterpolator);
            }
        }
        return (c0) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.y
    public void pause(View view) {
        super.pause(view);
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6056a.get(i11).pause(view);
        }
    }

    public c0 q(int i11) {
        if (i11 == 0) {
            this.f6057b = true;
        } else if (i11 == 1) {
            this.f6057b = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i11);
        }
        return this;
    }

    @Override // androidx.transition.y
    /* renamed from: r */
    public c0 setStartDelay(long j11) {
        return (c0) super.setStartDelay(j11);
    }

    @Override // androidx.transition.y
    public void resume(View view) {
        super.resume(view);
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6056a.get(i11).resume(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.y
    public void runAnimators() {
        if (this.f6056a.isEmpty()) {
            start();
            end();
            return;
        }
        s();
        if (!this.f6057b) {
            for (int i11 = 1; i11 < this.f6056a.size(); i11++) {
                this.f6056a.get(i11 - 1).addListener(new a(this, this.f6056a.get(i11)));
            }
            y yVar = this.f6056a.get(0);
            if (yVar != null) {
                yVar.runAnimators();
                return;
            }
            return;
        }
        Iterator<y> it2 = this.f6056a.iterator();
        while (it2.hasNext()) {
            it2.next().runAnimators();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.y
    public void setCanRemoveViews(boolean z11) {
        super.setCanRemoveViews(z11);
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6056a.get(i11).setCanRemoveViews(z11);
        }
    }

    @Override // androidx.transition.y
    public void setEpicenterCallback(y.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f6060e |= 8;
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6056a.get(i11).setEpicenterCallback(fVar);
        }
    }

    @Override // androidx.transition.y
    public void setPathMotion(p pVar) {
        super.setPathMotion(pVar);
        this.f6060e |= 4;
        if (this.f6056a != null) {
            for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
                this.f6056a.get(i11).setPathMotion(pVar);
            }
        }
    }

    @Override // androidx.transition.y
    public void setPropagation(b0 b0Var) {
        super.setPropagation(b0Var);
        this.f6060e |= 2;
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6056a.get(i11).setPropagation(b0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.y
    public String toString(String str) {
        String yVar = super.toString(str);
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(yVar);
            sb2.append("\n");
            sb2.append(this.f6056a.get(i11).toString(str + "  "));
            yVar = sb2.toString();
        }
        return yVar;
    }

    @Override // androidx.transition.y
    /* renamed from: clone */
    public y mo5clone() {
        c0 c0Var = (c0) super.mo5clone();
        c0Var.f6056a = new ArrayList<>();
        int size = this.f6056a.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0Var.g(this.f6056a.get(i11).mo5clone());
        }
        return c0Var;
    }

    @Override // androidx.transition.y
    public y excludeTarget(String str, boolean z11) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).excludeTarget(str, z11);
        }
        return super.excludeTarget(str, z11);
    }

    @Override // androidx.transition.y
    public y excludeTarget(int i11, boolean z11) {
        for (int i12 = 0; i12 < this.f6056a.size(); i12++) {
            this.f6056a.get(i12).excludeTarget(i11, z11);
        }
        return super.excludeTarget(i11, z11);
    }

    @Override // androidx.transition.y
    public y excludeTarget(Class<?> cls, boolean z11) {
        for (int i11 = 0; i11 < this.f6056a.size(); i11++) {
            this.f6056a.get(i11).excludeTarget(cls, z11);
        }
        return super.excludeTarget(cls, z11);
    }
}