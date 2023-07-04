package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a  reason: collision with root package name */
    private b f4256a;

    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private static HandlerThread f4257e;

        /* renamed from: f  reason: collision with root package name */
        private static Handler f4258f;

        /* renamed from: a  reason: collision with root package name */
        int f4259a;

        /* renamed from: b  reason: collision with root package name */
        SparseIntArray[] f4260b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<WeakReference<Activity>> f4261c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f4262d = new Window$OnFrameMetricsAvailableListenerC0068a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class Window$OnFrameMetricsAvailableListenerC0068a implements Window.OnFrameMetricsAvailableListener {
            Window$OnFrameMetricsAvailableListenerC0068a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
                a aVar = a.this;
                if ((aVar.f4259a & 1) != 0) {
                    aVar.f(aVar.f4260b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f4259a & 2) != 0) {
                    aVar2.f(aVar2.f4260b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f4259a & 4) != 0) {
                    aVar3.f(aVar3.f4260b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f4259a & 8) != 0) {
                    aVar4.f(aVar4.f4260b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f4259a & 16) != 0) {
                    aVar5.f(aVar5.f4260b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f4259a & 64) != 0) {
                    aVar6.f(aVar6.f4260b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f4259a & 32) != 0) {
                    aVar7.f(aVar7.f4260b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f4259a & 128) != 0) {
                    aVar8.f(aVar8.f4260b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f4259a & 256) != 0) {
                    aVar9.f(aVar9.f4260b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i11) {
            this.f4259a = i11;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f4257e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f4257e = handlerThread;
                handlerThread.start();
                f4258f = new Handler(f4257e.getLooper());
            }
            for (int i11 = 0; i11 <= 8; i11++) {
                SparseIntArray[] sparseIntArrayArr = this.f4260b;
                if (sparseIntArrayArr[i11] == null && (this.f4259a & (1 << i11)) != 0) {
                    sparseIntArrayArr[i11] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f4262d, f4258f);
            this.f4261c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f4260b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it2 = this.f4261c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it2.next();
                if (next.get() == activity) {
                    this.f4261c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f4262d);
            return this.f4260b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f4260b;
            this.f4260b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f4261c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f4261c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f4262d);
                    this.f4261c.remove(size);
                }
            }
            return this.f4260b;
        }

        void f(SparseIntArray sparseIntArray, long j11) {
            if (sparseIntArray != null) {
                int i11 = (int) ((500000 + j11) / 1000000);
                if (j11 >= 0) {
                    sparseIntArray.put(i11, sparseIntArray.get(i11) + 1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f4256a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f4256a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f4256a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f4256a.d();
    }

    public SparseIntArray[] e() {
        return this.f4256a.e();
    }

    public FrameMetricsAggregator(int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4256a = new a(i11);
        } else {
            this.f4256a = new b();
        }
    }
}