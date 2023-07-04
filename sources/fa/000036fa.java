package com.google.common.base;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Objects;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class d {
    private final com.google.common.base.e wordBoundary;
    private final String wordSeparator;
    public static final d LOWER_HYPHEN = new a("LOWER_HYPHEN", 0, com.google.common.base.e.e(CoreConstants.DASH_CHAR), "-");
    public static final d LOWER_UNDERSCORE = new d("LOWER_UNDERSCORE", 1, com.google.common.base.e.e('_'), "_") { // from class: com.google.common.base.d.b
        @Override // com.google.common.base.d
        String convert(d dVar, String str) {
            if (dVar == d.LOWER_HYPHEN) {
                return str.replace('_', CoreConstants.DASH_CHAR);
            }
            if (dVar == d.UPPER_UNDERSCORE) {
                return com.google.common.base.c.e(str);
            }
            return super.convert(dVar, str);
        }

        @Override // com.google.common.base.d
        String normalizeWord(String str) {
            return com.google.common.base.c.c(str);
        }
    };
    public static final d LOWER_CAMEL = new d("LOWER_CAMEL", 2, com.google.common.base.e.c('A', Matrix.MATRIX_TYPE_ZERO), "") { // from class: com.google.common.base.d.c
        @Override // com.google.common.base.d
        String normalizeFirstWord(String str) {
            return com.google.common.base.c.c(str);
        }

        @Override // com.google.common.base.d
        String normalizeWord(String str) {
            return d.firstCharOnlyToUpper(str);
        }
    };
    public static final d UPPER_CAMEL = new d("UPPER_CAMEL", 3, com.google.common.base.e.c('A', Matrix.MATRIX_TYPE_ZERO), "") { // from class: com.google.common.base.d.d
        @Override // com.google.common.base.d
        String normalizeWord(String str) {
            return d.firstCharOnlyToUpper(str);
        }
    };
    public static final d UPPER_UNDERSCORE = new d("UPPER_UNDERSCORE", 4, com.google.common.base.e.e('_'), "_") { // from class: com.google.common.base.d.e
        @Override // com.google.common.base.d
        String convert(d dVar, String str) {
            if (dVar == d.LOWER_HYPHEN) {
                return com.google.common.base.c.c(str.replace('_', CoreConstants.DASH_CHAR));
            }
            if (dVar == d.LOWER_UNDERSCORE) {
                return com.google.common.base.c.c(str);
            }
            return super.convert(dVar, str);
        }

        @Override // com.google.common.base.d
        String normalizeWord(String str) {
            return com.google.common.base.c.e(str);
        }
    };
    private static final /* synthetic */ d[] $VALUES = $values();

    /* loaded from: classes3.dex */
    enum a extends d {
        a(String str, int i11, com.google.common.base.e eVar, String str2) {
            super(str, i11, eVar, str2, null);
        }

        @Override // com.google.common.base.d
        String convert(d dVar, String str) {
            if (dVar == d.LOWER_UNDERSCORE) {
                return str.replace(CoreConstants.DASH_CHAR, '_');
            }
            if (dVar == d.UPPER_UNDERSCORE) {
                return com.google.common.base.c.e(str.replace(CoreConstants.DASH_CHAR, '_'));
            }
            return super.convert(dVar, str);
        }

        @Override // com.google.common.base.d
        String normalizeWord(String str) {
            return com.google.common.base.c.c(str);
        }
    }

    /* loaded from: classes3.dex */
    private static final class f extends i<String, String> implements Serializable {

        /* renamed from: b  reason: collision with root package name */
        private final d f15909b;

        /* renamed from: c  reason: collision with root package name */
        private final d f15910c;

        f(d dVar, d dVar2) {
            this.f15909b = (d) u.o(dVar);
            this.f15910c = (d) u.o(dVar2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.i
        /* renamed from: e */
        public String c(String str) {
            return this.f15909b.to(this.f15910c, str);
        }

        @Override // com.google.common.base.l
        public boolean equals(Object obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                return this.f15909b.equals(fVar.f15909b) && this.f15910c.equals(fVar.f15910c);
            }
            return false;
        }

        public int hashCode() {
            return this.f15909b.hashCode() ^ this.f15910c.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.f15909b);
            String valueOf2 = String.valueOf(this.f15910c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(".converterTo(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static /* synthetic */ d[] $values() {
        return new d[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    /* synthetic */ d(String str, int i11, com.google.common.base.e eVar, String str2, a aVar) {
        this(str, i11, eVar, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char d11 = com.google.common.base.c.d(str.charAt(0));
        String c11 = com.google.common.base.c.c(str.substring(1));
        StringBuilder sb2 = new StringBuilder(String.valueOf(c11).length() + 1);
        sb2.append(d11);
        sb2.append(c11);
        return sb2.toString();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    String convert(d dVar, String str) {
        StringBuilder sb2 = null;
        int i11 = 0;
        int i12 = -1;
        while (true) {
            i12 = this.wordBoundary.d(str, i12 + 1);
            if (i12 == -1) {
                break;
            }
            if (i11 == 0) {
                sb2 = new StringBuilder(str.length() + (dVar.wordSeparator.length() * 4));
                sb2.append(dVar.normalizeFirstWord(str.substring(i11, i12)));
            } else {
                Objects.requireNonNull(sb2);
                sb2.append(dVar.normalizeWord(str.substring(i11, i12)));
            }
            sb2.append(dVar.wordSeparator);
            i11 = this.wordSeparator.length() + i12;
        }
        if (i11 == 0) {
            return dVar.normalizeFirstWord(str);
        }
        Objects.requireNonNull(sb2);
        StringBuilder sb3 = sb2;
        sb3.append(dVar.normalizeWord(str.substring(i11)));
        return sb3.toString();
    }

    public i<String, String> converterTo(d dVar) {
        return new f(this, dVar);
    }

    String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    abstract String normalizeWord(String str);

    public final String to(d dVar, String str) {
        u.o(dVar);
        u.o(str);
        return dVar == this ? str : convert(dVar, str);
    }

    private d(String str, int i11, com.google.common.base.e eVar, String str2) {
        this.wordBoundary = eVar;
        this.wordSeparator = str2;
    }
}