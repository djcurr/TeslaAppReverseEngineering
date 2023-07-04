package com.plaid.internal;

import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class e9 implements ra {

    /* renamed from: a  reason: collision with root package name */
    public final File f18528a;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.core.storage.PlaidDirectoryStorage$listFileNames$2", f = "PlaidDirectoryStorage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super List<? extends String>>, Object> {
        public a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super List<? extends String>> dVar) {
            return new a(dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
            r3 = wz.p.s0(r3);
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                a00.b.d()
                vz.r.b(r3)
                com.plaid.internal.e9 r3 = com.plaid.internal.e9.this
                java.io.File r3 = r3.f18528a
                java.io.File[] r3 = r3.listFiles()
                if (r3 != 0) goto L11
                goto L17
            L11:
                java.util.List r3 = wz.l.s0(r3)
                if (r3 != 0) goto L19
            L17:
                r3 = 0
                goto L3d
            L19:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = wz.u.t(r3, r1)
                r0.<init>(r1)
                java.util.Iterator r3 = r3.iterator()
            L28:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L3c
                java.lang.Object r1 = r3.next()
                java.io.File r1 = (java.io.File) r1
                java.lang.String r1 = r1.getName()
                r0.add(r1)
                goto L28
            L3c:
                r3 = r0
            L3d:
                if (r3 != 0) goto L43
                java.util.List r3 = wz.u.i()
            L43:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.e9.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.core.storage.PlaidDirectoryStorage$loadData$2", f = "PlaidDirectoryStorage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super String>, Object> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f18531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f18531b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f18531b, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super String> dVar) {
            return new b(this.f18531b, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String f11;
            a00.d.d();
            vz.r.b(obj);
            File parentDirectory = e9.this.f18528a;
            String fileName = this.f18531b;
            kotlin.jvm.internal.s.g(parentDirectory, "parentDirectory");
            kotlin.jvm.internal.s.g(fileName, "fileName");
            if (!parentDirectory.exists()) {
                parentDirectory.mkdirs();
            }
            File file = new File(parentDirectory, fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            f11 = e00.h.f(file, null, 1, null);
            return f11;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.core.storage.PlaidDirectoryStorage$removeData$2", f = "PlaidDirectoryStorage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f18533b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, zz.d<? super c> dVar) {
            super(2, dVar);
            this.f18533b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(this.f18533b, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new c(this.f18533b, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            File file = new File(e9.this.f18528a.toString(), this.f18533b);
            if (file.exists()) {
                file.delete();
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.core.storage.PlaidDirectoryStorage$saveData$2", f = "PlaidDirectoryStorage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f18535b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f18536c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f18535b = str;
            this.f18536c = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f18535b, this.f18536c, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new d(this.f18535b, this.f18536c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            File parentDirectory = e9.this.f18528a;
            String fileName = this.f18535b;
            kotlin.jvm.internal.s.g(parentDirectory, "parentDirectory");
            kotlin.jvm.internal.s.g(fileName, "fileName");
            if (!parentDirectory.exists()) {
                parentDirectory.mkdirs();
            }
            File file = new File(parentDirectory, fileName);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }
            e00.h.i(file, this.f18536c, null, 2, null);
            return vz.b0.f54756a;
        }
    }

    public e9(File rootDirectory, String directory) {
        kotlin.jvm.internal.s.g(rootDirectory, "rootDirectory");
        kotlin.jvm.internal.s.g(directory, "directory");
        this.f18528a = new File(rootDirectory, directory);
    }

    @Override // com.plaid.internal.ra
    public Object a(String str, String str2, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object g11 = v20.i.g(v20.e1.b(), new d(str, str2, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : vz.b0.f54756a;
    }

    @Override // com.plaid.internal.ra
    public Object b(String str, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object g11 = v20.i.g(v20.e1.b(), new c(str, null), dVar);
        d11 = a00.d.d();
        return g11 == d11 ? g11 : vz.b0.f54756a;
    }

    @Override // com.plaid.internal.ra
    public Object a(String str, zz.d<? super String> dVar) {
        return v20.i.g(v20.e1.b(), new b(str, null), dVar);
    }

    @Override // com.plaid.internal.ra
    public Object a(zz.d<? super List<String>> dVar) {
        return v20.i.g(v20.e1.b(), new a(null), dVar);
    }
}