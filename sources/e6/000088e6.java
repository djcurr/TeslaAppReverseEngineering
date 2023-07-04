package n00;

/* loaded from: classes5.dex */
public interface l extends b {

    /* loaded from: classes5.dex */
    public enum a {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE
    }

    boolean b();

    int getIndex();

    a getKind();

    String getName();

    p getType();

    boolean q();
}