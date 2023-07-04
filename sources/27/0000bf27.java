package x7;

import android.graphics.Path;
import android.os.Build;
import c8.i;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    private final Path f57278a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f57279b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f57280c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final List<m> f57281d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final c8.i f57282e;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57283a;

        static {
            int[] iArr = new int[i.a.values().length];
            f57283a = iArr;
            try {
                iArr[i.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57283a[i.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57283a[i.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57283a[i.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57283a[i.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(c8.i iVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            iVar.c();
            this.f57282e = iVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a() {
        for (int i11 = 0; i11 < this.f57281d.size(); i11++) {
            this.f57280c.addPath(this.f57281d.get(i11).getPath());
        }
    }

    private void c(Path.Op op2) {
        this.f57279b.reset();
        this.f57278a.reset();
        for (int size = this.f57281d.size() - 1; size >= 1; size--) {
            m mVar = this.f57281d.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                List<m> i11 = dVar.i();
                for (int size2 = i11.size() - 1; size2 >= 0; size2--) {
                    Path path = i11.get(size2).getPath();
                    path.transform(dVar.j());
                    this.f57279b.addPath(path);
                }
            } else {
                this.f57279b.addPath(mVar.getPath());
            }
        }
        m mVar2 = this.f57281d.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> i12 = dVar2.i();
            for (int i13 = 0; i13 < i12.size(); i13++) {
                Path path2 = i12.get(i13).getPath();
                path2.transform(dVar2.j());
                this.f57278a.addPath(path2);
            }
        } else {
            this.f57278a.set(mVar2.getPath());
        }
        this.f57280c.op(this.f57278a, this.f57279b, op2);
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < this.f57281d.size(); i11++) {
            this.f57281d.get(i11).b(list, list2);
        }
    }

    @Override // x7.j
    public void f(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.f57281d.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // x7.m
    public Path getPath() {
        this.f57280c.reset();
        if (this.f57282e.d()) {
            return this.f57280c;
        }
        int i11 = a.f57283a[this.f57282e.b().ordinal()];
        if (i11 == 1) {
            a();
        } else if (i11 == 2) {
            c(Path.Op.UNION);
        } else if (i11 == 3) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i11 == 4) {
            c(Path.Op.INTERSECT);
        } else if (i11 == 5) {
            c(Path.Op.XOR);
        }
        return this.f57280c;
    }
}