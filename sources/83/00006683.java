package e00;

import h00.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes5.dex */
public final class e implements u20.h<File> {

    /* renamed from: a  reason: collision with root package name */
    private final File f24376a;

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.io.a f24377b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<File, Boolean> f24378c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.l<File, b0> f24379d;

    /* renamed from: e  reason: collision with root package name */
    private final p<File, IOException, b0> f24380e;

    /* renamed from: f  reason: collision with root package name */
    private final int f24381f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            s.g(rootDir, "rootDir");
        }
    }

    /* loaded from: classes5.dex */
    private final class b extends wz.b<File> {

        /* renamed from: c  reason: collision with root package name */
        private final ArrayDeque<c> f24382c;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes5.dex */
        public final class a extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f24384b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f24385c;

            /* renamed from: d  reason: collision with root package name */
            private int f24386d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f24387e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f24388f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                s.g(rootDir, "rootDir");
                this.f24388f = bVar;
            }

            @Override // e00.e.c
            public File b() {
                if (!this.f24387e && this.f24385c == null) {
                    h00.l lVar = e.this.f24378c;
                    boolean z11 = false;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        z11 = true;
                    }
                    if (z11) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f24385c = listFiles;
                    if (listFiles == null) {
                        p pVar = e.this.f24380e;
                        if (pVar != null) {
                            pVar.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f24387e = true;
                    }
                }
                File[] fileArr = this.f24385c;
                if (fileArr != null) {
                    int i11 = this.f24386d;
                    s.e(fileArr);
                    if (i11 < fileArr.length) {
                        File[] fileArr2 = this.f24385c;
                        s.e(fileArr2);
                        int i12 = this.f24386d;
                        this.f24386d = i12 + 1;
                        return fileArr2[i12];
                    }
                }
                if (this.f24384b) {
                    h00.l lVar2 = e.this.f24379d;
                    if (lVar2 != null) {
                        lVar2.invoke(a());
                    }
                    return null;
                }
                this.f24384b = true;
                return a();
            }
        }

        /* renamed from: e00.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        private final class C0472b extends c {

            /* renamed from: b  reason: collision with root package name */
            private boolean f24389b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0472b(b bVar, File rootFile) {
                super(rootFile);
                s.g(rootFile, "rootFile");
            }

            @Override // e00.e.c
            public File b() {
                if (this.f24389b) {
                    return null;
                }
                this.f24389b = true;
                return a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes5.dex */
        public final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            private boolean f24390b;

            /* renamed from: c  reason: collision with root package name */
            private File[] f24391c;

            /* renamed from: d  reason: collision with root package name */
            private int f24392d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f24393e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                s.g(rootDir, "rootDir");
                this.f24393e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
                if (r0.length == 0) goto L32;
             */
            @Override // e00.e.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f24390b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    e00.e$b r0 = r10.f24393e
                    e00.e r0 = e00.e.this
                    h00.l r0 = e00.e.d(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f24390b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f24391c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f24392d
                    kotlin.jvm.internal.s.e(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    e00.e$b r0 = r10.f24393e
                    e00.e r0 = e00.e.this
                    h00.l r0 = e00.e.f(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f24391c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f24391c = r0
                    if (r0 != 0) goto L7b
                    e00.e$b r0 = r10.f24393e
                    e00.e r0 = e00.e.this
                    h00.p r0 = e00.e.e(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f24391c
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.s.e(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    e00.e$b r0 = r10.f24393e
                    e00.e r0 = e00.e.this
                    h00.l r0 = e00.e.f(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f24391c
                    kotlin.jvm.internal.s.e(r0)
                    int r1 = r10.f24392d
                    int r2 = r1 + 1
                    r10.f24392d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: e00.e.b.c.b():java.io.File");
            }
        }

        /* loaded from: classes5.dex */
        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f24394a;

            static {
                int[] iArr = new int[kotlin.io.a.values().length];
                iArr[kotlin.io.a.TOP_DOWN.ordinal()] = 1;
                iArr[kotlin.io.a.BOTTOM_UP.ordinal()] = 2;
                f24394a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f24382c = arrayDeque;
            if (e.this.f24376a.isDirectory()) {
                arrayDeque.push(f(e.this.f24376a));
            } else if (e.this.f24376a.isFile()) {
                arrayDeque.push(new C0472b(this, e.this.f24376a));
            } else {
                b();
            }
        }

        private final a f(File file) {
            int i11 = d.f24394a[e.this.f24377b.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return new a(this, file);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new c(this, file);
        }

        private final File h() {
            File b11;
            while (true) {
                c peek = this.f24382c.peek();
                if (peek == null) {
                    return null;
                }
                b11 = peek.b();
                if (b11 == null) {
                    this.f24382c.pop();
                } else if (s.c(b11, peek.a()) || !b11.isDirectory() || this.f24382c.size() >= e.this.f24381f) {
                    break;
                } else {
                    this.f24382c.push(f(b11));
                }
            }
            return b11;
        }

        @Override // wz.b
        protected void a() {
            File h11 = h();
            if (h11 != null) {
                c(h11);
            } else {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final File f24395a;

        public c(File root) {
            s.g(root, "root");
            this.f24395a = root;
        }

        public final File a() {
            return this.f24395a;
        }

        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(File file, kotlin.io.a aVar, h00.l<? super File, Boolean> lVar, h00.l<? super File, b0> lVar2, p<? super File, ? super IOException, b0> pVar, int i11) {
        this.f24376a = file;
        this.f24377b = aVar;
        this.f24378c = lVar;
        this.f24379d = lVar2;
        this.f24380e = pVar;
        this.f24381f = i11;
    }

    @Override // u20.h
    public Iterator<File> iterator() {
        return new b();
    }

    /* synthetic */ e(File file, kotlin.io.a aVar, h00.l lVar, h00.l lVar2, p pVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i12 & 2) != 0 ? kotlin.io.a.TOP_DOWN : aVar, lVar, lVar2, pVar, (i12 & 32) != 0 ? Integer.MAX_VALUE : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(File start, kotlin.io.a direction) {
        this(start, direction, null, null, null, 0, 32, null);
        s.g(start, "start");
        s.g(direction, "direction");
    }
}