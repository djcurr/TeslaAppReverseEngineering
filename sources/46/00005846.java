package com.stripe.android.stripe3ds2.security;

import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import fq.g;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.v;
import wz.w;
import wz.x0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum TestRsa uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class DirectoryServer {
    private static final /* synthetic */ DirectoryServer[] $VALUES;
    public static final DirectoryServer Amex;
    private static final Set<String> CERTIFICATE_EXTENSIONS;
    public static final DirectoryServer CartesBancaires;
    public static final Companion Companion;
    public static final DirectoryServer Discover;
    public static final DirectoryServer Mastercard;
    public static final DirectoryServer TestEc;
    public static final DirectoryServer TestRsa;
    public static final DirectoryServer Visa;
    private final Algorithm algorithm;
    private final String fileName;
    private final List<String> ids;
    private final g keyUse;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DirectoryServer lookup(String directoryServerId) {
            DirectoryServer directoryServer;
            s.g(directoryServerId, "directoryServerId");
            DirectoryServer[] values = DirectoryServer.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    directoryServer = null;
                    break;
                }
                directoryServer = values[i11];
                i11++;
                if (directoryServer.getIds().contains(directoryServerId)) {
                    break;
                }
            }
            if (directoryServer != null) {
                return directoryServer;
            }
            throw new SDKRuntimeException(new IllegalArgumentException(s.p("Unknown directory server id: ", directoryServerId)));
        }
    }

    private static final /* synthetic */ DirectoryServer[] $values() {
        return new DirectoryServer[]{TestRsa, TestEc, Visa, Mastercard, Amex, Discover, CartesBancaires};
    }

    static {
        List d11;
        List d12;
        List d13;
        List d14;
        List d15;
        List l11;
        List d16;
        Set<String> i11;
        d11 = v.d("F055545342");
        Algorithm algorithm = Algorithm.RSA;
        TestRsa = new DirectoryServer("TestRsa", 0, d11, algorithm, "ds-test-rsa.txt", null, 8, null);
        d12 = v.d("F155545342");
        TestEc = new DirectoryServer("TestEc", 1, d12, Algorithm.EC, "ds-test-ec.txt", null, 8, null);
        d13 = v.d("A000000003");
        Visa = new DirectoryServer("Visa", 2, d13, algorithm, "ds-visa.crt", null, 8, null);
        d14 = v.d("A000000004");
        Mastercard = new DirectoryServer("Mastercard", 3, d14, algorithm, "ds-mastercard.crt", null, 8, null);
        d15 = v.d("A000000025");
        Amex = new DirectoryServer("Amex", 4, d15, algorithm, "ds-amex.pem", null, 8, null);
        l11 = w.l("A000000152", "A000000324");
        Discover = new DirectoryServer("Discover", 5, l11, algorithm, "ds-discover.cer", null);
        d16 = v.d("A000000042");
        CartesBancaires = new DirectoryServer("CartesBancaires", 6, d16, algorithm, "ds-cartesbancaires.pem", null, 8, null);
        $VALUES = $values();
        Companion = new Companion(null);
        i11 = x0.i(".crt", ".cer", ".pem");
        CERTIFICATE_EXTENSIONS = i11;
    }

    private DirectoryServer(String str, int i11, List list, Algorithm algorithm, String str2, g gVar) {
        this.ids = list;
        this.algorithm = algorithm;
        this.fileName = str2;
        this.keyUse = gVar;
    }

    public static DirectoryServer valueOf(String str) {
        return (DirectoryServer) Enum.valueOf(DirectoryServer.class, str);
    }

    public static DirectoryServer[] values() {
        return (DirectoryServer[]) $VALUES.clone();
    }

    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final g getKeyUse() {
        return this.keyUse;
    }

    public final boolean isCertificate() {
        boolean t11;
        Set<String> set = CERTIFICATE_EXTENSIONS;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str : set) {
            t11 = kotlin.text.v.t(getFileName(), str, false, 2, null);
            if (t11) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ DirectoryServer(String str, int i11, List list, Algorithm algorithm, String str2, g gVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, list, algorithm, str2, (i12 & 8) != 0 ? g.f26767b : gVar);
    }
}