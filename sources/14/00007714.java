package io.grpc.internal;

import io.grpc.internal.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y0 implements c0.g {

    /* renamed from: a  reason: collision with root package name */
    private static final Throwable f31330a = d();

    /* loaded from: classes5.dex */
    static final class a implements c {
        a() {
        }

        private static void b() {
            if (y0.f31330a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", y0.f31330a);
            }
        }

        private static void c(NamingEnumeration<?> namingEnumeration, NamingException namingException) {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        private static void d(DirContext dirContext, NamingException namingException) {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        @Override // io.grpc.internal.y0.c
        public List<String> a(String str, String str2) {
            b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e11) {
                                c(all2, e11);
                            }
                        }
                        all2.close();
                    } catch (NamingException e12) {
                        c(all, e12);
                    }
                }
                all.close();
            } catch (NamingException e13) {
                d(initialDirContext, e13);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    static final class b implements c0.f {

        /* renamed from: b  reason: collision with root package name */
        private static final Logger f31331b = Logger.getLogger(b.class.getName());

        /* renamed from: a  reason: collision with root package name */
        private final c f31332a;

        static {
            Pattern.compile("\\s+");
        }

        public b(c cVar) {
            this.f31332a = cVar;
        }

        static String b(String str) {
            StringBuilder sb2 = new StringBuilder(str.length());
            int i11 = 0;
            boolean z11 = false;
            while (i11 < str.length()) {
                char charAt = str.charAt(i11);
                if (z11) {
                    if (charAt == '\"') {
                        z11 = false;
                    } else {
                        if (charAt == '\\') {
                            i11++;
                            charAt = str.charAt(i11);
                        }
                        sb2.append(charAt);
                    }
                } else if (charAt != ' ') {
                    if (charAt == '\"') {
                        z11 = true;
                    }
                    sb2.append(charAt);
                }
                i11++;
            }
            return sb2.toString();
        }

        @Override // io.grpc.internal.c0.f
        public List<String> a(String str) {
            Logger logger = f31331b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            c cVar = this.f31332a;
            List<String> a11 = cVar.a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(a11.size())});
            }
            ArrayList arrayList = new ArrayList(a11.size());
            for (String str2 : a11) {
                arrayList.add(b(str2));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* loaded from: classes5.dex */
    interface c {
        List<String> a(String str, String str2);
    }

    private static Throwable d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e11) {
            return e11;
        } catch (Error e12) {
            return e12;
        } catch (RuntimeException e13) {
            return e13;
        }
    }

    @Override // io.grpc.internal.c0.g
    public c0.f a() {
        if (b() != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // io.grpc.internal.c0.g
    public Throwable b() {
        return f31330a;
    }
}