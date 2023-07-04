package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    static final ThreadLocal<k> f5611e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    static Comparator<c> f5612f = new a();

    /* renamed from: b  reason: collision with root package name */
    long f5614b;

    /* renamed from: c  reason: collision with root package name */
    long f5615c;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<RecyclerView> f5613a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<c> f5616d = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f5624d;
            if ((recyclerView == null) != (cVar2.f5624d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z11 = cVar.f5621a;
            if (z11 != cVar2.f5621a) {
                return z11 ? -1 : 1;
            }
            int i11 = cVar2.f5622b - cVar.f5622b;
            if (i11 != 0) {
                return i11;
            }
            int i12 = cVar.f5623c - cVar2.f5623c;
            if (i12 != 0) {
                return i12;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.p.c {

        /* renamed from: a  reason: collision with root package name */
        int f5617a;

        /* renamed from: b  reason: collision with root package name */
        int f5618b;

        /* renamed from: c  reason: collision with root package name */
        int[] f5619c;

        /* renamed from: d  reason: collision with root package name */
        int f5620d;

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i11, int i12) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i12 >= 0) {
                int i13 = this.f5620d * 2;
                int[] iArr = this.f5619c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f5619c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i13 >= iArr.length) {
                    int[] iArr3 = new int[i13 * 2];
                    this.f5619c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f5619c;
                iArr4[i13] = i11;
                iArr4[i13 + 1] = i12;
                this.f5620d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f5619c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5620d = 0;
        }

        void c(RecyclerView recyclerView, boolean z11) {
            this.f5620d = 0;
            int[] iArr = this.f5619c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z11) {
                if (!recyclerView.mAdapterHelper.p()) {
                    pVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.collectAdjacentPrefetchPositions(this.f5617a, this.f5618b, recyclerView.mState, this);
            }
            int i11 = this.f5620d;
            if (i11 > pVar.mPrefetchMaxCountObserved) {
                pVar.mPrefetchMaxCountObserved = i11;
                pVar.mPrefetchMaxObservedInInitialPrefetch = z11;
                recyclerView.mRecycler.K();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(int i11) {
            if (this.f5619c != null) {
                int i12 = this.f5620d * 2;
                for (int i13 = 0; i13 < i12; i13 += 2) {
                    if (this.f5619c[i13] == i11) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i11, int i12) {
            this.f5617a = i11;
            this.f5618b = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5621a;

        /* renamed from: b  reason: collision with root package name */
        public int f5622b;

        /* renamed from: c  reason: collision with root package name */
        public int f5623c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f5624d;

        /* renamed from: e  reason: collision with root package name */
        public int f5625e;

        c() {
        }

        public void a() {
            this.f5621a = false;
            this.f5622b = 0;
            this.f5623c = 0;
            this.f5624d = null;
            this.f5625e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.f5613a.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView = this.f5613a.get(i12);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i11 += recyclerView.mPrefetchRegistry.f5620d;
            }
        }
        this.f5616d.ensureCapacity(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView2 = this.f5613a.get(i14);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f5617a) + Math.abs(bVar.f5618b);
                for (int i15 = 0; i15 < bVar.f5620d * 2; i15 += 2) {
                    if (i13 >= this.f5616d.size()) {
                        cVar = new c();
                        this.f5616d.add(cVar);
                    } else {
                        cVar = this.f5616d.get(i13);
                    }
                    int[] iArr = bVar.f5619c;
                    int i16 = iArr[i15 + 1];
                    cVar.f5621a = i16 <= abs;
                    cVar.f5622b = abs;
                    cVar.f5623c = i16;
                    cVar.f5624d = recyclerView2;
                    cVar.f5625e = iArr[i15];
                    i13++;
                }
            }
        }
        Collections.sort(this.f5616d, f5612f);
    }

    private void c(c cVar, long j11) {
        RecyclerView.e0 i11 = i(cVar.f5624d, cVar.f5625e, cVar.f5621a ? Long.MAX_VALUE : j11);
        if (i11 == null || i11.mNestedRecyclerView == null || !i11.isBound() || i11.isInvalid()) {
            return;
        }
        h(i11.mNestedRecyclerView.get(), j11);
    }

    private void d(long j11) {
        for (int i11 = 0; i11 < this.f5616d.size(); i11++) {
            c cVar = this.f5616d.get(i11);
            if (cVar.f5624d == null) {
                return;
            }
            c(cVar, j11);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i11) {
        int j11 = recyclerView.mChildHelper.j();
        for (int i12 = 0; i12 < j11; i12++) {
            RecyclerView.e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i12));
            if (childViewHolderInt.mPosition == i11 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j11) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f5620d != 0) {
            try {
                r3.m.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i11 = 0; i11 < bVar.f5620d * 2; i11 += 2) {
                    i(recyclerView, bVar.f5619c[i11], j11);
                }
            } finally {
                r3.m.b();
            }
        }
    }

    private RecyclerView.e0 i(RecyclerView recyclerView, int i11, long j11) {
        if (e(recyclerView, i11)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.e0 I = wVar.I(i11, false, j11);
            if (I != null) {
                if (I.isBound() && !I.isInvalid()) {
                    wVar.B(I.itemView);
                } else {
                    wVar.a(I, false);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f5613a.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i11, int i12) {
        if (recyclerView.isAttachedToWindow() && this.f5614b == 0) {
            this.f5614b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i11, i12);
    }

    void g(long j11) {
        b();
        d(j11);
    }

    public void j(RecyclerView recyclerView) {
        this.f5613a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            r3.m.a("RV Prefetch");
            if (!this.f5613a.isEmpty()) {
                int size = this.f5613a.size();
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = this.f5613a.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j11 = Math.max(recyclerView.getDrawingTime(), j11);
                    }
                }
                if (j11 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j11) + this.f5615c);
                }
            }
        } finally {
            this.f5614b = 0L;
            r3.m.b();
        }
    }
}