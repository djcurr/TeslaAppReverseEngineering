package ezvcard.property;

import java.util.UUID;

/* loaded from: classes5.dex */
public class Uid extends UriProperty {
    public Uid(String str) {
        super(str);
    }

    public static Uid random() {
        String uuid = UUID.randomUUID().toString();
        return new Uid("urn:uuid:" + uuid);
    }

    public Uid(Uid uid) {
        super(uid);
    }

    @Override // ezvcard.property.VCardProperty
    public Uid copy() {
        return new Uid(this);
    }
}