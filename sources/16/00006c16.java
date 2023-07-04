package ezvcard.parameter;

/* loaded from: classes5.dex */
public class KeyType extends MediaTypeParameter {

    /* renamed from: d  reason: collision with root package name */
    private static final b<KeyType> f25397d = new b<>(KeyType.class);

    static {
        new KeyType("PGP", "application/pgp-keys", "pgp");
        new KeyType("GPG", "application/gpg", "gpg");
        new KeyType("X509", "application/x509", null);
    }

    private KeyType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static KeyType f(String str, String str2, String str3) {
        return (KeyType) f25397d.d(new String[]{str, str2, str3});
    }

    public static KeyType g(String str, String str2, String str3) {
        return (KeyType) f25397d.e(new String[]{str, str2, str3});
    }
}