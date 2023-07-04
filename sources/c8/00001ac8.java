package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.s;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class j extends s {

    /* renamed from: h  reason: collision with root package name */
    protected final File f12911h;

    /* renamed from: i  reason: collision with root package name */
    protected final String f12912i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b extends s.b implements Comparable {

        /* renamed from: c  reason: collision with root package name */
        final ZipEntry f12913c;

        /* renamed from: d  reason: collision with root package name */
        final int f12914d;

        b(String str, ZipEntry zipEntry, int i11) {
            super(str, a(zipEntry));
            this.f12913c = zipEntry;
            this.f12914d = i11;
        }

        private static String a(ZipEntry zipEntry) {
            return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f12940a.compareTo(((b) obj).f12940a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public class c extends s.g {

        /* renamed from: a  reason: collision with root package name */
        private b[] f12915a;

        /* renamed from: b  reason: collision with root package name */
        private final ZipFile f12916b;

        /* renamed from: c  reason: collision with root package name */
        private final s f12917c;

        /* loaded from: classes3.dex */
        private final class a extends s.e {

            /* renamed from: a  reason: collision with root package name */
            private int f12919a;

            private a() {
            }

            @Override // com.facebook.soloader.s.e
            public boolean a() {
                c.this.m();
                return this.f12919a < c.this.f12915a.length;
            }

            @Override // com.facebook.soloader.s.e
            public s.d g() {
                c.this.m();
                b[] bVarArr = c.this.f12915a;
                int i11 = this.f12919a;
                this.f12919a = i11 + 1;
                b bVar = bVarArr[i11];
                InputStream inputStream = c.this.f12916b.getInputStream(bVar.f12913c);
                try {
                    return new s.f(bVar, inputStream);
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(s sVar) {
            this.f12916b = new ZipFile(j.this.f12911h);
            this.f12917c = sVar;
        }

        @Override // com.facebook.soloader.s.g
        public final s.c a() {
            return new s.c(m());
        }

        @Override // com.facebook.soloader.s.g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f12916b.close();
        }

        @Override // com.facebook.soloader.s.g
        public final s.e g() {
            return new a();
        }

        final b[] m() {
            if (this.f12915a == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(j.this.f12912i);
                String[] j11 = SysUtil.j();
                Enumeration<? extends ZipEntry> entries = this.f12916b.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = compile.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        int e11 = SysUtil.e(j11, group);
                        if (e11 >= 0) {
                            linkedHashSet.add(group);
                            b bVar = (b) hashMap.get(group2);
                            if (bVar == null || e11 < bVar.f12914d) {
                                hashMap.put(group2, new b(group2, nextElement, e11));
                            }
                        }
                    }
                }
                this.f12917c.w((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                b[] bVarArr = (b[]) hashMap.values().toArray(new b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i11 = 0;
                for (int i12 = 0; i12 < bVarArr.length; i12++) {
                    b bVar2 = bVarArr[i12];
                    if (p(bVar2.f12913c, bVar2.f12940a)) {
                        i11++;
                    } else {
                        bVarArr[i12] = null;
                    }
                }
                b[] bVarArr2 = new b[i11];
                int i13 = 0;
                for (b bVar3 : bVarArr) {
                    if (bVar3 != null) {
                        bVarArr2[i13] = bVar3;
                        i13++;
                    }
                }
                this.f12915a = bVarArr2;
            }
            return this.f12915a;
        }

        protected boolean p(ZipEntry zipEntry, String str) {
            throw null;
        }
    }

    public j(Context context, String str, File file, String str2) {
        super(context, str);
        this.f12911h = file;
        this.f12912i = str2;
    }
}