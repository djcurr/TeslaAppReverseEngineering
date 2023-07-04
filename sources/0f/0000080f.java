package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g extends x {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.e0> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.e0> mPendingAdditions = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.e0>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.e0> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.e0> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.e0> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.e0> mChangeAnimations = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f5512a;

        a(ArrayList arrayList) {
            this.f5512a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it2 = this.f5512a.iterator();
            while (it2.hasNext()) {
                j jVar = (j) it2.next();
                g.this.animateMoveImpl(jVar.f5546a, jVar.f5547b, jVar.f5548c, jVar.f5549d, jVar.f5550e);
            }
            this.f5512a.clear();
            g.this.mMovesList.remove(this.f5512a);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f5514a;

        b(ArrayList arrayList) {
            this.f5514a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it2 = this.f5514a.iterator();
            while (it2.hasNext()) {
                g.this.animateChangeImpl((i) it2.next());
            }
            this.f5514a.clear();
            g.this.mChangesList.remove(this.f5514a);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f5516a;

        c(ArrayList arrayList) {
            this.f5516a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it2 = this.f5516a.iterator();
            while (it2.hasNext()) {
                g.this.animateAddImpl((RecyclerView.e0) it2.next());
            }
            this.f5516a.clear();
            g.this.mAdditionsList.remove(this.f5516a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f5518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5519b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f5520c;

        d(RecyclerView.e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5518a = e0Var;
            this.f5519b = viewPropertyAnimator;
            this.f5520c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5519b.setListener(null);
            this.f5520c.setAlpha(1.0f);
            g.this.dispatchRemoveFinished(this.f5518a);
            g.this.mRemoveAnimations.remove(this.f5518a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchRemoveStarting(this.f5518a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f5522a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f5523b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5524c;

        e(RecyclerView.e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5522a = e0Var;
            this.f5523b = view;
            this.f5524c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5523b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5524c.setListener(null);
            g.this.dispatchAddFinished(this.f5522a);
            g.this.mAddAnimations.remove(this.f5522a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchAddStarting(this.f5522a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f5526a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5527b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f5528c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5529d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5530e;

        f(RecyclerView.e0 e0Var, int i11, View view, int i12, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5526a = e0Var;
            this.f5527b = i11;
            this.f5528c = view;
            this.f5529d = i12;
            this.f5530e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f5527b != 0) {
                this.f5528c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            }
            if (this.f5529d != 0) {
                this.f5528c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5530e.setListener(null);
            g.this.dispatchMoveFinished(this.f5526a);
            g.this.mMoveAnimations.remove(this.f5526a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchMoveStarting(this.f5526a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0093g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f5532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5533b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f5534c;

        C0093g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5532a = iVar;
            this.f5533b = viewPropertyAnimator;
            this.f5534c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5533b.setListener(null);
            this.f5534c.setAlpha(1.0f);
            this.f5534c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            this.f5534c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            g.this.dispatchChangeFinished(this.f5532a.f5540a, true);
            g.this.mChangeAnimations.remove(this.f5532a.f5540a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f5532a.f5540a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f5536a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f5538c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5536a = iVar;
            this.f5537b = viewPropertyAnimator;
            this.f5538c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5537b.setListener(null);
            this.f5538c.setAlpha(1.0f);
            this.f5538c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            this.f5538c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            g.this.dispatchChangeFinished(this.f5536a.f5541b, false);
            g.this.mChangeAnimations.remove(this.f5536a.f5541b);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f5536a.f5541b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f5546a;

        /* renamed from: b  reason: collision with root package name */
        public int f5547b;

        /* renamed from: c  reason: collision with root package name */
        public int f5548c;

        /* renamed from: d  reason: collision with root package name */
        public int f5549d;

        /* renamed from: e  reason: collision with root package name */
        public int f5550e;

        j(RecyclerView.e0 e0Var, int i11, int i12, int i13, int i14) {
            this.f5546a = e0Var;
            this.f5547b = i11;
            this.f5548c = i12;
            this.f5549d = i13;
            this.f5550e = i14;
        }
    }

    private void animateRemoveImpl(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(e0Var);
        animate.setDuration(getRemoveDuration()).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new d(e0Var, animate, view)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, e0Var) && iVar.f5540a == null && iVar.f5541b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.e0 e0Var = iVar.f5540a;
        if (e0Var != null) {
            endChangeAnimationIfNecessary(iVar, e0Var);
        }
        RecyclerView.e0 e0Var2 = iVar.f5541b;
        if (e0Var2 != null) {
            endChangeAnimationIfNecessary(iVar, e0Var2);
        }
    }

    private void resetAnimation(RecyclerView.e0 e0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        e0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(e0Var);
    }

    @Override // androidx.recyclerview.widget.x
    public boolean animateAdd(RecyclerView.e0 e0Var) {
        resetAnimation(e0Var);
        e0Var.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mPendingAdditions.add(e0Var);
        return true;
    }

    void animateAddImpl(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(e0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(e0Var, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.x
    public boolean animateChange(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i11, int i12, int i13, int i14) {
        if (e0Var == e0Var2) {
            return animateMove(e0Var, i11, i12, i13, i14);
        }
        float translationX = e0Var.itemView.getTranslationX();
        float translationY = e0Var.itemView.getTranslationY();
        float alpha = e0Var.itemView.getAlpha();
        resetAnimation(e0Var);
        int i15 = (int) ((i13 - i11) - translationX);
        int i16 = (int) ((i14 - i12) - translationY);
        e0Var.itemView.setTranslationX(translationX);
        e0Var.itemView.setTranslationY(translationY);
        e0Var.itemView.setAlpha(alpha);
        if (e0Var2 != null) {
            resetAnimation(e0Var2);
            e0Var2.itemView.setTranslationX(-i15);
            e0Var2.itemView.setTranslationY(-i16);
            e0Var2.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        this.mPendingChanges.add(new i(e0Var, e0Var2, i11, i12, i13, i14));
        return true;
    }

    void animateChangeImpl(i iVar) {
        RecyclerView.e0 e0Var = iVar.f5540a;
        View view = e0Var == null ? null : e0Var.itemView;
        RecyclerView.e0 e0Var2 = iVar.f5541b;
        View view2 = e0Var2 != null ? e0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f5540a);
            duration.translationX(iVar.f5544e - iVar.f5542c);
            duration.translationY(iVar.f5545f - iVar.f5543d);
            duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C0093g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.f5541b);
            animate.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.x
    public boolean animateMove(RecyclerView.e0 e0Var, int i11, int i12, int i13, int i14) {
        View view = e0Var.itemView;
        int translationX = i11 + ((int) view.getTranslationX());
        int translationY = i12 + ((int) e0Var.itemView.getTranslationY());
        resetAnimation(e0Var);
        int i15 = i13 - translationX;
        int i16 = i14 - translationY;
        if (i15 == 0 && i16 == 0) {
            dispatchMoveFinished(e0Var);
            return false;
        }
        if (i15 != 0) {
            view.setTranslationX(-i15);
        }
        if (i16 != 0) {
            view.setTranslationY(-i16);
        }
        this.mPendingMoves.add(new j(e0Var, translationX, translationY, i13, i14));
        return true;
    }

    void animateMoveImpl(RecyclerView.e0 e0Var, int i11, int i12, int i13, int i14) {
        View view = e0Var.itemView;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        if (i15 != 0) {
            view.animate().translationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (i16 != 0) {
            view.animate().translationY(BitmapDescriptorFactory.HUE_RED);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(e0Var);
        animate.setDuration(getMoveDuration()).setListener(new f(e0Var, i15, view, i16, animate)).start();
    }

    @Override // androidx.recyclerview.widget.x
    public boolean animateRemove(RecyclerView.e0 e0Var) {
        resetAnimation(e0Var);
        this.mPendingRemovals.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.e0 e0Var, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(e0Var, list);
    }

    void cancelAll(List<RecyclerView.e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimation(RecyclerView.e0 e0Var) {
        View view = e0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f5546a == e0Var) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                dispatchMoveFinished(e0Var);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, e0Var);
        if (this.mPendingRemovals.remove(e0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(e0Var);
        }
        if (this.mPendingAdditions.remove(e0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(e0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f5546a == e0Var) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.e0> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(e0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(e0Var);
        this.mAddAnimations.remove(e0Var);
        this.mChangeAnimations.remove(e0Var);
        this.mMoveAnimations.remove(e0Var);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.f5546a.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            dispatchMoveFinished(jVar.f5546a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = this.mPendingAdditions.get(size3);
            e0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(e0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f5546a.itemView;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(jVar2.f5546a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var2 = arrayList2.get(size8);
                    e0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void runPendingAnimations() {
        boolean z11 = !this.mPendingRemovals.isEmpty();
        boolean z12 = !this.mPendingMoves.isEmpty();
        boolean z13 = !this.mPendingChanges.isEmpty();
        boolean z14 = !this.mPendingAdditions.isEmpty();
        if (z11 || z12 || z14 || z13) {
            Iterator<RecyclerView.e0> it2 = this.mPendingRemovals.iterator();
            while (it2.hasNext()) {
                animateRemoveImpl(it2.next());
            }
            this.mPendingRemovals.clear();
            if (z12) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                a aVar = new a(arrayList);
                if (z11) {
                    androidx.core.view.a0.p0(arrayList.get(0).f5546a.itemView, aVar, getRemoveDuration());
                } else {
                    aVar.run();
                }
            }
            if (z13) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                b bVar = new b(arrayList2);
                if (z11) {
                    androidx.core.view.a0.p0(arrayList2.get(0).f5540a.itemView, bVar, getRemoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (z14) {
                ArrayList<RecyclerView.e0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                c cVar = new c(arrayList3);
                if (!z11 && !z12 && !z13) {
                    cVar.run();
                } else {
                    androidx.core.view.a0.p0(arrayList3.get(0).itemView, cVar, (z11 ? getRemoveDuration() : 0L) + Math.max(z12 ? getMoveDuration() : 0L, z13 ? getChangeDuration() : 0L));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f5540a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.e0 f5541b;

        /* renamed from: c  reason: collision with root package name */
        public int f5542c;

        /* renamed from: d  reason: collision with root package name */
        public int f5543d;

        /* renamed from: e  reason: collision with root package name */
        public int f5544e;

        /* renamed from: f  reason: collision with root package name */
        public int f5545f;

        private i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            this.f5540a = e0Var;
            this.f5541b = e0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5540a + ", newHolder=" + this.f5541b + ", fromX=" + this.f5542c + ", fromY=" + this.f5543d + ", toX=" + this.f5544e + ", toY=" + this.f5545f + CoreConstants.CURLY_RIGHT;
        }

        i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i11, int i12, int i13, int i14) {
            this(e0Var, e0Var2);
            this.f5542c = i11;
            this.f5543d = i12;
            this.f5544e = i13;
            this.f5545f = i14;
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.e0 e0Var) {
        boolean z11 = false;
        if (iVar.f5541b == e0Var) {
            iVar.f5541b = null;
        } else if (iVar.f5540a != e0Var) {
            return false;
        } else {
            iVar.f5540a = null;
            z11 = true;
        }
        e0Var.itemView.setAlpha(1.0f);
        e0Var.itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        e0Var.itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        dispatchChangeFinished(e0Var, z11);
        return true;
    }
}